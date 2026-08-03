package p050c0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Process;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.C1031R;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p001A0.ViewOnClickListenerC0025a;
import p006D.RunnableC0129u;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0188s;
import p009E0.C0180k;
import p026N0.C0268i;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.C0312l;
import p034S.AbstractC0324d;
import p036T0.C0340c;
import p037U.AbstractC0358S;
import p040V0.AbstractC0407j;
import p040V0.C0402e;
import p040V0.C0403f;
import p040V0.C0412o;
import p040V0.InterfaceC0399b;
import p040V0.InterfaceC0405h;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0431p;
import p042W0.AbstractC0432q;
import p042W0.AbstractC0433r;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0639a0 {

    /* JADX INFO: renamed from: A */
    public static volatile Object f1961A;

    /* JADX INFO: renamed from: B */
    public static volatile Object f1962B;

    /* JADX INFO: renamed from: C */
    public static volatile Method f1963C;

    /* JADX INFO: renamed from: D */
    public static volatile Class f1964D;

    /* JADX INFO: renamed from: E */
    public static volatile String f1965E;

    /* JADX INFO: renamed from: F */
    public static volatile int f1966F;

    /* JADX INFO: renamed from: a */
    public static final C0639a0 f1967a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1968b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1969c = null;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1970d = null;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f1971e = null;

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f1972f = null;

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f1973g = null;

    /* JADX INFO: renamed from: h */
    public static final AtomicBoolean f1974h = null;

    /* JADX INFO: renamed from: i */
    public static final AtomicBoolean f1975i = null;

    /* JADX INFO: renamed from: j */
    public static final AtomicBoolean f1976j = null;

    /* JADX INFO: renamed from: k */
    public static final AtomicBoolean f1977k = null;

    /* JADX INFO: renamed from: l */
    public static final AtomicBoolean f1978l = null;

    /* JADX INFO: renamed from: m */
    public static final AtomicBoolean f1979m = null;

    /* JADX INFO: renamed from: n */
    public static final AtomicBoolean f1980n = null;

    /* JADX INFO: renamed from: o */
    public static final AtomicBoolean f1981o = null;

    /* JADX INFO: renamed from: p */
    public static final AtomicBoolean f1982p = null;

    /* JADX INFO: renamed from: q */
    public static final AtomicBoolean f1983q = null;

    /* JADX INFO: renamed from: r */
    public static final AtomicBoolean f1984r = null;

    /* JADX INFO: renamed from: s */
    public static final AtomicBoolean f1985s = null;

    /* JADX INFO: renamed from: t */
    public static final AtomicBoolean f1986t = null;

    /* JADX INFO: renamed from: u */
    public static final AtomicBoolean f1987u = null;

    /* JADX INFO: renamed from: v */
    public static final ConcurrentHashMap.KeySetView f1988v = null;

    /* JADX INFO: renamed from: w */
    public static final ConcurrentHashMap f1989w = null;

    /* JADX INFO: renamed from: x */
    public static final ConcurrentHashMap f1990x = null;

    /* JADX INFO: renamed from: y */
    public static final ConcurrentHashMap f1991y = null;

    /* JADX INFO: renamed from: z */
    public static final ConcurrentHashMap f1992z = null;

    static {
        f1967a = new C0639a0();
        f1968b = new AtomicBoolean(false);
        f1969c = new AtomicBoolean(false);
        f1970d = new AtomicBoolean(false);
        f1971e = new AtomicBoolean(false);
        f1972f = new AtomicBoolean(false);
        f1973g = new AtomicBoolean(false);
        f1974h = new AtomicBoolean(false);
        f1975i = new AtomicBoolean(false);
        f1976j = new AtomicBoolean(false);
        f1977k = new AtomicBoolean(false);
        f1978l = new AtomicBoolean(false);
        f1979m = new AtomicBoolean(false);
        f1980n = new AtomicBoolean(false);
        new AtomicBoolean(false);
        f1981o = new AtomicBoolean(false);
        f1982p = new AtomicBoolean(false);
        f1983q = new AtomicBoolean(false);
        f1984r = new AtomicBoolean(false);
        new AtomicBoolean(false);
        f1985s = new AtomicBoolean(false);
        new AtomicBoolean(false);
        f1986t = new AtomicBoolean(false);
        f1987u = new AtomicBoolean(false);
        f1988v = ConcurrentHashMap.newKeySet();
        f1989w = new ConcurrentHashMap();
        f1990x = new ConcurrentHashMap();
        f1991y = new ConcurrentHashMap();
        f1992z = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static void m1545A(DexKitBridge r5, ClassLoader r6) {
        Object r02 = null;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L7
        r1.searchPackages(new String[]{"com.tencent.mm.ui.chatting.adapter"});     // Catch: Throwable -> L7
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L7
        r2.usingStrings(new String[]{"_onBindViewHolder[", "MicroMsg.ChattingDataAdapterV3"});     // Catch: Throwable -> L7
        r1.matcher(r2);     // Catch: Throwable -> L7
        MethodData r52 = r5.findMethod(r1).firstOrNull();     // Catch: Throwable -> L7
        if (r52 == null) goto L9;
        Object r53 = r52.getDescriptor();     // Catch: Throwable -> L7
    L12:
        if ((r53 instanceof C0140f) == false) goto L14;
        r53 = null;
    L14:
        String r54 = (String) r53;
        if (r54 != null) goto L17;
    L33:
        m1601p0("DexKit did not find adapter bind method");
        return;
    L17:
        if (AbstractC0425j.m1013R0(r54) == true) goto L33;
        Object r62 = m1606t(r6, r54);     // Catch: Throwable -> L21
    L24:
        if ((r62 instanceof C0140f) == true) goto L27;
        r02 = r62;
    L27:
        Method r03 = (Method) r02;
        if (r03 != null) goto L31;
        m1601p0("adapter descriptor could not resolve: ".concat(r54));
        return;
    L31:
        m1558O("DexKit:".concat(r54), r03);
        return;
    L21:
        th = move-exception;
        r62 = AbstractC0040p.m116u(th);
        goto L24
    L9:
        r53 = null;
    L7:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: B */
    public static void m1546B(DexKitBridge r4, ClassLoader r5) {
        Object r02 = null;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L7
        r1.searchPackages(new String[]{"com.tencent.mm.ui.chatting.component"});     // Catch: Throwable -> L7
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L7
        r2.usingStrings(new String[]{"clear video generate callback"});     // Catch: Throwable -> L7
        r1.matcher(r2);     // Catch: Throwable -> L7
        MethodData r42 = r4.findMethod(r1).firstOrNull();     // Catch: Throwable -> L7
        if (r42 == null) goto L9;
        Object r43 = r42.getDescriptor();     // Catch: Throwable -> L7
    L12:
        if ((r43 instanceof C0140f) == false) goto L14;
        r43 = null;
    L14:
        String r44 = (String) r43;
        if (r44 != null) goto L17;
    L33:
        m1601p0("DexKit did not find quote component");
        return;
    L17:
        if (AbstractC0425j.m1013R0(r44) == true) goto L33;
        Object r52 = m1606t(r5, r44);     // Catch: Throwable -> L21
    L24:
        if ((r52 instanceof C0140f) == true) goto L27;
        r02 = r52;
    L27:
        Method r03 = (Method) r02;
        if (r03 != null) goto L31;
        m1601p0("component descriptor could not resolve: ".concat(r44));
        return;
    L31:
        Class<?> r53 = r03.getDeclaringClass();
        AbstractC0307g.m702d(r53, "getDeclaringClass(...)");
        m1559P(r53, "DexKit:".concat(r44));
        return;
    L21:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L24
    L9:
        r43 = null;
    L7:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: C */
    public static View m1547C(View r3, ClassLoader r4) {
        if ("c3g".equals("c3g") == false) goto L8;
        int r1 = f1966F;
        if (r1 != 0) goto L9;
        r1 = m1560Q(r4, "c3g");
        f1966F = r1;
    L9:
        if (r1 == 0) goto L19;
        View r42 = r3.findViewById(r1);
        if (r42 == null) goto L19;
        C0422g r02 = AbstractC0600K.f1833a;
        if (AbstractC0425j.m1005J0(r42.getClass().getName(), "MMNeat7extView", false) == true) goto L16;
        r42 = null;
    L16:
        if (r42 == null) goto L19;
        return r42;
    L19:
        return m1551G(r3, new C0570A(4));
    L8:
        r1 = m1560Q(r4, "c3g");
        goto L9
    }

    /* JADX INFO: renamed from: D */
    public static View m1548D(ViewGroup r7, View r8) {
        ClassLoader r02 = r8.getContext().getClassLoader();
        AbstractC0307g.m702d(r02, "getClassLoader(...)");
        View r82 = m1550F(r8, r02);
        if (r82 == null) goto L5;
        return r82;
    L5:
        int r83 = r7.getChildCount();
    L6:
        r83 = r83 - 1;
        if ((-1) >= r83) goto L20;
        View r03 = r7.getChildAt(r83);
        if (r03.getVisibility() == 8) goto L6;
        if (AbstractC0307g.m699a(r03.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == true) goto L6;
        if (r03.getTag(C1031R.id.abc_tag_message_object) != null) goto L6;
        if ((r03 instanceof ViewGroup) == false) goto L18;
        if (((ViewGroup) r03).getChildCount() > 0) goto L6;
    L18:
        return r03;
    L20:
        int r84 = r7.getChildCount() - 1;
    L21:
        if ((-1) >= r84) goto L30;
        View r4 = r7.getChildAt(r84);
        if (r4.getVisibility() == 8) goto L29;
        if (AbstractC0307g.m699a(r4.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == true) goto L29;
        if (r4.getTag(C1031R.id.abc_tag_message_object) != null) goto L29;
        return r4;
    L29:
        r84 = r84 - 1;
        goto L21
    L30:
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static TextView m1549E(ViewGroup r5) {
        int r02 = r5.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L11;
        View r2 = r5.getChildAt(r1);
        if (AbstractC0307g.m699a(r2.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == false) goto L10;
        if ((r2 instanceof TextView) == false) goto L10;
        return (TextView) r2;
    L10:
        r1 = r1 + 1;
        goto L3
    L11:
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static View m1550F(View r2, ClassLoader r3) {
        if ("c3h".equals("c3g") == false) goto L8;
        int r02 = f1966F;
        if (r02 != 0) goto L9;
        r02 = m1560Q(r3, "c3h");
        f1966F = r02;
    L9:
        if (r02 == 0) goto L14;
        View r32 = r2.findViewById(r02);
        if (r32 == null) goto L14;
        return r32;
    L14:
        return m1551G(r2, new C0570A(5));
    L8:
        r02 = m1560Q(r3, "c3h");
        goto L9
    }

    /* JADX INFO: renamed from: G */
    public static View m1551G(View r5, InterfaceC0286l r6) {
        if (((Boolean) r6.invoke(r5)).booleanValue() == false) goto L6;
        return r5;
    L6:
        if ((r5 instanceof ViewGroup) == true) goto L8;
        return null;
    L8:
        ViewGroup r52 = (ViewGroup) r5;
        int r02 = r52.getChildCount();
        int r2 = 0;
    L9:
        if (r2 >= r02) goto L14;
        View r3 = r52.getChildAt(r2);
        AbstractC0307g.m702d(r3, "getChildAt(...)");
        View r32 = m1551G(r3, r6);
        if (r32 != null) goto L12;
        r2 = r2 + 1;
        goto L9
    L12:
        return r32;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static void m1552H(DexKitBridge r5, ClassLoader r6) {
        Object r02 = null;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L7
        r1.searchPackages(new String[]{"com.tencent.mm.ui.chatting.viewitems"});     // Catch: Throwable -> L7
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L7
        r2.usingEqStrings(new String[]{"ItemDataTag", "getCurrentMsg2 err"});     // Catch: Throwable -> L7
        r1.matcher(r2);     // Catch: Throwable -> L7
        MethodData r52 = r5.findMethod(r1).firstOrNull();     // Catch: Throwable -> L7
        if (r52 == null) goto L9;
        Object r53 = r52.getDescriptor();     // Catch: Throwable -> L7
    L12:
        if ((r53 instanceof C0140f) == false) goto L14;
        r53 = null;
    L14:
        String r54 = (String) r53;
        if (r54 != null) goto L17;
    L33:
        m1601p0("DexKit did not find getCurrentMsg2");
        return;
    L17:
        if (AbstractC0425j.m1013R0(r54) == true) goto L33;
        Object r62 = m1606t(r6, r54);     // Catch: Throwable -> L21
    L24:
        if ((r62 instanceof C0140f) == true) goto L27;
        r02 = r62;
    L27:
        Method r03 = (Method) r02;
        if (r03 != null) goto L31;
        m1601p0("getCurrentMsg2 descriptor could not resolve: ".concat(r54));
        return;
    L31:
        r03.setAccessible(true);
        f1963C = r03;
        m1601p0("found getCurrentMsg2 via DexKit:".concat(r54));
        return;
    L21:
        th = move-exception;
        r62 = AbstractC0040p.m116u(th);
        goto L24
    L9:
        r53 = null;
    L7:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: I */
    public static View m1553I(Object r5) {
        Object r02 = m1611y(r5, "itemView");
        if ((r02 instanceof View) == false) goto L5;
        View r03 = (View) r02;
    L6:
        if (r03 != null) goto L29;
        Iterator r04 = m1586i(r5.getClass()).iterator();
    L9:
        if (r04.hasNext() == false) goto L38;
        Field r1 = (Field) r04.next();
        if (View.class.isAssignableFrom(r1.getType()) == true) goto L30;
        View r12 = null;
    L26:
        if (r12 == null) goto L9;
        return r12;
    L30:
        r1.setAccessible(true);     // Catch: Throwable -> L18
        Object r13 = r1.get(r5);     // Catch: Throwable -> L18
        if ((r13 instanceof View) == false) goto L20;
        Object r14 = (View) r13;     // Catch: Throwable -> L18
    L23:
        if ((r14 instanceof C0140f) == false) goto L25;
        r14 = null;
    L25:
        r12 = (View) r14;
        goto L26
    L20:
        r14 = null;
    L18:
        th = move-exception;
        r14 = AbstractC0040p.m116u(th);
        goto L23
    L38:
        return null;
    L29:
        return r03;
    L5:
        r03 = null;
        goto L6
    }

    /* JADX INFO: renamed from: J */
    public static final void m1554J(View r4, ArrayList r5) {
        if (r4.getVisibility() == 0) goto L5;
        return;
    L5:
        if (AbstractC0307g.m699a(r4.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == false) goto L8;
        return;
    L8:
        if ((r4 instanceof ImageView) == false) goto L11;
        r5.add(r4);
    L11:
        if ((r4 instanceof ViewGroup) == false) goto L24;
        String r02 = r4.getClass().getName();
        int r2 = 0;
        if (AbstractC0425j.m1005J0(r02, "Video", false) == false) goto L15;
    L18:
        r5.add(r4);
    L19:
        ViewGroup r42 = (ViewGroup) r4;
        int r03 = r42.getChildCount();
    L20:
        if (r2 >= r03) goto L26;
        View r1 = r42.getChildAt(r2);
        AbstractC0307g.m702d(r1, "getChildAt(...)");
        m1554J(r1, r5);
        r2 = r2 + 1;
        goto L20
    L26:
        return;
    L15:
        if (AbstractC0425j.m1005J0(r02, "Media", false) == true) goto L18;
        if (AbstractC0425j.m1005J0(r02, "Thumb", false) == false) goto L19;
    }

    /* JADX INFO: renamed from: L */
    public static C0634Y m1555L(View r5) {
        ViewParent r02 = r5.getParent();
        int r1 = 0;
    L4:
        if ((r02 instanceof View) == false) goto L14;
        if (r1 >= 8) goto L21;
        if ((r02 instanceof LinearLayout) == false) goto L13;
        LinearLayout r2 = (LinearLayout) r02;
        if (r2.getOrientation() != 1) goto L13;
        return new C0634Y(r2, r5);
    L13:
        r5 = r02;
        r02 = r5.getParent();
        r1 = r1 + 1;
        goto L4
    L21:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static LinearLayout m1556M(ViewGroup r5) {
        int r02 = r5.getChildCount() - 1;
    L4:
        if ((-1) >= r02) goto L16;
        View r2 = r5.getChildAt(r02);
        if ((r2 instanceof LinearLayout) == false) goto L11;
        LinearLayout r3 = (LinearLayout) r2;
        if (r3.getOrientation() != 1) goto L11;
        return r3;
    L11:
        if ((r2 instanceof ViewGroup) == false) goto L15;
        LinearLayout r22 = m1556M((ViewGroup) r2);
        if (r22 == null) goto L15;
        return r22;
    L15:
        r02 = r02 - 1;
        goto L4
    L16:
        return null;
    }

    /* JADX INFO: renamed from: N */
    public static long m1557N(View r4) {
        int r02 = Math.max(r4.getWidth(), r4.getMeasuredWidth());
        ViewGroup.LayoutParams r1 = r4.getLayoutParams();
        int r2 = 0;
        if (r1 == null) goto L5;
        int r12 = r1.width;
    L6:
        int r03 = Math.max(r02, r12);
        int r13 = Math.max(r4.getHeight(), r4.getMeasuredHeight());
        ViewGroup.LayoutParams r42 = r4.getLayoutParams();
        if (r42 == null) goto L9;
        r2 = r42.height;
    L9:
        int r43 = Math.max(r13, r2);
        if (r03 <= 0) goto L13;
        if (r43 <= 0) goto L13;
        return ((long) r03) * ((long) r43);
    L13:
        return 0;
    L5:
        r12 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: O */
    public static void m1558O(String r4, Method r5) {
        String r02 = r5.getDeclaringClass().getName();
        String r1 = r5.getName();
        String r2 = Arrays.toString(r5.getParameterTypes());
        AbstractC0307g.m702d(r2, "toString(...)");
        if (f1988v.add(r02 + "#" + r1 + r2) == true) goto L5;
        return;
    L5:
        r5.setAccessible(true);
        AbstractC0762d.m1952b(r5, new C0698u(r5, 2, false));
        m1601p0("hooked adapter bind via " + r4);
    }

    /* JADX INFO: renamed from: P */
    public static void m1559P(Class r6, String r7) {
        Constructor<?>[] r62 = r6.getDeclaredConstructors();
        AbstractC0307g.m702d(r62, "getDeclaredConstructors(...)");
        int r02 = r62.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        Constructor<?> r2 = r62[r1];
        String r3 = r2.getDeclaringClass().getName();
        String r4 = Arrays.toString(r2.getParameterTypes());
        AbstractC0307g.m702d(r4, "toString(...)");
        if (f1988v.add(r3 + "#<init>" + r4) == false) goto L7;
        AbstractC0762d.m1952b(r2, new C0665j(18, false));
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        m1601p0("hooked quote component constructors via " + r7);
    }

    /* JADX INFO: renamed from: Q */
    public static int m1560Q(ClassLoader r1, String r2) {
        Object r12 = Integer.valueOf(AbstractC0358S.m906r(r1, "com.tencent.mm.R$id").getField(r2).getInt(null));     // Catch: Throwable -> L4
    L7:
        if ((r12 instanceof C0140f) == false) goto L10;
        r12 = 0;
    L10:
        return ((Number) r12).intValue();
    L4:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L7
    }

    /* JADX INFO: renamed from: R */
    public static boolean m1561R(Object r9) {
        Object r02 = f1962B;
        if (r02 != null) goto L5;
        return false;
    L5:
        Iterator r92 = m1568Y(r02, r9).iterator();
    L7:
        if (r92.hasNext() == false) goto L26;
        C0630W r2 = (C0630W) r92.next();
        r2.f1941a.setAccessible(true);     // Catch: Throwable -> L13
        Method r4 = r2.f1941a;     // Catch: Throwable -> L13
        Object[] r5 = r2.f1942b;     // Catch: Throwable -> L13
        if (AbstractC0307g.m699a(r4.invoke(r02, Arrays.copyOf(r5, r5.length)), Boolean.FALSE) == false) goto L15;
        m1601p0("component quote returned false: " + r2.f1941a.getName() + "/" + r2.f1942b.length);     // Catch: Throwable -> L13
        boolean r22 = false;
    L16:
        Object r23 = Boolean.valueOf(r22);     // Catch: Throwable -> L13
    L19:
        Throwable r42 = AbstractC0141g.m465a(r23);
        if (r42 == null) goto L24;
        m1601p0("component quote failed: " + r42.getMessage());
        r23 = Boolean.FALSE;
    L24:
        if (((Boolean) r23).booleanValue() == false) goto L7;
        return true;
    L15:
        m1601p0("triggered quote via " + r02.getClass().getName() + "." + r2.f1941a.getName() + "/" + r2.f1942b.length);     // Catch: Throwable -> L13
        r22 = true;
    L13:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);
        goto L19
    L26:
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m1562S(Object r8) {
        Object r02 = f1961A;
        if (r02 != null) goto L5;
        return false;
    L5:
        Iterator r82 = m1568Y(r02, r8).iterator();
    L7:
        if (r82.hasNext() == false) goto L26;
        C0630W r2 = (C0630W) r82.next();
        r2.f1941a.setAccessible(true);     // Catch: Throwable -> L13
        Method r4 = r2.f1941a;     // Catch: Throwable -> L13
        Object[] r5 = r2.f1942b;     // Catch: Throwable -> L13
        if (AbstractC0307g.m699a(r4.invoke(r02, Arrays.copyOf(r5, r5.length)), Boolean.FALSE) == false) goto L15;
        m1601p0("ChatFooter quote returned false: " + r2.f1941a.getName() + "/" + r2.f1942b.length);     // Catch: Throwable -> L13
        boolean r22 = false;
    L16:
        Object r23 = Boolean.valueOf(r22);     // Catch: Throwable -> L13
    L19:
        Throwable r42 = AbstractC0141g.m465a(r23);
        if (r42 == null) goto L24;
        m1601p0("ChatFooter quote failed: " + r42.getMessage());
        r23 = Boolean.FALSE;
    L24:
        if (((Boolean) r23).booleanValue() == false) goto L7;
        return true;
    L15:
        m1601p0("triggered quote via ChatFooter." + r2.f1941a.getName() + "/" + r2.f1942b.length);     // Catch: Throwable -> L13
        r22 = true;
    L13:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);
        goto L19
    L26:
        return false;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m1563T(Object r6, Object r7, String r8) {
        if (r6 != null) goto L5;
        return false;
    L5:
        InterfaceC0405h r2 = new C0268i(new C0402e(new C0180k(2, m1588j(r6.getClass())), true, new C0606M(0, r7)), new C0692s(1));
        if ((r2 instanceof InterfaceC0399b) == false) goto L8;
        InterfaceC0405h r1 = ((InterfaceC0399b) r2).mo986a();
    L9:
        Iterator r12 = AbstractC0407j.m993A0(r1).iterator();
    L11:
        if (r12.hasNext() == false) goto L28;
        Method r22 = (Method) r12.next();
        r22.setAccessible(true);     // Catch: Throwable -> L16
        if (r22.getParameterTypes().length != 1) goto L18;
        Object[] r3 = {r7};     // Catch: Throwable -> L16
    L19:
        r22.invoke(r6, Arrays.copyOf(r3, r3.length));     // Catch: Throwable -> L16
        m1601p0("triggered repeat via " + r8 + "." + r22.getName());     // Catch: Throwable -> L16
        Object r23 = Boolean.TRUE;     // Catch: Throwable -> L16
    L22:
        Object r32 = Boolean.FALSE;
        if ((r23 instanceof C0140f) == false) goto L26;
        r23 = r32;
    L26:
        if (((Boolean) r23).booleanValue() == false) goto L11;
        return true;
    L18:
        r3 = new Object[]{r7, null};     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);
        goto L22
    L28:
        return false;
    L8:
        r1 = new C0412o(r2);
        goto L9
    }

    /* JADX INFO: renamed from: U */
    public static boolean m1564U(Method r2) {
        if (AbstractC0307g.m699a(r2.getReturnType(), Boolean.TYPE) == false) goto L5;
    L8:
        return true;
    L5:
        if (AbstractC0307g.m699a(r2.getReturnType(), Boolean.class) == true) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m1565V(String r3) {
        if (AbstractC0425j.m1005J0(r3, "conversation", true) == false) goto L6;
        return false;
    L6:
        if (AbstractC0425j.m1005J0(r3, "ConversationListView", false) == false) goto L9;
        return false;
    L9:
        if (AbstractC0425j.m1005J0(r3, "chatting", true) == false) goto L11;
        return true;
    L11:
        if (AbstractC0425j.m1005J0(r3, "Chatting", false) == false) goto L13;
        return true;
    L13:
        if (AbstractC0425j.m1005J0(r3, "MxRecyclerView", false) == false) goto L15;
        return true;
    L15:
        if (AbstractC0425j.m1005J0(r3, "RecyclerView", false) == false) goto L20;
        if (AbstractC0425j.m1005J0(r3, "mm.ui", true) == false) goto L20;
        return true;
    L20:
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static void m1566W(Context r7, String r8) {
        AtomicBoolean r1 = f1969c;
        if (r1.get() == false) goto L58;
        return;
    L58:
        System.loadLibrary("dexkit");     // Catch: Throwable -> L7
        Object r2 = C0146l.f339a;     // Catch: Throwable -> L7
    L10:
        if ((!(r2 instanceof C0140f)) == false) goto L13;
        C0146l r22 = (C0146l) r2;
        r1.set(true);
        m1601p0("DexKit native loaded via library path");
        return;
    L13:
        if (r8 == null) goto L53;
        if (Process.is64Bit() == false) goto L19;
        String[] r23 = Build.SUPPORTED_64_BIT_ABIS;
        AbstractC0307g.m702d(r23, "SUPPORTED_64_BIT_ABIS");
        String r24 = (String) AbstractC0179j.m536m0(r23);
        if (r24 != null) goto L22;
        r24 = "arm64-v8a";
    L22:
        File r3 = new File(r7.getCacheDir(), AbstractC0324d.m723f("abc_chat_", r24, "_libdexkit.so"));
        ZipFile r72 = new ZipFile(r8);
        ZipEntry r82 = r72.getEntry("lib/" + r24 + "/libdexkit.so");     // Catch: Throwable -> L33
        if (r82 == null) goto L47;
        InputStream r83 = r72.getInputStream(r82);     // Catch: Throwable -> L33
        FileOutputStream r02 = new FileOutputStream(r3);     // Catch: Throwable -> L35
        AbstractC0307g.m700b(r83);     // Catch: Throwable -> L37
        AbstractC0040p.m115t(r83, r02, 8192);     // Catch: Throwable -> L37
    L29:
        AbstractC0040p.m108m(r02, null);     // Catch: Throwable -> L35
        AbstractC0040p.m108m(r83, null);     // Catch: Throwable -> L33
        AbstractC0040p.m108m(r72, null);
        System.load(r3.getAbsolutePath());
        r1.set(true);
        m1601p0("DexKit native loaded from module apk");
        return;
    L37:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        AbstractC0040p.m108m(r02, th);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        AbstractC0040p.m108m(r83, th);     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L47:
        throw new IllegalStateException("lib/" + r24 + "/libdexkit.so not found in module apk");     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        AbstractC0040p.m108m(r72, th);
        throw th;
    L19:
        String[] r25 = Build.SUPPORTED_32_BIT_ABIS;
        AbstractC0307g.m702d(r25, "SUPPORTED_32_BIT_ABIS");
        r24 = (String) AbstractC0179j.m536m0(r25);
        if (r24 != null) goto L22;
        r24 = "armeabi-v7a";
        goto L22
    L53:
        throw new IllegalStateException("module path unavailable for libdexkit.so");
    L7:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L10
    }

    /* JADX INFO: renamed from: X */
    public static void m1567X(LinearLayout r16, View r17, String r18, long r19, boolean r21, C0625T0 r22) {
        Context r2 = r16.getContext();
        int r3 = r16.indexOfChild(r17);
        if (r3 >= 0) goto L6;
        m1582g(r16, r18, r19, r21, r22);
        return;
    L6:
        TextView r6 = m1549E(r16);
        int r7 = -1;
        if (r6 == null) goto L9;
        int r8 = r16.indexOfChild(r6);
    L10:
        int r9 = r16.getChildCount();
        int r10 = 0;
        if (r3 >= 0) goto L14;
        if (r9 >= 0) goto L16;
    L13:
        r7 = r10;
    L25:
        float r82 = r22.f1928d;
        LinearLayout.LayoutParams r11 = null;
        int r12 = 8388611;
        if (r6 == null) goto L46;
        if (r7 < 0) goto L46;
        r16.removeView(r6);
        int r32 = r16.indexOfChild(r17);
        if (r32 < 0) goto L31;
        int r33 = Math.min(r16.getChildCount(), r32 + 1);
    L32:
        ViewGroup.LayoutParams r72 = r6.getLayoutParams();
        if ((r72 instanceof LinearLayout.LayoutParams) == false) goto L35;
        r11 = (LinearLayout.LayoutParams) r72;
    L35:
        if (r11 != null) goto L37;
        r11 = new LinearLayout.LayoutParams(-2, -2);
    L37:
        r11.width = -2;
        AbstractC0307g.m700b(r2);
        r11.topMargin = m1607u(r2, 4);
        if (r21 == false) goto L40;
        int r73 = 8388613;
    L41:
        r11.gravity = r73;
        r11.leftMargin = m1607u(r2, r22.m1527b(r21));
        r11.rightMargin = m1607u(r2, r22.m1526a(r21));
        r6.setText(r18);
        r6.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(r19));
        if (r21 == false) goto L44;
        r12 = 8388613;
    L44:
        r6.setGravity(r12);
        r6.setTextSize(r82);
        m1592l(r6, r22);
        m1590k(r6, r22);
        r16.addView(r6, r33, r11);
        return;
    L40:
        r73 = 8388611;
        goto L41
    L31:
        r33 = r16.getChildCount();
    L46:
        if (r6 == null) goto L60;
        r6.setText(r18);
        r6.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(r19));
        if (r21 == false) goto L50;
        int r02 = 8388613;
    L51:
        r6.setGravity(r02);
        r6.setTextSize(r82);
        m1592l(r6, r22);
        m1590k(r6, r22);
        ViewGroup.LayoutParams r03 = r6.getLayoutParams();
        if ((r03 instanceof LinearLayout.LayoutParams) == false) goto L54;
        r11 = (LinearLayout.LayoutParams) r03;
    L54:
        if (r11 == null) goto L65;
        r11.width = -2;
        if (r21 == false) goto L58;
        r12 = 8388613;
    L58:
        r11.gravity = r12;
        AbstractC0307g.m700b(r2);
        r11.leftMargin = m1607u(r2, r22.m1527b(r21));
        r11.rightMargin = m1607u(r2, r22.m1526a(r21));
        return;
    L65:
        return;
    L50:
        r02 = 8388611;
        goto L51
    L60:
        AbstractC0307g.m700b(r2);
        View r1 = m1604r(r2, r18, r19, r22);
        LinearLayout.LayoutParams r62 = new LinearLayout.LayoutParams(-2, -2);
        r62.topMargin = m1607u(r2, 4);
        if (r21 == false) goto L63;
        r12 = 8388613;
    L63:
        r62.gravity = r12;
        r62.leftMargin = m1607u(r2, r22.m1527b(r21));
        r62.rightMargin = m1607u(r2, r22.m1526a(r21));
        r16.addView(r1, Math.min(r16.getChildCount(), r3 + 1), r62);
        return;
    L16:
        r7 = r9;
        goto L25
    L14:
        r9 = AbstractC0040p.m111p(r3 + 1, 0, r9);
        if (r8 < 0) goto L16;
        if (r8 == r9) goto L25;
        r10 = r9 - 1;
        if (r8 != r10) goto L23;
        if (r8 > r3) goto L25;
    L23:
        if (r8 >= r9) goto L16;
    L9:
        r8 = -1;
        goto L10
    }

    /* JADX INFO: renamed from: Y */
    public static List m1568Y(Object r3, Object r4) {
        return AbstractC0407j.m993A0(new C0403f(new C0268i(new C0402e(new C0180k(2, m1588j(r3.getClass())), true, new C0606M(1, r4)), new C0695t(3, new C0695t(2, new C0692s(2)))), new C0606M(2, r4)));
    }

    /* JADX INFO: renamed from: Z */
    public static Integer m1569Z(Object r2, String r3) {
        Method r32 = m1603q0(r2.getClass(), r3);     // Catch: Throwable -> L8
        if (r32 == null) goto L14;
        Object r33 = r32.invoke(r2, null);     // Catch: Throwable -> L8
        if ((r33 instanceof Number) == false) goto L10;
        Number r34 = (Number) r33;     // Catch: Throwable -> L8
    L11:
        if (r34 == null) goto L14;
        Object r35 = Integer.valueOf(r34.intValue());     // Catch: Throwable -> L8
    L17:
        if ((r35 instanceof C0140f) == false) goto L19;
        r35 = null;
    L19:
        Integer r36 = (Integer) r35;
        if (r36 == null) goto L22;
        return r36;
    L22:
        Object r22 = m1611y(r2, "field_isSend");
        if ((r22 instanceof Number) == false) goto L25;
        Number r23 = (Number) r22;
    L26:
        if (r23 != null) goto L28;
        return null;
    L28:
        return Integer.valueOf(r23.intValue());
    L25:
        r23 = null;
        goto L26
    L10:
        r34 = null;
    L14:
        r35 = null;
    L8:
        th = move-exception;
        r35 = AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX INFO: renamed from: a */
    public static final void m1570a(View r3) {
        m1600p(r3);
        m1598o(r3);
        ViewParent r02 = r3.getParent();
        int r1 = 0;
    L4:
        if ((r02 instanceof ViewGroup) == false) goto L10;
        if (r1 >= 8) goto L10;
        View r2 = (View) r02;
        m1600p(r2);
        m1598o(r2);
        if (m1565V(r02.getClass().getName()) == true) goto L10;
        r02 = ((ViewGroup) r02).getParent();
        r1 = r1 + 1;
    L10:
        r3.post(new RunnableC0129u(r3, 1));
        r3.postDelayed(new RunnableC0129u(r3, 2), 120);
    }

    /* JADX INFO: renamed from: a0 */
    public static Integer m1571a0(Object r4) {
        Object r1 = m1611y(r4, "field_type");
        Object r3 = null;
        if ((r1 instanceof Number) == false) goto L5;
        Number r12 = (Number) r1;
    L6:
        if (r12 == null) goto L8;
        Integer r13 = Integer.valueOf(r12.intValue());
    L9:
        if (r13 == null) goto L30;
        return r13;
    L30:
        Method r02 = m1603q0(r4.getClass(), "getType");     // Catch: Throwable -> L16
        if (r02 == null) goto L22;
        Object r42 = r02.invoke(r4, null);     // Catch: Throwable -> L16
        if ((r42 instanceof Number) == false) goto L18;
        Number r43 = (Number) r42;     // Catch: Throwable -> L16
    L19:
        if (r43 == null) goto L22;
        Object r44 = Integer.valueOf(r43.intValue());     // Catch: Throwable -> L16
    L25:
        if ((r44 instanceof C0140f) == true) goto L29;
        r3 = r44;
    L29:
        return (Integer) r3;
    L18:
        r43 = null;
    L22:
        r44 = null;
    L16:
        th = move-exception;
        r44 = AbstractC0040p.m116u(th);
        goto L25
    L8:
        r13 = null;
        goto L9
    L5:
        r12 = null;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public static final void m1572b(Object r45, Object r46, int r47, ClassLoader r48) {
        String r10 = "static";
        if (f1971e.compareAndSet(false, true) == false) goto L8;
        if (r45 == null) goto L6;
        String r9 = r45.getClass().getName();
    L7:
        m1601p0("adapter bind entered: adapter=" + r9 + " holder=" + r46.getClass().getName());
        goto L8
    L6:
        r9 = "static";
    L8:
        View r92 = m1553I(r46);
        if (r92 == null) goto L11;
        Object r11 = AbstractC0637Z0.m1537c(r47, r45);
        if (r11 == null) goto L16;
        r92.setTag(C1031R.id.abc_tag_message_object, r11);
        r92.setTag(C1031R.id.abc_tag_message_holder, r46);
        if (r45 == null) goto L23;
        r92.setTag(C1031R.id.abc_tag_message_adapter, r45);
    L23:
        Integer r02 = m1571a0(r11);
        if (r02 == null) goto L26;
        int r03 = r02.intValue();
    L27:
        int r12 = r03 & 65535;
        if (r12 == 43) goto L33;
        if (r12 == 62) goto L33;
        r92.setTranslationX(0.0f);
    L39:
        C0146l r2 = C0146l.f339a;
        Long r4 = m1575c0(r11, "getCreateTime", "field_createTime");
        if (r4 != null) goto L45;
        if (f1976j.compareAndSet(false, true) == false) goto L534;
        m1601p0("enhance abort: createTime null, msg=".concat(r11.getClass().getName()));
        return;
    L534:
        return;
    L45:
        if (r4.longValue() <= 0) goto L543;
        Long r04 = m1575c0(r11, "getMsgId", "field_msgId");
        if (r04 == null) goto L50;
        long r5 = r04.longValue();
    L51:
        Long r05 = m1575c0(r11, "getMsgSvrId", "field_msgSvrId");
        if (r05 == null) goto L54;
        long r28 = r05.longValue();
    L55:
        Long r06 = m1575c0(r11, "getNewMsgId", "field_newMsgId");
        if (r06 == null) goto L58;
        long r30 = r06.longValue();
    L59:
        boolean r7 = m1573b0(r11);
        Integer r07 = m1571a0(r11);
        if (r07 == null) goto L62;
        int r102 = r07.intValue();
    L63:
        String r08 = m1577d0(r11);
        if (r08 != null) goto L66;
        String r15 = "";
    L475:
        AbstractC0610N0.m1502g(r46, r92, r11);     // Catch: Throwable -> L69
        Object r09 = r2;
    L71:
        Throwable r010 = AbstractC0141g.m465a(r09);
        if (r010 == null) goto L76;
        String r32 = "";
        if (f1972f.compareAndSet(false, true) == false) goto L469;
        m1601p0("MemberTitle err: " + r010.getClass().getSimpleName() + ": " + r010.getMessage());
    L469:
        C0688q1.f2163a.m1784k(r46, r92, r11);     // Catch: Throwable -> L79
        Object r22 = r2;
    L81:
        Throwable r011 = AbstractC0141g.m465a(r22);
        if (r011 != null) goto L84;
    L86:
        StringBuilder r012 = new StringBuilder();
        m1602q(r012, r92);
        String r013 = r012.toString();
        AbstractC0307g.m702d(r013, "toString(...)");
        Object r3 = r92.getTag(C1031R.id.abc_tag_enhanced_msg_id);
        if ((r3 instanceof Long) == false) goto L89;
        Long r33 = (Long) r3;
    L90:
        Object r122 = r92.getTag(C1031R.id.abc_tag_enhanced_is_send);
        if ((r122 instanceof Boolean) == false) goto L93;
        Boolean r123 = (Boolean) r122;
    L94:
        if (r33 != null) goto L97;
    L100:
        m1583g0(r92);
        r92.setTag(C1031R.id.abc_tag_enhanced_msg_id, Long.valueOf(r5));
        r92.setTag(C1031R.id.abc_tag_enhanced_is_send, Boolean.valueOf(r7));
    L101:
        ConcurrentHashMap r23 = C0572A1.f1693a;
        long r1 = r28;
        long r72 = r30;
        long[] r34 = {r5, r1, r72};
        String r25 = r15;
        C0572A1.f1693a.entrySet().removeIf(new C0715z1(new C0712y1(System.currentTimeMillis())));
        int r014 = 0;
    L103:
        if (r014 >= 3) goto L113;
        long r124 = r34[r014];
        if (r124 <= 0) goto L111;
        if (C0572A1.f1693a.containsKey(Long.valueOf(r124)) == false) goto L111;
        m1581f0(r92);
        if (f1981o.compareAndSet(false, true) == false) goto L536;
        m1601p0("self recalled message detail time skipped msgId=" + r5 + " msgSvrId=" + r1 + " newMsgId=" + r72);
        return;
    L536:
        return;
    L111:
        r014 = r014 + 1;
        goto L103
    L113:
        if (f1975i.compareAndSet(false, true) == false) goto L116;
        String r015 = r11.getClass().getName();
        StringBuilder r35 = new StringBuilder("enhance entered msg=");
        r35.append(r015);
        r35.append(" type=");
        r35.append(r102);
        r35.append(" isSend=");
        boolean r73 = r7;
        r35.append(r73);
        r35.append(" createTime=");
        r35.append(r4);
        m1601p0(r35.toString());
    L118:
        if (AbstractC0358S.m897m0(r102, r25, r013) == false) goto L120;
        View r016 = m1547C(r92, r48);
        if (r016 == null) goto L139;
        C0422g r13 = AbstractC0600K.f1833a;
        if (r102 != 49) goto L129;
    L127:
        int r132 = 49;
    L132:
        if (r132 != 49) goto L134;
        boolean r133 = true;
    L135:
        if (r133 == true) goto L137;
    L140:
        View r134 = r016;
    L141:
        if (r134 != null) goto L143;
        View r017 = m1550F(r92, r48);
    L144:
        if (r134 != null) goto L146;
        View r14 = r017;
    L147:
        if (r14 == null) goto L162;
        m1591k0(r92, r11, r48);
        m1609w(r92, r92);
        m1609w(r14, r92);
        if (r134 == null) goto L160;
        C0634Y r36 = m1555L(r134);
        if (r36 == null) goto L158;
        LinearLayout r142 = r36.f1949a;
        int r152 = C1031R.id.abc_tag_message_object;
        r142.setTag(C1031R.id.abc_tag_message_object, r11);
        m1609w(r142, r92);
        View r37 = r36.f1950b;
        r37.setTag(C1031R.id.abc_tag_message_object, r11);
        m1609w(r37, r92);
        if ((r37 instanceof ViewGroup) == false) goto L158;
        ViewGroup r38 = (ViewGroup) r37;
        int r143 = r38.getChildCount();
        int r8 = 0;
    L156:
        if (r8 >= r143) goto L158;
        int r482 = r143;
        View r144 = r38.getChildAt(r8);
        r144.setTag(r152, r11);
        m1609w(r144, r92);
        r8 = r8 + 1;
        r143 = r482;
        r152 = C1031R.id.abc_tag_message_object;
    L158:
        m1610x(r134, r92, r11);
        m1593l0(r92, r134, r11);
        m1579e0(r134, r73, r102, r25, r5, true);
        m1584h(r134, r73);
    L164:
        if (r102 != 43) goto L166;
        return;
    L166:
        if (r102 == 62) goto L540;
        int r112 = 65535 & r102;
        if (r112 == 43) goto L541;
        if (r112 == 62) goto L544;
        C0625T0 r39 = AbstractC0623S0.f1922b;
        long r145 = System.currentTimeMillis();
        if ((r145 - AbstractC0623S0.f1921a) >= 5000) goto L174;
        C0625T0 r310 = AbstractC0623S0.f1922b;
        String r82 = r32;
    L192:
        long r146 = r4.longValue();
        ZoneId r42 = ZoneId.systemDefault();
        long r21 = System.currentTimeMillis();
        AbstractC0307g.m703e(r310, "options");
        AbstractC0307g.m703e(r42, "zoneId");
        if (r310.f1925a == true) goto L196;
        View r17 = r017;
        C0625T0 r302 = r310;
        boolean r29 = r73;
        View r16 = r92;
        int r483 = r112;
    L250:
        if (AbstractC0425j.m1013R0(r82) == true) goto L260;
        if (r134 != null) goto L253;
        C0625T0 r311 = r302;
        if (r17 == null) goto L266;
        m1576d(r17, r82, r5, r29, r311);
        if (r311.f1935k == false) goto L260;
        m1608v(r17, r311);
        goto L260
    L266:
        View r18 = r16;
        if ((r18 instanceof ViewGroup) == true) goto L269;
    L268:
        View r472 = r134;
    L459:
        if (r311.f1935k == false) goto L463;
        m1608v(r18, r311);
    L463:
        if (f1970d.compareAndSet(false, true) == false) goto L542;
        if (r472 == null) goto L466;
        boolean r6 = true;
    L467:
        m1601p0("first message row enhanced: isSend=" + r29 + " hasBubble=" + r6);
        return;
    L466:
        r6 = false;
        goto L467
    L542:
        return;
    L269:
        C0422g r018 = AbstractC0600K.f1833a;
        if (r102 != 49) goto L273;
        int r24 = r483;
    L272:
        r102 = 49;
    L276:
        if (r102 != 49) goto L278;
        boolean r019 = true;
    L279:
        if (r019 == false) goto L374;
        ArrayList r43 = new ArrayList();
        Iterator r74 = m1586i(r46.getClass()).iterator();
    L282:
        if (r74.hasNext() == false) goto L345;
        Field r020 = (Field) r74.next();
        if (View.class.isAssignableFrom(r020.getType()) == false) goto L282;
        String r93 = r020.getName();
        AbstractC0307g.m702d(r93, "getName(...)");
        String r94 = r93.toLowerCase(Locale.ROOT);
        AbstractC0307g.m702d(r94, "toLowerCase(...)");
        if (r94.equals("timetv") == true) goto L282;
        if (r94.equals("avatariv") == true) goto L282;
        if (r94.equals("usertv") == true) goto L282;
        if (AbstractC0425j.m1005J0(r94, "time", false) == true) goto L282;
        if (AbstractC0425j.m1005J0(r94, "avatar", false) == true) goto L282;
        if (AbstractC0425j.m1005J0(r94, "history", false) == true) goto L282;
        if (AbstractC0425j.m1005J0(r94, "nomore", false) == true) goto L282;
        if (AbstractC0425j.m1005J0(r94, "mask", false) == true) goto L282;
        if (AbstractC0425j.m1005J0(r94, "checkbox", false) == true) goto L282;
        if (AbstractC0425j.m1005J0(r94, "check", false) == true) goto L282;
        r020.setAccessible(true);     // Catch: Throwable -> L316
        Object r021 = r020.get(r46);     // Catch: Throwable -> L313
        if ((r021 instanceof View) == false) goto L315;
        Object r022 = (View) r021;     // Catch: Throwable -> L313
    L320:
        if ((r022 instanceof C0140f) == false) goto L322;
        r022 = null;
    L322:
        View r023 = (View) r022;
        if (r023 == null) goto L282;
        if (r023.isShown() == false) goto L282;
        if (AbstractC0307g.m699a(r023.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == true) goto L282;
        Object r113 = r023;
        int r103 = 0;
    L332:
        if ((r113 instanceof View) == false) goto L282;
        if (r103 >= 16) goto L282;
        if (r113 == r18) goto L336;
        r113 = ((View) r113).getParent();
        r103 = r103 + 1;
        goto L332
    L336:
        ViewParent r104 = r023.getParent();
        if ((r104 instanceof LinearLayout) == true) goto L341;
        if ((r104 instanceof RelativeLayout) == false) goto L282;
    L341:
        if (m1557N(r023) <= 0) goto L282;
        r43.add(r023);
        goto L282
    L315:
        r022 = null;
    L313:
        th = th;
    L318:
        r022 = AbstractC0040p.m116u(th);
    L316:
        th = th;
        goto L318
    L345:
        Iterator r024 = r43.iterator();
        if (r024.hasNext() == true) goto L348;
        Object r44 = null;
    L357:
        View r222 = (View) r44;
        if (r222 == null) goto L374;
        ViewParent r025 = r222.getParent();
        if ((r025 instanceof ViewGroup) == false) goto L363;
        ViewGroup r026 = (ViewGroup) r025;
    L364:
        if (r026 == null) goto L374;
        if ((r026 instanceof LinearLayout) == false) goto L372;
        LinearLayout r212 = (LinearLayout) r026;
        if (r212.getOrientation() != 1) goto L374;
        m1567X(r212, r222, r82, r5, r29, r311);
        goto L268
    L372:
        if ((r026 instanceof RelativeLayout) == false) goto L374;
        m1578e((RelativeLayout) r026, r222, r82, r5, r29, r311);
        goto L268
    L363:
        r026 = null;
        goto L364
    L348:
        r44 = r024.next();
        if (r024.hasNext() == false) goto L357;
        long r95 = m1557N((View) r44);
    L352:
        Object r75 = r024.next();
        long r114 = m1557N((View) r75);
        if (r95 >= r114) goto L356;
        r44 = r75;
        r95 = r114;
    L356:
        if (r024.hasNext() == true) goto L352;
    L374:
        ViewGroup r96 = (ViewGroup) r18;
        ClassLoader r027 = r96.getContext().getClassLoader();
        AbstractC0307g.m702d(r027, "getClassLoader(...)");
        View r213 = m1550F(r18, r027);
        if (r213 == null) goto L378;
        m1576d(r213, r82, r5, r29, r311);
        goto L268
    L378:
        if (AbstractC0040p.m92W(new Integer[]{3, 43, 48, 62, 47}).contains(Integer.valueOf(r24)) == true) goto L380;
        r472 = r134;
        View r214 = null;
    L425:
        if (r214 == null) goto L427;
        m1576d(r214, r82, r5, r29, r311);
        goto L459
    L427:
        int r028 = r96.getChildCount() - 1;
    L428:
        if ((-1) >= r028) goto L436;
        View r49 = r96.getChildAt(r028);
        if ((r49 instanceof ViewGroup) == false) goto L435;
        ViewGroup r410 = (ViewGroup) r49;
        if (r410.getChildCount() < 2) goto L435;
    L437:
        if (r410 == null) goto L459;
        if ((r410 instanceof LinearLayout) == true) goto L442;
    L447:
        int r26 = 1;
        int r029 = r410.getChildCount() - 1;
        int r76 = -1;
    L448:
        if (r76 >= r029) goto L459;
        View r77 = r410.getChildAt(r029);
        if ((r77 instanceof LinearLayout) == false) goto L457;
        if (((LinearLayout) r77).getOrientation() != r26) goto L457;
        ViewGroup r030 = (ViewGroup) r77;
        View r215 = m1548D(r030, r18);
        if (r215 == null) goto L456;
        m1576d(r215, r82, r5, r29, r311);
        goto L459
    L456:
        m1582g(r030, r82, r5, r29, r311);
    L457:
        r76 = -1;
        r029 = r029 - 1;
        r26 = 1;
        goto L448
    L442:
        if (((LinearLayout) r410).getOrientation() != 1) goto L447;
        View r216 = m1548D(r410, r18);
        if (r216 == null) goto L446;
        m1576d(r216, r82, r5, r29, r311);
        goto L459
    L446:
        m1582g(r410, r82, r5, r29, r311);
    L435:
        r028 = r028 - 1;
        goto L428
    L436:
        r410 = null;
        goto L437
    L380:
        ArrayList r031 = new ArrayList();
        m1554J(r96, r031);
        Context r27 = r96.getContext();
        AbstractC0307g.m702d(r27, "getContext(...)");
        int r210 = m1607u(r27, 64);
        ArrayList r411 = new ArrayList();
        Iterator r032 = r031.iterator();
    L382:
        if (r032.hasNext() == false) goto L396;
        Object r78 = r032.next();
        View r105 = (View) r78;
        int r115 = r105.getWidth();
        ViewGroup.LayoutParams r125 = r105.getLayoutParams();
        if (r125 == null) goto L386;
        int r126 = r125.width;
    L388:
        if (Math.max(r115, r126) < r210) goto L382;
        int r116 = r105.getHeight();
        ViewGroup.LayoutParams r106 = r105.getLayoutParams();
        if (r106 == null) goto L392;
        int r107 = r106.height;
    L394:
        if (Math.max(r116, r107) < r210) goto L382;
        r411.add(r78);
        goto L382
    L392:
        r107 = 0;
        goto L394
    L386:
        r126 = 0;
        goto L388
    L396:
        Iterator r033 = r411.iterator();
        if (r033.hasNext() == true) goto L399;
        r472 = r134;
        Object r211 = null;
    L424:
        r214 = (View) r211;
        goto L425
    L399:
        r211 = r033.next();
        if (r033.hasNext() == true) goto L402;
        r472 = r134;
        goto L424
    L402:
        View r412 = (View) r211;
        int r79 = r412.getWidth();
        ViewGroup.LayoutParams r108 = r412.getLayoutParams();
        if (r108 == null) goto L405;
        int r109 = r108.width;
    L406:
        long r1010 = Math.max(r79, r109);
        int r710 = r412.getHeight();
        ViewGroup.LayoutParams r413 = r412.getLayoutParams();
        if (r413 == null) goto L409;
        int r414 = r413.height;
    L410:
        long r1011 = r1010 * ((long) Math.max(r710, r414));
    L411:
        Object r415 = r033.next();
        View r711 = (View) r415;
        int r127 = r711.getWidth();
        ViewGroup.LayoutParams r147 = r711.getLayoutParams();
        if (r147 == null) goto L414;
        int r148 = r147.width;
    L415:
        long r149 = Math.max(r127, r148);
        int r128 = r711.getHeight();
        ViewGroup.LayoutParams r712 = r711.getLayoutParams();
        if (r712 == null) goto L418;
        int r713 = r712.height;
    L419:
        r472 = r134;
        long r1410 = r149 * ((long) Math.max(r128, r713));
        if (r1011 >= r1410) goto L423;
        r211 = r415;
        r1011 = r1410;
    L423:
        if (r033.hasNext() == false) goto L424;
        r134 = r472;
        goto L411
    L418:
        r713 = 0;
        goto L419
    L414:
        r148 = 0;
        goto L415
    L409:
        r414 = 0;
        goto L410
    L405:
        r109 = 0;
        goto L406
    L278:
        r019 = false;
        goto L279
    L273:
        r24 = r483;
        if (r24 != 49) goto L276;
    L253:
        if (AbstractC0425j.m1013R0(r82) == true) goto L259;
        C0634Y r034 = m1555L(r134);
        if (r034 == null) goto L259;
        m1567X(r034.f1949a, r034.f1950b, r82, r5, r29, r302);
    L259:
        m1608v(r134, r302);
    L260:
        r472 = r134;
        goto L463
    L196:
        if (1 <= r146) goto L198;
    L200:
        ZonedDateTime r416 = Instant.ofEpochMilli(r146).atZone(r42);
        AbstractC0307g.m700b(r416);
        r483 = r112;
        switch(r416.getDayOfWeek().getValue()) {
            case 1: goto L209;
            case 2: goto L208;
            case 3: goto L207;
            case 4: goto L206;
            case 5: goto L205;
            case 6: goto L204;
            default: goto L202;
        };
    L202:
        String r129 = "周日";
    L203:
        r16 = r92;
    L210:
        String r97 = r310.f1927c;
        r17 = r017;
        r29 = r73;
        if (AbstractC0425j.m1005J0(r97, "周", false) == false) goto L213;
        r97 = AbstractC0433r.m1031F0(r97, "周一", AbstractC0324d.m723f("'", r129, "'"), false);
    L213:
        String r035 = r416.format(DateTimeFormatter.ofPattern(r97));
        AbstractC0307g.m702d(r035, "format(...)");
        String r036 = AbstractC0433r.m1031F0(r310.f1926b, "${time}", r035, false);
        ZoneId r714 = ZoneId.systemDefault();
        ZonedDateTime r98 = Instant.ofEpochMilli(r146).atZone(r714);
        ZonedDateTime r715 = Instant.ofEpochMilli(r21).atZone(r714);
        long r217 = r21 - r146;
        String r1210 = "刚刚";
        if (r217 >= 0) goto L217;
    L215:
        r302 = r310;
        String r322 = r82;
    L248:
        r82 = AbstractC0425j.m1022a1(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(AbstractC0433r.m1031F0(r036, "${relativeTime}", r1210, false), "${type}", String.valueOf(r102), false), "${msgId}", String.valueOf(r5), false), "${msgSvrId}", String.valueOf(r1), false), "${atUserList}", r322, false)).toString();
        goto L250
    L217:
        if (r217 < 60000) goto L215;
        long r117 = r217 / 60000;
        if (r117 >= 60) goto L222;
        r1210 = r117 + "分钟前";
        goto L215
    L222:
        r302 = r310;
        r322 = r82;
        long r716 = ChronoUnit.DAYS.between(r98.toLocalDate(), r715.toLocalDate());
        if (r716 != 0) goto L230;
        long r312 = r117 / 60;
        if (r312 >= 1) goto L228;
        String r313 = r117 + "分钟前";
    L227:
        r1210 = r313;
        goto L248
    L228:
        r313 = r312 + "小时前";
        goto L227
    L230:
        if (r716 != 1) goto L233;
        String r314 = r98.format(DateTimeFormatter.ofPattern("HH:mm"));
        AbstractC0307g.m702d(r314, "format(...)");
        r1210 = "昨天 ".concat(r314);
        goto L248
    L233:
        if (r716 != 2) goto L236;
        String r315 = r98.format(DateTimeFormatter.ofPattern("HH:mm"));
        AbstractC0307g.m702d(r315, "format(...)");
        r1210 = "前天 ".concat(r315);
        goto L248
    L236:
        if (r716 >= 30) goto L239;
        r1210 = r716 + "天前";
        goto L248
    L239:
        if (r716 >= 365) goto L244;
        long r717 = r716 / 30;
        if (r717 > 1) goto L243;
        r313 = "1个月前";
        goto L227
    L243:
        r313 = r717 + "个月前";
        goto L227
    L244:
        long r718 = r716 / 365;
        if (r718 > 1) goto L247;
        r313 = "1年前";
        goto L227
    L247:
        r313 = r718 + "年前";
        goto L227
    L204:
        r129 = "周六";
        goto L203
    L205:
        r129 = "周五";
        goto L203
    L206:
        r129 = "周四";
        goto L203
    L207:
        r129 = "周三";
        goto L203
    L208:
        r129 = "周二";
        goto L203
    L209:
        r16 = r92;
        r129 = "周一";
        goto L210
    L198:
        if (r146 >= 10000000000L) goto L200;
        r146 = r146 * 1000;
        goto L200
    L174:
        AbstractC0623S0.f1921a = r145;
        C0661h1 r316 = C0661h1.f2048a;
        Integer r317 = AbstractC0432q.m1026A0(C0661h1.m1662d("detail_horizontal_margin", "0"));
        if (r317 == null) goto L177;
        int r382 = r317.intValue();
    L178:
        Integer r318 = AbstractC0432q.m1026A0(C0661h1.m1662d("detail_left_margin", String.valueOf(r382)));
        if (r318 == null) goto L181;
        int r392 = r318.intValue();
    L182:
        Integer r319 = AbstractC0432q.m1026A0(C0661h1.m1662d("detail_right_margin", String.valueOf(r382)));
        if (r319 == null) goto L185;
        int r40 = r319.intValue();
    L186:
        r82 = r32;
        int r422 = AbstractC0358S.m873Y(C0661h1.m1662d("detail_text_color_light", r82), AbstractC0358S.m873Y(C0661h1.m1662d("detail_text_color", "#E6000000"), -436207616));
        int r432 = AbstractC0358S.m873Y(C0661h1.m1662d("detail_text_color_dark", r82), AbstractC0358S.m873Y(C0661h1.m1662d("detail_text_color", "#CCFFFFFF"), -855638017));
        boolean r342 = C0661h1.m1661c("detail_enabled", true);
        String r352 = C0661h1.m1662d("detail_template", "${time} ${relativeTime}");
        String r362 = C0661h1.m1662d("detail_time_pattern", "MM-dd HH:mm:ss");
        Float r1211 = AbstractC0431p.m1025z0(C0661h1.m1662d("detail_text_size", "12"));
        if (r1211 == null) goto L190;
        float r1212 = r1211.floatValue();
    L191:
        AbstractC0623S0.f1922b = new C0625T0(r342, r352, r362, r1212, r382, r392, r40, r422, r422, r432, C0661h1.m1661c("detail_click_show", false));
        r310 = AbstractC0623S0.f1922b;
        goto L192
    L190:
        r1212 = 12.0f;
        goto L191
    L185:
        r40 = r382;
        goto L186
    L181:
        r392 = r382;
        goto L182
    L177:
        r382 = 0;
        goto L178
    L544:
        return;
    L541:
        return;
    L540:
        return;
    L160:
        m1610x(r14, r92, r11);
        m1593l0(r92, r14, r11);
        r14.setTag(C1031R.id.abc_tag_message_object, r11);
        r14.setTag(C1031R.id.abc_tag_swipe_target_row, r92);
        goto L164
    L162:
        if (f1980n.compareAndSet(false, true) == false) goto L164;
        m1601p0("bubble not found for non-text message type=" + r102);
        goto L164
    L146:
        r14 = r134;
        goto L147
    L143:
        r017 = null;
        goto L144
    L137:
        if (AbstractC0600K.m1486a(r25, r102) == false) goto L139;
    L134:
        r133 = false;
        goto L135
    L129:
        if ((r102 & 65535) == 49) goto L127;
        r132 = r102;
    L139:
        r134 = null;
        goto L141
    L120:
        if (f1977k.compareAndSet(false, true) == false) goto L122;
        m1601p0("enhance abort: time policy reject type=" + r102 + " content=" + AbstractC0425j.m1021Z0(r25, 80));
    L122:
        m1600p(r92);
        m1598o(r92);
        m1581f0(r92);
        return;
    L116:
        r73 = r7;
        goto L118
    L97:
        if (r33.longValue() != r5) goto L100;
        if (AbstractC0307g.m699a(r123, Boolean.valueOf(r7)) == true) goto L101;
    L93:
        r123 = null;
        goto L94
    L89:
        r33 = null;
        goto L90
    L84:
        if (f1973g.compareAndSet(false, true) == false) goto L86;
        m1601p0("RealNameTail err: " + r011.getClass().getSimpleName() + ": " + r011.getMessage());
    L79:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L81
    L76:
        r32 = "";
    L69:
        th = move-exception;
        r09 = AbstractC0040p.m116u(th);
        goto L71
    L66:
        r15 = r08;
        goto L475
    L62:
        r102 = 0;
        goto L63
    L58:
        r30 = 0;
        goto L59
    L54:
        r28 = 0;
        goto L55
    L50:
        r5 = 0;
        goto L51
    L543:
        return;
    L33:
        if (f1984r.compareAndSet(false, true) == false) goto L39;
        String r153 = r46.getClass().getName();
        String r719 = r92.getClass().getName();
        boolean r218 = m1573b0(r11);
        float r1012 = r92.getTranslationX();
        ViewGroup.LayoutParams r182 = r92.getLayoutParams();
        if (r182 == null) goto L37;
        String r417 = r182.getClass().getName();
    L38:
        m1601p0("video bind holder=" + r153 + " row=" + r719 + " type=" + r03 + " raw=" + r12 + " isSend=" + r218 + " tx=" + r1012 + " lp=" + r417);
        goto L39
    L37:
        r417 = null;
        goto L38
    L26:
        r03 = 0;
        goto L27
    L16:
        if (f1979m.compareAndSet(false, true) == false) goto L532;
        if (r45 == null) goto L19;
        r10 = r45.getClass().getName();
    L19:
        m1601p0("message row skipped: message object not found at position=" + r47 + " adapter=" + r10);
        return;
    L532:
        return;
    L11:
        if (f1978l.compareAndSet(false, true) == false) goto L530;
        m1601p0("message row skipped: itemView not found in ".concat(r46.getClass().getName()));
        return;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m1573b0(Object r3) {
        Object r02 = m1611y(r3, "field_isSend");
        Integer r2 = null;
        if ((r02 instanceof Number) == false) goto L5;
        Number r03 = (Number) r02;
    L6:
        if (r03 == null) goto L9;
        r2 = Integer.valueOf(r03.intValue());
    L9:
        if (r2 != null) goto L11;
        Integer r22 = m1569Z(r3, "isSend");
        if (r22 == null) goto L17;
        int r32 = r22.intValue();
    L21:
        if (r32 == 1) goto L23;
        return false;
    L23:
        return true;
    L17:
        Integer r33 = m1569Z(r3, "E0");
        if (r33 == null) goto L20;
        r32 = r33.intValue();
        goto L21
    L20:
        r32 = 0;
        goto L21
    L11:
        if (r2.intValue() == 1) goto L13;
        return false;
    L13:
        return true;
    L5:
        r03 = null;
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public static final void m1574c(String r3, String r4) {
        if (f1983q.compareAndSet(false, true) == false) goto L6;
        m1601p0("cleaned system notice via " + r3 + ": " + r4);
        return;
    }

    /* JADX INFO: renamed from: c0 */
    public static Long m1575c0(Object r3, String r4, String r5) {
        Method r42 = m1603q0(r3.getClass(), r4);     // Catch: Throwable -> L8
        if (r42 == null) goto L14;
        Object r43 = r42.invoke(r3, null);     // Catch: Throwable -> L8
        if ((r43 instanceof Number) == false) goto L10;
        Number r44 = (Number) r43;     // Catch: Throwable -> L8
    L11:
        if (r44 == null) goto L14;
        Object r45 = Long.valueOf(r44.longValue());     // Catch: Throwable -> L8
    L17:
        if ((r45 instanceof C0140f) == false) goto L19;
        r45 = null;
    L19:
        Long r46 = (Long) r45;
        if (r46 == null) goto L22;
        return r46;
    L22:
        Object r32 = m1611y(r3, r5);
        if ((r32 instanceof Number) == false) goto L25;
        Number r33 = (Number) r32;
    L26:
        if (r33 != null) goto L28;
        return null;
    L28:
        return Long.valueOf(r33.longValue());
    L25:
        r33 = null;
        goto L26
    L10:
        r44 = null;
    L14:
        r45 = null;
    L8:
        th = move-exception;
        r45 = AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m1576d(View r10, String r11, long r12, boolean r14, C0625T0 r15) {
        if (AbstractC0425j.m1013R0(r11) == false) goto L5;
        return;
    L5:
        C0634Y r02 = m1555L(r10);
        if (r02 == null) goto L9;
        m1567X(r02.f1949a, r02.f1950b, r11, r12, r14, r15);
        return;
    L9:
        ViewParent r03 = r10.getParent();
        FrameLayout.LayoutParams r3 = null;
        View r32 = null;
        if ((r03 instanceof ViewGroup) == false) goto L12;
        ViewGroup r04 = (ViewGroup) r03;
    L14:
        if (r04 != null) goto L17;
    L15:
        ViewGroup r4 = null;
    L58:
        if (r4 != null) goto L60;
        return;
    L60:
        int r7 = 0;
        if ((r4 instanceof LinearLayout) == false) goto L93;
        LinearLayout r05 = (LinearLayout) r4;
        if (r05.getOrientation() != 1) goto L91;
        ViewParent r8 = r10.getParent();
        if ((r8 instanceof View) == false) goto L67;
        View r82 = (View) r8;
    L68:
        if (r82 == null) goto L77;
        if (AbstractC0307g.m699a(r82.getParent(), r4) == true) goto L73;
        r82 = null;
    L73:
        if (r82 == null) goto L77;
        View r1 = r82;
    L86:
        if (r1 != null) goto L88;
    L90:
        m1582g(r4, r11, r12, r14, r15);
        return;
    L88:
        if (AbstractC0307g.m699a(r1.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == true) goto L90;
        m1567X(r05, r1, r11, r12, r14, r15);
        return;
    L77:
        if (AbstractC0307g.m699a(r10.getParent(), r4) == false) goto L79;
        r32 = r10;
    L79:
        if (r32 != null) goto L85;
        int r33 = r05.getChildCount() - 1;
        if (r33 < 0) goto L84;
        r7 = r33;
    L84:
        r1 = r4.getChildAt(r7);
        goto L86
    L85:
        r1 = r32;
        goto L86
    L67:
        r82 = null;
        goto L68
    L91:
        m1582g(r4, r11, r12, r14, r15);
        return;
    L93:
        if ((r4 instanceof RelativeLayout) == false) goto L96;
        m1578e((RelativeLayout) r4, r10, r11, r12, r14, r15);
        return;
    L96:
        if ((r4 instanceof FrameLayout) == false) goto L121;
        FrameLayout r06 = (FrameLayout) r4;
        ViewParent r83 = r06.getParent();
        if ((r83 instanceof ViewGroup) == false) goto L100;
        ViewGroup r84 = (ViewGroup) r83;
    L102:
        if ((r84 instanceof LinearLayout) == false) goto L107;
        LinearLayout r85 = (LinearLayout) r84;
        if (r85.getOrientation() != 1) goto L107;
        m1567X(r85, r4, r11, r12, r14, r15);
        return;
    L107:
        if (AbstractC0425j.m1013R0(r11) == true) goto L131;
        Context r13 = r06.getContext();
        if (r14 == false) goto L112;
        int r42 = 8388613;
    L113:
        int r43 = r42 | 80;
        TextView r86 = m1549E(r06);
        if (r86 == null) goto L120;
        r86.setText(r11);
        r86.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(r12));
        r86.setTextSize(r15.f1928d);
        m1592l(r86, r15);
        m1590k(r86, r15);
        ViewGroup.LayoutParams r07 = r86.getLayoutParams();
        if ((r07 instanceof FrameLayout.LayoutParams) == false) goto L118;
        r3 = (FrameLayout.LayoutParams) r07;
    L118:
        if (r3 == null) goto L128;
        r3.gravity = r43;
        r3.topMargin = 0;
        AbstractC0307g.m700b(r13);
        r3.bottomMargin = m1607u(r13, 2);
        r3.leftMargin = m1607u(r13, r15.m1527b(r14));
        r3.rightMargin = m1607u(r13, r15.m1526a(r14));
        r86.setLayoutParams(r3);
        return;
    L128:
        return;
    L120:
        AbstractC0307g.m700b(r13);
        View r2 = m1604r(r13, r11, r12, r15);
        FrameLayout.LayoutParams r34 = new FrameLayout.LayoutParams(-2, -2);
        r34.gravity = r43;
        r34.bottomMargin = m1607u(r13, 2);
        r34.leftMargin = m1607u(r13, r15.m1527b(r14));
        r34.rightMargin = m1607u(r13, r15.m1526a(r14));
        r06.addView(r2, r34);
        return;
    L112:
        r42 = 8388611;
        goto L113
    L131:
        return;
    L100:
        r84 = null;
        goto L102
    L121:
        m1582g(r4, r11, r12, r14, r15);
        return;
    L17:
        if ((r04 instanceof LinearLayout) == false) goto L22;
        if (((LinearLayout) r04).getOrientation() != 1) goto L22;
    L20:
        r4 = r04;
    L22:
        if ((r04 instanceof RelativeLayout) == true) goto L20;
        if ((r04 instanceof FrameLayout) == false) goto L43;
        ViewParent r44 = ((FrameLayout) r04).getParent();
        if ((r44 instanceof ViewGroup) == false) goto L29;
        r4 = (ViewGroup) r44;
    L31:
        if ((r4 instanceof LinearLayout) == false) goto L36;
        if (((LinearLayout) r4).getOrientation() == 1) goto L58;
    L36:
        if ((r4 instanceof RelativeLayout) == true) goto L58;
        if (r4 == null) goto L40;
        r4 = m1556M(r4);
    L41:
        if (r4 == null) goto L43;
    L40:
        r4 = null;
        goto L41
    L29:
        r4 = null;
    L43:
        r4 = m1556M(r04);
        if (r4 != null) goto L58;
        ViewParent r08 = r04.getParent();
        if ((r08 instanceof ViewGroup) == false) goto L49;
        r04 = (ViewGroup) r08;
    L51:
        if ((r04 instanceof LinearLayout) == false) goto L56;
        if (((LinearLayout) r04).getOrientation() == 1) goto L20;
    L56:
        if ((r04 instanceof RelativeLayout) == false) goto L15;
    L49:
        r04 = null;
        goto L51
    L12:
        r04 = null;
        goto L14
    }

    /* JADX INFO: renamed from: d0 */
    public static String m1577d0(Object r3) {
        Method r02 = m1603q0(r3.getClass(), "getContent");     // Catch: Throwable -> L9
        if (r02 == null) goto L11;
        Object r03 = r02.invoke(r3, null);     // Catch: Throwable -> L9
        if (r03 == null) goto L11;
        Object r04 = r03.toString();     // Catch: Throwable -> L9
    L14:
        if ((r04 instanceof C0140f) == false) goto L16;
        r04 = null;
    L16:
        String r05 = (String) r04;
        if (r05 == null) goto L19;
        return r05;
    L19:
        Object r32 = m1611y(r3, "field_content");
        if (r32 != null) goto L22;
        return null;
    L22:
        return r32.toString();
    L11:
        r04 = null;
    L9:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);
        goto L14
    }

    /* JADX INFO: renamed from: e */
    public static void m1578e(RelativeLayout r3, View r4, String r5, long r6, boolean r8, C0625T0 r9) {
        if (AbstractC0425j.m1013R0(r5) == false) goto L5;
        return;
    L5:
        C0312l r02 = new C0312l();
        int r1 = r4.getId();
        r02.f594a = r1;
        if (r1 != (-1)) goto L8;
        int r12 = View.generateViewId();
        r02.f594a = r12;
        r4.setId(r12);
    L8:
        Context r42 = r3.getContext();
        TextView r13 = m1549E(r3);
        if (r13 == null) goto L12;
        r13.setText(r5);
        r13.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(r6));
        r13.setTextSize(r9.f1928d);
        m1592l(r13, r9);
        m1590k(r13, r9);
        m1580f(r02, r8, r42, r9, r13);
        return;
    L12:
        AbstractC0307g.m700b(r42);
        TextView r52 = m1604r(r42, r5, r6, r9);
        r52.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        m1580f(r02, r8, r42, r9, r52);
        r3.addView(r52);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m1579e0(final View r7, final boolean r8, final int r9, final String r10, final long r11, boolean r13) {
        if (C0683p.m1753a().f2152h == true) goto L6;
        r7.setTag(C1031R.id.abc_tag_bubble_source, null);
        return;
    L6:
        boolean r02 = AbstractC0600K.m1486a(r10, r9);
        r7.setTag(C1031R.id.abc_tag_bubble_supports_custom, Boolean.valueOf(r02));
        r7.setTag(C1031R.id.abc_tag_bubble_msg_id, Long.valueOf(r11));
        boolean r5 = false;
        if (AbstractC0425j.m1005J0(r7.getClass().getName(), "MMNeat7extView", false) == false) goto L28;
        if (r02 == false) goto L28;
        ConcurrentHashMap r03 = AbstractC0626U.f1936a;
        String r04 = AbstractC0626U.m1534g(f1965E, r8);
        Context r1 = r7.getContext();
        AbstractC0307g.m702d(r1, "getContext(...)");
        C0618Q r12 = AbstractC0626U.m1532e(r1, f1965E, r8);
        if (r12 != null) goto L12;
        return;
    L12:
        r7.setBackground(r12.f1908a);
        r7.setTag(C1031R.id.abc_tag_bubble_source, r04);
        if (r13 == true) goto L15;
        return;
    L15:
        if (r9 != 49) goto L18;
    L16:
        int r05 = 49;
    L21:
        if (r05 != 49) goto L23;
        r5 = true;
    L23:
        if (r5 == true) goto L25;
        return;
    L25:
        if (AbstractC0600K.m1486a(r10, r9) == false) goto L32;
        Runnable r132 = new RunnableC0609N(r7, r11, r9, r8, r10);
        r7.post(r132);
        r7.postDelayed(r132, 96);
        return;
    L32:
        return;
    L18:
        if ((65535 & r9) == 49) goto L16;
        r05 = r9;
    L28:
        r7.setTag(C1031R.id.abc_tag_bubble_source, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m1580f(C0312l r3, boolean r4, Context r5, C0625T0 r6, TextView r7) {
        ViewGroup.LayoutParams r02 = r7.getLayoutParams();
        if ((r02 instanceof RelativeLayout.LayoutParams) == false) goto L5;
        RelativeLayout.LayoutParams r03 = (RelativeLayout.LayoutParams) r02;
    L6:
        if (r03 != null) goto L8;
        r03 = new RelativeLayout.LayoutParams(-2, -2);
    L8:
        r03.addRule(3, r3.f594a);
        r03.addRule(11, 0);
        r03.addRule(9, 0);
        if (r4 == false) goto L11;
        r03.addRule(11);
    L12:
        AbstractC0307g.m700b(r5);
        r03.topMargin = m1607u(r5, 4);
        r03.leftMargin = m1607u(r5, r6.m1527b(r4));
        r03.rightMargin = m1607u(r5, r6.m1526a(r4));
        r7.setLayoutParams(r03);
        return;
    L11:
        r03.addRule(9);
        goto L12
    L5:
        r03 = null;
        goto L6
    }

    /* JADX INFO: renamed from: f0 */
    public static void m1581f0(View r9) {
        m1585h0(r9);
        int r02 = 0;
        View r1 = r9;
        int r2 = 0;
    L4:
        if (r2 >= 8) goto L17;
        String r3 = r1.getClass().getName();
        if (r1.getTag(C1031R.id.abc_tag_message_object) != null) goto L17;
        if (AbstractC0425j.m1005J0(r3, ".viewitems.", false) == true) goto L17;
        Object r32 = r1.getParent();
        if ((r32 instanceof View) == false) goto L17;
        if (m1565V(r32.getClass().getName()) == true) goto L17;
        r1 = (View) r32;
        r2 = r2 + 1;
    L17:
        ViewParent r22 = r1.getParent();
        ViewGroup r4 = null;
        if ((r22 instanceof ViewGroup) == false) goto L20;
        ViewGroup r23 = (ViewGroup) r22;
    L22:
        if (r23 == null) goto L32;
        int r12 = r23.indexOfChild(r1);
        int r5 = -2;
    L25:
        if (r5 >= 3) goto L32;
        int r6 = r12 + r5;
        if (r6 < 0) goto L31;
        if (r6 >= r23.getChildCount()) goto L31;
        View r62 = r23.getChildAt(r6);
        AbstractC0307g.m702d(r62, "getChildAt(...)");
        m1583g0(r62);
    L31:
        r5 = r5 + 1;
    L32:
        ViewParent r13 = r9.getParent();
        int r24 = 0;
    L34:
        if ((r13 instanceof ViewGroup) == false) goto L41;
        if (r24 >= 10) goto L41;
        if (m1565V(r13.getClass().getName()) == true) goto L39;
        r13 = ((ViewGroup) r13).getParent();
        r24 = r24 + 1;
        goto L34
    L39:
        r4 = (ViewGroup) r13;
    L41:
        if (r4 == null) goto L57;
        int[] r25 = new int[2];
        r9.getLocationOnScreen(r25);
        int r92 = (r9.getHeight() / 2) + r25[1];
        int r26 = r4.getChildCount();
    L44:
        if (r02 >= r26) goto L76;
        View r63 = r4.getChildAt(r02);
        if (r63 == null) goto L56;
        if (r63.isShown() == false) goto L56;
        if (r63.getHeight() <= 0) goto L56;
        int[] r7 = new int[2];
        r63.getLocationOnScreen(r7);
        if (Math.abs(((r63.getHeight() / 2) + r7[1]) - r92) > (r63.getHeight() * 3)) goto L56;
        m1583g0(r63);
    L56:
        r02 = r02 + 1;
        goto L44
    L76:
        return;
    L57:
        return;
    L20:
        r23 = null;
        goto L22
    }

    /* JADX INFO: renamed from: g */
    public static void m1582g(ViewGroup r4, String r5, long r6, boolean r8, C0625T0 r9) {
        if (AbstractC0425j.m1013R0(r5) == false) goto L5;
        return;
    L5:
        Context r02 = r4.getContext();
        TextView r1 = m1549E(r4);
        int r2 = 8388611;
        if (r1 == null) goto L12;
        r1.setText(r5);
        r1.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(r6));
        if (r8 == false) goto L10;
        r2 = 8388613;
    L10:
        r1.setGravity(r2);
        r1.setTextSize(r9.f1928d);
        m1592l(r1, r9);
        m1590k(r1, r9);
        return;
    L12:
        AbstractC0307g.m700b(r02);
        View r52 = m1604r(r02, r5, r6, r9);
        if ((r4 instanceof RelativeLayout) == false) goto L20;
        RelativeLayout.LayoutParams r62 = new RelativeLayout.LayoutParams(-2, -2);
        if (r8 == false) goto L17;
        r62.addRule(11);
    L18:
        r62.topMargin = m1607u(r02, 4);
        r62.leftMargin = m1607u(r02, r9.m1527b(r8));
        r62.rightMargin = m1607u(r02, r9.m1526a(r8));
        ViewGroup.LayoutParams r63 = r62;
    L29:
        r4.addView(r52, r63);
        return;
    L17:
        r62.addRule(9);
        goto L18
    L20:
        if ((r4 instanceof FrameLayout) == false) goto L25;
        FrameLayout.LayoutParams r64 = new FrameLayout.LayoutParams(-2, -2);
        if (r8 == false) goto L24;
        r2 = 8388613;
    L24:
        r64.gravity = r2 | 80;
        r64.topMargin = m1607u(r02, 4);
        r64.leftMargin = m1607u(r02, r9.m1527b(r8));
        r64.rightMargin = m1607u(r02, r9.m1526a(r8));
        r63 = r64;
        goto L29
    L25:
        LinearLayout.LayoutParams r65 = new LinearLayout.LayoutParams(-2, -2);
        r65.topMargin = m1607u(r02, 4);
        if (r8 == false) goto L28;
        r2 = 8388613;
    L28:
        r65.gravity = r2;
        r65.leftMargin = m1607u(r02, r9.m1527b(r8));
        r65.rightMargin = m1607u(r02, r9.m1526a(r8));
        r63 = r65;
        goto L29
    }

    /* JADX INFO: renamed from: g0 */
    public static void m1583g0(View r7) {
        if ((r7 instanceof ViewGroup) == true) goto L5;
        return;
    L5:
        ViewGroup r72 = (ViewGroup) r7;
        int r02 = r72.getChildCount() - 1;
    L7:
        if ((-1) >= r02) goto L43;
        View r2 = r72.getChildAt(r02);
        AbstractC0307g.m700b(r2);
        if (AbstractC0307g.m699a(r2.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == false) goto L11;
    L10:
        boolean r5 = true;
    L39:
        if (r5 == false) goto L41;
        r72.removeViewAt(r02);
    L42:
        r02 = r02 - 1;
        goto L7
    L41:
        m1583g0(r2);
        goto L42
    L11:
        String r4 = null;
        if ((r2 instanceof TextView) == false) goto L14;
        TextView r3 = (TextView) r2;
    L15:
        if (r3 == null) goto L19;
        CharSequence r32 = r3.getText();
        if (r32 == null) goto L19;
        r4 = r32.toString();
    L19:
        if (r4 != null) goto L21;
        r4 = "";
    L21:
        r5 = false;
        if (AbstractC0425j.m1013R0(r4) == true) goto L39;
        String r33 = AbstractC0425j.m1022a1(r4).toString();
        if (AbstractC0425j.m1005J0(r33, "刚刚", false) == true) goto L10;
        Pattern r42 = Pattern.compile("\\d{1,3}分钟前");
        AbstractC0307g.m702d(r42, "compile(...)");
        if (r42.matcher(r33).find() == true) goto L10;
        Pattern r43 = Pattern.compile("\\d{1,3}小时前");
        AbstractC0307g.m702d(r43, "compile(...)");
        if (r43.matcher(r33).find() == true) goto L10;
        if (AbstractC0425j.m1005J0(r33, "昨天", false) == true) goto L10;
        if (AbstractC0425j.m1005J0(r33, "前天", false) == true) goto L10;
        Pattern r44 = Pattern.compile("\\d{2}-\\d{2}\\s+\\d{1,2}:\\d{2}");
        AbstractC0307g.m702d(r44, "compile(...)");
        r5 = r44.matcher(r33).find();
        goto L39
    L14:
        r3 = null;
        goto L15
    }

    /* JADX INFO: renamed from: h */
    public static void m1584h(View r5, boolean r6) {
        if (r6 == false) goto L4;
        int r62 = 8388613;
    L5:
        C0634Y r02 = m1555L(r5);
        LinearLayout.LayoutParams r1 = null;
        if (r02 == null) goto L23;
        LinearLayout r2 = r02.f1949a;
        r2.setGravity(r62);
        ViewGroup.LayoutParams r3 = r2.getLayoutParams();
        if ((r3 instanceof LinearLayout.LayoutParams) == false) goto L10;
        LinearLayout.LayoutParams r32 = (LinearLayout.LayoutParams) r3;
    L11:
        if (r32 != null) goto L13;
    L15:
        View r03 = r02.f1950b;
        ViewGroup.LayoutParams r22 = r03.getLayoutParams();
        if ((r22 instanceof LinearLayout.LayoutParams) == false) goto L18;
        LinearLayout.LayoutParams r23 = (LinearLayout.LayoutParams) r22;
    L19:
        if (r23 == null) goto L23;
        if (r23.gravity == r62) goto L23;
        r23.gravity = r62;
        r03.setLayoutParams(r23);
        goto L23
    L18:
        r23 = null;
        goto L19
    L13:
        if (r32.gravity == r62) goto L15;
        r32.gravity = r62;
        r2.setLayoutParams(r32);
        goto L15
    L10:
        r32 = null;
    L23:
        ViewGroup.LayoutParams r04 = r5.getLayoutParams();
        if ((r04 instanceof LinearLayout.LayoutParams) == false) goto L26;
        r1 = (LinearLayout.LayoutParams) r04;
    L26:
        if (r1 != null) goto L28;
        return;
    L28:
        if (r1.gravity == r62) goto L32;
        r1.gravity = r62;
        r5.setLayoutParams(r1);
        return;
    L32:
        return;
    L4:
        r62 = 8388611;
        goto L5
    }

    /* JADX INFO: renamed from: h0 */
    public static void m1585h0(View r5) {
        m1583g0(r5);
        Object r52 = r5.getParent();
        ViewGroup r1 = null;
        int r2 = 0;
    L4:
        if ((r52 instanceof ViewGroup) == false) goto L17;
        if (r2 >= 8) goto L17;
        String r3 = r52.getClass().getName();
        if (m1565V(r3) == true) goto L17;
        r1 = (ViewGroup) r52;
        if (r1.getTag(C1031R.id.abc_tag_message_object) != null) goto L15;
        if (AbstractC0425j.m1005J0(r3, ".viewitems.", false) == true) goto L15;
        r52 = r1.getParent();
        r2 = r2 + 1;
    L15:
        m1583g0((View) r52);
        return;
    L17:
        if (r1 == null) goto L25;
        m1583g0(r1);
        return;
    }

    /* JADX INFO: renamed from: i */
    public static List m1586i(Class r5) {
        ConcurrentHashMap r02 = f1989w;
        Object r1 = r02.get(r5);
        Object r12 = r1;
        if (r1 != null) goto L12;
        ArrayList r13 = new ArrayList();
        Class r2 = r5;
    L5:
        if (r2 == null) goto L7;
        Field[] r3 = r2.getDeclaredFields();
        AbstractC0307g.m702d(r3, "getDeclaredFields(...)");
        AbstractC0188s.m561m0(r13, r3);
        r2 = r2.getSuperclass();
        goto L5
    L7:
        Object r52 = r02.putIfAbsent(r5, r13);
        r12 = r13;
        if (r52 == null) goto L12;
        r12 = r52;
    L12:
        return (List) r12;
    }

    /* JADX INFO: renamed from: i0 */
    public static Object m1587i0(View r12, Object r13) {
        Method r02 = f1963C;
        if (r02 != null) goto L5;
        return r13;
    L5:
        ArrayList r1 = m1594m(C1031R.id.abc_tag_message_holder, r12, r13);
        ArrayList r122 = m1594m(C1031R.id.abc_tag_message_adapter, r12, null);
        Iterator r14 = r1.iterator();
    L7:
        if (r14.hasNext() == false) goto L42;
        Object r2 = r14.next();
        Iterator r4 = r122.iterator();
    L10:
        if (r4.hasNext() == false) goto L7;
        Object r5 = r4.next();
        Class<?>[] r6 = r02.getParameterTypes();
        r02.setAccessible(true);     // Catch: Throwable -> L27
        int r8 = r6.length;     // Catch: Throwable -> L27
        if (r8 != 1) goto L16;
        if (r2 != null) goto L30;
    L17:
        Object r52 = null;
    L37:
        if ((r52 instanceof C0140f) == false) goto L39;
        r52 = null;
    L39:
        if (r52 == null) goto L10;
        m1601p0("resolved current quote msg via " + r02.getName() + ": " + r52.getClass().getName());
        return r52;
    L30:
        Class<?> r53 = r6[0];     // Catch: Throwable -> L27
        AbstractC0307g.m702d(r53, "get(...)");     // Catch: Throwable -> L27
        if (m1599o0(r53).isInstance(r2) == false) goto L17;
        r52 = r02.invoke(null, new Object[]{r2});     // Catch: Throwable -> L27
        goto L37
    L16:
        if (r8 != 2) goto L17;
        if (r2 == null) goto L17;
        if (r5 == null) goto L17;
        Class<?> r82 = r6[0];     // Catch: Throwable -> L27
        AbstractC0307g.m702d(r82, "get(...)");     // Catch: Throwable -> L27
        if (m1599o0(r82).isInstance(r2) == false) goto L17;
        Class<?> r62 = r6[1];     // Catch: Throwable -> L27
        AbstractC0307g.m702d(r62, "get(...)");     // Catch: Throwable -> L27
        if (m1599o0(r62).isInstance(r5) == false) goto L17;
        r52 = r02.invoke(null, new Object[]{r2, r5});     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L37
    L42:
        return r13;
    }

    /* JADX INFO: renamed from: j */
    public static List m1588j(Class r5) {
        ConcurrentHashMap r02 = f1990x;
        Object r1 = r02.get(r5);
        Object r12 = r1;
        if (r1 != null) goto L12;
        ArrayList r13 = new ArrayList();
        Class r2 = r5;
    L5:
        if (r2 == null) goto L7;
        Method[] r3 = r2.getDeclaredMethods();
        AbstractC0307g.m702d(r3, "getDeclaredMethods(...)");
        AbstractC0188s.m561m0(r13, r3);
        r2 = r2.getSuperclass();
        goto L5
    L7:
        Object r52 = r02.putIfAbsent(r5, r13);
        r12 = r13;
        if (r52 == null) goto L12;
        r12 = r52;
    L12:
        return (List) r12;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m1589j0(Activity r2, boolean r3) {
        AbstractC0307g.m703e(r2, "activity");
        Intent r02 = new Intent("android.intent.action.GET_CONTENT");
        r02.setType("image/*");
        r02.addCategory("android.intent.category.OPENABLE");
        if (r3 == false) goto L5;
        int r32 = 658453;
    L19:
        r2.startActivityForResult(Intent.createChooser(r02, "选择 .9.png 气泡皮肤"), r32);     // Catch: Throwable -> L8
        Object r1 = C0146l.f339a;     // Catch: Throwable -> L8
    L11:
        if (AbstractC0141g.m465a(r1) == null) goto L21;
        r2.startActivityForResult(r02, r32);     // Catch: Throwable -> L14
        return;
    L14:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L21:
        return;
    L8:
        th = move-exception;
        r1 = AbstractC0040p.m116u(th);
        goto L11
    L5:
        r32 = 658452;
        goto L19
    }

    /* JADX INFO: renamed from: k */
    public static void m1590k(TextView r2, C0625T0 r3) {
        if (r3.f1935k == true) goto L5;
        r2.setVisibility(0);
        r2.setTag(C1031R.id.abc_tag_custom_time_hidden, Boolean.FALSE);
        return;
    L5:
        if (AbstractC0307g.m699a(r2.getTag(C1031R.id.abc_tag_custom_time_hidden), Boolean.FALSE) == true) goto L9;
        r2.setVisibility(8);
        r2.setTag(C1031R.id.abc_tag_custom_time_hidden, Boolean.TRUE);
        return;
    }

    /* JADX INFO: renamed from: k0 */
    public static View m1591k0(View r8, Object r9, ClassLoader r10) {
        boolean r02 = m1573b0(r9);
        Integer r1 = m1571a0(r9);
        if (r1 == null) goto L5;
        int r12 = r1.intValue();
    L6:
        String r2 = m1577d0(r9);
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        Long r3 = m1575c0(r9, "getMsgId", "field_msgId");
        if (r3 == null) goto L12;
        long r32 = r3.longValue();
    L13:
        r8.setTag(C1031R.id.abc_tag_message_object, r9);
        StringBuilder r6 = new StringBuilder();
        m1602q(r6, r8);
        String r62 = r6.toString();
        AbstractC0307g.m702d(r62, "toString(...)");
        if (AbstractC0358S.m897m0(r12, r2, r62) == true) goto L17;
        m1600p(r8);
        m1598o(r8);
        m1585h0(r8);
        return null;
    L17:
        View r102 = m1547C(r8, r10);
        if (r102 != null) goto L20;
        return null;
    L20:
        boolean r22 = AbstractC0600K.m1486a(r2, r12);
        r102.setTag(C1031R.id.abc_tag_message_object, r9);
        r102.setTag(C1031R.id.abc_tag_swipe_target_row, r8);
        r102.setTag(C1031R.id.abc_tag_bubble_is_send, Boolean.valueOf(r02));
        r102.setTag(C1031R.id.abc_tag_bubble_msg_type, Integer.valueOf(r12));
        r102.setTag(C1031R.id.abc_tag_bubble_msg_id, Long.valueOf(r32));
        r102.setTag(C1031R.id.abc_tag_bubble_supports_custom, Boolean.valueOf(r22));
        return r102;
    L12:
        r32 = 0;
        goto L13
    L5:
        r12 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public static void m1592l(TextView r5, C0625T0 r6) {
        if ((r5.getResources().getConfiguration().uiMode & 48) != 32) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == false) goto L8;
        int r62 = r6.f1934j;
    L9:
        if (r02 == false) goto L11;
    L13:
        if (r02 == false) goto L15;
    L17:
        r5.setTextColor(r62);
        r5.setAlpha(1.0f);
        r5.setLetterSpacing(0.0f);
        if (r02 == false) goto L20;
        r5.setTypeface(Typeface.create("sans-serif", 0));
        r5.setShadowLayer(1.2f, 0.0f, 0.5f, Color.parseColor("#44000000"));
        return;
    L20:
        r5.setTypeface(Typeface.create("sans-serif-medium", 0));
        r5.setShadowLayer(1.15f, 0.0f, 0.45f, Color.parseColor("#66000000"));
        return;
    L15:
        if (((Color.blue(r62) * 0.114f) + ((Color.green(r62) * 0.587f) + (Color.red(r62) * 0.299f))) >= 120.0f) goto L17;
        r62 = Color.argb(242, 245, 245, 245);
        goto L17
    L11:
        if (Color.alpha(r62) >= 230) goto L13;
        r62 = Color.argb(230, Color.red(r62), Color.green(r62), Color.blue(r62));
        goto L13
    L8:
        r62 = r6.f1933i;
        goto L9
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: l0 */
    public static void m1593l0(View r2, View r3, Object r4) {
        Class r02 = f1964D;
        if (r02 != null) goto L5;
        return;
    L5:
        View r1 = m1612z(r2, r02);
        View r12 = r1;
        if (r1 != null) goto L10;
        View r13 = m1612z(r3, r02);
        r12 = r13;
        if (r13 != null) goto L10;
        return;
    L10:
        r12.setTag(C1031R.id.abc_tag_message_object, r4);
        r12.setTag(C1031R.id.abc_tag_message_holder, r2.getTag(C1031R.id.abc_tag_message_holder));
        r12.setTag(C1031R.id.abc_tag_message_adapter, r2.getTag(C1031R.id.abc_tag_message_adapter));
        r12.setTag(C1031R.id.abc_tag_swipe_target_row, r12);
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m1594m(int r4, View r5, Object r6) {
        ArrayList r02 = new ArrayList();
        m1596n(r02, r5.getTag(r4));
        int r1 = 0;
    L4:
        if (r5 == null) goto L12;
        if (r1 >= 5) goto L12;
        m1596n(r02, r5.getTag(r4));
        Object r52 = r5.getParent();
        if ((r52 instanceof View) == false) goto L10;
        r5 = (View) r52;
    L11:
        r1 = r1 + 1;
        goto L4
    L10:
        r5 = null;
    L12:
        m1596n(r02, r6);
        m1596n(r02, null);
        return r02;
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m1595m0(View r4) {
        int r1 = 0;
        if (AbstractC0307g.m699a(r4.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) == false) goto L13;
        if (r4.getVisibility() == 0) goto L7;
        boolean r02 = true;
    L8:
        if (r02 == false) goto L10;
        int r3 = 0;
    L11:
        r4.setVisibility(r3);
        r4.setTag(C1031R.id.abc_tag_custom_time_hidden, Boolean.valueOf(!r02));
        goto L13
    L10:
        r3 = 8;
        goto L11
    L7:
        r02 = false;
    L13:
        if ((r4 instanceof ViewGroup) == false) goto L17;
        ViewGroup r42 = (ViewGroup) r4;
        int r03 = r42.getChildCount();
    L15:
        if (r1 >= r03) goto L19;
        View r2 = r42.getChildAt(r1);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        m1595m0(r2);
        r1 = r1 + 1;
        goto L15
    L19:
        return;
    }

    /* JADX INFO: renamed from: n */
    public static final void m1596n(ArrayList r2, Object r3) {
        if (r2.isEmpty() == true) goto L11;
        Iterator r02 = r2.iterator();
    L7:
        if (r02.hasNext() == false) goto L11;
        if (r02.next() != r3) goto L7;
        return;
    L11:
        r2.add(r3);
    }

    /* JADX INFO: renamed from: n0 */
    public static String m1597n0(Class r3) {
        if (r3.isPrimitive() == false) goto L35;
        if (r3.equals(Integer.TYPE) == false) goto L8;
        return "I";
    L8:
        if (r3.equals(Void.TYPE) == false) goto L11;
        return "V";
    L11:
        if (r3.equals(Boolean.TYPE) == false) goto L14;
        return "Z";
    L14:
        if (r3.equals(Character.TYPE) == false) goto L17;
        return "C";
    L17:
        if (r3.equals(Byte.TYPE) == false) goto L20;
        return "B";
    L20:
        if (r3.equals(Short.TYPE) == false) goto L23;
        return "S";
    L23:
        if (r3.equals(Float.TYPE) == false) goto L26;
        return "F";
    L26:
        if (r3.equals(Long.TYPE) == false) goto L29;
        return "J";
    L29:
        if (r3.equals(Double.TYPE) == false) goto L33;
        return "D";
    L33:
        throw new IllegalStateException(("Unknown primitive " + r3).toString());
    L35:
        if (r3.isArray() == false) goto L39;
        return AbstractC0433r.m1032G0(r3.getName(), '.', '/');
    L39:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r3.getName(), '.', '/'), ";");
    }

    /* JADX INFO: renamed from: o */
    public static void m1598o(View r4) {
        r4.setTag(C1031R.id.abc_tag_bubble_source, null);
        r4.setTag(C1031R.id.abc_tag_bubble_is_send, null);
        r4.setTag(C1031R.id.abc_tag_bubble_msg_type, null);
        r4.setTag(C1031R.id.abc_tag_bubble_msg_id, null);
        r4.setTag(C1031R.id.abc_tag_bubble_supports_custom, null);
        r4.setTag(C1031R.id.abc_tag_bubble_original_background, null);
        if ((r4 instanceof ViewGroup) == false) goto L7;
        ViewGroup r42 = (ViewGroup) r4;
        int r02 = r42.getChildCount();
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L9;
        View r2 = r42.getChildAt(r1);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        m1598o(r2);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    /* JADX INFO: renamed from: o0 */
    public static Class m1599o0(Class r1) {
        if (r1.equals(Boolean.TYPE) == false) goto L6;
        return Boolean.class;
    L6:
        if (r1.equals(Byte.TYPE) == false) goto L9;
        return Byte.class;
    L9:
        if (r1.equals(Short.TYPE) == false) goto L12;
        return Short.class;
    L12:
        if (r1.equals(Integer.TYPE) == false) goto L15;
        return Integer.class;
    L15:
        if (r1.equals(Long.TYPE) == false) goto L18;
        return Long.class;
    L18:
        if (r1.equals(Float.TYPE) == false) goto L21;
        return Float.class;
    L21:
        if (r1.equals(Double.TYPE) == false) goto L24;
        return Double.class;
    L24:
        if (r1.equals(Character.TYPE) == false) goto L34;
        return Character.class;
    L34:
        return r1;
    }

    /* JADX INFO: renamed from: p */
    public static void m1600p(View r4) {
        r4.setTag(C1031R.id.abc_tag_message_object, null);
        r4.setTag(C1031R.id.abc_tag_swipe_target_row, null);
        if ((r4 instanceof ViewGroup) == false) goto L7;
        ViewGroup r42 = (ViewGroup) r4;
        int r02 = r42.getChildCount();
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L9;
        View r2 = r42.getChildAt(r1);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        m1600p(r2);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m1601p0(String r2) {
        AbstractC0762d.m1954d("[OKK-ChatEnhance] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX INFO: renamed from: q */
    public static final void m1602q(StringBuilder r4, View r5) {
        if ((r5 instanceof TextView) == false) goto L14;
        CharSequence r02 = ((TextView) r5).getText();
        if (r02 == null) goto L7;
        String r03 = r02.toString();
    L8:
        if (r03 != null) goto L11;
        r03 = "";
    L11:
        if ((!AbstractC0425j.m1013R0(r03)) == false) goto L14;
        r4.append(r03);
        r4.append(' ');
        goto L14
    L7:
        r03 = null;
    L14:
        if ((r5 instanceof ViewGroup) == false) goto L18;
        ViewGroup r52 = (ViewGroup) r5;
        int r04 = r52.getChildCount();
        int r1 = 0;
    L16:
        if (r1 >= r04) goto L20;
        View r2 = r52.getChildAt(r1);
        AbstractC0307g.m702d(r2, "getChildAt(...)");
        m1602q(r4, r2);
        r1 = r1 + 1;
        goto L16
    L20:
        return;
    }

    /* JADX INFO: renamed from: q0 */
    public static Method m1603q0(Class r6, String r7) {
        String r02 = r6.getName() + "#" + r7;
        ConcurrentHashMap r1 = f1991y;
        Object r2 = r1.get(r02);
        if (r2 != null) goto L21;
        Iterator r62 = m1588j(r6).iterator();
    L5:
        Method r3 = null;
        if (r62.hasNext() == false) goto L12;
        Object r22 = r62.next();
        Method r4 = (Method) r22;
        if (AbstractC0307g.m699a(r4.getName(), r7) == false) goto L5;
        Class<?>[] r42 = r4.getParameterTypes();
        AbstractC0307g.m702d(r42, "getParameterTypes(...)");
        if (r42.length != 0) goto L5;
    L13:
        Method r23 = (Method) r22;
        if (r23 == null) goto L16;
        r23.setAccessible(true);
        r3 = r23;
    L16:
        C0628V r63 = new C0628V(r3);
        Object r72 = r1.putIfAbsent(r02, r63);
        if (r72 != null) goto L19;
        r2 = r63;
        goto L21
    L19:
        r2 = r72;
        goto L21
    L12:
        r22 = null;
    L21:
        return (Method) ((C0628V) r2).f1939a;
    }

    /* JADX INFO: renamed from: r */
    public static TextView m1604r(Context r2, String r3, long r4, C0625T0 r6) {
        TextView r02 = new TextView(r2);
        r02.setTag(C1031R.id.abc_tag_custom_time, Boolean.TRUE);
        r02.setTag(C1031R.id.abc_tag_custom_time_msg_id, Long.valueOf(r4));
        r02.setText(r3);
        r02.setTextSize(r6.f1928d);
        r02.setIncludeFontPadding(false);
        r02.setGravity(8388611);
        m1592l(r02, r6);
        m1590k(r02, r6);
        return r02;
    }

    /* JADX INFO: renamed from: s */
    public static String m1605s(String r3) {
        int r02 = AbstractC0425j.m1011P0(r3, "->", 0, false, 6);
        if (r02 <= 1) goto L7;
        String r32 = r3.substring(1, r02 - 1);
        AbstractC0307g.m702d(r32, "substring(...)");
        return AbstractC0433r.m1032G0(r32, '/', '.');
    L7:
        throw new IllegalArgumentException(r3.toString());
    }

    /* JADX INFO: renamed from: t */
    public static Method m1606t(ClassLoader r13, String r14) {
        int r02 = AbstractC0425j.m1011P0(r14, "->", 0, false, 6);
        int r2 = AbstractC0425j.m1010O0(r14, '(', r02, false, 4);
        if (r02 <= 1) goto L26;
        if (r2 <= r02) goto L26;
        String r4 = m1605s(r14);
        String r03 = r14.substring(r02 + 2, r2);
        AbstractC0307g.m702d(r03, "substring(...)");
        String r22 = r14.substring(r2);
        AbstractC0307g.m702d(r22, "substring(...)");
        Class<?> r132 = r13.loadClass(r4);
    L6:
        if (r132 == null) goto L24;
        Method[] r42 = r132.getDeclaredMethods();
        AbstractC0307g.m702d(r42, "getDeclaredMethods(...)");
        int r5 = r42.length;
        int r6 = 0;
    L8:
        if (r6 >= r5) goto L18;
        Method r7 = r42[r6];
        if (AbstractC0307g.m699a(r7.getName(), r03) == false) goto L17;
        StringBuilder r8 = new StringBuilder("(");
        Class<?>[] r9 = r7.getParameterTypes();
        AbstractC0307g.m702d(r9, "getParameterTypes(...)");
        int r10 = r9.length;
        int r11 = 0;
    L12:
        if (r11 >= r10) goto L14;
        Class<?> r12 = r9[r11];
        AbstractC0307g.m700b(r12);
        r8.append(m1597n0(r12));
        r11 = r11 + 1;
        goto L12
    L14:
        r8.append(')');
        Class<?> r92 = r7.getReturnType();
        AbstractC0307g.m702d(r92, "getReturnType(...)");
        r8.append(m1597n0(r92));
        String r82 = r8.toString();
        AbstractC0307g.m702d(r82, "toString(...)");
        if (r82.equals(r22) == false) goto L17;
    L19:
        if (r7 != null) goto L20;
        r132 = r132.getSuperclass();
        goto L6
    L20:
        r7.setAccessible(true);
        return r7;
    L17:
        r6 = r6 + 1;
        goto L8
    L18:
        r7 = null;
        goto L19
    L24:
        throw new NoSuchMethodException(r14);
    L26:
        throw new IllegalArgumentException(r14.toString());
    }

    /* JADX INFO: renamed from: u */
    public static int m1607u(Context r02, int r1) {
        return (int) ((r1 * r02.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: v */
    public static void m1608v(View r2, C0625T0 r3) {
        if (r3.f1935k == true) goto L5;
        return;
    L5:
        Object r02 = r2.getTag(C1031R.id.abc_tag_detail_click_listener);
        Boolean r1 = Boolean.TRUE;
        if (AbstractC0307g.m699a(r02, r1) == false) goto L8;
        return;
    L8:
        r2.setTag(C1031R.id.abc_tag_detail_click_listener, r1);
        r2.setOnClickListener(new ViewOnClickListenerC0025a(3, r2));
    }

    /* JADX INFO: renamed from: w */
    public static void m1609w(View r1, View r2) {
        r1.setTag(C1031R.id.abc_tag_swipe_target_row, r2);
        r1.setTag(C1031R.id.abc_tag_swipe_listener, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: x */
    public static void m1610x(View r8, View r9, Object r10) {
        ViewParent r02 = r8.getParent();
        int r1 = Math.max(r9.getWidth(), r9.getMeasuredWidth());
        View r4 = r9;
        int r3 = 0;
    L4:
        if ((r02 instanceof ViewGroup) == false) goto L13;
        if (r3 >= 6) goto L13;
        if (m1565V(r02.getClass().getName()) == true) goto L13;
        View r5 = (View) r02;
        int r6 = Math.max(r5.getWidth(), r5.getMeasuredWidth());
        if (r6 < r1) goto L12;
        r4 = r5;
        r1 = r6;
    L12:
        r02 = ((ViewGroup) r02).getParent();
        r3 = r3 + 1;
    L13:
        if (r4 != null) goto L15;
        return;
    L15:
        r4.setTag(C1031R.id.abc_tag_message_object, r10);
        m1609w(r4, r9);
        if (f1982p.compareAndSet(false, true) == false) goto L24;
        m1601p0("swipe hot zone=" + r4.getClass().getName() + " width=" + Math.max(r4.getWidth(), r4.getMeasuredWidth()) + " target=" + r9.getClass().getName() + " targetWidth=" + Math.max(r9.getWidth(), r9.getMeasuredWidth()) + " bubbleWidth=" + Math.max(r8.getWidth(), r8.getMeasuredWidth()));
        return;
    }

    /* JADX INFO: renamed from: y */
    public static Object m1611y(Object r6, String r7) {
        Class<?> r02 = r6.getClass();
        String r1 = r02.getName() + "#" + r7;
        ConcurrentHashMap r2 = f1992z;
        Object r3 = r2.get(r1);
        if (r3 != null) goto L19;
        Iterator r03 = m1586i(r02).iterator();
    L6:
        if (r03.hasNext() == false) goto L10;
        Object r32 = r03.next();
        if (AbstractC0307g.m699a(((Field) r32).getName(), r7) == false) goto L6;
    L11:
        Field r33 = (Field) r32;
        if (r33 == null) goto L14;
        r33.setAccessible(true);
    L15:
        C0628V r72 = new C0628V(r33);
        Object r04 = r2.putIfAbsent(r1, r72);
        if (r04 != null) goto L18;
        r3 = r72;
        goto L19
    L18:
        r3 = r04;
        goto L19
    L14:
        r33 = null;
        goto L15
    L10:
        r32 = null;
    L19:
        Field r73 = (Field) ((C0628V) r3).f1939a;
        if (r73 == null) goto L35;
        Object r62 = r73.get(r6);     // Catch: Throwable -> L23
    L26:
        if ((r62 instanceof C0140f) == false) goto L29;
        return null;
    L29:
        return r62;
    L23:
        th = move-exception;
        r62 = AbstractC0040p.m116u(th);
        goto L26
    L35:
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static View m1612z(View r3, Class r4) {
        int r02 = 0;
    L4:
        if (r02 >= 8) goto L15;
        if (r4.isInstance(r3) == true) goto L7;
        Object r32 = r3.getParent();
        if ((r32 instanceof View) == false) goto L10;
        if (m1565V(r32.getClass().getName()) == true) goto L13;
        r3 = (View) r32;
        r02 = r02 + 1;
        goto L4
    L13:
        return null;
    L10:
        return null;
    L7:
        return r3;
    L15:
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m1613K(DexKitBridge r8, ClassLoader r9) {
        Object r02 = null;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L7
        r1.searchPackages(new String[]{"com.tencent.mm.ui.chatting"});     // Catch: Throwable -> L7
        MethodMatcher r2 = new MethodMatcher();     // Catch: Throwable -> L7
        ClassMatcher r3 = new ClassMatcher();     // Catch: Throwable -> L7
        r3.usingStrings(new String[]{"x2c.X2CCheckBox"});     // Catch: Throwable -> L7
        r3.methodCount(new C0340c(1, 3, 1));     // Catch: Throwable -> L7
        r2.declaredClass(r3);     // Catch: Throwable -> L7
        r1.matcher(r2);     // Catch: Throwable -> L7
        MethodData r82 = r8.findMethod(r1).firstOrNull();     // Catch: Throwable -> L7
        if (r82 == null) goto L9;
        Object r83 = r82.getDescriptor();     // Catch: Throwable -> L7
    L12:
        if ((r83 instanceof C0140f) == false) goto L14;
        r83 = null;
    L14:
        String r84 = (String) r83;
        if (r84 != null) goto L17;
    L50:
        m1601p0("DexKit did not find swipe row container");
        return;
    L17:
        if (AbstractC0425j.m1013R0(r84) == true) goto L50;
        Object r12 = m1606t(r9, r84).getDeclaringClass();     // Catch: Throwable -> L21
    L24:
        if (AbstractC0141g.m465a(r12) != null) goto L58;
    L35:
        Class r13 = (Class) r12;
        if (r13 != null) goto L39;
        m1601p0("swipe row container descriptor could not resolve: ".concat(r84));
        return;
    L39:
        f1964D = r13;
        m1601p0("found swipe row container via DexKit:" + r84 + " class=" + r13.getName());
        String r85 = "DexKit:".concat(r84);
        String r03 = r13.getName().concat("#dispatchTouchEvent(MotionEvent)");
        ConcurrentHashMap.KeySetView r22 = f1988v;
        if (r22.add(r03) == false) goto L61;
        AbstractC0358S.m904q(r13, "dispatchTouchEvent", new Object[]{MotionEvent.class, new C0636Z(this)});     // Catch: Throwable -> L44
        m1601p0("hooked swipe row dispatch via " + r85);     // Catch: Throwable -> L44
        Object r92 = C0146l.f339a;     // Catch: Throwable -> L44
    L46:
        Throwable r93 = AbstractC0141g.m465a(r92);
        if (r93 == null) goto L60;
        r22.remove(r03);
        m1601p0("swipe row dispatch hook failed via " + r85 + ": " + r93.getMessage());
        return;
    L60:
        return;
    L44:
        th = move-exception;
        r92 = AbstractC0040p.m116u(th);
        goto L46
    L61:
        return;
    L58:
        Object r94 = r9.loadClass(m1605s(r84));     // Catch: Throwable -> L28
        AbstractC0307g.m702d(r94, "loadClass(...)");     // Catch: Throwable -> L28
    L31:
        if ((r94 instanceof C0140f) == true) goto L34;
        r02 = r94;
    L34:
        r12 = (Class) r02;
    L28:
        th = move-exception;
        r94 = AbstractC0040p.m116u(th);
    L21:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L24
    L9:
        r83 = null;
    L7:
        th = move-exception;
        r83 = AbstractC0040p.m116u(th);
        goto L12
    }
}
