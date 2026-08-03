package Yue;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5646 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1595;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1596;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13817;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13818;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13819;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13820;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13821;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13822;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13823;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13824;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13825;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13826;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13827;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13828;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13829;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13830;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13831;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13832;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13833;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13834;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13835;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13836;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13837;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13838;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13839;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13840;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13841;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13842;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦۢ$ۥ */
    public class C0824 extends XC_MethodHook {
        public C0824() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.args[0] = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦۢ$ۥ۟ */
    public class C0825 extends XC_MethodHook {
        public C0825() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(1000L);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦۢ$ۥ۟۟, reason: contains not printable characters */
    public class C5647 extends XC_MethodHook {
        public C5647() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(1000L);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦۢ$ۥ۟۟۟, reason: contains not printable characters */
    public class C5648 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13846;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13847;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13848;

        public C5648() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f13846;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(7391232830319032641L);
                f13846 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f13847;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(5693251445327414995L);
                f13847 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f13848;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(7418206568892884246L);
            f13848 = strM22673;
            return strM22673;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m17570(Activity activity) {
            int i = 0;
            boolean z = false;
            while (true) {
                C7477.m3677(100L);
                List<View> listM27918 = C8369.m27918(activity);
                if (listM27918.size() >= 5) {
                    Iterator<View> it = listM27918.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        View next = it.next();
                        int id = next.getId();
                        if (id != -1) {
                            try {
                                if (yue_xin_awa(0).equals(next.getResources().getResourceEntryName(id))) {
                                    TextView textView = (TextView) next;
                                    String string = textView.getText().toString();
                                    if (!string.contains(yue_xin_awa(1)) && !string.isEmpty()) {
                                        final LinearLayout linearLayout = (LinearLayout) textView.getParent();
                                        Handler handler = new Handler(Looper.getMainLooper());
                                        Objects.requireNonNull(linearLayout);
                                        handler.post(new Runnable() { // from class: Yue.ۥ۠ۦۦۣ
                                            static {
                                                NativeUtil.classesInit0(578);
                                            }

                                            @Override // java.lang.Runnable
                                            public final native void run();
                                        });
                                        C6334.m19808(yue_xin_awa(2) + textView.getText().toString(), 2);
                                        z = true;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                if (z || i >= 100) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            final Activity activity = (Activity) methodHookParam.thisObject;
            new Thread(new Runnable() { // from class: Yue.ۥ۠ۦۦۤ
                static {
                    NativeUtil.classesInit0(579);
                }

                @Override // java.lang.Runnable
                public final native void run();
            }).start();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C5649 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13850;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13851;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13852;

        public C5649() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f13850;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-596243100505021315L);
                f13850 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f13851;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-6308929333482527384L);
                f13851 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f13852;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(6517622583887530266L);
            f13852 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                C6334.m19808(yue_xin_awa(2), 2);
                methodHookParam.setResult((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C5650 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13854;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13855;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13856;

        public C5650() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f13854;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(6061546822766272503L);
                f13854 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f13855;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-6308929333482527384L);
                f13855 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f13856;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(5287406908919472142L);
            f13856 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0)) && C4093.m11556(yue_xin_awa(1))) {
                ((Activity) methodHookParam.thisObject).finish();
                C6334.m19808(yue_xin_awa(2), 3);
            }
        }
    }

    static {
        NativeUtil.classesInit0(577);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m2349(C5646 c5646, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m2350(C5646 c5646, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m17563(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m17564(String[] strArr, BottomMenu bottomMenu, View view);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public native void m17565(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public native void m17566(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native void m17567(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m17568(ClassLoader classLoader) {
        for (int i = 0; i < 100; i++) {
            try {
                C7477.m3677(1000L);
                Class<?> clsLoadClass = classLoader.loadClass(yue_xin_awa(16));
                Iterator<Method> it = C8573.m4543(clsLoadClass, Void.TYPE, 2, new Class[]{classLoader.loadClass(yue_xin_awa(17)), Integer.class}).iterator();
                while (it.hasNext()) {
                    C5309.m16287(clsLoadClass, it.next().getName(), new C5649());
                }
                C6334.m19808(yue_xin_awa(18), 2);
                return;
            } catch (Throwable unused) {
            }
        }
        C4383.m12707(yue_xin_awa(14), yue_xin_awa(15));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final native /* synthetic */ void m17569(ClassLoader classLoader);
}
