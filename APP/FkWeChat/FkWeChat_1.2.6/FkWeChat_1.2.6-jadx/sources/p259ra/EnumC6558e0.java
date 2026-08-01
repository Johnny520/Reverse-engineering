package p259ra;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ra.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6558e0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6558e0 f20528q = new EnumC6558e0("PRETTY", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6558e0 f20529r = new EnumC6558e0("DEBUG", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6558e0 f20530s = new EnumC6558e0("NONE", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6558e0[] f20531t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f20532u;

    static {
        EnumC6558e0[] enumC6558e0ArrM25874a = m25874a();
        f20531t = enumC6558e0ArrM25874a;
        f20532u = AbstractC7198b.m28437a(enumC6558e0ArrM25874a);
    }

    public EnumC6558e0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6558e0[] m25874a() {
        return new EnumC6558e0[]{f20528q, f20529r, f20530s};
    }

    public static EnumC6558e0 valueOf(String str) {
        return (EnumC6558e0) Enum.valueOf(EnumC6558e0.class, str);
    }

    public static EnumC6558e0[] values() {
        return (EnumC6558e0[]) f20531t.clone();
    }
}
