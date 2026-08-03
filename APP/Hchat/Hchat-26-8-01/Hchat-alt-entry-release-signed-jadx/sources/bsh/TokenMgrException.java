package bsh;

import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class TokenMgrException extends RuntimeException {
    public static final int INVALID_LEXICAL_STATE = 2;
    public static final int LEXICAL_ERROR = 0;
    public static final int LOOP_DETECTED = 3;
    public static final int STATIC_LEXER_ERROR = 1;
    private static final long serialVersionUID = 1;
    int errorCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TokenMgrException(boolean z9, int i9, int i10, int i11, String str, int i12, int i13) {
        this(LexicalErr(z9, i9, i10, i11, str, i12), i13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String LexicalErr(boolean z9, int i9, int i10, int i11, String str, int i12) {
        String str2;
        char c10 = (char) i12;
        StringBuilder sbM2256s = AbstractC0921a.m2256s(i10, i11, "Lexical error at line ", ", column ", ".  Encountered: ");
        if (z9) {
            str2 = "<EOF> ";
        } else {
            str2 = "\"" + addEscapes(String.valueOf(c10)) + "\" (" + i12 + "), ";
        }
        sbM2256s.append(str2);
        sbM2256s.append("after : \"");
        sbM2256s.append(addEscapes(str));
        sbM2256s.append("\"");
        return sbM2256s.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String addEscapes(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '\f') {
                sb2.append("\\f");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt == '\'') {
                sb2.append("\\'");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        if (cCharAt < ' ' || cCharAt > '~') {
                            String str2 = "0000" + Integer.toString(cCharAt, 16);
                            sb2.append("\\u");
                            sb2.append(str2.substring(str2.length() - 4, str2.length()));
                        } else {
                            sb2.append(cCharAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public TokenMgrException(String str, int i9) {
        super(str);
        this.errorCode = i9;
    }

    public TokenMgrException() {
    }
}
