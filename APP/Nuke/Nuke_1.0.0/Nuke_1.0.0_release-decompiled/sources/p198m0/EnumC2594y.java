package p198m0;

import p027E4.C0330q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m0.y */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2594y {

    /* JADX INFO: renamed from: d */
    public static final EnumC2594y f8252d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2594y f8253e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2594y f8254f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC2594y[] f8255g;

    static {
        EnumC2594y enumC2594y = new EnumC2594y("Active", 0);
        f8252d = enumC2594y;
        EnumC2594y enumC2594y2 = new EnumC2594y("ActiveParent", 1);
        f8253e = enumC2594y2;
        EnumC2594y enumC2594y3 = new EnumC2594y("Captured", 2);
        EnumC2594y enumC2594y4 = new EnumC2594y("Inactive", 3);
        f8254f = enumC2594y4;
        f8255g = new EnumC2594y[]{enumC2594y, enumC2594y2, enumC2594y3, enumC2594y4};
    }

    public static EnumC2594y valueOf(String str) {
        return (EnumC2594y) Enum.valueOf(EnumC2594y.class, str);
    }

    public static EnumC2594y[] values() {
        return (EnumC2594y[]) f8255g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4540a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new C0330q();
            }
        }
        return true;
    }
}
