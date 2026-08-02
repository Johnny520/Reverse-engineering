package p000;

import me.dartcv.nuke.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0578pf {

    /* JADX INFO: renamed from: j */
    public static final C0953z8 f8291j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0578pf f8292k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC0578pf[] f8293l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ yf0 f8294m;

    /* JADX INFO: renamed from: h */
    public final int f8295h;

    /* JADX INFO: renamed from: i */
    public final int f8296i;

    static {
        EnumC0578pf enumC0578pf = new EnumC0578pf("SYSTEM_DEFAULT", 0, 0, R.string.home_settings_theme_system_default);
        f8292k = enumC0578pf;
        EnumC0578pf[] enumC0578pfArr = {enumC0578pf, new EnumC0578pf("LIGHT", 1, 1, R.string.home_settings_theme_light), new EnumC0578pf("DARK", 2, 2, R.string.home_settings_theme_dark)};
        f8293l = enumC0578pfArr;
        f8294m = new yf0(enumC0578pfArr);
        f8291j = new C0953z8(2);
    }

    public EnumC0578pf(String str, int i, int i2, int i3) {
        this.f8295h = i2;
        this.f8296i = i3;
    }

    public static EnumC0578pf valueOf(String str) {
        return (EnumC0578pf) Enum.valueOf(EnumC0578pf.class, str);
    }

    public static EnumC0578pf[] values() {
        return (EnumC0578pf[]) f8293l.clone();
    }
}
