package defpackage;

import me.dartcv.nuke.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pf {
    public static final z8 j;
    public static final pf k;
    public static final /* synthetic */ pf[] l;
    public static final /* synthetic */ yf0 m;
    public final int h;
    public final int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        pf pfVar = new pf("SYSTEM_DEFAULT", 0, 0, R.string.home_settings_theme_system_default);
        k = pfVar;
        pf[] pfVarArr = {pfVar, new pf("LIGHT", 1, 1, R.string.home_settings_theme_light), new pf("DARK", 2, 2, R.string.home_settings_theme_dark)};
        l = pfVarArr;
        m = new yf0(pfVarArr);
        j = new z8(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pf(String str, int i, int i2, int i3) {
        this.h = i2;
        this.i = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pf valueOf(String str) {
        return (pf) Enum.valueOf(pf.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pf[] values() {
        return (pf[]) l.clone();
    }
}
