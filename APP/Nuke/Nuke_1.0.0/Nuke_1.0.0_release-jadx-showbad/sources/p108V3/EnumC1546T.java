package p108V3;

import me.dartcv.nuke.R;
import p002A1.C0115D;
import p089R2.C1227b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V3.T */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1546T {

    /* JADX INFO: renamed from: f */
    public static final C0115D f5376f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1546T f5377g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1546T[] f5378h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ C1227b f5379i;

    /* JADX INFO: renamed from: d */
    public final int f5380d;

    /* JADX INFO: renamed from: e */
    public final int f5381e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1546T enumC1546T = new EnumC1546T("SYSTEM_DEFAULT", 0, 0, R.string.home_settings_language_system_default);
        f5377g = enumC1546T;
        EnumC1546T[] enumC1546TArr = {enumC1546T, new EnumC1546T("SIMPLIFIED_CHINESE", 1, 1, R.string.home_settings_language_simplified_chinese), new EnumC1546T("TRADITIONAL_CHINESE", 2, 2, R.string.home_settings_language_traditional_chinese), new EnumC1546T("ENGLISH", 3, 3, R.string.home_settings_language_english)};
        f5378h = enumC1546TArr;
        f5379i = new C1227b(enumC1546TArr);
        f5376f = new C0115D(28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC1546T(String str, int i5, int i6, int i7) {
        this.f5380d = i6;
        this.f5381e = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1546T valueOf(String str) {
        return (EnumC1546T) Enum.valueOf(EnumC1546T.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1546T[] values() {
        return (EnumC1546T[]) f5378h.clone();
    }
}
