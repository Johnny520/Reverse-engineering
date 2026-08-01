package gb;

import okhttp3.internal.url._UrlKt;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gb.m2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2691m2 {

    /* JADX INFO: renamed from: u */
    public static final EnumC2691m2 f7042u = new EnumC2691m2("INVARIANT", 0, _UrlKt.FRAGMENT_ENCODE_SET, true, true, 0);

    /* JADX INFO: renamed from: v */
    public static final EnumC2691m2 f7043v = new EnumC2691m2("IN_VARIANCE", 1, "in", true, false, -1);

    /* JADX INFO: renamed from: w */
    public static final EnumC2691m2 f7044w = new EnumC2691m2("OUT_VARIANCE", 2, "out", false, true, 1);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC2691m2[] f7045x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f7046y;

    /* JADX INFO: renamed from: q */
    public final String f7047q;

    /* JADX INFO: renamed from: r */
    public final boolean f7048r;

    /* JADX INFO: renamed from: s */
    public final boolean f7049s;

    /* JADX INFO: renamed from: t */
    public final int f7050t;

    static {
        EnumC2691m2[] enumC2691m2ArrM9518a = m9518a();
        f7045x = enumC2691m2ArrM9518a;
        f7046y = AbstractC7198b.m28437a(enumC2691m2ArrM9518a);
    }

    public EnumC2691m2(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.f7047q = str2;
        this.f7048r = z10;
        this.f7049s = z11;
        this.f7050t = i11;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC2691m2[] m9518a() {
        return new EnumC2691m2[]{f7042u, f7043v, f7044w};
    }

    public static EnumC2691m2 valueOf(String str) {
        return (EnumC2691m2) Enum.valueOf(EnumC2691m2.class, str);
    }

    public static EnumC2691m2[] values() {
        return (EnumC2691m2[]) f7045x.clone();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9519c() {
        return this.f7049s;
    }

    /* JADX INFO: renamed from: g */
    public final String m9520g() {
        return this.f7047q;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7047q;
    }
}
