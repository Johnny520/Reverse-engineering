package p167l8;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2528c {

    /* JADX INFO: renamed from: g */
    public static final EnumC2528c f8168g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2528c f8169h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2528c f8170i;

    /* JADX INFO: renamed from: j */
    public static final EnumC2528c f8171j;

    /* JADX INFO: renamed from: k */
    public static final EnumC2528c f8172k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC2528c[] f8173l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2528c enumC2528c = new EnumC2528c("NONE", 0);
        f8168g = enumC2528c;
        EnumC2528c enumC2528c2 = new EnumC2528c("AT_ME", 1);
        f8169h = enumC2528c2;
        EnumC2528c enumC2528c3 = new EnumC2528c("AT_ALL", 2);
        f8170i = enumC2528c3;
        EnumC2528c enumC2528c4 = new EnumC2528c("ANNOUNCEMENT_ALL", 3);
        f8171j = enumC2528c4;
        EnumC2528c enumC2528c5 = new EnumC2528c("OTHERS", 4);
        f8172k = enumC2528c5;
        f8173l = new EnumC2528c[]{enumC2528c, enumC2528c2, enumC2528c3, enumC2528c4, enumC2528c5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2528c valueOf(String str) {
        return (EnumC2528c) AbstractC2091b.m5160g(EnumC2528c.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2528c[] values() {
        return (EnumC2528c[]) f8173l.clone();
    }
}
