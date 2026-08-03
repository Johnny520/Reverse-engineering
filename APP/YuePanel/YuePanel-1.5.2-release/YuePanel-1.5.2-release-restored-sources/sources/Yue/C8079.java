package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8079 {
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUByte")
    /* JADX INFO: renamed from: ۥ */
    public static final int m4113(@InterfaceC6399 InterfaceC7326<C8048> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<C8048> it = interfaceC7326.iterator();
        int iM26318 = 0;
        while (it.hasNext()) {
            iM26318 = C8057.m26318(iM26318 + C8057.m26318(it.next().m26245() & 255));
        }
        return iM26318;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUInt")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m4114(@InterfaceC6399 InterfaceC7326<C8057> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<C8057> it = interfaceC7326.iterator();
        int iM26318 = 0;
        while (it.hasNext()) {
            iM26318 = C8057.m26318(iM26318 + it.next().m26372());
        }
        return iM26318;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfULong")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m26583(@InterfaceC6399 InterfaceC7326<C8064> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<C8064> it = interfaceC7326.iterator();
        long jM26408 = 0;
        while (it.hasNext()) {
            jM26408 = C8064.m26408(jM26408 + it.next().m26462());
        }
        return jM26408;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUShort")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26584(@InterfaceC6399 InterfaceC7326<C8080> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<C8080> it = interfaceC7326.iterator();
        int iM26318 = 0;
        while (it.hasNext()) {
            iM26318 = C8057.m26318(iM26318 + C8057.m26318(it.next().m26642() & C8080.f23970));
        }
        return iM26318;
    }
}
