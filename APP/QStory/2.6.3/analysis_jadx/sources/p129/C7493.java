package p129;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.appcompat.widget.C0137;
import androidx.collection.C0257;
import com.android.dx.io.Opcodes;
import java.util.ArrayList;
import p164.C7664;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Matrix f20308 = new Matrix();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public PathMeasure f20309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Paint f20310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Paint f20311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Matrix f20312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Path f20313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Path f20314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public Boolean f20315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String f20316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0257 f20317;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f20318;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7501 f20319;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f20320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f20322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f20323;

    public C7493(C7493 c7493) {
        this.f20312 = new Matrix();
        this.f20318 = 0.0f;
        this.f20322 = 0.0f;
        this.f20323 = 0.0f;
        this.f20320 = 0.0f;
        this.f20321 = Opcodes.CONST_METHOD_TYPE;
        this.f20316 = null;
        this.f20315 = null;
        C0257 c0257 = new C0257(0);
        this.f20317 = c0257;
        this.f20319 = new C7501(c7493.f20319, c0257);
        this.f20314 = new Path(c7493.f20314);
        this.f20313 = new Path(c7493.f20313);
        this.f20318 = c7493.f20318;
        this.f20322 = c7493.f20322;
        this.f20323 = c7493.f20323;
        this.f20320 = c7493.f20320;
        this.f20321 = c7493.f20321;
        this.f20316 = c7493.f20316;
        String str = c7493.f20316;
        if (str != null) {
            c0257.put(str, this);
        }
        this.f20315 = c7493.f20315;
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f20321;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f20321 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12718(C7501 c7501, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = c7501.f20354;
        ArrayList arrayList = c7501.f20353;
        matrix2.set(matrix);
        Matrix matrix3 = c7501.f20354;
        matrix3.preConcat(c7501.f20359);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC7498 abstractC7498 = (AbstractC7498) arrayList.get(i5);
            if (abstractC7498 instanceof C7501) {
                m12718((C7501) abstractC7498, matrix3, canvas, i, i2);
            } else if (abstractC7498 instanceof AbstractC7499) {
                AbstractC7499 abstractC7499 = (AbstractC7499) abstractC7498;
                float f3 = i / this.f20323;
                float f4 = i2 / this.f20320;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.f20312;
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
                    Path path = this.f20314;
                    path.reset();
                    C7664[] c7664Arr = abstractC7499.f20337;
                    if (c7664Arr != null) {
                        C7664.m12936(c7664Arr, path);
                    }
                    Path path2 = this.f20313;
                    path2.reset();
                    if (abstractC7499 instanceof C7496) {
                        path2.setFillType(abstractC7499.f20335 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C7500 c7500 = (C7500) abstractC7499;
                        float f6 = c7500.f20347;
                        if (f6 != 0.0f || c7500.f20348 != 1.0f) {
                            float f7 = c7500.f20345;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c7500.f20348 + f7) % 1.0f;
                            if (this.f20309 == null) {
                                this.f20309 = new PathMeasure();
                            }
                            this.f20309.setPath(path, z);
                            float length = this.f20309.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f20309;
                            if (f10 > f11) {
                                pathMeasure.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f20309.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        C0137 c0137 = c7500.f20338;
                        if (((Shader) c0137.f595) == null && c0137.f596 == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.f20310 == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f20310 = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f20310;
                            Shader shader = (Shader) c0137.f595;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c7500.f20343 * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(Opcodes.CONST_METHOD_TYPE);
                                int i6 = c0137.f596;
                                float f12 = c7500.f20343;
                                PorterDuff.Mode mode = C7495.f20325;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c7500.f20335 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0137 c01372 = c7500.f20340;
                        if (((Shader) c01372.f595) != null || c01372.f596 != 0) {
                            if (this.f20311 == null) {
                                Paint paint3 = new Paint(1);
                                this.f20311 = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f20311;
                            Paint.Join join = c7500.f20342;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c7500.f20346;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c7500.f20341);
                            Shader shader2 = (Shader) c01372.f595;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c7500.f20344 * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(Opcodes.CONST_METHOD_TYPE);
                                int i7 = c01372.f596;
                                float f13 = c7500.f20344;
                                PorterDuff.Mode mode2 = C7495.f20325;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c7500.f20339 * fMin * fAbs);
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

    public C7493() {
        this.f20312 = new Matrix();
        this.f20318 = 0.0f;
        this.f20322 = 0.0f;
        this.f20323 = 0.0f;
        this.f20320 = 0.0f;
        this.f20321 = Opcodes.CONST_METHOD_TYPE;
        this.f20316 = null;
        this.f20315 = null;
        this.f20317 = new C0257(0);
        this.f20319 = new C7501();
        this.f20314 = new Path();
        this.f20313 = new Path();
    }
}
