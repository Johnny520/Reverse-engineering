package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jc0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f5423 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.jc0.f5423 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m2927(p000.p70 r4) {
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc0.f5423
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 != 0) goto Lb
            return r1
        Lb:
            r4.invoke()     // Catch: java.lang.Throwable -> L12
            r0.set(r1)
            return r2
        L12:
            r4 = move-exception
            r0.set(r1)
            throw r4
    }
}
