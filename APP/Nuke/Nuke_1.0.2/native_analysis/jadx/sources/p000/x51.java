package p000;

import me.dartcv.nuke.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 {

    /* JADX INFO: renamed from: j */
    public static final i51 f12813j;

    /* JADX INFO: renamed from: k */
    public static final x51 f12814k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ x51[] f12815l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ yf0 f12816m;

    /* JADX INFO: renamed from: h */
    public final int f12817h;

    /* JADX INFO: renamed from: i */
    public final int f12818i;

    static {
        x51 x51Var = new x51("SYSTEM_DEFAULT", 0, 0, R.string.home_settings_language_system_default);
        f12814k = x51Var;
        x51[] x51VarArr = {x51Var, new x51("SIMPLIFIED_CHINESE", 1, 1, R.string.home_settings_language_simplified_chinese), new x51("TRADITIONAL_CHINESE", 2, 2, R.string.home_settings_language_traditional_chinese), new x51("ENGLISH", 3, 3, R.string.home_settings_language_english)};
        f12815l = x51VarArr;
        f12816m = new yf0(x51VarArr);
        f12813j = new i51(1);
    }

    public x51(String str, int i, int i2, int i3) {
        this.f12817h = i2;
        this.f12818i = i3;
    }

    public static x51 valueOf(String str) {
        return (x51) Enum.valueOf(x51.class, str);
    }

    public static x51[] values() {
        return (x51[]) f12815l.clone();
    }
}
