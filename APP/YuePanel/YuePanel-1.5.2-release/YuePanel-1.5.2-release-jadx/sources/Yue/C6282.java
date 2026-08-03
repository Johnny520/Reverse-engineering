package Yue;

import android.view.View;
import androidx.constraintlayout.widget.C1643;
import androidx.constraintlayout.widget.C8770;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6282 implements Comparable<C6282> {

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final String f15726 = "MotionPaths";

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final boolean f15727 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final boolean f15728 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f15729 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f15730 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f15731 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f15732 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f15733 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f15734 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f15735 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f15736 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int f15737 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static String[] f15738 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C4586 f15739;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f15740;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public float f15741;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public float f15742;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public float f15743;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public float f15744;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public float f15745;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public float f15746;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public float f15747;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f15748;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f15749;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public LinkedHashMap<String, C1643> f15750;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f15751;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public double[] f15752;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public double[] f15753;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6282() {
        this.f15740 = 0;
        this.f15747 = Float.NaN;
        this.f15748 = Float.NaN;
        this.f15749 = AbstractC5616.f13583;
        this.f15750 = new LinkedHashMap<>();
        this.f15751 = 0;
        this.f15752 = new double[18];
        this.f15753 = new double[18];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final float m19453(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final float m19454(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m2752(C8770.C1646 c1646) {
        this.f15739 = C4586.m13632(c1646.f26773.f26897);
        C8770.C8771 c8771 = c1646.f26773;
        this.f15749 = c8771.f26898;
        this.f15747 = c8771.f26901;
        this.f15740 = c8771.f26899;
        this.f15748 = c1646.f3705.f26904;
        for (String str : c1646.f26776.keySet()) {
            C1643 c1643 = c1646.f26776.get(str);
            if (c1643.m29270() != C1643.EnumC8766.STRING_TYPE) {
                this.f15750.put(str, c1643);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(@InterfaceC6391 C6282 c6282) {
        return Float.compare(this.f15742, c6282.f15742);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m19456(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m19457(C6282 c6282, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | m19456(this.f15742, c6282.f15742);
        zArr[1] = zArr[1] | m19456(this.f15743, c6282.f15743) | z;
        zArr[2] = z | m19456(this.f15744, c6282.f15744) | zArr[2];
        zArr[3] = zArr[3] | m19456(this.f15745, c6282.f15745);
        zArr[4] = m19456(this.f15746, c6282.f15746) | zArr[4];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m19458(double[] dArr, int[] iArr) {
        float[] fArr = {this.f15742, this.f15743, this.f15744, this.f15745, this.f15746, this.f15747};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[r2];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m19459(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f15745;
        float f2 = this.f15746;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m19460(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f15743;
        float f2 = this.f15744;
        float f3 = this.f15745;
        float f4 = this.f15746;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m19461(String str, double[] dArr, int i) {
        C1643 c1643 = this.f15750.get(str);
        if (c1643.m29273() == 1) {
            dArr[i] = c1643.m29271();
            return 1;
        }
        int iM29273 = c1643.m29273();
        c1643.m29272(new float[iM29273]);
        int i2 = 0;
        while (i2 < iM29273) {
            dArr[i] = r1[i2];
            i2++;
            i++;
        }
        return iM29273;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m19462(String str) {
        return this.f15750.get(str).m29273();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m19463(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f15743;
        float f2 = this.f15744;
        float f3 = this.f15745;
        float f4 = this.f15746;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = f2 + 0.0f;
        fArr[i + 2] = f6 + 0.0f;
        fArr[i + 3] = f2 + 0.0f;
        fArr[i + 4] = f6 + 0.0f;
        int i4 = i + 6;
        fArr[i + 5] = f7 + 0.0f;
        fArr[i4] = f + 0.0f;
        fArr[i + 7] = f7 + 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m19464(String str) {
        return this.f15750.containsKey(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m19465(C5639 c5639, C6282 c6282, C6282 c62822) {
        float f = c5639.f1571 / 100.0f;
        this.f15741 = f;
        this.f15740 = c5639.f13720;
        float f2 = Float.isNaN(c5639.f13721) ? f : c5639.f13721;
        float f3 = Float.isNaN(c5639.f13722) ? f : c5639.f13722;
        float f4 = c62822.f15745;
        float f5 = c6282.f15745;
        float f6 = c62822.f15746;
        float f7 = c6282.f15746;
        this.f15742 = this.f15741;
        float f8 = c6282.f15743;
        float f9 = c6282.f15744;
        float f10 = (c62822.f15743 + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (c62822.f15744 + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = ((f4 - f5) * f2) / 2.0f;
        this.f15743 = (int) ((f8 + (f10 * f)) - f12);
        float f13 = ((f6 - f7) * f3) / 2.0f;
        this.f15744 = (int) ((f9 + (f11 * f)) - f13);
        this.f15745 = (int) (f5 + r9);
        this.f15746 = (int) (f7 + r12);
        float f14 = Float.isNaN(c5639.f13723) ? f : c5639.f13723;
        float f15 = Float.isNaN(c5639.f13726) ? 0.0f : c5639.f13726;
        if (!Float.isNaN(c5639.f13724)) {
            f = c5639.f13724;
        }
        float f16 = Float.isNaN(c5639.f13725) ? 0.0f : c5639.f13725;
        this.f15751 = 2;
        this.f15743 = (int) (((c6282.f15743 + (f14 * f10)) + (f16 * f11)) - f12);
        this.f15744 = (int) (((c6282.f15744 + (f10 * f15)) + (f11 * f)) - f13);
        this.f15739 = C4586.m13632(c5639.f13718);
        this.f15749 = c5639.f13719;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m19466(C5639 c5639, C6282 c6282, C6282 c62822) {
        float f = c5639.f1571 / 100.0f;
        this.f15741 = f;
        this.f15740 = c5639.f13720;
        float f2 = Float.isNaN(c5639.f13721) ? f : c5639.f13721;
        float f3 = Float.isNaN(c5639.f13722) ? f : c5639.f13722;
        float f4 = c62822.f15745 - c6282.f15745;
        float f5 = c62822.f15746 - c6282.f15746;
        this.f15742 = this.f15741;
        if (!Float.isNaN(c5639.f13723)) {
            f = c5639.f13723;
        }
        float f6 = c6282.f15743;
        float f7 = c6282.f15745;
        float f8 = c6282.f15744;
        float f9 = c6282.f15746;
        float f10 = (c62822.f15743 + (c62822.f15745 / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (c62822.f15744 + (c62822.f15746 / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = (f4 * f2) / 2.0f;
        this.f15743 = (int) ((f6 + f12) - f13);
        float f14 = f * f11;
        float f15 = (f5 * f3) / 2.0f;
        this.f15744 = (int) ((f8 + f14) - f15);
        this.f15745 = (int) (f7 + r7);
        this.f15746 = (int) (f9 + r8);
        float f16 = Float.isNaN(c5639.f13724) ? 0.0f : c5639.f13724;
        this.f15751 = 1;
        float f17 = (int) ((c6282.f15743 + f12) - f13);
        float f18 = (int) ((c6282.f15744 + f14) - f15);
        this.f15743 = f17 + ((-f11) * f16);
        this.f15744 = f18 + (f10 * f16);
        this.f15739 = C4586.m13632(c5639.f13718);
        this.f15749 = c5639.f13719;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m19467(int i, int i2, C5639 c5639, C6282 c6282, C6282 c62822) {
        float f = c5639.f1571 / 100.0f;
        this.f15741 = f;
        this.f15740 = c5639.f13720;
        float f2 = Float.isNaN(c5639.f13721) ? f : c5639.f13721;
        float f3 = Float.isNaN(c5639.f13722) ? f : c5639.f13722;
        float f4 = c62822.f15745;
        float f5 = c6282.f15745;
        float f6 = c62822.f15746;
        float f7 = c6282.f15746;
        this.f15742 = this.f15741;
        float f8 = c6282.f15743;
        float f9 = c6282.f15744;
        float f10 = c62822.f15743 + (f4 / 2.0f);
        float f11 = c62822.f15744 + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f15743 = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.f15744 = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.f15745 = (int) (f5 + f12);
        this.f15746 = (int) (f7 + f13);
        this.f15751 = 3;
        if (!Float.isNaN(c5639.f13723)) {
            this.f15743 = (int) (c5639.f13723 * ((int) (i - this.f15745)));
        }
        if (!Float.isNaN(c5639.f13724)) {
            this.f15744 = (int) (c5639.f13724 * ((int) (i2 - this.f15746)));
        }
        this.f15739 = C4586.m13632(c5639.f13718);
        this.f15749 = c5639.f13719;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m19468(float f, float f2, float f3, float f4) {
        this.f15743 = f;
        this.f15744 = f2;
        this.f15745 = f3;
        this.f15746 = f4;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m19469(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m19470(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f;
        boolean z;
        float f2 = this.f15743;
        float f3 = this.f15744;
        float f4 = this.f15745;
        float f5 = this.f15746;
        boolean z2 = true;
        if (iArr.length != 0 && this.f15752.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f15752 = new double[i];
            this.f15753 = new double[i];
        }
        Arrays.fill(this.f15752, Double.NaN);
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            double[] dArr4 = this.f15752;
            int i4 = iArr[i3];
            dArr4[i4] = dArr[i3];
            this.f15753[i4] = dArr2[i3];
        }
        float f6 = Float.NaN;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (true) {
            double[] dArr5 = this.f15752;
            if (i2 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i2]) && (dArr3 == null || dArr3[i2] == 0.0d)) {
                z = z2;
                f = f6;
            } else {
                double d = dArr3 != null ? dArr3[i2] : 0.0d;
                if (!Double.isNaN(this.f15752[i2])) {
                    d = this.f15752[i2] + d;
                }
                f = f6;
                float f11 = (float) d;
                float f12 = (float) this.f15753[i2];
                z = true;
                if (i2 == 1) {
                    f6 = f;
                    f2 = f11;
                    f7 = f12;
                } else if (i2 == 2) {
                    f6 = f;
                    f3 = f11;
                    f9 = f12;
                } else if (i2 == 3) {
                    f6 = f;
                    f4 = f11;
                    f8 = f12;
                } else if (i2 == 4) {
                    f6 = f;
                    f5 = f11;
                    f10 = f12;
                } else if (i2 == 5) {
                    f6 = f11;
                }
                i2++;
                z2 = z;
            }
            f6 = f;
            i2++;
            z2 = z;
        }
        float f13 = f6;
        if (!Float.isNaN(f13)) {
            view.setRotation((float) (((double) (Float.isNaN(Float.NaN) ? 0.0f : Float.NaN)) + ((double) f13) + Math.toDegrees(Math.atan2(f9 + (f10 / 2.0f), f7 + (f8 / 2.0f)))));
        } else if (!Float.isNaN(Float.NaN)) {
            view.setRotation(Float.NaN);
        }
        float f14 = f2 + 0.5f;
        int i5 = (int) f14;
        float f15 = f3 + 0.5f;
        int i6 = (int) f15;
        int i7 = (int) (f14 + f4);
        int i8 = (int) (f15 + f5);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    public C6282(int i, int i2, C5639 c5639, C6282 c6282, C6282 c62822) {
        this.f15740 = 0;
        this.f15747 = Float.NaN;
        this.f15748 = Float.NaN;
        this.f15749 = AbstractC5616.f13583;
        this.f15750 = new LinkedHashMap<>();
        this.f15751 = 0;
        this.f15752 = new double[18];
        this.f15753 = new double[18];
        int i3 = c5639.f13727;
        if (i3 == 1) {
            m19466(c5639, c6282, c62822);
        } else if (i3 != 2) {
            m19465(c5639, c6282, c62822);
        } else {
            m19467(i, i2, c5639, c6282, c62822);
        }
    }
}
