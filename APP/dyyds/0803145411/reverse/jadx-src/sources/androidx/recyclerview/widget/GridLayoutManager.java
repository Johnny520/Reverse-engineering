package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import yyds.AbstractC0185;
import yyds.AbstractC0359;
import yyds.AbstractC0897;
import yyds.AbstractC1640;
import yyds.AbstractC2551;
import yyds.C0134;
import yyds.C0188;
import yyds.C0371;
import yyds.C1043;
import yyds.C1213;
import yyds.C1438;
import yyds.C1588;
import yyds.C2133;
import yyds.C2347;
import yyds.C2442;
import yyds.C2526;
import yyds.C2637;
import yyds.C2808;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static final Set f318 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final C2133 f319;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public final SparseIntArray f320;

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public int f321;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public int f322;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public int[] f323;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public View[] f324;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final Rect f325;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public boolean f326;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public int f327;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public int f328;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final SparseIntArray f329;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f326 = false;
        this.f327 = -1;
        this.f329 = new SparseIntArray();
        this.f320 = new SparseIntArray();
        this.f319 = new C2133(26);
        this.f325 = new Rect();
        this.f328 = -1;
        this.f322 = -1;
        this.f321 = -1;
        m158(AbstractC2551.m4595(context, attributeSet, i, i2).f12519);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final int mo128(C2637 c2637) {
        return m201(c2637);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛵᛳᛳ, reason: contains not printable characters */
    public final int mo129(int i, C2808 c2808, C2637 c2637) {
        m131();
        m145();
        return super.mo129(i, c2808, c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final int mo130(C2808 c2808, C2637 c2637) {
        if (this.f343 == 0) {
            return Math.min(this.f327, m4618());
        }
        if (c2637.m4742() < 1) {
            return 0;
        }
        return m140(c2637.m4742() - 1, c2808, c2637) + 1;
    }

    /* JADX INFO: renamed from: ᛱᲀᛱᲁ, reason: contains not printable characters */
    public final void m131() {
        int iM4620;
        int iM4616;
        if (this.f343 == 1) {
            iM4620 = this.f12593 - m4615();
            iM4616 = m4621();
        } else {
            iM4620 = this.f12599 - m4620();
            iM4616 = m4616();
        }
        m132(iM4620 - iM4616);
    }

    /* JADX INFO: renamed from: ᛱᲈᛶᛷ, reason: contains not printable characters */
    public final void m132(int i) {
        int i2;
        int[] iArr = this.f323;
        int i3 = this.f327;
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
        this.f323 = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛱᛵᛱ, reason: contains not printable characters */
    public final boolean mo133() {
        return this.f335 == null && !this.f326;
    }

    /* JADX INFO: renamed from: ᛲᛳᛲᛲ, reason: contains not printable characters */
    public final int m134(int i, C2808 c2808, C2637 c2637) {
        boolean z = c2637.f12977;
        C2133 c2133 = this.f319;
        if (!z) {
            c2133.getClass();
            return 1;
        }
        int i2 = this.f329.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c2808.m4932(i) != -1) {
            c2133.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public final void mo135(int i, int i2) {
        C2133 c2133 = this.f319;
        c2133.m4066();
        ((SparseIntArray) c2133.f10553).clear();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final int mo136(C2808 c2808, C2637 c2637) {
        if (this.f343 == 1) {
            return Math.min(this.f327, m4618());
        }
        if (c2637.m4742() < 1) {
            return 0;
        }
        return m140(c2637.m4742() - 1, c2808, c2637) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛲᲁᛲᛸ, reason: contains not printable characters */
    public final View mo137(C2808 c2808, C2637 c2637, boolean z, boolean z2) {
        int i;
        int iM4613;
        int iM46132 = m4613();
        int i2 = 1;
        if (z2) {
            iM4613 = m4613() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM46132;
            iM4613 = 0;
        }
        int iM4742 = c2637.m4742();
        m209();
        int iMo1038 = this.f334.mo1038();
        int iMo1039 = this.f334.mo1039();
        View view = null;
        View view2 = null;
        while (iM4613 != i) {
            View viewM4614 = m4614(iM4613);
            int iM4603 = AbstractC2551.m4603(viewM4614);
            if (iM4603 >= 0 && iM4603 < iM4742 && m169(iM4603, c2808, c2637) == 0) {
                if (((C2526) viewM4614.getLayoutParams()).f12448.m774()) {
                    if (view2 == null) {
                        view2 = viewM4614;
                    }
                } else {
                    if (this.f334.mo1046(viewM4614) < iMo1039 && this.f334.mo1056(viewM4614) >= iMo1038) {
                        return viewM4614;
                    }
                    if (view == null) {
                        view = viewM4614;
                    }
                }
            }
            iM4613 += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛳ, reason: contains not printable characters */
    public final HashSet m138(int i, int i2) {
        HashSet hashSet = new HashSet();
        C1213 c1213 = this.f12600;
        int iM134 = m134(i2, c1213.f5529, c1213.f5568);
        for (int i3 = i; i3 < i + iM134; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛲᲈᲀᛲ, reason: contains not printable characters */
    public final void mo139(C2808 c2808, C2637 c2637, C1438 c1438, int i) {
        m131();
        if (c2637.m4742() > 0 && !c2637.f12977) {
            boolean z = i == 1;
            int iM169 = m169(c1438.f6833, c2808, c2637);
            if (z) {
                while (iM169 > 0) {
                    int i2 = c1438.f6833;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1438.f6833 = i3;
                    iM169 = m169(i3, c2808, c2637);
                }
            } else {
                int iM4742 = c2637.m4742() - 1;
                int i4 = c1438.f6833;
                while (i4 < iM4742) {
                    int i5 = i4 + 1;
                    int iM1692 = m169(i5, c2808, c2637);
                    if (iM1692 <= iM169) {
                        break;
                    }
                    i4 = i5;
                    iM169 = iM1692;
                }
                c1438.f6833 = i4;
            }
        }
        m145();
    }

    /* JADX INFO: renamed from: ᛲᲈᲀᛵ, reason: contains not printable characters */
    public final int m140(int i, C2808 c2808, C2637 c2637) {
        boolean z = c2637.f12977;
        C2133 c2133 = this.f319;
        if (!z) {
            int i2 = this.f327;
            c2133.getClass();
            return C2133.m4045(i, i2);
        }
        int iM4932 = c2808.m4932(i);
        if (iM4932 != -1) {
            int i3 = this.f327;
            c2133.getClass();
            return C2133.m4045(iM4932, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public final void mo141(C2808 c2808, C2637 c2637, View view, C0134 c0134) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0134.f833;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0371)) {
            m4610(view, c0134);
            return;
        }
        C0371 c0371 = (C0371) layoutParams;
        int iM140 = m140(c0371.f12448.m787(), c2808, c2637);
        int i = this.f343;
        int i2 = c0371.f1895;
        int i3 = c0371.f1896;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, iM140, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM140, 1, i2, i3, false, false));
        }
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
    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo142(View view, int i, C2808 c2808, C2637 c2637) {
        View viewM2458;
        int iM4613;
        int i2;
        int iM46132;
        View view2;
        int i3;
        int i4;
        C2808 c28082 = c2808;
        C2637 c26372 = c2637;
        C1213 c1213 = this.f12600;
        if (c1213 == null || (viewM2458 = c1213.m2458(view)) == null || ((ArrayList) this.f12598.f13647).contains(viewM2458)) {
            viewM2458 = null;
        }
        if (viewM2458 != null) {
            C0371 c0371 = (C0371) viewM2458.getLayoutParams();
            int i5 = c0371.f1895;
            int i6 = c0371.f1896 + i5;
            if (super.mo142(view, i, c2808, c2637) != null) {
                if ((m192(i) == 1) != this.f339) {
                    iM46132 = m4613() - 1;
                    iM4613 = -1;
                    i2 = -1;
                } else {
                    iM4613 = m4613();
                    i2 = 1;
                    iM46132 = 0;
                }
                boolean z = this.f343 == 1 && m175();
                int iM140 = m140(iM46132, c28082, c26372);
                View view3 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM46132;
                int iMin2 = 0;
                View view4 = null;
                while (true) {
                    View view5 = view4;
                    if (i9 == iM4613) {
                        break;
                    }
                    int iM1402 = m140(i9, c28082, c26372);
                    View viewM4614 = m4614(i9);
                    if (viewM4614 == viewM2458) {
                        break;
                    }
                    if (!viewM4614.hasFocusable() || iM1402 == iM140) {
                        C0371 c03712 = (C0371) viewM4614.getLayoutParams();
                        int i10 = c03712.f1895;
                        view2 = viewM2458;
                        int i11 = c03712.f1896 + i10;
                        if (viewM4614.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM4614;
                        }
                        if (!(viewM4614.hasFocusable() && view3 == null) && (viewM4614.hasFocusable() || view5 != null)) {
                            i3 = iM4613;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM4614.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view3 == null) {
                                i4 = iMin;
                                if (!this.f12605.m572(viewM4614) || !this.f12607.m572(viewM4614)) {
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
                            c28082 = c2808;
                            c26372 = c2637;
                            viewM2458 = view2;
                            iM4613 = i3;
                        } else {
                            i4 = iMin;
                            i3 = iM4613;
                        }
                        boolean zHasFocusable = viewM4614.hasFocusable();
                        int i12 = c03712.f1895;
                        if (zHasFocusable) {
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view3 = viewM4614;
                            i8 = i12;
                            view4 = view5;
                        } else {
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                            i7 = i12;
                            iMin = i4;
                            view4 = viewM4614;
                        }
                        i9 += i2;
                        c28082 = c2808;
                        c26372 = c2637;
                        viewM2458 = view2;
                        iM4613 = i3;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewM2458;
                        i4 = iMin;
                        i3 = iM4613;
                    }
                    view4 = view5;
                    iMin = i4;
                    i9 += i2;
                    c28082 = c2808;
                    c26372 = c2637;
                    viewM2458 = view2;
                    iM4613 = i3;
                }
            }
        }
        return null;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final C2526 mo143(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0371 c0371 = new C0371((ViewGroup.MarginLayoutParams) layoutParams);
            c0371.f1895 = -1;
            c0371.f1896 = 0;
            return c0371;
        }
        C0371 c03712 = new C0371(layoutParams);
        c03712.f1895 = -1;
        c03712.f1896 = 0;
        return c03712;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final int mo144(C2637 c2637) {
        return m178(c2637);
    }

    /* JADX INFO: renamed from: ᛴᛵᛴᲈ, reason: contains not printable characters */
    public final void m145() {
        View[] viewArr = this.f324;
        if (viewArr == null || viewArr.length != this.f327) {
            this.f324 = new View[this.f327];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01aa A[EDGE_INSN: B:206:0x01aa->B:122:0x01aa BREAK  A[LOOP:2: B:126:0x01ba->B:135:0x01e3, LOOP_LABEL: LOOP:2: B:126:0x01ba->B:135:0x01e3], EDGE_INSN: B:213:0x01aa->B:122:0x01aa BREAK  A[LOOP:5: B:148:0x0222->B:159:0x0252, LOOP_LABEL: LOOP:5: B:148:0x0222->B:159:0x0252]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛴᛵᛷᛳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo146(int i, Bundle bundle) {
        View viewM4614;
        AbstractC0185 abstractC0185M2419;
        int iIntValue;
        int i2;
        if (i == ((AccessibilityNodeInfo.AccessibilityAction) C1043.f4741.f4747).getId() && i != -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= m4613()) {
                    viewM4614 = null;
                    break;
                }
                if (m4614(i3).isAccessibilityFocused()) {
                    viewM4614 = m4614(i3);
                    break;
                }
                i3++;
            }
            if (viewM4614 != null && bundle != null) {
                int i4 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f318.contains(Integer.valueOf(i4)) && (abstractC0185M2419 = this.f12600.m2419(viewM4614)) != null) {
                    int iM778 = abstractC0185M2419.m778();
                    int iM148 = m148(iM778);
                    int iM161 = m161(iM778);
                    if (iM148 >= 0 && iM161 >= 0) {
                        if (!m156(iM778).contains(Integer.valueOf(this.f322)) || !m138(m161(iM778), iM778).contains(Integer.valueOf(this.f321))) {
                            this.f322 = iM148;
                            this.f321 = iM161;
                        }
                        int i5 = this.f322;
                        if (i5 == -1) {
                            i5 = iM148;
                        }
                        int i6 = this.f321;
                        if (i6 != -1) {
                            iM161 = i6;
                        }
                        if (i4 == 17) {
                            iIntValue = iM778 - 1;
                            while (iIntValue >= 0) {
                                int iM1482 = m148(iIntValue);
                                int iM1612 = m161(iIntValue);
                                if (iM1482 < 0 || iM1612 < 0) {
                                    break;
                                }
                                if (this.f343 != 1) {
                                    if (m156(iIntValue).contains(Integer.valueOf(i5)) && iM1612 < iM161) {
                                        this.f321 = iM1612;
                                        break;
                                    }
                                    iIntValue--;
                                } else {
                                    if ((iM1482 == i5 && iM1612 < iM161) || iM1482 < i5) {
                                        this.f322 = iM1482;
                                        this.f321 = iM1612;
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
                            iIntValue = iM778 - 1;
                            while (iIntValue >= 0) {
                                int iM1483 = m148(iIntValue);
                                int iM1613 = m161(iIntValue);
                                if (iM1483 < 0 || iM1613 < 0) {
                                    break;
                                }
                                if (this.f343 != 1) {
                                    if (iM1483 < i5 && iM1613 == iM161) {
                                        this.f322 = ((Integer) Collections.max(m156(iIntValue))).intValue();
                                        break;
                                    }
                                    iIntValue--;
                                } else {
                                    if (iM1483 < i5 && m138(m161(iIntValue), iIntValue).contains(Integer.valueOf(iM161))) {
                                        this.f322 = iM1483;
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
                            iIntValue = iM778 + 1;
                            while (iIntValue < m4618()) {
                                int iM1484 = m148(iIntValue);
                                int iM1614 = m161(iIntValue);
                                if (iM1484 < 0 || iM1614 < 0) {
                                    break;
                                }
                                if (this.f343 != 1) {
                                    if (iM1614 > iM161 && m156(iIntValue).contains(Integer.valueOf(i5))) {
                                        this.f321 = iM1614;
                                        break;
                                    }
                                    iIntValue++;
                                } else {
                                    if ((iM1484 == i5 && iM1614 > iM161) || iM1484 > i5) {
                                        this.f322 = iM1484;
                                        this.f321 = iM1614;
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
                            iIntValue = iM778 + 1;
                            while (iIntValue < m4618()) {
                                int iM1485 = m148(iIntValue);
                                int iM1615 = m161(iIntValue);
                                if (iM1485 < 0 || iM1615 < 0) {
                                    break;
                                }
                                if (this.f343 != 1) {
                                    if (iM1485 > i5 && iM1615 == iM161) {
                                        this.f322 = m148(iIntValue);
                                        break;
                                    }
                                    iIntValue++;
                                } else {
                                    if (iM1485 > i5 && (iM1615 == iM161 || m138(m161(iIntValue), iIntValue).contains(Integer.valueOf(iM161)))) {
                                        this.f322 = iM1485;
                                        break;
                                    }
                                    iIntValue++;
                                }
                            }
                            iIntValue = -1;
                            if (iIntValue == -1 && (i2 = this.f343) == 0) {
                                if (i4 != 17) {
                                    if (iM148 >= 0 && i2 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i7 = 0;
                                        loop2: while (true) {
                                            if (i7 >= m4618()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int iIntValue2 = num.intValue();
                                                    if (iIntValue2 < iM148) {
                                                        iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                        this.f322 = iIntValue2;
                                                        this.f321 = m161(iIntValue);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (Integer num2 : m156(i7)) {
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
                                    if (iM148 >= 0 && i2 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i8 = 0;
                                        loop5: while (true) {
                                            if (i8 >= m4618()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int iIntValue3 = num3.intValue();
                                                    if (iIntValue3 > iM148) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f322 = iIntValue3;
                                                        this.f321 = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (Integer num4 : m156(i8)) {
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
                                mo183(iIntValue);
                                this.f328 = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.mo146(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iMo531 = this.f12600.f5537.mo531();
                int i11 = 0;
                while (true) {
                    if (i11 >= iMo531) {
                        i11 = -1;
                        break;
                    }
                    C1213 c1213 = this.f12600;
                    int iM169 = m169(i11, c1213.f5529, c1213.f5568);
                    C1213 c12132 = this.f12600;
                    int iM140 = m140(i11, c12132.f5529, c12132.f5568);
                    if (this.f343 != 1) {
                        if (iM169 == i9 && iM140 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iM169 == i10 && iM140 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    m197(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public final void mo147(int i, int i2) {
        C2133 c2133 = this.f319;
        c2133.m4066();
        ((SparseIntArray) c2133.f10553).clear();
    }

    /* JADX INFO: renamed from: ᛴᲀᛱ, reason: contains not printable characters */
    public final int m148(int i) {
        int i2 = this.f343;
        C1213 c1213 = this.f12600;
        return i2 == 1 ? m140(i, c1213.f5529, c1213.f5568) : m169(i, c1213.f5529, c1213.f5568);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public final void mo149() {
        C2133 c2133 = this.f319;
        c2133.m4066();
        ((SparseIntArray) c2133.f10553).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final C2526 mo150() {
        return this.f343 == 0 ? new C0371(-2, -1) : new C0371(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛵᛸᲈᛷ, reason: contains not printable characters */
    public final void mo151(C2637 c2637, C2442 c2442, C2347 c2347) {
        int i;
        int i2 = this.f327;
        for (int i3 = 0; i3 < this.f327 && (i = c2442.f12019) >= 0 && i < c2637.m4742() && i2 > 0; i3++) {
            c2347.m4361(c2442.f12019, Math.max(0, c2442.f12013));
            this.f319.getClass();
            i2--;
            c2442.f12019 += c2442.f12010;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public final void mo152(C2808 c2808, C2637 c2637, C0134 c0134) {
        super.mo152(c2808, c2637, c0134);
        c0134.f833.setClassName("android.widget.GridView");
        AbstractC0359 abstractC0359 = this.f12600.f5537;
        if (abstractC0359 == null || abstractC0359.mo531() <= 1) {
            return;
        }
        c0134.m586(C1043.f4741);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᛸᛱᲁ, reason: contains not printable characters */
    public final void mo153(Rect rect, int i, int i2) {
        int iM4600;
        int iM46002;
        if (this.f323 == null) {
            super.mo153(rect, i, i2);
        }
        int iM4615 = m4615() + m4621();
        int iM4620 = m4620() + m4616();
        if (this.f343 == 1) {
            int iHeight = rect.height() + iM4620;
            C1213 c1213 = this.f12600;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            iM46002 = AbstractC2551.m4600(i2, iHeight, c1213.getMinimumHeight());
            int[] iArr = this.f323;
            iM4600 = AbstractC2551.m4600(i, iArr[iArr.length - 1] + iM4615, this.f12600.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4615;
            C1213 c12132 = this.f12600;
            WeakHashMap weakHashMap2 = AbstractC1640.f8352;
            iM4600 = AbstractC2551.m4600(i, iWidth, c12132.getMinimumWidth());
            int[] iArr2 = this.f323;
            iM46002 = AbstractC2551.m4600(i2, iArr2[iArr2.length - 1] + iM4620, this.f12600.getMinimumHeight());
        }
        this.f12600.setMeasuredDimension(iM4600, iM46002);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final int mo154(C2637 c2637) {
        return m201(c2637);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int mo155(C2637 c2637) {
        return m178(c2637);
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛴ, reason: contains not printable characters */
    public final HashSet m156(int i) {
        return m138(m148(i), i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public final void mo157(C2808 c2808, C2637 c2637) {
        boolean z = c2637.f12977;
        SparseIntArray sparseIntArray = this.f320;
        SparseIntArray sparseIntArray2 = this.f329;
        if (z) {
            int iM4613 = m4613();
            for (int i = 0; i < iM4613; i++) {
                C0371 c0371 = (C0371) m4614(i).getLayoutParams();
                int iM787 = c0371.f12448.m787();
                sparseIntArray2.put(iM787, c0371.f1896);
                sparseIntArray.put(iM787, c0371.f1895);
            }
        }
        super.mo157(c2808, c2637);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    /* JADX INFO: renamed from: ᛸᛴᛷᛵ, reason: contains not printable characters */
    public final void m158(int i) {
        if (i == this.f327) {
            return;
        }
        this.f326 = true;
        if (i < 1) {
            C0188.m798(AbstractC0897.m1989(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.f327 = i;
        this.f319.m4066();
        m4605();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛸᲇᛱᲇ, reason: contains not printable characters */
    public final int mo159(int i, C2808 c2808, C2637 c2637) {
        m131();
        m145();
        return super.mo159(i, c2808, c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final C2526 mo160(Context context, AttributeSet attributeSet) {
        C0371 c0371 = new C0371(context, attributeSet);
        c0371.f1895 = -1;
        c0371.f1896 = 0;
        return c0371;
    }

    /* JADX INFO: renamed from: ᲀᛳᲇᛴ, reason: contains not printable characters */
    public final int m161(int i) {
        int i2 = this.f343;
        C1213 c1213 = this.f12600;
        return i2 == 0 ? m140(i, c1213.f5529, c1213.f5568) : m169(i, c1213.f5529, c1213.f5568);
    }

    /* JADX INFO: renamed from: ᲁᛵᛷᛸ, reason: contains not printable characters */
    public final void m162(View view, int i, boolean z) {
        int iM4599;
        int iM45992;
        C0371 c0371 = (C0371) view.getLayoutParams();
        Rect rect = c0371.f12449;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0371).topMargin + ((ViewGroup.MarginLayoutParams) c0371).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0371).leftMargin + ((ViewGroup.MarginLayoutParams) c0371).rightMargin;
        int iM166 = m166(c0371.f1895, c0371.f1896);
        if (this.f343 == 1) {
            iM45992 = AbstractC2551.m4599(false, iM166, i, i3, ((ViewGroup.MarginLayoutParams) c0371).width);
            iM4599 = AbstractC2551.m4599(true, this.f334.mo1036(), this.f12595, i2, ((ViewGroup.MarginLayoutParams) c0371).height);
        } else {
            int iM45993 = AbstractC2551.m4599(false, iM166, i, i2, ((ViewGroup.MarginLayoutParams) c0371).height);
            int iM45994 = AbstractC2551.m4599(true, this.f334.mo1036(), this.f12603, i3, ((ViewGroup.MarginLayoutParams) c0371).width);
            iM4599 = iM45993;
            iM45992 = iM45994;
        }
        C2526 c2526 = (C2526) view.getLayoutParams();
        if (z ? m4623(view, iM45992, iM4599, c2526) : m4622(view, iM45992, iM4599, c2526)) {
            view.measure(iM45992, iM4599);
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean mo163(C2526 c2526) {
        return c2526 instanceof C0371;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public final void mo164(int i, int i2) {
        C2133 c2133 = this.f319;
        c2133.m4066();
        ((SparseIntArray) c2133.f10553).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲈᛳ */
    public final void mo0(C2637 c2637) {
        View viewMo187;
        super.mo0(c2637);
        this.f326 = false;
        int i = this.f328;
        if (i == -1 || (viewMo187 = mo187(i)) == null) {
            return;
        }
        viewMo187.sendAccessibilityEvent(67108864);
        this.f328 = -1;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public final void mo165(int i, int i2) {
        C2133 c2133 = this.f319;
        c2133.m4066();
        ((SparseIntArray) c2133.f10553).clear();
    }

    /* JADX INFO: renamed from: ᲈᲁᛴᛴ, reason: contains not printable characters */
    public final int m166(int i, int i2) {
        if (this.f343 != 1 || !m175()) {
            int[] iArr = this.f323;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f323;
        int i3 = this.f327;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᲈᲁᛶᛸ, reason: contains not printable characters */
    public final void mo167(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo167(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᲈᲁᛷᛶ, reason: contains not printable characters */
    public final void mo168(C2808 c2808, C2637 c2637, C2442 c2442, C1588 c1588) {
        int i;
        int i2;
        int i3;
        int iMo1055;
        int iM4616;
        int iM4621;
        int iM4599;
        int iM45992;
        ?? r12;
        int i4;
        View viewM4480;
        int iMo1050 = this.f334.mo1050();
        boolean z = iMo1050 != 1073741824;
        int i5 = m4613() > 0 ? this.f323[this.f327] : 0;
        if (z) {
            m131();
        }
        boolean z2 = c2442.f12010 == 1;
        int iM169 = this.f327;
        if (!z2) {
            iM169 = m169(c2442.f12019, c2808, c2637) + m134(c2442.f12019, c2808, c2637);
        }
        int i6 = 0;
        while (i6 < this.f327 && (i4 = c2442.f12019) >= 0 && i4 < c2637.m4742() && iM169 > 0) {
            int i7 = c2442.f12019;
            int iM134 = m134(i7, c2808, c2637);
            if (iM134 > this.f327) {
                throw new IllegalArgumentException("Item at position " + i7 + " requires " + iM134 + " spans but GridLayoutManager has only " + this.f327 + " spans.");
            }
            iM169 -= iM134;
            if (iM169 < 0 || (viewM4480 = c2442.m4480(c2808)) == null) {
                break;
            }
            this.f324[i6] = viewM4480;
            i6++;
        }
        if (i6 == 0) {
            c1588.f8075 = true;
            return;
        }
        if (z2) {
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
            View view = this.f324[i];
            C0371 c0371 = (C0371) view.getLayoutParams();
            int iM1342 = m134(AbstractC2551.m4603(view), c2808, c2637);
            c0371.f1896 = iM1342;
            c0371.f1895 = i8;
            i8 += iM1342;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f324[i10];
            if (c2442.f12014 != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    m4609(view2, -1, true);
                } else {
                    m4609(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                m4609(view2, -1, false);
            } else {
                r12 = 0;
                m4609(view2, 0, false);
            }
            C1213 c1213 = this.f12600;
            Rect rect = this.f325;
            if (c1213 == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(c1213.m2450(view2));
            }
            m162(view2, iMo1050, r12);
            int iMo1040 = this.f334.mo1040(view2);
            if (iMo1040 > i9) {
                i9 = iMo1040;
            }
            float fMo1055 = (this.f334.mo1055(view2) * 1.0f) / ((C0371) view2.getLayoutParams()).f1896;
            if (fMo1055 > f) {
                f = fMo1055;
            }
        }
        if (z) {
            m132(Math.max(Math.round(f * this.f327), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f324[i11];
                m162(view3, 1073741824, true);
                int iMo10402 = this.f334.mo1040(view3);
                if (iMo10402 > i9) {
                    i9 = iMo10402;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f324[i12];
            if (this.f334.mo1040(view4) != i9) {
                C0371 c03712 = (C0371) view4.getLayoutParams();
                Rect rect2 = c03712.f12449;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c03712).topMargin + ((ViewGroup.MarginLayoutParams) c03712).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c03712).leftMargin + ((ViewGroup.MarginLayoutParams) c03712).rightMargin;
                int iM166 = m166(c03712.f1895, c03712.f1896);
                if (this.f343 == 1) {
                    iM45992 = AbstractC2551.m4599(false, iM166, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c03712).width);
                    iM4599 = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM4599 = AbstractC2551.m4599(false, iM166, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c03712).height);
                    iM45992 = iMakeMeasureSpec;
                }
                if (m4623(view4, iM45992, iM4599, (C2526) view4.getLayoutParams())) {
                    view4.measure(iM45992, iM4599);
                }
            }
        }
        c1588.f8074 = i9;
        int i15 = this.f343;
        int i16 = c2442.f12018;
        int iMo10552 = c2442.f12012;
        if (i15 != 1) {
            if (i16 == -1) {
                iM4621 = iMo10552 - i9;
                iM4616 = 0;
                iMo1055 = iMo10552;
            } else {
                iMo1055 = iMo10552 + i9;
                iM4616 = 0;
                iM4621 = iMo10552;
            }
            iMo10552 = iM4616;
        } else if (i16 == -1) {
            iM4616 = iMo10552 - i9;
            iM4621 = 0;
            iMo1055 = 0;
        } else {
            iMo1055 = 0;
            iM4616 = iMo10552;
            iMo10552 += i9;
            iM4621 = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.f324;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            C0371 c03713 = (C0371) view5.getLayoutParams();
            if (this.f343 != 1) {
                iM4616 = m4616() + this.f323[c03713.f1895];
                iMo10552 = this.f334.mo1055(view5) + iM4616;
            } else if (m175()) {
                int iM46212 = m4621() + this.f323[this.f327 - c03713.f1895];
                iMo1055 = iM46212;
                iM4621 = iM46212 - this.f334.mo1055(view5);
            } else {
                iM4621 = m4621() + this.f323[c03713.f1895];
                iMo1055 = this.f334.mo1055(view5) + iM4621;
            }
            AbstractC2551.m4601(view5, iM4621, iM4616, iMo1055, iMo10552);
            if (c03713.f12448.m774() || c03713.f12448.m782()) {
                c1588.f8076 = true;
            }
            c1588.f8077 = view5.hasFocusable() | c1588.f8077;
            i17++;
        }
    }

    /* JADX INFO: renamed from: ᲈᲈᛱᲀ, reason: contains not printable characters */
    public final int m169(int i, C2808 c2808, C2637 c2637) {
        boolean z = c2637.f12977;
        C2133 c2133 = this.f319;
        if (!z) {
            int i2 = this.f327;
            c2133.getClass();
            return i % i2;
        }
        int i3 = this.f320.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM4932 = c2808.m4932(i);
        if (iM4932 != -1) {
            int i4 = this.f327;
            c2133.getClass();
            return iM4932 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f326 = false;
        this.f327 = -1;
        this.f329 = new SparseIntArray();
        this.f320 = new SparseIntArray();
        this.f319 = new C2133(26);
        this.f325 = new Rect();
        this.f328 = -1;
        this.f322 = -1;
        this.f321 = -1;
        m158(i);
    }
}
