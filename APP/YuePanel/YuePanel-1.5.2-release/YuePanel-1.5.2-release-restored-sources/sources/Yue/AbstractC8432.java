package Yue;

import Yue.C4125;
import Yue.C4128;

/* JADX INFO: renamed from: Yue.ۥۢۥۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8432 implements InterfaceC4369 {

    /* JADX INFO: renamed from: ۥ */
    public int f3496;

    /* JADX INFO: renamed from: ۥ۟ */
    public C4128 f3497;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7189 f25270;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4128.EnumC0339 f25271;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4401 f25272 = new C4401(this);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f25273 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f25274 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C4371 f25275 = new C4371(this);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C4371 f25276 = new C4371(this);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public EnumC1530 f25277 = EnumC1530.NONE;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۠$ۥ */
    public static /* synthetic */ class C1529 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3498;

        static {
            int[] iArr = new int[C4125.EnumC0335.values().length];
            f3498 = iArr;
            try {
                iArr[C4125.EnumC0335.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3498[C4125.EnumC0335.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3498[C4125.EnumC0335.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3498[C4125.EnumC0335.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3498[C4125.EnumC0335.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۠$ۥ۟ */
    public enum EnumC1530 {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC8432(C4128 c4128) {
        this.f3497 = c4128;
    }

    @Override // Yue.InterfaceC4369
    /* JADX INFO: renamed from: ۥ */
    public void mo767(InterfaceC4369 interfaceC4369) {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4414(C4371 c4371, C4371 c43712, int i) {
        c4371.f8960.add(c43712);
        c4371.f8954 = i;
        c43712.f8959.add(c4371);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28211(C4371 c4371, C4371 c43712, int i, C4401 c4401) {
        c4371.f8960.add(c43712);
        c4371.f8960.add(this.f25272);
        c4371.f8956 = i;
        c4371.f8957 = c4401;
        c43712.f8959.add(c4371);
        c4401.f8959.add(c4371);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public abstract void mo10130();

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract void mo10131();

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract void mo10132();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m28212(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C4128 c4128 = this.f3497;
            int i3 = c4128.f8370;
            iMax = Math.max(c4128.f8369, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C4128 c41282 = this.f3497;
            int i4 = c41282.f8373;
            iMax = Math.max(c41282.f8372, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C4371 m28213(C4125 c4125) {
        C4125 c41252 = c4125.f8275;
        if (c41252 == null) {
            return null;
        }
        C4128 c4128 = c41252.f8273;
        int i = C1529.f3498[c41252.f8274.ordinal()];
        if (i == 1) {
            return c4128.f8355.f25275;
        }
        if (i == 2) {
            return c4128.f8355.f25276;
        }
        if (i == 3) {
            return c4128.f8356.f25275;
        }
        if (i == 4) {
            return c4128.f8356.f24350;
        }
        if (i != 5) {
            return null;
        }
        return c4128.f8356.f25276;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C4371 m28214(C4125 c4125, int i) {
        C4125 c41252 = c4125.f8275;
        if (c41252 == null) {
            return null;
        }
        C4128 c4128 = c41252.f8273;
        AbstractC8432 abstractC8432 = i == 0 ? c4128.f8355 : c4128.f8356;
        int i2 = C1529.f3498[c41252.f8274.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC8432.f25276;
        }
        return abstractC8432.f25275;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public long mo10133() {
        if (this.f25272.f8958) {
            return r0.f8955;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m28215() {
        int size = this.f25275.f8960.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f25275.f8960.get(i2).f8952 != this) {
                i++;
            }
        }
        int size2 = this.f25276.f8960.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.f25276.f8960.get(i3).f8952 != this) {
                i++;
            }
        }
        return i >= 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m28216() {
        return this.f25272.f8958;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m28217() {
        return this.f25274;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public abstract void mo10134();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m28218(int i, int i2) {
        int i3 = this.f3496;
        if (i3 == 0) {
            this.f25272.mo12660(m28212(i2, i));
            return;
        }
        if (i3 == 1) {
            this.f25272.mo12660(Math.min(m28212(this.f25272.f9074, i), i2));
            return;
        }
        if (i3 == 2) {
            C4128 c4128M11876 = this.f3497.m11876();
            if (c4128M11876 != null) {
                if ((i == 0 ? c4128M11876.f8355 : c4128M11876.f8356).f25272.f8958) {
                    C4128 c4128 = this.f3497;
                    this.f25272.mo12660(m28212((int) ((r9.f8955 * (i == 0 ? c4128.f8371 : c4128.f8374)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        C4128 c41282 = this.f3497;
        AbstractC8432 abstractC8432 = c41282.f8355;
        C4128.EnumC0339 enumC0339 = abstractC8432.f25271;
        C4128.EnumC0339 enumC03392 = C4128.EnumC0339.MATCH_CONSTRAINT;
        if (enumC0339 == enumC03392 && abstractC8432.f3496 == 3) {
            C8184 c8184 = c41282.f8356;
            if (c8184.f25271 == enumC03392 && c8184.f3496 == 3) {
                return;
            }
        }
        if (i == 0) {
            abstractC8432 = c41282.f8356;
        }
        if (abstractC8432.f25272.f8958) {
            float fM11856 = c41282.m11856();
            this.f25272.mo12660(i == 1 ? (int) ((abstractC8432.f25272.f8955 / fM11856) + 0.5f) : (int) ((fM11856 * abstractC8432.f25272.f8955) + 0.5f));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public abstract boolean mo10135();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28219(InterfaceC4369 interfaceC4369, C4125 c4125, C4125 c41252, int i) {
        C4371 c4371M28213 = m28213(c4125);
        C4371 c4371M282132 = m28213(c41252);
        if (c4371M28213.f8958 && c4371M282132.f8958) {
            int iM11763 = c4371M28213.f8955 + c4125.m11763();
            int iM117632 = c4371M282132.f8955 - c41252.m11763();
            int i2 = iM117632 - iM11763;
            if (!this.f25272.f8958 && this.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                m28218(i, i2);
            }
            C4401 c4401 = this.f25272;
            if (c4401.f8958) {
                if (c4401.f8955 == i2) {
                    this.f25275.mo12660(iM11763);
                    this.f25276.mo12660(iM117632);
                    return;
                }
                C4128 c4128 = this.f3497;
                float fM11860 = i == 0 ? c4128.m11860() : c4128.m11885();
                if (c4371M28213 == c4371M282132) {
                    iM11763 = c4371M28213.f8955;
                    iM117632 = c4371M282132.f8955;
                    fM11860 = 0.5f;
                }
                this.f25275.mo12660((int) (iM11763 + 0.5f + (((iM117632 - iM11763) - this.f25272.f8955) * fM11860)));
                this.f25276.mo12660(this.f25275.f8955 + this.f25272.f8955);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m28220(InterfaceC4369 interfaceC4369) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m28221(InterfaceC4369 interfaceC4369) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public long m28222(int i) {
        int i2;
        C4401 c4401 = this.f25272;
        if (!c4401.f8958) {
            return 0L;
        }
        long j = c4401.f8955;
        if (m28215()) {
            i2 = this.f25275.f8954 - this.f25276.f8954;
        } else {
            if (i != 0) {
                return j - ((long) this.f25276.f8954);
            }
            i2 = this.f25275.f8954;
        }
        return j + ((long) i2);
    }
}
