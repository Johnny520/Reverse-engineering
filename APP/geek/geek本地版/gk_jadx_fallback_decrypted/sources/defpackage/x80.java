package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x80 extends defpackage.a90 {
    public defpackage.z3 d;
    public float e;
    public defpackage.z3 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public android.graphics.Paint.Cap l;
    public android.graphics.Paint.Join m;
    public float n;

    @Override // defpackage.z80
    public final boolean a() {
            r1 = this;
            z3 r0 = r1.f
            boolean r0 = r0.c()
            if (r0 != 0) goto L13
            z3 r0 = r1.d
            boolean r0 = r0.c()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @Override // defpackage.z80
    public final boolean b(int[] r7) {
            r6 = this;
            z3 r0 = r6.f
            boolean r1 = r0.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.a
            if (r1 == r4) goto L1e
            r0.a = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            z3 r1 = r6.d
            boolean r4 = r1.c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.c
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.a
            if (r7 == r4) goto L3a
            r1.a = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
    }

    public float getFillAlpha() {
            r1 = this;
            float r0 = r1.h
            return r0
    }

    public int getFillColor() {
            r1 = this;
            z3 r0 = r1.f
            int r0 = r0.a
            return r0
    }

    public float getStrokeAlpha() {
            r1 = this;
            float r0 = r1.g
            return r0
    }

    public int getStrokeColor() {
            r1 = this;
            z3 r0 = r1.d
            int r0 = r0.a
            return r0
    }

    public float getStrokeWidth() {
            r1 = this;
            float r0 = r1.e
            return r0
    }

    public float getTrimPathEnd() {
            r1 = this;
            float r0 = r1.j
            return r0
    }

    public float getTrimPathOffset() {
            r1 = this;
            float r0 = r1.k
            return r0
    }

    public float getTrimPathStart() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public void setFillAlpha(float r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setFillColor(int r2) {
            r1 = this;
            z3 r0 = r1.f
            r0.a = r2
            return
    }

    public void setStrokeAlpha(float r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setStrokeColor(int r2) {
            r1 = this;
            z3 r0 = r1.d
            r0.a = r2
            return
    }

    public void setStrokeWidth(float r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setTrimPathEnd(float r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setTrimPathOffset(float r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setTrimPathStart(float r1) {
            r0 = this;
            r0.i = r1
            return
    }
}
