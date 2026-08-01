package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class x80 extends a90 {
    public z3 d;
    public float e;
    public z3 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // defpackage.z80
    public final boolean a() {
        if (this.f.c() == false) goto L5;
        return true;
    L5:
        if (this.d.c() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.z80
    public final boolean b(int[] r7) {
        z3 r0 = this.f;
        boolean r2 = true;
        if (r0.c() == false) goto L7;
        ColorStateList r1 = (ColorStateList) r0.c;
        int r12 = r1.getColorForState(r7, r1.getDefaultColor());
        if (r12 == r0.a) goto L7;
        r0.a = r12;
        boolean r02 = true;
    L8:
        z3 r13 = this.d;
        if (r13.c() == false) goto L13;
        ColorStateList r4 = (ColorStateList) r13.c;
        int r72 = r4.getColorForState(r7, r4.getDefaultColor());
        if (r72 == r13.a) goto L13;
        r13.a = r72;
    L15:
        return r02 | r2;
    L13:
        r2 = false;
    L7:
        r02 = false;
        goto L8
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.a;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.a;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float r1) {
        this.h = r1;
    }

    public void setFillColor(int r2) {
        this.f.a = r2;
    }

    public void setStrokeAlpha(float r1) {
        this.g = r1;
    }

    public void setStrokeColor(int r2) {
        this.d.a = r2;
    }

    public void setStrokeWidth(float r1) {
        this.e = r1;
    }

    public void setTrimPathEnd(float r1) {
        this.j = r1;
    }

    public void setTrimPathOffset(float r1) {
        this.k = r1;
    }

    public void setTrimPathStart(float r1) {
        this.i = r1;
    }
}
