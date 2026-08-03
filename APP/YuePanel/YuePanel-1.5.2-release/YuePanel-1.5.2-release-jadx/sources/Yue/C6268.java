package Yue;

import Yue.AbstractC7544;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C1643;
import androidx.constraintlayout.widget.C8770;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: Yue.ۥۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6268 implements Comparable<C6268> {

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final String f15469 = "MotionPaths";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f15470 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f15471 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f15472 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static String[] f15473 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f15476;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public C4586 f15489;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f15491;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public float f15492;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public float f15493;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f15494;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public float f15495;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public float f15474 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f15475 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f15477 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public float f15478 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public float f15479 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public float f15480 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public float f15481 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public float f15482 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f15483 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f15484 = Float.NaN;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f15485 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public float f15486 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f15487 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f15488 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f15490 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public float f15496 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public float f15497 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public LinkedHashMap<String, C1643> f15498 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public int f15499 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public double[] f15500 = new double[18];

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public double[] f15501 = new double[18];

    /* JADX INFO: renamed from: ۥ */
    public void m2735(HashMap<String, AbstractC7544> map, int i) {
        AbstractC7544 abstractC7544;
        for (String str : map.keySet()) {
            abstractC7544 = map.get(str);
            str.hashCode();
            switch (str) {
                case "rotationX":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15480) ? 0.0f : this.f15480);
                    break;
                case "rotationY":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15481) ? 0.0f : this.f15481);
                    break;
                case "translationX":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15486) ? 0.0f : this.f15486);
                    break;
                case "translationY":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15487) ? 0.0f : this.f15487);
                    break;
                case "translationZ":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15488) ? 0.0f : this.f15488);
                    break;
                case "progress":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15497) ? 0.0f : this.f15497);
                    break;
                case "scaleX":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15482) ? 1.0f : this.f15482);
                    break;
                case "scaleY":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15483) ? 1.0f : this.f15483);
                    break;
                case "transformPivotX":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15484) ? 0.0f : this.f15484);
                    break;
                case "transformPivotY":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15485) ? 0.0f : this.f15485);
                    break;
                case "rotation":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15479) ? 0.0f : this.f15479);
                    break;
                case "elevation":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15478) ? 0.0f : this.f15478);
                    break;
                case "transitionPathRotate":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15496) ? 0.0f : this.f15496);
                    break;
                case "alpha":
                    abstractC7544.mo23650(i, Float.isNaN(this.f15474) ? 1.0f : this.f15474);
                    break;
                default:
                    if (!str.startsWith(AbstractC5616.f13601)) {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        if (this.f15498.containsKey(str2)) {
                            C1643 c1643 = this.f15498.get(str2);
                            if (abstractC7544 instanceof AbstractC7544.C1295) {
                                ((AbstractC7544.C1295) abstractC7544).m23654(i, c1643);
                            } else {
                                Log.e("MotionPaths", str + " splineSet not a CustomSet frame = " + i + ", value" + c1643.m29271() + abstractC7544);
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN customName " + str2);
                        }
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m19296(View view) {
        this.f15476 = view.getVisibility();
        this.f15474 = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f15477 = false;
        this.f15478 = view.getElevation();
        this.f15479 = view.getRotation();
        this.f15480 = view.getRotationX();
        this.f15481 = view.getRotationY();
        this.f15482 = view.getScaleX();
        this.f15483 = view.getScaleY();
        this.f15484 = view.getPivotX();
        this.f15485 = view.getPivotY();
        this.f15486 = view.getTranslationX();
        this.f15487 = view.getTranslationY();
        this.f15488 = view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m19297(C8770.C1646 c1646) {
        C8770.C8772 c8772 = c1646.f3705;
        int i = c8772.f26902;
        this.f15475 = i;
        int i2 = c8772.f3711;
        this.f15476 = i2;
        this.f15474 = (i2 == 0 || i != 0) ? c8772.f26903 : 0.0f;
        C8770.C8773 c8773 = c1646.f26775;
        this.f15477 = c8773.f26926;
        this.f15478 = c8773.f26927;
        this.f15479 = c8773.f3713;
        this.f15480 = c8773.f26917;
        this.f15481 = c8773.f26918;
        this.f15482 = c8773.f26919;
        this.f15483 = c8773.f26920;
        this.f15484 = c8773.f26921;
        this.f15485 = c8773.f26922;
        this.f15486 = c8773.f26923;
        this.f15487 = c8773.f26924;
        this.f15488 = c8773.f26925;
        this.f15489 = C4586.m13632(c1646.f26773.f26897);
        C8770.C8771 c8771 = c1646.f26773;
        this.f15496 = c8771.f26901;
        this.f15490 = c8771.f26899;
        this.f15497 = c1646.f3705.f26904;
        for (String str : c1646.f26776.keySet()) {
            C1643 c1643 = c1646.f26776.get(str);
            if (c1643.m29270() != C1643.EnumC8766.STRING_TYPE) {
                this.f15498.put(str, c1643);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(C6268 c6268) {
        return Float.compare(this.f15491, c6268.f15491);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m19299(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m19300(C6268 c6268, HashSet<String> hashSet) {
        if (m19299(this.f15474, c6268.f15474)) {
            hashSet.add(AbstractC5616.f13584);
        }
        if (m19299(this.f15478, c6268.f15478)) {
            hashSet.add(AbstractC5616.f13585);
        }
        int i = this.f15476;
        int i2 = c6268.f15476;
        if (i != i2 && this.f15475 == 0 && (i == 0 || i2 == 0)) {
            hashSet.add(AbstractC5616.f13584);
        }
        if (m19299(this.f15479, c6268.f15479)) {
            hashSet.add(AbstractC5616.f13586);
        }
        if (!Float.isNaN(this.f15496) || !Float.isNaN(c6268.f15496)) {
            hashSet.add(AbstractC5616.f13591);
        }
        if (!Float.isNaN(this.f15497) || !Float.isNaN(c6268.f15497)) {
            hashSet.add("progress");
        }
        if (m19299(this.f15480, c6268.f15480)) {
            hashSet.add(AbstractC5616.f13587);
        }
        if (m19299(this.f15481, c6268.f15481)) {
            hashSet.add(AbstractC5616.f13588);
        }
        if (m19299(this.f15484, c6268.f15484)) {
            hashSet.add(AbstractC5616.f13589);
        }
        if (m19299(this.f15485, c6268.f15485)) {
            hashSet.add(AbstractC5616.f13590);
        }
        if (m19299(this.f15482, c6268.f15482)) {
            hashSet.add(AbstractC5616.f13592);
        }
        if (m19299(this.f15483, c6268.f15483)) {
            hashSet.add(AbstractC5616.f13593);
        }
        if (m19299(this.f15486, c6268.f15486)) {
            hashSet.add(AbstractC5616.f13597);
        }
        if (m19299(this.f15487, c6268.f15487)) {
            hashSet.add(AbstractC5616.f13598);
        }
        if (m19299(this.f15488, c6268.f15488)) {
            hashSet.add(AbstractC5616.f13599);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m19301(C6268 c6268, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | m19299(this.f15491, c6268.f15491);
        zArr[1] = zArr[1] | m19299(this.f15492, c6268.f15492);
        zArr[2] = zArr[2] | m19299(this.f15493, c6268.f15493);
        zArr[3] = zArr[3] | m19299(this.f15494, c6268.f15494);
        zArr[4] = m19299(this.f15495, c6268.f15495) | zArr[4];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m19302(double[] dArr, int[] iArr) {
        int i = 0;
        float[] fArr = {this.f15491, this.f15492, this.f15493, this.f15494, this.f15495, this.f15474, this.f15478, this.f15479, this.f15480, this.f15481, this.f15482, this.f15483, this.f15484, this.f15485, this.f15486, this.f15487, this.f15488, this.f15496};
        for (int i2 : iArr) {
            if (i2 < 18) {
                dArr[i] = fArr[r5];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m19303(String str, double[] dArr, int i) {
        C1643 c1643 = this.f15498.get(str);
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

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m19304(String str) {
        return this.f15498.get(str).m29273();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m19305(String str) {
        return this.f15498.containsKey(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m19306(float f, float f2, float f3, float f4) {
        this.f15492 = f;
        this.f15493 = f2;
        this.f15494 = f3;
        this.f15495 = f4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m19307(C4128 c4128, C8770 c8770, int i) {
        m19306(c4128.m11892(), c4128.m11893(), c4128.m11891(), c4128.m11859());
        m19297(c8770.m29405(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m19308(View view) {
        m19306(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        m19296(view);
    }
}
