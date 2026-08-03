package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.ImageButton;
import io.sentry.C1981r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Qj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714Qj {

    /* JADX INFO: renamed from: a */
    public static final int[] f2294a = null;

    /* JADX INFO: renamed from: b */
    public static final Object[] f2295b = null;

    /* JADX INFO: renamed from: c */
    public static final C0668Pg f2296c = null;

    /* JADX INFO: renamed from: d */
    public static final boolean[] f2297d = null;

    /* JADX INFO: renamed from: e */
    public static final Object f2298e = null;

    static {
        f2294a = new int[0];
        f2295b = new Object[0];
        f2296c = new C0668Pg(2);
        f2297d = new boolean[3];
        f2298e = new Object();
    }

    /* JADX INFO: renamed from: A */
    public static int m1470A(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
    L15:
        int r12 = r2.top;
        int r22 = (r2.height() / 2) + r12;
        int r13 = r3.top;
        return Math.abs(r22 - ((r3.height() / 2) + r13));
    L5:
        if (r1 != 33) goto L7;
    L13:
        int r14 = r2.left;
        int r23 = (r2.width() / 2) + r14;
        int r15 = r3.left;
        return Math.abs(r23 - ((r3.width() / 2) + r15));
    L7:
        if (r1 == 66) goto L15;
        if (r1 == 130) goto L13;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: B */
    public static TypedArray m1471B(Resources r0, Resources.Theme r1, AttributeSet r2, int[] r3) {
        if (r1 != null) goto L6;
        return r0.obtainAttributes(r2, r3);
    L6:
        return r1.obtainStyledAttributes(r2, r3, 0, 0);
    }

    /* JADX INFO: renamed from: C */
    public static final Object m1472C(Object r1) {
        if ((r1 instanceof C0189Ea) == true) goto L5;
        return r1;
    L5:
        return new C0297Gw(((C0189Ea) r1).f575a);
    }

    /* JADX INFO: renamed from: D */
    public static int m1473D(Context r1, int r2, int r3) {
        TypedValue r12 = AbstractC1293cr.m2537P(r1, r2);
        if (r12 != null) goto L5;
    L8:
        return r3;
    L5:
        if (r12.type != 16) goto L8;
        return r12.data;
    }

    /* JADX INFO: renamed from: E */
    public static TimeInterpolator m1474E(Context r5, int r6, TimeInterpolator r7) {
        TypedValue r0 = new TypedValue();
        if (r5.getTheme().resolveAttribute(r6, r0, true) == true) goto L6;
        return r7;
    L6:
        if (r0.type != 3) goto L34;
        String r62 = String.valueOf(r0.string);
        if (m1503y(r62, "cubic-bezier") == true) goto L15;
        if (m1503y(r62, "path") == true) goto L15;
        return AnimationUtils.loadInterpolator(r5, r0.resourceId);
    L15:
        if (m1503y(r62, "cubic-bezier") == false) goto L23;
        String[] r52 = r62.substring(13, r62.length() - 1).split(",");
        if (r52.length != 4) goto L21;
        return new PathInterpolator(m1497s(r52, 0), m1497s(r52, 1), m1497s(r52, 2), m1497s(r52, 3));
    L21:
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + r52.length);
    L23:
        if (m1503y(r62, "path") == false) goto L32;
        String r53 = r62.substring(5, r62.length() - 1);
        Path r72 = new Path();
        C0552Mt.m1095b(AbstractC1406fG.m2688M(r53), r72);     // Catch: RuntimeException -> L28
        return new PathInterpolator(r72);
    L28:
        e = move-exception;
        throw new RuntimeException("Error in parsing ".concat(r53), e);
    L32:
        throw new IllegalArgumentException("Invalid motion easing type: ".concat(r62));
    L34:
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    /* JADX INFO: renamed from: F */
    public static void m1475F(EditorInfo r2, CharSequence r3, int r4, int r5) {
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

    /* JADX INFO: renamed from: G */
    public static final long m1476G(String r4, long r5, long r7, long r9) {
        int r0 = AbstractC1356eA.f4858a;
        String r02 = System.getProperty(r4);     // Catch: SecurityException -> L5
    L6:
        if (r02 != null) goto L8;
        return r5;
    L8:
        Long r52 = AbstractC0042Az.m62I(r02);
        if (r52 == null) goto L18;
        long r2 = r52.longValue();
        if (r7 > r2) goto L16;
        if (r2 > r9) goto L16;
        return r2;
    L16:
        throw new IllegalStateException(("System property '" + r4 + "' should be in range " + r7 + ".." + r9 + ", but is '" + r2 + '\'').toString());
    L18:
        throw new IllegalStateException(("System property '" + r4 + "' has unrecognized value '" + r02 + '\'').toString());
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: H */
    public static int m1477H(String r7, int r8, int r9) {
        if ((r9 & 8) == 0) goto L5;
        int r92 = Integer.MAX_VALUE;
    L7:
        return (int) m1476G(r7, r8, 1, r92);
    L5:
        r92 = 2097150;
        goto L7
    }

    /* JADX INFO: renamed from: I */
    public static C2656w4 m1478I(int r2, InterfaceC1054Yg r3) {
        return new C2656w4(new C1110Zt(r2), r3, f2296c);
    }

    /* JADX INFO: renamed from: a */
    public static final C2169kz m1479a(InterfaceC0406Jc r3) {
        if ((r3 instanceof C2169kz) == false) goto L5;
        C2169kz r0 = (C2169kz) r3;
    L6:
        if (r0 == null) goto L9;
        return r0;
    L9:
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC0425Jv.m881a(r3.getClass()));
    L5:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1480b(int r8, Rect r9, Rect r10, Rect r11) {
        boolean r0 = m1481c(r8, r9, r10);
        if (m1481c(r8, r9, r11) == true) goto L42;
        if (r0 == true) goto L7;
        return false;
    L7:
        if (r8 == 17) goto L23;
        if (r8 == 33) goto L20;
        if (r8 == 66) goto L17;
        if (r8 != 130) goto L15;
        if (r9.bottom <= r11.top) goto L24;
    L41:
        return true;
    L24:
        if (r8 == 17) goto L41;
        if (r8 == 66) goto L41;
        int r102 = m1504z(r8, r9, r10);
        if (r8 == 17) goto L38;
        if (r8 == 33) goto L37;
        if (r8 == 66) goto L36;
        if (r8 != 130) goto L35;
        int r82 = r11.bottom;
        int r92 = r9.bottom;
    L40:
        if (r102 < Math.max(1, r82 - r92)) goto L41;
        return false;
    L35:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L36:
        r82 = r11.right;
        r92 = r9.right;
        goto L40
    L37:
        r82 = r9.top;
        r92 = r11.top;
        goto L40
    L38:
        r82 = r9.left;
        r92 = r11.left;
        goto L40
    L15:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L17:
        if (r9.right > r11.left) goto L41;
    L20:
        if (r9.top < r11.bottom) goto L41;
    L23:
        if (r9.left < r11.right) goto L41;
    L42:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1481c(int r1, Rect r2, Rect r3) {
        if (r1 == 17) goto L19;
        if (r1 == 33) goto L14;
        if (r1 == 66) goto L19;
        if (r1 == 130) goto L14;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L14:
        if (r3.right >= r2.left) goto L16;
        return false;
    L16:
        if (r3.left > r2.right) goto L27;
        return true;
    L27:
        return false;
    L19:
        if (r3.bottom >= r2.top) goto L21;
        return false;
    L21:
        if (r3.top > r2.bottom) goto L29;
        return true;
    L29:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final int m1482d(int r3, int r4, int[] r5) {
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

    /* JADX INFO: renamed from: e */
    public static final int m1483e(long[] r4, int r5, long r6) {
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

    /* JADX INFO: renamed from: f */
    public static void m1484f(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r0);
    }

    /* JADX INFO: renamed from: g */
    public static final void m1485g(int r2, String r3) {
        if (r3.charAt(r2) != '-') goto L5;
        return;
    L5:
        StringBuilder r0 = AbstractC2374ph.m4816m(r2, "Expected '-' (hyphen) at index ", ", but was '");
        r0.append(r3.charAt(r2));
        r0.append('\'');
        throw new IllegalArgumentException(r0.toString().toString());
    }

    /* JADX INFO: renamed from: h */
    public static void m1486h(C2497sb r12, C2244mo r13, C2454rb r14) {
        r14.f8634o = -1;
        C1259cb r1 = r14.f8592M;
        int[] r2 = r14.f8637p0;
        C1259cb r3 = r14.f8591L;
        C1259cb r4 = r14.f8589J;
        C1259cb r5 = r14.f8590K;
        C1259cb r6 = r14.f8588I;
        r14.f8636p = -1;
        int[] r0 = r12.f8637p0;
        if (r0[0] == 2) goto L10;
        if (r2[0] != 4) goto L10;
        int r7 = r6.f4271g;
        int r8 = r12.m4937q() - r5.f4271g;
        r6.f4273i = r13.m4572k(r6);
        r5.f4273i = r13.m4572k(r5);
        r13.m4565d(r6.f4273i, r7);
        r13.m4565d(r5.f4273i, r8);
        r14.f8634o = 2;
        r14.f8604Y = r7;
        int r82 = r8 - r7;
        r14.f8600U = r82;
        int r52 = r14.f8609b0;
        if (r82 >= r52) goto L10;
        r14.f8600U = r52;
    L10:
        if (r0[1] != 2) goto L12;
        return;
    L12:
        if (r2[1] != 4) goto L23;
        int r02 = r4.f4271g;
        int r122 = r12.m4933k() - r3.f4271g;
        r4.f4273i = r13.m4572k(r4);
        r3.f4273i = r13.m4572k(r3);
        r13.m4565d(r4.f4273i, r02);
        r13.m4565d(r3.f4273i, r122);
        if (r14.f8607a0 <= 0) goto L16;
    L17:
        C0256Fy r22 = r13.m4572k(r1);
        r1.f4273i = r22;
        r13.m4565d(r22, r14.f8607a0 + r02);
    L18:
        r14.f8636p = 2;
        r14.f8605Z = r02;
        int r123 = r122 - r02;
        r14.f8601V = r123;
        int r132 = r14.f8611c0;
        if (r123 >= r132) goto L24;
        r14.f8601V = r132;
        return;
    L24:
        return;
    L16:
        if (r14.f8619g0 != 8) goto L18;
    }

    /* JADX INFO: renamed from: i */
    public static void m1487i(Object r1) {
        m1488j("Argument must not be null", r1);
    }

    /* JADX INFO: renamed from: j */
    public static void m1488j(String r0, Object r1) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final void m1489k(C1981r r4, Throwable r5) {
        if (r5 == null) goto L4;
        AbstractC0213Ey.m416n(r4);     // Catch: Throwable -> L25
        return;
    L25:
        th = move-exception;
        AbstractC0148Dc.m268b(r5, th);
        return;
    L4:
        if ((r4 instanceof AutoCloseable) == false) goto L7;
        r4.close();
        return;
    L7:
        if ((r4 instanceof ExecutorService) == false) goto L22;
        ExecutorService r42 = (ExecutorService) r4;
        if (r42 == ForkJoinPool.commonPool()) goto L42;
        boolean r52 = r42.isTerminated();
        if (r52 == true) goto L39;
        r42.shutdown();
        boolean r0 = false;
    L14:
        if (r52 == true) goto L19;
        r52 = r42.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L17
    L17:
        if (r0 == true) goto L14;
        r42.shutdownNow();
        r0 = true;
        goto L14
    L19:
        if (r0 == false) goto L40;
        Thread.currentThread().interrupt();
        return;
    L40:
        return;
    L39:
        return;
    L42:
        return;
    L22:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: l */
    public static C0669Ph m1490l(Context r12) {
        PackageManager r0 = r12.getPackageManager();
        AbstractC1293cr.m2548g("Package manager required to locate emoji font provider", r0);
        int r2 = 0;
        Iterator<ResolveInfo> r1 = r0.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        ProviderInfo r3 = r1.next().providerInfo;
        if (r3 == null) goto L4;
        ApplicationInfo r5 = r3.applicationInfo;
        if (r5 == null) goto L4;
        if ((r5.flags & 1) != 1) goto L4;
    L13:
        if (r3 != null) goto L26;
    L14:
        C0583Nh r52 = null;
    L22:
        if (r52 != null) goto L25;
        return null;
    L25:
        return new C0669Ph(new C0626Oh(r12, r52));
    L26:
        String r6 = r3.authority;     // Catch: PackageManager.NameNotFoundException -> L20
        String r7 = r3.packageName;     // Catch: PackageManager.NameNotFoundException -> L20
        Signature[] r02 = r0.getPackageInfo(r7, 64).signatures;     // Catch: PackageManager.NameNotFoundException -> L20
        ArrayList r13 = new ArrayList();     // Catch: PackageManager.NameNotFoundException -> L20
        int r32 = r02.length;     // Catch: PackageManager.NameNotFoundException -> L20
    L16:
        if (r2 >= r32) goto L18;
        r13.add(r02[r2].toByteArray());     // Catch: PackageManager.NameNotFoundException -> L20
        r2 = r2 + 1;     // Catch: PackageManager.NameNotFoundException -> L20
        goto L16
    L18:
        r52 = new C0583Nh(r6, r7, "emojicompat-emoji-font", Collections.singletonList(r13), null, null);     // Catch: PackageManager.NameNotFoundException -> L20
    L20:
        e = move-exception;
        Log.wtf("emoji2.text.DefaultEmojiConfig", e);
        goto L14
    L12:
        r3 = null;
        goto L13
    }

    /* JADX INFO: renamed from: m */
    public static C1194ax m1491m(Bundle r5, Bundle r6) {
        if (r5 != null) goto L12;
        if (r6 == null) goto L5;
        HashMap r52 = new HashMap();
        Iterator<String> r0 = r6.keySet().iterator();
    L8:
        if (r0.hasNext() == false) goto L11;
        String r1 = r0.next();
        r52.put(r1, r6.get(r1));
        goto L8
    L11:
        return new C1194ax(r52);
    L5:
        return new C1194ax();
    L12:
        r5.setClassLoader(C1194ax.class.getClassLoader());
        ArrayList r62 = r5.getParcelableArrayList("keys");
        ArrayList r53 = r5.getParcelableArrayList("values");
        if (r62 == null) goto L23;
        if (r53 == null) goto L23;
        if (r62.size() != r53.size()) goto L23;
        LinkedHashMap r02 = new LinkedHashMap();
        int r12 = r62.size();
        int r2 = 0;
    L18:
        if (r2 >= r12) goto L21;
        r02.put((String) r62.get(r2), r53.get(r2));
        r2 = r2 + 1;
        goto L18
    L21:
        return new C1194ax(r02);
    L23:
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m1492n(int r0, int r1) {
        if ((r0 & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static ViewGroup m1493o(ViewGroup r5) {
        int r0 = r5.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L17;
        View r2 = r5.getChildAt(r1);
        if ((r2 instanceof ViewGroup) == false) goto L16;
        ViewGroup r3 = (ViewGroup) r2;
        if (r3.getBackground() != null) goto L9;
    L13:
        ViewGroup r22 = m1493o(r3);
        if (r22 == null) goto L16;
        return r22;
    L9:
        if (r2.getVisibility() != 0) goto L13;
        if (r3.getLayoutParams().height <= AbstractC0295Gu.m616i(450)) goto L13;
        return r3;
    L16:
        r1 = r1 + 1;
        goto L3
    L17:
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static View m1494p(ViewGroup r6) {
        int r0 = r6.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L21;
        View r2 = r6.getChildAt(r1);
        if ((r2 instanceof ViewGroup) == false) goto L10;
        View r22 = m1494p((ViewGroup) r2);
        if (r22 == null) goto L20;
        return r22;
    L20:
        r1 = r1 + 1;
        goto L3
    L10:
        if ((r2 instanceof Button) == false) goto L20;
        ViewGroup.LayoutParams r3 = ((Button) r2).getLayoutParams();
        if ((r3 instanceof ViewGroup.MarginLayoutParams) == false) goto L20;
        ViewGroup.MarginLayoutParams r32 = (ViewGroup.MarginLayoutParams) r3;
        int r4 = r32.width;
        if (r4 != r32.height) goto L20;
        if (r4 <= AbstractC0295Gu.m616i(80)) goto L20;
        if (r32.topMargin >= 0) goto L20;
        return r2;
    L21:
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static View m1495q(ViewGroup r6) {
        int r0 = r6.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L21;
        View r2 = r6.getChildAt(r1);
        if ((r2 instanceof ViewGroup) == false) goto L10;
        View r22 = m1495q((ViewGroup) r2);
        if (r22 == null) goto L20;
        return r22;
    L20:
        r1 = r1 + 1;
        goto L3
    L10:
        if ((r2 instanceof ImageButton) == false) goto L20;
        ViewGroup.LayoutParams r3 = ((ImageButton) r2).getLayoutParams();
        if ((r3 instanceof ViewGroup.MarginLayoutParams) == false) goto L20;
        ViewGroup.MarginLayoutParams r32 = (ViewGroup.MarginLayoutParams) r3;
        int r4 = r32.width;
        if (r4 != r32.height) goto L20;
        if (r4 <= AbstractC0295Gu.m616i(80)) goto L20;
        if (r32.topMargin >= 0) goto L20;
        return r2;
    L21:
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final void m1496r(long r4, byte[] r6, int r7, int r8, int r9) {
        int r82 = 7 - r8;
        int r92 = 8 - r9;
        if (r92 > r82) goto L7;
    L4:
        int r0 = AbstractC2635vk.f9143a[(int) ((r4 >> (r82 << 3)) & 255)];
        int r1 = r7 + 1;
        r6[r7] = (byte) (r0 >> 8);
        r7 = r7 + 2;
        r6[r1] = (byte) r0;
        if (r82 == r92) goto L9;
        r82 = r82 - 1;
        goto L4
    L9:
        return;
    }

    /* JADX INFO: renamed from: s */
    public static float m1497s(String[] r2, int r3) {
        float r22 = Float.parseFloat(r2[r3]);
        if (r22 < 0.0f) goto L8;
        if (r22 > 1.0f) goto L8;
        return r22;
    L8:
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + r22);
    }

    /* JADX INFO: renamed from: t */
    public static C0477L3 m1498t(TypedArray r3, XmlPullParser r4, Resources.Theme r5, String r6, int r7) {
        if (r4.getAttributeValue("http://schemas.android.com/apk/res/android", r6) == null) goto L17;
        TypedValue r42 = new TypedValue();
        r3.getValue(r7, r42);
        int r1 = r42.type;
        if (r1 < 28) goto L18;
        if (r1 > 31) goto L18;
        return new C0477L3(null, null, r42.data);
    L18:
        C0477L3 r32 = C0477L3.m932b(r3.getResources(), r3.getResourceId(r7, 0), r5);     // Catch: Exception -> L13
    L14:
        if (r32 == null) goto L17;
        return r32;
    L13:
        r32 = null;
    L17:
        return new C0477L3(null, null, 0);
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m1499u() {
        ArrayList r0 = new ArrayList();
        r0.add(C0469Kw.f1524b);
        r0.add(C0781S7.f2467b);
        r0.add(C0180E7.f531b);
        r0.add(C0524M7.f1712b);
        r0.add(C1246c5.f4237b);
        r0.add(C1395f5.f4957b);
        r0.add(C0811Sv.f2565b);
        r0.add(C1133aF.f3583b);
        r0.add(C1240c.f4218b);
        r0.add(C0680Ps.f2178b);
        r0.add(C0555Mw.f1823b);
        r0.add(C1442g8.f5046b);
        r0.add(C2471rs.f8696b);
        r0.add(C0979Wr.f3063b);
        r0.add(C1123a5.f3536b);
        r0.add(C1343dy.f4836b);
        r0.add(C0812Sw.f2566b);
        r0.add(C1265ch.f4301b);
        r0.add(C0577Nb.f1872b);
        r0.add(C0395J7.f1333b);
        r0.add(C1055Yh.f3357b);
        r0.add(C1145ak.f3636b);
        return r0;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1500v(XmlPullParser r1, String r2) {
        if (r1.getAttributeValue("http://schemas.android.com/apk/res/android", r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static int m1501w(int r3) {
        if (r3 != 1) goto L5;
        return 0;
    L5:
        if (r3 != 2) goto L7;
        return 1;
    L7:
        if (r3 != 4) goto L9;
        return 2;
    L9:
        if (r3 != 8) goto L11;
        return 3;
    L11:
        if (r3 != 16) goto L13;
        return 4;
    L13:
        if (r3 != 32) goto L15;
        return 5;
    L15:
        if (r3 != 64) goto L17;
        return 6;
    L17:
        if (r3 != 128) goto L19;
        return 7;
    L19:
        if (r3 != 256) goto L21;
        return 8;
    L21:
        if (r3 != 512) goto L25;
        return 9;
    L25:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r3, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m1502x(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
        int r12 = r2.right;
        int r0 = r3.right;
        if (r12 > r0) goto L38;
        if (r2.left >= r0) goto L38;
        return false;
    L38:
        if (r2.left <= r3.left) goto L52;
        return true;
    L52:
        return false;
    L5:
        if (r1 != 33) goto L7;
        int r13 = r2.bottom;
        int r02 = r3.bottom;
        if (r13 > r02) goto L31;
        if (r2.top >= r02) goto L31;
        return false;
    L31:
        if (r2.top <= r3.top) goto L50;
        return true;
    L50:
        return false;
    L7:
        if (r1 != 66) goto L9;
        int r14 = r2.left;
        int r03 = r3.left;
        if (r14 < r03) goto L24;
        if (r2.right <= r03) goto L24;
        return false;
    L24:
        if (r2.right >= r3.right) goto L48;
        return true;
    L48:
        return false;
    L9:
        if (r1 != 130) goto L18;
        int r15 = r2.top;
        int r04 = r3.top;
        if (r15 < r04) goto L15;
        if (r2.bottom <= r04) goto L15;
        return false;
    L15:
        if (r2.bottom >= r3.bottom) goto L46;
        return true;
    L46:
        return false;
    L18:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: y */
    public static boolean m1503y(String r1, String r2) {
        if (r1.startsWith(r2.concat("(")) == true) goto L5;
        return false;
    L5:
        if (r1.endsWith(")") == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static int m1504z(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
        int r12 = r2.left;
        int r22 = r3.right;
    L18:
        return Math.max(0, r12 - r22);
    L5:
        if (r1 != 33) goto L7;
        r12 = r2.top;
        r22 = r3.bottom;
        goto L18
    L7:
        if (r1 != 66) goto L9;
        r12 = r3.left;
        r22 = r2.right;
        goto L18
    L9:
        if (r1 != 130) goto L13;
        r12 = r3.top;
        r22 = r2.bottom;
        goto L18
    L13:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }
}
