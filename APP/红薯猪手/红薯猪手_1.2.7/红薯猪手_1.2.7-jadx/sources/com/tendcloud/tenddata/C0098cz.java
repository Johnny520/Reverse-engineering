package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cz */
/* JADX INFO: loaded from: classes.dex */
public class C0098cz extends AbstractC0097cy {

    /* JADX INFO: renamed from: a */
    public static final String f434a = "TalkingData";

    /* JADX INFO: renamed from: c */
    public static final String f435c = "SaaS";

    /* JADX INFO: renamed from: d */
    public static final int f436d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f437e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f438f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f439g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f440h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f441i = 5;

    /* JADX INFO: renamed from: j */
    public static final int f442j = 6;

    /* JADX INFO: renamed from: k */
    public static final int f443k = 7;

    /* JADX INFO: renamed from: l */
    public static final int f444l = 8;

    /* JADX INFO: renamed from: n */
    private static String f445n = "";

    /* JADX INFO: renamed from: o */
    private static int f446o = 4;

    /* JADX INFO: renamed from: m */
    private final String f447m = "Android";

    public C0098cz() {
        m473a("version", (Object) 5);
        m473a("minorVersion", (Object) 0);
        m473a("build", (Object) 28);
        if (!C0131y.m767b(C0020ab.f147v)) {
            try {
                m473a("jobNum", Integer.valueOf(Integer.parseInt(C0020ab.f147v)));
            } catch (Throwable unused) {
            }
        }
        m473a("partner", f435c);
        m473a("platform", "Android");
        m473a("type", f434a);
        m473a("framework", f445n);
        int i = f446o;
        if (i > 0) {
            m473a("from", Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m476a() {
        return f445n;
    }

    /* JADX INFO: renamed from: a */
    public void m477a(String str, String str2, String str3) {
        JSONArray jSONArray;
        if (this.f433b.isNull("features")) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = this.f433b.getJSONArray("features");
            } catch (JSONException e) {
                e.printStackTrace();
                jSONArray = null;
            }
        }
        if (jSONArray != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("version", str2);
                jSONObject.put("minorVersion", str3);
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            m473a("features", jSONArray);
        }
    }

    public void setFrameWork(String str) {
        f445n = str;
    }

    public void setRule(int i) {
        m473a("rule", Integer.valueOf(i));
    }
}
