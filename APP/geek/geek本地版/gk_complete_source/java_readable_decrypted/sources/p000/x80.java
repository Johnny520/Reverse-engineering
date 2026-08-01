package p000;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class x80 extends a90 {

    /* JADX INFO: renamed from: d */
    public C0953z3 f5125d;

    /* JADX INFO: renamed from: e */
    public float f5126e;

    /* JADX INFO: renamed from: f */
    public C0953z3 f5127f;

    /* JADX INFO: renamed from: g */
    public float f5128g;

    /* JADX INFO: renamed from: h */
    public float f5129h;

    /* JADX INFO: renamed from: i */
    public float f5130i;

    /* JADX INFO: renamed from: j */
    public float f5131j;

    /* JADX INFO: renamed from: k */
    public float f5132k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f5133l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f5134m;

    /* JADX INFO: renamed from: n */
    public float f5135n;

    @Override // p000.z80
    /* JADX INFO: renamed from: a */
    public final boolean mo2615a() {
        return this.f5127f.m2754c() || this.f5125d.m2754c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // p000.z80
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo2616b(int[] r7) {
        /*
            r6 = this;
            z3 r0 = r6.f5127f
            boolean r1 = r0.m2754c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f5448c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f5446a
            if (r1 == r4) goto L1e
            r0.f5446a = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            z3 r1 = r6.f5125d
            boolean r4 = r1.m2754c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f5448c
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f5446a
            if (r7 == r4) goto L3a
            r1.f5446a = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x80.mo2616b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f5129h;
    }

    public int getFillColor() {
        return this.f5127f.f5446a;
    }

    public float getStrokeAlpha() {
        return this.f5128g;
    }

    public int getStrokeColor() {
        return this.f5125d.f5446a;
    }

    public float getStrokeWidth() {
        return this.f5126e;
    }

    public float getTrimPathEnd() {
        return this.f5131j;
    }

    public float getTrimPathOffset() {
        return this.f5132k;
    }

    public float getTrimPathStart() {
        return this.f5130i;
    }

    public void setFillAlpha(float f) {
        this.f5129h = f;
    }

    public void setFillColor(int i) {
        this.f5127f.f5446a = i;
    }

    public void setStrokeAlpha(float f) {
        this.f5128g = f;
    }

    public void setStrokeColor(int i) {
        this.f5125d.f5446a = i;
    }

    public void setStrokeWidth(float f) {
        this.f5126e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f5131j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f5132k = f;
    }

    public void setTrimPathStart(float f) {
        this.f5130i = f;
    }
}
