package Yue;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C1643;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7800 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f23359 = "SplineSet";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f23360 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f23361 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f23362 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static float f23363 = 6.2831855f;

    /* JADX INFO: renamed from: ۥ */
    public AbstractC4261 f3091;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f23366;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String f23367;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public long f23370;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3092 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int[] f23364 = new int[10];

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float[][] f23365 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float[] f23368 = new float[3];

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f23369 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f23371 = Float.NaN;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ */
    public static class C1365 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setAlpha(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟ */
    public static class C1366 extends AbstractC7800 {

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public String f23372;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public SparseArray<C1643> f23373;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public SparseArray<float[]> f23374 = new SparseArray<>();

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public float[] f23375;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public float[] f23376;

        public C1366(String str, SparseArray<C1643> sparseArray) {
            this.f23372 = str.split(",")[1];
            this.f23373 = sparseArray;
        }

        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo24771(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            this.f3091.mo6904(f, this.f23375);
            float[] fArr = this.f23375;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f23370;
            if (Float.isNaN(this.f23371)) {
                float fM2328 = c5618.m2328(view, this.f23372, 0);
                this.f23371 = fM2328;
                if (Float.isNaN(fM2328)) {
                    this.f23371 = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f23371) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f23371 = f4;
            this.f23370 = j;
            float fM3905 = m3905(f4);
            this.f23369 = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f23376;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f23369;
                float f5 = this.f23375[i];
                this.f23369 = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fM3905) + f3;
                i++;
            }
            this.f23373.valueAt(0).m29277(view, this.f23376);
            if (f2 != 0.0f) {
                this.f23369 = true;
            }
            return this.f23369;
        }

        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo24775(int i) {
            int size = this.f23373.size();
            int iM29273 = this.f23373.valueAt(0).m29273();
            double[] dArr = new double[size];
            int i2 = iM29273 + 2;
            this.f23375 = new float[i2];
            this.f23376 = new float[iM29273];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f23373.keyAt(i3);
                C1643 c1643ValueAt = this.f23373.valueAt(i3);
                float[] fArrValueAt = this.f23374.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                c1643ValueAt.m29272(this.f23375);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f23375.length) {
                        dArr2[i3][i4] = r8[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iM29273] = fArrValueAt[0];
                dArr3[iM29273 + 1] = fArrValueAt[1];
            }
            this.f3091 = AbstractC4261.m1226(i, dArr, dArr2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m24776(int i, C1643 c1643, float f, int i2, float f2) {
            this.f23373.append(i, c1643);
            this.f23374.append(i, new float[]{f, f2});
            this.f3092 = Math.max(this.f3092, i2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C7801 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setElevation(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7802 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            return this.f23369;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean m24777(View view, C5618 c5618, float f, long j, double d, double d2) {
            view.setRotation(m3906(f, j, view, c5618) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7803 extends AbstractC7800 {

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f23377 = false;

        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            Method method;
            if (view instanceof C6273) {
                ((C6273) view).setProgress(m3906(f, j, view, c5618));
            } else {
                if (this.f23377) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f23377 = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(m3906(f, j, view, c5618)));
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C7804 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setRotation(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C7805 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setRotationX(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C7806 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setRotationY(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C7807 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setScaleX(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C7808 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setScaleY(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C7809 {
        /* JADX INFO: renamed from: ۥ */
        public static void m3907(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iM3908 = m3908(iArr, fArr, i4, i6);
                    iArr2[i5] = iM3908 - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iM3908 + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static int m3908(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m24778(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m24778(iArr, fArr, i4, i2);
            return i4;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m24778(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C7810 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setTranslationX(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C7811 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setTranslationY(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C7812 extends AbstractC7800 {
        @Override // Yue.AbstractC7800
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo24772(View view, float f, long j, C5618 c5618) {
            view.setTranslationZ(m3906(f, j, view, c5618));
            return this.f23369;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static AbstractC7800 m24768(String str, SparseArray<C1643> sparseArray) {
        return new C1366(str, sparseArray);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static AbstractC7800 m24769(String str, long j) {
        AbstractC7800 c7805;
        str.hashCode();
        switch (str) {
            case "rotationX":
                c7805 = new C7805();
                break;
            case "rotationY":
                c7805 = new C7806();
                break;
            case "translationX":
                c7805 = new C7810();
                break;
            case "translationY":
                c7805 = new C7811();
                break;
            case "translationZ":
                c7805 = new C7812();
                break;
            case "progress":
                c7805 = new C7803();
                break;
            case "scaleX":
                c7805 = new C7807();
                break;
            case "scaleY":
                c7805 = new C7808();
                break;
            case "rotation":
                c7805 = new C7804();
                break;
            case "elevation":
                c7805 = new C7801();
                break;
            case "transitionPathRotate":
                c7805 = new C7802();
                break;
            case "alpha":
                c7805 = new C1365();
                break;
            default:
                return null;
        }
        c7805.m24773(j);
        return c7805;
    }

    public String toString() {
        String str = this.f23367;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f23366; i++) {
            str = str + "[" + this.f23364[i] + " , " + decimalFormat.format(this.f23365[i]) + "] ";
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥ */
    public float m3905(float f) {
        float fAbs;
        switch (this.f3092) {
            case 1:
                return Math.signum(f * f23363);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f23363);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * f23363);
        }
        return 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m3906(float f, long j, View view, C5618 c5618) {
        this.f3091.mo6904(f, this.f23368);
        float[] fArr = this.f23368;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f23369 = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f23371)) {
            float fM2328 = c5618.m2328(view, this.f23367, 0);
            this.f23371 = fM2328;
            if (Float.isNaN(fM2328)) {
                this.f23371 = 0.0f;
            }
        }
        float f3 = (float) ((((double) this.f23371) + (((j - this.f23370) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f23371 = f3;
        c5618.m2329(view, this.f23367, 0, f3);
        this.f23370 = j;
        float f4 = this.f23368[0];
        float fM3905 = (m3905(this.f23371) * f4) + this.f23368[2];
        this.f23369 = (f4 == 0.0f && f2 == 0.0f) ? false : true;
        return fM3905;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public AbstractC4261 m24770() {
        return this.f3091;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo24771(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f23364;
        int i3 = this.f23366;
        iArr[i3] = i;
        float[] fArr = this.f23365[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f3092 = Math.max(this.f3092, i2);
        this.f23366++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract boolean mo24772(View view, float f, long j, C5618 c5618);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m24773(long j) {
        this.f23370 = j;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m24774(String str) {
        this.f23367 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo24775(int i) {
        int i2 = this.f23366;
        if (i2 == 0) {
            Log.e("SplineSet", "Error no points added to " + this.f23367);
            return;
        }
        C7809.m3907(this.f23364, this.f23365, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f23364;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f23366; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f23364;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.f23364[i6]) * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[] fArr = this.f23365[i6];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i5++;
                }
            }
        }
        this.f3091 = AbstractC4261.m1226(i, dArr, dArr2);
    }
}
