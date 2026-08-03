package androidx.recyclerview.widget;

import Yue.C6193;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractC8885;
import androidx.recyclerview.widget.C8973;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC8919 implements C8973.InterfaceC8981, RecyclerView.AbstractC8934.InterfaceC1753 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C1740 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C1741 mLayoutChunkResult;
    private C8903 mLayoutState;
    int mOrientation;
    AbstractC8987 mOrientationHelper;
    C8904 mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ */
    public static class C1740 {

        /* JADX INFO: renamed from: ۥ */
        public AbstractC8987 f3871;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3872;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29919;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29920;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f29921;

        public C1740() {
            m30211();
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3872 + ", mCoordinate=" + this.f29919 + ", mLayoutFromEnd=" + this.f29920 + ", mValid=" + this.f29921 + C6193.f1885;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4898() {
            this.f29919 = this.f29920 ? this.f3871.mo30705() : this.f3871.mo30710();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4899(View view, int i) {
            if (this.f29920) {
                this.f29919 = this.f3871.mo30700(view) + this.f3871.m30712();
            } else {
                this.f29919 = this.f3871.mo30703(view);
            }
            this.f3872 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30209(View view, int i) {
            int iM30712 = this.f3871.m30712();
            if (iM30712 >= 0) {
                m4899(view, i);
                return;
            }
            this.f3872 = i;
            if (this.f29920) {
                int iMo30705 = (this.f3871.mo30705() - iM30712) - this.f3871.mo30700(view);
                this.f29919 = this.f3871.mo30705() - iMo30705;
                if (iMo30705 > 0) {
                    int iMo30701 = this.f29919 - this.f3871.mo30701(view);
                    int iMo30710 = this.f3871.mo30710();
                    int iMin = iMo30701 - (iMo30710 + Math.min(this.f3871.mo30703(view) - iMo30710, 0));
                    if (iMin < 0) {
                        this.f29919 += Math.min(iMo30705, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo30703 = this.f3871.mo30703(view);
            int iMo307102 = iMo30703 - this.f3871.mo30710();
            this.f29919 = iMo30703;
            if (iMo307102 > 0) {
                int iMo307052 = (this.f3871.mo30705() - Math.min(0, (this.f3871.mo30705() - iM30712) - this.f3871.mo30700(view))) - (iMo30703 + this.f3871.mo30701(view));
                if (iMo307052 < 0) {
                    this.f29919 -= Math.min(iMo307102, -iMo307052);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m30210(View view, RecyclerView.C8935 c8935) {
            RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
            return !c8922.m30306() && c8922.m4931() >= 0 && c8922.m4931() < c8935.m30375();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30211() {
            this.f3872 = -1;
            this.f29919 = Integer.MIN_VALUE;
            this.f29920 = false;
            this.f29921 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟ */
    public static class C1741 {

        /* JADX INFO: renamed from: ۥ */
        public int f3873;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f3874;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29922;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29923;

        /* JADX INFO: renamed from: ۥ */
        public void m4900() {
            this.f3873 = 0;
            this.f3874 = false;
            this.f29922 = false;
            this.f29923 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟, reason: contains not printable characters */
    public static class C8903 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final String f29924 = "LLM#LayoutState";

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f29925 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f29926 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f29927 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f29928 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f29929 = 1;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f29930 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3876;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29931;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29932;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29933;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29934;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f29935;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f29939;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f29941;

        /* JADX INFO: renamed from: ۥ */
        public boolean f3875 = true;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f29936 = 0;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f29937 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean f29938 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public List<RecyclerView.AbstractC8938> f29940 = null;

        /* JADX INFO: renamed from: ۥ */
        public void m4901() {
            m4902(null);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4902(View view) {
            View viewM30216 = m30216(view);
            if (viewM30216 == null) {
                this.f29932 = -1;
            } else {
                this.f29932 = ((RecyclerView.C8922) viewM30216.getLayoutParams()).m4931();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m30212(RecyclerView.C8935 c8935) {
            int i = this.f29932;
            return i >= 0 && i < c8935.m30375();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30213() {
            Log.d(f29924, "avail:" + this.f29931 + ", ind:" + this.f29932 + ", dir:" + this.f29933 + ", offset:" + this.f3876 + ", layoutDir:" + this.f29934);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public View m30214(RecyclerView.C8929 c8929) {
            if (this.f29940 != null) {
                return m30215();
            }
            View viewM30337 = c8929.m30337(this.f29932);
            this.f29932 += this.f29933;
            return viewM30337;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final View m30215() {
            int size = this.f29940.size();
            for (int i = 0; i < size; i++) {
                View view = this.f29940.get(i).itemView;
                RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
                if (!c8922.m30306() && this.f29932 == c8922.m4931()) {
                    m4902(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public View m30216(View view) {
            int iM4931;
            int size = this.f29940.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f29940.get(i2).itemView;
                RecyclerView.C8922 c8922 = (RecyclerView.C8922) view3.getLayoutParams();
                if (view3 != view && !c8922.m30306() && (iM4931 = (c8922.m4931() - this.f29932) * this.f29933) >= 0 && iM4931 < i) {
                    view2 = view3;
                    if (iM4931 == 0) {
                        break;
                    }
                    i = iM4931;
                }
            }
            return view2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    public static class C8904 implements Parcelable {
        public static final Parcelable.Creator<C8904> CREATOR = new C1742();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f29942;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f29943;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f29944;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟$ۥ */
        public static class C1742 implements Parcelable.Creator<C8904> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8904 createFromParcel(Parcel parcel) {
                return new C8904(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8904[] newArray(int i) {
                return new C8904[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8904() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f29942);
            parcel.writeInt(this.f29943);
            parcel.writeInt(this.f29944 ? 1 : 0);
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m4903() {
            return this.f29942 >= 0;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4904() {
            this.f29942 = -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8904(Parcel parcel) {
            this.f29942 = parcel.readInt();
            this.f29943 = parcel.readInt();
            this.f29944 = parcel.readInt() == 1;
        }

        public C8904(C8904 c8904) {
            this.f29942 = c8904.f29942;
            this.f29943 = c8904.f29943;
            this.f29944 = c8904.f29944;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@InterfaceC6391 RecyclerView.C8935 c8935, @InterfaceC6391 int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c8935);
        if (this.mLayoutState.f29934 == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C8935 c8935, RecyclerView.AbstractC8919.InterfaceC8920 interfaceC8920) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m30204(i > 0 ? 1 : -1, Math.abs(i), true, c8935);
        collectPrefetchPositionsForLayoutState(c8935, this.mLayoutState, interfaceC8920);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void collectInitialPrefetchPositions(int i, RecyclerView.AbstractC8919.InterfaceC8920 interfaceC8920) {
        boolean z;
        int i2;
        C8904 c8904 = this.mPendingSavedState;
        if (c8904 == null || !c8904.m4903()) {
            m30200();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C8904 c89042 = this.mPendingSavedState;
            z = c89042.f29944;
            i2 = c89042.f29942;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            interfaceC8920.mo4929(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.C8935 c8935, C8903 c8903, RecyclerView.AbstractC8919.InterfaceC8920 interfaceC8920) {
        int i = c8903.f29932;
        if (i < 0 || i >= c8935.m30375()) {
            return;
        }
        interfaceC8920.mo4929(i, Math.max(0, c8903.f29935));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollExtent(RecyclerView.C8935 c8935) {
        return m30181(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollOffset(RecyclerView.C8935 c8935) {
        return m30182(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollRange(RecyclerView.C8935 c8935) {
        return m30183(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8934.InterfaceC1753
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollExtent(RecyclerView.C8935 c8935) {
        return m30181(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollOffset(RecyclerView.C8935 c8935) {
        return m30182(c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollRange(RecyclerView.C8935 c8935) {
        return m30183(c8935);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public C8903 createLayoutState() {
        return new C8903();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.C8929 c8929, C8903 c8903, RecyclerView.C8935 c8935, boolean z) {
        int i = c8903.f29931;
        int i2 = c8903.f29935;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c8903.f29935 = i2 + i;
            }
            m30196(c8929, c8903);
        }
        int i3 = c8903.f29931 + c8903.f29936;
        C1741 c1741 = this.mLayoutChunkResult;
        while (true) {
            if ((!c8903.f29941 && i3 <= 0) || !c8903.m30212(c8935)) {
                break;
            }
            c1741.m4900();
            layoutChunk(c8929, c8935, c8903, c1741);
            if (!c1741.f3874) {
                c8903.f3876 += c1741.f3873 * c8903.f29934;
                if (!c1741.f29922 || c8903.f29940 != null || !c8935.m30381()) {
                    int i4 = c8903.f29931;
                    int i5 = c1741.f3873;
                    c8903.f29931 = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c8903.f29935;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c1741.f3873;
                    c8903.f29935 = i7;
                    int i8 = c8903.f29931;
                    if (i8 < 0) {
                        c8903.f29935 = i7 + i8;
                    }
                    m30196(c8929, c8903);
                }
                if (z && c1741.f29923) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c8903.f29931;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo30703(getChildAt(i)) < this.mOrientationHelper.mo30710()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = AbstractC8885.f29787;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m5011(i, i2, i3, i4) : this.mVerticalBoundCheck.m5011(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m5011(i, i2, i3, i4) : this.mVerticalBoundCheck.m5011(i, i2, i3, i4);
    }

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
            if (position >= 0 && position < i3) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateDefaultLayoutParams() {
        return new RecyclerView.C8922(-2, -2);
    }

    public final View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public final View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.C8935 c8935) {
        if (c8935.m30379()) {
            return this.mOrientationHelper.mo30711();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, C8903 c8903, C1741 c1741) {
        int i;
        int i2;
        int i3;
        int paddingLeft;
        int iMo30702;
        View viewM30214 = c8903.m30214(c8929);
        if (viewM30214 == null) {
            c1741.f3874 = true;
            return;
        }
        RecyclerView.C8922 c8922 = (RecyclerView.C8922) viewM30214.getLayoutParams();
        if (c8903.f29940 == null) {
            if (this.mShouldReverseLayout == (c8903.f29934 == -1)) {
                addView(viewM30214);
            } else {
                addView(viewM30214, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c8903.f29934 == -1)) {
                addDisappearingView(viewM30214);
            } else {
                addDisappearingView(viewM30214, 0);
            }
        }
        measureChildWithMargins(viewM30214, 0, 0);
        c1741.f3873 = this.mOrientationHelper.mo30701(viewM30214);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo30702 = getWidth() - getPaddingRight();
                paddingLeft = iMo30702 - this.mOrientationHelper.mo30702(viewM30214);
            } else {
                paddingLeft = getPaddingLeft();
                iMo30702 = this.mOrientationHelper.mo30702(viewM30214) + paddingLeft;
            }
            if (c8903.f29934 == -1) {
                int i4 = c8903.f3876;
                i3 = i4;
                i2 = iMo30702;
                i = i4 - c1741.f3873;
            } else {
                int i5 = c8903.f3876;
                i = i5;
                i2 = iMo30702;
                i3 = c1741.f3873 + i5;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo307022 = this.mOrientationHelper.mo30702(viewM30214) + paddingTop;
            if (c8903.f29934 == -1) {
                int i6 = c8903.f3876;
                i2 = i6;
                i = paddingTop;
                i3 = iMo307022;
                paddingLeft = i6 - c1741.f3873;
            } else {
                int i7 = c8903.f3876;
                i = paddingTop;
                i2 = c1741.f3873 + i7;
                i3 = iMo307022;
                paddingLeft = i7;
            }
        }
        layoutDecoratedWithMargins(viewM30214, paddingLeft, i, i2, i3);
        if (c8922.m30306() || c8922.m30305()) {
            c1741.f29922 = true;
        }
        c1741.f29923 = viewM30214.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, C1740 c1740, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C8929 c8929) {
        super.onDetachedFromWindow(recyclerView, c8929);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c8929);
            c8929.m30325();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public View onFocusSearchFailed(View view, int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        int iConvertFocusDirectionToLayoutDirection;
        m30200();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m30204(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo30711() * 0.33333334f), false, c8935);
        C8903 c8903 = this.mLayoutState;
        c8903.f29935 = Integer.MIN_VALUE;
        c8903.f3875 = false;
        fill(c8929, c8903, c8935, true);
        View viewM30189 = iConvertFocusDirectionToLayoutDirection == -1 ? m30189() : m30188();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewM30189;
        }
        if (viewM30189 == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutChildren(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM30192;
        int i5;
        View viewFindViewByPosition;
        int iMo30703;
        int iMo30705;
        int i6 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c8935.m30375() == 0) {
            removeAndRecycleAllViews(c8929);
            return;
        }
        C8904 c8904 = this.mPendingSavedState;
        if (c8904 != null && c8904.m4903()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f29942;
        }
        ensureLayoutState();
        this.mLayoutState.f3875 = false;
        m30200();
        View focusedChild = getFocusedChild();
        C1740 c1740 = this.mAnchorInfo;
        if (!c1740.f29921 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c1740.m30211();
            C1740 c17402 = this.mAnchorInfo;
            c17402.f29920 = this.mShouldReverseLayout ^ this.mStackFromEnd;
            m30203(c8929, c8935, c17402);
            this.mAnchorInfo.f29921 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo30703(focusedChild) >= this.mOrientationHelper.mo30705() || this.mOrientationHelper.mo30700(focusedChild) <= this.mOrientationHelper.mo30710())) {
            this.mAnchorInfo.m30209(focusedChild, getPosition(focusedChild));
        }
        C8903 c8903 = this.mLayoutState;
        c8903.f29934 = c8903.f29939 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c8935, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo30710();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo30706();
        if (c8935.m30381() && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                iMo30705 = this.mOrientationHelper.mo30705() - this.mOrientationHelper.mo30700(viewFindViewByPosition);
                iMo30703 = this.mPendingScrollPositionOffset;
            } else {
                iMo30703 = this.mOrientationHelper.mo30703(viewFindViewByPosition) - this.mOrientationHelper.mo30710();
                iMo30705 = this.mPendingScrollPositionOffset;
            }
            int i7 = iMo30705 - iMo30703;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        C1740 c17403 = this.mAnchorInfo;
        if (!c17403.f29920 ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i6 = 1;
        }
        onAnchorReady(c8929, c8935, c17403, i6);
        detachAndScrapAttachedViews(c8929);
        this.mLayoutState.f29941 = resolveIsInfinite();
        this.mLayoutState.f29938 = c8935.m30381();
        this.mLayoutState.f29937 = 0;
        C1740 c17404 = this.mAnchorInfo;
        if (c17404.f29920) {
            m30208(c17404);
            C8903 c89032 = this.mLayoutState;
            c89032.f29936 = iMax;
            fill(c8929, c89032, c8935, false);
            C8903 c89033 = this.mLayoutState;
            i2 = c89033.f3876;
            int i8 = c89033.f29932;
            int i9 = c89033.f29931;
            if (i9 > 0) {
                iMax2 += i9;
            }
            m30206(this.mAnchorInfo);
            C8903 c89034 = this.mLayoutState;
            c89034.f29936 = iMax2;
            c89034.f29932 += c89034.f29933;
            fill(c8929, c89034, c8935, false);
            C8903 c89035 = this.mLayoutState;
            i = c89035.f3876;
            int i10 = c89035.f29931;
            if (i10 > 0) {
                m30207(i8, i2);
                C8903 c89036 = this.mLayoutState;
                c89036.f29936 = i10;
                fill(c8929, c89036, c8935, false);
                i2 = this.mLayoutState.f3876;
            }
        } else {
            m30206(c17404);
            C8903 c89037 = this.mLayoutState;
            c89037.f29936 = iMax2;
            fill(c8929, c89037, c8935, false);
            C8903 c89038 = this.mLayoutState;
            i = c89038.f3876;
            int i11 = c89038.f29932;
            int i12 = c89038.f29931;
            if (i12 > 0) {
                iMax += i12;
            }
            m30208(this.mAnchorInfo);
            C8903 c89039 = this.mLayoutState;
            c89039.f29936 = iMax;
            c89039.f29932 += c89039.f29933;
            fill(c8929, c89039, c8935, false);
            C8903 c890310 = this.mLayoutState;
            i2 = c890310.f3876;
            int i13 = c890310.f29931;
            if (i13 > 0) {
                m30205(i11, i);
                C8903 c890311 = this.mLayoutState;
                c890311.f29936 = i13;
                fill(c8929, c890311, c8935, false);
                i = this.mLayoutState.f3876;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM301922 = m30192(i, c8929, c8935, true);
                i3 = i2 + iM301922;
                i4 = i + iM301922;
                iM30192 = m30193(i3, c8929, c8935, false);
            } else {
                int iM30193 = m30193(i2, c8929, c8935, true);
                i3 = i2 + iM30193;
                i4 = i + iM30193;
                iM30192 = m30192(i4, c8929, c8935, false);
            }
            i2 = i3 + iM30192;
            i = i4 + iM30192;
        }
        m30194(c8929, c8935, i2, i);
        if (c8935.m30381()) {
            this.mAnchorInfo.m30211();
        } else {
            this.mOrientationHelper.m30717();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutCompleted(RecyclerView.C8935 c8935) {
        super.onLayoutCompleted(c8935);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m30211();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C8904) {
            this.mPendingSavedState = (C8904) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new C8904(this.mPendingSavedState);
        }
        C8904 c8904 = new C8904();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            c8904.f29944 = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                c8904.f29943 = this.mOrientationHelper.mo30705() - this.mOrientationHelper.mo30700(childClosestToEnd);
                c8904.f29942 = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                c8904.f29942 = getPosition(childClosestToStart);
                c8904.f29943 = this.mOrientationHelper.mo30703(childClosestToStart) - this.mOrientationHelper.mo30710();
            }
        } else {
            c8904.m4904();
        }
        return c8904;
    }

    @Override // androidx.recyclerview.widget.C8973.InterfaceC8981
    public void prepareForDrop(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m30200();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo30705() - (this.mOrientationHelper.mo30703(view2) + this.mOrientationHelper.mo30701(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo30705() - this.mOrientationHelper.mo30700(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo30703(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo30700(view2) - this.mOrientationHelper.mo30701(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo30708() == 0 && this.mOrientationHelper.mo30704() == 0;
    }

    public int scrollBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f3875 = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m30204(i2, iAbs, true, c8935);
        C8903 c8903 = this.mLayoutState;
        int iFill = c8903.f29935 + fill(c8929, c8903, c8935, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo30716(-i);
        this.mLayoutState.f29939 = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollHorizontallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c8929, c8935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C8904 c8904 = this.mPendingSavedState;
        if (c8904 != null) {
            c8904.m4904();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        C8904 c8904 = this.mPendingSavedState;
        if (c8904 != null) {
            c8904.m4904();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollVerticallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c8929, c8935);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC8987 abstractC8987M5004 = AbstractC8987.m5004(this, i);
            this.mOrientationHelper = abstractC8987M5004;
            this.mAnchorInfo.f3871 = abstractC8987M5004;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C8935 c8935, int i) {
        C8983 c8983 = new C8983(recyclerView.getContext());
        c8983.setTargetPosition(i);
        startSmoothScroll(c8983);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo30703 = this.mOrientationHelper.mo30703(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo307032 = this.mOrientationHelper.mo30703(childAt);
                if (position2 < position) {
                    m30195();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(iMo307032 < iMo30703);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo307032 > iMo30703) {
                    m30195();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo307033 = this.mOrientationHelper.mo30703(childAt2);
            if (position3 < position) {
                m30195();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(iMo307033 < iMo30703);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo307033 < iMo30703) {
                m30195();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m30181(RecyclerView.C8935 c8935) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C8990.m5005(c8935, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m30182(RecyclerView.C8935 c8935) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C8990.m5006(c8935, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m30183(RecyclerView.C8935 c8935) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C8990.m30725(c8935, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final View m30184() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final View m30185(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return findReferenceChild(c8929, c8935, 0, getChildCount(), c8935.m30375());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final View m30186() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final View m30187(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return findReferenceChild(c8929, c8935, getChildCount() - 1, -1, c8935.m30375());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final View m30188() {
        return this.mShouldReverseLayout ? m30184() : m30186();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final View m30189() {
        return this.mShouldReverseLayout ? m30186() : m30184();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final View m30190(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return this.mShouldReverseLayout ? m30185(c8929, c8935) : m30187(c8929, c8935);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final View m30191(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        return this.mShouldReverseLayout ? m30187(c8929, c8935) : m30185(c8929, c8935);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m30192(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, boolean z) {
        int iMo30705;
        int iMo307052 = this.mOrientationHelper.mo30705() - i;
        if (iMo307052 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo307052, c8929, c8935);
        int i3 = i + i2;
        if (!z || (iMo30705 = this.mOrientationHelper.mo30705() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo30716(iMo30705);
        return iMo30705 + i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final int m30193(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, boolean z) {
        int iMo30710;
        int iMo307102 = i - this.mOrientationHelper.mo30710();
        if (iMo307102 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo307102, c8929, c8935);
        int i3 = i + i2;
        if (!z || (iMo30710 = i3 - this.mOrientationHelper.mo30710()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo30716(-iMo30710);
        return i2 - iMo30710;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m30194(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, int i, int i2) {
        if (!c8935.m30385() || getChildCount() == 0 || c8935.m30381() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.AbstractC8938> listM30333 = c8929.m30333();
        int size = listM30333.size();
        int position = getPosition(getChildAt(0));
        int iMo30701 = 0;
        int iMo307012 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.AbstractC8938 abstractC8938 = listM30333.get(i3);
            if (!abstractC8938.isRemoved()) {
                if ((abstractC8938.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iMo30701 += this.mOrientationHelper.mo30701(abstractC8938.itemView);
                } else {
                    iMo307012 += this.mOrientationHelper.mo30701(abstractC8938.itemView);
                }
            }
        }
        this.mLayoutState.f29940 = listM30333;
        if (iMo30701 > 0) {
            m30207(getPosition(getChildClosestToStart()), i);
            C8903 c8903 = this.mLayoutState;
            c8903.f29936 = iMo30701;
            c8903.f29931 = 0;
            c8903.m4901();
            fill(c8929, this.mLayoutState, c8935, false);
        }
        if (iMo307012 > 0) {
            m30205(getPosition(getChildClosestToEnd()), i2);
            C8903 c89032 = this.mLayoutState;
            c89032.f29936 = iMo307012;
            c89032.f29931 = 0;
            c89032.m4901();
            fill(c8929, this.mLayoutState, c8935, false);
        }
        this.mLayoutState.f29940 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m30195() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo30703(childAt));
        }
        Log.d(TAG, "==============");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m30196(RecyclerView.C8929 c8929, C8903 c8903) {
        if (!c8903.f3875 || c8903.f29941) {
            return;
        }
        int i = c8903.f29935;
        int i2 = c8903.f29937;
        if (c8903.f29934 == -1) {
            m30198(c8929, i, i2);
        } else {
            m30199(c8929, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m30197(RecyclerView.C8929 c8929, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c8929);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, c8929);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m30198(RecyclerView.C8929 c8929, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iMo30704 = (this.mOrientationHelper.mo30704() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo30703(childAt) < iMo30704 || this.mOrientationHelper.mo30714(childAt) < iMo30704) {
                    m30197(c8929, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo30703(childAt2) < iMo30704 || this.mOrientationHelper.mo30714(childAt2) < iMo30704) {
                m30197(c8929, i4, i5);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m30199(RecyclerView.C8929 c8929, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo30700(childAt) > i3 || this.mOrientationHelper.mo30713(childAt) > i3) {
                    m30197(c8929, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo30700(childAt2) > i3 || this.mOrientationHelper.mo30713(childAt2) > i3) {
                m30197(c8929, i5, i6);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m30200() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m30201(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, C1740 c1740) {
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c1740.m30210(focusedChild, c8935)) {
            c1740.m30209(focusedChild, getPosition(focusedChild));
            return true;
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        View viewM30190 = c1740.f29920 ? m30190(c8929, c8935) : m30191(c8929, c8935);
        if (viewM30190 == null) {
            return false;
        }
        c1740.m4899(viewM30190, getPosition(viewM30190));
        if (!c8935.m30381() && supportsPredictiveItemAnimations() && (this.mOrientationHelper.mo30703(viewM30190) >= this.mOrientationHelper.mo30705() || this.mOrientationHelper.mo30700(viewM30190) < this.mOrientationHelper.mo30710())) {
            c1740.f29919 = c1740.f29920 ? this.mOrientationHelper.mo30705() : this.mOrientationHelper.mo30710();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean m30202(RecyclerView.C8935 c8935, C1740 c1740) {
        int i;
        if (!c8935.m30381() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < c8935.m30375()) {
                c1740.f3872 = this.mPendingScrollPosition;
                C8904 c8904 = this.mPendingSavedState;
                if (c8904 != null && c8904.m4903()) {
                    boolean z = this.mPendingSavedState.f29944;
                    c1740.f29920 = z;
                    if (z) {
                        c1740.f29919 = this.mOrientationHelper.mo30705() - this.mPendingSavedState.f29943;
                    } else {
                        c1740.f29919 = this.mOrientationHelper.mo30710() + this.mPendingSavedState.f29943;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    c1740.f29920 = z2;
                    if (z2) {
                        c1740.f29919 = this.mOrientationHelper.mo30705() - this.mPendingScrollPositionOffset;
                    } else {
                        c1740.f29919 = this.mOrientationHelper.mo30710() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        c1740.f29920 = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c1740.m4898();
                } else {
                    if (this.mOrientationHelper.mo30701(viewFindViewByPosition) > this.mOrientationHelper.mo30711()) {
                        c1740.m4898();
                        return true;
                    }
                    if (this.mOrientationHelper.mo30703(viewFindViewByPosition) - this.mOrientationHelper.mo30710() < 0) {
                        c1740.f29919 = this.mOrientationHelper.mo30710();
                        c1740.f29920 = false;
                        return true;
                    }
                    if (this.mOrientationHelper.mo30705() - this.mOrientationHelper.mo30700(viewFindViewByPosition) < 0) {
                        c1740.f29919 = this.mOrientationHelper.mo30705();
                        c1740.f29920 = true;
                        return true;
                    }
                    c1740.f29919 = c1740.f29920 ? this.mOrientationHelper.mo30700(viewFindViewByPosition) + this.mOrientationHelper.m30712() : this.mOrientationHelper.mo30703(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m30203(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, C1740 c1740) {
        if (m30202(c8935, c1740) || m30201(c8929, c8935, c1740)) {
            return;
        }
        c1740.m4898();
        c1740.f3872 = this.mStackFromEnd ? c8935.m30375() - 1 : 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m30204(int i, int i2, boolean z, RecyclerView.C8935 c8935) {
        int iMo30710;
        this.mLayoutState.f29941 = resolveIsInfinite();
        this.mLayoutState.f29934 = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c8935, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C8903 c8903 = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c8903.f29936 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c8903.f29937 = iMax;
        if (z2) {
            c8903.f29936 = i3 + this.mOrientationHelper.mo30706();
            View childClosestToEnd = getChildClosestToEnd();
            C8903 c89032 = this.mLayoutState;
            c89032.f29933 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C8903 c89033 = this.mLayoutState;
            c89032.f29932 = position + c89033.f29933;
            c89033.f3876 = this.mOrientationHelper.mo30700(childClosestToEnd);
            iMo30710 = this.mOrientationHelper.mo30700(childClosestToEnd) - this.mOrientationHelper.mo30705();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f29936 += this.mOrientationHelper.mo30710();
            C8903 c89034 = this.mLayoutState;
            c89034.f29933 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C8903 c89035 = this.mLayoutState;
            c89034.f29932 = position2 + c89035.f29933;
            c89035.f3876 = this.mOrientationHelper.mo30703(childClosestToStart);
            iMo30710 = (-this.mOrientationHelper.mo30703(childClosestToStart)) + this.mOrientationHelper.mo30710();
        }
        C8903 c89036 = this.mLayoutState;
        c89036.f29931 = i2;
        if (z) {
            c89036.f29931 = i2 - iMo30710;
        }
        c89036.f29935 = iMo30710;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m30205(int i, int i2) {
        this.mLayoutState.f29931 = this.mOrientationHelper.mo30705() - i2;
        C8903 c8903 = this.mLayoutState;
        c8903.f29933 = this.mShouldReverseLayout ? -1 : 1;
        c8903.f29932 = i;
        c8903.f29934 = 1;
        c8903.f3876 = i2;
        c8903.f29935 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m30206(C1740 c1740) {
        m30205(c1740.f3872, c1740.f29919);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m30207(int i, int i2) {
        this.mLayoutState.f29931 = i2 - this.mOrientationHelper.mo30710();
        C8903 c8903 = this.mLayoutState;
        c8903.f29932 = i;
        c8903.f29933 = this.mShouldReverseLayout ? 1 : -1;
        c8903.f29934 = -1;
        c8903.f3876 = i2;
        c8903.f29935 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m30208(C1740 c1740) {
        m30207(c1740.f3872, c1740.f29919);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1740();
        this.mLayoutChunkResult = new C1741();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1740();
        this.mLayoutChunkResult = new C1741();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.AbstractC8919.C8921 properties = RecyclerView.AbstractC8919.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f3889);
        setReverseLayout(properties.f29961);
        setStackFromEnd(properties.f29962);
    }
}
