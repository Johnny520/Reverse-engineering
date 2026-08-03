package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: renamed from: GD */
/* JADX INFO: loaded from: classes.dex */
public final class C0272GD extends AbstractC0315HD {

    /* JADX INFO: renamed from: a */
    public final Matrix f879a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f880b;

    /* JADX INFO: renamed from: c */
    public float f881c;

    /* JADX INFO: renamed from: d */
    public float f882d;

    /* JADX INFO: renamed from: e */
    public float f883e;

    /* JADX INFO: renamed from: f */
    public float f884f;

    /* JADX INFO: renamed from: g */
    public float f885g;

    /* JADX INFO: renamed from: h */
    public float f886h;

    /* JADX INFO: renamed from: i */
    public float f887i;

    /* JADX INFO: renamed from: j */
    public final Matrix f888j;

    /* JADX INFO: renamed from: k */
    public String f889k;

    public C0272GD() {
        this.f879a = new Matrix();
        this.f880b = new ArrayList();
        this.f881c = 0.0f;
        this.f882d = 0.0f;
        this.f883e = 0.0f;
        this.f884f = 1.0f;
        this.f885g = 1.0f;
        this.f886h = 0.0f;
        this.f887i = 0.0f;
        this.f888j = new Matrix();
        this.f889k = null;
    }

    @Override // p000.AbstractC0315HD
    /* JADX INFO: renamed from: a */
    public final boolean mo449a() {
        int r1 = 0;
    L3:
        ArrayList r2 = this.f880b;
        if (r1 >= r2.size()) goto L10;
        if (((AbstractC0315HD) r2.get(r1)).mo449a() == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return true;
    L10:
        return false;
    }

    @Override // p000.AbstractC0315HD
    /* JADX INFO: renamed from: b */
    public final boolean mo450b(int[] r5) {
        int r0 = 0;
        boolean r1 = false;
    L3:
        ArrayList r2 = this.f880b;
        if (r0 >= r2.size()) goto L6;
        r1 = r1 | ((AbstractC0315HD) r2.get(r0)).mo450b(r5);
        r0 = r0 + 1;
        goto L3
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: c */
    public final void m552c() {
        Matrix r0 = this.f888j;
        r0.reset();
        r0.postTranslate(-this.f882d, -this.f883e);
        r0.postScale(this.f884f, this.f885g);
        r0.postRotate(this.f881c, 0.0f, 0.0f);
        r0.postTranslate(this.f886h + this.f882d, this.f887i + this.f883e);
    }

    public String getGroupName() {
        return this.f889k;
    }

    public Matrix getLocalMatrix() {
        return this.f888j;
    }

    public float getPivotX() {
        return this.f882d;
    }

    public float getPivotY() {
        return this.f883e;
    }

    public float getRotation() {
        return this.f881c;
    }

    public float getScaleX() {
        return this.f884f;
    }

    public float getScaleY() {
        return this.f885g;
    }

    public float getTranslateX() {
        return this.f886h;
    }

    public float getTranslateY() {
        return this.f887i;
    }

    public void setPivotX(float r2) {
        if (r2 == this.f882d) goto L6;
        this.f882d = r2;
        m552c();
        return;
    }

    public void setPivotY(float r2) {
        if (r2 == this.f883e) goto L6;
        this.f883e = r2;
        m552c();
        return;
    }

    public void setRotation(float r2) {
        if (r2 == this.f881c) goto L6;
        this.f881c = r2;
        m552c();
        return;
    }

    public void setScaleX(float r2) {
        if (r2 == this.f884f) goto L6;
        this.f884f = r2;
        m552c();
        return;
    }

    public void setScaleY(float r2) {
        if (r2 == this.f885g) goto L6;
        this.f885g = r2;
        m552c();
        return;
    }

    public void setTranslateX(float r2) {
        if (r2 == this.f886h) goto L6;
        this.f886h = r2;
        m552c();
        return;
    }

    public void setTranslateY(float r2) {
        if (r2 == this.f887i) goto L6;
        this.f887i = r2;
        m552c();
        return;
    }

    public C0272GD(C0272GD r7, C0521M4 r8) {
        this.f879a = new Matrix();
        this.f880b = new ArrayList();
        this.f881c = 0.0f;
        this.f882d = 0.0f;
        this.f883e = 0.0f;
        this.f884f = 1.0f;
        this.f885g = 1.0f;
        this.f886h = 0.0f;
        this.f887i = 0.0f;
        Matrix r2 = new Matrix();
        this.f888j = r2;
        this.f889k = null;
        this.f881c = r7.f881c;
        this.f882d = r7.f882d;
        this.f883e = r7.f883e;
        this.f884f = r7.f884f;
        this.f885g = r7.f885g;
        this.f886h = r7.f886h;
        this.f887i = r7.f887i;
        String r3 = r7.f889k;
        this.f889k = r3;
        if (r3 == null) goto L5;
        r8.put(r3, this);
    L5:
        r2.set(r7.f888j);
        ArrayList r72 = r7.f880b;
        int r22 = 0;
    L7:
        if (r22 >= r72.size()) goto L23;
        Object r32 = r72.get(r22);
        if ((r32 instanceof C0272GD) == false) goto L12;
        this.f880b.add(new C0272GD((C0272GD) r32, r8));
    L20:
        r22 = r22 + 1;
        goto L7
    L12:
        if ((r32 instanceof C0229FD) == false) goto L15;
        C0229FD r33 = (C0229FD) r32;
        C0229FD r4 = new C0229FD(r33);
        r4.f673e = 0.0f;
        r4.f675g = 1.0f;
        r4.f676h = 1.0f;
        r4.f677i = 0.0f;
        r4.f678j = 1.0f;
        r4.f679k = 0.0f;
        r4.f680l = Paint.Cap.BUTT;
        r4.f681m = Paint.Join.MITER;
        r4.f682n = 4.0f;
        r4.f672d = r33.f672d;
        r4.f673e = r33.f673e;
        r4.f675g = r33.f675g;
        r4.f674f = r33.f674f;
        r4.f1224c = r33.f1224c;
        r4.f676h = r33.f676h;
        r4.f677i = r33.f677i;
        r4.f678j = r33.f678j;
        r4.f679k = r33.f679k;
        r4.f680l = r33.f680l;
        r4.f681m = r33.f681m;
        r4.f682n = r33.f682n;
        AbstractC0358ID r42 = r4;
    L17:
        this.f880b.add(r42);
        Object r34 = r42.f1223b;
        if (r34 == null) goto L20;
        r8.put(r34, r42);
        goto L20
    L15:
        if ((r32 instanceof C0186ED) == false) goto L22;
        r42 = new C0186ED((C0186ED) r32);
        goto L17
    L22:
        throw new IllegalStateException("Unknown object in the tree!");
    }
}
