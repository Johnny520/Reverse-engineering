package com.abc.core.features;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.abc.internal.probe.AbstractC0567q;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class HomeAvatarHook {

    /* JADX INFO: renamed from: A */
    public static volatile long f1720A;

    /* JADX INFO: renamed from: B */
    public static volatile boolean f1721B;

    /* JADX INFO: renamed from: C */
    public static volatile String f1722C;

    /* JADX INFO: renamed from: a */
    public static final HomeAvatarHook f1723a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1724b = null;

    /* JADX INFO: renamed from: c */
    public static final Handler f1725c = null;

    /* JADX INFO: renamed from: d */
    public static volatile ClassLoader f1726d;

    /* JADX INFO: renamed from: e */
    public static volatile Context f1727e;

    /* JADX INFO: renamed from: f */
    public static volatile String f1728f;

    /* JADX INFO: renamed from: g */
    public static volatile WeakReference f1729g;

    /* JADX INFO: renamed from: h */
    public static volatile ImageView f1730h;

    /* JADX INFO: renamed from: i */
    public static volatile LinearLayout f1731i;

    /* JADX INFO: renamed from: j */
    public static volatile TextView f1732j;

    /* JADX INFO: renamed from: k */
    public static volatile TextView f1733k;

    /* JADX INFO: renamed from: l */
    public static volatile String f1734l;

    /* JADX INFO: renamed from: m */
    public static volatile int f1735m;

    /* JADX INFO: renamed from: n */
    public static volatile String f1736n;

    /* JADX INFO: renamed from: o */
    public static volatile String f1737o;

    /* JADX INFO: renamed from: p */
    public static volatile boolean f1738p;

    /* JADX INFO: renamed from: q */
    public static volatile long f1739q;

    /* JADX INFO: renamed from: r */
    public static volatile Bitmap f1740r;

    /* JADX INFO: renamed from: s */
    public static volatile boolean f1741s;

    /* JADX INFO: renamed from: t */
    public static volatile Method f1742t;

    /* JADX INFO: renamed from: u */
    public static volatile Method f1743u;

    /* JADX INFO: renamed from: v */
    public static volatile Method f1744v;

    /* JADX INFO: renamed from: w */
    public static volatile int f1745w;

    /* JADX INFO: renamed from: x */
    public static volatile int f1746x;

    /* JADX INFO: renamed from: y */
    public static volatile int f1747y;

    /* JADX INFO: renamed from: z */
    public static volatile boolean f1748z;

    static {
        f1723a = new HomeAvatarHook();
        f1724b = new AtomicBoolean(false);
        f1725c = new Handler(Looper.getMainLooper());
        f1734l = "";
        f1736n = "";
        f1737o = "";
        f1722C = "";
        new AtomicReference(null);
    }

    /* JADX INFO: renamed from: a */
    public static final Activity m1394a(Object r3) {
        Object r02 = null;
        if (r3 == null) goto L21;
        Field r1 = r3.getClass().getDeclaredField("f190364a");     // Catch: Throwable -> L9
        r1.setAccessible(true);     // Catch: Throwable -> L9
        Object r32 = r1.get(r3);     // Catch: Throwable -> L9
        if ((r32 instanceof Activity) == false) goto L11;
        Object r33 = (Activity) r32;     // Catch: Throwable -> L9
    L14:
        if ((r33 instanceof C0140f) == true) goto L18;
        r02 = r33;
    L18:
        return (Activity) r02;
    L11:
        r33 = null;
    L9:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
        goto L14
    L21:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m1395b(final ImageView r6, boolean r7) {
        ClassLoader r02 = f1726d;
        if (r02 != null) goto L5;
        r02 = r6.getContext().getClassLoader();
    L5:
        AbstractC0307g.m700b(r02);
        String r1 = m1409p(r02);
        if (AbstractC0425j.m1013R0(r1) == false) goto L9;
        r1 = f1736n;
    L9:
        if (AbstractC0425j.m1013R0(r1) == false) goto L12;
        m1412s("username empty");
        return;
    L12:
        f1736n = r1;
        Bitmap r2 = f1740r;
        if (f1741s == true) goto L15;
    L23:
        Bitmap r22 = m1403j(r02, r1);
        if (r22 != null) goto L26;
    L37:
        m1406m(r6);
    L38:
        if (r7 == false) goto L40;
    L69:
        Method r23 = f1742t;     // Catch: Throwable -> L51
        if (r23 != null) goto L53;
        r23 = m1408o(r02);     // Catch: Throwable -> L51
        if (r23 != null) goto L53;
        throw new IllegalStateException("factoryA unresolved");     // Catch: Throwable -> L51
    L53:
        r23.invoke(null, new Object[]{r6, r1});     // Catch: Throwable -> L51
        Object r03 = Boolean.TRUE;     // Catch: Throwable -> L51
    L56:
        Throwable r24 = AbstractC0141g.m465a(r03);
        if (r24 != null) goto L59;
        String r25 = "";
    L64:
        if (((Boolean) r03).booleanValue() == false) goto L67;
        f1737o = r1;
        final int r26 = 1;
        r6.setOnClickListener(new ViewOnClickListenerC0699u0(r6, r26));
        f1746x++;
        final int r04 = f1746x;
        Handler r27 = f1725c;
        final int r4 = 0;
        r27.postDelayed(new RunnableC0702v0(r04, r6, r4), 400);
        final int r42 = 1;
        r27.postDelayed(new RunnableC0702v0(r04, r6, r42), 1200);
        m1412s("bound user=" + r1 + " force=" + r7);
        return;
    L67:
        m1412s("factory bind fail user=" + r1 + " err=" + r25);
        f1725c.postDelayed(new RunnableC0705w0(r6, 0), 800);
        return;
    L59:
        String r05 = r24.getMessage();
        if (r05 != null) goto L62;
        r05 = r24.getClass().getSimpleName();
    L62:
        r25 = r05;
        r03 = Boolean.FALSE;
    L51:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L56
    L40:
        if (AbstractC0307g.m699a(f1737o, r1) == false) goto L69;
        if (m1402i(r6) == true) goto L69;
        return;
    L26:
        if (r22.isRecycled() == true) goto L37;
        if (r22.isRecycled() == true) goto L31;
        f1740r = r22;
        f1741s = true;
    L31:
        if (r7 == false) goto L33;
    L36:
        r6.setImageBitmap(r22);
        goto L38
    L33:
        if (m1402i(r6) == true) goto L36;
        if (AbstractC0307g.m699a(f1737o, r1) == true) goto L38;
    L15:
        if (AbstractC0307g.m699a(f1737o, r1) == false) goto L23;
        if (r2 == null) goto L23;
        if (r2.isRecycled() == true) goto L23;
        if (m1402i(r6) == true) goto L23;
        r6.setImageBitmap(r2);
        final int r06 = 0;
        r6.setOnClickListener(new ViewOnClickListenerC0699u0(r6, r06));
    }

    /* JADX INFO: renamed from: c */
    public static void m1396c(ImageView r6) {
        Drawable r62 = r6.getDrawable();     // Catch: Throwable -> L15
        if (r62 != null) goto L6;
        return;
    L6:
        if ((r62 instanceof BitmapDrawable) == false) goto L17;
        Bitmap r63 = ((BitmapDrawable) r62).getBitmap();     // Catch: Throwable -> L15
        if (r63 != null) goto L10;
        return;
    L10:
        if (r63.isRecycled() == false) goto L12;
        return;
    L12:
        if (r63.isRecycled() == true) goto L56;
        f1740r = r63;     // Catch: Throwable -> L15
        f1741s = true;     // Catch: Throwable -> L15
        return;
    L56:
        return;
    L17:
        Class<?> r02 = r62.getClass();     // Catch: Throwable -> L15
    L18:
        if (r02 == null) goto L58;
        if (r02.equals(Object.class) == true) goto L59;
        C0172c r2 = AbstractC0317q.m714c(r02.getDeclaredFields());     // Catch: Throwable -> L15
    L23:
        if (r2.hasNext() == false) goto L38;
        Field r3 = (Field) r2.next();     // Catch: Throwable -> L15
        if (AbstractC0307g.m699a(r3.getType(), Bitmap.class) == false) goto L23;
        r3.setAccessible(true);     // Catch: Throwable -> L15
        Object r32 = r3.get(r62);     // Catch: Throwable -> L15
        if ((r32 instanceof Bitmap) == false) goto L29;
        Bitmap r33 = (Bitmap) r32;     // Catch: Throwable -> L15
    L30:
        if (r33 == null) goto L23;
        if (r33.isRecycled() == true) goto L23;
        if (r33.isRecycled() == true) goto L53;
        f1740r = r33;     // Catch: Throwable -> L15
        f1741s = true;     // Catch: Throwable -> L15
        return;
    L53:
        return;
    L29:
        r33 = null;
        goto L30
    L38:
        r02 = r02.getSuperclass();     // Catch: Throwable -> L15
        goto L18
    L59:
        return;
    L58:
        return;
    L15:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: d */
    public static int m1397d(Context r02, int r1) {
        return (int) ((r1 * r02.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: e */
    public static View m1398e(final Activity r15) {
        LinearLayout r02 = f1731i;
        ViewGroup r1 = null;
        if (r02 != null) goto L5;
    L18:
        Window r2 = r15.getWindow();
        if (r2 == null) goto L21;
        View r22 = r2.getDecorView();
    L23:
        if ((r22 instanceof ViewGroup) == false) goto L25;
        ?? r23 = (ViewGroup) r22;
    L27:
        if (r23 != 0) goto L37;
        View r24 = r15.findViewById(R.id.content);
        if ((r24 instanceof ViewGroup) == false) goto L31;
        r23 = (ViewGroup) r24;
    L32:
        if (r23 != 0) goto L37;
        if (r02 == null) goto L35;
        return r02;
    L35:
        return new View(r15);
    L31:
        r23 = 0;
    L37:
        if ((r23 instanceof FrameLayout) == true) goto L45;
        View r03 = r23.findViewById(R.id.content);
        if ((r03 instanceof ViewGroup) == false) goto L42;
        r1 = (ViewGroup) r03;
    L42:
        if (r1 == null) goto L45;
        r23 = r1;
    L45:
        int r04 = m1397d(r15, 38);
        ?? r12 = new LinearLayout(r15);
        r12.setTag("achat_home_avatar_v3");
        r12.setOrientation(0);
        r12.setGravity(16);
        r12.setClickable(false);
        r12.setFocusable(false);
        ImageView r5 = new ImageView(r15);
        r5.setTag("achat_home_avatar_v3_avatar");
        r5.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r5.setContentDescription("头像");
        r5.setImportantForAccessibility(1);
        r5.setClickable(true);
        r5.setFocusable(true);
        GradientDrawable r7 = new GradientDrawable();
        r7.setShape(1);
        r7.setColor(Color.parseColor("#D0D0D0"));
        r5.setBackground(r7);
        r5.setClipToOutline(true);
        r5.setOutlineProvider(new C0571A0(0));
        final int r8 = 0;
        r5.setOnClickListener(new ViewOnClickListenerC0696t0(r15, r8));
        r12.addView(r5, new LinearLayout.LayoutParams(r04, r04));
        f1730h = r5;
        m1406m(r5);
        ?? r05 = new LinearLayout(r15);
        r05.setOrientation(1);
        r05.setGravity(16);
        r05.setClickable(true);
        r05.setFocusable(true);
        final int r72 = 1;
        r05.setOnClickListener(new ViewOnClickListenerC0696t0(r15, r72));
        LinearLayout.LayoutParams r52 = new LinearLayout.LayoutParams(-2, -2);
        r52.setMarginStart(m1397d(r15, 10));
        r12.addView(r05, r52);
        TextView r53 = new TextView(r15);
        r53.setTag("achat_home_avatar_v3_nick");
        r53.setTextSize(2, 14.0f);
        if ((r15.getResources().getConfiguration().uiMode & 48) != 32) goto L49;
        String r9 = "#F0F0F0";
    L50:
        r53.setTextColor(Color.parseColor(r9));
        r53.setTypeface(Typeface.create("sans-serif-medium", 0));
        r53.setMaxLines(1);
        TextUtils.TruncateAt r92 = TextUtils.TruncateAt.END;
        r53.setEllipsize(r92);
        r53.setMaxWidth(m1397d(r15, 130));
        r53.setIncludeFontPadding(false);
        r05.addView(r53, new LinearLayout.LayoutParams(-2, -2));
        f1733k = r53;
        LinearLayout r54 = new LinearLayout(r15);
        r54.setOrientation(0);
        r54.setGravity(16);
        r54.setClickable(true);
        r54.setFocusable(true);
        final int r13 = 2;
        r54.setOnClickListener(new ViewOnClickListenerC0696t0(r15, r13));
        LinearLayout.LayoutParams r122 = new LinearLayout.LayoutParams(-2, -2);
        r122.topMargin = m1397d(r15, 2);
        r05.addView(r54, r122);
        View r06 = new View(r15);
        GradientDrawable r123 = new GradientDrawable();
        r123.setShape(1);
        r123.setColor(Color.parseColor("#34C759"));
        r06.setBackground(r123);
        LinearLayout.LayoutParams r124 = new LinearLayout.LayoutParams(m1397d(r15, 7), m1397d(r15, 7));
        r124.setMarginEnd(m1397d(r15, 4));
        r124.gravity = 16;
        r54.addView(r06, r124);
        TextView r07 = new TextView(r15);
        r07.setTag("achat_home_avatar_v3_status");
        r07.setTextSize(2, 11.5f);
        if ((r15.getResources().getConfiguration().uiMode & 48) != 32) goto L54;
        String r4 = "#AAAAAA";
    L55:
        r07.setTextColor(Color.parseColor(r4));
        r07.setMaxLines(1);
        r07.setEllipsize(r92);
        r07.setMaxWidth(m1397d(r15, 130));
        r07.setIncludeFontPadding(false);
        r54.addView(r07, new LinearLayout.LayoutParams(-2, -2));
        f1732j = r07;
        m1407n(r15);
        int r08 = r15.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (r08 <= 0) goto L58;
        int r09 = r15.getResources().getDimensionPixelSize(r08);
    L59:
        int r3 = m1397d(r15, 8) + r09;
        int r42 = m1397d(r15, 12);
        FrameLayout.LayoutParams r55 = new FrameLayout.LayoutParams(-2, -2, 8388659);
        r55.topMargin = r3;
        r55.setMarginStart(r42);
        r55.leftMargin = r42;
        r23.addView(r12, r55);
        r12.setElevation(m1397d(r15, 12));
        r12.setTranslationZ(m1397d(r15, 12));
        f1731i = r12;
        m1412s("avatar container created");
        return r12;
    L58:
        r09 = m1397d(r15, 28);
        goto L59
    L54:
        r4 = "#7F7F7F";
        goto L55
    L49:
        r9 = "#191919";
        goto L50
    L25:
        r23 = 0;
        goto L27
    L21:
        r22 = null;
        goto L23
    L5:
        if (r02.isAttachedToWindow() == false) goto L61;
        return r02;
    L61:
        ViewParent r25 = r02.getParent();     // Catch: Throwable -> L10
        if ((r25 instanceof ViewGroup) == false) goto L12;
        ViewGroup r26 = (ViewGroup) r25;     // Catch: Throwable -> L10
    L13:
        if (r26 == null) goto L17;
        r26.removeView(r02);     // Catch: Throwable -> L10
    L17:
        f1731i = null;
        f1730h = null;
        f1737o = "";
        goto L18
    L12:
        r26 = null;
    L10:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX INFO: renamed from: f */
    public static Activity m1399f(Context r6) {
        if (r6 != null) goto L6;
        return null;
    L6:
        if ((r6 instanceof Activity) == true) goto L8;
        Class<?> r1 = r6.getClass();
    L10:
        if (r1 == null) goto L34;
        if (r1.equals(Object.class) == true) goto L34;
        C0172c r2 = AbstractC0317q.m714c(r1.getDeclaredFields());
    L15:
        if (r2.hasNext() == false) goto L33;
        Field r3 = (Field) r2.next();
        if (Activity.class.isAssignableFrom(r3.getType()) == false) goto L15;
        r3.setAccessible(true);
        Object r32 = r3.get(r6);     // Catch: Throwable -> L23
        if ((r32 instanceof Activity) == false) goto L25;
        Object r33 = (Activity) r32;     // Catch: Throwable -> L23
    L28:
        if ((r33 instanceof C0140f) == false) goto L30;
        r33 = null;
    L30:
        Activity r34 = (Activity) r33;
        if (r34 == null) goto L15;
        return r34;
    L25:
        r33 = null;
    L23:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
        goto L28
    L33:
        r1 = r1.getSuperclass();
    L34:
        WeakReference r62 = f1729g;
        if (r62 != null) goto L37;
        return null;
    L37:
        return (Activity) r62.get();
    L8:
        return (Activity) r6;
    }

    /* JADX INFO: renamed from: g */
    public static View m1400g(Object r7) {
        Class<?> r02 = r7.getClass();
    L4:
        if (r02 == null) goto L33;
        if (r02.equals(Object.class) == true) goto L33;
        C0172c r2 = AbstractC0317q.m714c(r02.getDeclaredFields());
    L9:
        if (r2.hasNext() == false) goto L32;
        Field r3 = (Field) r2.next();
        if (View.class.isAssignableFrom(r3.getType()) == false) goto L9;
        String r4 = r3.getName();
        AbstractC0307g.m700b(r4);
        if (AbstractC0425j.m1005J0(r4, "ViewPager", true) == true) goto L17;
        if (AbstractC0425j.m1005J0(r3.getType().getName(), "ViewPager", true) == false) goto L9;
    L17:
        r3.setAccessible(true);
        Object r32 = r3.get(r7);     // Catch: Throwable -> L22
        if ((r32 instanceof View) == false) goto L24;
        Object r33 = (View) r32;     // Catch: Throwable -> L22
    L27:
        if ((r33 instanceof C0140f) == false) goto L29;
        r33 = null;
    L29:
        View r34 = (View) r33;
        if (r34 == null) goto L9;
        return r34;
    L24:
        r33 = null;
    L22:
        th = move-exception;
        r33 = AbstractC0040p.m116u(th);
        goto L27
    L32:
        r02 = r02.getSuperclass();
    L33:
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1401h(boolean r6) {
        long r02 = SystemClock.uptimeMillis();
        if (r6 == true) goto L11;
        if (f1739q <= 0) goto L11;
        if ((r02 - f1739q) >= 4000) goto L11;
        return f1738p;
    L11:
        if (r6 == true) goto L23;
    L15:
        ConfigStore r62 = ConfigStore.f2048a;     // Catch: Throwable -> L13
        Object r63 = Boolean.valueOf(ConfigStore.m1661c("home_avatar_entry", true));     // Catch: Throwable -> L13
    L18:
        Object r2 = Boolean.TRUE;
        if ((r63 instanceof C0140f) == false) goto L21;
        r63 = r2;
    L21:
        f1738p = ((Boolean) r63).booleanValue();
        f1739q = r02;
        return f1738p;
    L13:
        th = move-exception;
        r63 = AbstractC0040p.m116u(th);
        goto L18
    L23:
        ConfigStore r64 = ConfigStore.f2048a;     // Catch: Throwable -> L13
        ConfigStore.m1665i(true);     // Catch: Throwable -> L13
        goto L15
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1402i(ImageView r3) {
        Drawable r32 = r3.getDrawable();
        if (r32 != null) goto L6;
        return true;
    L6:
        if ((r32 instanceof GradientDrawable) == false) goto L9;
        return true;
    L9:
        if ((r32 instanceof BitmapDrawable) == false) goto L17;
        Bitmap r33 = ((BitmapDrawable) r32).getBitmap();
        if (r33 != null) goto L13;
        return true;
    L13:
        if (r33.isRecycled() == false) goto L16;
        return true;
    L16:
        return false;
    L17:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static Bitmap m1403j(ClassLoader r9, String r10) {
        Object r1 = null;
        Method r2 = f1743u;     // Catch: Throwable -> L15
        if (r2 != null) goto L24;
        Method[] r92 = Class.forName("com.tencent.mm.pluginsdk.ui.u", false, r9).getMethods();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r92, "getMethods(...)");     // Catch: Throwable -> L15
        int r22 = r92.length;     // Catch: Throwable -> L15
        int r5 = 0;
    L7:
        if (r5 >= r22) goto L18;
        Method r6 = r92[r5];     // Catch: Throwable -> L15
        if (AbstractC0307g.m699a(r6.getName(), "c") == false) goto L17;
        Class<?>[] r7 = r6.getParameterTypes();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r7, "getParameterTypes(...)");     // Catch: Throwable -> L15
        if (r7.length != 0) goto L17;
        if (Modifier.isStatic(r6.getModifiers()) == false) goto L17;
    L19:
        if (r6 == null) goto L21;
        r6.setAccessible(true);     // Catch: Throwable -> L15
        f1743u = r6;     // Catch: Throwable -> L15
        r2 = r6;
    L22:
        if (r2 != null) goto L24;
        return null;
    L21:
        r2 = null;
    L17:
        r5 = r5 + 1;     // Catch: Throwable -> L15
        goto L7
    L18:
        r6 = null;
    L24:
        Object r93 = r2.invoke(null, null);     // Catch: Throwable -> L15
        if (r93 != null) goto L27;
        return null;
    L27:
        Method r23 = f1744v;     // Catch: Throwable -> L15
        if (r23 != null) goto L45;
        Method[] r24 = r93.getClass().getMethods();     // Catch: Throwable -> L15
        AbstractC0307g.m702d(r24, "getMethods(...)");     // Catch: Throwable -> L15
        int r3 = r24.length;     // Catch: Throwable -> L15
        int r52 = 0;
    L30:
        if (r52 >= r3) goto L39;
        Method r62 = r24[r52];     // Catch: Throwable -> L15
        if (AbstractC0307g.m699a(r62.getName(), "loadBitmap") == false) goto L38;
        if (r62.getParameterTypes().length != 1) goto L38;
        if (AbstractC0307g.m699a(r62.getParameterTypes()[0], String.class) == false) goto L38;
    L40:
        if (r62 == null) goto L42;
        r62.setAccessible(true);     // Catch: Throwable -> L15
        f1744v = r62;     // Catch: Throwable -> L15
        r23 = r62;
    L43:
        if (r23 != null) goto L45;
        return null;
    L42:
        r23 = null;
    L38:
        r52 = r52 + 1;     // Catch: Throwable -> L15
        goto L30
    L39:
        r62 = null;
    L45:
        Object r94 = r23.invoke(r93, new Object[]{r10});     // Catch: Throwable -> L15
        if ((r94 instanceof Bitmap) == false) goto L48;
        Bitmap r95 = (Bitmap) r94;     // Catch: Throwable -> L15
    L49:
        if (r95 == null) goto L53;
        boolean r102 = r95.isRecycled();     // Catch: Throwable -> L15
        Object r96 = r95;
        if (r102 == true) goto L53;
    L56:
        if ((r96 instanceof C0140f) == true) goto L60;
        r1 = r96;
    L60:
        return (Bitmap) r1;
    L53:
        r96 = null;
        goto L56
    L48:
        r95 = null;
    L15:
        th = move-exception;
        r96 = AbstractC0040p.m116u(th);
        goto L56
    }

    /* JADX INFO: renamed from: k */
    public static void m1404k(Activity r5) {
        AbstractC0307g.m703e(r5, "activity");
        if (r5.isFinishing() == false) goto L5;
        return;
    L5:
        f1729g = new WeakReference(r5);
        m1410q(r5);
        f1747y++;
        f1725c.postDelayed(new RunnableC0711y0(f1747y, r5, 1), 350);
    }

    /* JADX INFO: renamed from: l */
    public static void m1405l(Activity r6) {
        Iterator r02 = AbstractC0182m.m556h0(new String[]{"com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2", "com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity", "com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivityV2", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity", "com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity"}).iterator();
        int r1 = 0;
    L4:
        if (r02.hasNext() == false) goto L22;
        int r2 = r1 + 1;
        String r3 = (String) r02.next();
        Intent r4 = new Intent();     // Catch: Throwable -> L9
        r4.setClassName(r6, r3);     // Catch: Throwable -> L9
        if (r1 != 0) goto L11;
        r4.putExtra("KEY_IS_ENTER", true);     // Catch: Throwable -> L9
    L11:
        r6.startActivity(r4);     // Catch: Throwable -> L9
        Object r12 = Boolean.TRUE;     // Catch: Throwable -> L9
    L14:
        Object r42 = Boolean.FALSE;
        if ((r12 instanceof C0140f) == false) goto L18;
        r12 = r42;
    L18:
        if (((Boolean) r12).booleanValue() == true) goto L19;
        r1 = r2;
        goto L4
    L19:
        m1412s("opened status page via " + r3);
        return;
    L9:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L14
    L22:
        m1412s("failed to open status page");
    }

    /* JADX INFO: renamed from: m */
    public static void m1406m(ImageView r2) {
        Bitmap r02 = f1740r;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isRecycled() == false) goto L7;
        return;
    L7:
        if (f1741s == true) goto L10;
        return;
    L10:
        if (r2.getDrawable() != null) goto L12;
    L13:
        r2.setImageBitmap(r02);
        return;
    L12:
        if (m1402i(r2) == true) goto L13;
    }

    /* JADX INFO: renamed from: n */
    public static void m1407n(Activity r2) {
        ClassLoader r02 = f1726d;
        if (r02 != null) goto L5;
        r02 = r2.getClassLoader();
    L5:
        String r22 = f1734l;
        if (AbstractC0425j.m1013R0(r22) == false) goto L19;
        AtomicReference r23 = AbstractC0567q.f1676a;     // Catch: Throwable -> L9
        AbstractC0307g.m700b(r02);     // Catch: Throwable -> L9
        Object r24 = AbstractC0567q.m1381d(f1727e, r02, f1728f);     // Catch: Throwable -> L9
    L12:
        if ((r24 instanceof C0140f) == false) goto L14;
        r24 = null;
    L14:
        r22 = (String) r24;
        if (r22 != null) goto L17;
        r22 = "";
    L17:
        f1734l = r22;
    L9:
        th = move-exception;
        r24 = AbstractC0040p.m116u(th);
    L19:
        if (AbstractC0425j.m1013R0(r22) == false) goto L21;
        r22 = "我";
    L21:
        TextView r03 = f1733k;
        if (r03 == null) goto L24;
        r03.setText(r22);
    L24:
        TextView r25 = f1732j;
        if (r25 == null) goto L30;
        r25.setText("在线");
        return;
    }

    /* JADX INFO: renamed from: o */
    public static Method m1408o(ClassLoader r8) {
        if (f1742t != null) goto L5;
        Object r1 = null;
        Method[] r82 = Class.forName("com.tencent.mm.pluginsdk.ui.u", false, r8).getDeclaredMethods();     // Catch: Throwable -> L18
        AbstractC0307g.m702d(r82, "getDeclaredMethods(...)");     // Catch: Throwable -> L18
        int r2 = r82.length;     // Catch: Throwable -> L18
        int r4 = 0;
    L8:
        if (r4 >= r2) goto L21;
        Method r5 = r82[r4];     // Catch: Throwable -> L18
        if (AbstractC0307g.m699a(r5.getName(), "a") == false) goto L20;
        if (r5.getParameterTypes().length != 2) goto L20;
        if (ImageView.class.isAssignableFrom(r5.getParameterTypes()[0]) == false) goto L20;
        if (AbstractC0307g.m699a(r5.getParameterTypes()[1], String.class) == false) goto L20;
        Method r52 = r5;
    L22:
        if (r52 == null) goto L25;
        r52.setAccessible(true);     // Catch: Throwable -> L18
        f1742t = r52;     // Catch: Throwable -> L18
        Object r53 = r52;
    L28:
        if ((r53 instanceof C0140f) == true) goto L32;
        r1 = r53;
    L32:
        return (Method) r1;
    L25:
        r53 = null;
    L20:
        r4 = r4 + 1;     // Catch: Throwable -> L18
        goto L8
    L21:
        r52 = null;
    L18:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L28
    L5:
        return f1742t;
    }

    /* JADX INFO: renamed from: p */
    public static String m1409p(ClassLoader r5) {
        if ((!AbstractC0425j.m1013R0(f1736n)) == true) goto L5;
        AtomicReference r02 = AbstractC0567q.f1676a;
        Context r03 = f1727e;
        String r1 = f1728f;
        AbstractC0307g.m703e(r5, "classLoader");
        AtomicReference r2 = AbstractC0567q.f1676a;
        Object r3 = r2.get();
        AbstractC0307g.m700b((String) r3);
        if ((!AbstractC0425j.m1013R0(r4)) == true) goto L10;
        r3 = null;
    L10:
        String r32 = (String) r3;
        if (r32 != null) goto L19;
        String r33 = AbstractC0567q.m1380c(r03, r5, r1);
        if ((!AbstractC0425j.m1013R0(r33)) == false) goto L16;
        r2.set(r33);
        AbstractC0567q.m1382e("resolved=".concat(r33));
        return r33;
    L16:
        return "";
    L19:
        return r32;
    L5:
        return f1736n;
    }

    /* JADX INFO: renamed from: q */
    public static void m1410q(Activity r4) {
        f1745w++;
        f1725c.post(new RunnableC0711y0(f1745w, r4, 0));
    }

    /* JADX INFO: renamed from: r */
    public static void m1411r(boolean r4) {
        View r02 = f1731i;
        if (r02 != null) goto L8;
        r02 = f1730h;
        if (r02 != null) goto L8;
        return;
    L8:
        if (r4 == false) goto L10;
        int r42 = 0;
    L12:
        if (r02.getVisibility() != r42) goto L15;
        return;
    L15:
        if (AbstractC0307g.m699a(Looper.myLooper(), Looper.getMainLooper()) == false) goto L17;
        r02.setVisibility(r42);
        return;
    L17:
        f1725c.post(new RunnableC0714z0(r02, r42, 0));
        return;
    L10:
        r42 = 4;
        goto L12
    }

    /* JADX INFO: renamed from: s */
    public static void m1412s(String r2) {
        AbstractC0762d.m1954d("OKK-HomeAvatar: " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }
}
