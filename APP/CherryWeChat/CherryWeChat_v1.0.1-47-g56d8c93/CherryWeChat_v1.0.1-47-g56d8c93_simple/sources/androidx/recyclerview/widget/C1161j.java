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

    public C1161j(RecyclerView r2) {
        this.f4046h = r2;
        ArrayList r22 = new ArrayList();
        this.f4039a = r22;
        this.f4040b = null;
        this.f4041c = new ArrayList();
        this.f4042d = Collections.unmodifiableList(r22);
        this.f4043e = 2;
        this.f4044f = 2;
    }

    /* JADX INFO: renamed from: e */
    public static void m2254e(ViewGroup r4, boolean r5) {
        int r0 = r4.getChildCount() - 1;
    L3:
        if (r0 < 0) goto L8;
        View r2 = r4.getChildAt(r0);
        if ((r2 instanceof ViewGroup) == false) goto L7;
        m2254e((ViewGroup) r2, true);
    L7:
        r0 = r0 - 1;
        goto L3
    L8:
        if (r5 == true) goto L11;
        return;
    L11:
        if (r4.getVisibility() != 4) goto L14;
        r4.setVisibility(0);
        r4.setVisibility(4);
        return;
    L14:
        int r52 = r4.getVisibility();
        r4.setVisibility(4);
        r4.setVisibility(r52);
    }

    /* JADX INFO: renamed from: a */
    public final void m2255a(AbstractC1166o r5, boolean r6) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(r5);
        View r0 = r5.itemView;
        RecyclerView r1 = this.f4046h;
        C0210Ev r2 = r1.mAccessibilityDelegate;
        if (r2 == null) goto L9;
        C0167Dv r22 = r2.f617e;
        if (r22 == null) goto L7;
        C0645P r23 = (C0645P) r22.f449e.remove(r0);
    L8:
        AbstractC2185lE.m4399l(r0, r23);
        goto L9
    L7:
        r23 = null;
    L9:
        if (r6 == true) goto L11;
    L23:
        r5.mBindingAdapter = null;
        r5.mOwnerRecyclerView = null;
        C2689wv r62 = m2257c();
        r62.getClass();
        int r02 = r5.getItemViewType();
        ArrayList r12 = r62.m5265a(r02).f9158a;
        if (((C2646vv) r62.f9256a.get(r02)).f9159b > r12.size()) goto L28;
        AbstractC0671Pj.m1345c(r5.itemView);
        return;
    L28:
        if (RecyclerView.sDebugAssertionsEnabled == true) goto L30;
    L34:
        r5.resetInternal();
        r12.add(r5);
        return;
    L30:
        if (r12.contains(r5) == false) goto L34;
        throw new IllegalArgumentException("this scrap item already exists");
    L11:
        if (r1.mRecyclerListeners.size() > 0) goto L21;
        AbstractC1158g r63 = r1.mAdapter;
        if (r63 == null) goto L16;
        r63.onViewRecycled(r5);
    L16:
        if (r1.mState == null) goto L19;
        r1.mViewInfoStore.m4974d(r5);
    L19:
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L23;
        Objects.toString(r5);
        goto L23
    L21:
        r1.mRecyclerListeners.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: b */
    public final int m2256b(int r5) {
        RecyclerView r0 = this.f4046h;
        if (r5 >= 0) goto L5;
    L11:
        StringBuilder r52 = AbstractC2374ph.m4816m(r5, "invalid position ", ". State item count is ");
        r52.append(r0.mState.m58b());
        r52.append(r0.exceptionLabel());
        throw new IndexOutOfBoundsException(r52.toString());
    L5:
        if (r5 >= r0.mState.m58b()) goto L11;
        if (r0.mState.f82g == true) goto L10;
        return r5;
    L10:
        return r0.mAdapterHelper.m2221f(r5, 0);
    }

    /* JADX INFO: renamed from: c */
    public final C2689wv m2257c() {
        if (this.f4045g != null) goto L6;
        C2689wv r0 = new C2689wv();
        r0.f9256a = new SparseArray();
        r0.f9257b = 0;
        r0.f9258c = Collections.newSetFromMap(new IdentityHashMap());
        this.f4045g = r0;
        m2259f();
    L6:
        return this.f4045g;
    }

    /* JADX INFO: renamed from: d */
    public final View m2258d(int r3) {
        return m2266m(r3, Long.MAX_VALUE).itemView;
    }

    /* JADX INFO: renamed from: f */
    public final void m2259f() {
        if (this.f4045g == null) goto L10;
        RecyclerView r0 = this.f4046h;
        if (r0.mAdapter != null) goto L7;
        return;
    L7:
        if (r0.isAttachedToWindow() == false) goto L12;
        C2689wv r1 = this.f4045g;
        AbstractC1158g r02 = r0.mAdapter;
        r1.f9258c.add(r02);
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: g */
    public final void m2260g(AbstractC1158g r5, boolean r6) {
        C2689wv r0 = this.f4045g;
        if (r0 == null) goto L15;
        SparseArray r1 = r0.f9256a;
        Set r02 = r0.f9258c;
        r02.remove(r5);
        if (r02.size() != 0) goto L18;
        if (r6 == true) goto L19;
        int r62 = 0;
    L9:
        if (r62 >= r1.size()) goto L20;
        ArrayList r03 = ((C2646vv) r1.get(r1.keyAt(r62))).f9158a;
        int r2 = 0;
    L12:
        if (r2 >= r03.size()) goto L14;
        AbstractC0671Pj.m1345c(((AbstractC1166o) r03.get(r2)).itemView);
        r2 = r2 + 1;
        goto L12
    L14:
        r62 = r62 + 1;
        goto L9
    L20:
        return;
    L19:
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m2261h() {
        ArrayList r0 = this.f4041c;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L5;
        m2262i(r1);
        r1 = r1 - 1;
        goto L3
    L5:
        r0.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK == false) goto L13;
        C1154c r02 = this.f4046h.mPrefetchRegistry;
        int[] r12 = r02.f4022c;
        if (r12 == null) goto L10;
        Arrays.fill(r12, -1);
    L10:
        r02.f4023d = 0;
        return;
    }

    /* JADX INFO: renamed from: i */
    public final void m2262i(int r4) {
        int r0 = RecyclerView.HORIZONTAL;
        ArrayList r02 = this.f4041c;
        AbstractC1166o r1 = (AbstractC1166o) r02.get(r4);
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L5;
        Objects.toString(r1);
    L5:
        m2255a(r1, true);
        r02.remove(r4);
    }

    /* JADX INFO: renamed from: j */
    public final void m2263j(View r4) {
        AbstractC1166o r0 = RecyclerView.getChildViewHolderInt(r4);
        boolean r1 = r0.isTmpDetached();
        RecyclerView r2 = this.f4046h;
        if (r1 == false) goto L6;
        r2.removeDetachedView(r4, false);
    L6:
        if (r0.isScrap() == false) goto L9;
        r0.unScrap();
    L11:
        m2264k(r0);
        if (r2.mItemAnimator != null) goto L14;
        return;
    L14:
        if (r0.isRecyclable() == true) goto L18;
        r2.mItemAnimator.mo2248d(r0);
        return;
    L18:
        return;
    L9:
        if (r0.wasReturnedFromScrap() == false) goto L11;
        r0.clearReturnedFromScrapFlag();
        goto L11
    }

    /* JADX INFO: renamed from: k */
    public final void m2264k(AbstractC1166o r12) {
        boolean r0 = r12.isScrap();
        boolean r1 = false;
        boolean r2 = true;
        RecyclerView r3 = this.f4046h;
        if (r0 == false) goto L5;
    L79:
        StringBuilder r4 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        r4.append(r12.isScrap());
        r4.append(" isAttached:");
        if (r12.itemView.getParent() == null) goto L82;
        r1 = true;
    L82:
        r4.append(r1);
        r4.append(r3.exceptionLabel());
        throw new IllegalArgumentException(r4.toString());
    L5:
        if (r12.itemView.getParent() != null) goto L79;
        if (r12.isTmpDetached() == false) goto L10;
        StringBuilder r13 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
        r13.append(r12);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r3, r13));
    L10:
        if (r12.shouldIgnore() == true) goto L76;
        boolean r02 = r12.doesTransientStatePreventRecycling();
        AbstractC1158g r42 = r3.mAdapter;
        if (r42 == null) goto L17;
        if (r02 == false) goto L17;
        if (r42.onFailedToRecycleView(r12) == false) goto L17;
        boolean r43 = true;
    L18:
        boolean r5 = RecyclerView.sDebugAssertionsEnabled;
        ArrayList r6 = this.f4041c;
        if (r5 == true) goto L21;
    L25:
        if (r43 == true) goto L34;
        if (r12.isRecyclable() == true) goto L34;
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L32;
        r3.exceptionLabel();
    L32:
        r2 = false;
    L69:
        r3.mViewInfoStore.m4974d(r12);
        if (r1 == true) goto L90;
        if (r2 == true) goto L91;
        if (r02 == false) goto L92;
        AbstractC0671Pj.m1345c(r12.itemView);
        r12.mBindingAdapter = null;
        r12.mOwnerRecyclerView = null;
        return;
    L92:
        return;
    L91:
        return;
    L90:
        return;
    L34:
        if (this.f4044f > 0) goto L36;
    L64:
        boolean r44 = false;
    L65:
        if (r44 == true) goto L68;
        m2255a(r12, true);
    L67:
        r1 = r44;
        goto L69
    L68:
        r2 = false;
        goto L67
    L36:
        if (r12.hasAnyOfTheFlags(526) == true) goto L64;
        int r45 = r6.size();
        if (r45 < this.f4044f) goto L42;
        if (r45 <= 0) goto L42;
        m2262i(0);
        r45 = r45 - 1;
    L42:
        if (RecyclerView.ALLOW_THREAD_GAP_WORK == false) goto L63;
        if (r45 <= 0) goto L63;
        C1154c r52 = r3.mPrefetchRegistry;
        int r7 = r12.mPosition;
        if (r52.f4022c == null) goto L52;
        int r8 = r52.f4023d * 2;
        int r9 = 0;
    L47:
        if (r9 >= r8) goto L52;
        if (r52.f4022c[r9] == r7) goto L63;
        r9 = r9 + 2;
    L52:
        int r46 = r45 - 1;
    L53:
        if (r46 < 0) goto L62;
        int r53 = ((AbstractC1166o) r6.get(r46)).mPosition;
        C1154c r72 = r3.mPrefetchRegistry;
        if (r72.f4022c == null) goto L62;
        int r82 = r72.f4023d * 2;
        int r92 = 0;
    L57:
        if (r92 >= r82) goto L62;
        if (r72.f4022c[r92] == r53) goto L60;
        r92 = r92 + 2;
        goto L57
    L60:
        r46 = r46 - 1;
    L62:
        r45 = r46 + 1;
    L63:
        r6.add(r45, r12);
        r44 = true;
        goto L65
    L21:
        if (r6.contains(r12) == false) goto L25;
        StringBuilder r14 = new StringBuilder("cached view received recycle internal? ");
        r14.append(r12);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r3, r14));
    L17:
        r43 = false;
        goto L18
    L76:
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r3, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
    }

    /* JADX INFO: renamed from: l */
    public final void m2265l(View r4) {
        AbstractC1166o r42 = RecyclerView.getChildViewHolderInt(r4);
        boolean r0 = r42.hasAnyOfTheFlags(12);
        RecyclerView r1 = this.f4046h;
        if (r0 == true) goto L15;
        if (r42.isUpdated() == false) goto L15;
        if (r1.canReuseUpdatedViewHolder(r42) == true) goto L15;
        if (this.f4040b != null) goto L12;
        this.f4040b = new ArrayList();
    L12:
        r42.setScrapContainer(this, true);
        this.f4040b.add(r42);
        return;
    L15:
        if (r42.isInvalid() == true) goto L17;
    L23:
        r42.setScrapContainer(this, false);
        this.f4039a.add(r42);
        return;
    L17:
        if (r42.isRemoved() == true) goto L23;
        if (r1.mAdapter.hasStableIds() == true) goto L23;
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r1, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC1166o m2266m(int r29, long r30) {
        RecyclerView r2 = this.f4046h;
        if (r29 < 0) goto L302;
        if (r29 >= r2.mState.m58b()) goto L302;
        C0645P r5 = null;
        boolean r6 = true;
        if (r2.mState.f82g == false) goto L38;
        ArrayList r3 = this.f4040b;
        if (r3 == null) goto L35;
        int r32 = r3.size();
        if (r32 == 0) goto L35;
        int r8 = 0;
    L14:
        if (r8 >= r32) goto L22;
        AbstractC1166o r9 = (AbstractC1166o) this.f4040b.get(r8);
        if (r9.wasReturnedFromScrap() == true) goto L20;
        if (r9.getLayoutPosition() != r29) goto L20;
        r9.addFlags(32);
    L36:
        if (r9 == null) goto L39;
        boolean r33 = true;
    L40:
        ArrayList r82 = this.f4039a;
        ArrayList r10 = this.f4041c;
        if (r9 != null) goto L132;
        int r92 = r82.size();
        int r11 = 0;
    L43:
        if (r11 >= r92) goto L57;
        AbstractC1166o r12 = (AbstractC1166o) r82.get(r11);
        if (r12.wasReturnedFromScrap() == true) goto L56;
        if (r12.getLayoutPosition() != r29) goto L56;
        if (r12.isInvalid() == true) goto L56;
        if (r2.mState.f82g == true) goto L54;
        if (r12.isRemoved() == true) goto L56;
    L54:
        r12.addFlags(32);
    L55:
        r9 = r12;
    L95:
        if (r9 == null) goto L132;
        if (r9.isRemoved() == true) goto L99;
        int r112 = r9.mPosition;
        if (r112 >= 0) goto L109;
    L129:
        StringBuilder r34 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
        r34.append(r9);
        throw new IndexOutOfBoundsException(AbstractC0213Ey.m406d(r2, r34));
    L109:
        if (r112 >= r2.mAdapter.getItemCount()) goto L129;
        if (r2.mState.f82g == true) goto L116;
        if (r2.mAdapter.getItemViewType(r9.mPosition) == r9.getItemViewType()) goto L116;
    L114:
        boolean r113 = false;
    L120:
        if (r113 == true) goto L128;
        r9.addFlags(4);
        if (r9.isScrap() == false) goto L125;
        r2.removeDetachedView(r9.itemView, false);
        r9.unScrap();
    L127:
        m2264k(r9);
        r9 = null;
        goto L132
    L125:
        if (r9.wasReturnedFromScrap() == false) goto L127;
        r9.clearReturnedFromScrapFlag();
        goto L127
    L128:
        r33 = true;
    L116:
        if (r2.mAdapter.hasStableIds() == true) goto L118;
    L119:
        r113 = true;
        goto L120
    L118:
        if (r9.getItemId() != r2.mAdapter.getItemId(r9.mPosition)) goto L114;
    L99:
        if (RecyclerView.sDebugAssertionsEnabled == true) goto L101;
    L105:
        r113 = r2.mState.f82g;
        goto L120
    L101:
        if (r2.mState.f82g == true) goto L105;
        throw new IllegalStateException(AbstractC0213Ey.m406d(r2, new StringBuilder("should not receive a removed view unless it is pre layout")));
    L56:
        r11 = r11 + 1;
        goto L43
    L57:
        ArrayList r93 = r2.mChildHelper.f4019c;
        int r114 = r93.size();
        int r122 = 0;
    L58:
        if (r122 >= r114) goto L67;
        View r13 = (View) r93.get(r122);
        AbstractC1166o r14 = RecyclerView.getChildViewHolderInt(r13);
        if (r14.getLayoutPosition() != r29) goto L66;
        if (r14.isInvalid() == true) goto L66;
        if (r14.isRemoved() == true) goto L66;
    L68:
        if (r13 == null) goto L82;
        r9 = RecyclerView.getChildViewHolderInt(r13);
        C1153b r115 = r2.mChildHelper;
        C2088j9 r123 = r115.f4018b;
        int r142 = r115.f4017a.f4930a.indexOfChild(r13);
        if (r142 < 0) goto L81;
        if (r123.m4256d(r142) == false) goto L79;
        r123.m4253a(r142);
        r115.m2238k(r13);
        int r116 = r2.mChildHelper.m2237j(r13);
        if (r116 == (-1)) goto L76;
        r2.mChildHelper.m2230c(r116);
        m2265l(r13);
        r9.addFlags(8224);
        goto L95
    L76:
        StringBuilder r35 = new StringBuilder("layout index should not be -1 after unhiding a view:");
        r35.append(r9);
        throw new IllegalStateException(AbstractC0213Ey.m406d(r2, r35));
    L79:
        throw new RuntimeException("trying to unhide a view that was not hidden" + r13);
    L81:
        throw new IllegalArgumentException("view is not a child, cannot hide " + r13);
    L82:
        int r94 = r10.size();
        int r117 = 0;
    L83:
        if (r117 >= r94) goto L94;
        r12 = (AbstractC1166o) r10.get(r117);
        if (r12.isInvalid() == true) goto L93;
        if (r12.getLayoutPosition() != r29) goto L93;
        if (r12.isAttachedToTransitionOverlay() == true) goto L93;
        r10.remove(r117);
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L55;
        r12.toString();
    L93:
        r117 = r117 + 1;
        goto L83
    L94:
        r9 = null;
    L66:
        r122 = r122 + 1;
        goto L58
    L67:
        r13 = null;
    L132:
        if (r9 != null) goto L214;
        long r19 = 3;
        int r118 = r2.mAdapterHelper.m2221f(r29, 0);
        if (r118 < 0) goto L213;
        if (r118 >= r2.mAdapter.getItemCount()) goto L213;
        int r124 = r2.mAdapter.getItemViewType(r118);
        long r21 = 4;
        if (r2.mAdapter.hasStableIds() == false) goto L170;
        long r132 = r2.mAdapter.getItemId(r118);
        int r95 = r82.size() - 1;
    L140:
        if (r95 < 0) goto L156;
        long r24 = 0;
        AbstractC1166o r15 = (AbstractC1166o) r82.get(r95);
        if (r15.getItemId() == r132) goto L144;
    L154:
        boolean r16 = r6;
    L155:
        r95 = r95 - 1;
        r6 = r16;
        goto L140
    L144:
        if (r15.wasReturnedFromScrap() == true) goto L154;
        r16 = r6;
        if (r124 == r15.getItemViewType()) goto L147;
        r82.remove(r95);
        r2.removeDetachedView(r15.itemView, false);
        AbstractC1166o r62 = RecyclerView.getChildViewHolderInt(r15.itemView);
        r62.mScrapContainer = null;
        r62.mInChangeScrap = false;
        r62.clearReturnedFromScrapFlag();
        m2264k(r62);
        goto L155
    L147:
        r15.addFlags(32);
        if (r15.isRemoved() == true) goto L150;
    L152:
        r9 = r15;
    L168:
        if (r9 == null) goto L171;
        r9.mPosition = r118;
        r33 = r16;
    L171:
        if (r9 != null) goto L190;
        int r4 = RecyclerView.HORIZONTAL;
        C2646vv r42 = (C2646vv) m2257c().f9256a.get(r124);
        if (r42 == null) goto L182;
        ArrayList r43 = r42.f9158a;
        if (r43.isEmpty() == true) goto L182;
        int r63 = r43.size() - 1;
    L177:
        if (r63 < 0) goto L182;
        if (((AbstractC1166o) r43.get(r63)).isAttachedToTransitionOverlay() == false) goto L180;
        r63 = r63 - 1;
        goto L177
    L180:
        AbstractC1166o r44 = (AbstractC1166o) r43.remove(r63);
    L183:
        if (r44 == null) goto L189;
        r44.resetInternal();
        if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST == false) goto L189;
        View r64 = r44.itemView;
        if ((r64 instanceof ViewGroup) == false) goto L189;
        m2254e((ViewGroup) r64, false);
    L189:
        r9 = r44;
    L182:
        r44 = null;
    L190:
        if (r9 != null) goto L215;
        long r83 = r2.getNanoTime();
        if (r30 == Long.MAX_VALUE) goto L202;
        long r102 = this.f4045g.m5265a(r124).f9160c;
        if (r102 != r24) goto L196;
    L199:
        boolean r45 = r16;
    L200:
        if (r45 == true) goto L202;
        return null;
    L196:
        if ((r102 + r83) < r30) goto L199;
        r45 = false;
    L202:
        AbstractC1166o r46 = r2.mAdapter.createViewHolder(r2, r124);
        if (RecyclerView.ALLOW_THREAD_GAP_WORK == false) goto L207;
        RecyclerView r65 = RecyclerView.findNestedRecyclerView(r46.itemView);
        if (r65 == null) goto L207;
        r46.mNestedRecyclerView = new WeakReference(r65);
    L207:
        long r103 = r2.getNanoTime() - r83;
        C2646vv r66 = this.f4045g.m5265a(r124);
        long r84 = r66.f9160c;
        if (r84 == r24) goto L211;
        r103 = (r103 / 4) + ((r84 / 4) * 3);
    L211:
        r66.f9160c = r103;
        r9 = r46;
    L215:
        if (r33 == false) goto L224;
        if (r2.mState.f82g == true) goto L224;
        if (r9.hasAnyOfTheFlags(8192) == false) goto L224;
        r9.setFlags(0, 8192);
        if (r2.mState.f85j == false) goto L224;
        AbstractC1159h.m2245b(r9);
        AbstractC1159h r47 = r2.mItemAnimator;
        r9.getUnmodifiedPayloads();
        r47.getClass();
        C2208lv r48 = new C2208lv();
        r48.m4444a(r9);
        r2.recordAnimationInfoIfBouncedHiddenView(r9, r48);
    L224:
        if (r2.mState.f82g == false) goto L229;
        if (r9.isBound() == false) goto L229;
        r9.mPreLayoutPosition = r29;
    L235:
        Object[] r1 = null;
        boolean r67 = r16;
    L287:
        ViewGroup.LayoutParams r49 = r9.itemView.getLayoutParams();
        if (r49 != null) goto L291;
        C2431qv r22 = (C2431qv) r2.generateDefaultLayoutParams();
        r9.itemView.setLayoutParams(r22);
    L294:
        r22.f8526a = r9;
        if (r33 == false) goto L298;
        if (r1 == null) goto L298;
    L299:
        r22.f8529d = r67;
        return r9;
    L298:
        r67 = false;
        goto L299
    L291:
        if (r2.checkLayoutParams(r49) == true) goto L293;
        r22 = (C2431qv) r2.generateLayoutParams(r49);
        r9.itemView.setLayoutParams(r22);
        goto L294
    L293:
        r22 = (C2431qv) r49;
    L229:
        if (r9.isBound() == false) goto L237;
        if (r9.needsUpdate() == true) goto L237;
        if (r9.isInvalid() == false) goto L235;
    L237:
        if (RecyclerView.sDebugAssertionsEnabled == true) goto L239;
    L243:
        int r410 = r2.mAdapterHelper.m2221f(r29, 0);
        r9.mBindingAdapter = null;
        r9.mOwnerRecyclerView = r2;
        int r68 = r9.getItemViewType();
        long r104 = r2.getNanoTime();
        if (r30 == Long.MAX_VALUE) goto L250;
        long r125 = this.f4045g.m5265a(r68).f9161d;
        if (r125 == r24) goto L250;
        if ((r125 + r104) >= r30) goto L235;
    L250:
        if (r9.isTmpDetached() == false) goto L252;
        RecyclerView.access$300(r2, r9.itemView, r2.getChildCount(), r9.itemView.getLayoutParams());
        boolean r69 = r16;
    L253:
        r2.mAdapter.bindViewHolder(r9, r410);
        if (r69 == false) goto L256;
        RecyclerView.access$400(r2, r9.itemView);
    L256:
        long r126 = r2.getNanoTime() - r104;
        C2646vv r411 = this.f4045g.m5265a(r9.getItemViewType());
        long r105 = r411.f9161d;
        if (r105 == r24) goto L260;
        r126 = (r126 / r21) + ((r105 / r21) * r19);
    L260:
        r411.f9161d = r126;
        if (r2.isAccessibilityEnabled() == false) goto L282;
        View r412 = r9.itemView;
        WeakHashMap r610 = AbstractC2185lE.f7617a;
        if (r412.getImportantForAccessibility() != 0) goto L265;
        r67 = r16;
        r412.setImportantForAccessibility(r67 ? 1 : 0);
    L266:
        C0210Ev r85 = r2.mAccessibilityDelegate;
        if (r85 == null) goto L284;
        C0167Dv r86 = r85.f617e;
        if (r86 == null) goto L281;
        View.AccessibilityDelegate r106 = AbstractC2185lE.m4390c(r412);
        if (r106 != null) goto L275;
    L278:
        if (r5 == null) goto L281;
        if (r5 == r86) goto L281;
        r86.f449e.put(r412, r5);
        goto L281
    L275:
        if ((r106 instanceof C0602O) == false) goto L277;
        r5 = ((C0602O) r106).f1942a;
        goto L278
    L277:
        r5 = new C0645P(r106);
    L281:
        AbstractC2185lE.m4399l(r412, r86);
    L284:
        if (r2.mState.f82g == false) goto L286;
        r9.mPreLayoutPosition = r29;
    L286:
        r1 = r67 ? 1 : 0;
        goto L287
    L265:
        r67 = r16;
        goto L266
    L282:
        r67 = r16;
        goto L284
    L252:
        r69 = false;
        goto L253
    L239:
        if (r9.isRemoved() == false) goto L243;
        StringBuilder r36 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
        r36.append(r9);
        throw new IllegalStateException(AbstractC0213Ey.m406d(r2, r36));
    L150:
        if (r2.mState.f82g == true) goto L152;
        r15.setFlags(2, 14);
        goto L152
    L156:
        r16 = r6;
        r24 = 0;
        int r413 = r10.size() - 1;
    L157:
        if (r413 < 0) goto L166;
        AbstractC1166o r611 = (AbstractC1166o) r10.get(r413);
        if (r611.getItemId() != r132) goto L167;
        if (r611.isAttachedToTransitionOverlay() == true) goto L167;
        if (r124 != r611.getItemViewType()) goto L165;
        r10.remove(r413);
        r9 = r611;
        goto L168
    L165:
        m2262i(r413);
    L167:
        r413 = r413 - 1;
    L166:
        r9 = null;
        goto L168
    L170:
        r16 = true;
        r24 = 0;
    L213:
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + r29 + "(offset:" + r118 + ").state:" + r2.mState.m58b() + r2.exceptionLabel());
    L214:
        r16 = true;
        r19 = 3;
        r21 = 4;
        r24 = 0;
    L39:
        r33 = false;
    L20:
        r8 = r8 + 1;
        goto L14
    L22:
        if (r2.mAdapter.hasStableIds() == false) goto L35;
        int r87 = r2.mAdapterHelper.m2221f(r29, 0);
        if (r87 <= 0) goto L35;
        if (r87 >= r2.mAdapter.getItemCount()) goto L35;
        long r88 = r2.mAdapter.getItemId(r87);
        int r107 = 0;
    L28:
        if (r107 >= r32) goto L35;
        AbstractC1166o r119 = (AbstractC1166o) this.f4040b.get(r107);
        if (r119.wasReturnedFromScrap() == true) goto L34;
        if (r119.getItemId() != r88) goto L34;
        r119.addFlags(32);
        r9 = r119;
    L34:
        r107 = r107 + 1;
    L35:
        r9 = null;
        goto L36
    L38:
        r9 = null;
    L302:
        throw new IndexOutOfBoundsException("Invalid item position " + r29 + "(" + r29 + "). Item count:" + r2.mState.m58b() + r2.exceptionLabel());
    }

    /* JADX INFO: renamed from: n */
    public final void m2267n(AbstractC1166o r2) {
        if (r2.mInChangeScrap == false) goto L5;
        this.f4040b.remove(r2);
    L6:
        r2.mScrapContainer = null;
        r2.mInChangeScrap = false;
        r2.clearReturnedFromScrapFlag();
        return;
    L5:
        this.f4039a.remove(r2);
        goto L6
    }

    /* JADX INFO: renamed from: o */
    public final void m2268o() {
        AbstractC1160i r0 = this.f4046h.mLayout;
        if (r0 == null) goto L5;
        int r02 = r0.mPrefetchMaxCountObserved;
    L6:
        this.f4044f = this.f4043e + r02;
        ArrayList r03 = this.f4041c;
        int r1 = r03.size() - 1;
    L7:
        if (r1 < 0) goto L11;
        if (r03.size() <= this.f4044f) goto L14;
        m2262i(r1);
        r1 = r1 - 1;
        goto L7
    L14:
        return;
    L11:
        return;
    L5:
        r02 = 0;
        goto L6
    }
}
