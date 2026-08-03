package androidx.recyclerview.widget;

import Yue.C3055;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean f29904 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f29905 = "GridLayoutManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f29906 = -1;

    /* JADX INFO: renamed from: ۥ */
    public boolean f3867;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3868;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int[] f29907;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public View[] f29908;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final SparseIntArray f29909;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final SparseIntArray f29910;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC8902 f29911;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Rect f29912;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f29913;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$ۥ */
    public static final class C1738 extends AbstractC8902 {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC8902
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int mo30169(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC8902
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int mo30170(int i) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8902 {

        /* JADX INFO: renamed from: ۥ */
        public final SparseIntArray f3869 = new SparseIntArray();

        /* JADX INFO: renamed from: ۥ۟ */
        public final SparseIntArray f3870 = new SparseIntArray();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29917 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29918 = false;

        /* JADX INFO: renamed from: ۥ */
        public static int m4896(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m4897(int i, int i2) {
            if (!this.f29918) {
                return m30174(i, i2);
            }
            int i3 = this.f3870.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iM30174 = m30174(i, i2);
            this.f3870.put(i, iM30174);
            return iM30174;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m30173(int i, int i2) {
            if (!this.f29917) {
                return mo30169(i, i2);
            }
            int i3 = this.f3869.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iMo30169 = mo30169(i, i2);
            this.f3869.put(i, iMo30169);
            return iMo30169;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m30174(int i, int i2) {
            int i3;
            int i4;
            int iM30173;
            int iM4896;
            if (!this.f29918 || (iM4896 = m4896(this.f3870, i)) == -1) {
                i3 = 0;
                i4 = 0;
                iM30173 = 0;
            } else {
                i3 = this.f3870.get(iM4896);
                i4 = iM4896 + 1;
                iM30173 = m30173(iM4896, i2) + mo30170(iM4896);
                if (iM30173 == i2) {
                    i3++;
                    iM30173 = 0;
                }
            }
            int iMo30170 = mo30170(i);
            while (i4 < i) {
                int iMo301702 = mo30170(i4);
                iM30173 += iMo301702;
                if (iM30173 == i2) {
                    i3++;
                    iM30173 = 0;
                } else if (iM30173 > i2) {
                    i3++;
                    iM30173 = iMo301702;
                }
                i4++;
            }
            return iM30173 + iMo30170 > i2 ? i3 + 1 : i3;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo30169(int i, int i2) {
            int iM4896;
            int iMo30170;
            int iMo301702 = mo30170(i);
            if (iMo301702 == i2) {
                return 0;
            }
            if (!this.f29917 || (iM4896 = m4896(this.f3869, i)) < 0) {
                iM4896 = 0;
                iMo30170 = 0;
                if (iM4896 >= i) {
                    int iMo301703 = mo30170(iM4896);
                    iMo30170 += iMo301703;
                    if (iMo30170 == i2) {
                        iMo30170 = 0;
                    } else if (iMo30170 > i2) {
                        iMo30170 = iMo301703;
                    }
                    iM4896++;
                    if (iM4896 >= i) {
                        if (iMo301702 + iMo30170 <= i2) {
                            return iMo30170;
                        }
                        return 0;
                    }
                }
            } else {
                iMo30170 = this.f3869.get(iM4896) + mo30170(iM4896);
                iM4896++;
                if (iM4896 >= i) {
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public abstract int mo30170(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m30175() {
            this.f3870.clear();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m30176() {
            this.f3869.clear();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean m30177() {
            return this.f29918;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean m30178() {
            return this.f29917;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m30179(boolean z) {
            if (!z) {
                this.f3870.clear();
            }
            this.f29918 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m30180(boolean z) {
            if (!z) {
                this.f3870.clear();
            }
            this.f29917 = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3867 = false;
        this.f3868 = -1;
        this.f29909 = new SparseIntArray();
        this.f29910 = new SparseIntArray();
        this.f29911 = new C1738();
        this.f29912 = new Rect();
        m30165(RecyclerView.AbstractC8919.getProperties(context, attributeSet, i, i2).f3890);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static int[] m30146(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean checkLayoutParams(RecyclerView.C8922 c8922) {
        return c8922 instanceof C1739;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.C8935 c8935, LinearLayoutManager.C8903 c8903, RecyclerView.AbstractC8919.InterfaceC8920 interfaceC8920) {
        int iMo30170 = this.f3868;
        for (int i = 0; i < this.f3868 && c8903.m30212(c8935) && iMo30170 > 0; i++) {
            int i2 = c8903.f29932;
            interfaceC8920.mo4929(i2, Math.max(0, c8903.f29935));
            iMo30170 -= this.f29911.mo30170(i2);
            c8903.f29932 += c8903.f29933;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollOffset(RecyclerView.C8935 c8935) {
        return this.f29913 ? m30151(c8935) : super.computeHorizontalScrollOffset(c8935);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollRange(RecyclerView.C8935 c8935) {
        return this.f29913 ? m30152(c8935) : super.computeHorizontalScrollRange(c8935);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollOffset(RecyclerView.C8935 c8935) {
        return this.f29913 ? m30151(c8935) : super.computeVerticalScrollOffset(c8935);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollRange(RecyclerView.C8935 c8935) {
        return this.f29913 ? m30152(c8935) : super.computeVerticalScrollRange(c8935);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, int i, int i2, int i3) {
        ensureLayoutState();
        int iMo30710 = this.mOrientationHelper.mo30710();
        int iMo30705 = this.mOrientationHelper.mo30705();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3 && m30158(c8929, c8935, position) == 0) {
                if (((RecyclerView.C8922) childAt.getLayoutParams()).m30306()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo30703(childAt) < iMo30705 && this.mOrientationHelper.mo30700(childAt) >= iMo30710) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C1739(-2, -1) : new C1739(-1, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C1739(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int getColumnCountForAccessibility(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (this.mOrientation == 1) {
            return this.f3868;
        }
        if (c8935.m30375() < 1) {
            return 0;
        }
        return m30157(c8929, c8935, c8935.m30375() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int getRowCountForAccessibility(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (this.mOrientation == 0) {
            return this.f3868;
        }
        if (c8935.m30375() < 1) {
            return 0;
        }
        return m30157(c8929, c8935, c8935.m30375() - 1) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutChunk(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, LinearLayoutManager.C8903 c8903, LinearLayoutManager.C1741 c1741) {
        int i;
        int i2;
        int iMo30702;
        int i3;
        int i4;
        int i5;
        int i6;
        int iMo307022;
        int iMo307023;
        int i7;
        int i8;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewM30214;
        int iMo30709 = this.mOrientationHelper.mo30709();
        boolean z = iMo30709 != 1073741824;
        int i9 = getChildCount() > 0 ? this.f29907[this.f3868] : 0;
        if (z) {
            m30168();
        }
        boolean z2 = c8903.f29933 == 1;
        int iM30158 = this.f3868;
        if (!z2) {
            iM30158 = m30158(c8929, c8935, c8903.f29932) + m30159(c8929, c8935, c8903.f29932);
        }
        int i10 = 0;
        while (i10 < this.f3868 && c8903.m30212(c8935) && iM30158 > 0) {
            int i11 = c8903.f29932;
            int iM30159 = m30159(c8929, c8935, i11);
            if (iM30159 > this.f3868) {
                throw new IllegalArgumentException("Item at position " + i11 + " requires " + iM30159 + " spans but GridLayoutManager has only " + this.f3868 + " spans.");
            }
            iM30158 -= iM30159;
            if (iM30158 < 0 || (viewM30214 = c8903.m30214(c8929)) == null) {
                break;
            }
            this.f29908[i10] = viewM30214;
            i10++;
        }
        if (i10 == 0) {
            c1741.f3874 = true;
            return;
        }
        m30147(c8929, c8935, i10, z2);
        float f = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            View view = this.f29908[i13];
            if (c8903.f29940 == null) {
                if (z2) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z2) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.f29912);
            m30163(view, iMo30709, false);
            int iMo30701 = this.mOrientationHelper.mo30701(view);
            if (iMo30701 > i12) {
                i12 = iMo30701;
            }
            float fMo30702 = (this.mOrientationHelper.mo30702(view) * 1.0f) / ((C1739) view.getLayoutParams()).f29916;
            if (fMo30702 > f) {
                f = fMo30702;
            }
        }
        if (z) {
            m30161(f, i9);
            i12 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                View view2 = this.f29908[i14];
                m30163(view2, 1073741824, true);
                int iMo307012 = this.mOrientationHelper.mo30701(view2);
                if (iMo307012 > i12) {
                    i12 = iMo307012;
                }
            }
        }
        for (int i15 = 0; i15 < i10; i15++) {
            View view3 = this.f29908[i15];
            if (this.mOrientationHelper.mo30701(view3) != i12) {
                C1739 c1739 = (C1739) view3.getLayoutParams();
                Rect rect = c1739.f3892;
                int i16 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1739).topMargin + ((ViewGroup.MarginLayoutParams) c1739).bottomMargin;
                int i17 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1739).leftMargin + ((ViewGroup.MarginLayoutParams) c1739).rightMargin;
                int iM30155 = m30155(c1739.f29915, c1739.f29916);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.AbstractC8919.getChildMeasureSpec(iM30155, 1073741824, i17, ((ViewGroup.MarginLayoutParams) c1739).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i16, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                    childMeasureSpec = RecyclerView.AbstractC8919.getChildMeasureSpec(iM30155, 1073741824, i16, ((ViewGroup.MarginLayoutParams) c1739).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                m30164(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        c1741.f3873 = i12;
        if (this.mOrientation == 1) {
            if (c8903.f29934 == -1) {
                i5 = c8903.f3876;
                i8 = i5 - i12;
            } else {
                i8 = c8903.f3876;
                i5 = i8 + i12;
            }
            i3 = i8;
            i4 = 0;
            iMo30702 = 0;
        } else {
            if (c8903.f29934 == -1) {
                i2 = c8903.f3876;
                i = i2 - i12;
            } else {
                i = c8903.f3876;
                i2 = i + i12;
            }
            iMo30702 = i;
            i3 = 0;
            i4 = i2;
            i5 = 0;
        }
        int i18 = 0;
        while (i18 < i10) {
            View view4 = this.f29908[i18];
            C1739 c17392 = (C1739) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                int paddingTop = getPaddingTop() + this.f29907[c17392.f29915];
                i6 = paddingTop;
                iMo307022 = i4;
                iMo307023 = this.mOrientationHelper.mo30702(view4) + paddingTop;
            } else if (isLayoutRTL()) {
                int paddingLeft = getPaddingLeft() + this.f29907[this.f3868 - c17392.f29915];
                iMo30702 = paddingLeft - this.mOrientationHelper.mo30702(view4);
                iMo307023 = i5;
                iMo307022 = paddingLeft;
                i6 = i3;
            } else {
                int paddingLeft2 = getPaddingLeft() + this.f29907[c17392.f29915];
                iMo307023 = i5;
                i7 = paddingLeft2;
                i6 = i3;
                iMo307022 = this.mOrientationHelper.mo30702(view4) + paddingLeft2;
                layoutDecoratedWithMargins(view4, i7, i6, iMo307022, iMo307023);
                if (!c17392.m30306() || c17392.m30305()) {
                    c1741.f29922 = true;
                }
                c1741.f29923 |= view4.hasFocusable();
                i18++;
                i5 = iMo307023;
                i4 = iMo307022;
                i3 = i6;
                iMo30702 = i7;
            }
            i7 = iMo30702;
            layoutDecoratedWithMargins(view4, i7, i6, iMo307022, iMo307023);
            if (!c17392.m30306()) {
                c1741.f29922 = true;
            }
            c1741.f29923 |= view4.hasFocusable();
            i18++;
            i5 = iMo307023;
            i4 = iMo307022;
            i3 = i6;
            iMo30702 = i7;
        }
        Arrays.fill(this.f29908, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, LinearLayoutManager.C1740 c1740, int i) {
        super.onAnchorReady(c8929, c8935, c1740, i);
        m30168();
        if (c8935.m30375() > 0 && !c8935.m30381()) {
            m30153(c8929, c8935, c1740, i);
        }
        m30154();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onFocusSearchFailed(View view, int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        int childCount;
        int i2;
        int childCount2;
        View view2;
        View view3;
        int i3;
        int i4;
        int i5;
        int i6;
        RecyclerView.C8929 c89292 = c8929;
        RecyclerView.C8935 c89352 = c8935;
        View viewFindContainingItemView = findContainingItemView(view);
        View view4 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        C1739 c1739 = (C1739) viewFindContainingItemView.getLayoutParams();
        int i7 = c1739.f29915;
        int i8 = c1739.f29916 + i7;
        if (super.onFocusSearchFailed(view, i, c8929, c8935) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            childCount2 = 0;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int iM30157 = m30157(c89292, c89352, childCount2);
        int i9 = -1;
        int i10 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i11 = childCount2;
        View view5 = null;
        while (i11 != childCount) {
            int iM301572 = m30157(c89292, c89352, i11);
            View childAt = getChildAt(i11);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iM301572 == iM30157) {
                C1739 c17392 = (C1739) childAt.getLayoutParams();
                int i12 = c17392.f29915;
                view2 = viewFindContainingItemView;
                int i13 = c17392.f29916 + i12;
                if (childAt.hasFocusable() && i12 == i7 && i13 == i8) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view4 == null) && (childAt.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i13, i8) - Math.max(i12, i7);
                    if (!childAt.hasFocusable()) {
                        if (view4 == null) {
                            i3 = iMin;
                            i4 = childCount;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i5 = iMin2;
                                if (iMin3 > i5) {
                                    i6 = i10;
                                } else if (iMin3 == i5) {
                                    i6 = i10;
                                    if (z == (i12 > i6)) {
                                    }
                                    i11 += i2;
                                    c89292 = c8929;
                                    c89352 = c8935;
                                    viewFindContainingItemView = view2;
                                    childCount = i4;
                                } else {
                                    i6 = i10;
                                }
                                if (childAt.hasFocusable()) {
                                    int i14 = c17392.f29915;
                                    iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                    i10 = i14;
                                    iMin = i3;
                                    view5 = childAt;
                                } else {
                                    i9 = c17392.f29915;
                                    i10 = i6;
                                    iMin2 = i5;
                                    view5 = view3;
                                    view4 = childAt;
                                    iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                }
                                i11 += i2;
                                c89292 = c8929;
                                c89352 = c8935;
                                viewFindContainingItemView = view2;
                                childCount = i4;
                            }
                            i10 = i6;
                            iMin2 = i5;
                            iMin = i3;
                            view5 = view3;
                            i11 += i2;
                            c89292 = c8929;
                            c89352 = c8935;
                            viewFindContainingItemView = view2;
                            childCount = i4;
                        }
                        i6 = i10;
                        i5 = iMin2;
                        i10 = i6;
                        iMin2 = i5;
                        iMin = i3;
                        view5 = view3;
                        i11 += i2;
                        c89292 = c8929;
                        c89352 = c8935;
                        viewFindContainingItemView = view2;
                        childCount = i4;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                i3 = iMin;
                i4 = childCount;
                i6 = i10;
                i5 = iMin2;
                if (childAt.hasFocusable()) {
                }
                i11 += i2;
                c89292 = c8929;
                c89352 = c8935;
                viewFindContainingItemView = view2;
                childCount = i4;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                view3 = view5;
            }
            i3 = iMin;
            i4 = childCount;
            i6 = i10;
            i5 = iMin2;
            i10 = i6;
            iMin2 = i5;
            iMin = i3;
            view5 = view3;
            i11 += i2;
            c89292 = c8929;
            c89352 = c8935;
            viewFindContainingItemView = view2;
            childCount = i4;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, View view, C3055 c3055) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1739)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c3055);
            return;
        }
        C1739 c1739 = (C1739) layoutParams;
        int iM30157 = m30157(c8929, c8935, c1739.m4931());
        if (this.mOrientation == 0) {
            c3055.m6060(C3055.C3060.m6143(c1739.m30171(), c1739.m30172(), iM30157, 1, false, false));
        } else {
            c3055.m6060(C3055.C3060.m6143(iM30157, 1, c1739.m30171(), c1739.m30172(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f29911.m30176();
        this.f29911.m30175();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f29911.m30176();
        this.f29911.m30175();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f29911.m30176();
        this.f29911.m30175();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f29911.m30176();
        this.f29911.m30175();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f29911.m30176();
        this.f29911.m30175();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutChildren(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (c8935.m30381()) {
            m30148();
        }
        super.onLayoutChildren(c8929, c8935);
        m30150();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutCompleted(RecyclerView.C8935 c8935) {
        super.onLayoutCompleted(c8935);
        this.f3867 = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollHorizontallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        m30168();
        m30154();
        return super.scrollHorizontallyBy(i, c8929, c8935);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollVerticallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        m30168();
        m30154();
        return super.scrollVerticallyBy(i, c8929, c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f29907 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.AbstractC8919.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f29907;
            iChooseSize = RecyclerView.AbstractC8919.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC8919.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f29907;
            iChooseSize2 = RecyclerView.AbstractC8919.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f3867;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m30147(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.f29908[i2];
            C1739 c1739 = (C1739) view.getLayoutParams();
            int iM30159 = m30159(c8929, c8935, getPosition(view));
            c1739.f29916 = iM30159;
            c1739.f29915 = i5;
            i5 += iM30159;
            i2 += i4;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m30148() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1739 c1739 = (C1739) getChildAt(i).getLayoutParams();
            int iM4931 = c1739.m4931();
            this.f29909.put(iM4931, c1739.m30172());
            this.f29910.put(iM4931, c1739.m30171());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m30149(int i) {
        this.f29907 = m30146(this.f29907, this.f3868, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m30150() {
        this.f29909.clear();
        this.f29910.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final int m30151(RecyclerView.C8935 c8935) {
        if (getChildCount() != 0 && c8935.m30375() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int iM4897 = this.f29911.m4897(getPosition(viewFindFirstVisibleChildClosestToStart), this.f3868);
                int iM48972 = this.f29911.m4897(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f3868);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.f29911.m4897(c8935.m30375() - 1, this.f3868) + 1) - Math.max(iM4897, iM48972)) - 1) : Math.max(0, Math.min(iM4897, iM48972));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.mo30700(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo30703(viewFindFirstVisibleChildClosestToStart)) / ((this.f29911.m4897(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f3868) - this.f29911.m4897(getPosition(viewFindFirstVisibleChildClosestToStart), this.f3868)) + 1))) + (this.mOrientationHelper.mo30710() - this.mOrientationHelper.mo30703(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final int m30152(RecyclerView.C8935 c8935) {
        if (getChildCount() != 0 && c8935.m30375() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f29911.m4897(c8935.m30375() - 1, this.f3868) + 1;
                }
                int iMo30700 = this.mOrientationHelper.mo30700(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo30703(viewFindFirstVisibleChildClosestToStart);
                int iM4897 = this.f29911.m4897(getPosition(viewFindFirstVisibleChildClosestToStart), this.f3868);
                return (int) ((iMo30700 / ((this.f29911.m4897(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f3868) - iM4897) + 1)) * (this.f29911.m4897(c8935.m30375() - 1, this.f3868) + 1));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m30153(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, LinearLayoutManager.C1740 c1740, int i) {
        boolean z = i == 1;
        int iM30158 = m30158(c8929, c8935, c1740.f3872);
        if (z) {
            while (iM30158 > 0) {
                int i2 = c1740.f3872;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c1740.f3872 = i3;
                iM30158 = m30158(c8929, c8935, i3);
            }
            return;
        }
        int iM30375 = c8935.m30375() - 1;
        int i4 = c1740.f3872;
        while (i4 < iM30375) {
            int i5 = i4 + 1;
            int iM301582 = m30158(c8929, c8935, i5);
            if (iM301582 <= iM30158) {
                break;
            }
            i4 = i5;
            iM30158 = iM301582;
        }
        c1740.f3872 = i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m30154() {
        View[] viewArr = this.f29908;
        if (viewArr == null || viewArr.length != this.f3868) {
            this.f29908 = new View[this.f3868];
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public int m30155(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f29907;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f29907;
        int i3 = this.f3868;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public int m30156() {
        return this.f3868;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final int m30157(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, int i) {
        if (!c8935.m30381()) {
            return this.f29911.m4897(i, this.f3868);
        }
        int iM30328 = c8929.m30328(i);
        if (iM30328 != -1) {
            return this.f29911.m4897(iM30328, this.f3868);
        }
        Log.w(f29905, "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final int m30158(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, int i) {
        if (!c8935.m30381()) {
            return this.f29911.m30173(i, this.f3868);
        }
        int i2 = this.f29910.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM30328 = c8929.m30328(i);
        if (iM30328 != -1) {
            return this.f29911.m30173(iM30328, this.f3868);
        }
        Log.w(f29905, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final int m30159(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, int i) {
        if (!c8935.m30381()) {
            return this.f29911.mo30170(i);
        }
        int i2 = this.f29909.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM30328 = c8929.m30328(i);
        if (iM30328 != -1) {
            return this.f29911.mo30170(iM30328);
        }
        Log.w(f29905, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public AbstractC8902 m30160() {
        return this.f29911;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m30161(float f, int i) {
        m30149(Math.max(Math.round(f * this.f3868), i));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m30162() {
        return this.f29913;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m30163(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C1739 c1739 = (C1739) view.getLayoutParams();
        Rect rect = c1739.f3892;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1739).topMargin + ((ViewGroup.MarginLayoutParams) c1739).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1739).leftMargin + ((ViewGroup.MarginLayoutParams) c1739).rightMargin;
        int iM30155 = m30155(c1739.f29915, c1739.f29916);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.AbstractC8919.getChildMeasureSpec(iM30155, i, i3, ((ViewGroup.MarginLayoutParams) c1739).width, false);
            childMeasureSpec = RecyclerView.AbstractC8919.getChildMeasureSpec(this.mOrientationHelper.mo30711(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c1739).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.AbstractC8919.getChildMeasureSpec(iM30155, i, i2, ((ViewGroup.MarginLayoutParams) c1739).height, false);
            int childMeasureSpec4 = RecyclerView.AbstractC8919.getChildMeasureSpec(this.mOrientationHelper.mo30711(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c1739).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        m30164(view, childMeasureSpec2, childMeasureSpec, z);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m30164(View view, int i, int i2, boolean z) {
        RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, c8922) : shouldMeasureChild(view, i, i2, c8922)) {
            view.measure(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m30165(int i) {
        if (i == this.f3868) {
            return;
        }
        this.f3867 = true;
        if (i >= 1) {
            this.f3868 = i;
            this.f29911.m30176();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m30166(AbstractC8902 abstractC8902) {
        this.f29911 = abstractC8902;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m30167(boolean z) {
        this.f29913 = z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m30168() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m30149(height - paddingTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1739((ViewGroup.MarginLayoutParams) layoutParams) : new C1739(layoutParams);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$ۥ۟ */
    public static class C1739 extends RecyclerView.C8922 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f29914 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29915;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29916;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1739(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29915 = -1;
            this.f29916 = 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int m30171() {
            return this.f29915;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int m30172() {
            return this.f29916;
        }

        public C1739(int i, int i2) {
            super(i, i2);
            this.f29915 = -1;
            this.f29916 = 0;
        }

        public C1739(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f29915 = -1;
            this.f29916 = 0;
        }

        public C1739(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f29915 = -1;
            this.f29916 = 0;
        }

        public C1739(RecyclerView.C8922 c8922) {
            super(c8922);
            this.f29915 = -1;
            this.f29916 = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f3867 = false;
        this.f3868 = -1;
        this.f29909 = new SparseIntArray();
        this.f29910 = new SparseIntArray();
        this.f29911 = new C1738();
        this.f29912 = new Rect();
        m30165(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f3867 = false;
        this.f3868 = -1;
        this.f29909 = new SparseIntArray();
        this.f29910 = new SparseIntArray();
        this.f29911 = new C1738();
        this.f29912 = new Rect();
        m30165(i);
    }
}
