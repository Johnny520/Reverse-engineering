package p089x0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.abc.core.runtime.AbstractC0805P;
import java.util.ArrayList;
import java.util.BitSet;
import p006D.C0095d;

/* JADX INFO: renamed from: x0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1129m {

    /* JADX INFO: renamed from: a */
    public final C1137u[] f4360a = new C1137u[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f4361b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f4362c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f4363d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f4364e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f4365f = new Path();

    /* JADX INFO: renamed from: g */
    public final C1137u f4366g = new C1137u();

    /* JADX INFO: renamed from: h */
    public final float[] f4367h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f4368i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f4369j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f4370k = new Path();

    /* JADX INFO: renamed from: l */
    public final boolean f4371l = true;

    public C1129m() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f4360a[i2] = new C1137u();
            this.f4361b[i2] = new Matrix();
            this.f4362c[i2] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2661a(C1127k c1127k, float f2, RectF rectF, C0095d c0095d, Path path) {
        int i2;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C1137u[] c1137uArr;
        int i3;
        C1129m c1129m = this;
        path.rewind();
        Path path2 = c1129m.f4364e;
        path2.rewind();
        Path path3 = c1129m.f4365f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            i2 = 4;
            matrixArr = c1129m.f4362c;
            fArr = c1129m.f4367h;
            matrixArr2 = c1129m.f4361b;
            c1137uArr = c1129m.f4360a;
            if (i4 >= 4) {
                break;
            }
            InterfaceC1119c interfaceC1119c = i4 != 1 ? i4 != 2 ? i4 != 3 ? c1127k.f4352f : c1127k.f4351e : c1127k.f4354h : c1127k.f4353g;
            AbstractC0805P abstractC0805P = i4 != 1 ? i4 != 2 ? i4 != 3 ? c1127k.f4348b : c1127k.f4347a : c1127k.f4350d : c1127k.f4349c;
            C1137u c1137u = c1137uArr[i4];
            abstractC0805P.getClass();
            abstractC0805P.mo2074s(c1137u, f2, interfaceC1119c.mo2634a(rectF));
            int i5 = i4 + 1;
            float f3 = (i5 % 4) * 90;
            matrixArr2[i4].reset();
            PointF pointF = c1129m.f4363d;
            if (i4 == 1) {
                i3 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i4 == 2) {
                i3 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i4 != 3) {
                i3 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i3 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f3);
            C1137u c1137u2 = c1137uArr[i4];
            fArr[0] = c1137u2.f4392c;
            fArr[1] = c1137u2.f4393d;
            matrixArr2[i4].mapPoints(fArr);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr[0], fArr[1]);
            matrixArr[i4].preRotate(f3);
            i4 = i3;
        }
        int i6 = 0;
        while (i6 < i2) {
            C1137u c1137u3 = c1137uArr[i6];
            fArr[0] = c1137u3.f4390a;
            fArr[1] = c1137u3.f4391b;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c1137uArr[i6].m2667b(matrixArr2[i6], path);
            if (c0095d != null) {
                C1137u c1137u4 = c1137uArr[i6];
                Matrix matrix = matrixArr2[i6];
                C1123g c1123g = (C1123g) c0095d.f251b;
                BitSet bitSet = c1123g.f4315d;
                c1137u4.getClass();
                bitSet.set(i6, false);
                c1137u4.m2666a(c1137u4.f4395f);
                c1123g.f4313b[i6] = new C1130n(new ArrayList(c1137u4.f4397h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            C1137u c1137u5 = c1137uArr[i6];
            fArr[0] = c1137u5.f4392c;
            fArr[1] = c1137u5.f4393d;
            matrixArr2[i6].mapPoints(fArr);
            C1137u c1137u6 = c1137uArr[i8];
            float f4 = c1137u6.f4390a;
            float[] fArr2 = c1129m.f4368i;
            fArr2[0] = f4;
            fArr2[1] = c1137u6.f4391b;
            matrixArr2[i8].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C1137u c1137u7 = c1137uArr[i6];
            fArr[0] = c1137u7.f4392c;
            fArr[1] = c1137u7.f4393d;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C1137u c1137u8 = c1129m.f4366g;
            c1137u8.m2669d(0.0f, 270.0f, 0.0f);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? c1127k.f4356j : c1127k.f4355i : c1127k.f4358l : c1127k.f4357k).getClass();
            c1137u8.m2668c(fMax, 0.0f);
            Path path4 = c1129m.f4369j;
            path4.reset();
            c1137u8.m2667b(matrixArr[i6], path4);
            if (c1129m.f4371l && (c1129m.m2662b(path4, i6) || c1129m.m2662b(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c1137u8.f4390a;
                fArr[1] = c1137u8.f4391b;
                matrixArr[i6].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c1137u8.m2667b(matrixArr[i6], path2);
            } else {
                c1137u8.m2667b(matrixArr[i6], path);
            }
            if (c0095d != null) {
                Matrix matrix2 = matrixArr[i6];
                C1123g c1123g2 = (C1123g) c0095d.f251b;
                c1123g2.f4315d.set(i6 + 4, false);
                c1137u8.m2666a(c1137u8.f4395f);
                c1123g2.f4314c[i6] = new C1130n(new ArrayList(c1137u8.f4397h), new Matrix(matrix2));
            }
            i2 = 4;
            c1129m = this;
            i6 = i7;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2662b(Path path, int i2) {
        Path path2 = this.f4370k;
        path2.reset();
        this.f4360a[i2].m2667b(this.f4361b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
