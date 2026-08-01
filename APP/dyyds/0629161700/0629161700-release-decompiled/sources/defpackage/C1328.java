package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1328 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f5860;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f5861;

    public C1328(android.content.Context r1, int r2) {
            r0 = this;
            r0.f5860 = r2
            switch(r2) {
                case 1: goto L15;
                case 2: goto Lb;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.f5861 = r1
            return
        Lb:
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f5861 = r1
            return
        L15:
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f5861 = r1
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f5860
            switch(r0) {
                case 0: goto L35;
                case 1: goto L1d;
                default: goto L5;
            }
        L5:
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r0 = defpackage.AbstractC0209.m762(r1)
            if (r0 == 0) goto L1b
            java.util.List r0 = r1.getPathSegments()
            java.lang.String r1 = "video"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
        L1d:
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r0 = defpackage.AbstractC0209.m762(r1)
            if (r0 == 0) goto L33
            java.util.List r0 = r1.getPathSegments()
            java.lang.String r1 = "video"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
        L35:
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r0 = defpackage.AbstractC0209.m762(r1)
            return r0
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r7, int r8, int r9, defpackage.C0533 r10) {
            r6 = this;
            int r0 = r6.f5860
            r1 = 0
            r2 = 0
            r3 = 384(0x180, float:5.38E-43)
            r4 = 512(0x200, float:7.17E-43)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            android.content.Context r6 = r6.f5861
            switch(r0) {
                case 0: goto L68;
                case 1: goto L46;
                default: goto Lf;
            }
        Lf:
            android.net.Uri r7 = (android.net.Uri) r7
            if (r8 == r5) goto L45
            if (r9 == r5) goto L45
            if (r8 > r4) goto L45
            if (r9 > r3) goto L45
            ᛵᲇᛳᲇ r8 = defpackage.C1408.f6122
            java.lang.Object r8 = r10.m1326(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L45
            long r8 = r8.longValue()
            r0 = -1
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L45
            ᛳᛱᛱᛲ r2 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r8 = new ᛵᛶᲈᛵ
            r8.<init>(r7)
            ᲈᛴᛴᲇ r9 = new ᲈᛴᛴᲇ
            android.content.ContentResolver r10 = r6.getContentResolver()
            r0 = 1
            r9.<init>(r10, r0)
            ᛸᛶᛷᛸ r6 = defpackage.C1512.m2749(r6, r7, r9)
            r2.<init>(r8, r6)
        L45:
            return r2
        L46:
            android.net.Uri r7 = (android.net.Uri) r7
            if (r8 == r5) goto L67
            if (r9 == r5) goto L67
            if (r8 > r4) goto L67
            if (r9 > r3) goto L67
            ᛳᛱᛱᛲ r2 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r8 = new ᛵᛶᲈᛵ
            r8.<init>(r7)
            ᲈᛴᛴᲇ r9 = new ᲈᛴᛴᲇ
            android.content.ContentResolver r10 = r6.getContentResolver()
            r9.<init>(r10, r1)
            ᛸᛶᛷᛸ r6 = defpackage.C1512.m2749(r6, r7, r9)
            r2.<init>(r8, r6)
        L67:
            return r2
        L68:
            android.net.Uri r7 = (android.net.Uri) r7
            ᛳᛱᛱᛲ r8 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r9 = new ᛵᛶᲈᛵ
            r9.<init>(r7)
            ᲈᛶᲀᛴ r10 = new ᲈᛶᲀᛴ
            r10.<init>(r6, r1, r7)
            r8.<init>(r9, r10)
            return r8
    }
}
