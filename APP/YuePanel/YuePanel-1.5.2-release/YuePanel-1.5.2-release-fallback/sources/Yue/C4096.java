package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class C4096 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.graphics.Matrix m16026(float r1, float r2, float r3) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setRotate(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ android.graphics.Matrix m16027(float r1, float r2, float r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            android.graphics.Matrix r1 = m16026(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final android.graphics.Matrix m16028(float r1, float r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ android.graphics.Matrix m16029(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L7
            r1 = r0
        L7:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = r0
        Lc:
            android.graphics.Matrix r1 = m16028(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final android.graphics.Matrix m16030(@Yue.InterfaceC4418 android.graphics.Matrix r1, @Yue.InterfaceC4418 android.graphics.Matrix r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            r0.preConcat(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final android.graphics.Matrix m16031(float r1, float r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setTranslate(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ android.graphics.Matrix m16032(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r1 = r0
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = r0
        Lb:
            android.graphics.Matrix r1 = m16031(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final float[] m16033(@Yue.InterfaceC4418 android.graphics.Matrix r1) {
            r0 = 9
            float[] r0 = new float[r0]
            r1.getValues(r0)
            return r0
    }
}
