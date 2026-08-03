package ba;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ba.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0222b {

    /* JADX INFO: renamed from: g */
    public static final EnumC0222b f551g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0222b f552h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0222b f553i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0222b[] f554j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0222b enumC0222b = new EnumC0222b("SAVED", 0);
        f551g = enumC0222b;
        EnumC0222b enumC0222b2 = new EnumC0222b("CANCELLED", 1);
        f552h = enumC0222b2;
        EnumC0222b enumC0222b3 = new EnumC0222b("FAILED", 2);
        f553i = enumC0222b3;
        f554j = new EnumC0222b[]{enumC0222b, enumC0222b2, enumC0222b3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0222b valueOf(String str) {
        return (EnumC0222b) AbstractC2091b.m5160g(EnumC0222b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0222b[] values() {
        return (EnumC0222b[]) f554j.clone();
    }
}
