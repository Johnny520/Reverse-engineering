package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.C0991;
import android.support.v4.graphics.drawable.C0992;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0996;
import androidx.activity.result.C0994;
import androidx.constraintlayout.helper.widget.C1003;
import androidx.constraintlayout.widget.C1005;
import androidx.constraintlayout.widget.C1006;
import androidx.coordinatorlayout.widget.C1007;
import androidx.coordinatorlayout.widget.C1008;
import androidx.emoji2.text.C1012;
import androidx.fragment.app.C1013;
import androidx.legacy.content.C1014;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1027;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.xor.C1031;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.behavior.C1036;
import com.google.android.material.bottomsheet.C1037;
import com.google.android.material.carousel.C1038;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1042;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.theme.C1048;
import com.ljx.wechatmod.hook.C1052;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: ff */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0222ff {

    /* JADX INFO: renamed from: v */
    public static Method f1955v = null;

    /* JADX INFO: renamed from: w */
    public static boolean f1956w = false;

    /* JADX INFO: renamed from: y */
    public static int f1958y = 0;

    /* JADX INFO: renamed from: z */
    public static String f1959z = "";

    /* JADX INFO: renamed from: a */
    public static final int[] f1934a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f1935b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f1936c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f1937d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f1938e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f1939f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final float[][] f1940g = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: h */
    public static final float[][] f1941h = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: i */
    public static final float[] f1942i = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: j */
    public static final float[][] f1943j = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: k */
    public static final int[] f1944k = new int[0];

    /* JADX INFO: renamed from: l */
    public static final Object[] f1945l = new Object[0];

    /* JADX INFO: renamed from: m */
    public static final String[] f1946m = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: n */
    public static final double[][] f1947n = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: o */
    public static final double[][] f1948o = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: p */
    public static final double[] f1949p = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: q */
    public static final double[] f1950q = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX INFO: renamed from: r */
    public static final int[] f1951r = {R.attr.theme, com.ljx.wechatmod.R.attr.theme};

    /* JADX INFO: renamed from: s */
    public static final int[] f1952s = {com.ljx.wechatmod.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: t */
    public static final C0354iy f1953t = new C0354iy(0);

    /* JADX INFO: renamed from: u */
    public static final Object f1954u = new Object();

    /* JADX INFO: renamed from: x */
    public static final C0431l0 f1957x = new C0431l0(27, "NO_THREAD_ELEMENTS");

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0 A[Catch: RuntimeException -> 0x00a6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00a6, blocks: (B:59:0x009a, B:61:0x00a0), top: B:72:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C0138d4 m1158A(android.content.Context r4, p000.AbstractComponentCallbacksC0489ml r5, boolean r6, boolean r7) {
        /*
            ll r0 = r5.f3232H
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto L9
        L7:
            int r2 = r0.f3074f
        L9:
            if (r7 == 0) goto L1a
            if (r6 == 0) goto L14
            if (r0 != 0) goto L11
        Lf:
            r7 = r1
            goto L27
        L11:
            int r7 = r0.f3072d
            goto L27
        L14:
            if (r0 != 0) goto L17
            goto Lf
        L17:
            int r7 = r0.f3073e
            goto L27
        L1a:
            if (r6 == 0) goto L22
            if (r0 != 0) goto L1f
            goto Lf
        L1f:
            int r7 = r0.f3070b
            goto L27
        L22:
            if (r0 != 0) goto L25
            goto Lf
        L25:
            int r7 = r0.f3071c
        L27:
            r5.m1830B(r1, r1, r1, r1)
            android.view.ViewGroup r0 = r5.f3228D
            r1 = 0
            if (r0 == 0) goto L3d
            r3 = 2131296700(0x7f0901bc, float:1.8211324E38)
            java.lang.Object r0 = r0.getTag(r3)
            if (r0 == 0) goto L3d
            android.view.ViewGroup r0 = r5.f3228D
            r0.setTag(r3, r1)
        L3d:
            android.view.ViewGroup r5 = r5.f3228D
            if (r5 == 0) goto L49
            android.animation.LayoutTransition r5 = r5.getLayoutTransition()
            if (r5 == 0) goto L49
            goto Lb6
        L49:
            if (r7 != 0) goto L7a
            if (r2 == 0) goto L7a
            r5 = 4097(0x1001, float:5.741E-42)
            if (r2 == r5) goto L70
            r5 = 4099(0x1003, float:5.744E-42)
            if (r2 == r5) goto L66
            r5 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r5) goto L5c
            r5 = -1
        L5a:
            r7 = r5
            goto L7a
        L5c:
            if (r6 == 0) goto L62
            r5 = 2130837507(0x7f020003, float:1.727997E38)
            goto L5a
        L62:
            r5 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L5a
        L66:
            if (r6 == 0) goto L6c
            r5 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L5a
        L6c:
            r5 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L5a
        L70:
            if (r6 == 0) goto L76
            r5 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L5a
        L76:
            r5 = 2130837512(0x7f020008, float:1.727998E38)
            goto L5a
        L7a:
            if (r7 == 0) goto Lb6
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L9a
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            if (r6 == 0) goto Lb6
            d4 r0 = new d4     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            return r0
        L98:
            r4 = move-exception
            throw r4
        L9a:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> La6
            if (r6 == 0) goto Lb6
            d4 r0 = new d4     // Catch: java.lang.RuntimeException -> La6
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> La6
            return r0
        La6:
            r6 = move-exception
            if (r5 != 0) goto Lb5
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto Lb6
            d4 r5 = new d4
            r5.<init>(r4)
            return r5
        Lb5:
            throw r6
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0222ff.m1158A(android.content.Context, ml, boolean, boolean):d4");
    }

    /* JADX INFO: renamed from: B */
    public static InterfaceC0258ge m1159B(InterfaceC0184ee interfaceC0184ee, InterfaceC0221fe interfaceC0221fe) {
        AbstractC0346ip.m1503o("key", interfaceC0221fe);
        return AbstractC0346ip.m1497i(interfaceC0184ee.getKey(), interfaceC0221fe) ? C0857wi.f4966a : interfaceC0184ee;
    }

    /* JADX INFO: renamed from: C */
    public static void m1160C(PackageInfo packageInfo, File file) {
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

    /* JADX INFO: renamed from: E */
    public static InterfaceC0258ge m1161E(InterfaceC0184ee interfaceC0184ee, InterfaceC0258ge interfaceC0258ge) {
        AbstractC0346ip.m1503o("context", interfaceC0258ge);
        return a80.m60y(interfaceC0184ee, interfaceC0258ge);
    }

    /* JADX INFO: renamed from: H */
    public static byte[] m1162H(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: I */
    public static byte[] m1163I(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: J */
    public static long m1164J(InputStream inputStream, int i) {
        byte[] bArrM1162H = m1162H(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM1162H[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: K */
    public static void m1165K(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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
        AbstractC0104ch.m688h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: L */
    public static final void m1166L(InterfaceC0258ge interfaceC0258ge, Object obj) {
        if (obj == f1957x) {
            return;
        }
        if (!(obj instanceof v60)) {
            Object objMo1274h = interfaceC0258ge.mo1274h(null, C0295he.f2276f);
            AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", objMo1274h);
            z30.m2768m(objMo1274h);
            throw null;
        }
        v60 v60Var = (v60) obj;
        s60[] s60VarArr = v60Var.f4812b;
        int length = s60VarArr.length - 1;
        if (length < 0) {
            return;
        }
        s60 s60Var = s60VarArr[length];
        AbstractC0346ip.m1500l(null);
        Object obj2 = v60Var.f4811a[length];
        throw null;
    }

    /* JADX INFO: renamed from: M */
    public static void m1167M(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = ja0.f2600a;
        boolean zM2284a = r90.m2284a(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zM2284a || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zM2284a);
        checkableImageButton.setPressable(zM2284a);
        checkableImageButton.setLongClickable(z);
        s90.m2327s(checkableImageButton, z2 ? 1 : 2);
    }

    /* JADX INFO: renamed from: N */
    public static void m1168N(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
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
    /* JADX INFO: renamed from: O */
    public static void m1169O(final Activity activity, C0565on c0565on, final boolean z, final InterfaceC0713sm interfaceC0713sm) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        g00 g00Var;
        ?? r4;
        int i = c0565on.f3561g;
        AbstractC0346ip.m1503o("act", activity);
        "theme";
        boolean z2 = c0565on.f3570p;
        int i2 = c0565on.f3560f;
        "onApply";
        final ?? dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0771u6(dialog, 1));
        int i3 = (int) (((double) activity.getResources().getDisplayMetrics().heightPixels) * 0.88d);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i3);
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i4 = c0565on.f3556b;
        gradientDrawable.setColor(i4);
        gradientDrawable.setCornerRadii(new float[]{m1194p(32.0f), m1194p(32.0f), m1194p(32.0f), m1194p(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout2.setBackground(gradientDrawable);
        frameLayout2.setElevation(m1194p(24.0f));
        ?? M2762g = z30.m2762g(activity, 1);
        View view = new View(activity);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m1195q(40), m1195q(5));
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = m1195q(16);
        layoutParams2.bottomMargin = m1195q(16);
        view.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i2);
        gradientDrawable2.setAlpha(80);
        gradientDrawable2.setCornerRadius(m1194p(10.0f));
        view.setBackground(gradientDrawable2);
        M2762g.addView(view);
        TextView textView = new TextView(activity);
        if (z) {
            str = "Beqe7NyiTXp0o5SropIZL13s\n";
            str2 = "4EUnCkobq8o=\n";
        } else {
            str = "iEd2cxQfCmzjK34wTBhG\n";
            str2 = "YM7Elqm24tw=\n";
        }
        textView.setText(u40.m2419a(str, str2));
        textView.setTextSize(22.0f);
        textView.setTextColor(c0565on.f3559e);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(m1195q(24), m1195q(8), m1195q(24), m1195q(16));
        textView.setLayoutParams(layoutParams3);
        M2762g.addView(textView);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(m1195q(24), 0, m1195q(24), m1195q(24));
        linearLayout.setLayoutParams(layoutParams4);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(c0565on.f3557c);
        gradientDrawable3.setCornerRadius(m1194p(24.0f));
        linearLayout.setBackground(gradientDrawable3);
        linearLayout.setClipToOutline(true);
        if (c0565on.f3566l) {
            linearLayout.setElevation(m1194p(8.0f));
        }
        C0427kx c0427kxM1171Q = m1171Q(activity, z, false, "\u2600\ufe0f \u65e5\u95f4\u8272\u5f69\u6548\u679c");
        View view2 = (View) c0427kxM1171Q.f2976a;
        View[] viewArr = (View[]) c0427kxM1171Q.f2977b;
        C0427kx c0427kxM1171Q2 = m1171Q(activity, z, true, "\ud83c\udf19 \u6697\u9ed1\u8272\u5f69\u6548\u679c");
        View view3 = (View) c0427kxM1171Q2.f2976a;
        View[] viewArr2 = (View[]) c0427kxM1171Q2.f2977b;
        linearLayout.addView(view2);
        linearLayout.addView(view3);
        M2762g.addView(linearLayout);
        List listM549f0 = AbstractC0062bb.m549f0(new C0957z7("\u9ed8\u8ba4\u7fe0\u7eff", "#34C8FE", "#12A8F4", "#11996B", "#0E855C"), new C0957z7("\u5929\u7a7a\u84dd", "#A1E4FF", "#70CFFE", "#004D61", "#003544"), new C0957z7("\u514b\u83b1\u56e0\u84dd", "#DDE1FF", "#B5C4FF", "#002288", "#001355"), new C0957z7("\u975b\u9752\u84dd", "#C6D2FF", "#A0B3FF", "#223887", "#001861"), new C0957z7("\u83ab\u5170\u7d2b", "#EADDFF", "#D0BCFF", "#4F378B", "#381E72"), new C0957z7("\u661f\u7a7a\u7d2b", "#F6D9FF", "#EAB3FF", "#6A1A9A", "#4A0072"), new C0957z7("\u6a31\u82b1\u7c89", "#FFD9E2", "#FFB1C8", "#8E1546", "#6B0031"), new C0957z7("\u63d0\u9999\u7ea2", "#FFDAD6", "#FFB4AB", "#93000A", "#690005"), new C0957z7("\u6696\u9633\u6a59", "#FFDBC8", "#FFB68E", "#8D3200", "#662000"), new C0957z7("\u7425\u73c0\u91d1", "#FFE082", "#FFCA28", "#FF8F00", "#FF6F00"), new C0957z7("\u62b9\u8336\u7eff", "#C4EED0", "#91D7A4", "#0F5223", "#003814"));
        if (z) {
            List listM1469C = AbstractC0346ip.m1469C(new C0957z7("\u8ddf\u968f\u539f\u751f", "#FFFFFF", "#FFFFFF", "#2C2C2E", "#2C2C2E"));
            ArrayList arrayList = new ArrayList(listM549f0.size() + listM1469C.size());
            arrayList.addAll(listM1469C);
            arrayList.addAll(listM549f0);
            listM549f0 = arrayList;
        }
        if (z) {
            str3 = "ZEKOjEdq3mBhQ6ixVHrVaWp4g7tEddI=\n";
            str4 = "Dyf30yEYtwU=\n";
        } else {
            str3 = "FKV8rMt6niUTpVqHwWqRIiCpYYs=\n";
            str4 = "f8AF86kP/Ec=\n";
        }
        final String strM2419a = u40.m2419a(str3, str4);
        int i5 = i3;
        g00 g00Var2 = new g00();
        C0267gn.f2144a.getClass();
        g00Var2.f2000a = C0267gn.m1282b(strM2419a, 0);
        LinearLayout linearLayoutM2762g = z30.m2762g(activity, 1);
        View[] viewArr3 = viewArr2;
        int i6 = 0;
        linearLayoutM2762g.setPadding(m1195q(12), 0, m1195q(12), 0);
        ArrayList arrayList2 = new ArrayList();
        int size = listM549f0.size();
        ?? r29 = 0;
        ViewGroup viewGroup = linearLayoutM2762g;
        while (i6 < size) {
            int i7 = size;
            if (i6 % 4 == 0) {
                LinearLayout linearLayoutM2762g2 = z30.m2762g(activity, 0);
                g00Var = g00Var2;
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.bottomMargin = m1195q(20);
                linearLayoutM2762g2.setLayoutParams(layoutParams5);
                linearLayoutM2762g2.setWeightSum(4);
                viewGroup.addView(linearLayoutM2762g2);
                r4 = linearLayoutM2762g2;
            } else {
                g00Var = g00Var2;
                r4 = r29;
            }
            C0957z7 c0957z7 = (C0957z7) listM549f0.get(i6);
            ?? linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(17);
            List list = listM549f0;
            int i8 = i6;
            FrameLayout frameLayout3 = frameLayout2;
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            FrameLayout frameLayout4 = new FrameLayout(activity);
            frameLayout4.setLayoutParams(new LinearLayout.LayoutParams(m1195q(64), m1195q(64)));
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setShape(1);
            gradientDrawable4.setColor(0);
            frameLayout4.setBackground(gradientDrawable4);
            String str5 = z2 ? c0957z7.f5468d : c0957z7.f5466b;
            String str6 = z2 ? c0957z7.f5469e : c0957z7.f5467c;
            View view4 = new View(activity);
            View[] viewArr4 = viewArr;
            int i9 = i5;
            GradientDrawable gradientDrawable5 = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{Color.parseColor(str5), Color.parseColor(str6)});
            gradientDrawable5.setShape(1);
            if (AbstractC0346ip.m1497i(c0957z7.f5465a, "\u8ddf\u968f\u539f\u751f") && !z2) {
                gradientDrawable5.setStroke(m1195q(1), Color.parseColor("#E0E0E0"));
            }
            view4.setBackground(gradientDrawable5);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(m1195q(46), m1195q(46));
            layoutParams6.gravity = 17;
            view4.setLayoutParams(layoutParams6);
            view4.setElevation(m1194p(4.0f));
            frameLayout4.addView(view4);
            TextView textView2 = new TextView(activity);
            textView2.setText(c0957z7.f5465a);
            textView2.setTextSize(11.5f);
            textView2.setTextColor(i2);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams7.topMargin = m1195q(6);
            textView2.setLayoutParams(layoutParams7);
            linearLayout2.addView(frameLayout4);
            linearLayout2.addView(textView2);
            linearLayout2.setTag(Integer.valueOf(i8));
            arrayList2.add(linearLayout2);
            ViewGroup viewGroup2 = viewGroup;
            int i10 = i2;
            FrameLayout frameLayout5 = frameLayout;
            View[] viewArr5 = viewArr3;
            g00Var2 = g00Var;
            linearLayout2.setOnClickListener(new ViewOnClickListenerC0846w7(g00Var2, arrayList2, c0565on, list, viewArr4, viewArr5, 0));
            if (r4 != 0) {
                r4.addView(linearLayout2);
            }
            i6 = i8 + 1;
            viewGroup = viewGroup2;
            frameLayout2 = frameLayout3;
            viewArr3 = viewArr5;
            i2 = i10;
            frameLayout = frameLayout5;
            listM549f0 = list;
            viewArr = viewArr4;
            i5 = i9;
            r29 = r4;
            size = i7;
        }
        final List list2 = listM549f0;
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
            AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlin.Int", tag);
            if (((Integer) tag).intValue() == g00Var2.f2000a) {
                break;
            }
        }
        LinearLayout linearLayout3 = (LinearLayout) obj;
        if (linearLayout3 != null) {
            linearLayout3.performClick();
        }
        M2762g.addView(viewGroup3);
        ?? scrollView = new ScrollView(activity);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams8.bottomMargin = m1195q(100);
        scrollView.setLayoutParams(layoutParams8);
        scrollView.setOverScrollMode(2);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(M2762g);
        r3.addView(scrollView);
        ?? frameLayout6 = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, m1195q(100));
        layoutParams9.gravity = 80;
        frameLayout6.setLayoutParams(layoutParams9);
        frameLayout6.setPadding(m1195q(24), m1195q(16), m1195q(24), m1195q(24));
        int iRed = Color.red(i4);
        int iGreen = Color.green(i4);
        int iBlue = Color.blue(i4);
        int i13 = 0;
        frameLayout6.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(0, iRed, iGreen, iBlue), i4, i4}));
        TextView textView3 = new TextView(activity);
        z30.m2769n("Y/eIgnpxdWwxoZLqP1QtMzfc89R2ABVYYPW7\n", "h0gVZ9fpkNU=\n", textView3, 16.0f, -1);
        textView3.setTypeface(null, 1);
        textView3.setGravity(17);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, m1195q(52));
        layoutParams10.gravity = 80;
        textView3.setLayoutParams(layoutParams10);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setColor(i);
        gradientDrawable6.setCornerRadius(m1194p(100.0f));
        textView3.setBackground(gradientDrawable6);
        int i14 = Build.VERSION.SDK_INT;
        textView3.setElevation(m1194p(10.0f));
        if (i14 >= 28) {
            textView3.setOutlineSpotShadowColor(i);
        }
        final g00 g00Var3 = g00Var2;
        textView3.setOnClickListener(new View.OnClickListener(list2, g00Var3, strM2419a, z, activity, dialog, interfaceC0713sm) { // from class: x7

            /* JADX INFO: renamed from: a */
            public final List f5114a;

            /* JADX INFO: renamed from: b */
            public final g00 f5115b;

            /* JADX INFO: renamed from: c */
            public final String f5116c;

            /* JADX INFO: renamed from: d */
            public final boolean f5117d;

            /* JADX INFO: renamed from: e */
            public final Activity f5118e;

            /* JADX INFO: renamed from: f */
            public final Dialog f5119f;

            /* JADX INFO: renamed from: g */
            public final InterfaceC0713sm f5120g;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
            {
                String str7;
                String str8;
                String str9;
                String str10;
                Double dValueOf = null;
                int iM2936 = C1008.m2936("ۥۣۧ");
                while (true) {
                    switch (iM2936) {
                        case 1746972:
                            this.f5120g = interfaceC0713sm;
                            str8 = "ۥۨۢ";
                            iM2936 = C1037.m3052(str8);
                            break;
                        case 1747745:
                            break;
                        case 1747812:
                            this.f5118e = activity;
                            if (C1033.m3036() < 0) {
                                str10 = "ۣۤۤ";
                                iM2936 = C1006.m2926(str10);
                            } else {
                                C1006.m2928();
                                str10 = "ۤۨۥ";
                                iM2936 = C1006.m2926(str10);
                            }
                            break;
                        case 1748645:
                            dValueOf = Double.valueOf(C1048.m3096("VCkx9SLrT"));
                            if (C1052.m3110() > 0) {
                                iM2936 = C1037.m3052("ۦۣۧ");
                            } else {
                                C1007.f5651 = 30;
                                str8 = "۟ۨۥ";
                                iM2936 = C1037.m3052(str8);
                            }
                            break;
                        case 1749608:
                            iM2936 = (C1008.f5652 + C0991.f5635) ^ (-1752252);
                            break;
                        case 1749849:
                            this.f5116c = strM2419a;
                            if (C1052.f5696 > 0) {
                                str10 = "ۤۨۥ";
                                iM2936 = C1006.m2926(str10);
                            } else {
                                iM2936 = C1042.m3071("ۣ۠ۢ");
                            }
                            break;
                        case 1750691:
                            this.f5119f = dialog;
                            iM2936 = (C1007.f5651 - C0991.f5635) ^ (-1747461);
                            break;
                        case 1751777:
                            this.f5117d = z;
                            if (C1014.f5658 < 0) {
                                str7 = "۠ۤۨ";
                                iM2936 = C1059.m3137(str7);
                            } else {
                                iM2936 = C1023.m2995("ۢۨ۟");
                            }
                            break;
                        case 1752524:
                            this.f5115b = g00Var3;
                            iM2936 = C1038.m3054("ۢۨ۟");
                            break;
                        case 1752585:
                            this.f5114a = list2;
                            if (C1005.f5649 + (C1007.f5651 - 6152) >= 0) {
                                C0992.f5636 = 0;
                            }
                            str7 = "ۥۡۨ";
                            iM2936 = C1059.m3137(str7);
                            break;
                        case 1752735:
                            if (C1059.m3140() > 0) {
                                iM2936 = C1027.m3010("ۣ۠ۢ");
                            } else if ((C1031.f5675 ^ (C1032.f5676 - 3180)) > 0) {
                                str9 = "ۡ۠ۤ";
                                iM2936 = C1036.m3048(str9);
                            } else {
                                iM2936 = C1041.m3065("ۢ۠ۦ");
                            }
                            break;
                        case 1753546:
                            System.out.println(dValueOf);
                            if (C1012.f5656 * (C0996.f5640 % 6786) < 0) {
                                iM2936 = (C0994.f5638 | C1013.f5657) + 1748132;
                            } else {
                                C1003.f5647 = 77;
                                str9 = "ۨۨۦ";
                                iM2936 = C1036.m3048(str9);
                            }
                            break;
                        case 1755622:
                            iM2936 = C1027.m3010("ۣ۠ۢ");
                            break;
                    }
                    return;
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002a. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:186:0x0097 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:190:0x0087 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:205:0x01c0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:207:0x01b2 A[SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r29) {
                /*
                    Method dump skipped, instruction units count: 1354
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnClickListenerC0883x7.onClick(android.view.View):void");
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
        dialog.setOnShowListener(new DialogInterfaceOnShowListenerC0920y7(r3, i11, i13));
        dialog.show();
    }

    /* JADX INFO: renamed from: P */
    public static void m1170P(Activity activity, Dialog dialog, C0565on c0565on) {
        AbstractC0346ip.m1503o("act", activity);
        AbstractC0346ip.m1503o("theme", c0565on);
        Dialog dialog2 = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0771u6(dialog2, 5));
        int i = (int) (((double) activity.getResources().getDisplayMetrics().heightPixels) * 0.9d);
        int i2 = 1;
        LinearLayout linearLayoutM2762g = z30.m2762g(activity, 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        layoutParams.gravity = 80;
        linearLayoutM2762g.setLayoutParams(layoutParams);
        linearLayoutM2762g.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(c0565on.f3556b);
        gradientDrawable.setCornerRadii(new float[]{m1194p(32.0f), m1194p(32.0f), m1194p(32.0f), m1194p(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayoutM2762g.setBackground(gradientDrawable);
        View view = new View(activity);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m1195q(40), m1195q(5));
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = m1195q(16);
        layoutParams2.bottomMargin = m1195q(16);
        view.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(c0565on.f3560f);
        gradientDrawable2.setAlpha(80);
        gradientDrawable2.setCornerRadius(m1194p(10.0f));
        view.setBackground(gradientDrawable2);
        linearLayoutM2762g.addView(view);
        TextView textView = new TextView(activity);
        textView.setText("\u60ac\u6d6e\u5e95\u680f\u8c03\u5ea6\u5ba4");
        textView.setTextSize(24.0f);
        textView.setTypeface(Typeface.create("sans-serif-black", 0), 0);
        textView.setTextColor(c0565on.f3559e);
        textView.setPadding(m1195q(24), m1195q(8), m1195q(24), m1195q(16));
        linearLayoutM2762g.addView(textView);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, m1195q(80));
        Typeface typeface = C0899xn.f5174a;
        C0899xn.m2630a(activity, linearLayout, "\u7ed3\u6784\u4e0e\u5f62\u6001", c0565on, new C0414kk(activity, c0565on, dialog2, dialog, 2));
        C0899xn.m2630a(activity, linearLayout, "\u72ec\u7acb\u8272\u5f69\u6307\u6d3e", c0565on, new C0414kk(activity, c0565on, dialog2, dialog, 3));
        C0899xn.m2630a(activity, linearLayout, "\u89c6\u89c9\u7cbe\u4fee", c0565on, new C0414kk(activity, c0565on, dialog2, dialog, 4));
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(linearLayout);
        linearLayoutM2762g.addView(scrollView);
        frameLayout.addView(linearLayoutM2762g);
        dialog2.setContentView(frameLayout);
        Window window = dialog2.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(512);
            if (Build.VERSION.SDK_INT >= 31) {
                window.addFlags(4);
                window.getAttributes().setBlurBehindRadius(50);
            }
        }
        dialog2.setOnShowListener(new DialogInterfaceOnShowListenerC0488mk(linearLayoutM2762g, i, i2));
        dialog2.show();
    }

    /* JADX INFO: renamed from: Q */
    public static final C0427kx m1171Q(Activity activity, boolean z, boolean z2, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(m1195q(16), m1195q(16), m1195q(16), m1195q(16));
        if (z2) {
            str2 = "9+aKxFq6kA==\n";
            str3 = "1NfJ9RmL1R0=\n";
        } else {
            str2 = "40LoiOJvGA==\n";
            str3 = "wATbztYpLlA=\n";
        }
        linearLayout.setBackgroundColor(Color.parseColor(u40.m2419a(str2, str3)));
        TextView textView = new TextView(activity);
        if (z) {
            str4 = "sA==\n";
            str5 = "9rcMGpgch+4=\n";
        } else {
            str4 = "4A==\n";
            str5 = "p5+Z3cyZgRA=\n";
        }
        textView.setText(u40.m2419a(str4, str5));
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m1195q(42), m1195q(42));
        int iM1195q = m1195q(16);
        if (z) {
            layoutParams.rightMargin = iM1195q;
        } else {
            layoutParams.leftMargin = iM1195q;
        }
        textView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(m1194p(12.0f));
        if (z) {
            str6 = "0Khe1nglfg==\n";
            str7 = "85Eb7z0cO8Y=\n";
        } else {
            str6 = "WlG8hzqzXQ==\n";
            str7 = "eWX/xnyGbV4=\n";
        }
        gradientDrawable.setColor(Color.parseColor(u40.m2419a(str6, str7)));
        textView.setBackground(gradientDrawable);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(m1195q(16), m1195q(12), m1195q(16), m1195q(12));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if (z) {
            gradientDrawable2.setCornerRadii(new float[]{m1194p(4.0f), m1194p(4.0f), m1194p(12.0f), m1194p(12.0f), m1194p(12.0f), m1194p(12.0f), m1194p(12.0f), m1194p(12.0f)});
        } else {
            gradientDrawable2.setCornerRadii(new float[]{m1194p(12.0f), m1194p(12.0f), m1194p(12.0f), m1194p(12.0f), m1194p(4.0f), m1194p(4.0f), m1194p(12.0f), m1194p(12.0f)});
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
        layoutParams2.bottomMargin = m1195q(4);
        textView2.setLayoutParams(layoutParams2);
        View view = new View(activity);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, m1195q(4));
        layoutParams3.bottomMargin = m1195q(6);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(-1);
        view.setAlpha(0.6f);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(m1194p(2.0f));
        view.setBackground(gradientDrawable3);
        View view2 = new View(activity);
        view2.setLayoutParams(new LinearLayout.LayoutParams(m1195q(80), m1195q(4)));
        view2.setBackgroundColor(-1);
        view2.setAlpha(0.6f);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(m1194p(2.0f));
        view2.setBackground(gradientDrawable4);
        linearLayout2.addView(textView2);
        linearLayout2.addView(view);
        linearLayout2.addView(view2);
        if (z) {
            linearLayout.addView(textView);
            linearLayout.addView(linearLayout2);
            View view3 = new View(activity);
            view3.setLayoutParams(new LinearLayout.LayoutParams(m1195q(40), 1));
            linearLayout.addView(view3);
        } else {
            View view4 = new View(activity);
            view4.setLayoutParams(new LinearLayout.LayoutParams(m1195q(40), 1));
            linearLayout.addView(view4);
            linearLayout.addView(linearLayout2);
            linearLayout.addView(textView);
        }
        return new C0427kx(linearLayout, new View[]{textView, linearLayout2});
    }

    /* JADX INFO: renamed from: R */
    public static final void m1172R(C0565on c0565on, i00 i00Var, View view, TextView textView, TextView textView2, String str, ArrayList arrayList) {
        int color;
        int color2;
        String str2;
        String str3;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LinearLayout linearLayout = (LinearLayout) obj;
            Object tag = linearLayout.getTag();
            AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlin.String", tag);
            String strM2419a = (String) tag;
            boolean zEquals = strM2419a.equals(i00Var.f2326b);
            View childAt = linearLayout.getChildAt(0);
            AbstractC0346ip.m1501m("null cannot be cast to non-null type android.widget.FrameLayout", childAt);
            FrameLayout frameLayout = (FrameLayout) childAt;
            View childAt2 = frameLayout.getChildAt(0);
            AbstractC0346ip.m1501m("null cannot be cast to non-null type com.ljx.wechatmod.ui.dialog.FloatingBarSettingsDialog.showVisualColorPicker.MiniSwatchView", childAt2);
            C0600pk c0600pk = (C0600pk) childAt2;
            View childAt3 = linearLayout.getChildAt(1);
            AbstractC0346ip.m1501m("null cannot be cast to non-null type android.widget.TextView", childAt3);
            TextView textView3 = (TextView) childAt3;
            c0600pk.setSelectedTheme(zEquals);
            c0600pk.invalidate();
            Drawable background = frameLayout.getBackground();
            AbstractC0346ip.m1501m("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable", background);
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            if (zEquals) {
                if (c0565on.f3570p) {
                    str2 = "LXiqG1zzHQZI\n";
                    str3 = "DknrXRq1W0A=\n";
                } else {
                    str2 = "bBuIolrqHh1/\n";
                    str3 = "TyvJkmraLi0=\n";
                }
                color = Color.parseColor(u40.m2419a(str2, str3));
            } else {
                color = 0;
            }
            gradientDrawable.setColor(color);
            if (zEquals) {
                if (strM2419a.equals("#FFFFFF") && !c0565on.f3570p) {
                    strM2419a = "#000000";
                }
                color2 = Color.parseColor(strM2419a);
            } else {
                color2 = c0565on.f3560f;
            }
            textView3.setTextColor(color2);
            textView3.setTypeface(null, zEquals ? 1 : 0);
        }
        m1173S(c0565on, str, view, textView2, (String) i00Var.f2326b);
        CharSequence charSequenceM2419a = (CharSequence) i00Var.f2326b;
        if (charSequenceM2419a.length() == 0) {
            charSequenceM2419a = "\u672a\u8bbe\u7f6e";
        }
        textView.setText(charSequenceM2419a);
    }

    /* JADX INFO: renamed from: S */
    public static final void m1173S(C0565on c0565on, String str, View view, TextView textView, String str2) {
        int color;
        if (str2.length() > 0) {
            try {
                color = Color.parseColor(str2);
            } catch (Exception unused) {
                color = c0565on.f3561g;
            }
        } else {
            color = c0565on.f3561g;
        }
        if (str.equals("key_color_indicator")) {
            Drawable background = view.getBackground();
            AbstractC0346ip.m1501m("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable", background);
            ((GradientDrawable) background).setColor(color);
            textView.setTextColor(str2.length() > 0 ? -1 : c0565on.f3560f);
        }
    }

    /* JADX INFO: renamed from: T */
    public static final String m1174T(InterfaceC0444ld interfaceC0444ld) {
        Object objM812f;
        if (interfaceC0444ld instanceof C0744tg) {
            return interfaceC0444ld.toString();
        }
        try {
            objM812f = interfaceC0444ld + '@' + m1197s(interfaceC0444ld);
        } catch (Throwable th) {
            objM812f = AbstractC0126ct.m812f(th);
        }
        if (f10.m1132a(objM812f) != null) {
            objM812f = interfaceC0444ld.getClass().getName() + '@' + m1197s(interfaceC0444ld);
        }
        return (String) objM812f;
    }

    /* JADX INFO: renamed from: U */
    public static double m1175U(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX INFO: renamed from: V */
    public static final Object m1176V(InterfaceC0258ge interfaceC0258ge, Object obj) {
        if (obj == null) {
            obj = interfaceC0258ge.mo1274h(0, C0295he.f2275e);
            AbstractC0346ip.m1500l(obj);
        }
        if (obj == 0) {
            return f1957x;
        }
        if (obj instanceof Integer) {
            return interfaceC0258ge.mo1274h(new v60(interfaceC0258ge, ((Number) obj).intValue()), C0295he.f2277g);
        }
        z30.m2768m(obj);
        throw null;
    }

    /* JADX INFO: renamed from: W */
    public static Context m1177W(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1952s, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0407kd) && ((C0407kd) context).f2880a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0407kd c0407kd = new C0407kd(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1951r);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0407kd.getTheme().applyStyle(resourceId2, true);
        }
        return c0407kd;
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
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1178X(android.content.Context r18, java.util.concurrent.Executor r19, p000.InterfaceC0391jy r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0222ff.m1178X(android.content.Context, java.util.concurrent.Executor, jy, boolean):void");
    }

    /* JADX INFO: renamed from: Y */
    public static void m1179Y(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: Z */
    public static void m1180Z(ByteArrayOutputStream byteArrayOutputStream, int i) {
        m1179Y(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m1181a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0104ch.m688h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC0104ch.m688h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0104ch.m689i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static float m1182a0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1183b(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX INFO: renamed from: c */
    public static int m1184c(int i, int i2, int[] iArr) {
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

    /* JADX INFO: renamed from: d */
    public static int m1185d(long[] jArr, int i, long j) {
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

    /* JADX INFO: renamed from: h */
    public static void m1186h(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C0306hp(2, 36, 1));
        }
    }

    /* JADX INFO: renamed from: i */
    public static double m1187i(double d) {
        double dPow = Math.pow(Math.abs(d), 0.42d);
        return ((((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX INFO: renamed from: j */
    public static final void m1188j(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0346ip.m1494f(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m1189k(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public static ImageView.ScaleType m1190l(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: m */
    public static final long m1191m(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
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

    /* JADX INFO: renamed from: n */
    public static final Object m1192n(long j, m50 m50Var) throws Throwable {
        EnumC0594pe enumC0594pe;
        InterfaceC0493mp interfaceC0493mp;
        Object objMo1407g;
        C0819vh c0819vh = C0819vh.f4855n;
        if (j > 0) {
            C0326i8 c0326i8 = new C0326i8(AbstractC0346ip.m1512z(m50Var));
            InterfaceC0966zg interfaceC0966zgM1412m = c0326i8.m1412m();
            if (interfaceC0966zgM1412m != null && !(C0326i8.f2364g.get(c0326i8) instanceof InterfaceC0574ow)) {
                interfaceC0966zgM1412m.mo1361b();
                C0326i8.f2365h.set(c0326i8, C0537nw.f3454a);
            }
            InterfaceC0258ge interfaceC0258ge = c0326i8.f2367e;
            if (j < Long.MAX_VALUE) {
                InterfaceC0184ee interfaceC0184eeMo1272b = interfaceC0258ge.mo1272b(C0819vh.f4843b);
                InterfaceC0186eg interfaceC0186eg = interfaceC0184eeMo1272b instanceof InterfaceC0186eg ? (InterfaceC0186eg) interfaceC0184eeMo1272b : null;
                if (interfaceC0186eg == null) {
                    interfaceC0186eg = AbstractC0446lf.f3047a;
                }
                interfaceC0186eg.mo1026c(j, c0326i8);
            }
            boolean zM1414o = c0326i8.m1414o();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0326i8.f2363f;
            while (true) {
                int i = atomicIntegerFieldUpdater.get(c0326i8);
                int i2 = i >> 29;
                enumC0594pe = EnumC0594pe.f3883a;
                if (i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    if (zM1414o) {
                        c0326i8.m1415q();
                    }
                    Object obj = C0326i8.f2364g.get(c0326i8);
                    if (obj instanceof C0516nb) {
                        throw ((C0516nb) obj).f3368a;
                    }
                    int i3 = c0326i8.f4842c;
                    if ((i3 == 1 || i3 == 2) && (interfaceC0493mp = (InterfaceC0493mp) interfaceC0258ge.mo1272b(C0819vh.f4849h)) != null && !interfaceC0493mp.mo1853a()) {
                        CancellationException cancellationExceptionM2590t = ((C0864wp) interfaceC0493mp).m2590t();
                        c0326i8.mo1403a(obj, cancellationExceptionM2590t);
                        throw cancellationExceptionM2590t;
                    }
                    objMo1407g = c0326i8.mo1407g(obj);
                } else if (atomicIntegerFieldUpdater.compareAndSet(c0326i8, i, 536870912 + (536870911 & i))) {
                    if (((InterfaceC0966zg) C0326i8.f2365h.get(c0326i8)) == null) {
                        c0326i8.m1412m();
                    }
                    if (zM1414o) {
                        c0326i8.m1415q();
                    }
                    objMo1407g = enumC0594pe;
                }
            }
            if (objMo1407g == enumC0594pe) {
                return objMo1407g;
            }
        }
        return c0819vh;
    }

    /* JADX INFO: renamed from: o */
    public static ColorStateList m1193o(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0207f0.m1124t(drawable)) {
            return null;
        }
        return AbstractC0207f0.m1108d(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: p */
    public static final float m1194p(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: q */
    public static final int m1195q(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: r */
    public static Drawable m1196r(Context context, int i) {
        return w00.m2537b().m2540c(context, i);
    }

    /* JADX INFO: renamed from: s */
    public static final String m1197s(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t */
    public static final Class m1198t(InterfaceC0938yp interfaceC0938yp) {
        AbstractC0346ip.m1503o("<this>", interfaceC0938yp);
        Class clsMo1238a = ((InterfaceC0441la) interfaceC0938yp).mo1238a();
        if (clsMo1238a.isPrimitive()) {
            String name = clsMo1238a.getName();
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
        return clsMo1238a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m1199u(InterfaceC0258ge interfaceC0258ge, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC0258ge.mo1272b(C0819vh.f4844c);
            if (coroutineExceptionHandler != null) {
                ((C0320i2) coroutineExceptionHandler).m1385d(th);
            } else {
                a80.m50o(interfaceC0258ge, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0346ip.m1494f(runtimeException, th);
                th = runtimeException;
            }
            a80.m50o(interfaceC0258ge, th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static double m1200v(double[] dArr) {
        double[] dArrM2815F = AbstractC0979zt.m2815F(dArr, f1947n);
        double dM1187i = m1187i(dArrM2815F[0]);
        double dM1187i2 = m1187i(dArrM2815F[1]);
        double dM1187i3 = m1187i(dArrM2815F[2]);
        return Math.atan2(((dM1187i + dM1187i2) - (dM1187i3 * 2.0d)) / 9.0d, ((((-12.0d) * dM1187i2) + (dM1187i * 11.0d)) + dM1187i3) / 11.0d);
    }

    /* JADX INFO: renamed from: w */
    public static int m1201w(float f) {
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
        float[] fArr = f1942i;
        return AbstractC0329ib.m1425a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: x */
    public static double m1202x(double d) {
        double dAbs = Math.abs(d);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d < 0.0d ? -1 : d == 0.0d ? 0 : 1));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m1203y(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    /* JADX INFO: renamed from: z */
    public static float m1204z(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: D */
    public abstract Object mo1205D(int i, Intent intent);

    /* JADX INFO: renamed from: F */
    public abstract void mo1206F(C0690s c0690s, C0690s c0690s2);

    /* JADX INFO: renamed from: G */
    public abstract void mo1207G(C0690s c0690s, Thread thread);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1208e(AbstractFutureC0727t abstractFutureC0727t, C0578p c0578p);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo1209f(AbstractFutureC0727t abstractFutureC0727t, Object obj, Object obj2);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo1210g(AbstractFutureC0727t abstractFutureC0727t, C0690s c0690s, C0690s c0690s2);
}
