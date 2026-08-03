package p000a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p000a.C0354Ta;

/* JADX INFO: renamed from: a.Wd */
/* JADX INFO: loaded from: classes.dex */
public final class C0411Wd {

    /* JADX INFO: renamed from: a */
    public final C0447Yd[] f1560a = new C0447Yd[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f1561b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f1562c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f1563d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f1564e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f1565f = new Path();

    /* JADX INFO: renamed from: g */
    public final C0447Yd f1566g = new C0447Yd();

    /* JADX INFO: renamed from: h */
    public final float[] f1567h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f1568i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f1569j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f1570k = new Path();

    /* JADX INFO: renamed from: l */
    public final boolean f1571l = true;

    /* JADX INFO: renamed from: a.Wd$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C0411Wd f1572a = new C0411Wd();
    }

    public C0411Wd() {
        for (int i = 0; i < 4; i++) {
            this.f1560a[i] = new C0447Yd();
            this.f1561b[i] = new Matrix();
            this.f1562c[i] = new Matrix();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1055a(C0393Vd c0393Vd, float f, RectF rectF, C0354Ta.a aVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C0447Yd[] c0447YdArr;
        int i;
        char c;
        float[] fArr;
        float f2;
        char c2;
        int i2;
        C0411Wd c0411Wd = this;
        path.rewind();
        Path path2 = c0411Wd.f1564e;
        path2.rewind();
        Path path3 = c0411Wd.f1565f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = c0411Wd.f1562c;
            matrixArr2 = c0411Wd.f1561b;
            c0447YdArr = c0411Wd.f1560a;
            i = 4;
            c = 0;
            fArr = c0411Wd.f1567h;
            if (i3 >= 4) {
                break;
            }
            InterfaceC0892w4 interfaceC0892w4 = i3 != 1 ? i3 != 2 ? i3 != 3 ? c0393Vd.f1487f : c0393Vd.f1486e : c0393Vd.f1489h : c0393Vd.f1488g;
            C0889w1 c0889w1 = i3 != 1 ? i3 != 2 ? i3 != 3 ? c0393Vd.f1483b : c0393Vd.f1482a : c0393Vd.f1485d : c0393Vd.f1484c;
            C0447Yd c0447Yd = c0447YdArr[i3];
            c0889w1.getClass();
            c0889w1.mo44z(c0447Yd, f, interfaceC0892w4.mo1073a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = c0411Wd.f1563d;
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
            C0447Yd c0447Yd2 = c0447YdArr[i2];
            fArr[0] = c0447Yd2.f1664b;
            fArr[1] = c0447Yd2.f1665c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        while (i5 < i) {
            C0447Yd c0447Yd3 = c0447YdArr[i5];
            c0447Yd3.getClass();
            fArr[c] = 0.0f;
            fArr[1] = c0447Yd3.f1663a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[c], fArr[1]);
            } else {
                path.lineTo(fArr[c], fArr[1]);
            }
            c0447YdArr[i5].m1105b(matrixArr2[i5], path);
            if (aVar != null) {
                C0447Yd c0447Yd4 = c0447YdArr[i5];
                Matrix matrix = matrixArr2[i5];
                C0354Ta c0354Ta = C0354Ta.this;
                BitSet bitSet = c0354Ta.f1313d;
                c0447Yd4.getClass();
                f2 = 0.0f;
                bitSet.set(i5, (boolean) c);
                c0447Yd4.m1104a(c0447Yd4.f1667e);
                c0354Ta.f1311b[i5] = new C0429Xd(new ArrayList(c0447Yd4.f1669g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C0447Yd c0447Yd5 = c0447YdArr[i5];
            fArr[0] = c0447Yd5.f1664b;
            fArr[1] = c0447Yd5.f1665c;
            matrixArr2[i5].mapPoints(fArr);
            C0447Yd c0447Yd6 = c0447YdArr[i7];
            c0447Yd6.getClass();
            float[] fArr2 = c0411Wd.f1568i;
            fArr2[0] = f2;
            fArr2[1] = c0447Yd6.f1663a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            C0447Yd[] c0447YdArr2 = c0447YdArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            C0447Yd c0447Yd7 = c0447YdArr2[i5];
            fArr[0] = c0447Yd7.f1664b;
            fArr[1] = c0447Yd7.f1665c;
            matrixArr3[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C0447Yd c0447Yd8 = c0411Wd.f1566g;
            c0447Yd8.m1107d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c0393Vd.f1491j : c0393Vd.f1490i : c0393Vd.f1493l : c0393Vd.f1492k).getClass();
            c0447Yd8.m1106c(fMax, 0.0f);
            Path path4 = c0411Wd.f1569j;
            path4.reset();
            c0447Yd8.m1105b(matrixArr[i5], path4);
            if (c0411Wd.f1571l && (c0411Wd.m1056b(path4, i5) || c0411Wd.m1056b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c0447Yd8.f1663a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0447Yd8.m1105b(matrixArr[i5], path2);
            } else {
                c0447Yd8.m1105b(matrixArr[i5], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr[i5];
                C0354Ta c0354Ta2 = C0354Ta.this;
                c2 = 0;
                c0354Ta2.f1313d.set(i5 + 4, false);
                c0447Yd8.m1104a(c0447Yd8.f1667e);
                c0354Ta2.f1312c[i5] = new C0429Xd(new ArrayList(c0447Yd8.f1669g), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            c = c2;
            i5 = i6;
            c0447YdArr = c0447YdArr2;
            matrixArr2 = matrixArr3;
            i = 4;
            c0411Wd = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1056b(Path path, int i) {
        Path path2 = this.f1570k;
        path2.reset();
        this.f1560a[i].m1105b(this.f1561b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
