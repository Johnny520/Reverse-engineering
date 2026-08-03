package p036c9;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c9.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0495v1 {

    /* JADX INFO: renamed from: g */
    public static final EnumC0495v1 f1506g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0495v1 f1507h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0495v1 f1508i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0495v1 f1509j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0495v1[] f1510k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0495v1 enumC0495v1 = new EnumC0495v1("REMOVE", 0);
        f1506g = enumC0495v1;
        EnumC0495v1 enumC0495v12 = new EnumC0495v1("MOVE", 1);
        f1507h = enumC0495v12;
        EnumC0495v1 enumC0495v13 = new EnumC0495v1("PIN", 2);
        f1508i = enumC0495v13;
        EnumC0495v1 enumC0495v14 = new EnumC0495v1("UNPIN", 3);
        f1509j = enumC0495v14;
        f1510k = new EnumC0495v1[]{enumC0495v1, enumC0495v12, enumC0495v13, enumC0495v14};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0495v1 valueOf(String str) {
        return (EnumC0495v1) AbstractC2091b.m5160g(EnumC0495v1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0495v1[] values() {
        return (EnumC0495v1[]) f1510k.clone();
    }
}
