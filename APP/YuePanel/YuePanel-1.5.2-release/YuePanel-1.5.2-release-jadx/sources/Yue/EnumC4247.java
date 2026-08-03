package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4247 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۨ$ۥ */
    public /* synthetic */ class C0368 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f752;

        static {
            int[] iArr = new int[EnumC4247.values().length];
            iArr[EnumC4247.DEFAULT.ordinal()] = 1;
            iArr[EnumC4247.ATOMIC.ordinal()] = 2;
            iArr[EnumC4247.UNDISPATCHED.ordinal()] = 3;
            iArr[EnumC4247.LAZY.ordinal()] = 4;
            f752 = iArr;
        }
    }

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12249() {
    }

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final <T> void m12250(@InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) throws Throwable {
        int i = C0368.f752[ordinal()];
        if (i == 1) {
            C3672.m10061(interfaceC5124, interfaceC4199);
            return;
        }
        if (i == 2) {
            C4203.m12100(interfaceC5124, interfaceC4199);
        } else if (i == 3) {
            C8103.m4135(interfaceC5124, interfaceC4199);
        } else if (i != 4) {
            throw new C6380();
        }
    }

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final <R, T> void m12251(@InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, R r, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        int i = C0368.f752[ordinal()];
        if (i == 1) {
            C3672.m10063(interfaceC5138, r, interfaceC4199, null, 4, null);
            return;
        }
        if (i == 2) {
            C4203.m12101(interfaceC5138, r, interfaceC4199);
        } else if (i == 3) {
            C8103.m4136(interfaceC5138, r, interfaceC4199);
        } else if (i != 4) {
            throw new C6380();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m12252() {
        return this == LAZY;
    }
}
