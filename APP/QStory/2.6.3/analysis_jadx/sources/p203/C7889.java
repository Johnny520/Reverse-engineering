package p203;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p206.C7909;
import p206.C7911;
import p206.C7912;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7889 extends C7879 {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f21848;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public float f21851 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f21850 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public int f21853 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C7881 f21852 = this.f21709;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public int f21849 = 0;

    public C7889() {
        this.f21693.clear();
        this.f21693.add(this.f21852);
        int length = this.f21694.length;
        for (int i = 0; i < length; i++) {
            this.f21694[i] = this.f21852;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13311(int i) {
        this.f21852.m13292(i);
        this.f21848 = true;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo13248(C7911 c7911, boolean z) {
        if (this.f21691 == null) {
            return;
        }
        C7881 c7881 = this.f21852;
        c7911.getClass();
        int iM13375 = C7911.m13375(c7881);
        if (this.f21849 == 1) {
            this.f21758 = iM13375;
            this.f21755 = 0;
            m13250(this.f21691.m13279());
            m13249(0);
            return;
        }
        this.f21758 = 0;
        this.f21755 = iM13375;
        m13249(this.f21691.m13275());
        m13250(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m13312(int i) {
        if (this.f21849 == i) {
            return;
        }
        this.f21849 = i;
        ArrayList arrayList = this.f21693;
        arrayList.clear();
        if (this.f21849 == 1) {
            this.f21852 = this.f21710;
        } else {
            this.f21852 = this.f21709;
        }
        arrayList.add(this.f21852);
        C7881[] c7881Arr = this.f21694;
        int length = c7881Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c7881Arr[i2] = this.f21852;
        }
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo13255() {
        return this.f21848;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo13256() {
        return this.f21848;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo13265() {
        return true;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13266(C7911 c7911, boolean z) {
        C7878 c7878 = (C7878) this.f21691;
        if (c7878 == null) {
            return;
        }
        Object objMo13281 = c7878.mo13281(ConstraintAnchor$Type.LEFT);
        Object objMo132812 = c7878.mo13281(ConstraintAnchor$Type.RIGHT);
        C7879 c7879 = this.f21691;
        boolean z2 = c7879 != null && c7879.f21695[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (this.f21849 == 0) {
            objMo13281 = c7878.mo13281(ConstraintAnchor$Type.TOP);
            objMo132812 = c7878.mo13281(ConstraintAnchor$Type.BOTTOM);
            C7879 c78792 = this.f21691;
            z2 = c78792 != null && c78792.f21695[1] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f21848) {
            C7881 c7881 = this.f21852;
            if (c7881.f21763) {
                C7909 c7909M13391 = c7911.m13391(c7881);
                c7911.m13378(c7909M13391, this.f21852.m13285());
                if (this.f21850 != -1) {
                    if (z2) {
                        c7911.m13376(c7911.m13391(objMo132812), c7909M13391, 0, 5);
                    }
                } else if (this.f21853 != -1 && z2) {
                    C7909 c7909M133912 = c7911.m13391(objMo132812);
                    c7911.m13376(c7909M13391, c7911.m13391(objMo13281), 0, 5);
                    c7911.m13376(c7909M133912, c7909M13391, 0, 5);
                }
                this.f21848 = false;
                return;
            }
        }
        if (this.f21850 != -1) {
            C7909 c7909M133913 = c7911.m13391(this.f21852);
            c7911.m13377(c7909M133913, c7911.m13391(objMo13281), this.f21850, 8);
            if (z2) {
                c7911.m13376(c7911.m13391(objMo132812), c7909M133913, 0, 5);
                return;
            }
            return;
        }
        if (this.f21853 != -1) {
            C7909 c7909M133914 = c7911.m13391(this.f21852);
            C7909 c7909M133915 = c7911.m13391(objMo132812);
            c7911.m13377(c7909M133914, c7909M133915, -this.f21853, 8);
            if (z2) {
                c7911.m13376(c7909M133914, c7911.m13391(objMo13281), 0, 5);
                c7911.m13376(c7909M133915, c7909M133914, 0, 5);
                return;
            }
            return;
        }
        if (this.f21851 != -1.0f) {
            C7909 c7909M133916 = c7911.m13391(this.f21852);
            C7909 c7909M133917 = c7911.m13391(objMo132812);
            float f = this.f21851;
            C7912 c7912M13392 = c7911.m13392();
            c7912M13392.f21915.m13408(c7909M133916, -1.0f);
            c7912M13392.f21915.m13408(c7909M133917, f);
            c7911.m13379(c7912M13392);
        }
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C7881 mo13281(ConstraintAnchor$Type constraintAnchor$Type) {
        int i = AbstractC7888.f21847[constraintAnchor$Type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f21849 == 1) {
                return this.f21852;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f21849 == 0) {
            return this.f21852;
        }
        return null;
    }
}
