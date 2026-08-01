package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class h30 {

    /* JADX INFO: renamed from: a */
    public final p30[] f2204a = new p30[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f2205b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f2206c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f2207d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f2208e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f2209f = new Path();

    /* JADX INFO: renamed from: g */
    public final p30 f2210g = new p30();

    /* JADX INFO: renamed from: h */
    public final float[] f2211h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f2212i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f2213j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f2214k = new Path();

    /* JADX INFO: renamed from: l */
    public final boolean f2215l = true;

    public h30() {
        for (int i = 0; i < 4; i++) {
            this.f2204a[i] = new p30();
            this.f2205b[i] = new Matrix();
            this.f2206c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1337a(f30 f30Var, float f, RectF rectF, C0431l0 c0431l0, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        p30[] p30VarArr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.f2208e;
        path2.rewind();
        Path path3 = this.f2209f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.f2206c;
            fArr = this.f2211h;
            p30VarArr = this.f2204a;
            matrixArr2 = this.f2205b;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            InterfaceC0148de interfaceC0148de = i3 != 1 ? i3 != 2 ? i3 != 3 ? f30Var.f1880f : f30Var.f1879e : f30Var.f1882h : f30Var.f1881g;
            AbstractC0346ip abstractC0346ip = i3 != 1 ? i3 != 2 ? i3 != 3 ? f30Var.f1876b : f30Var.f1875a : f30Var.f1878d : f30Var.f1877c;
            p30 p30Var = p30VarArr[i3];
            abstractC0346ip.getClass();
            abstractC0346ip.mo1336w(p30Var, f, interfaceC0148de.mo940a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.f2207d;
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
            p30 p30Var2 = p30VarArr[i2];
            fArr[0] = p30Var2.f3657b;
            fArr[1] = p30Var2.f3658c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            p30 p30Var3 = p30VarArr[i5];
            p30Var3.getClass();
            fArr[c] = 0.0f;
            fArr[1] = p30Var3.f3656a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[c], fArr[1]);
            } else {
                path.lineTo(fArr[c], fArr[1]);
            }
            p30VarArr[i5].m2033b(matrixArr2[i5], path);
            if (c0431l0 != null) {
                p30 p30Var4 = p30VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                C0200eu c0200eu = (C0200eu) c0431l0.f2980b;
                f2 = 0.0f;
                BitSet bitSet = c0200eu.f1845d;
                p30Var4.getClass();
                bitSet.set(i5, (boolean) c);
                o30[] o30VarArr = c0200eu.f1843b;
                p30Var4.m2032a(p30Var4.f3660e);
                o30VarArr[i5] = new i30(new ArrayList(p30Var4.f3662g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            p30 p30Var5 = p30VarArr[i5];
            fArr[0] = p30Var5.f3657b;
            fArr[1] = p30Var5.f3658c;
            matrixArr2[i5].mapPoints(fArr);
            p30 p30Var6 = p30VarArr[i7];
            p30Var6.getClass();
            float[] fArr2 = this.f2212i;
            fArr2[0] = f2;
            fArr2[1] = p30Var6.f3656a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            p30[] p30VarArr2 = p30VarArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            p30 p30Var7 = p30VarArr2[i5];
            fArr[0] = p30Var7.f3657b;
            fArr[1] = p30Var7.f3658c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            p30 p30Var8 = this.f2210g;
            p30Var8.m2035d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? f30Var.f1884j : f30Var.f1883i : f30Var.f1886l : f30Var.f1885k).getClass();
            p30Var8.m2034c(fMax, 0.0f);
            Path path4 = this.f2213j;
            path4.reset();
            p30Var8.m2033b(matrixArr3[i5], path4);
            if (this.f2215l && (m1338b(path4, i5) || m1338b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = p30Var8.f3656a;
                matrixArr3[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                p30Var8.m2033b(matrixArr3[i5], path2);
            } else {
                p30Var8.m2033b(matrixArr3[i5], path);
            }
            if (c0431l0 != null) {
                Matrix matrix2 = matrixArr3[i5];
                C0200eu c0200eu2 = (C0200eu) c0431l0.f2980b;
                c2 = 0;
                c0200eu2.f1845d.set(i5 + 4, false);
                o30[] o30VarArr2 = c0200eu2.f1844c;
                p30Var8.m2032a(p30Var8.f3660e);
                o30VarArr2[i5] = new i30(new ArrayList(p30Var8.f3662g), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            i5 = i6;
            c = c2;
            p30VarArr = p30VarArr2;
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
    public final boolean m1338b(Path path, int i) {
        Path path2 = this.f2214k;
        path2.reset();
        this.f2204a[i].m2033b(this.f2205b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
