package Yue;

import android.view.View;
import android.widget.LinearLayout;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4461 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f908;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f909;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9317;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9318;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9319;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9320;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9321;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9322;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9323;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9324;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9325;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9326;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9327;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9328;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9329;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9330;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9331;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9332;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9333;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9334;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9335;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9336;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9337;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9338;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9339;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9340;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9341;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9342;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9343;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9344;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9345;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9346;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9347;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9348;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9349;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۥۨ$ۥ */
    public class C0411 extends XC_MethodHook {
        public C0411() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4461.this.m12943(methodHookParam);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۥۨ$ۥ۟ */
    public class C0412 extends XC_MethodHook {
        public C0412() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4461.this.m12943(methodHookParam);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۥۨ$ۥ۟۟, reason: contains not printable characters */
    public class C4462 extends XC_MethodHook {
        public C4462() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4461.m12936(C4461.this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۥۨ$ۥ۟۟۟, reason: contains not printable characters */
    public class C4463 extends XC_MethodHook {
        public C4463() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4461.m12936(C4461.this);
        }
    }

    static {
        NativeUtil.classesInit0(98);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1398(C4461 c4461, LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m1399(C4461 c4461, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m12932(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m12933(C4461 c4461);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m12934(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m12936(C4461 c4461);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m12937(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m12938(InputDialog inputDialog, View view, String str);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final native void m12939();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final native /* synthetic */ void m12940(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final native /* synthetic */ void m12941(LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final native /* synthetic */ void m12942();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m12943(XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            if (C4093.m11556(yue_xin_awa(3))) {
                if (C3270.m6712() > 370901) {
                    Object[] objArr = methodHookParam.args;
                    Object obj = objArr[2];
                    String str = (String) XposedHelpers.callMethod(objArr[1], yue_xin_awa(15), new Object[0]);
                    JSONObject jSONObject = (JSONObject) C4093.m11560(yue_xin_awa(16));
                    if (jSONObject != null && !jSONObject.isNull(str)) {
                        int i = jSONObject.getInt(str);
                        XposedHelpers.setObjectField(obj, yue_xin_awa(17), Integer.valueOf(i));
                        XposedHelpers.setObjectField(obj, yue_xin_awa(18), i + yue_xin_awa(19));
                        XposedHelpers.setObjectField(obj, yue_xin_awa(20), i + yue_xin_awa(19));
                    }
                } else {
                    Object result = methodHookParam.getResult();
                    Object obj2 = methodHookParam.args[0];
                    String str2 = (String) C5898.m18284(obj2, yue_xin_awa(21), String.class);
                    JSONObject jSONObject2 = (JSONObject) C4093.m11560(yue_xin_awa(16));
                    if (jSONObject2 != null && !jSONObject2.isNull(str2)) {
                        int i2 = jSONObject2.getInt(str2);
                        C5898.m18291(result, yue_xin_awa(22), Boolean.TRUE);
                        C5898.m18291(result, yue_xin_awa(17), Integer.valueOf(i2));
                        C5898.m18291(result, yue_xin_awa(18), i2 + yue_xin_awa(19));
                        C5898.m18291(obj2, yue_xin_awa(17), Integer.valueOf(i2));
                        C5898.m18291(obj2, yue_xin_awa(18), i2 + yue_xin_awa(19));
                    }
                }
            }
        } catch (Throwable th) {
            C6334.m19807(yue_xin_awa(23) + th, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final native void m12944();
}
