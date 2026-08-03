package f5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum c extends java.lang.Enum {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f5.c[] f3269j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f5.c[] f3270k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f3271l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f5.c[] f3272m = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3275i;

    static {
            f5.c r0 = new f5.c
            java.lang.String r4 = "whitelist"
            r5 = 0
            java.lang.String r1 = "WHITELIST"
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            f5.c r1 = new f5.c
            java.lang.String r5 = "greylist"
            r6 = 0
            java.lang.String r2 = "GREYLIST"
            r3 = 1
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            f5.c r2 = new f5.c
            java.lang.String r6 = "blacklist"
            r7 = 0
            java.lang.String r3 = "BLACKLIST"
            r4 = 2
            r5 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            f5.c r3 = new f5.c
            java.lang.String r7 = "greylist-max-o"
            r8 = 0
            java.lang.String r4 = "GREYLIST_MAX_O"
            r5 = 3
            r6 = 3
            r3.<init>(r4, r5, r6, r7, r8)
            f5.c r4 = new f5.c
            java.lang.String r8 = "greylist-max-p"
            r9 = 0
            java.lang.String r5 = "GREYLIST_MAX_P"
            r6 = 4
            r7 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            f5.c r5 = new f5.c
            java.lang.String r9 = "greylist-max-q"
            r10 = 0
            java.lang.String r6 = "GREYLIST_MAX_Q"
            r7 = 5
            r8 = 5
            r5.<init>(r6, r7, r8, r9, r10)
            f5.c r6 = new f5.c
            java.lang.String r10 = "greylist-max-r"
            r11 = 0
            java.lang.String r7 = "GREYLIST_MAX_R"
            r8 = 6
            r9 = 6
            r6.<init>(r7, r8, r9, r10, r11)
            f5.c r7 = new f5.c
            java.lang.String r11 = "core-platform-api"
            r12 = 1
            java.lang.String r8 = "CORE_PLATFORM_API"
            r9 = 7
            r10 = 8
            r7.<init>(r8, r9, r10, r11, r12)
            f5.c r8 = new f5.c
            java.lang.String r12 = "test-api"
            r13 = 1
            java.lang.String r9 = "TEST_API"
            r11 = 16
            r8.<init>(r9, r10, r11, r12, r13)
            f5.c[] r9 = new f5.c[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            f5.c.f3272m = r9
            f5.c[] r0 = new f5.c[]{r0, r1, r2, r3, r4, r5, r6}
            f5.c.f3269j = r0
            f5.c[] r0 = new f5.c[]{r7, r8}
            f5.c.f3270k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f5.c.f3271l = r0
            f5.c[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L8c:
            if (r2 >= r1) goto L9a
            r3 = r0[r2]
            java.util.HashMap r4 = f5.c.f3271l
            java.lang.String r5 = r3.f3274h
            r4.put(r5, r3)
            int r2 = r2 + 1
            goto L8c
        L9a:
            return
    }

    c(java.lang.String r1, int r2, int r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f3273g = r3
            r0.f3274h = r4
            r0.f3275i = r5
            return
    }

    public static java.util.Set a(int r6) {
            r0 = r6 & 7
            f5.c[] r1 = f5.c.f3269j
            r1 = r1[r0]
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = r6 & (-8)
            if (r3 != 0) goto L17
            r2.add(r1)
            java.util.Set r6 = java.util.Collections.unmodifiableSet(r2)
            return r6
        L17:
            r2.add(r1)
            r1 = 0
        L1b:
            r3 = 2
            if (r1 >= r3) goto L35
            f5.c[] r3 = f5.c.f3270k
            r3 = r3[r1]
            boolean r4 = r3.f3275i
            int r5 = r3.f3273g
            if (r4 == 0) goto L2d
            r4 = r6 & r5
            if (r4 == 0) goto L32
            goto L2f
        L2d:
            if (r0 != r5) goto L32
        L2f:
            r2.add(r3)
        L32:
            int r1 = r1 + 1
            goto L1b
        L35:
            java.util.Set r6 = java.util.Collections.unmodifiableSet(r2)
            return r6
    }

    public static f5.c valueOf(java.lang.String r1) {
            java.lang.Class<f5.c> r0 = f5.c.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            f5.c r1 = (f5.c) r1
            return r1
    }

    public static f5.c[] values() {
            f5.c[] r0 = f5.c.f3272m
            java.lang.Object r0 = r0.clone()
            f5.c[] r0 = (f5.c[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f3274h
            return r0
    }
}
