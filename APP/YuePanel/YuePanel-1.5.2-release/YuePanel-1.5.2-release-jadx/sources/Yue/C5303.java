package Yue;

import android.os.Handler;
import android.os.Looper;
import com.android.p001dx.p004io.Opcodes;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5303 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static C3828 f1413;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1414;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12698;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12699;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12700;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12701;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12702;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12703;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12704;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12705;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12706;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12707;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12708;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12709;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12710;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12711;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12712;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12713;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12714;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12715;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12716;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12717;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12718;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12719;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12720;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12721;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12722;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۥۧ$ۥ */
    public class C0703 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12723;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12724;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12725;

        public C0703() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f12723;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(2731810086417841098L);
                f12723 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f12724;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-2223425501394702511L);
                f12724 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f12725;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(5582385876569046852L);
            f12725 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                if (C4093.m11556(yue_xin_awa(0))) {
                    if (XposedHelpers.getAdditionalInstanceField(methodHookParam.thisObject, yue_xin_awa(1)) != null) {
                        XposedHelpers.removeAdditionalInstanceField(methodHookParam.thisObject, yue_xin_awa(1));
                        return;
                    }
                    Object obj = methodHookParam.args[0];
                    if (obj == null || ((Integer) XposedHelpers.callMethod(obj, yue_xin_awa(2), new Object[0])).intValue() != 5) {
                        return;
                    }
                    C5303.this.m16269(methodHookParam, obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        NativeUtil.classesInit0(Opcodes.OR_INT_LIT16);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m16266(int i, JSONObject jSONObject, int[] iArr, Object obj, XC_MethodHook.MethodHookParam methodHookParam, MessageMenu messageMenu, CharSequence charSequence, int i2) {
        String strM19828;
        try {
            strM19828 = i == 1 ? C6337.m19828(jSONObject.toString(), iArr[i2]) : C6337.m19827(jSONObject.toString(), iArr[i2]);
        } catch (Throwable th) {
            C6334.m19809(yue_xin_awa(25) + th);
        }
        if (strM19828 == null) {
            C6334.m19809(yue_xin_awa(22));
            return false;
        }
        XposedHelpers.callMethod(obj, yue_xin_awa(23), new Object[]{strM19828});
        XposedHelpers.setAdditionalInstanceField(methodHookParam.thisObject, yue_xin_awa(24), Boolean.TRUE);
        XposedHelpers.callMethod(methodHookParam.thisObject, f1413.m878(), methodHookParam.args);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m16267(final Object obj, final int i, final XC_MethodHook.MethodHookParam methodHookParam) {
        int[] iArr;
        String[] strArr;
        try {
            final JSONObject jSONObject = new JSONObject((String) XposedHelpers.callMethod(obj, yue_xin_awa(4), new Object[0]));
            if (i == 1) {
                iArr = new int[]{1, 2, 3};
                strArr = new String[]{yue_xin_awa(11), yue_xin_awa(12), yue_xin_awa(13)};
            } else {
                iArr = new int[]{1, 2, 3, 4, 5, 6};
                strArr = new String[]{yue_xin_awa(14), yue_xin_awa(15), yue_xin_awa(16), yue_xin_awa(17), yue_xin_awa(18), yue_xin_awa(19)};
            }
            final int[] iArr2 = iArr;
            MessageMenu.show(strArr).setTitle((CharSequence) yue_xin_awa(20)).setOnMenuItemClickListener(new OnMenuItemClickListener() { // from class: Yue.ۥ۠ۤۥۦ
                @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
                public final boolean onClick(Object obj2, CharSequence charSequence, int i2) {
                    return C5303.m16266(i, jSONObject, iArr2, obj, methodHookParam, (MessageMenu) obj2, charSequence, i2);
                }
            });
        } catch (Throwable th) {
            C6334.m19809(yue_xin_awa(21) + th.getMessage());
        }
    }

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            f1413 = c3828;
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C0703());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(0), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m16268(final XC_MethodHook.MethodHookParam methodHookParam, final Object obj, final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥ۠ۤۥۥ
            @Override // java.lang.Runnable
            public final void run() {
                C5303.m16267(obj, i, methodHookParam);
            }
        });
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m16269(XC_MethodHook.MethodHookParam methodHookParam, Object obj) {
        try {
            String str = (String) XposedHelpers.callMethod(obj, yue_xin_awa(4), new Object[0]);
            if (str == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt(yue_xin_awa(5)) == 507) {
                String string = jSONObject.getString(yue_xin_awa(6));
                if (string.equals(yue_xin_awa(7))) {
                    m16268(methodHookParam, obj, 1);
                    methodHookParam.setResult((Object) null);
                } else if (string.equals(yue_xin_awa(8))) {
                    m16268(methodHookParam, obj, 2);
                    methodHookParam.setResult((Object) null);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
