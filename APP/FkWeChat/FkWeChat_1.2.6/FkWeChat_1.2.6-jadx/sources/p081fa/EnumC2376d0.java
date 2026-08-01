package p081fa;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fa.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2376d0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC2376d0 f6507q = new EnumC2376d0("SOURCE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC2376d0 f6508r = new EnumC2376d0("BINARY", 1);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC2376d0[] f6509s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC7197a f6510t;

    static {
        EnumC2376d0[] enumC2376d0ArrM8605a = m8605a();
        f6509s = enumC2376d0ArrM8605a;
        f6510t = AbstractC7198b.m28437a(enumC2376d0ArrM8605a);
    }

    public EnumC2376d0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2376d0[] m8605a() {
        return new EnumC2376d0[]{f6507q, f6508r};
    }

    public static EnumC2376d0 valueOf(String str) {
        return (EnumC2376d0) Enum.valueOf(EnumC2376d0.class, str);
    }

    public static EnumC2376d0[] values() {
        return (EnumC2376d0[]) f6509s.clone();
    }
}
