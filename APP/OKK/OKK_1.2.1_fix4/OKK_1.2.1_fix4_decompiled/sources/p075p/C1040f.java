package p075p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p069m.AbstractC0988h;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1002g;
import p073o.C1013b;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1040f {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f3940a;

    /* JADX INFO: renamed from: b */
    public int f3941b;

    /* JADX INFO: renamed from: c */
    public int f3942c;

    /* JADX INFO: renamed from: d */
    public int f3943d;

    /* JADX INFO: renamed from: e */
    public int f3944e;

    /* JADX INFO: renamed from: f */
    public int f3945f;

    /* JADX INFO: renamed from: g */
    public int f3946g;

    public C1040f(ConstraintLayout constraintLayout) {
        this.f3940a = constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2519a(C0999d c0999d, C1013b c1013b) {
        int iMakeMeasureSpec;
        boolean z2;
        int iM2372a;
        int i2;
        int iMakeMeasureSpec2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1039e c1039e;
        int measuredWidth;
        int measuredHeight;
        int i3;
        int iMax;
        int i4;
        int iMax2;
        int i5;
        int i6;
        int i7;
        int baseline;
        boolean z6;
        if (c0999d == null) {
            return;
        }
        if (c0999d.f3605V == 8) {
            c1013b.f3728e = 0;
            c1013b.f3729f = 0;
            c1013b.f3730g = 0;
            return;
        }
        int i8 = c1013b.f3724a;
        int i9 = c1013b.f3725b;
        int i10 = c1013b.f3726c;
        int i11 = c1013b.f3727d;
        int i12 = this.f3941b + this.f3942c;
        int i13 = this.f3943d;
        View view = (View) c0999d.f3604U;
        int iM2372a2 = AbstractC0988h.m2372a(i8);
        C0998c c0998c = c0999d.f3638z;
        C0998c c0998c2 = c0999d.f3636x;
        int[] iArr = c0999d.f3619g;
        if (iM2372a2 != 0) {
            if (iM2372a2 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3945f, i13, -2);
                iArr[2] = -2;
            } else if (iM2372a2 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3945f, i13, -2);
                boolean z7 = c0999d.f3622j == 1;
                iArr[2] = 0;
                if (c1013b.f3733j) {
                    boolean z8 = (!z7 || iArr[3] == 0 || iArr[0] == c0999d.m2407l()) ? false : true;
                    if (!z7 || z8) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0999d.m2407l(), 1073741824);
                    }
                }
            } else if (iM2372a2 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i14 = this.f3945f;
                int i15 = c0998c2 != null ? c0998c2.f3581e : 0;
                if (c0998c != null) {
                    i15 += c0998c.f3581e;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i14, i13 + i15, -1);
                iArr[2] = -1;
            }
            z2 = true;
            iM2372a = AbstractC0988h.m2372a(i9);
            if (iM2372a == 0) {
                if (iM2372a == 1) {
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3946g, i12, -2);
                    i2 = 3;
                    iArr[3] = -2;
                    iMakeMeasureSpec2 = childMeasureSpec;
                    z3 = true;
                } else if (iM2372a == 2) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3946g, i12, -2);
                    boolean z9 = c0999d.f3623k == 1;
                    iArr[3] = 0;
                    if (c1013b.f3733j) {
                        boolean z10 = (!z9 || iArr[2] == 0 || iArr[1] == c0999d.m2404i()) ? false : true;
                        if (!z9 || z10) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0999d.m2404i(), 1073741824);
                            z3 = false;
                        }
                        i2 = 3;
                    } else {
                        z3 = true;
                        i2 = 3;
                    }
                } else if (iM2372a != 3) {
                    i2 = 3;
                    z3 = false;
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i16 = this.f3946g;
                    int i17 = c0998c2 != null ? c0999d.f3637y.f3581e : 0;
                    if (c0998c != null) {
                        i17 += c0999d.f3584A.f3581e;
                    }
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, i12 + i17, -1);
                    iArr[3] = -1;
                    iMakeMeasureSpec2 = childMeasureSpec2;
                    i2 = 3;
                }
                boolean z11 = i8 == i2;
                boolean z12 = i9 == i2;
                boolean z13 = i9 == 4 || i9 == 1;
                boolean z14 = i8 == 4 || i8 == 1;
                z4 = z11 && c0999d.f3595L > 0.0f;
                z5 = z12 && c0999d.f3595L > 0.0f;
                c1039e = (C1039e) view.getLayoutParams();
                if (!c1013b.f3733j && z11 && c0999d.f3622j == 0 && z12 && c0999d.f3623k == 0) {
                    i7 = -1;
                    iMax = 0;
                    baseline = 0;
                    iMax2 = 0;
                } else {
                    if ((view instanceof AbstractC1053s) || !(c0999d instanceof C1002g)) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        ((AbstractC1053s) view).mo1157h((C1002g) c0999d, iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    if (z2) {
                        i3 = 0;
                        iArr[0] = 0;
                        iArr[2] = 0;
                    } else {
                        i3 = 0;
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    }
                    if (z3) {
                        iArr[1] = i3;
                        iArr[3] = i3;
                    } else {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    }
                    int i18 = c0999d.f3625m;
                    iMax = i18 <= 0 ? Math.max(i18, measuredWidth) : measuredWidth;
                    i4 = c0999d.f3626n;
                    if (i4 > 0) {
                        iMax = Math.min(i4, iMax);
                    }
                    int i19 = c0999d.f3628p;
                    iMax2 = i19 <= 0 ? Math.max(i19, measuredHeight) : measuredHeight;
                    i5 = c0999d.f3629q;
                    if (i5 > 0) {
                        iMax2 = Math.min(i5, iMax2);
                    }
                    if (!z4 && z13) {
                        iMax = (int) ((iMax2 * c0999d.f3595L) + 0.5f);
                    } else if (z5 && z14) {
                        iMax2 = (int) ((iMax / c0999d.f3595L) + 0.5f);
                    }
                    if (measuredWidth == iMax || measuredHeight != iMax2) {
                        if (measuredWidth == iMax) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != iMax2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth2 = view.getMeasuredWidth();
                        iMax2 = view.getMeasuredHeight();
                        iMax = measuredWidth2;
                        i7 = -1;
                        baseline = view.getBaseline();
                    } else {
                        baseline = baseline2;
                        i7 = -1;
                    }
                }
                z6 = baseline != i7;
                c1013b.f3732i = (iMax == c1013b.f3726c && iMax2 == c1013b.f3727d) ? false : true;
                if (c1039e.f3900X) {
                    z6 = true;
                }
                if (z6 && baseline != -1 && c0999d.f3599P != baseline) {
                    c1013b.f3732i = true;
                }
                c1013b.f3728e = iMax;
                c1013b.f3729f = iMax2;
                c1013b.f3731h = z6;
                c1013b.f3730g = baseline;
            }
            i2 = 3;
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            iArr[3] = i11;
            z3 = false;
            if (i8 == i2) {
            }
            if (i9 == i2) {
            }
            if (i9 == 4) {
            }
            if (i8 == 4) {
            }
            if (z11) {
            }
            if (z12) {
            }
            c1039e = (C1039e) view.getLayoutParams();
            if (!c1013b.f3733j) {
                if (view instanceof AbstractC1053s) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline22 = view.getBaseline();
                    if (z2) {
                    }
                    if (z3) {
                    }
                    int i182 = c0999d.f3625m;
                    if (i182 <= 0) {
                    }
                    i4 = c0999d.f3626n;
                    if (i4 > 0) {
                    }
                    int i192 = c0999d.f3628p;
                    if (i192 <= 0) {
                    }
                    i5 = c0999d.f3629q;
                    if (i5 > 0) {
                    }
                    if (!z4) {
                        if (z5) {
                            iMax2 = (int) ((iMax / c0999d.f3595L) + 0.5f);
                        }
                        if (measuredWidth == iMax) {
                            if (measuredWidth == iMax) {
                            }
                            if (measuredHeight != iMax2) {
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            int measuredWidth22 = view.getMeasuredWidth();
                            iMax2 = view.getMeasuredHeight();
                            iMax = measuredWidth22;
                            i7 = -1;
                            baseline = view.getBaseline();
                        }
                    }
                }
            }
            if (baseline != i7) {
            }
            c1013b.f3732i = (iMax == c1013b.f3726c && iMax2 == c1013b.f3727d) ? false : true;
            if (c1039e.f3900X) {
            }
            if (z6) {
                c1013b.f3732i = true;
            }
            c1013b.f3728e = iMax;
            c1013b.f3729f = iMax2;
            c1013b.f3731h = z6;
            c1013b.f3730g = baseline;
        }
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        iArr[2] = i10;
        iMakeMeasureSpec = iMakeMeasureSpec3;
        z2 = false;
        iM2372a = AbstractC0988h.m2372a(i9);
        if (iM2372a == 0) {
        }
        z3 = false;
        if (i8 == i2) {
        }
        if (i9 == i2) {
        }
        if (i9 == 4) {
        }
        if (i8 == 4) {
        }
        if (z11) {
        }
        if (z12) {
        }
        c1039e = (C1039e) view.getLayoutParams();
        if (!c1013b.f3733j) {
        }
        if (baseline != i7) {
        }
        c1013b.f3732i = (iMax == c1013b.f3726c && iMax2 == c1013b.f3727d) ? false : true;
        if (c1039e.f3900X) {
        }
        if (z6) {
        }
        c1013b.f3728e = iMax;
        c1013b.f3729f = iMax2;
        c1013b.f3731h = z6;
        c1013b.f3730g = baseline;
    }
}
