package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7270;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f7271;

    public /* synthetic */ mt1(android.view.View r1, int r2) {
            r0 = this;
            r0.f7270 = r2
            r0.f7271 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f7270
            android.view.View r1 = r1.f7271
            switch(r0) {
                case 0: goto L22;
                case 1: goto L1c;
                case 2: goto Ld;
                default: goto L7;
            }
        L7:
            o22 r0 = p000.o22.f7889
            p000.o22.m4164(r1)
            return
        Ld:
            o22 r0 = p000.o22.f7889
            java.util.Set r0 = p000.o22.f7897
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L18
            goto L1b
        L18:
            p000.o22.m4171(r1)
        L1b:
            return
        L1c:
            o22 r0 = p000.o22.f7889
            p000.o22.m4164(r1)
            return
        L22:
            r0 = 8
            r1.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r0 = 0
            r1.setTranslationY(r0)
            return
    }
}
