package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y80 extends z80 {

    /* JADX INFO: renamed from: a */
    public final Matrix f5290a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5291b;

    /* JADX INFO: renamed from: c */
    public float f5292c;

    /* JADX INFO: renamed from: d */
    public float f5293d;

    /* JADX INFO: renamed from: e */
    public float f5294e;

    /* JADX INFO: renamed from: f */
    public float f5295f;

    /* JADX INFO: renamed from: g */
    public float f5296g;

    /* JADX INFO: renamed from: h */
    public float f5297h;

    /* JADX INFO: renamed from: i */
    public float f5298i;

    /* JADX INFO: renamed from: j */
    public final Matrix f5299j;

    /* JADX INFO: renamed from: k */
    public String f5300k;

    public y80() {
        this.f5290a = new Matrix();
        this.f5291b = new ArrayList();
        this.f5292c = 0.0f;
        this.f5293d = 0.0f;
        this.f5294e = 0.0f;
        this.f5295f = 1.0f;
        this.f5296g = 1.0f;
        this.f5297h = 0.0f;
        this.f5298i = 0.0f;
        this.f5299j = new Matrix();
        this.f5300k = null;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: a */
    public final boolean mo2615a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5291b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((z80) arrayList.get(i)).mo2615a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: b */
    public final boolean mo2616b(int[] iArr) {
        int i = 0;
        boolean zMo2616b = false;
        while (true) {
            ArrayList arrayList = this.f5291b;
            if (i >= arrayList.size()) {
                return zMo2616b;
            }
            zMo2616b |= ((z80) arrayList.get(i)).mo2616b(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2654c() {
        Matrix matrix = this.f5299j;
        matrix.reset();
        matrix.postTranslate(-this.f5293d, -this.f5294e);
        matrix.postScale(this.f5295f, this.f5296g);
        matrix.postRotate(this.f5292c, 0.0f, 0.0f);
        matrix.postTranslate(this.f5297h + this.f5293d, this.f5298i + this.f5294e);
    }

    public String getGroupName() {
        return this.f5300k;
    }

    public Matrix getLocalMatrix() {
        return this.f5299j;
    }

    public float getPivotX() {
        return this.f5293d;
    }

    public float getPivotY() {
        return this.f5294e;
    }

    public float getRotation() {
        return this.f5292c;
    }

    public float getScaleX() {
        return this.f5295f;
    }

    public float getScaleY() {
        return this.f5296g;
    }

    public float getTranslateX() {
        return this.f5297h;
    }

    public float getTranslateY() {
        return this.f5298i;
    }

    public void setPivotX(float f) {
        if (f != this.f5293d) {
            this.f5293d = f;
            m2654c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f5294e) {
            this.f5294e = f;
            m2654c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f5292c) {
            this.f5292c = f;
            m2654c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f5295f) {
            this.f5295f = f;
            m2654c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f5296g) {
            this.f5296g = f;
            m2654c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f5297h) {
            this.f5297h = f;
            m2654c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f5298i) {
            this.f5298i = f;
            m2654c();
        }
    }

    public y80(y80 y80Var, C0511n6 c0511n6) {
        a90 w80Var;
        this.f5290a = new Matrix();
        this.f5291b = new ArrayList();
        this.f5292c = 0.0f;
        this.f5293d = 0.0f;
        this.f5294e = 0.0f;
        this.f5295f = 1.0f;
        this.f5296g = 1.0f;
        this.f5297h = 0.0f;
        this.f5298i = 0.0f;
        Matrix matrix = new Matrix();
        this.f5299j = matrix;
        this.f5300k = null;
        this.f5292c = y80Var.f5292c;
        this.f5293d = y80Var.f5293d;
        this.f5294e = y80Var.f5294e;
        this.f5295f = y80Var.f5295f;
        this.f5296g = y80Var.f5296g;
        this.f5297h = y80Var.f5297h;
        this.f5298i = y80Var.f5298i;
        String str = y80Var.f5300k;
        this.f5300k = str;
        if (str != null) {
            c0511n6.put(str, this);
        }
        matrix.set(y80Var.f5299j);
        ArrayList arrayList = y80Var.f5291b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof y80) {
                this.f5291b.add(new y80((y80) obj, c0511n6));
            } else {
                if (obj instanceof x80) {
                    x80 x80Var = (x80) obj;
                    x80 x80Var2 = new x80(x80Var);
                    x80Var2.f5126e = 0.0f;
                    x80Var2.f5128g = 1.0f;
                    x80Var2.f5129h = 1.0f;
                    x80Var2.f5130i = 0.0f;
                    x80Var2.f5131j = 1.0f;
                    x80Var2.f5132k = 0.0f;
                    x80Var2.f5133l = Paint.Cap.BUTT;
                    x80Var2.f5134m = Paint.Join.MITER;
                    x80Var2.f5135n = 4.0f;
                    x80Var2.f5125d = x80Var.f5125d;
                    x80Var2.f5126e = x80Var.f5126e;
                    x80Var2.f5128g = x80Var.f5128g;
                    x80Var2.f5127f = x80Var.f5127f;
                    x80Var2.f99c = x80Var.f99c;
                    x80Var2.f5129h = x80Var.f5129h;
                    x80Var2.f5130i = x80Var.f5130i;
                    x80Var2.f5131j = x80Var.f5131j;
                    x80Var2.f5132k = x80Var.f5132k;
                    x80Var2.f5133l = x80Var.f5133l;
                    x80Var2.f5134m = x80Var.f5134m;
                    x80Var2.f5135n = x80Var.f5135n;
                    w80Var = x80Var2;
                } else if (obj instanceof w80) {
                    w80Var = new w80((w80) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f5291b.add(w80Var);
                Object obj2 = w80Var.f98b;
                if (obj2 != null) {
                    c0511n6.put(obj2, w80Var);
                }
            }
        }
    }
}
