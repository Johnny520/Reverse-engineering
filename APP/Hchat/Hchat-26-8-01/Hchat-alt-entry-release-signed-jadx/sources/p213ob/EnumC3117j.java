package p213ob;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ob.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3117j {

    /* JADX INFO: renamed from: g */
    public static final EnumC3117j f10099g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3117j f10100h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC3117j[] f10101i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3117j enumC3117j = new EnumC3117j("CHINESE", 0);
        f10099g = enumC3117j;
        EnumC3117j enumC3117j2 = new EnumC3117j("ENGLISH", 1);
        f10100h = enumC3117j2;
        f10101i = new EnumC3117j[]{enumC3117j, enumC3117j2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3117j valueOf(String str) {
        return (EnumC3117j) AbstractC2091b.m5160g(EnumC3117j.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3117j[] values() {
        return (EnumC3117j[]) f10101i.clone();
    }
}
