package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: Sx */
/* JADX INFO: loaded from: classes.dex */
public final class C0813Sx {

    /* JADX INFO: renamed from: a */
    public final C1195ay[] f2567a = new C1195ay[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f2568b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f2569c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f2570d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f2571e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f2572f = new Path();

    /* JADX INFO: renamed from: g */
    public final C1195ay f2573g = new C1195ay();

    /* JADX INFO: renamed from: h */
    public final float[] f2574h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f2575i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f2576j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f2577k = new Path();

    /* JADX INFO: renamed from: l */
    public final boolean f2578l = true;

    public C0813Sx() {
        for (int i = 0; i < 4; i++) {
            this.f2567a[i] = new C1195ay();
            this.f2568b[i] = new Matrix();
            this.f2569c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1615a(C0728Qx c0728Qx, float[] fArr, float f, RectF rectF, C0892Uq c0892Uq, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        C1195ay[] c1195ayArr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.f2571e;
        path2.rewind();
        Path path3 = this.f2572f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.f2569c;
            fArr2 = this.f2574h;
            c1195ayArr = this.f2567a;
            matrixArr2 = this.f2568b;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            InterfaceC1006Xb c2704x9 = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? c0728Qx.f2329f : c0728Qx.f2328e : c0728Qx.f2331h : c0728Qx.f2330g : new C2704x9(fArr[i3]);
            AbstractC0828TB abstractC0828TB = i3 != 1 ? i3 != 2 ? i3 != 3 ? c0728Qx.f2325b : c0728Qx.f2324a : c0728Qx.f2327d : c0728Qx.f2326c;
            C1195ay c1195ay = c1195ayArr[i3];
            abstractC0828TB.getClass();
            abstractC0828TB.mo1382k(c1195ay, f, c2704x9.mo1563a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.f2570d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            C1195ay c1195ay2 = c1195ayArr[i2];
            fArr2[0] = c1195ay2.f4098b;
            fArr2[1] = c1195ay2.f4099c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            C1195ay c1195ay3 = c1195ayArr[i5];
            c1195ay3.getClass();
            fArr2[c] = 0.0f;
            fArr2[1] = c1195ay3.f4097a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[c], fArr2[1]);
            } else {
                path.lineTo(fArr2[c], fArr2[1]);
            }
            c1195ayArr[i5].m2310b(matrixArr2[i5], path);
            if (c0892Uq != null) {
                C1195ay c1195ay4 = c1195ayArr[i5];
                Matrix matrix = matrixArr2[i5];
                C1021Xq c1021Xq = c0892Uq.f2786a;
                f2 = 0.0f;
                BitSet bitSet = c1021Xq.f3244e;
                c1195ay4.getClass();
                bitSet.set(i5, (boolean) c);
                AbstractC1114Zx[] abstractC1114ZxArr = c1021Xq.f3242c;
                c1195ay4.m2309a(c1195ay4.f4101e);
                abstractC1114ZxArr[i5] = new C0856Tx(new ArrayList(c1195ay4.f4103g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C1195ay c1195ay5 = c1195ayArr[i5];
            fArr2[0] = c1195ay5.f4098b;
            fArr2[1] = c1195ay5.f4099c;
            matrixArr2[i5].mapPoints(fArr2);
            C1195ay c1195ay6 = c1195ayArr[i7];
            c1195ay6.getClass();
            float[] fArr3 = this.f2575i;
            fArr3[0] = f2;
            fArr3[1] = c1195ay6.f4097a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            C1195ay[] c1195ayArr2 = c1195ayArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            C1195ay c1195ay7 = c1195ayArr2[i5];
            fArr2[0] = c1195ay7.f4098b;
            fArr2[1] = c1195ay7.f4099c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            C1195ay c1195ay8 = this.f2573g;
            c1195ay8.m2312d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c0728Qx.f2333j : c0728Qx.f2332i : c0728Qx.f2335l : c0728Qx.f2334k).getClass();
            c1195ay8.m2311c(fMax, 0.0f);
            Path path4 = this.f2576j;
            path4.reset();
            c1195ay8.m2310b(matrixArr3[i5], path4);
            if (this.f2578l && (m1616b(path4, i5) || m1616b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = c1195ay8.f4097a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                c1195ay8.m2310b(matrixArr3[i5], path2);
            } else {
                c1195ay8.m2310b(matrixArr3[i5], path);
            }
            if (c0892Uq != null) {
                Matrix matrix2 = matrixArr3[i5];
                C1021Xq c1021Xq2 = c0892Uq.f2786a;
                c2 = 0;
                c1021Xq2.f3244e.set(i5 + 4, false);
                AbstractC1114Zx[] abstractC1114ZxArr2 = c1021Xq2.f3243d;
                c1195ay8.m2309a(c1195ay8.f4101e);
                abstractC1114ZxArr2[i5] = new C0856Tx(new ArrayList(c1195ay8.f4103g), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            c = c2;
            c1195ayArr = c1195ayArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1616b(Path path, int i) {
        Path path2 = this.f2577k;
        path2.reset();
        this.f2567a[i].m2310b(this.f2568b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
