package p203;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7885 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7881 f21826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C7881 f21827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7881 f21828;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21831;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7884 f21835;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21838;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7881 f21839;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f21840;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21842;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7879 f21830 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21829 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f21841 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f21833 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f21832 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f21836 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f21837 = 0;

    public C7885(C7884 c7884, int i, C7881 c7881, C7881 c78812, C7881 c78813, C7881 c78814, int i2) {
        this.f21835 = c7884;
        this.f21831 = i;
        this.f21828 = c7881;
        this.f21827 = c78812;
        this.f21826 = c78813;
        this.f21839 = c78814;
        this.f21838 = c7884.f21816;
        this.f21842 = c7884.f21825;
        this.f21843 = c7884.f21817;
        this.f21840 = c7884.f21824;
        this.f21834 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13301(int i, C7881 c7881, C7881 c78812, C7881 c78813, C7881 c78814, int i2, int i3, int i4, int i5, int i6) {
        this.f21831 = i;
        this.f21828 = c7881;
        this.f21827 = c78812;
        this.f21826 = c78813;
        this.f21839 = c78814;
        this.f21838 = i2;
        this.f21842 = i3;
        this.f21843 = i4;
        this.f21840 = i5;
        this.f21834 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13302(int i) {
        C7884 c7884;
        int i2;
        int i3 = this.f21837;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f21836;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c7884 = this.f21835;
            if (i6 >= i4 || (i2 = this.f21832 + i6) >= c7884.f21792) {
                break;
            }
            C7879 c7879 = c7884.f21793[i2];
            if (this.f21831 == 0) {
                if (c7879 != null) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7879.f21695;
                    if (constraintWidget$DimensionBehaviourArr[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7879.f21730 == 0) {
                        c7884.m13298(c7879, ConstraintWidget$DimensionBehaviour.FIXED, i5, constraintWidget$DimensionBehaviourArr[1], c7879.m13279());
                    }
                }
            } else if (c7879 != null) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c7879.f21695;
                if (constraintWidget$DimensionBehaviourArr2[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7879.f21722 == 0) {
                    int i7 = i5;
                    c7884.m13298(c7879, constraintWidget$DimensionBehaviourArr2[0], c7879.m13275(), ConstraintWidget$DimensionBehaviour.FIXED, i7);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f21841 = 0;
        this.f21833 = 0;
        this.f21830 = null;
        this.f21829 = 0;
        int i8 = this.f21836;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f21832 + i9;
            if (i10 >= c7884.f21792) {
                return;
            }
            C7879 c78792 = c7884.f21793[i10];
            if (this.f21831 == 0) {
                int iM13275 = c78792.m13275();
                int i11 = c7884.f21807;
                if (c78792.f21739 == 8) {
                    i11 = 0;
                }
                this.f21841 = iM13275 + i11 + this.f21841;
                int iM13299 = c7884.m13299(c78792, this.f21834);
                if (this.f21830 == null || this.f21829 < iM13299) {
                    this.f21830 = c78792;
                    this.f21829 = iM13299;
                    this.f21833 = iM13299;
                }
            } else {
                int iM13297 = c7884.m13297(c78792, this.f21834);
                int iM132992 = c7884.m13299(c78792, this.f21834);
                int i12 = c7884.f21811;
                if (c78792.f21739 == 8) {
                    i12 = 0;
                }
                this.f21833 = iM132992 + i12 + this.f21833;
                if (this.f21830 == null || this.f21829 < iM13297) {
                    this.f21830 = c78792;
                    this.f21829 = iM13297;
                    this.f21841 = iM13297;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13303() {
        int i = this.f21831;
        int i2 = this.f21841;
        return i == 0 ? i2 - this.f21835.f21807 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13304() {
        int i = this.f21831;
        int i2 = this.f21833;
        return i == 1 ? i2 - this.f21835.f21811 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13305(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p203.C7885.m13305(int, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13306(C7879 c7879) {
        int i = this.f21831;
        int i2 = this.f21834;
        C7884 c7884 = this.f21835;
        if (i == 0) {
            int iM13297 = c7884.m13297(c7879, i2);
            if (c7879.f21695[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f21837++;
                iM13297 = 0;
            }
            this.f21841 = iM13297 + (c7879.f21739 != 8 ? c7884.f21807 : 0) + this.f21841;
            int iM13299 = c7884.m13299(c7879, this.f21834);
            if (this.f21830 == null || this.f21829 < iM13299) {
                this.f21830 = c7879;
                this.f21829 = iM13299;
                this.f21833 = iM13299;
            }
        } else {
            int iM132972 = c7884.m13297(c7879, i2);
            int iM132992 = c7884.m13299(c7879, this.f21834);
            if (c7879.f21695[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f21837++;
                iM132992 = 0;
            }
            this.f21833 = iM132992 + (c7879.f21739 != 8 ? c7884.f21811 : 0) + this.f21833;
            if (this.f21830 == null || this.f21829 < iM132972) {
                this.f21830 = c7879;
                this.f21829 = iM132972;
                this.f21841 = iM132972;
            }
        }
        this.f21836++;
    }
}
