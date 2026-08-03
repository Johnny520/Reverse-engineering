package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum b extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v7.b f14145h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v7.b[] f14146i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v7.b[] f14147j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14148g;

    static {
            v7.b r0 = new v7.b
            r1 = 0
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.String r3 = "FORMATS"
            r0.<init>(r3, r1, r2)
            v7.b.f14145h = r0
            v7.b r1 = new v7.b
            r2 = 1
            r3 = 16777217(0x1000001, float:2.350989E-38)
            java.lang.String r4 = "MIN"
            r1.<init>(r4, r2, r3)
            v7.b r2 = new v7.b
            r3 = 2
            r4 = 16777218(0x1000002, float:2.3509893E-38)
            java.lang.String r5 = "MAX"
            r2.<init>(r5, r3, r4)
            v7.b r3 = new v7.b
            r4 = 3
            r5 = 16777219(0x1000003, float:2.3509895E-38)
            java.lang.String r6 = "L10N"
            r3.<init>(r6, r4, r5)
            v7.b r4 = new v7.b
            r5 = 4
            r6 = 16777220(0x1000004, float:2.3509898E-38)
            java.lang.String r7 = "OTHER"
            r4.<init>(r7, r5, r6)
            v7.b r5 = new v7.b
            r6 = 5
            r7 = 16777221(0x1000005, float:2.35099E-38)
            java.lang.String r8 = "ZERO"
            r5.<init>(r8, r6, r7)
            v7.b r6 = new v7.b
            r7 = 6
            r8 = 16777222(0x1000006, float:2.3509904E-38)
            java.lang.String r9 = "ONE"
            r6.<init>(r9, r7, r8)
            v7.b r7 = new v7.b
            r8 = 7
            r9 = 16777223(0x1000007, float:2.3509907E-38)
            java.lang.String r10 = "TWO"
            r7.<init>(r10, r8, r9)
            v7.b r8 = new v7.b
            r9 = 8
            r10 = 16777224(0x1000008, float:2.350991E-38)
            java.lang.String r11 = "FEW"
            r8.<init>(r11, r9, r10)
            v7.b r9 = new v7.b
            r10 = 9
            r11 = 16777225(0x1000009, float:2.3509912E-38)
            java.lang.String r12 = "MANY"
            r9.<init>(r12, r10, r11)
            v7.b[] r0 = new v7.b[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            v7.b.f14147j = r0
            v7.b[] r0 = values()
            v7.b.f14146i = r0
            return
    }

    b(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f14148g = r3
            return
    }

    public static v7.b valueOf(java.lang.String r1) {
            java.lang.Class<v7.b> r0 = v7.b.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            v7.b r1 = (v7.b) r1
            return r1
    }

    public static v7.b[] values() {
            v7.b[] r0 = v7.b.f14147j
            java.lang.Object r0 = r0.clone()
            v7.b[] r0 = (v7.b[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name()
            java.lang.String r0 = y7.a.q(r0)
            return r0
    }
}
