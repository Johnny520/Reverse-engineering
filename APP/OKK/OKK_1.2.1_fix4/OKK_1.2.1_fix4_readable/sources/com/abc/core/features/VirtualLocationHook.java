package com.abc.core.features;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
public final class VirtualLocationHook {

    /* JADX INFO: renamed from: b */
    public static volatile long f1855b = 0;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f1856c = false;

    /* JADX INFO: renamed from: d */
    public static volatile double f1857d = 39.9042d;

    /* JADX INFO: renamed from: e */
    public static volatile double f1858e = 116.4074d;

    /* JADX INFO: renamed from: a */
    public static final VirtualLocationHook f1854a = new VirtualLocationHook();

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f1859f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public static final ExecutorService f1860g = Executors.newSingleThreadExecutor(new ThreadFactoryC0658g1(2));

    /* JADX INFO: renamed from: a */
    public static void m1487a() {
        try {
            new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_request").delete();
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1488c(double d2) {
        return String.format(Locale.US, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1489d(double d2, double d3) {
        return Math.abs(d2 - 16.61953d) < 1.0E-5d && Math.abs(d3 - 98.56146d) < 1.0E-5d;
    }

    /* JADX INFO: renamed from: e */
    public static C0143i m1490e(VirtualLocationHook virtualLocationHook) {
        C0143i c0143i;
        Object objM116u;
        Map map;
        Double dM1024y0;
        Double dM1024y02;
        long jCurrentTimeMillis = System.currentTimeMillis();
        virtualLocationHook.getClass();
        if (jCurrentTimeMillis - f1855b < 3000) {
            return new C0143i(Boolean.valueOf(f1856c), Double.valueOf(f1857d), Double.valueOf(f1858e));
        }
        f1855b = jCurrentTimeMillis;
        Iterator it = AbstractC0182m.m556h0(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"), new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "virtual_location.properties")).iterator();
        while (true) {
            if (!it.hasNext()) {
                c0143i = null;
                break;
            }
            File file = (File) it.next();
            if (file.isFile()) {
                try {
                    objM116u = m1492g(AbstractC0270k.m692i0(file, AbstractC0416a.f921a));
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                map = (Map) objM116u;
                if (map != null && (map.containsKey("virtual_location_enabled") || map.containsKey("virtual_location_latitude"))) {
                    break;
                }
            }
        }
        boolean zM1029D0 = AbstractC0433r.m1029D0((String) map.get("virtual_location_enabled"), "true", true);
        String str = (String) map.get("virtual_location_latitude");
        double dM109n = (str == null || (dM1024y02 = AbstractC0431p.m1024y0(str)) == null) ? 39.9042d : AbstractC0040p.m109n(dM1024y02.doubleValue(), -90.0d, 90.0d);
        String str2 = (String) map.get("virtual_location_longitude");
        c0143i = new C0143i(Boolean.valueOf(zM1029D0), Double.valueOf(dM109n), Double.valueOf((str2 == null || (dM1024y0 = AbstractC0431p.m1024y0(str2)) == null) ? 116.4074d : AbstractC0040p.m109n(dM1024y0.doubleValue(), -180.0d, 180.0d)));
        if (c0143i != null) {
            f1856c = ((Boolean) c0143i.f334a).booleanValue();
            f1857d = ((Number) c0143i.f335b).doubleValue();
            f1858e = ((Number) c0143i.f336c).doubleValue();
            return new C0143i(Boolean.valueOf(f1856c), Double.valueOf(f1857d), Double.valueOf(f1858e));
        }
        ConfigStore configStore = ConfigStore.f2048a;
        f1856c = ConfigStore.m1661c("virtual_location_enabled", false);
        String strM1662d = ConfigStore.m1662d("virtual_location_latitude", "");
        String strM1662d2 = ConfigStore.m1662d("virtual_location_longitude", "");
        Double dM1024y03 = AbstractC0431p.m1024y0(strM1662d);
        Double dValueOf = dM1024y03 != null ? Double.valueOf(AbstractC0040p.m109n(dM1024y03.doubleValue(), -90.0d, 90.0d)) : null;
        Double dM1024y04 = AbstractC0431p.m1024y0(strM1662d2);
        Double dValueOf2 = dM1024y04 != null ? Double.valueOf(AbstractC0040p.m109n(dM1024y04.doubleValue(), -180.0d, 180.0d)) : null;
        if (dValueOf == null || dValueOf2 == null || m1489d(dValueOf.doubleValue(), dValueOf2.doubleValue())) {
            f1857d = 39.9042d;
            f1858e = 116.4074d;
        } else {
            f1857d = dValueOf.doubleValue();
            f1858e = dValueOf2.doubleValue();
        }
        return new C0143i(Boolean.valueOf(f1856c), Double.valueOf(f1857d), Double.valueOf(f1858e));
    }

    /* JADX INFO: renamed from: f */
    public static void m1491f(File file, Map map) throws IllegalAccessException, IOException, InvocationTargetException {
        Object objM116u;
        boolean zIsFile = file.isFile();
        C0191v c0191v = C0191v.f402a;
        Map map2 = c0191v;
        if (zIsFile) {
            try {
                objM116u = m1492g(AbstractC0270k.m692i0(file, AbstractC0416a.f921a));
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Object obj = c0191v;
            if (!(objM116u instanceof C0140f)) {
                obj = objM116u;
            }
            map2 = (Map) obj;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.putAll(map);
        StringBuilder sb = new StringBuilder("# OKK config\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            sb.append('\n');
        }
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        AbstractC0270k.m693j0(file, string, AbstractC0416a.f921a);
    }

    /* JADX INFO: renamed from: g */
    public static LinkedHashMap m1492g(String str) {
        C0402e c0402e = new C0402e(new C0403f(AbstractC0425j.m1014S0(str), new C0570A(28)), true, new C0570A(29));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0401d c0401d = new C0401d(c0402e);
        while (c0401d.hasNext()) {
            String str2 = (String) c0401d.next();
            int iM1010O0 = AbstractC0425j.m1010O0(str2, '=', 0, false, 6);
            String strSubstring = str2.substring(0, iM1010O0);
            AbstractC0307g.m702d(strSubstring, "substring(...)");
            String string = AbstractC0425j.m1022a1(strSubstring).toString();
            String strSubstring2 = str2.substring(iM1010O0 + 1);
            AbstractC0307g.m702d(strSubstring2, "substring(...)");
            linkedHashMap.put(string, AbstractC0425j.m1022a1(strSubstring2).toString());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0139e m1493h(Context context) {
        Object objM116u;
        LocationManager locationManager;
        Object objM116u2;
        Object objM116u3;
        if (context == null) {
            return null;
        }
        try {
            Object systemService = context.getSystemService("location");
            locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (locationManager == null) {
            return null;
        }
        Location location = null;
        for (String str : AbstractC0182m.m556h0("gps", "network", "passive")) {
            try {
                objM116u2 = Boolean.valueOf(locationManager.isProviderEnabled(str));
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            Object obj = Boolean.FALSE;
            if (objM116u2 instanceof C0140f) {
                objM116u2 = obj;
            }
            if (((Boolean) objM116u2).booleanValue() || AbstractC0307g.m699a(str, "passive")) {
                try {
                    objM116u3 = locationManager.getLastKnownLocation(str);
                } catch (Throwable th3) {
                    objM116u3 = AbstractC0040p.m116u(th3);
                }
                if (objM116u3 instanceof C0140f) {
                    objM116u3 = null;
                }
                Location location2 = (Location) objM116u3;
                if (location2 != null && (location == null || location2.getTime() > location.getTime())) {
                    location = location2;
                }
            }
        }
        if (location != null) {
            double latitude = location.getLatitude();
            if (-90.0d > latitude || latitude > 90.0d) {
                objM116u = null;
            } else {
                double longitude = location.getLongitude();
                if (-180.0d <= longitude && longitude <= 180.0d) {
                    objM116u = new C0139e(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                }
            }
        }
        return (C0139e) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: i */
    public static void m1494i(final boolean z2, double d2, double d3, Context context, boolean z3) {
        File externalFilesDir;
        double dM109n = AbstractC0040p.m109n(d2, -90.0d, 90.0d);
        double dM109n2 = AbstractC0040p.m109n(d3, -180.0d, 180.0d);
        f1856c = z2;
        f1857d = dM109n;
        f1858e = dM109n2;
        f1855b = System.currentTimeMillis();
        Locale locale = Locale.US;
        final String str = String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(dM109n)}, 1));
        final String str2 = String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(dM109n2)}, 1));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("# OKK virtual location\n");
        sb.append("virtual_location_enabled=" + z2);
        sb.append('\n');
        sb.append("virtual_location_latitude=".concat(str));
        sb.append('\n');
        sb.append("virtual_location_longitude=".concat(str2));
        sb.append('\n');
        sb.append("virtual_location_updated=" + jCurrentTimeMillis);
        sb.append('\n');
        final String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "achat_config.properties"));
        if (context != null && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            arrayList.add(new File(externalFilesDir, "achat_config.properties"));
        }
        HashSet hashSet = new HashSet();
        final ArrayList<File> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((File) obj).getAbsolutePath())) {
                arrayList2.add(obj);
            }
        }
        if (z3) {
            final int iIncrementAndGet = f1859f.incrementAndGet();
            f1860g.execute(new Runnable() { // from class: c0.K1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z4 = z2;
                    long j2 = jCurrentTimeMillis;
                    List<File> list = arrayList2;
                    AbstractC0307g.m703e(list, "$targets");
                    String str3 = str;
                    AbstractC0307g.m703e(str3, "$latText");
                    String str4 = str2;
                    AbstractC0307g.m703e(str4, "$lonText");
                    String str5 = string;
                    AbstractC0307g.m703e(str5, "$body");
                    if (iIncrementAndGet != VirtualLocationHook.f1859f.get()) {
                        return;
                    }
                    for (File file : list) {
                        VirtualLocationHook virtualLocationHook = VirtualLocationHook.f1854a;
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            VirtualLocationHook.m1491f(file, AbstractC0193x.m564h0(new C0139e("virtual_location_enabled", String.valueOf(z4)), new C0139e("virtual_location_latitude", str3), new C0139e("virtual_location_longitude", str4), new C0139e("virtual_location_updated", String.valueOf(j2))));
                        } catch (Throwable th) {
                            AbstractC0040p.m116u(th);
                        }
                    }
                    try {
                        File file2 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "virtual_location.properties");
                        File parentFile2 = file2.getParentFile();
                        if (parentFile2 != null) {
                            parentFile2.mkdirs();
                        }
                        AbstractC0270k.m693j0(file2, str5, AbstractC0416a.f921a);
                    } catch (Throwable th2) {
                        AbstractC0040p.m116u(th2);
                    }
                }
            });
            return;
        }
        for (File file : arrayList2) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                m1491f(file, AbstractC0193x.m564h0(new C0139e("virtual_location_enabled", String.valueOf(z2)), new C0139e("virtual_location_latitude", str), new C0139e("virtual_location_longitude", str2), new C0139e("virtual_location_updated", String.valueOf(jCurrentTimeMillis))));
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0139e m1495b(Context context) {
        C0139e c0139eM1493h = m1493h(context);
        if (c0139eM1493h != null) {
            return c0139eM1493h;
        }
        C0143i c0143iM1490e = m1490e(this);
        Object obj = c0143iM1490e.f335b;
        double dDoubleValue = ((Number) obj).doubleValue();
        Object obj2 = c0143iM1490e.f336c;
        if (!m1489d(dDoubleValue, ((Number) obj2).doubleValue())) {
            return new C0139e(obj, obj2);
        }
        C0139e c0139eM1493h2 = m1493h(context);
        return c0139eM1493h2 != null ? c0139eM1493h2 : new C0139e(Double.valueOf(39.9042d), Double.valueOf(116.4074d));
    }
}
