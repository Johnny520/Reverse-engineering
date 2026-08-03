package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4762
@InterfaceC4213
@InterfaceC7470(version = "1.3")
public interface InterfaceC4211 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۥۣ$ۥ */
    public static final class C0351 {
        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ InterfaceC3656 m1171(InterfaceC4211 interfaceC4211, InterfaceC5139 interfaceC5139, EnumC5513 enumC5513, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i & 2) != 0) {
                enumC5513 = EnumC5513.f13490;
            }
            return interfaceC4211.m12107(interfaceC5139, enumC5513);
        }
    }

    @InterfaceC6399
    @InterfaceC4213
    /* JADX INFO: renamed from: ۥ */
    InterfaceC7160 m1169();

    @InterfaceC6399
    @InterfaceC4213
    /* JADX INFO: renamed from: ۥ۟ */
    InterfaceC7160 m1170(@InterfaceC6489 Object obj);

    @InterfaceC6399
    @InterfaceC4213
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    InterfaceC7162 m12106();

    @InterfaceC6399
    @InterfaceC4213
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    <R> InterfaceC3656 m12107(@InterfaceC6399 InterfaceC5139<? extends R> interfaceC5139, @InterfaceC6399 EnumC5513 enumC5513);
}
