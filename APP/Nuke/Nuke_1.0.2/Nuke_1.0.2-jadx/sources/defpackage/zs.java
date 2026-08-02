package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zs {
    public static final zs h;
    public static final zs i;
    public static final zs j;
    public static final /* synthetic */ zs[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        zs zsVar = new zs("NONE", 0);
        h = zsVar;
        zs zsVar2 = new zs("ALL_JSON_OBJECTS", 1);
        i = zsVar2;
        zs zsVar3 = new zs("POLYMORPHIC", 2);
        j = zsVar3;
        k = new zs[]{zsVar, zsVar2, zsVar3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zs valueOf(String str) {
        return (zs) Enum.valueOf(zs.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zs[] values() {
        return (zs[]) k.clone();
    }
}
