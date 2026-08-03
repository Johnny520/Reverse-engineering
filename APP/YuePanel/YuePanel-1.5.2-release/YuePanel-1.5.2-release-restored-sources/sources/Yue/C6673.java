package Yue;

import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6673 {
    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static final Random m3164(@InterfaceC6399 AbstractC7000 abstractC7000) {
        Random randomMo5819;
        C5499.m17103(abstractC7000, "<this>");
        AbstractC2999 abstractC2999 = abstractC7000 instanceof AbstractC2999 ? (AbstractC2999) abstractC7000 : null;
        return (abstractC2999 == null || (randomMo5819 = abstractC2999.mo5819()) == null) ? new C5669(abstractC7000) : randomMo5819;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final AbstractC7000 m3165(@InterfaceC6399 Random random) {
        AbstractC7000 abstractC7000M2359;
        C5499.m17103(random, "<this>");
        C5669 c5669 = random instanceof C5669 ? (C5669) random : null;
        return (c5669 == null || (abstractC7000M2359 = c5669.m2359()) == null) ? new C6672(random) : abstractC7000M2359;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final AbstractC7000 m21327() {
        return C6671.f2230.mo2265();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final double m21328(int i, int i2) {
        return ((((long) i) << 27) + ((long) i2)) / 9.007199254740992E15d;
    }
}
