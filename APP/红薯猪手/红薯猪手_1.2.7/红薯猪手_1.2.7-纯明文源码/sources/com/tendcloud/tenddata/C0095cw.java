package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cw */
/* JADX INFO: loaded from: classes.dex */
public class C0095cw extends AbstractC0097cy {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, Object> f428a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private static HashMap<String, Object> f429c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    private static volatile C0095cw f430f = null;

    /* JADX INFO: renamed from: d */
    private final String[] f431d = {"PUSH", "EAuth"};

    /* JADX INFO: renamed from: e */
    private final String[] f432e = {"APP", "TRACKING", "GAME", "BG", "SDK"};

    private C0095cw() {
        m473a("displayName", C0114g.m517a().m526h(C0020ab.f132g));
        m473a("globalId", C0114g.m517a().m519a(C0020ab.f132g));
        m473a("versionName", C0116i.m559k());
        m473a("versionCode", Integer.valueOf(C0116i.m558j()));
        m473a("installTime", Long.valueOf(C0114g.m517a().m522d(C0020ab.f132g)));
        m473a("updateTime", Long.valueOf(C0114g.m517a().m523e(C0020ab.f132g)));
    }

    /* JADX INFO: renamed from: a */
    public static C0095cw m468a() {
        if (f430f == null) {
            synchronized (C0088cp.class) {
                if (f430f == null) {
                    f430f = new C0095cw();
                }
            }
        }
        return f430f;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x006b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0003 */
    /* JADX INFO: renamed from: a */
    private Object m469a(AbstractC0018a abstractC0018a) {
        Object obj = null;
        obj = null;
        if (abstractC0018a != null) {
            try {
                if (Arrays.asList(this.f431d).contains(abstractC0018a.name())) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appKey", (Object) null);
                    jSONObject.put("service", (Object) null);
                    jSONArray.put(jSONObject);
                    try {
                        if (!C0131y.m767b((String) null)) {
                            m471a(jSONArray, abstractC0018a);
                        }
                    } catch (Throwable unused) {
                    }
                    obj = jSONArray;
                } else if (Arrays.asList(this.f432e).contains(abstractC0018a.name())) {
                    String strM12a = C0020ab.m12a(C0020ab.f132g, abstractC0018a);
                    boolean zM767b = C0131y.m767b(strM12a);
                    obj = strM12a;
                    if (!zM767b) {
                        m471a((Object) strM12a, abstractC0018a);
                        obj = strM12a;
                    }
                } else {
                    obj = f428a.get(m470c().get(0).name());
                }
            } catch (Throwable unused2) {
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    private ArrayList<AbstractC0018a> m470c() {
        ArrayList<AbstractC0018a> arrayList = new ArrayList<>();
        try {
            Iterator<Map.Entry<String, Object>> it = f428a.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0018a.valueOf(it.next().getKey().toString()));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m471a(Object obj, AbstractC0018a abstractC0018a) {
        f428a.put(abstractC0018a.name(), obj);
    }

    /* JADX INFO: renamed from: b */
    public void m472b(Object obj, AbstractC0018a abstractC0018a) {
        f429c.put(abstractC0018a.name(), obj);
    }

    public void setAppChannel(String str) {
        m473a("channel", str);
    }

    public void setSubmitAppId(AbstractC0018a abstractC0018a) {
        if (abstractC0018a != null) {
            try {
                Object objM469a = f428a.get(abstractC0018a.name());
                if (objM469a == null && f428a.size() > 0) {
                    objM469a = m469a(abstractC0018a);
                }
                m473a("appKey", objM469a);
            } catch (Throwable unused) {
            }
        }
    }

    public void setSubmitChannelId(AbstractC0018a abstractC0018a) {
        if (abstractC0018a == null) {
            setAppChannel("Default");
            return;
        }
        try {
            Object obj = f429c.get(abstractC0018a.name());
            if (obj == null && f429c.size() > 0) {
                obj = f429c.get(m470c().get(0).name());
            }
            m473a("channel", obj);
        } catch (Throwable unused) {
        }
    }

    public void setUniqueId(String str) {
        m473a("uniqueId", str);
    }
}
