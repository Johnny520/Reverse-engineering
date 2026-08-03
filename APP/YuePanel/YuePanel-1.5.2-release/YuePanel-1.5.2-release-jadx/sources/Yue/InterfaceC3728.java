package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3728<E> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۧ$ۥ */
    public static final class C0239 {

        /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۧ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m1273f = "Channel.kt", m1274i = {0}, m1275l = {584}, m1276m = "next", m1277n = {"this"}, m1278s = {"L$0"})
        public static final class C3729<E> extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f6670;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f6671;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f6672;

            public C3729(InterfaceC4199<? super C3729> interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f6671 = obj;
                this.f6672 |= Integer.MIN_VALUE;
                return C0239.m802(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @InterfaceC5572(name = "next")
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ Object m802(InterfaceC3728 interfaceC3728, InterfaceC4199 interfaceC4199) {
            C3729 c3729;
            if (interfaceC4199 instanceof C3729) {
                c3729 = (C3729) interfaceC4199;
                int i = c3729.f6672;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c3729.f6672 = i - Integer.MIN_VALUE;
                } else {
                    c3729 = new C3729(interfaceC4199);
                }
            }
            Object objMo38 = c3729.f6671;
            Object objM17142 = C5508.m17142();
            int i2 = c3729.f6672;
            if (i2 == 0) {
                C7149.m22422(objMo38);
                c3729.f6670 = interfaceC3728;
                c3729.f6672 = 1;
                objMo38 = interfaceC3728.mo38(c3729);
                if (objMo38 == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3728 = (InterfaceC3728) c3729.f6670;
                C7149.m22422(objMo38);
            }
            if (((Boolean) objMo38).booleanValue()) {
                return interfaceC3728.next();
            }
            throw new C3855(C3734.f497);
        }
    }

    E next();

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @InterfaceC5572(name = "next")
    /* JADX INFO: renamed from: ۥ */
    /* synthetic */ Object mo37(InterfaceC4199 interfaceC4199);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    Object mo38(@InterfaceC6399 InterfaceC4199<? super Boolean> interfaceC4199);
}
