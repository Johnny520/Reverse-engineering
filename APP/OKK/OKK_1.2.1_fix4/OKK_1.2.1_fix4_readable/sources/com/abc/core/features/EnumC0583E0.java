package com.abc.core.features;

import java.util.List;
import p009E0.AbstractC0182m;
import p020K0.C0240a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0583E0 {

    /* JADX INFO: renamed from: e */
    public static final PcAutoLoginConfig f1752e;

    /* JADX INFO: renamed from: f */
    public static final List f1753f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0583E0[] f1754g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ C0240a f1755h;

    /* JADX INFO: renamed from: a */
    public final String f1756a;

    /* JADX INFO: renamed from: b */
    public final String f1757b;

    /* JADX INFO: renamed from: c */
    public final String f1758c;

    /* JADX INFO: renamed from: d */
    public final String f1759d;

    static {
        EnumC0583E0 enumC0583E0 = new EnumC0583E0("QRCODE", 0, "qrcode", "我的二维码", "展示个人二维码", "▦");
        EnumC0583E0 enumC0583E02 = new EnumC0583E0("PAY", 1, "pay", "收付款", "付款码 / 收款", "¥");
        EnumC0583E0 enumC0583E03 = new EnumC0583E0("SERVICE", 2, "service", "服务", "支付与服务", "◈");
        EnumC0583E0 enumC0583E04 = new EnumC0583E0("FAVORITE", 3, "favorite", "收藏", "我的收藏", "★");
        EnumC0583E0[] enumC0583E0Arr = {enumC0583E0, enumC0583E02, enumC0583E03, enumC0583E04};
        f1754g = enumC0583E0Arr;
        f1755h = new C0240a(enumC0583E0Arr);
        f1752e = new PcAutoLoginConfig();
        f1753f = AbstractC0182m.m556h0(enumC0583E0, enumC0583E02, enumC0583E04);
    }

    public EnumC0583E0(String str, int i2, String str2, String str3, String str4, String str5) {
        this.f1756a = str2;
        this.f1757b = str3;
        this.f1758c = str4;
        this.f1759d = str5;
    }

    public static EnumC0583E0 valueOf(String str) {
        return (EnumC0583E0) Enum.valueOf(EnumC0583E0.class, str);
    }

    public static EnumC0583E0[] values() {
        return (EnumC0583E0[]) f1754g.clone();
    }
}
