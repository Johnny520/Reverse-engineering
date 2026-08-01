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
public final class b90 {

    /* JADX INFO: renamed from: p */
    public static final Matrix f787p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f788a;

    /* JADX INFO: renamed from: b */
    public final Path f789b;

    /* JADX INFO: renamed from: c */
    public final Matrix f790c;

    /* JADX INFO: renamed from: d */
    public Paint f791d;

    /* JADX INFO: renamed from: e */
    public Paint f792e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f793f;

    /* JADX INFO: renamed from: g */
    public final y80 f794g;

    /* JADX INFO: renamed from: h */
    public float f795h;

    /* JADX INFO: renamed from: i */
    public float f796i;

    /* JADX INFO: renamed from: j */
    public float f797j;

    /* JADX INFO: renamed from: k */
    public float f798k;

    /* JADX INFO: renamed from: l */
    public int f799l;

    /* JADX INFO: renamed from: m */
    public String f800m;

    /* JADX INFO: renamed from: n */
    public Boolean f801n;

    /* JADX INFO: renamed from: o */
    public final C0511n6 f802o;

    public b90() {
        this.f790c = new Matrix();
        this.f795h = 0.0f;
        this.f796i = 0.0f;
        this.f797j = 0.0f;
        this.f798k = 0.0f;
        this.f799l = 255;
        this.f800m = null;
        this.f801n = null;
        this.f802o = new C0511n6();
        this.f794g = new y80();
        this.f788a = new Path();
        this.f789b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m548a(y80 y80Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = y80Var.f5290a;
        ArrayList arrayList = y80Var.f5291b;
        matrix2.set(matrix);
        Matrix matrix3 = y80Var.f5290a;
        matrix3.preConcat(y80Var.f5299j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            z80 z80Var = (z80) arrayList.get(i5);
            if (z80Var instanceof y80) {
                m548a((y80) z80Var, matrix3, canvas, i, i2);
            } else if (z80Var instanceof a90) {
                a90 a90Var = (a90) z80Var;
                float f3 = i / this.f797j;
                float f4 = i2 / this.f798k;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.f790c;
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
                    Path path = this.f788a;
                    path.reset();
                    C0575ox[] c0575oxArr = a90Var.f97a;
                    if (c0575oxArr != null) {
                        C0575ox.m2027b(c0575oxArr, path);
                    }
                    Path path2 = this.f789b;
                    path2.reset();
                    if (a90Var instanceof w80) {
                        path2.setFillType(a90Var.f99c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        x80 x80Var = (x80) a90Var;
                        float f6 = x80Var.f5130i;
                        if (f6 != 0.0f || x80Var.f5131j != 1.0f) {
                            float f7 = x80Var.f5132k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (x80Var.f5131j + f7) % 1.0f;
                            if (this.f793f == null) {
                                this.f793f = new PathMeasure();
                            }
                            this.f793f.setPath(path, z);
                            float length = this.f793f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.f793f.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f793f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                this.f793f.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        C0953z3 c0953z3 = x80Var.f5127f;
                        if (((Shader) c0953z3.f5447b) == null && c0953z3.f5446a == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.f792e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f792e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f792e;
                            Shader shader = (Shader) c0953z3.f5447b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(x80Var.f5129h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = c0953z3.f5446a;
                                float f12 = x80Var.f5129h;
                                PorterDuff.Mode mode = e90.f1756j;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(x80Var.f99c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0953z3 c0953z32 = x80Var.f5125d;
                        if (((Shader) c0953z32.f5447b) != null || c0953z32.f5446a != 0) {
                            if (this.f791d == null) {
                                Paint paint3 = new Paint(1);
                                this.f791d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f791d;
                            Paint.Join join = x80Var.f5134m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = x80Var.f5133l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(x80Var.f5135n);
                            Shader shader2 = (Shader) c0953z32.f5447b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(x80Var.f5128g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = c0953z32.f5446a;
                                float f13 = x80Var.f5128g;
                                PorterDuff.Mode mode2 = e90.f1756j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(x80Var.f5126e * fMin * fAbs);
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
        return this.f799l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f799l = i;
    }

    public b90(b90 b90Var) {
        this.f790c = new Matrix();
        this.f795h = 0.0f;
        this.f796i = 0.0f;
        this.f797j = 0.0f;
        this.f798k = 0.0f;
        this.f799l = 255;
        this.f800m = null;
        this.f801n = null;
        C0511n6 c0511n6 = new C0511n6();
        this.f802o = c0511n6;
        this.f794g = new y80(b90Var.f794g, c0511n6);
        this.f788a = new Path(b90Var.f788a);
        this.f789b = new Path(b90Var.f789b);
        this.f795h = b90Var.f795h;
        this.f796i = b90Var.f796i;
        this.f797j = b90Var.f797j;
        this.f798k = b90Var.f798k;
        this.f799l = b90Var.f799l;
        this.f800m = b90Var.f800m;
        String str = b90Var.f800m;
        if (str != null) {
            c0511n6.put(str, this);
        }
        this.f801n = b90Var.f801n;
    }
}
