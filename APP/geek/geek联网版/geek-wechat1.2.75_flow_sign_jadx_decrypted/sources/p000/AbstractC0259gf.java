package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.C0994;
import androidx.appcompat.view.menu.C0998;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1007;
import androidx.core.widget.C1011;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.annotation.C1017;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.transformation.C1045;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.p001ui.C1050;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: gf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0259gf {

    /* JADX INFO: renamed from: v */
    public static Method f1977v;

    /* JADX INFO: renamed from: w */
    public static boolean f1978w;

    /* JADX INFO: renamed from: a */
    public static final int[] f1956a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f1957b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f1958c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f1959d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f1960e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f1961f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final float[][] f1962g = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: h */
    public static final float[][] f1963h = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: i */
    public static final float[] f1964i = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: j */
    public static final float[][] f1965j = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: k */
    public static final int[] f1966k = new int[0];

    /* JADX INFO: renamed from: l */
    public static final Object[] f1967l = new Object[0];

    /* JADX INFO: renamed from: m */
    public static final String[] f1968m = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: n */
    public static final double[][] f1969n = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: o */
    public static final double[][] f1970o = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: p */
    public static final double[] f1971p = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: q */
    public static final double[] f1972q = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX INFO: renamed from: r */
    public static final int[] f1973r = {R.attr.theme, com.ljx.wechatmod.R.attr.theme};

    /* JADX INFO: renamed from: s */
    public static final int[] f1974s = {com.ljx.wechatmod.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: t */
    public static final C0426kw f1975t = new C0426kw(2);

    /* JADX INFO: renamed from: u */
    public static final Object f1976u = new Object();

    /* JADX INFO: renamed from: x */
    public static final C0431l0 f1979x = new C0431l0(27, "NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: A */
    public static double m1224A(double[] dArr) {
        double[] dArrM1900u = AbstractC0498mu.m1900u(dArr, f1969n);
        double dM1256q = m1256q(dArrM1900u[0]);
        double dM1256q2 = m1256q(dArrM1900u[1]);
        double dM1256q3 = m1256q(dArrM1900u[2]);
        return Math.atan2(((dM1256q + dM1256q2) - (dM1256q3 * 2.0d)) / 9.0d, ((((-12.0d) * dM1256q2) + (dM1256q * 11.0d)) + dM1256q3) / 11.0d);
    }

    /* JADX INFO: renamed from: B */
    public static int m1225B(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1964i;
        return AbstractC0627qb.m2141a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: C */
    public static double m1226C(double d) {
        double dAbs = Math.abs(d);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m1227D(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m1228E(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: F */
    public static float m1229F(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: G */
    public static int m1230G(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: H */
    public static int m1231H(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: I */
    public static void m1232I(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m1233Q(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        AbstractC0187eh.m995h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: R */
    public static final void m1234R(InterfaceC0295he interfaceC0295he, Object obj) {
        if (obj == f1979x) {
            return;
        }
        if (!(obj instanceof b70)) {
            AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", interfaceC0295he.mo449h(null, C0332ie.f2536f));
            throw new ClassCastException();
        }
        b70 b70Var = (b70) obj;
        y60[] y60VarArr = b70Var.f691b;
        int length = y60VarArr.length - 1;
        if (length < 0) {
            return;
        }
        y60 y60Var = y60VarArr[length];
        AbstractC0493mp.m1854d(null);
        Object obj2 = b70Var.f690a[length];
        throw null;
    }

    /* JADX INFO: renamed from: S */
    public static final void m1235S(C0698s8 c0698s8, InterfaceC0814vd interfaceC0814vd, boolean z) {
        Object obj = C0698s8.f4214g.get(c0698s8);
        Throwable thMo2315e = c0698s8.mo2315e(obj);
        Object objM1311e = thMo2315e != null ? AbstractC0274gu.m1311e(thMo2315e) : c0698s8.mo2316g(obj);
        if (!z) {
            interfaceC0814vd.mo1118f(objM1311e);
            return;
        }
        AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", interfaceC0814vd);
        C0817vg c0817vg = (C0817vg) interfaceC0814vd;
        t50 t50Var = c0817vg.f4956e;
        Object obj2 = c0817vg.f4958g;
        InterfaceC0295he interfaceC0295he = t50Var.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he);
        Object objM1242a0 = m1242a0(interfaceC0295he, obj2);
        t80 t80VarM1243b0 = objM1242a0 != f1979x ? m1243b0(t50Var, interfaceC0295he, objM1242a0) : null;
        try {
            t50Var.mo1118f(objM1311e);
            if (t80VarM1243b0 == null || t80VarM1243b0.m2403K()) {
                m1234R(interfaceC0295he, objM1242a0);
            }
        } catch (Throwable th) {
            if (t80VarM1243b0 == null || t80VarM1243b0.m2403K()) {
                m1234R(interfaceC0295he, objM1242a0);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m1236T(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = oa0.f3426a;
        boolean zM2602a = w90.m2602a(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zM2602a || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zM2602a);
        checkableImageButton.setPressable(zM2602a);
        checkableImageButton.setLongClickable(z);
        x90.m2671s(checkableImageButton, z2 ? 1 : 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v66, types: [android.view.View, android.widget.ScrollView] */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r8v69, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX INFO: renamed from: V */
    public static void m1237V(final Activity activity, C0713sn c0713sn, final boolean z, final InterfaceC0786um interfaceC0786um) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        n00 n00Var;
        ?? r4;
        int i = c0713sn.f4346g;
        AbstractC0493mp.m1857g("act", activity);
        "theme";
        boolean z2 = c0713sn.f4355p;
        int i2 = c0713sn.f4345f;
        "onApply";
        final ?? dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0177e7(dialog, 1));
        int i3 = (int) (((double) activity.getResources().getDisplayMetrics().heightPixels) * 0.88d);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i3);
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i4 = c0713sn.f4341b;
        gradientDrawable.setColor(i4);
        gradientDrawable.setCornerRadii(new float[]{AbstractC0493mp.m1866p(32.0f), AbstractC0493mp.m1866p(32.0f), AbstractC0493mp.m1866p(32.0f), AbstractC0493mp.m1866p(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout2.setBackground(gradientDrawable);
        frameLayout2.setElevation(AbstractC0493mp.m1866p(24.0f));
        ?? M1144g = g40.m1144g(activity, 1);
        View view = new View(activity);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(40), AbstractC0493mp.m1867q(5));
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = AbstractC0493mp.m1867q(16);
        layoutParams2.bottomMargin = AbstractC0493mp.m1867q(16);
        view.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i2);
        gradientDrawable2.setAlpha(80);
        gradientDrawable2.setCornerRadius(AbstractC0493mp.m1866p(10.0f));
        view.setBackground(gradientDrawable2);
        M1144g.addView(view);
        TextView textView = new TextView(activity);
        if (z) {
            str = "XF/44ZbjcP8tFvKm6NMkqgRZ\n";
            str2 = "ufBBBwBalk8=\n";
        } else {
            str = "yKdAuUUIrjyjy0j6HQ/i\n";
            str2 = "IC7yXPihRow=\n";
        }
        textView.setText(b50.m492a(str, str2));
        textView.setTextSize(22.0f);
        textView.setTextColor(c0713sn.f4344e);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(8), AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(16));
        textView.setLayoutParams(layoutParams3);
        M1144g.addView(textView);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(AbstractC0493mp.m1867q(24), 0, AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(24));
        linearLayout.setLayoutParams(layoutParams4);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(c0713sn.f4342c);
        gradientDrawable3.setCornerRadius(AbstractC0493mp.m1866p(24.0f));
        linearLayout.setBackground(gradientDrawable3);
        linearLayout.setClipToOutline(true);
        if (c0713sn.f4351l) {
            linearLayout.setElevation(AbstractC0493mp.m1866p(8.0f));
        }
        C0723sx c0723sxM1238W = m1238W(activity, z, false, "\u2600\ufe0f \u65e5\u95f4\u8272\u5f69\u6548\u679c");
        View view2 = (View) c0723sxM1238W.f4373a;
        View[] viewArr = (View[]) c0723sxM1238W.f4374b;
        C0723sx c0723sxM1238W2 = m1238W(activity, z, true, "\ud83c\udf19 \u6697\u9ed1\u8272\u5f69\u6548\u679c");
        View view3 = (View) c0723sxM1238W2.f4373a;
        View[] viewArr2 = (View[]) c0723sxM1238W2.f4374b;
        linearLayout.addView(view2);
        linearLayout.addView(view3);
        M1144g.addView(linearLayout);
        List listM1595a0 = AbstractC0368jb.m1595a0(new C0365j8("\u9ed8\u8ba4\u7fe0\u7eff", "#34C8FE", "#12A8F4", "#11996B", "#0E855C"), new C0365j8("\u5929\u7a7a\u84dd", "#A1E4FF", "#70CFFE", "#004D61", "#003544"), new C0365j8("\u514b\u83b1\u56e0\u84dd", "#DDE1FF", "#B5C4FF", "#002288", "#001355"), new C0365j8("\u975b\u9752\u84dd", "#C6D2FF", "#A0B3FF", "#223887", "#001861"), new C0365j8("\u83ab\u5170\u7d2b", "#EADDFF", "#D0BCFF", "#4F378B", "#381E72"), new C0365j8("\u661f\u7a7a\u7d2b", "#F6D9FF", "#EAB3FF", "#6A1A9A", "#4A0072"), new C0365j8("\u6a31\u82b1\u7c89", "#FFD9E2", "#FFB1C8", "#8E1546", "#6B0031"), new C0365j8("\u63d0\u9999\u7ea2", "#FFDAD6", "#FFB4AB", "#93000A", "#690005"), new C0365j8("\u6696\u9633\u6a59", "#FFDBC8", "#FFB68E", "#8D3200", "#662000"), new C0365j8("\u7425\u73c0\u91d1", "#FFE082", "#FFCA28", "#FF8F00", "#FF6F00"), new C0365j8("\u62b9\u8336\u7eff", "#C4EED0", "#91D7A4", "#0F5223", "#003814"));
        if (z) {
            List listM1872w = AbstractC0493mp.m1872w(new C0365j8("\u8ddf\u968f\u539f\u751f", "#FFFFFF", "#FFFFFF", "#2C2C2E", "#2C2C2E"));
            ArrayList arrayList = new ArrayList(listM1595a0.size() + listM1872w.size());
            arrayList.addAll(listM1872w);
            arrayList.addAll(listM1595a0);
            listM1595a0 = arrayList;
        }
        if (z) {
            str3 = "KWAW+5D61lYsYTDGg+rdXydaG8yT5do=\n";
            str4 = "QgVvpPaIvzM=\n";
        } else {
            str3 = "4et7aHIBBjXm611DeBEJMtXnZk8=\n";
            str4 = "io4CNxB0ZFc=\n";
        }
        final String strM492a = b50.m492a(str3, str4);
        int i5 = i3;
        n00 n00Var2 = new n00();
        C0417kn.f2847a.getClass();
        n00Var2.f3201a = C0417kn.m1691b(strM492a, 0);
        LinearLayout linearLayoutM1144g = g40.m1144g(activity, 1);
        View[] viewArr3 = viewArr2;
        int i6 = 0;
        linearLayoutM1144g.setPadding(AbstractC0493mp.m1867q(12), 0, AbstractC0493mp.m1867q(12), 0);
        ArrayList arrayList2 = new ArrayList();
        int size = listM1595a0.size();
        ?? r29 = 0;
        ViewGroup viewGroup = linearLayoutM1144g;
        while (i6 < size) {
            int i7 = size;
            if (i6 % 4 == 0) {
                LinearLayout linearLayoutM1144g2 = g40.m1144g(activity, 0);
                n00Var = n00Var2;
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.bottomMargin = AbstractC0493mp.m1867q(20);
                linearLayoutM1144g2.setLayoutParams(layoutParams5);
                linearLayoutM1144g2.setWeightSum(4);
                viewGroup.addView(linearLayoutM1144g2);
                r4 = linearLayoutM1144g2;
            } else {
                n00Var = n00Var2;
                r4 = r29;
            }
            C0365j8 c0365j8 = (C0365j8) listM1595a0.get(i6);
            ?? linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(17);
            List list = listM1595a0;
            int i8 = i6;
            FrameLayout frameLayout3 = frameLayout2;
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            FrameLayout frameLayout4 = new FrameLayout(activity);
            frameLayout4.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(64), AbstractC0493mp.m1867q(64)));
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setShape(1);
            gradientDrawable4.setColor(0);
            frameLayout4.setBackground(gradientDrawable4);
            String str5 = z2 ? c0365j8.f2679d : c0365j8.f2677b;
            String str6 = z2 ? c0365j8.f2680e : c0365j8.f2678c;
            View view4 = new View(activity);
            View[] viewArr4 = viewArr;
            int i9 = i5;
            GradientDrawable gradientDrawable5 = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{Color.parseColor(str5), Color.parseColor(str6)});
            gradientDrawable5.setShape(1);
            if (AbstractC0493mp.m1853c(c0365j8.f2676a, "\u8ddf\u968f\u539f\u751f") && !z2) {
                gradientDrawable5.setStroke(AbstractC0493mp.m1867q(1), Color.parseColor("#E0E0E0"));
            }
            view4.setBackground(gradientDrawable5);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(AbstractC0493mp.m1867q(46), AbstractC0493mp.m1867q(46));
            layoutParams6.gravity = 17;
            view4.setLayoutParams(layoutParams6);
            view4.setElevation(AbstractC0493mp.m1866p(4.0f));
            frameLayout4.addView(view4);
            TextView textView2 = new TextView(activity);
            textView2.setText(c0365j8.f2676a);
            textView2.setTextSize(11.5f);
            textView2.setTextColor(i2);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams7.topMargin = AbstractC0493mp.m1867q(6);
            textView2.setLayoutParams(layoutParams7);
            linearLayout2.addView(frameLayout4);
            linearLayout2.addView(textView2);
            linearLayout2.setTag(Integer.valueOf(i8));
            arrayList2.add(linearLayout2);
            ViewGroup viewGroup2 = viewGroup;
            int i10 = i2;
            FrameLayout frameLayout5 = frameLayout;
            View[] viewArr5 = viewArr3;
            n00Var2 = n00Var;
            linearLayout2.setOnClickListener(new ViewOnClickListenerC0252g8(n00Var2, arrayList2, c0713sn, list, viewArr4, viewArr5, 0));
            if (r4 != 0) {
                r4.addView(linearLayout2);
            }
            i6 = i8 + 1;
            viewGroup = viewGroup2;
            frameLayout2 = frameLayout3;
            viewArr3 = viewArr5;
            i2 = i10;
            frameLayout = frameLayout5;
            listM1595a0 = list;
            viewArr = viewArr4;
            i5 = i9;
            r29 = r4;
            size = i7;
        }
        final List list2 = listM1595a0;
        ?? r3 = frameLayout2;
        int i11 = i5;
        ViewGroup viewGroup3 = viewGroup;
        ?? r24 = frameLayout;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i12);
            i12++;
            Object tag = ((LinearLayout) obj).getTag();
            AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.Int", tag);
            if (((Integer) tag).intValue() == n00Var2.f3201a) {
                break;
            }
        }
        LinearLayout linearLayout3 = (LinearLayout) obj;
        if (linearLayout3 != null) {
            linearLayout3.performClick();
        }
        M1144g.addView(viewGroup3);
        ?? scrollView = new ScrollView(activity);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams8.bottomMargin = AbstractC0493mp.m1867q(100);
        scrollView.setLayoutParams(layoutParams8);
        scrollView.setOverScrollMode(2);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(M1144g);
        r3.addView(scrollView);
        ?? frameLayout6 = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, AbstractC0493mp.m1867q(100));
        layoutParams9.gravity = 80;
        frameLayout6.setLayoutParams(layoutParams9);
        frameLayout6.setPadding(AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(16), AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(24));
        int iRed = Color.red(i4);
        int iGreen = Color.green(i4);
        int iBlue = Color.blue(i4);
        int i13 = 0;
        frameLayout6.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(0, iRed, iGreen, iBlue), i4, i4}));
        TextView textView3 = new TextView(activity);
        g40.m1151n("pvZa1/xFk+X0oEC/uWDLuvLdIYHwNPPRpfRp\n", "QknHMlHddlw=\n", textView3, 16.0f, -1);
        textView3.setTypeface(null, 1);
        textView3.setGravity(17);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, AbstractC0493mp.m1867q(52));
        layoutParams10.gravity = 80;
        textView3.setLayoutParams(layoutParams10);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setColor(i);
        gradientDrawable6.setCornerRadius(AbstractC0493mp.m1866p(100.0f));
        textView3.setBackground(gradientDrawable6);
        int i14 = Build.VERSION.SDK_INT;
        textView3.setElevation(AbstractC0493mp.m1866p(10.0f));
        if (i14 >= 28) {
            textView3.setOutlineSpotShadowColor(i);
        }
        final n00 n00Var3 = n00Var2;
        textView3.setOnClickListener(new View.OnClickListener(list2, n00Var3, strM492a, z, activity, dialog, interfaceC0786um) { // from class: h8

            /* JADX INFO: renamed from: a */
            public final List f2133a;

            /* JADX INFO: renamed from: b */
            public final n00 f2134b;

            /* JADX INFO: renamed from: c */
            public final String f2135c;

            /* JADX INFO: renamed from: d */
            public final boolean f2136d;

            /* JADX INFO: renamed from: e */
            public final Activity f2137e;

            /* JADX INFO: renamed from: f */
            public final Dialog f2138f;

            /* JADX INFO: renamed from: g */
            public final InterfaceC0786um f2139g;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
            {
                String str7;
                String str8;
                String str9;
                String str10;
                int iM763 = C1043.m763("ۢ۟ۥ");
                Double d = null;
                while (true) {
                    switch (iM763) {
                        case 1746752:
                            this.f2138f = dialog;
                            if (C1027.f5674 % (C1004.f5651 ^ (-3797)) > 0) {
                                iM763 = (C1017.f5664 % C1007.f5654) + 1756173;
                            } else {
                                C1046.f5693 = 81;
                                str10 = "ۡۤۡ";
                                iM763 = C1015.m2970(str10);
                            }
                            break;
                        case 1746811:
                            System.out.println(d);
                            if (C1034.f5681 < 0) {
                                str7 = "ۡۤۡ";
                                iM763 = C1026.m3015(str7);
                            } else {
                                C1047.f5694 = 5;
                                iM763 = C1058.m3140("ۥۨۥ");
                            }
                            break;
                        case 1747748:
                            this.f2135c = strM492a;
                            iM763 = C1029.m3029() >= 0 ? C1026.m3015("۟ۡۢ") : (C1024.f5671 | C1042.f5689) + 1749476;
                            break;
                        case 1747837:
                            this.f2137e = activity;
                            if (C1026.f5673 >= 0) {
                                C1002.m2921();
                                str9 = "ۢ۟ۥ";
                            } else {
                                str9 = "۟ۡۢ";
                            }
                            iM763 = C1024.m3009(str9);
                            break;
                        case 1748766:
                            break;
                        case 1749576:
                            this.f2133a = list2;
                            if (C1023.f5670 >= 0) {
                            }
                            str7 = "ۢۦۡ";
                            iM763 = C1026.m3015(str7);
                            break;
                        case 1749731:
                            this.f2136d = z;
                            str9 = "۠ۥۢ";
                            iM763 = C1024.m3009(str9);
                            break;
                        case 1749789:
                            this.f2134b = n00Var3;
                            str10 = "۠ۢۦ";
                            iM763 = C1015.m2970(str10);
                            break;
                        case 1750720:
                            iM763 = (C1023.f5670 % C1011.f5658) ^ (-1748520);
                            break;
                        case 1752492:
                            Double dDecode = Double.decode(C1050.m3110("zqrmPJAIvWhGXY"));
                            iM763 = C1058.m3140("ۣ۟۟");
                            d = dDecode;
                            break;
                        case 1752738:
                            if (C0998.m2903() > 0) {
                                iM763 = (C1023.f5670 % C1011.f5658) ^ (-1748520);
                            } else {
                                if (C1025.f5672 % (C1045.f5692 | (-3981)) >= 0) {
                                    C1003.f5650 = 21;
                                    str8 = "۠ۥۢ";
                                } else {
                                    str8 = "ۥ۠ۧ";
                                }
                                iM763 = C1011.m2955(str8);
                            }
                            break;
                        case 1753570:
                            iM763 = (C0994.f5641 / C1005.f5652) + 1749576;
                            break;
                        case 1755531:
                            this.f2139g = interfaceC0786um;
                            iM763 = C1058.m3140("ۥۨۥ");
                            break;
                    }
                    return;
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0028. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0110 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:178:0x0103 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:186:0x0237 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:194:0x0244 A[SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r28) {
                /*
                    Method dump skipped, instruction units count: 1270
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnClickListenerC0289h8.onClick(android.view.View):void");
            }
        });
        frameLayout6.addView(textView3);
        r3.addView(frameLayout6);
        r24.addView(r3);
        dialog.setContentView(r24);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(Integer.MIN_VALUE);
            window.addFlags(512);
            window.clearFlags(67108864);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (i14 >= 31) {
                window.addFlags(4);
                window.getAttributes().setBlurBehindRadius(40);
                window.setDimAmount(0.3f);
            } else {
                window.setDimAmount(0.5f);
            }
        }
        dialog.setOnShowListener(new DialogInterfaceOnShowListenerC0326i8(r3, i11, i13));
        dialog.show();
    }

    /* JADX INFO: renamed from: W */
    public static final C0723sx m1238W(Activity activity, boolean z, boolean z2, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC0493mp.m1867q(16), AbstractC0493mp.m1867q(16), AbstractC0493mp.m1867q(16), AbstractC0493mp.m1867q(16));
        if (z2) {
            str2 = "VEsptgmZIA==\n";
            str3 = "d3pqh0qoZQk=\n";
        } else {
            str2 = "cEK6iuVG7g==\n";
            str3 = "UwSJzNEA2HQ=\n";
        }
        linearLayout.setBackgroundColor(Color.parseColor(b50.m492a(str2, str3)));
        TextView textView = new TextView(activity);
        if (z) {
            str4 = "3A==\n";
            str5 = "mj5qDj2Tq2g=\n";
        } else {
            str4 = "1A==\n";
            str5 = "k/7AJrVZwto=\n";
        }
        textView.setText(b50.m492a(str4, str5));
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(42), AbstractC0493mp.m1867q(42));
        int iM1867q = AbstractC0493mp.m1867q(16);
        if (z) {
            layoutParams.rightMargin = iM1867q;
        } else {
            layoutParams.leftMargin = iM1867q;
        }
        textView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AbstractC0493mp.m1866p(12.0f));
        if (z) {
            str6 = "QxW8r7f54w==\n";
            str7 = "YCz5lvLApuY=\n";
        } else {
            str6 = "Wn+jjBZP1Q==\n";
            str7 = "eUvgzVB65Qs=\n";
        }
        gradientDrawable.setColor(Color.parseColor(b50.m492a(str6, str7)));
        textView.setBackground(gradientDrawable);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(AbstractC0493mp.m1867q(16), AbstractC0493mp.m1867q(12), AbstractC0493mp.m1867q(16), AbstractC0493mp.m1867q(12));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if (z) {
            gradientDrawable2.setCornerRadii(new float[]{AbstractC0493mp.m1866p(4.0f), AbstractC0493mp.m1866p(4.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f)});
        } else {
            gradientDrawable2.setCornerRadii(new float[]{AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(4.0f), AbstractC0493mp.m1866p(4.0f), AbstractC0493mp.m1866p(12.0f), AbstractC0493mp.m1866p(12.0f)});
        }
        linearLayout2.setBackground(gradientDrawable2);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(activity);
        textView2.setText(str);
        textView2.setTextColor(z2 ? -1 : -16777216);
        textView2.setTextSize(12.0f);
        textView2.setTypeface(null, 1);
        textView2.setAlpha(0.8f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = AbstractC0493mp.m1867q(4);
        textView2.setLayoutParams(layoutParams2);
        View view = new View(activity);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0493mp.m1867q(4));
        layoutParams3.bottomMargin = AbstractC0493mp.m1867q(6);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(-1);
        view.setAlpha(0.6f);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(AbstractC0493mp.m1866p(2.0f));
        view.setBackground(gradientDrawable3);
        View view2 = new View(activity);
        view2.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(80), AbstractC0493mp.m1867q(4)));
        view2.setBackgroundColor(-1);
        view2.setAlpha(0.6f);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(AbstractC0493mp.m1866p(2.0f));
        view2.setBackground(gradientDrawable4);
        linearLayout2.addView(textView2);
        linearLayout2.addView(view);
        linearLayout2.addView(view2);
        if (z) {
            linearLayout.addView(textView);
            linearLayout.addView(linearLayout2);
            View view3 = new View(activity);
            view3.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(40), 1));
            linearLayout.addView(view3);
        } else {
            View view4 = new View(activity);
            view4.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(40), 1));
            linearLayout.addView(view4);
            linearLayout.addView(linearLayout2);
            linearLayout.addView(textView);
        }
        return new C0723sx(linearLayout, new View[]{textView, linearLayout2});
    }

    /* JADX INFO: renamed from: X */
    public static String m1239X(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC0493mp.m1856f("toString(...)", string);
        return string;
    }

    /* JADX INFO: renamed from: Y */
    public static final String m1240Y(InterfaceC0814vd interfaceC0814vd) {
        Object objM1311e;
        if (interfaceC0814vd instanceof C0817vg) {
            return interfaceC0814vd.toString();
        }
        try {
            objM1311e = interfaceC0814vd + '@' + m1262x(interfaceC0814vd);
        } catch (Throwable th) {
            objM1311e = AbstractC0274gu.m1311e(th);
        }
        if (m10.m1794a(objM1311e) != null) {
            objM1311e = interfaceC0814vd.getClass().getName() + '@' + m1262x(interfaceC0814vd);
        }
        return (String) objM1311e;
    }

    /* JADX INFO: renamed from: Z */
    public static double m1241Z(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Object m1242a0(InterfaceC0295he interfaceC0295he, Object obj) {
        if (obj == null) {
            obj = interfaceC0295he.mo449h(0, C0332ie.f2535e);
            AbstractC0493mp.m1854d(obj);
        }
        if (obj == 0) {
            return f1979x;
        }
        if (obj instanceof Integer) {
            return interfaceC0295he.mo449h(new b70(interfaceC0295he, ((Number) obj).intValue()), C0332ie.f2537g);
        }
        g40.m1150m(obj);
        throw null;
    }

    /* JADX INFO: renamed from: b0 */
    public static final t80 m1243b0(InterfaceC0814vd interfaceC0814vd, InterfaceC0295he interfaceC0295he, Object obj) {
        t80 t80Var = null;
        if ((interfaceC0814vd instanceof InterfaceC0667re) && interfaceC0295he.mo447b(u80.f4667a) != null) {
            InterfaceC0667re interfaceC0667reMo824c = (InterfaceC0667re) interfaceC0814vd;
            while (true) {
                if ((interfaceC0667reMo824c instanceof C0855wg) || (interfaceC0667reMo824c = interfaceC0667reMo824c.mo824c()) == null) {
                    break;
                }
                if (interfaceC0667reMo824c instanceof t80) {
                    t80Var = (t80) interfaceC0667reMo824c;
                    break;
                }
            }
            if (t80Var != null) {
                t80Var.m2404L(interfaceC0295he, obj);
            }
        }
        return t80Var;
    }

    /* JADX INFO: renamed from: c */
    public static final C0703sd m1244c(InterfaceC0295he interfaceC0295he) {
        if (interfaceC0295he.mo447b(C0893xh.f5252h) == null) {
            interfaceC0295he = interfaceC0295he.mo450i(new C0752tp());
        }
        return new C0703sd(interfaceC0295he);
    }

    /* JADX INFO: renamed from: c0 */
    public static Context m1245c0(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1974s, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0777ud) && ((C0777ud) context).f4815a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0777ud c0777ud = new C0777ud(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1973r);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0777ud.getTheme().applyStyle(resourceId2, true);
        }
        return c0777ud;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1246d0(android.content.Context r18, java.util.concurrent.Executor r19, p000.InterfaceC0650qy r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0259gf.m1246d0(android.content.Context, java.util.concurrent.Executor, qy, boolean):void");
    }

    /* JADX INFO: renamed from: e0 */
    public static float m1247e0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: f */
    public static void m1248f(Throwable th, Throwable th2) {
        AbstractC0493mp.m1857g("<this>", th);
        AbstractC0493mp.m1857g("exception", th2);
        if (th != th2) {
            Integer num = AbstractC0567op.f3514a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0946yx.f5508a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1249g(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0187eh.m995h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC0187eh.m995h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0187eh.m996i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1250h(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1251i(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = m1252j(r8, r9, r10)
            boolean r1 = m1252j(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = m1230G(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0259gf.m1251i(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1252j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: k */
    public static int m1253k(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: l */
    public static int m1254l(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: p */
    public static void m1255p(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C0456lp(2, 36, 1));
        }
    }

    /* JADX INFO: renamed from: q */
    public static double m1256q(double d) {
        double dPow = Math.pow(Math.abs(d), 0.42d);
        return ((((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX INFO: renamed from: r */
    public static final void m1257r(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m1248f(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static ImageView.ScaleType m1258s(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: t */
    public static final long m1259t(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            fileOutputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC0295he m1260u(InterfaceC0295he interfaceC0295he, InterfaceC0295he interfaceC0295he2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C0332ie c0332ie = C0332ie.f2534d;
        boolean zBooleanValue = ((Boolean) interfaceC0295he.mo449h(bool, c0332ie)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0295he2.mo449h(bool, c0332ie)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0295he.mo450i(interfaceC0295he2);
        }
        C0332ie c0332ie2 = new C0332ie(2, 5);
        C0931yi c0931yi = C0931yi.f5432a;
        InterfaceC0295he interfaceC0295he3 = (InterfaceC0295he) interfaceC0295he.mo449h(c0931yi, c0332ie2);
        Object objMo449h = interfaceC0295he2;
        if (zBooleanValue2) {
            objMo449h = interfaceC0295he2.mo449h(c0931yi, C0332ie.f2533c);
        }
        return interfaceC0295he3.mo450i((InterfaceC0295he) objMo449h);
    }

    /* JADX INFO: renamed from: w */
    public static Drawable m1261w(Context context, int i) {
        return d10.m817b().m820c(context, i);
    }

    /* JADX INFO: renamed from: x */
    public static final String m1262x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    public static final Class m1263y(InterfaceC0123cq interfaceC0123cq) {
        AbstractC0493mp.m1857g("<this>", interfaceC0123cq);
        Class clsMo1964a = ((InterfaceC0737ta) interfaceC0123cq).mo1964a();
        if (clsMo1964a.isPrimitive()) {
            String name = clsMo1964a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo1964a;
    }

    /* JADX INFO: renamed from: J */
    public abstract void mo51J(Throwable th);

    /* JADX INFO: renamed from: K */
    public abstract View mo1264K(int i);

    /* JADX INFO: renamed from: L */
    public abstract boolean mo1265L();

    /* JADX INFO: renamed from: M */
    public abstract void mo52M(C0402k8 c0402k8);

    /* JADX INFO: renamed from: N */
    public abstract Object mo1266N(int i, Intent intent);

    /* JADX INFO: renamed from: O */
    public abstract void mo1267O(C0689s c0689s, C0689s c0689s2);

    /* JADX INFO: renamed from: P */
    public abstract void mo1268P(C0689s c0689s, Thread thread);

    /* JADX INFO: renamed from: U */
    public abstract void mo1269U(Object obj, float f);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo1270m(AbstractFutureC0726t abstractFutureC0726t, C0578p c0578p);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo1271n(AbstractFutureC0726t abstractFutureC0726t, Object obj, Object obj2);

    /* JADX INFO: renamed from: o */
    public abstract boolean mo1272o(AbstractFutureC0726t abstractFutureC0726t, C0689s c0689s, C0689s c0689s2);

    /* JADX INFO: renamed from: v */
    public abstract void mo50v(w30 w30Var, float f, float f2);

    /* JADX INFO: renamed from: z */
    public abstract float mo1273z(Object obj);
}
