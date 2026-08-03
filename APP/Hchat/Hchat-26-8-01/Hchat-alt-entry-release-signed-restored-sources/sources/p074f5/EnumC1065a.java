package p074f5;

import bsh.org.objectweb.asm.Opcodes;
import java.util.HashMap;

/* JADX INFO: renamed from: f5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1065a {
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(1, "public", true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(2, "private", true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(4, "protected", true, true, true),
    STATIC(8, "static", true, true, true),
    FINAL(16, "final", true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    SYNCHRONIZED(32, "synchronized", false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    VOLATILE(64, "volatile", false, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    BRIDGE(64, "bridge", false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSIENT(128, "transient", false, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    VARARGS(128, "varargs", false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE(Opcodes.ACC_NATIVE, "native", false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    INTERFACE(Opcodes.ACC_INTERFACE, "interface", true, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(1024, "abstract", true, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    STRICTFP(Opcodes.ACC_STRICT, "strictfp", false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHETIC(4096, "synthetic", true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    ANNOTATION(8192, "annotation", true, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM(16384, "enum", true, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    CONSTRUCTOR(65536, "constructor", false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    DECLARED_SYNCHRONIZED(Opcodes.ACC_DEPRECATED, "declared-synchronized", false, true, false);


    /* JADX INFO: renamed from: n */
    public static final EnumC1065a[] f3413n;

    /* JADX INFO: renamed from: o */
    public static final HashMap f3414o;

    /* JADX INFO: renamed from: g */
    public final int f3416g;

    /* JADX INFO: renamed from: h */
    public final String f3417h;

    /* JADX INFO: renamed from: i */
    public final boolean f3418i;

    /* JADX INFO: renamed from: j */
    public final boolean f3419j;

    /* JADX INFO: renamed from: k */
    public final boolean f3420k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1065a[] enumC1065aArrValues = values();
        f3413n = enumC1065aArrValues;
        f3414o = new HashMap();
        for (EnumC1065a enumC1065a : enumC1065aArrValues) {
            f3414o.put(enumC1065a.f3417h, enumC1065a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC1065a(int i9, String str, boolean z9, boolean z10, boolean z11) {
        this.f3416g = i9;
        this.f3417h = str;
        this.f3418i = z9;
        this.f3419j = z10;
        this.f3420k = z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2688a(int i9) {
        return (i9 & this.f3416g) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return this.f3417h;
    }
}
