package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la2 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6523;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f6524;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f6525;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.pa2 f6526;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.TextView f6527;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.widget.TextView f6528;

    public /* synthetic */ la2(android.app.Activity r1, p000.um1 r2, p000.pa2 r3, android.widget.TextView r4, android.widget.TextView r5, int r6) {
            r0 = this;
            r0.f6523 = r6
            r0.f6524 = r1
            r0.f6525 = r2
            r0.f6526 = r3
            r0.f6527 = r4
            r0.f6528 = r5
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f6523
            s62 r1 = p000.s62.f9751
            r2 = 0
            android.widget.TextView r3 = r11.f6528
            android.widget.TextView r4 = r11.f6527
            pa2 r5 = r11.f6526
            um1 r6 = r11.f6525
            android.app.Activity r11 = r11.f6524
            qa2 r12 = (p000.qa2) r12
            switch(r0) {
                case 0: goto L54;
                default: goto L14;
            }
        L14:
            if (r12 != 0) goto L17
            goto L53
        L17:
            ib2 r0 = p000.ib2.f4981
            java.util.ArrayList r0 = p000.ib2.m2731()
            java.util.Iterator r7 = r0.iterator()
            r8 = r2
        L22:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L3c
            java.lang.Object r9 = r7.next()
            qa2 r9 = (p000.qa2) r9
            java.lang.String r9 = r9.f8945
            java.lang.String r10 = r12.f8945
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L39
            goto L3d
        L39:
            int r8 = r8 + 1
            goto L22
        L3c:
            r8 = -1
        L3d:
            if (r8 < 0) goto L43
            r0.set(r8, r12)
            goto L46
        L43:
            r0.add(r2, r12)
        L46:
            p000.ib2.m2707(r0)
            p000.ib2.m2710(r6, r5, r4, r3, r0)
            java.lang.String r12 = r12.f8944
            java.lang.String r0 = "已添加: "
            p000.a12.m21(r2, r11, r0, r12)
        L53:
            return r1
        L54:
            r12.getClass()
            ib2 r0 = p000.ib2.f4981
            java.util.ArrayList r0 = p000.ib2.m2731()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L81
            java.lang.Object r8 = r0.next()
            r9 = r8
            qa2 r9 = (p000.qa2) r9
            java.lang.String r9 = r9.f8945
            java.lang.String r10 = r12.f8945
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L66
            r7.add(r8)
            goto L66
        L81:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            p000.ib2.m2707(r0)
            p000.ib2.m2710(r6, r5, r4, r3, r0)
            java.lang.String r12 = r12.f8944
            java.lang.String r0 = "已删除: "
            p000.a12.m21(r2, r11, r0, r12)
            return r1
    }
}
