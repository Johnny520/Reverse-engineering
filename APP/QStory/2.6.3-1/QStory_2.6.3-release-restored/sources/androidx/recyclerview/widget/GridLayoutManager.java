package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.selection.C1758;
import androidx.core.view.AbstractC3103;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p025.AbstractC7012;
import p140.C8242;
import p171.C8436;
import p171.C8439;
import p289.C9167;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final Set f7486 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f7487;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int[] f7488;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7489;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f7490;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f7491;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final SparseIntArray f7492;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public View[] f7493;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final Rect f7494;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public int f7495;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final SparseIntArray f7496;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public AbstractC3334 f7497;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7489 = false;
        this.f7487 = -1;
        this.f7492 = new SparseIntArray();
        this.f7496 = new SparseIntArray();
        this.f7497 = new C3336();
        this.f7494 = new Rect();
        this.f7495 = -1;
        this.f7491 = -1;
        this.f7490 = -1;
        m5190(AbstractC3352.m5542(context, attributeSet, i, i2).f7942);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int mo5160(C3364 c3364, C3358 c3358) {
        if (this.f7512 == 0) {
            return Math.min(this.f7487, m5554());
        }
        if (c3358.m5585() < 1) {
            return 0;
        }
        return m5199(c3358.m5585() - 1, c3364, c3358) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3351 mo5161() {
        return this.f7512 == 0 ? new C3333(-2, -1) : new C3333(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int mo5162(C3358 c3358) {
        return m5217(c3358);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int mo5163(C3358 c3358) {
        return m5220(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int mo5164(C3364 c3364, C3358 c3358) {
        if (this.f7512 == 1) {
            return Math.min(this.f7487, m5554());
        }
        if (c3358.m5585() < 1) {
            return 0;
        }
        return m5199(c3358.m5585() - 1, c3364, c3358) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C3351 mo5165(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C3333 c3333 = new C3333((ViewGroup.MarginLayoutParams) layoutParams);
            c3333.f7831 = -1;
            c3333.f7832 = 0;
            return c3333;
        }
        C3333 c33332 = new C3333(layoutParams);
        c33332.f7831 = -1;
        c33332.f7832 = 0;
        return c33332;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C3351 mo5166(Context context, AttributeSet attributeSet) {
        C3333 c3333 = new C3333(context, attributeSet);
        c3333.f7831 = -1;
        c3333.f7832 = 0;
        return c3333;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void mo5167(C3364 c3364, C3358 c3358, C3302 c3302, C3303 c3303) {
        int i;
        int i2;
        int i3;
        int iMo5397;
        int paddingLeft;
        int paddingTop;
        int iM5549;
        int iM55492;
        boolean z;
        int i4;
        View viewM5433;
        int iMo5408 = this.f7510.mo5408();
        boolean z2 = iMo5408 != 1073741824;
        int i5 = m5557() > 0 ? this.f7488[this.f7487] : 0;
        if (z2) {
            m5193();
        }
        boolean z3 = c3302.f7704 == 1;
        int iM5196 = this.f7487;
        if (!z3) {
            iM5196 = m5196(c3302.f7705, c3364, c3358) + m5197(c3302.f7705, c3364, c3358);
        }
        int i6 = 0;
        while (i6 < this.f7487 && (i4 = c3302.f7705) >= 0 && i4 < c3358.m5585() && iM5196 > 0) {
            int i7 = c3302.f7705;
            int iM5197 = m5197(i7, c3364, c3358);
            if (iM5197 > this.f7487) {
                C6755.m11869(AbstractC0900.m707(AbstractC0900.m709(i7, iM5197, "Item at position ", " requires ", " spans but GridLayoutManager has only "), " spans.", this.f7487));
                return;
            }
            iM5196 -= iM5197;
            if (iM5196 < 0 || (viewM5433 = c3302.m5433(c3364)) == null) {
                break;
            }
            this.f7493[i6] = viewM5433;
            i6++;
        }
        if (i6 == 0) {
            c3303.f7717 = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f7493[i];
            C3333 c3333 = (C3333) view.getLayoutParams();
            int iM51972 = m5197(AbstractC3352.m5543(view), c3364, c3358);
            c3333.f7832 = iM51972;
            c3333.f7831 = i8;
            i8 += iM51972;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f7493[i10];
            if (c3302.f7711 != null) {
                z = false;
                if (z3) {
                    m5573(view2, -1, true);
                } else {
                    m5573(view2, 0, true);
                }
            } else if (z3) {
                m5575(view2);
                z = false;
            } else {
                z = false;
                m5573(view2, 0, false);
            }
            m5574(this.f7494, view2);
            m5191(view2, iMo5408, z);
            int iMo5398 = this.f7510.mo5398(view2);
            if (iMo5398 > i9) {
                i9 = iMo5398;
            }
            float fMo5397 = (this.f7510.mo5397(view2) * 1.0f) / ((C3333) view2.getLayoutParams()).f7832;
            if (fMo5397 > f) {
                f = fMo5397;
            }
        }
        if (z2) {
            m5202(Math.max(Math.round(f * this.f7487), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f7493[i11];
                m5191(view3, 1073741824, true);
                int iMo53982 = this.f7510.mo5398(view3);
                if (iMo53982 > i9) {
                    i9 = iMo53982;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f7493[i12];
            if (this.f7510.mo5398(view4) != i9) {
                C3333 c33332 = (C3333) view4.getLayoutParams();
                Rect rect = c33332.f7922;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c33332).topMargin + ((ViewGroup.MarginLayoutParams) c33332).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c33332).leftMargin + ((ViewGroup.MarginLayoutParams) c33332).rightMargin;
                int iM5198 = m5198(c33332.f7831, c33332.f7832);
                if (this.f7512 == 1) {
                    iM55492 = AbstractC3352.m5549(false, iM5198, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c33332).width);
                    iM5549 = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM5549 = AbstractC3352.m5549(false, iM5198, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c33332).height);
                    iM55492 = iMakeMeasureSpec;
                }
                if (m5563(view4, iM55492, iM5549, (C3351) view4.getLayoutParams())) {
                    view4.measure(iM55492, iM5549);
                }
            }
        }
        c3303.f7718 = i9;
        int i15 = this.f7512;
        int i16 = c3302.f7703;
        int iMo53972 = c3302.f7707;
        if (i15 != 1) {
            if (i16 == -1) {
                paddingLeft = iMo53972 - i9;
                iMo5397 = iMo53972;
            } else {
                iMo5397 = iMo53972 + i9;
                paddingLeft = iMo53972;
            }
            paddingTop = 0;
            iMo53972 = 0;
        } else if (i16 == -1) {
            paddingTop = iMo53972 - i9;
            paddingLeft = 0;
            iMo5397 = 0;
        } else {
            paddingTop = iMo53972;
            iMo5397 = 0;
            iMo53972 += i9;
            paddingLeft = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.f7493;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            C3333 c33333 = (C3333) view5.getLayoutParams();
            if (this.f7512 != 1) {
                paddingTop = getPaddingTop() + this.f7488[c33333.f7831];
                iMo53972 = this.f7510.mo5397(view5) + paddingTop;
            } else if (m5213()) {
                int paddingLeft2 = getPaddingLeft() + this.f7488[this.f7487 - c33333.f7831];
                iMo5397 = paddingLeft2;
                paddingLeft = paddingLeft2 - this.f7510.mo5397(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f7488[c33333.f7831];
                iMo5397 = this.f7510.mo5397(view5) + paddingLeft;
            }
            AbstractC3352.m5552(view5, paddingLeft, paddingTop, iMo5397, iMo53972);
            if (c33333.f7924.isRemoved() || c33333.f7924.isUpdated()) {
                c3303.f7716 = true;
            }
            c3303.f7715 = view5.hasFocusable() | c3303.f7715;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void mo5168(C3364 c3364, C3358 c3358, C3304 c3304, int i) {
        m5193();
        if (c3358.m5585() > 0 && !c3358.f7962) {
            boolean z = i == 1;
            int iM5196 = m5196(c3304.f7722, c3364, c3358);
            if (z) {
                while (iM5196 > 0) {
                    int i2 = c3304.f7722;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c3304.f7722 = i3;
                    iM5196 = m5196(i3, c3364, c3358);
                }
            } else {
                int iM5585 = c3358.m5585() - 1;
                int i4 = c3304.f7722;
                while (i4 < iM5585) {
                    int i5 = i4 + 1;
                    int iM51962 = m5196(i5, c3364, c3358);
                    if (iM51962 <= iM5196) {
                        break;
                    }
                    i4 = i5;
                    iM5196 = iM51962;
                }
                c3304.f7722 = i4;
            }
        }
        m5203();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void mo5169(C3358 c3358, C3302 c3302, C1758 c1758) {
        int i;
        int iMo5520 = this.f7487;
        for (int i2 = 0; i2 < this.f7487 && (i = c3302.f7705) >= 0 && i < c3358.m5585() && iMo5520 > 0; i2++) {
            int i3 = c3302.f7705;
            c1758.m2388(i3, Math.max(0, c3302.f7710));
            iMo5520 -= this.f7497.mo5520(i3);
            c3302.f7705 += c3302.f7704;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final View mo5170(C3364 c3364, C3358 c3358, boolean z, boolean z2) {
        int i;
        int iM5557;
        int iM55572 = m5557();
        int i2 = 1;
        if (z2) {
            iM5557 = m5557() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM55572;
            iM5557 = 0;
        }
        int iM5585 = c3358.m5585();
        m5209();
        int iMo5405 = this.f7510.mo5405();
        int iMo5404 = this.f7510.mo5404();
        View view = null;
        View view2 = null;
        while (iM5557 != i) {
            View viewM5558 = m5558(iM5557);
            int iM5543 = AbstractC3352.m5543(viewM5558);
            if (iM5543 >= 0 && iM5543 < iM5585 && m5196(iM5543, c3364, c3358) == 0) {
                if (((C3351) viewM5558.getLayoutParams()).f7924.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewM5558;
                    }
                } else {
                    if (this.f7510.mo5396(viewM5558) < iMo5404 && this.f7510.mo5399(viewM5558) >= iMo5405) {
                        return viewM5558;
                    }
                    if (view == null) {
                        view = viewM5558;
                    }
                }
            }
            iM5557 += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final int mo5171(int i, C3364 c3364, C3358 c3358) {
        m5193();
        m5203();
        return super.mo5171(i, c3364, c3358);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final boolean mo5172() {
        return this.f7501 == null && !this.f7489;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo5173(int i, Bundle bundle) {
        View viewM5558;
        AbstractC3317 abstractC3317M5268;
        int iIntValue;
        int i2;
        if (i == C8439.f20980.m13408() && i != -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= m5557()) {
                    viewM5558 = null;
                    break;
                }
                View viewM55582 = m5558(i3);
                Objects.requireNonNull(viewM55582);
                if (viewM55582.isAccessibilityFocused()) {
                    viewM5558 = m5558(i3);
                    break;
                }
                i3++;
            }
            if (viewM5558 != null && bundle != null) {
                int i4 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f7486.contains(Integer.valueOf(i4)) && (abstractC3317M5268 = this.f7937.m5268(viewM5558)) != null) {
                    int absoluteAdapterPosition = abstractC3317M5268.getAbsoluteAdapterPosition();
                    int iM5201 = m5201(absoluteAdapterPosition);
                    int iM5200 = m5200(absoluteAdapterPosition);
                    if (iM5201 >= 0 && iM5200 >= 0) {
                        if (!m5195(absoluteAdapterPosition).contains(Integer.valueOf(this.f7491)) || !m5194(m5200(absoluteAdapterPosition), absoluteAdapterPosition).contains(Integer.valueOf(this.f7490))) {
                            this.f7491 = iM5201;
                            this.f7490 = iM5200;
                        }
                        int i5 = this.f7491;
                        if (i5 == -1) {
                            i5 = iM5201;
                        }
                        int i6 = this.f7490;
                        if (i6 != -1) {
                            iM5200 = i6;
                        }
                        if (i4 == 17) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (iIntValue >= 0) {
                                int iM52012 = m5201(iIntValue);
                                int iM52002 = m5200(iIntValue);
                                if (iM52012 < 0 || iM52002 < 0) {
                                    break;
                                }
                                if (this.f7512 != 1) {
                                    if (m5195(iIntValue).contains(Integer.valueOf(i5)) && iM52002 < iM5200) {
                                        this.f7490 = iM52002;
                                        break;
                                    }
                                    iIntValue--;
                                } else {
                                    if ((iM52012 == i5 && iM52002 < iM5200) || iM52012 < i5) {
                                        this.f7491 = iM52012;
                                        this.f7490 = iM52002;
                                        break;
                                    }
                                    iIntValue--;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1) {
                            }
                            if (iIntValue != -1) {
                            }
                        } else if (i4 == 33) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (iIntValue >= 0) {
                                int iM52013 = m5201(iIntValue);
                                int iM52003 = m5200(iIntValue);
                                if (iM52013 < 0 || iM52003 < 0) {
                                    break;
                                }
                                if (this.f7512 != 1) {
                                    if (iM52013 < i5 && iM52003 == iM5200) {
                                        this.f7491 = ((Integer) Collections.max(m5195(iIntValue))).intValue();
                                        break;
                                    }
                                    iIntValue--;
                                } else {
                                    if (iM52013 < i5 && m5194(m5200(iIntValue), iIntValue).contains(Integer.valueOf(iM5200))) {
                                        this.f7491 = iM52013;
                                        break;
                                    }
                                    iIntValue--;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1) {
                            }
                            if (iIntValue != -1) {
                            }
                        } else if (i4 == 66) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (iIntValue < m5554()) {
                                int iM52014 = m5201(iIntValue);
                                int iM52004 = m5200(iIntValue);
                                if (iM52014 < 0 || iM52004 < 0) {
                                    break;
                                }
                                if (this.f7512 != 1) {
                                    if (iM52004 > iM5200 && m5195(iIntValue).contains(Integer.valueOf(i5))) {
                                        this.f7490 = iM52004;
                                        break;
                                    }
                                    iIntValue++;
                                } else {
                                    if ((iM52014 == i5 && iM52004 > iM5200) || iM52014 > i5) {
                                        this.f7491 = iM52014;
                                        this.f7490 = iM52004;
                                        break;
                                    }
                                    iIntValue++;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1) {
                                if (i4 != 17) {
                                }
                            }
                            if (iIntValue != -1) {
                            }
                        } else if (i4 == 130) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (iIntValue < m5554()) {
                                int iM52015 = m5201(iIntValue);
                                int iM52005 = m5200(iIntValue);
                                if (iM52015 < 0 || iM52005 < 0) {
                                    break;
                                }
                                if (this.f7512 != 1) {
                                    if (iM52015 > i5 && iM52005 == iM5200) {
                                        this.f7491 = m5201(iIntValue);
                                        break;
                                    }
                                    iIntValue++;
                                } else {
                                    if (iM52015 > i5 && (iM52005 == iM5200 || m5194(m5200(iIntValue), iIntValue).contains(Integer.valueOf(iM5200)))) {
                                        this.f7491 = iM52015;
                                        break;
                                    }
                                    iIntValue++;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1 && (i2 = this.f7512) == 0) {
                                if (i4 != 17) {
                                    if (iM5201 >= 0 && i2 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i7 = 0;
                                        loop2: while (true) {
                                            if (i7 >= m5554()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int iIntValue2 = num.intValue();
                                                    if (iIntValue2 < iM5201) {
                                                        iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                        this.f7491 = iIntValue2;
                                                        this.f7490 = m5200(iIntValue);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (Integer num2 : m5195(i7)) {
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i7));
                                                }
                                                i7++;
                                            }
                                        }
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else if (i4 == 66) {
                                    if (iM5201 >= 0 && i2 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i8 = 0;
                                        loop5: while (true) {
                                            if (i8 >= m5554()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int iIntValue3 = num3.intValue();
                                                    if (iIntValue3 > iM5201) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f7491 = iIntValue3;
                                                        this.f7490 = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (Integer num4 : m5195(i8)) {
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i8));
                                                    }
                                                }
                                                i8++;
                                            }
                                        }
                                        iIntValue = -1;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                mo5226(iIntValue);
                                this.f7495 = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.mo5173(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iMo5354 = this.f7937.f7539.mo5354();
                int i11 = 0;
                while (true) {
                    if (i11 >= iMo5354) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f7937;
                    int iM5196 = m5196(i11, recyclerView.f7576, recyclerView.f7586);
                    RecyclerView recyclerView2 = this.f7937;
                    int iM5199 = m5199(i11, recyclerView2.f7576, recyclerView2.f7586);
                    if (this.f7512 != 1) {
                        if (iM5196 == i9 && iM5199 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iM5196 == i10 && iM5199 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    m5244(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void mo5174(Rect rect, int i, int i2) {
        int iM5550;
        int iM55502;
        if (this.f7488 == null) {
            super.mo5174(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7512 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f7937;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            iM55502 = AbstractC3352.m5550(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f7488;
            iM5550 = AbstractC3352.m5550(i, iArr[iArr.length - 1] + paddingRight, this.f7937.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f7937;
            WeakHashMap weakHashMap2 = AbstractC3103.f6939;
            iM5550 = AbstractC3352.m5550(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f7488;
            iM55502 = AbstractC3352.m5550(i2, iArr2[iArr2.length - 1] + paddingBottom, this.f7937.getMinimumHeight());
        }
        this.f7937.setMeasuredDimension(iM5550, iM55502);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final int mo5175(int i, C3364 c3364, C3358 c3358) {
        m5193();
        m5203();
        return super.mo5175(i, c3364, c3358);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int mo5176(C3358 c3358) {
        return m5220(c3358);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int mo5177(C3358 c3358) {
        return m5217(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean mo5178(C3351 c3351) {
        return c3351 instanceof C3333;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013f, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0141, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0142, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo5179(View view, int i, C3364 c3364, C3358 c3358) {
        View viewM5279;
        int iM5557;
        int i2;
        int iM55572;
        View view2;
        int i3;
        int i4;
        C3364 c33642 = c3364;
        C3358 c33582 = c3358;
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null || (viewM5279 = recyclerView.m5279(view)) == null || ((ArrayList) this.f7939.f7814).contains(viewM5279)) {
            viewM5279 = null;
        }
        if (viewM5279 != null) {
            C3333 c3333 = (C3333) viewM5279.getLayoutParams();
            int i5 = c3333.f7831;
            int i6 = c3333.f7832 + i5;
            if (super.mo5179(view, i, c3364, c3358) != null) {
                if ((m5218(i) == 1) != this.f7507) {
                    iM55572 = m5557() - 1;
                    iM5557 = -1;
                    i2 = -1;
                } else {
                    iM5557 = m5557();
                    i2 = 1;
                    iM55572 = 0;
                }
                boolean z = this.f7512 == 1 && m5213();
                int iM5199 = m5199(iM55572, c33642, c33582);
                View view3 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM55572;
                int iMin2 = 0;
                View view4 = null;
                while (true) {
                    View view5 = view4;
                    if (i9 == iM5557) {
                        break;
                    }
                    int iM51992 = m5199(i9, c33642, c33582);
                    View viewM5558 = m5558(i9);
                    if (viewM5558 == viewM5279) {
                        break;
                    }
                    if (!viewM5558.hasFocusable() || iM51992 == iM5199) {
                        C3333 c33332 = (C3333) viewM5558.getLayoutParams();
                        int i10 = c33332.f7831;
                        view2 = viewM5279;
                        int i11 = c33332.f7832 + i10;
                        if (viewM5558.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM5558;
                        }
                        if (!(viewM5558.hasFocusable() && view3 == null) && (viewM5558.hasFocusable() || view5 != null)) {
                            i3 = iM5557;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM5558.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view3 == null) {
                                i4 = iMin;
                                if (!this.f7938.m5486(viewM5558) || !this.f7932.m5486(viewM5558)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = iMin;
                            }
                            i9 += i2;
                            c33642 = c3364;
                            c33582 = c3358;
                            viewM5279 = view2;
                            iM5557 = i3;
                        } else {
                            i4 = iMin;
                            i3 = iM5557;
                        }
                        boolean zHasFocusable = viewM5558.hasFocusable();
                        int i12 = c33332.f7831;
                        if (zHasFocusable) {
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view3 = viewM5558;
                            i8 = i12;
                            view4 = view5;
                        } else {
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                            i7 = i12;
                            iMin = i4;
                            view4 = viewM5558;
                        }
                        i9 += i2;
                        c33642 = c3364;
                        c33582 = c3358;
                        viewM5279 = view2;
                        iM5557 = i3;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewM5279;
                        i4 = iMin;
                        i3 = iM5557;
                    }
                    view4 = view5;
                    iMin = i4;
                    i9 += i2;
                    c33642 = c3364;
                    c33582 = c3358;
                    viewM5279 = view2;
                    iM5557 = i3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo5180(C3364 c3364, C3358 c3358) {
        boolean z = c3358.f7962;
        SparseIntArray sparseIntArray = this.f7496;
        SparseIntArray sparseIntArray2 = this.f7492;
        if (z) {
            int iM5557 = m5557();
            for (int i = 0; i < iM5557; i++) {
                C3333 c3333 = (C3333) m5558(i).getLayoutParams();
                int layoutPosition = c3333.f7924.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c3333.f7832);
                sparseIntArray.put(layoutPosition, c3333.f7831);
            }
        }
        super.mo5180(c3364, c3358);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void mo5181(RecyclerView recyclerView, int i, int i2) {
        this.f7497.m5519();
        this.f7497.f7833.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo5182(C3358 c3358) {
        View viewMo5204;
        super.mo5182(c3358);
        this.f7489 = false;
        int i = this.f7495;
        if (i == -1 || (viewMo5204 = mo5204(i)) == null) {
            return;
        }
        viewMo5204.sendAccessibilityEvent(67108864);
        this.f7495 = -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo5183(int i, int i2) {
        this.f7497.m5519();
        this.f7497.f7833.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void mo5184(int i, int i2) {
        this.f7497.m5519();
        this.f7497.f7833.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void mo5185(C3364 c3364, C3358 c3358, View view, C8436 c8436) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C3333)) {
            m5578(view, c8436);
            return;
        }
        C3333 c3333 = (C3333) layoutParams;
        int iM5199 = m5199(c3333.f7924.getLayoutPosition(), c3364, c3358);
        int i = this.f7512;
        int i2 = c3333.f7831;
        int i3 = c3333.f7832;
        if (i == 0) {
            c8436.m13400(C8242.m13201(false, i2, i3, iM5199, 1));
        } else {
            c8436.m13400(C8242.m13201(false, iM5199, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void mo5186(int i, int i2) {
        this.f7497.m5519();
        this.f7497.f7833.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void mo5187() {
        this.f7497.m5519();
        this.f7497.f7833.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void mo5188(C3364 c3364, C3358 c3358, C8436 c8436) {
        super.mo5188(c3364, c3358, c8436);
        c8436.m13402(GridView.class.getName());
        AbstractC3283 abstractC3283 = this.f7937.f7539;
        if (abstractC3283 == null || abstractC3283.mo5354() <= 1) {
            return;
        }
        c8436.m13393(C8439.f20980);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public final void mo5189(boolean z) {
        if (z) {
            C6755.m11867("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.mo5189(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public final void m5190(int i) {
        if (i == this.f7487) {
            return;
        }
        this.f7489 = true;
        if (i < 1) {
            C6755.m11869(AbstractC7012.m12147(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.f7487 = i;
        this.f7497.m5519();
        m5561();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public final void m5191(View view, int i, boolean z) {
        int iM5549;
        int iM55492;
        C3333 c3333 = (C3333) view.getLayoutParams();
        Rect rect = c3333.f7922;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c3333).topMargin + ((ViewGroup.MarginLayoutParams) c3333).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c3333).leftMargin + ((ViewGroup.MarginLayoutParams) c3333).rightMargin;
        int iM5198 = m5198(c3333.f7831, c3333.f7832);
        if (this.f7512 == 1) {
            iM55492 = AbstractC3352.m5549(false, iM5198, i, i3, ((ViewGroup.MarginLayoutParams) c3333).width);
            iM5549 = AbstractC3352.m5549(true, this.f7510.mo5406(), this.f7927, i2, ((ViewGroup.MarginLayoutParams) c3333).height);
        } else {
            int iM55493 = AbstractC3352.m5549(false, iM5198, i, i2, ((ViewGroup.MarginLayoutParams) c3333).height);
            int iM55494 = AbstractC3352.m5549(true, this.f7510.mo5406(), this.f7928, i3, ((ViewGroup.MarginLayoutParams) c3333).width);
            iM5549 = iM55493;
            iM55492 = iM55494;
        }
        C3351 c3351 = (C3351) view.getLayoutParams();
        if (z ? m5563(view, iM55492, iM5549, c3351) : m5564(view, iM55492, iM5549, c3351)) {
            view.measure(iM55492, iM5549);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    public void mo5192(C9167 c9167) {
        this.f7497 = c9167;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public final void m5193() {
        int paddingBottom;
        int paddingTop;
        if (this.f7512 == 1) {
            paddingBottom = this.f7926 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.f7925 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m5202(paddingBottom - paddingTop);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public final HashSet m5194(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f7937;
        int iM5197 = m5197(i2, recyclerView.f7576, recyclerView.f7586);
        for (int i3 = i; i3 < i + iM5197; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
    public final HashSet m5195(int i) {
        return m5194(m5201(i), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public final int m5196(int i, C3364 c3364, C3358 c3358) {
        if (!c3358.f7962) {
            return this.f7497.mo5521(i, this.f7487);
        }
        int i2 = this.f7496.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM5593 = c3364.m5593(i);
        if (iM5593 != -1) {
            return this.f7497.mo5521(iM5593, this.f7487);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public final int m5197(int i, C3364 c3364, C3358 c3358) {
        if (!c3358.f7962) {
            return this.f7497.mo5520(i);
        }
        int i2 = this.f7492.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM5593 = c3364.m5593(i);
        if (iM5593 != -1) {
            return this.f7497.mo5520(iM5593);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public final int m5198(int i, int i2) {
        if (this.f7512 != 1 || !m5213()) {
            int[] iArr = this.f7488;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f7488;
        int i3 = this.f7487;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public final int m5199(int i, C3364 c3364, C3358 c3358) {
        if (!c3358.f7962) {
            return this.f7497.m5522(i, this.f7487);
        }
        int iM5593 = c3364.m5593(i);
        if (iM5593 != -1) {
            return this.f7497.m5522(iM5593, this.f7487);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public final int m5200(int i) {
        int i2 = this.f7512;
        RecyclerView recyclerView = this.f7937;
        return i2 == 0 ? m5199(i, recyclerView.f7576, recyclerView.f7586) : m5196(i, recyclerView.f7576, recyclerView.f7586);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public final int m5201(int i) {
        int i2 = this.f7512;
        RecyclerView recyclerView = this.f7937;
        return i2 == 1 ? m5199(i, recyclerView.f7576, recyclerView.f7586) : m5196(i, recyclerView.f7576, recyclerView.f7586);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public final void m5202(int i) {
        int i2;
        int[] iArr = this.f7488;
        int i3 = this.f7487;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f7488 = iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public final void m5203() {
        View[] viewArr = this.f7493;
        if (viewArr == null || viewArr.length != this.f7487) {
            this.f7493 = new View[this.f7487];
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f7489 = false;
        this.f7487 = -1;
        this.f7492 = new SparseIntArray();
        this.f7496 = new SparseIntArray();
        this.f7497 = new C3336();
        this.f7494 = new Rect();
        this.f7495 = -1;
        this.f7491 = -1;
        this.f7490 = -1;
        m5190(i);
    }

    public GridLayoutManager() {
        super(1);
        this.f7489 = false;
        this.f7487 = -1;
        this.f7492 = new SparseIntArray();
        this.f7496 = new SparseIntArray();
        this.f7497 = new C3336();
        this.f7494 = new Rect();
        this.f7495 = -1;
        this.f7491 = -1;
        this.f7490 = -1;
        m5190(4);
    }
}
