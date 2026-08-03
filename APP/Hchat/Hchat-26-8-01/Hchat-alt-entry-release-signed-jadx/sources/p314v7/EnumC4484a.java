package p314v7;

import bsh.org.objectweb.asm.Opcodes;
import okhttp3.internal.http2.Settings;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: v7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4484a {

    /* JADX INFO: renamed from: i */
    public static final EnumC4484a f14833i;

    /* JADX INFO: renamed from: j */
    public static final EnumC4484a f14834j;

    /* JADX INFO: renamed from: k */
    public static final EnumC4484a f14835k;

    /* JADX INFO: renamed from: l */
    public static final EnumC4484a f14836l;

    /* JADX INFO: renamed from: m */
    public static final EnumC4484a[] f14837m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumC4484a[] f14838n;

    /* JADX INFO: renamed from: g */
    public final int f14839g;

    /* JADX INFO: renamed from: h */
    public final EnumC4505k0[] f14840h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4484a EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4484a enumC4484a = new EnumC4484a("REFERENCE", 0, 1, new EnumC4505k0[]{EnumC4505k0.f14862i, EnumC4505k0.f14863j, EnumC4505k0.f14875v, EnumC4505k0.f14876w, EnumC4505k0.f14861h});
        EnumC4505k0 enumC4505k0 = EnumC4505k0.f14867n;
        EnumC4505k0 enumC4505k02 = EnumC4505k0.f14868o;
        EnumC4484a enumC4484a2 = new EnumC4484a("INTEGER", 1, 4, new EnumC4505k0[]{enumC4505k0, enumC4505k02});
        f14833i = enumC4484a2;
        EnumC4484a enumC4484a3 = new EnumC4484a("BOOL", 2, 8, new EnumC4505k0[]{EnumC4505k0.f14869p});
        EnumC4484a enumC4484a4 = new EnumC4484a("COLOR", 3, 16, new EnumC4505k0[]{EnumC4505k0.f14870q, EnumC4505k0.f14871r, EnumC4505k0.f14873t, EnumC4505k0.f14872s});
        EnumC4484a enumC4484a5 = new EnumC4484a("FLOAT", 4, 32, new EnumC4505k0[]{EnumC4505k0.f14864k});
        EnumC4484a enumC4484a6 = new EnumC4484a("DIMENSION", 5, 64, new EnumC4505k0[]{EnumC4505k0.f14865l});
        EnumC4484a enumC4484a7 = new EnumC4484a("FRACTION", 6, 128, new EnumC4505k0[]{EnumC4505k0.f14866m});
        EnumC4484a enumC4484a8 = new EnumC4484a("ANY", 7, Settings.DEFAULT_INITIAL_WINDOW_SIZE, (EnumC4505k0[]) EnumC4505k0.values().clone());
        f14834j = enumC4484a8;
        EnumC4484a enumC4484a9 = new EnumC4484a("ENUM", 8, 65536, new EnumC4505k0[]{enumC4505k0, enumC4505k02});
        f14835k = enumC4484a9;
        EnumC4484a enumC4484a10 = new EnumC4484a("FLAG", 9, Opcodes.ACC_DEPRECATED, new EnumC4505k0[]{enumC4505k02, enumC4505k0});
        f14836l = enumC4484a10;
        EnumC4484a enumC4484a11 = new EnumC4484a("STRING", 10, 2, new EnumC4505k0[]{EnumC4505k0.f14874u});
        f14838n = new EnumC4484a[]{enumC4484a, enumC4484a2, enumC4484a3, enumC4484a4, enumC4484a5, enumC4484a6, enumC4484a7, enumC4484a8, enumC4484a9, enumC4484a10, enumC4484a11};
        f14837m = new EnumC4484a[]{enumC4484a, enumC4484a11, enumC4484a2, enumC4484a3, enumC4484a4, enumC4484a5, enumC4484a6, enumC4484a7, enumC4484a8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC4484a(String str, int i9, int i10, EnumC4505k0[] enumC4505k0Arr) {
        this.f14839g = i10;
        this.f14840h = enumC4505k0Arr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4484a valueOf(String str) {
        return (EnumC4484a) Enum.valueOf(EnumC4484a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4484a[] values() {
        return (EnumC4484a[]) f14838n.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name().toLowerCase());
        sb2.append('{');
        int i9 = 0;
        while (true) {
            EnumC4505k0[] enumC4505k0Arr = this.f14840h;
            if (i9 >= enumC4505k0Arr.length) {
                sb2.append('}');
                return sb2.toString();
            }
            if (i9 != 0) {
                sb2.append(',');
            }
            sb2.append(enumC4505k0Arr[i9]);
            i9++;
        }
    }
}
