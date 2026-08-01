package p203;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p206.C7908;
import p206.C7910;
import p206.C7911;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7888 extends C7878 {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f21851;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public float f21854 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public int f21853 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public int f21856 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C7880 f21855 = this.f21712;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public int f21852 = 0;

    public C7888() {
        this.f21696.clear();
        this.f21696.add(this.f21855);
        int length = this.f21697.length;
        for (int i = 0; i < length; i++) {
            this.f21697[i] = this.f21855;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13283(int i) {
        this.f21855.m13264(i);
        this.f21851 = true;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo13220(C7910 c7910, boolean z) {
        if (this.f21694 == null) {
            return;
        }
        C7880 c7880 = this.f21855;
        c7910.getClass();
        int iM13347 = C7910.m13347(c7880);
        if (this.f21852 == 1) {
            this.f21761 = iM13347;
            this.f21758 = 0;
            m13222(this.f21694.m13251());
            m13221(0);
            return;
        }
        this.f21761 = 0;
        this.f21758 = iM13347;
        m13221(this.f21694.m13247());
        m13222(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m13284(int i) {
        if (this.f21852 == i) {
            return;
        }
        this.f21852 = i;
        ArrayList arrayList = this.f21696;
        arrayList.clear();
        if (this.f21852 == 1) {
            this.f21855 = this.f21713;
        } else {
            this.f21855 = this.f21712;
        }
        arrayList.add(this.f21855);
        C7880[] c7880Arr = this.f21697;
        int length = c7880Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c7880Arr[i2] = this.f21855;
        }
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo13227() {
        return this.f21851;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo13228() {
        return this.f21851;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo13237() {
        return true;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13238(C7910 c7910, boolean z) {
        C7877 c7877 = (C7877) this.f21694;
        if (c7877 == null) {
            return;
        }
        Object objMo13253 = c7877.mo13253(ConstraintAnchor$Type.LEFT);
        Object objMo132532 = c7877.mo13253(ConstraintAnchor$Type.RIGHT);
        C7878 c7878 = this.f21694;
        boolean z2 = c7878 != null && c7878.f21698[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (this.f21852 == 0) {
            objMo13253 = c7877.mo13253(ConstraintAnchor$Type.TOP);
            objMo132532 = c7877.mo13253(ConstraintAnchor$Type.BOTTOM);
            C7878 c78782 = this.f21694;
            z2 = c78782 != null && c78782.f21698[1] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f21851) {
            C7880 c7880 = this.f21855;
            if (c7880.f21766) {
                C7908 c7908M13363 = c7910.m13363(c7880);
                c7910.m13350(c7908M13363, this.f21855.m13257());
                if (this.f21853 != -1) {
                    if (z2) {
                        c7910.m13348(c7910.m13363(objMo132532), c7908M13363, 0, 5);
                    }
                } else if (this.f21856 != -1 && z2) {
                    C7908 c7908M133632 = c7910.m13363(objMo132532);
                    c7910.m13348(c7908M13363, c7910.m13363(objMo13253), 0, 5);
                    c7910.m13348(c7908M133632, c7908M13363, 0, 5);
                }
                this.f21851 = false;
                return;
            }
        }
        if (this.f21853 != -1) {
            C7908 c7908M133633 = c7910.m13363(this.f21855);
            c7910.m13349(c7908M133633, c7910.m13363(objMo13253), this.f21853, 8);
            if (z2) {
                c7910.m13348(c7910.m13363(objMo132532), c7908M133633, 0, 5);
                return;
            }
            return;
        }
        if (this.f21856 != -1) {
            C7908 c7908M133634 = c7910.m13363(this.f21855);
            C7908 c7908M133635 = c7910.m13363(objMo132532);
            c7910.m13349(c7908M133634, c7908M133635, -this.f21856, 8);
            if (z2) {
                c7910.m13348(c7908M133634, c7910.m13363(objMo13253), 0, 5);
                c7910.m13348(c7908M133635, c7908M133634, 0, 5);
                return;
            }
            return;
        }
        if (this.f21854 != -1.0f) {
            C7908 c7908M133636 = c7910.m13363(this.f21855);
            C7908 c7908M133637 = c7910.m13363(objMo132532);
            float f = this.f21854;
            C7911 c7911M13364 = c7910.m13364();
            c7911M13364.f21918.m13380(c7908M133636, -1.0f);
            c7911M13364.f21918.m13380(c7908M133637, f);
            c7910.m13351(c7911M13364);
        }
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C7880 mo13253(ConstraintAnchor$Type constraintAnchor$Type) {
        int i = AbstractC7887.f21850[constraintAnchor$Type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f21852 == 1) {
                return this.f21855;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f21852 == 0) {
            return this.f21855;
        }
        return null;
    }
}
