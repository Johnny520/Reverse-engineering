package Yue;

import Yue.C4125;
import Yue.C4128;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3526 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean f5958 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f5959 = 30;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f5960 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f5961 = 1073741824;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f5962 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f5963 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f5964 = -2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f5965 = -3;

    /* JADX INFO: renamed from: ۥ */
    public final ArrayList<C4128> f361 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public C0169 f362 = new C0169();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4129 f5966;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦۤ$ۥ */
    public static class C0169 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static int f5967 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static int f5968 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static int f5969 = 2;

        /* JADX INFO: renamed from: ۥ */
        public C4128.EnumC0339 f363;

        /* JADX INFO: renamed from: ۥ۟ */
        public C4128.EnumC0339 f364;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f5970;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f5971;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f5972;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f5973;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f5974;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f5975;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f5976;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f5977;
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦۤ$ۥ۟ */
    public interface InterfaceC0170 {
        /* JADX INFO: renamed from: ۥ */
        void mo593();

        /* JADX INFO: renamed from: ۥ۟ */
        void mo594(C4128 c4128, C0169 c0169);
    }

    public C3526(C4129 c4129) {
        this.f5966 = c4129;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m591(InterfaceC0170 interfaceC0170, C4128 c4128, int i) {
        this.f362.f363 = c4128.m11863();
        this.f362.f364 = c4128.m11888();
        this.f362.f5970 = c4128.m11891();
        this.f362.f5971 = c4128.m11859();
        C0169 c0169 = this.f362;
        c0169.f5976 = false;
        c0169.f5977 = i;
        C4128.EnumC0339 enumC0339 = c0169.f363;
        C4128.EnumC0339 enumC03392 = C4128.EnumC0339.MATCH_CONSTRAINT;
        boolean z = enumC0339 == enumC03392;
        boolean z2 = c0169.f364 == enumC03392;
        boolean z3 = z && c4128.f8401 > 0.0f;
        boolean z4 = z2 && c4128.f8401 > 0.0f;
        if (z3 && c4128.f8368[0] == 4) {
            c0169.f363 = C4128.EnumC0339.FIXED;
        }
        if (z4 && c4128.f8368[1] == 4) {
            c0169.f364 = C4128.EnumC0339.FIXED;
        }
        interfaceC0170.mo594(c4128, c0169);
        c4128.m11965(this.f362.f5972);
        c4128.m11935(this.f362.f5973);
        c4128.m11934(this.f362.f5975);
        c4128.m11917(this.f362.f5974);
        C0169 c01692 = this.f362;
        c01692.f5977 = C0169.f5967;
        return c01692.f5976;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0098 A[PHI: r10
  0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m592(C4129 c4129) {
        C5316 c5316;
        C8184 c8184;
        int size = c4129.f25257.size();
        boolean zM12001 = c4129.m12001(64);
        InterfaceC0170 interfaceC0170M11990 = c4129.m11990();
        for (int i = 0; i < size; i++) {
            C4128 c4128 = c4129.f25257.get(i);
            if (!(c4128 instanceof C5226) && !(c4128 instanceof C3507) && !c4128.m11903() && (!zM12001 || (c5316 = c4128.f8355) == null || (c8184 = c4128.f8356) == null || !c5316.f25272.f8958 || !c8184.f25272.f8958)) {
                C4128.EnumC0339 enumC0339M11855 = c4128.m11855(0);
                boolean z = true;
                C4128.EnumC0339 enumC0339M118552 = c4128.m11855(1);
                C4128.EnumC0339 enumC0339 = C4128.EnumC0339.MATCH_CONSTRAINT;
                boolean z2 = enumC0339M11855 == enumC0339 && c4128.f8366 != 1 && enumC0339M118552 == enumC0339 && c4128.f8367 != 1;
                if (z2 || !c4129.m12001(1) || (c4128 instanceof C8387)) {
                    z = z2;
                    if (z) {
                        m591(interfaceC0170M11990, c4128, C0169.f5967);
                        C6226 c6226 = c4129.f8455;
                        if (c6226 != null) {
                            c6226.f15343++;
                        }
                    }
                } else {
                    if (enumC0339M11855 == enumC0339 && c4128.f8366 == 0 && enumC0339M118552 != enumC0339 && !c4128.m11900()) {
                        z2 = true;
                    }
                    if (enumC0339M118552 == enumC0339 && c4128.f8367 == 0 && enumC0339M11855 != enumC0339 && !c4128.m11900()) {
                        z2 = true;
                    }
                    if ((enumC0339M11855 != enumC0339 && enumC0339M118552 != enumC0339) || c4128.f8401 <= 0.0f) {
                    }
                    if (z) {
                    }
                }
            }
        }
        interfaceC0170M11990.mo593();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m9451(C4129 c4129, String str, int i, int i2) {
        int iM11872 = c4129.m11872();
        int iM11871 = c4129.m11871();
        c4129.m11952(0);
        c4129.m11951(0);
        c4129.m11965(i);
        c4129.m11935(i2);
        c4129.m11952(iM11872);
        c4129.m11951(iM11871);
        this.f5966.mo11973();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long m9452(C4129 c4129, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zM11987;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        InterfaceC0170 interfaceC0170;
        int i13;
        int i14;
        int i15;
        boolean z4;
        C6226 c6226;
        InterfaceC0170 interfaceC0170M11990 = c4129.m11990();
        int size = c4129.f25257.size();
        int iM11891 = c4129.m11891();
        int iM11859 = c4129.m11859();
        boolean zM3034 = C6579.m3034(i, 128);
        boolean z5 = zM3034 || C6579.m3034(i, 64);
        if (z5) {
            for (int i16 = 0; i16 < size; i16++) {
                C4128 c4128 = c4129.f25257.get(i16);
                C4128.EnumC0339 enumC0339M11863 = c4128.m11863();
                C4128.EnumC0339 enumC0339 = C4128.EnumC0339.MATCH_CONSTRAINT;
                boolean z6 = (enumC0339M11863 == enumC0339) && (c4128.m11888() == enumC0339) && c4128.m11856() > 0.0f;
                if ((c4128.m11900() && z6) || ((c4128.m11902() && z6) || (c4128 instanceof C8387) || c4128.m11900() || c4128.m11902())) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5 && (c6226 = C5714.f14108) != null) {
            c6226.f15345++;
        }
        boolean z7 = z5 & ((i4 == 1073741824 && i6 == 1073741824) || zM3034);
        int i17 = 2;
        if (z7) {
            int iMin = Math.min(c4129.m11870(), i5);
            int iMin2 = Math.min(c4129.m11869(), i7);
            if (i4 == 1073741824 && c4129.m11891() != iMin) {
                c4129.m11965(iMin);
                c4129.m11995();
            }
            if (i6 == 1073741824 && c4129.m11859() != iMin2) {
                c4129.m11935(iMin2);
                c4129.m11995();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zM11987 = c4129.m11985(zM3034);
                i10 = 2;
            } else {
                boolean zM11986 = c4129.m11986(zM3034);
                if (i4 == 1073741824) {
                    zM11986 &= c4129.m11987(zM3034, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zM11987 = c4129.m11987(zM3034, 1) & zM11986;
                    i10++;
                } else {
                    zM11987 = zM11986;
                }
            }
            if (zM11987) {
                c4129.mo11970(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zM11987 = false;
            i10 = 0;
        }
        if (zM11987 && i10 == 2) {
            return 0L;
        }
        int iM11991 = c4129.m11991();
        if (size > 0) {
            m592(c4129);
        }
        m9453(c4129);
        int size2 = this.f361.size();
        if (size > 0) {
            m9451(c4129, "First pass", iM11891, iM11859);
        }
        if (size2 > 0) {
            C4128.EnumC0339 enumC0339M118632 = c4129.m11863();
            C4128.EnumC0339 enumC03392 = C4128.EnumC0339.WRAP_CONTENT;
            boolean z8 = enumC0339M118632 == enumC03392;
            boolean z9 = c4129.m11888() == enumC03392;
            int iMax = Math.max(c4129.m11891(), this.f5966.m11872());
            int iMax2 = Math.max(c4129.m11859(), this.f5966.m11871());
            int i18 = 0;
            boolean zM27970 = false;
            while (i18 < size2) {
                C4128 c41282 = this.f361.get(i18);
                if (c41282 instanceof C8387) {
                    int iM118912 = c41282.m11891();
                    i13 = iM11991;
                    int iM118592 = c41282.m11859();
                    i14 = iM11891;
                    boolean zM591 = m591(interfaceC0170M11990, c41282, C0169.f5968) | zM27970;
                    C6226 c62262 = c4129.f8455;
                    i15 = iM11859;
                    if (c62262 != null) {
                        c62262.f15344++;
                    }
                    int iM118913 = c41282.m11891();
                    int iM118593 = c41282.m11859();
                    if (iM118913 != iM118912) {
                        c41282.m11965(iM118913);
                        if (z8 && c41282.m11879() > iMax) {
                            iMax = Math.max(iMax, c41282.m11879() + c41282.mo11847(C4125.EnumC0335.RIGHT).m11763());
                        }
                        z4 = true;
                    } else {
                        z4 = zM591;
                    }
                    if (iM118593 != iM118592) {
                        c41282.m11935(iM118593);
                        if (z9 && c41282.m11851() > iMax2) {
                            iMax2 = Math.max(iMax2, c41282.m11851() + c41282.mo11847(C4125.EnumC0335.BOTTOM).m11763());
                        }
                        z4 = true;
                    }
                    zM27970 = z4 | ((C8387) c41282).m27970();
                } else {
                    i13 = iM11991;
                    i14 = iM11891;
                    i15 = iM11859;
                }
                i18++;
                iM11991 = i13;
                iM11891 = i14;
                iM11859 = i15;
                i17 = 2;
            }
            int i19 = iM11991;
            int i20 = iM11891;
            int i21 = iM11859;
            int i22 = i17;
            int i23 = 0;
            while (i23 < i22) {
                int i24 = 0;
                while (i24 < size2) {
                    C4128 c41283 = this.f361.get(i24);
                    if (((c41283 instanceof InterfaceC5278) && !(c41283 instanceof C8387)) || (c41283 instanceof C5226) || c41283.m11890() == 8 || ((z7 && c41283.f8355.f25272.f8958 && c41283.f8356.f25272.f8958) || (c41283 instanceof C8387))) {
                        z3 = z7;
                        i12 = size2;
                        interfaceC0170 = interfaceC0170M11990;
                    } else {
                        int iM118914 = c41283.m11891();
                        int iM118594 = c41283.m11859();
                        int iM11849 = c41283.m11849();
                        int i25 = C0169.f5968;
                        z3 = z7;
                        if (i23 == 1) {
                            i25 = C0169.f5969;
                        }
                        boolean zM5912 = m591(interfaceC0170M11990, c41283, i25) | zM27970;
                        C6226 c62263 = c4129.f8455;
                        i12 = size2;
                        interfaceC0170 = interfaceC0170M11990;
                        if (c62263 != null) {
                            c62263.f15344++;
                        }
                        int iM118915 = c41283.m11891();
                        int iM118595 = c41283.m11859();
                        if (iM118915 != iM118914) {
                            c41283.m11965(iM118915);
                            if (z8 && c41283.m11879() > iMax) {
                                iMax = Math.max(iMax, c41283.m11879() + c41283.mo11847(C4125.EnumC0335.RIGHT).m11763());
                            }
                            zM5912 = true;
                        }
                        if (iM118595 != iM118594) {
                            c41283.m11935(iM118595);
                            if (z9 && c41283.m11851() > iMax2) {
                                iMax2 = Math.max(iMax2, c41283.m11851() + c41283.mo11847(C4125.EnumC0335.BOTTOM).m11763());
                            }
                            zM5912 = true;
                        }
                        zM27970 = (!c41283.m11894() || iM11849 == c41283.m11849()) ? zM5912 : true;
                    }
                    i24++;
                    size2 = i12;
                    interfaceC0170M11990 = interfaceC0170;
                    z7 = z3;
                }
                boolean z10 = z7;
                int i26 = size2;
                InterfaceC0170 interfaceC01702 = interfaceC0170M11990;
                if (!zM27970) {
                    break;
                }
                m9451(c4129, "intermediate pass", i20, i21);
                i23++;
                interfaceC0170M11990 = interfaceC01702;
                z7 = z10;
                i22 = 2;
                zM27970 = false;
                size2 = i26;
            }
            if (zM27970) {
                m9451(c4129, "2nd pass", i20, i21);
                if (c4129.m11891() < iMax) {
                    c4129.m11965(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (c4129.m11859() < iMax2) {
                    c4129.m11935(iMax2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    m9451(c4129, "3rd pass", i20, i21);
                }
            }
            i11 = i19;
        } else {
            i11 = iM11991;
        }
        c4129.m12004(i11);
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m9453(C4129 c4129) {
        this.f361.clear();
        int size = c4129.f25257.size();
        for (int i = 0; i < size; i++) {
            C4128 c4128 = c4129.f25257.get(i);
            C4128.EnumC0339 enumC0339M11863 = c4128.m11863();
            C4128.EnumC0339 enumC0339 = C4128.EnumC0339.MATCH_CONSTRAINT;
            if (enumC0339M11863 == enumC0339 || c4128.m11888() == enumC0339) {
                this.f361.add(c4128);
            }
        }
        c4129.m11995();
    }
}
