package Yue;

import Yue.C3630;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "HttpHeaders")
public final class C5379 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3630 f1463;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C3630 f1464;

    static {
        C3630.C0198 c0198 = C3630.f6370;
        f1463 = c0198.m9876("\"\\");
        f1464 = c0198.m9876("\t ,=");
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "No longer supported", replaceWith = @InterfaceC7097(expression = "response.promisesBody()", imports = {}))
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m2133(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "response");
        return m16726(c7141);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final List<C3693> m2134(@InterfaceC6399 C5256 c5256, @InterfaceC6399 String str) {
        C5499.m17103(c5256, "<this>");
        C5499.m17103(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c5256.size();
        for (int i = 0; i < size; i++) {
            if (C7627.m23974(str, c5256.m16114(i), true)) {
                try {
                    m16727(new C3600().mo9638(c5256.m16118(i)), arrayList);
                } catch (EOFException e) {
                    C6668.f2226.m21321().m21315("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m16726(@InterfaceC6399 C7141 c7141) {
        C5499.m17103(c7141, "<this>");
        if (C5499.m17094(c7141.m22331().m22156(), "HEAD")) {
            return false;
        }
        int iM22315 = c7141.m22315();
        return (((iM22315 >= 100 && iM22315 < 200) || iM22315 == 204 || iM22315 == 304) && C8158.m26856(c7141) == -1 && !C7627.m23974("chunked", C7141.m22298(c7141, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16727(C3600 c3600, List<C3693> list) throws EOFException {
        String strM16729;
        int iM26878;
        LinkedHashMap linkedHashMap;
        while (true) {
            String strM167292 = null;
            while (true) {
                if (strM167292 == null) {
                    m16731(c3600);
                    strM167292 = m16729(c3600);
                    if (strM167292 == null) {
                        return;
                    }
                }
                boolean zM16731 = m16731(c3600);
                strM16729 = m16729(c3600);
                if (strM16729 == null) {
                    if (c3600.mo9622()) {
                        list.add(new C3693(strM167292, (Map<String, String>) C5943.m18584()));
                        return;
                    }
                    return;
                }
                iM26878 = C8158.m26878(c3600, (byte) 61);
                boolean zM167312 = m16731(c3600);
                if (zM16731 || (!zM167312 && !c3600.mo9622())) {
                    linkedHashMap = new LinkedHashMap();
                    int iM268782 = iM26878 + C8158.m26878(c3600, (byte) 61);
                    while (true) {
                        if (strM16729 == null) {
                            strM16729 = m16729(c3600);
                            if (!m16731(c3600)) {
                                iM268782 = C8158.m26878(c3600, (byte) 61);
                                if (iM268782 == 0) {
                                    if (iM268782 > 1 || m16731(c3600)) {
                                        return;
                                    }
                                    String strM16728 = m16732(c3600, (byte) 34) ? m16728(c3600) : m16729(c3600);
                                    if (strM16728 == null || ((String) linkedHashMap.put(strM16729, strM16728)) != null) {
                                        return;
                                    }
                                    if (!m16731(c3600) && !c3600.mo9622()) {
                                        return;
                                    } else {
                                        strM16729 = null;
                                    }
                                }
                            }
                        } else if (iM268782 == 0) {
                            break;
                        }
                    }
                }
                list.add(new C3693(strM167292, linkedHashMap));
                strM167292 = strM16729;
            }
            Map mapSingletonMap = Collections.singletonMap(null, strM16729 + C7627.m23994("=", iM26878));
            C5499.m17102(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new C3693(strM167292, (Map<String, String>) mapSingletonMap));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String m16728(C3600 c3600) throws EOFException {
        if (c3600.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C3600 c36002 = new C3600();
        while (true) {
            long jMo9639 = c3600.mo9639(f1463);
            if (jMo9639 == -1) {
                return null;
            }
            if (c3600.m9650(jMo9639) == 34) {
                c36002.mo9102(c3600, jMo9639);
                c3600.readByte();
                return c36002.mo9662();
            }
            if (c3600.m9684() == jMo9639 + 1) {
                return null;
            }
            c36002.mo9102(c3600, jMo9639);
            c3600.readByte();
            c36002.mo9102(c3600, 1L);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String m16729(C3600 c3600) {
        long jMo9639 = c3600.mo9639(f1464);
        if (jMo9639 == -1) {
            jMo9639 = c3600.m9684();
        }
        if (jMo9639 != 0) {
            return c3600.mo9609(jMo9639);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m16730(@InterfaceC6399 InterfaceC4217 interfaceC4217, @InterfaceC6399 C5385 c5385, @InterfaceC6399 C5256 c5256) {
        C5499.m17103(interfaceC4217, "<this>");
        C5499.m17103(c5385, "url");
        C5499.m17103(c5256, "headers");
        if (interfaceC4217 == InterfaceC4217.f745) {
            return;
        }
        List<C4216> listM12148 = C4216.f8555.m12148(c5385, c5256);
        if (listM12148.isEmpty()) {
            return;
        }
        interfaceC4217.mo1181(c5385, listM12148);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m16731(C3600 c3600) throws EOFException {
        boolean z = false;
        while (!c3600.mo9622()) {
            byte bM9650 = c3600.m9650(0L);
            if (bM9650 == 44) {
                c3600.readByte();
                z = true;
            } else {
                if (bM9650 != 32 && bM9650 != 9) {
                    break;
                }
                c3600.readByte();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m16732(C3600 c3600, byte b) {
        return !c3600.mo9622() && c3600.m9650(0L) == b;
    }
}
