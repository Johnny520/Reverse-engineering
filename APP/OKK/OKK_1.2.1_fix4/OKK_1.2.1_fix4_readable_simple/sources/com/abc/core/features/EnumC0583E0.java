package com.abc.core.features;

import java.util.List;
import p009E0.AbstractC0182m;
import p020K0.C0240a;

/* JADX INFO: renamed from: c0.E0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0583E0 extends Enum {

    /* JADX INFO: renamed from: e */
    public static final PcAutoLoginConfig f1752e = null;

    /* JADX INFO: renamed from: f */
    public static final List f1753f = null;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0583E0[] f1754g = null;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ C0240a f1755h = null;

    /* JADX INFO: renamed from: a */
    public final String f1756a;

    /* JADX INFO: renamed from: b */
    public final String f1757b;

    /* JADX INFO: renamed from: c */
    public final String f1758c;

    /* JADX INFO: renamed from: d */
    public final String f1759d;

    static {
        EnumC0583E0 r7 = new EnumC0583E0("QRCODE", 0, "qrcode", "我的二维码", "展示个人二维码", "▦");
        EnumC0583E0 r02 = new EnumC0583E0("PAY", 1, "pay", "收付款", "付款码 / 收款", "¥");
        EnumC0583E0 r1 = new EnumC0583E0("SERVICE", 2, "service", "服务", "支付与服务", "◈");
        EnumC0583E0 r2 = new EnumC0583E0("FAVORITE", 3, "favorite", "收藏", "我的收藏", "★");
        EnumC0583E0[] r12 = {r7, r02, r1, r2};
        f1754g = r12;
        f1755h = new C0240a(r12);
        f1752e = new PcAutoLoginConfig();
        f1753f = AbstractC0182m.m556h0(new EnumC0583E0[]{r7, r02, r2});
    }

    EnumC0583E0(String r1, int r2, String r3, String r4, String r5, String r6) {
        this.f1756a = r3;
        this.f1757b = r4;
        this.f1758c = r5;
        this.f1759d = r6;
    }

    public static EnumC0583E0 valueOf(String r1) {
        return (EnumC0583E0) Enum.valueOf(EnumC0583E0.class, r1);
    }

    public static EnumC0583E0[] values() {
        return (EnumC0583E0[]) f1754g.clone();
    }
}
