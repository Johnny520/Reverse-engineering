package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.hook.p005dy.utils.VideoReplace;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5745 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static String f1645;

    /* JADX INFO: renamed from: ۥ۟ */
    public static long f1646;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14226;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14227;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14228;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14229;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14230;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14231;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14232;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14233;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14234;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14235;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14236;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14237;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14238;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۤ$ۥ */
    public class C0856 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14239;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14240;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14241;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14242;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14243;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14244;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14245;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f14246;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f14247;

        public C0856(C3828 c3828) {
            this.f14247 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f14239;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-242070752377571989L);
                    f14239 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f14240;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-6158571617777574708L);
                    f14240 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f14241;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(8330621410826985291L);
                    f14241 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f14242;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(-2360099355932138065L);
                    f14242 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f14243;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(7891749377780555931L);
                    f14243 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f14244;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(430036651619547368L);
                    f14244 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f14245;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(2416961248027738745L);
                    f14245 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f14246;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(-5250813875248605926L);
                    f14246 = strM22678;
                    return strM22678;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ boolean m17806(MessageDialog messageDialog, View view) {
            VideoReplace.m31074(2);
            VideoReplace.m31076();
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ void m17807(Object obj, C3828 c3828) {
            try {
                String strYue_xin_awa = yue_xin_awa(1);
                Boolean bool = Boolean.TRUE;
                XposedHelpers.setAdditionalInstanceField(obj, strYue_xin_awa, bool);
                XposedHelpers.callMethod(obj, c3828.m878(), new Object[]{Long.valueOf(C5745.m2419()), C5745.m17800(), Boolean.FALSE, bool});
                C6334.m19807(yue_xin_awa(6), 2);
            } catch (Throwable th) {
                C6334.m19807(yue_xin_awa(7) + th, 1);
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m17808(final Object obj, final C3828 c3828, MessageDialog messageDialog, View view) {
            new Thread(new Runnable() { // from class: Yue.ۥۣۣ۠ۧ
                static {
                    NativeUtil.classesInit0(958);
                }

                @Override // java.lang.Runnable
                public final native void run();
            }).start();
            return false;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C6263.m2730()) {
                VideoReplace.f4197 = methodHookParam.thisObject;
                C5745.m17799(((Long) methodHookParam.args[0]).longValue());
                C5745.m17801((String) methodHookParam.args[1]);
                final Object obj = VideoReplace.f4197;
                if (XposedHelpers.getAdditionalInstanceField(obj, yue_xin_awa(1)) != null) {
                    XposedHelpers.removeAdditionalInstanceField(obj, yue_xin_awa(1));
                    return;
                }
                methodHookParam.setResult((Object) null);
                MessageDialog okButton = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3)).setOkButton(yue_xin_awa(4), new OnDialogButtonClickListener() { // from class: Yue.ۥۣ۠ۧۡ
                    static {
                        NativeUtil.classesInit0(954);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                });
                String strYue_xin_awa = yue_xin_awa(5);
                final C3828 c3828 = this.f14247;
                okButton.setCancelButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥۣ۠ۧۢ
                    static {
                        NativeUtil.classesInit0(956);
                    }

                    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                    public final native boolean onClick(BaseDialog baseDialog, View view);
                });
            }
        }
    }

    static {
        NativeUtil.classesInit0(959);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m2418(String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ long m2419();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ long m17799(long j);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m17800();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m17801(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private static native /* synthetic */ void m17802(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m17803(String str);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
