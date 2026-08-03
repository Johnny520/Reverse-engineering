package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class EvalError extends java.lang.Exception {
    private final bsh.CallStack callstack;
    private java.lang.String message;
    private bsh.Node node;

    public EvalError(java.lang.String r1, bsh.Node r2, bsh.CallStack r3) {
            r0 = this;
            r0.<init>()
            r0.message = r1
            r0.node = r2
            if (r3 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            bsh.CallStack r1 = r3.copy()
        Lf:
            r0.callstack = r1
            return
    }

    public EvalError(java.lang.String r1, bsh.Node r2, bsh.CallStack r3, java.lang.Throwable r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.initCause(r4)
            return
    }

    public int getErrorLineNumber() {
            r1 = this;
            bsh.Node r0 = r1.node
            if (r0 == 0) goto L9
            int r0 = r0.getLineNumber()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public java.lang.String getErrorSourceFile() {
            r1 = this;
            bsh.Node r0 = r1.node
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getSourceFile()
            return r0
        L9:
            java.lang.String r0 = "<unknown file>"
            return r0
    }

    public java.lang.String getErrorText() {
            r1 = this;
            bsh.Node r0 = r1.node
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getText()
            return r0
        L9:
            java.lang.String r0 = "<unknown error>"
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r3 = this;
            bsh.Node r0 = r3.node
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n\tat "
            r0.<init>(r1)
            bsh.Node r1 = r3.node
            java.lang.String r1 = r1.getText()
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            bsh.Node r1 = r3.node
            java.lang.String r1 = r1.getSourceFile()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            bsh.Node r1 = r3.node
            int r1 = r1.getLineNumber()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L3c
        L3a:
            java.lang.String r0 = ": <at unknown location>"
        L3c:
            bsh.CallStack r1 = r3.callstack
            if (r1 == 0) goto L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r3.getScriptStackTrace()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L53:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getRawMessage()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public bsh.Node getNode() {
            r1 = this;
            bsh.Node r0 = r1.node
            return r0
    }

    public java.lang.String getRawMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public java.lang.String getScriptStackTrace() {
            r5 = this;
            bsh.CallStack r0 = r5.callstack
            if (r0 != 0) goto L7
            java.lang.String r0 = "<Unknown>"
            return r0
        L7:
            bsh.CallStack r0 = r0.copy()
            java.lang.String r1 = ""
        Ld:
            int r2 = r0.depth()
            if (r2 <= 0) goto L61
            bsh.NameSpace r2 = r0.pop()
            bsh.Node r3 = r2.getNode()
            boolean r4 = r2.isMethod
            if (r4 == 0) goto Ld
            java.lang.String r4 = "\nCalled from method: "
            java.lang.StringBuilder r1 = bc.e.n(r1, r4)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r3 == 0) goto Ld
            java.lang.String r2 = "\n\tat "
            java.lang.StringBuilder r1 = bc.e.n(r1, r2)
            java.lang.String r2 = r3.getText()
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            java.lang.String r2 = r3.getSourceFile()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r2 = r3.getLineNumber()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto Ld
        L61:
            return r1
    }

    public void prependMessage(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r1.message
            if (r0 != 0) goto La
            r1.message = r2
            return
        La:
            java.lang.String r0 = " : "
            java.lang.StringBuilder r2 = bc.e.n(r2, r0)
            java.lang.String r0 = r1.message
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.message = r2
            return
    }

    public bsh.EvalError reThrow(java.lang.String r1) {
            r0 = this;
            r0.prependMessage(r1)
            return r0
    }

    public void setNode(bsh.Node r1) {
            r0 = this;
            r0.node = r1
            return
    }
}
