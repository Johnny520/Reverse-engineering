package defpackage;

import me.dartcv.nuke.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 {
    public static final wm0 i;
    public static final wm0 j;
    public static final wm0 k;
    public static final wm0 l;
    public static final wm0 m;
    public static final wm0 n;
    public static final wm0 o;
    public static final /* synthetic */ wm0[] p;
    public static final /* synthetic */ yf0 q;
    public final int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        wm0 wm0Var = new wm0("CHAT", 0, R.string.home_settings_hooker_chat);
        i = wm0Var;
        wm0 wm0Var2 = new wm0("CONTACT", 1, R.string.home_settings_hooker_contact);
        j = wm0Var2;
        wm0 wm0Var3 = new wm0("EXPLORE", 2, R.string.home_settings_hooker_explore);
        k = wm0Var3;
        wm0 wm0Var4 = new wm0("BEAUTIFY", 3, R.string.home_settings_hooker_beautify);
        l = wm0Var4;
        wm0 wm0Var5 = new wm0("SIMPLIFY", 4, R.string.home_settings_hooker_simplify);
        wm0 wm0Var6 = new wm0("ENTERTAIN", 5, R.string.home_settings_hooker_entertain);
        m = wm0Var6;
        wm0 wm0Var7 = new wm0("EXPERIMENTAL", 6, R.string.home_settings_hooker_experimental);
        n = wm0Var7;
        wm0 wm0Var8 = new wm0("MODULE_SETTINGS_AND_DEBUG", 7, R.string.home_settings_hooker_module_settings_and_debug);
        o = wm0Var8;
        wm0[] wm0VarArr = {wm0Var, wm0Var2, wm0Var3, wm0Var4, wm0Var5, wm0Var6, wm0Var7, wm0Var8};
        p = wm0VarArr;
        q = new yf0(wm0VarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wm0(String str, int i2, int i3) {
        this.h = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wm0 valueOf(String str) {
        return (wm0) Enum.valueOf(wm0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wm0[] values() {
        return (wm0[]) p.clone();
    }
}
