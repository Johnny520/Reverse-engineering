package Yue;

import Yue.C3526;
import Yue.C4125;
import Yue.C4128;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4402 {

    /* JADX INFO: renamed from: ۥ */
    public static final boolean f868 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f869 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C3526.C0169 f9075 = new C3526.C0169();

    /* JADX INFO: renamed from: ۥ */
    public static boolean m1350(C4128 c4128) {
        C4128.EnumC0339 enumC0339M11863 = c4128.m11863();
        C4128.EnumC0339 enumC0339M11888 = c4128.m11888();
        C4129 c4129 = c4128.m11876() != null ? (C4129) c4128.m11876() : null;
        if (c4129 != null) {
            c4129.m11863();
            C4128.EnumC0339 enumC0339 = C4128.EnumC0339.FIXED;
        }
        if (c4129 != null) {
            c4129.m11888();
            C4128.EnumC0339 enumC03392 = C4128.EnumC0339.FIXED;
        }
        C4128.EnumC0339 enumC03393 = C4128.EnumC0339.FIXED;
        boolean z = enumC0339M11863 == enumC03393 || enumC0339M11863 == C4128.EnumC0339.WRAP_CONTENT || (enumC0339M11863 == C4128.EnumC0339.MATCH_CONSTRAINT && c4128.f8366 == 0 && c4128.f8401 == 0.0f && c4128.m11895(0)) || c4128.mo9343();
        boolean z2 = enumC0339M11888 == enumC03393 || enumC0339M11888 == C4128.EnumC0339.WRAP_CONTENT || (enumC0339M11888 == C4128.EnumC0339.MATCH_CONSTRAINT && c4128.f8367 == 0 && c4128.f8401 == 0.0f && c4128.m11895(1)) || c4128.mo9344();
        if (c4128.f8401 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1351(C4128 c4128, C3526.InterfaceC0170 interfaceC0170, boolean z) {
        C4125 c4125;
        C4125 c41252;
        C4125 c41253;
        C4125 c41254;
        C4125 c41255;
        if (!(c4128 instanceof C4129) && c4128.m11904() && m1350(c4128)) {
            C4129.m11972(c4128, interfaceC0170, new C3526.C0169(), C3526.C0169.f5967);
        }
        C4125 c4125Mo11847 = c4128.mo11847(C4125.EnumC0335.LEFT);
        C4125 c4125Mo118472 = c4128.mo11847(C4125.EnumC0335.RIGHT);
        int iM11762 = c4125Mo11847.m11762();
        int iM117622 = c4125Mo118472.m11762();
        if (c4125Mo11847.m11761() != null && c4125Mo11847.m11771()) {
            for (C4125 c41256 : c4125Mo11847.m11761()) {
                C4128 c41282 = c41256.f8273;
                boolean zM1350 = m1350(c41282);
                if (c41282.m11904() && zM1350) {
                    C4129.m11972(c41282, interfaceC0170, new C3526.C0169(), C3526.C0169.f5967);
                }
                C4128.EnumC0339 enumC0339M11863 = c41282.m11863();
                C4128.EnumC0339 enumC0339 = C4128.EnumC0339.MATCH_CONSTRAINT;
                if (enumC0339M11863 != enumC0339 || zM1350) {
                    if (!c41282.m11904()) {
                        C4125 c41257 = c41282.f8386;
                        if (c41256 == c41257 && c41282.f8388.f8275 == null) {
                            int iM11763 = c41257.m11763() + iM11762;
                            c41282.m11927(iM11763, c41282.m11891() + iM11763);
                            m1351(c41282, interfaceC0170, z);
                        } else {
                            C4125 c41258 = c41282.f8388;
                            if (c41256 == c41258 && c41257.f8275 == null) {
                                int iM117632 = iM11762 - c41258.m11763();
                                c41282.m11927(iM117632 - c41282.m11891(), iM117632);
                                m1351(c41282, interfaceC0170, z);
                            } else if (c41256 == c41257 && (c41253 = c41258.f8275) != null && c41253.m11771() && !c41282.m11900()) {
                                m12740(interfaceC0170, c41282, z);
                            }
                        }
                    }
                } else if (c41282.m11863() == enumC0339 && c41282.f8370 >= 0 && c41282.f8369 >= 0 && (c41282.m11890() == 8 || (c41282.f8366 == 0 && c41282.m11856() == 0.0f))) {
                    if (!c41282.m11900() && !c41282.m11903() && ((c41256 == c41282.f8386 && (c41255 = c41282.f8388.f8275) != null && c41255.m11771()) || (c41256 == c41282.f8388 && (c41254 = c41282.f8386.f8275) != null && c41254.m11771()))) {
                        if (!c41282.m11900()) {
                            m12741(c4128, interfaceC0170, c41282, z);
                        }
                    }
                }
            }
        }
        if ((c4128 instanceof C5226) || c4125Mo118472.m11761() == null || !c4125Mo118472.m11771()) {
            return;
        }
        Iterator<C4125> it = c4125Mo118472.m11761().iterator();
        while (it.hasNext()) {
            C4125 next = it.next();
            C4128 c41283 = next.f8273;
            boolean zM13502 = m1350(c41283);
            if (c41283.m11904() && zM13502) {
                C4129.m11972(c41283, interfaceC0170, new C3526.C0169(), C3526.C0169.f5967);
            }
            boolean z2 = (next == c41283.f8386 && (c41252 = c41283.f8388.f8275) != null && c41252.m11771()) || (next == c41283.f8388 && (c4125 = c41283.f8386.f8275) != null && c4125.m11771());
            C4128.EnumC0339 enumC0339M118632 = c41283.m11863();
            C4128.EnumC0339 enumC03392 = C4128.EnumC0339.MATCH_CONSTRAINT;
            if (enumC0339M118632 != enumC03392 || zM13502) {
                if (!c41283.m11904()) {
                    C4125 c41259 = c41283.f8386;
                    if (next == c41259 && c41283.f8388.f8275 == null) {
                        int iM117633 = c41259.m11763() + iM117622;
                        c41283.m11927(iM117633, c41283.m11891() + iM117633);
                        m1351(c41283, interfaceC0170, z);
                    } else {
                        C4125 c412510 = c41283.f8388;
                        if (next == c412510 && c41259.f8275 == null) {
                            int iM117634 = iM117622 - c412510.m11763();
                            c41283.m11927(iM117634 - c41283.m11891(), iM117634);
                            m1351(c41283, interfaceC0170, z);
                        } else if (z2 && !c41283.m11900()) {
                            m12740(interfaceC0170, c41283, z);
                        }
                    }
                }
            } else if (c41283.m11863() == enumC03392 && c41283.f8370 >= 0 && c41283.f8369 >= 0 && (c41283.m11890() == 8 || (c41283.f8366 == 0 && c41283.m11856() == 0.0f))) {
                if (!c41283.m11900() && !c41283.m11903() && z2 && !c41283.m11900()) {
                    m12741(c4128, interfaceC0170, c41283, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m12738(C3507 c3507, C3526.InterfaceC0170 interfaceC0170, int i, boolean z) {
        if (c3507.m9345()) {
            if (i == 0) {
                m1351(c3507, interfaceC0170, z);
            } else {
                m12745(c3507, interfaceC0170);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m12739(C4129 c4129, C5714 c5714, int i, int i2, C3690 c3690, boolean z, boolean z2, boolean z3) {
        int iM11762;
        int iM117622;
        int iM117623;
        int i3;
        int iM11859;
        C4128 c4128;
        if (z3) {
            return false;
        }
        if (i == 0) {
            if (!c4129.mo9343()) {
                return false;
            }
        } else if (!c4129.mo9344()) {
            return false;
        }
        boolean zM11998 = c4129.m11998();
        C4128 c4128M10118 = c3690.m10118();
        C4128 c4128M10122 = c3690.m10122();
        C4128 c4128M10120 = c3690.m10120();
        C4128 c4128M10124 = c3690.m10124();
        C4128 c4128M10121 = c3690.m10121();
        C4125 c4125 = c4128M10118.f8394[i2];
        int i4 = i2 + 1;
        C4125 c41252 = c4128M10122.f8394[i4];
        C4125 c41253 = c4125.f8275;
        if (c41253 == null || c41252.f8275 == null || !c41253.m11771() || !c41252.f8275.m11771() || c4128M10120 == null || c4128M10124 == null || (iM117623 = (iM117622 = c41252.f8275.m11762() - c4128M10124.f8394[i4].m11763()) - (iM11762 = c4125.f8275.m11762() + c4128M10120.f8394[i2].m11763())) <= 0) {
            return false;
        }
        C3526.C0169 c0169 = new C3526.C0169();
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        int iM11763 = 0;
        C4128 c41282 = c4128M10118;
        while (true) {
            C4128 c41283 = null;
            if (z4) {
                C4128 c41284 = c4128M10118;
                if (i5 == 0 || i5 != i6 || iM117623 < iM11763) {
                    return false;
                }
                int i7 = iM117623 - iM11763;
                if (!z) {
                    if (z2 && i5 > 2) {
                        i3 = 1;
                        i7 = (i7 / i5) - 1;
                    }
                    if (i5 != i3) {
                        int iM11860 = (int) (iM11762 + 0.5f + (i7 * (i == 0 ? c4128M10121.m11860() : c4128M10121.m11885())));
                        if (i == 0) {
                            c4128M10120.m11927(iM11860, c4128M10120.m11891() + iM11860);
                        } else {
                            c4128M10120.m11930(iM11860, c4128M10120.m11859() + iM11860);
                        }
                        m1351(c4128M10120, c4129.m11990(), zM11998);
                        return true;
                    }
                    if (z) {
                        int iM117632 = iM11762 + i7;
                        C4128 c41285 = c41284;
                        boolean z5 = false;
                        while (!z5) {
                            C4125 c41254 = c41285.f8394[i2];
                            if (c41285.m11890() != 8) {
                                int iM117633 = iM117632 + c41285.f8394[i2].m11763();
                                if (i == 0) {
                                    c41285.m11927(iM117633, c41285.m11891() + iM117633);
                                    m1351(c41285, c4129.m11990(), zM11998);
                                    iM11859 = c41285.m11891();
                                } else {
                                    c41285.m11930(iM117633, c41285.m11859() + iM117633);
                                    m12745(c41285, c4129.m11990());
                                    iM11859 = c41285.m11859();
                                }
                                iM117632 = iM117633 + iM11859 + c41285.f8394[i4].m11763() + i7;
                            } else if (i == 0) {
                                c41285.m11927(iM117632, iM117632);
                                m1351(c41285, c4129.m11990(), zM11998);
                            } else {
                                c41285.m11930(iM117632, iM117632);
                                m12745(c41285, c4129.m11990());
                            }
                            c41285.mo9340(c5714, false);
                            C4125 c41255 = c41285.f8394[i4].f8275;
                            if (c41255 != null) {
                                c4128 = c41255.f8273;
                                C4125 c41256 = c4128.f8394[i2].f8275;
                                if (c41256 == null || c41256.f8273 != c41285) {
                                    c4128 = null;
                                }
                            }
                            if (c4128 != null) {
                                c41285 = c4128;
                            } else {
                                z5 = true;
                            }
                        }
                    } else if (z2) {
                        if (i5 != 2) {
                            return false;
                        }
                        if (i == 0) {
                            c4128M10120.m11927(iM11762, c4128M10120.m11891() + iM11762);
                            c4128M10124.m11927(iM117622 - c4128M10124.m11891(), iM117622);
                            m1351(c4128M10120, c4129.m11990(), zM11998);
                            m1351(c4128M10124, c4129.m11990(), zM11998);
                            return true;
                        }
                        c4128M10120.m11930(iM11762, c4128M10120.m11859() + iM11762);
                        c4128M10124.m11930(iM117622 - c4128M10124.m11859(), iM117622);
                        m12745(c4128M10120, c4129.m11990());
                        m12745(c4128M10124, c4129.m11990());
                        return true;
                    }
                    return true;
                }
                i7 /= i5 + 1;
                i3 = 1;
                if (i5 != i3) {
                }
            } else {
                C4125 c41257 = c41282.f8394[i2];
                if (!m1350(c41282)) {
                    return false;
                }
                C4128 c41286 = c4128M10118;
                if (c41282.f8397[i] == C4128.EnumC0339.MATCH_CONSTRAINT) {
                    return false;
                }
                if (c41282.m11904()) {
                    C4129.m11972(c41282, c4129.m11990(), c0169, C3526.C0169.f5967);
                }
                iM11763 = iM11763 + c41282.f8394[i2].m11763() + (i == 0 ? c41282.m11891() : c41282.m11859()) + c41282.f8394[i4].m11763();
                i6++;
                if (c41282.m11890() != 8) {
                    i5++;
                }
                C4125 c41258 = c41282.f8394[i4].f8275;
                if (c41258 != null) {
                    C4128 c41287 = c41258.f8273;
                    C4125 c41259 = c41287.f8394[i2].f8275;
                    if (c41259 != null && c41259.f8273 == c41282) {
                        c41283 = c41287;
                    }
                }
                if (c41283 != null) {
                    c41282 = c41283;
                } else {
                    z4 = true;
                }
                c4128M10118 = c41286;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m12740(C3526.InterfaceC0170 interfaceC0170, C4128 c4128, boolean z) {
        float fM11860 = c4128.m11860();
        int iM11762 = c4128.f8386.f8275.m11762();
        int iM117622 = c4128.f8388.f8275.m11762();
        int iM11763 = c4128.f8386.m11763() + iM11762;
        int iM117632 = iM117622 - c4128.f8388.m11763();
        if (iM11762 == iM117622) {
            fM11860 = 0.5f;
        } else {
            iM11762 = iM11763;
            iM117622 = iM117632;
        }
        int iM11891 = c4128.m11891();
        int i = (iM117622 - iM11762) - iM11891;
        if (iM11762 > iM117622) {
            i = (iM11762 - iM117622) - iM11891;
        }
        int i2 = ((int) ((fM11860 * i) + 0.5f)) + iM11762;
        int i3 = i2 + iM11891;
        if (iM11762 > iM117622) {
            i3 = i2 - iM11891;
        }
        c4128.m11927(i2, i3);
        m1351(c4128, interfaceC0170, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m12741(C4128 c4128, C3526.InterfaceC0170 interfaceC0170, C4128 c41282, boolean z) {
        float fM11860 = c41282.m11860();
        int iM11762 = c41282.f8386.f8275.m11762() + c41282.f8386.m11763();
        int iM117622 = c41282.f8388.f8275.m11762() - c41282.f8388.m11763();
        if (iM117622 >= iM11762) {
            int iM11891 = c41282.m11891();
            if (c41282.m11890() != 8) {
                int i = c41282.f8366;
                if (i == 2) {
                    iM11891 = (int) (c41282.m11860() * 0.5f * (c4128 instanceof C4129 ? c4128.m11891() : c4128.m11876().m11891()));
                } else if (i == 0) {
                    iM11891 = iM117622 - iM11762;
                }
                iM11891 = Math.max(c41282.f8369, iM11891);
                int i2 = c41282.f8370;
                if (i2 > 0) {
                    iM11891 = Math.min(i2, iM11891);
                }
            }
            int i3 = iM11762 + ((int) ((fM11860 * ((iM117622 - iM11762) - iM11891)) + 0.5f));
            c41282.m11927(i3, iM11891 + i3);
            m1351(c41282, interfaceC0170, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m12742(C3526.InterfaceC0170 interfaceC0170, C4128 c4128) {
        float fM11885 = c4128.m11885();
        int iM11762 = c4128.f8387.f8275.m11762();
        int iM117622 = c4128.f8389.f8275.m11762();
        int iM11763 = c4128.f8387.m11763() + iM11762;
        int iM117632 = iM117622 - c4128.f8389.m11763();
        if (iM11762 == iM117622) {
            fM11885 = 0.5f;
        } else {
            iM11762 = iM11763;
            iM117622 = iM117632;
        }
        int iM11859 = c4128.m11859();
        int i = (iM117622 - iM11762) - iM11859;
        if (iM11762 > iM117622) {
            i = (iM11762 - iM117622) - iM11859;
        }
        int i2 = (int) ((fM11885 * i) + 0.5f);
        int i3 = iM11762 + i2;
        int i4 = i3 + iM11859;
        if (iM11762 > iM117622) {
            i3 = iM11762 - i2;
            i4 = i3 - iM11859;
        }
        c4128.m11930(i3, i4);
        m12745(c4128, interfaceC0170);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m12743(C4128 c4128, C3526.InterfaceC0170 interfaceC0170, C4128 c41282) {
        float fM11885 = c41282.m11885();
        int iM11762 = c41282.f8387.f8275.m11762() + c41282.f8387.m11763();
        int iM117622 = c41282.f8389.f8275.m11762() - c41282.f8389.m11763();
        if (iM117622 >= iM11762) {
            int iM11859 = c41282.m11859();
            if (c41282.m11890() != 8) {
                int i = c41282.f8367;
                if (i == 2) {
                    iM11859 = (int) (fM11885 * 0.5f * (c4128 instanceof C4129 ? c4128.m11859() : c4128.m11876().m11859()));
                } else if (i == 0) {
                    iM11859 = iM117622 - iM11762;
                }
                iM11859 = Math.max(c41282.f8372, iM11859);
                int i2 = c41282.f8373;
                if (i2 > 0) {
                    iM11859 = Math.min(i2, iM11859);
                }
            }
            int i3 = iM11762 + ((int) ((fM11885 * ((iM117622 - iM11762) - iM11859)) + 0.5f));
            c41282.m11930(i3, iM11859 + i3);
            m12745(c41282, interfaceC0170);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m12744(C4129 c4129, C3526.InterfaceC0170 interfaceC0170) {
        C4128.EnumC0339 enumC0339M11863 = c4129.m11863();
        C4128.EnumC0339 enumC0339M11888 = c4129.m11888();
        c4129.m11915();
        ArrayList<C4128> arrayListM28192 = c4129.m28192();
        int size = arrayListM28192.size();
        for (int i = 0; i < size; i++) {
            arrayListM28192.get(i).m11915();
        }
        boolean zM11998 = c4129.m11998();
        if (enumC0339M11863 == C4128.EnumC0339.FIXED) {
            c4129.m11927(0, c4129.m11891());
        } else {
            c4129.m11928(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C4128 c4128 = arrayListM28192.get(i2);
            if (c4128 instanceof C5226) {
                C5226 c5226 = (C5226) c4128;
                if (c5226.m16003() == 1) {
                    if (c5226.m16004() != -1) {
                        c5226.m16012(c5226.m16004());
                    } else if (c5226.m16006() != -1 && c4129.mo9343()) {
                        c5226.m16012(c4129.m11891() - c5226.m16006());
                    } else if (c4129.mo9343()) {
                        c5226.m16012((int) ((c5226.m16007() * c4129.m11891()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c4128 instanceof C3507) && ((C3507) c4128).m9349() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C4128 c41282 = arrayListM28192.get(i3);
                if (c41282 instanceof C5226) {
                    C5226 c52262 = (C5226) c41282;
                    if (c52262.m16003() == 1) {
                        m1351(c52262, interfaceC0170, zM11998);
                    }
                }
            }
        }
        m1351(c4129, interfaceC0170, zM11998);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C4128 c41283 = arrayListM28192.get(i4);
                if (c41283 instanceof C3507) {
                    C3507 c3507 = (C3507) c41283;
                    if (c3507.m9349() == 0) {
                        m12738(c3507, interfaceC0170, 0, zM11998);
                    }
                }
            }
        }
        if (enumC0339M11888 == C4128.EnumC0339.FIXED) {
            c4129.m11930(0, c4129.m11859());
        } else {
            c4129.m11929(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C4128 c41284 = arrayListM28192.get(i5);
            if (c41284 instanceof C5226) {
                C5226 c52263 = (C5226) c41284;
                if (c52263.m16003() == 0) {
                    if (c52263.m16004() != -1) {
                        c52263.m16012(c52263.m16004());
                    } else if (c52263.m16006() != -1 && c4129.mo9344()) {
                        c52263.m16012(c4129.m11859() - c52263.m16006());
                    } else if (c4129.mo9344()) {
                        c52263.m16012((int) ((c52263.m16007() * c4129.m11859()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c41284 instanceof C3507) && ((C3507) c41284).m9349() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C4128 c41285 = arrayListM28192.get(i6);
                if (c41285 instanceof C5226) {
                    C5226 c52264 = (C5226) c41285;
                    if (c52264.m16003() == 0) {
                        m12745(c52264, interfaceC0170);
                    }
                }
            }
        }
        m12745(c4129, interfaceC0170);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C4128 c41286 = arrayListM28192.get(i7);
                if (c41286 instanceof C3507) {
                    C3507 c35072 = (C3507) c41286;
                    if (c35072.m9349() == 1) {
                        m12738(c35072, interfaceC0170, 1, zM11998);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C4128 c41287 = arrayListM28192.get(i8);
            if (c41287.m11904() && m1350(c41287)) {
                C4129.m11972(c41287, interfaceC0170, f9075, C3526.C0169.f5967);
                m1351(c41287, interfaceC0170, zM11998);
                m12745(c41287, interfaceC0170);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m12745(C4128 c4128, C3526.InterfaceC0170 interfaceC0170) {
        C4125 c4125;
        C4125 c41252;
        C4125 c41253;
        C4125 c41254;
        C4125 c41255;
        if (!(c4128 instanceof C4129) && c4128.m11904() && m1350(c4128)) {
            C4129.m11972(c4128, interfaceC0170, new C3526.C0169(), C3526.C0169.f5967);
        }
        C4125 c4125Mo11847 = c4128.mo11847(C4125.EnumC0335.TOP);
        C4125 c4125Mo118472 = c4128.mo11847(C4125.EnumC0335.BOTTOM);
        int iM11762 = c4125Mo11847.m11762();
        int iM117622 = c4125Mo118472.m11762();
        if (c4125Mo11847.m11761() != null && c4125Mo11847.m11771()) {
            for (C4125 c41256 : c4125Mo11847.m11761()) {
                C4128 c41282 = c41256.f8273;
                boolean zM1350 = m1350(c41282);
                if (c41282.m11904() && zM1350) {
                    C4129.m11972(c41282, interfaceC0170, new C3526.C0169(), C3526.C0169.f5967);
                }
                C4128.EnumC0339 enumC0339M11888 = c41282.m11888();
                C4128.EnumC0339 enumC0339 = C4128.EnumC0339.MATCH_CONSTRAINT;
                if (enumC0339M11888 != enumC0339 || zM1350) {
                    if (!c41282.m11904()) {
                        C4125 c41257 = c41282.f8387;
                        if (c41256 == c41257 && c41282.f8389.f8275 == null) {
                            int iM11763 = c41257.m11763() + iM11762;
                            c41282.m11930(iM11763, c41282.m11859() + iM11763);
                            m12745(c41282, interfaceC0170);
                        } else {
                            C4125 c41258 = c41282.f8389;
                            if (c41256 == c41258 && c41258.f8275 == null) {
                                int iM117632 = iM11762 - c41258.m11763();
                                c41282.m11930(iM117632 - c41282.m11859(), iM117632);
                                m12745(c41282, interfaceC0170);
                            } else if (c41256 == c41257 && (c41253 = c41258.f8275) != null && c41253.m11771()) {
                                m12742(interfaceC0170, c41282);
                            }
                        }
                    }
                } else if (c41282.m11888() == enumC0339 && c41282.f8373 >= 0 && c41282.f8372 >= 0 && (c41282.m11890() == 8 || (c41282.f8367 == 0 && c41282.m11856() == 0.0f))) {
                    if (!c41282.m11902() && !c41282.m11903() && ((c41256 == c41282.f8387 && (c41255 = c41282.f8389.f8275) != null && c41255.m11771()) || (c41256 == c41282.f8389 && (c41254 = c41282.f8387.f8275) != null && c41254.m11771()))) {
                        if (!c41282.m11902()) {
                            m12743(c4128, interfaceC0170, c41282);
                        }
                    }
                }
            }
        }
        if (c4128 instanceof C5226) {
            return;
        }
        if (c4125Mo118472.m11761() != null && c4125Mo118472.m11771()) {
            Iterator<C4125> it = c4125Mo118472.m11761().iterator();
            while (it.hasNext()) {
                C4125 next = it.next();
                C4128 c41283 = next.f8273;
                boolean zM13502 = m1350(c41283);
                if (c41283.m11904() && zM13502) {
                    C4129.m11972(c41283, interfaceC0170, new C3526.C0169(), C3526.C0169.f5967);
                }
                boolean z = (next == c41283.f8387 && (c41252 = c41283.f8389.f8275) != null && c41252.m11771()) || (next == c41283.f8389 && (c4125 = c41283.f8387.f8275) != null && c4125.m11771());
                C4128.EnumC0339 enumC0339M118882 = c41283.m11888();
                C4128.EnumC0339 enumC03392 = C4128.EnumC0339.MATCH_CONSTRAINT;
                if (enumC0339M118882 != enumC03392 || zM13502) {
                    if (!c41283.m11904()) {
                        C4125 c41259 = c41283.f8387;
                        if (next == c41259 && c41283.f8389.f8275 == null) {
                            int iM117633 = c41259.m11763() + iM117622;
                            c41283.m11930(iM117633, c41283.m11859() + iM117633);
                            m12745(c41283, interfaceC0170);
                        } else {
                            C4125 c412510 = c41283.f8389;
                            if (next == c412510 && c41259.f8275 == null) {
                                int iM117634 = iM117622 - c412510.m11763();
                                c41283.m11930(iM117634 - c41283.m11859(), iM117634);
                                m12745(c41283, interfaceC0170);
                            } else if (z && !c41283.m11902()) {
                                m12742(interfaceC0170, c41283);
                            }
                        }
                    }
                } else if (c41283.m11888() == enumC03392 && c41283.f8373 >= 0 && c41283.f8372 >= 0 && (c41283.m11890() == 8 || (c41283.f8367 == 0 && c41283.m11856() == 0.0f))) {
                    if (!c41283.m11902() && !c41283.m11903() && z && !c41283.m11902()) {
                        m12743(c4128, interfaceC0170, c41283);
                    }
                }
            }
        }
        C4125 c4125Mo118473 = c4128.mo11847(C4125.EnumC0335.BASELINE);
        if (c4125Mo118473.m11761() == null || !c4125Mo118473.m11771()) {
            return;
        }
        int iM117623 = c4125Mo118473.m11762();
        for (C4125 c412511 : c4125Mo118473.m11761()) {
            C4128 c41284 = c412511.f8273;
            boolean zM13503 = m1350(c41284);
            if (c41284.m11904() && zM13503) {
                C4129.m11972(c41284, interfaceC0170, new C3526.C0169(), C3526.C0169.f5967);
            }
            if (c41284.m11888() != C4128.EnumC0339.MATCH_CONSTRAINT || zM13503) {
                if (!c41284.m11904() && c412511 == c41284.f8390) {
                    c41284.m11925(iM117623);
                    m12745(c41284, interfaceC0170);
                }
            }
        }
    }
}
