package p259ra;

import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ra.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6549a {

    /* JADX INFO: renamed from: s */
    public static final EnumC6549a f20502s = new EnumC6549a("NO_ARGUMENTS", 0, false, false, 3, null);

    /* JADX INFO: renamed from: t */
    public static final EnumC6549a f20503t = new EnumC6549a("UNLESS_EMPTY", 1, true, false, 2, null);

    /* JADX INFO: renamed from: u */
    public static final EnumC6549a f20504u = new EnumC6549a("ALWAYS_PARENTHESIZED", 2, true, true);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC6549a[] f20505v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ InterfaceC7197a f20506w;

    /* JADX INFO: renamed from: q */
    public final boolean f20507q;

    /* JADX INFO: renamed from: r */
    public final boolean f20508r;

    static {
        EnumC6549a[] enumC6549aArrM25865a = m25865a();
        f20505v = enumC6549aArrM25865a;
        f20506w = AbstractC7198b.m28437a(enumC6549aArrM25865a);
    }

    public /* synthetic */ EnumC6549a(String str, int i10, boolean z10, boolean z11, int i11, AbstractC1043k abstractC1043k) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6549a[] m25865a() {
        return new EnumC6549a[]{f20502s, f20503t, f20504u};
    }

    public static EnumC6549a valueOf(String str) {
        return (EnumC6549a) Enum.valueOf(EnumC6549a.class, str);
    }

    public static EnumC6549a[] values() {
        return (EnumC6549a[]) f20505v.clone();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25866c() {
        return this.f20507q;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m25867g() {
        return this.f20508r;
    }

    public EnumC6549a(String str, int i10, boolean z10, boolean z11) {
        this.f20507q = z10;
        this.f20508r = z11;
    }
}
