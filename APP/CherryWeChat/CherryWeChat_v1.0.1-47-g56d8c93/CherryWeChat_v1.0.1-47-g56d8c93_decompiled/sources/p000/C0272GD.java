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
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f880b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0315HD) arrayList.get(i)).mo449a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.AbstractC0315HD
    /* JADX INFO: renamed from: b */
    public final boolean mo450b(int[] iArr) {
        int i = 0;
        boolean zMo450b = false;
        while (true) {
            ArrayList arrayList = this.f880b;
            if (i >= arrayList.size()) {
                return zMo450b;
            }
            zMo450b |= ((AbstractC0315HD) arrayList.get(i)).mo450b(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m552c() {
        Matrix matrix = this.f888j;
        matrix.reset();
        matrix.postTranslate(-this.f882d, -this.f883e);
        matrix.postScale(this.f884f, this.f885g);
        matrix.postRotate(this.f881c, 0.0f, 0.0f);
        matrix.postTranslate(this.f886h + this.f882d, this.f887i + this.f883e);
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

    public void setPivotX(float f) {
        if (f != this.f882d) {
            this.f882d = f;
            m552c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f883e) {
            this.f883e = f;
            m552c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f881c) {
            this.f881c = f;
            m552c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f884f) {
            this.f884f = f;
            m552c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f885g) {
            this.f885g = f;
            m552c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f886h) {
            this.f886h = f;
            m552c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f887i) {
            this.f887i = f;
            m552c();
        }
    }

    public C0272GD(C0272GD c0272gd, C0521M4 c0521m4) {
        AbstractC0358ID c0186ed;
        this.f879a = new Matrix();
        this.f880b = new ArrayList();
        this.f881c = 0.0f;
        this.f882d = 0.0f;
        this.f883e = 0.0f;
        this.f884f = 1.0f;
        this.f885g = 1.0f;
        this.f886h = 0.0f;
        this.f887i = 0.0f;
        Matrix matrix = new Matrix();
        this.f888j = matrix;
        this.f889k = null;
        this.f881c = c0272gd.f881c;
        this.f882d = c0272gd.f882d;
        this.f883e = c0272gd.f883e;
        this.f884f = c0272gd.f884f;
        this.f885g = c0272gd.f885g;
        this.f886h = c0272gd.f886h;
        this.f887i = c0272gd.f887i;
        String str = c0272gd.f889k;
        this.f889k = str;
        if (str != null) {
            c0521m4.put(str, this);
        }
        matrix.set(c0272gd.f888j);
        ArrayList arrayList = c0272gd.f880b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0272GD) {
                this.f880b.add(new C0272GD((C0272GD) obj, c0521m4));
            } else {
                if (obj instanceof C0229FD) {
                    C0229FD c0229fd = (C0229FD) obj;
                    C0229FD c0229fd2 = new C0229FD(c0229fd);
                    c0229fd2.f673e = 0.0f;
                    c0229fd2.f675g = 1.0f;
                    c0229fd2.f676h = 1.0f;
                    c0229fd2.f677i = 0.0f;
                    c0229fd2.f678j = 1.0f;
                    c0229fd2.f679k = 0.0f;
                    c0229fd2.f680l = Paint.Cap.BUTT;
                    c0229fd2.f681m = Paint.Join.MITER;
                    c0229fd2.f682n = 4.0f;
                    c0229fd2.f672d = c0229fd.f672d;
                    c0229fd2.f673e = c0229fd.f673e;
                    c0229fd2.f675g = c0229fd.f675g;
                    c0229fd2.f674f = c0229fd.f674f;
                    c0229fd2.f1224c = c0229fd.f1224c;
                    c0229fd2.f676h = c0229fd.f676h;
                    c0229fd2.f677i = c0229fd.f677i;
                    c0229fd2.f678j = c0229fd.f678j;
                    c0229fd2.f679k = c0229fd.f679k;
                    c0229fd2.f680l = c0229fd.f680l;
                    c0229fd2.f681m = c0229fd.f681m;
                    c0229fd2.f682n = c0229fd.f682n;
                    c0186ed = c0229fd2;
                } else if (obj instanceof C0186ED) {
                    c0186ed = new C0186ED((C0186ED) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f880b.add(c0186ed);
                Object obj2 = c0186ed.f1223b;
                if (obj2 != null) {
                    c0521m4.put(obj2, c0186ed);
                }
            }
        }
    }
}
