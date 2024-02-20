grammar MultiURL;

start: urls EOF;

urls: url (SEPARATOR url)*;

url: uri EOF;

uri: scheme? login? host (':' port)? ('/' path?)? query? frag? WS?;

scheme: NON_SPACE+ '://';
NON_SPACE: ~[ \t\n\r]+;

host: '/'? hostname;

hostname: string | '[' v6host ']';

v6host: '::'? (string | DIGITS) ((':' | '::') (string | DIGITS))*;

port: DIGITS;

path: string ('/' string)* '/';

user: string;

login: user (':' password)? '@';

password: string;

frag: '#' (string | DIGITS);

query: '?' search;

search: searchparameter ('&' searchparameter)*;

searchparameter: string ('=' (string | DIGITS | HEX))? ;

string: STRING | DIGITS;

DIGITS: [0-9]+;

HEX: '%' [a-fA-F0-9] [a-fA-F0-9]+;

STRING: ([a-zA-Z~0-9] | HEX) ([a-zA-Z0-9.+-] | HEX)*;

WS: [\r\n]+;

SEPARATOR: [ \t\n\r]+;

ALPHA: [a-zA-Z]+;

