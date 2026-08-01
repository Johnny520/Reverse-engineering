package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12143;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.content.Context f12144;

    public /* synthetic */ xe0(android.content.Context r1, int r2) {
            r0 = this;
            r0.f12143 = r2
            r0.f12144 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f12143
            android.content.Context r6 = r6.f12144
            switch(r0) {
                case 0: goto L52;
                case 1: goto L4a;
                default: goto L7;
            }
        L7:
            p000.AbstractC0976x9.m6537(r6)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = p000.AbstractC0976x9.f12074
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L22
            long r2 = p000.AbstractC0976x9.f12074
            long r2 = r0 - r2
            r4 = 1800000(0x1b7740, double:8.89318E-318)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L22
            goto L47
        L22:
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.AbstractC0976x9.f12071
            r2 = 0
            r3 = 1
            boolean r6 = r6.compareAndSet(r2, r3)
            if (r6 != 0) goto L2d
            goto L47
        L2d:
            p000.AbstractC0976x9.f12074 = r0
            android.content.Context r6 = p000.AbstractC0976x9.f12075
            if (r6 == 0) goto L38
            android.os.Handler r0 = p000.C0753r9.f9291
            p000.C0753r9.m5069(r6)
        L38:
            java.lang.Thread r6 = new java.lang.Thread
            s0 r0 = new s0
            r0.<init>(r3)
            java.lang.String r1 = "DY-Beta-Notice"
            r6.<init>(r0, r1)
            r6.start()
        L47:
            s62 r6 = p000.s62.f9751
            return r6
        L4a:
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier r0 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.INSTANCE
            r0.init(r6)
        L4f:
            s62 r6 = p000.s62.f9751
            return r6
        L52:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            r0.init(r6)
            goto L4f
    }
}
