package p243q9;

import p024b9.AbstractC1043k;
import p214ob.AbstractC5701a;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q9.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6330e {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ EnumC6330e[] f19855B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ InterfaceC7197a f19856C;

    /* JADX INFO: renamed from: q */
    public final String f19866q;

    /* JADX INFO: renamed from: r */
    public static final EnumC6330e f19857r = new EnumC6330e("ALL", 0, null, 1, null);

    /* JADX INFO: renamed from: s */
    public static final EnumC6330e f19858s = new EnumC6330e("FIELD", 1, null, 1, null);

    /* JADX INFO: renamed from: t */
    public static final EnumC6330e f19859t = new EnumC6330e("FILE", 2, null, 1, null);

    /* JADX INFO: renamed from: u */
    public static final EnumC6330e f19860u = new EnumC6330e("PROPERTY", 3, null, 1, null);

    /* JADX INFO: renamed from: v */
    public static final EnumC6330e f19861v = new EnumC6330e("PROPERTY_GETTER", 4, "get");

    /* JADX INFO: renamed from: w */
    public static final EnumC6330e f19862w = new EnumC6330e("PROPERTY_SETTER", 5, "set");

    /* JADX INFO: renamed from: x */
    public static final EnumC6330e f19863x = new EnumC6330e("RECEIVER", 6, null, 1, null);

    /* JADX INFO: renamed from: y */
    public static final EnumC6330e f19864y = new EnumC6330e("CONSTRUCTOR_PARAMETER", 7, "param");

    /* JADX INFO: renamed from: z */
    public static final EnumC6330e f19865z = new EnumC6330e("SETTER_PARAMETER", 8, "setparam");

    /* JADX INFO: renamed from: A */
    public static final EnumC6330e f19854A = new EnumC6330e("PROPERTY_DELEGATE_FIELD", 9, "delegate");

    static {
        EnumC6330e[] enumC6330eArrM24996a = m24996a();
        f19855B = enumC6330eArrM24996a;
        f19856C = AbstractC7198b.m28437a(enumC6330eArrM24996a);
    }

    public EnumC6330e(String str, int i10, String str2) {
        this.f19866q = str2 == null ? AbstractC5701a.m23078f(name()) : str2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6330e[] m24996a() {
        return new EnumC6330e[]{f19857r, f19858s, f19859t, f19860u, f19861v, f19862w, f19863x, f19864y, f19865z, f19854A};
    }

    public static EnumC6330e valueOf(String str) {
        return (EnumC6330e) Enum.valueOf(EnumC6330e.class, str);
    }

    public static EnumC6330e[] values() {
        return (EnumC6330e[]) f19855B.clone();
    }

    /* JADX INFO: renamed from: c */
    public final String m24997c() {
        return this.f19866q;
    }

    public /* synthetic */ EnumC6330e(String str, int i10, String str2, int i11, AbstractC1043k abstractC1043k) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
