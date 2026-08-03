package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2.a f282a = null;

    static {
            a2.a r0 = new a2.a
            r1 = 3
            r0.<init>(r1)
            androidx.lifecycle.d0.f282a = r0
            return
    }

    public static final androidx.lifecycle.q a(android.view.View r3) {
            r3.getClass()
        L3:
            r0 = 0
            if (r3 == 0) goto L25
            r1 = 2131099773(0x7f06007d, float:1.7811909E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof androidx.lifecycle.q
            if (r2 == 0) goto L14
            androidx.lifecycle.q r1 = (androidx.lifecycle.q) r1
            goto L15
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L18
            return r1
        L18:
            android.view.ViewParent r3 = fb.v0.t(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L23
            android.view.View r3 = (android.view.View) r3
            goto L3
        L23:
            r3 = r0
            goto L3
        L25:
            return r0
    }

    public static final c9.a1 b(android.view.View r3) {
            r3.getClass()
        L3:
            r0 = 0
            if (r3 == 0) goto L25
            r1 = 2131099777(0x7f060081, float:1.7811917E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof c9.a1
            if (r2 == 0) goto L14
            c9.a1 r1 = (c9.a1) r1
            goto L15
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L18
            return r1
        L18:
            android.view.ViewParent r3 = fb.v0.t(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L23
            android.view.View r3 = (android.view.View) r3
            goto L3
        L23:
            r3 = r0
            goto L3
        L25:
            return r0
    }
}
