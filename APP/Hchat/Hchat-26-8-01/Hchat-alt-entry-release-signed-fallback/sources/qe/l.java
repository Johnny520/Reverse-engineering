package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum l extends java.lang.Enum {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qe.l f10964g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qe.l f10965h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qe.l f10966i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qe.l f10967j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final qe.l f10968k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final qe.l f10969l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final qe.l f10970m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qe.l f10971n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ qe.l[] f10972o = null;

    static {
            qe.l r0 = new qe.l
            java.lang.String r1 = "EQUAL"
            r2 = 0
            r0.<init>(r1, r2)
            qe.l.f10964g = r0
            qe.l r1 = new qe.l
            java.lang.String r2 = "NARROW"
            r3 = 1
            r1.<init>(r2, r3)
            qe.l.f10965h = r1
            qe.l r2 = new qe.l
            java.lang.String r3 = "NARROW_BY_GENERIC"
            r4 = 2
            r2.<init>(r3, r4)
            qe.l.f10966i = r2
            qe.l r3 = new qe.l
            java.lang.String r4 = "WIDER"
            r5 = 3
            r3.<init>(r4, r5)
            qe.l.f10967j = r3
            qe.l r4 = new qe.l
            java.lang.String r5 = "WIDER_BY_GENERIC"
            r6 = 4
            r4.<init>(r5, r6)
            qe.l.f10968k = r4
            qe.l r5 = new qe.l
            java.lang.String r6 = "CONFLICT"
            r7 = 5
            r5.<init>(r6, r7)
            qe.l.f10969l = r5
            qe.l r6 = new qe.l
            java.lang.String r7 = "CONFLICT_BY_GENERIC"
            r8 = 6
            r6.<init>(r7, r8)
            qe.l.f10970m = r6
            qe.l r7 = new qe.l
            java.lang.String r8 = "UNKNOWN"
            r9 = 7
            r7.<init>(r8, r9)
            qe.l.f10971n = r7
            qe.l[] r0 = new qe.l[]{r0, r1, r2, r3, r4, r5, r6, r7}
            qe.l.f10972o = r0
            return
    }

    public static qe.l valueOf(java.lang.String r1) {
            java.lang.Class<qe.l> r0 = qe.l.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qe.l r1 = (qe.l) r1
            return r1
    }

    public static qe.l[] values() {
            qe.l[] r0 = qe.l.f10972o
            java.lang.Object r0 = r0.clone()
            qe.l[] r0 = (qe.l[]) r0
            return r0
    }

    public final qe.l a() {
            r2 = this;
            int r0 = r2.ordinal()
            r1 = 1
            if (r0 == r1) goto L1a
            r1 = 2
            if (r0 == r1) goto L17
            r1 = 3
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L11
            return r2
        L11:
            qe.l r0 = qe.l.f10966i
            return r0
        L14:
            qe.l r0 = qe.l.f10965h
            return r0
        L17:
            qe.l r0 = qe.l.f10968k
            return r0
        L1a:
            qe.l r0 = qe.l.f10967j
            return r0
    }

    public final boolean b() {
            r1 = this;
            qe.l r0 = qe.l.f10964g
            if (r1 != r0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean c() {
            r1 = this;
            qe.l r0 = qe.l.f10965h
            if (r1 == r0) goto Lb
            qe.l r0 = qe.l.f10966i
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public final boolean d() {
            r1 = this;
            qe.l r0 = qe.l.f10967j
            if (r1 == r0) goto Lb
            qe.l r0 = qe.l.f10968k
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }
}
