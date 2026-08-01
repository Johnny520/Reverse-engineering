package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class o30 {

    /* JADX INFO: renamed from: a */
    public final w30[] f3366a = new w30[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f3367b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f3368c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f3369d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f3370e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f3371f = new Path();

    /* JADX INFO: renamed from: g */
    public final w30 f3372g = new w30();

    /* JADX INFO: renamed from: h */
    public final float[] f3373h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f3374i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f3375j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f3376k = new Path();

    /* JADX INFO: renamed from: l */
    public final boolean f3377l = true;

    public o30() {
        for (int i = 0; i < 4; i++) {
            this.f3366a[i] = new w30();
            this.f3367b[i] = new Matrix();
            this.f3368c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1970a(m30 m30Var, float f, RectF rectF, C0431l0 c0431l0, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        w30[] w30VarArr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.f3370e;
        path2.rewind();
        Path path3 = this.f3371f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.f3368c;
            fArr = this.f3373h;
            w30VarArr = this.f3366a;
            matrixArr2 = this.f3367b;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            InterfaceC0184ee interfaceC0184ee = i3 != 1 ? i3 != 2 ? i3 != 3 ? m30Var.f3066f : m30Var.f3065e : m30Var.f3068h : m30Var.f3067g;
            AbstractC0259gf abstractC0259gf = i3 != 1 ? i3 != 2 ? i3 != 3 ? m30Var.f3062b : m30Var.f3061a : m30Var.f3064d : m30Var.f3063c;
            w30 w30Var = w30VarArr[i3];
            abstractC0259gf.getClass();
            abstractC0259gf.mo50v(w30Var, f, interfaceC0184ee.mo943a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.f3369d;
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
            w30 w30Var2 = w30VarArr[i2];
            fArr[0] = w30Var2.f5055b;
            fArr[1] = w30Var2.f5056c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            w30 w30Var3 = w30VarArr[i5];
            w30Var3.getClass();
            fArr[c] = 0.0f;
            fArr[1] = w30Var3.f5054a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[c], fArr[1]);
            } else {
                path.lineTo(fArr[c], fArr[1]);
            }
            w30VarArr[i5].m2591b(matrixArr2[i5], path);
            if (c0431l0 != null) {
                w30 w30Var4 = w30VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                C0350iu c0350iu = (C0350iu) c0431l0.f2886b;
                f2 = 0.0f;
                BitSet bitSet = c0350iu.f2588d;
                w30Var4.getClass();
                bitSet.set(i5, (boolean) c);
                v30[] v30VarArr = c0350iu.f2586b;
                w30Var4.m2590a(w30Var4.f5058e);
                v30VarArr[i5] = new p30(new ArrayList(w30Var4.f5060g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            w30 w30Var5 = w30VarArr[i5];
            fArr[0] = w30Var5.f5055b;
            fArr[1] = w30Var5.f5056c;
            matrixArr2[i5].mapPoints(fArr);
            w30 w30Var6 = w30VarArr[i7];
            w30Var6.getClass();
            float[] fArr2 = this.f3374i;
            fArr2[0] = f2;
            fArr2[1] = w30Var6.f5054a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            w30[] w30VarArr2 = w30VarArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            w30 w30Var7 = w30VarArr2[i5];
            fArr[0] = w30Var7.f5055b;
            fArr[1] = w30Var7.f5056c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            w30 w30Var8 = this.f3372g;
            w30Var8.m2593d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? m30Var.f3070j : m30Var.f3069i : m30Var.f3072l : m30Var.f3071k).getClass();
            w30Var8.m2592c(fMax, 0.0f);
            Path path4 = this.f3375j;
            path4.reset();
            w30Var8.m2591b(matrixArr3[i5], path4);
            if (this.f3377l && (m1971b(path4, i5) || m1971b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = w30Var8.f5054a;
                matrixArr3[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                w30Var8.m2591b(matrixArr3[i5], path2);
            } else {
                w30Var8.m2591b(matrixArr3[i5], path);
            }
            if (c0431l0 != null) {
                Matrix matrix2 = matrixArr3[i5];
                C0350iu c0350iu2 = (C0350iu) c0431l0.f2886b;
                c2 = 0;
                c0350iu2.f2588d.set(i5 + 4, false);
                v30[] v30VarArr2 = c0350iu2.f2587c;
                w30Var8.m2590a(w30Var8.f5058e);
                v30VarArr2[i5] = new p30(new ArrayList(w30Var8.f5060g), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            i5 = i6;
            c = c2;
            w30VarArr = w30VarArr2;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1971b(Path path, int i) {
        Path path2 = this.f3376k;
        path2.reset();
        this.f3366a[i].m2591b(this.f3367b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
