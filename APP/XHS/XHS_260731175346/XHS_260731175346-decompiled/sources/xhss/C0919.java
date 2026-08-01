package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲈᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0919 extends xhss.AbstractC0352 implements xhss.InterfaceC0645 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0919 f2959 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0919 f2960 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0919 f2961 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0919 f2962 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0919 f2963 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ int f2964;

    static {
            xhss.ᲀᲈᲇᛱ r0 = new xhss.ᲀᲈᲇᛱ
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            xhss.C0919.f2962 = r0
            xhss.ᲀᲈᲇᛱ r0 = new xhss.ᲀᲈᲇᛱ
            r2 = 1
            r0.<init>(r1, r2)
            xhss.C0919.f2959 = r0
            xhss.ᲀᲈᲇᛱ r0 = new xhss.ᲀᲈᲇᛱ
            r2 = 2
            r0.<init>(r1, r2)
            xhss.C0919.f2963 = r0
            xhss.ᲀᲈᲇᛱ r0 = new xhss.ᲀᲈᲇᛱ
            r2 = 3
            r0.<init>(r1, r2)
            xhss.C0919.f2961 = r0
            xhss.ᲀᲈᲇᛱ r0 = new xhss.ᲀᲈᲇᛱ
            r2 = 4
            r0.<init>(r1, r2)
            xhss.C0919.f2960 = r0
            return
    }

    public /* synthetic */ C0919(int r1, int r2) {
            r0 = this;
            r0.f2964 = r2
            r0.<init>(r1)
            return
    }

    @Override // xhss.InterfaceC0645
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final java.lang.Object mo112(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f2964
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L25;
                case 2: goto L1e;
                case 3: goto L17;
                default: goto L5;
            }
        L5:
            android.view.View r1 = (android.view.View) r1
            r0 = 1678246194(0x64080132, float:1.0035373E22)
            java.lang.Object r0 = r1.getTag(r0)
            boolean r1 = r0 instanceof xhss.AbstractActivityC0194
            if (r1 == 0) goto L15
            xhss.ᛲᛸᛱᛸ r0 = (xhss.AbstractActivityC0194) r0
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
        L17:
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r0 = xhss.AbstractC0021.m122(r1)
            return r0
        L1e:
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r0 = xhss.AbstractC0021.m122(r1)
            return r0
        L25:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = xhss.AbstractC0021.m124(r1)
            return r0
        L2c:
            xhss.ᲇᛸᛳᛸ r1 = (xhss.C1062) r1
            xhss.ᲇᛶᛳᛵ r0 = r1.m1721()
            java.lang.String r0 = r0.f3370
            return r0
    }
}
