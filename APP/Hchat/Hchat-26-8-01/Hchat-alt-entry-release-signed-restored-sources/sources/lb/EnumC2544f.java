package lb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2544f {

    /* JADX INFO: renamed from: g */
    public static final EnumC2544f f8233g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2544f f8234h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2544f f8235i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC2544f[] f8236j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2544f enumC2544f = new EnumC2544f("NONE", 0);
        f8233g = enumC2544f;
        EnumC2544f enumC2544f2 = new EnumC2544f("LEFT_QUOTE", 1);
        f8234h = enumC2544f2;
        EnumC2544f enumC2544f3 = new EnumC2544f("RIGHT_REPEAT", 2);
        f8235i = enumC2544f3;
        f8236j = new EnumC2544f[]{enumC2544f, enumC2544f2, enumC2544f3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2544f valueOf(String str) {
        return (EnumC2544f) AbstractC2091b.m5160g(EnumC2544f.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2544f[] values() {
        return (EnumC2544f[]) f8236j.clone();
    }
}
