package p080fb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fb.u2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1182u2 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1182u2 f3972g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1182u2 f3973h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1182u2 f3974i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1182u2[] f3975j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1182u2 enumC1182u2 = new EnumC1182u2("CANCEL", 0);
        f3972g = enumC1182u2;
        EnumC1182u2 enumC1182u22 = new EnumC1182u2("APPROVE_ONCE", 1);
        f3973h = enumC1182u22;
        EnumC1182u2 enumC1182u23 = new EnumC1182u2("ALWAYS_ALLOW", 2);
        f3974i = enumC1182u23;
        f3975j = new EnumC1182u2[]{enumC1182u2, enumC1182u22, enumC1182u23};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1182u2 valueOf(String str) {
        return (EnumC1182u2) AbstractC2091b.m5160g(EnumC1182u2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1182u2[] values() {
        return (EnumC1182u2[]) f3975j.clone();
    }
}
