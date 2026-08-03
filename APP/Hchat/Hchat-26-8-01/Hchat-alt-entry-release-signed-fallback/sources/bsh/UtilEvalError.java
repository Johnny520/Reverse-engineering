package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class UtilEvalError extends java.lang.Exception {
    public UtilEvalError() {
            r0 = this;
            r0.<init>()
            return
    }

    public UtilEvalError(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public UtilEvalError(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public bsh.EvalError toEvalError(bsh.Node r2, bsh.CallStack r3) {
            r1 = this;
            r0 = 0
            bsh.EvalError r2 = r1.toEvalError(r0, r2, r3)
            return r2
    }

    public bsh.EvalError toEvalError(java.lang.String r3, bsh.Node r4, bsh.CallStack r5) {
            r2 = this;
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L11
            r2.printStackTrace()
        L11:
            if (r3 != 0) goto L16
            java.lang.String r3 = ""
            goto L1c
        L16:
            java.lang.String r0 = ": "
            java.lang.String r3 = r3.concat(r0)
        L1c:
            bsh.EvalError r0 = new bsh.EvalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = r2.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4, r5, r2)
            return r0
    }

    public bsh.EvalException toEvalException(bsh.Node r2, bsh.CallStack r3) {
            r1 = this;
            r0 = 0
            bsh.EvalException r2 = r1.toEvalException(r0, r2, r3)
            return r2
    }

    public bsh.EvalException toEvalException(java.lang.String r3, bsh.Node r4, bsh.CallStack r5) {
            r2 = this;
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L11
            r2.printStackTrace()
        L11:
            if (r3 != 0) goto L16
            java.lang.String r3 = ""
            goto L1c
        L16:
            java.lang.String r0 = ": "
            java.lang.String r3 = r3.concat(r0)
        L1c:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = r2.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4, r5, r2)
            return r0
    }
}
