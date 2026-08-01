package p219;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p222.C8738;
import p222.C8740;
import p222.C8741;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8718 extends C8708 {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f22193;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public float f22196 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f22195 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public int f22198 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C8710 f22197 = this.f22054;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public int f22194 = 0;

    public C8718() {
        this.f22038.clear();
        this.f22038.add(this.f22197);
        int length = this.f22039.length;
        for (int i = 0; i < length; i++) {
            this.f22039[i] = this.f22197;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13870(int i) {
        this.f22197.m13851(i);
        this.f22193 = true;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo13807(C8740 c8740, boolean z) {
        if (this.f22036 == null) {
            return;
        }
        C8710 c8710 = this.f22197;
        c8740.getClass();
        int iM13934 = C8740.m13934(c8710);
        if (this.f22194 == 1) {
            this.f22103 = iM13934;
            this.f22100 = 0;
            m13809(this.f22036.m13838());
            m13808(0);
            return;
        }
        this.f22103 = 0;
        this.f22100 = iM13934;
        m13808(this.f22036.m13834());
        m13809(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m13871(int i) {
        if (this.f22194 == i) {
            return;
        }
        this.f22194 = i;
        ArrayList arrayList = this.f22038;
        arrayList.clear();
        if (this.f22194 == 1) {
            this.f22197 = this.f22055;
        } else {
            this.f22197 = this.f22054;
        }
        arrayList.add(this.f22197);
        C8710[] c8710Arr = this.f22039;
        int length = c8710Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c8710Arr[i2] = this.f22197;
        }
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo13814() {
        return this.f22193;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo13815() {
        return this.f22193;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo13824() {
        return true;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13825(C8740 c8740, boolean z) {
        C8707 c8707 = (C8707) this.f22036;
        if (c8707 == null) {
            return;
        }
        Object objMo13840 = c8707.mo13840(ConstraintAnchor$Type.LEFT);
        Object objMo138402 = c8707.mo13840(ConstraintAnchor$Type.RIGHT);
        C8708 c8708 = this.f22036;
        boolean z2 = c8708 != null && c8708.f22040[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (this.f22194 == 0) {
            objMo13840 = c8707.mo13840(ConstraintAnchor$Type.TOP);
            objMo138402 = c8707.mo13840(ConstraintAnchor$Type.BOTTOM);
            C8708 c87082 = this.f22036;
            z2 = c87082 != null && c87082.f22040[1] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f22193) {
            C8710 c8710 = this.f22197;
            if (c8710.f22108) {
                C8738 c8738M13950 = c8740.m13950(c8710);
                c8740.m13937(c8738M13950, this.f22197.m13844());
                if (this.f22195 != -1) {
                    if (z2) {
                        c8740.m13935(c8740.m13950(objMo138402), c8738M13950, 0, 5);
                    }
                } else if (this.f22198 != -1 && z2) {
                    C8738 c8738M139502 = c8740.m13950(objMo138402);
                    c8740.m13935(c8738M13950, c8740.m13950(objMo13840), 0, 5);
                    c8740.m13935(c8738M139502, c8738M13950, 0, 5);
                }
                this.f22193 = false;
                return;
            }
        }
        if (this.f22195 != -1) {
            C8738 c8738M139503 = c8740.m13950(this.f22197);
            c8740.m13936(c8738M139503, c8740.m13950(objMo13840), this.f22195, 8);
            if (z2) {
                c8740.m13935(c8740.m13950(objMo138402), c8738M139503, 0, 5);
                return;
            }
            return;
        }
        if (this.f22198 != -1) {
            C8738 c8738M139504 = c8740.m13950(this.f22197);
            C8738 c8738M139505 = c8740.m13950(objMo138402);
            c8740.m13936(c8738M139504, c8738M139505, -this.f22198, 8);
            if (z2) {
                c8740.m13935(c8738M139504, c8740.m13950(objMo13840), 0, 5);
                c8740.m13935(c8738M139505, c8738M139504, 0, 5);
                return;
            }
            return;
        }
        if (this.f22196 != -1.0f) {
            C8738 c8738M139506 = c8740.m13950(this.f22197);
            C8738 c8738M139507 = c8740.m13950(objMo138402);
            float f = this.f22196;
            C8741 c8741M13951 = c8740.m13951();
            c8741M13951.f22260.m13967(c8738M139506, -1.0f);
            c8741M13951.f22260.m13967(c8738M139507, f);
            c8740.m13938(c8741M13951);
        }
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C8710 mo13840(ConstraintAnchor$Type constraintAnchor$Type) {
        int i = AbstractC8717.f22192[constraintAnchor$Type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f22194 == 1) {
                return this.f22197;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f22194 == 0) {
            return this.f22197;
        }
        return null;
    }
}
