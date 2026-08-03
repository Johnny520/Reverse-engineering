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
    private final C1472gv mObservable = new C1472gv();
    private boolean mHasStableIds = false;
    private EnumC1428fv mStateRestorationPolicy = EnumC1428fv.f5030a;

    public final void bindViewHolder(AbstractC1166o abstractC1166o, int i) {
        boolean z = abstractC1166o.mBindingAdapter == null;
        if (z) {
            abstractC1166o.mPosition = i;
            if (hasStableIds()) {
                abstractC1166o.mItemId = getItemId(i);
            }
            abstractC1166o.setFlags(1, 519);
            int i2 = AbstractC2792zB.f9460a;
            Trace.beginSection("RV OnBindView");
        }
        abstractC1166o.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (abstractC1166o.itemView.getParent() == null) {
                View view = abstractC1166o.itemView;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                if (view.isAttachedToWindow() != abstractC1166o.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC1166o.isTmpDetached() + ", attached to window: " + abstractC1166o.itemView.isAttachedToWindow() + ", holder: " + abstractC1166o);
                }
            }
            if (abstractC1166o.itemView.getParent() == null) {
                View view2 = abstractC1166o.itemView;
                WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC1166o);
                }
            }
        }
        onBindViewHolder(abstractC1166o, i, abstractC1166o.getUnmodifiedPayloads());
        if (z) {
            abstractC1166o.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC1166o.itemView.getLayoutParams();
            if (layoutParams instanceof C2431qv) {
                ((C2431qv) layoutParams).f8528c = true;
            }
            int i3 = AbstractC2792zB.f9460a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
        } else if (getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public final AbstractC1166o createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i2 = AbstractC2792zB.f9460a;
            Trace.beginSection("RV CreateView");
            AbstractC1166o abstractC1166oOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (abstractC1166oOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            abstractC1166oOnCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return abstractC1166oOnCreateViewHolder;
        } catch (Throwable th) {
            int i3 = AbstractC2792zB.f9460a;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(AbstractC1158g abstractC1158g, AbstractC1166o abstractC1166o, int i) {
        if (abstractC1158g == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
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

    public final void notifyItemChanged(int i) {
        this.mObservable.m2827d(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.m2828e(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.m2826c(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.m2827d(i, i2, null);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.m2828e(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.m2829f(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.m2829f(i, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(AbstractC1166o abstractC1166o, int i);

    public void onBindViewHolder(AbstractC1166o abstractC1166o, int i, List<Object> list) {
        onBindViewHolder(abstractC1166o, i);
    }

    public abstract AbstractC1166o onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(AbstractC1166o abstractC1166o) {
        return false;
    }

    public void onViewAttachedToWindow(AbstractC1166o abstractC1166o) {
    }

    public void onViewDetachedFromWindow(AbstractC1166o abstractC1166o) {
    }

    public void onViewRecycled(AbstractC1166o abstractC1166o) {
    }

    public void registerAdapterDataObserver(AbstractC1516hv abstractC1516hv) {
        this.mObservable.registerObserver(abstractC1516hv);
    }

    public void setHasStableIds(boolean z) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z;
    }

    public void setStateRestorationPolicy(EnumC1428fv enumC1428fv) {
        this.mStateRestorationPolicy = enumC1428fv;
        this.mObservable.m2830g();
    }

    public void unregisterAdapterDataObserver(AbstractC1516hv abstractC1516hv) {
        this.mObservable.unregisterObserver(abstractC1516hv);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.m2827d(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.m2827d(i, i2, obj);
    }
}
