package p000;

import android.database.Observable;

/* JADX INFO: renamed from: gv */
/* JADX INFO: loaded from: classes.dex */
public final class C1472gv extends Observable {
    /* JADX INFO: renamed from: a */
    public final boolean m2824a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final void m2825b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1516hv) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2826c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1516hv) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2827d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1516hv) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2828e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1516hv) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2829f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1516hv) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2830g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC1516hv) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }
}
