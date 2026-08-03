package z3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z3.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.util.SparseIntArray f22523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Parcel f22524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f22527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22530k;

    public c(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            f.e r5 = new f.e
            r5.<init>()
            f.e r6 = new f.e
            r6.<init>()
            f.e r7 = new f.e
            r7.<init>()
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public c(android.os.Parcel r1, int r2, int r3, java.lang.String r4, f.e r5, f.e r6, f.e r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.f22523d = r5
            r5 = -1
            r0.f22528i = r5
            r0.f22530k = r5
            r0.f22524e = r1
            r0.f22525f = r2
            r0.f22526g = r3
            r0.f22529j = r2
            r0.f22527h = r4
            return
    }

    @Override // z3.b
    public final z3.c a() {
            r8 = this;
            z3.c r0 = new z3.c
            android.os.Parcel r1 = r8.f22524e
            int r2 = r1.dataPosition()
            int r3 = r8.f22529j
            int r4 = r8.f22525f
            if (r3 != r4) goto L10
            int r3 = r8.f22526g
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.f22527h
            java.lang.String r6 = "  "
            java.lang.String r4 = eh.a.r(r4, r5, r6)
            f.e r6 = r8.f22521b
            f.e r7 = r8.f22522c
            f.e r5 = r8.f22520a
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // z3.b
    public final boolean e(int r4) {
            r3 = this;
        L0:
            int r0 = r3.f22529j
            int r1 = r3.f22530k
            int r2 = r3.f22526g
            if (r0 >= r2) goto L31
            if (r1 != r4) goto Lb
            goto L33
        Lb:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1a
            goto L35
        L1a:
            int r0 = r3.f22529j
            android.os.Parcel r1 = r3.f22524e
            r1.setDataPosition(r0)
            int r0 = r1.readInt()
            int r1 = r1.readInt()
            r3.f22530k = r1
            int r1 = r3.f22529j
            int r1 = r1 + r0
            r3.f22529j = r1
            goto L0
        L31:
            if (r1 != r4) goto L35
        L33:
            r4 = 1
            return r4
        L35:
            r4 = 0
            return r4
    }

    @Override // z3.b
    public final void h(int r6) {
            r5 = this;
            int r0 = r5.f22528i
            android.util.SparseIntArray r1 = r5.f22523d
            android.os.Parcel r2 = r5.f22524e
            if (r0 < 0) goto L1b
            int r0 = r1.get(r0)
            int r3 = r2.dataPosition()
            int r4 = r3 - r0
            r2.setDataPosition(r0)
            r2.writeInt(r4)
            r2.setDataPosition(r3)
        L1b:
            r5.f22528i = r6
            int r0 = r2.dataPosition()
            r1.put(r6, r0)
            r0 = 0
            r2.writeInt(r0)
            r2.writeInt(r6)
            return
    }
}
