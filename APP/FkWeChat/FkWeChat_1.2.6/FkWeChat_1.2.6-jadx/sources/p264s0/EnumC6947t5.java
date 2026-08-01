package p264s0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s0.t5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6947t5 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6947t5 f22859q = new EnumC6947t5("Selector", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6947t5 f22860r = new EnumC6947t5("InnerCircle", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC6947t5[] f22861s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f22862t;

    static {
        EnumC6947t5[] enumC6947t5ArrM27539a = m27539a();
        f22861s = enumC6947t5ArrM27539a;
        f22862t = AbstractC7198b.m28437a(enumC6947t5ArrM27539a);
    }

    public EnumC6947t5(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6947t5[] m27539a() {
        return new EnumC6947t5[]{f22859q, f22860r};
    }

    public static EnumC6947t5 valueOf(String str) {
        return (EnumC6947t5) Enum.valueOf(EnumC6947t5.class, str);
    }

    public static EnumC6947t5[] values() {
        return (EnumC6947t5[]) f22861s.clone();
    }
}
