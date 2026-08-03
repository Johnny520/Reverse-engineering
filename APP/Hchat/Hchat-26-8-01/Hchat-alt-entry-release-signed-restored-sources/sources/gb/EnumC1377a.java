package gb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1377a {

    /* JADX INFO: renamed from: g */
    public static final EnumC1377a f4572g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1377a f4573h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1377a f4574i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1377a[] f4575j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1377a enumC1377a = new EnumC1377a("GET", 0);
        f4572g = enumC1377a;
        EnumC1377a enumC1377a2 = new EnumC1377a("POST", 1);
        f4573h = enumC1377a2;
        EnumC1377a enumC1377a3 = new EnumC1377a("DELETE", 2);
        f4574i = enumC1377a3;
        f4575j = new EnumC1377a[]{enumC1377a, enumC1377a2, enumC1377a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1377a valueOf(String str) {
        return (EnumC1377a) AbstractC2091b.m5160g(EnumC1377a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1377a[] values() {
        return (EnumC1377a[]) f4575j.clone();
    }
}
