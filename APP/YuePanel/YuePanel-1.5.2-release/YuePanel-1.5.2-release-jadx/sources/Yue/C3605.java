package Yue;

import Yue.InterfaceC7144;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3605 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3605 f407 = new C3605();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC3811(extension = 30)
    @InterfaceC5568
    public static final int f408;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC3811(extension = 31)
    @InterfaceC5568
    public static final int f6224;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC3811(extension = 33)
    @InterfaceC5568
    public static final int f6225;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC3811(extension = 1000000)
    @InterfaceC5568
    public static final int f6226;

    /* JADX INFO: renamed from: Yue.ۥۣۣ۟ۡ$ۥ */
    @InterfaceC7113(30)
    public static final class C0194 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0194 f409 = new C0194();

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public final int m653(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣ۟ۡ$ۥ۟ */
    @InterfaceC7157(EnumC3259.f5012)
    @Retention(RetentionPolicy.CLASS)
    @InterfaceC7117
    public @interface InterfaceC0195 {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f408 = i >= 30 ? C0194.f409.m653(30) : 0;
        f6224 = i >= 30 ? C0194.f409.m653(31) : 0;
        f6225 = i >= 30 ? C0194.f409.m653(33) : 0;
        f6226 = i >= 30 ? C0194.f409.m653(1000000) : 0;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 24)
    @InterfaceC4372(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m651() {
        return true;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 25)
    @InterfaceC4372(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m652() {
        return true;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 26)
    @InterfaceC4372(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m9714() {
        return true;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 27)
    @InterfaceC4372(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m9715() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 28)
    @InterfaceC4372(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m9716() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8392
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m9717(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(str, "codename");
        C5499.m17103(str2, "buildCodename");
        if (C5499.m17094("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        C5499.m17102(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        C5499.m17102(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 29)
    @InterfaceC4372(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m9718() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 30)
    @InterfaceC4372(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m9719() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 31, codename = C4750.f10490)
    @InterfaceC4372(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m9720() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                C5499.m17102(str, "CODENAME");
                if (m9717(C4750.f10490, str)) {
                }
            }
            return false;
        }
        return true;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 32, codename = "Sv2")
    @InterfaceC4372(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m9721() {
        int i = Build.VERSION.SDK_INT;
        if (i < 32) {
            if (i >= 31) {
                String str = Build.VERSION.CODENAME;
                C5499.m17102(str, "CODENAME");
                if (m9717("Sv2", str)) {
                }
            }
            return false;
        }
        return true;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 33, codename = "Tiramisu")
    @InterfaceC4372(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m9722() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                C5499.m17102(str, "CODENAME");
                if (m9717("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    @InterfaceC5578
    @InterfaceC3811(api = 34, codename = "UpsideDownCake")
    @InterfaceC4372(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @InterfaceC7097(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m9723() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                C5499.m17102(str, "CODENAME");
                if (m9717("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }

    @InterfaceC5578
    @InterfaceC3811(codename = "VanillaIceCream")
    @InterfaceC0195
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m9724() {
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            C5499.m17102(str, "CODENAME");
            if (m9717("VanillaIceCream", str)) {
                return true;
            }
        }
        return false;
    }
}
