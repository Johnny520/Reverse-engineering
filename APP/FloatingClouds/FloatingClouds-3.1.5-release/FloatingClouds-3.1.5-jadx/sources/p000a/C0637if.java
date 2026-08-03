package p000a;

import android.content.Context;
import android.content.Intent;
import io.github.libxposed.api.XposedInterface;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p000a.C0186K3;
import p000a.C0675kf;
import p000a.C0723n6;
import p000a.C0875v6;
import p000a.C0875v6.b;

/* JADX INFO: renamed from: a.if */
/* JADX INFO: loaded from: classes.dex */
public final class C0637if {

    /* JADX INFO: renamed from: c */
    public static volatile int f2313c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f2314d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f2315e;

    /* JADX INFO: renamed from: f */
    public static volatile int f2316f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f2317g;

    /* JADX INFO: renamed from: i */
    public static volatile boolean f2319i;

    /* JADX INFO: renamed from: j */
    public static volatile C0675kf f2320j;

    /* JADX INFO: renamed from: a */
    public static final C0637if f2311a = new C0637if();

    /* JADX INFO: renamed from: b */
    public static volatile String f2312b = "CACHE_MISS";

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap<String, Boolean> f2318h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a.if$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f2321a;

        /* JADX INFO: renamed from: b */
        public final String f2322b;

        /* JADX INFO: renamed from: c */
        public final boolean f2323c;

        /* JADX INFO: renamed from: d */
        public final String f2324d;

        public a(long j, String str, boolean z, String str2) {
            C0631i9.m1482e(str, "layer");
            C0631i9.m1482e(str2, "detail");
            this.f2321a = j;
            this.f2322b = str;
            this.f2323c = z;
            this.f2324d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2321a == aVar.f2321a && C0631i9.m1478a(this.f2322b, aVar.f2322b) && this.f2323c == aVar.f2323c && C0631i9.m1478a(this.f2324d, aVar.f2324d);
        }

        public final int hashCode() {
            return this.f2324d.hashCode() + ((Boolean.hashCode(this.f2323c) + C0944z.m2222b(this.f2322b, Long.hashCode(this.f2321a) * 31, 31)) * 31);
        }

        public final String toString() {
            return "InterceptEvent(timeMs=" + this.f2321a + ", layer=" + this.f2322b + ", blocked=" + this.f2323c + ", detail=" + this.f2324d + ")";
        }
    }

    /* JADX INFO: renamed from: a.if$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f2325a;

        /* JADX INFO: renamed from: b */
        public final boolean f2326b;

        /* JADX INFO: renamed from: c */
        public final boolean f2327c;

        /* JADX INFO: renamed from: d */
        public final boolean f2328d;

        public b(String str, boolean z, boolean z2, boolean z3) {
            this.f2325a = str;
            this.f2326b = z;
            this.f2327c = z2;
            this.f2328d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C0631i9.m1478a(this.f2325a, bVar.f2325a) && this.f2326b == bVar.f2326b && this.f2327c == bVar.f2327c && this.f2328d == bVar.f2328d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f2328d) + ((Boolean.hashCode(this.f2327c) + ((Boolean.hashCode(this.f2326b) + (this.f2325a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "LayerStatusLocal(name=" + this.f2325a + ", classExists=" + this.f2326b + ", hooked=" + this.f2327c + ", blocked=" + this.f2328d + ")";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1487a() {
        int i;
        String str;
        Object[] objArr;
        boolean z = false;
        if (!m1493g()) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] cleanupPatchFiles skipped (isActive=false)"}, 1));
            C0723n6.m1658f(false, 0, false, "inactive");
            return;
        }
        if (C0601gh.f2228b.isEmpty()) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2227g("[BlockHotUpdate] cleanupPatchFiles FAILED: tinker path segments not ready (locateState=", f2312b, ")")}, 1));
            C0723n6.m1658f(false, 0, true, "PATH_SEGMENTS_NOT_READY");
            return;
        }
        try {
            File fileM1440b = C0601gh.m1440b();
            boolean z2 = false;
            i = 0;
            for (File file : C0601gh.m1439a()) {
                try {
                    if (file.isDirectory()) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles == null) {
                            fileArrListFiles = new File[0];
                        }
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            C0631i9.m1481d(name, "getName(...)");
                            if (C0601gh.m1441c(name)) {
                                try {
                                    C0875v6.b bVar = new C0875v6(file2).new b();
                                    while (true) {
                                        objArr = true;
                                        while (bVar.hasNext()) {
                                            File next = bVar.next();
                                            if (!next.delete() && next.exists()) {
                                                objArr = false;
                                            } else if (objArr == true) {
                                                break;
                                            } else {
                                                objArr = false;
                                            }
                                        }
                                    }
                                    if (objArr != false) {
                                        i++;
                                    }
                                    z2 = true;
                                } catch (Throwable th) {
                                    th = th;
                                    z = true;
                                    String message = th.getMessage();
                                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"[BlockHotUpdate] cleanupPatchFiles error", th}, 2));
                                    str = message;
                                    C0723n6.m1658f(z, i, true, str);
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = z2;
                }
            }
            File[] fileArrListFiles2 = fileM1440b.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file3 : fileArrListFiles2) {
                    if (file3.isFile()) {
                        String name2 = file3.getName();
                        C0631i9.m1481d(name2, "getName(...)");
                        if (C0601gh.m1441c(name2)) {
                            if (file3.delete()) {
                                i++;
                            }
                            z2 = true;
                        } else {
                            continue;
                        }
                    }
                }
            }
            z = z2;
            try {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] cleanupPatchFiles hadPatch=" + z + " deleted=" + i}, 1));
                str = null;
            } catch (Throwable th3) {
                th = th3;
                String message2 = th.getMessage();
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"[BlockHotUpdate] cleanupPatchFiles error", th}, 2));
                str = message2;
            }
        } catch (Throwable th4) {
            th = th4;
            i = 0;
        }
        C0723n6.m1658f(z, i, true, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1488b(ClassLoader classLoader, C0173J8 c0173j8) {
        boolean z;
        boolean z2;
        b bVar;
        boolean z3;
        List<b> listM1757d0;
        String str;
        String str2;
        String str3;
        int i;
        boolean z4;
        String str4;
        C0631i9.m1482e(classLoader, "cl");
        boolean zM45D = C0015Ae.m45D(c0173j8.f609b, ":patch");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] diagnose locateState=" + f2312b + " pathReady=" + (!C0601gh.f2228b.isEmpty()) + " segments=" + C0601gh.f2228b.size()}, 1));
        C0675kf c0675kf = f2320j;
        int i2 = 0;
        if (!zM45D) {
            ConcurrentHashMap<String, Boolean> concurrentHashMap = f2318h;
            Boolean bool = concurrentHashMap.get("L0");
            b bVar2 = new b("L0", true, bool != null ? bool.booleanValue() : false, f2313c > 0);
            if (c0675kf == null || (str3 = c0675kf.f2519f) == null) {
                z = false;
                Boolean bool2 = concurrentHashMap.get("L1");
                b bVar3 = new b("L1", z, bool2 == null ? bool2.booleanValue() : false, f2314d);
                if (c0675kf != null || (str2 = c0675kf.f2514a) == null) {
                    z2 = false;
                    Boolean bool3 = concurrentHashMap.get("L2");
                    bVar = new b("L2", z2, bool3 != null ? bool3.booleanValue() : false, f2315e);
                    if (c0675kf == null || (str = c0675kf.f2517d) == null) {
                        z3 = false;
                        Boolean bool4 = concurrentHashMap.get("L3");
                        listM1757d0 = C0739o3.m1757d0(bVar2, bVar3, bVar, new b("L3", z3, bool4 != null ? bool4.booleanValue() : false, f2316f > 0));
                    } else {
                        f2311a.getClass();
                        if (C0002A1.m13b(classLoader, str) != null) {
                            z3 = true;
                        }
                        Boolean bool42 = concurrentHashMap.get("L3");
                        listM1757d0 = C0739o3.m1757d0(bVar2, bVar3, bVar, new b("L3", z3, bool42 != null ? bool42.booleanValue() : false, f2316f > 0));
                    }
                } else {
                    f2311a.getClass();
                    if (C0002A1.m13b(classLoader, str2) != null) {
                        z2 = true;
                    }
                    Boolean bool32 = concurrentHashMap.get("L2");
                    bVar = new b("L2", z2, bool32 != null ? bool32.booleanValue() : false, f2315e);
                    if (c0675kf == null) {
                        z3 = false;
                        Boolean bool422 = concurrentHashMap.get("L3");
                        listM1757d0 = C0739o3.m1757d0(bVar2, bVar3, bVar, new b("L3", z3, bool422 != null ? bool422.booleanValue() : false, f2316f > 0));
                    }
                }
            } else {
                f2311a.getClass();
                if (C0002A1.m13b(classLoader, str3) != null) {
                    z = true;
                }
                Boolean bool22 = concurrentHashMap.get("L1");
                b bVar32 = new b("L1", z, bool22 == null ? bool22.booleanValue() : false, f2314d);
                if (c0675kf != null) {
                    z2 = false;
                    Boolean bool322 = concurrentHashMap.get("L2");
                    bVar = new b("L2", z2, bool322 != null ? bool322.booleanValue() : false, f2315e);
                    if (c0675kf == null) {
                    }
                }
            }
        } else if (c0675kf == null || (str4 = c0675kf.f2521h) == null) {
            z4 = false;
            Boolean bool5 = f2318h.get("L4");
            listM1757d0 = C0889w1.m2124K(new b("L4", z4, bool5 == null ? bool5.booleanValue() : false, f2317g));
        } else {
            f2311a.getClass();
            if (C0002A1.m13b(classLoader, str4) != null) {
                z4 = true;
            }
            Boolean bool52 = f2318h.get("L4");
            listM1757d0 = C0889w1.m2124K(new b("L4", z4, bool52 == null ? bool52.booleanValue() : false, f2317g));
        }
        String str5 = zM45D ? "patch" : "main";
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] diagnose (" + str5 + " process) layers=" + listM1757d0.size()}, 1));
        boolean z5 = C0723n6.f2804a;
        ArrayList<C0723n6.a> arrayList = new ArrayList(C0758p3.m1800g0(listM1757d0, 10));
        for (b bVar4 : listM1757d0) {
            arrayList.add(new C0723n6.a(bVar4.f2325a, bVar4.f2326b, bVar4.f2327c, bVar4.f2328d));
        }
        C0723n6.f2808e = arrayList;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((C0723n6.a) it.next()).f2825c && (i = i + 1) < 0) {
                    C0739o3.m1759f0();
                    throw null;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (C0723n6.a aVar : arrayList) {
                if (aVar.f2824b && !aVar.f2825c && (i2 = i2 + 1) < 0) {
                    C0739o3.m1759f0();
                    throw null;
                }
            }
        }
        String str6 = i2 > 0 ? "WARN" : i == 0 ? "FAIL" : "OK";
        C0908x1.m2194b("[DIAG-HEALTH] module=TinkerFixLayers status=" + str6 + " ok=" + i + " fail=" + i2 + " total=" + arrayList.size());
        for (C0723n6.a aVar2 : arrayList) {
            boolean z6 = aVar2.f2824b;
            String str7 = !z6 ? "CLASS_MISSING" : !aVar2.f2825c ? "NOT_HOOKED" : aVar2.f2826d ? "BLOCKED" : "HOOKED_IDLE";
            C0908x1.m2194b("[DIAG-HEALTH]   layer=" + aVar2.f2823a + " classExists=" + z6 + " hooked=" + aVar2.f2825c + " blocked=" + aVar2.f2826d + " state=" + str7);
        }
        C0908x1.m2194b("[DIAG-HEALTH]   note=nonTinkerChannel(NOT_COVERED) reason=仅覆盖 Tinker / LegacyTinkerCore 热更新通道");
        boolean z7 = C0723n6.f2804a;
        boolean z8 = f2319i;
        C0723n6.f2809f = Boolean.valueOf(z8);
        C0908x1.m2194b("[DIAG-HEALTH] module=TinkerFixTiming status=" + (z8 ? "OK" : "FAIL") + " registeredBeforeTryLoad=" + z8 + " note=拦截层已在首次 tryLoad 前同步注册（onPackageReady）");
    }

    /* JADX INFO: renamed from: c */
    public static void m1489c() {
        if (m1493g() && f2320j == null && C0889w1.f3484l != null) {
            Thread thread = new Thread(new RunnableC0679l0(4));
            thread.setName("TinkerSymbolLocate");
            thread.setDaemon(true);
            thread.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[Catch: all -> 0x00e8, TryCatch #1 {all -> 0x00e8, blocks: (B:45:0x00ba, B:48:0x00c6, B:50:0x00de, B:53:0x00ea), top: B:129:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1490d(C0173J8 c0173j8) {
        C0675kf c0675kfM1545a;
        File fileM1520a;
        JSONObject jSONObject;
        C0675kf c0675kfM1545a2;
        long j;
        boolean z;
        String str;
        final String str2;
        final int i = 2;
        final int i2 = 3;
        final int i3 = 0;
        final int i4 = 1;
        f2319i = true;
        if (!m1493g()) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] install skipped (isActive=false)"}, 1));
            return;
        }
        C0656jf c0656jf = C0656jf.f2462a;
        C0675kf c0675kfM1521b = C0656jf.f2464c;
        if (c0675kfM1521b != null) {
            c0656jf.getClass();
            C0656jf.f2466e = "CACHE";
        } else {
            c0656jf.getClass();
            c0675kfM1521b = null;
            if (C0889w1.f3488p == null) {
                try {
                    fileM1520a = C0656jf.m1520a();
                } catch (Throwable th) {
                    C0908x1.m2197e("[TinkerLocator] loadFromFile failed", th);
                }
                if (fileM1520a.isFile()) {
                    c0675kfM1545a = null;
                    if (c0675kfM1545a != null && c0675kfM1545a.m1543a()) {
                        C0656jf.f2464c = c0675kfM1545a;
                        C0656jf.f2466e = "FILE";
                        c0675kfM1521b = c0675kfM1545a;
                    } else if (C0889w1.f3484l == null) {
                        C0656jf.f2466e = "NONE";
                    } else {
                        c0675kfM1521b = C0656jf.m1521b();
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject(C0889w1.m2133T(fileM1520a));
                    C0675kf.f2513m.getClass();
                    c0675kfM1545a = C0675kf.a.m1545a(jSONObject2);
                    if (c0675kfM1545a.m1543a()) {
                        C0908x1.m2194b("[TinkerLocator] file cache hit: " + c0675kfM1545a.f2514a);
                        if (c0675kfM1545a != null) {
                        }
                    } else {
                        C0908x1.m2197e("[TinkerLocator] file cache incomplete, ignore");
                        c0675kfM1545a = null;
                        if (c0675kfM1545a != null) {
                            if (C0889w1.f3484l == null) {
                            }
                        }
                    }
                }
            } else {
                ?? r4 = C0475a5.f1753a;
                if (r4 == 0 || (str = (String) r4.get("tinker_symbols_v1")) == null) {
                    jSONObject = null;
                    if (jSONObject != null) {
                        c0675kfM1545a2 = null;
                        if (c0675kfM1545a2 == null && c0675kfM1545a2.m1543a()) {
                            C0656jf.f2462a.getClass();
                            boolean z2 = C0601gh.f2227a;
                            Context context = C0889w1.f3488p;
                            if (context == null) {
                                j = 0;
                                if (j > 0) {
                                    z = true;
                                    if (!z) {
                                        C0656jf.f2464c = c0675kfM1545a2;
                                        C0656jf.f2466e = "SP";
                                        c0675kfM1521b = c0675kfM1545a2;
                                    }
                                } else {
                                    long j2 = c0675kfM1545a2.f2525l;
                                    if (j2 > 0) {
                                        z = j == j2;
                                        if (!z) {
                                            C0908x1.m2197e("[TinkerLocator] cache version mismatch: cached=" + j2 + " current=" + j);
                                        }
                                    }
                                    if (!z) {
                                    }
                                }
                            } else {
                                try {
                                    j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                                } catch (Throwable unused) {
                                    j = 0;
                                }
                                if (j > 0) {
                                }
                            }
                        }
                    } else {
                        try {
                            C0675kf.f2513m.getClass();
                            c0675kfM1545a2 = C0675kf.a.m1545a(jSONObject);
                        } catch (Exception unused2) {
                            c0675kfM1545a2 = null;
                        }
                        if (c0675kfM1545a2 == null) {
                            fileM1520a = C0656jf.m1520a();
                            if (fileM1520a.isFile()) {
                            }
                        }
                    }
                } else {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (Exception unused3) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                    }
                }
            }
        }
        if (c0675kfM1521b == null) {
            C0656jf.f2462a.getClass();
            if (C0656jf.f2465d) {
                f2312b = "LOCATE_FAILED";
            } else {
                f2312b = "CACHE_MISS";
            }
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2227g("[BlockHotUpdate] install FAILED: symbols not located (state=", f2312b, ") — 本次会话不拦截，DkBridge 就绪后由 ensureAsyncLocate 补位，下次启动生效")}, 1));
            return;
        }
        C0656jf.f2462a.getClass();
        f2312b = C0631i9.m1478a(C0656jf.f2466e, "DEXKIT") ? "LOCATE_OK" : "CACHE_HIT";
        f2320j = c0675kfM1521b;
        List<String> list = c0675kfM1521b.f2523j;
        boolean z3 = C0601gh.f2227a;
        ArrayList arrayListM1953q0 = C0834t3.m1953q0(C0601gh.f2228b, list);
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM1953q0, 10));
        Iterator it = arrayListM1953q0.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            C0631i9.m1481d(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        List<String> listM1959w0 = C0834t3.m1959w0(new LinkedHashSet(arrayList2));
        C0601gh.f2228b = listM1959w0;
        C0908x1.m2194b(C0944z.m2223c(listM1959w0.size(), "WechatPaths: tinker path segments injected (count=", ")"));
        if (C0015Ae.m45D(c0173j8.f609b, ":patch")) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("[BlockHotUpdate] install (patch process) -> L4 only, locateState=", f2312b)}, 1));
            final String str3 = c0675kfM1521b.f2521h;
            if (str3 != null && (str2 = c0675kfM1521b.f2522i) != null) {
                m1495i("L4", C0889w1.m2124K(C0173J8.m463a(c0173j8, str3, str2, new Class[]{Intent.class}, new InterfaceC0064D7() { // from class: a.hf
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj2) {
                        switch (i2) {
                            case 0:
                                String str4 = str3;
                                String str5 = str2;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain.proceed();
                                }
                                C0637if.f2314d = true;
                                C0637if.m1494h("L1", str4 + "." + str5, true);
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L1 blocked " + str4 + "." + str5 + " (return false)"}, 1));
                                return Boolean.FALSE;
                            case 1:
                                String str6 = str3;
                                String str7 = str2;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain2, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain2.proceed();
                                }
                                C0637if.f2316f++;
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L3 proceeded " + str6 + "." + str7 + " (allow WeChat init)"}, 1));
                                return chain2.proceed();
                            case 2:
                                String str8 = str3;
                                String str9 = str2;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain3, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain3.proceed();
                                }
                                Object objProceed = chain3.proceed();
                                Intent intent = objProceed instanceof Intent ? (Intent) objProceed : null;
                                int intExtra = intent != null ? intent.getIntExtra("intent_return_code", 0) : -1;
                                C0637if.f2315e = intExtra != 0;
                                C0637if.m1494h("L2", "returnCode=" + intExtra, intExtra != 0);
                                boolean z4 = intExtra == 0;
                                StringBuilder sbM2229i = C0944z.m2229i("[BlockHotUpdate] L2 ", str8, ".", str9, " proceeded, returnCode=");
                                sbM2229i.append(intExtra);
                                sbM2229i.append(" (patch loaded=");
                                sbM2229i.append(z4);
                                sbM2229i.append(")");
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
                                return intent;
                            default:
                                String str10 = str3;
                                String str11 = str2;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain4, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain4.proceed();
                                }
                                C0637if.f2317g = true;
                                C0637if.m1494h("L4", str10 + "." + str11, true);
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L4 blocked " + str10 + "." + str11}, 1));
                                return null;
                        }
                    }
                })));
                return;
            } else {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L4 skipped (patch service not located — wx<8.0.71 or structure changed)"}, 1));
                f2318h.put("L4", Boolean.FALSE);
                return;
            }
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("[BlockHotUpdate] install (main process) -> L0..L3, locateState=", f2312b)}, 1));
        XposedInterface.HookHandle hookHandleM463a = C0173J8.m463a(c0173j8, "java.io.File", "mkdirs", new Class[0], new C0673kd(22));
        XposedInterface.HookHandle hookHandleM463a2 = C0173J8.m463a(c0173j8, "java.io.File", "mkdir", new Class[0], new C0673kd(23));
        XposedInterface.HookHandle hookHandleM463a3 = C0173J8.m463a(c0173j8, "java.io.File", "createNewFile", new Class[0], new C0673kd(24));
        Class cls = Boolean.TYPE;
        m1495i("L0", C0739o3.m1757d0(hookHandleM463a, hookHandleM463a2, hookHandleM463a3, C0173J8.m465c(c0173j8, new Class[]{File.class, cls}, new C0673kd(25)), C0173J8.m465c(c0173j8, new Class[]{String.class, cls}, new C0673kd(26))));
        final String str4 = c0675kfM1521b.f2519f;
        if (str4 == null) {
            m1496j("L1", "security class not located");
        } else {
            final String str5 = c0675kfM1521b.f2520g;
            if (str5 == null) {
                m1496j("L1", "security method not located");
            } else {
                m1495i("L1", C0889w1.m2124K(C0173J8.m463a(c0173j8, str4, str5, new Class[]{File.class}, new InterfaceC0064D7() { // from class: a.hf
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj2) {
                        switch (i3) {
                            case 0:
                                String str42 = str4;
                                String str52 = str5;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain.proceed();
                                }
                                C0637if.f2314d = true;
                                C0637if.m1494h("L1", str42 + "." + str52, true);
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L1 blocked " + str42 + "." + str52 + " (return false)"}, 1));
                                return Boolean.FALSE;
                            case 1:
                                String str6 = str4;
                                String str7 = str5;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain2, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain2.proceed();
                                }
                                C0637if.f2316f++;
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L3 proceeded " + str6 + "." + str7 + " (allow WeChat init)"}, 1));
                                return chain2.proceed();
                            case 2:
                                String str8 = str4;
                                String str9 = str5;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain3, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain3.proceed();
                                }
                                Object objProceed = chain3.proceed();
                                Intent intent = objProceed instanceof Intent ? (Intent) objProceed : null;
                                int intExtra = intent != null ? intent.getIntExtra("intent_return_code", 0) : -1;
                                C0637if.f2315e = intExtra != 0;
                                C0637if.m1494h("L2", "returnCode=" + intExtra, intExtra != 0);
                                boolean z4 = intExtra == 0;
                                StringBuilder sbM2229i = C0944z.m2229i("[BlockHotUpdate] L2 ", str8, ".", str9, " proceeded, returnCode=");
                                sbM2229i.append(intExtra);
                                sbM2229i.append(" (patch loaded=");
                                sbM2229i.append(z4);
                                sbM2229i.append(")");
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
                                return intent;
                            default:
                                String str10 = str4;
                                String str11 = str5;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain4, "chain");
                                C0637if.f2311a.getClass();
                                if (!C0637if.m1493g()) {
                                    return chain4.proceed();
                                }
                                C0637if.f2317g = true;
                                C0637if.m1494h("L4", str10 + "." + str11, true);
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L4 blocked " + str10 + "." + str11}, 1));
                                return null;
                        }
                    }
                })));
            }
        }
        final String str6 = c0675kfM1521b.f2514a;
        if (str6 == null) {
            m1496j("L2", "loader class not located");
        } else {
            final String str7 = c0675kfM1521b.f2515b;
            if (str7 == null) {
                m1496j("L2", "loader method not located");
            } else {
                String str8 = c0675kfM1521b.f2516c;
                if (str8 == null) {
                    m1496j("L2", "loader param type not located");
                } else {
                    Class clsM13b = C0002A1.m13b(c0173j8.f608a, str8);
                    if (clsM13b == null) {
                        m1496j("L2", "param class load failed: ".concat(str8));
                    } else {
                        m1495i("L2", C0889w1.m2124K(C0173J8.m463a(c0173j8, str6, str7, new Class[]{clsM13b}, new InterfaceC0064D7() { // from class: a.hf
                            @Override // p000a.InterfaceC0064D7
                            /* JADX INFO: renamed from: f */
                            public final Object mo53f(Object obj2) {
                                switch (i) {
                                    case 0:
                                        String str42 = str6;
                                        String str52 = str7;
                                        XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                        C0631i9.m1482e(chain, "chain");
                                        C0637if.f2311a.getClass();
                                        if (!C0637if.m1493g()) {
                                            return chain.proceed();
                                        }
                                        C0637if.f2314d = true;
                                        C0637if.m1494h("L1", str42 + "." + str52, true);
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L1 blocked " + str42 + "." + str52 + " (return false)"}, 1));
                                        return Boolean.FALSE;
                                    case 1:
                                        String str62 = str6;
                                        String str72 = str7;
                                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                        C0631i9.m1482e(chain2, "chain");
                                        C0637if.f2311a.getClass();
                                        if (!C0637if.m1493g()) {
                                            return chain2.proceed();
                                        }
                                        C0637if.f2316f++;
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L3 proceeded " + str62 + "." + str72 + " (allow WeChat init)"}, 1));
                                        return chain2.proceed();
                                    case 2:
                                        String str82 = str6;
                                        String str9 = str7;
                                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                        C0631i9.m1482e(chain3, "chain");
                                        C0637if.f2311a.getClass();
                                        if (!C0637if.m1493g()) {
                                            return chain3.proceed();
                                        }
                                        Object objProceed = chain3.proceed();
                                        Intent intent = objProceed instanceof Intent ? (Intent) objProceed : null;
                                        int intExtra = intent != null ? intent.getIntExtra("intent_return_code", 0) : -1;
                                        C0637if.f2315e = intExtra != 0;
                                        C0637if.m1494h("L2", "returnCode=" + intExtra, intExtra != 0);
                                        boolean z4 = intExtra == 0;
                                        StringBuilder sbM2229i = C0944z.m2229i("[BlockHotUpdate] L2 ", str82, ".", str9, " proceeded, returnCode=");
                                        sbM2229i.append(intExtra);
                                        sbM2229i.append(" (patch loaded=");
                                        sbM2229i.append(z4);
                                        sbM2229i.append(")");
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
                                        return intent;
                                    default:
                                        String str10 = str6;
                                        String str11 = str7;
                                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                        C0631i9.m1482e(chain4, "chain");
                                        C0637if.f2311a.getClass();
                                        if (!C0637if.m1493g()) {
                                            return chain4.proceed();
                                        }
                                        C0637if.f2317g = true;
                                        C0637if.m1494h("L4", str10 + "." + str11, true);
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L4 blocked " + str10 + "." + str11}, 1));
                                        return null;
                                }
                            }
                        })));
                    }
                }
            }
        }
        final String str9 = c0675kfM1521b.f2517d;
        if (str9 == null) {
            m1496j("L3", "app class not located");
            return;
        }
        final String str10 = c0675kfM1521b.f2518e;
        if (str10 == null) {
            m1496j("L3", "app entry method not located");
            return;
        }
        Class cls2 = Long.TYPE;
        C0631i9.m1479b(cls2);
        m1495i("L3", C0889w1.m2124K(C0173J8.m463a(c0173j8, str9, str10, new Class[]{Context.class, cls2, cls2}, new InterfaceC0064D7() { // from class: a.hf
            @Override // p000a.InterfaceC0064D7
            /* JADX INFO: renamed from: f */
            public final Object mo53f(Object obj2) {
                switch (i4) {
                    case 0:
                        String str42 = str9;
                        String str52 = str10;
                        XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                        C0631i9.m1482e(chain, "chain");
                        C0637if.f2311a.getClass();
                        if (!C0637if.m1493g()) {
                            return chain.proceed();
                        }
                        C0637if.f2314d = true;
                        C0637if.m1494h("L1", str42 + "." + str52, true);
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L1 blocked " + str42 + "." + str52 + " (return false)"}, 1));
                        return Boolean.FALSE;
                    case 1:
                        String str62 = str9;
                        String str72 = str10;
                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                        C0631i9.m1482e(chain2, "chain");
                        C0637if.f2311a.getClass();
                        if (!C0637if.m1493g()) {
                            return chain2.proceed();
                        }
                        C0637if.f2316f++;
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L3 proceeded " + str62 + "." + str72 + " (allow WeChat init)"}, 1));
                        return chain2.proceed();
                    case 2:
                        String str82 = str9;
                        String str92 = str10;
                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                        C0631i9.m1482e(chain3, "chain");
                        C0637if.f2311a.getClass();
                        if (!C0637if.m1493g()) {
                            return chain3.proceed();
                        }
                        Object objProceed = chain3.proceed();
                        Intent intent = objProceed instanceof Intent ? (Intent) objProceed : null;
                        int intExtra = intent != null ? intent.getIntExtra("intent_return_code", 0) : -1;
                        C0637if.f2315e = intExtra != 0;
                        C0637if.m1494h("L2", "returnCode=" + intExtra, intExtra != 0);
                        boolean z4 = intExtra == 0;
                        StringBuilder sbM2229i = C0944z.m2229i("[BlockHotUpdate] L2 ", str82, ".", str92, " proceeded, returnCode=");
                        sbM2229i.append(intExtra);
                        sbM2229i.append(" (patch loaded=");
                        sbM2229i.append(z4);
                        sbM2229i.append(")");
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
                        return intent;
                    default:
                        String str102 = str9;
                        String str11 = str10;
                        XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                        C0631i9.m1482e(chain4, "chain");
                        C0637if.f2311a.getClass();
                        if (!C0637if.m1493g()) {
                            return chain4.proceed();
                        }
                        C0637if.f2317g = true;
                        C0637if.m1494h("L4", str102 + "." + str11, true);
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L4 blocked " + str102 + "." + str11}, 1));
                        return null;
                }
            }
        })));
    }

    /* JADX INFO: renamed from: e */
    public static Object m1491e(XposedInterface.Chain chain) {
        String absolutePath;
        if (!m1493g()) {
            return chain.proceed();
        }
        Object thisObject = chain.getThisObject();
        File file = thisObject instanceof File ? (File) thisObject : null;
        if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
            absolutePath = "";
        }
        if (!C0601gh.m1441c(absolutePath)) {
            return chain.proceed();
        }
        f2313c++;
        m1494h("L0", absolutePath, true);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L0 blocked file create: ".concat(absolutePath)}, 1));
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static Object m1492f(XposedInterface.Chain chain) throws FileNotFoundException {
        String absolutePath;
        if (!m1493g()) {
            return chain.proceed();
        }
        List args = chain.getArgs();
        C0631i9.m1481d(args, "getArgs(...)");
        Object objM1951o0 = C0834t3.m1951o0(args, 0);
        File file = objM1951o0 instanceof File ? (File) objM1951o0 : null;
        if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
            List args2 = chain.getArgs();
            C0631i9.m1481d(args2, "getArgs(...)");
            Object objM1951o02 = C0834t3.m1951o0(args2, 0);
            String str = objM1951o02 instanceof String ? (String) objM1951o02 : null;
            absolutePath = str == null ? "" : str;
        }
        if (!C0601gh.m1441c(absolutePath)) {
            return chain.proceed();
        }
        f2313c++;
        m1494h("L0", absolutePath, true);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[BlockHotUpdate] L0 blocked FileOutputStream: ".concat(absolutePath)}, 1));
        throw new FileNotFoundException("blocked by FloatingClouds: ".concat(absolutePath));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1493g() {
        C0186K3.f638a.getClass();
        if (C0889w1.f3488p != null) {
            return C0186K3.a.m508i().f2421M;
        }
        try {
            File file = new File(C0601gh.m1440b(), "shared_prefs");
            File file2 = new File(file, "fc_options.xml");
            C0459Z7 c0459z7 = null;
            if (!file2.isFile()) {
                file2 = null;
            }
            if (file2 == null) {
                file2 = new File(file, "fc_config.xml");
                if (!file2.isFile()) {
                    file2 = null;
                }
                if (file2 == null) {
                    file2 = new File(file, "mask_wechat_options.xml");
                    if (!file2.isFile()) {
                        file2 = null;
                    }
                    if (file2 == null) {
                        file2 = new File(file, "mask_wechat_config.xml");
                    }
                }
            }
            if (file2.isFile()) {
                String strM2133T = C0889w1.m2133T(file2);
                Pattern patternCompile = Pattern.compile("<boolean\\s+name=\"blockHotUpdate\"\\s+value=\"(true|false)\"\\s*/>");
                C0631i9.m1481d(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(strM2133T);
                C0631i9.m1481d(matcher, "matcher(...)");
                if (matcher.find(0)) {
                    c0459z7 = new C0459Z7(matcher, strM2133T);
                }
                if (c0459z7 != null) {
                    if (((C0917xa) c0459z7.f1727b) == null) {
                        c0459z7.f1727b = new C0917xa(c0459z7);
                    }
                    C0917xa c0917xa = (C0917xa) c0459z7.f1727b;
                    C0631i9.m1479b(c0917xa);
                    return C0631i9.m1478a(c0917xa.get(1), "true");
                }
            }
        } catch (Throwable th) {
            C0908x1.m2197e("ConfigUtil: readBooleanOptionFromDisk fail for blockHotUpdate", th);
        }
        return true;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: h */
    public static void m1494h(String str, String str2, boolean z) {
        C0186K3.a aVar = C0186K3.f638a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        C0631i9.m1482e(str2, "detail");
        try {
            File file = new File(C0601gh.m1440b(), "hotupdate_intercept_events.log");
            String str3 = jCurrentTimeMillis + "|" + str + "|" + (z ? 1 : 0) + "|" + str2 + "\n";
            Charset charset = C0382V2.f1441a;
            C0631i9.m1482e(str3, "text");
            C0631i9.m1482e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                C0889w1.m2138Y(fileOutputStream, str3, charset);
                C0413Wf c0413Wf = C0413Wf.f1577a;
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1495i(String str, List list) {
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((XposedInterface.HookHandle) it.next()) != null) {
                    z = true;
                    break;
                }
            }
        }
        f2318h.put(str, Boolean.valueOf(z));
        if (z) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("[BlockHotUpdate] ", str, " OK (hooked)")}, 1));
        } else {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2227g("[BlockHotUpdate] ", str, " FAILED (method not found)")}, 1));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1496j(String str, String str2) {
        f2318h.put(str, Boolean.FALSE);
        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[BlockHotUpdate] " + str + " FAILED (reason=" + str2 + ")"}, 1));
    }
}
