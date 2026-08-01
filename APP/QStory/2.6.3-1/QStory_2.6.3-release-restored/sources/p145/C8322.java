package p145;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.appcompat.widget.C0984;
import androidx.collection.C1104;
import com.android.p002dx.p005io.Opcodes;
import java.util.ArrayList;
import p180.C8493;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8322 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Matrix f20653 = new Matrix();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public PathMeasure f20654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Paint f20655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Paint f20656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Matrix f20657;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Path f20658;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Path f20659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public Boolean f20660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String f20661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C1104 f20662;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f20663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8330 f20664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f20665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f20666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f20667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f20668;

    public C8322(C8322 c8322) {
        this.f20657 = new Matrix();
        this.f20663 = 0.0f;
        this.f20667 = 0.0f;
        this.f20668 = 0.0f;
        this.f20665 = 0.0f;
        this.f20666 = Opcodes.CONST_METHOD_TYPE;
        this.f20661 = null;
        this.f20660 = null;
        C1104 c1104 = new C1104(0);
        this.f20662 = c1104;
        this.f20664 = new C8330(c8322.f20664, c1104);
        this.f20659 = new Path(c8322.f20659);
        this.f20658 = new Path(c8322.f20658);
        this.f20663 = c8322.f20663;
        this.f20667 = c8322.f20667;
        this.f20668 = c8322.f20668;
        this.f20665 = c8322.f20665;
        this.f20666 = c8322.f20666;
        this.f20661 = c8322.f20661;
        String str = c8322.f20661;
        if (str != null) {
            c1104.put(str, this);
        }
        this.f20660 = c8322.f20660;
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f20666;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f20666 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13277(C8330 c8330, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = c8330.f20699;
        ArrayList arrayList = c8330.f20698;
        matrix2.set(matrix);
        Matrix matrix3 = c8330.f20699;
        matrix3.preConcat(c8330.f20704);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC8327 abstractC8327 = (AbstractC8327) arrayList.get(i5);
            if (abstractC8327 instanceof C8330) {
                m13277((C8330) abstractC8327, matrix3, canvas, i, i2);
            } else if (abstractC8327 instanceof AbstractC8328) {
                AbstractC8328 abstractC8328 = (AbstractC8328) abstractC8327;
                float f3 = i / this.f20668;
                float f4 = i2 / this.f20665;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.f20657;
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
                    Path path = this.f20659;
                    path.reset();
                    C8493[] c8493Arr = abstractC8328.f20682;
                    if (c8493Arr != null) {
                        C8493.m13495(c8493Arr, path);
                    }
                    Path path2 = this.f20658;
                    path2.reset();
                    if (abstractC8328 instanceof C8325) {
                        path2.setFillType(abstractC8328.f20680 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C8329 c8329 = (C8329) abstractC8328;
                        float f6 = c8329.f20692;
                        if (f6 != 0.0f || c8329.f20693 != 1.0f) {
                            float f7 = c8329.f20690;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c8329.f20693 + f7) % 1.0f;
                            if (this.f20654 == null) {
                                this.f20654 = new PathMeasure();
                            }
                            this.f20654.setPath(path, z);
                            float length = this.f20654.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f20654;
                            if (f10 > f11) {
                                pathMeasure.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f20654.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        C0984 c0984 = c8329.f20683;
                        if (((Shader) c0984.f940) == null && c0984.f941 == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.f20655 == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f20655 = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f20655;
                            Shader shader = (Shader) c0984.f940;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c8329.f20688 * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(Opcodes.CONST_METHOD_TYPE);
                                int i6 = c0984.f941;
                                float f12 = c8329.f20688;
                                PorterDuff.Mode mode = C8324.f20670;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c8329.f20680 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0984 c09842 = c8329.f20685;
                        if (((Shader) c09842.f940) != null || c09842.f941 != 0) {
                            if (this.f20656 == null) {
                                Paint paint3 = new Paint(1);
                                this.f20656 = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f20656;
                            Paint.Join join = c8329.f20687;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c8329.f20691;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c8329.f20686);
                            Shader shader2 = (Shader) c09842.f940;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c8329.f20689 * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(Opcodes.CONST_METHOD_TYPE);
                                int i7 = c09842.f941;
                                float f13 = c8329.f20689;
                                PorterDuff.Mode mode2 = C8324.f20670;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c8329.f20684 * fMin * fAbs);
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

    public C8322() {
        this.f20657 = new Matrix();
        this.f20663 = 0.0f;
        this.f20667 = 0.0f;
        this.f20668 = 0.0f;
        this.f20665 = 0.0f;
        this.f20666 = Opcodes.CONST_METHOD_TYPE;
        this.f20661 = null;
        this.f20660 = null;
        this.f20662 = new C1104(0);
        this.f20664 = new C8330();
        this.f20659 = new Path();
        this.f20658 = new Path();
    }
}
