package androidx.compose.p001ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import io.ktor.util.C5043;
import p128.C8156;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float[] f5068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public RectF f5069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Path f5070;

    public C2449(Path path) {
        this.f5070 = path;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m3537(C2449 c2449, C8156 c8156) {
        Path.Direction direction;
        Path$Direction path$Direction = Path$Direction.CounterClockwise;
        if (c2449.f5069 == null) {
            c2449.f5069 = new RectF();
        }
        RectF rectF = c2449.f5069;
        rectF.getClass();
        float f = c8156.f19878;
        long j = c8156.f19879;
        long j2 = c8156.f19880;
        long j3 = c8156.f19873;
        long j4 = c8156.f19874;
        rectF.set(f, c8156.f19877, c8156.f19876, c8156.f19875);
        if (c2449.f5068 == null) {
            c2449.f5068 = new float[8];
        }
        float[] fArr = c2449.f5068;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c2449.f5070;
        RectF rectF2 = c2449.f5069;
        rectF2.getClass();
        float[] fArr2 = c2449.f5068;
        fArr2.getClass();
        int i = AbstractC2439.f5049[path$Direction.ordinal()];
        if (i == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i != 2) {
                C5043.m9170();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m3538(C2449 c2449, C8157 c8157) {
        Path.Direction direction;
        Path$Direction path$Direction = Path$Direction.CounterClockwise;
        float f = c8157.f19885;
        float f2 = c8157.f19882;
        float f3 = c8157.f19883;
        float f4 = c8157.f19884;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AbstractC2438.m3516("Invalid rectangle, make sure no value is NaN");
        }
        if (c2449.f5069 == null) {
            c2449.f5069 = new RectF();
        }
        RectF rectF = c2449.f5069;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = c2449.f5070;
        RectF rectF2 = c2449.f5069;
        rectF2.getClass();
        int i = AbstractC2439.f5049[path$Direction.ordinal()];
        if (i == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i != 2) {
                C5043.m9170();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m3539(C2449 c2449, C2449 c24492) {
        c2449.f5070.addPath(c24492.f5070, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m3540(C2449 c2449, C2449 c24492, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c2449 instanceof C2449)) {
            C6755.m11867("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c2449.f5070;
        if (c24492 instanceof C2449) {
            return this.f5070.op(path, c24492.f5070, op);
        }
        C6755.m11867("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3541(float f, float f2) {
        this.f5070.lineTo(f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8157 m3542() {
        if (this.f5069 == null) {
            this.f5069 = new RectF();
        }
        RectF rectF = this.f5069;
        rectF.getClass();
        this.f5070.computeBounds(rectF, true);
        return new C8157(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3543() {
        this.f5070.reset();
    }
}
