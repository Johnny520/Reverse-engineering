package p080fb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fb.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1104b0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1104b0 f3555g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1104b0 f3556h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC1104b0[] f3557i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1104b0 enumC1104b0 = new EnumC1104b0("ERROR", 0);
        f3555g = enumC1104b0;
        EnumC1104b0 enumC1104b02 = new EnumC1104b0("WARNING", 1);
        f3556h = enumC1104b02;
        f3557i = new EnumC1104b0[]{enumC1104b0, enumC1104b02};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1104b0 valueOf(String str) {
        return (EnumC1104b0) AbstractC2091b.m5160g(EnumC1104b0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1104b0[] values() {
        return (EnumC1104b0[]) f3557i.clone();
    }
}
