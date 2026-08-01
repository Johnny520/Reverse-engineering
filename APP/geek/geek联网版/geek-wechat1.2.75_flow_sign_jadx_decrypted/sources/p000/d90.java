package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d90 extends e90 {

    /* JADX INFO: renamed from: a */
    public final Matrix f1340a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1341b;

    /* JADX INFO: renamed from: c */
    public float f1342c;

    /* JADX INFO: renamed from: d */
    public float f1343d;

    /* JADX INFO: renamed from: e */
    public float f1344e;

    /* JADX INFO: renamed from: f */
    public float f1345f;

    /* JADX INFO: renamed from: g */
    public float f1346g;

    /* JADX INFO: renamed from: h */
    public float f1347h;

    /* JADX INFO: renamed from: i */
    public float f1348i;

    /* JADX INFO: renamed from: j */
    public final Matrix f1349j;

    /* JADX INFO: renamed from: k */
    public String f1350k;

    public d90() {
        this.f1340a = new Matrix();
        this.f1341b = new ArrayList();
        this.f1342c = 0.0f;
        this.f1343d = 0.0f;
        this.f1344e = 0.0f;
        this.f1345f = 1.0f;
        this.f1346g = 1.0f;
        this.f1347h = 0.0f;
        this.f1348i = 0.0f;
        this.f1349j = new Matrix();
        this.f1350k = null;
    }

    @Override // p000.e90
    /* JADX INFO: renamed from: a */
    public final boolean mo596a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1341b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((e90) arrayList.get(i)).mo596a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.e90
    /* JADX INFO: renamed from: b */
    public final boolean mo597b(int[] iArr) {
        int i = 0;
        boolean zMo597b = false;
        while (true) {
            ArrayList arrayList = this.f1341b;
            if (i >= arrayList.size()) {
                return zMo597b;
            }
            zMo597b |= ((e90) arrayList.get(i)).mo597b(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m882c() {
        Matrix matrix = this.f1349j;
        matrix.reset();
        matrix.postTranslate(-this.f1343d, -this.f1344e);
        matrix.postScale(this.f1345f, this.f1346g);
        matrix.postRotate(this.f1342c, 0.0f, 0.0f);
        matrix.postTranslate(this.f1347h + this.f1343d, this.f1348i + this.f1344e);
    }

    public String getGroupName() {
        return this.f1350k;
    }

    public Matrix getLocalMatrix() {
        return this.f1349j;
    }

    public float getPivotX() {
        return this.f1343d;
    }

    public float getPivotY() {
        return this.f1344e;
    }

    public float getRotation() {
        return this.f1342c;
    }

    public float getScaleX() {
        return this.f1345f;
    }

    public float getScaleY() {
        return this.f1346g;
    }

    public float getTranslateX() {
        return this.f1347h;
    }

    public float getTranslateY() {
        return this.f1348i;
    }

    public void setPivotX(float f) {
        if (f != this.f1343d) {
            this.f1343d = f;
            m882c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f1344e) {
            this.f1344e = f;
            m882c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f1342c) {
            this.f1342c = f;
            m882c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f1345f) {
            this.f1345f = f;
            m882c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f1346g) {
            this.f1346g = f;
            m882c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f1347h) {
            this.f1347h = f;
            m882c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f1348i) {
            this.f1348i = f;
            m882c();
        }
    }

    public d90(d90 d90Var, C0511n6 c0511n6) {
        f90 b90Var;
        this.f1340a = new Matrix();
        this.f1341b = new ArrayList();
        this.f1342c = 0.0f;
        this.f1343d = 0.0f;
        this.f1344e = 0.0f;
        this.f1345f = 1.0f;
        this.f1346g = 1.0f;
        this.f1347h = 0.0f;
        this.f1348i = 0.0f;
        Matrix matrix = new Matrix();
        this.f1349j = matrix;
        this.f1350k = null;
        this.f1342c = d90Var.f1342c;
        this.f1343d = d90Var.f1343d;
        this.f1344e = d90Var.f1344e;
        this.f1345f = d90Var.f1345f;
        this.f1346g = d90Var.f1346g;
        this.f1347h = d90Var.f1347h;
        this.f1348i = d90Var.f1348i;
        String str = d90Var.f1350k;
        this.f1350k = str;
        if (str != null) {
            c0511n6.put(str, this);
        }
        matrix.set(d90Var.f1349j);
        ArrayList arrayList = d90Var.f1341b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof d90) {
                this.f1341b.add(new d90((d90) obj, c0511n6));
            } else {
                if (obj instanceof c90) {
                    c90 c90Var = (c90) obj;
                    c90 c90Var2 = new c90(c90Var);
                    c90Var2.f840e = 0.0f;
                    c90Var2.f842g = 1.0f;
                    c90Var2.f843h = 1.0f;
                    c90Var2.f844i = 0.0f;
                    c90Var2.f845j = 1.0f;
                    c90Var2.f846k = 0.0f;
                    c90Var2.f847l = Paint.Cap.BUTT;
                    c90Var2.f848m = Paint.Join.MITER;
                    c90Var2.f849n = 4.0f;
                    c90Var2.f839d = c90Var.f839d;
                    c90Var2.f840e = c90Var.f840e;
                    c90Var2.f842g = c90Var.f842g;
                    c90Var2.f841f = c90Var.f841f;
                    c90Var2.f1775c = c90Var.f1775c;
                    c90Var2.f843h = c90Var.f843h;
                    c90Var2.f844i = c90Var.f844i;
                    c90Var2.f845j = c90Var.f845j;
                    c90Var2.f846k = c90Var.f846k;
                    c90Var2.f847l = c90Var.f847l;
                    c90Var2.f848m = c90Var.f848m;
                    c90Var2.f849n = c90Var.f849n;
                    b90Var = c90Var2;
                } else if (obj instanceof b90) {
                    b90Var = new b90((b90) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f1341b.add(b90Var);
                Object obj2 = b90Var.f1774b;
                if (obj2 != null) {
                    c0511n6.put(obj2, b90Var);
                }
            }
        }
    }
}
