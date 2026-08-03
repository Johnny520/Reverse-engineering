package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6658 extends java.lang.IllegalArgumentException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f23214 = null;

    static {
            java.lang.Class<Yue.ۥۣۢۥ۠> r0 = Yue.C6657.class
            java.lang.String r0 = r0.getName()
            Yue.C6658.f23214 = r0
            return
    }

    public C6658(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable fillInStackTrace() {
            r8 = this;
            monitor-enter(r8)
            super.fillInStackTrace()     // Catch: java.lang.Throwable -> L27
            java.lang.StackTraceElement[] r0 = r8.getStackTrace()     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            int r2 = r0.length     // Catch: java.lang.Throwable -> L27
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L29
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r5.getClassName()     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = Yue.C6658.f23214     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L21
            goto L24
        L21:
            r1.add(r5)     // Catch: java.lang.Throwable -> L27
        L24:
            int r4 = r4 + 1
            goto L10
        L27:
            r0 = move-exception
            goto L36
        L29:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0     // Catch: java.lang.Throwable -> L27
            r8.setStackTrace(r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r8)
            return r8
        L36:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L27
            throw r0
    }
}
