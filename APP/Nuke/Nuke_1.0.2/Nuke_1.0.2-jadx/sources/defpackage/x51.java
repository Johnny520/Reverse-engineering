package defpackage;

import me.dartcv.nuke.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 {
    public static final i51 j;
    public static final x51 k;
    public static final /* synthetic */ x51[] l;
    public static final /* synthetic */ yf0 m;
    public final int h;
    public final int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        x51 x51Var = new x51("SYSTEM_DEFAULT", 0, 0, R.string.home_settings_language_system_default);
        k = x51Var;
        x51[] x51VarArr = {x51Var, new x51("SIMPLIFIED_CHINESE", 1, 1, R.string.home_settings_language_simplified_chinese), new x51("TRADITIONAL_CHINESE", 2, 2, R.string.home_settings_language_traditional_chinese), new x51("ENGLISH", 3, 3, R.string.home_settings_language_english)};
        l = x51VarArr;
        m = new yf0(x51VarArr);
        j = new i51(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x51(String str, int i, int i2, int i3) {
        this.h = i2;
        this.i = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x51 valueOf(String str) {
        return (x51) Enum.valueOf(x51.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x51[] values() {
        return (x51[]) l.clone();
    }
}
