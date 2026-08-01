package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class d42 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.ThreadLocal f2881 = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.d42.f2881 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.AbstractC0853tz m1648() {
            java.lang.ThreadLocal r0 = p000.d42.f2881
            java.lang.Object r1 = r0.get()
            tz r1 = (p000.AbstractC0853tz) r1
            if (r1 != 0) goto L16
            ka r1 = new ka
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            r0.set(r1)
        L16:
            return r1
    }
}
