package p305;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import p033.AbstractC6325;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8646 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8628[] f24256 = new C8628[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Matrix[] f24255 = new Matrix[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Matrix[] f24254 = new Matrix[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final PointF f24253 = new PointF();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Path f24252 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Path f24251 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8628 f24258 = new C8628();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f24257 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float[] f24261 = new float[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Path f24262 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Path f24259 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f24260 = true;

    public C8646() {
        for (int i = 0; i < 4; i++) {
            this.f24256[i] = new C8628();
            this.f24255[i] = new Matrix();
            this.f24254[i] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8646 m14297() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC8645.f24250 : new C8646();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14298(Path path, int i) {
        Path path2 = this.f24259;
        path2.reset();
        this.f24256[i].m14285(this.f24255[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14299(C8648 c8648, float[] fArr, float f, RectF rectF, C8650 c8650, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        C8628[] c8628Arr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.f24252;
        path2.rewind();
        Path path3 = this.f24251;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.f24254;
            fArr2 = this.f24257;
            c8628Arr = this.f24256;
            matrixArr2 = this.f24255;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            InterfaceC8633 c8634 = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? c8648.f24275 : c8648.f24276 : c8648.f24281 : c8648.f24282 : new C8634(fArr[i3]);
            AbstractC6325 abstractC6325 = i3 != 1 ? i3 != 2 ? i3 != 3 ? c8648.f24279 : c8648.f24280 : c8648.f24277 : c8648.f24278;
            C8628 c8628 = c8628Arr[i3];
            abstractC6325.getClass();
            abstractC6325.mo11881(c8628, f, c8634.mo14294(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.f24253;
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
            C8628 c86282 = c8628Arr[i2];
            fArr2[0] = c86282.f24219;
            fArr2[1] = c86282.f24218;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            C8628 c86283 = c8628Arr[i5];
            c86283.getClass();
            fArr2[c] = 0.0f;
            fArr2[1] = c86283.f24220;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[c], fArr2[1]);
            } else {
                path.lineTo(fArr2[c], fArr2[1]);
            }
            c8628Arr[i5].m14285(matrixArr2[i5], path);
            if (c8650 != null) {
                C8628 c86284 = c8628Arr[i5];
                Matrix matrix = matrixArr2[i5];
                C8651 c8651 = c8650.f24303;
                f2 = 0.0f;
                BitSet bitSet = c8651.f24327;
                c86284.getClass();
                bitSet.set(i5, (boolean) c);
                AbstractC8629[] abstractC8629Arr = c8651.f24334;
                c86284.m14286(c86284.f24216);
                abstractC8629Arr[i5] = new C8638(new ArrayList(c86284.f24221), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C8628 c86285 = c8628Arr[i5];
            fArr2[0] = c86285.f24219;
            fArr2[1] = c86285.f24218;
            matrixArr2[i5].mapPoints(fArr2);
            C8628 c86286 = c8628Arr[i7];
            c86286.getClass();
            float[] fArr3 = this.f24261;
            fArr3[0] = f2;
            fArr3[1] = c86286.f24220;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            C8628[] c8628Arr2 = c8628Arr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            C8628 c86287 = c8628Arr2[i5];
            fArr2[0] = c86287.f24219;
            fArr2[1] = c86287.f24218;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            C8628 c86288 = this.f24258;
            c86288.m14283(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c8648.f24286 : c8648.f24285 : c8648.f24284 : c8648.f24283).getClass();
            c86288.m14284(fMax, 0.0f);
            Path path4 = this.f24262;
            path4.reset();
            c86288.m14285(matrixArr3[i5], path4);
            if (this.f24260 && (m14298(path4, i5) || m14298(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = c86288.f24220;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                c86288.m14285(matrixArr3[i5], path2);
            } else {
                c86288.m14285(matrixArr3[i5], path);
            }
            if (c8650 != null) {
                Matrix matrix2 = matrixArr3[i5];
                C8651 c86512 = c8650.f24303;
                c2 = 0;
                c86512.f24327.set(i5 + 4, false);
                AbstractC8629[] abstractC8629Arr2 = c86512.f24328;
                c86288.m14286(c86288.f24216);
                abstractC8629Arr2[i5] = new C8638(new ArrayList(c86288.f24221), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            c = c2;
            c8628Arr = c8628Arr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
