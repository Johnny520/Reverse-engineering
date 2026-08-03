package Yue;

import Yue.C4125;
import Yue.C4128;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5226 extends C4128 {

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final int f12433 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final int f12434 = 1;

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final int f12435 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final int f12436 = 1;

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final int f12437 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final int f12438 = -1;

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public float f12439 = -1.0f;

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public int f12440 = -1;

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public int f12441 = -1;

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public C4125 f12442 = this.f8387;

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public int f12443 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public int f12444 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public boolean f12445;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۟ۧ$ۥ */
    public static /* synthetic */ class C0671 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1353;

        static {
            int[] iArr = new int[C4125.EnumC0335.values().length];
            f1353 = iArr;
            try {
                iArr[C4125.EnumC0335.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1353[C4125.EnumC0335.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1353[C4125.EnumC0335.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1353[C4125.EnumC0335.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1353[C4125.EnumC0335.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1353[C4125.EnumC0335.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1353[C4125.EnumC0335.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1353[C4125.EnumC0335.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1353[C4125.EnumC0335.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C5226() {
        this.f8395.clear();
        this.f8395.add(this.f12442);
        int length = this.f8394.length;
        for (int i = 0; i < length; i++) {
            this.f8394[i] = this.f12442;
        }
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo9340(C5714 c5714, boolean z) {
        C4129 c4129 = (C4129) m11876();
        if (c4129 == null) {
            return;
        }
        C4125 c4125Mo11847 = c4129.mo11847(C4125.EnumC0335.LEFT);
        C4125 c4125Mo118472 = c4129.mo11847(C4125.EnumC0335.RIGHT);
        C4128 c4128 = this.f8398;
        boolean z2 = c4128 != null && c4128.f8397[0] == C4128.EnumC0339.WRAP_CONTENT;
        if (this.f12443 == 0) {
            c4125Mo11847 = c4129.mo11847(C4125.EnumC0335.TOP);
            c4125Mo118472 = c4129.mo11847(C4125.EnumC0335.BOTTOM);
            C4128 c41282 = this.f8398;
            z2 = c41282 != null && c41282.f8397[1] == C4128.EnumC0339.WRAP_CONTENT;
        }
        if (this.f12445 && this.f12442.m11771()) {
            C7503 c7503M17638 = c5714.m17638(this.f12442);
            c5714.m17623(c7503M17638, this.f12442.m11762());
            if (this.f12440 != -1) {
                if (z2) {
                    c5714.m17626(c5714.m17638(c4125Mo118472), c7503M17638, 0, 5);
                }
            } else if (this.f12441 != -1 && z2) {
                C7503 c7503M176382 = c5714.m17638(c4125Mo118472);
                c5714.m17626(c7503M17638, c5714.m17638(c4125Mo11847), 0, 5);
                c5714.m17626(c7503M176382, c7503M17638, 0, 5);
            }
            this.f12445 = false;
            return;
        }
        if (this.f12440 != -1) {
            C7503 c7503M176383 = c5714.m17638(this.f12442);
            c5714.m17622(c7503M176383, c5714.m17638(c4125Mo11847), this.f12440, 8);
            if (z2) {
                c5714.m17626(c5714.m17638(c4125Mo118472), c7503M176383, 0, 5);
                return;
            }
            return;
        }
        if (this.f12441 == -1) {
            if (this.f12439 != -1.0f) {
                c5714.m17621(C5714.m17618(c5714, c5714.m17638(this.f12442), c5714.m17638(c4125Mo118472), this.f12439));
                return;
            }
            return;
        }
        C7503 c7503M176384 = c5714.m17638(this.f12442);
        C7503 c7503M176385 = c5714.m17638(c4125Mo118472);
        c5714.m17622(c7503M176384, c7503M176385, -this.f12441, 8);
        if (z2) {
            c5714.m17626(c7503M176384, c5714.m17638(c4125Mo11847), 0, 5);
            c5714.m17626(c7503M176385, c7503M176384, 0, 5);
        }
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo9341() {
        return true;
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo9342(C4128 c4128, HashMap<C4128, C4128> map) {
        super.mo9342(c4128, map);
        C5226 c5226 = (C5226) c4128;
        this.f12439 = c5226.f12439;
        this.f12440 = c5226.f12440;
        this.f12441 = c5226.f12441;
        m16018(c5226.f12443);
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public C4125 mo11847(C4125.EnumC0335 enumC0335) {
        switch (C0671.f1353[enumC0335.ordinal()]) {
            case 1:
            case 2:
                if (this.f12443 == 1) {
                    return this.f12442;
                }
                break;
            case 3:
            case 4:
                if (this.f12443 == 0) {
                    return this.f12442;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC0335.name());
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public String mo11884() {
        return "Guideline";
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public boolean mo9343() {
        return this.f12445;
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public boolean mo9344() {
        return this.f12445;
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۠ۡۥ */
    public void mo11971(C5714 c5714, boolean z) {
        if (m11876() == null) {
            return;
        }
        int iM17656 = c5714.m17656(this.f12442);
        if (this.f12443 == 1) {
            m11967(iM17656);
            m11968(0);
            m11935(m11876().m11859());
            m11965(0);
            return;
        }
        m11967(0);
        m11968(iM17656);
        m11965(m11876().m11891());
        m11935(0);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public void m16001() {
        if (this.f12440 != -1) {
            m16010();
        } else if (this.f12439 != -1.0f) {
            m16009();
        } else if (this.f12441 != -1) {
            m16008();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public C4125 m16002() {
        return this.f12442;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public int m16003() {
        return this.f12443;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public int m16004() {
        return this.f12440;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public int m16005() {
        if (this.f12439 != -1.0f) {
            return 0;
        }
        if (this.f12440 != -1) {
            return 1;
        }
        return this.f12441 != -1 ? 2 : -1;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public int m16006() {
        return this.f12441;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public float m16007() {
        return this.f12439;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public void m16008() {
        int iM11892 = m11892();
        if (this.f12443 == 0) {
            iM11892 = m11893();
        }
        m16013(iM11892);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m16009() {
        int iM11891 = m11876().m11891() - m11892();
        if (this.f12443 == 0) {
            iM11891 = m11876().m11859() - m11893();
        }
        m16014(iM11891);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public void m16010() {
        float fM11892 = m11892() / m11876().m11891();
        if (this.f12443 == 0) {
            fM11892 = m11893() / m11876().m11859();
        }
        m16015(fM11892);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public boolean m16011() {
        return this.f12439 != -1.0f && this.f12440 == -1 && this.f12441 == -1;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public void m16012(int i) {
        this.f12442.m11783(i);
        this.f12445 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public void m16013(int i) {
        if (i > -1) {
            this.f12439 = -1.0f;
            this.f12440 = i;
            this.f12441 = -1;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public void m16014(int i) {
        if (i > -1) {
            this.f12439 = -1.0f;
            this.f12440 = -1;
            this.f12441 = i;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public void m16015(float f) {
        if (f > -1.0f) {
            this.f12439 = f;
            this.f12440 = -1;
            this.f12441 = -1;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m16016(int i) {
        m16015(i / 100.0f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public void m16017(int i) {
        this.f12444 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public void m16018(int i) {
        if (this.f12443 == i) {
            return;
        }
        this.f12443 = i;
        this.f8395.clear();
        if (this.f12443 == 1) {
            this.f12442 = this.f8386;
        } else {
            this.f12442 = this.f8387;
        }
        this.f8395.add(this.f12442);
        int length = this.f8394.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f8394[i2] = this.f12442;
        }
    }
}
