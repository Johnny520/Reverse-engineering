package p000;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class c90 extends f90 {

    /* JADX INFO: renamed from: d */
    public C0953z3 f839d;

    /* JADX INFO: renamed from: e */
    public float f840e;

    /* JADX INFO: renamed from: f */
    public C0953z3 f841f;

    /* JADX INFO: renamed from: g */
    public float f842g;

    /* JADX INFO: renamed from: h */
    public float f843h;

    /* JADX INFO: renamed from: i */
    public float f844i;

    /* JADX INFO: renamed from: j */
    public float f845j;

    /* JADX INFO: renamed from: k */
    public float f846k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f847l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f848m;

    /* JADX INFO: renamed from: n */
    public float f849n;

    @Override // p000.e90
    /* JADX INFO: renamed from: a */
    public final boolean mo596a() {
        return this.f841f.m2790c() || this.f839d.m2790c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // p000.e90
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo597b(int[] r7) {
        /*
            r6 = this;
            z3 r0 = r6.f841f
            boolean r1 = r0.m2790c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f5537c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f5535a
            if (r1 == r4) goto L1e
            r0.f5535a = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            z3 r1 = r6.f839d
            boolean r4 = r1.m2790c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f5537c
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f5535a
            if (r7 == r4) goto L3a
            r1.f5535a = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c90.mo597b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f843h;
    }

    public int getFillColor() {
        return this.f841f.f5535a;
    }

    public float getStrokeAlpha() {
        return this.f842g;
    }

    public int getStrokeColor() {
        return this.f839d.f5535a;
    }

    public float getStrokeWidth() {
        return this.f840e;
    }

    public float getTrimPathEnd() {
        return this.f845j;
    }

    public float getTrimPathOffset() {
        return this.f846k;
    }

    public float getTrimPathStart() {
        return this.f844i;
    }

    public void setFillAlpha(float f) {
        this.f843h = f;
    }

    public void setFillColor(int i) {
        this.f841f.f5535a = i;
    }

    public void setStrokeAlpha(float f) {
        this.f842g = f;
    }

    public void setStrokeColor(int i) {
        this.f839d.f5535a = i;
    }

    public void setStrokeWidth(float f) {
        this.f840e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f845j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f846k = f;
    }

    public void setTrimPathStart(float f) {
        this.f844i = f;
    }
}
