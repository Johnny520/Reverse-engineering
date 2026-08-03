package p000a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p000a.C0021B1;
import p000a.C0088Ed;
import p000a.C0186K3;
import p000a.C0319Rb;
import p000a.C0475a5;
import p000a.C0845te;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.fh */
/* JADX INFO: loaded from: classes.dex */
public final class C0582fh implements IPlugin, C0186K3.b {

    /* JADX INFO: renamed from: G */
    public static final ExecutorService f2149G;

    /* JADX INFO: renamed from: A */
    public final C0879va f2150A;

    /* JADX INFO: renamed from: B */
    public final C0627i5 f2151B;

    /* JADX INFO: renamed from: C */
    public final C0268Od f2152C;

    /* JADX INFO: renamed from: D */
    public final C0953z8 f2153D;

    /* JADX INFO: renamed from: E */
    public final C0068Db f2154E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f2155F;

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f2156a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<String, MaskItemBean> f2157b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c */
    public final C0801r8 f2158c = new C0801r8();

    /* JADX INFO: renamed from: d */
    public final C0533d6 f2159d = new C0533d6();

    /* JADX INFO: renamed from: e */
    public final C0816s4 f2160e = new C0816s4();

    /* JADX INFO: renamed from: f */
    public final C0918xb f2161f = new C0918xb();

    /* JADX INFO: renamed from: g */
    public final C0376Ue f2162g = new C0376Ue();

    /* JADX INFO: renamed from: h */
    public final C0611h8 f2163h = new C0611h8();

    /* JADX INFO: renamed from: i */
    public final C0605h2 f2164i = new C0605h2();

    /* JADX INFO: renamed from: j */
    public final C0316R8 f2165j = new C0316R8();

    /* JADX INFO: renamed from: k */
    public final C0009A8 f2166k = new C0009A8();

    /* JADX INFO: renamed from: l */
    public final C0065D8 f2167l = new C0065D8();

    /* JADX INFO: renamed from: m */
    public final C0738o2 f2168m = new C0738o2();

    /* JADX INFO: renamed from: n */
    public final C0874v5 f2169n = new C0874v5();

    /* JADX INFO: renamed from: o */
    public final C0820s8 f2170o = new C0820s8();

    /* JADX INFO: renamed from: p */
    public final C0782q8 f2171p = new C0782q8();

    /* JADX INFO: renamed from: q */
    public final C0706m8 f2172q = new C0706m8();

    /* JADX INFO: renamed from: r */
    public final C0353T9 f2173r = new C0353T9();

    /* JADX INFO: renamed from: s */
    public final C0896w8 f2174s = new C0896w8();

    /* JADX INFO: renamed from: t */
    public final C0858u8 f2175t = new C0858u8();

    /* JADX INFO: renamed from: u */
    public final C0592g8 f2176u = new C0592g8();

    /* JADX INFO: renamed from: v */
    public final C0441Y7 f2177v = new C0441Y7();

    /* JADX INFO: renamed from: w */
    public final C0550e4 f2178w = new C0550e4();

    /* JADX INFO: renamed from: x */
    public final C0329S3 f2179x = new C0329S3();

    /* JADX INFO: renamed from: y */
    public final C0624i2 f2180y = new C0624i2();

    /* JADX INFO: renamed from: z */
    public final C0841ta f2181z = new C0841ta();

    /* JADX INFO: renamed from: a.fh$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m1423a(String str) {
            if (str == null || C0034Be.m101P(str)) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"chatUser is null or blank"}, 1));
                return false;
            }
            C0186K3.f638a.getClass();
            ArrayList arrayListM505f = C0186K3.a.m505f();
            if (!arrayListM505f.isEmpty()) {
                Iterator it = arrayListM505f.iterator();
                while (it.hasNext()) {
                    if (C0631i9.m1478a(((MaskItemBean) it.next()).getMaskId(), str)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static {
        new AtomicBoolean(false);
        f2149G = Executors.newCachedThreadPool(new ThreadFactoryC0544dh());
    }

    public C0582fh() {
        C0879va c0879va = new C0879va();
        c0879va.f3450e = -1L;
        this.f2150A = c0879va;
        this.f2151B = new C0627i5();
        this.f2152C = new C0268Od();
        this.f2153D = new C0953z8();
        this.f2154E = new C0068Db();
    }

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap m1420a(C0173J8 c0173j8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ClassLoader classLoader = c0173j8.f608a;
        try {
            C0122Gb.f389a.getClass();
            C0319Rb.a aVarM320h = C0122Gb.m320h(classLoader);
            if (aVarM320h != null) {
                linkedHashMap.put("F010:convStorage", aVarM320h.f1150a.getName());
                linkedHashMap.put("F010:convStorageHelper", aVarM320h.f1151b.getName());
                linkedHashMap.put("F010:convGetter", aVarM320h.f1152c);
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
        try {
            C0319Rb.f1143a.getClass();
            Class clsM890k = C0319Rb.m890k(classLoader);
            if (clsM890k != null) {
                linkedHashMap.put("F007_voip_mgr", clsM890k.getName());
                C0413Wf c0413Wf2 = C0413Wf.f1577a;
            }
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
        try {
            C0319Rb.f1143a.getClass();
            Class clsM884e = C0319Rb.m884e(classLoader);
            if (clsM884e != null) {
                linkedHashMap.put("F010:convStorageLegacy", clsM884e.getName());
                C0413Wf c0413Wf3 = C0413Wf.f1577a;
            }
        } catch (Throwable th3) {
            C0920xd.m2206a(th3);
        }
        try {
            C0319Rb.f1143a.getClass();
            Class clsM885f = C0319Rb.m885f(classLoader);
            if (clsM885f != null) {
                linkedHashMap.put("F010:convStorageHelperLegacy", clsM885f.getName());
                C0413Wf c0413Wf4 = C0413Wf.f1577a;
            }
        } catch (Throwable th4) {
            C0920xd.m2206a(th4);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: A */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m1421b(C0173J8 c0173j8, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0710mc c0710mc = (C0710mc) it.next();
            String str = (String) c0710mc.f2680a;
            IPlugin iPlugin = (IPlugin) c0710mc.f2681b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("WXMaskPlugin: handleHook -> ", str, " START")}, 1));
            try {
                f2149G.submit(new CallableC0563eh(iPlugin, c0173j8, 6)).get(3000L, TimeUnit.MILLISECONDS);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> " + str + " DONE (" + jCurrentTimeMillis2 + "ms)"}, 1));
                C0723n6.m1656d(str, "OK", jCurrentTimeMillis2, null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> " + str + " INTERRUPTED (" + jCurrentTimeMillis3 + "ms)"}, 1));
                C0723n6.m1656d(str, "INTERRUPTED", jCurrentTimeMillis3, null);
            } catch (ExecutionException e) {
                e = e;
                long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> " + str + " FAIL (" + jCurrentTimeMillis4 + "ms)", e}, 2));
                boolean z = C0723n6.f2804a;
                C0723n6.m1656d(str, "FAIL", jCurrentTimeMillis4, e.getMessage());
            } catch (TimeoutException unused2) {
                long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis;
                C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: handleHook -> " + str + " TIMEOUT(" + jCurrentTimeMillis5 + "ms) skip & continue (watchdog)"}, 1));
                C0723n6.m1656d(str, "TIMEOUT", jCurrentTimeMillis5, "init timeout 3000ms");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1422c() {
        ArrayList<String> arrayList = this.f2156a;
        arrayList.clear();
        LinkedHashMap<String, MaskItemBean> linkedHashMap = this.f2157b;
        linkedHashMap.clear();
        C0186K3.f638a.getClass();
        for (MaskItemBean maskItemBean : C0186K3.a.m505f()) {
            linkedHashMap.put(maskItemBean.getMaskId(), maskItemBean);
            arrayList.add(maskItemBean.getMaskId());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v44, resolved type: A */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x069b A[Catch: all -> 0x06b2, TryCatch #12 {all -> 0x06b2, blocks: (B:196:0x0690, B:200:0x06af, B:199:0x069b), top: B:261:0x0690 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02eb A[EXC_TOP_SPLITTER, PHI: r0
  0x02eb: PHI (r0v128 org.json.JSONObject) = (r0v127 org.json.JSONObject), (r0v133 org.json.JSONObject) binds: [B:86:0x02df, B:88:0x02e7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x079f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0454 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bd A[Catch: Exception -> 0x031f, TryCatch #10 {Exception -> 0x031f, blocks: (B:65:0x0266, B:70:0x0277, B:72:0x027f, B:74:0x029b, B:78:0x02b0, B:83:0x02bd, B:85:0x02c5, B:87:0x02e1, B:91:0x02f6, B:96:0x0303, B:98:0x030b), top: B:257:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0303 A[Catch: Exception -> 0x031f, TryCatch #10 {Exception -> 0x031f, blocks: (B:65:0x0266, B:70:0x0277, B:72:0x027f, B:74:0x029b, B:78:0x02b0, B:83:0x02bd, B:85:0x02c5, B:87:0x02e1, B:91:0x02f6, B:96:0x0303, B:98:0x030b), top: B:257:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030a  */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.lang.Object, java.util.List] */
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(C0173J8 c0173j8) {
        C0845te.a aVar;
        Object objM2206a;
        SharedPreferences sharedPreferences;
        Iterator it;
        long j;
        List<String> listMo31a;
        Iterator<String> it2;
        boolean z;
        Iterator it3;
        long j2;
        Class<?> clsMo31a;
        boolean z2;
        C0804rb c0804rb;
        Object objM2206a2;
        Throwable thM2189a;
        boolean z3;
        C0475a5.j jVar;
        JSONObject jSONObjectM1155d;
        C0475a5.i iVar;
        int i;
        int i2;
        String string;
        Object objM2206a3;
        boolean z4 = false;
        int i3 = 3;
        int i4 = 2;
        boolean z5 = true;
        C0631i9.m1482e(c0173j8, "session");
        C0186K3.f638a.getClass();
        C0186K3.a.m513n();
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: ConfigUtil reloaded from disk (early, before any part init)"}, 1));
        if (C0015Ae.m45D(c0173j8.f609b, ":patch")) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: :patch process -> diagnostic-only (skip masking/UI parts)"}, 1));
            try {
                this.f2180y.handleHook(c0173j8);
                objM2206a3 = C0413Wf.f1577a;
            } catch (Throwable th) {
                objM2206a3 = C0920xd.m2206a(th);
            }
            Throwable thM2189a2 = C0901wd.m2189a(objM2206a3);
            if (thM2189a2 != null) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: :patch diagnostic FAILED", thM2189a2}, 2));
                return;
            }
            return;
        }
        CallableC0563eh callableC0563eh = new CallableC0563eh(this, c0173j8, i4);
        ExecutorService executorService = f2149G;
        executorService.submit(callableC0563eh);
        executorService.submit(new CallableC0563eh(this, c0173j8, i3));
        executorService.submit(new CallableC0563eh(this, c0173j8, 4));
        m1422c();
        Context context = C0889w1.f3488p;
        if (context != null) {
            try {
                string = context.getSharedPreferences("fc_startup_state", 0).getString("startup_snapshot", null);
            } catch (Exception e) {
                C0908x1.m2197e("StartupSnapshot", C0944z.m2231k("load failed: ", e.getMessage()));
            }
            if (string == null) {
                aVar = null;
            } else {
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("wechatVersion");
                C0631i9.m1481d(string2, "getString(...)");
                String string3 = jSONObject.getString("pluginVersion");
                C0631i9.m1481d(string3, "getString(...)");
                JSONObject jSONObject2 = jSONObject.getJSONObject("resolvedClasses");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                C0631i9.m1481d(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, jSONObject2.getString(next));
                }
                aVar = new C0845te.a(string2, string3, linkedHashMap, jSONObject.getLong("createdAt"));
                String strM54a = C0021B1.a.m54a();
                if (string2.equals(strM54a) && string3.equals("3.1.5")) {
                    C0908x1.m2194b("StartupSnapshot", "VALID: wechat=" + strM54a + " plugin=3.1.5 classes=" + linkedHashMap.size());
                }
                C0908x1.m2194b("StartupSnapshot", "INVALIDATED: cached=" + string2 + "/" + strM54a + " plugin=" + string3 + "/3.1.5");
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            ClassLoader classLoader = c0173j8.f608a;
            String str = (String) aVar.f3322c.get("F010:convStorage");
            LinkedHashMap linkedHashMap2 = aVar.f3322c;
            String str2 = (String) linkedHashMap2.get("F010:convStorageHelper");
            String str3 = (String) linkedHashMap2.get("F010:convGetter");
            if (str == null || str2 == null || str3 == null) {
                i = 0;
                i2 = 0;
            } else {
                try {
                    Class<?> cls = Class.forName(str, false, classLoader);
                    Class<?> cls2 = Class.forName(str2, false, classLoader);
                    C0631i9.m1479b(cls);
                    C0631i9.m1479b(cls2);
                    C0122Gb.m318f(cls, cls2, str3);
                    i = 0;
                    i2 = 3;
                } catch (ClassNotFoundException e2) {
                    C0908x1.m2197e("StartupSnapshot", "F010 class not found: " + e2 + ", will fallback to full resolve");
                    i2 = 0;
                    i = 3;
                }
            }
            String str4 = (String) linkedHashMap2.get("F007_voip_mgr");
            if (str4 != null) {
                try {
                    Class.forName(str4, false, classLoader);
                    i2++;
                } catch (ClassNotFoundException unused) {
                    C0908x1.m2197e("StartupSnapshot", "F007 voip class not found: ".concat(str4));
                    i++;
                }
            }
            int i5 = i2;
            C0908x1.m2194b("StartupSnapshot", "applySnapshot done: injected=" + i5 + " failed=" + i + " total=" + linkedHashMap2.size());
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: FAST PATH — snapshot applied, skip class resolution"}, 1));
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: FULL PATH — no valid snapshot, full init"}, 1));
        }
        try {
            C0122Gb.m319g(c0173j8);
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a = C0920xd.m2206a(th2);
        }
        Throwable thM2189a3 = C0901wd.m2189a(objM2206a);
        if (thM2189a3 != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"WXMaskPlugin: registerInstanceCapture FAILED", thM2189a3}, 2));
        }
        try {
            new Thread(new RunnableC0221M2(18, c0173j8.f608a), "ConvHide-EarlyInit").start();
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th3) {
            C0920xd.m2206a(th3);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C0475a5.b bVarM1152a = C0475a5.m1152a();
            boolean z6 = C0723n6.f2804a;
            C0723n6.m1655c("contact_classes", bVarM1152a != null ? "CACHED" : "SKIP", "count=" + (bVarM1152a != null ? bVarM1152a.f1758a.size() : 0));
            JSONObject jSONObjectM1155d2 = C0475a5.m1155d("search_command_v2");
            if (jSONObjectM1155d2 == null && (jSONObjectM1155d2 = C0475a5.m1155d("search_command_v1")) == null) {
                jVar = null;
                boolean z7 = C0723n6.f2804a;
                if (jVar == null) {
                }
                if (jVar == null) {
                }
                C0723n6.m1655c("search_classes", jVar == null ? "CACHED" : "SKIP", "count=" + (jVar == null ? jVar.f1785a.size() : 0));
                jSONObjectM1155d = C0475a5.m1155d("recent_forward_v2");
                if (jSONObjectM1155d == null) {
                    iVar = new C0475a5.i(C0475a5.m1158g("activityClassNames", jSONObjectM1155d));
                    boolean z8 = C0723n6.f2804a;
                    if (iVar != null) {
                    }
                    if (iVar != null) {
                    }
                    C0723n6.m1655c("forward_classes", iVar != null ? "CACHED" : "SKIP", "count=" + (iVar != null ? iVar.f1784a.size() : 0));
                }
            } else {
                try {
                    jVar = new C0475a5.j(C0475a5.m1158g("searchViewClassNames", jSONObjectM1155d2));
                } catch (Exception unused2) {
                    jVar = null;
                }
                boolean z72 = C0723n6.f2804a;
                C0723n6.m1655c("search_classes", jVar == null ? "CACHED" : "SKIP", "count=" + (jVar == null ? jVar.f1785a.size() : 0));
                jSONObjectM1155d = C0475a5.m1155d("recent_forward_v2");
                if (jSONObjectM1155d == null || (jSONObjectM1155d = C0475a5.m1155d("recent_forward_v1")) != null) {
                    try {
                        iVar = new C0475a5.i(C0475a5.m1158g("activityClassNames", jSONObjectM1155d));
                    } catch (Exception unused3) {
                        iVar = null;
                    }
                    boolean z82 = C0723n6.f2804a;
                    C0723n6.m1655c("forward_classes", iVar != null ? "CACHED" : "SKIP", "count=" + (iVar != null ? iVar.f1784a.size() : 0));
                } else {
                    iVar = null;
                    boolean z822 = C0723n6.f2804a;
                    if (iVar != null) {
                    }
                    if (iVar != null) {
                    }
                    C0723n6.m1655c("forward_classes", iVar != null ? "CACHED" : "SKIP", "count=" + (iVar != null ? iVar.f1784a.size() : 0));
                }
            }
        } catch (Exception unused4) {
        }
        boolean z9 = C0088Ed.f269a;
        ClassLoader classLoader2 = c0173j8.f608a;
        C0631i9.m1482e(classLoader2, "classLoader");
        if (C0088Ed.f269a) {
            j = jCurrentTimeMillis;
        } else {
            C0186K3.f638a.getClass();
            SharedPreferences sharedPreferencesM509j = C0186K3.a.m509j();
            String string4 = sharedPreferencesM509j.getString("rcr_ver", null);
            if (string4 == null || !string4.equals(null)) {
                sharedPreferences = sharedPreferencesM509j;
            } else {
                int i6 = 0;
                for (C0088Ed.a aVar2 : C0088Ed.f284p) {
                    boolean z10 = z5;
                    String string5 = sharedPreferencesM509j.getString("cls_cache_" + aVar2.f285a, null);
                    if (string5 != null) {
                        try {
                            sharedPreferences = sharedPreferencesM509j;
                        } catch (Exception unused5) {
                            sharedPreferences = sharedPreferencesM509j;
                        }
                        try {
                            aVar2.f287c.mo53f(Class.forName(string5, false, classLoader2));
                            i6++;
                            boolean z11 = C0723n6.f2804a;
                            C0723n6.m1654b(aVar2.f285a, string5, z10);
                            sharedPreferencesM509j = sharedPreferences;
                            z5 = true;
                        } catch (Exception unused6) {
                            boolean z12 = C0723n6.f2804a;
                            C0723n6.m1654b(aVar2.f285a, string5, false);
                            z2 = false;
                            if (z2) {
                            }
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString("rcr_ver", null);
                            it = C0088Ed.f284p.iterator();
                            int i7 = 0;
                            int i8 = 0;
                            while (it.hasNext()) {
                            }
                            j = jCurrentTimeMillis;
                            editorEdit.apply();
                            if (C0088Ed.f270b != null) {
                                C0088Ed.f269a = (C0088Ed.f270b != null || C0088Ed.f271c == null || C0088Ed.f272d == null || C0088Ed.f277i == null || C0088Ed.f279k == null) ? false : true;
                                boolean z13 = C0723n6.f2804a;
                                C0723n6.m1657e(C0088Ed.f269a, i7, i8, C0088Ed.f284p.size(), null);
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[RuntimeClassResolver] ready (null) found=" + i7 + " miss=" + i8}, 1));
                            }
                            boolean z14 = C0723n6.f2804a;
                            C0723n6.m1657e(C0088Ed.f269a, 0, 0, 0, null);
                            C0908x1.m2194b("[WXMaskPlugin] handleHook started");
                            List listM1757d0 = C0739o3.m1757d0(new C0710mc("globalLifecycleHook", this.f2177v), new C0710mc("msgInsertDispatcher", this.f2161f), new C0710mc("tempUnhideTriggerPart", this.f2162g), new C0710mc("maskUIManagerPluginPart", this.f2181z), new C0710mc("maskedMsgVibratePluginPart", this.f2150A), new C0710mc("hideMainUIListPluginPart", this.f2160e), new C0710mc("convAddMaskPluginPart", this.f2178w), new C0710mc("contactAddMaskPluginPart", this.f2179x), new C0710mc("longClickTracePluginPart", this.f2173r), new C0710mc("hideOwnSnsPluginPart", this.f2172q));
                            List<C0710mc> listM1757d02 = C0739o3.m1757d0(new C0710mc("hideContactListPluginPart", this.f2163h), new C0710mc("blockContactInfoPluginPart", this.f2164i), new C0710mc("enterChattingUIPluginPart", this.f2159d), new C0710mc("hideTextStatusPluginPart", this.f2167l), new C0710mc("hideSnsEntryPluginPart", this.f2170o), new C0710mc("hideSnsInteractionPluginPart", this.f2174s), new C0710mc("hideSnsGroupIconPluginPart", this.f2175t), new C0710mc("hideContactLabelPluginPart", this.f2176u), new C0710mc("diagSnsLabelPluginPart", this.f2151B), new C0710mc("blockHotUpdatePluginPart", this.f2180y), new C0710mc("searchCommandPluginPart", this.f2152C));
                            m1421b(c0173j8, listM1757d0);
                            CallableC0563eh callableC0563eh2 = new CallableC0563eh(this, c0173j8, 0);
                            ExecutorService executorService2 = f2149G;
                            executorService2.submit(callableC0563eh2);
                            executorService2.submit(new CallableC0563eh(this, c0173j8, 1));
                            executorService2.submit(new CallableC0563eh(this, c0173j8, 5));
                            c0804rb = C0804rb.f3191a;
                            c0804rb.m1880b("phase2b_async_init");
                            if (c0804rb.m1879a("phase2b_async_init")) {
                            }
                            C0908x1.m2194b("WXMaskPlugin", "critical parts done in " + (System.currentTimeMillis() - j) + "ms, async parts scheduled");
                            C0908x1.m2194b("WXMaskPlugin", "DexKit bridge init skipped on main thread (delegated to background)");
                            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI") == null) {
                            }
                            objM2206a2 = C0413Wf.f1577a;
                            thM2189a = C0901wd.m2189a(objM2206a2);
                            if (thM2189a != null) {
                            }
                            C0908x1.m2194b("WXMaskPlugin", "ExtDeviceWXLoginUI hook block passed");
                            C0908x1.m2194b("WXMaskPlugin", "ResolverRegistry.init() about to call");
                            C0692ld.f2564a.m1555a();
                            C0804rb c0804rb2 = C0804rb.f3191a;
                            c0804rb2.m1880b("F010_conv_storage_pair");
                            c0804rb2.m1880b("F010_chat_user_extractor");
                            C0908x1.m2194b("WXMaskPlugin", "Phase6b enabled: F010_conv_storage_pair + F010_chat_user_extractor");
                            c0804rb2.m1880b("F007_voip_mgr");
                            c0804rb2.m1880b("F017_msg_info");
                            C0908x1.m2194b("WXMaskPlugin", "Phase3-B batch1 enabled: F007_voip_mgr + F017_msg_info");
                            c0804rb2.m1880b("F005_hide_contact_label");
                            c0804rb2.m1880b("F021_select_contact_mvvm_list");
                            c0804rb2.m1880b("F013_timeline_adapter");
                            c0804rb2.m1880b("F006_hide_sns_entry");
                            c0804rb2.m1880b("F008_hide_own_sns");
                            C0908x1.m2194b("WXMaskPlugin", "Phase3-B batch2 enabled: F005 + F021 + F013 + F006 + F008");
                            c0804rb2.m1880b("F004_contact_add_mask");
                            c0804rb2.m1880b("F004_contact_list_fields");
                            c0804rb2.m1880b("F024_status_store");
                            c0804rb2.m1880b("F024_mvvm_submit_param");
                            c0804rb2.m1880b("F025_msg_storage");
                            c0804rb2.m1880b("F021_recent_forward_adapter");
                            C0908x1.m2194b("WXMaskPlugin", "Phase5-A enabled: F024_status_store + F024_mvvm_submit_param + F025_msg_storage + F021_recent_forward_adapter");
                            C0908x1.m2194b("WXMaskPlugin", "Phase6b registering ConvMuteRuleRegistrar");
                            C0873v4 c0873v4 = C0873v4.f3418a;
                            ClassLoader classLoader3 = c0173j8.f608a;
                            c0873v4.getClass();
                            C0873v4.m2088b(classLoader3);
                            C0908x1.m2194b("WXMaskPlugin", "Phase6b ConvMuteRuleRegistrar.register returned");
                            if (C0631i9.m1478a(c0173j8.f609b, "com.tencent.mm")) {
                                this.f2155F = true;
                                ClassLoader classLoader4 = c0173j8.f608a;
                                C0616hd.f2278a.getClass();
                                C0616hd.f2280c = classLoader4;
                                int i9 = -1;
                                if (C0021B1.f64a != -1) {
                                }
                                C0616hd.f2279b = z3;
                                synchronized (C0804rb.f3191a) {
                                }
                            }
                            if (aVar == null) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } else {
                        sharedPreferences = sharedPreferencesM509j;
                    }
                    z2 = false;
                }
                sharedPreferences = sharedPreferencesM509j;
                z2 = true;
                if (z2) {
                    C0088Ed.f269a = (C0088Ed.f270b == null || C0088Ed.f271c == null || C0088Ed.f272d == null || C0088Ed.f277i == null || C0088Ed.f279k == null) ? false : true;
                    boolean z15 = C0723n6.f2804a;
                    C0723n6.m1657e(true, i6, 0, C0088Ed.f284p.size(), "SP hit null");
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[RuntimeClassResolver] cached (SP, null)"}, 1));
                    j = jCurrentTimeMillis;
                }
            }
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putString("rcr_ver", null);
            it = C0088Ed.f284p.iterator();
            int i72 = 0;
            int i82 = 0;
            while (it.hasNext()) {
                C0088Ed.a aVar3 = (C0088Ed.a) it.next();
                if (aVar3.f288d.mo31a() == null) {
                    InterfaceC0819s7<List<String>> interfaceC0819s7 = aVar3.f289e;
                    if (interfaceC0819s7 == null || (listMo31a = interfaceC0819s7.mo31a()) == null) {
                        listMo31a = aVar3.f286b;
                        it2 = listMo31a.iterator();
                        z = z4;
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = it;
                                j2 = jCurrentTimeMillis;
                                break;
                            }
                            String next2 = it2.next();
                            it3 = it;
                            try {
                                int i10 = i72;
                                j2 = jCurrentTimeMillis;
                                try {
                                    aVar3.f287c.mo53f(Class.forName(next2, false, classLoader2));
                                    i72 = i10 + 1;
                                } catch (Exception unused7) {
                                    i72 = i10;
                                }
                            } catch (Exception unused8) {
                                j2 = jCurrentTimeMillis;
                            }
                            try {
                                boolean z16 = C0723n6.f2804a;
                                C0723n6.m1654b(aVar3.f285a, next2, true);
                                z = true;
                                break;
                            } catch (Exception unused9) {
                                z = true;
                                it = it3;
                                jCurrentTimeMillis = j2;
                            }
                            it = it3;
                            jCurrentTimeMillis = j2;
                        }
                        if (!z) {
                            i82++;
                            boolean z17 = C0723n6.f2804a;
                            String str5 = aVar3.f285a;
                            String str6 = (String) C0834t3.m1950n0(aVar3.f286b);
                            if (str6 == null) {
                                str6 = "unknown";
                            }
                            C0723n6.m1654b(str5, str6, false);
                        }
                        clsMo31a = aVar3.f288d.mo31a();
                        if (clsMo31a != null) {
                            editorEdit2.putString(C0944z.m2231k("cls_cache_", aVar3.f285a), clsMo31a.getName());
                        }
                        it = it3;
                        jCurrentTimeMillis = j2;
                        z4 = false;
                    } else {
                        if (listMo31a.isEmpty()) {
                            listMo31a = null;
                        }
                        if (listMo31a == null) {
                        }
                        it2 = listMo31a.iterator();
                        z = z4;
                        while (true) {
                            if (it2.hasNext()) {
                            }
                            it = it3;
                            jCurrentTimeMillis = j2;
                        }
                        if (!z) {
                        }
                        clsMo31a = aVar3.f288d.mo31a();
                        if (clsMo31a != null) {
                        }
                        it = it3;
                        jCurrentTimeMillis = j2;
                        z4 = false;
                    }
                }
            }
            j = jCurrentTimeMillis;
            editorEdit2.apply();
            C0088Ed.f269a = (C0088Ed.f270b != null || C0088Ed.f271c == null || C0088Ed.f272d == null || C0088Ed.f277i == null || C0088Ed.f279k == null) ? false : true;
            boolean z132 = C0723n6.f2804a;
            C0723n6.m1657e(C0088Ed.f269a, i72, i82, C0088Ed.f284p.size(), null);
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[RuntimeClassResolver] ready (null) found=" + i72 + " miss=" + i82}, 1));
        }
        boolean z142 = C0723n6.f2804a;
        C0723n6.m1657e(C0088Ed.f269a, 0, 0, 0, null);
        C0908x1.m2194b("[WXMaskPlugin] handleHook started");
        List listM1757d03 = C0739o3.m1757d0(new C0710mc("globalLifecycleHook", this.f2177v), new C0710mc("msgInsertDispatcher", this.f2161f), new C0710mc("tempUnhideTriggerPart", this.f2162g), new C0710mc("maskUIManagerPluginPart", this.f2181z), new C0710mc("maskedMsgVibratePluginPart", this.f2150A), new C0710mc("hideMainUIListPluginPart", this.f2160e), new C0710mc("convAddMaskPluginPart", this.f2178w), new C0710mc("contactAddMaskPluginPart", this.f2179x), new C0710mc("longClickTracePluginPart", this.f2173r), new C0710mc("hideOwnSnsPluginPart", this.f2172q));
        List<C0710mc> listM1757d022 = C0739o3.m1757d0(new C0710mc("hideContactListPluginPart", this.f2163h), new C0710mc("blockContactInfoPluginPart", this.f2164i), new C0710mc("enterChattingUIPluginPart", this.f2159d), new C0710mc("hideTextStatusPluginPart", this.f2167l), new C0710mc("hideSnsEntryPluginPart", this.f2170o), new C0710mc("hideSnsInteractionPluginPart", this.f2174s), new C0710mc("hideSnsGroupIconPluginPart", this.f2175t), new C0710mc("hideContactLabelPluginPart", this.f2176u), new C0710mc("diagSnsLabelPluginPart", this.f2151B), new C0710mc("blockHotUpdatePluginPart", this.f2180y), new C0710mc("searchCommandPluginPart", this.f2152C));
        m1421b(c0173j8, listM1757d03);
        CallableC0563eh callableC0563eh22 = new CallableC0563eh(this, c0173j8, 0);
        ExecutorService executorService22 = f2149G;
        executorService22.submit(callableC0563eh22);
        executorService22.submit(new CallableC0563eh(this, c0173j8, 1));
        executorService22.submit(new CallableC0563eh(this, c0173j8, 5));
        c0804rb = C0804rb.f3191a;
        c0804rb.m1880b("phase2b_async_init");
        if (c0804rb.m1879a("phase2b_async_init")) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0603h0(this, c0173j8, listM1757d022, 5));
        } else {
            for (C0710mc c0710mc : listM1757d022) {
                f2149G.submit(new RunnableC0603h0(this, (String) c0710mc.f2680a, (IPlugin) c0710mc.f2681b, c0173j8));
            }
            ExecutorService executorService3 = f2149G;
            executorService3.submit(new RunnableC0273P0(this, 16, c0173j8));
            executorService3.submit(new RunnableC0679l0(6));
        }
        C0908x1.m2194b("WXMaskPlugin", "critical parts done in " + (System.currentTimeMillis() - j) + "ms, async parts scheduled");
        C0908x1.m2194b("WXMaskPlugin", "DexKit bridge init skipped on main thread (delegated to background)");
        try {
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI") == null) {
                C0173J8.m463a(c0173j8, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI", "onCreate", new Class[]{Bundle.class}, new C0673kd(29));
            }
            objM2206a2 = C0413Wf.f1577a;
        } catch (Throwable th4) {
            objM2206a2 = C0920xd.m2206a(th4);
        }
        thM2189a = C0901wd.m2189a(objM2206a2);
        if (thM2189a != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: hook ExtDeviceWXLoginUI fail", thM2189a}, 2));
        }
        C0908x1.m2194b("WXMaskPlugin", "ExtDeviceWXLoginUI hook block passed");
        C0908x1.m2194b("WXMaskPlugin", "ResolverRegistry.init() about to call");
        C0692ld.f2564a.m1555a();
        C0804rb c0804rb22 = C0804rb.f3191a;
        c0804rb22.m1880b("F010_conv_storage_pair");
        c0804rb22.m1880b("F010_chat_user_extractor");
        C0908x1.m2194b("WXMaskPlugin", "Phase6b enabled: F010_conv_storage_pair + F010_chat_user_extractor");
        c0804rb22.m1880b("F007_voip_mgr");
        c0804rb22.m1880b("F017_msg_info");
        C0908x1.m2194b("WXMaskPlugin", "Phase3-B batch1 enabled: F007_voip_mgr + F017_msg_info");
        c0804rb22.m1880b("F005_hide_contact_label");
        c0804rb22.m1880b("F021_select_contact_mvvm_list");
        c0804rb22.m1880b("F013_timeline_adapter");
        c0804rb22.m1880b("F006_hide_sns_entry");
        c0804rb22.m1880b("F008_hide_own_sns");
        C0908x1.m2194b("WXMaskPlugin", "Phase3-B batch2 enabled: F005 + F021 + F013 + F006 + F008");
        c0804rb22.m1880b("F004_contact_add_mask");
        c0804rb22.m1880b("F004_contact_list_fields");
        c0804rb22.m1880b("F024_status_store");
        c0804rb22.m1880b("F024_mvvm_submit_param");
        c0804rb22.m1880b("F025_msg_storage");
        c0804rb22.m1880b("F021_recent_forward_adapter");
        C0908x1.m2194b("WXMaskPlugin", "Phase5-A enabled: F024_status_store + F024_mvvm_submit_param + F025_msg_storage + F021_recent_forward_adapter");
        C0908x1.m2194b("WXMaskPlugin", "Phase6b registering ConvMuteRuleRegistrar");
        C0873v4 c0873v42 = C0873v4.f3418a;
        ClassLoader classLoader32 = c0173j8.f608a;
        c0873v42.getClass();
        C0873v4.m2088b(classLoader32);
        C0908x1.m2194b("WXMaskPlugin", "Phase6b ConvMuteRuleRegistrar.register returned");
        if (C0631i9.m1478a(c0173j8.f609b, "com.tencent.mm") && !this.f2155F) {
            this.f2155F = true;
            ClassLoader classLoader42 = c0173j8.f608a;
            C0616hd.f2278a.getClass();
            C0616hd.f2280c = classLoader42;
            int i92 = -1;
            if (C0021B1.f64a != -1) {
                try {
                    Context context2 = C0889w1.f3488p;
                    C0631i9.m1479b(context2);
                    i92 = context2.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
                    z3 = true;
                } catch (Exception e3) {
                    z3 = true;
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{e3}, 1));
                }
                C0021B1.f64a = i92;
            } else {
                z3 = true;
            }
            C0616hd.f2279b = z3;
            synchronized (C0804rb.f3191a) {
                C0804rb.f3193c.put("F010_conv_storage_pair", Boolean.TRUE);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0679l0(5), 45000L);
        }
        if (aVar == null || context == null || !C0631i9.m1478a(c0173j8.f609b, "com.tencent.mm")) {
            return;
        }
        new Thread(new RunnableC0273P0(this, c0173j8, context), "FC-Snapshot-Save").start();
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin, p000a.C0186K3.b
    public final void onConfigChange() {
        m1422c();
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void onCreate() {
        C0186K3.f638a.getClass();
        C0186K3.f650m.add(this);
    }
}
