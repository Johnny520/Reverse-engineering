package Yue;

import Yue.AbstractC8432;
import Yue.C4125;
import Yue.C4128;
import Yue.C4371;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8184 extends AbstractC8432 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C4371 f24350;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C4401 f24351;

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۧ$ۥ */
    public static /* synthetic */ class C1456 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3295;

        static {
            int[] iArr = new int[AbstractC8432.EnumC1530.values().length];
            f3295 = iArr;
            try {
                iArr[AbstractC8432.EnumC1530.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3295[AbstractC8432.EnumC1530.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3295[AbstractC8432.EnumC1530.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C8184(C4128 c4128) {
        super(c4128);
        C4371 c4371 = new C4371(this);
        this.f24350 = c4371;
        this.f24351 = null;
        this.f25275.f8953 = C4371.EnumC0392.TOP;
        this.f25276.f8953 = C4371.EnumC0392.BOTTOM;
        c4371.f8953 = C4371.EnumC0392.BASELINE;
        this.f25273 = 1;
    }

    public String toString() {
        return "VerticalRun " + this.f3497.m11854();
    }

    @Override // Yue.AbstractC8432, Yue.InterfaceC4369
    /* JADX INFO: renamed from: ۥ */
    public void mo767(InterfaceC4369 interfaceC4369) {
        float f;
        float fM11856;
        float fM118562;
        int i;
        int i2 = C1456.f3295[this.f25277.ordinal()];
        if (i2 == 1) {
            m28221(interfaceC4369);
        } else if (i2 == 2) {
            m28220(interfaceC4369);
        } else if (i2 == 3) {
            C4128 c4128 = this.f3497;
            m28219(interfaceC4369, c4128.f8387, c4128.f8389, 1);
            return;
        }
        C4401 c4401 = this.f25272;
        if (c4401.f8951 && !c4401.f8958 && this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT) {
            C4128 c41282 = this.f3497;
            int i3 = c41282.f8367;
            if (i3 == 2) {
                C4128 c4128M11876 = c41282.m11876();
                if (c4128M11876 != null) {
                    if (c4128M11876.f8356.f25272.f8958) {
                        this.f25272.mo12660((int) ((r7.f8955 * this.f3497.f8374) + 0.5f));
                    }
                }
            } else if (i3 == 3 && c41282.f8355.f25272.f8958) {
                int iM11857 = c41282.m11857();
                if (iM11857 == -1) {
                    C4128 c41283 = this.f3497;
                    f = c41283.f8355.f25272.f8955;
                    fM11856 = c41283.m11856();
                } else if (iM11857 == 0) {
                    fM118562 = r7.f8355.f25272.f8955 * this.f3497.m11856();
                    i = (int) (fM118562 + 0.5f);
                    this.f25272.mo12660(i);
                } else if (iM11857 != 1) {
                    i = 0;
                    this.f25272.mo12660(i);
                } else {
                    C4128 c41284 = this.f3497;
                    f = c41284.f8355.f25272.f8955;
                    fM11856 = c41284.m11856();
                }
                fM118562 = f / fM11856;
                i = (int) (fM118562 + 0.5f);
                this.f25272.mo12660(i);
            }
        }
        C4371 c4371 = this.f25275;
        if (c4371.f8951) {
            C4371 c43712 = this.f25276;
            if (c43712.f8951) {
                if (c4371.f8958 && c43712.f8958 && this.f25272.f8958) {
                    return;
                }
                if (!this.f25272.f8958 && this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                    C4128 c41285 = this.f3497;
                    if (c41285.f8366 == 0 && !c41285.m11902()) {
                        C4371 c43713 = this.f25275.f8960.get(0);
                        C4371 c43714 = this.f25276.f8960.get(0);
                        int i4 = c43713.f8955;
                        C4371 c43715 = this.f25275;
                        int i5 = i4 + c43715.f8954;
                        int i6 = c43714.f8955 + this.f25276.f8954;
                        c43715.mo12660(i5);
                        this.f25276.mo12660(i6);
                        this.f25272.mo12660(i6 - i5);
                        return;
                    }
                }
                if (!this.f25272.f8958 && this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT && this.f3496 == 1 && this.f25275.f8960.size() > 0 && this.f25276.f8960.size() > 0) {
                    C4371 c43716 = this.f25275.f8960.get(0);
                    int i7 = (this.f25276.f8960.get(0).f8955 + this.f25276.f8954) - (c43716.f8955 + this.f25275.f8954);
                    C4401 c44012 = this.f25272;
                    int i8 = c44012.f9074;
                    if (i7 < i8) {
                        c44012.mo12660(i7);
                    } else {
                        c44012.mo12660(i8);
                    }
                }
                if (this.f25272.f8958 && this.f25275.f8960.size() > 0 && this.f25276.f8960.size() > 0) {
                    C4371 c43717 = this.f25275.f8960.get(0);
                    C4371 c43718 = this.f25276.f8960.get(0);
                    int i9 = c43717.f8955 + this.f25275.f8954;
                    int i10 = c43718.f8955 + this.f25276.f8954;
                    float fM11885 = this.f3497.m11885();
                    if (c43717 == c43718) {
                        i9 = c43717.f8955;
                        i10 = c43718.f8955;
                        fM11885 = 0.5f;
                    }
                    this.f25275.mo12660((int) (i9 + 0.5f + (((i10 - i9) - this.f25272.f8955) * fM11885)));
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
            this.f25272.mo12660(c4128.m11859());
        }
        if (!this.f25272.f8958) {
            this.f25271 = this.f3497.m11888();
            if (this.f3497.m11894()) {
                this.f24351 = new C3521(this);
            }
            C4128.EnumC0339 enumC0339 = this.f25271;
            if (enumC0339 != C4128.EnumC0339.MATCH_CONSTRAINT) {
                if (enumC0339 == C4128.EnumC0339.MATCH_PARENT && (c4128M118762 = this.f3497.m11876()) != null && c4128M118762.m11888() == C4128.EnumC0339.FIXED) {
                    int iM11859 = (c4128M118762.m11859() - this.f3497.f8387.m11763()) - this.f3497.f8389.m11763();
                    m4414(this.f25275, c4128M118762.f8356.f25275, this.f3497.f8387.m11763());
                    m4414(this.f25276, c4128M118762.f8356.f25276, -this.f3497.f8389.m11763());
                    this.f25272.mo12660(iM11859);
                    return;
                }
                if (this.f25271 == C4128.EnumC0339.FIXED) {
                    this.f25272.mo12660(this.f3497.m11859());
                }
            }
        } else if (this.f25271 == C4128.EnumC0339.MATCH_PARENT && (c4128M11876 = this.f3497.m11876()) != null && c4128M11876.m11888() == C4128.EnumC0339.FIXED) {
            m4414(this.f25275, c4128M11876.f8356.f25275, this.f3497.f8387.m11763());
            m4414(this.f25276, c4128M11876.f8356.f25276, -this.f3497.f8389.m11763());
            return;
        }
        C4401 c4401 = this.f25272;
        boolean z = c4401.f8958;
        if (z) {
            C4128 c41282 = this.f3497;
            if (c41282.f704) {
                C4125[] c4125Arr = c41282.f8394;
                C4125 c4125 = c4125Arr[2];
                C4125 c41252 = c4125.f8275;
                if (c41252 != null && c4125Arr[3].f8275 != null) {
                    if (c41282.m11902()) {
                        this.f25275.f8954 = this.f3497.f8394[2].m11763();
                        this.f25276.f8954 = -this.f3497.f8394[3].m11763();
                    } else {
                        C4371 c4371M28213 = m28213(this.f3497.f8394[2]);
                        if (c4371M28213 != null) {
                            m4414(this.f25275, c4371M28213, this.f3497.f8394[2].m11763());
                        }
                        C4371 c4371M282132 = m28213(this.f3497.f8394[3]);
                        if (c4371M282132 != null) {
                            m4414(this.f25276, c4371M282132, -this.f3497.f8394[3].m11763());
                        }
                        this.f25275.f847 = true;
                        this.f25276.f847 = true;
                    }
                    if (this.f3497.m11894()) {
                        m4414(this.f24350, this.f25275, this.f3497.m11849());
                        return;
                    }
                    return;
                }
                if (c41252 != null) {
                    C4371 c4371M282133 = m28213(c4125);
                    if (c4371M282133 != null) {
                        m4414(this.f25275, c4371M282133, this.f3497.f8394[2].m11763());
                        m4414(this.f25276, this.f25275, this.f25272.f8955);
                        if (this.f3497.m11894()) {
                            m4414(this.f24350, this.f25275, this.f3497.m11849());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C4125 c41253 = c4125Arr[3];
                if (c41253.f8275 != null) {
                    C4371 c4371M282134 = m28213(c41253);
                    if (c4371M282134 != null) {
                        m4414(this.f25276, c4371M282134, -this.f3497.f8394[3].m11763());
                        m4414(this.f25275, this.f25276, -this.f25272.f8955);
                    }
                    if (this.f3497.m11894()) {
                        m4414(this.f24350, this.f25275, this.f3497.m11849());
                        return;
                    }
                    return;
                }
                C4125 c41254 = c4125Arr[4];
                if (c41254.f8275 != null) {
                    C4371 c4371M282135 = m28213(c41254);
                    if (c4371M282135 != null) {
                        m4414(this.f24350, c4371M282135, 0);
                        m4414(this.f25275, this.f24350, -this.f3497.m11849());
                        m4414(this.f25276, this.f25275, this.f25272.f8955);
                        return;
                    }
                    return;
                }
                if ((c41282 instanceof InterfaceC5278) || c41282.m11876() == null || this.f3497.mo11847(C4125.EnumC0335.CENTER).f8275 != null) {
                    return;
                }
                m4414(this.f25275, this.f3497.m11876().f8356.f25275, this.f3497.m11893());
                m4414(this.f25276, this.f25275, this.f25272.f8955);
                if (this.f3497.m11894()) {
                    m4414(this.f24350, this.f25275, this.f3497.m11849());
                    return;
                }
                return;
            }
        }
        if (z || this.f25271 != C4128.EnumC0339.MATCH_CONSTRAINT) {
            c4401.m1330(this);
        } else {
            C4128 c41283 = this.f3497;
            int i = c41283.f8367;
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
            } else if (i == 3 && !c41283.m11902()) {
                C4128 c41284 = this.f3497;
                if (c41284.f8366 != 3) {
                    C4401 c44014 = c41284.f8355.f25272;
                    this.f25272.f8960.add(c44014);
                    c44014.f8959.add(this.f25272);
                    C4401 c44015 = this.f25272;
                    c44015.f847 = true;
                    c44015.f8959.add(this.f25275);
                    this.f25272.f8959.add(this.f25276);
                }
            }
        }
        C4128 c41285 = this.f3497;
        C4125[] c4125Arr2 = c41285.f8394;
        C4125 c41255 = c4125Arr2[2];
        C4125 c41256 = c41255.f8275;
        if (c41256 != null && c4125Arr2[3].f8275 != null) {
            if (c41285.m11902()) {
                this.f25275.f8954 = this.f3497.f8394[2].m11763();
                this.f25276.f8954 = -this.f3497.f8394[3].m11763();
            } else {
                C4371 c4371M282136 = m28213(this.f3497.f8394[2]);
                C4371 c4371M282137 = m28213(this.f3497.f8394[3]);
                c4371M282136.m1330(this);
                c4371M282137.m1330(this);
                this.f25277 = AbstractC8432.EnumC1530.CENTER;
            }
            if (this.f3497.m11894()) {
                m28211(this.f24350, this.f25275, 1, this.f24351);
            }
        } else if (c41256 != null) {
            C4371 c4371M282138 = m28213(c41255);
            if (c4371M282138 != null) {
                m4414(this.f25275, c4371M282138, this.f3497.f8394[2].m11763());
                m28211(this.f25276, this.f25275, 1, this.f25272);
                if (this.f3497.m11894()) {
                    m28211(this.f24350, this.f25275, 1, this.f24351);
                }
                C4128.EnumC0339 enumC03392 = this.f25271;
                C4128.EnumC0339 enumC03393 = C4128.EnumC0339.MATCH_CONSTRAINT;
                if (enumC03392 == enumC03393 && this.f3497.m11856() > 0.0f) {
                    C5316 c5316 = this.f3497.f8355;
                    if (c5316.f25271 == enumC03393) {
                        c5316.f25272.f8959.add(this.f25272);
                        this.f25272.f8960.add(this.f3497.f8355.f25272);
                        this.f25272.f846 = this;
                    }
                }
            }
        } else {
            C4125 c41257 = c4125Arr2[3];
            if (c41257.f8275 != null) {
                C4371 c4371M282139 = m28213(c41257);
                if (c4371M282139 != null) {
                    m4414(this.f25276, c4371M282139, -this.f3497.f8394[3].m11763());
                    m28211(this.f25275, this.f25276, -1, this.f25272);
                    if (this.f3497.m11894()) {
                        m28211(this.f24350, this.f25275, 1, this.f24351);
                    }
                }
            } else {
                C4125 c41258 = c4125Arr2[4];
                if (c41258.f8275 != null) {
                    C4371 c4371M2821310 = m28213(c41258);
                    if (c4371M2821310 != null) {
                        m4414(this.f24350, c4371M2821310, 0);
                        m28211(this.f25275, this.f24350, -1, this.f24351);
                        m28211(this.f25276, this.f25275, 1, this.f25272);
                    }
                } else if (!(c41285 instanceof InterfaceC5278) && c41285.m11876() != null) {
                    m4414(this.f25275, this.f3497.m11876().f8356.f25275, this.f3497.m11893());
                    m28211(this.f25276, this.f25275, 1, this.f25272);
                    if (this.f3497.m11894()) {
                        m28211(this.f24350, this.f25275, 1, this.f24351);
                    }
                    C4128.EnumC0339 enumC03394 = this.f25271;
                    C4128.EnumC0339 enumC03395 = C4128.EnumC0339.MATCH_CONSTRAINT;
                    if (enumC03394 == enumC03395 && this.f3497.m11856() > 0.0f) {
                        C5316 c53162 = this.f3497.f8355;
                        if (c53162.f25271 == enumC03395) {
                            c53162.f25272.f8959.add(this.f25272);
                            this.f25272.f8960.add(this.f3497.f8355.f25272);
                            this.f25272.f846 = this;
                        }
                    }
                }
            }
        }
        if (this.f25272.f8960.size() == 0) {
            this.f25272.f8951 = true;
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo10131() {
        C4371 c4371 = this.f25275;
        if (c4371.f8958) {
            this.f3497.m11968(c4371.f8955);
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo10132() {
        this.f25270 = null;
        this.f25275.m12658();
        this.f25276.m12658();
        this.f24350.m12658();
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
        this.f24350.m12658();
        this.f24350.f8958 = false;
        this.f25272.f8958 = false;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo10135() {
        return this.f25271 != C4128.EnumC0339.MATCH_CONSTRAINT || this.f3497.f8367 == 0;
    }
}
