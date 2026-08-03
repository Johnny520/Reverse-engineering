package Yue;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C1643;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5620 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f13682 = "KeyCycleOscillator";

    /* JADX INFO: renamed from: ۥ */
    public AbstractC4261 f1578;

    /* JADX INFO: renamed from: ۥ۟ */
    public C5622 f1579;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C1643 f13683;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String f13684;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f13685 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f13686 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public ArrayList<C5636> f13687 = new ArrayList<>();

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ */
    public class C0818 implements Comparator<C5636> {
        public C0818() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(C5636 c5636, C5636 c56362) {
            return Integer.compare(c5636.f1582, c56362.f1582);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟ */
    public static class C0819 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setAlpha(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟, reason: contains not printable characters */
    public static class C5621 extends AbstractC5620 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float[] f13689 = new float[1];

        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            this.f13689[0] = m2332(f);
            this.f13683.m29277(view, this.f13689);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C5622 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f13690 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final String f13691 = "CycleOscillator";

        /* JADX INFO: renamed from: ۥ */
        public final int f1580;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float[] f13692;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public double[] f13693;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float[] f13694;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float[] f13695;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float[] f13696;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f13697;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public AbstractC4261 f13698;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public double[] f13699;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public double[] f13700;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public float f13701;

        /* JADX INFO: renamed from: ۥ۟ */
        public C6583 f1581 = new C6583();

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public HashMap<String, C1643> f13702 = new HashMap<>();

        public C5622(int i, int i2, int i3) {
            this.f13697 = i;
            this.f1580 = i2;
            this.f1581.m20913(i);
            this.f13692 = new float[i3];
            this.f13693 = new double[i3];
            this.f13694 = new float[i3];
            this.f13695 = new float[i3];
            this.f13696 = new float[i3];
        }

        /* JADX INFO: renamed from: ۥ */
        public final C1643 m2335(String str, C1643.EnumC8766 enumC8766) {
            if (!this.f13702.containsKey(str)) {
                C1643 c1643 = new C1643(str, enumC8766);
                this.f13702.put(str, c1643);
                return c1643;
            }
            C1643 c16432 = this.f13702.get(str);
            if (c16432.m29270() == enumC8766) {
                return c16432;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + c16432.m29270().name());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public double m2336(float f) {
            AbstractC4261 abstractC4261 = this.f13698;
            if (abstractC4261 != null) {
                double d = f;
                abstractC4261.mo6906(d, this.f13700);
                this.f13698.mo6903(d, this.f13699);
            } else {
                double[] dArr = this.f13700;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d2 = f;
            double dM20911 = this.f1581.m20911(d2);
            double dM20910 = this.f1581.m20910(d2);
            double[] dArr2 = this.f13700;
            return dArr2[0] + (dM20911 * dArr2[1]) + (dM20910 * this.f13699[1]);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public double m17490(float f) {
            AbstractC4261 abstractC4261 = this.f13698;
            if (abstractC4261 != null) {
                abstractC4261.mo6903(f, this.f13699);
            } else {
                double[] dArr = this.f13699;
                dArr[0] = this.f13695[0];
                dArr[1] = this.f13692[0];
            }
            return this.f13699[0] + (this.f1581.m20911(f) * this.f13699[1]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m17491(int i, int i2, float f, float f2, float f3) {
            this.f13693[i] = ((double) i2) / 100.0d;
            this.f13694[i] = f;
            this.f13695[i] = f2;
            this.f13692[i] = f3;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m17492(float f) {
            this.f13701 = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f13693.length, 2);
            float[] fArr = this.f13692;
            this.f13699 = new double[fArr.length + 1];
            this.f13700 = new double[fArr.length + 1];
            if (this.f13693[0] > 0.0d) {
                this.f1581.m3040(0.0d, this.f13694[0]);
            }
            double[] dArr2 = this.f13693;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f1581.m3040(1.0d, this.f13694[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = this.f13695[i];
                int i2 = 0;
                while (true) {
                    if (i2 < this.f13692.length) {
                        dArr[i2][1] = r4[i2];
                        i2++;
                    }
                }
                this.f1581.m3040(this.f13693[i], this.f13694[i]);
            }
            this.f1581.m20912();
            double[] dArr3 = this.f13693;
            if (dArr3.length > 1) {
                this.f13698 = AbstractC4261.m1226(0, dArr3, dArr);
            } else {
                this.f13698 = null;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C5623 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setElevation(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C5624 {
        /* JADX INFO: renamed from: ۥ */
        public static int m2337(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m17493(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m17493(iArr, fArr, i4, i2);
            return i4;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2338(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iM2337 = m2337(iArr, fArr, i4, i6);
                    iArr2[i5] = iM2337 - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iM2337 + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m17493(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C5625 {
        /* JADX INFO: renamed from: ۥ */
        public static int m2339(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m17494(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            m17494(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2340(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iM2339 = m2339(iArr, fArr, fArr2, i4, i6);
                    iArr2[i5] = iM2339 - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iM2339 + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m17494(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C5626 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m17495(View view, float f, double d, double d2) {
            view.setRotation(m2332(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C5627 extends AbstractC5620 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f13703 = false;

        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            Method method;
            if (view instanceof C6273) {
                ((C6273) view).setProgress(m2332(f));
                return;
            }
            if (this.f13703) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f13703 = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m2332(f)));
                } catch (IllegalAccessException e) {
                    Log.e(AbstractC5620.f13682, "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e(AbstractC5620.f13682, "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C5628 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setRotation(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C5629 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setRotationX(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C5630 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setRotationY(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C5631 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setScaleX(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C5632 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setScaleY(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۠, reason: contains not printable characters */
    public static class C5633 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setTranslationX(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C5634 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setTranslationY(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۠۠, reason: contains not printable characters */
    public static class C5635 extends AbstractC5620 {
        @Override // Yue.AbstractC5620
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo17486(View view, float f) {
            view.setTranslationZ(m2332(f));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۣ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static class C5636 {

        /* JADX INFO: renamed from: ۥ */
        public int f1582;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f1583;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f13704;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f13705;

        public C5636(int i, float f, float f2, float f3) {
            this.f1582 = i;
            this.f1583 = f3;
            this.f13704 = f2;
            this.f13705 = f;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static AbstractC5620 m17482(String str) {
        if (str.startsWith(AbstractC5616.f13601)) {
            return new C5621();
        }
        switch (str) {
            case "rotationX":
                return new C5629();
            case "rotationY":
                return new C5630();
            case "translationX":
                return new C5633();
            case "translationY":
                return new C5634();
            case "translationZ":
                return new C5635();
            case "progress":
                return new C5627();
            case "scaleX":
                return new C5631();
            case "scaleY":
                return new C5632();
            case "waveVariesBy":
                return new C0819();
            case "rotation":
                return new C5628();
            case "elevation":
                return new C5623();
            case "transitionPathRotate":
                return new C5626();
            case "alpha":
                return new C0819();
            case "waveOffset":
                return new C0819();
            default:
                return null;
        }
    }

    public String toString() {
        String str = this.f13684;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C5636> it = this.f13687.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f1582 + " , " + decimalFormat.format(r3.f1583) + "] ";
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥ */
    public float m2332(float f) {
        return (float) this.f1579.m17490(f);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC4261 m2333() {
        return this.f1578;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m17483(float f) {
        return (float) this.f1579.m2336(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17484(int i, int i2, int i3, float f, float f2, float f3) {
        this.f13687.add(new C5636(i, f, f2, f3));
        if (i3 != -1) {
            this.f13686 = i3;
        }
        this.f13685 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m17485(int i, int i2, int i3, float f, float f2, float f3, C1643 c1643) {
        this.f13687.add(new C5636(i, f, f2, f3));
        if (i3 != -1) {
            this.f13686 = i3;
        }
        this.f13685 = i2;
        this.f13683 = c1643;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract void mo17486(View view, float f);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m17487(String str) {
        this.f13684 = str;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m17488(float f) {
        int size = this.f13687.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f13687, new C0818());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
        this.f1579 = new C5622(this.f13685, this.f13686, size);
        int i = 0;
        for (C5636 c5636 : this.f13687) {
            float f2 = c5636.f13705;
            dArr[i] = ((double) f2) * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = c5636.f1583;
            dArr3[0] = f3;
            float f4 = c5636.f13704;
            dArr3[1] = f4;
            this.f1579.m17491(i, c5636.f1582, f2, f4, f3);
            i++;
        }
        this.f1579.m17492(f);
        this.f1578 = AbstractC4261.m1226(0, dArr, dArr2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m17489() {
        return this.f13686 == 1;
    }
}
