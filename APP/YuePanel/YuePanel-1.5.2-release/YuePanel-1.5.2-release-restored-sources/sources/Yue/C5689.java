package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5689 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۧ۟ۡ$ۥ */
    public /* synthetic */ class C0839 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1616;

        static {
            int[] iArr = new int[EnumC5692.values().length];
            try {
                iArr[EnumC5692.f14010.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5692.f14011.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5692.f14012.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1616 = iArr;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static <T> InterfaceC5684<T> m2370(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(interfaceC5122, "initializer");
        C4335 c4335 = null;
        return new C7699(interfaceC5122, c4335, 2, c4335);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T> InterfaceC5684<T> m2371(@InterfaceC6399 EnumC5692 enumC5692, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(enumC5692, "mode");
        C5499.m17103(interfaceC5122, "initializer");
        int i = C0839.f1616[enumC5692.ordinal()];
        int i2 = 2;
        if (i == 1) {
            C4335 c4335 = null;
            return new C7699(interfaceC5122, c4335, i2, c4335);
        }
        if (i == 2) {
            return new C7214(interfaceC5122);
        }
        if (i == 3) {
            return new C8111(interfaceC5122);
        }
        throw new C6380();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC5684<T> m17589(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(interfaceC5122, "initializer");
        return new C7699(interfaceC5122, obj);
    }
}
