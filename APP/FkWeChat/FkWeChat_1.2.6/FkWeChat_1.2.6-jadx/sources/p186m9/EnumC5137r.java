package p186m9;

import p213oa.C5691b;
import p213oa.C5695f;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m9.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5137r {

    /* JADX INFO: renamed from: s */
    public static final EnumC5137r f15625s;

    /* JADX INFO: renamed from: t */
    public static final EnumC5137r f15626t;

    /* JADX INFO: renamed from: u */
    public static final EnumC5137r f15627u;

    /* JADX INFO: renamed from: v */
    public static final EnumC5137r f15628v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC5137r[] f15629w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ InterfaceC7197a f15630x;

    /* JADX INFO: renamed from: q */
    public final C5691b f15631q;

    /* JADX INFO: renamed from: r */
    public final C5695f f15632r;

    static {
        C5691b.a aVar = C5691b.f17894d;
        f15625s = new EnumC5137r("UBYTEARRAY", 0, C5691b.a.m22991b(aVar, "kotlin/UByteArray", false, 2, null));
        f15626t = new EnumC5137r("USHORTARRAY", 1, C5691b.a.m22991b(aVar, "kotlin/UShortArray", false, 2, null));
        f15627u = new EnumC5137r("UINTARRAY", 2, C5691b.a.m22991b(aVar, "kotlin/UIntArray", false, 2, null));
        f15628v = new EnumC5137r("ULONGARRAY", 3, C5691b.a.m22991b(aVar, "kotlin/ULongArray", false, 2, null));
        EnumC5137r[] enumC5137rArrM20975a = m20975a();
        f15629w = enumC5137rArrM20975a;
        f15630x = AbstractC7198b.m28437a(enumC5137rArrM20975a);
    }

    public EnumC5137r(String str, int i10, C5691b c5691b) {
        this.f15631q = c5691b;
        this.f15632r = c5691b.m22988h();
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5137r[] m20975a() {
        return new EnumC5137r[]{f15625s, f15626t, f15627u, f15628v};
    }

    public static EnumC5137r valueOf(String str) {
        return (EnumC5137r) Enum.valueOf(EnumC5137r.class, str);
    }

    public static EnumC5137r[] values() {
        return (EnumC5137r[]) f15629w.clone();
    }

    /* JADX INFO: renamed from: c */
    public final C5695f m20976c() {
        return this.f15632r;
    }
}
