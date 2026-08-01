package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t60 {
    public static final java.lang.ThreadLocal a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.t60.a = r0
            return
    }

    public static defpackage.kj a() {
            java.lang.ThreadLocal r0 = defpackage.t60.a
            java.lang.Object r1 = r0.get()
            kj r1 = (defpackage.kj) r1
            if (r1 != 0) goto L16
            n7 r1 = new n7
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            r0.set(r1)
        L16:
            return r1
    }
}
