package Yue;

import Yue.C4017;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import com.yuexin.panel.utils.entity.comment.CommentBean;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3984 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static String f595;

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f596;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7874;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7875;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7876;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7877;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7878;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7879;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7880;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7881;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7882;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7883;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7884;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7885;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7886;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7887;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7888;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7889;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7890;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7891;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۨ۟$ۥ */
    public class C0300 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7892;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7893;

        public C0300() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7892;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(1816583850138066058L);
                f7892 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f7893;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(1695244079972708531L);
            f7893 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                C3984.m11294((String) methodHookParam.getResult());
                if (!C3984.m11295() && C3984.m958() != null) {
                    JSONObject jSONObject = (JSONObject) C4093.m11560(yue_xin_awa(0));
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put(yue_xin_awa(1), C3984.m958());
                    C4093.m11566(yue_xin_awa(0), jSONObject);
                }
                C3984.m11296(true);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۨ۟$ۥ۟ */
    public class C0301 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7895;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7896;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7897;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7898;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7899;

        public C0301() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7895;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(6604043061875283843L);
                f7895 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f7896;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(7664433434686301882L);
                f7896 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f7897;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-4271772435069853515L);
                f7897 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f7898;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(3562712807087976065L);
                f7898 = strM22674;
                return strM22674;
            }
            if (i != 4) {
                return null;
            }
            String str5 = f7899;
            if (str5 != null) {
                return str5;
            }
            String strM22675 = C5523.m2267(7564858190224942417L);
            f7899 = strM22675;
            return strM22675;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                if (C4093.m11556(yue_xin_awa(0))) {
                    Object objectField = XposedHelpers.getObjectField(methodHookParam.args[0], yue_xin_awa(1));
                    if (objectField == null) {
                        C6334.m19811(yue_xin_awa(3));
                        return;
                    }
                    C6322 c6322M11327 = C4017.m11327(objectField);
                    if (c6322M11327 == null) {
                        C6334.m19808(yue_xin_awa(2), 1);
                        return;
                    }
                    C4017.C0307 c0307M2787 = c6322M11327.m2787();
                    int i = c6322M11327.m19710() != null ? 8 : (c0307M2787.m979().isEmpty() && c0307M2787.m11355().isEmpty() && c0307M2787.m980().isEmpty()) ? 1 : !c6322M11327.m19718().isEmpty() ? 7 : 999;
                    CommentBean commentBean = new CommentBean();
                    commentBean.setCid(c6322M11327.m19715());
                    commentBean.setContent_type(i);
                    commentBean.setSend_name(C6263.m19268());
                    commentBean.setAweme_id(c6322M11327.m19714());
                    commentBean.setText(c6322M11327.m19718());
                    commentBean.setStatus(c6322M11327.m19721());
                    commentBean.setTime(c6322M11327.m19722());
                    commentBean.setSend_uid(c6322M11327.m19723());
                    C3990.m11303(commentBean);
                }
            } catch (Throwable th) {
                C6334.m19808(yue_xin_awa(4) + th.getMessage(), 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(544);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m957(JSONObject jSONObject, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ String m958();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ String m11294(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11295();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11296(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11297(JSONObject jSONObject, MessageMenu messageMenu, CharSequence charSequence, int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final native void m11298(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m11299(C3828 c3828, ClassLoader classLoader);
}
