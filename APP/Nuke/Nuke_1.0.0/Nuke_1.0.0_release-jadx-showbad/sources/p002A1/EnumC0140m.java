package p002A1;

import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p089R2.C1227b;
import p089R2.InterfaceC1226a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A1.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0140m {
    private static final /* synthetic */ InterfaceC1226a $ENTRIES;
    private static final /* synthetic */ EnumC0140m[] $VALUES;
    public static final C0138k Companion;
    public static final EnumC0140m ON_ANY;
    public static final EnumC0140m ON_CREATE;
    public static final EnumC0140m ON_DESTROY;
    public static final EnumC0140m ON_PAUSE;
    public static final EnumC0140m ON_RESUME;
    public static final EnumC0140m ON_START;
    public static final EnumC0140m ON_STOP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0140m enumC0140m = new EnumC0140m("ON_CREATE", 0);
        ON_CREATE = enumC0140m;
        EnumC0140m enumC0140m2 = new EnumC0140m("ON_START", 1);
        ON_START = enumC0140m2;
        EnumC0140m enumC0140m3 = new EnumC0140m("ON_RESUME", 2);
        ON_RESUME = enumC0140m3;
        EnumC0140m enumC0140m4 = new EnumC0140m("ON_PAUSE", 3);
        ON_PAUSE = enumC0140m4;
        EnumC0140m enumC0140m5 = new EnumC0140m("ON_STOP", 4);
        ON_STOP = enumC0140m5;
        EnumC0140m enumC0140m6 = new EnumC0140m("ON_DESTROY", 5);
        ON_DESTROY = enumC0140m6;
        EnumC0140m enumC0140m7 = new EnumC0140m("ON_ANY", 6);
        ON_ANY = enumC0140m7;
        EnumC0140m[] enumC0140mArr = {enumC0140m, enumC0140m2, enumC0140m3, enumC0140m4, enumC0140m5, enumC0140m6, enumC0140m7};
        $VALUES = enumC0140mArr;
        $ENTRIES = new C1227b(enumC0140mArr);
        Companion = new C0138k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0140m valueOf(String str) {
        return (EnumC0140m) Enum.valueOf(EnumC0140m.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0140m[] values() {
        return (EnumC0140m[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final EnumC0141n m183a() {
        switch (AbstractC0139l.f530a[ordinal()]) {
            case BuildConfig.VERSION_CODE /* 1 */:
            case 2:
                return EnumC0141n.f533f;
            case 3:
            case 4:
                return EnumC0141n.f534g;
            case 5:
                return EnumC0141n.f535h;
            case 6:
                return EnumC0141n.f531d;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new C0330q();
        }
    }
}
