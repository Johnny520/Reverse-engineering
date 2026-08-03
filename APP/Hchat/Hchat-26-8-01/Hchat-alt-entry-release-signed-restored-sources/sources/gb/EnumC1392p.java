package gb;

import p003a2.C0014a;
import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gb.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1392p {

    /* JADX INFO: renamed from: g */
    public static final C0014a f4629g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1392p f4630h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1392p f4631i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1392p[] f4632j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1392p enumC1392p = new EnumC1392p("PENDING", 0);
        f4630h = enumC1392p;
        EnumC1392p enumC1392p2 = new EnumC1392p("APPROVED", 1);
        f4631i = enumC1392p2;
        f4632j = new EnumC1392p[]{enumC1392p, enumC1392p2};
        f4629g = new C0014a(16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1392p valueOf(String str) {
        return (EnumC1392p) AbstractC2091b.m5160g(EnumC1392p.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1392p[] values() {
        return (EnumC1392p[]) f4632j.clone();
    }
}
