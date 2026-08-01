package p135j2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j2.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3569t {

    /* JADX INFO: renamed from: q */
    public static final EnumC3569t f9926q = new EnumC3569t("Min", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC3569t f9927r = new EnumC3569t("Max", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC3569t[] f9928s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f9929t;

    static {
        EnumC3569t[] enumC3569tArrM13357a = m13357a();
        f9928s = enumC3569tArrM13357a;
        f9929t = AbstractC7198b.m28437a(enumC3569tArrM13357a);
    }

    public EnumC3569t(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3569t[] m13357a() {
        return new EnumC3569t[]{f9926q, f9927r};
    }

    public static EnumC3569t valueOf(String str) {
        return (EnumC3569t) Enum.valueOf(EnumC3569t.class, str);
    }

    public static EnumC3569t[] values() {
        return (EnumC3569t[]) f9928s.clone();
    }
}
