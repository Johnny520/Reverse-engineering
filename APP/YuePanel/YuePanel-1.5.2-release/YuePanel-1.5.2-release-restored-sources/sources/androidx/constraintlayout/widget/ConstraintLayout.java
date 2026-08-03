package androidx.constraintlayout.widget;

import Yue.AbstractC4130;
import Yue.C3526;
import Yue.C4125;
import Yue.C4128;
import Yue.C4129;
import Yue.C4750;
import Yue.C5226;
import Yue.C6226;
import Yue.C6579;
import Yue.C8273;
import Yue.C8387;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C8778;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    SparseArray<View> mChildrenByIds;
    private ArrayList<AbstractC8767> mConstraintHelpers;
    protected C8768 mConstraintLayoutSpec;
    private C8770 mConstraintSet;
    private int mConstraintSetId;
    private AbstractC4130 mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected C4129 mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    C8764 mMeasurer;
    private C6226 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<C4128> mTempMapIdToWidget;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ */
    public static /* synthetic */ class C1640 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3684;

        static {
            int[] iArr = new int[C4128.EnumC0339.values().length];
            f3684 = iArr;
            try {
                iArr[C4128.EnumC0339.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3684[C4128.EnumC0339.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3684[C4128.EnumC0339.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3684[C4128.EnumC0339.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ۟۟, reason: contains not printable characters */
    public class C8764 implements C3526.InterfaceC0170 {

        /* JADX INFO: renamed from: ۥ */
        public ConstraintLayout f3689;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3690;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f26593;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f26594;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f26595;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f26596;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f26597;

        public C8764(ConstraintLayout constraintLayout) {
            this.f3689 = constraintLayout;
        }

        @Override // Yue.C3526.InterfaceC0170
        /* JADX INFO: renamed from: ۥ */
        public final void mo593() {
            int childCount = this.f3689.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f3689.getChildAt(i);
                if (childAt instanceof C8777) {
                    ((C8777) childAt).m4731(this.f3689);
                }
            }
            int size = this.f3689.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC8767) this.f3689.mConstraintHelpers.get(i2)).m29293(this.f3689);
                }
            }
        }

        @Override // Yue.C3526.InterfaceC0170
        @SuppressLint({"WrongCall"})
        /* JADX INFO: renamed from: ۥ۟ */
        public final void mo594(C4128 c4128, C3526.C0169 c0169) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i;
            int measuredHeight;
            int i2;
            if (c4128 == null) {
                return;
            }
            if (c4128.m11890() == 8 && !c4128.m11901()) {
                c0169.f5972 = 0;
                c0169.f5973 = 0;
                c0169.f5974 = 0;
                return;
            }
            if (c4128.m11876() == null) {
                return;
            }
            C4128.EnumC0339 enumC0339 = c0169.f363;
            C4128.EnumC0339 enumC03392 = c0169.f364;
            int i3 = c0169.f5970;
            int i4 = c0169.f5971;
            int i5 = this.f3690 + this.f26593;
            int i6 = this.f26594;
            View view = (View) c4128.m11852();
            int[] iArr = C1640.f3684;
            int i7 = iArr[enumC0339.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f26596, i6, -2);
            } else if (i7 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f26596, i6 + c4128.m11864(), -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f26596, i6, -2);
                boolean z = c4128.f8366 == 1;
                int i8 = c0169.f5977;
                if (i8 == C3526.C0169.f5968 || i8 == C3526.C0169.f5969) {
                    boolean z2 = view.getMeasuredHeight() == c4128.m11859();
                    if (c0169.f5977 == C3526.C0169.f5969 || !z || ((z && z2) || (view instanceof C8777) || c4128.mo9343())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c4128.m11891(), 1073741824);
                    }
                }
            }
            int i9 = iArr[enumC03392.ordinal()];
            if (i9 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i9 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f26597, i5, -2);
            } else if (i9 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f26597, i5 + c4128.m11889(), -1);
            } else if (i9 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f26597, i5, -2);
                boolean z3 = c4128.f8367 == 1;
                int i10 = c0169.f5977;
                if (i10 == C3526.C0169.f5968 || i10 == C3526.C0169.f5969) {
                    boolean z4 = view.getMeasuredWidth() == c4128.m11891();
                    if (c0169.f5977 == C3526.C0169.f5969 || !z3 || ((z3 && z4) || (view instanceof C8777) || c4128.mo9344())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c4128.m11859(), 1073741824);
                    }
                }
            }
            C4129 c4129 = (C4129) c4128.m11876();
            if (c4129 != null && C6579.m3034(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == c4128.m11891() && view.getMeasuredWidth() < c4129.m11891() && view.getMeasuredHeight() == c4128.m11859() && view.getMeasuredHeight() < c4129.m11859() && view.getBaseline() == c4128.m11849() && !c4128.m11904() && m29264(c4128.m11865(), iMakeMeasureSpec, c4128.m11891()) && m29264(c4128.m11866(), iMakeMeasureSpec2, c4128.m11859())) {
                c0169.f5972 = c4128.m11891();
                c0169.f5973 = c4128.m11859();
                c0169.f5974 = c4128.m11849();
                return;
            }
            C4128.EnumC0339 enumC03393 = C4128.EnumC0339.MATCH_CONSTRAINT;
            boolean z5 = enumC0339 == enumC03393;
            boolean z6 = enumC03392 == enumC03393;
            C4128.EnumC0339 enumC03394 = C4128.EnumC0339.MATCH_PARENT;
            boolean z7 = enumC03392 == enumC03394 || enumC03392 == C4128.EnumC0339.FIXED;
            boolean z8 = enumC0339 == enumC03394 || enumC0339 == C4128.EnumC0339.FIXED;
            boolean z9 = z5 && c4128.f8401 > 0.0f;
            boolean z10 = z6 && c4128.f8401 > 0.0f;
            if (view == null) {
                return;
            }
            C1641 c1641 = (C1641) view.getLayoutParams();
            int i11 = c0169.f5977;
            if (i11 != C3526.C0169.f5968 && i11 != C3526.C0169.f5969 && z5 && c4128.f8366 == 0 && z6 && c4128.f8367 == 0) {
                i2 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof AbstractC8791) && (c4128 instanceof C8387)) {
                    ((AbstractC8791) view).mo29256((C8387) c4128, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c4128.m11946(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i12 = c4128.f8369;
                iMax = i12 > 0 ? Math.max(i12, measuredWidth) : measuredWidth;
                int i13 = c4128.f8370;
                if (i13 > 0) {
                    iMax = Math.min(i13, iMax);
                }
                int i14 = c4128.f8372;
                if (i14 > 0) {
                    measuredHeight = Math.max(i14, measuredHeight2);
                    i = iMakeMeasureSpec;
                } else {
                    i = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i15 = c4128.f8373;
                if (i15 > 0) {
                    measuredHeight = Math.min(i15, measuredHeight);
                }
                if (!C6579.m3034(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((measuredHeight * c4128.f8401) + 0.5f);
                    } else if (z10 && z8) {
                        measuredHeight = (int) ((iMax / c4128.f8401) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    c4128.m11946(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i2 = -1;
            }
            boolean z11 = baseline != i2;
            c0169.f5976 = (iMax == c0169.f5970 && measuredHeight == c0169.f5971) ? false : true;
            if (c1641.f26525) {
                z11 = true;
            }
            if (z11 && baseline != -1 && c4128.m11849() != baseline) {
                c0169.f5976 = true;
            }
            c0169.f5972 = iMax;
            c0169.f5973 = measuredHeight;
            c0169.f5975 = z11;
            c0169.f5974 = baseline;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29263(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f3690 = i3;
            this.f26593 = i4;
            this.f26594 = i5;
            this.f26595 = i6;
            this.f26596 = i;
            this.f26597 = i2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m29264(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConstraintLayout(@InterfaceC6391 Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C4129();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C8764(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m4704(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, C4128 c4128, C1641 c1641, SparseArray<C4128> sparseArray) {
        float f;
        C4128 c41282;
        C4128 c41283;
        C4128 c41284;
        C4128 c41285;
        int i;
        c1641.m29262();
        c1641.f26541 = false;
        c4128.m11964(view.getVisibility());
        if (c1641.f26528) {
            c4128.m11944(true);
            c4128.m11964(8);
        }
        c4128.m11918(view);
        if (view instanceof AbstractC8767) {
            ((AbstractC8767) view).mo29255(c4128, this.mLayoutWidget.m11998());
        }
        if (c1641.f26526) {
            C5226 c5226 = (C5226) c4128;
            int i2 = c1641.f26537;
            int i3 = c1641.f26538;
            float f2 = c1641.f26539;
            if (f2 != -1.0f) {
                c5226.m16015(f2);
                return;
            } else if (i2 != -1) {
                c5226.m16013(i2);
                return;
            } else {
                if (i3 != -1) {
                    c5226.m16014(i3);
                    return;
                }
                return;
            }
        }
        int i4 = c1641.f26530;
        int i5 = c1641.f26531;
        int i6 = c1641.f26532;
        int i7 = c1641.f26533;
        int i8 = c1641.f26534;
        int i9 = c1641.f26535;
        float f3 = c1641.f26536;
        int i10 = c1641.f26487;
        if (i10 != -1) {
            C4128 c41286 = sparseArray.get(i10);
            if (c41286 != null) {
                c4128.m11843(c41286, c1641.f26489, c1641.f26488);
            }
        } else {
            if (i4 != -1) {
                C4128 c41287 = sparseArray.get(i4);
                if (c41287 != null) {
                    C4125.EnumC0335 enumC0335 = C4125.EnumC0335.LEFT;
                    f = f3;
                    c4128.m11897(enumC0335, c41287, enumC0335, ((ViewGroup.MarginLayoutParams) c1641).leftMargin, i8);
                } else {
                    f = f3;
                }
            } else {
                f = f3;
                if (i5 != -1 && (c41282 = sparseArray.get(i5)) != null) {
                    c4128.m11897(C4125.EnumC0335.LEFT, c41282, C4125.EnumC0335.RIGHT, ((ViewGroup.MarginLayoutParams) c1641).leftMargin, i8);
                }
            }
            if (i6 != -1) {
                C4128 c41288 = sparseArray.get(i6);
                if (c41288 != null) {
                    c4128.m11897(C4125.EnumC0335.RIGHT, c41288, C4125.EnumC0335.LEFT, ((ViewGroup.MarginLayoutParams) c1641).rightMargin, i9);
                }
            } else if (i7 != -1 && (c41283 = sparseArray.get(i7)) != null) {
                C4125.EnumC0335 enumC03352 = C4125.EnumC0335.RIGHT;
                c4128.m11897(enumC03352, c41283, enumC03352, ((ViewGroup.MarginLayoutParams) c1641).rightMargin, i9);
            }
            int i11 = c1641.f26482;
            if (i11 != -1) {
                C4128 c41289 = sparseArray.get(i11);
                if (c41289 != null) {
                    C4125.EnumC0335 enumC03353 = C4125.EnumC0335.TOP;
                    c4128.m11897(enumC03353, c41289, enumC03353, ((ViewGroup.MarginLayoutParams) c1641).topMargin, c1641.f26495);
                }
            } else {
                int i12 = c1641.f26483;
                if (i12 != -1 && (c41284 = sparseArray.get(i12)) != null) {
                    c4128.m11897(C4125.EnumC0335.TOP, c41284, C4125.EnumC0335.BOTTOM, ((ViewGroup.MarginLayoutParams) c1641).topMargin, c1641.f26495);
                }
            }
            int i13 = c1641.f26484;
            if (i13 != -1) {
                C4128 c412810 = sparseArray.get(i13);
                if (c412810 != null) {
                    c4128.m11897(C4125.EnumC0335.BOTTOM, c412810, C4125.EnumC0335.TOP, ((ViewGroup.MarginLayoutParams) c1641).bottomMargin, c1641.f26497);
                }
            } else {
                int i14 = c1641.f26485;
                if (i14 != -1 && (c41285 = sparseArray.get(i14)) != null) {
                    C4125.EnumC0335 enumC03354 = C4125.EnumC0335.BOTTOM;
                    c4128.m11897(enumC03354, c41285, enumC03354, ((ViewGroup.MarginLayoutParams) c1641).bottomMargin, c1641.f26497);
                }
            }
            int i15 = c1641.f26486;
            if (i15 != -1) {
                View view2 = this.mChildrenByIds.get(i15);
                C4128 c412811 = sparseArray.get(c1641.f26486);
                if (c412811 != null && view2 != null && (view2.getLayoutParams() instanceof C1641)) {
                    C1641 c16412 = (C1641) view2.getLayoutParams();
                    c1641.f26525 = true;
                    c16412.f26525 = true;
                    C4125.EnumC0335 enumC03355 = C4125.EnumC0335.BASELINE;
                    c4128.mo11847(enumC03355).m1092(c412811.mo11847(enumC03355), 0, -1, true);
                    c4128.m11934(true);
                    c16412.f26540.m11934(true);
                    c4128.mo11847(C4125.EnumC0335.TOP).m11780();
                    c4128.mo11847(C4125.EnumC0335.BOTTOM).m11780();
                }
            }
            float f4 = f;
            if (f4 >= 0.0f) {
                c4128.m11937(f4);
            }
            float f5 = c1641.f26501;
            if (f5 >= 0.0f) {
                c4128.m11958(f5);
            }
        }
        if (z && ((i = c1641.f26517) != -1 || c1641.f26518 != -1)) {
            c4128.m11954(i, c1641.f26518);
        }
        if (c1641.f26523) {
            c4128.m11940(C4128.EnumC0339.FIXED);
            c4128.m11965(((ViewGroup.MarginLayoutParams) c1641).width);
            if (((ViewGroup.MarginLayoutParams) c1641).width == -2) {
                c4128.m11940(C4128.EnumC0339.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c1641).width == -1) {
            if (c1641.f26520) {
                c4128.m11940(C4128.EnumC0339.MATCH_CONSTRAINT);
            } else {
                c4128.m11940(C4128.EnumC0339.MATCH_PARENT);
            }
            c4128.mo11847(C4125.EnumC0335.LEFT).f8276 = ((ViewGroup.MarginLayoutParams) c1641).leftMargin;
            c4128.mo11847(C4125.EnumC0335.RIGHT).f8276 = ((ViewGroup.MarginLayoutParams) c1641).rightMargin;
        } else {
            c4128.m11940(C4128.EnumC0339.MATCH_CONSTRAINT);
            c4128.m11965(0);
        }
        if (c1641.f26524) {
            c4128.m11961(C4128.EnumC0339.FIXED);
            c4128.m11935(((ViewGroup.MarginLayoutParams) c1641).height);
            if (((ViewGroup.MarginLayoutParams) c1641).height == -2) {
                c4128.m11961(C4128.EnumC0339.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c1641).height == -1) {
            if (c1641.f26521) {
                c4128.m11961(C4128.EnumC0339.MATCH_CONSTRAINT);
            } else {
                c4128.m11961(C4128.EnumC0339.MATCH_PARENT);
            }
            c4128.mo11847(C4125.EnumC0335.TOP).f8276 = ((ViewGroup.MarginLayoutParams) c1641).topMargin;
            c4128.mo11847(C4125.EnumC0335.BOTTOM).f8276 = ((ViewGroup.MarginLayoutParams) c1641).bottomMargin;
        } else {
            c4128.m11961(C4128.EnumC0339.MATCH_CONSTRAINT);
            c4128.m11935(0);
        }
        c4128.m11924(c1641.f26502);
        c4128.m11942(c1641.f26505);
        c4128.m11963(c1641.f26506);
        c4128.m11938(c1641.f26507);
        c4128.m11959(c1641.f26508);
        c4128.m11941(c1641.f26509, c1641.f26511, c1641.f26513, c1641.f26515);
        c4128.m11962(c1641.f26510, c1641.f26512, c1641.f26514, c1641.f26516);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1641;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC8767> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).mo17581(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C6226 c6226) {
        this.mMetrics = c6226;
        this.mLayoutWidget.m11988(c6226);
    }

    @Override // android.view.View
    public void forceLayout() {
        m29257();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m11991();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final C4128 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C1641) view.getLayoutParams()).f26540;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new C8768(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1641 c1641 = (C1641) childAt.getLayoutParams();
            C4128 c4128 = c1641.f26540;
            if ((childAt.getVisibility() != 8 || c1641.f26526 || c1641.f26527 || c1641.f26529 || zIsInEditMode) && !c1641.f26528) {
                int iM11892 = c4128.m11892();
                int iM11893 = c4128.m11893();
                int iM11891 = c4128.m11891() + iM11892;
                int iM11859 = c4128.m11859() + iM11893;
                childAt.layout(iM11892, iM11893, iM11891, iM11859);
                if ((childAt instanceof C8777) && (content = ((C8777) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM11892, iM11893, iM11891, iM11859);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo17580(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m11891(), this.mLayoutWidget.m11859(), this.mLayoutWidget.m11999(), this.mLayoutWidget.m11997());
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.m11859()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m11891(), this.mLayoutWidget.m11859(), this.mLayoutWidget.m11999(), this.mLayoutWidget.m11997());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m12006(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m29259()) {
                this.mLayoutWidget.m12008();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m11891(), this.mLayoutWidget.m11859(), this.mLayoutWidget.m11999(), this.mLayoutWidget.m11997());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C4128 viewWidget = getViewWidget(view);
        if ((view instanceof C8776) && !(viewWidget instanceof C5226)) {
            C1641 c1641 = (C1641) view.getLayoutParams();
            C5226 c5226 = new C5226();
            c1641.f26540 = c5226;
            c1641.f26526 = true;
            c5226.m16018(c1641.f26519);
        }
        if (view instanceof AbstractC8767) {
            AbstractC8767 abstractC8767 = (AbstractC8767) view;
            abstractC8767.m29296();
            ((C1641) view.getLayoutParams()).f26527 = true;
            if (!this.mConstraintHelpers.contains(abstractC8767)) {
                this.mConstraintHelpers.add(abstractC8767);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.m28194(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C8768(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m29257();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C8764 c8764 = this.mMeasurer;
        int i5 = c8764.f26595;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c8764.f26594, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0);
        int i6 = iResolveSizeAndState & C8273.f24691;
        int i7 = iResolveSizeAndState2 & C8273.f24691;
        int iMin = Math.min(this.mMaxWidth, i6);
        int iMin2 = Math.min(this.mMaxHeight, i7);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(C4129 c4129, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.m29263(i2, i3, iMax, iMax2, paddingWidth, i4);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? isRtl() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c4129, mode, i5, mode2, i6);
        c4129.m12000(i, mode, i5, mode2, i6, this.mLastMeasureWidth, this.mLastMeasureHeight, iMax5, iMax);
    }

    public void setConstraintSet(C8770 c8770) {
        this.mConstraintSet = c8770;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC4130 abstractC4130) {
        this.mConstraintsChangedListener = abstractC4130;
        C8768 c8768 = this.mConstraintLayoutSpec;
        if (c8768 != null) {
            c8768.m29298(abstractC4130);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m12004(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 Yue.ۥ۟ۧ۟ۢ$ۥ۟) = (r2v3 Yue.ۥ۟ۧ۟ۢ$ۥ۟), (r2v0 Yue.ۥ۟ۧ۟ۢ$ۥ۟) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelfDimensionBehaviour(C4129 c4129, int i, int i2, int i3, int i4) {
        C4128.EnumC0339 enumC0339;
        C8764 c8764 = this.mMeasurer;
        int i5 = c8764.f26595;
        int i6 = c8764.f26594;
        C4128.EnumC0339 enumC03392 = C4128.EnumC0339.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC0339 = C4128.EnumC0339.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            enumC0339 = C4128.EnumC0339.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i != 1073741824) {
            enumC0339 = enumC03392;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            enumC0339 = enumC03392;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC03392 = C4128.EnumC0339.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 != 0) {
            i4 = i3 != 1073741824 ? 0 : Math.min(this.mMaxHeight - i5, i4);
        } else {
            enumC03392 = C4128.EnumC0339.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (i2 != c4129.m11891() || i4 != c4129.m11859()) {
            c4129.m11996();
        }
        c4129.m11967(0);
        c4129.m11968(0);
        c4129.m11949(this.mMaxWidth - i6);
        c4129.m11948(this.mMaxHeight - i5);
        c4129.m11952(0);
        c4129.m11951(0);
        c4129.m11940(enumC0339);
        c4129.m11965(i2);
        c4129.m11961(enumC03392);
        c4129.m11935(i4);
        c4129.m11952(this.mMinWidth - i6);
        c4129.m11951(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C8768 c8768 = this.mConstraintLayoutSpec;
        if (c8768 != null) {
            c8768.m29299(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ */
    public final C4128 m4703(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C1641) viewFindViewById.getLayoutParams()).f26540;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4704(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m11918(this);
        this.mLayoutWidget.m12003(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28715, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == C8778.C8789.f28725) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C8778.C8789.f28726) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C8778.C8789.f28723) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C8778.C8789.f28724) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C8778.C8789.f28806) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C8778.C8789.f28755) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C8778.C8789.f28734) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C8770 c8770 = new C8770();
                        this.mConstraintSet = c8770;
                        c8770.m29411(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m12004(this.mOptimizationLevel);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29257() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29258() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C4128 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo11911();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m4703(childAt.getId()).m11920(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C8774)) {
                    this.mConstraintSet = ((C8774) childAt2).getConstraintSet();
                }
            }
        }
        C8770 c8770 = this.mConstraintSet;
        if (c8770 != null) {
            c8770.m29359(this, true);
        }
        this.mLayoutWidget.m28195();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).m29295(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C8777) {
                ((C8777) childAt3).m29480(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C4128 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C1641 c1641 = (C1641) childAt5.getLayoutParams();
                this.mLayoutWidget.m4410(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, c1641, this.mTempMapIdToWidget);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m29259() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            m29258();
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C1641 generateDefaultLayoutParams() {
        return new C1641(-2, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C1641 generateLayoutParams(AttributeSet attributeSet) {
        return new C1641(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1641(layoutParams);
    }

    public ConstraintLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C4129();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C8764(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m4704(attributeSet, 0, 0);
    }

    public ConstraintLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C4129();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C8764(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m4704(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C4129();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C8764(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m4704(attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ */
    public static class C1641 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public static final int f26459 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
        public static final int f26460 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
        public static final int f26461 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
        public static final int f26462 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
        public static final int f26463 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
        public static final int f26464 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
        public static final int f26465 = 2;

        /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
        public static final int f26466 = 3;

        /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
        public static final int f26467 = 4;

        /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
        public static final int f26468 = 5;

        /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
        public static final int f26469 = 6;

        /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
        public static final int f26470 = 7;

        /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
        public static final int f26471 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
        public static final int f26472 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
        public static final int f26473 = 2;

        /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
        public static final int f26474 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
        public static final int f26475 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
        public static final int f26476 = 2;

        /* JADX INFO: renamed from: ۥ */
        public int f3685;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3686;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f26477;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f26478;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f26479;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f26480;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f26481;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f26482;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f26483;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f26484;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f26485;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int f26486;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f26487;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int f26488;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public float f26489;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f26490;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f26491;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int f26492;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public int f26493;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f26494;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f26495;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f26496;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f26497;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f26498;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f26499;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public float f26500;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public float f26501;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public String f26502;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public float f26503;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public int f26504;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public float f26505;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public float f26506;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public int f26507;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public int f26508;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public int f26509;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public int f26510;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public int f26511;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public int f26512;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public int f26513;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public int f26514;

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public float f26515;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public float f26516;

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public int f26517;

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public int f26518;

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public int f26519;

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public boolean f26520;

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public boolean f26521;

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public String f26522;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f26523;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f26524;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public boolean f26525;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public boolean f26526;

        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public boolean f26527;

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public boolean f26528;

        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public boolean f26529;

        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public int f26530;

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public int f26531;

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public int f26532;

        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public int f26533;

        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public int f26534;

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public int f26535;

        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public float f26536;

        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public int f26537;

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public int f26538;

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public float f26539;

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public C4128 f26540;

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public boolean f26541;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C8763 {

            /* JADX INFO: renamed from: ۥ */
            public static final int f3687 = 0;

            /* JADX INFO: renamed from: ۥ۟ */
            public static final int f3688 = 1;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static final int f26542 = 2;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static final int f26543 = 3;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static final int f26544 = 4;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static final int f26545 = 5;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public static final int f26546 = 6;

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static final int f26547 = 7;

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static final int f26548 = 8;

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public static final int f26549 = 9;

            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public static final int f26550 = 10;

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public static final int f26551 = 11;

            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public static final int f26552 = 12;

            /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
            public static final int f26553 = 13;

            /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
            public static final int f26554 = 14;

            /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
            public static final int f26555 = 15;

            /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
            public static final int f26556 = 16;

            /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
            public static final int f26557 = 17;

            /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
            public static final int f26558 = 18;

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final int f26559 = 19;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public static final int f26560 = 20;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public static final int f26561 = 21;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public static final int f26562 = 22;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public static final int f26563 = 23;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public static final int f26564 = 24;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public static final int f26565 = 25;

            /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
            public static final int f26566 = 26;

            /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
            public static final int f26567 = 27;

            /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
            public static final int f26568 = 28;

            /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
            public static final int f26569 = 29;

            /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
            public static final int f26570 = 30;

            /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
            public static final int f26571 = 31;

            /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
            public static final int f26572 = 32;

            /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
            public static final int f26573 = 33;

            /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
            public static final int f26574 = 34;

            /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
            public static final int f26575 = 35;

            /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
            public static final int f26576 = 36;

            /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
            public static final int f26577 = 37;

            /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
            public static final int f26578 = 38;

            /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
            public static final int f26579 = 39;

            /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
            public static final int f26580 = 40;

            /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
            public static final int f26581 = 41;

            /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
            public static final int f26582 = 42;

            /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
            public static final int f26583 = 43;

            /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
            public static final int f26584 = 44;

            /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
            public static final int f26585 = 45;

            /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
            public static final int f26586 = 46;

            /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
            public static final int f26587 = 47;

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static final int f26588 = 48;

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final int f26589 = 49;

            /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
            public static final int f26590 = 50;

            /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
            public static final int f26591 = 51;

            /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
            public static final SparseIntArray f26592;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f26592 = sparseIntArray;
                sparseIntArray.append(C8778.C8789.f28780, 8);
                sparseIntArray.append(C8778.C8789.f28781, 9);
                sparseIntArray.append(C8778.C8789.f28783, 10);
                sparseIntArray.append(C8778.C8789.f28784, 11);
                sparseIntArray.append(C8778.C8789.f28790, 12);
                sparseIntArray.append(C8778.C8789.f28789, 13);
                sparseIntArray.append(C8778.C8789.f28762, 14);
                sparseIntArray.append(C8778.C8789.f28761, 15);
                sparseIntArray.append(C8778.C8789.f28759, 16);
                sparseIntArray.append(C8778.C8789.f28763, 2);
                sparseIntArray.append(C8778.C8789.f28765, 3);
                sparseIntArray.append(C8778.C8789.f28764, 4);
                sparseIntArray.append(C8778.C8789.f28798, 49);
                sparseIntArray.append(C8778.C8789.f28799, 50);
                sparseIntArray.append(C8778.C8789.f28769, 5);
                sparseIntArray.append(C8778.C8789.f28770, 6);
                sparseIntArray.append(C8778.C8789.f28771, 7);
                sparseIntArray.append(C8778.C8789.f28716, 1);
                sparseIntArray.append(C8778.C8789.f28785, 17);
                sparseIntArray.append(C8778.C8789.f28786, 18);
                sparseIntArray.append(C8778.C8789.f28768, 19);
                sparseIntArray.append(C8778.C8789.f28767, 20);
                sparseIntArray.append(C8778.C8789.f28802, 21);
                sparseIntArray.append(C8778.C8789.f28805, 22);
                sparseIntArray.append(C8778.C8789.f28803, 23);
                sparseIntArray.append(C8778.C8789.f28800, 24);
                sparseIntArray.append(C8778.C8789.f28804, 25);
                sparseIntArray.append(C8778.C8789.f28801, 26);
                sparseIntArray.append(C8778.C8789.f28776, 29);
                sparseIntArray.append(C8778.C8789.f28791, 30);
                sparseIntArray.append(C8778.C8789.f28766, 44);
                sparseIntArray.append(C8778.C8789.f28778, 45);
                sparseIntArray.append(C8778.C8789.f28793, 46);
                sparseIntArray.append(C8778.C8789.f28777, 47);
                sparseIntArray.append(C8778.C8789.f28792, 48);
                sparseIntArray.append(C8778.C8789.f28757, 27);
                sparseIntArray.append(C8778.C8789.f28756, 28);
                sparseIntArray.append(C8778.C8789.f28794, 31);
                sparseIntArray.append(C8778.C8789.f28772, 32);
                sparseIntArray.append(C8778.C8789.f28796, 33);
                sparseIntArray.append(C8778.C8789.f28795, 34);
                sparseIntArray.append(C8778.C8789.f28797, 35);
                sparseIntArray.append(C8778.C8789.f28774, 36);
                sparseIntArray.append(C8778.C8789.f28773, 37);
                sparseIntArray.append(C8778.C8789.f28775, 38);
                sparseIntArray.append(C8778.C8789.f28779, 39);
                sparseIntArray.append(C8778.C8789.f28788, 40);
                sparseIntArray.append(C8778.C8789.f28782, 41);
                sparseIntArray.append(C8778.C8789.f28760, 42);
                sparseIntArray.append(C8778.C8789.f28758, 43);
                sparseIntArray.append(C8778.C8789.f28787, 51);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1641(C1641 c1641) {
            super((ViewGroup.MarginLayoutParams) c1641);
            this.f3685 = -1;
            this.f3686 = -1;
            this.f26477 = -1.0f;
            this.f26478 = -1;
            this.f26479 = -1;
            this.f26480 = -1;
            this.f26481 = -1;
            this.f26482 = -1;
            this.f26483 = -1;
            this.f26484 = -1;
            this.f26485 = -1;
            this.f26486 = -1;
            this.f26487 = -1;
            this.f26488 = 0;
            this.f26489 = 0.0f;
            this.f26490 = -1;
            this.f26491 = -1;
            this.f26492 = -1;
            this.f26493 = -1;
            this.f26494 = -1;
            this.f26495 = -1;
            this.f26496 = -1;
            this.f26497 = -1;
            this.f26498 = -1;
            this.f26499 = -1;
            this.f26500 = 0.5f;
            this.f26501 = 0.5f;
            this.f26502 = null;
            this.f26503 = 0.0f;
            this.f26504 = 1;
            this.f26505 = -1.0f;
            this.f26506 = -1.0f;
            this.f26507 = 0;
            this.f26508 = 0;
            this.f26509 = 0;
            this.f26510 = 0;
            this.f26511 = 0;
            this.f26512 = 0;
            this.f26513 = 0;
            this.f26514 = 0;
            this.f26515 = 1.0f;
            this.f26516 = 1.0f;
            this.f26517 = -1;
            this.f26518 = -1;
            this.f26519 = -1;
            this.f26520 = false;
            this.f26521 = false;
            this.f26522 = null;
            this.f26523 = true;
            this.f26524 = true;
            this.f26525 = false;
            this.f26526 = false;
            this.f26527 = false;
            this.f26528 = false;
            this.f26529 = false;
            this.f26530 = -1;
            this.f26531 = -1;
            this.f26532 = -1;
            this.f26533 = -1;
            this.f26534 = -1;
            this.f26535 = -1;
            this.f26536 = 0.5f;
            this.f26540 = new C4128();
            this.f26541 = false;
            this.f3685 = c1641.f3685;
            this.f3686 = c1641.f3686;
            this.f26477 = c1641.f26477;
            this.f26478 = c1641.f26478;
            this.f26479 = c1641.f26479;
            this.f26480 = c1641.f26480;
            this.f26481 = c1641.f26481;
            this.f26482 = c1641.f26482;
            this.f26483 = c1641.f26483;
            this.f26484 = c1641.f26484;
            this.f26485 = c1641.f26485;
            this.f26486 = c1641.f26486;
            this.f26487 = c1641.f26487;
            this.f26488 = c1641.f26488;
            this.f26489 = c1641.f26489;
            this.f26490 = c1641.f26490;
            this.f26491 = c1641.f26491;
            this.f26492 = c1641.f26492;
            this.f26493 = c1641.f26493;
            this.f26494 = c1641.f26494;
            this.f26495 = c1641.f26495;
            this.f26496 = c1641.f26496;
            this.f26497 = c1641.f26497;
            this.f26498 = c1641.f26498;
            this.f26499 = c1641.f26499;
            this.f26500 = c1641.f26500;
            this.f26501 = c1641.f26501;
            this.f26502 = c1641.f26502;
            this.f26503 = c1641.f26503;
            this.f26504 = c1641.f26504;
            this.f26505 = c1641.f26505;
            this.f26506 = c1641.f26506;
            this.f26507 = c1641.f26507;
            this.f26508 = c1641.f26508;
            this.f26520 = c1641.f26520;
            this.f26521 = c1641.f26521;
            this.f26509 = c1641.f26509;
            this.f26510 = c1641.f26510;
            this.f26511 = c1641.f26511;
            this.f26513 = c1641.f26513;
            this.f26512 = c1641.f26512;
            this.f26514 = c1641.f26514;
            this.f26515 = c1641.f26515;
            this.f26516 = c1641.f26516;
            this.f26517 = c1641.f26517;
            this.f26518 = c1641.f26518;
            this.f26519 = c1641.f26519;
            this.f26523 = c1641.f26523;
            this.f26524 = c1641.f26524;
            this.f26525 = c1641.f26525;
            this.f26526 = c1641.f26526;
            this.f26530 = c1641.f26530;
            this.f26531 = c1641.f26531;
            this.f26532 = c1641.f26532;
            this.f26533 = c1641.f26533;
            this.f26534 = c1641.f26534;
            this.f26535 = c1641.f26535;
            this.f26536 = c1641.f26536;
            this.f26522 = c1641.f26522;
            this.f26540 = c1641.f26540;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.f26532 = -1;
            this.f26533 = -1;
            this.f26530 = -1;
            this.f26531 = -1;
            this.f26534 = this.f26494;
            this.f26535 = this.f26496;
            float f = this.f26500;
            this.f26536 = f;
            int i8 = this.f3685;
            this.f26537 = i8;
            int i9 = this.f3686;
            this.f26538 = i9;
            float f2 = this.f26477;
            this.f26539 = f2;
            if (z2) {
                int i10 = this.f26490;
                if (i10 != -1) {
                    this.f26532 = i10;
                } else {
                    int i11 = this.f26491;
                    if (i11 != -1) {
                        this.f26533 = i11;
                    }
                    i2 = this.f26492;
                    if (i2 != -1) {
                        this.f26531 = i2;
                        z = true;
                    }
                    i3 = this.f26493;
                    if (i3 != -1) {
                        this.f26530 = i3;
                        z = true;
                    }
                    i4 = this.f26498;
                    if (i4 != -1) {
                        this.f26535 = i4;
                    }
                    i5 = this.f26499;
                    if (i5 != -1) {
                        this.f26534 = i5;
                    }
                    if (z) {
                        this.f26536 = 1.0f - f;
                    }
                    if (this.f26526 && this.f26519 == 1) {
                        if (f2 == -1.0f) {
                            this.f26539 = 1.0f - f2;
                            this.f26537 = -1;
                            this.f26538 = -1;
                        } else if (i8 != -1) {
                            this.f26538 = i8;
                            this.f26537 = -1;
                            this.f26539 = -1.0f;
                        } else if (i9 != -1) {
                            this.f26537 = i9;
                            this.f26538 = -1;
                            this.f26539 = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.f26492;
                if (i2 != -1) {
                }
                i3 = this.f26493;
                if (i3 != -1) {
                }
                i4 = this.f26498;
                if (i4 != -1) {
                }
                i5 = this.f26499;
                if (i5 != -1) {
                }
                if (z) {
                }
                if (this.f26526) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.f26490;
                if (i12 != -1) {
                    this.f26531 = i12;
                }
                int i13 = this.f26491;
                if (i13 != -1) {
                    this.f26530 = i13;
                }
                int i14 = this.f26492;
                if (i14 != -1) {
                    this.f26532 = i14;
                }
                int i15 = this.f26493;
                if (i15 != -1) {
                    this.f26533 = i15;
                }
                int i16 = this.f26498;
                if (i16 != -1) {
                    this.f26534 = i16;
                }
                int i17 = this.f26499;
                if (i17 != -1) {
                    this.f26535 = i17;
                }
            }
            if (this.f26492 == -1 && this.f26493 == -1 && this.f26491 == -1 && this.f26490 == -1) {
                int i18 = this.f26480;
                if (i18 != -1) {
                    this.f26532 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f26481;
                    if (i19 != -1) {
                        this.f26533 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f26478;
                if (i20 != -1) {
                    this.f26530 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f26479;
                if (i21 != -1) {
                    this.f26531 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public String m4705() {
            return this.f26522;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C4128 m4706() {
            return this.f26540;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29260() {
            C4128 c4128 = this.f26540;
            if (c4128 != null) {
                c4128.mo11911();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29261(String str) {
            this.f26540.m11920(str);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29262() {
            this.f26526 = false;
            this.f26523 = true;
            this.f26524 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f26520) {
                this.f26523 = false;
                if (this.f26509 == 0) {
                    this.f26509 = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f26521) {
                this.f26524 = false;
                if (this.f26510 == 0) {
                    this.f26510 = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f26523 = false;
                if (i == 0 && this.f26509 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f26520 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f26524 = false;
                if (i2 == 0 && this.f26510 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f26521 = true;
                }
            }
            if (this.f26477 == -1.0f && this.f3685 == -1 && this.f3686 == -1) {
                return;
            }
            this.f26526 = true;
            this.f26523 = true;
            this.f26524 = true;
            if (!(this.f26540 instanceof C5226)) {
                this.f26540 = new C5226();
            }
            ((C5226) this.f26540).m16018(this.f26519);
        }

        public C1641(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.f3685 = -1;
            this.f3686 = -1;
            this.f26477 = -1.0f;
            this.f26478 = -1;
            this.f26479 = -1;
            this.f26480 = -1;
            this.f26481 = -1;
            this.f26482 = -1;
            this.f26483 = -1;
            this.f26484 = -1;
            this.f26485 = -1;
            this.f26486 = -1;
            this.f26487 = -1;
            this.f26488 = 0;
            this.f26489 = 0.0f;
            this.f26490 = -1;
            this.f26491 = -1;
            this.f26492 = -1;
            this.f26493 = -1;
            this.f26494 = -1;
            this.f26495 = -1;
            this.f26496 = -1;
            this.f26497 = -1;
            this.f26498 = -1;
            this.f26499 = -1;
            this.f26500 = 0.5f;
            this.f26501 = 0.5f;
            this.f26502 = null;
            this.f26503 = 0.0f;
            this.f26504 = 1;
            this.f26505 = -1.0f;
            this.f26506 = -1.0f;
            this.f26507 = 0;
            this.f26508 = 0;
            this.f26509 = 0;
            this.f26510 = 0;
            this.f26511 = 0;
            this.f26512 = 0;
            this.f26513 = 0;
            this.f26514 = 0;
            this.f26515 = 1.0f;
            this.f26516 = 1.0f;
            this.f26517 = -1;
            this.f26518 = -1;
            this.f26519 = -1;
            this.f26520 = false;
            this.f26521 = false;
            this.f26522 = null;
            this.f26523 = true;
            this.f26524 = true;
            this.f26525 = false;
            this.f26526 = false;
            this.f26527 = false;
            this.f26528 = false;
            this.f26529 = false;
            this.f26530 = -1;
            this.f26531 = -1;
            this.f26532 = -1;
            this.f26533 = -1;
            this.f26534 = -1;
            this.f26535 = -1;
            this.f26536 = 0.5f;
            this.f26540 = new C4128();
            this.f26541 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f28715);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = C8763.f26592.get(index);
                switch (i3) {
                    case 1:
                        this.f26519 = typedArrayObtainStyledAttributes.getInt(index, this.f26519);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f26487);
                        this.f26487 = resourceId;
                        if (resourceId == -1) {
                            this.f26487 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f26488 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26488);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f26489) % 360.0f;
                        this.f26489 = f;
                        if (f < 0.0f) {
                            this.f26489 = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f3685 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3685);
                        break;
                    case 6:
                        this.f3686 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3686);
                        break;
                    case 7:
                        this.f26477 = typedArrayObtainStyledAttributes.getFloat(index, this.f26477);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26478);
                        this.f26478 = resourceId2;
                        if (resourceId2 == -1) {
                            this.f26478 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26479);
                        this.f26479 = resourceId3;
                        if (resourceId3 == -1) {
                            this.f26479 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26480);
                        this.f26480 = resourceId4;
                        if (resourceId4 == -1) {
                            this.f26480 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26481);
                        this.f26481 = resourceId5;
                        if (resourceId5 == -1) {
                            this.f26481 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26482);
                        this.f26482 = resourceId6;
                        if (resourceId6 == -1) {
                            this.f26482 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26483);
                        this.f26483 = resourceId7;
                        if (resourceId7 == -1) {
                            this.f26483 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26484);
                        this.f26484 = resourceId8;
                        if (resourceId8 == -1) {
                            this.f26484 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26485);
                        this.f26485 = resourceId9;
                        if (resourceId9 == -1) {
                            this.f26485 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26486);
                        this.f26486 = resourceId10;
                        if (resourceId10 == -1) {
                            this.f26486 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26490);
                        this.f26490 = resourceId11;
                        if (resourceId11 == -1) {
                            this.f26490 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26491);
                        this.f26491 = resourceId12;
                        if (resourceId12 == -1) {
                            this.f26491 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26492);
                        this.f26492 = resourceId13;
                        if (resourceId13 == -1) {
                            this.f26492 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26493);
                        this.f26493 = resourceId14;
                        if (resourceId14 == -1) {
                            this.f26493 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f26494 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26494);
                        break;
                    case 22:
                        this.f26495 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26495);
                        break;
                    case 23:
                        this.f26496 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26496);
                        break;
                    case 24:
                        this.f26497 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26497);
                        break;
                    case 25:
                        this.f26498 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26498);
                        break;
                    case 26:
                        this.f26499 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26499);
                        break;
                    case 27:
                        this.f26520 = typedArrayObtainStyledAttributes.getBoolean(index, this.f26520);
                        break;
                    case 28:
                        this.f26521 = typedArrayObtainStyledAttributes.getBoolean(index, this.f26521);
                        break;
                    case 29:
                        this.f26500 = typedArrayObtainStyledAttributes.getFloat(index, this.f26500);
                        break;
                    case 30:
                        this.f26501 = typedArrayObtainStyledAttributes.getFloat(index, this.f26501);
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f26509 = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f26510 = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f26511 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26511);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f26511) == -2) {
                                this.f26511 = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f26513 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26513);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f26513) == -2) {
                                this.f26513 = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f26515 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f26515));
                        this.f26509 = 2;
                        break;
                    case 36:
                        try {
                            this.f26512 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26512);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f26512) == -2) {
                                this.f26512 = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f26514 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26514);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f26514) == -2) {
                                this.f26514 = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f26516 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f26516));
                        this.f26510 = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f26502 = string;
                                this.f26503 = Float.NaN;
                                this.f26504 = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f26502.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.f26502.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase(C4750.f10492)) {
                                            this.f26504 = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f26504 = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f26502.indexOf(58);
                                    if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                        String strSubstring2 = this.f26502.substring(i, iIndexOf2);
                                        String strSubstring3 = this.f26502.substring(iIndexOf2 + 1);
                                        if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring2);
                                                float f3 = Float.parseFloat(strSubstring3);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.f26504 == 1) {
                                                        this.f26503 = Math.abs(f3 / f2);
                                                    } else {
                                                        this.f26503 = Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    } else {
                                        String strSubstring4 = this.f26502.substring(i);
                                        if (strSubstring4.length() > 0) {
                                            this.f26503 = Float.parseFloat(strSubstring4);
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f26505 = typedArrayObtainStyledAttributes.getFloat(index, this.f26505);
                                break;
                            case 46:
                                this.f26506 = typedArrayObtainStyledAttributes.getFloat(index, this.f26506);
                                break;
                            case 47:
                                this.f26507 = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f26508 = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f26517 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f26517);
                                break;
                            case 50:
                                this.f26518 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f26518);
                                break;
                            case 51:
                                this.f26522 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m29262();
        }

        public C1641(int i, int i2) {
            super(i, i2);
            this.f3685 = -1;
            this.f3686 = -1;
            this.f26477 = -1.0f;
            this.f26478 = -1;
            this.f26479 = -1;
            this.f26480 = -1;
            this.f26481 = -1;
            this.f26482 = -1;
            this.f26483 = -1;
            this.f26484 = -1;
            this.f26485 = -1;
            this.f26486 = -1;
            this.f26487 = -1;
            this.f26488 = 0;
            this.f26489 = 0.0f;
            this.f26490 = -1;
            this.f26491 = -1;
            this.f26492 = -1;
            this.f26493 = -1;
            this.f26494 = -1;
            this.f26495 = -1;
            this.f26496 = -1;
            this.f26497 = -1;
            this.f26498 = -1;
            this.f26499 = -1;
            this.f26500 = 0.5f;
            this.f26501 = 0.5f;
            this.f26502 = null;
            this.f26503 = 0.0f;
            this.f26504 = 1;
            this.f26505 = -1.0f;
            this.f26506 = -1.0f;
            this.f26507 = 0;
            this.f26508 = 0;
            this.f26509 = 0;
            this.f26510 = 0;
            this.f26511 = 0;
            this.f26512 = 0;
            this.f26513 = 0;
            this.f26514 = 0;
            this.f26515 = 1.0f;
            this.f26516 = 1.0f;
            this.f26517 = -1;
            this.f26518 = -1;
            this.f26519 = -1;
            this.f26520 = false;
            this.f26521 = false;
            this.f26522 = null;
            this.f26523 = true;
            this.f26524 = true;
            this.f26525 = false;
            this.f26526 = false;
            this.f26527 = false;
            this.f26528 = false;
            this.f26529 = false;
            this.f26530 = -1;
            this.f26531 = -1;
            this.f26532 = -1;
            this.f26533 = -1;
            this.f26534 = -1;
            this.f26535 = -1;
            this.f26536 = 0.5f;
            this.f26540 = new C4128();
            this.f26541 = false;
        }

        public C1641(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3685 = -1;
            this.f3686 = -1;
            this.f26477 = -1.0f;
            this.f26478 = -1;
            this.f26479 = -1;
            this.f26480 = -1;
            this.f26481 = -1;
            this.f26482 = -1;
            this.f26483 = -1;
            this.f26484 = -1;
            this.f26485 = -1;
            this.f26486 = -1;
            this.f26487 = -1;
            this.f26488 = 0;
            this.f26489 = 0.0f;
            this.f26490 = -1;
            this.f26491 = -1;
            this.f26492 = -1;
            this.f26493 = -1;
            this.f26494 = -1;
            this.f26495 = -1;
            this.f26496 = -1;
            this.f26497 = -1;
            this.f26498 = -1;
            this.f26499 = -1;
            this.f26500 = 0.5f;
            this.f26501 = 0.5f;
            this.f26502 = null;
            this.f26503 = 0.0f;
            this.f26504 = 1;
            this.f26505 = -1.0f;
            this.f26506 = -1.0f;
            this.f26507 = 0;
            this.f26508 = 0;
            this.f26509 = 0;
            this.f26510 = 0;
            this.f26511 = 0;
            this.f26512 = 0;
            this.f26513 = 0;
            this.f26514 = 0;
            this.f26515 = 1.0f;
            this.f26516 = 1.0f;
            this.f26517 = -1;
            this.f26518 = -1;
            this.f26519 = -1;
            this.f26520 = false;
            this.f26521 = false;
            this.f26522 = null;
            this.f26523 = true;
            this.f26524 = true;
            this.f26525 = false;
            this.f26526 = false;
            this.f26527 = false;
            this.f26528 = false;
            this.f26529 = false;
            this.f26530 = -1;
            this.f26531 = -1;
            this.f26532 = -1;
            this.f26533 = -1;
            this.f26534 = -1;
            this.f26535 = -1;
            this.f26536 = 0.5f;
            this.f26540 = new C4128();
            this.f26541 = false;
        }
    }
}
