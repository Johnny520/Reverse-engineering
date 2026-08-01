package p067eb;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: eb.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2094r {

    /* JADX INFO: renamed from: q */
    public static final EnumC2094r f5860q = new EnumC2094r("STABLE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2094r f5861r = new EnumC2094r("UNSTABLE", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC2094r[] f5862s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f5863t;

    static {
        EnumC2094r[] enumC2094rArrM7509a = m7509a();
        f5862s = enumC2094rArrM7509a;
        f5863t = AbstractC7198b.m28437a(enumC2094rArrM7509a);
    }

    public EnumC2094r(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2094r[] m7509a() {
        return new EnumC2094r[]{f5860q, f5861r};
    }

    public static EnumC2094r valueOf(String str) {
        return (EnumC2094r) Enum.valueOf(EnumC2094r.class, str);
    }

    public static EnumC2094r[] values() {
        return (EnumC2094r[]) f5862s.clone();
    }
}
