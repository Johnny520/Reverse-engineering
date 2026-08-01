package p319w2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w2.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9073h {

    /* JADX INFO: renamed from: q */
    public static final EnumC9073h f31114q = new EnumC9073h("Paragraph", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC9073h f31115r = new EnumC9073h("Span", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC9073h f31116s = new EnumC9073h("VerbatimTts", 2);

    /* JADX INFO: renamed from: t */
    public static final EnumC9073h f31117t = new EnumC9073h("Url", 3);

    /* JADX INFO: renamed from: u */
    public static final EnumC9073h f31118u = new EnumC9073h("Link", 4);

    /* JADX INFO: renamed from: v */
    public static final EnumC9073h f31119v = new EnumC9073h("Clickable", 5);

    /* JADX INFO: renamed from: w */
    public static final EnumC9073h f31120w = new EnumC9073h("String", 6);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC9073h[] f31121x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f31122y;

    static {
        EnumC9073h[] enumC9073hArrM35272a = m35272a();
        f31121x = enumC9073hArrM35272a;
        f31122y = AbstractC7198b.m28437a(enumC9073hArrM35272a);
    }

    public EnumC9073h(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9073h[] m35272a() {
        return new EnumC9073h[]{f31114q, f31115r, f31116s, f31117t, f31118u, f31119v, f31120w};
    }

    public static EnumC9073h valueOf(String str) {
        return (EnumC9073h) Enum.valueOf(EnumC9073h.class, str);
    }

    public static EnumC9073h[] values() {
        return (EnumC9073h[]) f31121x.clone();
    }
}
