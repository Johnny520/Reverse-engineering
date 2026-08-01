package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum iq extends Enum {
    private static final /* synthetic */ iq[] $VALUES = null;
    public static final gq Companion = null;
    public static final iq ON_ANY = null;
    public static final iq ON_CREATE = null;
    public static final iq ON_DESTROY = null;
    public static final iq ON_PAUSE = null;
    public static final iq ON_RESUME = null;
    public static final iq ON_START = null;
    public static final iq ON_STOP = null;

    static {
        iq r0 = new iq("ON_CREATE", 0);
        ON_CREATE = r0;
        iq r1 = new iq("ON_START", 1);
        ON_START = r1;
        iq r2 = new iq("ON_RESUME", 2);
        ON_RESUME = r2;
        iq r3 = new iq("ON_PAUSE", 3);
        ON_PAUSE = r3;
        iq r4 = new iq("ON_STOP", 4);
        ON_STOP = r4;
        iq r5 = new iq("ON_DESTROY", 5);
        ON_DESTROY = r5;
        iq r6 = new iq("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new iq[]{r0, r1, r2, r3, r4, r5, r6};
        Companion = new gq();
    }

    public static iq valueOf(String r1) {
        return (iq) Enum.valueOf(iq.class, r1);
    }

    public static iq[] values() {
        return (iq[]) $VALUES.clone();
    }

    public final jq a() {
        switch(hq.a[ordinal()]) {
            case 1: goto L13;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalArgumentException(this + " has no target state");
    L7:
        return jq.a;
    L9:
        return jq.e;
    L11:
        return jq.d;
    L13:
        return jq.c;
    }
}
