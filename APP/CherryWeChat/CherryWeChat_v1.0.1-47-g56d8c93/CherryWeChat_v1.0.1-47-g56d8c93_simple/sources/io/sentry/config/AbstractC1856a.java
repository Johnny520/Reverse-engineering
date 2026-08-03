package io.sentry.config;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Process;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.youth.banner.BuildConfig;
import io.github.cherrywechat.R;
import io.sentry.AbstractC1568C1;
import io.sentry.C1559A0;
import io.sentry.C1563B0;
import io.sentry.C1586H;
import io.sentry.C1649Y0;
import io.sentry.C1650Y1;
import io.sentry.C1832c;
import io.sentry.C1865e;
import io.sentry.C1981r;
import io.sentry.C2002t;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.android.core.C1672O;
import io.sentry.android.replay.AbstractC1759D;
import io.sentry.android.replay.viewhierarchy.AbstractC1816b;
import io.sentry.android.replay.viewhierarchy.AbstractC1820f;
import io.sentry.android.replay.viewhierarchy.C1817c;
import io.sentry.android.replay.viewhierarchy.C1818d;
import io.sentry.android.replay.viewhierarchy.C1819e;
import io.sentry.clientreport.C1850a;
import io.sentry.hints.InterfaceC1884b;
import io.sentry.hints.InterfaceC1886d;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1947D;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.util.AbstractC2034f;
import io.sentry.util.AbstractC2036h;
import io.sentry.util.AbstractC2039k;
import io.sentry.vendor.gson.internal.bind.util.AbstractC2048a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import p000.AbstractC0213Ey;
import p000.AbstractC0585Nj;
import p000.AbstractC0617OE;
import p000.AbstractC2374ph;
import p000.AbstractC2564tz;
import p000.C0208Et;
import p000.C2648vx;
import p000.RunnableC2445r8;

/* JADX INFO: renamed from: io.sentry.config.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1856a {
    /* JADX INFO: renamed from: A */
    public static ConcurrentHashMap m4045A(Map r3) {
        if (r3 == null) goto L12;
        ConcurrentHashMap r0 = new ConcurrentHashMap();
        Iterator r32 = r3.entrySet().iterator();
    L5:
        if (r32.hasNext() == false) goto L11;
        Map.Entry r1 = (Map.Entry) r32.next();
        if (r1.getKey() == null) goto L5;
        if (r1.getValue() == null) goto L5;
        r0.put(r1.getKey(), r1.getValue());
        goto L5
    L11:
        return r0;
    L12:
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static byte[] m4046B(String r4, long r5) {
        File r0 = new File(r4);
        if (r0.exists() == false) goto L51;
        if (r0.isFile() == false) goto L49;
        if (r0.canRead() == false) goto L47;
        if (r0.length() > r5) goto L45;
        FileInputStream r52 = new FileInputStream(r4);
        BufferedInputStream r42 = new BufferedInputStream(r52);     // Catch: Throwable -> L25
        ByteArrayOutputStream r6 = new ByteArrayOutputStream();     // Catch: Throwable -> L27
        byte[] r02 = new byte[1024];     // Catch: Throwable -> L18
    L15:
        int r1 = r42.read(r02);     // Catch: Throwable -> L18
        if (r1 == (-1)) goto L20;
        r6.write(r02, 0, r1);     // Catch: Throwable -> L18
        goto L15
    L20:
        byte[] r03 = r6.toByteArray();     // Catch: Throwable -> L18
        r6.close();     // Catch: Throwable -> L27
        r42.close();     // Catch: Throwable -> L25
        r52.close();
        return r03;
    L18:
        th = move-exception;
        r6.close();     // Catch: Throwable -> L31
    L33:
        throw th;     // Catch: Throwable -> L27
    L31:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L36
    L38:
        throw th;     // Catch: Throwable -> L25
    L36:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L41
    L43:
        throw th;
    L41:
        th = move-exception;
        th.addSuppressed(th);
        goto L43
    L45:
        throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", new Object[]{r4, Long.valueOf(r0.length()), Long.valueOf(r5)}));
    L47:
        throw new IOException(AbstractC2374ph.m4814k("Reading the item ", r4, " failed, because can't read the file."));
    L49:
        throw new IOException(AbstractC2374ph.m4814k("Reading path ", r4, " failed, because it's not a file."));
    L51:
        throw new IOException(AbstractC2374ph.m4814k("File '", r0.getName(), "' doesn't exists"));
    }

    /* JADX INFO: renamed from: C */
    public static String m4047C(File r3) {
        if (r3 != null) goto L4;
        return null;
    L4:
        if (r3.exists() == true) goto L6;
        return null;
    L6:
        if (r3.isFile() == true) goto L8;
        return null;
    L8:
        if (r3.canRead() == false) goto L37;
        StringBuilder r0 = new StringBuilder();
        BufferedReader r1 = new BufferedReader(new FileReader(r3));
        String r32 = r1.readLine();     // Catch: Throwable -> L14
        if (r32 == null) goto L16;
        r0.append(r32);     // Catch: Throwable -> L14
    L16:
        String r33 = r1.readLine();     // Catch: Throwable -> L14
        if (r33 == null) goto L20;
        r0.append("\n");     // Catch: Throwable -> L14
        r0.append(r33);     // Catch: Throwable -> L14
        goto L16
    L20:
        r1.close();
        return r0.toString();
    L14:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L24
    L26:
        throw th;
    L24:
        th = move-exception;
        th.addSuppressed(th);
        goto L26
    L37:
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static void m4048D(String r0, Object r1) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r0);
    }

    /* JADX INFO: renamed from: E */
    public static void m4049E(AbstractC1568C1 r1, C1901c r2, ILogger r3) {
        if (r1.f5604a == null) goto L5;
        r2.m4106p("event_id");
        r2.m4112w(r3, r1.f5604a);
    L5:
        r2.m4106p("contexts");
        r2.m4112w(r3, r1.f5605b);
        if (r1.f5606c == null) goto L9;
        r2.m4106p("sdk");
        r2.m4112w(r3, r1.f5606c);
    L9:
        if (r1.f5607d == null) goto L11;
        r2.m4106p("request");
        r2.m4112w(r3, r1.f5607d);
    L11:
        AbstractMap r0 = r1.f5608e;
        if (r0 == null) goto L17;
        if (r0.isEmpty() == true) goto L17;
        r2.m4106p("tags");
        r2.m4112w(r3, r1.f5608e);
    L17:
        if (r1.f5609f == null) goto L20;
        r2.m4106p(BuildConfig.BUILD_TYPE);
        r2.m4115z(r1.f5609f);
    L20:
        if (r1.f5610g == null) goto L23;
        r2.m4106p("environment");
        r2.m4115z(r1.f5610g);
    L23:
        if (r1.f5611h == null) goto L26;
        r2.m4106p("platform");
        r2.m4115z(r1.f5611h);
    L26:
        if (r1.f5612i == null) goto L29;
        r2.m4106p("user");
        r2.m4112w(r3, r1.f5612i);
    L29:
        if (r1.f5614k == null) goto L32;
        r2.m4106p("server_name");
        r2.m4115z(r1.f5614k);
    L32:
        if (r1.f5615l == null) goto L34;
        r2.m4106p("dist");
        r2.m4115z(r1.f5615l);
    L34:
        List r02 = r1.f5616m;
        if (r02 == null) goto L40;
        if (r02.isEmpty() == true) goto L40;
        r2.m4106p("breadcrumbs");
        r2.m4112w(r3, r1.f5616m);
    L40:
        if (r1.f5617n == null) goto L42;
        r2.m4106p("debug_meta");
        r2.m4112w(r3, r1.f5617n);
    L42:
        AbstractMap r03 = r1.f5618o;
        if (r03 != null) goto L45;
        return;
    L45:
        if (r03.isEmpty() == true) goto L49;
        r2.m4106p("extra");
        r2.m4112w(r3, r1.f5618o);
        return;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m4050F(C1586H r2) {
        if (InterfaceC1886d.class.isInstance(m4072s(r2)) == true) goto L7;
        if (InterfaceC1884b.class.isInstance(m4072s(r2)) == true) goto L7;
        return true;
    L7:
        if (C1672O.class.isInstance(m4072s(r2)) == true) goto L12;
        return false;
    L12:
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m4051G(C2046v2 r3, C2046v2 r4, boolean r5) {
        boolean r0 = AbstractC2034f.f7219a;
        if (r0 == true) goto L8;
        if ((r4.getVersionDetector() instanceof C1649Y0) == false) goto L8;
        r4.setVersionDetector(new C2002t(r4, 1));
    L8:
        if (r4.getVersionDetector().mo3789a() == false) goto L15;
        r4.getLogger().mo3680e(EnumC1657a2.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        if (r0 == false) goto L12;
        String r32 = "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions";
    L14:
        throw new IllegalStateException(AbstractC2374ph.m4814k("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", r32, " for more details."));
    L12:
        r32 = "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions";
        goto L14
    L15:
        if (r5 == false) goto L27;
        if (r3 != null) goto L20;
        return true;
    L20:
        if (r4.isForceInit() == false) goto L23;
        return true;
    L23:
        if (r3.getInitPriority().ordinal() > r4.getInitPriority().ordinal()) goto L26;
        return true;
    L26:
        return false;
    L27:
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static final void m4052H(ExecutorService r2, C2046v2 r3, String r4, Runnable r5) {
        if (Thread.currentThread().getName().startsWith("SentryReplayIntegration") == false) goto L11;
        r5.run();
        return;
    L11:
        r2.submit(new RunnableC2445r8(r5, r3, r4, 8));     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        r3.getLogger().mo3683r(EnumC1657a2.ERROR, AbstractC2374ph.m4814k("Failed to submit task ", r4, " to executor"), th);
    }

    /* JADX INFO: renamed from: I */
    public static final void m4053I(View r5, AbstractC1820f r6, C2046v2 r7) {
        if ((r5 instanceof ViewGroup) == true) goto L6;
        return;
    L6:
        if (AbstractC1816b.m3987b(r5, r6, r7) == true) goto L23;
        ViewGroup r52 = (ViewGroup) r5;
        if (r52.getChildCount() != 0) goto L11;
        return;
    L11:
        ArrayList r0 = new ArrayList(r52.getChildCount());
        int r1 = r52.getChildCount();
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L17;
        View r3 = r52.getChildAt(r2);
        if (r3 == null) goto L16;
        r52.indexOfChild(r3);
        AbstractC1820f r4 = m4064j(r3, r6, r7);
        r0.add(r4);
        m4053I(r3, r4, r7);
    L16:
        r2 = r2 + 1;
        goto L12
    L17:
        r6.f6588f = r0;
        return;
    }

    /* JADX INFO: renamed from: J */
    public static CopyOnWriteArrayList m4054J(CopyOnWriteArrayList r2) {
        ArrayList r0 = new ArrayList();
        if (r2 == null) goto L10;
        Iterator r22 = r2.iterator();
        if (r22.hasNext() == false) goto L10;
        r22.next().getClass();
        throw new ClassCastException();
    L10:
        return new CopyOnWriteArrayList(r0);
    }

    /* JADX INFO: renamed from: a */
    public static void m4055a(String r1) {
        C1650Y1.m3790d().m3791a(r1);
    }

    /* JADX INFO: renamed from: b */
    public static C2648vx m4056b(C2648vx r9) {
        if (((Double) r9.f9164c) == null) goto L5;
        return r9;
    L5:
        Double r6 = m4057c(null, (Double) r9.f9163b, (Boolean) r9.f9162a);
        return new C2648vx((Boolean) r9.f9162a, (Double) r9.f9163b, r6, (Boolean) r9.f9165d, (Double) r9.f9166e);
    }

    /* JADX INFO: renamed from: c */
    public static Double m4057c(Double r6, Double r7, Boolean r8) {
        if (r6 == null) goto L4;
        return r6;
    L4:
        double r0 = AbstractC2036h.m4180a().m4179c();
        if (r7 == null) goto L14;
        if (r8 == null) goto L14;
        if (r8.booleanValue() == true) goto L10;
        double r2 = r7.doubleValue();
        return Double.valueOf(((1.0d - r7.doubleValue()) * r0) + r2);
    L10:
        return Double.valueOf(r7.doubleValue() * r0);
    L14:
        return Double.valueOf(r0);
    }

    /* JADX INFO: renamed from: d */
    public static ClassLoader m4058d(ClassLoader r0) {
        if (r0 != null) goto L8;
        ClassLoader r02 = Thread.currentThread().getContextClassLoader();
        if (r02 == null) goto L7;
        return r02;
    L7:
        return ClassLoader.getSystemClassLoader();
    L8:
        return r0;
    }

    /* JADX INFO: renamed from: e */
    public static C1586H m4059e(Object r2) {
        C1586H r0 = new C1586H();
        r0.m3668c("sentry:typeCheckHint", r2);
        return r0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4060f(File r5) {
        if (r5 != null) goto L5;
    L22:
        return true;
    L5:
        if (r5.exists() == false) goto L22;
        if (r5.isFile() == true) goto L10;
        File[] r1 = r5.listFiles();
        if (r1 != null) goto L14;
        return true;
    L14:
        int r0 = r1.length;
        int r3 = 0;
    L15:
        if (r3 >= r0) goto L21;
        if (m4060f(r1[r3]) == false) goto L18;
        r3 = r3 + 1;
        goto L15
    L18:
        return false;
    L21:
        return r5.delete();
    L10:
        return r5.delete();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4061g(AbstractC1568C1 r5, String r6, C1559A0 r7, ILogger r8) {
        int r1 = 8;
        int r2 = 0;
        byte r4 = -1;
        switch(r6.hashCode()) {
            case -1840434063: goto L58;
            case -758770169: goto L54;
            case -567312220: goto L50;
            case -85904877: goto L46;
            case -51457840: goto L42;
            case 113722: goto L38;
            case 3083686: goto L34;
            case 3552281: goto L30;
            case 3599307: goto L26;
            case 96965648: goto L22;
            case 278118624: goto L18;
            case 1090594823: goto L14;
            case 1095692943: goto L10;
            case 1874684019: goto L6;
            default: goto L61;
        };
    L61:
        switch(r4) {
            case 0: goto L89;
            case 1: goto L87;
            case 2: goto L85;
            case 3: goto L83;
            case 4: goto L81;
            case 5: goto L79;
            case 6: goto L77;
            case 7: goto L75;
            case 8: goto L73;
            case 9: goto L71;
            case 10: goto L69;
            case 11: goto L67;
            case 12: goto L65;
            case 13: goto L63;
            default: goto L62;
        };
    L62:
        return false;
    L63:
        r5.f5611h = r7.m3561C();
        return true;
    L65:
        r5.f5607d = (C1964n) r7.m3559A(r8, new C1850a(18));
        return true;
    L67:
        r5.f5609f = r7.m3561C();
        return true;
    L69:
        r5.f5604a = (C1970t) r7.m3559A(r8, new C1850a(22));
        return true;
    L71:
        r5.f5618o = m4045A((Map) r7.m3582z());
        return true;
    L73:
        r5.f5612i = (C1948E) r7.m3559A(r8, new C1947D(r2));
        return true;
    L75:
        r5.f5608e = m4045A((Map) r7.m3582z());
        return true;
    L77:
        r5.f5615l = r7.m3561C();
        return true;
    L79:
        r5.f5606c = (C1968r) r7.m3559A(r8, new C1850a(20));
        return true;
    L81:
        r5.f5616m = r7.m3577u(r8, new C1865e(r2));
        return true;
    L83:
        r5.f5610g = r7.m3561C();
        return true;
    L85:
        r5.f5605b.mo4129k(C1850a.m4031c(r7, r8));
        return true;
    L87:
        r5.f5614k = r7.m3561C();
        return true;
    L89:
        r5.f5617n = (C1954d) r7.m3559A(r8, new C1850a(r1));
        return true;
    L6:
        if (r6.equals("platform") == false) goto L61;
        r4 = 13;
        goto L61
    L10:
        if (r6.equals("request") == false) goto L61;
        r4 = 12;
        goto L61
    L14:
        if (r6.equals(BuildConfig.BUILD_TYPE) == false) goto L61;
        r4 = 11;
        goto L61
    L18:
        if (r6.equals("event_id") == false) goto L61;
        r4 = 10;
        goto L61
    L22:
        if (r6.equals("extra") == false) goto L61;
        r4 = 9;
        goto L61
    L26:
        if (r6.equals("user") == false) goto L61;
        r4 = 8;
        goto L61
    L30:
        if (r6.equals("tags") == false) goto L61;
        r4 = 7;
        goto L61
    L34:
        if (r6.equals("dist") == false) goto L61;
        r4 = 6;
        goto L61
    L38:
        if (r6.equals("sdk") == false) goto L61;
        r4 = 5;
        goto L61
    L42:
        if (r6.equals("breadcrumbs") == false) goto L61;
        r4 = 4;
        goto L61
    L46:
        if (r6.equals("environment") == false) goto L61;
        r4 = 3;
        goto L61
    L50:
        if (r6.equals("contexts") == false) goto L61;
        r4 = 2;
        goto L61
    L54:
        if (r6.equals("server_name") == false) goto L61;
        r4 = 1;
        goto L61
    L58:
        if (r6.equals("debug_meta") == false) goto L61;
        r4 = 0;
        goto L61
    }

    /* JADX INFO: renamed from: h */
    public static C1832c m4062h(C1832c r1, Boolean r2, Double r3, Double r4) {
        if (r1 != null) goto L5;
        r1 = new C1832c();
    L5:
        if (r1.f6621d != null) goto L13;
        Double r0 = r1.f6620c;
        if (r0 == null) goto L10;
        r3 = r0;
    L10:
        Double r22 = m4057c(r4, r3, r2);
        if (r1.f6622e == false) goto L13;
        r1.f6621d = r22;
    L13:
        return r1;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4063i(Object r0, Object r1) {
        if (r0 == r1) goto L9;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC1820f m4064j(View r11, AbstractC1820f r12, C2046v2 r13) {
        float r2 = 0.0f;
        C1563B0 r3 = null;
        if (r11.isAttachedToWindow() == true) goto L5;
        C0208Et r5 = new C0208Et(Boolean.FALSE, null);
    L25:
        boolean r1 = ((Boolean) r5.f613a).booleanValue();
        Rect r6 = (Rect) r5.f614b;
        boolean r52 = false;
        if (r1 == false) goto L64;
        Object r14 = r11.getTag();
        if ((r14 instanceof String) == false) goto L30;
        String r15 = (String) r14;
    L31:
        if (r15 == null) goto L36;
        if (AbstractC2564tz.m5051L(r15.toLowerCase(Locale.ROOT), "sentry-unmask", false) == true) goto L64;
    L36:
        if (AbstractC0585Nj.m1134a(r11.getTag(R.id.sentry_privacy), "unmask") == true) goto L64;
        Object r8 = r11.getTag();
        if ((r8 instanceof String) == false) goto L41;
        String r82 = (String) r8;
    L42:
        if (r82 == null) goto L47;
        if (AbstractC2564tz.m5051L(r82.toLowerCase(Locale.ROOT), "sentry-mask", false) != true) goto L47;
    L62:
        boolean r9 = true;
    L66:
        if ((r11 instanceof TextView) == false) goto L80;
        TextView r0 = (TextView) r11;
        Layout r16 = r0.getLayout();
        if (r16 == null) goto L70;
        r3 = new C1563B0(r16);
    L70:
        C1563B0 r17 = r3;
        int r32 = r0.getCurrentTextColor() | (-16777216);
        int r33 = r0.getTotalPaddingLeft();
        int r7 = r0.getTotalPaddingTop();     // Catch: NullPointerException -> L73
    L74:
        r0.getX();
        r0.getY();
        int r53 = r0.getWidth();
        int r62 = r0.getHeight();
        if (r12 == null) goto L77;
        r2 = r12.f6585c;
    L77:
        float r02 = r0.getElevation() + r2;
        return new C1819e(r17, Integer.valueOf(r32), r33, r7, r53, r62, r02, r12, r9, r6);
    L73:
        r7 = r0.getExtendedPaddingTop();
        goto L74
    L80:
        if ((r11 instanceof ImageView) == false) goto L119;
        ImageView r03 = (ImageView) r11;
        r03.getX();
        r03.getY();
        int r18 = r03.getWidth();
        float r34 = 0.0f;
        int r22 = r03.getHeight();
        if (r12 == null) goto L84;
        r34 = r12.f6585c;
    L84:
        float r35 = r34 + r03.getElevation();
        if (r9 == false) goto L118;
        Drawable r04 = r03.getDrawable();
        if (r04 != null) goto L89;
    L114:
        boolean r05 = false;
    L115:
        if (r05 == false) goto L118;
        r52 = true;
        goto L118
    L89:
        if ((r04 instanceof InsetDrawable) == false) goto L91;
        boolean r83 = true;
    L92:
        if (r83 == false) goto L94;
        boolean r84 = true;
    L95:
        if (r84 == false) goto L97;
        boolean r85 = true;
    L98:
        if (r85 == false) goto L101;
    L99:
        boolean r06 = false;
    L112:
        if (r06 != true) goto L114;
        r05 = true;
        goto L115
    L101:
        if ((r04 instanceof BitmapDrawable) == false) goto L111;
        Bitmap r07 = ((BitmapDrawable) r04).getBitmap();
        if (r07 == null) goto L99;
        if (r07.isRecycled() == true) goto L99;
        if (r07.getHeight() <= 10) goto L99;
        if (r07.getWidth() <= 10) goto L99;
    L111:
        r06 = true;
        goto L112
    L97:
        r85 = r04 instanceof GradientDrawable;
        goto L98
    L94:
        r84 = r04 instanceof VectorDrawable;
        goto L95
    L91:
        r83 = r04 instanceof ColorDrawable;
    L118:
        return new C1818d(r18, r22, r35, r12, r52, r6);
    L119:
        float r36 = 0.0f;
        r11.getX();
        r11.getY();
        int r19 = r11.getWidth();
        int r23 = r11.getHeight();
        if (r12 == null) goto L123;
        r36 = r12.f6585c;
    L123:
        return new C1817c(r19, r23, r36 + r11.getElevation(), r12, r9, r6);
    L47:
        if (AbstractC0585Nj.m1134a(r11.getTag(R.id.sentry_privacy), "mask") == true) goto L62;
        r13.getSessionReplay().getClass();
        if (r11.getParent() == null) goto L52;
        r11.getParent();
        r13.getSessionReplay().getClass();
    L52:
        Class<?> r110 = r11.getClass();
        CopyOnWriteArraySet r86 = r13.getSessionReplay().f7308d;
    L53:
        if (r110 == null) goto L58;
        if (r86.contains(r110.getName()) == true) goto L64;
        r110 = r110.getSuperclass();
        goto L53
    L58:
        Class<?> r111 = r11.getClass();
        CopyOnWriteArraySet r87 = r13.getSessionReplay().f7307c;
    L59:
        if (r111 == null) goto L64;
        if (r87.contains(r111.getName()) == true) goto L62;
        r111 = r111.getSuperclass();
        goto L59
    L41:
        r82 = null;
        goto L42
    L30:
        r15 = null;
    L64:
        r9 = false;
        goto L66
    L5:
        if (r11.getWindowVisibility() == 0) goto L7;
        r5 = new C0208Et(Boolean.FALSE, null);
        goto L25
    L7:
        Object r112 = r11;
    L9:
        if ((r112 instanceof View) == false) goto L23;
        if (Build.VERSION.SDK_INT < 29) goto L13;
        float r54 = AbstractC0617OE.m1193a((View) r112);
    L14:
        View r113 = (View) r112;
        if (r113.getAlpha() <= 0.0f) goto L22;
        if (r54 <= 0.0f) goto L22;
        if (r113.getVisibility() != 0) goto L22;
        r112 = r113.getParent();
    L22:
        r5 = new C0208Et(Boolean.FALSE, null);
        goto L25
    L13:
        r54 = 1.0f;
        goto L14
    L23:
        Rect r114 = new Rect();
        r5 = new C0208Et(Boolean.valueOf(r11.getGlobalVisibleRect(r114, new Point())), r114);
        goto L25
    }

    /* JADX INFO: renamed from: k */
    public static String m4065k() {
        byte[] r2 = new byte[16];
        AbstractC2036h.m4180a().m4178b(r2);
        byte r3 = (byte) (r2[6] & 15);
        r2[6] = r3;
        r2[6] = (byte) (r3 | 64);
        byte r32 = (byte) (r2[8] & 63);
        r2[8] = r32;
        r2[8] = (byte) (r32 | 128);
        long r33 = 0;
        int r5 = 0;
        long r6 = 0;
    L3:
        if (r5 >= 8) goto L5;
        r6 = (r6 << 8) | ((long) (r2[r5] & 255));
        r5 = r5 + 1;
        goto L3
    L5:
        int r52 = 8;
    L6:
        if (r52 >= 16) goto L8;
        r33 = (r33 << 8) | ((long) (r2[r52] & 255));
        r52 = r52 + 1;
        goto L6
    L8:
        UUID r22 = new UUID(r6, r33);
        char[] r34 = AbstractC2039k.f7228a;
        long r35 = r22.getMostSignificantBits();
        long r53 = r22.getLeastSignificantBits();
        char[] r7 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, r3[(int) (((-1152921504606846976L) & r53) >>> 60)], r3[(int) ((1080863910568919040L & r53) >>> 56)], r3[(int) ((67553994410557440L & r53) >>> 52)], r3[(int) ((4222124650659840L & r53) >>> 48)], r3[(int) ((263882790666240L & r53) >>> 44)], r3[(int) ((16492674416640L & r53) >>> 40)], r3[(int) ((1030792151040L & r53) >>> 36)], r3[(int) ((64424509440L & r53) >>> 32)], r3[(int) ((4026531840L & r53) >>> 28)], r3[(int) ((251658240 & r53) >>> 24)], r3[(int) ((15728640 & r53) >>> 20)], r3[(int) ((983040 & r53) >>> 16)], r3[(int) ((61440 & r53) >>> 12)], r3[(int) ((3840 & r53) >>> 8)], r3[(int) ((240 & r53) >>> 4)], r3[(int) (15 & r53)]};
        AbstractC2039k.m4184a(r7, r35);
        char[] r36 = AbstractC2039k.f7228a;
        return new String(r7);
    }

    /* JADX INFO: renamed from: l */
    public static String m4066l(KeyEvent.Callback r1) {
        if (r1 != null) goto L5;
        return null;
    L5:
        String r0 = r1.getClass().getCanonicalName();
        if (r0 == null) goto L9;
        return r0;
    L9:
        return r1.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: m */
    public static Date m4067m() {
        return Calendar.getInstance(AbstractC2048a.f7246a).getTime();
    }

    /* JADX INFO: renamed from: n */
    public static Date m4068n(long r1) {
        Calendar r0 = Calendar.getInstance(AbstractC2048a.f7246a);
        r0.setTimeInMillis(r1);
        return r0.getTime();
    }

    /* JADX INFO: renamed from: o */
    public static Date m4069o(String r2) {
        return AbstractC2048a.m4190c(r2, new ParsePosition(0));
    L5:
        throw new IllegalArgumentException(AbstractC0213Ey.m420r("timestamp is not ISO format ", r2));
    }

    /* JADX INFO: renamed from: p */
    public static Date m4070p(String r3) {
        return m4068n(new BigDecimal(r3).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
    L5:
        throw new IllegalArgumentException(AbstractC0213Ey.m420r("timestamp is not millis format ", r3));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Dn, java.lang.Object] */
    /* JADX INFO: renamed from: q */
    public static final Window m4071q(View r1) {
        Object r0 = AbstractC1759D.f6379a;
        View r12 = r1.getRootView();
        Class r02 = (Class) AbstractC1759D.f6379a.getValue();
        if (r02 != null) goto L5;
        return null;
    L5:
        if (r02.isInstance(r12) == false) goto L12;
        Field r03 = (Field) AbstractC1759D.f6380b.getValue();
        if (r03 != null) goto L9;
        return null;
    L9:
        return (Window) r03.get(r12);
    L12:
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static Object m4072s(C1586H r2) {
        C1981r r1 = r2.f5731c.m4173a();
        Object r22 = r2.f5729a.get("sentry:typeCheckHint");     // Catch: Throwable -> L6
        r1.close();
        return r22;
    L6:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    /* JADX INFO: renamed from: t */
    public static String m4073t(Date r7) {
        TimeZone r0 = AbstractC2048a.f7246a;
        GregorianCalendar r1 = new GregorianCalendar(r0, Locale.US);
        r1.setTime(r7);
        if (r0.getRawOffset() != 0) goto L5;
        int r72 = 1;
    L6:
        StringBuilder r73 = new StringBuilder(23 + r72);
        AbstractC2048a.m4189b(r73, r1.get(1), 4);
        char r3 = '-';
        r73.append('-');
        AbstractC2048a.m4189b(r73, r1.get(2) + 1, 2);
        r73.append('-');
        AbstractC2048a.m4189b(r73, r1.get(5), 2);
        r73.append('T');
        AbstractC2048a.m4189b(r73, r1.get(11), 2);
        r73.append(':');
        AbstractC2048a.m4189b(r73, r1.get(12), 2);
        r73.append(':');
        AbstractC2048a.m4189b(r73, r1.get(13), 2);
        r73.append('.');
        AbstractC2048a.m4189b(r73, r1.get(14), 3);
        int r02 = r0.getOffset(r1.getTimeInMillis());
        if (r02 == 0) goto L13;
        int r12 = r02 / 60000;
        int r5 = Math.abs(r12 / 60);
        int r13 = Math.abs(r12 % 60);
        if (r02 < 0) goto L12;
        r3 = '+';
    L12:
        r73.append(r3);
        AbstractC2048a.m4189b(r73, r5, 2);
        r73.append(':');
        AbstractC2048a.m4189b(r73, r13, 2);
    L15:
        return r73.toString();
    L13:
        r73.append('Z');
        goto L15
    L5:
        r72 = 6;
        goto L6
    }

    /* JADX INFO: renamed from: u */
    public static boolean m4074u(Context r3) {
        m4048D("The application context is required.", r3);
        if (r3.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m4075v(C1586H r0, Class r1) {
        return r1.isInstance(m4072s(r0));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m4076w(C1586H r3) {
        return Boolean.TRUE.equals(r3.m3667b(Boolean.class, "sentry:isFromHybridSdk"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m4077y(Double r4, boolean r5) {
        if (r4 != null) goto L5;
        return r5;
    L5:
        if (r4.isNaN() == false) goto L7;
        return false;
    L7:
        if (r4.doubleValue() >= 0.0d) goto L9;
        return false;
    L9:
        if (r4.doubleValue() > 1.0d) goto L15;
        return true;
    L15:
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m4078z(Class r1, Object r2, ILogger r3) {
        EnumC1657a2 r0 = EnumC1657a2.DEBUG;
        if (r2 == null) goto L5;
        String r22 = r2.getClass().getCanonicalName();
    L6:
        r3.mo3680e(r0, "%s is not %s", new Object[]{r22, r1.getCanonicalName()});
        return;
    L5:
        r22 = "Hint";
        goto L6
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo4079r();

    /* JADX INFO: renamed from: x */
    public abstract boolean mo4080x();
}
