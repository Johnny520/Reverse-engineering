package p332wb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.l5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5066l5 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5066l5 f18552g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5066l5 f18553h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5066l5 f18554i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC5066l5[] f18555j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5066l5 enumC5066l5 = new EnumC5066l5("FRIEND", 0);
        f18552g = enumC5066l5;
        EnumC5066l5 enumC5066l52 = new EnumC5066l5("GROUP", 1);
        f18553h = enumC5066l52;
        EnumC5066l5 enumC5066l53 = new EnumC5066l5("OFFICIAL", 2);
        f18554i = enumC5066l53;
        f18555j = new EnumC5066l5[]{enumC5066l5, enumC5066l52, enumC5066l53};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5066l5 valueOf(String str) {
        return (EnumC5066l5) AbstractC2091b.m5160g(EnumC5066l5.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5066l5[] values() {
        return (EnumC5066l5[]) f18555j.clone();
    }
}
