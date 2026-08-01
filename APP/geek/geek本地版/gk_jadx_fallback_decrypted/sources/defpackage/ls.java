package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ls {
    public static final defpackage.jo a = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = defpackage.r50.a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> La
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L10
            java.lang.Boolean.parseBoolean(r0)
        L10:
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r2 = "<this>"
            defpackage.ip.o(r2, r0)
            l20 r2 = new l20
            r2.<init>(r0)
            bc r0 = new bc
            r0.<init>(r2)
            java.util.List r0 = defpackage.j20.I(r0)
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L3c
            goto L5c
        L3c:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L47
            goto L5c
        L47:
            r2 = r1
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2
            r2.getClass()
        L4d:
            java.lang.Object r2 = r0.next()
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2
            r2.getClass()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L4d
        L5c:
            kotlinx.coroutines.internal.MainDispatcherFactory r1 = (kotlinx.coroutines.internal.MainDispatcherFactory) r1
            if (r1 == 0) goto L7b
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r0 == 0) goto L73
            jo r1 = new jo
            android.os.Handler r0 = defpackage.ko.a(r0)
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.ls.a = r1
            return
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The main looper is not available"
            r0.<init>(r1)
            throw r0
        L7b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)
            throw r0
    }
}
