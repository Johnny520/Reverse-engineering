package p104U3;

import me.dartcv.nuke.R;
import p089R2.C1227b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U3.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1477a {

    /* JADX INFO: renamed from: e */
    public static final EnumC1477a f5163e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1477a f5164f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1477a f5165g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1477a[] f5166h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ C1227b f5167i;

    /* JADX INFO: renamed from: d */
    public final int f5168d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1477a enumC1477a = new EnumC1477a(0, R.string.home_settings_hooker_chat, "CHAT");
        EnumC1477a enumC1477a2 = new EnumC1477a(1, R.string.home_settings_hooker_contact, "CONTACT");
        EnumC1477a enumC1477a3 = new EnumC1477a(2, R.string.home_settings_hooker_explore, "EXPLORE");
        EnumC1477a enumC1477a4 = new EnumC1477a(3, R.string.home_settings_hooker_beautify, "BEAUTIFY");
        EnumC1477a enumC1477a5 = new EnumC1477a(4, R.string.home_settings_hooker_simplify, "SIMPLIFY");
        EnumC1477a enumC1477a6 = new EnumC1477a(5, R.string.home_settings_hooker_amusement, "AMUSEMENT");
        f5163e = enumC1477a6;
        EnumC1477a enumC1477a7 = new EnumC1477a(6, R.string.home_settings_hooker_experimental, "EXPERIMENTAL");
        f5164f = enumC1477a7;
        EnumC1477a enumC1477a8 = new EnumC1477a(7, R.string.home_settings_hooker_module_settings_and_debug, "MODULE_SETTINGS_AND_DEBUG");
        f5165g = enumC1477a8;
        EnumC1477a[] enumC1477aArr = {enumC1477a, enumC1477a2, enumC1477a3, enumC1477a4, enumC1477a5, enumC1477a6, enumC1477a7, enumC1477a8};
        f5166h = enumC1477aArr;
        f5167i = new C1227b(enumC1477aArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC1477a(int i5, int i6, String str) {
        this.f5168d = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1477a valueOf(String str) {
        return (EnumC1477a) Enum.valueOf(EnumC1477a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1477a[] values() {
        return (EnumC1477a[]) f5166h.clone();
    }
}
