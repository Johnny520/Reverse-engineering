package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mq */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0494mq {
    private static final /* synthetic */ EnumC0494mq[] $VALUES;
    public static final C0420kq Companion;
    public static final EnumC0494mq ON_ANY;
    public static final EnumC0494mq ON_CREATE;
    public static final EnumC0494mq ON_DESTROY;
    public static final EnumC0494mq ON_PAUSE;
    public static final EnumC0494mq ON_RESUME;
    public static final EnumC0494mq ON_START;
    public static final EnumC0494mq ON_STOP;

    static {
        EnumC0494mq enumC0494mq = new EnumC0494mq("ON_CREATE", 0);
        ON_CREATE = enumC0494mq;
        EnumC0494mq enumC0494mq2 = new EnumC0494mq("ON_START", 1);
        ON_START = enumC0494mq2;
        EnumC0494mq enumC0494mq3 = new EnumC0494mq("ON_RESUME", 2);
        ON_RESUME = enumC0494mq3;
        EnumC0494mq enumC0494mq4 = new EnumC0494mq("ON_PAUSE", 3);
        ON_PAUSE = enumC0494mq4;
        EnumC0494mq enumC0494mq5 = new EnumC0494mq("ON_STOP", 4);
        ON_STOP = enumC0494mq5;
        EnumC0494mq enumC0494mq6 = new EnumC0494mq("ON_DESTROY", 5);
        ON_DESTROY = enumC0494mq6;
        EnumC0494mq enumC0494mq7 = new EnumC0494mq("ON_ANY", 6);
        ON_ANY = enumC0494mq7;
        $VALUES = new EnumC0494mq[]{enumC0494mq, enumC0494mq2, enumC0494mq3, enumC0494mq4, enumC0494mq5, enumC0494mq6, enumC0494mq7};
        Companion = new C0420kq();
    }

    public static EnumC0494mq valueOf(String str) {
        return (EnumC0494mq) Enum.valueOf(EnumC0494mq.class, str);
    }

    public static EnumC0494mq[] values() {
        return (EnumC0494mq[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC0531nq m1879a() {
        switch (AbstractC0457lq.f3039a[ordinal()]) {
            case Base64.NO_PADDING /* 1 */:
            case Base64.NO_WRAP /* 2 */:
                return EnumC0531nq.f3331c;
            case 3:
            case 4:
                return EnumC0531nq.f3332d;
            case 5:
                return EnumC0531nq.f3333e;
            case 6:
                return EnumC0531nq.f3329a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
