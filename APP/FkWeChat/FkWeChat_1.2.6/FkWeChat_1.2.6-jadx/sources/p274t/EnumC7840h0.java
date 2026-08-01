package p274t;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7840h0 {

    /* JADX INFO: renamed from: q */
    public static final EnumC7840h0 f26150q = new EnumC7840h0("Vertical", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC7840h0 f26151r = new EnumC7840h0("Horizontal", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC7840h0 f26152s = new EnumC7840h0("Both", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC7840h0[] f26153t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f26154u;

    static {
        EnumC7840h0[] enumC7840h0ArrM30368a = m30368a();
        f26153t = enumC7840h0ArrM30368a;
        f26154u = AbstractC7198b.m28437a(enumC7840h0ArrM30368a);
    }

    public EnumC7840h0(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC7840h0[] m30368a() {
        return new EnumC7840h0[]{f26150q, f26151r, f26152s};
    }

    public static EnumC7840h0 valueOf(String str) {
        return (EnumC7840h0) Enum.valueOf(EnumC7840h0.class, str);
    }

    public static EnumC7840h0[] values() {
        return (EnumC7840h0[]) f26153t.clone();
    }
}
