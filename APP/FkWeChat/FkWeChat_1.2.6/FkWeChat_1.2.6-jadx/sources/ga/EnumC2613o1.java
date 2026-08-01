package ga;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ga.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2613o1 {

    /* JADX INFO: renamed from: q */
    public static final EnumC2613o1 f6929q = new EnumC2613o1("FLEXIBLE_LOWER", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2613o1 f6930r = new EnumC2613o1("FLEXIBLE_UPPER", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC2613o1 f6931s = new EnumC2613o1("INFLEXIBLE", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC2613o1[] f6932t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f6933u;

    static {
        EnumC2613o1[] enumC2613o1ArrM9305a = m9305a();
        f6932t = enumC2613o1ArrM9305a;
        f6933u = AbstractC7198b.m28437a(enumC2613o1ArrM9305a);
    }

    public EnumC2613o1(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2613o1[] m9305a() {
        return new EnumC2613o1[]{f6929q, f6930r, f6931s};
    }

    public static EnumC2613o1 valueOf(String str) {
        return (EnumC2613o1) Enum.valueOf(EnumC2613o1.class, str);
    }

    public static EnumC2613o1[] values() {
        return (EnumC2613o1[]) f6932t.clone();
    }
}
