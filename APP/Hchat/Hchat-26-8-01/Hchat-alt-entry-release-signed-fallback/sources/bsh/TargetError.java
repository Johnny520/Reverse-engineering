package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TargetError extends bsh.EvalError {
    private final boolean inNativeCode;

    public TargetError(java.lang.String r1, java.lang.Throwable r2, bsh.Node r3, bsh.CallStack r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r3, r4, r2)
            r0.inNativeCode = r5
            return
    }

    public TargetError(java.lang.Throwable r7, bsh.Node r8, bsh.CallStack r9) {
            r6 = this;
            java.lang.String r1 = "TargetError"
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private synchronized java.lang.String printTargetError(java.lang.Throwable r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L9
            java.lang.String r3 = "Cause is null"
            monitor-exit(r2)
            return r3
        L7:
            r3 = move-exception
            goto L2b
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7
        L12:
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Throwable -> L7
            if (r3 == 0) goto L25
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch: java.lang.Throwable -> L7
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L7
            r0.append(r1)     // Catch: java.lang.Throwable -> L7
            goto L12
        L25:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r2)
            return r3
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r3
    }

    @Override // bsh.EvalError, java.lang.Throwable
    public synchronized java.lang.String getMessage() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r0.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = super.getMessage()     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "\nCaused by: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Throwable r1 = r2.getCause()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r2.printTargetError(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return r0
        L23:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    public synchronized java.lang.Throwable getTarget() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Throwable r0 = r2.getCause()     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r2)
            return r0
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public boolean inNativeCode() {
            r1 = this;
            boolean r0 = r1.inNativeCode
            return r0
    }

    public void printStackTrace(boolean r6, java.io.PrintStream r7) {
            r5 = this;
            if (r6 == 0) goto La
            r5.printStackTrace(r7)
            java.lang.String r6 = "--- Target Stack Trace ---"
            r7.println(r6)
        La:
            java.lang.Throwable r6 = r5.getCause()
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            int r0 = r6.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L38
            r2 = r6[r1]
            java.lang.String r3 = r2.getClassName()
            java.lang.String r4 = "reflect"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "        at "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r7.println(r2)
            int r1 = r1 + 1
            goto L14
        L38:
            return
    }
}
