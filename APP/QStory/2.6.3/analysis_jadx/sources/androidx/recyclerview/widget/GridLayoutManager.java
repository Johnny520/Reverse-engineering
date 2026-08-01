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
import p009.AbstractC6183;
import p124.C7413;
import p155.C7607;
import p155.C7610;
import p273.C8338;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final Set f7141 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f7142;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int[] f7143;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7144;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f7145;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f7146;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final SparseIntArray f7147;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public View[] f7148;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final Rect f7149;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public int f7150;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final SparseIntArray f7151;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public AbstractC2501 f7152;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7144 = false;
        this.f7142 = -1;
        this.f7147 = new SparseIntArray();
        this.f7151 = new SparseIntArray();
        this.f7152 = new C2503();
        this.f7149 = new Rect();
        this.f7150 = -1;
        this.f7146 = -1;
        this.f7145 = -1;
        m4630(AbstractC2519.m4982(context, attributeSet, i, i2).f7597);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int mo4600(C2531 c2531, C2525 c2525) {
        if (this.f7167 == 0) {
            return Math.min(this.f7142, m4994());
        }
        if (c2525.m5025() < 1) {
            return 0;
        }
        return m4639(c2525.m5025() - 1, c2531, c2525) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2518 mo4601() {
        return this.f7167 == 0 ? new C2500(-2, -1) : new C2500(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int mo4602(C2525 c2525) {
        return m4657(c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int mo4603(C2525 c2525) {
        return m4660(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int mo4604(C2531 c2531, C2525 c2525) {
        if (this.f7167 == 1) {
            return Math.min(this.f7142, m4994());
        }
        if (c2525.m5025() < 1) {
            return 0;
        }
        return m4639(c2525.m5025() - 1, c2531, c2525) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C2518 mo4605(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C2500 c2500 = new C2500((ViewGroup.MarginLayoutParams) layoutParams);
            c2500.f7486 = -1;
            c2500.f7487 = 0;
            return c2500;
        }
        C2500 c25002 = new C2500(layoutParams);
        c25002.f7486 = -1;
        c25002.f7487 = 0;
        return c25002;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2518 mo4606(Context context, AttributeSet attributeSet) {
        C2500 c2500 = new C2500(context, attributeSet);
        c2500.f7486 = -1;
        c2500.f7487 = 0;
        return c2500;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void mo4607(C2531 c2531, C2525 c2525, C2469 c2469, C2470 c2470) {
        int i;
        int i2;
        int i3;
        int iMo4837;
        int paddingLeft;
        int paddingTop;
        int iM4989;
        int iM49892;
        boolean z;
        int i4;
        View viewM4873;
        int iMo4848 = this.f7165.mo4848();
        boolean z2 = iMo4848 != 1073741824;
        int i5 = m4997() > 0 ? this.f7143[this.f7142] : 0;
        if (z2) {
            m4633();
        }
        boolean z3 = c2469.f7359 == 1;
        int iM4636 = this.f7142;
        if (!z3) {
            iM4636 = m4636(c2469.f7360, c2531, c2525) + m4637(c2469.f7360, c2531, c2525);
        }
        int i6 = 0;
        while (i6 < this.f7142 && (i4 = c2469.f7360) >= 0 && i4 < c2525.m5025() && iM4636 > 0) {
            int i7 = c2469.f7360;
            int iM4637 = m4637(i7, c2531, c2525);
            if (iM4637 > this.f7142) {
                C5925.m11310(AbstractC0053.m147(AbstractC0053.m149(i7, iM4637, "Item at position ", " requires ", " spans but GridLayoutManager has only "), " spans.", this.f7142));
                return;
            }
            iM4636 -= iM4637;
            if (iM4636 < 0 || (viewM4873 = c2469.m4873(c2531)) == null) {
                break;
            }
            this.f7148[i6] = viewM4873;
            i6++;
        }
        if (i6 == 0) {
            c2470.f7372 = true;
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
            View view = this.f7148[i];
            C2500 c2500 = (C2500) view.getLayoutParams();
            int iM46372 = m4637(AbstractC2519.m4983(view), c2531, c2525);
            c2500.f7487 = iM46372;
            c2500.f7486 = i8;
            i8 += iM46372;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f7148[i10];
            if (c2469.f7366 != null) {
                z = false;
                if (z3) {
                    m5013(view2, -1, true);
                } else {
                    m5013(view2, 0, true);
                }
            } else if (z3) {
                m5015(view2);
                z = false;
            } else {
                z = false;
                m5013(view2, 0, false);
            }
            m5014(this.f7149, view2);
            m4631(view2, iMo4848, z);
            int iMo4838 = this.f7165.mo4838(view2);
            if (iMo4838 > i9) {
                i9 = iMo4838;
            }
            float fMo4837 = (this.f7165.mo4837(view2) * 1.0f) / ((C2500) view2.getLayoutParams()).f7487;
            if (fMo4837 > f) {
                f = fMo4837;
            }
        }
        if (z2) {
            m4642(Math.max(Math.round(f * this.f7142), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f7148[i11];
                m4631(view3, 1073741824, true);
                int iMo48382 = this.f7165.mo4838(view3);
                if (iMo48382 > i9) {
                    i9 = iMo48382;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f7148[i12];
            if (this.f7165.mo4838(view4) != i9) {
                C2500 c25002 = (C2500) view4.getLayoutParams();
                Rect rect = c25002.f7577;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c25002).topMargin + ((ViewGroup.MarginLayoutParams) c25002).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c25002).leftMargin + ((ViewGroup.MarginLayoutParams) c25002).rightMargin;
                int iM4638 = m4638(c25002.f7486, c25002.f7487);
                if (this.f7167 == 1) {
                    iM49892 = AbstractC2519.m4989(false, iM4638, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c25002).width);
                    iM4989 = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM4989 = AbstractC2519.m4989(false, iM4638, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c25002).height);
                    iM49892 = iMakeMeasureSpec;
                }
                if (m5003(view4, iM49892, iM4989, (C2518) view4.getLayoutParams())) {
                    view4.measure(iM49892, iM4989);
                }
            }
        }
        c2470.f7373 = i9;
        int i15 = this.f7167;
        int i16 = c2469.f7358;
        int iMo48372 = c2469.f7362;
        if (i15 != 1) {
            if (i16 == -1) {
                paddingLeft = iMo48372 - i9;
                iMo4837 = iMo48372;
            } else {
                iMo4837 = iMo48372 + i9;
                paddingLeft = iMo48372;
            }
            paddingTop = 0;
            iMo48372 = 0;
        } else if (i16 == -1) {
            paddingTop = iMo48372 - i9;
            paddingLeft = 0;
            iMo4837 = 0;
        } else {
            paddingTop = iMo48372;
            iMo4837 = 0;
            iMo48372 += i9;
            paddingLeft = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.f7148;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            C2500 c25003 = (C2500) view5.getLayoutParams();
            if (this.f7167 != 1) {
                paddingTop = getPaddingTop() + this.f7143[c25003.f7486];
                iMo48372 = this.f7165.mo4837(view5) + paddingTop;
            } else if (m4653()) {
                int paddingLeft2 = getPaddingLeft() + this.f7143[this.f7142 - c25003.f7486];
                iMo4837 = paddingLeft2;
                paddingLeft = paddingLeft2 - this.f7165.mo4837(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f7143[c25003.f7486];
                iMo4837 = this.f7165.mo4837(view5) + paddingLeft;
            }
            AbstractC2519.m4992(view5, paddingLeft, paddingTop, iMo4837, iMo48372);
            if (c25003.f7579.isRemoved() || c25003.f7579.isUpdated()) {
                c2470.f7371 = true;
            }
            c2470.f7370 = view5.hasFocusable() | c2470.f7370;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void mo4608(C2531 c2531, C2525 c2525, C2471 c2471, int i) {
        m4633();
        if (c2525.m5025() > 0 && !c2525.f7617) {
            boolean z = i == 1;
            int iM4636 = m4636(c2471.f7377, c2531, c2525);
            if (z) {
                while (iM4636 > 0) {
                    int i2 = c2471.f7377;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c2471.f7377 = i3;
                    iM4636 = m4636(i3, c2531, c2525);
                }
            } else {
                int iM5025 = c2525.m5025() - 1;
                int i4 = c2471.f7377;
                while (i4 < iM5025) {
                    int i5 = i4 + 1;
                    int iM46362 = m4636(i5, c2531, c2525);
                    if (iM46362 <= iM4636) {
                        break;
                    }
                    i4 = i5;
                    iM4636 = iM46362;
                }
                c2471.f7377 = i4;
            }
        }
        m4643();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final void mo4609(C2525 c2525, C2469 c2469, C0920 c0920) {
        int i;
        int iMo4960 = this.f7142;
        for (int i2 = 0; i2 < this.f7142 && (i = c2469.f7360) >= 0 && i < c2525.m5025() && iMo4960 > 0; i2++) {
            int i3 = c2469.f7360;
            c0920.m1828(i3, Math.max(0, c2469.f7365));
            iMo4960 -= this.f7152.mo4960(i3);
            c2469.f7360 += c2469.f7359;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final View mo4610(C2531 c2531, C2525 c2525, boolean z, boolean z2) {
        int i;
        int iM4997;
        int iM49972 = m4997();
        int i2 = 1;
        if (z2) {
            iM4997 = m4997() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM49972;
            iM4997 = 0;
        }
        int iM5025 = c2525.m5025();
        m4649();
        int iMo4845 = this.f7165.mo4845();
        int iMo4844 = this.f7165.mo4844();
        View view = null;
        View view2 = null;
        while (iM4997 != i) {
            View viewM4998 = m4998(iM4997);
            int iM4983 = AbstractC2519.m4983(viewM4998);
            if (iM4983 >= 0 && iM4983 < iM5025 && m4636(iM4983, c2531, c2525) == 0) {
                if (((C2518) viewM4998.getLayoutParams()).f7579.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewM4998;
                    }
                } else {
                    if (this.f7165.mo4836(viewM4998) < iMo4844 && this.f7165.mo4839(viewM4998) >= iMo4845) {
                        return viewM4998;
                    }
                    if (view == null) {
                        view = viewM4998;
                    }
                }
            }
            iM4997 += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final int mo4611(int i, C2531 c2531, C2525 c2525) {
        m4633();
        m4643();
        return super.mo4611(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final boolean mo4612() {
        return this.f7156 == null && !this.f7144;
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
    public final boolean mo4613(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4613(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void mo4614(Rect rect, int i, int i2) {
        int iM4990;
        int iM49902;
        if (this.f7143 == null) {
            super.mo4614(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7167 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.f7592;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            iM49902 = AbstractC2519.m4990(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f7143;
            iM4990 = AbstractC2519.m4990(i, iArr[iArr.length - 1] + paddingRight, this.f7592.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.f7592;
            WeakHashMap weakHashMap2 = AbstractC2270.f6594;
            iM4990 = AbstractC2519.m4990(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f7143;
            iM49902 = AbstractC2519.m4990(i2, iArr2[iArr2.length - 1] + paddingBottom, this.f7592.getMinimumHeight());
        }
        this.f7592.setMeasuredDimension(iM4990, iM49902);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final int mo4615(int i, C2531 c2531, C2525 c2525) {
        m4633();
        m4643();
        return super.mo4615(i, c2531, c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int mo4616(C2525 c2525) {
        return m4660(c2525);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int mo4617(C2525 c2525) {
        return m4657(c2525);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean mo4618(C2518 c2518) {
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
    public final android.view.View mo4619(android.view.View r23, int r24, androidx.recyclerview.widget.C2531 r25, androidx.recyclerview.widget.C2525 r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4619(android.view.View, int, androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo4620(C2531 c2531, C2525 c2525) {
        boolean z = c2525.f7617;
        SparseIntArray sparseIntArray = this.f7151;
        SparseIntArray sparseIntArray2 = this.f7147;
        if (z) {
            int iM4997 = m4997();
            for (int i = 0; i < iM4997; i++) {
                C2500 c2500 = (C2500) m4998(i).getLayoutParams();
                int layoutPosition = c2500.f7579.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c2500.f7487);
                sparseIntArray.put(layoutPosition, c2500.f7486);
            }
        }
        super.mo4620(c2531, c2525);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void mo4621(RecyclerView recyclerView, int i, int i2) {
        this.f7152.m4959();
        this.f7152.f7488.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo4622(C2525 c2525) {
        View viewMo4644;
        super.mo4622(c2525);
        this.f7144 = false;
        int i = this.f7150;
        if (i == -1 || (viewMo4644 = mo4644(i)) == null) {
            return;
        }
        viewMo4644.sendAccessibilityEvent(67108864);
        this.f7150 = -1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo4623(int i, int i2) {
        this.f7152.m4959();
        this.f7152.f7488.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void mo4624(int i, int i2) {
        this.f7152.m4959();
        this.f7152.f7488.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void mo4625(C2531 c2531, C2525 c2525, View view, C7607 c7607) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2500)) {
            m5018(view, c7607);
            return;
        }
        C2500 c2500 = (C2500) layoutParams;
        int iM4639 = m4639(c2500.f7579.getLayoutPosition(), c2531, c2525);
        int i = this.f7167;
        int i2 = c2500.f7486;
        int i3 = c2500.f7487;
        if (i == 0) {
            c7607.m12841(C7413.m12642(false, i2, i3, iM4639, 1));
        } else {
            c7607.m12841(C7413.m12642(false, iM4639, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void mo4626(int i, int i2) {
        this.f7152.m4959();
        this.f7152.f7488.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void mo4627() {
        this.f7152.m4959();
        this.f7152.f7488.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void mo4628(C2531 c2531, C2525 c2525, C7607 c7607) {
        super.mo4628(c2531, c2525, c7607);
        c7607.m12843(GridView.class.getName());
        AbstractC2450 abstractC2450 = this.f7592.f7194;
        if (abstractC2450 == null || abstractC2450.mo4794() <= 1) {
            return;
        }
        c7607.m12834(C7610.f20635);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public final void mo4629(boolean z) {
        if (z) {
            C5925.m11308("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.mo4629(false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public final void m4630(int i) {
        if (i == this.f7142) {
            return;
        }
        this.f7144 = true;
        if (i < 1) {
            C5925.m11310(AbstractC6183.m11588(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.f7142 = i;
        this.f7152.m4959();
        m5001();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public final void m4631(View view, int i, boolean z) {
        int iM4989;
        int iM49892;
        C2500 c2500 = (C2500) view.getLayoutParams();
        Rect rect = c2500.f7577;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2500).topMargin + ((ViewGroup.MarginLayoutParams) c2500).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2500).leftMargin + ((ViewGroup.MarginLayoutParams) c2500).rightMargin;
        int iM4638 = m4638(c2500.f7486, c2500.f7487);
        if (this.f7167 == 1) {
            iM49892 = AbstractC2519.m4989(false, iM4638, i, i3, ((ViewGroup.MarginLayoutParams) c2500).width);
            iM4989 = AbstractC2519.m4989(true, this.f7165.mo4846(), this.f7582, i2, ((ViewGroup.MarginLayoutParams) c2500).height);
        } else {
            int iM49893 = AbstractC2519.m4989(false, iM4638, i, i2, ((ViewGroup.MarginLayoutParams) c2500).height);
            int iM49894 = AbstractC2519.m4989(true, this.f7165.mo4846(), this.f7583, i3, ((ViewGroup.MarginLayoutParams) c2500).width);
            iM4989 = iM49893;
            iM49892 = iM49894;
        }
        C2518 c2518 = (C2518) view.getLayoutParams();
        if (z ? m5003(view, iM49892, iM4989, c2518) : m5004(view, iM49892, iM4989, c2518)) {
            view.measure(iM49892, iM4989);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    public void mo4632(C8338 c8338) {
        this.f7152 = c8338;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public final void m4633() {
        int paddingBottom;
        int paddingTop;
        if (this.f7167 == 1) {
            paddingBottom = this.f7581 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.f7580 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m4642(paddingBottom - paddingTop);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public final HashSet m4634(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f7592;
        int iM4637 = m4637(i2, recyclerView.f7231, recyclerView.f7241);
        for (int i3 = i; i3 < i + iM4637; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
    public final HashSet m4635(int i) {
        return m4634(m4641(i), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public final int m4636(int i, C2531 c2531, C2525 c2525) {
        if (!c2525.f7617) {
            return this.f7152.mo4961(i, this.f7142);
        }
        int i2 = this.f7151.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM5033 = c2531.m5033(i);
        if (iM5033 != -1) {
            return this.f7152.mo4961(iM5033, this.f7142);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public final int m4637(int i, C2531 c2531, C2525 c2525) {
        if (!c2525.f7617) {
            return this.f7152.mo4960(i);
        }
        int i2 = this.f7147.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM5033 = c2531.m5033(i);
        if (iM5033 != -1) {
            return this.f7152.mo4960(iM5033);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public final int m4638(int i, int i2) {
        if (this.f7167 != 1 || !m4653()) {
            int[] iArr = this.f7143;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f7143;
        int i3 = this.f7142;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public final int m4639(int i, C2531 c2531, C2525 c2525) {
        if (!c2525.f7617) {
            return this.f7152.m4962(i, this.f7142);
        }
        int iM5033 = c2531.m5033(i);
        if (iM5033 != -1) {
            return this.f7152.m4962(iM5033, this.f7142);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public final int m4640(int i) {
        int i2 = this.f7167;
        RecyclerView recyclerView = this.f7592;
        return i2 == 0 ? m4639(i, recyclerView.f7231, recyclerView.f7241) : m4636(i, recyclerView.f7231, recyclerView.f7241);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public final int m4641(int i) {
        int i2 = this.f7167;
        RecyclerView recyclerView = this.f7592;
        return i2 == 1 ? m4639(i, recyclerView.f7231, recyclerView.f7241) : m4636(i, recyclerView.f7231, recyclerView.f7241);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public final void m4642(int i) {
        int i2;
        int[] iArr = this.f7143;
        int i3 = this.f7142;
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
        this.f7143 = iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public final void m4643() {
        View[] viewArr = this.f7148;
        if (viewArr == null || viewArr.length != this.f7142) {
            this.f7148 = new View[this.f7142];
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f7144 = false;
        this.f7142 = -1;
        this.f7147 = new SparseIntArray();
        this.f7151 = new SparseIntArray();
        this.f7152 = new C2503();
        this.f7149 = new Rect();
        this.f7150 = -1;
        this.f7146 = -1;
        this.f7145 = -1;
        m4630(i);
    }

    public GridLayoutManager() {
        super(1);
        this.f7144 = false;
        this.f7142 = -1;
        this.f7147 = new SparseIntArray();
        this.f7151 = new SparseIntArray();
        this.f7152 = new C2503();
        this.f7149 = new Rect();
        this.f7150 = -1;
        this.f7146 = -1;
        this.f7145 = -1;
        m4630(4);
    }
}
