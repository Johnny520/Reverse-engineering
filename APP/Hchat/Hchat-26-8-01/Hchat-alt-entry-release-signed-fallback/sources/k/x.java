package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f7102a = 0;

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            long r0 = (long) r0
            k.x.f7102a = r0
            return
    }

    public static final boolean a(k.g r1) {
            android.view.View r1 = x1.k.y(r1)
            android.view.ViewParent r1 = r1.getParent()
        L8:
            if (r1 == 0) goto L1d
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r1.shouldDelayChildPressedState()
            if (r0 == 0) goto L18
            r1 = 1
            return r1
        L18:
            android.view.ViewParent r1 = r1.getParent()
            goto L8
        L1d:
            r1 = 0
            return r1
    }
}
