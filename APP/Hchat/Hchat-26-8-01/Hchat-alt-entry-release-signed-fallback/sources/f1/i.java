package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3064a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3065b = null;

    static {
            android.graphics.Paint$Style[] r0 = android.graphics.Paint.Style.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1 = 1
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.NoSuchFieldError -> L10
            int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
            r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
        L10:
            android.graphics.Paint$Cap[] r0 = android.graphics.Paint.Cap.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT     // Catch: java.lang.NoSuchFieldError -> L1f
            int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1f
            r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L1f
        L1f:
            r2 = 2
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch: java.lang.NoSuchFieldError -> L28
            int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
            r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L28
        L28:
            r3 = 3
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE     // Catch: java.lang.NoSuchFieldError -> L31
            int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L31
            r0[r4] = r3     // Catch: java.lang.NoSuchFieldError -> L31
        L31:
            f1.i.f3064a = r0
            android.graphics.Paint$Join[] r0 = android.graphics.Paint.Join.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER     // Catch: java.lang.NoSuchFieldError -> L42
            int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
            r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L42
        L42:
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL     // Catch: java.lang.NoSuchFieldError -> L4a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4a
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4a
        L4a:
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L52
        L52:
            f1.i.f3065b = r0
            return
    }
}
