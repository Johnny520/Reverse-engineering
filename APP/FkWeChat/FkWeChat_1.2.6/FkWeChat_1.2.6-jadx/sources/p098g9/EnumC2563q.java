package p098g9;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g9.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2563q {

    /* JADX INFO: renamed from: q */
    public static final EnumC2563q f6823q = new EnumC2563q("INVARIANT", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2563q f6824r = new EnumC2563q("IN", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC2563q f6825s = new EnumC2563q("OUT", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC2563q[] f6826t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f6827u;

    static {
        EnumC2563q[] enumC2563qArrM9090a = m9090a();
        f6826t = enumC2563qArrM9090a;
        f6827u = AbstractC7198b.m28437a(enumC2563qArrM9090a);
    }

    public EnumC2563q(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2563q[] m9090a() {
        return new EnumC2563q[]{f6823q, f6824r, f6825s};
    }

    public static EnumC2563q valueOf(String str) {
        return (EnumC2563q) Enum.valueOf(EnumC2563q.class, str);
    }

    public static EnumC2563q[] values() {
        return (EnumC2563q[]) f6826t.clone();
    }
}
