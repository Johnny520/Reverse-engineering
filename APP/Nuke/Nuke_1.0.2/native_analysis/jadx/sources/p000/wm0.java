package p000;

import me.dartcv.nuke.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 {

    /* JADX INFO: renamed from: i */
    public static final wm0 f12575i;

    /* JADX INFO: renamed from: j */
    public static final wm0 f12576j;

    /* JADX INFO: renamed from: k */
    public static final wm0 f12577k;

    /* JADX INFO: renamed from: l */
    public static final wm0 f12578l;

    /* JADX INFO: renamed from: m */
    public static final wm0 f12579m;

    /* JADX INFO: renamed from: n */
    public static final wm0 f12580n;

    /* JADX INFO: renamed from: o */
    public static final wm0 f12581o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ wm0[] f12582p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ yf0 f12583q;

    /* JADX INFO: renamed from: h */
    public final int f12584h;

    static {
        wm0 wm0Var = new wm0("CHAT", 0, R.string.home_settings_hooker_chat);
        f12575i = wm0Var;
        wm0 wm0Var2 = new wm0("CONTACT", 1, R.string.home_settings_hooker_contact);
        f12576j = wm0Var2;
        wm0 wm0Var3 = new wm0("EXPLORE", 2, R.string.home_settings_hooker_explore);
        f12577k = wm0Var3;
        wm0 wm0Var4 = new wm0("BEAUTIFY", 3, R.string.home_settings_hooker_beautify);
        f12578l = wm0Var4;
        wm0 wm0Var5 = new wm0("SIMPLIFY", 4, R.string.home_settings_hooker_simplify);
        wm0 wm0Var6 = new wm0("ENTERTAIN", 5, R.string.home_settings_hooker_entertain);
        f12579m = wm0Var6;
        wm0 wm0Var7 = new wm0("EXPERIMENTAL", 6, R.string.home_settings_hooker_experimental);
        f12580n = wm0Var7;
        wm0 wm0Var8 = new wm0("MODULE_SETTINGS_AND_DEBUG", 7, R.string.home_settings_hooker_module_settings_and_debug);
        f12581o = wm0Var8;
        wm0[] wm0VarArr = {wm0Var, wm0Var2, wm0Var3, wm0Var4, wm0Var5, wm0Var6, wm0Var7, wm0Var8};
        f12582p = wm0VarArr;
        f12583q = new yf0(wm0VarArr);
    }

    public wm0(String str, int i, int i2) {
        this.f12584h = i2;
    }

    public static wm0 valueOf(String str) {
        return (wm0) Enum.valueOf(wm0.class, str);
    }

    public static wm0[] values() {
        return (wm0[]) f12582p.clone();
    }
}
