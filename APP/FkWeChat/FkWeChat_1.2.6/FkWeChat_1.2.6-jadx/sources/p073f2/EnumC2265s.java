package p073f2;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f2.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2265s {

    /* JADX INFO: renamed from: q */
    public static final EnumC2265s f6225q = new EnumC2265s("Initial", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2265s f6226r = new EnumC2265s("Main", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC2265s f6227s = new EnumC2265s("Final", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC2265s[] f6228t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f6229u;

    static {
        EnumC2265s[] enumC2265sArrM8252a = m8252a();
        f6228t = enumC2265sArrM8252a;
        f6229u = AbstractC7198b.m28437a(enumC2265sArrM8252a);
    }

    public EnumC2265s(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2265s[] m8252a() {
        return new EnumC2265s[]{f6225q, f6226r, f6227s};
    }

    public static EnumC2265s valueOf(String str) {
        return (EnumC2265s) Enum.valueOf(EnumC2265s.class, str);
    }

    public static EnumC2265s[] values() {
        return (EnumC2265s[]) f6228t.clone();
    }
}
