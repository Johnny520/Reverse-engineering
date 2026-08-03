package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0066bu;
import com.tendcloud.tenddata.C0133zz;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bp */
/* JADX INFO: loaded from: classes.dex */
public class C0061bp {

    /* JADX INFO: renamed from: a */
    private static volatile C0061bp f318a;

    static {
        try {
            C0132z.m785a().register(m357a());
        } catch (Throwable unused) {
        }
    }

    private C0061bp() {
    }

    /* JADX INFO: renamed from: a */
    public static C0061bp m357a() {
        if (f318a == null) {
            synchronized (C0061bp.class) {
                if (f318a == null) {
                    f318a = new C0061bp();
                }
            }
        }
        return f318a;
    }

    /* JADX INFO: renamed from: a */
    private void m358a(long j, final AbstractC0018a abstractC0018a) {
        try {
            C0115h.iForDeveloper("[" + abstractC0018a.name() + "][Session] - New session!");
            String string = UUID.randomUUID().toString();
            C0115h.iForDeveloper("[" + abstractC0018a.name() + "][Session] - Id: " + string);
            long jM554f = C0116i.m554f(abstractC0018a);
            long j2 = j - jM554f;
            if (0 == jM554f) {
                j2 = 0;
            }
            C0116i.m535a(string, abstractC0018a);
            C0116i.m534a(j, abstractC0018a);
            C0116i.m542b(string, abstractC0018a);
            C0092ct.m466a().setSessionId(string);
            C0092ct.m466a().setSessionStartTime(j);
            C0067bv c0067bv = new C0067bv();
            c0067bv.f353b = "session";
            c0067bv.f354c = "begin";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sessionId", string);
            treeMap.put("interval", Long.valueOf(j2 / 1000));
            c0067bv.f355d = treeMap;
            c0067bv.f352a = abstractC0018a;
            c0067bv.f357f = new InterfaceC0091cs() { // from class: com.tendcloud.tenddata.bp.2
                @Override // com.tendcloud.tenddata.InterfaceC0091cs
                public void onStoreFailed() {
                }

                @Override // com.tendcloud.tenddata.InterfaceC0091cs
                public void onStoreSuccess() {
                    try {
                        C0061bp.this.m362b(abstractC0018a);
                    } catch (Throwable unused) {
                    }
                }
            };
            C0132z.m785a().post(c0067bv);
            C0020ab.f116Z.set(false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m359a(final AbstractC0018a abstractC0018a) {
        try {
            String strM532a = C0116i.m532a(abstractC0018a);
            if (strM532a == null || strM532a.trim().isEmpty()) {
                return;
            }
            long jM544c = C0116i.m544c(abstractC0018a);
            long jM554f = C0116i.m554f(abstractC0018a) - jM544c;
            if ((abstractC0018a.name().equals("APP") || abstractC0018a.name().equals("APP_SQL") || abstractC0018a.name().equals("TRACKING") || abstractC0018a.name().equals("SDK")) && jM554f < 500) {
                jM554f = -1000;
            }
            C0067bv c0067bv = new C0067bv();
            c0067bv.f353b = "session";
            c0067bv.f354c = "end";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sessionId", strM532a);
            treeMap.put("start", Long.valueOf(jM544c));
            treeMap.put("duration", Long.valueOf(jM554f / 1000));
            c0067bv.f355d = treeMap;
            c0067bv.f352a = abstractC0018a;
            c0067bv.f357f = new InterfaceC0091cs() { // from class: com.tendcloud.tenddata.bp.1
                @Override // com.tendcloud.tenddata.InterfaceC0091cs
                public void onStoreFailed() {
                }

                @Override // com.tendcloud.tenddata.InterfaceC0091cs
                public void onStoreSuccess() {
                    try {
                        C0061bp.this.m362b(abstractC0018a);
                    } catch (Throwable unused) {
                    }
                }
            };
            C0132z.m785a().post(c0067bv);
            C0116i.m535a((String) null, abstractC0018a);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m361a(HashMap<String, Object> map) {
        try {
            AbstractC0018a abstractC0018a = (AbstractC0018a) map.get("service");
            long j = Long.parseLong(String.valueOf(map.get("occurTime")));
            long jM544c = C0116i.m544c(abstractC0018a);
            long jM554f = C0116i.m554f(abstractC0018a);
            if (jM554f <= jM544c) {
                jM554f = jM544c;
            }
            if (j - jM554f > C0020ab.f118aa) {
                m359a(abstractC0018a);
            } else {
                String strM532a = C0116i.m532a(abstractC0018a);
                if (strM532a != null) {
                    C0115h.iForDeveloper("[" + abstractC0018a.name() + "][Session] - Same session as before! Session id is " + strM532a);
                    C0092ct.m466a().setSessionId(strM532a);
                    C0092ct.m466a().setSessionStartTime(jM544c);
                    return;
                }
            }
            m358a(j, abstractC0018a);
            C0116i.setLastActivity("");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m362b(AbstractC0018a abstractC0018a) {
        C0066bu c0066bu = new C0066bu();
        c0066bu.f350a = abstractC0018a;
        c0066bu.f351b = C0066bu.a.IMMEDIATELY;
        C0132z.m785a().post(c0066bu);
    }

    /* JADX INFO: renamed from: b */
    private final void m363b(HashMap<String, Object> map) {
        try {
            AbstractC0018a abstractC0018a = (AbstractC0018a) map.get("service");
            long j = Long.parseLong(String.valueOf(map.get("occurTime")));
            if (map.containsKey("sessionEnd")) {
                m359a(abstractC0018a);
                return;
            }
            if (map.containsKey("pageName")) {
                C0116i.setLastActivity(String.valueOf(map.get("pageName")));
            }
            m362b(abstractC0018a);
            C0116i.m546c(j, abstractC0018a);
            C0020ab.f99I = null;
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventSession(C0133zz.a aVar) {
        HashMap<String, Object> map;
        if (aVar == null || (map = aVar.paraMap) == null) {
            return;
        }
        try {
            int i = Integer.parseInt(String.valueOf(map.get("apiType")));
            if (i == 10) {
                m361a(aVar.paraMap);
            } else if (i == 11) {
                m363b(aVar.paraMap);
            }
        } catch (Throwable unused) {
        }
    }
}
