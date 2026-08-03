package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.C0066bu;
import com.tendcloud.tenddata.C0089cq;
import com.tendcloud.tenddata.C0133zz;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bl */
/* JADX INFO: loaded from: classes.dex */
public class C0057bl {

    /* JADX INFO: renamed from: a */
    private static ScheduledThreadPoolExecutor f293a = null;

    /* JADX INFO: renamed from: b */
    private static final long f294b = 30000;

    /* JADX INFO: renamed from: c */
    private static long f295c = 0;

    /* JADX INFO: renamed from: d */
    private static Map<String, Object> f296d = null;

    /* JADX INFO: renamed from: e */
    private static final long f297e = 2;

    /* JADX INFO: renamed from: f */
    private static volatile C0057bl f298f;

    /* JADX INFO: renamed from: g */
    private static boolean f299g;

    /* JADX INFO: renamed from: h */
    private static boolean f300h;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bl$a */
    public static class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Map map;
            Long lValueOf;
            try {
                AbstractC0018a abstractC0018a = AbstractC0018a.UNIVERSAL;
                if (C0131y.m766b(C0020ab.f132g, "android.permission.READ_PHONE_STATE")) {
                    C0057bl.f296d.put("isGetIMEI", Boolean.TRUE);
                    map = C0057bl.f296d;
                    lValueOf = Long.valueOf(System.currentTimeMillis() - C0057bl.f295c);
                } else {
                    if (System.currentTimeMillis() - C0116i.m549d(abstractC0018a) < 30000) {
                        return;
                    }
                    C0057bl.f296d.put("isGetIMEI", Boolean.FALSE);
                    map = C0057bl.f296d;
                    lValueOf = Long.valueOf(System.currentTimeMillis() - C0057bl.f295c);
                }
                map.put("duration", lValueOf);
                C0057bl.m340h(abstractC0018a);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bl$b */
    public static class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Check_Thread #");
        }
    }

    static {
        try {
            C0132z.m785a().register(m324a());
        } catch (Throwable unused) {
        }
        f298f = null;
        f299g = false;
        f300h = false;
    }

    private C0057bl() {
    }

    /* JADX INFO: renamed from: a */
    public static C0057bl m324a() {
        if (f298f == null) {
            synchronized (C0057bl.class) {
                if (f298f == null) {
                    f298f = new C0057bl();
                }
            }
        }
        return f298f;
    }

    /* JADX INFO: renamed from: a */
    private void m325a(Context context, AbstractC0018a abstractC0018a) {
        if (f300h) {
            return;
        }
        try {
            C0020ab.m23c();
            C0020ab.m12a(context, abstractC0018a);
            C0020ab.m19b(context, abstractC0018a);
            C0020ab.m24c(context, abstractC0018a);
            boolean z = C0020ab.f127b;
            f300h = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m327a(Context context) {
        if (context == null) {
            C0115h.eForInternal("[ModuleInit] current context is null...");
            return false;
        }
        for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
            if (str.equalsIgnoreCase("android.permission.READ_PHONE_STATE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m333d(AbstractC0018a abstractC0018a) {
        try {
            if (abstractC0018a == null) {
                C0115h.eForInternal("TDFeatures is null...");
            } else if (C0116i.m549d(abstractC0018a) == 0) {
                C0116i.m541b(System.currentTimeMillis(), abstractC0018a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m334e() {
        try {
            if (C0116i.m551e() == 0) {
                C0116i.setInitTime(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m335e(AbstractC0018a abstractC0018a) {
        try {
            if (C0116i.m549d(abstractC0018a) != 0 && System.currentTimeMillis() - C0116i.m549d(abstractC0018a) > 86400000) {
                C0131y.f631c = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m336f() {
        try {
            f295c = System.currentTimeMillis();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new b());
            f293a = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new a(), 0L, f297e, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m337f(final AbstractC0018a abstractC0018a) {
        try {
            new Timer().schedule(new TimerTask() { // from class: com.tendcloud.tenddata.bl.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    C0119l.m641a();
                    C0057bl.m333d(abstractC0018a);
                    C0057bl.m334e();
                    C0057bl.m339g(abstractC0018a);
                }
            }, C0020ab.f142q);
        } catch (Throwable th) {
            C0115h.eForInternal(th);
            m339g(abstractC0018a);
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m338g() {
        try {
            C0067bv c0067bv = new C0067bv();
            c0067bv.f353b = "env";
            c0067bv.f354c = "getProp";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sysproperty", C0131y.m744a());
            c0067bv.f355d = treeMap;
            c0067bv.f352a = AbstractC0018a.ENV;
            C0132z.m785a().post(c0067bv);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m339g(final AbstractC0018a abstractC0018a) {
        try {
            if (abstractC0018a == null) {
                C0115h.eForInternal("TDFeatures is null...");
                return;
            }
            TreeMap treeMap = new TreeMap();
            boolean zM17a = C0020ab.m17a(abstractC0018a);
            treeMap.put("first", Boolean.valueOf(zM17a));
            if (!C0131y.m767b(C0133zz.f653a)) {
                treeMap.put("custom", C0131y.m747a(C0133zz.f653a));
            }
            try {
                int iM770c = C0131y.m770c(C0020ab.f132g);
                treeMap.put("targetAPI", Integer.valueOf(iM770c));
                if ((abstractC0018a.name().equals("TRACKING") || abstractC0018a.name().equals("SDK")) && zM17a) {
                    boolean zM327a = m327a(C0020ab.f132g);
                    boolean zM766b = C0131y.m766b(C0020ab.f132g, "android.permission.READ_PHONE_STATE");
                    treeMap.put("isDeclareIMEI", Boolean.valueOf(zM327a));
                    treeMap.put("isGetIMEI", Boolean.valueOf(zM766b));
                    if (zM327a && !zM766b && iM770c >= 23) {
                        TreeMap treeMap2 = new TreeMap();
                        f296d = treeMap2;
                        treeMap2.put("targetAPI", Integer.valueOf(iM770c));
                        f296d.put("isDeclareIMEI", Boolean.valueOf(zM327a));
                        m336f();
                    }
                }
            } catch (Throwable unused) {
            }
            C0067bv c0067bv = new C0067bv();
            try {
                c0067bv.f353b = "app";
                c0067bv.f354c = "init";
                c0067bv.f355d = treeMap;
                c0067bv.f352a = abstractC0018a;
                if (zM17a) {
                    c0067bv.f357f = new InterfaceC0091cs() { // from class: com.tendcloud.tenddata.bl.2
                        @Override // com.tendcloud.tenddata.InterfaceC0091cs
                        public void onStoreFailed() {
                        }

                        @Override // com.tendcloud.tenddata.InterfaceC0091cs
                        public void onStoreSuccess() {
                            try {
                                C0116i.m537a(false, abstractC0018a);
                            } catch (Throwable unused2) {
                            }
                        }
                    };
                }
                C0132z.m785a().post(c0067bv);
            } catch (Throwable unused2) {
            }
            C0066bu c0066bu = new C0066bu();
            c0066bu.f350a = abstractC0018a;
            c0066bu.f351b = C0066bu.a.IMMEDIATELY;
            C0132z.m785a().post(c0066bu);
            if (zM17a) {
                m338g();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static void m340h(AbstractC0018a abstractC0018a) {
        try {
            C0067bv c0067bv = new C0067bv();
            c0067bv.f353b = "app";
            c0067bv.f354c = "getIMEI";
            c0067bv.f355d = f296d;
            c0067bv.f352a = abstractC0018a;
            C0132z.m785a().post(c0067bv);
            C0066bu c0066bu = new C0066bu();
            c0066bu.f350a = abstractC0018a;
            c0066bu.f351b = C0066bu.a.IMMEDIATELY;
            C0132z.m785a().post(c0066bu);
            f293a.shutdown();
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventInitEvent(C0133zz.a aVar) {
        try {
            if (Integer.parseInt(String.valueOf(aVar.paraMap.get("apiType"))) != 1) {
                return;
            }
            String strValueOf = String.valueOf(aVar.paraMap.get("action"));
            AbstractC0018a abstractC0018a = (AbstractC0018a) aVar.paraMap.get("service");
            if ((!strValueOf.equals("install") && !strValueOf.equals("deeplink")) || (!abstractC0018a.name().equals("TRACKING") && !abstractC0018a.name().equals("SDK"))) {
                if (strValueOf.equals("init")) {
                    Context context = C0020ab.f132g;
                    C0061bp.m357a();
                    C0050be.m284a();
                    C0055bj.m322a();
                    C0051bf.m306a();
                    C0059bn.m348a();
                    C0052bg.m308a();
                    C0056bk.m323a();
                    if (!C0131y.m755a(context)) {
                        C0049bd.m282a().m283b();
                    }
                    C0020ab.f127b = true;
                    if (abstractC0018a.name().equals("SDK")) {
                        m325a(context, abstractC0018a);
                    }
                    m335e(abstractC0018a);
                    m337f(abstractC0018a);
                    return;
                }
                return;
            }
            C0067bv c0067bv = new C0067bv();
            Object obj = aVar.paraMap.get(C0089cq.a.DATA);
            c0067bv.f353b = String.valueOf(aVar.paraMap.get("domain"));
            c0067bv.f354c = strValueOf;
            if (obj != null && (obj instanceof Map)) {
                c0067bv.f355d = (Map) obj;
            }
            c0067bv.f352a = abstractC0018a;
            C0132z.m785a().post(c0067bv);
        } catch (Throwable unused) {
        }
    }
}
