package p050c0;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0143i;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0193x;
import p009E0.C0191v;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0403f;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0431p;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0605L1 {

    /* JADX INFO: renamed from: a */
    public static final C0605L1 f1854a = null;

    /* JADX INFO: renamed from: b */
    public static volatile long f1855b = 0;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f1856c = false;

    /* JADX INFO: renamed from: d */
    public static volatile double f1857d = 39.9042d;

    /* JADX INFO: renamed from: e */
    public static volatile double f1858e = 116.4074d;

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f1859f = null;

    /* JADX INFO: renamed from: g */
    public static final ExecutorService f1860g = null;

    static {
        f1854a = new C0605L1();
        f1859f = new AtomicInteger(0);
        f1860g = Executors.newSingleThreadExecutor(new ThreadFactoryC0658g1(2));
    }

    /* JADX INFO: renamed from: a */
    public static void m1487a() {
        new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_request").delete();     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: c */
    public static String m1488c(double r1) {
        return String.format(Locale.US, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(r1)}, 1));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1489d(double r2, double r4) {
        if (Math.abs(r2 - 16.61953d) < 1.0E-5d) goto L5;
    L7:
        return false;
    L5:
        if (Math.abs(r4 - 98.56146d) >= 1.0E-5d) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static C0143i m1490e(C0605L1 r18) {
        long r02 = System.currentTimeMillis();
        r18.getClass();
        if ((r02 - f1855b) < 3000) goto L65;
        f1855b = r02;
        Iterator r1 = AbstractC0182m.m556h0(new File[]{new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"), new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "virtual_location.properties")}).iterator();
    L6:
        Double r9 = null;
        if (r1.hasNext() == false) goto L37;
        File r03 = (File) r1.next();
        if (r03.isFile() == false) goto L6;
        Object r04 = m1492g(AbstractC0270k.m692i0(r03, AbstractC0416a.f921a));     // Catch: Throwable -> L12
    L15:
        if ((r04 instanceof C0140f) == false) goto L17;
        r04 = null;
    L17:
        Map r05 = (Map) r04;
        if (r05 == null) goto L6;
        if (r05.containsKey("virtual_location_enabled") == true) goto L24;
        if (r05.containsKey("virtual_location_latitude") == false) goto L6;
    L24:
        boolean r12 = AbstractC0433r.m1029D0((String) r05.get("virtual_location_enabled"), "true", true);
        String r10 = (String) r05.get("virtual_location_latitude");
        if (r10 == null) goto L29;
        Double r102 = AbstractC0431p.m1024y0(r10);
        if (r102 == null) goto L29;
        double r103 = AbstractC0040p.m109n(r102.doubleValue(), -90.0d, 90.0d);
    L30:
        String r06 = (String) r05.get("virtual_location_longitude");
        if (r06 == null) goto L35;
        Double r07 = AbstractC0431p.m1024y0(r06);
        if (r07 == null) goto L35;
        double r122 = AbstractC0040p.m109n(r07.doubleValue(), -180.0d, 180.0d);
    L36:
        C0143i r08 = new C0143i(Boolean.valueOf(r12), Double.valueOf(r103), Double.valueOf(r122));
    L38:
        if (r08 == null) goto L40;
        f1856c = ((Boolean) r08.f334a).booleanValue();
        f1857d = ((Number) r08.f335b).doubleValue();
        f1858e = ((Number) r08.f336c).doubleValue();
        return new C0143i(Boolean.valueOf(f1856c), Double.valueOf(f1857d), Double.valueOf(f1858e));
    L40:
        C0661h1 r09 = C0661h1.f2048a;
        f1856c = C0661h1.m1661c("virtual_location_enabled", false);
        String r13 = C0661h1.m1662d("virtual_location_latitude", "");
        String r010 = C0661h1.m1662d("virtual_location_longitude", "");
        Double r14 = AbstractC0431p.m1024y0(r13);
        if (r14 == null) goto L43;
        Double r15 = Double.valueOf(AbstractC0040p.m109n(r14.doubleValue(), -90.0d, 90.0d));
    L44:
        Double r011 = AbstractC0431p.m1024y0(r010);
        if (r011 == null) goto L47;
        r9 = Double.valueOf(AbstractC0040p.m109n(r011.doubleValue(), -180.0d, 180.0d));
    L47:
        if (r15 == null) goto L52;
        if (r9 == null) goto L52;
        if (m1489d(r15.doubleValue(), r9.doubleValue()) == true) goto L52;
        f1857d = r15.doubleValue();
        f1858e = r9.doubleValue();
    L54:
        return new C0143i(Boolean.valueOf(f1856c), Double.valueOf(f1857d), Double.valueOf(f1858e));
    L52:
        f1857d = 39.9042d;
        f1858e = 116.4074d;
        goto L54
    L43:
        r15 = null;
    L35:
        r122 = 116.4074d;
    L29:
        r103 = 39.9042d;
    L12:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);
        goto L15
    L37:
        r08 = null;
        goto L38
    L65:
        return new C0143i(Boolean.valueOf(f1856c), Double.valueOf(f1857d), Double.valueOf(f1858e));
    }

    /* JADX INFO: renamed from: f */
    public static void m1491f(File r4, Map r5) {
        boolean r02 = r4.isFile();
        C0191v r1 = C0191v.f402a;
        Map r12 = r1;
        if (r02 == true) goto L22;
    L13:
        LinkedHashMap r03 = new LinkedHashMap(r12);
        r03.putAll(r5);
        StringBuilder r52 = new StringBuilder("# OKK config\n");
        Iterator r04 = r03.entrySet().iterator();
    L15:
        if (r04.hasNext() == false) goto L17;
        Map.Entry r13 = (Map.Entry) r04.next();
        r52.append(((String) r13.getKey()) + "=" + ((String) r13.getValue()));
        r52.append('\n');
        goto L15
    L17:
        String r53 = r52.toString();
        AbstractC0307g.m702d(r53, "toString(...)");
        File r05 = r4.getParentFile();
        if (r05 == null) goto L20;
        r05.mkdirs();
    L20:
        AbstractC0270k.m693j0(r4, r53, AbstractC0416a.f921a);
        return;
    L22:
        Object r06 = m1492g(AbstractC0270k.m692i0(r4, AbstractC0416a.f921a));     // Catch: Throwable -> L6
    L8:
        Object r14 = r1;
        if ((r06 instanceof C0140f) == true) goto L12;
        r14 = r06;
    L12:
        r12 = (Map) r14;
    L6:
        th = move-exception;
        r06 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: g */
    public static LinkedHashMap m1492g(String r6) {
        C0402e r02 = new C0402e(new C0403f(AbstractC0425j.m1014S0(r6), new C0570A(28)), true, new C0570A(29));
        LinkedHashMap r62 = new LinkedHashMap();
        C0401d r1 = new C0401d(r02);
    L4:
        if (r1.hasNext() == false) goto L6;
        String r03 = (String) r1.next();
        int r3 = AbstractC0425j.m1010O0(r03, '=', 0, false, 6);
        String r4 = r03.substring(0, r3);
        AbstractC0307g.m702d(r4, "substring(...)");
        String r42 = AbstractC0425j.m1022a1(r4).toString();
        String r04 = r03.substring(r3 + 1);
        AbstractC0307g.m702d(r04, "substring(...)");
        r62.put(r42, AbstractC0425j.m1022a1(r04).toString());
        goto L4
    L6:
        return r62;
    }

    /* JADX INFO: renamed from: h */
    public static C0139e m1493h(Context r9) {
        Object r1 = null;
        if (r9 != null) goto L63;
        return null;
    L63:
        Object r92 = r9.getSystemService("location");     // Catch: Throwable -> L8
        if ((r92 instanceof LocationManager) == false) goto L10;
        LocationManager r93 = (LocationManager) r92;     // Catch: Throwable -> L8
    L11:
        if (r93 != null) goto L13;
        return null;
    L13:
        Iterator r2 = AbstractC0182m.m556h0(new String[]{"gps", "network", "passive"}).iterator();     // Catch: Throwable -> L8
        Location r3 = null;
    L15:
        if (r2.hasNext() == false) goto L42;
        String r4 = (String) r2.next();     // Catch: Throwable -> L8
        Object r5 = Boolean.valueOf(r93.isProviderEnabled(r4));     // Catch: Throwable -> L19
    L21:
        Object r6 = Boolean.FALSE;     // Catch: Throwable -> L8
        if ((r5 instanceof C0140f) == false) goto L25;
        r5 = r6;
    L25:
        if (((Boolean) r5).booleanValue() == false) goto L27;
    L65:
        Object r42 = r93.getLastKnownLocation(r4);     // Catch: Throwable -> L30
    L33:
        if ((r42 instanceof C0140f) == false) goto L35;
        r42 = null;
    L35:
        Location r43 = (Location) r42;     // Catch: Throwable -> L8
        if (r43 == null) goto L15;
        if (r3 == null) goto L41;
        if (r43.getTime() <= r3.getTime()) goto L15;
    L41:
        r3 = r43;
    L30:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L8
        goto L33
    L27:
        if (AbstractC0307g.m699a(r4, "passive") == false) goto L15;
    L19:
        th = move-exception;
        r5 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L8
        goto L21
    L42:
        if (r3 == null) goto L53;
        double r44 = r3.getLatitude();     // Catch: Throwable -> L8
        if ((-90.0d) > r44) goto L53;
        if (r44 > 90.0d) goto L53;
        double r45 = r3.getLongitude();     // Catch: Throwable -> L8
        if ((-180.0d) > r45) goto L53;
        if (r45 > 180.0d) goto L53;
        Object r22 = new C0139e(Double.valueOf(r3.getLatitude()), Double.valueOf(r3.getLongitude()));     // Catch: Throwable -> L8
    L56:
        if ((r22 instanceof C0140f) == true) goto L60;
        r1 = r22;
    L60:
        return (C0139e) r1;
    L53:
        r22 = null;
        goto L56
    L10:
        r93 = null;
    L8:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L56
    }

    /* JADX INFO: renamed from: i */
    public static void m1494i(final boolean r13, double r14, double r16, Context r18, boolean r19) {
        double r1 = AbstractC0040p.m109n(r14, -90.0d, 90.0d);
        double r5 = AbstractC0040p.m109n(r16, -180.0d, 180.0d);
        f1856c = r13;
        f1857d = r1;
        f1858e = r5;
        f1855b = System.currentTimeMillis();
        Locale r3 = Locale.US;
        final String r8 = String.format(r3, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(r1)}, 1));
        final String r6 = String.format(r3, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(r5)}, 1));
        final long r9 = System.currentTimeMillis();
        StringBuilder r12 = new StringBuilder("# OKK virtual location\n");
        r12.append("virtual_location_enabled=" + r13);
        r12.append('\n');
        r12.append("virtual_location_latitude=".concat(r8));
        r12.append('\n');
        r12.append("virtual_location_longitude=".concat(r6));
        r12.append('\n');
        r12.append("virtual_location_updated=" + r9);
        r12.append('\n');
        final String r11 = r12.toString();
        AbstractC0307g.m702d(r11, "toString(...)");
        ArrayList r15 = new ArrayList(2);
        r15.add(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"));
        if (r18 == null) goto L7;
        File r02 = r18.getExternalFilesDir(null);
        if (r02 == null) goto L7;
        r15.add(new File(r02, "achat_config.properties"));
    L7:
        HashSet r03 = new HashSet();
        final ArrayList r32 = new ArrayList();
        Iterator r17 = r15.iterator();
    L9:
        if (r17.hasNext() == false) goto L13;
        Object r2 = r17.next();
        if (r03.add(((File) r2).getAbsolutePath()) == false) goto L9;
        r32.add(r2);
        goto L9
    L13:
        if (r19 == false) goto L15;
        final int r22 = f1859f.incrementAndGet();
        f1860g.execute(new RunnableC0602K1(r22, r32, r13, r8, r6, r9, r11));
        return;
    L15:
        Iterator r110 = r32.iterator();
    L17:
        if (r110.hasNext() == false) goto L40;
        File r04 = (File) r110.next();
        File r23 = r04.getParentFile();     // Catch: Throwable -> L22
        if (r23 == null) goto L24;
        r23.mkdirs();     // Catch: Throwable -> L22
    L24:
        m1491f(r04, AbstractC0193x.m564h0(new C0139e[]{new C0139e("virtual_location_enabled", String.valueOf(r13)), new C0139e("virtual_location_latitude", r8), new C0139e("virtual_location_longitude", r6), new C0139e("virtual_location_updated", String.valueOf(r9))}));     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX INFO: renamed from: b */
    public final C0139e m1495b(Context r7) {
        C0139e r02 = m1493h(r7);
        if (r02 == null) goto L5;
        return r02;
    L5:
        C0143i r03 = m1490e(this);
        Object r1 = r03.f335b;
        double r2 = ((Number) r1).doubleValue();
        Object r04 = r03.f336c;
        if (m1489d(r2, ((Number) r04).doubleValue()) == false) goto L8;
        C0139e r72 = m1493h(r7);
        if (r72 == null) goto L13;
        return r72;
    L13:
        return new C0139e(Double.valueOf(39.9042d), Double.valueOf(116.4074d));
    L8:
        return new C0139e(r1, r04);
    }
}
