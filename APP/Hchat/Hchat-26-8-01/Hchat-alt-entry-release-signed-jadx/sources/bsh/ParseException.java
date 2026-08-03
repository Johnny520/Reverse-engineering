package bsh;

import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ParseException extends EvalError {
    private static final long serialVersionUID = 1;
    private static String sourceFile;
    public Token currentToken;
    public int[][] expectedTokenSequences;
    public String[] tokenImage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParseException(Token token, int[][] iArr, String[] strArr) {
        super(initialise(token, iArr, strArr), null, null);
        this.currentToken = token;
        this.expectedTokenSequences = iArr;
        this.tokenImage = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String add_escapes(String str) {
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
                        char cCharAt2 = str.charAt(i9);
                        if (cCharAt2 < ' ' || cCharAt2 > '~') {
                            String str2 = "0000" + Integer.toString(cCharAt2, 16);
                            sb2.append("\\u".concat(str2.substring(str2.length() - 4, str2.length())));
                        } else {
                            sb2.append(cCharAt2);
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
    private static String initialise(Token token, int[][] iArr, String[] strArr) {
        StringBuilder sb2 = new StringBuilder("Unable to parse code syntax. Encountered:");
        if (token != null) {
            Token token2 = token;
            while (true) {
                token2 = token2.next;
                if (token2 == null) {
                    break;
                }
                sb2.append(" ");
                sb2.append(add_escapes(token2.image));
            }
            sb2.append(" at line ");
            sb2.append(token.next.beginLine);
            sb2.append(", column ");
            sb2.append(token.next.beginColumn);
            if (sourceFile != null) {
                sb2.append(" in: ");
                sb2.append(sourceFile);
            }
        }
        if (Interpreter.DEBUG.get().booleanValue() && iArr.length != 0) {
            sb2.append(System.getProperty("line.separator", "\n"));
            sb2.append("Exppected");
            if (iArr.length > 1) {
                sb2.append(" one of");
            }
            sb2.append(": ");
            for (int[] iArr2 : iArr) {
                int i9 = 0;
                while (true) {
                    if (i9 < iArr2.length) {
                        sb2.append(strArr[iArr2[i9]].replace('\"', ' ').trim());
                        sb2.append(' ');
                        i9++;
                    }
                }
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.EvalError
    public int getErrorLineNumber() {
        return this.currentToken.next.beginLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.EvalError
    public String getErrorSourceFile() {
        return sourceFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.EvalError
    public String getErrorText() {
        return getMessage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.EvalError, java.lang.Throwable
    public String getMessage() {
        return initialise(this.currentToken, this.expectedTokenSequences, this.tokenImage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorSourceFile(String str) {
        sourceFile = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public String getMessage(boolean z9) {
        return getMessage();
    }

    public ParseException() {
        this(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public ParseException(String str) {
        super(str, null, null);
    }

    public ParseException(String str, Throwable th2) {
        super(str, null, null, th2);
    }
}
