package Yue;

import Yue.AbstractC8432;
import Yue.C4125;
import Yue.C4128;
import Yue.C4371;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5316 extends AbstractC8432 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int[] f12851 = new int[2];

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۧ$ۥ */
    public static /* synthetic */ class C0711 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1435;

        static {
            int[] iArr = new int[AbstractC8432.EnumC1530.values().length];
            f1435 = iArr;
            try {
                iArr[AbstractC8432.EnumC1530.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1435[AbstractC8432.EnumC1530.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1435[AbstractC8432.EnumC1530.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5316(C4128 c4128) {
        super(c4128);
        this.f25275.f8953 = C4371.EnumC0392.LEFT;
        this.f25276.f8953 = C4371.EnumC0392.RIGHT;
        this.f25273 = 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f3497.m11854();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    @Override // Yue.AbstractC8432, Yue.InterfaceC4369
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo767(InterfaceC4369 interfaceC4369) {
        float f;
        float fM11856;
        float fM118562;
        int i;
        int i2 = C0711.f1435[this.f25277.ordinal()];
        if (i2 == 1) {
            m28221(interfaceC4369);
        } else if (i2 == 2) {
            m28220(interfaceC4369);
        } else if (i2 == 3) {
            C4128 c4128 = this.f3497;
            m28219(interfaceC4369, c4128.f8386, c4128.f8388, 0);
            return;
        }
        if (!this.f25272.f8958 && this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT) {
            C4128 c41282 = this.f3497;
            int i3 = c41282.f8366;
            if (i3 == 2) {
                C4128 c4128M11876 = c41282.m11876();
                if (c4128M11876 != null) {
                    if (c4128M11876.f8355.f25272.f8958) {
                        this.f25272.mo12660((int) ((r0.f8955 * this.f3497.f8371) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c41282.f8367;
                if (i4 == 0 || i4 == 3) {
                    C8184 c8184 = c41282.f8356;
                    C4371 c4371 = c8184.f25275;
                    C4371 c43712 = c8184.f25276;
                    boolean z = c41282.f8386.f8275 != null;
                    boolean z2 = c41282.f8387.f8275 != null;
                    boolean z3 = c41282.f8388.f8275 != null;
                    boolean z4 = c41282.f8389.f8275 != null;
                    int iM11857 = c41282.m11857();
                    if (z && z2 && z3 && z4) {
                        float fM118563 = this.f3497.m11856();
                        if (c4371.f8958 && c43712.f8958) {
                            C4371 c43713 = this.f25275;
                            if (c43713.f8951 && this.f25276.f8951) {
                                m16316(f12851, c43713.f8960.get(0).f8955 + this.f25275.f8954, this.f25276.f8960.get(0).f8955 - this.f25276.f8954, c4371.f8955 + c4371.f8954, c43712.f8955 - c43712.f8954, fM118563, iM11857);
                                this.f25272.mo12660(f12851[0]);
                                this.f3497.f8356.f25272.mo12660(f12851[1]);
                                return;
                            }
                            return;
                        }
                        C4371 c43714 = this.f25275;
                        if (c43714.f8958) {
                            C4371 c43715 = this.f25276;
                            if (c43715.f8958) {
                                if (!c4371.f8951 || !c43712.f8951) {
                                    return;
                                }
                                m16316(f12851, c43714.f8955 + c43714.f8954, c43715.f8955 - c43715.f8954, c4371.f8960.get(0).f8955 + c4371.f8954, c43712.f8960.get(0).f8955 - c43712.f8954, fM118563, iM11857);
                                this.f25272.mo12660(f12851[0]);
                                this.f3497.f8356.f25272.mo12660(f12851[1]);
                            }
                        }
                        C4371 c43716 = this.f25275;
                        if (!c43716.f8951 || !this.f25276.f8951 || !c4371.f8951 || !c43712.f8951) {
                            return;
                        }
                        m16316(f12851, c43716.f8960.get(0).f8955 + this.f25275.f8954, this.f25276.f8960.get(0).f8955 - this.f25276.f8954, c4371.f8960.get(0).f8955 + c4371.f8954, c43712.f8960.get(0).f8955 - c43712.f8954, fM118563, iM11857);
                        this.f25272.mo12660(f12851[0]);
                        this.f3497.f8356.f25272.mo12660(f12851[1]);
                    } else if (z && z3) {
                        if (!this.f25275.f8951 || !this.f25276.f8951) {
                            return;
                        }
                        float fM118564 = this.f3497.m11856();
                        int i5 = this.f25275.f8960.get(0).f8955 + this.f25275.f8954;
                        int i6 = this.f25276.f8960.get(0).f8955 - this.f25276.f8954;
                        if (iM11857 == -1 || iM11857 == 0) {
                            int iM28212 = m28212(i6 - i5, 0);
                            int i7 = (int) ((iM28212 * fM118564) + 0.5f);
                            int iM282122 = m28212(i7, 1);
                            if (i7 != iM282122) {
                                iM28212 = (int) ((iM282122 / fM118564) + 0.5f);
                            }
                            this.f25272.mo12660(iM28212);
                            this.f3497.f8356.f25272.mo12660(iM282122);
                        } else if (iM11857 == 1) {
                            int iM282123 = m28212(i6 - i5, 0);
                            int i8 = (int) ((iM282123 / fM118564) + 0.5f);
                            int iM282124 = m28212(i8, 1);
                            if (i8 != iM282124) {
                                iM282123 = (int) ((iM282124 * fM118564) + 0.5f);
                            }
                            this.f25272.mo12660(iM282123);
                            this.f3497.f8356.f25272.mo12660(iM282124);
                        }
                    } else if (z2 && z4) {
                        if (!c4371.f8951 || !c43712.f8951) {
                            return;
                        }
                        float fM118565 = this.f3497.m11856();
                        int i9 = c4371.f8960.get(0).f8955 + c4371.f8954;
                        int i10 = c43712.f8960.get(0).f8955 - c43712.f8954;
                        if (iM11857 == -1) {
                            int iM282125 = m28212(i10 - i9, 1);
                            int i11 = (int) ((iM282125 / fM118565) + 0.5f);
                            int iM282126 = m28212(i11, 0);
                            if (i11 != iM282126) {
                                iM282125 = (int) ((iM282126 * fM118565) + 0.5f);
                            }
                            this.f25272.mo12660(iM282126);
                            this.f3497.f8356.f25272.mo12660(iM282125);
                        } else if (iM11857 == 0) {
                            int iM282127 = m28212(i10 - i9, 1);
                            int i12 = (int) ((iM282127 * fM118565) + 0.5f);
                            int iM282128 = m28212(i12, 0);
                            if (i12 != iM282128) {
                                iM282127 = (int) ((iM282128 / fM118565) + 0.5f);
                            }
                            this.f25272.mo12660(iM282128);
                            this.f3497.f8356.f25272.mo12660(iM282127);
                        } else if (iM11857 == 1) {
                        }
                    }
                } else {
                    int iM118572 = c41282.m11857();
                    if (iM118572 == -1) {
                        C4128 c41283 = this.f3497;
                        f = c41283.f8356.f25272.f8955;
                        fM11856 = c41283.m11856();
                    } else if (iM118572 == 0) {
                        fM118562 = r0.f8356.f25272.f8955 / this.f3497.m11856();
                        i = (int) (fM118562 + 0.5f);
                        this.f25272.mo12660(i);
                    } else if (iM118572 != 1) {
                        i = 0;
                        this.f25272.mo12660(i);
                    } else {
                        C4128 c41284 = this.f3497;
                        f = c41284.f8356.f25272.f8955;
                        fM11856 = c41284.m11856();
                    }
                    fM118562 = f * fM11856;
                    i = (int) (fM118562 + 0.5f);
                    this.f25272.mo12660(i);
                }
            }
        }
        C4371 c43717 = this.f25275;
        if (c43717.f8951) {
            C4371 c43718 = this.f25276;
            if (c43718.f8951) {
                if (c43717.f8958 && c43718.f8958 && this.f25272.f8958) {
                    return;
                }
                if (!this.f25272.f8958 && this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                    C4128 c41285 = this.f3497;
                    if (c41285.f8366 == 0 && !c41285.m11900()) {
                        C4371 c43719 = this.f25275.f8960.get(0);
                        C4371 c437110 = this.f25276.f8960.get(0);
                        int i13 = c43719.f8955;
                        C4371 c437111 = this.f25275;
                        int i14 = i13 + c437111.f8954;
                        int i15 = c437110.f8955 + this.f25276.f8954;
                        c437111.mo12660(i14);
                        this.f25276.mo12660(i15);
                        this.f25272.mo12660(i15 - i14);
                        return;
                    }
                }
                if (!this.f25272.f8958 && this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT && this.f3496 == 1 && this.f25275.f8960.size() > 0 && this.f25276.f8960.size() > 0) {
                    int iMin = Math.min((this.f25276.f8960.get(0).f8955 + this.f25276.f8954) - (this.f25275.f8960.get(0).f8955 + this.f25275.f8954), this.f25272.f9074);
                    C4128 c41286 = this.f3497;
                    int i16 = c41286.f8370;
                    int iMax = Math.max(c41286.f8369, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    this.f25272.mo12660(iMax);
                }
                if (this.f25272.f8958) {
                    C4371 c437112 = this.f25275.f8960.get(0);
                    C4371 c437113 = this.f25276.f8960.get(0);
                    int i17 = c437112.f8955 + this.f25275.f8954;
                    int i18 = c437113.f8955 + this.f25276.f8954;
                    float fM11860 = this.f3497.m11860();
                    if (c437112 == c437113) {
                        i17 = c437112.f8955;
                        i18 = c437113.f8955;
                        fM11860 = 0.5f;
                    }
                    this.f25275.mo12660((int) (i17 + 0.5f + (((i18 - i17) - this.f25272.f8955) * fM11860)));
                    this.f25276.mo12660(this.f25275.f8955 + this.f25272.f8955);
                }
            }
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo10130() {
        C4128 c4128M11876;
        C4128 c4128M118762;
        C4128 c4128 = this.f3497;
        if (c4128.f704) {
            this.f25272.mo12660(c4128.m11891());
        }
        if (this.f25272.f8958) {
            C4128.EnumC0339 enumC0339 = this.f25271;
            C4128.EnumC0339 enumC03392 = C4128.EnumC0339.MATCH_PARENT;
            if (enumC0339 == enumC03392 && (((c4128M11876 = this.f3497.m11876()) != null && c4128M11876.m11863() == C4128.EnumC0339.FIXED) || c4128M11876.m11863() == enumC03392)) {
                m4414(this.f25275, c4128M11876.f8355.f25275, this.f3497.f8386.m11763());
                m4414(this.f25276, c4128M11876.f8355.f25276, -this.f3497.f8388.m11763());
                return;
            }
        } else {
            C4128.EnumC0339 enumC0339M11863 = this.f3497.m11863();
            this.f25271 = enumC0339M11863;
            if (enumC0339M11863 != C4128.EnumC0339.MATCH_CONSTRAINT) {
                C4128.EnumC0339 enumC03393 = C4128.EnumC0339.MATCH_PARENT;
                if (enumC0339M11863 == enumC03393 && (((c4128M118762 = this.f3497.m11876()) != null && c4128M118762.m11863() == C4128.EnumC0339.FIXED) || c4128M118762.m11863() == enumC03393)) {
                    int iM11891 = (c4128M118762.m11891() - this.f3497.f8386.m11763()) - this.f3497.f8388.m11763();
                    m4414(this.f25275, c4128M118762.f8355.f25275, this.f3497.f8386.m11763());
                    m4414(this.f25276, c4128M118762.f8355.f25276, -this.f3497.f8388.m11763());
                    this.f25272.mo12660(iM11891);
                    return;
                }
                if (this.f25271 == C4128.EnumC0339.FIXED) {
                    this.f25272.mo12660(this.f3497.m11891());
                }
            }
        }
        C4401 c4401 = this.f25272;
        if (c4401.f8958) {
            C4128 c41282 = this.f3497;
            if (c41282.f704) {
                C4125[] c4125Arr = c41282.f8394;
                C4125 c4125 = c4125Arr[0];
                C4125 c41252 = c4125.f8275;
                if (c41252 != null && c4125Arr[1].f8275 != null) {
                    if (c41282.m11900()) {
                        this.f25275.f8954 = this.f3497.f8394[0].m11763();
                        this.f25276.f8954 = -this.f3497.f8394[1].m11763();
                        return;
                    }
                    C4371 c4371M28213 = m28213(this.f3497.f8394[0]);
                    if (c4371M28213 != null) {
                        m4414(this.f25275, c4371M28213, this.f3497.f8394[0].m11763());
                    }
                    C4371 c4371M282132 = m28213(this.f3497.f8394[1]);
                    if (c4371M282132 != null) {
                        m4414(this.f25276, c4371M282132, -this.f3497.f8394[1].m11763());
                    }
                    this.f25275.f847 = true;
                    this.f25276.f847 = true;
                    return;
                }
                if (c41252 != null) {
                    C4371 c4371M282133 = m28213(c4125);
                    if (c4371M282133 != null) {
                        m4414(this.f25275, c4371M282133, this.f3497.f8394[0].m11763());
                        m4414(this.f25276, this.f25275, this.f25272.f8955);
                        return;
                    }
                    return;
                }
                C4125 c41253 = c4125Arr[1];
                if (c41253.f8275 != null) {
                    C4371 c4371M282134 = m28213(c41253);
                    if (c4371M282134 != null) {
                        m4414(this.f25276, c4371M282134, -this.f3497.f8394[1].m11763());
                        m4414(this.f25275, this.f25276, -this.f25272.f8955);
                        return;
                    }
                    return;
                }
                if ((c41282 instanceof InterfaceC5278) || c41282.m11876() == null || this.f3497.mo11847(C4125.EnumC0335.CENTER).f8275 != null) {
                    return;
                }
                m4414(this.f25275, this.f3497.m11876().f8355.f25275, this.f3497.m11892());
                m4414(this.f25276, this.f25275, this.f25272.f8955);
                return;
            }
        }
        if (this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT) {
            C4128 c41283 = this.f3497;
            int i = c41283.f8366;
            if (i == 2) {
                C4128 c4128M118763 = c41283.m11876();
                if (c4128M118763 != null) {
                    C4401 c44012 = c4128M118763.f8356.f25272;
                    this.f25272.f8960.add(c44012);
                    c44012.f8959.add(this.f25272);
                    C4401 c44013 = this.f25272;
                    c44013.f847 = true;
                    c44013.f8959.add(this.f25275);
                    this.f25272.f8959.add(this.f25276);
                }
            } else if (i == 3) {
                if (c41283.f8367 == 3) {
                    this.f25275.f846 = this;
                    this.f25276.f846 = this;
                    C8184 c8184 = c41283.f8356;
                    c8184.f25275.f846 = this;
                    c8184.f25276.f846 = this;
                    c4401.f846 = this;
                    if (c41283.m11902()) {
                        this.f25272.f8960.add(this.f3497.f8356.f25272);
                        this.f3497.f8356.f25272.f8959.add(this.f25272);
                        C8184 c81842 = this.f3497.f8356;
                        c81842.f25272.f846 = this;
                        this.f25272.f8960.add(c81842.f25275);
                        this.f25272.f8960.add(this.f3497.f8356.f25276);
                        this.f3497.f8356.f25275.f8959.add(this.f25272);
                        this.f3497.f8356.f25276.f8959.add(this.f25272);
                    } else if (this.f3497.m11900()) {
                        this.f3497.f8356.f25272.f8960.add(this.f25272);
                        this.f25272.f8959.add(this.f3497.f8356.f25272);
                    } else {
                        this.f3497.f8356.f25272.f8960.add(this.f25272);
                    }
                } else {
                    C4401 c44014 = c41283.f8356.f25272;
                    c4401.f8960.add(c44014);
                    c44014.f8959.add(this.f25272);
                    this.f3497.f8356.f25275.f8959.add(this.f25272);
                    this.f3497.f8356.f25276.f8959.add(this.f25272);
                    C4401 c44015 = this.f25272;
                    c44015.f847 = true;
                    c44015.f8959.add(this.f25275);
                    this.f25272.f8959.add(this.f25276);
                    this.f25275.f8960.add(this.f25272);
                    this.f25276.f8960.add(this.f25272);
                }
            }
        }
        C4128 c41284 = this.f3497;
        C4125[] c4125Arr2 = c41284.f8394;
        C4125 c41254 = c4125Arr2[0];
        C4125 c41255 = c41254.f8275;
        if (c41255 != null && c4125Arr2[1].f8275 != null) {
            if (c41284.m11900()) {
                this.f25275.f8954 = this.f3497.f8394[0].m11763();
                this.f25276.f8954 = -this.f3497.f8394[1].m11763();
                return;
            }
            C4371 c4371M282135 = m28213(this.f3497.f8394[0]);
            C4371 c4371M282136 = m28213(this.f3497.f8394[1]);
            c4371M282135.m1330(this);
            c4371M282136.m1330(this);
            this.f25277 = AbstractC8432.EnumC1530.CENTER;
            return;
        }
        if (c41255 != null) {
            C4371 c4371M282137 = m28213(c41254);
            if (c4371M282137 != null) {
                m4414(this.f25275, c4371M282137, this.f3497.f8394[0].m11763());
                m28211(this.f25276, this.f25275, 1, this.f25272);
                return;
            }
            return;
        }
        C4125 c41256 = c4125Arr2[1];
        if (c41256.f8275 != null) {
            C4371 c4371M282138 = m28213(c41256);
            if (c4371M282138 != null) {
                m4414(this.f25276, c4371M282138, -this.f3497.f8394[1].m11763());
                m28211(this.f25275, this.f25276, -1, this.f25272);
                return;
            }
            return;
        }
        if ((c41284 instanceof InterfaceC5278) || c41284.m11876() == null) {
            return;
        }
        m4414(this.f25275, this.f3497.m11876().f8355.f25275, this.f3497.m11892());
        m28211(this.f25276, this.f25275, 1, this.f25272);
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo10131() {
        C4371 c4371 = this.f25275;
        if (c4371.f8958) {
            this.f3497.m11967(c4371.f8955);
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo10132() {
        this.f25270 = null;
        this.f25275.m12658();
        this.f25276.m12658();
        this.f25272.m12658();
        this.f25274 = false;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10134() {
        this.f25274 = false;
        this.f25275.m12658();
        this.f25275.f8958 = false;
        this.f25276.m12658();
        this.f25276.f8958 = false;
        this.f25272.f8958 = false;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo10135() {
        return this.f25271 != C4128.EnumC0339.MATCH_CONSTRAINT || this.f3497.f8366 == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m16316(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }
}
