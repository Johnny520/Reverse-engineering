package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class cx0 implements java.util.Map.Entry, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2792;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f2793;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f2794;

    public /* synthetic */ cx0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2792 = r2
            r0.f2793 = r1
            r0.f2794 = r3
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2792
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.equals(r3)
            return r2
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
            java.lang.Object r1 = r2.f2793
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L30
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r2 = r2.getValue()
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            int r0 = r1.f2792
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f2793
            return r1
        L8:
            java.lang.Object r1 = r1.f2793
            return r1
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
            r1 = this;
            int r0 = r1.f2792
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f2794
            return r1
        L8:
            java.lang.Object r1 = r1.f2794
            return r1
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r2 = this;
            int r0 = r2.f2792
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super.hashCode()
            return r2
        La:
            r0 = 0
            java.lang.Object r1 = r2.f2793
            if (r1 == 0) goto L14
            int r1 = r1.hashCode()
            goto L15
        L14:
            r1 = r0
        L15:
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L1f
            int r0 = r2.hashCode()
        L1f:
            r2 = r1 ^ r0
            return r2
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f2792
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2792
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f2793
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
