package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y80 extends z80 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public y80() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // defpackage.z80
    public final boolean a() {
        int r1 = 0;
    L3:
        ArrayList r2 = this.b;
        if (r1 >= r2.size()) goto L10;
        if (((z80) r2.get(r1)).a() == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return true;
    L10:
        return false;
    }

    @Override // defpackage.z80
    public final boolean b(int[] r5) {
        int r0 = 0;
        boolean r1 = false;
    L3:
        ArrayList r2 = this.b;
        if (r0 >= r2.size()) goto L6;
        r1 = r1 | ((z80) r2.get(r0)).b(r5);
        r0 = r0 + 1;
        goto L3
    L6:
        return r1;
    }

    public final void c() {
        Matrix r0 = this.j;
        r0.reset();
        r0.postTranslate(-this.d, -this.e);
        r0.postScale(this.f, this.g);
        r0.postRotate(this.c, 0.0f, 0.0f);
        r0.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float r2) {
        if (r2 == this.d) goto L6;
        this.d = r2;
        c();
        return;
    }

    public void setPivotY(float r2) {
        if (r2 == this.e) goto L6;
        this.e = r2;
        c();
        return;
    }

    public void setRotation(float r2) {
        if (r2 == this.c) goto L6;
        this.c = r2;
        c();
        return;
    }

    public void setScaleX(float r2) {
        if (r2 == this.f) goto L6;
        this.f = r2;
        c();
        return;
    }

    public void setScaleY(float r2) {
        if (r2 == this.g) goto L6;
        this.g = r2;
        c();
        return;
    }

    public void setTranslateX(float r2) {
        if (r2 == this.h) goto L6;
        this.h = r2;
        c();
        return;
    }

    public void setTranslateY(float r2) {
        if (r2 == this.i) goto L6;
        this.i = r2;
        c();
        return;
    }

    public y80(y80 r7, n6 r8) {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix r2 = new Matrix();
        this.j = r2;
        this.k = null;
        this.c = r7.c;
        this.d = r7.d;
        this.e = r7.e;
        this.f = r7.f;
        this.g = r7.g;
        this.h = r7.h;
        this.i = r7.i;
        String r3 = r7.k;
        this.k = r3;
        if (r3 == null) goto L5;
        r8.put(r3, this);
    L5:
        r2.set(r7.j);
        ArrayList r72 = r7.b;
        int r22 = 0;
    L7:
        if (r22 >= r72.size()) goto L23;
        Object r32 = r72.get(r22);
        if ((r32 instanceof y80) == false) goto L12;
        this.b.add(new y80((y80) r32, r8));
    L20:
        r22 = r22 + 1;
        goto L7
    L12:
        if ((r32 instanceof x80) == false) goto L15;
        x80 r33 = (x80) r32;
        x80 r4 = new x80(r33);
        r4.e = 0.0f;
        r4.g = 1.0f;
        r4.h = 1.0f;
        r4.i = 0.0f;
        r4.j = 1.0f;
        r4.k = 0.0f;
        r4.l = Paint.Cap.BUTT;
        r4.m = Paint.Join.MITER;
        r4.n = 4.0f;
        r4.d = r33.d;
        r4.e = r33.e;
        r4.g = r33.g;
        r4.f = r33.f;
        r4.c = r33.c;
        r4.h = r33.h;
        r4.i = r33.i;
        r4.j = r33.j;
        r4.k = r33.k;
        r4.l = r33.l;
        r4.m = r33.m;
        r4.n = r33.n;
        a90 r42 = r4;
    L17:
        this.b.add(r42);
        Object r34 = r42.b;
        if (r34 == null) goto L20;
        r8.put(r34, r42);
        goto L20
    L15:
        if ((r32 instanceof w80) == false) goto L22;
        r42 = new w80((w80) r32);
        goto L17
    L22:
        throw new IllegalStateException("Unknown object in the tree!");
    }
}
