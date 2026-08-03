package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1160i;
import io.github.cherrywechat.R;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: cr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1293cr {

    /* JADX INFO: renamed from: a */
    public static final byte[] f4725a = null;

    /* JADX INFO: renamed from: b */
    public static final C0061Bb f4726b = null;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0126Cx[] f4727c = null;

    /* JADX INFO: renamed from: d */
    public static final int[] f4728d = null;

    /* JADX INFO: renamed from: e */
    public static final int[] f4729e = null;

    static {
        f4725a = new byte[0];
        f4726b = new C0061Bb(new C2438r1(8));
        f4727c = new InterfaceC0126Cx[0];
        f4728d = new int[]{R.attr.colorPrimary};
        f4729e = new int[]{R.attr.colorPrimaryVariant};
    }

    public AbstractC1293cr() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static String m2530A(Context r3, ComponentName r4) {
        PackageManager r0 = r3.getPackageManager();
        if (Build.VERSION.SDK_INT < 29) goto L5;
        int r1 = 269222528;
    L6:
        ActivityInfo r42 = r0.getActivityInfo(r4, r1);
        String r02 = r42.parentActivityName;
        if (r02 == null) goto L9;
        return r02;
    L9:
        Bundle r43 = r42.metaData;
        if (r43 != null) goto L12;
        return null;
    L12:
        String r44 = r43.getString("android.support.PARENT_ACTIVITY");
        if (r44 != null) goto L16;
        return null;
    L16:
        if (r44.charAt(0) == '.') goto L18;
        return r44;
    L18:
        return r3.getPackageName() + r44;
    L5:
        r1 = 787072;
        goto L6
    }

    /* JADX INFO: renamed from: D */
    public static void m2531D(ViewGroup r15) {
        Float r0 = Float.valueOf(32.0f);
        if (r15 == null) goto L5;
        r15.setBackground(null);
        r15.setTag(R.id.tag_view_bg_ban, Object.class);
    L5:
        int r4 = r15.getChildCount();
        int r6 = 0;
    L6:
        if (r6 >= r4) goto L24;
        View r7 = r15.getChildAt(r6);
        if ((r7 instanceof ViewGroup) == false) goto L10;
        m2531D((ViewGroup) r7);
    L23:
        r6 = r6 + 1;
        goto L6
    L10:
        int r9 = 1;
        if ((r7 instanceof TextView) == false) goto L14;
        TextView r8 = (TextView) r7;
        HashMap r10 = AbstractC0999XA.f3193a;
        int r102 = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-190314295851061L));
        r8.setTag(R.id.tag_textview_color_ban, null);
        r8.setTextColor(r102);
        r8.setTag(R.id.tag_textview_color_ban, TextView.class);
    L21:
        if (r7.getLayoutParams().width <= AbstractC0295Gu.m616i(1)) goto L23;
        r7.setBackground(null);
        r7.setTag(R.id.tag_view_bg_ban, Object.class);
        goto L23
    L14:
        if ((r7 instanceof ImageView) == false) goto L21;
        ImageView r103 = (ImageView) r7;
        if (AbstractC0295Gu.m625r(-190413080098869L).equals(r103.getContentDescription()) == false) goto L21;
        if (r103.getLayoutParams().width == 0) goto L21;
        ViewGroup.LayoutParams r82 = r103.getLayoutParams();
        r82.width = 0;
        r82.height = 0;
        Context r83 = r103.getContext();
        AbstractC0295Gu.m625r(-190443144869941L);
        HashMap r11 = AbstractC0999XA.f3193a;
        ImageView r84 = C1456gf.m2808t(r83, C1517hw.m2890b(AbstractC0295Gu.m625r(-191061620160565L)));
        ViewParent r112 = r103.getParent();
        AbstractC0295Gu.m625r(-191272073558069L);
        LinearLayout.LayoutParams r12 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r0), AbstractC0295Gu.m616i(r0));
        r12.gravity = 16;
        ((ViewGroup) r112).addView(r84, r12);
        r84.setOnClickListener(new ViewOnClickListenerC1477h(r9, r103));
        goto L21
    }

    /* JADX INFO: renamed from: E */
    public static final void m2532E(C2341oz r2, String r3) {
        r2.m4762l(r2.f8216a - 1, "Trailing comma before the end of JSON ".concat(r3), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m2533F(C2341oz r1) {
        m2532E(r1, "object");
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public static TypedArray m2534G(Context r0, AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
        m2547f(r0, r1, r3, r4);
        m2549h(r0, r1, r2, r3, r4, r5);
        return r0.obtainStyledAttributes(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX INFO: renamed from: N */
    public static InterfaceC0883Uh m2535N(XmlResourceParser r25, Resources r26) {
    L3:
        int r1 = r25.next();
        int r3 = 2;
        if (r1 == 2) goto L7;
        if (r1 != 1) goto L3;
    L7:
        if (r1 != 2) goto L149;
        r25.require(2, null, "font-family");
        if (r25.getName().equals("font-family") == false) goto L146;
        TypedArray r4 = r26.obtainAttributes(Xml.asAttributeSet(r25), AbstractC0725Qu.f2311b);
        int r6 = 0;
        String r8 = r4.getString(0);
        String r9 = r4.getString(5);
        String r14 = r4.getString(6);
        String r15 = r4.getString(2);
        int r11 = r4.getResourceId(1, 0);
        int r12 = 3;
        int r13 = r4.getInteger(3, 1);
        int r16 = r4.getInteger(4, 500);
        String r2 = r4.getString(7);
        r4.recycle();
        if (r8 == null) goto L102;
        if (r9 == null) goto L102;
        List r112 = m2536O(r26, r11);
        ArrayList r42 = new ArrayList();
    L15:
        if (r25.next() == r12) goto L91;
        if (r25.getEventType() != r3) goto L15;
        if (r25.getName().equals("fallback") == false) goto L89;
        TypedArray r7 = r26.obtainAttributes(Xml.asAttributeSet(r25), AbstractC0725Qu.f2313d);
        int r17 = r13;
        String r10 = r7.getString(r6);     // Catch: Throwable -> L60
        String r132 = r7.getString(1);     // Catch: Throwable -> L60
        String r133 = r7.getString(r3);     // Catch: Throwable -> L60
        if (r10 == null) goto L62;
    L26:
        if (r25.next() == 3) goto L152;
        m2540U(r25);     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        Throwable r18 = th;
        ?? r32 = r7;
        long r142 = 1;
    L65:
        if (r32 == 0) goto L194;
    L86:
        th = move-exception;
        r18.addSuppressed(th);
        throw r18;
    L67:
        if ((r32 instanceof AutoCloseable) == false) goto L69;
        ((AutoCloseable) r32).close();     // Catch: Throwable -> L86
        throw r18;
    L69:
        if ((r32 instanceof ExecutorService) == false) goto L83;
        ExecutorService r72 = (ExecutorService) r32;     // Catch: Throwable -> L86
        if (r72 == ForkJoinPool.commonPool()) goto L195;
        boolean r0 = r72.isTerminated();     // Catch: Throwable -> L86
        if (r0 == true) goto L196;
        r72.shutdown();     // Catch: Throwable -> L86
        boolean r62 = false;
    L76:
        if (r0 == true) goto L81;
        r0 = r72.awaitTermination(r142, TimeUnit.DAYS);     // Catch: InterruptedException -> L79 Throwable -> L86
    L79:
        if (r62 == true) goto L76;
        r72.shutdownNow();     // Catch: Throwable -> L86
        r62 = true;
        goto L76
    L81:
        if (r62 == false) goto L197;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L86
        throw r18;
    L197:
        throw r18;
    L196:
        throw r18;
    L195:
        throw r18;
    L83:
        r32.recycle();     // Catch: Throwable -> L86
        throw r18;
    L194:
        throw r18;
    L152:
        ?? r33 = r7;
        String r19 = r15;
        int r63 = r17;
        String r172 = r14;
        r142 = 1;
        C0583Nh r73 = new C0583Nh(r8, r9, r10, r112, r132, r133);     // Catch: Throwable -> L55
        if ((r33 instanceof AutoCloseable) == false) goto L39;
        ((AutoCloseable) r33).close();
    L54:
        r42.add(r73);
    L90:
        r13 = r63;
        r14 = r172;
        r15 = r19;
        r3 = 2;
        r6 = 0;
        r12 = 3;
        goto L15
    L39:
        if ((r33 instanceof ExecutorService) == false) goto L53;
        ExecutorService r34 = (ExecutorService) r33;
        if (r34 == ForkJoinPool.commonPool()) goto L54;
        boolean r102 = r34.isTerminated();
        if (r102 == true) goto L54;
        r34.shutdown();
        boolean r122 = false;
    L46:
        if (r102 == true) goto L51;
        r102 = r34.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L49
    L49:
        if (r122 == true) goto L46;
        r34.shutdownNow();
        r122 = true;
        goto L46
    L51:
        if (r122 == false) goto L54;
        Thread.currentThread().interrupt();
        goto L54
    L53:
        r33.recycle();
    L55:
        th = th;
    L56:
        r18 = th;
        r32 = r33;
    L57:
        th = th;
        r33 = r7;
    L59:
        r142 = 1;
        goto L56
    L62:
        r33 = r7;
        r142 = 1;
        throw new XmlPullParserException("query attribute must be set in fallback element");     // Catch: Throwable -> L55
    L60:
        th = th;
        r33 = r7;
        goto L59
    L89:
        r63 = r13;
        r172 = r14;
        r19 = r15;
        m2540U(r25);
        goto L90
    L91:
        int r64 = r13;
        String r173 = r14;
        String r192 = r15;
        if (r42.isEmpty() == false) goto L201;
        if (r173 == null) goto L101;
        r42.add(new C0583Nh(r8, r9, r173, r112, null, null));
        if (r192 == null) goto L99;
        r42.add(new C0583Nh(r8, r9, r192, r112, null, null));
    L99:
        return new C1012Xh(r42, r64, r16, r2);
    L101:
        throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
    L201:
        return new C1012Xh(r42, r64, r16, r2);
    L102:
        ArrayList r110 = new ArrayList();
    L104:
        if (r25.next() == 3) goto L142;
        if (r25.getEventType() != 2) goto L104;
        if (r25.getName().equals("font") == true) goto L110;
        m2540U(r25);
        goto L104
    L110:
        TypedArray r22 = r26.obtainAttributes(Xml.asAttributeSet(r25), AbstractC0725Qu.f2312c);
        int r123 = 8;
        if (r22.hasValue(8) == true) goto L114;
        r123 = 1;
    L114:
        int r193 = r22.getInt(r123, 400);
        if (r22.hasValue(6) == false) goto L118;
        int r43 = 6;
    L120:
        if (1 != r22.getInt(r43, 0)) goto L122;
        boolean r24 = true;
    L123:
        int r44 = 9;
        if (r22.hasValue(9) == true) goto L128;
        r44 = 3;
    L128:
        if (r22.hasValue(7) == false) goto L130;
        int r65 = 7;
    L131:
        String r23 = r22.getString(r65);
        int r20 = r22.getInt(r44, 0);
        if (r22.hasValue(5) == false) goto L134;
        int r82 = 5;
    L135:
        int r21 = r22.getResourceId(r82, 0);
        String r222 = r22.getString(r82);
        r22.recycle();
    L137:
        if (r25.next() == 3) goto L139;
        m2540U(r25);
        goto L137
    L139:
        r110.add(new C0969Wh(r193, r20, r21, r222, r23, r24));
        goto L104
    L134:
        r82 = 0;
        goto L135
    L130:
        r65 = 4;
        goto L131
    L122:
        r24 = false;
        goto L123
    L118:
        r43 = 2;
        goto L120
    L142:
        if (r110.isEmpty() == false) goto L145;
        return null;
    L145:
        return new C0926Vh((C0969Wh[]) r110.toArray(new C0969Wh[0]));
    L146:
        m2540U(r25);
        return null;
    L149:
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: O */
    public static List m2536O(Resources r8, int r9) {
        if (r9 == 0) goto L4;
        TypedArray r0 = r8.obtainTypedArray(r9);
    L11:
        th = move-exception;
        r0.recycle();
        throw th;
    L7:
        if (r0.length() != 0) goto L13;
        List r82 = Collections.EMPTY_LIST;     // Catch: Throwable -> L11
        r0.recycle();
        return r82;
    L13:
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L11
        if (r0.getType(0) != 1) goto L25;
        int r92 = 0;
    L17:
        if (r92 >= r0.length()) goto L29;
        int r3 = r0.getResourceId(r92, 0);     // Catch: Throwable -> L11
        if (r3 == 0) goto L24;
        String[] r32 = r8.getStringArray(r3);     // Catch: Throwable -> L11
        ArrayList r4 = new ArrayList();     // Catch: Throwable -> L11
        int r5 = r32.length;     // Catch: Throwable -> L11
        int r6 = 0;
    L21:
        if (r6 >= r5) goto L23;
        r4.add(Base64.decode(r32[r6], 0));     // Catch: Throwable -> L11
        r6 = r6 + 1;     // Catch: Throwable -> L11
        goto L21
    L23:
        r1.add(r4);     // Catch: Throwable -> L11
    L24:
        r92 = r92 + 1;     // Catch: Throwable -> L11
    L29:
        r0.recycle();
        return r1;
    L25:
        String[] r83 = r8.getStringArray(r9);     // Catch: Throwable -> L11
        ArrayList r93 = new ArrayList();     // Catch: Throwable -> L11
        int r33 = r83.length;     // Catch: Throwable -> L11
        int r42 = 0;
    L26:
        if (r42 >= r33) goto L28;
        r93.add(Base64.decode(r83[r42], 0));     // Catch: Throwable -> L11
        r42 = r42 + 1;     // Catch: Throwable -> L11
        goto L26
    L28:
        r1.add(r93);     // Catch: Throwable -> L11
        goto L29
    L4:
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: P */
    public static TypedValue m2537P(Context r2, int r3) {
        TypedValue r0 = new TypedValue();
        if (r2.getTheme().resolveAttribute(r3, r0, true) == false) goto L5;
        return r0;
    L5:
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m2538Q(Context r1, int r2, boolean r3) {
        TypedValue r12 = m2537P(r1, r2);
        if (r12 != null) goto L5;
    L12:
        return r3;
    L5:
        if (r12.type != 18) goto L12;
        if (r12.data == 0) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static TypedValue m2539R(Context r1, int r2, String r3) {
        TypedValue r0 = m2537P(r1, r2);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{r3, r1.getResources().getResourceName(r2)}));
    }

    /* JADX INFO: renamed from: U */
    public static void m2540U(XmlPullParser r3) {
        int r0 = 1;
    L3:
        if (r0 <= 0) goto L11;
        int r1 = r3.next();
        if (r1 != 2) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        if (r1 != 3) goto L3;
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: V */
    public static String m2541V(int r7) {
        Object[] r72 = {Integer.valueOf(Color.red(r7)), Integer.valueOf(Color.green(r7)), Integer.valueOf(Color.blue(r7)), Double.valueOf(((double) Color.alpha(r7)) / 255.0d)};
        int r0 = AbstractC2665wD.f9229a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", r72);
    }

    /* JADX INFO: renamed from: a */
    public static final C2723xm m2542a(InterfaceC0126Cx r3) {
        return new C2723xm("Value of type '" + r3.mo203b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + r3.mo204c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: b */
    public static final C2465rm m2543b(int r6, CharSequence r7, String r8) {
        StringBuilder r0 = new StringBuilder();
        r0.append(r8);
        r0.append("\nJSON input: ");
        if (r7.length() < 200) goto L25;
        String r1 = ".....";
        if (r6 != (-1)) goto L11;
        int r82 = r7.length() - 60;
        if (r82 <= 0) goto L25;
        r7 = "....." + r7.subSequence(r82, r7.length()).toString();
        goto L25
    L11:
        int r83 = r6 - 30;
        int r2 = r6 + 30;
        if (r83 > 0) goto L14;
        String r4 = "";
    L16:
        if (r2 < r7.length()) goto L18;
        r1 = "";
    L18:
        StringBuilder r3 = new StringBuilder();
        r3.append(r4);
        if (r83 >= 0) goto L21;
        r83 = 0;
    L21:
        int r42 = r7.length();
        if (r2 <= r42) goto L24;
        r2 = r42;
    L24:
        r3.append(r7.subSequence(r83, r2).toString());
        r3.append(r1);
        r7 = r3.toString();
        goto L25
    L14:
        r4 = ".....";
    L25:
        r0.append(r7);
        String r72 = r0.toString();
        if (r6 < 0) goto L29;
        r72 = "Unexpected JSON token at offset " + r6 + ": " + r72;
    L29:
        return new C2465rm(r72);
    }

    /* JADX INFO: renamed from: c */
    public static final Set m2544c(InterfaceC0126Cx r4) {
        if ((r4 instanceof InterfaceC0050B6) == true) goto L5;
        HashSet r0 = new HashSet(r4.mo205d());
        int r1 = r4.mo205d();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L9;
        r0.add(r4.mo206e(r2));
        r2 = r2 + 1;
        goto L7
    L9:
        return r0;
    L5:
        return ((InterfaceC0050B6) r4).mo89g();
    }

    /* JADX INFO: renamed from: d */
    public static void m2545d(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r0);
    }

    /* JADX INFO: renamed from: e */
    public static void m2546e(int r0) {
        if (r0 < 0) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: f */
    public static void m2547f(Context r1, AttributeSet r2, int r3, int r4) {
        TypedArray r22 = r1.obtainStyledAttributes(r2, AbstractC0939Vu.f2931E, r3, r4);
        boolean r32 = r22.getBoolean(1, false);
        r22.recycle();
        if (r32 == false) goto L11;
        TypedValue r23 = new TypedValue();
        if (r1.getTheme().resolveAttribute(R.attr.isMaterialTheme, r23, true) == true) goto L7;
    L10:
        m2550i(r1, f4729e, "Theme.MaterialComponents");
        goto L11
    L7:
        if (r23.type != 18) goto L11;
        if (r23.data == 0) goto L10;
    L11:
        m2550i(r1, f4728d, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: g */
    public static void m2548g(String r0, Object r1) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r0);
    }

    /* JADX INFO: renamed from: h */
    public static void m2549h(Context r5, AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        TypedArray r0 = r5.obtainStyledAttributes(r6, AbstractC0939Vu.f2931E, r8, r9);
        boolean r2 = false;
        if (r0.getBoolean(2, false) == true) goto L7;
        r0.recycle();
        return;
    L7:
        if (r10.length == 0) goto L9;
        TypedArray r52 = r5.obtainStyledAttributes(r6, r7, r8, r9);
        int r62 = r10.length;
        int r72 = 0;
    L12:
        if (r72 >= r62) goto L17;
        if (r52.getResourceId(r10[r72], -1) == (-1)) goto L15;
        r72 = r72 + 1;
        goto L12
    L15:
        r52.recycle();
    L18:
        r0.recycle();
        if (r2 == false) goto L22;
        return;
    L22:
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    L17:
        r52.recycle();
    L10:
        r2 = true;
        goto L18
    L9:
        if (r0.getResourceId(0, -1) == (-1)) goto L18;
        goto L10
    }

    /* JADX INFO: renamed from: i */
    public static void m2550i(Context r2, int[] r3, String r4) {
        TypedArray r22 = r2.obtainStyledAttributes(r3);
        int r0 = 0;
    L4:
        if (r0 >= r3.length) goto L10;
        if (r22.hasValue(r0) == false) goto L8;
        r0 = r0 + 1;
        goto L4
    L8:
        r22.recycle();
        throw new IllegalArgumentException(AbstractC2374ph.m4814k("The style on this component requires your app theme to be ", r4, " (or a descendant)."));
    L10:
        r22.recycle();
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC0126Cx[] m2551l(List r1) {
        if (r1 != null) goto L4;
    L5:
        r1 = null;
    L6:
        if (r1 == null) goto L12;
        InterfaceC0126Cx[] r12 = (InterfaceC0126Cx[]) r1.toArray(new InterfaceC0126Cx[0]);
        if (r12 == null) goto L12;
        return r12;
    L12:
        return f4727c;
    L4:
        if (r1.isEmpty() == false) goto L6;
        goto L5
    }

    /* JADX INFO: renamed from: m */
    public static int m2552m(C0038Av r1, AbstractC2730xt r2, View r3, View r4, AbstractC1160i r5, boolean r6) {
        if (r5.getChildCount() != 0) goto L5;
        return 0;
    L5:
        if (r1.m58b() == 0) goto L16;
        if (r3 == null) goto L17;
        if (r4 == null) goto L18;
        if (r6 == false) goto L11;
        int r12 = r2.mo5251b(r4) - r2.mo5254e(r3);
        return Math.min(r2.mo5261l(), r12);
    L11:
        return Math.abs(r5.getPosition(r3) - r5.getPosition(r4)) + 1;
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public static int m2553n(C0038Av r4, AbstractC2730xt r5, View r6, View r7, AbstractC1160i r8, boolean r9, boolean r10) {
        if (r8.getChildCount() != 0) goto L5;
    L17:
        return 0;
    L5:
        if (r4.m58b() == 0) goto L17;
        if (r6 == null) goto L17;
        if (r7 == null) goto L17;
        int r0 = Math.min(r8.getPosition(r6), r8.getPosition(r7));
        int r2 = Math.max(r8.getPosition(r6), r8.getPosition(r7));
        if (r10 == false) goto L12;
        int r42 = Math.max(0, (r4.m58b() - r2) - 1);
    L13:
        if (r9 == true) goto L16;
        return r42;
    L16:
        return Math.round((r42 * (Math.abs(r5.mo5251b(r7) - r5.mo5254e(r6)) / (Math.abs(r8.getPosition(r6) - r8.getPosition(r7)) + 1))) + (r5.mo5260k() - r5.mo5254e(r6)));
    L12:
        r42 = Math.max(0, r0);
        goto L13
    }

    /* JADX INFO: renamed from: o */
    public static int m2554o(C0038Av r1, AbstractC2730xt r2, View r3, View r4, AbstractC1160i r5, boolean r6) {
        if (r5.getChildCount() != 0) goto L5;
        return 0;
    L5:
        if (r1.m58b() == 0) goto L16;
        if (r3 == null) goto L17;
        if (r4 == null) goto L18;
        if (r6 == true) goto L13;
        return r1.m58b();
    L13:
        return (int) (((r2.mo5251b(r4) - r2.mo5254e(r3)) / (Math.abs(r5.getPosition(r3) - r5.getPosition(r4)) + 1)) * r1.m58b());
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static final long m2555p(InputStream r6, OutputStream r7) {
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

    /* JADX INFO: renamed from: u */
    public static byte[] m2556u(byte[] r6) {
        if (r6.length != 16) goto L14;
        byte[] r0 = new byte[16];
        int r3 = 0;
    L6:
        if (r3 >= 16) goto L11;
        byte r5 = (byte) ((r6[r3] << 1) & 254);
        r0[r3] = r5;
        if (r3 >= 15) goto L10;
        r0[r3] = (byte) (((byte) ((r6[r3 + 1] >> 7) & 1)) | r5);
    L10:
        r3 = r3 + 1;
        goto L6
    L11:
        r0[15] = (byte) (((byte) ((r6[0] >> 7) & 135)) ^ r0[15]);
        return r0;
    L14:
        throw new IllegalArgumentException("value must be a block.");
    }

    /* JADX INFO: renamed from: v */
    public static final Object m2557v(long r5, AbstractC0233Fb r7) {
        if (r5 <= 0) goto L55;
        C0523M6 r0 = new C0523M6(AbstractC0628Oj.m1225E(r7));
        InterfaceC2100je r72 = r0.m1019m();
        if (r72 != null) goto L9;
    L11:
        InterfaceC1137ac r1 = r0.f1711e;
        if (r5 >= Long.MAX_VALUE) goto L20;
        InterfaceC1049Yb r73 = r1.mo24m(C1456gf.f5158b);
        if ((r73 instanceof InterfaceC2413qd) == false) goto L16;
        InterfaceC2413qd r74 = (InterfaceC2413qd) r73;
    L17:
        if (r74 != null) goto L19;
        r74 = AbstractC0707Qc.f2273a;
    L19:
        r74.mo2668f(r5, r0);
        goto L20
    L16:
        r74 = null;
    L20:
        boolean r52 = r0.m1020n();
        AtomicIntegerFieldUpdater r6 = C0523M6.f1707f;
    L21:
        int r75 = r6.get(r0);
        int r2 = r75 >> 29;
        EnumC1453gc r3 = EnumC1453gc.f5148a;
        if (r2 != 0) goto L24;
        if (r6.compareAndSet(r0, r75, 536870912 + (536870911 & r75)) == false) goto L21;
        if (((InterfaceC2100je) C0523M6.f1709h.get(r0)) != null) goto L49;
        r0.m1019m();
    L49:
        if (r52 == false) goto L51;
        r0.m1021p();
    L51:
        Object r53 = r3;
    L52:
        if (r53 != r3) goto L55;
        return r53;
    L24:
        if (r2 != 2) goto L43;
        if (r52 == false) goto L27;
        r0.m1021p();
    L27:
        Object r54 = C0523M6.f1708g.get(r0);
        if ((r54 instanceof C0189Ea) == true) goto L41;
        int r76 = r0.f5157c;
        if (r76 == 1) goto L32;
        if (r76 == 2) goto L32;
    L39:
        r53 = r0.mo1014g(r54);
    L32:
        InterfaceC1332dm r62 = (InterfaceC1332dm) r1.mo24m(C1456gf.f5162f);
        if (r62 == null) goto L39;
        if (r62.mo1745d() == true) goto L39;
        CancellationException r55 = r62.mo1748p();
        r0.mo1010a(r55);
        throw r55;
    L41:
        throw ((C0189Ea) r54).f575a;
    L43:
        throw new IllegalStateException("Already suspended");
    L9:
        if ((C0523M6.f1708g.get(r0) instanceof InterfaceC0980Ws) == true) goto L11;
        r72.mo1795a();
        C0523M6.f1709h.set(r0, C0937Vs.f2926a);
    L55:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC0502Lm m2558x(InterfaceC0126Cx r1) {
        if ((r1 instanceof C0169Dx) == true) goto L5;
        return null;
    L5:
        return m2558x(((C0169Dx) r1).f450a);
    }

    /* JADX INFO: renamed from: y */
    public static Intent m2559y(AbstractActivityC1244c3 r2) {
        Intent r0 = r2.getParentActivityIntent();
        if (r0 == null) goto L21;
        return r0;
    L21:
        String r02 = m2530A(r2, r2.getComponentName());     // Catch: PackageManager.NameNotFoundException -> L17
        if (r02 == null) goto L15;
        ComponentName r1 = new ComponentName(r2, r02);
        if (m2530A(r2, r1) != null) goto L14;
        return Intent.makeMainActivity(r1);
    L14:
        return new Intent().setComponent(r1);
    L24:
        return null;
    L15:
        return null;
    L17:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    /* JADX INFO: renamed from: z */
    public static Intent m2560z(AbstractActivityC1244c3 r2, ComponentName r3) {
        String r0 = m2530A(r2, r3);
        if (r0 != null) goto L6;
        return null;
    L6:
        ComponentName r1 = new ComponentName(r3.getPackageName(), r0);
        if (m2530A(r2, r1) != null) goto L11;
        return Intent.makeMainActivity(r1);
    L11:
        return new Intent().setComponent(r1);
    }

    /* JADX INFO: renamed from: B */
    public int mo1385B(View r1) {
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public int mo2017C() {
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo2561H(Throwable r1);

    /* JADX INFO: renamed from: I */
    public abstract void mo2562I(C2428qs r1);

    /* JADX INFO: renamed from: J */
    public void mo1386J(View r1, int r2) {
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo1387K(int r1);

    /* JADX INFO: renamed from: L */
    public abstract void mo1388L(View r1, int r2, int r3);

    /* JADX INFO: renamed from: M */
    public abstract void mo1389M(View r1, float r2, float r3);

    /* JADX INFO: renamed from: S */
    public abstract void mo1027S(boolean r1);

    /* JADX INFO: renamed from: T */
    public abstract void mo1028T(boolean r1);

    /* JADX INFO: renamed from: W */
    public abstract boolean mo1390W(View r1, int r2);

    /* JADX INFO: renamed from: j */
    public abstract int mo1391j(View r1, int r2);

    /* JADX INFO: renamed from: k */
    public abstract int mo1392k(View r1, int r2);

    /* JADX INFO: renamed from: q */
    public abstract Typeface mo1762q(Context r1, C0926Vh r2, Resources r3, int r4);

    /* JADX INFO: renamed from: r */
    public abstract Typeface mo1763r(Context r1, C1098Zh[] r2, int r3);

    /* JADX INFO: renamed from: s */
    public Typeface mo1831s(Context r1, List r2, int r3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: t */
    public Typeface mo1764t(Context r1, Resources r2, int r3, String r4, int r5) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
            	at java.base/java.util.Objects.checkIndex(Unknown Source)
            	at java.base/java.util.ArrayList.get(Unknown Source)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:368)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:330)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:293)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*
            this = this;
            java.io.File r1 = p000.AbstractC0295Gu.m626s(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = p000.AbstractC0295Gu.m614g(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1293cr.mo1764t(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }

    /* JADX INFO: renamed from: w */
    public C1098Zh mo1832w(C1098Zh[] r11, int r12) {
        new C1517hw(16);
        if ((r12 & 1) != 0) goto L5;
        int r0 = 400;
    L7:
        if ((r12 & 2) == 0) goto L9;
        boolean r122 = true;
    L10:
        int r3 = r11.length;
        C1098Zh r4 = null;
        int r5 = Integer.MAX_VALUE;
        int r6 = 0;
    L11:
        if (r6 >= r3) goto L21;
        C1098Zh r7 = r11[r6];
        int r8 = Math.abs(r7.f3487c - r0) * 2;
        if (r7.f3488d != r122) goto L15;
        int r9 = 0;
    L16:
        int r82 = r8 + r9;
        if (r4 == null) goto L19;
        if (r5 > r82) goto L19;
    L20:
        r6 = r6 + 1;
    L19:
        r4 = r7;
        r5 = r82;
        goto L20
    L15:
        r9 = 1;
        goto L16
    L21:
        return r4;
    L9:
        r122 = false;
        goto L10
    L5:
        r0 = 700;
        goto L7
    }
}
