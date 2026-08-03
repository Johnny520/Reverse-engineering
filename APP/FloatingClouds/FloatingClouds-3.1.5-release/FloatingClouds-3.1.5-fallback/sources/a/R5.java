package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class R5 extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f241a;
    public final a.Tf b;
    public short c;
    public float d;

    public R5(a.Tf r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.f241a = r0
            r0 = -1
            r1.c = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.d = r0
            java.lang.String r0 = "rasterizer cannot be null"
            a.C0282n9.h(r2, r0)
            r1.b = r2
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r5, @android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r6, int r7, int r8, android.graphics.Paint.FontMetricsInt r9) {
            r4 = this;
            android.graphics.Paint$FontMetricsInt r6 = r4.f241a
            r5.getFontMetricsInt(r6)
            int r5 = r6.descent
            int r7 = r6.ascent
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r7
            a.Tf r7 = r4.b
            a.ib r8 = r7.b()
            r0 = 14
            int r1 = r8.a(r0)
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r3 = r8.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r8 = r8.f233a
            int r1 = r1 + r8
            short r8 = r3.getShort(r1)
            goto L2e
        L2d:
            r8 = r2
        L2e:
            float r8 = (float) r8
            float r5 = r5 / r8
            r4.d = r5
            a.ib r5 = r7.b()
            int r8 = r5.a(r0)
            if (r8 == 0) goto L46
            java.lang.Object r0 = r5.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r5 = r5.f233a
            int r8 = r8 + r5
            r0.getShort(r8)
        L46:
            a.ib r5 = r7.b()
            r7 = 12
            int r7 = r5.a(r7)
            if (r7 == 0) goto L5d
            java.lang.Object r8 = r5.d
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r5 = r5.f233a
            int r7 = r7 + r5
            short r2 = r8.getShort(r7)
        L5d:
            float r5 = (float) r2
            float r7 = r4.d
            float r5 = r5 * r7
            int r5 = (int) r5
            short r5 = (short) r5
            r4.c = r5
            if (r9 == 0) goto L77
            int r7 = r6.ascent
            r9.ascent = r7
            int r7 = r6.descent
            r9.descent = r7
            int r7 = r6.top
            r9.top = r7
            int r6 = r6.bottom
            r9.bottom = r6
        L77:
            return r5
    }
}
