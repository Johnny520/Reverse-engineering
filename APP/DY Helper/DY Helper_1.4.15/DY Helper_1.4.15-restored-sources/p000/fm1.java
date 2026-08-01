package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f4020;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f4021;

    /* JADX INFO: renamed from: γ */
    public int f4022;

    /* JADX INFO: renamed from: δ */
    public int f4023;

    /* JADX INFO: renamed from: ε */
    public p000.em1 f4024;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f4025;

    public fm1(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.<init>()
            r1.f4025 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4020 = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f4021 = r0
            java.util.Collections.unmodifiableList(r2)
            r2 = 2
            r1.f4022 = r2
            r1.f4023 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.em1 m2148() {
            r2 = this;
            em1 r0 = r2.f4024
            if (r0 != 0) goto L20
            em1 r0 = new em1
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f3594 = r1
            r1 = 0
            r0.f3595 = r1
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.f3596 = r1
            r2.f4024 = r0
        L20:
            em1 r2 = r2.f4024
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final void m2149(boolean r3) {
            r2 = this;
            em1 r2 = r2.f4024
            if (r2 == 0) goto L2b
            android.util.SparseArray r0 = r2.f3594
            java.util.Set r2 = r2.f3596
            r1 = 0
            r2.remove(r1)
            int r2 = r2.size()
            if (r2 != 0) goto L2b
            if (r3 != 0) goto L2b
            int r2 = r0.size()
            if (r2 > 0) goto L1b
            goto L2b
        L1b:
            r2 = 0
            int r2 = r0.keyAt(r2)
            java.lang.Object r2 = r0.get(r2)
            dm1 r2 = (p000.dm1) r2
            r2.getClass()
            r2 = 0
            throw r2
        L2b:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m2150() {
            r2 = this;
            java.util.ArrayList r0 = r2.f4021
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L1c
            r0.clear()
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f1122
            if (r0 == 0) goto L1b
            androidx.recyclerview.widget.RecyclerView r2 = r2.f4025
            b90 r2 = r2.f1173
            r2.getClass()
            r0 = 0
            r2.f1567 = r0
        L1b:
            return
        L1c:
            r2.m2151(r1)
            r2 = 0
            throw r2
    }

    /* JADX INFO: renamed from: δ */
    public final void m2151(int r4) {
            r3 = this;
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f1119
            java.lang.String r1 = "RecyclerView"
            if (r0 == 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Recycling cached view at index "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L17:
            java.util.ArrayList r3 = r3.f4021
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L2a
            boolean r3 = androidx.recyclerview.widget.RecyclerView.f1119
            if (r3 == 0) goto L28
            java.lang.String r3 = "CachedViewHolder to be recycled: null"
            android.util.Log.d(r1, r3)
        L28:
            r3 = 0
            throw r3
        L2a:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ε */
    public final void m2152(int r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.f4025
            km1 r1 = r0.f1174
            if (r7 < 0) goto L6b
            int r2 = r1.m3336()
            if (r7 >= r2) goto L6b
            boolean r2 = r1.f6030
            java.util.ArrayList r2 = r6.f4020
            int r3 = r2.size()
            r4 = 0
            if (r3 > 0) goto L66
            m6 r2 = r0.f1154
            java.lang.Object r2 = r2.f6969
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r5 = 0
            if (r3 > 0) goto L5c
            java.util.ArrayList r6 = r6.f4021
            int r2 = r6.size()
            if (r2 > 0) goto L57
            m6 r6 = r0.f1153
            int r6 = r6.m3785(r7, r4)
            if (r6 < 0) goto L35
            throw r5
        L35:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "(offset:"
            java.lang.String r4 = ").state:"
            java.lang.String r5 = "Inconsistency detected. Invalid item position "
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4136(r5, r7, r3, r6, r4)
            int r7 = r1.m3336()
            r6.append(r7)
            java.lang.String r7 = r0.m528()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6)
            throw r2
        L57:
            java.lang.ClassCastException r6 = p000.lz1.m3685(r4, r6)
            throw r6
        L5c:
            java.lang.Object r6 = r2.get(r4)
            android.view.View r6 = (android.view.View) r6
            androidx.recyclerview.widget.RecyclerView.m507(r6)
            throw r5
        L66:
            java.lang.ClassCastException r6 = p000.lz1.m3685(r4, r2)
            throw r6
        L6b:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "("
            java.lang.String r3 = "). Item count:"
            java.lang.String r4 = "Invalid item position "
            java.lang.StringBuilder r7 = p000.AbstractC0602nx.m4136(r4, r7, r2, r7, r3)
            int r1 = r1.m3336()
            r7.append(r1)
            java.lang.String r0 = r0.m528()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ζ */
    public final void m2153() {
            r3 = this;
            int r0 = r3.f4022
            r3.f4023 = r0
            java.util.ArrayList r0 = r3.f4021
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L1c
            int r0 = r0.size()
            int r2 = r3.f4023
            if (r0 > r2) goto L17
            goto L1c
        L17:
            r3.m2151(r1)
            r3 = 0
            throw r3
        L1c:
            return
    }
}
