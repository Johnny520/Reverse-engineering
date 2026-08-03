package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ParseException extends bsh.EvalError {
    private static final long serialVersionUID = 1;
    private static java.lang.String sourceFile;
    public bsh.Token currentToken;
    public int[][] expectedTokenSequences;
    public java.lang.String[] tokenImage;

    public ParseException() {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            return
    }

    public ParseException(bsh.Token r3, int[][] r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.String r0 = initialise(r3, r4, r5)
            r1 = 0
            r2.<init>(r0, r1, r1)
            r2.currentToken = r3
            r2.expectedTokenSequences = r4
            r2.tokenImage = r5
            return
    }

    public ParseException(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public ParseException(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0, r3)
            return
    }

    public static java.lang.String add_escapes(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 >= r2) goto L97
            char r2 = r5.charAt(r1)
            r3 = 12
            if (r2 == r3) goto L8e
            r3 = 13
            if (r2 == r3) goto L88
            r3 = 34
            if (r2 == r3) goto L82
            r3 = 39
            if (r2 == r3) goto L7c
            r3 = 92
            if (r2 == r3) goto L76
            switch(r2) {
                case 8: goto L70;
                case 9: goto L6a;
                case 10: goto L64;
                default: goto L27;
            }
        L27:
            char r2 = r5.charAt(r1)
            r3 = 32
            if (r2 < r3) goto L38
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 <= r3) goto L34
            goto L38
        L34:
            r0.append(r2)
            goto L93
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "0000"
            r3.<init>(r4)
            r4 = 16
            java.lang.String r2 = java.lang.Integer.toString(r2, r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            int r3 = r2.length()
            int r3 = r3 + (-4)
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            java.lang.String r3 = "\\u"
            java.lang.String r2 = r3.concat(r2)
            r0.append(r2)
            goto L93
        L64:
            java.lang.String r2 = "\\n"
            r0.append(r2)
            goto L93
        L6a:
            java.lang.String r2 = "\\t"
            r0.append(r2)
            goto L93
        L70:
            java.lang.String r2 = "\\b"
            r0.append(r2)
            goto L93
        L76:
            java.lang.String r2 = "\\\\"
            r0.append(r2)
            goto L93
        L7c:
            java.lang.String r2 = "\\'"
            r0.append(r2)
            goto L93
        L82:
            java.lang.String r2 = "\\\""
            r0.append(r2)
            goto L93
        L88:
            java.lang.String r2 = "\\r"
            r0.append(r2)
            goto L93
        L8e:
            java.lang.String r2 = "\\f"
            r0.append(r2)
        L93:
            int r1 = r1 + 1
            goto L6
        L97:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private static java.lang.String initialise(bsh.Token r6, int[][] r7, java.lang.String[] r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to parse code syntax. Encountered:"
            r0.<init>(r1)
            if (r6 == 0) goto L43
            r1 = r6
        La:
            bsh.Token r1 = r1.next
            if (r1 == 0) goto L1d
            java.lang.String r2 = " "
            r0.append(r2)
            java.lang.String r2 = r1.image
            java.lang.String r2 = add_escapes(r2)
            r0.append(r2)
            goto La
        L1d:
            java.lang.String r1 = " at line "
            r0.append(r1)
            bsh.Token r1 = r6.next
            int r1 = r1.beginLine
            r0.append(r1)
            java.lang.String r1 = ", column "
            r0.append(r1)
            bsh.Token r6 = r6.next
            int r6 = r6.beginColumn
            r0.append(r6)
            java.lang.String r6 = bsh.ParseException.sourceFile
            if (r6 == 0) goto L43
            java.lang.String r6 = " in: "
            r0.append(r6)
            java.lang.String r6 = bsh.ParseException.sourceFile
            r0.append(r6)
        L43:
            java.lang.ThreadLocal<java.lang.Boolean> r6 = bsh.Interpreter.DEBUG
            java.lang.Object r6 = r6.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L99
            int r6 = r7.length
            if (r6 == 0) goto L99
            java.lang.String r6 = "line.separator"
            java.lang.String r1 = "\n"
            java.lang.String r6 = java.lang.System.getProperty(r6, r1)
            r0.append(r6)
            java.lang.String r6 = "Exppected"
            r0.append(r6)
            int r6 = r7.length
            r1 = 1
            if (r6 <= r1) goto L6d
            java.lang.String r6 = " one of"
            r0.append(r6)
        L6d:
            java.lang.String r6 = ": "
            r0.append(r6)
            r6 = 0
            r1 = r6
        L74:
            int r2 = r7.length
            if (r1 >= r2) goto L99
            r2 = r6
        L78:
            r3 = r7[r1]
            int r4 = r3.length
            if (r2 >= r4) goto L96
            r3 = r3[r2]
            r3 = r8[r3]
            r4 = 34
            r5 = 32
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.String r3 = r3.trim()
            r0.append(r3)
            r0.append(r5)
            int r2 = r2 + 1
            goto L78
        L96:
            int r1 = r1 + 1
            goto L74
        L99:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // bsh.EvalError
    public int getErrorLineNumber() {
            r1 = this;
            bsh.Token r0 = r1.currentToken
            bsh.Token r0 = r0.next
            int r0 = r0.beginLine
            return r0
    }

    @Override // bsh.EvalError
    public java.lang.String getErrorSourceFile() {
            r1 = this;
            java.lang.String r0 = bsh.ParseException.sourceFile
            return r0
    }

    @Override // bsh.EvalError
    public java.lang.String getErrorText() {
            r1 = this;
            java.lang.String r0 = r1.getMessage()
            return r0
    }

    @Override // bsh.EvalError, java.lang.Throwable
    public java.lang.String getMessage() {
            r3 = this;
            bsh.Token r0 = r3.currentToken
            int[][] r1 = r3.expectedTokenSequences
            java.lang.String[] r2 = r3.tokenImage
            java.lang.String r0 = initialise(r0, r1, r2)
            return r0
    }

    public java.lang.String getMessage(boolean r1) {
            r0 = this;
            java.lang.String r1 = r0.getMessage()
            return r1
    }

    public void setErrorSourceFile(java.lang.String r1) {
            r0 = this;
            bsh.ParseException.sourceFile = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getMessage()
            return r0
    }
}
