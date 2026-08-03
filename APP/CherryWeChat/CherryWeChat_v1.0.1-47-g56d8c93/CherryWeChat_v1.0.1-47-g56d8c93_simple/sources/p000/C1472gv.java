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
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC1516hv) ((Observable) this).mObservers.get(r0)).onChanged();
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: c */
    public final void m2826c(int r4, int r5) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC1516hv) ((Observable) this).mObservers.get(r0)).onItemRangeMoved(r4, r5, 1);
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: d */
    public final void m2827d(int r3, int r4, Object r5) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC1516hv) ((Observable) this).mObservers.get(r0)).onItemRangeChanged(r3, r4, r5);
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: e */
    public final void m2828e(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC1516hv) ((Observable) this).mObservers.get(r0)).onItemRangeInserted(r3, r4);
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: f */
    public final void m2829f(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC1516hv) ((Observable) this).mObservers.get(r0)).onItemRangeRemoved(r3, r4);
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: g */
    public final void m2830g() {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC1516hv) ((Observable) this).mObservers.get(r0)).onStateRestorationPolicyChanged();
        r0 = r0 - 1;
        goto L3
    }
}
