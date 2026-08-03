package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC1516hv;
import p000.AbstractC2185lE;
import p000.AbstractC2792zB;
import p000.C1472gv;
import p000.C2431qv;
import p000.EnumC1428fv;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1158g {
    private boolean mHasStableIds;
    private final C1472gv mObservable;
    private EnumC1428fv mStateRestorationPolicy;

    public AbstractC1158g() {
        this.mObservable = new C1472gv();
        this.mHasStableIds = false;
        this.mStateRestorationPolicy = EnumC1428fv.f5030a;
    }

    public final void bindViewHolder(AbstractC1166o r5, int r6) {
        if (r5.mBindingAdapter != null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        r5.mPosition = r6;
        if (hasStableIds() == false) goto L10;
        r5.mItemId = getItemId(r6);
    L10:
        r5.setFlags(1, 519);
        int r2 = AbstractC2792zB.f9460a;
        Trace.beginSection("RV OnBindView");
    L11:
        r5.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled == true) goto L14;
    L27:
        onBindViewHolder(r5, r6, r5.getUnmodifiedPayloads());
        if (r0 == false) goto L34;
        r5.clearPayload();
        ViewGroup.LayoutParams r52 = r5.itemView.getLayoutParams();
        if ((r52 instanceof C2431qv) == false) goto L32;
        ((C2431qv) r52).f8528c = true;
    L32:
        int r53 = AbstractC2792zB.f9460a;
        Trace.endSection();
        return;
    L34:
        return;
    L14:
        if (r5.itemView.getParent() != null) goto L21;
        View r22 = r5.itemView;
        WeakHashMap r3 = AbstractC2185lE.f7617a;
        if (r22.isAttachedToWindow() == r5.isTmpDetached()) goto L21;
        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + r5.isTmpDetached() + ", attached to window: " + r5.itemView.isAttachedToWindow() + ", holder: " + r5);
    L21:
        if (r5.itemView.getParent() != null) goto L27;
        View r23 = r5.itemView;
        WeakHashMap r32 = AbstractC2185lE.f7617a;
        if (r23.isAttachedToWindow() == false) goto L27;
        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + r5);
    L5:
        r0 = false;
        goto L6
    }

    public boolean canRestoreState() {
        int r0 = this.mStateRestorationPolicy.ordinal();
        if (r0 == 1) goto L8;
        if (r0 != 2) goto L9;
        return false;
    L9:
        return true;
    L8:
        if (getItemCount() > 0) goto L9;
        return false;
    }

    public final AbstractC1166o createViewHolder(ViewGroup r3, int r4) {
        int r1 = AbstractC2792zB.f9460a;     // Catch: Throwable -> L7
        Trace.beginSection("RV CreateView");     // Catch: Throwable -> L7
        AbstractC1166o r32 = onCreateViewHolder(r3, r4);     // Catch: Throwable -> L7
        if (r32.itemView.getParent() != null) goto L10;
        r32.mItemViewType = r4;     // Catch: Throwable -> L7
        Trace.endSection();
        return r32;
    L10:
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        int r42 = AbstractC2792zB.f9460a;
        Trace.endSection();
        throw th;
    }

    public int findRelativeAdapterPositionIn(AbstractC1158g r1, AbstractC1166o r2, int r3) {
        if (r1 != this) goto L4;
        return r3;
    L4:
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int r3) {
        return -1;
    }

    public int getItemViewType(int r1) {
        return 0;
    }

    public final EnumC1428fv getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.m2824a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.m2825b();
    }

    public final void notifyItemChanged(int r4) {
        this.mObservable.m2827d(r4, 1, null);
    }

    public final void notifyItemInserted(int r3) {
        this.mObservable.m2828e(r3, 1);
    }

    public final void notifyItemMoved(int r2, int r3) {
        this.mObservable.m2826c(r2, r3);
    }

    public final void notifyItemRangeChanged(int r3, int r4) {
        this.mObservable.m2827d(r3, r4, null);
    }

    public final void notifyItemRangeInserted(int r2, int r3) {
        this.mObservable.m2828e(r2, r3);
    }

    public final void notifyItemRangeRemoved(int r2, int r3) {
        this.mObservable.m2829f(r2, r3);
    }

    public final void notifyItemRemoved(int r3) {
        this.mObservable.m2829f(r3, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView r1) {
    }

    public abstract void onBindViewHolder(AbstractC1166o r1, int r2);

    public void onBindViewHolder(AbstractC1166o r1, int r2, List<Object> r3) {
        onBindViewHolder(r1, r2);
    }

    public abstract AbstractC1166o onCreateViewHolder(ViewGroup r1, int r2);

    public void onDetachedFromRecyclerView(RecyclerView r1) {
    }

    public boolean onFailedToRecycleView(AbstractC1166o r1) {
        return false;
    }

    public void onViewAttachedToWindow(AbstractC1166o r1) {
    }

    public void onViewDetachedFromWindow(AbstractC1166o r1) {
    }

    public void onViewRecycled(AbstractC1166o r1) {
    }

    public void registerAdapterDataObserver(AbstractC1516hv r2) {
        this.mObservable.registerObserver(r2);
    }

    public void setHasStableIds(boolean r2) {
        if (hasObservers() == true) goto L7;
        this.mHasStableIds = r2;
        return;
    L7:
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(EnumC1428fv r1) {
        this.mStateRestorationPolicy = r1;
        this.mObservable.m2830g();
    }

    public void unregisterAdapterDataObserver(AbstractC1516hv r2) {
        this.mObservable.unregisterObserver(r2);
    }

    public final void notifyItemChanged(int r3, Object r4) {
        this.mObservable.m2827d(r3, 1, r4);
    }

    public final void notifyItemRangeChanged(int r2, int r3, Object r4) {
        this.mObservable.m2827d(r2, r3, r4);
    }
}
