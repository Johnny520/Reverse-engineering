package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class C4707 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.graphics.Path m18692(@Yue.InterfaceC4418 android.graphics.Path r2, @Yue.InterfaceC4418 android.graphics.Path r3) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            android.graphics.Path$Op r1 = android.graphics.Path.Op.INTERSECT
            r0.op(r2, r3, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Iterable<Yue.C4715> m18693(@Yue.InterfaceC4418 android.graphics.Path r0, float r1) {
            java.util.Collection r0 = Yue.C4720.m18753(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Iterable m18694(android.graphics.Path r0, float r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 1056964608(0x3f000000, float:0.5)
        L6:
            java.lang.Iterable r0 = m18693(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.graphics.Path m18695(@Yue.InterfaceC4418 android.graphics.Path r1, @Yue.InterfaceC4418 android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final android.graphics.Path m18696(@Yue.InterfaceC4418 android.graphics.Path r1, @Yue.InterfaceC4418 android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final android.graphics.Path m18697(@Yue.InterfaceC4418 android.graphics.Path r1, @Yue.InterfaceC4418 android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final android.graphics.Path m18698(@Yue.InterfaceC4418 android.graphics.Path r1, @Yue.InterfaceC4418 android.graphics.Path r2) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.XOR
            r0.op(r2, r1)
            return r0
    }
}
