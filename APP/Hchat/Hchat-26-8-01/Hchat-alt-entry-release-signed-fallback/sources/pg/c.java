package pg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum c extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final pg.c f10559h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final pg.c f10560i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pg.c[] f10561j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f10562g;

    static {
            pg.c r0 = new pg.c
            r1 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.String r3 = "NANOSECONDS"
            r0.<init>(r3, r1, r2)
            pg.c.f10559h = r0
            pg.c r1 = new pg.c
            r2 = 1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.String r4 = "MICROSECONDS"
            r1.<init>(r4, r2, r3)
            pg.c r2 = new pg.c
            r3 = 2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r5 = "MILLISECONDS"
            r2.<init>(r5, r3, r4)
            pg.c.f10560i = r2
            pg.c r3 = new pg.c
            r4 = 3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r6 = "SECONDS"
            r3.<init>(r6, r4, r5)
            pg.c r4 = new pg.c
            r5 = 4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r7 = "MINUTES"
            r4.<init>(r7, r5, r6)
            pg.c r5 = new pg.c
            r6 = 5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.HOURS
            java.lang.String r8 = "HOURS"
            r5.<init>(r8, r6, r7)
            pg.c r6 = new pg.c
            r7 = 6
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            java.lang.String r9 = "DAYS"
            r6.<init>(r9, r7, r8)
            pg.c[] r0 = new pg.c[]{r0, r1, r2, r3, r4, r5, r6}
            pg.c.f10561j = r0
            return
    }

    c(java.lang.String r1, int r2, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f10562g = r3
            return
    }

    public static pg.c valueOf(java.lang.String r1) {
            java.lang.Class<pg.c> r0 = pg.c.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            pg.c r1 = (pg.c) r1
            return r1
    }

    public static pg.c[] values() {
            pg.c[] r0 = pg.c.f10561j
            java.lang.Object r0 = r0.clone()
            pg.c[] r0 = (pg.c[]) r0
            return r0
    }
}
