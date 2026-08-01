package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛲᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0547 implements xhss.InterfaceC0979, xhss.InterfaceC1148 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1966;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f1967;

    public /* synthetic */ C0547(java.lang.String r1, int r2) {
            r0 = this;
            r0.f1966 = r2
            r0.f1967 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f1966
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.String r2 = r2.f1967
            r0.append(r2)
            r2 = 62
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC1148
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public boolean mo523(java.lang.CharSequence r1, int r2, int r3, xhss.C0476 r4) {
            r0 = this;
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r0 = r0.f1967
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L16
            int r0 = r4.f1715
            r0 = r0 & 3
            r0 = r0 | 4
            r4.f1715 = r0
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    @Override // xhss.InterfaceC0979
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public java.lang.Object mo964() {
            r1 = this;
            xhss.ᛱᲈᛲᛷ r0 = new xhss.ᛱᲈᛲᛷ
            java.lang.String r1 = r1.f1967
            r0.<init>(r1)
            throw r0
    }

    @Override // xhss.InterfaceC1148
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public java.lang.Object mo528() {
            r0 = this;
            return r0
    }
}
