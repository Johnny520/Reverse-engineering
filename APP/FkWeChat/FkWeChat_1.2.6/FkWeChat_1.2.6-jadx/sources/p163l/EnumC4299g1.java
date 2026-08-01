package p163l;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4299g1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC4299g1 f12621q = new EnumC4299g1("Restart", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC4299g1 f12622r = new EnumC4299g1("Reverse", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC4299g1[] f12623s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f12624t;

    static {
        EnumC4299g1[] enumC4299g1ArrM16930a = m16930a();
        f12623s = enumC4299g1ArrM16930a;
        f12624t = AbstractC7198b.m28437a(enumC4299g1ArrM16930a);
    }

    public EnumC4299g1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4299g1[] m16930a() {
        return new EnumC4299g1[]{f12621q, f12622r};
    }

    public static EnumC4299g1 valueOf(String str) {
        return (EnumC4299g1) Enum.valueOf(EnumC4299g1.class, str);
    }

    public static EnumC4299g1[] values() {
        return (EnumC4299g1[]) f12623s.clone();
    }
}
