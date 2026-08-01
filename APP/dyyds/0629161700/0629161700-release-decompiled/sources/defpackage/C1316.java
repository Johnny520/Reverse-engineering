package defpackage;

/* JADX INFO: renamed from: ᛷᛷᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1316 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5825;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5826;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5827;

    public /* synthetic */ C1316(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f5827 = r2
            r0.f5826 = r1
            r0.f5825 = r3
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f5827
            r1 = 0
            ᲁᲀᛱᲁ r2 = defpackage.C1907.f8270
            java.lang.Object r3 = r7.f5825
            java.lang.Object r7 = r7.f5826
            switch(r0) {
                case 0: goto L87;
                case 1: goto L73;
                case 2: goto L20;
                default: goto Lc;
            }
        Lc:
            ᛳᲁᛳᛴ r7 = (defpackage.C0554) r7
            ᛸᛱᛴᲁ r3 = (defpackage.C1419) r3
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            ᲈᲇᲀᛸ r0 = new ᲈᲇᲀᛸ
            r0.<init>(r8, r3, r1)
            r8 = 3
            defpackage.AbstractC0397.m1149(r7, r1, r0, r8)
            return r2
        L20:
            com.android.app.CustomRecyclerView r7 = (com.android.app.CustomRecyclerView) r7
            ᛶᛱᛵᛳ r3 = (defpackage.C1006) r3
            java.util.List r8 = (java.util.List) r8
            r4 = -651138801507886(0xfffdafcaef0961d2, double:NaN)
            boolean r0 = r8.isEmpty()
            r4 = 0
            if (r0 != 0) goto L63
            ᛶᲈᲀᲇ r7 = r7.getAdapter()
            boolean r0 = r7 instanceof defpackage.C1131
            if (r0 == 0) goto L40
            r1 = r7
            ᛶᛸᲀᛸ r1 = (defpackage.C1131) r1
        L40:
            if (r1 == 0) goto L5c
            r5 = -1112521368313390(0xfffc0c2aef0961d2, double:NaN)
            java.util.ArrayList r7 = r1.f5024
            int r0 = r7.size()
            r7.addAll(r8)
            r1.f5030 = r4
            int r7 = r8.size()
            r1.notifyItemRangeInserted(r0, r7)
        L5c:
            int r7 = r3.f4472
            int r7 = r7 + 1
            r3.f4472 = r7
            goto L72
        L63:
            ᛶᲈᲀᲇ r7 = r7.getAdapter()
            boolean r8 = r7 instanceof defpackage.C1131
            if (r8 == 0) goto L6e
            r1 = r7
            ᛶᛸᲀᛸ r1 = (defpackage.C1131) r1
        L6e:
            if (r1 == 0) goto L72
            r1.f5030 = r4
        L72:
            return r2
        L73:
            ᲀᲇᛸᛶ r7 = (defpackage.C1771) r7
            ᲁᛷᛶᛶ r3 = (defpackage.InterfaceC1886) r3
            long r0 = java.lang.System.currentTimeMillis()
            defpackage.C1771.f7832 = r0
            ᲇᛷᛳᲀ r7 = r7.f7833
            ᲈᛴᲁᲇ r3 = (defpackage.AbstractC2232) r3
            java.lang.String r0 = r3.f9528
            r7.mo388(r0, r8)
            return r2
        L87:
            ᛷᲁᛷᛵ r7 = (defpackage.C1371) r7
            ᛱᲈᛷᲀ r3 = (defpackage.RunnableC0221) r3
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            android.os.Handler r7 = r7.f5998
            r7.removeCallbacks(r3)
            return r2
    }
}
