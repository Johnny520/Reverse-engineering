package p203;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7884 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7880 f21829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C7880 f21830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7880 f21831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7883 f21838;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21841;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7880 f21842;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f21843;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21845;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7878 f21833 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21832 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f21844 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f21836 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f21835 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f21839 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f21840 = 0;

    public C7884(C7883 c7883, int i, C7880 c7880, C7880 c78802, C7880 c78803, C7880 c78804, int i2) {
        this.f21838 = c7883;
        this.f21834 = i;
        this.f21831 = c7880;
        this.f21830 = c78802;
        this.f21829 = c78803;
        this.f21842 = c78804;
        this.f21841 = c7883.f21819;
        this.f21845 = c7883.f21828;
        this.f21846 = c7883.f21820;
        this.f21843 = c7883.f21827;
        this.f21837 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13273(int i, C7880 c7880, C7880 c78802, C7880 c78803, C7880 c78804, int i2, int i3, int i4, int i5, int i6) {
        this.f21834 = i;
        this.f21831 = c7880;
        this.f21830 = c78802;
        this.f21829 = c78803;
        this.f21842 = c78804;
        this.f21841 = i2;
        this.f21845 = i3;
        this.f21846 = i4;
        this.f21843 = i5;
        this.f21837 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13274(int i) {
        C7883 c7883;
        int i2;
        int i3 = this.f21840;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f21839;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c7883 = this.f21838;
            if (i6 >= i4 || (i2 = this.f21835 + i6) >= c7883.f21795) {
                break;
            }
            C7878 c7878 = c7883.f21796[i2];
            if (this.f21834 == 0) {
                if (c7878 != null) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7878.f21698;
                    if (constraintWidget$DimensionBehaviourArr[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7878.f21733 == 0) {
                        c7883.m13270(c7878, ConstraintWidget$DimensionBehaviour.FIXED, i5, constraintWidget$DimensionBehaviourArr[1], c7878.m13251());
                    }
                }
            } else if (c7878 != null) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c7878.f21698;
                if (constraintWidget$DimensionBehaviourArr2[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7878.f21725 == 0) {
                    int i7 = i5;
                    c7883.m13270(c7878, constraintWidget$DimensionBehaviourArr2[0], c7878.m13247(), ConstraintWidget$DimensionBehaviour.FIXED, i7);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f21844 = 0;
        this.f21836 = 0;
        this.f21833 = null;
        this.f21832 = 0;
        int i8 = this.f21839;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f21835 + i9;
            if (i10 >= c7883.f21795) {
                return;
            }
            C7878 c78782 = c7883.f21796[i10];
            if (this.f21834 == 0) {
                int iM13247 = c78782.m13247();
                int i11 = c7883.f21810;
                if (c78782.f21742 == 8) {
                    i11 = 0;
                }
                this.f21844 = iM13247 + i11 + this.f21844;
                int iM13271 = c7883.m13271(c78782, this.f21837);
                if (this.f21833 == null || this.f21832 < iM13271) {
                    this.f21833 = c78782;
                    this.f21832 = iM13271;
                    this.f21836 = iM13271;
                }
            } else {
                int iM13269 = c7883.m13269(c78782, this.f21837);
                int iM132712 = c7883.m13271(c78782, this.f21837);
                int i12 = c7883.f21814;
                if (c78782.f21742 == 8) {
                    i12 = 0;
                }
                this.f21836 = iM132712 + i12 + this.f21836;
                if (this.f21833 == null || this.f21832 < iM13269) {
                    this.f21833 = c78782;
                    this.f21832 = iM13269;
                    this.f21844 = iM13269;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13275() {
        int i = this.f21834;
        int i2 = this.f21844;
        return i == 0 ? i2 - this.f21838.f21810 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13276() {
        int i = this.f21834;
        int i2 = this.f21836;
        return i == 1 ? i2 - this.f21838.f21814 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13277(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p203.C7884.m13277(int, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13278(C7878 c7878) {
        int i = this.f21834;
        int i2 = this.f21837;
        C7883 c7883 = this.f21838;
        if (i == 0) {
            int iM13269 = c7883.m13269(c7878, i2);
            if (c7878.f21698[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f21840++;
                iM13269 = 0;
            }
            this.f21844 = iM13269 + (c7878.f21742 != 8 ? c7883.f21810 : 0) + this.f21844;
            int iM13271 = c7883.m13271(c7878, this.f21837);
            if (this.f21833 == null || this.f21832 < iM13271) {
                this.f21833 = c7878;
                this.f21832 = iM13271;
                this.f21836 = iM13271;
            }
        } else {
            int iM132692 = c7883.m13269(c7878, i2);
            int iM132712 = c7883.m13271(c7878, this.f21837);
            if (c7878.f21698[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f21840++;
                iM132712 = 0;
            }
            this.f21836 = iM132712 + (c7878.f21742 != 8 ? c7883.f21814 : 0) + this.f21836;
            if (this.f21833 == null || this.f21832 < iM132692) {
                this.f21833 = c7878;
                this.f21832 = iM132692;
                this.f21844 = iM132692;
            }
        }
        this.f21839++;
    }
}
