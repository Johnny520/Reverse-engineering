package Yue;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Switch;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3491 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static HashMap<String, C7054> f329;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f330;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f5700;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String f5701;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5702;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5703;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5704;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5705;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5706;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5707;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5708;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5709;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5710;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5711;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5712;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5713;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5714;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5715;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5716;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5717;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5718;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5719;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5720;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5721;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5722;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5723;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5724;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5725;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5726;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5727;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5728;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5729;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5730;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5731;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5732;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5733;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5734;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5735;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5736;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5737;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5738;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5739;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5740;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5741;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5742;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5743;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5744;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5745;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5746;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5747;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5748;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5749;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5750;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5751;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5752;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5753;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5754;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5755;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5756;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5757;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5758;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5759;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5760;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5761;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5762;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5763;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5764;

    /* JADX INFO: renamed from: Yue.ۥۣۣ۟ۢ$ۥ */
    public class C0151 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5765;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5766;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5767;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5768;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5769;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5770;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5771;

        public C0151() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f5765;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-3209443734276815954L);
                    f5765 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f5766;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-9119863778855428412L);
                    f5766 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f5767;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(-7960383257292135818L);
                    f5767 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f5768;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(3973568775796275319L);
                    f5768 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f5769;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(7069422886896763913L);
                    f5769 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f5770;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(3061990211589240135L);
                    f5770 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f5771;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-2102316035266974357L);
                    f5771 = strM22677;
                    return strM22677;
                default:
                    return null;
            }
        }

        public void afterHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                new Thread(new Runnable() { // from class: Yue.ۥۣ۟ۢۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5698.m9292(methodHookParam);
                    }
                }).start();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m9292(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                JSONObject jSONObject = (JSONObject) methodHookParam.args[2];
                String string = jSONObject.getString(yue_xin_awa(1));
                String string2 = jSONObject.getString(yue_xin_awa(2));
                if (C3491.m9270().containsKey(string) && C4093.m11556(yue_xin_awa(3))) {
                    C7477.m3677(C4093.m11558(yue_xin_awa(4)));
                    C7054 c7054 = (C7054) C3491.m9270().get(string);
                    C6324 c6324M3343 = c7054.m3343();
                    c7054.m21978(string2);
                    C3491.m9271(C3491.this, string, c7054.m21976(), c6324M3343.m19780(), c7054.m3344());
                } else if (C4093.m11556(yue_xin_awa(5))) {
                    C3491.m9273(string2);
                }
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(6) + th);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣ۟ۢ$ۥ۟ */
    public class C0152 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5773;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5774;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5775;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5776;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5777;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5778;

        public C0152() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f5773;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(3061990211589240135L);
                f5773 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f5774;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-7958029062397814671L);
                f5774 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f5775;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-7300914596261068794L);
                f5775 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f5776;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-432950697462712462L);
                f5776 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f5777;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(-4349808192213226142L);
                f5777 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f5778;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(6684106833973348751L);
            f5778 = strM22676;
            return strM22676;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                final Activity activity = (Activity) methodHookParam.thisObject;
                new Thread(new Runnable() { // from class: Yue.ۥۣ۟ۢۤ
                    static {
                        NativeUtil.classesInit0(764);
                    }

                    @Override // java.lang.Runnable
                    public final native void run();
                }).start();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m9293(final Activity activity) {
            if (activity == null) {
                return;
            }
            Bundle extras = activity.getIntent().getExtras();
            for (int i = 0; i < 100; i++) {
                try {
                    C7477.m3677(100L);
                } catch (Throwable unused) {
                    continue;
                }
                if (C3491.m9272() != null) {
                    try {
                        String string = extras.getString(yue_xin_awa(1));
                        String string2 = extras.getString(yue_xin_awa(2));
                        C3491.m9271(C3491.this, C7757.m3848(string, yue_xin_awa(3), yue_xin_awa(4)), string, string2, C3491.m9272());
                        if (C4093.m11556(yue_xin_awa(5))) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥۣ۟ۢۥ
                                static {
                                    NativeUtil.classesInit0(762);
                                }

                                @Override // java.lang.Runnable
                                public final native void run();
                            });
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C6334.m19809(th.getMessage());
                        return;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public class C3492 extends OnBindView<BottomDialog> {
        static {
            NativeUtil.classesInit0(84);
        }

        public C3492(View view) {
            super(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native void m553(BottomDialog bottomDialog, View view);
    }

    static {
        NativeUtil.classesInit0(766);
        f329 = new LinkedHashMap();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m549(C3491 c3491, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m550(C3491 c3491, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9263(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9264(Switch r0, String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9265(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9266(C3491 c3491, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9267(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9268(C3491 c3491, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9269(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ HashMap m9270();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m9271(C3491 c3491, String str, String str2, String str3, String str4) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ String m9272();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ String m9273(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    private static native boolean m9274(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native void m9275(C6324 c6324);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9276(Switch r0, String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    private static native /* synthetic */ boolean m9277(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    private native /* synthetic */ boolean m9278(BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    private native /* synthetic */ boolean m9279(BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9280(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9281(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9282(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native void m9283(String str, String str2, C6324 c6324) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native void m9284(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    private native void m9285();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    private native void m9286();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    private native void m9287();

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native boolean onCheck(String str, Switch r2);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final native /* synthetic */ boolean m9288(BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native /* synthetic */ boolean m9289(BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final native void m9290(String str, String str2, String str3, String str4) throws Throwable;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final native void m9291();
}
