package p190n0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n0.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5394n {

    /* JADX INFO: renamed from: q */
    public static final EnumC5394n f16595q = new EnumC5394n("BEFORE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC5394n f16596r = new EnumC5394n("ON", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC5394n f16597s = new EnumC5394n("AFTER", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC5394n[] f16598t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f16599u;

    static {
        EnumC5394n[] enumC5394nArrM21943a = m21943a();
        f16598t = enumC5394nArrM21943a;
        f16599u = AbstractC7198b.m28437a(enumC5394nArrM21943a);
    }

    public EnumC5394n(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5394n[] m21943a() {
        return new EnumC5394n[]{f16595q, f16596r, f16597s};
    }

    public static EnumC5394n valueOf(String str) {
        return (EnumC5394n) Enum.valueOf(EnumC5394n.class, str);
    }

    public static EnumC5394n[] values() {
        return (EnumC5394n[]) f16598t.clone();
    }
}
