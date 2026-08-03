package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: UB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0871UB {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1293cr f2754a = null;

    /* JADX INFO: renamed from: b */
    public static final C0161Dp f2755b = null;

    /* JADX INFO: renamed from: c */
    public static Paint f2756c;

    static {
        AbstractC0628Oj.m1239c("TypefaceCompat static init");
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 31) goto L6;
        f2754a = new C1000XB();
    L9:
        f2755b = new C0161Dp(16);
        f2756c = null;
        Trace.endSection();
        return;
    L6:
        if (r0 < 29) goto L8;
        f2754a = new C0957WB();
        goto L9
    L8:
        f2754a = new C0914VB();
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static Typeface m1707a(Context r14, InterfaceC0883Uh r15, Resources r16, int r17, String r18, int r19, int r20, AbstractC0585Nj r21, boolean r22) {
        int r3 = 15;
        int r6 = -3;
        if ((r15 instanceof C1012Xh) == false) goto L107;
        C1012Xh r0 = (C1012Xh) r15;
        String r2 = r0.f3222d;
        Typeface r7 = null;
        int r8 = 1;
        boolean r9 = false;
        Object[] r92 = 0;
        Object[] r93 = 0;
        Object[] r94 = 0;
        Object[] r95 = 0;
        if (TextUtils.isEmpty(r2) == true) goto L9;
        Typeface r23 = m1709c(r2);
        if (r23 == null) goto L9;
    L43:
        if (r23 == null) goto L48;
        if (r21 == null) goto L46;
        new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(r3, r21, r23));
    L46:
        f2755b.m311j(m1708b(r16, r17, r18, r19, r20), r23);
        return r23;
    L48:
        if (r22 == true) goto L50;
        if (r21 == null) goto L51;
    L52:
        Object[] r24 = false;
    L56:
        if (r22 == false) goto L58;
        int r10 = r0.f3220b;
    L59:
        Handler r5 = new Handler(Looper.getMainLooper());
        C1017Xm r11 = new C1017Xm(17, r9);
        r11.f3226b = r21;
        ArrayList r02 = r0.f3219a;
        ExecutorC1341dw r1 = new ExecutorC1341dw(r5);
        C0649P3 r12 = new C0649P3(9, r11, r1);
        if (r24 == true) goto L62;
        String r25 = AbstractC0840Th.m1661a(r20, r02);
        Typeface r32 = (Typeface) AbstractC0840Th.f2669a.m307f(r25);
        if (r32 == null) goto L88;
        r1.execute(new RunnableC0044B0(r11, r32, r8, r93 == true ? 1 : 0));
        r7 = r32;
    L104:
        Typeface r142 = r7;
    L112:
        if (r142 == null) goto L114;
        f2755b.m311j(m1708b(r16, r17, r18, r19, r20), r142);
    L114:
        return r142;
    L88:
        C0754Rh r13 = new C0754Rh(r92 == true ? 1 : 0, r12);
        Object r52 = AbstractC0840Th.f2671c;
        monitor-enter(r52);
        C2520sy r33 = AbstractC0840Th.f2672d;     // Catch: Throwable -> L95
        ArrayList r62 = (ArrayList) r33.get(r25);     // Catch: Throwable -> L95
        if (r62 == null) goto L97;
        r62.add(r13);     // Catch: Throwable -> L95
        monitor-exit(r52);     // Catch: Throwable -> L95
    L116:
        goto L104
    L97:
        ArrayList r63 = new ArrayList();     // Catch: Throwable -> L95
        r63.add(r13);     // Catch: Throwable -> L95
        r33.put(r25, r63);     // Catch: Throwable -> L95
        monitor-exit(r52);     // Catch: Throwable -> L95
        CallableC0712Qh r03 = new CallableC0712Qh(r25, r14, r02, r20, 1);
        ThreadPoolExecutor r143 = AbstractC0840Th.f2670b;
        C0754Rh r26 = new C0754Rh(r8, r25);
        if (Looper.myLooper() != null) goto L102;
        Handler r110 = new Handler(Looper.getMainLooper());
    L103:
        RunnableC1385ew r34 = new RunnableC1385ew();
        r34.f4932b = r03;
        r34.f4933c = r26;
        r34.f4934d = r110;
        r143.execute(r34);
        goto L116
    L102:
        r110 = new Handler();
    L95:
        th = move-exception;
        throw th;
    L62:
        if (r02.size() > 1) goto L84;
        C0583Nh r04 = (C0583Nh) r02.get(0);
        C0161Dp r27 = AbstractC0840Th.f2669a;
        ArrayList r53 = new ArrayList(1);
        Object r28 = new Object[]{r04}[0];
        Objects.requireNonNull(r28);
        r53.add(r28);
        String r29 = AbstractC0840Th.m1661a(r20, Collections.unmodifiableList(r53));
        Typeface r54 = (Typeface) AbstractC0840Th.f2669a.m307f(r29);
        if (r54 == null) goto L66;
        r1.execute(new RunnableC0044B0(r11, r54, r8, r95 == true ? 1 : 0));
        r7 = r54;
        goto L104
    L66:
        if (r10 != (-1)) goto L119;
        ArrayList r111 = new ArrayList(1);
        Object r05 = new Object[]{r04}[0];
        Objects.requireNonNull(r05);
        r111.add(r05);
        C0797Sh r144 = AbstractC0840Th.m1662b(r29, r14, Collections.unmodifiableList(r111), r20);
        r12.m1281L(r144);
        r7 = r144.f2498a;
        goto L104
    L119:
    L82:
        ((ExecutorC1341dw) r12.f2090c).execute(new RunnableC0308H6(r6, r94 == true ? 1 : 0, (C1017Xm) r12.f2089b));
        goto L104
    L122:
        C0797Sh r145 = (C0797Sh) AbstractC0840Th.f2670b.submit(new CallableC0712Qh(r29, r14, r04, r20, 0)).get(r10, TimeUnit.MILLISECONDS);     // Catch: InterruptedException -> L82
        r12.m1281L(r145);     // Catch: InterruptedException -> L82
        r7 = r145.f2498a;     // Catch: InterruptedException -> L82
        goto L104
    L73:
        e = move-exception;
        throw e;     // Catch: InterruptedException -> L82
    L75:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: InterruptedException -> L82
    L78:
        throw new InterruptedException("timeout");     // Catch: InterruptedException -> L82
    L84:
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    L58:
        r10 = -1;
    L51:
        r24 = true;
        goto L56
    L50:
        if (r0.f3221c != 0) goto L52;
    L9:
        ArrayList r210 = r0.f3219a;
        if (r210.size() != 1) goto L13;
        r23 = m1709c(((C0583Nh) r210.get(0)).f1887e);
        goto L43
    L13:
        if (Build.VERSION.SDK_INT >= 31) goto L15;
    L14:
        r23 = null;
        goto L43
    L15:
        int r55 = 0;
    L17:
        if (r55 >= r210.size()) goto L22;
        if (m1709c(((C0583Nh) r210.get(r55)).f1887e) == null) goto L14;
        r55 = r55 + 1;
        goto L17
    L22:
        Typeface.CustomFallbackBuilder r102 = null;
        int r56 = 0;
    L24:
        if (r56 >= r210.size()) goto L42;
        C0583Nh r112 = (C0583Nh) r210.get(r56);
        if (r56 == (r210.size() - 1)) goto L28;
    L30:
        String r122 = r112.f1887e;
        String r113 = r112.f1888f;
        Font r123 = m1710d(m1709c(r122));
        if (r123 == null) goto L14;
        if (TextUtils.isEmpty(r113) == true) goto L120;
        FontFamily r114 = AbstractC0688Q.m1406j(AbstractC0688Q.m1405i(r123));
    L38:
        if (r102 != null) goto L40;
        r102 = AbstractC0688Q.m1399c(r114);
    L41:
        r56 = r56 + 1;
        goto L24
    L40:
        AbstractC0688Q.m1411o(r102, r114);
        goto L41
    L120:
        AbstractC0688Q.m1409m();     // Catch: IOException -> L115
        AbstractC0688Q.m1420x();     // Catch: IOException -> L115
        r114 = AbstractC0688Q.m1406j(AbstractC0688Q.m1405i(AbstractC0688Q.m1404h(AbstractC0688Q.m1403g(AbstractC0951W5.m1813f(r123), r113))));     // Catch: IOException -> L115
    L28:
        if (TextUtils.isEmpty(r112.f1888f) == false) goto L30;
        AbstractC0688Q.m1412p(r102, r112.f1887e);
    L42:
        r23 = AbstractC0688Q.m1400d(r102);
        goto L43
    L107:
        r142 = f2754a.mo1762q(r14, (C0926Vh) r15, r16, r20);
        if (r21 == null) goto L112;
        if (r142 == null) goto L111;
        new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(r3, r21, r142));
        goto L112
    L111:
        r21.m1161c(-3);
        goto L112
    }

    /* JADX INFO: renamed from: b */
    public static String m1708b(Resources r1, int r2, String r3, int r4, int r5) {
        return r1.getResourcePackageName(r2) + '-' + r3 + '-' + r4 + '-' + r2 + '-' + r5;
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m1709c(String r3) {
        if (r3 != null) goto L5;
    L12:
        return null;
    L5:
        if (r3.isEmpty() == true) goto L12;
        Typeface r32 = Typeface.create(r3, 0);
        Typeface r1 = Typeface.create(Typeface.DEFAULT, 0);
        if (r32 == null) goto L12;
        if (r32.equals(r1) == true) goto L12;
        return r32;
    }

    /* JADX INFO: renamed from: d */
    public static Font m1710d(Typeface r2) {
        if (f2756c != null) goto L5;
        f2756c = new Paint();
    L5:
        f2756c.setTextSize(10.0f);
        f2756c.setTypeface(r2);
        PositionedGlyphs r22 = AbstractC0951W5.m1815h(f2756c);
        if (AbstractC0951W5.m1809b(r22) != 0) goto L10;
        return null;
    L10:
        return AbstractC0951W5.m1814g(r22);
    }
}
