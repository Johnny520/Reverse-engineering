package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0133zz;
import java.util.HashMap;
import java.util.TreeMap;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bn */
/* JADX INFO: loaded from: classes.dex */
public class C0059bn {

    /* JADX INFO: renamed from: a */
    private static volatile C0059bn f313a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, Object> f314b = new HashMap<>();

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bn$a */
    public final class a {
        private String pageName;
        private String refer;
        private long startTime;

        private a(long j, String str, String str2) {
            this.startTime = j;
            this.refer = str;
            this.pageName = str2;
        }

        private String getPageName() {
            return this.pageName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getRefer() {
            return this.refer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getStartTime() {
            return this.startTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            StringBuilder sbM1039 = C0167c4.m1039("pageName: ");
            sbM1039.append(this.pageName);
            sbM1039.append("\nfrom: ");
            sbM1039.append(this.refer);
            sbM1039.append("\nstartTime: ");
            sbM1039.append(this.startTime);
            return sbM1039.toString();
        }
    }

    static {
        try {
            C0132z.m785a().register(m348a());
        } catch (Throwable unused) {
        }
    }

    private C0059bn() {
    }

    /* JADX INFO: renamed from: a */
    public static C0059bn m348a() {
        if (f313a == null) {
            synchronized (C0061bp.class) {
                if (f313a == null) {
                    f313a = new C0059bn();
                }
            }
        }
        return f313a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:7:0x0010, B:9:0x0016, B:10:0x0029, B:13:0x003f, B:11:0x0031), top: B:16:0x0010 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m349a(long j, String str, String str2, AbstractC0018a abstractC0018a) {
        StringBuilder sb;
        C0133zz.f655c = true;
        if (this.f314b.containsKey(str)) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.isEmpty()) {
                    sb = new StringBuilder();
                    sb.append("onPageBegin being called!  pagename: ");
                    sb.append(str);
                } else {
                    sb = new StringBuilder();
                    sb.append("onPageBegin being called!  pagename: ");
                    sb.append(str);
                    sb.append(", refer: ");
                    sb.append(str2);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        C0115h.iForDeveloper(sb.toString());
        if (str != null) {
            a aVar = new a(j, str2, str);
            this.f314b.put(str, aVar);
            C0067bv c0067bv = new C0067bv();
            c0067bv.f353b = "page";
            c0067bv.f354c = "enter";
            TreeMap treeMap = new TreeMap();
            treeMap.put("startTime", Long.valueOf(aVar.startTime));
            treeMap.put("duration", 0);
            treeMap.put("name", aVar.pageName);
            treeMap.put("from", aVar.refer);
            c0067bv.f355d = treeMap;
            c0067bv.f352a = abstractC0018a;
            C0132z.m785a().post(c0067bv);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m350a(String str, AbstractC0018a abstractC0018a) {
        if (this.f314b.containsKey(str)) {
            try {
                C0115h.iForDeveloper("onPageEnd being called! pageName: " + str);
                a aVar = (a) this.f314b.remove(str);
                if (aVar != null) {
                    C0067bv c0067bv = new C0067bv();
                    c0067bv.f353b = "page";
                    c0067bv.f354c = "leave";
                    long jRound = Math.round((System.currentTimeMillis() - aVar.getStartTime()) / 1000.0d);
                    TreeMap treeMap = new TreeMap();
                    treeMap.put("startTime", Long.valueOf(aVar.getStartTime()));
                    treeMap.put("name", str);
                    treeMap.put("from", aVar.getRefer());
                    treeMap.put("duration", Long.valueOf(jRound));
                    c0067bv.f355d = treeMap;
                    c0067bv.f352a = abstractC0018a;
                    C0132z.m785a().post(c0067bv);
                }
                if (C0020ab.f98H) {
                    C0116i.setLastActivity(str);
                }
                C0020ab.f99I = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m351a(HashMap<String, Object> map) {
        try {
            int i = Integer.parseInt(String.valueOf(map.get("apiType")));
            AbstractC0018a abstractC0018a = (AbstractC0018a) map.get("service");
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                m350a(String.valueOf(map.get("pageName")), abstractC0018a);
            } else {
                String strM550d = C0020ab.f99I;
                if (strM550d == null) {
                    strM550d = C0116i.m550d();
                }
                m349a(Long.parseLong(String.valueOf(map.get("occurTime"))), String.valueOf(map.get("pageName")), strM550d, abstractC0018a);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventPage(C0133zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map == null) {
                    return;
                }
                int i = Integer.parseInt(String.valueOf(map.get("apiType")));
                if ((i == 4 || i == 5) && !String.valueOf(aVar.paraMap.get("occurTime")).trim().isEmpty()) {
                    m351a(aVar.paraMap);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
