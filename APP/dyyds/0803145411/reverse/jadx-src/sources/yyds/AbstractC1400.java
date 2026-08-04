package yyds;

import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛶᲀᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1400 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final int f6577;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final String[] f6579;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final String[] f6580;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final String f6582;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final String f6583;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final String[] f6584;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final String[] f6586 = {"ro.flyme.published", "ro.flyme.version.id"};

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final String[] f6578 = {"ro.smartisan.sa", "ro.smartisan.version"};

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final String[] f6585 = {"ro.letv.release.version", "ro.letv.release.version_date", "ro.product.letv_model", "ro.product.letv_name", "sys.letv.fmodelaid", "persist.sys.leui.bootreason", "ro.config.leui_ringtone_slot2", "ro.leui_oem_unlock_enable"};

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final String[] f6581 = {"ro.config.lgsi.fp.incremental", "ro.config.lgsi.os.version"};

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final String[] f6576 = {"ro.com.zui.version", "ro.zui.version.status", "ro.zui.hardware.displayid", "persist.radio.zui.feature", "ro.config.zuisdk.enabled"};

    /* JADX WARN: Removed duplicated region for block: B:110:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03aa A[PHI: r1
  0x03aa: PHI (r1v23 java.lang.String) = (r1v22 java.lang.String), (r1v22 java.lang.String), (r1v22 java.lang.String), (r1v39 java.lang.String) binds: [B:98:0x0339, B:100:0x0345, B:102:0x0351, B:124:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i;
        String str;
        String[] strArr = {"ro.miui.build.region", "ro.miui.region", "ro.vendor.miui.region"};
        f6579 = strArr;
        String[] strArr2 = {"ro.miui.ui.version.name", "ro.miui.ui.version.code"};
        f6580 = strArr;
        String[] strArr3 = {"ro.build.display.id", "ro.build.display.id.show", "persist.sys.oplus.ota_ver_display", "ro.build.version.oplusrom", "ro.build.version.oplusrom.confidential"};
        String[] strArr4 = {"ro.vivo.product.version", "ro.vivo.default.version", "ro.vivo.build.version.incremental", "ro.vivo.product.version.incremental", "ro.vivo.build.version", "ro.vivo.system.product.version", "ro.build.software.version"};
        String[] strArr5 = {"msc.config.magic.version", "ro.build.version.magic"};
        String[] strArr6 = {"ro.product.anco.devicetype", "ro.sys.anco.product.software.version", "ro.product.os.dist.anco.apiversion", "ro.product.os.dist.anco.releasetype"};
        String[] strArr7 = {"ro.honor.build.display.id", "persist.sys.hiview.base_version", "ro.comp.hl.product_base_version", "ro.build.display.id"};
        String[] strArr8 = {"ro.huawei.build.display.id", "ro.comp.hl.product_base_version", "persist.sys.hiview.base_version", "hw_sc.build.platform.version"};
        f6584 = strArr8;
        String[] strArr9 = {"ro.build.ohos.devicetype", "persist.sys.ohos.osd.cloud.switch"};
        if (AbstractC2408.m4446(new String[]{"ro.mi.os.version.name", "ro.mi.os.version.code", "ro.mi.os.version.incremental"})) {
            f6577 = -1248529104;
            f6583 = "HyperOS";
            f6582 = m2839("ro.mi.os.version.incremental");
        } else if (AbstractC2408.m4446(strArr2)) {
            f6577 = 2366768;
            f6583 = "MIUI";
            f6582 = m2839("ro.build.version.incremental");
        }
        String str2 = f6583;
        if (str2 == null) {
            String strM4448 = AbstractC2408.m4448("ro.build.version.realmeui");
            if (TextUtils.isEmpty(strM4448)) {
                if (TextUtils.isEmpty(AbstractC2408.m4448("ro.build.version.oplusrom"))) {
                    String strM44482 = AbstractC2408.m4448("ro.build.version.opporom");
                    if (!TextUtils.isEmpty(strM44482)) {
                        f6577 = -1680767897;
                        f6583 = "ColorOS";
                        f6582 = m2841(strM44482);
                    }
                } else {
                    f6577 = -1680767897;
                    f6583 = "ColorOS";
                    f6582 = m2839(strArr3);
                }
                str2 = "ColorOS";
            } else {
                f6577 = -859411254;
                str2 = "realmeUI";
                f6583 = "realmeUI";
                f6582 = m2841(strM4448);
            }
        }
        if (str2 == null) {
            String strM44483 = AbstractC2408.m4448("ro.vivo.os.build.display.id");
            if (!TextUtils.isEmpty(strM44483)) {
                if (strM44483.toLowerCase().contains("origin")) {
                    f6577 = 1443687338;
                    str2 = "OriginOS";
                    f6583 = "OriginOS";
                    f6582 = m2839(strArr4);
                } else if (strM44483.toLowerCase().contains("funtouch")) {
                    f6577 = -294058204;
                    str2 = "FuntouchOS";
                    f6583 = "FuntouchOS";
                    f6582 = m2839("ro.vivo.os.build.display.id");
                }
            }
        }
        if (str2 == null && AbstractC2408.m4446(strArr5)) {
            f6577 = -1801284559;
            str2 = "MagicOS";
            f6583 = "MagicOS";
            f6582 = m2839(strArr7);
        }
        if (str2 == null && AbstractC2408.m4446(strArr6)) {
            f6577 = -182666708;
            str2 = "HarmonyOS NEXT AndroidCompatible";
            f6583 = "HarmonyOS NEXT AndroidCompatible";
            f6582 = m2839("ro.sys.anco.product.software.version");
        }
        if (str2 == null && AbstractC2408.m4446(strArr9)) {
            f6577 = 1583864138;
            f6583 = "HarmonyOS";
            f6582 = m2839(strArr8);
            str2 = "HarmonyOS";
        }
        if (str2 == null) {
            String strM44484 = AbstractC2408.m4448("ro.build.version.emui");
            if (!TextUtils.isEmpty(strM44484) && strM44484.toLowerCase().contains("emotionui")) {
                f6577 = 2132284;
                str2 = "EMUI";
                f6583 = "EMUI";
                f6582 = m2841(strM44484);
            }
        }
        if (str2 == null) {
            String strM44485 = AbstractC2408.m4448("ro.build.version.oneui");
            if (!TextUtils.isEmpty(strM44485)) {
                f6577 = 76334938;
                f6583 = "OneUI";
                if (strM44485.matches("\\d+")) {
                    try {
                        f6582 = m2835(Integer.parseInt(strM44485));
                    } catch (Exception unused) {
                    }
                } else if (strM44485.matches("\\d+(?:\\.\\d+)+")) {
                    f6582 = strM44485;
                }
            }
            if (f6583 == null || TextUtils.isEmpty(f6582)) {
                try {
                    Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
                    declaredField.setAccessible(true);
                    int i2 = declaredField.getInt(null);
                    f6577 = 76334938;
                    f6583 = "OneUI";
                    if (i2 >= 90000) {
                        f6582 = m2835(i2 - 90000);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        String str3 = f6583;
        if (str3 == null) {
            String strM44486 = AbstractC2408.m4448("ro.oxygen.version");
            if (!TextUtils.isEmpty(strM44486)) {
                f6577 = -1363277916;
                str3 = "OxygenOS";
                f6583 = "OxygenOS";
                f6582 = m2841(strM44486);
            }
        }
        if (str3 == null) {
            String strM44487 = AbstractC2408.m4448("ro.rom.version");
            if (!TextUtils.isEmpty(strM44487)) {
                f6577 = 2195534;
                str3 = "H2OS";
                f6583 = "H2OS";
                f6582 = m2841(strM44487);
            }
        }
        if (str3 == null && AbstractC2408.m4446(f6586)) {
            f6577 = 67983659;
            str3 = "Flyme";
            f6583 = "Flyme";
            f6582 = m2839("ro.build.display.id");
        }
        String str4 = "RedMagicOS";
        if (str3 == null && !TextUtils.isEmpty(AbstractC2408.m4448("ro.build.MiFavor_version"))) {
            String strM44488 = AbstractC2408.m4448("ro.build.display.id");
            if (!TextUtils.isEmpty(strM44488)) {
                String lowerCase = strM44488.toLowerCase();
                if (lowerCase.contains("nebulaaios")) {
                    f6577 = -1668450325;
                    str3 = "NebulaAIOS";
                    f6583 = "NebulaAIOS";
                    f6582 = m2841(strM44488);
                } else if (lowerCase.contains("redmagicos")) {
                    f6577 = -417455456;
                    f6583 = "RedMagicOS";
                    f6582 = m2841(strM44488);
                    str3 = "RedMagicOS";
                } else if (lowerCase.contains("myos")) {
                    f6577 = 2412720;
                    str3 = "MyOS";
                    f6583 = "MyOS";
                    f6582 = m2841(strM44488);
                } else if (lowerCase.contains("zte")) {
                    f6577 = -203064298;
                    str3 = "MifavorUI";
                    f6583 = "MifavorUI";
                    f6582 = m2839("ro.build.MiFavor_version");
                }
            }
        }
        if (str3 == null) {
            String strM44489 = AbstractC2408.m4448("ro.build.nubia.rom.name");
            if (TextUtils.isEmpty(strM44489) || !strM44489.toLowerCase().contains("nubiaui")) {
                str4 = str3;
            } else {
                f6577 = -2010470489;
                str3 = "nubiaUI";
                f6583 = "nubiaUI";
                f6582 = m2839("ro.build.nubia.rom.code");
                String str5 = Build.VERSION.RELEASE;
                int i3 = -1;
                if (str5 == null || str5.isEmpty()) {
                    i = -1;
                    str = f6582;
                    if (str == null) {
                        str = "";
                    }
                    if (!str.isEmpty()) {
                        String[] strArrSplit = str.split("\\.");
                        if (strArrSplit.length != 0) {
                            try {
                                i3 = Integer.parseInt(strArrSplit[0]);
                            } catch (Exception unused3) {
                            }
                        }
                    }
                    if (i - i3 < 5) {
                        f6577 = -417455456;
                        f6583 = "RedMagicOS";
                    }
                } else {
                    String[] strArrSplit2 = str5.split("\\.");
                    if (strArrSplit2.length != 0) {
                        try {
                            i = Integer.parseInt(strArrSplit2[0]);
                        } catch (Exception unused4) {
                            i = -1;
                        }
                        str = f6582;
                        if (str == null) {
                        }
                        if (!str.isEmpty()) {
                        }
                        if (i - i3 < 5) {
                        }
                    }
                }
            }
        }
        if (str4 == null) {
            String strM444810 = AbstractC2408.m4448("ro.config.lgsi.os.name");
            if (!TextUtils.isEmpty(strM444810) && strM444810.toLowerCase().contains("zuxos")) {
                f6577 = 85736225;
                str4 = "ZUXOS";
                f6583 = "ZUXOS";
                f6582 = m2839(f6581);
            } else if (AbstractC2408.m4446(f6576)) {
                f6577 = 89198;
                str4 = "ZUI";
                f6583 = "ZUI";
                f6582 = m2839("ro.com.zui.version");
            }
        }
        if (str4 == null && !TextUtils.isEmpty(AbstractC2408.m4448("ro.asus.rog"))) {
            f6577 = 78153150;
            str4 = "ROGUI";
            f6583 = "ROGUI";
            f6582 = m2839("ro.build.version.incremental");
        }
        if (str4 == null && AbstractC2408.m4446(f6578)) {
            f6577 = 1805724132;
            str4 = "SmartisanOS";
            f6583 = "SmartisanOS";
            f6582 = m2839("ro.smartisan.version");
        }
        if (str4 == null && AbstractC2408.m4446(f6585)) {
            f6577 = 69017;
            str4 = "EUI";
            f6583 = "EUI";
            f6582 = m2839("ro.letv.release.version");
        }
        if (str4 == null) {
            String strM444811 = AbstractC2408.m4448("ro.build.uiversion");
            if (!TextUtils.isEmpty(strM444811) && strM444811.toLowerCase().contains("360ui")) {
                f6577 = 48757121;
                str4 = "360UI";
                f6583 = "360UI";
                f6582 = m2841(strM444811);
            }
        }
        if (str4 == null) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                Method method = cls.getMethod("getOsBrand", null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(cls, null);
                if (objInvoke != null && String.valueOf(objInvoke).toLowerCase().contains("harmony")) {
                    f6577 = 1583864138;
                    f6583 = "HarmonyOS";
                    f6582 = m2839(f6584);
                }
            } catch (Exception unused5) {
            }
        }
        if (f6583 == null) {
            f6583 = "";
        }
        if (f6582 == null) {
            f6582 = "";
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean m2834() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return Boolean.parseBoolean(String.valueOf(cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, "persist.sys.miui_optimization", Boolean.valueOf(!"1".equals(String.valueOf(cls.getMethod("get", String.class, String.class).invoke(cls, "ro.miui.cts", "")))))));
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static String m2835(int i) {
        int i2 = i / 10000;
        int i3 = i % 10000;
        int i4 = i % 100;
        if (i4 <= 0) {
            return i2 + "." + (i3 / 100);
        }
        return i2 + "." + (i3 / 100) + "." + i4;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static int m2836(String str) {
        String strGroup;
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0 || (strGroup = matcher.group(1)) == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strGroup);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m2837(String str) {
        String strGroup;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile("(\\d+(?:\\.\\d+)+)").matcher(str);
        return (!matcher.find() || matcher.groupCount() <= 0 || (strGroup = matcher.group(1)) == null) ? "" : strGroup;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static boolean m2838() {
        if (f6577 == 2366768) {
            String[] strArr = new String[3];
            for (int i = 0; i < 3; i++) {
                strArr[i] = AbstractC2408.m4448(f6580[i]);
            }
            for (int i2 = 0; i2 < 3; i2++) {
                if (strArr[i2].equalsIgnoreCase("cn")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static String m2839(String... strArr) {
        for (String str : strArr) {
            String strM2837 = m2837(AbstractC2408.m4448(str));
            if (!TextUtils.isEmpty(strM2837)) {
                return strM2837;
            }
        }
        for (String str2 : strArr) {
            int iM2836 = m2836(AbstractC2408.m4448(str2));
            if (iM2836 > 0) {
                return iM2836 + ".0";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static boolean m2840() {
        if (f6577 == -1248529104) {
            String[] strArr = new String[3];
            for (int i = 0; i < 3; i++) {
                strArr[i] = AbstractC2408.m4448(f6579[i]);
            }
            for (int i2 = 0; i2 < 3; i2++) {
                if (strArr[i2].equalsIgnoreCase("cn")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m2841(String str) {
        String strM2837 = m2837(str);
        if (!TextUtils.isEmpty(strM2837)) {
            return strM2837;
        }
        int iM2836 = m2836(str);
        if (iM2836 <= 0) {
            return "";
        }
        return iM2836 + ".0";
    }
}
