package qa;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qa.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3474b {

    /* JADX INFO: renamed from: g */
    public static final EnumC3474b f11269g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3474b f11270h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3474b f11271i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3474b[] f11272j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3474b enumC3474b = new EnumC3474b("BALANCE", 0);
        f11269g = enumC3474b;
        EnumC3474b enumC3474b2 = new EnumC3474b("LQT", 1);
        f11270h = enumC3474b2;
        EnumC3474b enumC3474b3 = new EnumC3474b("BUSINESS", 2);
        f11271i = enumC3474b3;
        f11272j = new EnumC3474b[]{enumC3474b, enumC3474b2, enumC3474b3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3474b valueOf(String str) {
        return (EnumC3474b) AbstractC2091b.m5160g(EnumC3474b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3474b[] values() {
        return (EnumC3474b[]) f11272j.clone();
    }
}
