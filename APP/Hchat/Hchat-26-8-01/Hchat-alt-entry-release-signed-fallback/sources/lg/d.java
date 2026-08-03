package lg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends lg.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final lg.d f8049j = null;

    static {
            lg.d r0 = new lg.d
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r1)
            lg.d.f8049j = r0
            return
    }

    @Override // lg.b
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof lg.d
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            lg.d r0 = (lg.d) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            lg.d r3 = (lg.d) r3
            int r0 = r3.f8042g
            int r1 = r2.f8042g
            if (r1 != r0) goto L23
            int r0 = r2.f8043h
            int r3 = r3.f8043h
            if (r0 != r3) goto L23
        L21:
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    @Override // lg.b
    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.f8042g
            int r0 = r0 * 31
            int r1 = r2.f8043h
            int r0 = r0 + r1
            return r0
    }

    @Override // lg.b
    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.f8042g
            int r1 = r2.f8043h
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // lg.b
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f8042g
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.f8043h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
