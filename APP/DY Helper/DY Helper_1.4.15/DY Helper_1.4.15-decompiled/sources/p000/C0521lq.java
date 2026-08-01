package p000;

/* JADX INFO: renamed from: lq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0521lq {

    /* JADX INFO: renamed from: α */
    public final long f6731;

    /* JADX INFO: renamed from: β */
    public final java.lang.ref.WeakReference f6732;

    /* JADX INFO: renamed from: γ */
    public final java.lang.ref.WeakReference f6733;

    /* JADX INFO: renamed from: δ */
    public final java.lang.ref.WeakReference f6734;

    /* JADX INFO: renamed from: ε */
    public final p000.C0558mq f6735;

    public C0521lq(long r1, java.lang.ref.WeakReference r3, java.lang.ref.WeakReference r4, java.lang.ref.WeakReference r5, p000.C0558mq r6) {
            r0 = this;
            r0.<init>()
            r0.f6731 = r1
            r0.f6732 = r3
            r0.f6733 = r4
            r0.f6734 = r5
            r0.f6735 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L40
        L3:
            boolean r0 = r5 instanceof p000.C0521lq
            if (r0 != 0) goto L8
            goto L3e
        L8:
            lq r5 = (p000.C0521lq) r5
            long r0 = r4.f6731
            long r2 = r5.f6731
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L3e
        L13:
            java.lang.ref.WeakReference r0 = r4.f6732
            java.lang.ref.WeakReference r1 = r5.f6732
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L3e
        L1e:
            java.lang.ref.WeakReference r0 = r4.f6733
            java.lang.ref.WeakReference r1 = r5.f6733
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L3e
        L29:
            java.lang.ref.WeakReference r0 = r4.f6734
            java.lang.ref.WeakReference r1 = r5.f6734
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L34
            goto L3e
        L34:
            mq r4 = r4.f6735
            mq r5 = r5.f6735
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L40
        L3e:
            r4 = 0
            return r4
        L40:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f6731
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.ref.WeakReference r1 = r2.f6732
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.ref.WeakReference r0 = r2.f6733
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.ref.WeakReference r1 = r2.f6734
            if (r1 != 0) goto L20
            r1 = 0
            goto L24
        L20:
            int r1 = r1.hashCode()
        L24:
            int r0 = r0 + r1
            int r0 = r0 * 31
            mq r2 = r2.f6735
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State(generation="
            r0.<init>(r1)
            long r1 = r3.f6731
            r0.append(r1)
            java.lang.String r1 = ", holderRef="
            r0.append(r1)
            java.lang.ref.WeakReference r1 = r3.f6732
            r0.append(r1)
            java.lang.String r1 = ", awemeRef="
            r0.append(r1)
            java.lang.ref.WeakReference r1 = r3.f6733
            r0.append(r1)
            java.lang.String r1 = ", itemViewRef="
            r0.append(r1)
            java.lang.ref.WeakReference r1 = r3.f6734
            r0.append(r1)
            java.lang.String r1 = ", summary="
            r0.append(r1)
            mq r3 = r3.f6735
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
