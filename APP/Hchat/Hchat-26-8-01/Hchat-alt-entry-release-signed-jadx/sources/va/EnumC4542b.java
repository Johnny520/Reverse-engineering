package va;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: va.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4542b {

    /* JADX INFO: renamed from: g */
    public static final EnumC4542b f14991g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4542b f14992h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC4542b[] f14993i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4542b enumC4542b = new EnumC4542b("CONTACT", 0);
        f14991g = enumC4542b;
        EnumC4542b enumC4542b2 = new EnumC4542b("CHATROOM", 1);
        f14992h = enumC4542b2;
        f14993i = new EnumC4542b[]{enumC4542b, enumC4542b2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4542b valueOf(String str) {
        return (EnumC4542b) AbstractC2091b.m5160g(EnumC4542b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4542b[] values() {
        return (EnumC4542b[]) f14993i.clone();
    }
}
