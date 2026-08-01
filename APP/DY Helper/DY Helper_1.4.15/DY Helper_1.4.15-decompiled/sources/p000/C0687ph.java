package p000;

/* JADX INFO: renamed from: ph */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0687ph extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8558;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.C0394ig f8559;

    public /* synthetic */ C0687ph(p000.C0394ig r1, int r2) {
            r0 = this;
            r0.f8558 = r2
            r0.f8559 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r2) {
            r1 = this;
            int r0 = r1.f8558
            r2.getClass()
            switch(r0) {
                case 0: goto L1d;
                default: goto L8;
            }
        L8:
            java.lang.Object r2 = r2.f5691
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L11
            android.view.View r2 = (android.view.View) r2
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 != 0) goto L15
            goto L1c
        L15:
            ig r1 = r1.f8559
            java.lang.String r0 = "3903 top bar attached"
            r1.invoke(r2, r0)
        L1c:
            return
        L1d:
            java.lang.Object r2 = r2.f5691
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L26
            android.view.View r2 = (android.view.View) r2
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 != 0) goto L2a
            goto L31
        L2a:
            ig r1 = r1.f8559
            java.lang.String r0 = "3903 top bar constructor"
            r1.invoke(r2, r0)
        L31:
            return
    }
}
