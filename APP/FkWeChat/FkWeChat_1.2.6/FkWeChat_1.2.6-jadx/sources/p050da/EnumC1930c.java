package p050da;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: da.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1930c {

    /* JADX INFO: renamed from: q */
    public static final EnumC1930c f5390q = new EnumC1930c("INFLEXIBLE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC1930c f5391r = new EnumC1930c("FLEXIBLE_UPPER_BOUND", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC1930c f5392s = new EnumC1930c("FLEXIBLE_LOWER_BOUND", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC1930c[] f5393t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f5394u;

    static {
        EnumC1930c[] enumC1930cArrM6998a = m6998a();
        f5393t = enumC1930cArrM6998a;
        f5394u = AbstractC7198b.m28437a(enumC1930cArrM6998a);
    }

    public EnumC1930c(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC1930c[] m6998a() {
        return new EnumC1930c[]{f5390q, f5391r, f5392s};
    }

    public static EnumC1930c valueOf(String str) {
        return (EnumC1930c) Enum.valueOf(EnumC1930c.class, str);
    }

    public static EnumC1930c[] values() {
        return (EnumC1930c[]) f5393t.clone();
    }
}
