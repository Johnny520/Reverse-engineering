package p000;

/* JADX INFO: renamed from: i */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0378i {

    /* JADX INFO: renamed from: α */
    public static volatile java.lang.ref.WeakReference f4853;

    /* JADX INFO: renamed from: β */
    public static boolean f4854;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.CopyOnWriteArraySet f4855 = null;

    static {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            p000.AbstractC0378i.f4855 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.app.Activity m2546() {
            java.lang.ref.WeakReference r0 = p000.AbstractC0378i.f4853
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
