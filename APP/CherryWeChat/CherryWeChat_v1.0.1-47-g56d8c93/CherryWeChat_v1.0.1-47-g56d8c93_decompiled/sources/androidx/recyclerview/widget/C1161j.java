package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0671Pj;
import p000.AbstractC2185lE;
import p000.AbstractC2374ph;
import p000.C0167Dv;
import p000.C0210Ev;
import p000.C0602O;
import p000.C0645P;
import p000.C2088j9;
import p000.C2208lv;
import p000.C2431qv;
import p000.C2646vv;
import p000.C2689wv;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1161j {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4039a;

    /* JADX INFO: renamed from: b */
    public ArrayList f4040b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4041c;

    /* JADX INFO: renamed from: d */
    public final List f4042d;

    /* JADX INFO: renamed from: e */
    public int f4043e;

    /* JADX INFO: renamed from: f */
    public int f4044f;

    /* JADX INFO: renamed from: g */
    public C2689wv f4045g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f4046h;

    public C1161j(RecyclerView recyclerView) {
        this.f4046h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4039a = arrayList;
        this.f4040b = null;
        this.f4041c = new ArrayList();
        this.f4042d = Collections.unmodifiableList(arrayList);
        this.f4043e = 2;
        this.f4044f = 2;
    }

    /* JADX INFO: renamed from: e */
    public static void m2254e(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m2254e((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2255a(AbstractC1166o abstractC1166o, boolean z) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC1166o);
        View view = abstractC1166o.itemView;
        RecyclerView recyclerView = this.f4046h;
        C0210Ev c0210Ev = recyclerView.mAccessibilityDelegate;
        if (c0210Ev != null) {
            C0167Dv c0167Dv = c0210Ev.f617e;
            AbstractC2185lE.m4399l(view, c0167Dv != null ? (C0645P) c0167Dv.f449e.remove(view) : null);
        }
        if (z) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
            AbstractC1158g abstractC1158g = recyclerView.mAdapter;
            if (abstractC1158g != null) {
                abstractC1158g.onViewRecycled(abstractC1166o);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m4974d(abstractC1166o);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(abstractC1166o);
            }
        }
        abstractC1166o.mBindingAdapter = null;
        abstractC1166o.mOwnerRecyclerView = null;
        C2689wv c2689wvM2257c = m2257c();
        c2689wvM2257c.getClass();
        int itemViewType = abstractC1166o.getItemViewType();
        ArrayList arrayList = c2689wvM2257c.m5265a(itemViewType).f9158a;
        if (((C2646vv) c2689wvM2257c.f9256a.get(itemViewType)).f9159b <= arrayList.size()) {
            AbstractC0671Pj.m1345c(abstractC1166o.itemView);
        } else {
            if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(abstractC1166o)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC1166o.resetInternal();
            arrayList.add(abstractC1166o);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2256b(int i) {
        RecyclerView recyclerView = this.f4046h;
        if (i >= 0 && i < recyclerView.mState.m58b()) {
            return !recyclerView.mState.f82g ? i : recyclerView.mAdapterHelper.m2221f(i, 0);
        }
        StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "invalid position ", ". State item count is ");
        sbM4816m.append(recyclerView.mState.m58b());
        sbM4816m.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sbM4816m.toString());
    }

    /* JADX INFO: renamed from: c */
    public final C2689wv m2257c() {
        if (this.f4045g == null) {
            C2689wv c2689wv = new C2689wv();
            c2689wv.f9256a = new SparseArray();
            c2689wv.f9257b = 0;
            c2689wv.f9258c = Collections.newSetFromMap(new IdentityHashMap());
            this.f4045g = c2689wv;
            m2259f();
        }
        return this.f4045g;
    }

    /* JADX INFO: renamed from: d */
    public final View m2258d(int i) {
        return m2266m(i, Long.MAX_VALUE).itemView;
    }

    /* JADX INFO: renamed from: f */
    public final void m2259f() {
        if (this.f4045g != null) {
            RecyclerView recyclerView = this.f4046h;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            C2689wv c2689wv = this.f4045g;
            c2689wv.f9258c.add(recyclerView.mAdapter);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2260g(AbstractC1158g abstractC1158g, boolean z) {
        C2689wv c2689wv = this.f4045g;
        if (c2689wv != null) {
            SparseArray sparseArray = c2689wv.f9256a;
            Set set = c2689wv.f9258c;
            set.remove(abstractC1158g);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C2646vv) sparseArray.get(sparseArray.keyAt(i))).f9158a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC0671Pj.m1345c(((AbstractC1166o) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2261h() {
        ArrayList arrayList = this.f4041c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2262i(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            C1154c c1154c = this.f4046h.mPrefetchRegistry;
            int[] iArr = c1154c.f4022c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1154c.f4023d = 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2262i(int i) {
        int i2 = RecyclerView.HORIZONTAL;
        ArrayList arrayList = this.f4041c;
        AbstractC1166o abstractC1166o = (AbstractC1166o) arrayList.get(i);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Objects.toString(abstractC1166o);
        }
        m2255a(abstractC1166o, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: j */
    public final void m2263j(View view) {
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f4046h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        m2264k(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
            return;
        }
        recyclerView.mItemAnimator.mo2248d(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2264k(AbstractC1166o abstractC1166o) {
        boolean z;
        int i;
        boolean zIsScrap = abstractC1166o.isScrap();
        boolean z2 = true;
        RecyclerView recyclerView = this.f4046h;
        if (zIsScrap || abstractC1166o.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC1166o.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC1166o.itemView.getParent() != null);
            sb.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC1166o.isTmpDetached()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC1166o);
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, sb2));
        }
        if (abstractC1166o.shouldIgnore()) {
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        boolean zDoesTransientStatePreventRecycling = abstractC1166o.doesTransientStatePreventRecycling();
        AbstractC1158g abstractC1158g = recyclerView.mAdapter;
        boolean z3 = abstractC1158g != null && zDoesTransientStatePreventRecycling && abstractC1158g.onFailedToRecycleView(abstractC1166o);
        boolean z4 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f4041c;
        if (z4 && arrayList.contains(abstractC1166o)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC1166o);
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, sb3));
        }
        if (z3 || abstractC1166o.isRecyclable()) {
            if (this.f4044f <= 0 || abstractC1166o.hasAnyOfTheFlags(526)) {
                z = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f4044f && size > 0) {
                    m2262i(0);
                    size--;
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                    C1154c c1154c = recyclerView.mPrefetchRegistry;
                    int i2 = abstractC1166o.mPosition;
                    if (c1154c.f4022c != null) {
                        int i3 = c1154c.f4023d * 2;
                        for (int i4 = 0; i4 < i3; i4 += 2) {
                            if (c1154c.f4022c[i4] == i2) {
                                break;
                            }
                        }
                        i = size - 1;
                        loop1: while (i >= 0) {
                            int i5 = ((AbstractC1166o) arrayList.get(i)).mPosition;
                            C1154c c1154c2 = recyclerView.mPrefetchRegistry;
                            if (c1154c2.f4022c == null) {
                                break;
                            }
                            int i6 = c1154c2.f4023d * 2;
                            for (int i7 = 0; i7 < i6; i7 += 2) {
                                if (c1154c2.f4022c[i7] == i5) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i + 1;
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, abstractC1166o);
                z = true;
            }
            if (z) {
                z2 = false;
            } else {
                m2255a(abstractC1166o, true);
            }
            z = z;
        } else {
            if (RecyclerView.sVerboseLoggingEnabled) {
                recyclerView.exceptionLabel();
            }
            z2 = false;
        }
        recyclerView.mViewInfoStore.m4974d(abstractC1166o);
        if (z || z2 || !zDoesTransientStatePreventRecycling) {
            return;
        }
        AbstractC0671Pj.m1345c(abstractC1166o.itemView);
        abstractC1166o.mBindingAdapter = null;
        abstractC1166o.mOwnerRecyclerView = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m2265l(View view) {
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f4046h;
        if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f4040b == null) {
                this.f4040b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f4040b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f4039a.add(childViewHolderInt);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1166o m2266m(int i, long j) {
        AbstractC1166o childViewHolderInt;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long j4;
        boolean z3;
        long j5;
        boolean z4;
        Object[] objArr;
        ViewGroup.LayoutParams layoutParams;
        C2431qv c2431qv;
        RecyclerView recyclerViewFindNestedRecyclerView;
        AbstractC1166o abstractC1166o;
        View view;
        AbstractC1166o abstractC1166o2;
        boolean z5;
        int size;
        int iM2221f;
        RecyclerView recyclerView = this.f4046h;
        if (i < 0 || i >= recyclerView.mState.m58b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.mState.m58b() + recyclerView.exceptionLabel());
        }
        boolean z6 = true;
        if (recyclerView.mState.f82g) {
            ArrayList arrayList = this.f4040b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                childViewHolderInt = null;
                z = childViewHolderInt == null;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        childViewHolderInt = (AbstractC1166o) this.f4040b.get(i2);
                        if (!childViewHolderInt.wasReturnedFromScrap() && childViewHolderInt.getLayoutPosition() == i) {
                            childViewHolderInt.addFlags(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.mAdapter.hasStableIds() && (iM2221f = recyclerView.mAdapterHelper.m2221f(i, 0)) > 0 && iM2221f < recyclerView.mAdapter.getItemCount()) {
                        long itemId = recyclerView.mAdapter.getItemId(iM2221f);
                        for (int i3 = 0; i3 < size; i3++) {
                            AbstractC1166o abstractC1166o3 = (AbstractC1166o) this.f4040b.get(i3);
                            if (!abstractC1166o3.wasReturnedFromScrap() && abstractC1166o3.getItemId() == itemId) {
                                abstractC1166o3.addFlags(32);
                                childViewHolderInt = abstractC1166o3;
                                break;
                            }
                        }
                    }
                }
                childViewHolderInt = null;
                if (childViewHolderInt == null) {
                }
            }
            ArrayList arrayList2 = this.f4039a;
            ArrayList arrayList3 = this.f4041c;
            if (childViewHolderInt == null) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    abstractC1166o2 = (AbstractC1166o) arrayList2.get(i4);
                    if (!abstractC1166o2.wasReturnedFromScrap() && abstractC1166o2.getLayoutPosition() == i && !abstractC1166o2.isInvalid() && (recyclerView.mState.f82g || !abstractC1166o2.isRemoved())) {
                        abstractC1166o2.addFlags(32);
                        break;
                    }
                }
                ArrayList arrayList4 = recyclerView.mChildHelper.f4019c;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        view = null;
                        break;
                    }
                    view = (View) arrayList4.get(i5);
                    AbstractC1166o childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    if (childViewHolderInt2.getLayoutPosition() == i && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                        break;
                    }
                    i5++;
                }
                if (view != null) {
                    childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                    C1153b c1153b = recyclerView.mChildHelper;
                    C2088j9 c2088j9 = c1153b.f4018b;
                    int iIndexOfChild = c1153b.f4017a.f4930a.indexOfChild(view);
                    if (iIndexOfChild < 0) {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                    if (!c2088j9.m4256d(iIndexOfChild)) {
                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                    }
                    c2088j9.m4253a(iIndexOfChild);
                    c1153b.m2238k(view);
                    int iM2237j = recyclerView.mChildHelper.m2237j(view);
                    if (iM2237j == -1) {
                        StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb.append(childViewHolderInt);
                        throw new IllegalStateException(AbstractC0213Ey.m406d(recyclerView, sb));
                    }
                    recyclerView.mChildHelper.m2230c(iM2237j);
                    m2265l(view);
                    childViewHolderInt.addFlags(8224);
                } else {
                    int size4 = arrayList3.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        abstractC1166o2 = (AbstractC1166o) arrayList3.get(i6);
                        if (!abstractC1166o2.isInvalid() && abstractC1166o2.getLayoutPosition() == i && !abstractC1166o2.isAttachedToTransitionOverlay()) {
                            arrayList3.remove(i6);
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                abstractC1166o2.toString();
                            }
                            childViewHolderInt = abstractC1166o2;
                        }
                    }
                    childViewHolderInt = null;
                }
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.isRemoved()) {
                        int i7 = childViewHolderInt.mPosition;
                        if (i7 < 0 || i7 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb2.append(childViewHolderInt);
                            throw new IndexOutOfBoundsException(AbstractC0213Ey.m406d(recyclerView, sb2));
                        }
                        z5 = (recyclerView.mState.f82g || recyclerView.mAdapter.getItemViewType(childViewHolderInt.mPosition) == childViewHolderInt.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || childViewHolderInt.getItemId() == recyclerView.mAdapter.getItemId(childViewHolderInt.mPosition));
                    } else {
                        if (RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.f82g) {
                            throw new IllegalStateException(AbstractC0213Ey.m406d(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                        }
                        z5 = recyclerView.mState.f82g;
                    }
                    if (z5) {
                        z = true;
                    } else {
                        childViewHolderInt.addFlags(4);
                        if (childViewHolderInt.isScrap()) {
                            recyclerView.removeDetachedView(childViewHolderInt.itemView, false);
                            childViewHolderInt.unScrap();
                        } else if (childViewHolderInt.wasReturnedFromScrap()) {
                            childViewHolderInt.clearReturnedFromScrapFlag();
                        }
                        m2264k(childViewHolderInt);
                        childViewHolderInt = null;
                    }
                }
            }
            if (childViewHolderInt != null) {
                j2 = 3;
                int iM2221f2 = recyclerView.mAdapterHelper.m2221f(i, 0);
                if (iM2221f2 < 0 || iM2221f2 >= recyclerView.mAdapter.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM2221f2 + ").state:" + recyclerView.mState.m58b() + recyclerView.exceptionLabel());
                }
                int itemViewType = recyclerView.mAdapter.getItemViewType(iM2221f2);
                j3 = 4;
                if (recyclerView.mAdapter.hasStableIds()) {
                    long itemId2 = recyclerView.mAdapter.getItemId(iM2221f2);
                    int size5 = arrayList2.size() - 1;
                    while (true) {
                        if (size5 >= 0) {
                            j4 = 0;
                            AbstractC1166o abstractC1166o4 = (AbstractC1166o) arrayList2.get(size5);
                            if (abstractC1166o4.getItemId() != itemId2 || abstractC1166o4.wasReturnedFromScrap()) {
                                z2 = z6;
                            } else {
                                z2 = z6;
                                if (itemViewType == abstractC1166o4.getItemViewType()) {
                                    abstractC1166o4.addFlags(32);
                                    if (abstractC1166o4.isRemoved() && !recyclerView.mState.f82g) {
                                        abstractC1166o4.setFlags(2, 14);
                                    }
                                    childViewHolderInt = abstractC1166o4;
                                } else {
                                    arrayList2.remove(size5);
                                    recyclerView.removeDetachedView(abstractC1166o4.itemView, false);
                                    AbstractC1166o childViewHolderInt3 = RecyclerView.getChildViewHolderInt(abstractC1166o4.itemView);
                                    childViewHolderInt3.mScrapContainer = null;
                                    childViewHolderInt3.mInChangeScrap = false;
                                    childViewHolderInt3.clearReturnedFromScrapFlag();
                                    m2264k(childViewHolderInt3);
                                }
                            }
                            size5--;
                            z6 = z2;
                        } else {
                            z2 = z6;
                            j4 = 0;
                            int size6 = arrayList3.size() - 1;
                            while (true) {
                                if (size6 < 0) {
                                    break;
                                }
                                AbstractC1166o abstractC1166o5 = (AbstractC1166o) arrayList3.get(size6);
                                if (abstractC1166o5.getItemId() != itemId2 || abstractC1166o5.isAttachedToTransitionOverlay()) {
                                    size6--;
                                } else if (itemViewType == abstractC1166o5.getItemViewType()) {
                                    arrayList3.remove(size6);
                                    childViewHolderInt = abstractC1166o5;
                                } else {
                                    m2262i(size6);
                                }
                            }
                            childViewHolderInt = null;
                        }
                    }
                    if (childViewHolderInt != null) {
                        childViewHolderInt.mPosition = iM2221f2;
                        z = z2;
                    }
                } else {
                    z2 = true;
                    j4 = 0;
                }
                if (childViewHolderInt == null) {
                    int i8 = RecyclerView.HORIZONTAL;
                    C2646vv c2646vv = (C2646vv) m2257c().f9256a.get(itemViewType);
                    if (c2646vv != null) {
                        ArrayList arrayList5 = c2646vv.f9158a;
                        if (arrayList5.isEmpty()) {
                            abstractC1166o = null;
                            if (abstractC1166o != null) {
                            }
                            childViewHolderInt = abstractC1166o;
                        } else {
                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                if (!((AbstractC1166o) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                    abstractC1166o = (AbstractC1166o) arrayList5.remove(size7);
                                    break;
                                }
                            }
                            abstractC1166o = null;
                            if (abstractC1166o != null) {
                                abstractC1166o.resetInternal();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    View view2 = abstractC1166o.itemView;
                                    if (view2 instanceof ViewGroup) {
                                        m2254e((ViewGroup) view2, false);
                                    }
                                }
                            }
                            childViewHolderInt = abstractC1166o;
                        }
                    }
                }
                if (childViewHolderInt == null) {
                    long nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j6 = this.f4045g.m5265a(itemViewType).f9160c;
                        if (!((j6 == j4 || j6 + nanoTime < j) ? z2 : false)) {
                            return null;
                        }
                    }
                    AbstractC1166o abstractC1166oCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(abstractC1166oCreateViewHolder.itemView)) != null) {
                        abstractC1166oCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C2646vv c2646vvM5265a = this.f4045g.m5265a(itemViewType);
                    long j7 = c2646vvM5265a.f9160c;
                    if (j7 != j4) {
                        nanoTime2 = (nanoTime2 / 4) + ((j7 / 4) * 3);
                    }
                    c2646vvM5265a.f9160c = nanoTime2;
                    childViewHolderInt = abstractC1166oCreateViewHolder;
                }
            } else {
                z2 = true;
                j2 = 3;
                j3 = 4;
                j4 = 0;
            }
            if (z && !recyclerView.mState.f82g && childViewHolderInt.hasAnyOfTheFlags(8192)) {
                childViewHolderInt.setFlags(0, 8192);
                if (recyclerView.mState.f85j) {
                    AbstractC1159h.m2245b(childViewHolderInt);
                    AbstractC1159h abstractC1159h = recyclerView.mItemAnimator;
                    childViewHolderInt.getUnmodifiedPayloads();
                    abstractC1159h.getClass();
                    C2208lv c2208lv = new C2208lv();
                    c2208lv.m4444a(childViewHolderInt);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, c2208lv);
                }
            }
            if (recyclerView.mState.f82g || !childViewHolderInt.isBound()) {
                if (childViewHolderInt.isBound() || childViewHolderInt.needsUpdate() || childViewHolderInt.isInvalid()) {
                    if (!RecyclerView.sDebugAssertionsEnabled && childViewHolderInt.isRemoved()) {
                        StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb3.append(childViewHolderInt);
                        throw new IllegalStateException(AbstractC0213Ey.m406d(recyclerView, sb3));
                    }
                    int iM2221f3 = recyclerView.mAdapterHelper.m2221f(i, 0);
                    childViewHolderInt.mBindingAdapter = null;
                    childViewHolderInt.mOwnerRecyclerView = recyclerView;
                    int itemViewType2 = childViewHolderInt.getItemViewType();
                    long nanoTime3 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j8 = this.f4045g.m5265a(itemViewType2).f9161d;
                        if (j8 == j4 || j8 + nanoTime3 < j) {
                        }
                    }
                    if (childViewHolderInt.isTmpDetached()) {
                        z3 = false;
                    } else {
                        recyclerView.attachViewToParent(childViewHolderInt.itemView, recyclerView.getChildCount(), childViewHolderInt.itemView.getLayoutParams());
                        z3 = z2;
                    }
                    recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iM2221f3);
                    if (z3) {
                        recyclerView.detachViewFromParent(childViewHolderInt.itemView);
                    }
                    long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                    C2646vv c2646vvM5265a2 = this.f4045g.m5265a(childViewHolderInt.getItemViewType());
                    j5 = c2646vvM5265a2.f9161d;
                    if (j5 != j4) {
                        nanoTime4 = (nanoTime4 / j3) + ((j5 / j3) * j2);
                    }
                    c2646vvM5265a2.f9161d = nanoTime4;
                    if (recyclerView.isAccessibilityEnabled()) {
                        z4 = z2;
                    } else {
                        View view3 = childViewHolderInt.itemView;
                        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                        if (view3.getImportantForAccessibility() == 0) {
                            z4 = z2;
                            view3.setImportantForAccessibility(z4 ? 1 : 0);
                        } else {
                            z4 = z2;
                        }
                        C0210Ev c0210Ev = recyclerView.mAccessibilityDelegate;
                        if (c0210Ev != null) {
                            C0167Dv c0167Dv = c0210Ev.f617e;
                            if (c0167Dv != null) {
                                View.AccessibilityDelegate accessibilityDelegateM4390c = AbstractC2185lE.m4390c(view3);
                                C0645P c0645p = accessibilityDelegateM4390c != null ? accessibilityDelegateM4390c instanceof C0602O ? ((C0602O) accessibilityDelegateM4390c).f1942a : new C0645P(accessibilityDelegateM4390c) : null;
                                if (c0645p != null && c0645p != c0167Dv) {
                                    c0167Dv.f449e.put(view3, c0645p);
                                }
                            }
                            AbstractC2185lE.m4399l(view3, c0167Dv);
                        }
                    }
                    if (recyclerView.mState.f82g) {
                        childViewHolderInt.mPreLayoutPosition = i;
                    }
                    objArr = z4 ? 1 : 0;
                }
                layoutParams = childViewHolderInt.itemView.getLayoutParams();
                if (layoutParams == null) {
                    c2431qv = (C2431qv) recyclerView.generateDefaultLayoutParams();
                    childViewHolderInt.itemView.setLayoutParams(c2431qv);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c2431qv = (C2431qv) layoutParams;
                } else {
                    c2431qv = (C2431qv) recyclerView.generateLayoutParams(layoutParams);
                    childViewHolderInt.itemView.setLayoutParams(c2431qv);
                }
                c2431qv.f8526a = childViewHolderInt;
                if (!z || objArr == null) {
                    z4 = false;
                }
                c2431qv.f8529d = z4;
                return childViewHolderInt;
            }
            childViewHolderInt.mPreLayoutPosition = i;
            objArr = null;
            z4 = z2;
            layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            c2431qv.f8526a = childViewHolderInt;
            if (!z) {
                z4 = false;
            }
            c2431qv.f8529d = z4;
            return childViewHolderInt;
        }
        childViewHolderInt = null;
        ArrayList arrayList22 = this.f4039a;
        ArrayList arrayList32 = this.f4041c;
        if (childViewHolderInt == null) {
        }
        if (childViewHolderInt != null) {
        }
        if (z) {
            childViewHolderInt.setFlags(0, 8192);
            if (recyclerView.mState.f85j) {
            }
        }
        if (recyclerView.mState.f82g) {
            if (childViewHolderInt.isBound()) {
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                int iM2221f32 = recyclerView.mAdapterHelper.m2221f(i, 0);
                childViewHolderInt.mBindingAdapter = null;
                childViewHolderInt.mOwnerRecyclerView = recyclerView;
                int itemViewType22 = childViewHolderInt.getItemViewType();
                long nanoTime32 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                }
                if (childViewHolderInt.isTmpDetached()) {
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolderInt, iM2221f32);
                if (z3) {
                }
                long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
                C2646vv c2646vvM5265a22 = this.f4045g.m5265a(childViewHolderInt.getItemViewType());
                j5 = c2646vvM5265a22.f9161d;
                if (j5 != j4) {
                }
                c2646vvM5265a22.f9161d = nanoTime42;
                if (recyclerView.isAccessibilityEnabled()) {
                }
                if (recyclerView.mState.f82g) {
                }
                objArr = z4 ? 1 : 0;
            }
        }
        layoutParams = childViewHolderInt.itemView.getLayoutParams();
        if (layoutParams == null) {
        }
        c2431qv.f8526a = childViewHolderInt;
        if (!z) {
        }
        c2431qv.f8529d = z4;
        return childViewHolderInt;
    }

    /* JADX INFO: renamed from: n */
    public final void m2267n(AbstractC1166o abstractC1166o) {
        if (abstractC1166o.mInChangeScrap) {
            this.f4040b.remove(abstractC1166o);
        } else {
            this.f4039a.remove(abstractC1166o);
        }
        abstractC1166o.mScrapContainer = null;
        abstractC1166o.mInChangeScrap = false;
        abstractC1166o.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: o */
    public final void m2268o() {
        AbstractC1160i abstractC1160i = this.f4046h.mLayout;
        this.f4044f = this.f4043e + (abstractC1160i != null ? abstractC1160i.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f4041c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4044f; size--) {
            m2262i(size);
        }
    }
}
