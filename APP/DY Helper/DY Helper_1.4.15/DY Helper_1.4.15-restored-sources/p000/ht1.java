package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4813;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f4814;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f4815;

    public /* synthetic */ ht1(android.app.Activity r1, int r2, int r3) {
            r0 = this;
            r0.f4813 = r3
            r0.f4814 = r1
            r0.f4815 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f4813
            s62 r1 = p000.s62.f9751
            int r2 = r9.f4815
            a80 r10 = (p000.a80) r10
            switch(r0) {
                case 0: goto L76;
                case 1: goto L5b;
                case 2: goto L41;
                case 3: goto L26;
                default: goto Lb;
            }
        Lb:
            r10.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r6 = java.lang.String.valueOf(r2)
            hu r8 = new hu
            r0 = 20
            android.app.Activity r3 = r9.f4814
            r8.<init>(r3, r10, r0)
            java.lang.String r4 = "设置火花/火星启动延迟"
            java.lang.String r5 = "建议 10~60 秒，让私信数据有时间加载"
            r7 = 2
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return r1
        L26:
            r10.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r6 = java.lang.String.valueOf(r2)
            hu r8 = new hu
            r0 = 8
            android.app.Activity r3 = r9.f4814
            r8.<init>(r3, r10, r0)
            java.lang.String r4 = "设置营地操作间隔"
            java.lang.String r5 = "输入 0~60 秒"
            r7 = 2
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return r1
        L41:
            r10.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r6 = java.lang.String.valueOf(r2)
            hu r8 = new hu
            r0 = 6
            android.app.Activity r3 = r9.f4814
            r8.<init>(r3, r10, r0)
            java.lang.String r4 = "设置每日种植限额"
            java.lang.String r5 = "输入 0~100；0 表示不限制"
            r7 = 2
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return r1
        L5b:
            r10.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r6 = java.lang.String.valueOf(r2)
            hu r8 = new hu
            r0 = 14
            android.app.Activity r3 = r9.f4814
            r8.<init>(r3, r10, r0)
            java.lang.String r4 = "设置每日收获限额"
            java.lang.String r5 = "输入 0~100；0 表示不限制"
            r7 = 2
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return r1
        L76:
            r10.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r6 = java.lang.String.valueOf(r2)
            hu r8 = new hu
            r0 = 15
            android.app.Activity r3 = r9.f4814
            r8.<init>(r3, r10, r0)
            java.lang.String r4 = "设置营地启动延迟"
            java.lang.String r5 = "输入 0~300 秒；会话尚未加载完成时会继续等待，不会跳过本次执行"
            r7 = 2
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return r1
    }
}
