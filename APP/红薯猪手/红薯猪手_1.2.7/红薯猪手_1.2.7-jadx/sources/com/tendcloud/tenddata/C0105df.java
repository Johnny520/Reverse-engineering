package com.tendcloud.tenddata;

/* JADX INFO: renamed from: com.tendcloud.tenddata.df */
/* JADX INFO: loaded from: classes.dex */
public class C0105df extends AbstractC0097cy {

    /* JADX INFO: renamed from: j */
    private static volatile C0105df f463j;

    /* JADX INFO: renamed from: a */
    private final String f464a = "oaid";

    /* JADX INFO: renamed from: c */
    private final String f465c = "vaid";

    /* JADX INFO: renamed from: d */
    private final String f466d = "aaid";

    /* JADX INFO: renamed from: e */
    private final String f467e = "udid";

    /* JADX INFO: renamed from: f */
    private volatile String f468f = "";

    /* JADX INFO: renamed from: g */
    private volatile String f469g = "";

    /* JADX INFO: renamed from: h */
    private volatile String f470h = "";

    /* JADX INFO: renamed from: i */
    private volatile String f471i = "";

    private C0105df() {
    }

    /* JADX INFO: renamed from: a */
    public static C0105df m491a() {
        if (f463j == null) {
            synchronized (C0105df.class) {
                if (f463j == null) {
                    f463j = new C0105df();
                }
            }
        }
        return f463j;
    }

    /* JADX INFO: renamed from: c */
    public String m492c() {
        return this.f468f;
    }

    /* JADX INFO: renamed from: d */
    public String m493d() {
        return this.f469g;
    }

    /* JADX INFO: renamed from: e */
    public String m494e() {
        return this.f470h;
    }

    /* JADX INFO: renamed from: f */
    public String m495f() {
        return this.f471i;
    }

    public void setAAID(String str) {
        this.f469g = str;
        m473a("aaid", str);
    }

    public void setOAID(String str) {
        this.f468f = str;
        m473a("oaid", str);
    }

    public void setUDID(String str) {
        this.f471i = str;
        m473a("udid", str);
    }

    public void setVAID(String str) {
        this.f470h = str;
        m473a("vaid", str);
    }
}
