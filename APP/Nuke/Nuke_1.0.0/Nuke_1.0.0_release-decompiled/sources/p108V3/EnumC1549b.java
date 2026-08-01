package p108V3;

import me.dartcv.nuke.R;
import p002A1.C0115D;
import p089R2.C1227b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V3.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1549b {

    /* JADX INFO: renamed from: f */
    public static final C0115D f5388f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1549b f5389g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1549b[] f5390h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ C1227b f5391i;

    /* JADX INFO: renamed from: d */
    public final int f5392d;

    /* JADX INFO: renamed from: e */
    public final int f5393e;

    static {
        EnumC1549b enumC1549b = new EnumC1549b("SYSTEM_DEFAULT", 0, 0, R.string.home_settings_theme_system_default);
        f5389g = enumC1549b;
        EnumC1549b[] enumC1549bArr = {enumC1549b, new EnumC1549b("LIGHT", 1, 1, R.string.home_settings_theme_light), new EnumC1549b("DARK", 2, 2, R.string.home_settings_theme_dark)};
        f5390h = enumC1549bArr;
        f5391i = new C1227b(enumC1549bArr);
        f5388f = new C0115D(27);
    }

    public EnumC1549b(String str, int i5, int i6, int i7) {
        this.f5392d = i6;
        this.f5393e = i7;
    }

    public static EnumC1549b valueOf(String str) {
        return (EnumC1549b) Enum.valueOf(EnumC1549b.class, str);
    }

    public static EnumC1549b[] values() {
        return (EnumC1549b[]) f5390h.clone();
    }
}
