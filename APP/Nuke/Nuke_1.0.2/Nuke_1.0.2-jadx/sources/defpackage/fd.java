package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fd {
    public static final fd h;
    public static final fd i;
    public static final /* synthetic */ fd[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        fd fdVar = new fd("BoundReached", 0);
        h = fdVar;
        fd fdVar2 = new fd("Finished", 1);
        i = fdVar2;
        j = new fd[]{fdVar, fdVar2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fd valueOf(String str) {
        return (fd) Enum.valueOf(fd.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fd[] values() {
        return (fd[]) j.clone();
    }
}
