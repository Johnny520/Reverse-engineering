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
import java.text.ParseException;
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
import p000.AbstractC2374ph;
import p000.AbstractC2564tz;
import p000.C0208Et;
import p000.C2648vx;
import p000.RunnableC2445r8;

/* JADX INFO: renamed from: io.sentry.config.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1856a {
    /* JADX INFO: renamed from: A */
    public static ConcurrentHashMap m4045A(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: B */
    public static byte[] m4046B(String str, long j) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(AbstractC2374ph.m4814k("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(AbstractC2374ph.m4814k("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(AbstractC2374ph.m4814k("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bArr = new byte[1024];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    fileInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public static String m4047C(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m4048D(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m4049E(AbstractC1568C1 abstractC1568C1, C1901c c1901c, ILogger iLogger) {
        if (abstractC1568C1.f5604a != null) {
            c1901c.m4106p("event_id");
            c1901c.m4112w(iLogger, abstractC1568C1.f5604a);
        }
        c1901c.m4106p("contexts");
        c1901c.m4112w(iLogger, abstractC1568C1.f5605b);
        if (abstractC1568C1.f5606c != null) {
            c1901c.m4106p("sdk");
            c1901c.m4112w(iLogger, abstractC1568C1.f5606c);
        }
        if (abstractC1568C1.f5607d != null) {
            c1901c.m4106p("request");
            c1901c.m4112w(iLogger, abstractC1568C1.f5607d);
        }
        AbstractMap abstractMap = abstractC1568C1.f5608e;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            c1901c.m4106p("tags");
            c1901c.m4112w(iLogger, abstractC1568C1.f5608e);
        }
        if (abstractC1568C1.f5609f != null) {
            c1901c.m4106p(BuildConfig.BUILD_TYPE);
            c1901c.m4115z(abstractC1568C1.f5609f);
        }
        if (abstractC1568C1.f5610g != null) {
            c1901c.m4106p("environment");
            c1901c.m4115z(abstractC1568C1.f5610g);
        }
        if (abstractC1568C1.f5611h != null) {
            c1901c.m4106p("platform");
            c1901c.m4115z(abstractC1568C1.f5611h);
        }
        if (abstractC1568C1.f5612i != null) {
            c1901c.m4106p("user");
            c1901c.m4112w(iLogger, abstractC1568C1.f5612i);
        }
        if (abstractC1568C1.f5614k != null) {
            c1901c.m4106p("server_name");
            c1901c.m4115z(abstractC1568C1.f5614k);
        }
        if (abstractC1568C1.f5615l != null) {
            c1901c.m4106p("dist");
            c1901c.m4115z(abstractC1568C1.f5615l);
        }
        List list = abstractC1568C1.f5616m;
        if (list != null && !list.isEmpty()) {
            c1901c.m4106p("breadcrumbs");
            c1901c.m4112w(iLogger, abstractC1568C1.f5616m);
        }
        if (abstractC1568C1.f5617n != null) {
            c1901c.m4106p("debug_meta");
            c1901c.m4112w(iLogger, abstractC1568C1.f5617n);
        }
        AbstractMap abstractMap2 = abstractC1568C1.f5618o;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        c1901c.m4106p("extra");
        c1901c.m4112w(iLogger, abstractC1568C1.f5618o);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m4050F(C1586H c1586h) {
        return !(InterfaceC1886d.class.isInstance(m4072s(c1586h)) || InterfaceC1884b.class.isInstance(m4072s(c1586h))) || C1672O.class.isInstance(m4072s(c1586h));
    }

    /* JADX INFO: renamed from: G */
    public static boolean m4051G(C2046v2 c2046v2, C2046v2 c2046v22, boolean z) {
        boolean z2 = AbstractC2034f.f7219a;
        if (!z2 && (c2046v22.getVersionDetector() instanceof C1649Y0)) {
            c2046v22.setVersionDetector(new C2002t(c2046v22, 1));
        }
        if (!c2046v22.getVersionDetector().mo3789a()) {
            return !z || c2046v2 == null || c2046v22.isForceInit() || c2046v2.getInitPriority().ordinal() <= c2046v22.getInitPriority().ordinal();
        }
        c2046v22.getLogger().mo3680e(EnumC1657a2.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(AbstractC2374ph.m4814k("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }

    /* JADX INFO: renamed from: H */
    public static final void m4052H(ExecutorService executorService, C2046v2 c2046v2, String str, Runnable runnable) {
        if (Thread.currentThread().getName().startsWith("SentryReplayIntegration")) {
            runnable.run();
            return;
        }
        try {
            executorService.submit(new RunnableC2445r8(runnable, c2046v2, str, 8));
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, AbstractC2374ph.m4814k("Failed to submit task ", str, " to executor"), th);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m4053I(View view, AbstractC1820f abstractC1820f, C2046v2 c2046v2) {
        if ((view instanceof ViewGroup) && !AbstractC1816b.m3987b(view, abstractC1820f, c2046v2)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    AbstractC1820f abstractC1820fM4064j = m4064j(childAt, abstractC1820f, c2046v2);
                    arrayList.add(abstractC1820fM4064j);
                    m4053I(childAt, abstractC1820fM4064j, c2046v2);
                }
            }
            abstractC1820f.f6588f = arrayList;
        }
    }

    /* JADX INFO: renamed from: J */
    public static CopyOnWriteArrayList m4054J(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m4055a(String str) {
        C1650Y1.m3790d().m3791a(str);
    }

    /* JADX INFO: renamed from: b */
    public static C2648vx m4056b(C2648vx c2648vx) {
        if (((Double) c2648vx.f9164c) != null) {
            return c2648vx;
        }
        return new C2648vx((Boolean) c2648vx.f9162a, (Double) c2648vx.f9163b, m4057c(null, (Double) c2648vx.f9163b, (Boolean) c2648vx.f9162a), (Boolean) c2648vx.f9165d, (Double) c2648vx.f9166e);
    }

    /* JADX INFO: renamed from: c */
    public static Double m4057c(Double d, Double d2, Boolean bool) {
        if (d != null) {
            return d;
        }
        double dM4179c = AbstractC2036h.m4180a().m4179c();
        if (d2 == null || bool == null) {
            return Double.valueOf(dM4179c);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d2.doubleValue() * dM4179c);
        }
        return Double.valueOf(((1.0d - d2.doubleValue()) * dM4179c) + d2.doubleValue());
    }

    /* JADX INFO: renamed from: d */
    public static ClassLoader m4058d(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    /* JADX INFO: renamed from: e */
    public static C1586H m4059e(Object obj) {
        C1586H c1586h = new C1586H();
        c1586h.m3668c("sentry:typeCheckHint", obj);
        return c1586h;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4060f(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!m4060f(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4061g(AbstractC1568C1 abstractC1568C1, String str, C1559A0 c1559a0, ILogger iLogger) {
        int i;
        int i2;
        i = 8;
        i2 = 0;
        switch (str) {
            case "debug_meta":
                abstractC1568C1.f5617n = (C1954d) c1559a0.m3559A(iLogger, new C1850a(i));
                return true;
            case "server_name":
                abstractC1568C1.f5614k = c1559a0.m3561C();
                return true;
            case "contexts":
                abstractC1568C1.f5605b.mo4129k(C1850a.m4031c(c1559a0, iLogger));
                return true;
            case "environment":
                abstractC1568C1.f5610g = c1559a0.m3561C();
                return true;
            case "breadcrumbs":
                abstractC1568C1.f5616m = c1559a0.m3577u(iLogger, new C1865e(i2));
                return true;
            case "sdk":
                abstractC1568C1.f5606c = (C1968r) c1559a0.m3559A(iLogger, new C1850a(20));
                return true;
            case "dist":
                abstractC1568C1.f5615l = c1559a0.m3561C();
                return true;
            case "tags":
                abstractC1568C1.f5608e = m4045A((Map) c1559a0.m3582z());
                return true;
            case "user":
                abstractC1568C1.f5612i = (C1948E) c1559a0.m3559A(iLogger, new C1947D(i2));
                return true;
            case "extra":
                abstractC1568C1.f5618o = m4045A((Map) c1559a0.m3582z());
                return true;
            case "event_id":
                abstractC1568C1.f5604a = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                return true;
            case "release":
                abstractC1568C1.f5609f = c1559a0.m3561C();
                return true;
            case "request":
                abstractC1568C1.f5607d = (C1964n) c1559a0.m3559A(iLogger, new C1850a(18));
                return true;
            case "platform":
                abstractC1568C1.f5611h = c1559a0.m3561C();
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C1832c m4062h(C1832c c1832c, Boolean bool, Double d, Double d2) {
        if (c1832c == null) {
            c1832c = new C1832c();
        }
        if (c1832c.f6621d == null) {
            Double d3 = c1832c.f6620c;
            if (d3 != null) {
                d = d3;
            }
            Double dM4057c = m4057c(d2, d, bool);
            if (c1832c.f6622e) {
                c1832c.f6621d = dM4057c;
            }
        }
        return c1832c;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4063i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127 A[EDGE_INSN: B:127:0x0127->B:64:0x0127 BREAK  A[LOOP:0: B:53:0x00f8->B:57:0x0105]] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC1820f m4064j(View view, AbstractC1820f abstractC1820f, C2046v2 c2046v2) {
        C0208Et c0208Et;
        boolean z;
        boolean z2;
        Bitmap bitmap;
        int extendedPaddingTop;
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (parent instanceof View) {
                float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    c0208Et = new C0208Et(Boolean.FALSE, null);
                    break;
                }
                parent = view2.getParent();
            }
            Rect rect = new Rect();
            c0208Et = new C0208Et(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
        } else {
            c0208Et = new C0208Et(Boolean.FALSE, null);
        }
        boolean zBooleanValue = ((Boolean) c0208Et.f613a).booleanValue();
        Rect rect2 = (Rect) c0208Et.f614b;
        boolean z3 = false;
        if (zBooleanValue) {
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            if ((str == null || !AbstractC2564tz.m5051L(str.toLowerCase(Locale.ROOT), "sentry-unmask", false)) && !AbstractC0585Nj.m1134a(view.getTag(R.id.sentry_privacy), "unmask")) {
                Object tag2 = view.getTag();
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if ((str2 == null || !AbstractC2564tz.m5051L(str2.toLowerCase(Locale.ROOT), "sentry-mask", false)) && !AbstractC0585Nj.m1134a(view.getTag(R.id.sentry_privacy), "mask")) {
                    c2046v2.getSessionReplay().getClass();
                    if (view.getParent() != null) {
                        view.getParent();
                        c2046v2.getSessionReplay().getClass();
                    }
                    Class<?> superclass = view.getClass();
                    CopyOnWriteArraySet copyOnWriteArraySet = c2046v2.getSessionReplay().f7308d;
                    while (true) {
                        if (superclass == null) {
                            CopyOnWriteArraySet copyOnWriteArraySet2 = c2046v2.getSessionReplay().f7307c;
                            for (Class<?> superclass2 = view.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                                if (!copyOnWriteArraySet2.contains(superclass2.getName())) {
                                }
                            }
                        } else {
                            if (copyOnWriteArraySet.contains(superclass.getName())) {
                                break;
                            }
                            superclass = superclass.getSuperclass();
                        }
                    }
                    z = false;
                }
                z = true;
                break;
            } else {
                z = false;
            }
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            C1563B0 c1563b0 = layout != null ? new C1563B0(layout) : null;
            int currentTextColor = textView.getCurrentTextColor() | (-16777216);
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            try {
                extendedPaddingTop = textView.getTotalPaddingTop();
            } catch (NullPointerException unused) {
                extendedPaddingTop = textView.getExtendedPaddingTop();
            }
            textView.getX();
            textView.getY();
            return new C1819e(c1563b0, Integer.valueOf(currentTextColor), totalPaddingLeft, extendedPaddingTop, textView.getWidth(), textView.getHeight(), textView.getElevation() + (abstractC1820f != null ? abstractC1820f.f6585c : 0.0f), abstractC1820f, z, rect2);
        }
        if (!(view instanceof ImageView)) {
            view.getX();
            view.getY();
            return new C1817c(view.getWidth(), view.getHeight(), (abstractC1820f != null ? abstractC1820f.f6585c : 0.0f) + view.getElevation(), abstractC1820f, z, rect2);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        float elevation = (abstractC1820f != null ? abstractC1820f.f6585c : 0.0f) + imageView.getElevation();
        if (z) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                z2 = false;
                if (z2) {
                    z3 = true;
                }
            } else {
                if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
                    z2 = true;
                }
                if (z2) {
                }
            }
        }
        return new C1818d(width, height, elevation, abstractC1820f, z3, rect2);
    }

    /* JADX INFO: renamed from: k */
    public static String m4065k() {
        byte[] bArr = new byte[16];
        AbstractC2036h.m4180a().m4178b(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        UUID uuid = new UUID(j2, j);
        char[] cArr = AbstractC2039k.f7228a;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (15 & leastSignificantBits)]};
        AbstractC2039k.m4184a(cArr2, mostSignificantBits);
        char[] cArr3 = AbstractC2039k.f7228a;
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: l */
    public static String m4066l(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: m */
    public static Date m4067m() {
        return Calendar.getInstance(AbstractC2048a.f7246a).getTime();
    }

    /* JADX INFO: renamed from: n */
    public static Date m4068n(long j) {
        Calendar calendar = Calendar.getInstance(AbstractC2048a.f7246a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    /* JADX INFO: renamed from: o */
    public static Date m4069o(String str) {
        try {
            return AbstractC2048a.m4190c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(AbstractC0213Ey.m420r("timestamp is not ISO format ", str));
        }
    }

    /* JADX INFO: renamed from: p */
    public static Date m4070p(String str) {
        try {
            return m4068n(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(AbstractC0213Ey.m420r("timestamp is not millis format ", str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Dn, java.lang.Object] */
    /* JADX INFO: renamed from: q */
    public static final Window m4071q(View view) {
        Field field;
        Object obj = AbstractC1759D.f6379a;
        View rootView = view.getRootView();
        Class cls = (Class) AbstractC1759D.f6379a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) AbstractC1759D.f6380b.getValue()) == null) {
            return null;
        }
        return (Window) field.get(rootView);
    }

    /* JADX INFO: renamed from: s */
    public static Object m4072s(C1586H c1586h) {
        C1981r c1981rM4173a = c1586h.f5731c.m4173a();
        try {
            Object obj = c1586h.f5729a.get("sentry:typeCheckHint");
            c1981rM4173a.close();
            return obj;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m4073t(Date date) {
        TimeZone timeZone = AbstractC2048a.f7246a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(23 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        AbstractC2048a.m4189b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        AbstractC2048a.m4189b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        AbstractC2048a.m4189b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        AbstractC2048a.m4189b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        AbstractC2048a.m4189b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        AbstractC2048a.m4189b(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        AbstractC2048a.m4189b(sb, gregorianCalendar.get(14), 3);
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            AbstractC2048a.m4189b(sb, iAbs, 2);
            sb.append(':');
            AbstractC2048a.m4189b(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m4074u(Context context) {
        m4048D("The application context is required.", context);
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m4075v(C1586H c1586h, Class cls) {
        return cls.isInstance(m4072s(c1586h));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m4076w(C1586H c1586h) {
        return Boolean.TRUE.equals(c1586h.m3667b(Boolean.class, "sentry:isFromHybridSdk"));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m4077y(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    /* JADX INFO: renamed from: z */
    public static void m4078z(Class cls, Object obj, ILogger iLogger) {
        iLogger.mo3680e(EnumC1657a2.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo4079r();

    /* JADX INFO: renamed from: x */
    public abstract boolean mo4080x();
}
