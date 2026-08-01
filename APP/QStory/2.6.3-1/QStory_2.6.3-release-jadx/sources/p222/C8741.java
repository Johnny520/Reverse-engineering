package p222;

import androidx.activity.AbstractC0900;
import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.ArrayList;
import p209.C8657;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8742 f22260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8738 f22263 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f22262 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f22261 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f22259 = false;

    public C8741(C8657 c8657) {
        this.f22260 = new C8742(this, c8657);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String strConcat = (this.f22263 == null ? "0" : "" + this.f22263).concat(" = ");
        if (this.f22262 != 0.0f) {
            StringBuilder sbM700 = AbstractC0900.m700(strConcat);
            sbM700.append(this.f22262);
            strConcat = sbM700.toString();
            z = true;
        } else {
            z = false;
        }
        C8742 c8742 = this.f22260;
        int iM13962 = c8742.m13962();
        for (int i = 0; i < iM13962; i++) {
            C8738 c8738M13961 = c8742.m13961(i);
            if (c8738M13961 != null) {
                float fM13960 = c8742.m13960(i);
                if (fM13960 != 0.0f) {
                    String string = c8738M13961.toString();
                    if (!z) {
                        if (fM13960 < 0.0f) {
                            strConcat = strConcat.concat("- ");
                            fM13960 *= -1.0f;
                        }
                        strConcat = fM13960 == 1.0f ? strConcat.concat(string) : strConcat + fM13960 + " " + string;
                        z = true;
                    } else if (fM13960 > 0.0f) {
                        strConcat = strConcat.concat(" + ");
                        if (fM13960 == 1.0f) {
                        }
                        z = true;
                    } else {
                        strConcat = strConcat.concat(" - ");
                        fM13960 *= -1.0f;
                        if (fM13960 == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8738 m13954(boolean[] zArr, C8738 c8738) {
        SolverVariable$Type solverVariable$Type;
        C8742 c8742 = this.f22260;
        int iM13962 = c8742.m13962();
        C8738 c87382 = null;
        float f = 0.0f;
        for (int i = 0; i < iM13962; i++) {
            float fM13960 = c8742.m13960(i);
            if (fM13960 < 0.0f) {
                C8738 c8738M13961 = c8742.m13961(i);
                if ((zArr == null || !zArr[c8738M13961.f22235]) && c8738M13961 != c8738 && (((solverVariable$Type = c8738M13961.f22232) == SolverVariable$Type.SLACK || solverVariable$Type == SolverVariable$Type.ERROR) && fM13960 < f)) {
                    f = fM13960;
                    c87382 = c8738M13961;
                }
            }
        }
        return c87382;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo13929() {
        return this.f22263 == null && this.f22262 == 0.0f && this.f22260.m13962() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C8738 mo13930(boolean[] zArr) {
        return m13954(zArr, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13955(C8738 c8738, C8738 c87382, C8738 c87383, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f22262 = i;
        }
        C8742 c8742 = this.f22260;
        if (z) {
            c8742.m13967(c8738, 1.0f);
            c8742.m13967(c87382, -1.0f);
            c8742.m13967(c87383, 1.0f);
        } else {
            c8742.m13967(c8738, -1.0f);
            c8742.m13967(c87382, 1.0f);
            c8742.m13967(c87383, -1.0f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13956(C8738 c8738, C8738 c87382, C8738 c87383, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f22262 = i;
        }
        C8742 c8742 = this.f22260;
        if (z) {
            c8742.m13967(c8738, 1.0f);
            c8742.m13967(c87382, -1.0f);
            c8742.m13967(c87383, -1.0f);
        } else {
            c8742.m13967(c8738, -1.0f);
            c8742.m13967(c87382, 1.0f);
            c8742.m13967(c87383, 1.0f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13957(C8740 c8740, int i) {
        C8738 c8738M13953 = c8740.m13953(i);
        C8742 c8742 = this.f22260;
        c8742.m13967(c8738M13953, 1.0f);
        c8742.m13967(c8740.m13953(i), -1.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13958(C8740 c8740, C8738 c8738, boolean z) {
        if (c8738.f22233) {
            C8742 c8742 = this.f22260;
            float fM13963 = c8742.m13963(c8738);
            this.f22262 = (c8738.f22229 * fM13963) + this.f22262;
            c8742.m13966(c8738, z);
            if (z) {
                c8738.m13927(this);
            }
            if (c8742.m13962() == 0) {
                this.f22259 = true;
                c8740.f22247 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13959(C8738 c8738) {
        C8738 c87382 = this.f22263;
        C8742 c8742 = this.f22260;
        if (c87382 != null) {
            c8742.m13967(c87382, -1.0f);
            this.f22263.f22236 = -1;
            this.f22263 = null;
        }
        float fM13966 = c8742.m13966(c8738, true) * (-1.0f);
        this.f22263 = c8738;
        if (fM13966 == 1.0f) {
            return;
        }
        this.f22262 /= fM13966;
        int i = c8742.f22270;
        for (int i2 = 0; i != -1 && i2 < c8742.f22269; i2++) {
            float[] fArr = c8742.f22271;
            fArr[i] = fArr[i] / fM13966;
            i = c8742.f22264[i];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo13932(C8740 c8740, C8741 c8741, boolean z) {
        C8742 c8742 = this.f22260;
        c8742.getClass();
        float fM13963 = c8742.m13963(c8741.f22263);
        c8742.m13966(c8741.f22263, z);
        C8742 c87422 = c8741.f22260;
        int iM13962 = c87422.m13962();
        for (int i = 0; i < iM13962; i++) {
            C8738 c8738M13961 = c87422.m13961(i);
            c8742.m13965(c8738M13961, c87422.m13963(c8738M13961) * fM13963, z);
        }
        this.f22262 = (c8741.f22262 * fM13963) + this.f22262;
        if (z) {
            c8741.f22263.m13927(this);
        }
        if (this.f22263 == null || c8742.m13962() != 0) {
            return;
        }
        this.f22259 = true;
        c8740.f22247 = true;
    }
}
