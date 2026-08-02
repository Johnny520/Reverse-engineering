package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class io2 {
    public static final io2 h;
    public static final io2 i;
    public static final io2 j;
    public static final io2 k;
    public static final io2 l;
    public static final io2 m;
    public static final io2 n;
    public static final io2 o;
    public static final io2 p;
    public static final io2 q;
    public static final io2 r;
    public static final io2 s;
    public static final io2 t;
    public static final /* synthetic */ io2[] u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        io2 io2Var = new io2("INVALID_TALKER", 0);
        h = io2Var;
        io2 io2Var2 = new io2("INVALID_CONTENT", 1);
        i = io2Var2;
        io2 io2Var3 = new io2("INVALID_PATH", 2);
        j = io2Var3;
        io2 io2Var4 = new io2("INVALID_DURATION", 3);
        k = io2Var4;
        io2 io2Var5 = new io2("FILE_NOT_FOUND", 4);
        l = io2Var5;
        io2 io2Var6 = new io2("FILE_NOT_READABLE", 5);
        m = io2Var6;
        io2 io2Var7 = new io2("FILE_IO_FAILED", 6);
        n = io2Var7;
        io2 io2Var8 = new io2("QUEUE_REJECTED", 7);
        o = io2Var8;
        io2 io2Var9 = new io2("VOICE_REGISTRATION_REJECTED", 8);
        p = io2Var9;
        io2 io2Var10 = new io2("SYSTEM_MSG_INSERT_FAILED", 9);
        q = io2Var10;
        io2 io2Var11 = new io2("NATIVE_LIBRARY_LOAD_FAILED", 10);
        r = io2Var11;
        io2 io2Var12 = new io2("REFLECTION_FAILED", 11);
        s = io2Var12;
        io2 io2Var13 = new io2("INTERNAL_FAILURE", 12);
        t = io2Var13;
        u = new io2[]{io2Var, io2Var2, io2Var3, io2Var4, io2Var5, io2Var6, io2Var7, io2Var8, io2Var9, io2Var10, io2Var11, io2Var12, io2Var13};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static io2 valueOf(String str) {
        return (io2) Enum.valueOf(io2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static io2[] values() {
        return (io2[]) u.clone();
    }
}
