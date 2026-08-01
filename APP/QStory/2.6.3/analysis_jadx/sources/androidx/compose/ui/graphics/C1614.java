package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import io.ktor.util.C4211;
import p112.C7327;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float[] f4723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public RectF f4724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Path f4725;

    public C1614(Path path) {
        this.f4725 = path;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m2977(C1614 c1614, C7327 c7327) {
        Path.Direction direction;
        Path$Direction path$Direction = Path$Direction.CounterClockwise;
        if (c1614.f4724 == null) {
            c1614.f4724 = new RectF();
        }
        RectF rectF = c1614.f4724;
        rectF.getClass();
        float f = c7327.f19533;
        long j = c7327.f19534;
        long j2 = c7327.f19535;
        long j3 = c7327.f19528;
        long j4 = c7327.f19529;
        rectF.set(f, c7327.f19532, c7327.f19531, c7327.f19530);
        if (c1614.f4723 == null) {
            c1614.f4723 = new float[8];
        }
        float[] fArr = c1614.f4723;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c1614.f4725;
        RectF rectF2 = c1614.f4724;
        rectF2.getClass();
        float[] fArr2 = c1614.f4723;
        fArr2.getClass();
        int i = AbstractC1604.f4704[path$Direction.ordinal()];
        if (i == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i != 2) {
                C4211.m8611();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m2978(C1614 c1614, C7328 c7328) {
        Path.Direction direction;
        Path$Direction path$Direction = Path$Direction.CounterClockwise;
        float f = c7328.f19540;
        float f2 = c7328.f19537;
        float f3 = c7328.f19538;
        float f4 = c7328.f19539;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AbstractC1603.m2956("Invalid rectangle, make sure no value is NaN");
        }
        if (c1614.f4724 == null) {
            c1614.f4724 = new RectF();
        }
        RectF rectF = c1614.f4724;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = c1614.f4725;
        RectF rectF2 = c1614.f4724;
        rectF2.getClass();
        int i = AbstractC1604.f4704[path$Direction.ordinal()];
        if (i == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i != 2) {
                C4211.m8611();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m2979(C1614 c1614, C1614 c16142) {
        c1614.f4725.addPath(c16142.f4725, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m2980(C1614 c1614, C1614 c16142, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c1614 instanceof C1614)) {
            C5925.m11308("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c1614.f4725;
        if (c16142 instanceof C1614) {
            return this.f4725.op(path, c16142.f4725, op);
        }
        C5925.m11308("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2981(float f, float f2) {
        this.f4725.lineTo(f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7328 m2982() {
        if (this.f4724 == null) {
            this.f4724 = new RectF();
        }
        RectF rectF = this.f4724;
        rectF.getClass();
        this.f4725.computeBounds(rectF, true);
        return new C7328(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2983() {
        this.f4725.reset();
    }
}
