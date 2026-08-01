package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: iq */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0347iq {
    private static final /* synthetic */ EnumC0347iq[] $VALUES;
    public static final C0270gq Companion;
    public static final EnumC0347iq ON_ANY;
    public static final EnumC0347iq ON_CREATE;
    public static final EnumC0347iq ON_DESTROY;
    public static final EnumC0347iq ON_PAUSE;
    public static final EnumC0347iq ON_RESUME;
    public static final EnumC0347iq ON_START;
    public static final EnumC0347iq ON_STOP;

    static {
        EnumC0347iq enumC0347iq = new EnumC0347iq("ON_CREATE", 0);
        ON_CREATE = enumC0347iq;
        EnumC0347iq enumC0347iq2 = new EnumC0347iq("ON_START", 1);
        ON_START = enumC0347iq2;
        EnumC0347iq enumC0347iq3 = new EnumC0347iq("ON_RESUME", 2);
        ON_RESUME = enumC0347iq3;
        EnumC0347iq enumC0347iq4 = new EnumC0347iq("ON_PAUSE", 3);
        ON_PAUSE = enumC0347iq4;
        EnumC0347iq enumC0347iq5 = new EnumC0347iq("ON_STOP", 4);
        ON_STOP = enumC0347iq5;
        EnumC0347iq enumC0347iq6 = new EnumC0347iq("ON_DESTROY", 5);
        ON_DESTROY = enumC0347iq6;
        EnumC0347iq enumC0347iq7 = new EnumC0347iq("ON_ANY", 6);
        ON_ANY = enumC0347iq7;
        $VALUES = new EnumC0347iq[]{enumC0347iq, enumC0347iq2, enumC0347iq3, enumC0347iq4, enumC0347iq5, enumC0347iq6, enumC0347iq7};
        Companion = new C0270gq();
    }

    public static EnumC0347iq valueOf(String str) {
        return (EnumC0347iq) Enum.valueOf(EnumC0347iq.class, str);
    }

    public static EnumC0347iq[] values() {
        return (EnumC0347iq[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0383jq m1517a() {
        switch (AbstractC0307hq.f2296a[ordinal()]) {
            case Base64.NO_PADDING /* 1 */:
            case Base64.NO_WRAP /* 2 */:
                return EnumC0383jq.f2658c;
            case 3:
            case 4:
                return EnumC0383jq.f2659d;
            case 5:
                return EnumC0383jq.f2660e;
            case 6:
                return EnumC0383jq.f2656a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
