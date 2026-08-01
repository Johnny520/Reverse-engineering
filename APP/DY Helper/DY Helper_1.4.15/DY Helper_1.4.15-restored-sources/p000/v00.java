package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v00 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11046;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f11047;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11048;

    public /* synthetic */ v00(java.lang.Object r1, boolean r2, int r3) {
            r0 = this;
            r0.f11046 = r3
            r0.f11048 = r1
            r0.f11047 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f11046
            s62 r1 = p000.s62.f9751
            boolean r2 = r5.f11047
            java.lang.Object r5 = r5.f11048
            switch(r0) {
                case 0: goto L40;
                default: goto Lb;
            }
        Lb:
            um1 r5 = (p000.um1) r5
            java.lang.Object r5 = r5.f10912
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L3f
            r5.setEnabled(r2)
            r5.setClickable(r2)
            if (r2 == 0) goto L1e
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L20
        L1e:
            r0 = 1056964608(0x3f000000, float:0.5)
        L20:
            r5.setAlpha(r0)
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 != 0) goto L2e
            goto L3f
        L2e:
            int r0 = r5.getChildCount()
            r3 = 0
        L33:
            if (r3 >= r0) goto L3f
            android.view.View r4 = r5.getChildAt(r3)
            r4.setEnabled(r2)
            int r3 = r3 + 1
            goto L33
        L3f:
            return r1
        L40:
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5
            x00 r0 = p000.x00.f11959
            r0 = 1
            p000.x00.m6469(r5, r2, r0)
            return r1
    }
}
