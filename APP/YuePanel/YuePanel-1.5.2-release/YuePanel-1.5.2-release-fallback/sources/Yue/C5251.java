package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
public final class C5251 {
    @Yue.InterfaceC4418
    @android.annotation.SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.graphics.Rect m19811(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.intersect(r2)
            return r0
    }

    @Yue.InterfaceC4418
    @android.annotation.SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final android.graphics.RectF m19812(@Yue.InterfaceC4418 android.graphics.RectF r1, @Yue.InterfaceC4418 android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.intersect(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float m19813(@Yue.InterfaceC4418 android.graphics.RectF r0) {
            float r0 = r0.left
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m19814(@Yue.InterfaceC4418 android.graphics.Rect r0) {
            int r0 = r0.left
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final float m19815(@Yue.InterfaceC4418 android.graphics.RectF r0) {
            float r0 = r0.top
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m19816(@Yue.InterfaceC4418 android.graphics.Rect r0) {
            int r0 = r0.top
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final float m19817(@Yue.InterfaceC4418 android.graphics.RectF r0) {
            float r0 = r0.right
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m19818(@Yue.InterfaceC4418 android.graphics.Rect r0) {
            int r0 = r0.right
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float m19819(@Yue.InterfaceC4418 android.graphics.RectF r0) {
            float r0 = r0.bottom
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m19820(@Yue.InterfaceC4418 android.graphics.Rect r0) {
            int r0 = r0.bottom
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m19821(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Point r2) {
            int r0 = r2.x
            int r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m19822(@Yue.InterfaceC4418 android.graphics.RectF r1, @Yue.InterfaceC4418 android.graphics.PointF r2) {
            float r0 = r2.x
            float r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final android.graphics.Rect m19823(@Yue.InterfaceC4418 android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = -r2
            r0.offset(r1, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final android.graphics.Rect m19824(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Point r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r2.x
            int r1 = -r1
            int r2 = r2.y
            int r2 = -r2
            r0.offset(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final android.graphics.RectF m19825(@Yue.InterfaceC4418 android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = -r2
            r0.offset(r1, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final android.graphics.RectF m19826(@Yue.InterfaceC4418 android.graphics.RectF r1, @Yue.InterfaceC4418 android.graphics.PointF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r2.x
            float r1 = -r1
            float r2 = r2.y
            float r2 = -r2
            r0.offset(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final android.graphics.Region m19827(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final android.graphics.Region m19828(@Yue.InterfaceC4418 android.graphics.RectF r2, @Yue.InterfaceC4418 android.graphics.RectF r3) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.roundOut(r2)
            android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final android.graphics.Rect m19829(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final android.graphics.RectF m19830(@Yue.InterfaceC4418 android.graphics.RectF r1, @Yue.InterfaceC4418 android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final android.graphics.Rect m19831(@Yue.InterfaceC4418 android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.offset(r2, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final android.graphics.Rect m19832(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Point r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r2.x
            int r2 = r2.y
            r0.offset(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final android.graphics.Rect m19833(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final android.graphics.RectF m19834(@Yue.InterfaceC4418 android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.offset(r2, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final android.graphics.RectF m19835(@Yue.InterfaceC4418 android.graphics.RectF r1, @Yue.InterfaceC4418 android.graphics.PointF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r2.x
            float r2 = r2.y
            r0.offset(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final android.graphics.RectF m19836(@Yue.InterfaceC4418 android.graphics.RectF r1, @Yue.InterfaceC4418 android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final android.graphics.Rect m19837(@Yue.InterfaceC4418 android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r0.top
            int r1 = r1 * r2
            r0.top = r1
            int r1 = r0.left
            int r1 = r1 * r2
            r0.left = r1
            int r1 = r0.right
            int r1 = r1 * r2
            r0.right = r1
            int r1 = r0.bottom
            int r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final android.graphics.RectF m19838(@Yue.InterfaceC4418 android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r0.top
            float r1 = r1 * r2
            r0.top = r1
            float r1 = r0.left
            float r1 = r1 * r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 * r2
            r0.right = r1
            float r1 = r0.bottom
            float r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final android.graphics.RectF m19839(@Yue.InterfaceC4418 android.graphics.RectF r1, int r2) {
            float r2 = (float) r2
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r0.top
            float r1 = r1 * r2
            r0.top = r1
            float r1 = r0.left
            float r1 = r1 * r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 * r2
            r0.right = r1
            float r1 = r0.bottom
            float r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final android.graphics.Rect m19840(@Yue.InterfaceC4418 android.graphics.RectF r1) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.roundOut(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final android.graphics.RectF m19841(@Yue.InterfaceC4418 android.graphics.Rect r1) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final android.graphics.Region m19842(@Yue.InterfaceC4418 android.graphics.Rect r1) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final android.graphics.Region m19843(@Yue.InterfaceC4418 android.graphics.RectF r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final android.graphics.RectF m19844(@Yue.InterfaceC4418 android.graphics.RectF r0, @Yue.InterfaceC4418 android.graphics.Matrix r1) {
            r1.mapRect(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final android.graphics.Region m19845(@Yue.InterfaceC4418 android.graphics.Rect r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final android.graphics.Region m19846(@Yue.InterfaceC4418 android.graphics.RectF r2, @Yue.InterfaceC4418 android.graphics.RectF r3) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.roundOut(r2)
            android.graphics.Region$Op r3 = android.graphics.Region.Op.XOR
            r0.op(r2, r3)
            return r0
    }
}
