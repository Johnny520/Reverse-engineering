package p275t0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t0.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC8021z0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC8021z0 f26691q = new EnumC8021z0("Focused", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC8021z0 f26692r = new EnumC8021z0("UnfocusedEmpty", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC8021z0 f26693s = new EnumC8021z0("UnfocusedNotEmpty", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC8021z0[] f26694t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f26695u;

    static {
        EnumC8021z0[] enumC8021z0ArrM30786a = m30786a();
        f26694t = enumC8021z0ArrM30786a;
        f26695u = AbstractC7198b.m28437a(enumC8021z0ArrM30786a);
    }

    public EnumC8021z0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC8021z0[] m30786a() {
        return new EnumC8021z0[]{f26691q, f26692r, f26693s};
    }

    public static EnumC8021z0 valueOf(String str) {
        return (EnumC8021z0) Enum.valueOf(EnumC8021z0.class, str);
    }

    public static EnumC8021z0[] values() {
        return (EnumC8021z0[]) f26694t.clone();
    }
}
