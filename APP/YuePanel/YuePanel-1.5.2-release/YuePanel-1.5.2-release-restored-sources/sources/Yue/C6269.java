package Yue;

import Yue.AbstractC5620;
import Yue.AbstractC7544;
import Yue.AbstractC7800;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1643;
import androidx.constraintlayout.widget.C8770;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۡۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6269 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f15502 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f15503 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f15504 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f15505 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f15506 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f15507 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f15508 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f15509 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f15510 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f15511 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f15512 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f15513 = 5;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f15514 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String f15515 = "MotionController";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final boolean f15516 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final boolean f15517 = false;

    /* JADX INFO: renamed from: ۥ */
    public View f1956;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1957;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f15518;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public AbstractC4261[] f15524;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public AbstractC4261 f15525;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int[] f15529;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public double[] f15530;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public double[] f15531;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public String[] f15532;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int[] f15533;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public HashMap<String, AbstractC7800> f15539;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public HashMap<String, AbstractC7544> f15540;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public HashMap<String, AbstractC5620> f15541;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C5642[] f15542;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public String[] f15544;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f15519 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C6282 f15520 = new C6282();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C6282 f15521 = new C6282();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C6268 f15522 = new C6268();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C6268 f15523 = new C6268();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float f15526 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float f15527 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float f15528 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f15534 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public float[] f15535 = new float[4];

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ArrayList<C6282> f15536 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public float[] f15537 = new float[1];

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ArrayList<AbstractC5616> f15538 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f15543 = AbstractC5616.f13583;

    public C6269(View view) {
        m19340(view);
    }

    public String toString() {
        return " start: x: " + this.f15520.f15743 + " y: " + this.f15520.f15744 + " end: x: " + this.f15521.f15743 + " y: " + this.f15521.f15744;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m2736(AbstractC5616 abstractC5616) {
        this.f15538.add(abstractC5616);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m2737(ArrayList<AbstractC5616> arrayList) {
        this.f15538.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m19309(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        HashMap<String, AbstractC7544> map = this.f15540;
        if (map != null) {
            map.get(AbstractC5616.f13597);
        }
        HashMap<String, AbstractC7544> map2 = this.f15540;
        if (map2 != null) {
            map2.get(AbstractC5616.f13598);
        }
        HashMap<String, AbstractC5620> map3 = this.f15541;
        if (map3 != null) {
            map3.get(AbstractC5616.f13597);
        }
        HashMap<String, AbstractC5620> map4 = this.f15541;
        if (map4 != null) {
            map4.get(AbstractC5616.f13598);
        }
        for (int i2 = 0; i2 < i; i2++) {
            float f2 = i2 * f;
            float f3 = this.f15528;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.f15527;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && f2 < 1.0d) {
                    f2 = (f2 - f5) * f3;
                }
            }
            double dMo1543 = f2;
            C4586 c4586 = this.f15520.f15739;
            float f6 = Float.NaN;
            for (C6282 c6282 : this.f15536) {
                C4586 c45862 = c6282.f15739;
                if (c45862 != null) {
                    float f7 = c6282.f15741;
                    if (f7 < f2) {
                        c4586 = c45862;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = c6282.f15741;
                    }
                }
            }
            if (c4586 != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                dMo1543 = (((float) c4586.mo1543((f2 - f4) / r12)) * (f6 - f4)) + f4;
            }
            this.f15524[0].mo6903(dMo1543, this.f15530);
            AbstractC4261 abstractC4261 = this.f15525;
            if (abstractC4261 != null) {
                double[] dArr = this.f15530;
                if (dArr.length > 0) {
                    abstractC4261.mo6903(dMo1543, dArr);
                }
            }
            this.f15520.m19459(this.f15529, this.f15530, fArr, i2 * 2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m19310(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo6907 = this.f15524[0].mo6907();
        if (iArr != null) {
            Iterator<C6282> it = this.f15536.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f15751;
                i++;
            }
        }
        int i2 = 0;
        for (double d : dArrMo6907) {
            this.f15524[0].mo6903(d, this.f15530);
            this.f15520.m19459(this.f15529, this.f15530, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m19311(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo6907 = this.f15524[0].mo6907();
        if (iArr != null) {
            Iterator<C6282> it = this.f15536.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f15751;
                i++;
            }
        }
        int i2 = 0;
        for (double d : dArrMo6907) {
            this.f15524[0].mo6903(d, this.f15530);
            this.f15520.m19460(this.f15529, this.f15530, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m19312(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap<String, AbstractC7544> map = this.f15540;
        AbstractC7544 abstractC7544 = map == null ? null : map.get(AbstractC5616.f13597);
        HashMap<String, AbstractC7544> map2 = this.f15540;
        AbstractC7544 abstractC75442 = map2 == null ? null : map2.get(AbstractC5616.f13598);
        HashMap<String, AbstractC5620> map3 = this.f15541;
        AbstractC5620 abstractC5620 = map3 == null ? null : map3.get(AbstractC5616.f13597);
        HashMap<String, AbstractC5620> map4 = this.f15541;
        AbstractC5620 abstractC56202 = map4 != null ? map4.get(AbstractC5616.f13598) : null;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = i3 * f2;
            float f4 = this.f15528;
            if (f4 != f) {
                float f5 = this.f15527;
                if (f3 < f5) {
                    f3 = 0.0f;
                }
                if (f3 > f5 && f3 < 1.0d) {
                    f3 = (f3 - f5) * f4;
                }
            }
            double dMo1543 = f3;
            C4586 c4586 = this.f15520.f15739;
            float f6 = Float.NaN;
            float f7 = 0.0f;
            for (C6282 c6282 : this.f15536) {
                C4586 c45862 = c6282.f15739;
                if (c45862 != null) {
                    float f8 = c6282.f15741;
                    if (f8 < f3) {
                        f7 = f8;
                        c4586 = c45862;
                    } else if (Float.isNaN(f6)) {
                        f6 = c6282.f15741;
                    }
                }
            }
            if (c4586 != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                dMo1543 = (((float) c4586.mo1543((f3 - f7) / r17)) * (f6 - f7)) + f7;
            }
            this.f15524[0].mo6903(dMo1543, this.f15530);
            AbstractC4261 abstractC4261 = this.f15525;
            if (abstractC4261 != null) {
                double[] dArr = this.f15530;
                if (dArr.length > 0) {
                    abstractC4261.mo6903(dMo1543, dArr);
                }
            }
            int i4 = i3 * 2;
            this.f15520.m19460(this.f15529, this.f15530, fArr, i4);
            if (abstractC5620 != null) {
                fArr[i4] = fArr[i4] + abstractC5620.m2332(f3);
            } else if (abstractC7544 != null) {
                fArr[i4] = fArr[i4] + abstractC7544.m3726(f3);
            }
            if (abstractC56202 != null) {
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] + abstractC56202.m2332(f3);
            } else if (abstractC75442 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + abstractC75442.m3726(f3);
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m19313(float f, float[] fArr, int i) {
        this.f15524[0].mo6903(m19315(f, null), this.f15530);
        this.f15520.m19463(this.f15529, this.f15530, fArr, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m19314(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.f15524[0].mo6903(m19315(i2 * f, null), this.f15530);
            this.f15520.m19463(this.f15529, this.f15530, fArr, i2 * 8);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final float m19315(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f15528;
            if (f3 != 1.0d) {
                float f4 = this.f15527;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        C4586 c4586 = this.f15520.f15739;
        float f5 = Float.NaN;
        for (C6282 c6282 : this.f15536) {
            C4586 c45862 = c6282.f15739;
            if (c45862 != null) {
                float f6 = c6282.f15741;
                if (f6 < f) {
                    c4586 = c45862;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = c6282.f15741;
                }
            }
        }
        if (c4586 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) c4586.mo1543(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) c4586.mo1544(d);
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m19316(String str, float[] fArr, int i) {
        AbstractC7544 abstractC7544 = this.f15540.get(str);
        if (abstractC7544 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = abstractC7544.m3726(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m19317(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float fM19315 = m19315(f, this.f15537);
        AbstractC4261[] abstractC4261Arr = this.f15524;
        int i = 0;
        if (abstractC4261Arr == null) {
            C6282 c6282 = this.f15521;
            float f4 = c6282.f15743;
            C6282 c62822 = this.f15520;
            float f5 = f4 - c62822.f15743;
            float f6 = c6282.f15744 - c62822.f15744;
            float f7 = (c6282.f15745 - c62822.f15745) + f5;
            float f8 = (c6282.f15746 - c62822.f15746) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            return;
        }
        double d = fM19315;
        abstractC4261Arr[0].mo6906(d, this.f15531);
        this.f15524[0].mo6903(d, this.f15530);
        float f9 = this.f15537[0];
        while (true) {
            dArr = this.f15531;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        AbstractC4261 abstractC4261 = this.f15525;
        if (abstractC4261 == null) {
            this.f15520.m19469(f2, f3, fArr, this.f15529, dArr, this.f15530);
            return;
        }
        double[] dArr2 = this.f15530;
        if (dArr2.length > 0) {
            abstractC4261.mo6903(d, dArr2);
            this.f15525.mo6906(d, this.f15531);
            this.f15520.m19469(f2, f3, fArr, this.f15529, this.f15531, this.f15530);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m19318() {
        int iMax = this.f15520.f15740;
        Iterator<C6282> it = this.f15536.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f15740);
        }
        return Math.max(iMax, this.f15521.f15740);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float m19319() {
        return this.f15521.f15743;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public float m19320() {
        return this.f15521.f15744;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C6282 m19321(int i) {
        return this.f15536.get(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m19322(int i, int[] iArr) {
        float[] fArr = new float[2];
        int i2 = 0;
        int i3 = 0;
        for (AbstractC5616 abstractC5616 : this.f15538) {
            int i4 = abstractC5616.f13603;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                iArr[i3 + 2] = abstractC5616.f1571;
                this.f15524[0].mo6903(r7 / 100.0f, this.f15530);
                this.f15520.m19460(this.f15529, this.f15530, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i5 = i3 + 4;
                iArr[i5] = Float.floatToIntBits(fArr[1]);
                if (abstractC5616 instanceof C5639) {
                    C5639 c5639 = (C5639) abstractC5616;
                    iArr[i3 + 5] = c5639.f13727;
                    iArr[i3 + 6] = Float.floatToIntBits(c5639.f13723);
                    i5 = i3 + 7;
                    iArr[i5] = Float.floatToIntBits(c5639.f13724);
                }
                int i6 = i5 + 1;
                iArr[i3] = i6 - i3;
                i2++;
                i3 = i6;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public float m19323(int i, float f, float f2) {
        C6282 c6282 = this.f15521;
        float f3 = c6282.f15743;
        C6282 c62822 = this.f15520;
        float f4 = c62822.f15743;
        float f5 = f3 - f4;
        float f6 = c6282.f15744;
        float f7 = c62822.f15744;
        float f8 = f6 - f7;
        float f9 = f4 + (c62822.f15745 / 2.0f);
        float f10 = f7 + (c62822.f15746 / 2.0f);
        float fHypot = (float) Math.hypot(f5, f8);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot(f11, f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / fHypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f13 * f13));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public AbstractC5640 m19324(int i, int i2, float f, float f2) {
        RectF rectF = new RectF();
        C6282 c6282 = this.f15520;
        float f3 = c6282.f15743;
        rectF.left = f3;
        float f4 = c6282.f15744;
        rectF.top = f4;
        rectF.right = f3 + c6282.f15745;
        rectF.bottom = f4 + c6282.f15746;
        RectF rectF2 = new RectF();
        C6282 c62822 = this.f15521;
        float f5 = c62822.f15743;
        rectF2.left = f5;
        float f6 = c62822.f15744;
        rectF2.top = f6;
        rectF2.right = f5 + c62822.f15745;
        rectF2.bottom = f6 + c62822.f15746;
        for (AbstractC5616 abstractC5616 : this.f15538) {
            if (abstractC5616 instanceof AbstractC5640) {
                AbstractC5640 abstractC5640 = (AbstractC5640) abstractC5616;
                if (abstractC5640.mo17506(i, i2, rectF, rectF2, f, f2)) {
                    return abstractC5640;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m19325(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float fM19315 = m19315(f, this.f15537);
        HashMap<String, AbstractC7544> map = this.f15540;
        AbstractC7544 abstractC7544 = map == null ? null : map.get(AbstractC5616.f13597);
        HashMap<String, AbstractC7544> map2 = this.f15540;
        AbstractC7544 abstractC75442 = map2 == null ? null : map2.get(AbstractC5616.f13598);
        HashMap<String, AbstractC7544> map3 = this.f15540;
        AbstractC7544 abstractC75443 = map3 == null ? null : map3.get(AbstractC5616.f13586);
        HashMap<String, AbstractC7544> map4 = this.f15540;
        AbstractC7544 abstractC75444 = map4 == null ? null : map4.get(AbstractC5616.f13592);
        HashMap<String, AbstractC7544> map5 = this.f15540;
        AbstractC7544 abstractC75445 = map5 == null ? null : map5.get(AbstractC5616.f13593);
        HashMap<String, AbstractC5620> map6 = this.f15541;
        AbstractC5620 abstractC5620 = map6 == null ? null : map6.get(AbstractC5616.f13597);
        HashMap<String, AbstractC5620> map7 = this.f15541;
        AbstractC5620 abstractC56202 = map7 == null ? null : map7.get(AbstractC5616.f13598);
        HashMap<String, AbstractC5620> map8 = this.f15541;
        AbstractC5620 abstractC56203 = map8 == null ? null : map8.get(AbstractC5616.f13586);
        HashMap<String, AbstractC5620> map9 = this.f15541;
        AbstractC5620 abstractC56204 = map9 == null ? null : map9.get(AbstractC5616.f13592);
        HashMap<String, AbstractC5620> map10 = this.f15541;
        AbstractC5620 abstractC56205 = map10 != null ? map10.get(AbstractC5616.f13593) : null;
        C8171 c8171 = new C8171();
        c8171.m4197();
        c8171.m26956(abstractC75443, fM19315);
        c8171.m26960(abstractC7544, abstractC75442, fM19315);
        c8171.m26958(abstractC75444, abstractC75445, fM19315);
        c8171.m26955(abstractC56203, fM19315);
        c8171.m26959(abstractC5620, abstractC56202, fM19315);
        c8171.m26957(abstractC56204, abstractC56205, fM19315);
        AbstractC4261 abstractC4261 = this.f15525;
        if (abstractC4261 != null) {
            double[] dArr = this.f15530;
            if (dArr.length > 0) {
                double d = fM19315;
                abstractC4261.mo6903(d, dArr);
                this.f15525.mo6906(d, this.f15531);
                this.f15520.m19469(f2, f3, fArr, this.f15529, this.f15531, this.f15530);
            }
            c8171.m4196(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f15524 == null) {
            C6282 c6282 = this.f15521;
            float f4 = c6282.f15743;
            C6282 c62822 = this.f15520;
            float f5 = f4 - c62822.f15743;
            AbstractC5620 abstractC56206 = abstractC56205;
            float f6 = c6282.f15744 - c62822.f15744;
            AbstractC5620 abstractC56207 = abstractC56204;
            float f7 = (c6282.f15745 - c62822.f15745) + f5;
            float f8 = (c6282.f15746 - c62822.f15746) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            c8171.m4197();
            c8171.m26956(abstractC75443, fM19315);
            c8171.m26960(abstractC7544, abstractC75442, fM19315);
            c8171.m26958(abstractC75444, abstractC75445, fM19315);
            c8171.m26955(abstractC56203, fM19315);
            c8171.m26959(abstractC5620, abstractC56202, fM19315);
            c8171.m26957(abstractC56207, abstractC56206, fM19315);
            c8171.m4196(f2, f3, i, i2, fArr);
            return;
        }
        double dM19315 = m19315(fM19315, this.f15537);
        this.f15524[0].mo6906(dM19315, this.f15531);
        this.f15524[0].mo6903(dM19315, this.f15530);
        float f9 = this.f15537[0];
        while (true) {
            double[] dArr2 = this.f15531;
            if (i3 >= dArr2.length) {
                this.f15520.m19469(f2, f3, fArr, this.f15529, dArr2, this.f15530);
                c8171.m4196(f2, f3, i, i2, fArr);
                return;
            } else {
                dArr2[i3] = dArr2[i3] * ((double) f9);
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final float m19326() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dMo1543 = f2;
            C4586 c4586 = this.f15520.f15739;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (C6282 c6282 : this.f15536) {
                C4586 c45862 = c6282.f15739;
                float f5 = f;
                if (c45862 != null) {
                    float f6 = c6282.f15741;
                    if (f6 < f2) {
                        f4 = f6;
                        c4586 = c45862;
                    } else if (Float.isNaN(f3)) {
                        f3 = c6282.f15741;
                    }
                }
                f = f5;
            }
            float f7 = f;
            if (c4586 != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                dMo1543 = (((float) c4586.mo1543((f2 - f4) / r16)) * (f3 - f4)) + f4;
            }
            this.f15524[0].mo6903(dMo1543, this.f15530);
            this.f15520.m19460(this.f15529, this.f15530, fArr, 0);
            if (i > 0) {
                fHypot = (float) (((double) fHypot) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            }
            d = fArr[0];
            d2 = fArr[1];
            i++;
            f = f7;
        }
        return fHypot;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public float m19327() {
        return this.f15520.f15743;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public float m19328() {
        return this.f15520.f15744;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int m19329(int[] iArr, float[] fArr) {
        int i = 0;
        int i2 = 0;
        for (AbstractC5616 abstractC5616 : this.f15538) {
            iArr[i] = (abstractC5616.f13603 * 1000) + abstractC5616.f1571;
            this.f15524[0].mo6903(r6 / 100.0f, this.f15530);
            this.f15520.m19460(this.f15529, this.f15530, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m19330(C6282 c6282) {
        if (Collections.binarySearch(this.f15536, c6282) == 0) {
            Log.e(f15515, " KeyPath positon \"" + c6282.f15742 + "\" outside of range");
        }
        this.f15536.add((-r0) - 1, c6282);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m19331(View view, float f, long j, C5618 c5618) {
        AbstractC7800.C7802 c7802;
        boolean zM24777;
        double d;
        float fM19315 = m19315(f, null);
        HashMap<String, AbstractC7544> map = this.f15540;
        if (map != null) {
            Iterator<AbstractC7544> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().mo23651(view, fM19315);
            }
        }
        HashMap<String, AbstractC7800> map2 = this.f15539;
        if (map2 != null) {
            c7802 = null;
            boolean zMo24772 = false;
            for (AbstractC7800 abstractC7800 : map2.values()) {
                if (abstractC7800 instanceof AbstractC7800.C7802) {
                    c7802 = (AbstractC7800.C7802) abstractC7800;
                } else {
                    zMo24772 |= abstractC7800.mo24772(view, fM19315, j, c5618);
                }
            }
            zM24777 = zMo24772;
        } else {
            c7802 = null;
            zM24777 = false;
        }
        AbstractC4261[] abstractC4261Arr = this.f15524;
        if (abstractC4261Arr != null) {
            double d2 = fM19315;
            abstractC4261Arr[0].mo6903(d2, this.f15530);
            this.f15524[0].mo6906(d2, this.f15531);
            AbstractC4261 abstractC4261 = this.f15525;
            if (abstractC4261 != null) {
                double[] dArr = this.f15530;
                if (dArr.length > 0) {
                    abstractC4261.mo6903(d2, dArr);
                    this.f15525.mo6906(d2, this.f15531);
                }
            }
            this.f15520.m19470(view, this.f15529, this.f15530, this.f15531, null);
            HashMap<String, AbstractC7544> map3 = this.f15540;
            if (map3 != null) {
                for (AbstractC7544 abstractC7544 : map3.values()) {
                    if (abstractC7544 instanceof AbstractC7544.C7546) {
                        double[] dArr2 = this.f15531;
                        ((AbstractC7544.C7546) abstractC7544).m23655(view, fM19315, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (c7802 != null) {
                double[] dArr3 = this.f15531;
                d = d2;
                zM24777 |= c7802.m24777(view, c5618, fM19315, j, dArr3[0], dArr3[1]);
            } else {
                d = d2;
            }
            int i = 1;
            while (true) {
                AbstractC4261[] abstractC4261Arr2 = this.f15524;
                if (i >= abstractC4261Arr2.length) {
                    break;
                }
                abstractC4261Arr2[i].mo6904(d, this.f15535);
                this.f15520.f15750.get(this.f15532[i - 1]).m29277(view, this.f15535);
                i++;
            }
            C6268 c6268 = this.f15522;
            if (c6268.f15475 == 0) {
                if (fM19315 <= 0.0f) {
                    view.setVisibility(c6268.f15476);
                } else if (fM19315 >= 1.0f) {
                    view.setVisibility(this.f15523.f15476);
                } else if (this.f15523.f15476 != c6268.f15476) {
                    view.setVisibility(0);
                }
            }
            if (this.f15542 != null) {
                int i2 = 0;
                while (true) {
                    C5642[] c5642Arr = this.f15542;
                    if (i2 >= c5642Arr.length) {
                        break;
                    }
                    c5642Arr[i2].m17560(fM19315, view);
                    i2++;
                }
            }
        } else {
            C6282 c6282 = this.f15520;
            float f2 = c6282.f15743;
            C6282 c62822 = this.f15521;
            float f3 = f2 + ((c62822.f15743 - f2) * fM19315);
            float f4 = c6282.f15744;
            float f5 = f4 + ((c62822.f15744 - f4) * fM19315);
            float f6 = c6282.f15745;
            float f7 = c62822.f15745;
            float f8 = c6282.f15746;
            float f9 = c62822.f15746;
            float f10 = f3 + 0.5f;
            int i3 = (int) f10;
            float f11 = f5 + 0.5f;
            int i4 = (int) f11;
            int i5 = (int) (f10 + ((f7 - f6) * fM19315) + f6);
            int i6 = (int) (f11 + ((f9 - f8) * fM19315) + f8);
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (f7 != f6 || f9 != f8) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
            }
            view.layout(i3, i4, i5, i6);
        }
        HashMap<String, AbstractC5620> map4 = this.f15541;
        if (map4 != null) {
            for (AbstractC5620 abstractC5620 : map4.values()) {
                if (abstractC5620 instanceof AbstractC5620.C5626) {
                    double[] dArr4 = this.f15531;
                    ((AbstractC5620.C5626) abstractC5620).m17495(view, fM19315, dArr4[0], dArr4[1]);
                } else {
                    abstractC5620.mo17486(view, fM19315);
                }
            }
        }
        return zM24777;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public String m19332() {
        return this.f1956.getContext().getResources().getResourceEntryName(this.f1956.getId());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m19333(View view, AbstractC5640 abstractC5640, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        C6282 c6282 = this.f15520;
        float f3 = c6282.f15743;
        rectF.left = f3;
        float f4 = c6282.f15744;
        rectF.top = f4;
        rectF.right = f3 + c6282.f15745;
        rectF.bottom = f4 + c6282.f15746;
        RectF rectF2 = new RectF();
        C6282 c62822 = this.f15521;
        float f5 = c62822.f15743;
        rectF2.left = f5;
        float f6 = c62822.f15744;
        rectF2.top = f6;
        rectF2.right = f5 + c62822.f15745;
        rectF2.bottom = f6 + c62822.f15746;
        abstractC5640.mo17507(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m19334(C6282 c6282) {
        c6282.m19468((int) this.f1956.getX(), (int) this.f1956.getY(), this.f1956.getWidth(), this.f1956.getHeight());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m19335(int i) {
        this.f15520.f15740 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m19336(C4128 c4128, C8770 c8770) {
        C6282 c6282 = this.f15521;
        c6282.f15741 = 1.0f;
        c6282.f15742 = 1.0f;
        m19334(c6282);
        this.f15521.m19468(c4128.m11892(), c4128.m11893(), c4128.m11891(), c4128.m11859());
        this.f15521.m2752(c8770.m29405(this.f1957));
        this.f15523.m19307(c4128, c8770, this.f1957);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m19337(int i) {
        this.f15543 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m19338(View view) {
        C6282 c6282 = this.f15520;
        c6282.f15741 = 0.0f;
        c6282.f15742 = 0.0f;
        c6282.m19468(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f15522.m19308(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m19339(C4128 c4128, C8770 c8770) {
        C6282 c6282 = this.f15520;
        c6282.f15741 = 0.0f;
        c6282.f15742 = 0.0f;
        m19334(c6282);
        this.f15520.m19468(c4128.m11892(), c4128.m11893(), c4128.m11891(), c4128.m11859());
        C8770.C1646 c1646M29405 = c8770.m29405(this.f1957);
        this.f15520.m2752(c1646M29405);
        this.f15526 = c1646M29405.f26773.f26900;
        this.f15522.m19307(c4128, c8770, this.f1957);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m19340(View view) {
        this.f1956 = view;
        this.f1957 = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C1641) {
            this.f15518 = ((ConstraintLayout.C1641) layoutParams).m4705();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m19341(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        HashSet<String> hashSet;
        AbstractC7800 abstractC7800M24769;
        C1643 c1643;
        AbstractC7544 abstractC7544M23648;
        C1643 c16432;
        new HashSet();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashSet<String> hashSet4 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i3 = this.f15543;
        if (i3 != AbstractC5616.f13583) {
            this.f15520.f15749 = i3;
        }
        this.f15522.m19300(this.f15523, hashSet3);
        ArrayList<AbstractC5616> arrayList2 = this.f15538;
        if (arrayList2 != null) {
            arrayList = null;
            for (AbstractC5616 abstractC5616 : arrayList2) {
                if (abstractC5616 instanceof C5639) {
                    C5639 c5639 = (C5639) abstractC5616;
                    m19330(new C6282(i, i2, c5639, this.f15520, this.f15521));
                    int i4 = c5639.f13742;
                    if (i4 != AbstractC5616.f13583) {
                        this.f15519 = i4;
                    }
                } else if (abstractC5616 instanceof C5619) {
                    abstractC5616.mo2326(hashSet4);
                } else if (abstractC5616 instanceof C5641) {
                    abstractC5616.mo2326(hashSet2);
                } else if (abstractC5616 instanceof C5642) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C5642) abstractC5616);
                } else {
                    abstractC5616.mo17408(map);
                    abstractC5616.mo2326(hashSet3);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f15542 = (C5642[]) arrayList.toArray(new C5642[0]);
        }
        char c = 1;
        if (!hashSet3.isEmpty()) {
            this.f15540 = new HashMap<>();
            for (String str : hashSet3) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (AbstractC5616 abstractC56162 : this.f15538) {
                        HashMap<String, C1643> map2 = abstractC56162.f13604;
                        if (map2 != null && (c16432 = map2.get(str2)) != null) {
                            sparseArray.append(abstractC56162.f1571, c16432);
                        }
                    }
                    abstractC7544M23648 = AbstractC7544.m23647(str, sparseArray);
                } else {
                    abstractC7544M23648 = AbstractC7544.m23648(str);
                }
                if (abstractC7544M23648 != null) {
                    abstractC7544M23648.m23652(str);
                    this.f15540.put(str, abstractC7544M23648);
                }
            }
            ArrayList<AbstractC5616> arrayList3 = this.f15538;
            if (arrayList3 != null) {
                for (AbstractC5616 abstractC56163 : arrayList3) {
                    if (abstractC56163 instanceof C5617) {
                        abstractC56163.mo2325(this.f15540);
                    }
                }
            }
            this.f15522.m2735(this.f15540, 0);
            this.f15523.m2735(this.f15540, 100);
            for (String str3 : this.f15540.keySet()) {
                this.f15540.get(str3).mo23653(map.containsKey(str3) ? map.get(str3).intValue() : 0);
            }
        }
        if (!hashSet2.isEmpty()) {
            if (this.f15539 == null) {
                this.f15539 = new HashMap<>();
            }
            for (String str4 : hashSet2) {
                if (!this.f15539.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (AbstractC5616 abstractC56164 : this.f15538) {
                            HashMap<String, C1643> map3 = abstractC56164.f13604;
                            if (map3 != null && (c1643 = map3.get(str5)) != null) {
                                sparseArray2.append(abstractC56164.f1571, c1643);
                            }
                        }
                        abstractC7800M24769 = AbstractC7800.m24768(str4, sparseArray2);
                    } else {
                        abstractC7800M24769 = AbstractC7800.m24769(str4, j);
                    }
                    if (abstractC7800M24769 != null) {
                        abstractC7800M24769.m24774(str4);
                        this.f15539.put(str4, abstractC7800M24769);
                    }
                }
            }
            ArrayList<AbstractC5616> arrayList4 = this.f15538;
            if (arrayList4 != null) {
                for (AbstractC5616 abstractC56165 : arrayList4) {
                    if (abstractC56165 instanceof C5641) {
                        ((C5641) abstractC56165).m17547(this.f15539);
                    }
                }
            }
            for (String str6 : this.f15539.keySet()) {
                this.f15539.get(str6).mo24775(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.f15536.size();
        int i5 = size + 2;
        C6282[] c6282Arr = new C6282[i5];
        c6282Arr[0] = this.f15520;
        c6282Arr[size + 1] = this.f15521;
        if (this.f15536.size() > 0 && this.f15519 == -1) {
            this.f15519 = 0;
        }
        Iterator<C6282> it = this.f15536.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            c6282Arr[i6] = it.next();
            i6++;
        }
        HashSet hashSet5 = new HashSet();
        for (String str7 : this.f15521.f15750.keySet()) {
            if (this.f15520.f15750.containsKey(str7)) {
                if (!hashSet3.contains("CUSTOM," + str7)) {
                    hashSet5.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet5.toArray(new String[0]);
        this.f15532 = strArr2;
        this.f15533 = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.f15532;
            if (i7 >= strArr.length) {
                break;
            }
            String str8 = strArr[i7];
            this.f15533[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= i5) {
                    break;
                }
                if (c6282Arr[i8].f15750.containsKey(str8)) {
                    int[] iArr = this.f15533;
                    iArr[i7] = iArr[i7] + c6282Arr[i8].f15750.get(str8).m29273();
                    break;
                }
                i8++;
            }
            i7++;
        }
        boolean z = c6282Arr[0].f15749 != AbstractC5616.f13583;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < i5; i9++) {
            c6282Arr[i9].m19457(c6282Arr[i9 - 1], zArr, this.f15532, z);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        int[] iArr2 = new int[i10];
        this.f15529 = iArr2;
        this.f15530 = new double[iArr2.length];
        this.f15531 = new double[iArr2.length];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.f15529[i12] = i13;
                i12++;
            }
        }
        int i14 = 2;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, this.f15529.length);
        double[] dArr2 = new double[i5];
        for (int i15 = 0; i15 < i5; i15++) {
            c6282Arr[i15].m19458(dArr[i15], this.f15529);
            dArr2[i15] = c6282Arr[i15].f15741;
        }
        int i16 = 0;
        while (true) {
            int[] iArr3 = this.f15529;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] < C6282.f15738.length) {
                String str9 = C6282.f15738[this.f15529[i16]] + " [";
                for (int i17 = 0; i17 < i5; i17++) {
                    str9 = str9 + dArr[i17][i16];
                }
            }
            i16++;
        }
        this.f15524 = new AbstractC4261[this.f15532.length + 1];
        int i18 = 0;
        while (true) {
            String[] strArr3 = this.f15532;
            if (i18 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i18];
            int i19 = 0;
            int i20 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i19 < i5) {
                if (c6282Arr[i19].m19464(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i5];
                        int[] iArr4 = new int[i14];
                        iArr4[c] = c6282Arr[i19].m19462(str10);
                        iArr4[0] = i5;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr4);
                    }
                    C6282 c6282 = c6282Arr[i19];
                    hashSet = hashSet4;
                    dArr3[i20] = c6282.f15741;
                    c6282.m19461(str10, dArr4[i20], 0);
                    i20++;
                } else {
                    hashSet = hashSet4;
                }
                i19++;
                hashSet4 = hashSet;
                i14 = 2;
                c = 1;
            }
            i18++;
            this.f15524[i18] = AbstractC4261.m1226(this.f15519, Arrays.copyOf(dArr3, i20), (double[][]) Arrays.copyOf(dArr4, i20));
            hashSet4 = hashSet4;
            i14 = 2;
            c = 1;
        }
        HashSet<String> hashSet6 = hashSet4;
        this.f15524[0] = AbstractC4261.m1226(this.f15519, dArr2, dArr);
        if (c6282Arr[0].f15749 != AbstractC5616.f13583) {
            int[] iArr5 = new int[i5];
            double[] dArr5 = new double[i5];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, 2);
            for (int i21 = 0; i21 < i5; i21++) {
                iArr5[i21] = c6282Arr[i21].f15749;
                dArr5[i21] = r8.f15741;
                double[] dArr7 = dArr6[i21];
                dArr7[0] = r8.f15743;
                dArr7[1] = r8.f15744;
            }
            this.f15525 = AbstractC4261.m1227(iArr5, dArr5, dArr6);
        }
        this.f15541 = new HashMap<>();
        if (this.f15538 != null) {
            float fM19326 = Float.NaN;
            for (String str11 : hashSet6) {
                AbstractC5620 abstractC5620M17482 = AbstractC5620.m17482(str11);
                if (abstractC5620M17482 != null) {
                    if (abstractC5620M17482.m17489() && Float.isNaN(fM19326)) {
                        fM19326 = m19326();
                    }
                    abstractC5620M17482.m17487(str11);
                    this.f15541.put(str11, abstractC5620M17482);
                }
            }
            for (AbstractC5616 abstractC56166 : this.f15538) {
                if (abstractC56166 instanceof C5619) {
                    ((C5619) abstractC56166).m17480(this.f15541);
                }
            }
            Iterator<AbstractC5620> it2 = this.f15541.values().iterator();
            while (it2.hasNext()) {
                it2.next().m17488(fM19326);
            }
        }
    }
}
