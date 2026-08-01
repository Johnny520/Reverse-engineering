package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class le {
    public static final java.util.List a = null;

    static {
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "<this>"
            defpackage.ip.o(r1, r0)
            l20 r1 = new l20
            r1.<init>(r0)
            bc r0 = new bc
            r0.<init>(r1)
            java.util.List r0 = defpackage.j20.I(r0)
            defpackage.le.a = r0
            return
    }
}
