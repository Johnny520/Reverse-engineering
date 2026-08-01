package p259ra;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ra.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6556d0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6556d0 f20522q = new EnumC6556d0("ALL", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6556d0 f20523r = new EnumC6556d0("ONLY_NON_SYNTHESIZED", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6556d0 f20524s = new EnumC6556d0("NONE", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6556d0[] f20525t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f20526u;

    static {
        EnumC6556d0[] enumC6556d0ArrM25873a = m25873a();
        f20525t = enumC6556d0ArrM25873a;
        f20526u = AbstractC7198b.m28437a(enumC6556d0ArrM25873a);
    }

    public EnumC6556d0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6556d0[] m25873a() {
        return new EnumC6556d0[]{f20522q, f20523r, f20524s};
    }

    public static EnumC6556d0 valueOf(String str) {
        return (EnumC6556d0) Enum.valueOf(EnumC6556d0.class, str);
    }

    public static EnumC6556d0[] values() {
        return (EnumC6556d0[]) f20525t.clone();
    }
}
