package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l30 extends defpackage.n30 {
    public static final android.graphics.RectF h = null;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            defpackage.l30.h = r0
            return
    }

    public l30(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            return
    }

    @Override // defpackage.n30
    public final void a(android.graphics.Matrix r6, android.graphics.Path r7) {
            r5 = this;
            android.graphics.Matrix r0 = r5.a
            r6.invert(r0)
            r7.transform(r0)
            float r0 = r5.d
            float r1 = r5.e
            android.graphics.RectF r2 = defpackage.l30.h
            float r3 = r5.b
            float r4 = r5.c
            r2.set(r3, r4, r0, r1)
            float r0 = r5.f
            float r1 = r5.g
            r3 = 0
            r7.arcTo(r2, r0, r1, r3)
            r7.transform(r6)
            return
    }
}
