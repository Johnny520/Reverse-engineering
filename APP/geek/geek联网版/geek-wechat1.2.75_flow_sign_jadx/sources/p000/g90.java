package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g90 {

    /* JADX INFO: renamed from: p */
    public static final Matrix f1930p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f1931a;

    /* JADX INFO: renamed from: b */
    public final Path f1932b;

    /* JADX INFO: renamed from: c */
    public final Matrix f1933c;

    /* JADX INFO: renamed from: d */
    public Paint f1934d;

    /* JADX INFO: renamed from: e */
    public Paint f1935e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f1936f;

    /* JADX INFO: renamed from: g */
    public final d90 f1937g;

    /* JADX INFO: renamed from: h */
    public float f1938h;

    /* JADX INFO: renamed from: i */
    public float f1939i;

    /* JADX INFO: renamed from: j */
    public float f1940j;

    /* JADX INFO: renamed from: k */
    public float f1941k;

    /* JADX INFO: renamed from: l */
    public int f1942l;

    /* JADX INFO: renamed from: m */
    public String f1943m;

    /* JADX INFO: renamed from: n */
    public Boolean f1944n;

    /* JADX INFO: renamed from: o */
    public final C0511n6 f1945o;

    public g90() {
        this.f1933c = new Matrix();
        this.f1938h = 0.0f;
        this.f1939i = 0.0f;
        this.f1940j = 0.0f;
        this.f1941k = 0.0f;
        this.f1942l = 255;
        this.f1943m = null;
        this.f1944n = null;
        this.f1945o = new C0511n6();
        this.f1937g = new d90();
        this.f1931a = new Path();
        this.f1932b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1220a(d90 d90Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = d90Var.f1340a;
        ArrayList arrayList = d90Var.f1341b;
        matrix2.set(matrix);
        Matrix matrix3 = d90Var.f1340a;
        matrix3.preConcat(d90Var.f1349j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            e90 e90Var = (e90) arrayList.get(i5);
            if (e90Var instanceof d90) {
                m1220a((d90) e90Var, matrix3, canvas, i, i2);
            } else if (e90Var instanceof f90) {
                f90 f90Var = (f90) e90Var;
                float f3 = i / this.f1940j;
                float f4 = i2 / this.f1941k;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.f1933c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f1931a;
                    path.reset();
                    C0872wx[] c0872wxArr = f90Var.f1773a;
                    if (c0872wxArr != null) {
                        C0872wx.m2625b(c0872wxArr, path);
                    }
                    Path path2 = this.f1932b;
                    path2.reset();
                    if (f90Var instanceof b90) {
                        path2.setFillType(f90Var.f1775c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        c90 c90Var = (c90) f90Var;
                        float f6 = c90Var.f844i;
                        if (f6 != 0.0f || c90Var.f845j != 1.0f) {
                            float f7 = c90Var.f846k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c90Var.f845j + f7) % 1.0f;
                            if (this.f1936f == null) {
                                this.f1936f = new PathMeasure();
                            }
                            this.f1936f.setPath(path, z);
                            float length = this.f1936f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.f1936f.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f1936f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                this.f1936f.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        C0953z3 c0953z3 = c90Var.f841f;
                        if (((Shader) c0953z3.f5536b) == null && c0953z3.f5535a == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.f1935e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f1935e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f1935e;
                            Shader shader = (Shader) c0953z3.f5536b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c90Var.f843h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = c0953z3.f5535a;
                                float f12 = c90Var.f843h;
                                PorterDuff.Mode mode = j90.f2681j;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c90Var.f1775c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0953z3 c0953z32 = c90Var.f839d;
                        if (((Shader) c0953z32.f5536b) != null || c0953z32.f5535a != 0) {
                            if (this.f1934d == null) {
                                Paint paint3 = new Paint(1);
                                this.f1934d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f1934d;
                            Paint.Join join = c90Var.f848m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c90Var.f847l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c90Var.f849n);
                            Shader shader2 = (Shader) c0953z32.f5536b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c90Var.f842g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = c0953z32.f5535a;
                                float f13 = c90Var.f842g;
                                PorterDuff.Mode mode2 = j90.f2681j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c90Var.f840e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1942l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f1942l = i;
    }

    public g90(g90 g90Var) {
        this.f1933c = new Matrix();
        this.f1938h = 0.0f;
        this.f1939i = 0.0f;
        this.f1940j = 0.0f;
        this.f1941k = 0.0f;
        this.f1942l = 255;
        this.f1943m = null;
        this.f1944n = null;
        C0511n6 c0511n6 = new C0511n6();
        this.f1945o = c0511n6;
        this.f1937g = new d90(g90Var.f1937g, c0511n6);
        this.f1931a = new Path(g90Var.f1931a);
        this.f1932b = new Path(g90Var.f1932b);
        this.f1938h = g90Var.f1938h;
        this.f1939i = g90Var.f1939i;
        this.f1940j = g90Var.f1940j;
        this.f1941k = g90Var.f1941k;
        this.f1942l = g90Var.f1942l;
        this.f1943m = g90Var.f1943m;
        String str = g90Var.f1943m;
        if (str != null) {
            c0511n6.put(str, this);
        }
        this.f1944n = g90Var.f1944n;
    }
}
