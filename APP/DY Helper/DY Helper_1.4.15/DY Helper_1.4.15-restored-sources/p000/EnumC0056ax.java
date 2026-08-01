package p000;

/* JADX INFO: renamed from: ax */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0056ax extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.EnumC0056ax f1353 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.EnumC0056ax f1354 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.EnumC0056ax f1355 = null;

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ p000.EnumC0056ax[] f1356 = null;

    /* JADX INFO: renamed from: ε */
    public final java.util.concurrent.TimeUnit f1357;

    static {
            ax r0 = new ax
            r1 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.String r3 = "NANOSECONDS"
            r0.<init>(r3, r1, r2)
            p000.EnumC0056ax.f1353 = r0
            ax r1 = new ax
            r2 = 1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.String r4 = "MICROSECONDS"
            r1.<init>(r4, r2, r3)
            ax r2 = new ax
            r3 = 2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r5 = "MILLISECONDS"
            r2.<init>(r5, r3, r4)
            p000.EnumC0056ax.f1354 = r2
            ax r3 = new ax
            r4 = 3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r6 = "SECONDS"
            r3.<init>(r6, r4, r5)
            p000.EnumC0056ax.f1355 = r3
            ax r4 = new ax
            r5 = 4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r7 = "MINUTES"
            r4.<init>(r7, r5, r6)
            ax r5 = new ax
            r6 = 5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.HOURS
            java.lang.String r8 = "HOURS"
            r5.<init>(r8, r6, r7)
            ax r6 = new ax
            r7 = 6
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            java.lang.String r9 = "DAYS"
            r6.<init>(r9, r7, r8)
            ax[] r0 = new p000.EnumC0056ax[]{r0, r1, r2, r3, r4, r5, r6}
            p000.EnumC0056ax.f1356 = r0
            return
    }

    EnumC0056ax(java.lang.String r1, int r2, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f1357 = r3
            return
    }

    public static p000.EnumC0056ax valueOf(java.lang.String r1) {
            java.lang.Class<ax> r0 = p000.EnumC0056ax.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ax r1 = (p000.EnumC0056ax) r1
            return r1
    }

    public static p000.EnumC0056ax[] values() {
            ax[] r0 = p000.EnumC0056ax.f1356
            java.lang.Object r0 = r0.clone()
            ax[] r0 = (p000.EnumC0056ax[]) r0
            return r0
    }
}
