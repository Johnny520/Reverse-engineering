package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.C2982;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p215.AbstractC8686;
import p215.AbstractC8691;
import p215.C8695;
import p219.C8707;
import p219.C8708;
import p219.C8710;
import p219.C8713;
import p219.C8714;
import p219.C8718;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC8686 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C8713 f6724;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21833 = new int[32];
        this.f21830 = new HashMap();
        this.f21832 = context;
        super.mo13768(attributeSet);
        C8713 c8713 = new C8713();
        c8713.f22170 = 0;
        c8713.f22169 = 0;
        c8713.f22158 = 0;
        c8713.f22157 = 0;
        c8713.f22161 = 0;
        c8713.f22162 = 0;
        c8713.f22159 = false;
        c8713.f22160 = 0;
        c8713.f22148 = 0;
        c8713.f22147 = new C2982();
        c8713.f22150 = null;
        c8713.f22149 = -1;
        c8713.f22145 = -1;
        c8713.f22146 = -1;
        c8713.f22167 = -1;
        c8713.f22168 = -1;
        c8713.f22164 = -1;
        c8713.f22163 = 0.5f;
        c8713.f22166 = 0.5f;
        c8713.f22165 = 0.5f;
        c8713.f22153 = 0.5f;
        c8713.f22154 = 0.5f;
        c8713.f22151 = 0.5f;
        c8713.f22152 = 0;
        c8713.f22156 = 0;
        c8713.f22155 = 2;
        c8713.f22140 = 2;
        c8713.f22139 = 0;
        c8713.f22143 = -1;
        c8713.f22144 = 0;
        c8713.f22141 = new ArrayList();
        c8713.f22142 = null;
        c8713.f22136 = null;
        c8713.f22135 = null;
        c8713.f22137 = 0;
        this.f6724 = c8713;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC8691.f21868);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f6724.f22144 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C8713 c87132 = this.f6724;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c87132.f22170 = dimensionPixelSize;
                    c87132.f22169 = dimensionPixelSize;
                    c87132.f22158 = dimensionPixelSize;
                    c87132.f22157 = dimensionPixelSize;
                } else if (index == 18) {
                    C8713 c87133 = this.f6724;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c87133.f22158 = dimensionPixelSize2;
                    c87133.f22161 = dimensionPixelSize2;
                    c87133.f22162 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f6724.f22157 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f6724.f22161 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f6724.f22170 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f6724.f22162 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f6724.f22169 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f6724.f22139 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f6724.f22149 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f6724.f22145 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f6724.f22146 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f6724.f22168 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f6724.f22167 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f6724.f22164 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f6724.f22163 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f6724.f22165 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f6724.f22154 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f6724.f22153 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f6724.f22151 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f6724.f22166 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f6724.f22155 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f6724.f22140 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f6724.f22152 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f6724.f22156 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f6724.f22143 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f21828 = this.f6724;
        m13769();
    }

    @Override // p215.AbstractC8683, android.view.View
    public final void onMeasure(int i, int i2) {
        mo4482(this.f6724, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f6724.f22165 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f6724.f22146 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f6724.f22153 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f6724.f22167 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f6724.f22155 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f6724.f22163 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f6724.f22152 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f6724.f22149 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f6724.f22154 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f6724.f22168 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f6724.f22151 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f6724.f22164 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f6724.f22143 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f6724.f22144 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C8713 c8713 = this.f6724;
        c8713.f22170 = i;
        c8713.f22169 = i;
        c8713.f22158 = i;
        c8713.f22157 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f6724.f22169 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f6724.f22161 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f6724.f22162 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f6724.f22170 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f6724.f22140 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f6724.f22166 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f6724.f22156 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f6724.f22145 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f6724.f22139 = i;
        requestLayout();
    }

    @Override // p215.AbstractC8683
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo4481(C8708 c8708, boolean z) {
        C8713 c8713 = this.f6724;
        int i = c8713.f22158;
        if (i > 0 || c8713.f22157 > 0) {
            if (z) {
                c8713.f22161 = c8713.f22157;
                c8713.f22162 = i;
            } else {
                c8713.f22161 = i;
                c8713.f22162 = c8713.f22157;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x010b A[EDGE_INSN: B:424:0x010b->B:61:0x010b BREAK  A[LOOP:1: B:55:0x00f4->B:60:0x0106], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    @Override // p215.AbstractC8686
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4482(C8713 c8713, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        C8714 c8714;
        char c;
        char c2;
        int i15;
        int i16;
        int i17;
        int iCeil;
        Object obj;
        C8708 c8708;
        char c3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        C8710 c8710;
        C8710 c87102;
        C8710 c87103;
        ArrayList arrayList;
        int i23;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c8713 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8713.f22040;
        C8710 c87104 = c8713.f22054;
        C8710 c87105 = c8713.f22055;
        C8710 c87106 = c8713.f22045;
        C8710 c87107 = c8713.f22044;
        ArrayList arrayList2 = c8713.f22141;
        if (c8713.f22189 > 0) {
            C2982 c2982 = c8713.f22147;
            C8708 c87082 = c8713.f22036;
            C8695 c8695 = c87082 != null ? ((C8707) c87082).f22021 : null;
            if (c8695 == null) {
                c8713.f22160 = 0;
                c8713.f22148 = 0;
                c8713.f22159 = false;
            } else {
                int i24 = 0;
                while (i24 < c8713.f22189) {
                    C8708 c87083 = c8713.f22190[i24];
                    if (c87083 == null) {
                        c8710 = c87105;
                    } else {
                        c8710 = c87105;
                        if (!(c87083 instanceof C8718)) {
                            c87102 = c87106;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM13841 = c87083.m13841(0);
                            c87103 = c87107;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM138412 = c87083.m13841(1);
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                            arrayList = arrayList2;
                            if (constraintWidget$DimensionBehaviourM13841 == constraintWidget$DimensionBehaviour) {
                                i23 = i24;
                                if (c87083.f22075 == 1 || constraintWidget$DimensionBehaviourM138412 != constraintWidget$DimensionBehaviour || c87083.f22067 == 1) {
                                }
                            } else {
                                i23 = i24;
                            }
                            if (constraintWidget$DimensionBehaviourM13841 == constraintWidget$DimensionBehaviour) {
                                constraintWidget$DimensionBehaviourM13841 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            }
                            if (constraintWidget$DimensionBehaviourM138412 == constraintWidget$DimensionBehaviour) {
                                constraintWidget$DimensionBehaviourM138412 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            }
                            c2982.f6693 = constraintWidget$DimensionBehaviourM13841;
                            c2982.f6692 = constraintWidget$DimensionBehaviourM138412;
                            c2982.f6691 = c87083.m13834();
                            c2982.f6690 = c87083.m13838();
                            c8695.m13783(c87083, c2982);
                            c87083.m13808(c2982.f6689);
                            c87083.m13809(c2982.f6688);
                            c87083.m13819(c2982.f6695);
                        }
                        i24 = i23 + 1;
                        c87105 = c8710;
                        c87106 = c87102;
                        c87107 = c87103;
                        arrayList2 = arrayList;
                    }
                    c87102 = c87106;
                    c87103 = c87107;
                    arrayList = arrayList2;
                    i23 = i24;
                    i24 = i23 + 1;
                    c87105 = c8710;
                    c87106 = c87102;
                    c87107 = c87103;
                    arrayList2 = arrayList;
                }
                C8710 c87108 = c87105;
                C8710 c87109 = c87106;
                C8710 c871010 = c87107;
                ArrayList arrayList3 = arrayList2;
                int i25 = c8713.f22161;
                int i26 = c8713.f22162;
                i3 = c8713.f22170;
                int i27 = c8713.f22169;
                int[] iArr2 = new int[2];
                int i28 = (size - i25) - i26;
                i4 = c8713.f22144;
                if (i4 == 1) {
                    i28 = (size2 - i3) - i27;
                }
                int i29 = i28;
                int i30 = c8713.f22149;
                if (i4 != 0) {
                    if (i30 == -1) {
                        c8713.f22149 = 0;
                    }
                    if (c8713.f22145 == -1) {
                        c8713.f22145 = 0;
                    }
                } else {
                    if (i30 == -1) {
                        c8713.f22149 = 0;
                    }
                    if (c8713.f22145 == -1) {
                        c8713.f22145 = 0;
                    }
                }
                C8708[] c8708Arr = c8713.f22190;
                i5 = 0;
                i6 = 0;
                while (true) {
                    i7 = c8713.f22189;
                    i8 = i3;
                    if (i5 < i7) {
                        break;
                    }
                    if (c8713.f22190[i5].f22084 == 8) {
                        i6++;
                    }
                    i5++;
                    i3 = i8;
                }
                if (i6 > 0) {
                    c8708Arr = new C8708[i7 - i6];
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < c8713.f22189) {
                        C8708 c87084 = c8713.f22190[i31];
                        int i33 = i31;
                        if (c87084.f22084 != 8) {
                            c8708Arr[i32] = c87084;
                            i32++;
                        }
                        i31 = i33 + 1;
                    }
                    i7 = i32;
                }
                C8708[] c8708Arr2 = c8708Arr;
                c8713.f22138 = c8708Arr2;
                c8713.f22137 = i7;
                i9 = c8713.f22139;
                if (i9 != 0) {
                    i10 = i25;
                    int i34 = i7;
                    i11 = i27;
                    iArr = iArr2;
                    i12 = size2;
                    i13 = i26;
                    i14 = i8;
                    int i35 = c8713.f22144;
                    if (i34 != 0) {
                        if (arrayList3.size() == 0) {
                            c8714 = new C8714(c8713, i35, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, i29);
                            arrayList3.add(c8714);
                        } else {
                            C8714 c87142 = (C8714) arrayList3.get(0);
                            c87142.f22174 = 0;
                            c87142.f22175 = null;
                            c87142.f22186 = 0;
                            c87142.f22178 = 0;
                            c87142.f22177 = 0;
                            c87142.f22181 = 0;
                            c87142.f22182 = 0;
                            c87142.m13860(i35, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, c8713.f22161, c8713.f22170, c8713.f22162, c8713.f22169, i29);
                            c8714 = c87142;
                        }
                        for (int i36 = 0; i36 < i34; i36++) {
                            c8714.m13865(c8708Arr2[i36]);
                        }
                        c = 0;
                        iArr[0] = c8714.m13862();
                        c2 = 1;
                        iArr[1] = c8714.m13863();
                    }
                    c2 = 1;
                    c = 0;
                } else if (i9 != 1) {
                    if (i9 == 2) {
                        int i37 = i7;
                        i11 = i27;
                        iArr = iArr2;
                        i12 = size2;
                        i10 = i25;
                        i13 = i26;
                        i14 = i8;
                        int i38 = c8713.f22144;
                        int iCeil2 = c8713.f22143;
                        if (i38 == 0) {
                            if (iCeil2 <= 0) {
                                int i39 = 0;
                                iCeil = 0;
                                for (int i40 = 0; i40 < i37; i40++) {
                                    if (i40 > 0) {
                                        i39 += c8713.f22152;
                                    }
                                    C8708 c87085 = c8708Arr2[i40];
                                    if (c87085 != null) {
                                        int iM13856 = c8713.m13856(c87085, i29) + i39;
                                        if (iM13856 > i29) {
                                            break;
                                        }
                                        iCeil++;
                                        i39 = iM13856;
                                    }
                                }
                            } else {
                                iCeil = iCeil2;
                            }
                            iCeil2 = 0;
                        } else {
                            if (iCeil2 <= 0) {
                                int i41 = 0;
                                int i42 = 0;
                                for (int i43 = 0; i43 < i37; i43++) {
                                    if (i43 > 0) {
                                        i41 += c8713.f22156;
                                    }
                                    C8708 c87086 = c8708Arr2[i43];
                                    if (c87086 != null) {
                                        int iM13858 = c8713.m13858(c87086, i29) + i41;
                                        if (iM13858 > i29) {
                                            break;
                                        }
                                        i42++;
                                        i41 = iM13858;
                                    }
                                }
                                iCeil2 = i42;
                            }
                            iCeil = 0;
                        }
                        if (c8713.f22135 == null) {
                            c8713.f22135 = new int[2];
                        }
                        boolean z = (iCeil2 == 0 && i38 == 1) || (iCeil == 0 && i38 == 0);
                        while (!z) {
                            if (i38 == 0) {
                                iCeil2 = (int) Math.ceil(i37 / iCeil);
                            } else {
                                iCeil = (int) Math.ceil(i37 / iCeil2);
                            }
                            C8708[] c8708Arr3 = c8713.f22136;
                            if (c8708Arr3 == null || c8708Arr3.length < iCeil) {
                                obj = null;
                                c8713.f22136 = new C8708[iCeil];
                            } else {
                                obj = null;
                                Arrays.fill(c8708Arr3, (Object) null);
                            }
                            C8708[] c8708Arr4 = c8713.f22142;
                            if (c8708Arr4 == null || c8708Arr4.length < iCeil2) {
                                c8713.f22142 = new C8708[iCeil2];
                            } else {
                                Arrays.fill(c8708Arr4, obj);
                            }
                            for (int i44 = 0; i44 < iCeil; i44++) {
                                for (int i45 = 0; i45 < iCeil2; i45++) {
                                    int i46 = (i45 * iCeil) + i44;
                                    if (i38 == 1) {
                                        i46 = (i44 * iCeil2) + i45;
                                    }
                                    if (i46 < c8708Arr2.length && (c8708 = c8708Arr2[i46]) != null) {
                                        int iM138562 = c8713.m13856(c8708, i29);
                                        C8708 c87087 = c8713.f22136[i44];
                                        if (c87087 == null || c87087.m13834() < iM138562) {
                                            c8713.f22136[i44] = c8708;
                                        }
                                        int iM138582 = c8713.m13858(c8708, i29);
                                        C8708 c87088 = c8713.f22142[i45];
                                        if (c87088 == null || c87088.m13838() < iM138582) {
                                            c8713.f22142[i45] = c8708;
                                        }
                                    }
                                }
                            }
                            int iM138563 = 0;
                            for (int i47 = 0; i47 < iCeil; i47++) {
                                C8708 c87089 = c8713.f22136[i47];
                                if (c87089 != null) {
                                    if (i47 > 0) {
                                        iM138563 += c8713.f22152;
                                    }
                                    iM138563 = c8713.m13856(c87089, i29) + iM138563;
                                }
                            }
                            int iM138583 = 0;
                            for (int i48 = 0; i48 < iCeil2; i48++) {
                                C8708 c870810 = c8713.f22142[i48];
                                if (c870810 != null) {
                                    if (i48 > 0) {
                                        iM138583 += c8713.f22156;
                                    }
                                    iM138583 = c8713.m13858(c870810, i29) + iM138583;
                                }
                            }
                            iArr[0] = iM138563;
                            iArr[1] = iM138583;
                            if (i38 == 0) {
                                if (iM138563 <= i29 || iCeil <= 1) {
                                    z = true;
                                } else {
                                    iCeil--;
                                }
                            } else if (iM138583 <= i29 || iCeil2 <= 1) {
                                z = true;
                            } else {
                                iCeil2--;
                            }
                        }
                        int[] iArr3 = c8713.f22135;
                        iArr3[0] = iCeil;
                        iArr3[1] = iCeil2;
                        c2 = 1;
                    } else if (i9 != 3) {
                        i11 = i27;
                        iArr = iArr2;
                        i12 = size2;
                        i10 = i25;
                        i13 = i26;
                        i14 = i8;
                        c = 0;
                        c2 = 1;
                    } else {
                        int i49 = c8713.f22144;
                        if (i7 == 0) {
                            i11 = i27;
                            iArr = iArr2;
                            c3 = 1;
                            i12 = size2;
                            i10 = i25;
                            i13 = i26;
                            i14 = i8;
                        } else {
                            arrayList3.clear();
                            int i50 = i7;
                            i10 = i25;
                            c3 = 1;
                            i11 = i27;
                            i13 = i26;
                            i14 = i8;
                            iArr = iArr2;
                            C8714 c87143 = new C8714(c8713, i49, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, i29);
                            arrayList3.add(c87143);
                            if (i49 == 0) {
                                int i51 = 0;
                                int i52 = 0;
                                i18 = 0;
                                int i53 = 0;
                                while (i51 < i50) {
                                    i52++;
                                    C8708 c870811 = c8708Arr2[i51];
                                    int iM138564 = c8713.m13856(c870811, i29);
                                    int i54 = i49;
                                    int i55 = i51;
                                    if (c870811.f22040[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                        i18++;
                                    }
                                    int i56 = i18;
                                    boolean z2 = (i53 == i29 || (c8713.f22152 + i53) + iM138564 > i29) && c87143.f22175 != null;
                                    if (!z2 && i55 > 0 && (i22 = c8713.f22143) > 0 && i52 > i22) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        i49 = i54;
                                        i20 = size2;
                                        i21 = i55;
                                        c87143 = new C8714(c8713, i49, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, i29);
                                        c87143.f22177 = i21;
                                        arrayList3.add(c87143);
                                        i52 = 1;
                                    } else {
                                        i49 = i54;
                                        i20 = size2;
                                        i21 = i55;
                                        if (i21 > 0) {
                                            i53 = c8713.f22152 + iM138564 + i53;
                                        }
                                        c87143.m13865(c870811);
                                        i51 = i21 + 1;
                                        i18 = i56;
                                        size2 = i20;
                                    }
                                    i53 = iM138564;
                                    c87143.m13865(c870811);
                                    i51 = i21 + 1;
                                    i18 = i56;
                                    size2 = i20;
                                }
                                i12 = size2;
                            } else {
                                i12 = size2;
                                int i57 = 0;
                                int i58 = 0;
                                int i59 = 0;
                                int i60 = 0;
                                while (i57 < i50) {
                                    i58++;
                                    C8708 c870812 = c8708Arr2[i57];
                                    int iM138584 = c8713.m13858(c870812, i29);
                                    int i61 = i49;
                                    if (c870812.f22040[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                        i59++;
                                    }
                                    int i62 = i59;
                                    boolean z3 = (i60 == i29 || (c8713.f22156 + i60) + iM138584 > i29) && c87143.f22175 != null;
                                    if (!z3 && i57 > 0 && (i19 = c8713.f22143) > 0 && i58 > i19) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        i49 = i61;
                                        c87143 = new C8714(c8713, i49, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, i29);
                                        c87143.f22177 = i57;
                                        arrayList3.add(c87143);
                                        i58 = 1;
                                    } else {
                                        i49 = i61;
                                        if (i57 > 0) {
                                            i60 = c8713.f22156 + iM138584 + i60;
                                        }
                                        c87143.m13865(c870812);
                                        i57++;
                                        i59 = i62;
                                    }
                                    i60 = iM138584;
                                    c87143.m13865(c870812);
                                    i57++;
                                    i59 = i62;
                                }
                                i18 = i59;
                            }
                            int size3 = arrayList3.size();
                            int i63 = c8713.f22161;
                            int i64 = c8713.f22170;
                            int i65 = c8713.f22162;
                            int i66 = c8713.f22169;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[0];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            boolean z4 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour3;
                            if (i18 > 0 && z4) {
                                for (int i67 = 0; i67 < size3; i67++) {
                                    C8714 c87144 = (C8714) arrayList3.get(i67);
                                    if (i49 == 0) {
                                        c87144.m13861(i29 - c87144.m13862());
                                    } else {
                                        c87144.m13861(i29 - c87144.m13863());
                                    }
                                }
                            }
                            int i68 = i63;
                            int i69 = i64;
                            int i70 = i65;
                            int i71 = i66;
                            C8710 c871011 = c87108;
                            C8710 c871012 = c87109;
                            C8710 c871013 = c871010;
                            C8710 c871014 = c87104;
                            int iMax = 0;
                            int i72 = 0;
                            for (int i73 = 0; i73 < size3; i73++) {
                                C8714 c87145 = (C8714) arrayList3.get(i73);
                                if (i49 == 0) {
                                    if (i73 < size3 - 1) {
                                        c871013 = ((C8714) arrayList3.get(i73 + 1)).f22175.f22054;
                                        i71 = 0;
                                    } else {
                                        i71 = c8713.f22169;
                                        c871013 = c871010;
                                    }
                                    C8710 c871015 = c87145.f22175.f22044;
                                    c87145.m13860(i49, c871011, c871014, c871012, c871013, i68, i69, i70, i71, i29);
                                    iMax = Math.max(iMax, c87145.m13862());
                                    int iM13863 = c87145.m13863() + i72;
                                    if (i73 > 0) {
                                        iM13863 += c8713.f22156;
                                    }
                                    i72 = iM13863;
                                    c871014 = c871015;
                                    i69 = 0;
                                } else {
                                    if (i73 < size3 - 1) {
                                        c871012 = ((C8714) arrayList3.get(i73 + 1)).f22175.f22055;
                                        i70 = 0;
                                    } else {
                                        i70 = c8713.f22162;
                                        c871012 = c87109;
                                    }
                                    C8710 c871016 = c87145.f22175.f22045;
                                    c87145.m13860(i49, c871011, c871014, c871012, c871013, i68, i69, i70, i71, i29);
                                    int iM13862 = c87145.m13862() + iMax;
                                    int iMax2 = Math.max(i72, c87145.m13863());
                                    if (i73 > 0) {
                                        iM13862 += c8713.f22152;
                                    }
                                    i72 = iMax2;
                                    iMax = iM13862;
                                    c871011 = c871016;
                                    i68 = 0;
                                }
                            }
                            iArr[0] = iMax;
                            iArr[1] = i72;
                        }
                        c2 = c3;
                    }
                    c = 0;
                } else {
                    i10 = i25;
                    i11 = i27;
                    iArr = iArr2;
                    i12 = size2;
                    i13 = i26;
                    i14 = i8;
                    int i74 = i7;
                    int i75 = c8713.f22144;
                    if (i74 != 0) {
                        arrayList3.clear();
                        C8714 c87146 = new C8714(c8713, i75, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, i29);
                        arrayList3.add(c87146);
                        if (i75 == 0) {
                            int i76 = 0;
                            i15 = 0;
                            int i77 = 0;
                            while (i76 < i74) {
                                C8708 c870813 = c8708Arr2[i76];
                                int iM138565 = c8713.m13856(c870813, i29);
                                if (c870813.f22040[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                    i15++;
                                }
                                int i78 = i15;
                                boolean z5 = (i77 == i29 || (c8713.f22152 + i77) + iM138565 > i29) && c87146.f22175 != null;
                                if (!z5 && i76 > 0 && (i17 = c8713.f22143) > 0 && i76 % i17 == 0) {
                                    z5 = true;
                                }
                                if (z5) {
                                    c87146 = new C8714(c8713, i75, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, i29);
                                    c87146.f22177 = i76;
                                    arrayList3.add(c87146);
                                } else {
                                    if (i76 > 0) {
                                        i77 = c8713.f22152 + iM138565 + i77;
                                    }
                                    c87146.m13865(c870813);
                                    i76++;
                                    i15 = i78;
                                }
                                i77 = iM138565;
                                c87146.m13865(c870813);
                                i76++;
                                i15 = i78;
                            }
                        } else {
                            int i79 = 0;
                            i15 = 0;
                            int i80 = 0;
                            while (i79 < i74) {
                                C8708 c870814 = c8708Arr2[i79];
                                int iM138585 = c8713.m13858(c870814, i29);
                                if (c870814.f22040[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                    i15++;
                                }
                                int i81 = i15;
                                boolean z6 = (i80 == i29 || (c8713.f22156 + i80) + iM138585 > i29) && c87146.f22175 != null;
                                if (!z6 && i79 > 0 && (i16 = c8713.f22143) > 0 && i79 % i16 == 0) {
                                    z6 = true;
                                }
                                if (z6) {
                                    c87146 = new C8714(c8713, i75, c8713.f22055, c8713.f22054, c8713.f22045, c8713.f22044, i29);
                                    c87146.f22177 = i79;
                                    arrayList3.add(c87146);
                                } else {
                                    if (i79 > 0) {
                                        i80 = c8713.f22156 + iM138585 + i80;
                                    }
                                    c87146.m13865(c870814);
                                    i79++;
                                    i15 = i81;
                                }
                                i80 = iM138585;
                                c87146.m13865(c870814);
                                i79++;
                                i15 = i81;
                            }
                        }
                        int size4 = arrayList3.size();
                        int i82 = c8713.f22161;
                        int i83 = c8713.f22170;
                        int i84 = c8713.f22162;
                        int i85 = c8713.f22169;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr[0];
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                        boolean z7 = constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour5;
                        if (i15 > 0 && z7) {
                            for (int i86 = 0; i86 < size4; i86++) {
                                C8714 c87147 = (C8714) arrayList3.get(i86);
                                if (i75 == 0) {
                                    c87147.m13861(i29 - c87147.m13862());
                                } else {
                                    c87147.m13861(i29 - c87147.m13863());
                                }
                            }
                        }
                        int i87 = i82;
                        int i88 = i83;
                        int i89 = i84;
                        int i90 = i85;
                        C8710 c871017 = c87108;
                        C8710 c871018 = c87109;
                        C8710 c871019 = c871010;
                        C8710 c871020 = c87104;
                        int iMax3 = 0;
                        int i91 = 0;
                        for (int i92 = 0; i92 < size4; i92++) {
                            C8714 c87148 = (C8714) arrayList3.get(i92);
                            if (i75 == 0) {
                                if (i92 < size4 - 1) {
                                    c871019 = ((C8714) arrayList3.get(i92 + 1)).f22175.f22054;
                                    i90 = 0;
                                } else {
                                    i90 = c8713.f22169;
                                    c871019 = c871010;
                                }
                                C8710 c871021 = c87148.f22175.f22044;
                                c87148.m13860(i75, c871017, c871020, c871018, c871019, i87, i88, i89, i90, i29);
                                iMax3 = Math.max(iMax3, c87148.m13862());
                                int iM138632 = c87148.m13863() + i91;
                                if (i92 > 0) {
                                    iM138632 += c8713.f22156;
                                }
                                i91 = iM138632;
                                c871020 = c871021;
                                i88 = 0;
                            } else {
                                if (i92 < size4 - 1) {
                                    c871018 = ((C8714) arrayList3.get(i92 + 1)).f22175.f22055;
                                    i89 = 0;
                                } else {
                                    i89 = c8713.f22162;
                                    c871018 = c87109;
                                }
                                C8710 c871022 = c87148.f22175.f22045;
                                c87148.m13860(i75, c871017, c871020, c871018, c871019, i87, i88, i89, i90, i29);
                                int iM138622 = c87148.m13862() + iMax3;
                                int iMax4 = Math.max(i91, c87148.m13863());
                                if (i92 > 0) {
                                    iM138622 += c8713.f22152;
                                }
                                i91 = iMax4;
                                iMax3 = iM138622;
                                c871017 = c871022;
                                i87 = 0;
                            }
                        }
                        iArr[0] = iMax3;
                        iArr[1] = i91;
                    }
                    c2 = 1;
                    c = 0;
                }
                int i93 = iArr[c] + i10 + i13;
                int i94 = iArr[c2] + i14 + i11;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i93, size) : mode == 0 ? i93 : 0;
                }
                int iMin = mode2 != 1073741824 ? i12 : mode2 == Integer.MIN_VALUE ? Math.min(i94, i12) : mode2 == 0 ? i94 : 0;
                c8713.f22160 = size;
                c8713.f22148 = iMin;
                c8713.m13808(size);
                c8713.m13809(iMin);
                c8713.f22159 = c8713.f22189 <= 0 ? c2 : 0;
            }
        } else {
            C8710 c871082 = c87105;
            C8710 c871092 = c87106;
            C8710 c8710102 = c87107;
            ArrayList arrayList32 = arrayList2;
            int i252 = c8713.f22161;
            int i262 = c8713.f22162;
            i3 = c8713.f22170;
            int i272 = c8713.f22169;
            int[] iArr22 = new int[2];
            int i282 = (size - i252) - i262;
            i4 = c8713.f22144;
            if (i4 == 1) {
            }
            int i292 = i282;
            int i302 = c8713.f22149;
            if (i4 != 0) {
            }
            C8708[] c8708Arr5 = c8713.f22190;
            i5 = 0;
            i6 = 0;
            while (true) {
                i7 = c8713.f22189;
                i8 = i3;
                if (i5 < i7) {
                }
                i5++;
                i3 = i8;
            }
            if (i6 > 0) {
            }
            C8708[] c8708Arr22 = c8708Arr5;
            c8713.f22138 = c8708Arr22;
            c8713.f22137 = i7;
            i9 = c8713.f22139;
            if (i9 != 0) {
            }
            int i932 = iArr[c] + i10 + i13;
            int i942 = iArr[c2] + i14 + i11;
            if (mode != 1073741824) {
            }
            if (mode2 != 1073741824) {
            }
            c8713.f22160 = size;
            c8713.f22148 = iMin;
            c8713.m13808(size);
            c8713.m13809(iMin);
            c8713.f22159 = c8713.f22189 <= 0 ? c2 : 0;
        }
        setMeasuredDimension(c8713.f22160, c8713.f22148);
    }
}
