package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.view.AbstractC2270;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p007.AbstractC6136;
import p124.C7412;
import p155.C7606;
import p155.C7609;
import p273.C8337;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final Set f7140 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f7141;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int[] f7142;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7143;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f7144;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f7145;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final SparseIntArray f7146;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public View[] f7147;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final Rect f7148;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public int f7149;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final SparseIntArray f7150;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public AbstractC2501 f7151;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7143 = false;
        this.f7141 = -1;
        this.f7146 = new SparseIntArray();
        this.f7150 = new SparseIntArray();
        this.f7151 = new C2503();
        this.f7148 = new Rect();
        this.f7149 = -1;
        this.f7145 = -1;
        this.f7144 = -1;
        m4620(AbstractC2519.m4972(context, attributeSet, i, i2).f7596);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int mo4590(C2531 c2531, C2525 c2525) {
        if (this.f7166 == 0) {
            return Math.min(this.f7141, m4984());
        }
        if (c2525.m5015() < 1) {
            return 0;
        }
        return m4629(c2525.m5015() - 1, c2531, c2525) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2518 mo4591() {
        return this.f7166 == 0 ? new C2500(-2, -1) : new C2500(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int mo4592(C2525 c2525) {
        return m4647(c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int mo4593(C2525 c2525) {
        return m4650(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int mo4594(C2531 c2531, C2525 c2525) {
        if (this.f7166 == 1) {
            return Math.min(this.f7141, m4984());
        }
        if (c2525.m5015() < 1) {
            return 0;
        }
        return m4629(c2525.m5015() - 1, c2531, c2525) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C2518 mo4595(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C2500 c2500 = new C2500((ViewGroup.MarginLayoutParams) layoutParams);
            c2500.f7485 = -1;
            c2500.f7486 = 0;
            return c2500;
        }
        C2500 c25002 = new C2500(layoutParams);
        c25002.f7485 = -1;
        c25002.f7486 = 0;
        return c25002;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2518 mo4596(Context context, AttributeSet attributeSet) {
        C2500 c2500 = new C2500(context, attributeSet);
        c2500.f7485 = -1;
        c2500.f7486 = 0;
        return c2500;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void mo4597(C2531 c2531, C2525 c2525, C2469 c2469, C2470 c2470) {
        int i;
        int i2;
        int i3;
        int iMo4827;
        int paddingLeft;
        int paddingTop;
        int iM4979;
        int iM49792;
        boolean z;
        int i4;
        View viewM4863;
        int iMo4838 = this.f7164.mo4838();
        boolean z2 = iMo4838 != 1073741824;
        int i5 = m4987() > 0 ? this.f7142[this.f7141] : 0;
        if (z2) {
            m4623();
        }
        boolean z3 = c2469.f7358 == 1;
        int iM4626 = this.f7141;
        if (!z3) {
            iM4626 = m4626(c2469.f7359, c2531, c2525) + m4627(c2469.f7359, c2531, c2525);
        }
        int i6 = 0;
        while (i6 < this.f7141 && (i4 = c2469.f7359) >= 0 && i4 < c2525.m5015() && iM4626 > 0) {
            int i7 = c2469.f7359;
            int iM4627 = m4627(i7, c2531, c2525);
            if (iM4627 > this.f7141) {
                C5919.m11249(AbstractC0053.m147(AbstractC0053.m151(i7, iM4627, "Item at position ", " requires ", " spans but GridLayoutManager has only "), " spans.", this.f7141));
                return;
            }
            iM4626 -= iM4627;
            if (iM4626 < 0 || (viewM4863 = c2469.m4863(c2531)) == null) {
                break;
            }
            this.f7147[i6] = viewM4863;
            i6++;
        }
        if (i6 == 0) {
            c2470.f7371 = true;
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
            View view = this.f7147[i];
            C2500 c2500 = (C2500) view.getLayoutParams();
            int iM46272 = m4627(AbstractC2519.m4973(view), c2531, c2525);
            c2500.f7486 = iM46272;
            c2500.f7485 = i8;
            i8 += iM46272;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f7147[i10];
            if (c2469.f7365 != null) {
                z = false;
                if (z3) {
                    m5003(view2, -1, true);
                } else {
                    m5003(view2, 0, true);
                }
            } else if (z3) {
                m5005(view2);
                z = false;
            } else {
                z = false;
                m5003(view2, 0, false);
            }
            m5004(this.f7148, view2);
            m4621(view2, iMo4838, z);
            int iMo4828 = this.f7164.mo4828(view2);
            if (iMo4828 > i9) {
                i9 = iMo4828;
            }
            float fMo4827 = (this.f7164.mo4827(view2) * 1.0f) / ((C2500) view2.getLayoutParams()).f7486;
            if (fMo4827 > f) {
                f = fMo4827;
            }
        }
        if (z2) {
            m4632(Math.max(Math.round(f * this.f7141), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f7147[i11];
                m4621(view3, 1073741824, true);
                int iMo48282 = this.f7164.mo4828(view3);
                if (iMo48282 > i9) {
                    i9 = iMo48282;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f7147[i12];
            if (this.f7164.mo4828(view4) != i9) {
                C2500 c25002 = (C2500) view4.getLayoutParams();
                Rect rect = c25002.f7576;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c25002).topMargin + ((ViewGroup.MarginLayoutParams) c25002).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c25002).leftMargin + ((ViewGroup.MarginLayoutParams) c25002).rightMargin;
                int iM4628 = m4628(c25002.f7485, c25002.f7486);
                if (this.f7166 == 1) {
                    iM49792 = AbstractC2519.m4979(false, iM4628, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c25002).width);
                    iM4979 = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM4979 = AbstractC2519.m4979(false, iM4628, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c25002).height);
                    iM49792 = iMakeMeasureSpec;
                }
                if (m4993(view4, iM49792, iM4979, (C2518) view4.getLayoutParams())) {
                    view4.measure(iM49792, iM4979);
                }
            }
        }
        c2470.f7372 = i9;
        int i15 = this.f7166;
        int i16 = c2469.f7357;
        int iMo48272 = c2469.f7361;
        if (i15 != 1) {
            if (i16 == -1) {
                paddingLeft = iMo48272 - i9;
                iMo4827 = iMo48272;
            } else {
                iMo4827 = iMo48272 + i9;
                paddingLeft = iMo48272;
            }
            paddingTop = 0;
            iMo48272 = 0;
        } else if (i16 == -1) {
            paddingTop = iMo48272 - i9;
            paddingLeft = 0;
            iMo4827 = 0;
        } else {
            paddingTop = iMo48272;
            iMo4827 = 0;
            iMo48272 += i9;
            paddingLeft = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.f7147;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            C2500 c25003 = (C2500) view5.getLayoutParams();
            if (this.f7166 != 1) {
                paddingTop = getPaddingTop() + this.f7142[c25003.f7485];
                iMo48272 = this.f7164.mo4827(view5) + paddingTop;
            } else if (m4643()) {
                int paddingLeft2 = getPaddingLeft() + this.f7142[this.f7141 - c25003.f7485];
                iMo4827 = paddingLeft2;
                paddingLeft = paddingLeft2 - this.f7164.mo4827(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f7142[c25003.f7485];
                iMo4827 = this.f7164.mo4827(view5) + paddingLeft;
            }
            AbstractC2519.m4982(view5, paddingLeft, paddingTop, iMo4827, iMo48272);
            if (c25003.f7578.isRemoved() || c25003.f7578.isUpdated()) {
                c2470.f7370 = true;
            }
            c2470.f7369 = view5.hasFocusable() | c2470.f7369;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void mo4598(C2531 c2531, C2525 c2525, C2471 c2471, int i) {
        m4623();
        if (c2525.m5015() > 0 && !c2525.f7616) {
            boolean z = i == 1;
            int iM4626 = m4626(c2471.f7376, c2531, c2525);
            if (z) {
                while (iM4626 > 0) {
                    int i2 = c2471.f7376;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c2471.f7376 = i3;
                    iM4626 = m4626(i3, c2531, c2525);
                }
            } else {
                int iM5015 = c2525.m5015() - 1;
                int i4 = c2471.f7376;
                while (i4 < iM5015) {
                    int i5 = i4 + 1;
                    int iM46262 = m4626(i5, c2531, c2525);
                    if (iM46262 <= iM4626) {
                        break;
                    }
                    i4 = i5;
                    iM4626 = iM46262;
                }
                c2471.f7376 = i4;
            }
        }
        m4633();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void mo4599(C2525 c2525, C2469 c2469, C0920 c0920) {
        int i;
        int iMo4950 = this.f7141;
        for (int i2 = 0; i2 < this.f7141 && (i = c2469.f7359) >= 0 && i < c2525.m5015() && iMo4950 > 0; i2++) {
            int i3 = c2469.f7359;
            c0920.m1818(i3, Math.max(0, c2469.f7364));
            iMo4950 -= this.f7151.mo4950(i3);
            c2469.f7359 += c2469.f7358;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final View mo4600(C2531 c2531, C2525 c2525, boolean z, boolean z2) {
        int i;
        int iM4987;
        int iM49872 = m4987();
        int i2 = 1;
        if (z2) {
            iM4987 = m4987() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM49872;
            iM4987 = 0;
        }
        int iM5015 = c2525.m5015();
        m4639();
        int iMo4835 = this.f7164.mo4835();
        int iMo4834 = this.f7164.mo4834();
        View view = null;
        View view2 = null;
        while (iM4987 != i) {
            View viewM4988 = m4988(iM4987);
            int iM4973 = AbstractC2519.m4973(viewM4988);
            if (iM4973 >= 0 && iM4973 < iM5015 && m4626(iM4973, c2531, c2525) == 0) {
                if (((C2518) viewM4988.getLayoutParams()).f7578.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewM4988;
                    }
                } else {
                    if (this.f7164.mo4826(viewM4988) < iMo4834 && this.f7164.mo4829(viewM4988) >= iMo4835) {
                        return viewM4988;
                    }
                    if (view == null) {
                        view = viewM4988;
                    }
                }
            }
            iM4987 += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final int mo4601(int i, C2531 c2531, C2525 c2525) {
        m4623();
        m4633();
        return super.mo4601(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final boolean mo4602() {
        return this.f7155 == null && !this.f7143;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4603(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4603(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void mo4604(Rect rect, int i, int i2) {
        int iM4980;
        int iM49802;
        if (this.f7142 == null) {
            super.mo4604(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7166 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f7591;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            iM49802 = AbstractC2519.m4980(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f7142;
            iM4980 = AbstractC2519.m4980(i, iArr[iArr.length - 1] + paddingRight, this.f7591.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f7591;
            WeakHashMap weakHashMap2 = AbstractC2270.f6593;
            iM4980 = AbstractC2519.m4980(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f7142;
            iM49802 = AbstractC2519.m4980(i2, iArr2[iArr2.length - 1] + paddingBottom, this.f7591.getMinimumHeight());
        }
        this.f7591.setMeasuredDimension(iM4980, iM49802);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final int mo4605(int i, C2531 c2531, C2525 c2525) {
        m4623();
        m4633();
        return super.mo4605(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int mo4606(C2525 c2525) {
        return m4650(c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int mo4607(C2525 c2525) {
        return m4647(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean mo4608(C2518 c2518) {
        return c2518 instanceof C2500;
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
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo4609(android.view.View r23, int r24, androidx.recyclerview.widget.C2531 r25, androidx.recyclerview.widget.C2525 r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4609(android.view.View, int, androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo4610(C2531 c2531, C2525 c2525) {
        boolean z = c2525.f7616;
        SparseIntArray sparseIntArray = this.f7150;
        SparseIntArray sparseIntArray2 = this.f7146;
        if (z) {
            int iM4987 = m4987();
            for (int i = 0; i < iM4987; i++) {
                C2500 c2500 = (C2500) m4988(i).getLayoutParams();
                int layoutPosition = c2500.f7578.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c2500.f7486);
                sparseIntArray.put(layoutPosition, c2500.f7485);
            }
        }
        super.mo4610(c2531, c2525);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void mo4611(RecyclerView recyclerView, int i, int i2) {
        this.f7151.m4949();
        this.f7151.f7487.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo4612(C2525 c2525) {
        View viewMo4634;
        super.mo4612(c2525);
        this.f7143 = false;
        int i = this.f7149;
        if (i == -1 || (viewMo4634 = mo4634(i)) == null) {
            return;
        }
        viewMo4634.sendAccessibilityEvent(67108864);
        this.f7149 = -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo4613(int i, int i2) {
        this.f7151.m4949();
        this.f7151.f7487.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void mo4614(int i, int i2) {
        this.f7151.m4949();
        this.f7151.f7487.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void mo4615(C2531 c2531, C2525 c2525, View view, C7606 c7606) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2500)) {
            m5008(view, c7606);
            return;
        }
        C2500 c2500 = (C2500) layoutParams;
        int iM4629 = m4629(c2500.f7578.getLayoutPosition(), c2531, c2525);
        int i = this.f7166;
        int i2 = c2500.f7485;
        int i3 = c2500.f7486;
        if (i == 0) {
            c7606.m12812(C7412.m12615(false, i2, i3, iM4629, 1));
        } else {
            c7606.m12812(C7412.m12615(false, iM4629, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void mo4616(int i, int i2) {
        this.f7151.m4949();
        this.f7151.f7487.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void mo4617() {
        this.f7151.m4949();
        this.f7151.f7487.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void mo4618(C2531 c2531, C2525 c2525, C7606 c7606) {
        super.mo4618(c2531, c2525, c7606);
        c7606.m12814(GridView.class.getName());
        AbstractC2450 abstractC2450 = this.f7591.f7193;
        if (abstractC2450 == null || abstractC2450.mo4784() <= 1) {
            return;
        }
        c7606.m12805(C7609.f20640);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public final void mo4619(boolean z) {
        if (z) {
            C5919.m11247("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.mo4619(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public final void m4620(int i) {
        if (i == this.f7141) {
            return;
        }
        this.f7143 = true;
        if (i < 1) {
            C5919.m11249(AbstractC6136.m11556(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.f7141 = i;
        this.f7151.m4949();
        m4991();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public final void m4621(View view, int i, boolean z) {
        int iM4979;
        int iM49792;
        C2500 c2500 = (C2500) view.getLayoutParams();
        Rect rect = c2500.f7576;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2500).topMargin + ((ViewGroup.MarginLayoutParams) c2500).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2500).leftMargin + ((ViewGroup.MarginLayoutParams) c2500).rightMargin;
        int iM4628 = m4628(c2500.f7485, c2500.f7486);
        if (this.f7166 == 1) {
            iM49792 = AbstractC2519.m4979(false, iM4628, i, i3, ((ViewGroup.MarginLayoutParams) c2500).width);
            iM4979 = AbstractC2519.m4979(true, this.f7164.mo4836(), this.f7581, i2, ((ViewGroup.MarginLayoutParams) c2500).height);
        } else {
            int iM49793 = AbstractC2519.m4979(false, iM4628, i, i2, ((ViewGroup.MarginLayoutParams) c2500).height);
            int iM49794 = AbstractC2519.m4979(true, this.f7164.mo4836(), this.f7582, i3, ((ViewGroup.MarginLayoutParams) c2500).width);
            iM4979 = iM49793;
            iM49792 = iM49794;
        }
        C2518 c2518 = (C2518) view.getLayoutParams();
        if (z ? m4993(view, iM49792, iM4979, c2518) : m4994(view, iM49792, iM4979, c2518)) {
            view.measure(iM49792, iM4979);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    public void mo4622(C8337 c8337) {
        this.f7151 = c8337;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public final void m4623() {
        int paddingBottom;
        int paddingTop;
        if (this.f7166 == 1) {
            paddingBottom = this.f7580 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.f7579 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m4632(paddingBottom - paddingTop);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public final HashSet m4624(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f7591;
        int iM4627 = m4627(i2, recyclerView.f7230, recyclerView.f7240);
        for (int i3 = i; i3 < i + iM4627; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
    public final HashSet m4625(int i) {
        return m4624(m4631(i), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public final int m4626(int i, C2531 c2531, C2525 c2525) {
        if (!c2525.f7616) {
            return this.f7151.mo4951(i, this.f7141);
        }
        int i2 = this.f7150.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM5023 = c2531.m5023(i);
        if (iM5023 != -1) {
            return this.f7151.mo4951(iM5023, this.f7141);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public final int m4627(int i, C2531 c2531, C2525 c2525) {
        if (!c2525.f7616) {
            return this.f7151.mo4950(i);
        }
        int i2 = this.f7146.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM5023 = c2531.m5023(i);
        if (iM5023 != -1) {
            return this.f7151.mo4950(iM5023);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public final int m4628(int i, int i2) {
        if (this.f7166 != 1 || !m4643()) {
            int[] iArr = this.f7142;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f7142;
        int i3 = this.f7141;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public final int m4629(int i, C2531 c2531, C2525 c2525) {
        if (!c2525.f7616) {
            return this.f7151.m4952(i, this.f7141);
        }
        int iM5023 = c2531.m5023(i);
        if (iM5023 != -1) {
            return this.f7151.m4952(iM5023, this.f7141);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public final int m4630(int i) {
        int i2 = this.f7166;
        RecyclerView recyclerView = this.f7591;
        return i2 == 0 ? m4629(i, recyclerView.f7230, recyclerView.f7240) : m4626(i, recyclerView.f7230, recyclerView.f7240);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public final int m4631(int i) {
        int i2 = this.f7166;
        RecyclerView recyclerView = this.f7591;
        return i2 == 1 ? m4629(i, recyclerView.f7230, recyclerView.f7240) : m4626(i, recyclerView.f7230, recyclerView.f7240);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public final void m4632(int i) {
        int i2;
        int[] iArr = this.f7142;
        int i3 = this.f7141;
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
        this.f7142 = iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public final void m4633() {
        View[] viewArr = this.f7147;
        if (viewArr == null || viewArr.length != this.f7141) {
            this.f7147 = new View[this.f7141];
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f7143 = false;
        this.f7141 = -1;
        this.f7146 = new SparseIntArray();
        this.f7150 = new SparseIntArray();
        this.f7151 = new C2503();
        this.f7148 = new Rect();
        this.f7149 = -1;
        this.f7145 = -1;
        this.f7144 = -1;
        m4620(i);
    }

    public GridLayoutManager() {
        super(1);
        this.f7143 = false;
        this.f7141 = -1;
        this.f7146 = new SparseIntArray();
        this.f7150 = new SparseIntArray();
        this.f7151 = new C2503();
        this.f7148 = new Rect();
        this.f7149 = -1;
        this.f7145 = -1;
        this.f7144 = -1;
        m4620(4);
    }
}
