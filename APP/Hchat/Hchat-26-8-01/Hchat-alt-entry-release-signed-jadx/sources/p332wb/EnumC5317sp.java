package p332wb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.sp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5317sp {

    /* JADX INFO: renamed from: g */
    public static final EnumC5317sp f20705g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5317sp f20706h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5317sp f20707i;

    /* JADX INFO: renamed from: j */
    public static final EnumC5317sp f20708j;

    /* JADX INFO: renamed from: k */
    public static final EnumC5317sp f20709k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC5317sp[] f20710l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5317sp enumC5317sp = new EnumC5317sp("QUEUED", 0);
        f20705g = enumC5317sp;
        EnumC5317sp enumC5317sp2 = new EnumC5317sp("UPLOADING", 1);
        f20706h = enumC5317sp2;
        EnumC5317sp enumC5317sp3 = new EnumC5317sp("SUCCESS", 2);
        f20707i = enumC5317sp3;
        EnumC5317sp enumC5317sp4 = new EnumC5317sp("PENDING_REVIEW", 3);
        f20708j = enumC5317sp4;
        EnumC5317sp enumC5317sp5 = new EnumC5317sp("FAILED", 4);
        f20709k = enumC5317sp5;
        f20710l = new EnumC5317sp[]{enumC5317sp, enumC5317sp2, enumC5317sp3, enumC5317sp4, enumC5317sp5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5317sp valueOf(String str) {
        return (EnumC5317sp) AbstractC2091b.m5160g(EnumC5317sp.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5317sp[] values() {
        return (EnumC5317sp[]) f20710l.clone();
    }
}
