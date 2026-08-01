package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛲᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0248 extends xhss.AbstractC1202 implements xhss.InterfaceC0517 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f923;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0259 f924;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f925;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f926;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Boolean f927;

    public C0248(java.lang.Object r1, java.lang.Boolean r2, android.content.Context r3, java.lang.String r4, xhss.C0259 r5, xhss.InterfaceC0038 r6) {
            r0 = this;
            r0.f923 = r1
            r0.f927 = r2
            r0.f926 = r3
            r0.f925 = r4
            r0.f924 = r5
            r0.<init>(r6)
            return
    }

    @Override // xhss.InterfaceC0517
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo115(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            xhss.ᛲᛸᲁᲇ r1 = (xhss.InterfaceC0197) r1
            xhss.ᛱᛴᛶᛴ r2 = (xhss.InterfaceC0038) r2
            xhss.ᛱᛴᛶᛴ r0 = r0.mo117(r1, r2)
            xhss.ᛳᛲᲈᛶ r0 = (xhss.C0248) r0
            xhss.ᛵᛷᲈᛶ r1 = xhss.C0500.f1817
            r0.mo116(r1)
            return r1
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final java.lang.Object mo116(java.lang.Object r6) {
            r5 = this;
            xhss.C0614.m1058(r6)
            xhss.ᛳᛴᛵ r6 = r5.f924
            r0 = 0
            java.lang.Object r1 = r5.f923
            if (r1 == 0) goto L1f
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L1d
            xhss.ᛳᛱᛲᛲ r3 = xhss.C0229.f861     // Catch: java.lang.Throwable -> L1d
            r3.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = xhss.C0229.m513()     // Catch: java.lang.Throwable -> L1d
            r2.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = xhss.C1085.m1765(r1, r3)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r5 = move-exception
            goto L63
        L1f:
            r2 = r0
        L20:
            java.lang.Boolean r3 = r5.f927     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L51
            if (r2 == 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0.append(r2)     // Catch: java.lang.Throwable -> L1d
            r2 = 95
            r0.append(r2)     // Catch: java.lang.Throwable -> L1d
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L1d
            r3 = -56036900046917(0xffffcd08e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)     // Catch: java.lang.Throwable -> L1d
            r2.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = xhss.C1085.m1768(r1, r3)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
        L50:
            r2 = r0
        L51:
            xhss.ᛳᲀᛷᲀ r0 = xhss.C0307.f1172     // Catch: java.lang.Throwable -> L1d
            android.content.Context r1 = r5.f926     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r5.f925     // Catch: java.lang.Throwable -> L1d
            r0.getClass()     // Catch: java.lang.Throwable -> L1d
            xhss.C0307.m643(r1, r5, r2)     // Catch: java.lang.Throwable -> L1d
            r6.m571()
            xhss.ᛵᛷᲈᛶ r5 = xhss.C0500.f1817
            return r5
        L63:
            r6.m571()
            throw r5
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.InterfaceC0038 mo117(java.lang.Object r8, xhss.InterfaceC0038 r9) {
            r7 = this;
            xhss.ᛳᛲᲈᛶ r0 = new xhss.ᛳᛲᲈᛶ
            java.lang.String r4 = r7.f925
            xhss.ᛳᛴᛵ r5 = r7.f924
            java.lang.Object r1 = r7.f923
            java.lang.Boolean r2 = r7.f927
            android.content.Context r3 = r7.f926
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
