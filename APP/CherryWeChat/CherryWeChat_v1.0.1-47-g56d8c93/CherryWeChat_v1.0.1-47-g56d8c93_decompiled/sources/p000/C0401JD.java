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

/* JADX INFO: renamed from: JD */
/* JADX INFO: loaded from: classes.dex */
public final class C0401JD {

    /* JADX INFO: renamed from: p */
    public static final Matrix f1349p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f1350a;

    /* JADX INFO: renamed from: b */
    public final Path f1351b;

    /* JADX INFO: renamed from: c */
    public final Matrix f1352c;

    /* JADX INFO: renamed from: d */
    public Paint f1353d;

    /* JADX INFO: renamed from: e */
    public Paint f1354e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f1355f;

    /* JADX INFO: renamed from: g */
    public final C0272GD f1356g;

    /* JADX INFO: renamed from: h */
    public float f1357h;

    /* JADX INFO: renamed from: i */
    public float f1358i;

    /* JADX INFO: renamed from: j */
    public float f1359j;

    /* JADX INFO: renamed from: k */
    public float f1360k;

    /* JADX INFO: renamed from: l */
    public int f1361l;

    /* JADX INFO: renamed from: m */
    public String f1362m;

    /* JADX INFO: renamed from: n */
    public Boolean f1363n;

    /* JADX INFO: renamed from: o */
    public final C0521M4 f1364o;

    public C0401JD() {
        this.f1352c = new Matrix();
        this.f1357h = 0.0f;
        this.f1358i = 0.0f;
        this.f1359j = 0.0f;
        this.f1360k = 0.0f;
        this.f1361l = 255;
        this.f1362m = null;
        this.f1363n = null;
        this.f1364o = new C0521M4(0);
        this.f1356g = new C0272GD();
        this.f1350a = new Path();
        this.f1351b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m836a(C0272GD c0272gd, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = c0272gd.f879a;
        ArrayList arrayList = c0272gd.f880b;
        matrix2.set(matrix);
        Matrix matrix3 = c0272gd.f879a;
        matrix3.preConcat(c0272gd.f888j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC0315HD abstractC0315HD = (AbstractC0315HD) arrayList.get(i5);
            if (abstractC0315HD instanceof C0272GD) {
                m836a((C0272GD) abstractC0315HD, matrix3, canvas, i, i2);
            } else if (abstractC0315HD instanceof AbstractC0358ID) {
                AbstractC0358ID abstractC0358ID = (AbstractC0358ID) abstractC0315HD;
                float f3 = i / this.f1359j;
                float f4 = i2 / this.f1360k;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.f1352c;
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
                    Path path = this.f1350a;
                    path.reset();
                    C0552Mt[] c0552MtArr = abstractC0358ID.f1222a;
                    if (c0552MtArr != null) {
                        C0552Mt.m1095b(c0552MtArr, path);
                    }
                    Path path2 = this.f1351b;
                    path2.reset();
                    if (abstractC0358ID instanceof C0186ED) {
                        path2.setFillType(abstractC0358ID.f1224c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0229FD c0229fd = (C0229FD) abstractC0358ID;
                        float f6 = c0229fd.f677i;
                        if (f6 != 0.0f || c0229fd.f678j != 1.0f) {
                            float f7 = c0229fd.f679k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c0229fd.f678j + f7) % 1.0f;
                            if (this.f1355f == null) {
                                this.f1355f = new PathMeasure();
                            }
                            this.f1355f.setPath(path, z);
                            float length = this.f1355f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.f1355f.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f1355f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                this.f1355f.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        C0477L3 c0477l3 = c0229fd.f674f;
                        if (((Shader) c0477l3.f1575c) == null && c0477l3.f1574b == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.f1354e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f1354e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f1354e;
                            Shader shader = (Shader) c0477l3.f1575c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0229fd.f676h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = c0477l3.f1574b;
                                float f12 = c0229fd.f676h;
                                PorterDuff.Mode mode = C0530MD.f1726j;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0229fd.f1224c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0477L3 c0477l32 = c0229fd.f672d;
                        if (((Shader) c0477l32.f1575c) != null || c0477l32.f1574b != 0) {
                            if (this.f1353d == null) {
                                Paint paint3 = new Paint(1);
                                this.f1353d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f1353d;
                            Paint.Join join = c0229fd.f681m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0229fd.f680l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0229fd.f682n);
                            Shader shader2 = (Shader) c0477l32.f1575c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0229fd.f675g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = c0477l32.f1574b;
                                float f13 = c0229fd.f675g;
                                PorterDuff.Mode mode2 = C0530MD.f1726j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0229fd.f673e * fMin * fAbs);
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
        return this.f1361l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f1361l = i;
    }

    public C0401JD(C0401JD c0401jd) {
        this.f1352c = new Matrix();
        this.f1357h = 0.0f;
        this.f1358i = 0.0f;
        this.f1359j = 0.0f;
        this.f1360k = 0.0f;
        this.f1361l = 255;
        this.f1362m = null;
        this.f1363n = null;
        C0521M4 c0521m4 = new C0521M4(0);
        this.f1364o = c0521m4;
        this.f1356g = new C0272GD(c0401jd.f1356g, c0521m4);
        this.f1350a = new Path(c0401jd.f1350a);
        this.f1351b = new Path(c0401jd.f1351b);
        this.f1357h = c0401jd.f1357h;
        this.f1358i = c0401jd.f1358i;
        this.f1359j = c0401jd.f1359j;
        this.f1360k = c0401jd.f1360k;
        this.f1361l = c0401jd.f1361l;
        this.f1362m = c0401jd.f1362m;
        String str = c0401jd.f1362m;
        if (str != null) {
            c0521m4.put(str, this);
        }
        this.f1363n = c0401jd.f1363n;
    }
}
