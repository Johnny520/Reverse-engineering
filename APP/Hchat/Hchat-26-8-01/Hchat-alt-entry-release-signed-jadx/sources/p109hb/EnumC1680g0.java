package p109hb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hb.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1680g0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1680g0 f5568g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1680g0 f5569h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC1680g0[] f5570i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1680g0 enumC1680g0 = new EnumC1680g0("MASS_SEND", 0);
        f5568g = enumC1680g0;
        EnumC1680g0 enumC1680g02 = new EnumC1680g0("SCHEDULE", 1);
        f5569h = enumC1680g02;
        f5570i = new EnumC1680g0[]{enumC1680g0, enumC1680g02};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1680g0 valueOf(String str) {
        return (EnumC1680g0) AbstractC2091b.m5160g(EnumC1680g0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1680g0[] values() {
        return (EnumC1680g0[]) f5570i.clone();
    }
}
