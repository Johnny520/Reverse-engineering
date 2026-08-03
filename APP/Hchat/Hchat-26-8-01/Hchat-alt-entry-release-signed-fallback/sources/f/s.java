package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class s implements java.util.Map.Entry, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f2897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f2898i;

    public /* synthetic */ s(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2896g = r2
            r0.f2897h = r1
            r0.f2898i = r3
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2896g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.equals(r3)
            return r3
        La:
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L11
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L30
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r2.f2897h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L30
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r0 = r2.getValue()
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            return r3
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            int r0 = r1.f2896g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2897h
            return r0
        L8:
            java.lang.Object r0 = r1.f2897h
            return r0
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
            r1 = this;
            int r0 = r1.f2896g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2898i
            return r0
        L8:
            java.lang.Object r0 = r1.f2898i
            return r0
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r3 = this;
            int r0 = r3.f2896g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r0 = super.hashCode()
            return r0
        La:
            r0 = 0
            java.lang.Object r1 = r3.f2897h
            if (r1 == 0) goto L14
            int r1 = r1.hashCode()
            goto L15
        L14:
            r1 = r0
        L15:
            java.lang.Object r2 = r3.getValue()
            if (r2 == 0) goto L1f
            int r0 = r2.hashCode()
        L1f:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.f2896g
            switch(r2) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        Ld:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2896g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f2897h
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r1 = r2.getValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
