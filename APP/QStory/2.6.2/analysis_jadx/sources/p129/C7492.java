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
import p164.C7663;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Matrix f20313 = new Matrix();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public PathMeasure f20314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Paint f20315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Paint f20316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Matrix f20317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Path f20318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Path f20319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public Boolean f20320;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String f20321;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0257 f20322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f20323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7500 f20324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f20325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20326;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f20327;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f20328;

    public C7492(C7492 c7492) {
        this.f20317 = new Matrix();
        this.f20323 = 0.0f;
        this.f20327 = 0.0f;
        this.f20328 = 0.0f;
        this.f20325 = 0.0f;
        this.f20326 = Opcodes.CONST_METHOD_TYPE;
        this.f20321 = null;
        this.f20320 = null;
        C0257 c0257 = new C0257(0);
        this.f20322 = c0257;
        this.f20324 = new C7500(c7492.f20324, c0257);
        this.f20319 = new Path(c7492.f20319);
        this.f20318 = new Path(c7492.f20318);
        this.f20323 = c7492.f20323;
        this.f20327 = c7492.f20327;
        this.f20328 = c7492.f20328;
        this.f20325 = c7492.f20325;
        this.f20326 = c7492.f20326;
        this.f20321 = c7492.f20321;
        String str = c7492.f20321;
        if (str != null) {
            c0257.put(str, this);
        }
        this.f20320 = c7492.f20320;
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f20326;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f20326 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12689(C7500 c7500, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = c7500.f20359;
        ArrayList arrayList = c7500.f20358;
        matrix2.set(matrix);
        Matrix matrix3 = c7500.f20359;
        matrix3.preConcat(c7500.f20364);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC7497 abstractC7497 = (AbstractC7497) arrayList.get(i5);
            if (abstractC7497 instanceof C7500) {
                m12689((C7500) abstractC7497, matrix3, canvas, i, i2);
            } else if (abstractC7497 instanceof AbstractC7498) {
                AbstractC7498 abstractC7498 = (AbstractC7498) abstractC7497;
                float f3 = i / this.f20328;
                float f4 = i2 / this.f20325;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.f20317;
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
                    Path path = this.f20319;
                    path.reset();
                    C7663[] c7663Arr = abstractC7498.f20342;
                    if (c7663Arr != null) {
                        C7663.m12907(c7663Arr, path);
                    }
                    Path path2 = this.f20318;
                    path2.reset();
                    if (abstractC7498 instanceof C7495) {
                        path2.setFillType(abstractC7498.f20340 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C7499 c7499 = (C7499) abstractC7498;
                        float f6 = c7499.f20352;
                        if (f6 != 0.0f || c7499.f20353 != 1.0f) {
                            float f7 = c7499.f20350;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c7499.f20353 + f7) % 1.0f;
                            if (this.f20314 == null) {
                                this.f20314 = new PathMeasure();
                            }
                            this.f20314.setPath(path, z);
                            float length = this.f20314.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f20314;
                            if (f10 > f11) {
                                pathMeasure.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f20314.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        C0137 c0137 = c7499.f20343;
                        if (((Shader) c0137.f595) == null && c0137.f596 == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.f20315 == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f20315 = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f20315;
                            Shader shader = (Shader) c0137.f595;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c7499.f20348 * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(Opcodes.CONST_METHOD_TYPE);
                                int i6 = c0137.f596;
                                float f12 = c7499.f20348;
                                PorterDuff.Mode mode = C7494.f20330;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c7499.f20340 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0137 c01372 = c7499.f20345;
                        if (((Shader) c01372.f595) != null || c01372.f596 != 0) {
                            if (this.f20316 == null) {
                                Paint paint3 = new Paint(1);
                                this.f20316 = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f20316;
                            Paint.Join join = c7499.f20347;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c7499.f20351;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c7499.f20346);
                            Shader shader2 = (Shader) c01372.f595;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c7499.f20349 * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(Opcodes.CONST_METHOD_TYPE);
                                int i7 = c01372.f596;
                                float f13 = c7499.f20349;
                                PorterDuff.Mode mode2 = C7494.f20330;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c7499.f20344 * fMin * fAbs);
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

    public C7492() {
        this.f20317 = new Matrix();
        this.f20323 = 0.0f;
        this.f20327 = 0.0f;
        this.f20328 = 0.0f;
        this.f20325 = 0.0f;
        this.f20326 = Opcodes.CONST_METHOD_TYPE;
        this.f20321 = null;
        this.f20320 = null;
        this.f20322 = new C0257(0);
        this.f20324 = new C7500();
        this.f20319 = new Path();
        this.f20318 = new Path();
    }
}
