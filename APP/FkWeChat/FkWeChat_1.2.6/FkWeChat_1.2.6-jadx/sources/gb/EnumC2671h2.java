package gb;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gb.h2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2671h2 {

    /* JADX INFO: renamed from: q */
    public static final EnumC2671h2 f7005q = new EnumC2671h2("SUPERTYPE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2671h2 f7006r = new EnumC2671h2("COMMON", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC2671h2[] f7007s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f7008t;

    static {
        EnumC2671h2[] enumC2671h2ArrM9450a = m9450a();
        f7007s = enumC2671h2ArrM9450a;
        f7008t = AbstractC7198b.m28437a(enumC2671h2ArrM9450a);
    }

    public EnumC2671h2(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2671h2[] m9450a() {
        return new EnumC2671h2[]{f7005q, f7006r};
    }

    public static EnumC2671h2 valueOf(String str) {
        return (EnumC2671h2) Enum.valueOf(EnumC2671h2.class, str);
    }

    public static EnumC2671h2[] values() {
        return (EnumC2671h2[]) f7007s.clone();
    }
}
