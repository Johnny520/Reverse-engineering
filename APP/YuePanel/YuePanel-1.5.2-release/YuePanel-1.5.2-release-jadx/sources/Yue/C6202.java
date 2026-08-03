package Yue;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6202 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Map<Object, CharSequence> f15256;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15257;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15258;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15259;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15260;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15261;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15262;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15263;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15264;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15265;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15266;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15267;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15268;

    /* JADX INFO: renamed from: ۥ */
    public final String f1894 = yue_xin_awa(0);

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f1895 = yue_xin_awa(1);

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠۟$ۥ */
    public class C0935 extends XC_MethodHook {
        public C0935() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            C6202.f15256.put(methodHookParam.thisObject, ((CharSequence) methodHookParam.args[0]).toString());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠۟$ۥ۟ */
    public class C0936 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15270;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15271;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15272;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f15273;

        public C0936(String str) {
            this.f15273 = str;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f15270;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-6641417696425155786L);
                f15270 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f15271;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-3037001702484909419L);
                f15271 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f15272;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(1621877640009702529L);
            f15272 = strM22673;
            return strM22673;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m19103(View view, View view2) {
            try {
                C7311.m22843(C6263.m19271(), C6202.f15256.get(view).toString());
            } catch (Exception e) {
                C5863.m2535(yue_xin_awa(2) + e);
                C6334.m19807(yue_xin_awa(2) + e, 1);
            }
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            if (C4093.m11556(yue_xin_awa(0))) {
                Context contextM6705 = C3270.m6705();
                List<View> listM27916 = C8369.m27916((RelativeLayout) methodHookParam.thisObject);
                for (int i = 0; i < listM27916.size(); i++) {
                    try {
                        final View view = listM27916.get(i);
                        if (view.getClass().getSimpleName().equals(this.f15273)) {
                            try {
                                LinearLayout linearLayout = (LinearLayout) listM27916.get(i - 1);
                                ImageView imageView = new ImageView(contextM6705);
                                imageView.setImageResource(C2597R.C9029.f30495);
                                imageView.setLayoutParams(new LinearLayout.LayoutParams(90, 90));
                                if (linearLayout.getOrientation() == 0) {
                                    linearLayout.addView(imageView);
                                } else {
                                    linearLayout.setOrientation(0);
                                    linearLayout.addView(imageView, 0);
                                }
                                imageView.setOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۡۡ۠۠
                                    static {
                                        NativeUtil.classesInit0(361);
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final native void onClick(View view2);
                                });
                            } catch (Exception e) {
                                C5863.m2535(yue_xin_awa(1) + e);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(359);
        f15256 = new LinkedHashMap();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
