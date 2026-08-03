package p332wb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.l2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5063l2 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5063l2 f18546g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5063l2 f18547h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5063l2 f18548i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC5063l2[] f18549j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5063l2 enumC5063l2 = new EnumC5063l2("PRIVATE", 0);
        f18546g = enumC5063l2;
        EnumC5063l2 enumC5063l22 = new EnumC5063l2("GROUP", 1);
        f18547h = enumC5063l22;
        EnumC5063l2 enumC5063l23 = new EnumC5063l2("OFFICIAL", 2);
        f18548i = enumC5063l23;
        f18549j = new EnumC5063l2[]{enumC5063l2, enumC5063l22, enumC5063l23};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5063l2 valueOf(String str) {
        return (EnumC5063l2) AbstractC2091b.m5160g(EnumC5063l2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5063l2[] values() {
        return (EnumC5063l2[]) f18549j.clone();
    }
}
