package p041d1;

import okio.C3193a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d1.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0680z {

    /* JADX INFO: renamed from: g */
    public static final EnumC0680z f2084g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0680z f2085h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0680z f2086i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0680z[] f2087j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0680z enumC0680z = new EnumC0680z("Active", 0);
        f2084g = enumC0680z;
        EnumC0680z enumC0680z2 = new EnumC0680z("ActiveParent", 1);
        f2085h = enumC0680z2;
        EnumC0680z enumC0680z3 = new EnumC0680z("Captured", 2);
        EnumC0680z enumC0680z4 = new EnumC0680z("Inactive", 3);
        f2086i = enumC0680z4;
        f2087j = new EnumC0680z[]{enumC0680z, enumC0680z2, enumC0680z3, enumC0680z4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0680z valueOf(String str) {
        return (EnumC0680z) Enum.valueOf(EnumC0680z.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0680z[] values() {
        return (EnumC0680z[]) f2087j.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1860a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                C3193a.m6822k();
                return false;
            }
        }
        return true;
    }
}
