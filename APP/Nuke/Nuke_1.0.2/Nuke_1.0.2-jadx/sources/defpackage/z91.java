package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z91 {
    private static final /* synthetic */ xf0 $ENTRIES;
    private static final /* synthetic */ z91[] $VALUES;
    public static final x91 Companion;
    public static final z91 ON_ANY;
    public static final z91 ON_CREATE;
    public static final z91 ON_DESTROY;
    public static final z91 ON_PAUSE;
    public static final z91 ON_RESUME;
    public static final z91 ON_START;
    public static final z91 ON_STOP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z91 z91Var = new z91("ON_CREATE", 0);
        ON_CREATE = z91Var;
        z91 z91Var2 = new z91("ON_START", 1);
        ON_START = z91Var2;
        z91 z91Var3 = new z91("ON_RESUME", 2);
        ON_RESUME = z91Var3;
        z91 z91Var4 = new z91("ON_PAUSE", 3);
        ON_PAUSE = z91Var4;
        z91 z91Var5 = new z91("ON_STOP", 4);
        ON_STOP = z91Var5;
        z91 z91Var6 = new z91("ON_DESTROY", 5);
        ON_DESTROY = z91Var6;
        z91 z91Var7 = new z91("ON_ANY", 6);
        ON_ANY = z91Var7;
        z91[] z91VarArr = {z91Var, z91Var2, z91Var3, z91Var4, z91Var5, z91Var6, z91Var7};
        $VALUES = z91VarArr;
        $ENTRIES = new yf0(z91VarArr);
        Companion = new x91();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static z91 valueOf(String str) {
        return (z91) Enum.valueOf(z91.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static z91[] values() {
        return (z91[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final aa1 a() {
        switch (y91.a[ordinal()]) {
            case 1:
            case 2:
                return aa1.j;
            case 3:
            case 4:
                return aa1.k;
            case 5:
                return aa1.l;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return aa1.h;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                c80.s();
                return null;
        }
    }
}
