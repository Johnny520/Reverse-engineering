package p186m9;

import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m9.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5138s {

    /* JADX INFO: renamed from: t */
    public static final EnumC5138s f15633t;

    /* JADX INFO: renamed from: u */
    public static final EnumC5138s f15634u;

    /* JADX INFO: renamed from: v */
    public static final EnumC5138s f15635v;

    /* JADX INFO: renamed from: w */
    public static final EnumC5138s f15636w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC5138s[] f15637x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f15638y;

    /* JADX INFO: renamed from: q */
    public final C5691b f15639q;

    /* JADX INFO: renamed from: r */
    public final C5695f f15640r;

    /* JADX INFO: renamed from: s */
    public final C5691b f15641s;

    static {
        C5691b.a aVar = C5691b.f17894d;
        f15633t = new EnumC5138s("UBYTE", 0, C5691b.a.m22991b(aVar, "kotlin/UByte", false, 2, null));
        f15634u = new EnumC5138s("USHORT", 1, C5691b.a.m22991b(aVar, "kotlin/UShort", false, 2, null));
        f15635v = new EnumC5138s("UINT", 2, C5691b.a.m22991b(aVar, "kotlin/UInt", false, 2, null));
        f15636w = new EnumC5138s("ULONG", 3, C5691b.a.m22991b(aVar, "kotlin/ULong", false, 2, null));
        EnumC5138s[] enumC5138sArrM20977a = m20977a();
        f15637x = enumC5138sArrM20977a;
        f15638y = AbstractC7198b.m28437a(enumC5138sArrM20977a);
    }

    public EnumC5138s(String str, int i10, C5691b c5691b) {
        this.f15639q = c5691b;
        C5695f c5695fM22988h = c5691b.m22988h();
        this.f15640r = c5695fM22988h;
        C5692c c5692cM22986f = c5691b.m22986f();
        C5695f c5695fM23027j = C5695f.m23027j(c5695fM22988h.m23030c() + "Array");
        c5695fM23027j.getClass();
        this.f15641s = new C5691b(c5692cM22986f, c5695fM23027j);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5138s[] m20977a() {
        return new EnumC5138s[]{f15633t, f15634u, f15635v, f15636w};
    }

    public static EnumC5138s valueOf(String str) {
        return (EnumC5138s) Enum.valueOf(EnumC5138s.class, str);
    }

    public static EnumC5138s[] values() {
        return (EnumC5138s[]) f15637x.clone();
    }

    /* JADX INFO: renamed from: c */
    public final C5691b m20978c() {
        return this.f15641s;
    }

    /* JADX INFO: renamed from: g */
    public final C5691b m20979g() {
        return this.f15639q;
    }

    /* JADX INFO: renamed from: h */
    public final C5695f m20980h() {
        return this.f15640r;
    }
}
