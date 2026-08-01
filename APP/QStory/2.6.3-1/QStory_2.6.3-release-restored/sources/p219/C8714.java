package p219;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8714 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8710 f22171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C8710 f22172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8710 f22173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f22176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f22179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8713 f22180;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22183;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C8710 f22184;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f22185;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f22187;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f22188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8708 f22175 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f22174 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f22186 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f22178 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f22177 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f22181 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f22182 = 0;

    public C8714(C8713 c8713, int i, C8710 c8710, C8710 c87102, C8710 c87103, C8710 c87104, int i2) {
        this.f22180 = c8713;
        this.f22176 = i;
        this.f22173 = c8710;
        this.f22172 = c87102;
        this.f22171 = c87103;
        this.f22184 = c87104;
        this.f22183 = c8713.f22161;
        this.f22187 = c8713.f22170;
        this.f22188 = c8713.f22162;
        this.f22185 = c8713.f22169;
        this.f22179 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13860(int i, C8710 c8710, C8710 c87102, C8710 c87103, C8710 c87104, int i2, int i3, int i4, int i5, int i6) {
        this.f22176 = i;
        this.f22173 = c8710;
        this.f22172 = c87102;
        this.f22171 = c87103;
        this.f22184 = c87104;
        this.f22183 = i2;
        this.f22187 = i3;
        this.f22188 = i4;
        this.f22185 = i5;
        this.f22179 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13861(int i) {
        C8713 c8713;
        int i2;
        int i3 = this.f22182;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f22181;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c8713 = this.f22180;
            if (i6 >= i4 || (i2 = this.f22177 + i6) >= c8713.f22137) {
                break;
            }
            C8708 c8708 = c8713.f22138[i2];
            if (this.f22176 == 0) {
                if (c8708 != null) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
                    if (constraintWidget$DimensionBehaviourArr[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c8708.f22075 == 0) {
                        c8713.m13857(c8708, ConstraintWidget$DimensionBehaviour.FIXED, i5, constraintWidget$DimensionBehaviourArr[1], c8708.m13838());
                    }
                }
            } else if (c8708 != null) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c8708.f22040;
                if (constraintWidget$DimensionBehaviourArr2[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c8708.f22067 == 0) {
                    int i7 = i5;
                    c8713.m13857(c8708, constraintWidget$DimensionBehaviourArr2[0], c8708.m13834(), ConstraintWidget$DimensionBehaviour.FIXED, i7);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f22186 = 0;
        this.f22178 = 0;
        this.f22175 = null;
        this.f22174 = 0;
        int i8 = this.f22181;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f22177 + i9;
            if (i10 >= c8713.f22137) {
                return;
            }
            C8708 c87082 = c8713.f22138[i10];
            if (this.f22176 == 0) {
                int iM13834 = c87082.m13834();
                int i11 = c8713.f22152;
                if (c87082.f22084 == 8) {
                    i11 = 0;
                }
                this.f22186 = iM13834 + i11 + this.f22186;
                int iM13858 = c8713.m13858(c87082, this.f22179);
                if (this.f22175 == null || this.f22174 < iM13858) {
                    this.f22175 = c87082;
                    this.f22174 = iM13858;
                    this.f22178 = iM13858;
                }
            } else {
                int iM13856 = c8713.m13856(c87082, this.f22179);
                int iM138582 = c8713.m13858(c87082, this.f22179);
                int i12 = c8713.f22156;
                if (c87082.f22084 == 8) {
                    i12 = 0;
                }
                this.f22178 = iM138582 + i12 + this.f22178;
                if (this.f22175 == null || this.f22174 < iM13856) {
                    this.f22175 = c87082;
                    this.f22174 = iM13856;
                    this.f22186 = iM13856;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13862() {
        int i = this.f22176;
        int i2 = this.f22186;
        return i == 0 ? i2 - this.f22180.f22152 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13863() {
        int i = this.f22176;
        int i2 = this.f22178;
        return i == 1 ? i2 - this.f22180.f22156 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13864(int i, boolean z, boolean z2) {
        C8713 c8713;
        int i2;
        int i3;
        C8708 c8708;
        boolean z3;
        int i4;
        int i5;
        char c;
        float f;
        int i6;
        float f2;
        int i7;
        int i8 = this.f22181;
        int i9 = 0;
        while (true) {
            c8713 = this.f22180;
            if (i9 >= i8 || (i7 = this.f22177 + i9) >= c8713.f22137) {
                break;
            }
            C8708 c87082 = c8713.f22138[i7];
            if (c87082 != null) {
                c87082.m13813();
            }
            i9++;
        }
        if (i8 == 0 || this.f22175 == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = this.f22177 + (z ? (i8 - 1) - i12 : i12);
            if (i13 >= c8713.f22137) {
                break;
            }
            C8708 c87083 = c8713.f22138[i13];
            if (c87083 != null && c87083.f22084 == 0) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        int i14 = this.f22176;
        C8708 c87084 = this.f22175;
        if (i14 == 0) {
            c87084.f22093 = c8713.f22145;
            C8710 c8710 = c87084.f22044;
            C8710 c87102 = c87084.f22054;
            int i15 = this.f22187;
            if (i > 0) {
                i15 += c8713.f22156;
            }
            c87102.m13847(this.f22172, i15);
            if (z2) {
                c8710.m13847(this.f22184, this.f22185);
            }
            if (i > 0) {
                this.f22172.f22107.f22044.m13847(c87102, 0);
            }
            if (c8713.f22140 != 3 || c87084.f22059) {
                c8708 = c87084;
            } else {
                for (int i16 = 0; i16 < i8; i16++) {
                    int i17 = this.f22177 + (z ? (i8 - 1) - i16 : i16);
                    if (i17 >= c8713.f22137) {
                        break;
                    }
                    c8708 = c8713.f22138[i17];
                    if (c8708.f22059) {
                        break;
                    }
                }
                c8708 = c87084;
            }
            int i18 = 0;
            C8708 c87085 = null;
            while (i18 < i8) {
                int i19 = z ? (i8 - 1) - i18 : i18;
                int i20 = this.f22177 + i19;
                if (i20 >= c8713.f22137) {
                    return;
                }
                C8708 c87086 = c8713.f22138[i20];
                if (c87086 == null) {
                    i5 = i8;
                    z3 = z4;
                    i4 = i11;
                    c = 3;
                } else {
                    C8710 c87103 = c87086.f22054;
                    C8710 c87104 = c87086.f22044;
                    C8710 c87105 = c87086.f22055;
                    z3 = z4;
                    if (i18 == 0) {
                        i4 = i11;
                        c87086.m13821(c87105, this.f22173, this.f22183);
                    } else {
                        i4 = i11;
                    }
                    if (i19 == 0) {
                        int i21 = c8713.f22149;
                        float f3 = c8713.f22163;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.f22177 == 0) {
                            i6 = c8713.f22146;
                            f = f3;
                            if (i6 != -1) {
                                f2 = c8713.f22165;
                                if (z) {
                                    f2 = 1.0f - f2;
                                }
                                c87086.f22097 = i6;
                                c87086.f22087 = f2;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i6 = c8713.f22168) == -1) {
                            i6 = i21;
                            f2 = f;
                        } else {
                            f2 = c8713.f22154;
                            if (z) {
                            }
                        }
                        c87086.f22097 = i6;
                        c87086.f22087 = f2;
                    }
                    if (i18 == i8 - 1) {
                        i5 = i8;
                        c87086.m13821(c87086.f22045, this.f22171, this.f22188);
                    } else {
                        i5 = i8;
                    }
                    if (c87085 != null) {
                        C8710 c87106 = c87085.f22045;
                        c87105.m13847(c87106, c8713.f22152);
                        if (i18 == i10) {
                            int i22 = this.f22183;
                            if (c87105.m13848()) {
                                c87105.f22111 = i22;
                            }
                        }
                        c87106.m13847(c87105, 0);
                        if (i18 == i4 + 1) {
                            int i23 = this.f22188;
                            if (c87106.m13848()) {
                                c87106.f22111 = i23;
                            }
                        }
                    }
                    if (c87086 != c87084) {
                        int i24 = c8713.f22140;
                        c = 3;
                        if (i24 == 3 && c8708.f22059 && c87086 != c8708 && c87086.f22059) {
                            c87086.f22047.m13847(c8708.f22047, 0);
                        } else if (i24 == 0) {
                            c87103.m13847(c87102, 0);
                        } else if (i24 == 1) {
                            c87104.m13847(c8710, 0);
                        } else if (z3) {
                            c87103.m13847(this.f22172, this.f22187);
                            c87104.m13847(this.f22184, this.f22185);
                        } else {
                            c87103.m13847(c87102, 0);
                            c87104.m13847(c8710, 0);
                        }
                    } else {
                        c = 3;
                    }
                    c87085 = c87086;
                }
                i18++;
                z4 = z3;
                i11 = i4;
                i8 = i5;
            }
            return;
        }
        int i25 = i8;
        boolean z5 = z4;
        int i26 = i11;
        c87084.f22097 = c8713.f22149;
        C8710 c87107 = c87084.f22055;
        C8710 c87108 = c87084.f22045;
        int i27 = this.f22183;
        if (i > 0) {
            i27 += c8713.f22152;
        }
        if (z) {
            c87108.m13847(this.f22171, i27);
            if (z2) {
                c87107.m13847(this.f22173, this.f22188);
            }
            if (i > 0) {
                this.f22171.f22107.f22055.m13847(c87108, 0);
            }
        } else {
            c87107.m13847(this.f22173, i27);
            if (z2) {
                c87108.m13847(this.f22171, this.f22188);
            }
            if (i > 0) {
                this.f22173.f22107.f22045.m13847(c87107, 0);
            }
        }
        int i28 = 0;
        C8708 c87087 = null;
        while (true) {
            int i29 = i25;
            if (i28 >= i29 || (i2 = this.f22177 + i28) >= c8713.f22137) {
                return;
            }
            C8708 c87088 = c8713.f22138[i2];
            if (c87088 == null) {
                i25 = i29;
            } else {
                C8710 c87109 = c87088.f22055;
                C8710 c871010 = c87088.f22054;
                C8710 c871011 = c87088.f22045;
                if (i28 == 0) {
                    c87088.m13821(c871010, this.f22172, this.f22187);
                    int i30 = c8713.f22145;
                    float f4 = c8713.f22166;
                    if (this.f22177 == 0) {
                        int i31 = c8713.f22167;
                        i25 = i29;
                        i3 = -1;
                        if (i31 != -1) {
                            f4 = c8713.f22153;
                        }
                        i30 = i31;
                        c87088.f22093 = i30;
                        c87088.f22086 = f4;
                    } else {
                        i25 = i29;
                        i3 = -1;
                    }
                    if (z2 && (i31 = c8713.f22164) != i3) {
                        f4 = c8713.f22151;
                        i30 = i31;
                    }
                    c87088.f22093 = i30;
                    c87088.f22086 = f4;
                } else {
                    i25 = i29;
                }
                if (i28 == i25 - 1) {
                    c87088.m13821(c87088.f22044, this.f22184, this.f22185);
                }
                if (c87087 != null) {
                    C8710 c871012 = c87087.f22044;
                    c871010.m13847(c871012, c8713.f22156);
                    if (i28 == i10) {
                        int i32 = this.f22187;
                        if (c871010.m13848()) {
                            c871010.f22111 = i32;
                        }
                    }
                    c871012.m13847(c871010, 0);
                    if (i28 == i26 + 1) {
                        int i33 = this.f22185;
                        if (c871012.m13848()) {
                            c871012.f22111 = i33;
                        }
                    }
                }
                if (c87088 != c87084) {
                    int i34 = c8713.f22155;
                    if (z) {
                        if (i34 == 0) {
                            c871011.m13847(c87108, 0);
                        } else if (i34 == 1) {
                            c87109.m13847(c87107, 0);
                        } else if (i34 == 2) {
                            c87109.m13847(c87107, 0);
                            c871011.m13847(c87108, 0);
                        }
                        c87087 = c87088;
                    } else {
                        if (i34 == 0) {
                            c87109.m13847(c87107, 0);
                        } else if (i34 == 1) {
                            c871011.m13847(c87108, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                c87109.m13847(this.f22173, this.f22183);
                                c871011.m13847(this.f22171, this.f22188);
                            } else {
                                c87109.m13847(c87107, 0);
                                c871011.m13847(c87108, 0);
                            }
                        }
                        c87087 = c87088;
                    }
                } else {
                    c87087 = c87088;
                }
            }
            i28++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13865(C8708 c8708) {
        int i = this.f22176;
        int i2 = this.f22179;
        C8713 c8713 = this.f22180;
        if (i == 0) {
            int iM13856 = c8713.m13856(c8708, i2);
            if (c8708.f22040[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f22182++;
                iM13856 = 0;
            }
            this.f22186 = iM13856 + (c8708.f22084 != 8 ? c8713.f22152 : 0) + this.f22186;
            int iM13858 = c8713.m13858(c8708, this.f22179);
            if (this.f22175 == null || this.f22174 < iM13858) {
                this.f22175 = c8708;
                this.f22174 = iM13858;
                this.f22178 = iM13858;
            }
        } else {
            int iM138562 = c8713.m13856(c8708, i2);
            int iM138582 = c8713.m13858(c8708, this.f22179);
            if (c8708.f22040[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f22182++;
                iM138582 = 0;
            }
            this.f22178 = iM138582 + (c8708.f22084 != 8 ? c8713.f22156 : 0) + this.f22178;
            if (this.f22175 == null || this.f22174 < iM138562) {
                this.f22175 = c8708;
                this.f22174 = iM138562;
                this.f22186 = iM138562;
            }
        }
        this.f22181++;
    }
}
