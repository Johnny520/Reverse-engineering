package Yue;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C1643;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7544 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f22828 = "SplineSet";

    /* JADX INFO: renamed from: ۥ */
    public AbstractC4261 f2941;

    /* JADX INFO: renamed from: ۥ۟ */
    public int[] f2942 = new int[10];

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float[] f22829 = new float[10];

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f22830;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String f22831;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ */
    public static class C1294 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setAlpha(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟ */
    public static class C1295 extends AbstractC7544 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public String f22832;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public SparseArray<C1643> f22833;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float[] f22834;

        public C1295(String str, SparseArray<C1643> sparseArray) {
            this.f22832 = str.split(",")[1];
            this.f22833 = sparseArray;
        }

        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo23650(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            this.f2941.mo6904(f, this.f22834);
            this.f22833.valueAt(0).m29277(view, this.f22834);
        }

        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo23653(int i) {
            int size = this.f22833.size();
            int iM29273 = this.f22833.valueAt(0).m29273();
            double[] dArr = new double[size];
            this.f22834 = new float[iM29273];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM29273);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f22833.keyAt(i2);
                C1643 c1643ValueAt = this.f22833.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                c1643ValueAt.m29272(this.f22834);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f22834.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.f2941 = AbstractC4261.m1226(i, dArr, dArr2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m23654(int i, C1643 c1643) {
            this.f22833.append(i, c1643);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟, reason: contains not printable characters */
    public static class C7545 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setElevation(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7546 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m23655(View view, float f, double d, double d2) {
            view.setRotation(m3726(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7547 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setPivotX(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C7548 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setPivotY(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C7549 extends AbstractC7544 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f22835 = false;

        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            Method method;
            if (view instanceof C6273) {
                ((C6273) view).setProgress(m3726(f));
                return;
            }
            if (this.f22835) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f22835 = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m3726(f)));
                } catch (IllegalAccessException e) {
                    Log.e("SplineSet", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("SplineSet", "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C7550 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setRotation(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C7551 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setRotationX(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C7552 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setRotationY(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C7553 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setScaleX(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C7554 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setScaleY(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C7555 {
        /* JADX INFO: renamed from: ۥ */
        public static void m3728(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iM3729 = m3729(iArr, fArr, i4, i6);
                    iArr2[i5] = iM3729 - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iM3729 + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static int m3729(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m23656(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m23656(iArr, fArr, i4, i2);
            return i4;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m23656(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C7556 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setTranslationX(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۠, reason: contains not printable characters */
    public static class C7557 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setTranslationY(m3726(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C7558 extends AbstractC7544 {
        @Override // Yue.AbstractC7544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23651(View view, float f) {
            view.setTranslationZ(m3726(f));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static AbstractC7544 m23647(String str, SparseArray<C1643> sparseArray) {
        return new C1295(str, sparseArray);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static AbstractC7544 m23648(String str) {
        str.hashCode();
        switch (str) {
        }
        return new C1294();
    }

    public String toString() {
        String str = this.f22831;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f22830; i++) {
            str = str + "[" + this.f2942[i] + " , " + decimalFormat.format(this.f22829[i]) + "] ";
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥ */
    public float m3726(float f) {
        return (float) this.f2941.mo6902(f, 0);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC4261 m3727() {
        return this.f2941;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m23649(float f) {
        return (float) this.f2941.mo6905(f, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo23650(int i, float f) {
        int[] iArr = this.f2942;
        if (iArr.length < this.f22830 + 1) {
            this.f2942 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f22829;
            this.f22829 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f2942;
        int i2 = this.f22830;
        iArr2[i2] = i;
        this.f22829[i2] = f;
        this.f22830 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract void mo23651(View view, float f);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m23652(String str) {
        this.f22831 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo23653(int i) {
        int i2 = this.f22830;
        if (i2 == 0) {
            return;
        }
        C7555.m3728(this.f2942, this.f22829, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.f22830; i4++) {
            int[] iArr = this.f2942;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f22830; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f2942;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.f2942[i6]) * 0.01d;
                    dArr2[i5][0] = this.f22829[i6];
                    i5++;
                }
            }
        }
        this.f2941 = AbstractC4261.m1226(i, dArr, dArr2);
    }
}
