package p259r9;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r9.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3770t {

    /* JADX INFO: renamed from: g */
    public static final EnumC3770t f12332g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3770t f12333h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3770t f12334i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3770t[] f12335j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3770t enumC3770t = new EnumC3770t("STABLE", 0);
        f12332g = enumC3770t;
        EnumC3770t enumC3770t2 = new EnumC3770t("NEEDS_LAYOUT", 1);
        f12333h = enumC3770t2;
        EnumC3770t enumC3770t3 = new EnumC3770t("UNAVAILABLE", 2);
        f12334i = enumC3770t3;
        f12335j = new EnumC3770t[]{enumC3770t, enumC3770t2, enumC3770t3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3770t valueOf(String str) {
        return (EnumC3770t) AbstractC2091b.m5160g(EnumC3770t.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3770t[] values() {
        return (EnumC3770t[]) f12335j.clone();
    }
}
