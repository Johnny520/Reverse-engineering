package androidx.lifecycle;

import okio.C3193a;
import p385zf.C6143b;
import p385zf.InterfaceC6142a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0106k {
    private static final /* synthetic */ InterfaceC6142a $ENTRIES;
    private static final /* synthetic */ EnumC0106k[] $VALUES;
    public static final C0104i Companion;
    public static final EnumC0106k ON_ANY;
    public static final EnumC0106k ON_CREATE;
    public static final EnumC0106k ON_DESTROY;
    public static final EnumC0106k ON_PAUSE;
    public static final EnumC0106k ON_RESUME;
    public static final EnumC0106k ON_START;
    public static final EnumC0106k ON_STOP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0106k enumC0106k = new EnumC0106k("ON_CREATE", 0);
        ON_CREATE = enumC0106k;
        EnumC0106k enumC0106k2 = new EnumC0106k("ON_START", 1);
        ON_START = enumC0106k2;
        EnumC0106k enumC0106k3 = new EnumC0106k("ON_RESUME", 2);
        ON_RESUME = enumC0106k3;
        EnumC0106k enumC0106k4 = new EnumC0106k("ON_PAUSE", 3);
        ON_PAUSE = enumC0106k4;
        EnumC0106k enumC0106k5 = new EnumC0106k("ON_STOP", 4);
        ON_STOP = enumC0106k5;
        EnumC0106k enumC0106k6 = new EnumC0106k("ON_DESTROY", 5);
        ON_DESTROY = enumC0106k6;
        EnumC0106k enumC0106k7 = new EnumC0106k("ON_ANY", 6);
        ON_ANY = enumC0106k7;
        EnumC0106k[] enumC0106kArr = {enumC0106k, enumC0106k2, enumC0106k3, enumC0106k4, enumC0106k5, enumC0106k6, enumC0106k7};
        $VALUES = enumC0106kArr;
        $ENTRIES = new C6143b(enumC0106kArr);
        Companion = new C0104i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0106k valueOf(String str) {
        return (EnumC0106k) Enum.valueOf(EnumC0106k.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0106k[] values() {
        return (EnumC0106k[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final EnumC0107l m549a() {
        switch (AbstractC0105j.f288a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0107l.f291i;
            case 3:
            case 4:
                return EnumC0107l.f292j;
            case 5:
                return EnumC0107l.f293k;
            case 6:
                return EnumC0107l.f289g;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                C3193a.m6822k();
                return null;
        }
    }
}
