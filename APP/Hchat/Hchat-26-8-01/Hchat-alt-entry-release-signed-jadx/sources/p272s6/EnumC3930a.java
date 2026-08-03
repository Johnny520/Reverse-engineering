package p272s6;

import bsh.org.objectweb.asm.Opcodes;
import p162l3.C2469w;
import p385zf.C6143b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3930a {

    /* JADX INFO: renamed from: h */
    public static final C2469w f12907h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC3930a[] f12908i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ C6143b f12909j;

    /* JADX INFO: renamed from: g */
    public final int f12910g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3930a[] enumC3930aArr = {new EnumC3930a("PUBLIC", 0, 1), new EnumC3930a("PRIVATE", 1, 2), new EnumC3930a("PROTECTED", 2, 4), new EnumC3930a("STATIC", 3, 8), new EnumC3930a("FINAL", 4, 16), new EnumC3930a("SYNCHRONIZED", 5, 32), new EnumC3930a("VOLATILE", 6, 64), new EnumC3930a("TRANSIENT", 7, 128), new EnumC3930a("NATIVE", 8, Opcodes.ACC_NATIVE), new EnumC3930a("INTERFACE", 9, Opcodes.ACC_INTERFACE), new EnumC3930a("ABSTRACT", 10, 1024), new EnumC3930a("STRICT", 11, Opcodes.ACC_STRICT)};
        f12908i = enumC3930aArr;
        f12909j = new C6143b(enumC3930aArr);
        f12907h = new C2469w(22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC3930a(String str, int i9, int i10) {
        this.f12910g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3930a valueOf(String str) {
        return (EnumC3930a) Enum.valueOf(EnumC3930a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3930a[] values() {
        return (EnumC3930a[]) f12908i.clone();
    }
}
