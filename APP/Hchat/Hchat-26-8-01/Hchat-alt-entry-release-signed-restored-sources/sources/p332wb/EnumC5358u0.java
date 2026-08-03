package p332wb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5358u0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5358u0 f20978g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5358u0 f20979h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5358u0 f20980i;

    /* JADX INFO: renamed from: j */
    public static final EnumC5358u0 f20981j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC5358u0[] f20982k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5358u0 enumC5358u0 = new EnumC5358u0("FRIENDS", 0);
        f20978g = enumC5358u0;
        EnumC5358u0 enumC5358u02 = new EnumC5358u0("GROUPS", 1);
        f20979h = enumC5358u02;
        EnumC5358u0 enumC5358u03 = new EnumC5358u0("BOTH", 2);
        f20980i = enumC5358u03;
        EnumC5358u0 enumC5358u04 = new EnumC5358u0("ALL_CHATS", 3);
        f20981j = enumC5358u04;
        f20982k = new EnumC5358u0[]{enumC5358u0, enumC5358u02, enumC5358u03, enumC5358u04};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5358u0 valueOf(String str) {
        return (EnumC5358u0) AbstractC2091b.m5160g(EnumC5358u0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5358u0[] values() {
        return (EnumC5358u0[]) f20982k.clone();
    }
}
