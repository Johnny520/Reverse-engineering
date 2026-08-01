package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q82 extends p000.yw0 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f8905;

    public q82(int r1, java.lang.Class r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f8905 = r5
            r0.<init>()
            r0.f12857 = r1
            r0.f12860 = r2
            r0.f12859 = r3
            r0.f12858 = r4
            return
    }

    @Override // p000.yw0
    /* JADX INFO: renamed from: γ */
    public final java.lang.Object mo4811(android.view.View r1) {
            r0 = this;
            int r0 = r0.f8905
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.CharSequence r0 = p000.z82.m7117(r1)
            return r0
        La:
            java.lang.CharSequence r0 = p000.x82.m6519(r1)
            return r0
    }

    @Override // p000.yw0
    /* JADX INFO: renamed from: δ */
    public final void mo4812(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.f8905
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            p000.z82.m7118(r1, r2)
            return
        Lb:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            p000.x82.m6522(r1, r2)
            return
    }

    @Override // p000.yw0
    /* JADX INFO: renamed from: η */
    public final boolean mo4813(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.f8905
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r1, r2)
        Ld:
            r0 = r0 ^ 1
            return r0
        L10:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r1, r2)
            goto Ld
    }
}
