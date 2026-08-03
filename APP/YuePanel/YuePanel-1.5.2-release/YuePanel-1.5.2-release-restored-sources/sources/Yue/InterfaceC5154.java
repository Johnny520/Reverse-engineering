package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5495
public interface InterfaceC5154<T> extends InterfaceC4890<T> {

    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۧ$ۥ */
    public static final class C0650 {
        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ InterfaceC4890 m1934(InterfaceC5154 interfaceC5154, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i2 & 1) != 0) {
                interfaceC4225 = C4629.f9940;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                enumC3602 = EnumC3602.SUSPEND;
            }
            return interfaceC5154.mo10178(interfaceC4225, i, enumC3602);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    InterfaceC4890<T> mo10178(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602);
}
