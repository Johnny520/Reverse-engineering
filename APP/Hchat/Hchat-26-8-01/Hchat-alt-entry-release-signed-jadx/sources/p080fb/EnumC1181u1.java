package p080fb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fb.u1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1181u1 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1181u1 f3968g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1181u1 f3969h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1181u1 f3970i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1181u1[] f3971j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1181u1 enumC1181u1 = new EnumC1181u1("EQUAL", 0);
        f3968g = enumC1181u1;
        EnumC1181u1 enumC1181u12 = new EnumC1181u1("DELETE", 1);
        f3969h = enumC1181u12;
        EnumC1181u1 enumC1181u13 = new EnumC1181u1("ADD", 2);
        f3970i = enumC1181u13;
        f3971j = new EnumC1181u1[]{enumC1181u1, enumC1181u12, enumC1181u13};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1181u1 valueOf(String str) {
        return (EnumC1181u1) AbstractC2091b.m5160g(EnumC1181u1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1181u1[] values() {
        return (EnumC1181u1[]) f3971j.clone();
    }
}
