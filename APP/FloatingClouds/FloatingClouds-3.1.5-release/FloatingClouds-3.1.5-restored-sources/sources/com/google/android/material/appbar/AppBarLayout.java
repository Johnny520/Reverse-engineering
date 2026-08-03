package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000a.AbstractC0516c8;
import p000a.AbstractC0535d8;
import p000a.AbstractC0792r;
import p000a.C0181Jg;
import p000a.C0305Qe;
import p000a.C0354Ta;
import p000a.C0598ge;
import p000a.C0726n9;
import p000a.C0866ug;
import p000a.C0888w0;
import p000a.C0889w1;
import p000a.C0893w5;
import p000a.C0931y5;
import p000a.InterfaceC0158Ib;

/* JADX INFO: loaded from: classes.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC1058b {

    /* JADX INFO: renamed from: a */
    public int f5341a;

    /* JADX INFO: renamed from: b */
    public int f5342b;

    /* JADX INFO: renamed from: c */
    public int f5343c;

    /* JADX INFO: renamed from: d */
    public int f5344d;

    /* JADX INFO: renamed from: e */
    public boolean f5345e;

    /* JADX INFO: renamed from: f */
    public int f5346f;

    /* JADX INFO: renamed from: g */
    public boolean f5347g;

    /* JADX INFO: renamed from: h */
    public boolean f5348h;

    /* JADX INFO: renamed from: i */
    public boolean f5349i;

    /* JADX INFO: renamed from: j */
    public boolean f5350j;

    /* JADX INFO: renamed from: k */
    public int f5351k;

    /* JADX INFO: renamed from: l */
    public WeakReference<View> f5352l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f5353m;

    /* JADX INFO: renamed from: n */
    public int[] f5354n;

    /* JADX INFO: renamed from: o */
    public Drawable f5355o;

    /* JADX INFO: renamed from: p */
    public Behavior f5356p;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC0516c8<T> {

        /* JADX INFO: renamed from: j */
        public int f5357j;

        /* JADX INFO: renamed from: k */
        public int f5358k;

        /* JADX INFO: renamed from: l */
        public ValueAnimator f5359l;

        /* JADX INFO: renamed from: m */
        public C1248a f5360m;

        /* JADX INFO: renamed from: n */
        public WeakReference<View> f5361n;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C1248a extends AbstractC0792r {
            public static final Parcelable.Creator<C1248a> CREATOR = new a();

            /* JADX INFO: renamed from: c */
            public boolean f5362c;

            /* JADX INFO: renamed from: d */
            public boolean f5363d;

            /* JADX INFO: renamed from: e */
            public int f5364e;

            /* JADX INFO: renamed from: f */
            public float f5365f;

            /* JADX INFO: renamed from: g */
            public boolean f5366g;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public class a implements Parcelable.ClassLoaderCreator<C1248a> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final C1248a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C1248a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new C1248a[i];
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new C1248a(parcel, null);
                }
            }

            public C1248a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f5362c = parcel.readByte() != 0;
                this.f5363d = parcel.readByte() != 0;
                this.f5364e = parcel.readInt();
                this.f5365f = parcel.readFloat();
                this.f5366g = parcel.readByte() != 0;
            }

            @Override // p000a.AbstractC0792r, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f5362c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f5363d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f5364e);
                parcel.writeFloat(this.f5365f);
                parcel.writeByte(this.f5366g ? (byte) 1 : (byte) 0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BaseBehavior() {
        }

        /* JADX INFO: renamed from: B */
        public static View m3076B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C1062f) childAt.getLayoutParams()).f4404a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: D */
        public static View m3077D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0158Ib) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /* JADX INFO: renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void m3078H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zM3075e;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((C1251c) childAt.getLayoutParams()).f5369a;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zM3075e = i2 <= 0 || (i4 & 12) == 0 ? !((i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i) >= (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset();
                }
            }
            if (appBarLayout.f5350j) {
                zM3075e = appBarLayout.m3075e(m3077D(coordinatorLayout));
            }
            boolean zM3074d = appBarLayout.m3074d(zM3075e);
            if (!z) {
                if (zM3074d) {
                    List list = (List) ((C0598ge) coordinatorLayout.f4384b.f24b).getOrDefault(appBarLayout, null);
                    ArrayList arrayList = coordinatorLayout.f4386d;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.AbstractC1059c abstractC1059c = ((CoordinatorLayout.C1062f) ((View) arrayList.get(i5)).getLayoutParams()).f4404a;
                        if (abstractC1059c instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) abstractC1059c).f1928f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m3079C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(mo373t() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iMo373t = mo373t();
            if (iMo373t == i) {
                ValueAnimator valueAnimator = this.f5359l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f5359l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f5359l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f5359l = valueAnimator3;
                valueAnimator3.setInterpolator(C0888w0.f3472e);
                this.f5359l.addUpdateListener(new C1252a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f5359l.setDuration(Math.min(iRound, 600));
            this.f5359l.setIntValues(iMo373t, i);
            this.f5359l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /* JADX INFO: renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m3080E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = mo1277z(coordinatorLayout, appBarLayout2, mo373t() - i, i3, i4);
                }
            }
            if (appBarLayout2.f5350j) {
                appBarLayout2.m3074d(appBarLayout2.m3075e(view));
            }
        }

        /* JADX INFO: renamed from: F */
        public final C1248a m3081F(Parcelable parcelable, T t) {
            int iM372s = m372s();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + iM372s;
                if (childAt.getTop() + iM372s <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC0792r.f3118b;
                    }
                    C1248a c1248a = new C1248a(parcelable);
                    boolean z = iM372s == 0;
                    c1248a.f5363d = z;
                    c1248a.f5362c = !z && (-iM372s) >= t.getTotalScrollRange();
                    c1248a.f5364e = i;
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    c1248a.f5366g = bottom == t.getTopInset() + childAt.getMinimumHeight();
                    c1248a.f5365f = bottom / childAt.getHeight();
                    return c1248a;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: G */
        public final void m3082G(CoordinatorLayout coordinatorLayout, T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int iMo373t = mo373t() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top2 = childAt.getTop();
                int bottom = childAt.getBottom();
                C1251c c1251c = (C1251c) childAt.getLayoutParams();
                if ((c1251c.f5369a & 32) == 32) {
                    top2 -= ((LinearLayout.LayoutParams) c1251c).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c1251c).bottomMargin;
                }
                int i2 = -iMo373t;
                if (top2 <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                C1251c c1251c2 = (C1251c) childAt2.getLayoutParams();
                int i3 = c1251c2.f5369a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                        if (t.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= t.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap<View, C0181Jg> weakHashMap3 = C0866ug.f3395a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iMo373t < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) c1251c2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c1251c2).bottomMargin;
                    }
                    if (iMo373t < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    m3079C(coordinatorLayout, t, C0726n9.m1667j(topInset + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // p000a.C0145Hg, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: h */
        public final boolean mo371h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo371h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            C1248a c1248a = this.f5360m;
            if (c1248a == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            m3079C(coordinatorLayout, appBarLayout, i2);
                        } else {
                            m1270A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m3079C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            m1270A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (c1248a.f5362c) {
                m1270A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (c1248a.f5363d) {
                m1270A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(c1248a.f5364e);
                int i3 = -childAt.getBottom();
                if (this.f5360m.f5366g) {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f5360m.f5365f) + i3;
                }
                m1270A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f5346f = 0;
            this.f5360m = null;
            int iM1667j = C0726n9.m1667j(m372s(), -appBarLayout.getTotalScrollRange(), 0);
            C0305Qe c0305Qe = this.f503a;
            if (c0305Qe == null) {
                this.f504b = iM1667j;
            } else if (c0305Qe.f1104c != iM1667j) {
                c0305Qe.f1104c = iM1667j;
                c0305Qe.m850b();
            }
            m3078H(coordinatorLayout, appBarLayout, m372s(), 0, true);
            appBarLayout.f5341a = m372s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                appBarLayout.postInvalidateOnAnimation();
            }
            if (C0866ug.m1995b(coordinatorLayout) != null) {
                return true;
            }
            C0866ug.m2003j(coordinatorLayout, new C1253b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: i */
        public final boolean mo1305i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1062f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m2449r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: k */
        public final /* bridge */ /* synthetic */ void mo2461k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m3080E(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: l */
        public final void mo2462l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = mo1277z(coordinatorLayout2, appBarLayout, mo373t() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && C0866ug.m1995b(coordinatorLayout2) == null) {
                C0866ug.m2003j(coordinatorLayout2, new C1253b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: n */
        public final void mo2464n(View view, Parcelable parcelable) {
            if (parcelable instanceof C1248a) {
                this.f5360m = (C1248a) parcelable;
            } else {
                this.f5360m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: o */
        public final Parcelable mo2465o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            C1248a c1248aM3081F = m3081F(absSavedState, (AppBarLayout) view);
            return c1248aM3081F == null ? absSavedState : c1248aM3081F;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: p */
        public final boolean mo2466p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.f5350j || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.f5359l) != null) {
                valueAnimator.cancel();
            }
            this.f5361n = null;
            this.f5358k = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: q */
        public final void mo2467q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f5358k == 0 || i == 1) {
                m3082G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f5350j) {
                    appBarLayout.m3074d(appBarLayout.m3075e(view2));
                }
            }
            this.f5361n = new WeakReference<>(view2);
        }

        @Override // p000a.C0145Hg
        /* JADX INFO: renamed from: t */
        public final int mo373t() {
            return m372s() + this.f5357j;
        }

        @Override // p000a.AbstractC0516c8
        /* JADX INFO: renamed from: v */
        public final boolean mo1273v(View view) {
            WeakReference<View> weakReference = this.f5361n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // p000a.AbstractC0516c8
        /* JADX INFO: renamed from: w */
        public final int mo1274w(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // p000a.AbstractC0516c8
        /* JADX INFO: renamed from: x */
        public final int mo1275x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // p000a.AbstractC0516c8
        /* JADX INFO: renamed from: y */
        public final void mo1276y(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m3082G(coordinatorLayout, appBarLayout);
            if (appBarLayout.f5350j) {
                appBarLayout.m3074d(appBarLayout.m3075e(m3077D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01a5  */
        @Override // p000a.AbstractC0516c8
        /* JADX INFO: renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int mo1277z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top2;
            C0305Qe c0305Qe;
            boolean z;
            List list;
            int i4;
            int i5;
            int topInset;
            int i6 = 1;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo373t = mo373t();
            int i7 = 0;
            if (i2 == 0 || iMo373t < i2 || iMo373t > i3) {
                this.f5357j = 0;
            } else {
                int iM1667j = C0726n9.m1667j(i, i2, i3);
                if (iMo373t != iM1667j) {
                    if (appBarLayout.f5345e) {
                        int iAbs = Math.abs(iM1667j);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            C1251c c1251c = (C1251c) childAt.getLayoutParams();
                            Interpolator interpolator = c1251c.f5371c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = c1251c.f5369a;
                                if ((i9 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c1251c).topMargin + ((LinearLayout.LayoutParams) c1251c).bottomMargin;
                                    if ((i9 & 2) != 0) {
                                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top2 = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iM1667j);
                                }
                            }
                        }
                        top2 = iM1667j;
                        c0305Qe = this.f503a;
                        if (c0305Qe == null) {
                            if (c0305Qe.f1104c != top2) {
                                c0305Qe.f1104c = top2;
                                c0305Qe.m850b();
                                z = true;
                            }
                            int i10 = iMo373t - iM1667j;
                            this.f5357j = iM1667j - top2;
                            if (z) {
                                int i11 = 0;
                                while (i11 < appBarLayout.getChildCount()) {
                                    C1251c c1251c2 = (C1251c) appBarLayout.getChildAt(i11).getLayoutParams();
                                    C1250b c1250b = c1251c2.f5370b;
                                    if (c1250b == null || (c1251c2.f5369a & i6) == 0) {
                                        i5 = i6;
                                    } else {
                                        View childAt2 = appBarLayout.getChildAt(i11);
                                        float fM372s = m372s();
                                        Rect rect = c1250b.f5367a;
                                        childAt2.getDrawingRect(rect);
                                        appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                        rect.offset(0, -appBarLayout.getTopInset());
                                        float fAbs = rect.top - Math.abs(fM372s);
                                        if (fAbs <= 0.0f) {
                                            i5 = i6;
                                            float fAbs2 = Math.abs(fAbs / rect.height());
                                            float f2 = 1.0f - (fAbs2 >= 0.0f ? fAbs2 > 1.0f ? 1.0f : fAbs2 : 0.0f);
                                            float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (f2 * f2)));
                                            childAt2.setTranslationY(fHeight);
                                            Rect rect2 = c1250b.f5368b;
                                            childAt2.getDrawingRect(rect2);
                                            rect2.offset(0, (int) (-fHeight));
                                            if (fHeight >= rect2.height()) {
                                                childAt2.setVisibility(4);
                                            } else {
                                                childAt2.setVisibility(0);
                                            }
                                            WeakHashMap<View, C0181Jg> weakHashMap3 = C0866ug.f3395a;
                                            childAt2.setClipBounds(rect2);
                                        } else {
                                            i5 = i6;
                                            WeakHashMap<View, C0181Jg> weakHashMap4 = C0866ug.f3395a;
                                            childAt2.setClipBounds(null);
                                            childAt2.setTranslationY(0.0f);
                                            childAt2.setVisibility(0);
                                        }
                                    }
                                    i11++;
                                    i6 = i5;
                                }
                            }
                            int i12 = i6;
                            if (!z && appBarLayout.f5345e && (list = (List) ((C0598ge) coordinatorLayout.f4384b.f24b).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                                for (i4 = 0; i4 < list.size(); i4++) {
                                    View view2 = (View) list.get(i4);
                                    CoordinatorLayout.AbstractC1059c abstractC1059c = ((CoordinatorLayout.C1062f) view2.getLayoutParams()).f4404a;
                                    if (abstractC1059c != null) {
                                        abstractC1059c.mo2457d(coordinatorLayout, view2, appBarLayout);
                                    }
                                }
                            }
                            appBarLayout.f5341a = m372s();
                            if (!appBarLayout.willNotDraw()) {
                                WeakHashMap<View, C0181Jg> weakHashMap5 = C0866ug.f3395a;
                                appBarLayout.postInvalidateOnAnimation();
                            }
                            m3078H(coordinatorLayout, appBarLayout, iM1667j, iM1667j < iMo373t ? -1 : i12, false);
                            i7 = i10;
                        } else {
                            this.f504b = top2;
                        }
                        z = false;
                        int i102 = iMo373t - iM1667j;
                        this.f5357j = iM1667j - top2;
                        if (z) {
                        }
                        int i122 = i6;
                        if (!z) {
                            while (i4 < list.size()) {
                            }
                        }
                        appBarLayout.f5341a = m372s();
                        if (!appBarLayout.willNotDraw()) {
                        }
                        m3078H(coordinatorLayout, appBarLayout, iM1667j, iM1667j < iMo373t ? -1 : i122, false);
                        i7 = i102;
                    } else {
                        top2 = iM1667j;
                        c0305Qe = this.f503a;
                        if (c0305Qe == null) {
                        }
                        z = false;
                        int i1022 = iMo373t - iM1667j;
                        this.f5357j = iM1667j - top2;
                        if (z) {
                        }
                        int i1222 = i6;
                        if (!z) {
                        }
                        appBarLayout.f5341a = m372s();
                        if (!appBarLayout.willNotDraw()) {
                        }
                        m3078H(coordinatorLayout, appBarLayout, iM1667j, iM1667j < iMo373t ? -1 : i1222, false);
                        i7 = i1022;
                    }
                }
            }
            if (C0866ug.m1995b(coordinatorLayout) != null) {
                return i7;
            }
            C0866ug.m2003j(coordinatorLayout, new C1253b(coordinatorLayout, this, appBarLayout));
            return i7;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC0535d8 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: b */
        public final boolean mo2455b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: d */
        public boolean mo2457d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iM1667j;
            CoordinatorLayout.AbstractC1059c abstractC1059c = ((CoordinatorLayout.C1062f) view2.getLayoutParams()).f4404a;
            if (abstractC1059c instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC1059c).f5357j + this.f1927e;
                if (this.f1928f == 0) {
                    iM1667j = 0;
                } else {
                    float fMo1307w = mo1307w(view2);
                    int i = this.f1928f;
                    iM1667j = C0726n9.m1667j((int) (fMo1307w * i), 0, i);
                }
                int i2 = bottom - iM1667j;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                view.offsetTopAndBottom(i2);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f5350j) {
                    appBarLayout.m3074d(appBarLayout.m3075e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: e */
        public final void mo2458e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                C0866ug.m2003j(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: m */
        public final boolean mo2463m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayListM2443e = coordinatorLayout.m2443e(view);
            int size = arrayListM2443e.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListM2443e.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f1925c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.f5346f = (z ? 0 : 4) | 10;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // p000a.AbstractC0535d8
        /* JADX INFO: renamed from: v */
        public final AppBarLayout mo1306v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p000a.AbstractC0535d8
        /* JADX INFO: renamed from: w */
        public final float mo1307w(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.AbstractC1059c abstractC1059c = ((CoordinatorLayout.C1062f) appBarLayout.getLayoutParams()).f4404a;
                int iMo373t = abstractC1059c instanceof BaseBehavior ? ((BaseBehavior) abstractC1059c).mo373t() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo373t > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iMo373t / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // p000a.AbstractC0535d8
        /* JADX INFO: renamed from: x */
        public final int mo1308x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.ScrollingViewBehavior_Layout);
            this.f1928f = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static abstract class AbstractC1249a {
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public static class C1250b extends AbstractC1249a {

        /* JADX INFO: renamed from: a */
        public final Rect f5367a = new Rect();

        /* JADX INFO: renamed from: b */
        public final Rect f5368b = new Rect();
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C1251c extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        public int f5369a;

        /* JADX INFO: renamed from: b */
        public C1250b f5370b;

        /* JADX INFO: renamed from: c */
        public Interpolator f5371c;
    }

    /* JADX INFO: renamed from: b */
    public static C1251c m3071b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C1251c c1251c = new C1251c((LinearLayout.LayoutParams) layoutParams);
            c1251c.f5369a = 1;
            return c1251c;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1251c c1251c2 = new C1251c((ViewGroup.MarginLayoutParams) layoutParams);
            c1251c2.f5369a = 1;
            return c1251c2;
        }
        C1251c c1251c3 = new C1251c(layoutParams);
        c1251c3.f5369a = 1;
        return c1251c3;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1251c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1251c c1251c = new C1251c(context, attributeSet);
        c1251c.f5369a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.AppBarLayout_Layout);
        c1251c.f5369a = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
        c1251c.f5370b = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new C1250b();
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
            c1251c.f5371c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1251c;
    }

    /* JADX INFO: renamed from: c */
    public final void m3073c() {
        BaseBehavior.C1248a c1248aM3081F = (this.f5342b == -1 || this.f5346f != 0) ? null : this.f5356p.m3081F(AbstractC0792r.f3118b, this);
        this.f5342b = -1;
        this.f5343c = -1;
        this.f5344d = -1;
        if (c1248aM3081F != null) {
            Behavior behavior = this.f5356p;
            if (behavior.f5360m != null) {
                return;
            }
            behavior.f5360m = c1248aM3081F;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1251c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3074d(boolean z) {
        if (this.f5347g || this.f5349i == z) {
            return false;
        }
        this.f5349i = z;
        refreshDrawableState();
        if (!(getBackground() instanceof C0354Ta) || !this.f5350j) {
            return true;
        }
        ValueAnimator valueAnimator = this.f5353m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.f5353m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(0L);
        this.f5353m.setInterpolator(null);
        this.f5353m.start();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f5355o == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f5341a);
        this.f5355o.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5355o;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3075e(View view) {
        int i;
        if (this.f5352l == null && (i = this.f5351k) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f5351k);
            }
            if (viewFindViewById != null) {
                this.f5352l = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f5352l;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1251c c1251c = new C1251c(-1, -2);
        c1251c.f5369a = 1;
        return c1251c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1058b
    public CoordinatorLayout.AbstractC1059c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f5356p = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f5343c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C1251c c1251c = (C1251c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c1251c.f5369a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) c1251c).topMargin + ((LinearLayout.LayoutParams) c1251c).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0) {
                            WeakHashMap<View, C0181Jg> weakHashMap3 = C0866ug.f3395a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.f5343c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f5344d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1251c c1251c = (C1251c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c1251c).topMargin + ((LinearLayout.LayoutParams) c1251c).bottomMargin + childAt.getMeasuredHeight();
                int i3 = c1251c.f5369a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f5344d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f5351k;
    }

    public C0354Ta getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C0354Ta) {
            return (C0354Ta) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f5346f;
    }

    public Drawable getStatusBarForeground() {
        return this.f5355o;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f5342b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1251c c1251c = (C1251c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c1251c.f5369a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c1251c).topMargin + ((LinearLayout.LayoutParams) c1251c).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f5342b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0354Ta) {
            C0726n9.m1659A(this, (C0354Ta) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f5354n == null) {
            this.f5354n = new int[4];
        }
        int[] iArr = this.f5354n;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f5348h;
        int i2 = C1247R.attr.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f5349i) ? C1247R.attr.state_lifted : -C1247R.attr.state_lifted;
        int i3 = C1247R.attr.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f5349i) ? C1247R.attr.state_collapsed : -C1247R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f5352l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5352l = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        m3073c();
        this.f5345e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C1251c) getChildAt(i5).getLayoutParams()).f5371c != null) {
                this.f5345e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.f5355o;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f5347g) {
            return;
        }
        if (!this.f5350j) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C1251c) getChildAt(i6).getLayoutParams()).f5369a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.f5348h != z2) {
            this.f5348h = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = C0726n9.m1667j(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        m3073c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0354Ta) {
            ((C0354Ta) background).m966j(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        this.f5346f = (z ? 1 : 2) | (isLaidOut() ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z) {
        this.f5350j = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f5351k = -1;
        if (view != null) {
            this.f5352l = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f5352l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5352l = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f5351k = i;
        WeakReference<View> weakReference = this.f5352l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5352l = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f5347g = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f5355o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5355o = drawableMutate;
            if (drawableMutate instanceof C0354Ta) {
                int i = ((C0354Ta) drawableMutate).f1330u;
            } else {
                ColorStateList colorStateListM2216a = C0931y5.m2216a(drawableMutate);
                if (colorStateListM2216a != null) {
                    colorStateListM2216a.getDefaultColor();
                }
            }
            Drawable drawable3 = this.f5355o;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f5355o.setState(getDrawableState());
                }
                Drawable drawable4 = this.f5355o;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0893w5.b.m2179b(drawable4, getLayoutDirection());
                this.f5355o.setVisible(getVisibility() == 0, false);
                this.f5355o.setCallback(this);
            }
            if (this.f5355o != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0889w1.m2115A(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(C1247R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, C1247R.attr.state_liftable, -C1247R.attr.state_lifted}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f5355o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5355o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3071b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        C1251c c1251c = new C1251c(-1, -2);
        c1251c.f5369a = 1;
        return c1251c;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3071b(layoutParams);
    }
}
