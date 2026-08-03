package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: Nj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0585Nj {

    /* JADX INFO: renamed from: a */
    public static final Object f1896a = null;

    /* JADX INFO: renamed from: b */
    public static final String[] f1897b = null;

    /* JADX INFO: renamed from: c */
    public static final C2656w4 f1898c = null;

    /* JADX INFO: renamed from: d */
    public static C2656w4 f1899d;

    /* JADX INFO: renamed from: e */
    public static final Object f1900e = null;

    /* JADX INFO: renamed from: f */
    public static Method f1901f;

    /* JADX INFO: renamed from: g */
    public static boolean f1902g;

    /* JADX INFO: renamed from: h */
    public static boolean f1903h;

    /* JADX INFO: renamed from: i */
    public static Method f1904i;

    static {
        f1896a = new Object();
        f1897b = new String[]{"standard", "accelerate", "decelerate", "linear"};
        Object r1 = null;
        f1898c = new C2656w4(r1, r1, r1, 20);
        f1900e = new Object();
    }

    /* JADX INFO: renamed from: A */
    public static void m1122A(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
        if (m1127F(r3) == true) goto L13;
        int r1 = r3 + 112;
        if (((r1 + (r2 << 28)) >> 30) != 0) goto L13;
        if (m1127F(r4) == true) goto L13;
        if (m1127F(r5) == true) goto L13;
        int r22 = ((((r2 & 7) << 18) | ((r3 & 63) << 12)) | ((r4 & 63) << 6)) | (r5 & 63);
        r6[r7] = (char) ((r22 >>> 10) + 55232);
        r6[r7 + 1] = (char) ((r22 & 1023) + 56320);
        return;
    L13:
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: B */
    public static void m1123B(byte r2, byte r3, byte r4, char[] r5, int r6) {
        if (m1127F(r3) == true) goto L15;
        if (r2 != (-32)) goto L8;
        if (r3 < (-96)) goto L15;
    L8:
        if (r2 != (-19)) goto L11;
        if (r3 >= (-96)) goto L15;
    L11:
        if (m1127F(r4) == true) goto L15;
        r5[r6] = (char) ((((r2 & 15) << 12) | ((r3 & 63) << 6)) | (r4 & 63));
        return;
    L15:
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: C */
    public static void m1124C(byte r1, byte r2, char[] r3, int r4) {
        if (r1 < (-62)) goto L11;
        if (m1127F(r2) == true) goto L9;
        r3[r4] = (char) (((r1 & 31) << 6) | (r2 & 63));
        return;
    L9:
        throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
    L11:
        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    }

    /* JADX INFO: renamed from: D */
    public static final void m1125D(InterfaceC1137ac r4, Throwable r5) {
        Iterator r0 = AbstractC1260cc.f4274a.iterator();
    L4:
        if (r0.hasNext() == true) goto L17;
        AbstractC0148Dc.m268b(r5, new C0278Gd(r4));     // Catch: Throwable -> L16
    L14:
        Thread r42 = Thread.currentThread();
        r42.getUncaughtExceptionHandler().uncaughtException(r42, r5);
        return;
    L17:
        ((C0046B2) r0.next()).getClass();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        if (r5 != th) goto L11;
        Throwable r2 = r5;
    L12:
        Thread r1 = Thread.currentThread();
        r1.getUncaughtExceptionHandler().uncaughtException(r1, r2);
        goto L4
    L11:
        r2 = new RuntimeException("Exception while trying to handle coroutine exception", th);
        AbstractC0148Dc.m268b(r2, r5);
        goto L12
    }

    /* JADX INFO: renamed from: E */
    public static final int m1126E(InterfaceC0126Cx r7, InterfaceC0126Cx[] r8) {
        int r0 = (r7.mo203b().hashCode() * 31) + Arrays.hashCode(r8);
        int r82 = r7.mo205d();
        int r2 = 1;
    L3:
        int r3 = 0;
        if (r82 <= 0) goto L6;
        boolean r4 = true;
    L7:
        if (r4 == false) goto L12;
        int r5 = r82 - 1;
        int r22 = r2 * 31;
        String r83 = r7.mo210j(r7.mo205d() - r82).mo203b();
        if (r83 == null) goto L11;
        r3 = r83.hashCode();
    L11:
        r2 = r22 + r3;
        r82 = r5;
        goto L3
    L12:
        int r84 = r7.mo205d();
        int r42 = 1;
    L13:
        if (r84 <= 0) goto L15;
        boolean r52 = true;
    L16:
        if (r52 == false) goto L23;
        int r6 = r84 - 1;
        int r43 = r42 * 31;
        AbstractC1406fG r85 = r7.mo210j(r7.mo205d() - r84).mo204c();
        if (r85 == null) goto L20;
        int r86 = r85.hashCode();
    L21:
        r42 = r43 + r86;
        r84 = r6;
        goto L13
    L20:
        r86 = 0;
        goto L21
    L23:
        return (((r0 * 31) + r2) * 31) + r42;
    L15:
        r52 = false;
        goto L16
    L6:
        r4 = false;
        goto L7
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1127F(byte r1) {
        if (r1 <= (-65)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static void m1128G(InterfaceC1409fc r2, Function2 r3, int r4) {
        InterfaceC1137ac r0 = ExecutorC0921Vc.f2876b;
        if ((r4 & 1) == 0) goto L5;
        r0 = C0366If.f1247a;
    L5:
        InterfaceC1137ac r22 = AbstractC0148Dc.m276j(r2.mo152a(), r0, true);
        C1498hd r42 = AbstractC1499he.f5282a;
        if (r22 != r42) goto L8;
    L10:
        C0943Vy r43 = new C0943Vy(r22, true);
        int r23 = AbstractC0213Ey.m424v(1);
        C0829TC r02 = C0829TC.f2620a;
        if (r23 == 0) goto L48;
        if (r23 != 1) goto L14;
        return;
    L14:
        if (r23 != 2) goto L16;
        AbstractC0628Oj.m1225E(AbstractC0628Oj.m1242k(r43, r43, r3)).mo264f(r02);
        return;
    L16:
        if (r23 != 3) goto L35;
        InterfaceC1137ac r24 = r43.f8910c;     // Catch: Throwable -> L24
        Object r03 = AbstractC0295Gu.m604E(r24, null);     // Catch: Throwable -> L24
        AbstractC0828TB.m1636c(2, r3);     // Catch: Throwable -> L26
        Object r32 = r3.mo446d(r43, r43);     // Catch: Throwable -> L26
        AbstractC0295Gu.m601B(r24, r03);     // Catch: Throwable -> L24
        if (r32 == EnumC1453gc.f5148a) goto L52;
        r43.mo264f(r32);
        return;
    L52:
        return;
    L26:
        th = move-exception;
        AbstractC0295Gu.m601B(r24, r03);     // Catch: Throwable -> L24
        throw th;     // Catch: Throwable -> L24
    L24:
        th = th;
        if ((th instanceof C1324de) == false) goto L32;
        th = ((C1324de) th).f4800a;
    L32:
        r43.mo264f(new C0297Gw(th));
        return;
    L35:
        throw new C0232Fa();
    L48:
        AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(AbstractC0628Oj.m1242k(r43, r43, r3)), r02);     // Catch: Throwable -> L40
        return;
    L40:
        th = th;
        if ((th instanceof C1324de) == false) goto L44;
        th = ((C1324de) th).f4800a;
    L44:
        r43.mo264f(new C0297Gw(th));
        throw th;
    L8:
        if (r22.mo24m(C1456gf.f5158b) != null) goto L10;
        r22 = r22.mo23l(r42);
        goto L10
    }

    /* JADX INFO: renamed from: H */
    public static int m1129H(Object r6, InterfaceC2253mx r7, byte[] r8, int r9, int r10, C0091C4 r11) {
        int r0 = r9 + 1;
        int r92 = r8[r9];
        if (r92 >= 0) goto L5;
        r0 = m1151s(r92, r8, r0, r11);
        r92 = r11.f204a;
    L5:
        int r3 = r0;
        if (r92 < 0) goto L12;
        if (r92 > (r10 - r3)) goto L12;
        int r4 = r3 + r92;
        r7.mo1077g(r6, r8, r3, r4, r11);
        r11.f206c = r6;
        return r4;
    L12:
        throw C0673Pl.m1370g();
    }

    /* JADX INFO: renamed from: K */
    public static void m1130K(Context r5, String r6) {
        Object r0 = f1896a;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r6.equals("") == false) goto L32;
        r5.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L32:
        FileOutputStream r52 = r5.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);     // Catch: Throwable -> L9 FileNotFoundException -> L26
        XmlSerializer r1 = Xml.newSerializer();     // Catch: Throwable -> L9
        r1.setOutput(r52, null);     // Catch: Throwable -> L18 Exception -> L22
        r1.startDocument("UTF-8", Boolean.TRUE);     // Catch: Throwable -> L18 Exception -> L22
        r1.startTag(null, "locales");     // Catch: Throwable -> L18 Exception -> L22
        r1.attribute(null, "application_locales", r6);     // Catch: Throwable -> L18 Exception -> L22
        r1.endTag(null, "locales");     // Catch: Throwable -> L18 Exception -> L22
        r1.endDocument();     // Catch: Throwable -> L18 Exception -> L22
        if (r52 != null) goto L37;
    L24:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L37:
        r52.close();     // Catch: Throwable -> L9 IOException -> L30
        goto L24
    L22:
        if (r52 == null) goto L24;
    L18:
        th = move-exception;
        if (r52 != null) goto L35;
    L21:
        throw th;     // Catch: Throwable -> L9
    L35:
        r52.close();     // Catch: Throwable -> L9 IOException -> L31
        goto L21
    }

    /* JADX INFO: renamed from: L */
    public static String m1131L(Context r8) {
        Object r0 = f1896a;
        monitor-enter(r0);
        String r1 = "";
        FileInputStream r2 = r8.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L26 FileNotFoundException -> L39
        goto L40
    L51:
        XmlPullParser r3 = Xml.newPullParser();     // Catch: Throwable -> L14 Throwable -> L31
        r3.setInput(r2, "UTF-8");     // Catch: Throwable -> L14 Throwable -> L31
        int r4 = r3.getDepth();     // Catch: Throwable -> L14 Throwable -> L31
    L7:
        int r5 = r3.next();     // Catch: Throwable -> L14 Throwable -> L31
        if (r5 == 1) goto L23;
        if (r5 == 3) goto L12;
    L16:
        if (r5 == 3) goto L7;
        if (r5 == 4) goto L7;
        if (r3.getName().equals("locales") == false) goto L7;
        r1 = r3.getAttributeValue(null, "application_locales");     // Catch: Throwable -> L14 Throwable -> L31
    L12:
        if (r3.getDepth() > r4) goto L16;
    L23:
        if (r2 == null) goto L34;
    L45:
        r2.close();     // Catch: Throwable -> L26 IOException -> L43
    L34:
        if (r1.isEmpty() == false) goto L37;
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L26
    L37:
        monitor-exit(r0);     // Catch: Throwable -> L26
        return r1;
    L31:
        if (r2 == null) goto L34;
    L14:
        th = move-exception;
        if (r2 != null) goto L49;
    L30:
        throw th;     // Catch: Throwable -> L26
    L49:
        r2.close();     // Catch: Throwable -> L26 IOException -> L44
    L26:
        th = move-exception;
        throw th;
    L40:
        return "";
    }

    /* JADX INFO: renamed from: M */
    public static void m1132M(ViewGroup r6) {
        int r0 = r6.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        View r2 = r6.getChildAt(r1);
        if ((r2 instanceof TextView) == false) goto L8;
        TextView r22 = (TextView) r2;
        HashMap r3 = AbstractC0999XA.f3193a;
        int r32 = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-167885976631349L));
        r22.setTag(R.id.tag_textview_color_ban, null);
        r22.setTextColor(r32);
        r22.setTag(R.id.tag_textview_color_ban, TextView.class);
    L10:
        r1 = r1 + 1;
        goto L3
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L10;
        m1132M((ViewGroup) r2);
        goto L10
    }

    /* JADX INFO: renamed from: N */
    public static final Object m1133N(AbstractC1217bc r3, Function2 r4, InterfaceC0190Eb r5) {
        InterfaceC1137ac r0 = r5.mo263e();
        r3.getClass();
        InterfaceC1137ac r32 = r0.mo23l(r3);
        InterfaceC1332dm r1 = (InterfaceC1332dm) r32.mo24m(C1456gf.f5162f);
        if (r1 != null) goto L5;
    L9:
        if (r32 != r0) goto L12;
        C2339ox r02 = new C2339ox(r5, r32);
        return AbstractC0148Dc.m286t(r02, r02, r4);
    L12:
        C1456gf r12 = C1456gf.f5158b;
        boolean r03 = m1134a(r32.mo24m(r12), r0.mo24m(r12));
        C1462gl r13 = null;
        if (r03 == false) goto L21;
        C2664wC r04 = new C2664wC(r5, r32);
        InterfaceC1137ac r33 = r04.f8910c;
        Object r52 = AbstractC0295Gu.m604E(r33, null);
        Object r42 = AbstractC0148Dc.m286t(r04, r04, r4);     // Catch: Throwable -> L18
        AbstractC0295Gu.m601B(r33, r52);
        return r42;
    L18:
        th = move-exception;
        AbstractC0295Gu.m601B(r33, r52);
        throw th;
    L21:
        C1411fe r05 = new C1411fe(r5, r32);
        AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(AbstractC0628Oj.m1242k(r05, r05, r4)), C0829TC.f2620a);     // Catch: Throwable -> L47
        AtomicIntegerFieldUpdater r34 = C1411fe.f4992e;
    L24:
        int r43 = r34.get(r05);
        if (r43 != 0) goto L27;
        if (r34.compareAndSet(r05, 0, 1) == false) goto L24;
        return EnumC1453gc.f5148a;
    L27:
        if (r43 != 2) goto L42;
        Object r35 = C2152km.f7529a.get(r05);
        if ((r35 instanceof C1462gl) == false) goto L31;
        r13 = (C1462gl) r35;
    L31:
        if (r13 == null) goto L37;
        InterfaceC1418fl r44 = r13.f5181a;
        if (r44 == null) goto L37;
        r35 = r44;
    L37:
        if ((r35 instanceof C0189Ea) == true) goto L40;
        return r35;
    L40:
        throw ((C0189Ea) r35).f575a;
    L42:
        throw new IllegalStateException("Already suspended");
    L47:
        th = th;
        if ((th instanceof C1324de) == false) goto L51;
        th = ((C1324de) th).f4800a;
    L51:
        r05.mo264f(new C0297Gw(th));
        throw th;
    L5:
        if (r1.mo1745d() == true) goto L9;
        throw r1.mo1748p();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1134a(Object r0, Object r1) {
        if (r0 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r0.equals(r1);
    }

    /* JADX INFO: renamed from: b */
    public static final void m1135b(AbstractC2580uE r2, C1518hx r3, AbstractC0760Rn r4) {
        HashMap r1 = r2.f8938a;
        if (r1 != null) goto L5;
        Object r22 = null;
    L8:
        C1238bx r23 = (C1238bx) r22;
        if (r23 == null) goto L24;
        boolean r0 = r23.f4209c;
        if (r0 == true) goto L30;
        if (r0 == true) goto L23;
        r23.f4209c = true;
        r4.mo1555a(r23);
        r3.m2898c(r23.f4207a, r23.f4208b.f4096e);
        EnumC0675Pn r24 = ((C1185ao) r4).f4064c;
        if (r24 != EnumC0675Pn.f2148b) goto L16;
    L20:
        r3.m2899d();
        return;
    L16:
        if (r24.m1371a(EnumC0675Pn.f2150d) == true) goto L20;
        r4.mo1555a(new C1366ed(1, r4, r3));
        return;
    L23:
        throw new IllegalStateException("Already attached to lifecycleOwner");
    L30:
        return;
    L24:
        return;
    L5:
        monitor-enter(r1);
        r22 = r2.f8938a.get("androidx.lifecycle.savedstate.vm.tag");     // Catch: Throwable -> L25
        monitor-exit(r1);     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public static void m1136d(int r3, int r4, int r5) {
        if (r3 < 0) goto L10;
        if (r4 > r5) goto L10;
        if (r3 > r4) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("fromIndex: " + r3 + " > toIndex: " + r4);
    L10:
        throw new IndexOutOfBoundsException("fromIndex: " + r3 + ", toIndex: " + r4 + ", size: " + r5);
    }

    /* JADX INFO: renamed from: e */
    public static int m1137e(int r0, int r1, int r2) {
        if (r0 >= r1) goto L4;
        return r1;
    L4:
        if (r0 <= r2) goto L6;
        return r2;
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: f */
    public static final void m1138f(Closeable r0, Throwable r1) {
        if (r0 == null) goto L13;
        if (r1 != null) goto L11;
        r0.close();
        return;
    L11:
        r0.close();     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        AbstractC0148Dc.m268b(r1, th);
        return;
    }

    /* JADX INFO: renamed from: g */
    public static int m1139g(int r0, int r1) {
        if (r0 >= r1) goto L5;
        return -1;
    L5:
        if (r0 != r1) goto L8;
        return 0;
    L8:
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static long[] m1140h(Serializable r4) {
        if ((r4 instanceof int[]) == false) goto L10;
        int[] r42 = (int[]) r4;
        long[] r0 = new long[r42.length];
        int r1 = 0;
    L6:
        if (r1 >= r42.length) goto L8;
        r0[r1] = r42[r1];
        r1 = r1 + 1;
        goto L6
    L8:
        return r0;
    L10:
        if ((r4 instanceof long[]) == true) goto L12;
        return null;
    L12:
        return (long[]) r4;
    }

    /* JADX INFO: renamed from: i */
    public static LinearLayout m1141i(Context r10) {
        AbstractC0295Gu.m625r(-92234422679605L);
        FrameLayout r0 = new FrameLayout(r10);
        int r2 = -1;
        r0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        r0.setMinimumHeight(AbstractC0295Gu.m616i(56));
        r0.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
        TextView r1 = new TextView(r10);
        r1.setTextSize(1, 16.0f);
        r1.setText(AbstractC0295Gu.m625r(-92268782417973L));
        r1.setId(android.R.id.title);
        HashMap r7 = AbstractC0999XA.f3193a;
        if (C1517hw.m2894f(r10) == false) goto L5;
        int r72 = -1;
    L6:
        r1.setTextColor(r72);
        TextView r73 = new TextView(r10);
        r73.setTextSize(1, 16.0f);
        r73.setText(AbstractC0295Gu.m625r(-92333206927413L));
        r73.setGravity(5);
        r73.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r73.setId(android.R.id.summary);
        if (C1517hw.m2894f(r10) == false) goto L9;
        int r8 = -1929379841;
    L10:
        r73.setTextColor(r8);
        FrameLayout.LayoutParams r82 = new FrameLayout.LayoutParams(-1, -2);
        r82.gravity = 19;
        r0.addView(r1, r82);
        FrameLayout.LayoutParams r12 = new FrameLayout.LayoutParams(-1, -2);
        r12.gravity = 21;
        r0.addView(r73, r12);
        LinearLayout r13 = new LinearLayout(r10);
        r13.setOrientation(1);
        r13.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r13.addView(new Space(r10), -1, AbstractC0295Gu.m616i(10));
        r13.addView(r0, -1, -2);
        r13.addView(new Space(r10), -1, AbstractC0295Gu.m616i(5));
        C0183EA.f539a.getClass();
        if (C0183EA.m373a().equals(AbstractC0295Gu.m625r(-91865055492149L)) == false) goto L20;
        StateListDrawable r3 = new StateListDrawable();
        int[] r4 = {android.R.attr.state_pressed};
        if (C1517hw.m2894f(r10) == false) goto L15;
        int r6 = -14408668;
    L16:
        r3.addState(r4, new ColorDrawable(r6));
        int[] r42 = new int[0];
        if (C1517hw.m2894f(r10) == false) goto L19;
        r2 = -15132391;
    L19:
        r3.addState(r42, new ColorDrawable(r2));
        r0.setBackground(r3);
        goto L20
    L15:
        r6 = -1710619;
    L20:
        r13.setOnClickListener(new ViewOnClickListenerC1477h(9, r0));
        return r13;
    L9:
        r8 = -1946157056;
        goto L10
    L5:
        r72 = -16777216;
        goto L6
    }

    /* JADX INFO: renamed from: j */
    public static void m1142j(ViewGroup r4) {
        AbstractC0295Gu.m625r(-167469364803637L);
        m1132M(r4);
        ArrayList<View> r0 = new ArrayList();
        r4.findViewsWithText(r0, AbstractC0295Gu.m625r(-167512314476597L), 2);
        if (r0.isEmpty() == true) goto L11;
        View r42 = r0.get(0);
        AbstractC0295Gu.m625r(-167525199378485L);
        r0.clear();
        ViewParent r43 = r42.getParent();
        AbstractC0295Gu.m625r(-167563854084149L);
        View r44 = ((LinearLayout) r43).getChildAt(1);
        AbstractC0295Gu.m625r(-167293271144501L);
        TextView r45 = (TextView) r44;
        HashMap r02 = AbstractC0999XA.f3193a;
        Drawable r03 = C1517hw.m2890b(AbstractC0295Gu.m625r(-168105019963445L));
        if (r45 == null) goto L7;
        r45.setTag(R.id.tag_view_bg_ban, null);
        r45.setBackground(r03);
        r45.setTag(R.id.tag_view_bg_ban, Object.class);
    L7:
        int r04 = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-167731357808693L));
        if (r45 == null) goto L12;
        r45.setTag(R.id.tag_textview_color_ban, null);
        r45.setTextColor(r04);
        r45.setTag(R.id.tag_textview_color_ban, TextView.class);
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m1143k(String r6) {
        if ((r6.length() % 2) != 0) goto L14;
        int r0 = r6.length() / 2;
        byte[] r1 = new byte[r0];
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L12;
        int r3 = r2 * 2;
        int r4 = Character.digit(r6.charAt(r3), 16);
        int r32 = Character.digit(r6.charAt(r3 + 1), 16);
        if (r4 == (-1)) goto L11;
        if (r32 == (-1)) goto L11;
        r1[r2] = (byte) ((r4 * 16) + r32);
        r2 = r2 + 1;
    L11:
        throw new IllegalArgumentException("input is not hexadecimal");
    L12:
        return r1;
    L14:
        throw new IllegalArgumentException("Expected a string of even length");
    }

    /* JADX INFO: renamed from: l */
    public static int m1144l(byte[] r2, int r3, C0091C4 r4) {
        int r32 = m1152t(r2, r3, r4);
        int r0 = r4.f204a;
        if (r0 < 0) goto L14;
        if (r0 > (r2.length - r32)) goto L12;
        if (r0 != 0) goto L9;
        r4.f206c = AbstractC2744y6.f9369b;
        return r32;
    L9:
        r4.f206c = AbstractC2744y6.m5328c(r2, r32, r0);
        return r32 + r0;
    L12:
        throw C0673Pl.m1370g();
    L14:
        throw C0673Pl.m1368e();
    }

    /* JADX INFO: renamed from: m */
    public static int m1145m(int r2, byte[] r3) {
        int r0 = ((r3[r2] & 255) | ((r3[r2 + 1] & 255) << 8)) | ((r3[r2 + 2] & 255) << 16);
        return ((r3[r2 + 3] & 255) << 24) | r0;
    }

    /* JADX INFO: renamed from: n */
    public static long m1146n(int r7, byte[] r8) {
        long r0 = ((((((((long) r8[r7]) & 255) | ((((long) r8[r7 + 1]) & 255) << 8)) | ((((long) r8[r7 + 2]) & 255) << 16)) | ((((long) r8[r7 + 3]) & 255) << 24)) | ((((long) r8[r7 + 4]) & 255) << 32)) | ((((long) r8[r7 + 5]) & 255) << 40)) | ((((long) r8[r7 + 6]) & 255) << 48);
        return ((((long) r8[r7 + 7]) & 255) << 56) | r0;
    }

    /* JADX INFO: renamed from: o */
    public static int m1147o(InterfaceC2253mx r7, int r8, byte[] r9, int r10, int r11, InterfaceC0458Kl r12, C0091C4 r13) {
        Object r0 = r7.mo1080j();
        InterfaceC2253mx r1 = r7;
        byte[] r2 = r9;
        int r4 = r11;
        C0091C4 r5 = r13;
        int r72 = m1129H(r0, r1, r2, r10, r4, r5);
        r1.mo1074d(r0);
        r5.f206c = r0;
        r12.add(r0);
    L3:
        if (r72 >= r4) goto L8;
        C0091C4 r6 = r5;
        int r52 = r4;
        int r42 = m1152t(r2, r72, r6);
        if (r8 != r6.f204a) goto L8;
        byte[] r3 = r2;
        InterfaceC2253mx r22 = r1;
        Object r14 = r22.mo1080j();
        r72 = m1129H(r14, r22, r3, r42, r52, r6);
        r1 = r22;
        r2 = r3;
        r4 = r52;
        r5 = r6;
        r1.mo1074d(r14);
        r5.f206c = r14;
        r12.add(r14);
    L8:
        return r72;
    }

    /* JADX INFO: renamed from: p */
    public static int m1148p(byte[] r3, int r4, C0091C4 r5) {
        int r42 = m1152t(r3, r4, r5);
        int r0 = r5.f204a;
        if (r0 < 0) goto L10;
        if (r0 != 0) goto L7;
        r5.f206c = "";
        return r42;
    L7:
        r5.f206c = new String(r3, r42, r0, AbstractC0501Ll.f1637a);
        return r42 + r0;
    L10:
        throw C0673Pl.m1368e();
    }

    /* JADX INFO: renamed from: q */
    public static int m1149q(byte[] r2, int r3, C0091C4 r4) {
        int r32 = m1152t(r2, r3, r4);
        int r0 = r4.f204a;
        if (r0 < 0) goto L10;
        if (r0 != 0) goto L7;
        r4.f206c = "";
        return r32;
    L7:
        r4.f206c = AbstractC2536tD.f8842a.mo1360i(r2, r32, r0);
        return r32 + r0;
    L10:
        throw C0673Pl.m1368e();
    }

    /* JADX INFO: renamed from: r */
    public static int m1150r(int r7, byte[] r8, int r9, int r10, C1001XC r11, C0091C4 r12) {
        if ((r7 >>> 3) == 0) goto L49;
        int r0 = r7 & 7;
        if (r0 != 0) goto L7;
        int r82 = m1154v(r8, r9, r12);
        r11.m1894d(r7, Long.valueOf(r12.f205b));
        return r82;
    L7:
        if (r0 != 1) goto L9;
        r11.m1894d(r7, Long.valueOf(m1146n(r9, r8)));
        return r9 + 8;
    L9:
        if (r0 != 2) goto L11;
        int r83 = m1152t(r8, r9, r12);
        int r92 = r12.f204a;
        if (r92 < 0) goto L43;
        if (r92 > (r8.length - r83)) goto L41;
        if (r92 != 0) goto L37;
        r11.m1894d(r7, AbstractC2744y6.f9369b);
    L39:
        return r83 + r92;
    L37:
        r11.m1894d(r7, AbstractC2744y6.m5328c(r8, r83, r92));
        goto L39
    L41:
        throw C0673Pl.m1370g();
    L43:
        throw C0673Pl.m1368e();
    L11:
        if (r0 != 3) goto L13;
        C1001XC r4 = C1001XC.m1891c();
        int r6 = (r7 & (-8)) | 4;
        int r02 = 0;
    L19:
        if (r9 >= r10) goto L25;
        int r2 = m1152t(r8, r9, r12);
        r02 = r12.f204a;
        if (r02 == r6) goto L22;
        r9 = m1150r(r02, r8, r2, r10, r4, r12);
        goto L19
    L22:
        r9 = r2;
    L25:
        if (r9 > r10) goto L30;
        if (r02 != r6) goto L30;
        r11.m1894d(r7, r4);
        return r9;
    L30:
        throw C0673Pl.m1369f();
    L13:
        if (r0 != 5) goto L17;
        r11.m1894d(r7, Integer.valueOf(m1145m(r9, r8)));
        return r9 + 4;
    L17:
        throw C0673Pl.m1364a();
    L49:
        throw C0673Pl.m1364a();
    }

    /* JADX INFO: renamed from: s */
    public static int m1151s(int r2, byte[] r3, int r4, C0091C4 r5) {
        int r22 = r2 & 127;
        int r0 = r4 + 1;
        byte r1 = r3[r4];
        if (r1 < 0) goto L6;
        r5.f204a = r22 | (r1 << 7);
        return r0;
    L6:
        int r23 = r22 | ((r1 & 127) << 7);
        int r12 = r4 + 2;
        byte r02 = r3[r0];
        if (r02 < 0) goto L10;
        r5.f204a = r23 | (r02 << 14);
        return r12;
    L10:
        int r24 = r23 | ((r02 & 127) << 14);
        int r03 = r4 + 3;
        byte r13 = r3[r12];
        if (r13 < 0) goto L14;
        r5.f204a = r24 | (r13 << 21);
        return r03;
    L14:
        int r25 = r24 | ((r13 & 127) << 21);
        int r42 = r4 + 4;
        byte r04 = r3[r03];
        if (r04 < 0) goto L18;
        r5.f204a = r25 | (r04 << 28);
        return r42;
    L18:
        int r26 = r25 | ((r04 & 127) << 28);
    L19:
        int r05 = r42 + 1;
        if (r3[r42] >= 0) goto L22;
        r42 = r05;
        goto L19
    L22:
        r5.f204a = r26;
        return r05;
    }

    /* JADX INFO: renamed from: t */
    public static int m1152t(byte[] r1, int r2, C0091C4 r3) {
        int r0 = r2 + 1;
        byte r22 = r1[r2];
        if (r22 < 0) goto L7;
        r3.f204a = r22;
        return r0;
    L7:
        return m1151s(r22, r1, r0, r3);
    }

    /* JADX INFO: renamed from: u */
    public static int m1153u(int r2, byte[] r3, int r4, int r5, InterfaceC0458Kl r6, C0091C4 r7) {
        AbstractC0071Bl r62 = (AbstractC0071Bl) r6;
        int r42 = m1152t(r3, r4, r7);
        r62.m119b(r7.f204a);
    L3:
        if (r42 >= r5) goto L8;
        int r0 = m1152t(r3, r42, r7);
        if (r2 != r7.f204a) goto L8;
        r42 = m1152t(r3, r0, r7);
        r62.m119b(r7.f204a);
    L8:
        return r42;
    }

    /* JADX INFO: renamed from: v */
    public static int m1154v(byte[] r9, int r10, C0091C4 r11) {
        int r0 = r10 + 1;
        long r1 = r9[r10];
        if (r1 < 0) goto L6;
        r11.f205b = r1;
        return r0;
    L6:
        int r102 = r10 + 2;
        byte r02 = r9[r0];
        long r12 = (r1 & 127) | (((long) (r02 & 127)) << 7);
        int r3 = 7;
    L7:
        if (r02 >= 0) goto L9;
        int r03 = r102 + 1;
        byte r103 = r9[r102];
        r3 = r3 + 7;
        r12 = r12 | (((long) (r103 & 127)) << r3);
        r02 = r103;
        r102 = r03;
        goto L7
    L9:
        r11.f205b = r12;
        return r102;
    }

    /* JADX INFO: renamed from: w */
    public static String m1155w(byte[] r6) {
        StringBuilder r0 = new StringBuilder(r6.length * 2);
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        int r3 = r6[r2] & 255;
        r0.append("0123456789abcdef".charAt(r3 / 16));
        r0.append("0123456789abcdef".charAt(r3 % 16));
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.toString();
    }

    /* JADX INFO: renamed from: x */
    public static Map m1156x() {
        return AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-746564100290613L), AbstractC0295Gu.m625r(-746121718659125L)), new C0208Et(AbstractC0295Gu.m625r(-744648544876597L), AbstractC0295Gu.m625r(-744734444222517L)), new C0208Et(AbstractC0295Gu.m625r(-744889063045173L), AbstractC0295Gu.m625r(-744459566315573L)), new C0208Et(AbstractC0295Gu.m625r(-744622775072821L), AbstractC0295Gu.m625r(-745279905069109L)), new C0208Et(AbstractC0295Gu.m625r(-745434523891765L), AbstractC0295Gu.m625r(-744962077489205L)), new C0208Et(AbstractC0295Gu.m625r(-745116696311861L), AbstractC0295Gu.m625r(-743549033248821L)), new C0208Et(AbstractC0295Gu.m625r(-743703652071477L), AbstractC0295Gu.m625r(-743802436319285L)), new C0208Et(AbstractC0295Gu.m625r(-743420184229941L), AbstractC0295Gu.m625r(-743536148346933L)), new C0208Et(AbstractC0295Gu.m625r(-744249112918069L), AbstractC0295Gu.m625r(-744356487100469L)), new C0208Et(AbstractC0295Gu.m625r(-743961350109237L), AbstractC0295Gu.m625r(-744047249455157L)), new C0208Et(AbstractC0295Gu.m625r(-742608435410997L), AbstractC0295Gu.m625r(-742174643714101L)), new C0208Et(AbstractC0295Gu.m625r(-742385097111605L), AbstractC0295Gu.m625r(-742402276980789L))});
    }

    /* JADX INFO: renamed from: y */
    public static Map m1157y() {
        return AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-756859136899125L), AbstractC0295Gu.m625r(-756923561408565L)), new C0208Et(AbstractC0295Gu.m625r(-756511244548149L), AbstractC0295Gu.m625r(-756588553959477L)), new C0208Et(AbstractC0295Gu.m625r(-756730287880245L), AbstractC0295Gu.m625r(-757348763170869L)), new C0208Et(AbstractC0295Gu.m625r(-757507676960821L), AbstractC0295Gu.m625r(-757048115460149L)), new C0208Et(AbstractC0295Gu.m625r(-757207029250101L), AbstractC0295Gu.m625r(-773240142166069L)), new C0208Et(AbstractC0295Gu.m625r(-773399055956021L), AbstractC0295Gu.m625r(-773484955301941L)), new C0208Et(AbstractC0295Gu.m625r(-773085523343413L), AbstractC0295Gu.m625r(-773180012623925L)), new C0208Et(AbstractC0295Gu.m625r(-773888682227765L), AbstractC0295Gu.m625r(-773974581573685L)), new C0208Et(AbstractC0295Gu.m625r(-773575149615157L), AbstractC0295Gu.m625r(-773669638895669L)), new C0208Et(AbstractC0295Gu.m625r(-772183580211253L), AbstractC0295Gu.m625r(-772248004720693L)), new C0208Et(AbstractC0295Gu.m625r(-772402623543349L), AbstractC0295Gu.m625r(-771947357009973L)), new C0208Et(AbstractC0295Gu.m625r(-772114860734517L), AbstractC0295Gu.m625r(-772771990730805L)), new C0208Et(AbstractC0295Gu.m625r(-772905134716981L), AbstractC0295Gu.m625r(-772432688314421L)), new C0208Et(AbstractC0295Gu.m625r(-772570127267893L), AbstractC0295Gu.m625r(-772668911515701L)), new C0208Et(AbstractC0295Gu.m625r(-771182852831285L), AbstractC0295Gu.m625r(-770761946036277L)), new C0208Et(AbstractC0295Gu.m625r(-770899384989749L), AbstractC0295Gu.m625r(-770968104466485L)), new C0208Et(AbstractC0295Gu.m625r(-771651004266549L), AbstractC0295Gu.m625r(-771719723743285L)), new C0208Et(AbstractC0295Gu.m625r(-771852867729461L), AbstractC0295Gu.m625r(-771419076032565L))});
    }

    /* JADX INFO: renamed from: z */
    public static ColorStateList m1158z(Drawable r2) {
        if ((r2 instanceof ColorDrawable) == false) goto L7;
        return ColorStateList.valueOf(((ColorDrawable) r2).getColor());
    L7:
        if (Build.VERSION.SDK_INT >= 29) goto L9;
        return null;
    L9:
        if (AbstractC0688Q.m1417u(r2) == true) goto L11;
        return null;
    L11:
        return AbstractC0688Q.m1398b(AbstractC0688Q.m1401e(r2));
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo1159I(int r1);

    /* JADX INFO: renamed from: J */
    public abstract void mo1160J(Typeface r1);

    /* JADX INFO: renamed from: c */
    public void m1161c(int r4) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2371pe(r4, 1, this));
    }
}
