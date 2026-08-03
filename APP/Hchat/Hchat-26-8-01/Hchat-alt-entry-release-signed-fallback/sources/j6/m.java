package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements java.util.Map.Entry {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j6.m f6742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j6.m f6743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j6.m f6744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j6.m f6745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j6.m f6746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f6747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Object f6749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6750o;

    public m(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6747l = r0
            r1.f6748m = r2
            r1.f6746k = r1
            r1.f6745j = r1
            return
    }

    public m(boolean r1, j6.m r2, java.lang.Object r3, j6.m r4, j6.m r5) {
            r0 = this;
            r0.<init>()
            r0.f6742g = r2
            r0.f6747l = r3
            r0.f6748m = r1
            r1 = 1
            r0.f6750o = r1
            r0.f6745j = r4
            r0.f6746k = r5
            r5.f6745j = r0
            r4.f6746k = r0
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L33
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.f6747l
            if (r0 != 0) goto L12
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L33
            goto L1c
        L12:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L33
        L1c:
            java.lang.Object r0 = r3.f6749n
            if (r0 != 0) goto L27
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L33
            goto L31
        L27:
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L33
        L31:
            r4 = 1
            return r4
        L33:
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.f6747l
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.f6749n
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f6747l
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            java.lang.Object r2 = r3.f6749n
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r0 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto Le
            boolean r0 = r1.f6748m
            if (r0 == 0) goto L7
            goto Le
        L7:
            java.lang.String r2 = "value == null"
            bsh.j.c(r2)
            r2 = 0
            return r2
        Le:
            java.lang.Object r0 = r1.f6749n
            r1.f6749n = r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f6747l
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r1 = r2.f6749n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
