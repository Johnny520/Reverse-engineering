package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
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
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final float[][] g = null;
    public static final float[][] h = null;
    public static final float[] i = null;
    public static final float[][] j = null;
    public static final int[] k = null;
    public static final Object[] l = null;
    public static final String[] m = null;
    public static final double[][] n = null;
    public static final double[][] o = null;
    public static final double[] p = null;
    public static final double[] q = null;
    public static final int[] r = null;
    public static final int[] s = null;
    public static final iy t = null;
    public static final Object u = null;
    public static Method v = null;
    public static boolean w = false;
    public static final l0 x = null;
    public static int y = 0;
    public static String z = "";

    static {
        a = new int[]{R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
        b = new int[]{R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
        c = new int[]{R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
        d = new int[]{R.attr.name, R.attr.pathData, R.attr.fillType};
        e = new int[]{R.attr.drawable};
        f = new int[]{R.attr.name, R.attr.animation};
        g = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        h = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        i = new float[]{95.047f, 100.0f, 108.883f};
        j = new float[][]{new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
        k = new int[0];
        l = new Object[0];
        m = new String[]{"standard", "accelerate", "decelerate", "linear"};
        n = new double[][]{new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
        o = new double[][]{new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
        p = new double[]{0.2126d, 0.7152d, 0.0722d};
        q = new double[]{0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
        r = new int[]{R.attr.theme, com.ljx.wechatmod.R.attr.theme};
        s = new int[]{com.ljx.wechatmod.R.attr.materialThemeOverlay};
        t = new iy(0);
        u = new Object();
        int r2 = 27;
        x = new l0(r2, "NO_THREAD_ELEMENTS");
    }

    public static d4 A(Context r4, ml r5, boolean r6, boolean r7) {
        ll r0 = r5.H;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        if (r7 == false) goto L14;
        if (r6 == false) goto L11;
        if (r0 != null) goto L10;
    L9:
        int r72 = 0;
    L21:
        r5.B(0, 0, 0, 0);
        ViewGroup r02 = r5.D;
        if (r02 != null) goto L24;
    L26:
        ViewGroup r52 = r5.D;
        if (r52 != null) goto L29;
    L31:
        if (r72 != 0) goto L50;
        if (r2 == 0) goto L50;
        if (r2 != 4097) goto L36;
        if (r6 == false) goto L49;
        int r53 = com.ljx.wechatmod.R.animator.fragment_open_enter;
    L40:
        r72 = r53;
        goto L50
    L49:
        r53 = com.ljx.wechatmod.R.animator.fragment_open_exit;
        goto L40
    L36:
        if (r2 != 4099) goto L38;
        if (r6 == false) goto L46;
        r53 = com.ljx.wechatmod.R.animator.fragment_fade_enter;
        goto L40
    L46:
        r53 = com.ljx.wechatmod.R.animator.fragment_fade_exit;
        goto L40
    L38:
        if (r2 == 8194) goto L41;
        r53 = -1;
        goto L40
    L41:
        if (r6 == false) goto L43;
        r53 = com.ljx.wechatmod.R.animator.fragment_close_enter;
        goto L40
    L43:
        r53 = com.ljx.wechatmod.R.animator.fragment_close_exit;
    L50:
        if (r72 == 0) goto L70;
        boolean r54 = "anim".equals(r4.getResources().getResourceTypeName(r72));
        if (r54 == true) goto L74;
    L72:
        Animator r62 = AnimatorInflater.loadAnimator(r4, r72);     // Catch: RuntimeException -> L63
        if (r62 == null) goto L70;
        return new d4(r62);
    L63:
        e = move-exception;
        if (r54 == true) goto L69;
        Animation r42 = AnimationUtils.loadAnimation(r4, r72);
        if (r42 == null) goto L70;
        return new d4(r42);
    L69:
        throw e;
    L74:
        Animation r63 = AnimationUtils.loadAnimation(r4, r72);     // Catch: Resources.NotFoundException -> L57 RuntimeException -> L71
        if (r63 == null) goto L70;
        return new d4(r63);
    L57:
        e = move-exception;
        throw e;
    L70:
        return null;
    L29:
        if (r52.getLayoutTransition() == null) goto L31;
    L24:
        if (r02.getTag(com.ljx.wechatmod.R.id.visible_removing_fragment_view_tag) == null) goto L26;
        r5.D.setTag(com.ljx.wechatmod.R.id.visible_removing_fragment_view_tag, null);
        goto L26
    L10:
        r72 = r0.d;
        goto L21
    L11:
        if (r0 == null) goto L9;
        r72 = r0.e;
        goto L21
    L14:
        if (r6 == false) goto L18;
        if (r0 == null) goto L9;
        r72 = r0.b;
        goto L21
    L18:
        if (r0 == null) goto L9;
        r72 = r0.c;
        goto L21
    L5:
        r2 = r0.f;
        goto L6
    }

    public static ge B(ee r1, fe r2) {
        ip.o("key", r2);
        if (ip.i(r1.getKey(), r2) == true) goto L5;
        return r1;
    L5:
        return wi.a;
    }

    public static void C(PackageInfo r2, File r3) {
        DataOutputStream r32 = new DataOutputStream(new FileOutputStream(new File(r3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));     // Catch: IOException -> L13
        r32.writeLong(r2.lastUpdateTime);     // Catch: Throwable -> L7
        r32.close();     // Catch: IOException -> L13
        return;
    L7:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L10
    L12:
        throw th;     // Catch: IOException -> L13
    L10:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L13
    }

    public static ge E(ee r1, ge r2) {
        ip.o("context", r2);
        return a80.y(r1, r2);
    }

    public static byte[] H(InputStream r3, int r4) {
        byte[] r0 = new byte[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L9;
        int r2 = r3.read(r0, r1, r4 - r1);
        if (r2 < 0) goto L8;
        r1 = r1 + r2;
        goto L3
    L8:
        throw new IllegalStateException("Not enough bytes to read: " + r4);
    L9:
        return r0;
    }

    public static byte[] I(FileInputStream r8, int r9, int r10) {
        Inflater r0 = new Inflater();
        byte[] r1 = new byte[r10];     // Catch: Throwable -> L15
        byte[] r2 = new byte[2048];     // Catch: Throwable -> L15
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r0.finished() == true) goto L22;
        if (r0.needsDictionary() == true) goto L22;
        if (r4 >= r9) goto L22;
        int r6 = r8.read(r2);     // Catch: Throwable -> L15
        if (r6 < 0) goto L21;
        r0.setInput(r2, 0, r6);     // Catch: Throwable -> L15
        r5 = r5 + r0.inflate(r1, r5, r10 - r5);
        r4 = r4 + r6;
        goto L5
    L17:
        e = move-exception;
        throw new IllegalStateException(e.getMessage());     // Catch: Throwable -> L15
    L21:
        throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + r9 + " bytes");     // Catch: Throwable -> L15
    L22:
        if (r4 != r9) goto L30;
        if (r0.finished() == false) goto L28;
        r0.end();
        return r1;
    L28:
        throw new IllegalStateException("Inflater did not finish");     // Catch: Throwable -> L15
    L30:
        throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + r9 + " actual=" + r4);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r0.end();
        throw th;
    }

    public static long J(InputStream r6, int r7) {
        byte[] r62 = H(r6, r7);
        long r0 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L5;
        r0 = r0 + (((long) (r62[r2] & 255)) << (r2 * 8));
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public static void K(TextInputLayout r5, CheckableImageButton r6, ColorStateList r7) {
        Drawable r0 = r6.getDrawable();
        if (r6.getDrawable() == null) goto L10;
        if (r7 != null) goto L6;
        return;
    L6:
        if (r7.isStateful() == false) goto L12;
        int[] r52 = r5.getDrawableState();
        int[] r1 = r6.getDrawableState();
        int r2 = r52.length;
        int[] r53 = Arrays.copyOf(r52, r52.length + r1.length);
        System.arraycopy(r1, 0, r53, r2, r1.length);
        int r54 = r7.getColorForState(r53, r7.getDefaultColor());
        Drawable r72 = r0.mutate();
        ch.h(r72, ColorStateList.valueOf(r54));
        r6.setImageDrawable(r72);
        return;
    L12:
        return;
    }

    public static final void L(ge r2, Object r3) {
        if (r3 != x) goto L6;
        return;
    L6:
        if ((r3 instanceof v60) == false) goto L12;
        v60 r32 = (v60) r3;
        s60[] r22 = r32.b;
        int r0 = r22.length - 1;
        if (r0 >= 0) goto L10;
        return;
    L10:
        s60 r23 = r22[r0];
        ip.l(null);
        Object r24 = r32.a[r0];
        throw null;
    L12:
        Object r25 = r2.h(null, he.f);
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", r25);
        z30.m(r25);
        throw null;
    }

    public static void M(CheckableImageButton r3, View.OnLongClickListener r4) {
        WeakHashMap r0 = ja0.a;
        boolean r02 = r90.a(r3);
        boolean r1 = false;
        int r2 = 1;
        if (r4 == null) goto L5;
        boolean r42 = true;
    L6:
        if (r02 == true) goto L8;
        if (r42 == true) goto L8;
    L9:
        r3.setFocusable(r1);
        r3.setClickable(r02);
        r3.setPressable(r02);
        r3.setLongClickable(r42);
        if (r1 == true) goto L13;
        r2 = 2;
    L13:
        s90.s(r3, r2);
        return;
    L8:
        r1 = true;
        goto L9
    L5:
        r42 = false;
        goto L6
    }

    public static void N(EditorInfo r2, CharSequence r3, int r4, int r5) {
        if (r2.extras != null) goto L5;
        r2.extras = new Bundle();
    L5:
        if (r3 == null) goto L7;
        SpannableStringBuilder r0 = new SpannableStringBuilder(r3);
    L8:
        r2.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", r0);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", r4);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", r5);
        return;
    L7:
        r0 = null;
        goto L8
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
    public static void O(final Activity r45, on r46, final boolean r47, final sm r48) {
        int r0 = r46.g;
        ip.o(u40.a("Dah/\n", "bMsL9KMTAwY=\n"), r45);
        u40.a("/2D00yk=\n", "iwiRvkxHUeA=\n");
        boolean r1 = r46.p;
        int r2 = r46.f;
        u40.a("KWPK1Ugdqg==\n", "Rg2LpThx0wE=\n");
        final ?? r3 = new Dialog(r45, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout r14 = new FrameLayout(r45);
        r14.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r14.setBackgroundColor(0);
        r14.setOnClickListener(new u6(r3, 1));
        int r7 = (int) (((double) r45.getResources().getDisplayMetrics().heightPixels) * 0.88d);
        FrameLayout r10 = new FrameLayout(r45);
        FrameLayout.LayoutParams r11 = new FrameLayout.LayoutParams(-1, r7);
        r11.gravity = 80;
        r10.setLayoutParams(r11);
        r10.setClickable(true);
        GradientDrawable r112 = new GradientDrawable();
        int r13 = r46.b;
        r112.setColor(r13);
        r112.setCornerRadii(new float[]{p(32.0f), p(32.0f), p(32.0f), p(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        r10.setBackground(r112);
        r10.setElevation(p(24.0f));
        ?? r15 = z30.g(r45, 1);
        View r6 = new View(r45);
        LinearLayout.LayoutParams r113 = new LinearLayout.LayoutParams(q(40), q(5));
        r113.gravity = 1;
        r113.topMargin = q(16);
        r113.bottomMargin = q(16);
        r6.setLayoutParams(r113);
        GradientDrawable r114 = new GradientDrawable();
        r114.setColor(r2);
        r114.setAlpha(80);
        r114.setCornerRadius(p(10.0f));
        r6.setBackground(r114);
        r15.addView(r6);
        TextView r62 = new TextView(r45);
        if (r47 == false) goto L6;
        String r115 = "Beqe7NyiTXp0o5SropIZL13s\n";
        String r132 = "4EUnCkobq8o=\n";
    L7:
        r62.setText(u40.a(r115, r132));
        r62.setTextSize(22.0f);
        r62.setTextColor(r46.e);
        r62.setTypeface(null, 1);
        LinearLayout.LayoutParams r133 = new LinearLayout.LayoutParams(-1, -2);
        r133.setMargins(q(24), q(8), q(24), q(16));
        r62.setLayoutParams(r133);
        r15.addView(r62);
        LinearLayout r12 = new LinearLayout(r45);
        r12.setOrientation(1);
        LinearLayout.LayoutParams r63 = new LinearLayout.LayoutParams(-1, -2);
        r63.setMargins(q(24), 0, q(24), q(24));
        r12.setLayoutParams(r63);
        GradientDrawable r64 = new GradientDrawable();
        r64.setColor(r46.c);
        r64.setCornerRadius(p(24.0f));
        r12.setBackground(r64);
        r12.setClipToOutline(true);
        if (r46.l == false) goto L10;
        r12.setElevation(p(8.0f));
    L10:
        kx r65 = Q(r45, r47, false, u40.a("WS90j9aJAO0sEh332u6puV4KXYb7jsaVJw==\n", "u7f0YG4GIAs=\n"));
        View r8 = (View) r65.a;
        View[] r116 = (View[]) r65.b;
        kx r66 = Q(r45, r47, true, u40.a("gCyvkxadrieZCLLiv8nRDdlVtoLQ5ag=\n", "cLMjCjZ7NLA=\n"));
        View r122 = (View) r66.a;
        View[] r67 = (View[]) r66.b;
        r12.addView(r8);
        r12.addView(r122);
        r15.addView(r12);
        List r16 = bb.f0(new z7[]{new z7(u40.a("U9I+XhU/cdMajh0J\n", "ummmtrublmw=\n"), u40.a("qqNNFdzpvw==\n", "iZB5VuSv+oY=\n"), u40.a("KvrwHAD10w==\n", "CcvCXTiz5zw=\n"), u40.a("RYFTCjOBQQ==\n", "ZrBiMwq3AxM=\n"), u40.a("sVlqYiq+5g==\n", "kmkvWh+LpcY=\n")), new z7(u40.a("pmP6JnqTPHbe\n", "Q8dTwdMp1OU=\n"), u40.a("jaji7DZXGQ==\n", "runTqQIRXxY=\n"), u40.a("oRebkUxekw==\n", "giCr0goY1nk=\n"), u40.a("BTQxuCGlcQ==\n", "JgQBjGWTQFk=\n"), u40.a("rK01pSzc4g==\n", "j50Flhno1oI=\n")), new z7(u40.a("ISXB1heOZ49kSNmj\n", "xKBKPpk/ghQ=\n"), u40.a("NTfNlvmywQ==\n", "FnOJ08j0hyA=\n"), u40.a("e7nxO3KL+A==\n", "WPvEeEbNvms=\n"), u40.a("g6+RZjJpDg==\n", "oJ+hVABRNts=\n"), u40.a("ll5Fx/SolA==\n", "tW519sedoSM=\n")), new z7(u40.a("qJLbFGSZhRnc\n", "QQ9A/fkLbYo=\n"), u40.a("LDV2T/P5Fg==\n", "D3ZAC8G/UAo=\n"), u40.a("7pBN6I11oA==\n", "zdF9qr4z5u8=\n"), u40.a("KXEQdmf0Tw==\n", "CkMiRV/MeI8=\n"), u40.a("5/7w7I8Hyg==\n", "xM7A3bcx+xA=\n")), new z7(u40.a("S898ly/zvXUI\n", "o0HXcqpDWsE=\n"), u40.a("98Tk0caxvQ==\n", "1IGllYL3+3Y=\n"), u40.a("heuB5qvoPA==\n", "pq+xpOiuev8=\n"), u40.a("sGygM8h2ug==\n", "k1jmAP9O+B0=\n"), u40.a("pccnpfjr1w==\n", "hvQflL3c5Q0=\n")), new z7(u40.a("me64tcnFeFTU\n", "f3YnUmB/n+A=\n"), u40.a("8uDpkOdFWg==\n", "0abf1N4DHH0=\n"), u40.a("FspzKci2RQ==\n", "NY8ya/vwAx4=\n"), u40.a("VpPcPyAKug==\n", "daWdDmEz+8A=\n"), u40.a("edSiZp6b1w==\n", "WuDjVq6s5Qw=\n")), new z7(u40.a("et0rOjAihBYV\n", "nHWa0rqTY6Q=\n"), u40.a("e4VsjlD9vA==\n", "WMMqymm4jqU=\n"), u40.a("qbkrF5yMCw==\n", "iv9tVa3PM6E=\n"), u40.a("nc4zJgHdjA==\n", "vvZ2FzTpukw=\n"), u40.a("GRaQT/A7TA==\n", "OiDSf8AIfe8=\n")), new z7(u40.a("Vdprkpn3tmsR\n", "s1X7ez9uUdE=\n"), u40.a("sJolos3wQw==\n", "k9xj5oy0dWc=\n"), u40.a("SnWPWocYpA==\n", "aTPJGLNZ5nY=\n"), u40.a("3fBfC91syg==\n", "/slsO+1ci4Q=\n"), u40.a("H2JujnW8SA==\n", "PFRXvkWMfYY=\n")), new z7(u40.a("ERuvGDiT8mRu\n", "94E58aAgFM0=\n"), u40.a("TsAQ0CZA8A==\n", "bYZWlGQDyLs=\n"), u40.a("BOHGq7AVTw==\n", "J6eA6YYtCkQ=\n"), u40.a("/E7p4CQlCw==\n", "33at0xYVOyc=\n"), u40.a("0AnsWIRXuA==\n", "8z/aarRniKc=\n")), new z7(u40.a("NqihBUCaCiBA\n", "0TgE4s8a46c=\n"), u40.a("GThfzlLmBQ==\n", "On4Zi2LeN1o=\n"), u40.a("42/aN2yKdA==\n", "wCmcdC24TI4=\n"), u40.a("JNfbqJZsPQ==\n", "B5GdkNBcDdo=\n"), u40.a("Lx4B5jFQFg==\n", "DFhH0HdgJqE=\n")), new z7(u40.a("oIINKgyQoHb5\n", "Rgi0woAmR80=\n"), u40.a("xrpldOV8Gw==\n", "5flRMaA4K2k=\n"), u40.a("e+7VXOdZmw==\n", "WNfkGNAYr4U=\n"), u40.a("IwD+Kft0AA==\n", "ADC4HMlGMws=\n"), u40.a("gLNNL/XoHA==\n", "o4N9HM3ZKOo=\n"))});
        if (r47 == false) goto L13;
        List r82 = ip.C(new z7(u40.a("Z13e1RBRGgoQDdWj\n", "j+pBPIre/4Q=\n"), u40.a("FYC04NruAg==\n", "NsbyppyoRNY=\n"), u40.a("A22xibJafw==\n", "ICv3z/QcOcw=\n"), u40.a("5OsYBTnJEg==\n", "x9lbN3r7V9o=\n"), u40.a("eTaS8Rdb2Q==\n", "WgTRw1RpnD0=\n")));
        ArrayList r123 = new ArrayList(r16.size() + r82.size());
        r123.addAll(r82);
        r123.addAll(r16);
        r16 = r123;
    L13:
        if (r47 == false) goto L16;
        String r83 = "ZEKOjEdq3mBhQ6ixVHrVaWp4g7tEddI=\n";
        String r124 = "Dyf30yEYtwU=\n";
    L15:
        final String r84 = u40.a(r83, r124);
        int r125 = r7;
        g00 r72 = new g00();
        gn.a.getClass();
        r72.a = gn.b(r84, 0);
        LinearLayout r134 = z30.g(r45, 1);
        View[] r28 = r67;
        int r68 = 0;
        r134.setPadding(q(12), 0, q(12), 0);
        ArrayList r85 = new ArrayList();
        int r4 = r16.size();
        ?? r29 = 0;
        ViewGroup r135 = r134;
    L18:
        if (r68 >= r4) goto L38;
        int r32 = r4;
        if ((r68 % 4) != 0) goto L22;
        LinearLayout r42 = z30.g(r45, 0);
        g00 r33 = r72;
        LinearLayout.LayoutParams r34 = new LinearLayout.LayoutParams(-1, -2);
        r34.bottomMargin = q(20);
        r42.setLayoutParams(r34);
        r42.setWeightSum(4);
        r135.addView(r42);
        ?? r43 = r42;
    L23:
        z7 r73 = (z7) r16.get(r68);
        ?? r9 = new LinearLayout(r45);
        r9.setOrientation(1);
        r9.setGravity(17);
        List r292 = r16;
        int r342 = r68;
        FrameLayout r35 = r10;
        r9.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        FrameLayout r17 = new FrameLayout(r45);
        r17.setLayoutParams(new LinearLayout.LayoutParams(q(64), q(64)));
        GradientDrawable r36 = new GradientDrawable();
        r36.setShape(1);
        r36.setColor(0);
        r17.setBackground(r36);
        if (r1 == false) goto L26;
        String r37 = r73.d;
    L27:
        if (r1 == false) goto L29;
        String r102 = r73.e;
    L30:
        View r69 = new View(r45);
        View[] r38 = r116;
        int r362 = r125;
        GradientDrawable r39 = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{Color.parseColor(r37), Color.parseColor(r102)});
        r39.setShape(1);
        if (ip.i(r73.a, u40.a("tfbVDvK8WJbCpt54\n", "XUFK52gzvRg=\n")) == false) goto L34;
        if (r1 == true) goto L34;
        r39.setStroke(q(1), Color.parseColor(u40.a("mbwqh0gysg==\n", "uvkawnh3gtk=\n")));
    L34:
        r69.setBackground(r39);
        FrameLayout.LayoutParams r310 = new FrameLayout.LayoutParams(q(46), q(46));
        r310.gravity = 17;
        r69.setLayoutParams(r310);
        r69.setElevation(p(4.0f));
        r17.addView(r69);
        TextView r311 = new TextView(r45);
        r311.setText(r73.a);
        r311.setTextSize(11.5f);
        r311.setTextColor(r2);
        LinearLayout.LayoutParams r610 = new LinearLayout.LayoutParams(-2, -2);
        r610.topMargin = q(6);
        r311.setLayoutParams(r610);
        r9.addView(r17);
        r9.addView(r311);
        r9.setTag(Integer.valueOf(r342));
        r85.add(r9);
        ViewGroup r18 = r135;
        int r162 = r2;
        FrameLayout r24 = r14;
        View[] r126 = r28;
        r72 = r33;
        r9.setOnClickListener(new w7(r72, r85, r46, r292, r38, r126, 0));
        if (r43 == 0) goto L37;
        r43.addView(r9);
    L37:
        r68 = r342 + 1;
        r135 = r18;
        r10 = r35;
        r28 = r126;
        r2 = r162;
        r14 = r24;
        r16 = r292;
        r116 = r38;
        r125 = r362;
        r29 = r43;
        r4 = r32;
        goto L18
    L29:
        r102 = r73.c;
        goto L30
    L26:
        r37 = r73.b;
        goto L27
    L22:
        r33 = r72;
        r43 = r29;
        goto L23
    L38:
        final List r293 = r16;
        ?? r312 = r10;
        int r44 = r125;
        ViewGroup r19 = r135;
        ?? r242 = r14;
        int r22 = r85.size();
        int r611 = 0;
    L39:
        if (r611 >= r22) goto L43;
        Object r117 = r85.get(r611);
        r611 = r611 + 1;
        Object r49 = ((LinearLayout) r117).getTag();
        ip.m(u40.a("Ra7zJiZWw5ZFtOtqZFCCm0qo62pyWoKWRLWyJHNZzthfou8vJl7NjEey8WRPW9Y=\n", "K9ufSgY1ovg=\n"), r49);
        if (((Integer) r49).intValue() != r72.a) goto L39;
    L44:
        LinearLayout r118 = (LinearLayout) r117;
        if (r118 == null) goto L47;
        r118.performClick();
    L47:
        r15.addView(r19);
        ?? r110 = new ScrollView(r45);
        FrameLayout.LayoutParams r23 = new FrameLayout.LayoutParams(-1, -1);
        r23.bottomMargin = q(100);
        r110.setLayoutParams(r23);
        r110.setOverScrollMode(2);
        r110.setVerticalScrollBarEnabled(false);
        r110.addView(r15);
        r312.addView(r110);
        ?? r86 = new FrameLayout(r45);
        FrameLayout.LayoutParams r111 = new FrameLayout.LayoutParams(-1, q(100));
        r111.gravity = 80;
        r86.setLayoutParams(r111);
        r86.setPadding(q(24), q(16), q(24), q(24));
        int r119 = Color.red(r13);
        int r25 = Color.green(r13);
        int r410 = Color.blue(r13);
        int r136 = 0;
        r86.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(0, r119, r25, r410), r13, r13}));
        TextView r92 = new TextView(r45);
        z30.n("Y/eIgnpxdWwxoZLqP1QtMzfc89R2ABVYYPW7\n", "h0gVZ9fpkNU=\n", r92, 16.0f, -1);
        r92.setTypeface(null, 1);
        r92.setGravity(17);
        FrameLayout.LayoutParams r120 = new FrameLayout.LayoutParams(-1, q(52));
        r120.gravity = 80;
        r92.setLayoutParams(r120);
        GradientDrawable r121 = new GradientDrawable();
        r121.setColor(r0);
        r121.setCornerRadius(p(100.0f));
        r92.setBackground(r121);
        int r103 = Build.VERSION.SDK_INT;
        r92.setElevation(p(10.0f));
        if (r103 < 28) goto L50;
        c0.B(r92, r0);
    L50:
        final g00 r26 = r72;
        r92.setOnClickListener(new x7(r293, r26, r84, r47, r45, r3, r48));
        r86.addView(r92);
        r312.addView(r86);
        r242.addView(r312);
        r3.setContentView(r242);
        Window r02 = r3.getWindow();
        if (r02 == null) goto L56;
        r02.setLayout(-1, -1);
        r02.setBackgroundDrawable(new ColorDrawable(0));
        r02.addFlags(Integer.MIN_VALUE);
        r02.addFlags(512);
        r02.clearFlags(67108864);
        r02.setStatusBarColor(0);
        r02.setNavigationBarColor(0);
        if (r103 < 31) goto L55;
        r02.addFlags(4);
        p7.u(r02.getAttributes());
        r02.setDimAmount(0.3f);
        goto L56
    L55:
        r02.setDimAmount(0.5f);
    L56:
        r3.setOnShowListener(new y7(r312, r44, r136));
        r3.show();
        return;
    L43:
        r117 = null;
        goto L44
    L16:
        r83 = "FKV8rMt6niUTpVqHwWqRIiCpYYs=\n";
        r124 = "f8AF86kP/Ec=\n";
        goto L15
    L6:
        r115 = "iEd2cxQfCmzjK34wTBhG\n";
        r132 = "YM7Elqm24tw=\n";
        goto L7
    }

    public static void P(Activity r17, Dialog r18, on r19) {
        ip.o(u40.a("7NPh\n", "jbCVajY4jqw=\n"), r17);
        ip.o(u40.a("UWHIT10=\n", "JQmtIjg0lH0=\n"), r19);
        Dialog r3 = new Dialog(r17, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout r6 = new FrameLayout(r17);
        r6.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r6.setBackgroundColor(0);
        r6.setOnClickListener(new u6(r3, 5));
        int r9 = (int) (((double) r17.getResources().getDisplayMetrics().heightPixels) * 0.9d);
        int r10 = 1;
        LinearLayout r11 = z30.g(r17, 1);
        FrameLayout.LayoutParams r0 = new FrameLayout.LayoutParams(-1, r9);
        r0.gravity = 80;
        r11.setLayoutParams(r0);
        r11.setClickable(true);
        GradientDrawable r02 = new GradientDrawable();
        r02.setColor(r19.b);
        r02.setCornerRadii(new float[]{p(32.0f), p(32.0f), p(32.0f), p(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        r11.setBackground(r02);
        View r03 = new View(r17);
        LinearLayout.LayoutParams r7 = new LinearLayout.LayoutParams(q(40), q(5));
        r7.gravity = 1;
        r7.topMargin = q(16);
        r7.bottomMargin = q(16);
        r03.setLayoutParams(r7);
        GradientDrawable r72 = new GradientDrawable();
        r72.setColor(r19.f);
        r72.setAlpha(80);
        r72.setCornerRadius(p(10.0f));
        r03.setBackground(r72);
        r11.addView(r03);
        TextView r04 = new TextView(r17);
        r04.setText(u40.a("AvWLXVLHQIhxkYc0D9km117RwhVD\n", "5Hcnu+dppTI=\n"));
        r04.setTextSize(24.0f);
        r04.setTypeface(Typeface.create(u40.a("eprzXacdwI9gnbBM5g/Glg==\n", "CfudLopupf0=\n"), 0), 0);
        r04.setTextColor(r19.e);
        r04.setPadding(q(24), q(8), q(24), q(16));
        r11.addView(r04);
        LinearLayout r73 = new LinearLayout(r17);
        r73.setOrientation(1);
        r73.setPadding(0, 0, 0, q(80));
        Typeface r05 = xn.a;
        xn.a(r17, r73, u40.a("QkbTYqrO2ZkrGP0m0sq8\n", "pf1AhDRKPSE=\n"), r19, new kk(r17, r19, r3, r18, 2));
        xn.a(r17, r73, u40.a("sGgiY0syiQLlBjMtBjXmbeNd\n", "V+OOhOC5YYs=\n"), r19, new kk(r17, r19, r3, r18, 3));
        xn.a(r17, r73, u40.a("MedjoI9zNvlnpFrm\n", "2UDlSCj60Us=\n"), r19, new kk(r17, r19, r3, r18, 4));
        ScrollView r06 = new ScrollView(r17);
        r06.setVerticalScrollBarEnabled(false);
        r06.addView(r73);
        r11.addView(r06);
        r6.addView(r11);
        r3.setContentView(r6);
        Window r07 = r3.getWindow();
        if (r07 == null) goto L7;
        r07.setLayout(-1, -1);
        r07.setBackgroundDrawable(new ColorDrawable(0));
        r07.addFlags(512);
        if (Build.VERSION.SDK_INT < 31) goto L7;
        r07.addFlags(4);
        p7.m(r07.getAttributes());
    L7:
        r3.setOnShowListener(new mk(r11, r9, r10));
        r3.show();
    }

    public static final kx Q(Activity r25, boolean r26, boolean r27, String r28) {
        LinearLayout r1 = new LinearLayout(r25);
        r1.setOrientation(0);
        r1.setGravity(16);
        r1.setPadding(q(16), q(16), q(16), q(16));
        if (r27 == false) goto L6;
        String r4 = "9+aKxFq6kA==\n";
        String r5 = "1NfJ9RmL1R0=\n";
    L7:
        r1.setBackgroundColor(Color.parseColor(u40.a(r4, r5)));
        TextView r42 = new TextView(r25);
        if (r26 == false) goto L11;
        String r52 = "sA==\n";
        String r6 = "9rcMGpgch+4=\n";
    L12:
        r42.setText(u40.a(r52, r6));
        r42.setTextColor(-1);
        r42.setTextSize(18.0f);
        r42.setTypeface(null, 1);
        r42.setGravity(17);
        LinearLayout.LayoutParams r8 = new LinearLayout.LayoutParams(q(42), q(42));
        int r9 = q(16);
        if (r26 == false) goto L15;
        r8.rightMargin = r9;
    L16:
        r42.setLayoutParams(r8);
        GradientDrawable r82 = new GradientDrawable();
        r82.setCornerRadius(p(12.0f));
        if (r26 == false) goto L20;
        String r10 = "0Khe1nglfg==\n";
        String r11 = "85Eb7z0cO8Y=\n";
    L21:
        r82.setColor(Color.parseColor(u40.a(r10, r11)));
        r42.setBackground(r82);
        LinearLayout r83 = new LinearLayout(r25);
        r83.setOrientation(1);
        r83.setGravity(16);
        r83.setPadding(q(16), q(12), q(16), q(12));
        GradientDrawable r3 = new GradientDrawable();
        if (r26 == false) goto L24;
        r3.setCornerRadii(new float[]{p(4.0f), p(4.0f), p(12.0f), p(12.0f), p(12.0f), p(12.0f), p(12.0f), p(12.0f)});
    L25:
        r83.setBackground(r3);
        r83.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r32 = new TextView(r25);
        r32.setText(r28);
        if (r27 == false) goto L28;
        int r102 = -1;
    L29:
        r32.setTextColor(r102);
        r32.setTextSize(12.0f);
        r32.setTypeface(null, 1);
        r32.setAlpha(0.8f);
        LinearLayout.LayoutParams r62 = new LinearLayout.LayoutParams(-2, -2);
        r62.bottomMargin = q(4);
        r32.setLayoutParams(r62);
        View r63 = new View(r25);
        LinearLayout.LayoutParams r92 = new LinearLayout.LayoutParams(-1, q(4));
        r92.bottomMargin = q(6);
        r63.setLayoutParams(r92);
        r63.setBackgroundColor(-1);
        r63.setAlpha(0.6f);
        GradientDrawable r103 = new GradientDrawable();
        r103.setCornerRadius(p(2.0f));
        r63.setBackground(r103);
        View r104 = new View(r25);
        r104.setLayoutParams(new LinearLayout.LayoutParams(q(80), q(4)));
        r104.setBackgroundColor(-1);
        r104.setAlpha(0.6f);
        GradientDrawable r53 = new GradientDrawable();
        r53.setCornerRadius(p(2.0f));
        r104.setBackground(r53);
        r83.addView(r32);
        r83.addView(r63);
        r83.addView(r104);
        if (r26 == false) goto L32;
        r1.addView(r42);
        r1.addView(r83);
        View r54 = new View(r25);
        r54.setLayoutParams(new LinearLayout.LayoutParams(q(40), 1));
        r1.addView(r54);
    L34:
        return new kx(r1, new View[]{r42, r83});
    L32:
        View r55 = new View(r25);
        r55.setLayoutParams(new LinearLayout.LayoutParams(q(40), 1));
        r1.addView(r55);
        r1.addView(r83);
        r1.addView(r42);
        goto L34
    L28:
        r102 = -16777216;
        goto L29
    L24:
        r3.setCornerRadii(new float[]{p(12.0f), p(12.0f), p(12.0f), p(12.0f), p(4.0f), p(4.0f), p(12.0f), p(12.0f)});
        goto L25
    L20:
        r10 = "WlG8hzqzXQ==\n";
        r11 = "eWX/xnyGbV4=\n";
        goto L21
    L15:
        r8.leftMargin = r9;
        goto L16
    L11:
        r52 = "4A==\n";
        r6 = "p5+Z3cyZgRA=\n";
        goto L12
    L6:
        r4 = "40LoiOJvGA==\n";
        r5 = "wATbztYpLlA=\n";
        goto L7
    }

    public static final void R(on r11, i00 r12, View r13, TextView r14, TextView r15, String r16, ArrayList r17) {
        int r0 = r17.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L23;
        Object r4 = r17.get(r2);
        r2 = r2 + 1;
        LinearLayout r42 = (LinearLayout) r4;
        Object r5 = r42.getTag();
        ip.m(u40.a("YSA300or3kphOi+fCC2fR24mL58eJ59KYDt20R8k0wR7LCvaSiPQUGM8NZE5PM1NYTI=\n", "D1Vbv2pIvyQ=\n"), r5);
        String r52 = (String) r5;
        boolean r6 = r52.equals(r12.b);
        View r7 = r42.getChildAt(0);
        ip.m(u40.a("KjaXHki1J8YqLI9SCrNmyyUwj1IcuWbGKy3WHB26KogwOosXSLcozDYskhZGoS/MIyaPXC6kJ8Uh\nD5oLB6My\n", "REP7cmjWRqg=\n"), r7);
        FrameLayout r72 = (FrameLayout) r7;
        View r8 = r72.getChildAt(0);
        ip.m(u40.a("QGbcLSeUqG1AfMRhZZLpYE9gxGFzmOltQX2dL3KbpSNaasAkJ5SmbgB/2jkpgKxgRnLELGiT53ZH\nPdQoZpumZABV3C5mg6BtSVHRM1SSvXdHfdcyQ56ob0F0njJvmL5VR2DFIGu0pm9BYeAoZJyscQBe\n2S9upL5iWnDYF26Svg==\n", "LhOwQQf3yQM=\n"), r8);
        pk r82 = (pk) r8;
        View r43 = r42.getChildAt(1);
        ip.m(u40.a("cl0NDn0GdPxyRxVCPwA18X1bFUIpCjX8c0ZMDCgJebJoUREHfQR79m5HCAZzEnz2e00VTAkAbeZK\nQQQV\n", "HChhYl1lFZI=\n"), r43);
        TextView r44 = (TextView) r43;
        r82.setSelectedTheme(r6);
        r82.invalidate();
        Drawable r73 = r72.getBackground();
        ip.m(u40.a("QpeYwMNUX19CjYCMgVIeUk2RgIyXWB5fQ4zZwpZbUhFYm4TJw1ZQVV6NncjNUExQXIqdz5AZWkNN\nlZXOj1IQdl6DkMWGWUp1XoODzYFbWw==\n", "LOL0rOM3PjE=\n"), r73);
        GradientDrawable r74 = (GradientDrawable) r73;
        if (r6 == true) goto L7;
        int r83 = 0;
    L13:
        r74.setColor(r83);
        if (r6 == true) goto L16;
        int r53 = r11.f;
    L22:
        r44.setTextColor(r53);
        r44.setTypeface(null, r6 ? 1 : 0);
        goto L3
    L16:
        if (r52.equals(u40.a("9Wc7ZPIb5w==\n", "1iF9IrRdoSk=\n")) == true) goto L18;
    L20:
        r53 = Color.parseColor(r52);
        goto L22
    L18:
        if (r11.p == true) goto L20;
        r52 = u40.a("Z0FgJjAwRA==\n", "RHFQFgAAdCw=\n");
        goto L20
    L7:
        if (r11.p == false) goto L10;
        String r84 = "LXiqG1zzHQZI\n";
        String r9 = "DknrXRq1W0A=\n";
    L11:
        r83 = Color.parseColor(u40.a(r84, r9));
        goto L13
    L10:
        r84 = "bBuIolrqHh1/\n";
        r9 = "TyvJkmraLi0=\n";
        goto L11
    L23:
        S(r11, r16, r13, r15, (String) r12.b);
        CharSequence r112 = (CharSequence) r12.b;
        if (r112.length() != 0) goto L26;
        r112 = u40.a("6vV8lik4+YCi\n", "DGnWfoeGHj0=\n");
    L26:
        r14.setText(r112);
    }

    public static final void S(on r3, String r4, View r5, TextView r6, String r7) {
        if (r7.length() > 0) goto L16;
        int r0 = r3.g;
    L9:
        if (r4.equals(u40.a("IZiQa2ub0r44ooBabJ3dsD6Smw==\n", "Sv3pNAj0vtE=\n")) == false) goto L18;
        Drawable r42 = r5.getBackground();
        ip.m(u40.a("+8VJc0MfTCb731E/ARkNK/TDUT8XEw0m+t4IcRYQQWjhyVV6Qx1DLOffTHtNG18p5dhMfBBSSTr0\nx0R9DxkDD+fRQXYGElkM59FSfgEQSA==\n", "lbAlH2N8LUg=\n"), r42);
        ((GradientDrawable) r42).setColor(r0);
        if (r7.length() <= 0) goto L13;
        int r32 = -1;
    L14:
        r6.setTextColor(r32);
        return;
    L13:
        r32 = r3.f;
        goto L14
    L18:
        return;
    L16:
        r0 = Color.parseColor(r7);     // Catch: Exception -> L6
    L6:
        r0 = r3.g;
        goto L9
    }

    public static final String T(ld r3) {
        if ((r3 instanceof tg) == false) goto L17;
        return r3.toString();
    L17:
        Object r1 = r3 + '@' + s(r3);     // Catch: Throwable -> L9
    L12:
        if (f10.a(r1) == null) goto L16;
        r1 = r3.getClass().getName() + '@' + s(r3);
    L16:
        return (String) r1;
    L9:
        th = move-exception;
        r1 = ct.f(th);
        goto L12
    }

    public static double U(double r2) {
        double r22 = r2 / 100.0d;
        if (r22 > 0.0031308d) goto L5;
        double r23 = r22 * 12.92d;
    L7:
        return r23 * 255.0d;
    L5:
        r23 = (Math.pow(r22, 0.4166666666666667d) * 1.055d) - 0.055d;
        goto L7
    }

    public static final Object V(ge r1, Object r2) {
        if (r2 != null) goto L5;
        r2 = r1.h(0, he.e);
        ip.l(r2);
    L5:
        if (r2 != 0) goto L9;
        return x;
    L9:
        if ((r2 instanceof Integer) == true) goto L11;
        z30.m(r2);
        throw null;
    L11:
        return r1.h(new v60(r1, ((Number) r2).intValue()), he.g);
    }

    public static Context W(Context r2, AttributeSet r3, int r4, int r5) {
        TypedArray r42 = r2.obtainStyledAttributes(r3, s, r4, r5);
        int r0 = r42.getResourceId(0, 0);
        r42.recycle();
        if ((r2 instanceof kd) == true) goto L5;
    L7:
        boolean r43 = false;
    L8:
        if (r0 == 0) goto L18;
        if (r43 == true) goto L18;
        kd r44 = new kd(r2, r0);
        TypedArray r22 = r2.obtainStyledAttributes(r3, r);
        int r32 = r22.getResourceId(0, 0);
        int r52 = r22.getResourceId(1, 0);
        r22.recycle();
        if (r32 != 0) goto L15;
        r32 = r52;
    L15:
        if (r32 == 0) goto L17;
        r44.getTheme().applyStyle(r32, true);
    L17:
        return r44;
    L18:
        return r2;
    L5:
        if (((kd) r2).a != r0) goto L7;
        r43 = true;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(Context r18, Executor r19, jy r20, boolean r21) {
        Context r0 = r18.getApplicationContext();
        String r2 = r0.getPackageName();
        ApplicationInfo r3 = r0.getApplicationInfo();
        AssetManager r4 = r0.getAssets();
        String r6 = new File(r3.sourceDir).getName();
        PackageInfo r10 = r18.getPackageManager().getPackageInfo(r2, 0);     // Catch: PackageManager.NameNotFoundException -> L207
        File r11 = r18.getFilesDir();
        if (r21 == true) goto L28;
        File r02 = new File(r11, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (r02.exists() == true) goto L225;
    L8:
        boolean r03 = false;
    L25:
        if (r03 == false) goto L28;
        Log.d("ProfileInstaller", "Skipping profile installation for " + r18.getPackageName());
        py.c(r18, false);
        return;
    L225:
        DataInputStream r7 = new DataInputStream(new FileInputStream(r02));     // Catch: IOException -> L210
        long r14 = r7.readLong();     // Catch: Throwable -> L18
        r7.close();     // Catch: IOException -> L210
        if (r14 != r10.lastUpdateTime) goto L15;
        r03 = true;
    L16:
        if (r03 == false) goto L25;
        r20.i(2, null);
        goto L25
    L15:
        r03 = false;
        goto L16
    L18:
        th = move-exception;
        r7.close();     // Catch: Throwable -> L22
        goto L8
    L250:
        throw th;     // Catch: IOException -> L210
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L210
        throw th;     // Catch: IOException -> L210
    L28:
        Log.d("ProfileInstaller", "Installing profile for " + r18.getPackageName());
        byte[] r13 = ip.o;
        int r04 = Build.VERSION.SDK_INT;
        File r72 = new File(new File("/data/misc/profiles/cur/0", r2), "primary.prof");
        lg r22 = new lg(r4, r19, r20, r6, r72);
        byte[] r42 = r22.c;
        if (r42 != null) goto L32;
        r22.b(3, Integer.valueOf(r04));
    L34:
        boolean r62 = false;
        char r73 = 1;
    L197:
        if (r62 == false) goto L200;
        if (r21 == false) goto L200;
        boolean r9 = r73;
    L201:
        py.c(r18, r9);
        return;
    L200:
        r9 = 0;
        goto L201
    L32:
        if (r72.canWrite() == true) goto L35;
        r22.b(4, null);
        goto L34
    L35:
        r22.f = true;
        FileInputStream r142 = r22.a(r4, "dexopt/baseline.prof");     // Catch: IOException -> L38 FileNotFoundException -> L40
    L43:
        r73 = '\b';
        if (r142 != null) goto L245;
    L74:
        mg[] r05 = r22.g;
        if (r05 == null) goto L112;
        int r92 = Build.VERSION.SDK_INT;
        if (r92 > 33) goto L112;
        switch(r92) {
            case 31: goto L246;
            case 32: goto L246;
            case 33: goto L246;
            default: goto L112;
        };
    L246:
        FileInputStream r32 = r22.a(r4, "dexopt/baseline.profm");     // Catch: IllegalStateException -> L88 IOException -> L90 FileNotFoundException -> L92
        if (r32 != null) goto L219;
        if (r32 == null) goto L109;
        r32.close();     // Catch: IllegalStateException -> L88 IOException -> L90 FileNotFoundException -> L92
    L109:
        lg r06 = null;
    L110:
        if (r06 == null) goto L112;
        r22 = r06;
        goto L112
    L219:
    L94:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L100
        throw th;     // Catch: IllegalStateException -> L88 IOException -> L90 FileNotFoundException -> L92
    L100:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L88 IOException -> L90 FileNotFoundException -> L92
        throw th;     // Catch: IllegalStateException -> L88 IOException -> L90 FileNotFoundException -> L92
    L84:
        if (Arrays.equals(ip.p, H(r32, 4)) == false) goto L97;
        r22.g = ip.M(r32, H(r32, 4), r42, r05);     // Catch: Throwable -> L94
        r32.close();     // Catch: IllegalStateException -> L88 IOException -> L90 FileNotFoundException -> L92
        r06 = r22;
        goto L110
    L97:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L94
    L92:
        e = move-exception;
        r20.i(9, e);
    L90:
        e = move-exception;
        r20.i(7, e);
    L88:
        e = move-exception;
        r22.g = null;
        r20.i(8, e);
    L112:
        jy r33 = r22.b;
        mg[] r07 = r22.g;
        byte[] r43 = r22.c;
        if (r07 == null) goto L143;
        if (r43 == null) goto L143;
        if (r22.f == false) goto L142;
        ByteArrayOutputStream r63 = new ByteArrayOutputStream();     // Catch: IllegalStateException -> L124 IOException -> L126
        r63.write(r13);     // Catch: Throwable -> L128
        r63.write(r43);     // Catch: Throwable -> L128
        if (ip.a0(r63, r43, r07) == true) goto L130;
        r33.i(5, null);     // Catch: Throwable -> L128
        r22.g = null;     // Catch: Throwable -> L128
        r63.close();     // Catch: IllegalStateException -> L124 IOException -> L126
        goto L143
    L130:
        r22.h = r63.toByteArray();     // Catch: Throwable -> L128
        r63.close();     // Catch: IllegalStateException -> L124 IOException -> L126
    L140:
        r22.g = null;
    L128:
        th = move-exception;
        r63.close();     // Catch: Throwable -> L135
        throw th;     // Catch: IllegalStateException -> L124 IOException -> L126
    L135:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L124 IOException -> L126
        throw th;     // Catch: IllegalStateException -> L124 IOException -> L126
    L126:
        e = move-exception;
        r33.i(7, e);
    L124:
        e = move-exception;
        r33.i(8, e);
        goto L140
    L142:
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    L143:
        byte[] r08 = r22.h;
        if (r08 != null) goto L215;
        boolean r09 = false;
        r73 = 1;
    L194:
        if (r09 == false) goto L196;
        C(r10, r11);
    L196:
        r62 = r09;
        goto L197
    L215:
        if (r22.f == false) goto L206;
        ByteArrayInputStream r34 = new ByteArrayInputStream(r08);     // Catch: Throwable -> L161 IOException -> L185 FileNotFoundException -> L187
        FileOutputStream r44 = new FileOutputStream(r22.d);     // Catch: Throwable -> L178
        byte[] r010 = new byte[512];     // Catch: Throwable -> L171
    L152:
        int r5 = r34.read(r010);     // Catch: Throwable -> L171
        if (r5 <= 0) goto L156;
        r44.write(r010, 0, r5);     // Catch: Throwable -> L171
        goto L152
    L156:
        r73 = 1;
        r22.b(1, null);     // Catch: Throwable -> L169
        r44.close();     // Catch: Throwable -> L167
        r34.close();     // Catch: Throwable -> L161 IOException -> L163 FileNotFoundException -> L165
        r22.h = null;
        r22.g = null;
        r09 = true;
    L169:
        th = th;
    L170:
        Throwable r52 = th;
        r44.close();     // Catch: Throwable -> L175
    L254:
        throw r52;     // Catch: Throwable -> L167
    L175:
        th = move-exception;
        r52.addSuppressed(th);     // Catch: Throwable -> L167
        throw r52;     // Catch: Throwable -> L167
    L167:
        th = th;
    L168:
        Throwable r45 = th;
        r34.close();     // Catch: Throwable -> L182
        throw r45;     // Catch: Throwable -> L161 IOException -> L163 FileNotFoundException -> L165
    L182:
        th = move-exception;
        r45.addSuppressed(th);     // Catch: Throwable -> L161 IOException -> L163 FileNotFoundException -> L165
        throw r45;     // Catch: Throwable -> L161 IOException -> L163 FileNotFoundException -> L165
    L171:
        th = th;
    L178:
        th = th;
        goto L168
    L165:
        e = e;
    L191:
        r22.b(6, e);     // Catch: Throwable -> L161
    L190:
        r22.h = null;
        r22.g = null;
        r09 = false;
    L163:
        e = e;
    L189:
        r22.b(7, e);     // Catch: Throwable -> L161
    L187:
        e = e;
        r73 = 1;
    L185:
        e = e;
        r73 = 1;
        goto L189
    L206:
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    L161:
        th = move-exception;
        r22.h = null;
        r22.g = null;
        throw th;
    L245:
    L56:
        e = move-exception;
        r20.i(7, e);     // Catch: Throwable -> L52
    L236:
        r142.close();     // Catch: IOException -> L63
    L67:
        mg[] r93 = null;
    L68:
        r22.g = r93;
    L63:
        e = move-exception;
        r20.i(7, e);
    L54:
        e = move-exception;
        r20.i(8, e);     // Catch: Throwable -> L52
        goto L236
    L46:
        if (Arrays.equals(r13, H(r142, 4)) == false) goto L59;
        r93 = ip.P(r142, H(r142, 4), r22.e);     // Catch: Throwable -> L52 IllegalStateException -> L54 IOException -> L56
        r142.close();     // Catch: IOException -> L50
    L50:
        e = move-exception;
        r20.i(7, e);
        goto L68
    L59:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L52 IllegalStateException -> L54 IOException -> L56
    L52:
        th = move-exception;
        r142.close();     // Catch: IOException -> L71
        throw th;
    L71:
        e = move-exception;
        r20.i(7, e);
        throw th;
    L40:
        e = move-exception;
        r20.i(6, e);
    L42:
        r142 = null;
    L38:
        e = move-exception;
        r20.i(7, e);
    L207:
        e = move-exception;
        r20.i(7, e);
        py.c(r18, false);
    }

    public static void Y(ByteArrayOutputStream r6, long r7, int r9) {
        byte[] r0 = new byte[r9];
        int r1 = 0;
    L3:
        if (r1 >= r9) goto L5;
        r0[r1] = (byte) ((r7 >> (r1 * 8)) & 255);
        r1 = r1 + 1;
        goto L3
    L5:
        r6.write(r0);
    }

    public static void Z(ByteArrayOutputStream r2, int r3) {
        Y(r2, r3, 2);
    }

    public static void a(TextInputLayout r5, CheckableImageButton r6, ColorStateList r7, PorterDuff.Mode r8) {
        Drawable r0 = r6.getDrawable();
        if (r0 == null) goto L13;
        r0 = r0.mutate();
        if (r7 != null) goto L7;
    L9:
        ch.h(r0, r7);
    L10:
        if (r8 == null) goto L13;
        ch.i(r0, r8);
        goto L13
    L7:
        if (r7.isStateful() == false) goto L9;
        int[] r52 = r5.getDrawableState();
        int[] r1 = r6.getDrawableState();
        int r2 = r52.length;
        int[] r53 = Arrays.copyOf(r52, r52.length + r1.length);
        System.arraycopy(r1, 0, r53, r2, r1.length);
        ch.h(r0, ColorStateList.valueOf(r7.getColorForState(r53, r7.getDefaultColor())));
    L13:
        if (r6.getDrawable() == r0) goto L16;
        r6.setImageDrawable(r0);
        return;
    }

    public static float a0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static boolean b(double r4, double r6, double r8) {
        if ((((r6 - r4) + 25.132741228718345d) % 6.283185307179586d) >= (((r8 - r4) + 25.132741228718345d) % 6.283185307179586d)) goto L6;
        return true;
    L6:
        return false;
    }

    public static int c(int r3, int r4, int[] r5) {
        int r32 = r3 - 1;
        int r0 = 0;
    L3:
        if (r0 > r32) goto L11;
        int r1 = (r0 + r32) >>> 1;
        int r2 = r5[r1];
        if (r2 < r4) goto L6;
        if (r2 <= r4) goto L9;
        r32 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r0 = r1 + 1;
        goto L3
    L11:
        return ~r0;
    }

    public static int d(long[] r4, int r5, long r6) {
        int r52 = r5 - 1;
        int r0 = 0;
    L3:
        if (r0 > r52) goto L11;
        int r1 = (r0 + r52) >>> 1;
        long r2 = r4[r1];
        if (r2 < r6) goto L6;
        if (r2 <= r6) goto L9;
        r52 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r0 = r1 + 1;
        goto L3
    L11:
        return ~r0;
    }

    public static void h(int r5) {
        if (2 > r5) goto L8;
        if (r5 >= 37) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("radix " + r5 + " was not in valid range " + new hp(2, 36, 1));
    }

    public static double i(double r5) {
        double r0 = Math.pow(Math.abs(r5), 0.42d);
        if (r5 >= 0.0d) goto L6;
        int r52 = -1;
    L10:
        return ((((double) r52) * 400.0d) * r0) / (r0 + 27.13d);
    L6:
        if (r5 != 0.0d) goto L8;
        r52 = 0;
        goto L10
    L8:
        r52 = 1;
        goto L10
    }

    public static final void j(Closeable r0, Throwable r1) {
        if (r0 == null) goto L13;
        if (r1 != null) goto L11;
        r0.close();
        return;
    L11:
        r0.close();     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        ip.f(r1, th);
        return;
    }

    public static byte[] k(byte[] r3) {
        Deflater r0 = new Deflater(1);
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        DeflaterOutputStream r2 = new DeflaterOutputStream(r1, r0);     // Catch: Throwable -> L8
        r2.write(r3);     // Catch: Throwable -> L10
        r2.close();     // Catch: Throwable -> L8
        r0.end();
        return r1.toByteArray();
    L10:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L13
    L15:
        throw th;     // Catch: Throwable -> L8
    L13:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r0.end();
        throw th;
    }

    public static ImageView.ScaleType l(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 5) goto L18;
        if (r1 == 6) goto L16;
        return ImageView.ScaleType.CENTER;
    L16:
        return ImageView.ScaleType.CENTER_INSIDE;
    L18:
        return ImageView.ScaleType.CENTER_CROP;
    L20:
        return ImageView.ScaleType.FIT_END;
    L22:
        return ImageView.ScaleType.FIT_CENTER;
    L24:
        return ImageView.ScaleType.FIT_START;
    L26:
        return ImageView.ScaleType.FIT_XY;
    }

    public static final long m(InputStream r6, FileOutputStream r7) {
        byte[] r0 = new byte[8192];
        int r1 = r6.read(r0);
        long r2 = 0;
    L3:
        if (r1 < 0) goto L5;
        r7.write(r0, 0, r1);
        r2 = r2 + ((long) r1);
        r1 = r6.read(r0);
        goto L3
    L5:
        return r2;
    }

    public static final Object n(long r6, m50 r8) {
        vh r0 = vh.n;
        if (r6 <= 0) goto L54;
        i8 r1 = new i8(ip.z(r8));
        zg r82 = r1.m();
        if (r82 != null) goto L9;
    L11:
        ge r2 = r1.e;
        if (r6 >= Long.MAX_VALUE) goto L20;
        ee r83 = r2.b(vh.b);
        if ((r83 instanceof eg) == false) goto L16;
        eg r84 = (eg) r83;
    L17:
        if (r84 != null) goto L19;
        r84 = lf.a;
    L19:
        r84.c(r6, r1);
        goto L20
    L16:
        r84 = null;
    L20:
        boolean r62 = r1.o();
        AtomicIntegerFieldUpdater r7 = i8.f;
    L21:
        int r85 = r7.get(r1);
        int r3 = r85 >> 29;
        pe r4 = pe.a;
        if (r3 != 0) goto L24;
        if (r7.compareAndSet(r1, r85, 536870912 + (536870911 & r85)) == false) goto L21;
        if (((zg) i8.h.get(r1)) != null) goto L49;
        r1.m();
    L49:
        if (r62 == false) goto L51;
        r1.q();
    L51:
        Object r63 = r4;
    L52:
        if (r63 != r4) goto L54;
        return r63;
    L24:
        if (r3 != 2) goto L43;
        if (r62 == false) goto L27;
        r1.q();
    L27:
        Object r64 = i8.g.get(r1);
        if ((r64 instanceof nb) == true) goto L41;
        int r86 = r1.c;
        if (r86 == 1) goto L32;
        if (r86 == 2) goto L32;
    L39:
        r63 = r1.g(r64);
    L32:
        mp r72 = (mp) r2.b(vh.h);
        if (r72 == null) goto L39;
        if (r72.a() == true) goto L39;
        CancellationException r73 = ((wp) r72).t();
        r1.a(r64, r73);
        throw r73;
    L41:
        throw ((nb) r64).a;
    L43:
        throw new IllegalStateException("Already suspended");
    L9:
        if ((i8.g.get(r1) instanceof ow) == true) goto L11;
        r82.b();
        i8.h.set(r1, nw.a);
    L54:
        return r0;
    }

    public static ColorStateList o(Drawable r2) {
        if ((r2 instanceof ColorDrawable) == false) goto L7;
        return ColorStateList.valueOf(((ColorDrawable) r2).getColor());
    L7:
        if (Build.VERSION.SDK_INT >= 29) goto L9;
        return null;
    L9:
        if (f0.t(r2) == true) goto L11;
        return null;
    L11:
        return f0.c(f0.d(r2));
    }

    public static final float p(float r2) {
        return TypedValue.applyDimension(1, r2, Resources.getSystem().getDisplayMetrics());
    }

    public static final int q(int r2) {
        return (int) TypedValue.applyDimension(1, r2, Resources.getSystem().getDisplayMetrics());
    }

    public static Drawable r(Context r1, int r2) {
        return w00.b().c(r1, r2);
    }

    public static final String s(Object r0) {
        return Integer.toHexString(System.identityHashCode(r0));
    }

    public static final Class t(yp r2) {
        ip.o("<this>", r2);
        Class r22 = ((la) r2).a();
        if (r22.isPrimitive() == false) goto L50;
        String r0 = r22.getName();
        switch(r0.hashCode()) {
            case -1325958191: goto L49;
            case 104431: goto L44;
            case 3039496: goto L39;
            case 3052374: goto L34;
            case 3327612: goto L29;
            case 3625364: goto L24;
            case 64711720: goto L19;
            case 97526364: goto L14;
            case 109413500: goto L9;
            default: goto L50;
        };
    L9:
        if (r0.equals("short") == false) goto L50;
        return Short.class;
    L14:
        if (r0.equals("float") == false) goto L50;
        return Float.class;
    L19:
        if (r0.equals("boolean") == false) goto L50;
        return Boolean.class;
    L24:
        if (r0.equals("void") == false) goto L50;
        return Void.class;
    L29:
        if (r0.equals("long") == false) goto L50;
        return Long.class;
    L34:
        if (r0.equals("char") == false) goto L50;
        return Character.class;
    L39:
        if (r0.equals("byte") == false) goto L50;
        return Byte.class;
    L44:
        if (r0.equals("int") == false) goto L50;
        return Integer.class;
    L49:
        if (r0.equals("double") == false) goto L50;
        return Double.class;
    L50:
        return r22;
    }

    public static final void u(ge r3, Throwable r4) {
        CoroutineExceptionHandler r0 = (CoroutineExceptionHandler) r3.b(vh.c);     // Catch: Throwable -> L8
        if (r0 == null) goto L6;
        ((i2) r0).d(r4);     // Catch: Throwable -> L8
        return;
    L6:
        a80.o(r3, r4);
        return;
    L8:
        th = move-exception;
        if (r4 == th) goto L12;
        RuntimeException r1 = new RuntimeException("Exception while trying to handle coroutine exception", th);
        ip.f(r1, r4);
        r4 = r1;
    L12:
        a80.o(r3, r4);
    }

    public static double v(double[] r12) {
        double[] r122 = zt.F(r12, n);
        double r0 = i(r122[0]);
        double r2 = i(r122[1]);
        double r4 = i(r122[2]);
        double r10 = (-12.0d) * r2;
        double r102 = ((r10 + (r0 * 11.0d)) + r4) / 11.0d;
        return Math.atan2(((r0 + r2) - (r4 * 2.0d)) / 9.0d, r102);
    }

    public static int w(float r15) {
        if (r15 >= 1.0f) goto L7;
        return -16777216;
    L7:
        if (r15 <= 99.0f) goto L10;
        return -1;
    L10:
        float r1 = (r15 + 16.0f) / 116.0f;
        if (r15 <= 8.0f) goto L13;
        float r152 = (r1 * r1) * r1;
    L14:
        float r3 = (r1 * r1) * r1;
        if (r3 <= 0.008856452f) goto L17;
        boolean r5 = true;
    L18:
        if (r5 == false) goto L20;
        float r8 = r3;
    L21:
        if (r5 == true) goto L24;
        r3 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
    L24:
        float[] r0 = i;
        return ib.a(r8 * r0[0], r152 * r0[1], r3 * r0[2]);
    L20:
        r8 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
        goto L21
    L17:
        r5 = false;
        goto L18
    L13:
        r152 = r15 / 903.2963f;
        goto L14
    }

    public static double x(double r6) {
        double r0 = Math.abs(r6);
        double r2 = Math.max(0.0d, (27.13d * r0) / (400.0d - r0));
        if (r6 >= 0.0d) goto L6;
        int r62 = -1;
    L9:
        double r02 = Math.pow(r2, 2.380952380952381d);
        return r02 * ((double) r62);
    L6:
        if (r6 != 0.0d) goto L8;
        r62 = 0;
        goto L9
    L8:
        r62 = 1;
        goto L9
    }

    public static boolean y(double r2) {
        if (0.0d <= r2) goto L5;
        return false;
    L5:
        if (r2 > 100.0d) goto L10;
        return true;
    L10:
        return false;
    }

    public static float z(int r6) {
        float r62 = r6 / 255.0f;
        if (r62 > 0.04045f) goto L7;
        float r63 = r62 / 12.92f;
    L6:
        return r63 * 100.0f;
    L7:
        r63 = (float) Math.pow((r62 + 0.055f) / 1.055f, 2.4000000953674316d);
        goto L6
    }

    public abstract Object D(int r1, Intent r2);

    public abstract void F(s r1, s r2);

    public abstract void G(s r1, Thread r2);

    public abstract boolean e(t r1, p r2);

    public abstract boolean f(t r1, Object r2, Object r3);

    public abstract boolean g(t r1, s r2, s r3);
}
