package p261rb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3789e {

    /* JADX INFO: renamed from: g */
    public static final EnumC3789e f12422g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3789e f12423h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3789e f12424i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3789e[] f12425j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3789e enumC3789e = new EnumC3789e("NORMAL", 0);
        f12422g = enumC3789e;
        EnumC3789e enumC3789e2 = new EnumC3789e("DEAD", 1);
        f12423h = enumC3789e2;
        EnumC3789e enumC3789e3 = new EnumC3789e("UNKNOWN", 2);
        f12424i = enumC3789e3;
        f12425j = new EnumC3789e[]{enumC3789e, enumC3789e2, enumC3789e3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3789e valueOf(String str) {
        return (EnumC3789e) AbstractC2091b.m5160g(EnumC3789e.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3789e[] values() {
        return (EnumC3789e[]) f12425j.clone();
    }
}
