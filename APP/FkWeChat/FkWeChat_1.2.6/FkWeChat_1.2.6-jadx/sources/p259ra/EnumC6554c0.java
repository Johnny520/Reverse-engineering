package p259ra;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ra.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6554c0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC6554c0 f20516q = new EnumC6554c0("RENDER_OVERRIDE", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC6554c0 f20517r = new EnumC6554c0("RENDER_OPEN", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC6554c0 f20518s = new EnumC6554c0("RENDER_OPEN_OVERRIDE", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC6554c0[] f20519t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f20520u;

    static {
        EnumC6554c0[] enumC6554c0ArrM25872a = m25872a();
        f20519t = enumC6554c0ArrM25872a;
        f20520u = AbstractC7198b.m28437a(enumC6554c0ArrM25872a);
    }

    public EnumC6554c0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6554c0[] m25872a() {
        return new EnumC6554c0[]{f20516q, f20517r, f20518s};
    }

    public static EnumC6554c0 valueOf(String str) {
        return (EnumC6554c0) Enum.valueOf(EnumC6554c0.class, str);
    }

    public static EnumC6554c0[] values() {
        return (EnumC6554c0[]) f20519t.clone();
    }
}
