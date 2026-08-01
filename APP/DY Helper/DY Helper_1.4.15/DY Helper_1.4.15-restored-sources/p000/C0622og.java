package p000;

/* JADX INFO: renamed from: og */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0622og extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ java.lang.Integer f8085;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.C0834tg f8086;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.String f8087;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ java.lang.String f8088;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ boolean f8089;

    public C0622og(java.lang.Integer r1, p000.C0834tg r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.f8085 = r1
            r0.f8086 = r2
            r0.f8087 = r3
            r0.f8088 = r4
            r0.f8089 = r5
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r7) {
            r6 = this;
            r7.getClass()
            java.lang.Object r7 = r7.f5691
            boolean r0 = r7 instanceof android.view.View
            if (r0 == 0) goto Ld
            android.view.View r7 = (android.view.View) r7
        Lb:
            r1 = r7
            goto Lf
        Ld:
            r7 = 0
            goto Lb
        Lf:
            if (r1 != 0) goto L12
            goto L30
        L12:
            java.lang.Integer r7 = r6.f8085
            int r2 = r7.intValue()
            java.lang.String r7 = r6.f8087
            java.lang.String r0 = " recovery"
            java.lang.String r3 = r7.concat(r0)
            java.lang.String r4 = r6.f8088
            r5 = 16
            tg r0 = r6.f8086
            p000.C0834tg.m5666(r0, r1, r2, r3, r4, r5)
            boolean r6 = r6.f8089
            if (r6 == 0) goto L30
            r0.m5705(r1)
        L30:
            return
    }
}
