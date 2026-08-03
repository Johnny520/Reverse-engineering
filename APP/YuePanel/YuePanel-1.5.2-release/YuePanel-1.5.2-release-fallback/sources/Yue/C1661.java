package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1661 {
    @Yue.InterfaceC3421(name = "isSchedulerWorker")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m7999(@Yue.InterfaceC4418 java.lang.Thread r0) {
            boolean r0 = r0 instanceof Yue.ExecutorC1656.C1659
            return r0
    }

    @Yue.InterfaceC3421(name = "mayNotBlock")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m8000(@Yue.InterfaceC4418 java.lang.Thread r1) {
            boolean r0 = r1 instanceof Yue.ExecutorC1656.C1659
            if (r0 == 0) goto Le
            Yue.ۥۣ۟ۧۧ$ۥ۟۟ r1 = (Yue.ExecutorC1656.C1659) r1
            Yue.ۥۣ۟ۧۧ$ۥ۟۟۟ r1 = r1.f5135
            Yue.ۥۣ۟ۧۧ$ۥ۟۟۟ r0 = Yue.ExecutorC1656.EnumC1660.f5141
            if (r1 != r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }
}
