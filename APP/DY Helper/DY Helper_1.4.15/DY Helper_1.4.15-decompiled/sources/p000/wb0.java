package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11647;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.dc0 f11648;

    public /* synthetic */ wb0(p000.dc0 r1, int r2) {
            r0 = this;
            r0.f11647 = r2
            r0.f11648 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f11647
            switch(r0) {
                case 0: goto L47;
                case 1: goto L3a;
                case 2: goto L2d;
                case 3: goto L21;
                case 4: goto L14;
                default: goto L5;
            }
        L5:
            r0 = 0
            dc0 r1 = r1.f11648
            r1.f3071 = r0
            java.lang.String r0 = "群申请任务正在执行，请稍后刷新"
            r1.f3074 = r0
            r1.m1695()
            s62 r1 = p000.s62.f9751
            return r1
        L14:
            dc0 r1 = r1.f11648
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f3066
            boolean r1 = r1.get()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L21:
            java.lang.String r0 = "审批已提交，正在同步服务端状态"
            dc0 r1 = r1.f11648
            r1.f3073 = r0
            r1.m1695()
            s62 r1 = p000.s62.f9751
            return r1
        L2d:
            dc0 r1 = r1.f11648
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f3066
            boolean r1 = r1.get()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L3a:
            dc0 r1 = r1.f11648
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f3066
            boolean r1 = r1.get()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L47:
            r0 = 0
            dc0 r1 = r1.f11648
            r1.f3072 = r0
            java.lang.String r0 = "群申请任务正在执行，请稍后重试"
            r1.f3074 = r0
            r1.m1695()
            s62 r1 = p000.s62.f9751
            return r1
    }
}
