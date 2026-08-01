package p321;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import p034.AbstractC7082;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9467 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9449[] f24592 = new C9449[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Matrix[] f24591 = new Matrix[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Matrix[] f24590 = new Matrix[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final PointF f24589 = new PointF();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Path f24588 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Path f24587 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C9449 f24594 = new C9449();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f24593 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float[] f24597 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Path f24598 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Path f24595 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f24596 = true;

    public C9467() {
        for (int i = 0; i < 4; i++) {
            this.f24592[i] = new C9449();
            this.f24591[i] = new Matrix();
            this.f24590[i] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C9467 m14874() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC9466.f24586 : new C9467();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14875(Path path, int i) {
        Path path2 = this.f24595;
        path2.reset();
        this.f24592[i].m14863(this.f24591[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14876(C9469 c9469, float[] fArr, float f, RectF rectF, C9471 c9471, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        C9449[] c9449Arr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.f24588;
        path2.rewind();
        Path path3 = this.f24587;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.f24590;
            fArr2 = this.f24593;
            c9449Arr = this.f24592;
            matrixArr2 = this.f24591;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            InterfaceC9454 c9455 = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? c9469.f24611 : c9469.f24612 : c9469.f24617 : c9469.f24618 : new C9455(fArr[i3]);
            AbstractC7082 abstractC7082 = i3 != 1 ? i3 != 2 ? i3 != 3 ? c9469.f24615 : c9469.f24616 : c9469.f24613 : c9469.f24614;
            C9449 c9449 = c9449Arr[i3];
            abstractC7082.getClass();
            abstractC7082.mo12320(c9449, f, c9455.mo14871(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.f24589;
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
            C9449 c94492 = c9449Arr[i2];
            fArr2[0] = c94492.f24555;
            fArr2[1] = c94492.f24554;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            C9449 c94493 = c9449Arr[i5];
            c94493.getClass();
            fArr2[c] = 0.0f;
            fArr2[1] = c94493.f24556;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[c], fArr2[1]);
            } else {
                path.lineTo(fArr2[c], fArr2[1]);
            }
            c9449Arr[i5].m14863(matrixArr2[i5], path);
            if (c9471 != null) {
                C9449 c94494 = c9449Arr[i5];
                Matrix matrix = matrixArr2[i5];
                C9472 c9472 = c9471.f24639;
                f2 = 0.0f;
                BitSet bitSet = c9472.f24663;
                c94494.getClass();
                bitSet.set(i5, (boolean) c);
                AbstractC9450[] abstractC9450Arr = c9472.f24670;
                c94494.m14864(c94494.f24552);
                abstractC9450Arr[i5] = new C9459(new ArrayList(c94494.f24557), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C9449 c94495 = c9449Arr[i5];
            fArr2[0] = c94495.f24555;
            fArr2[1] = c94495.f24554;
            matrixArr2[i5].mapPoints(fArr2);
            C9449 c94496 = c9449Arr[i7];
            c94496.getClass();
            float[] fArr3 = this.f24597;
            fArr3[0] = f2;
            fArr3[1] = c94496.f24556;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            C9449[] c9449Arr2 = c9449Arr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            C9449 c94497 = c9449Arr2[i5];
            fArr2[0] = c94497.f24555;
            fArr2[1] = c94497.f24554;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            C9449 c94498 = this.f24594;
            c94498.m14861(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c9469.f24622 : c9469.f24621 : c9469.f24620 : c9469.f24619).getClass();
            c94498.m14862(fMax, 0.0f);
            Path path4 = this.f24598;
            path4.reset();
            c94498.m14863(matrixArr3[i5], path4);
            if (this.f24596 && (m14875(path4, i5) || m14875(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = c94498.f24556;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                c94498.m14863(matrixArr3[i5], path2);
            } else {
                c94498.m14863(matrixArr3[i5], path);
            }
            if (c9471 != null) {
                Matrix matrix2 = matrixArr3[i5];
                C9472 c94722 = c9471.f24639;
                c2 = 0;
                c94722.f24663.set(i5 + 4, false);
                AbstractC9450[] abstractC9450Arr2 = c94722.f24664;
                c94498.m14864(c94498.f24552);
                abstractC9450Arr2[i5] = new C9459(new ArrayList(c94498.f24557), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            c = c2;
            c9449Arr = c9449Arr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
