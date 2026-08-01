package p305;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import p018.AbstractC6253;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8638 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8620[] f24247 = new C8620[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Matrix[] f24246 = new Matrix[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Matrix[] f24245 = new Matrix[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final PointF f24244 = new PointF();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Path f24243 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Path f24242 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8620 f24249 = new C8620();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f24248 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float[] f24252 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Path f24253 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Path f24250 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f24251 = true;

    public C8638() {
        for (int i = 0; i < 4; i++) {
            this.f24247[i] = new C8620();
            this.f24246[i] = new Matrix();
            this.f24245[i] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8638 m14315() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC8637.f24241 : new C8638();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14316(Path path, int i) {
        Path path2 = this.f24250;
        path2.reset();
        this.f24247[i].m14304(this.f24246[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14317(C8640 c8640, float[] fArr, float f, RectF rectF, C8642 c8642, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        C8620[] c8620Arr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.f24243;
        path2.rewind();
        Path path3 = this.f24242;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.f24245;
            fArr2 = this.f24248;
            c8620Arr = this.f24247;
            matrixArr2 = this.f24246;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            InterfaceC8625 c8626 = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? c8640.f24266 : c8640.f24267 : c8640.f24272 : c8640.f24273 : new C8626(fArr[i3]);
            AbstractC6253 abstractC6253 = i3 != 1 ? i3 != 2 ? i3 != 3 ? c8640.f24270 : c8640.f24271 : c8640.f24268 : c8640.f24269;
            C8620 c8620 = c8620Arr[i3];
            abstractC6253.getClass();
            abstractC6253.mo11761(c8620, f, c8626.mo14312(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.f24244;
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
            C8620 c86202 = c8620Arr[i2];
            fArr2[0] = c86202.f24210;
            fArr2[1] = c86202.f24209;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            C8620 c86203 = c8620Arr[i5];
            c86203.getClass();
            fArr2[c] = 0.0f;
            fArr2[1] = c86203.f24211;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[c], fArr2[1]);
            } else {
                path.lineTo(fArr2[c], fArr2[1]);
            }
            c8620Arr[i5].m14304(matrixArr2[i5], path);
            if (c8642 != null) {
                C8620 c86204 = c8620Arr[i5];
                Matrix matrix = matrixArr2[i5];
                C8643 c8643 = c8642.f24294;
                f2 = 0.0f;
                BitSet bitSet = c8643.f24318;
                c86204.getClass();
                bitSet.set(i5, (boolean) c);
                AbstractC8621[] abstractC8621Arr = c8643.f24325;
                c86204.m14305(c86204.f24207);
                abstractC8621Arr[i5] = new C8630(new ArrayList(c86204.f24212), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C8620 c86205 = c8620Arr[i5];
            fArr2[0] = c86205.f24210;
            fArr2[1] = c86205.f24209;
            matrixArr2[i5].mapPoints(fArr2);
            C8620 c86206 = c8620Arr[i7];
            c86206.getClass();
            float[] fArr3 = this.f24252;
            fArr3[0] = f2;
            fArr3[1] = c86206.f24211;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            C8620[] c8620Arr2 = c8620Arr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            C8620 c86207 = c8620Arr2[i5];
            fArr2[0] = c86207.f24210;
            fArr2[1] = c86207.f24209;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            C8620 c86208 = this.f24249;
            c86208.m14302(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c8640.f24277 : c8640.f24276 : c8640.f24275 : c8640.f24274).getClass();
            c86208.m14303(fMax, 0.0f);
            Path path4 = this.f24253;
            path4.reset();
            c86208.m14304(matrixArr3[i5], path4);
            if (this.f24251 && (m14316(path4, i5) || m14316(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = c86208.f24211;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                c86208.m14304(matrixArr3[i5], path2);
            } else {
                c86208.m14304(matrixArr3[i5], path);
            }
            if (c8642 != null) {
                Matrix matrix2 = matrixArr3[i5];
                C8643 c86432 = c8642.f24294;
                c2 = 0;
                c86432.f24318.set(i5 + 4, false);
                AbstractC8621[] abstractC8621Arr2 = c86432.f24319;
                c86208.m14305(c86208.f24207);
                abstractC8621Arr2[i5] = new C8630(new ArrayList(c86208.f24212), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            c = c2;
            c8620Arr = c8620Arr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
