package com.tendcloud.tenddata;

/* JADX INFO: renamed from: com.tendcloud.tenddata.dd */
/* JADX INFO: loaded from: classes.dex */
public class C0103dd extends AbstractC0097cy {

    /* JADX INFO: renamed from: a */
    public static C0102dc f455a = null;

    /* JADX INFO: renamed from: c */
    private static final String f456c = "type";

    /* JADX INFO: renamed from: d */
    private static final String f457d = "deviceId";

    /* JADX INFO: renamed from: e */
    private static final String f458e = "runtimeConfig";

    /* JADX INFO: renamed from: f */
    private static final String f459f = "hardwareConfig";

    /* JADX INFO: renamed from: g */
    private static final String f460g = "softwareConfig";

    /* JADX INFO: renamed from: h */
    private C0104de f461h = new C0104de();

    /* JADX INFO: renamed from: i */
    private C0101db f462i = new C0101db();

    public C0103dd() {
        m482d();
    }

    /* JADX INFO: renamed from: d */
    private void m482d() {
        m473a(f456c, "mobile");
        C0102dc c0102dc = new C0102dc();
        f455a = c0102dc;
        m473a(f457d, c0102dc.mo467b());
        m473a(f458e, new C0106dg().mo467b());
        m473a(f459f, this.f462i.mo467b());
        m473a(f460g, this.f461h.mo467b());
    }

    /* JADX INFO: renamed from: a */
    public C0104de m483a() {
        return this.f461h;
    }

    /* JADX INFO: renamed from: c */
    public C0101db m484c() {
        return this.f462i;
    }
}
