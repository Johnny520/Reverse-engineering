package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class TokenMgrException extends java.lang.RuntimeException {
    public static final int INVALID_LEXICAL_STATE = 2;
    public static final int LEXICAL_ERROR = 0;
    public static final int LOOP_DETECTED = 3;
    public static final int STATIC_LEXER_ERROR = 1;
    private static final long serialVersionUID = 1;
    int errorCode;

    public TokenMgrException() {
            r0 = this;
            r0.<init>()
            return
    }

    public TokenMgrException(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.errorCode = r2
            return
    }

    public TokenMgrException(boolean r1, int r2, int r3, int r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            java.lang.String r1 = LexicalErr(r1, r2, r3, r4, r5, r6)
            r0.<init>(r1, r7)
            return
    }

    public static java.lang.String LexicalErr(boolean r3, int r4, int r5, int r6, java.lang.String r7, int r8) {
            char r4 = (char) r8
            java.lang.String r0 = ", column "
            java.lang.String r1 = ".  Encountered: "
            java.lang.String r2 = "Lexical error at line "
            java.lang.StringBuilder r5 = eh.a.s(r5, r6, r2, r0, r1)
            java.lang.String r6 = "\""
            if (r3 == 0) goto L12
            java.lang.String r3 = "<EOF> "
            goto L33
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = addEscapes(r4)
            r3.append(r4)
            java.lang.String r4 = "\" ("
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = "), "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L33:
            r5.append(r3)
            java.lang.String r3 = "after : \""
            r5.append(r3)
            java.lang.String r3 = addEscapes(r7)
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            return r3
    }

    public static final java.lang.String addEscapes(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 >= r2) goto L92
            char r2 = r5.charAt(r1)
            r3 = 12
            if (r2 == r3) goto L89
            r3 = 13
            if (r2 == r3) goto L83
            r3 = 34
            if (r2 == r3) goto L7d
            r3 = 39
            if (r2 == r3) goto L77
            r3 = 92
            if (r2 == r3) goto L71
            switch(r2) {
                case 8: goto L6b;
                case 9: goto L65;
                case 10: goto L5f;
                default: goto L27;
            }
        L27:
            r3 = 32
            if (r2 < r3) goto L34
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 <= r3) goto L30
            goto L34
        L30:
            r0.append(r2)
            goto L8e
        L34:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "0000"
            r3.<init>(r4)
            r4 = 16
            java.lang.String r2 = java.lang.Integer.toString(r2, r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "\\u"
            r0.append(r3)
            int r3 = r2.length()
            int r3 = r3 + (-4)
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            r0.append(r2)
            goto L8e
        L5f:
            java.lang.String r2 = "\\n"
            r0.append(r2)
            goto L8e
        L65:
            java.lang.String r2 = "\\t"
            r0.append(r2)
            goto L8e
        L6b:
            java.lang.String r2 = "\\b"
            r0.append(r2)
            goto L8e
        L71:
            java.lang.String r2 = "\\\\"
            r0.append(r2)
            goto L8e
        L77:
            java.lang.String r2 = "\\'"
            r0.append(r2)
            goto L8e
        L7d:
            java.lang.String r2 = "\\\""
            r0.append(r2)
            goto L8e
        L83:
            java.lang.String r2 = "\\r"
            r0.append(r2)
            goto L8e
        L89:
            java.lang.String r2 = "\\f"
            r0.append(r2)
        L8e:
            int r1 = r1 + 1
            goto L6
        L92:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = super.getMessage()
            return r0
    }
}
