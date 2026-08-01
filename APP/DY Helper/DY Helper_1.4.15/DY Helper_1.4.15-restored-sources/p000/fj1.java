package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3969;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f3970;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f3971;

    public /* synthetic */ fj1(android.app.Activity r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f3969 = r3
            r0.f3970 = r1
            r0.f3971 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ fj1(java.lang.String r2, android.app.Activity r3) {
            r1 = this;
            r0 = 0
            r1.f3969 = r0
            r1.<init>()
            r1.f3971 = r2
            r1.f3970 = r3
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f3969
            java.lang.String r1 = r9.f3971
            s62 r2 = p000.s62.f9751
            switch(r0) {
                case 0: goto L67;
                case 1: goto L48;
                case 2: goto L29;
                default: goto L9;
            }
        L9:
            a80 r10 = (p000.a80) r10
            r10.getClass()
            java.lang.Object r0 = p000.pf1.f8541
            xj0 r8 = new xj0
            r0 = 8
            r8.<init>(r10, r0)
            android.app.Activity r4 = r9.f3970
            r4.getClass()
            xg0 r3 = new xg0
            java.lang.String r5 = r9.f3971
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r4.runOnUiThread(r3)
            return r2
        L29:
            a80 r10 = (p000.a80) r10
            r10.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r6 = p000.bv1.m1037(r1)
            hu r8 = new hu
            r0 = 9
            android.app.Activity r3 = r9.f3970
            r8.<init>(r10, r3, r0)
            java.lang.String r4 = "设置用户 UID 黑名单"
            java.lang.String r5 = "每行一个数字 UID"
            r7 = 131073(0x20001, float:1.83672E-40)
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return r2
        L48:
            a80 r10 = (p000.a80) r10
            r10.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r6 = p000.bv1.m1037(r1)
            hu r8 = new hu
            r0 = 24
            android.app.Activity r3 = r9.f3970
            r8.<init>(r10, r3, r0)
            java.lang.String r4 = "设置关键词黑名单"
            java.lang.String r5 = "每行一个关键词"
            r7 = 131073(0x20001, float:1.83672E-40)
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return r2
        L67:
            android.app.Activity r9 = r9.f3970
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r10 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r10
            s62 r9 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.m1458(r1, r9, r10)
            return r9
    }
}
