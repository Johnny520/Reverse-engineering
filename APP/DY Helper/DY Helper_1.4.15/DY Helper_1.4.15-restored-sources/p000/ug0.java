package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10800;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f10801;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f10802;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f10803;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.String f10804;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ boolean f10805;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ boolean f10806;

    public /* synthetic */ ug0(android.view.View r1, java.lang.String r2, java.lang.Object r3, java.lang.String r4, boolean r5, boolean r6, int r7) {
            r0 = this;
            r0.f10800 = r7
            r0.f10801 = r1
            r0.f10802 = r2
            r0.f10803 = r3
            r0.f10804 = r4
            r0.f10805 = r5
            r0.f10806 = r6
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.f10800
            r1 = 2117337099(0x7e34000b, float:5.9815316E37)
            yg0 r2 = p000.yg0.f12607
            r3 = 2117337090(0x7e340002, float:5.981527E37)
            r4 = 2117337091(0x7e340003, float:5.9815275E37)
            r5 = 0
            switch(r0) {
                case 0: goto L66;
                default: goto L11;
            }
        L11:
            android.view.View r7 = r15.f10801
            java.lang.Object r0 = r7.getTag(r3)
            java.lang.String r8 = r15.f10802
            boolean r0 = p000.ln0.m3626(r0, r8)
            if (r0 == 0) goto L62
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto L26
            goto L62
        L26:
            android.os.Handler r0 = p000.ah0.f229
            java.lang.Object r9 = r15.f10803
            java.lang.String r10 = r15.f10804
            boolean r11 = r15.f10805
            yg0 r0 = p000.ah0.m164(r7, r9, r10, r11, r8)
            boolean r12 = r15.f10806
            if (r0 != r2) goto L4e
            r7.setTag(r4, r5)
            java.lang.Object r15 = r7.getTag(r1)
            boolean r15 = r15 instanceof android.view.View.OnLayoutChangeListener
            if (r15 == 0) goto L42
            goto L65
        L42:
            wg0 r6 = new wg0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r7.setTag(r1, r6)
            r7.addOnLayoutChangeListener(r6)
            goto L65
        L4e:
            yg0 r15 = p000.yg0.f12608
            if (r0 == r15) goto L56
            r7.setTag(r4, r5)
            goto L65
        L56:
            ug0 r6 = new ug0
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0 = 160(0xa0, double:7.9E-322)
            r7.postDelayed(r6, r0)
            goto L65
        L62:
            r7.setTag(r4, r5)
        L65:
            return
        L66:
            android.view.View r9 = r15.f10801
            java.lang.Object r0 = r9.getTag(r3)
            java.lang.String r10 = r15.f10802
            boolean r0 = p000.ln0.m3626(r0, r10)
            if (r0 == 0) goto L9e
            boolean r0 = r9.isAttachedToWindow()
            if (r0 == 0) goto L9e
            android.os.Handler r0 = p000.ah0.f229
            java.lang.Object r11 = r15.f10803
            java.lang.String r12 = r15.f10804
            boolean r13 = r15.f10805
            yg0 r0 = p000.ah0.m164(r9, r11, r12, r13, r10)
            if (r0 != r2) goto L9e
            java.lang.Object r0 = r9.getTag(r1)
            boolean r0 = r0 instanceof android.view.View.OnLayoutChangeListener
            if (r0 == 0) goto L91
            goto L9e
        L91:
            wg0 r8 = new wg0
            boolean r14 = r15.f10806
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r9.setTag(r1, r8)
            r9.addOnLayoutChangeListener(r8)
        L9e:
            java.lang.Object r15 = r9.getTag(r4)
            boolean r15 = p000.ln0.m3626(r15, r10)
            if (r15 == 0) goto Lab
            r9.setTag(r4, r5)
        Lab:
            return
    }
}
