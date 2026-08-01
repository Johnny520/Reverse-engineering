package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1372 implements defpackage.InterfaceC0696, defpackage.InterfaceC1991, defpackage.InterfaceC0429 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.Context f6000;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6001;

    public C1372(android.content.Context r2) {
            r1 = this;
            r0 = 3
            r1.f6001 = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f6000 = r2
            return
    }

    public /* synthetic */ C1372(android.content.Context r1, int r2) {
            r0 = this;
            r0.f6001 = r2
            r0.f6000 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0429
    public java.lang.Object get() {
            r1 = this;
            android.content.Context r1 = r1.f6000
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            return r1
    }

    @Override // defpackage.InterfaceC1991
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public void mo2284(defpackage.AbstractC1533 r9) {
            r8 = this;
            ᛵᲇᛲᛴ r7 = new ᛵᲇᛲᛴ
            java.lang.String r0 = "EmojiCompatInitializer"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            ᛵᛸᲇ r1 = new ᛵᛸᲇ
            r2 = 0
            r1.<init>(r8, r9, r0, r2)
            r0.execute(r1)
            return
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r4) {
            r3 = this;
            int r0 = r3.f6001
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            android.content.Context r2 = r3.f6000
            switch(r0) {
                case 0: goto L42;
                case 1: goto L3c;
                case 2: goto L36;
                case 3: goto L9;
                case 4: goto L9;
                case 5: goto L2f;
                case 6: goto L28;
                case 7: goto L21;
                case 8: goto L15;
                default: goto L9;
            }
        L9:
            ᛶᛷᛷᛷ r3 = new ᛶᛷᛷᛷ
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            ᲈᛶᲀᛳ r4 = r4.m2475(r1, r0)
            r3.<init>(r2, r4)
            return r3
        L15:
            ᛶᛷᛷᛷ r3 = new ᛶᛷᛷᛷ
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            ᲈᛶᲀᛳ r4 = r4.m2475(r1, r0)
            r3.<init>(r2, r4)
            return r3
        L21:
            ᛷᛸᛲᛳ r3 = new ᛷᛸᛲᛳ
            r4 = 2
            r3.<init>(r2, r4)
            return r3
        L28:
            ᛷᛸᛲᛳ r3 = new ᛷᛸᛲᛳ
            r4 = 1
            r3.<init>(r2, r4)
            return r3
        L2f:
            ᛷᛸᛲᛳ r3 = new ᛷᛸᛲᛳ
            r4 = 0
            r3.<init>(r2, r4)
            return r3
        L36:
            ᛶᛷᛷᛷ r4 = new ᛶᛷᛷᛷ
            r4.<init>(r2, r3)
            return r4
        L3c:
            ᛶᛷᛷᛷ r4 = new ᛶᛷᛷᛷ
            r4.<init>(r2, r3)
            return r4
        L42:
            ᛶᛷᛷᛷ r4 = new ᛶᛷᛷᛷ
            r4.<init>(r2, r3)
            return r4
    }
}
