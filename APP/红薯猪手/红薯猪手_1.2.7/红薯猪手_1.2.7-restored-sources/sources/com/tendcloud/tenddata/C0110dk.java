package com.tendcloud.tenddata;

import android.util.EventLogTags;
import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.dk */
/* JADX INFO: loaded from: classes.dex */
public class C0110dk {

    /* JADX INFO: renamed from: c */
    private static C0095cw f480c;

    /* JADX INFO: renamed from: d */
    private static C0098cz f481d;

    /* JADX INFO: renamed from: e */
    private static C0103dd f482e = new C0103dd();

    /* JADX INFO: renamed from: f */
    private static C0100da f483f = null;

    /* JADX INFO: renamed from: h */
    private static volatile C0110dk f484h = null;

    /* JADX INFO: renamed from: a */
    public JSONObject f485a = null;

    /* JADX INFO: renamed from: b */
    public JSONObject f486b = null;

    /* JADX INFO: renamed from: g */
    private C0107dh f487g = null;

    /* JADX INFO: renamed from: b */
    public static C0110dk m504b() {
        if (f484h == null) {
            synchronized (C0110dk.class) {
                if (f484h == null) {
                    f484h = new C0110dk();
                }
            }
        }
        return f484h;
    }

    /* JADX INFO: renamed from: a */
    public synchronized JSONObject m505a(C0094cv c0094cv, boolean z) {
        return m506a(c0094cv, z, null);
    }

    /* JADX INFO: renamed from: a */
    public synchronized JSONObject m506a(C0094cv c0094cv, boolean z, AbstractC0018a abstractC0018a) {
        return m507a(c0094cv, z, abstractC0018a, null);
    }

    /* JADX INFO: renamed from: a */
    public synchronized JSONObject m507a(C0094cv c0094cv, boolean z, AbstractC0018a abstractC0018a, Pair<String, JSONArray> pair) {
        JSONObject jSONObject;
        if (c0094cv != null) {
            if (c0094cv.mo467b() != null) {
                synchronized (EventLogTags.class) {
                    jSONObject = new JSONObject();
                    try {
                        this.f485a = new JSONObject();
                        this.f486b = new JSONObject();
                        try {
                            if (f480c == null) {
                                f480c = C0095cw.m468a();
                                f480c.setUniqueId(C0109dj.m501a(C0020ab.f132g, C0020ab.f132g.getPackageName()));
                            }
                            f480c.setSubmitAppId(abstractC0018a);
                            f480c.setSubmitChannelId(abstractC0018a);
                            if (f482e == null) {
                                f482e = new C0103dd();
                            }
                            C0103dd.f455a.m481a();
                            f482e.m484c().setSlots(C0122o.m663B(C0020ab.f132g));
                            if (f481d == null) {
                                f481d = new C0098cz();
                            }
                            f481d.setRule(C0020ab.f110T.getRules());
                            if (f483f == null) {
                                C0100da c0100da = new C0100da();
                                f483f = c0100da;
                                c0100da.m478a();
                            }
                        } catch (Throwable unused) {
                        }
                        jSONObject.put("version", "2.0");
                        jSONObject.put("action", c0094cv.mo467b());
                        jSONObject.put("device", f482e.mo467b());
                        jSONObject.put("app", f480c.mo467b());
                        jSONObject.put("sdk", f481d.mo467b());
                        jSONObject.put("appContext", C0092ct.m466a().mo467b());
                        jSONObject.put("user", f483f.mo467b());
                        jSONObject.put("sharingFilterPermission", C0020ab.f146u.ordinal());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        jSONObject.put("ts", jCurrentTimeMillis);
                        jSONObject.put("fingerprint", C0131y.m771c(jCurrentTimeMillis + C0109dj.m500a(C0020ab.f132g) + f482e.m483a().m489a() + f482e.m483a().m490c()));
                        if (z) {
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(new C0107dh(EnumC0108di.WIFI).mo467b());
                            if (this.f487g == null) {
                                this.f487g = new C0107dh(EnumC0108di.CELLULAR);
                            }
                            jSONArray.put(this.f487g.mo467b());
                            try {
                                if (C0131y.m766b(C0020ab.f132g, "android.permission.BLUETOOTH")) {
                                    jSONArray.put(new C0107dh(EnumC0108di.BLUETOOTH).mo467b());
                                }
                            } catch (Throwable unused2) {
                            }
                            jSONObject.put("networks", jSONArray);
                            jSONObject.put("locations", new C0096cx().mo467b());
                        }
                    } catch (Throwable unused3) {
                    }
                }
                return jSONObject;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m508a() {
        C0100da c0100da = f483f;
        if (c0100da != null) {
            c0100da.m479c();
        }
    }
}
