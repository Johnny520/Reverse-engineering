package p000;

/* JADX INFO: renamed from: om */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0628om {

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8148 = null;
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: α */
    public final java.lang.Throwable f8149;

    static {
            java.lang.Class<om> r0 = p000.C0628om.class
            java.lang.String r1 = "_handled$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.C0628om.f8148 = r0
            return
    }

    public C0628om(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f8149 = r1
            r0._handled$volatile = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r2 = r2.f8149
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
