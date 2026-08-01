package p000;

/* JADX INFO: renamed from: uy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0889uy implements p000.InterfaceC0852ty {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11011;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f11012;

    public /* synthetic */ C0889uy(java.lang.String r1, int r2) {
            r0 = this;
            r0.f11011 = r2
            r0.f11012 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f11011
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.String r2 = r2.f11012
            r1 = 62
            java.lang.String r2 = p000.AbstractC0602nx.m4132(r0, r2, r1)
            return r2
    }

    @Override // p000.InterfaceC0852ty
    /* JADX INFO: renamed from: α */
    public java.lang.Object mo3980() {
            r0 = this;
            return r0
    }

    @Override // p000.InterfaceC0852ty
    /* JADX INFO: renamed from: ζ */
    public boolean mo3983(java.lang.CharSequence r1, int r2, int r3, p000.k62 r4) {
            r0 = this;
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r0 = r0.f11012
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L16
            int r0 = r4.f5778
            r0 = r0 & 3
            r0 = r0 | 4
            r4.f5778 = r0
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }
}
