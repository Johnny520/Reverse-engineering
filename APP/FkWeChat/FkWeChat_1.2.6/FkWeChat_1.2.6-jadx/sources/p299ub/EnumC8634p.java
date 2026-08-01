package p299ub;

import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ub.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC8634p {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ InterfaceC7197a f28708A;

    /* JADX INFO: renamed from: s */
    public static final EnumC8634p f28709s = new EnumC8634p("IGNORE_CASE", 0, 2, 0, 2, null);

    /* JADX INFO: renamed from: t */
    public static final EnumC8634p f28710t = new EnumC8634p("MULTILINE", 1, 8, 0, 2, null);

    /* JADX INFO: renamed from: u */
    public static final EnumC8634p f28711u = new EnumC8634p("LITERAL", 2, 16, 0, 2, null);

    /* JADX INFO: renamed from: v */
    public static final EnumC8634p f28712v = new EnumC8634p("UNIX_LINES", 3, 1, 0, 2, null);

    /* JADX INFO: renamed from: w */
    public static final EnumC8634p f28713w = new EnumC8634p("COMMENTS", 4, 4, 0, 2, null);

    /* JADX INFO: renamed from: x */
    public static final EnumC8634p f28714x = new EnumC8634p("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* JADX INFO: renamed from: y */
    public static final EnumC8634p f28715y = new EnumC8634p("CANON_EQ", 6, 128, 0, 2, null);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC8634p[] f28716z;

    /* JADX INFO: renamed from: q */
    public final int f28717q;

    /* JADX INFO: renamed from: r */
    public final int f28718r;

    static {
        EnumC8634p[] enumC8634pArrM33232a = m33232a();
        f28716z = enumC8634pArrM33232a;
        f28708A = AbstractC7198b.m28437a(enumC8634pArrM33232a);
    }

    public /* synthetic */ EnumC8634p(String str, int i10, int i11, int i12, int i13, AbstractC1043k abstractC1043k) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC8634p[] m33232a() {
        return new EnumC8634p[]{f28709s, f28710t, f28711u, f28712v, f28713w, f28714x, f28715y};
    }

    public static EnumC8634p valueOf(String str) {
        return (EnumC8634p) Enum.valueOf(EnumC8634p.class, str);
    }

    public static EnumC8634p[] values() {
        return (EnumC8634p[]) f28716z.clone();
    }

    /* JADX INFO: renamed from: c */
    public int m33233c() {
        return this.f28717q;
    }

    public EnumC8634p(String str, int i10, int i11, int i12) {
        this.f28717q = i11;
        this.f28718r = i12;
    }
}
