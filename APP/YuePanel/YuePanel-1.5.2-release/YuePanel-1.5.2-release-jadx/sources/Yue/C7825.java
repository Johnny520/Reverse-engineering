package Yue;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۢۡۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7825 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3100 = 10;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Handler f3101 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long f23398 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean f23399 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean f23400 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int f23401 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static DialogC4440 f23402;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static TextView f23403;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Runnable f23404;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Runnable f23405;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23406;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23407;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23408;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23409;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23410;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23411;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23412;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23413;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23414;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23415;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23416;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23417;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23418;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23419;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23420;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23421;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23422;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f23423;

    /* JADX INFO: renamed from: Yue.ۥۢۡۤۥ$ۥ */
    public class C1370 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f23424;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f23425;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f23426;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f23427;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f23428;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f23429;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f23430;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f23431;

        public C1370(ClassLoader classLoader, C3828 c3828) {
            this.f23430 = classLoader;
            this.f23431 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f23424;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-4556193386172563951L);
                f23424 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f23425;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(4503922896073529216L);
                f23425 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f23426;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(7337086095762935079L);
                f23426 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f23427;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-153693661317486494L);
                f23427 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f23428;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(-4220008134016971365L);
                f23428 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f23429;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(2596046246479019500L);
            f23429 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m24841(ClassLoader classLoader, C3828 c3828, Object obj) {
            int i = 0;
            long jM11559 = C4093.m11559(yue_xin_awa(0));
            if (jM11559 == 0) {
                jM11559 = 1800;
            }
            do {
                try {
                    C7477.m3677(1000L);
                    XposedHelpers.callMethod(obj, c3828.m878(), new Object[]{Long.valueOf(jM11559), XposedHelpers.callStaticMethod(classLoader.loadClass(c3828.m10569().get(1)), yue_xin_awa(1), new Object[]{yue_xin_awa(2)}), yue_xin_awa(3)});
                    return;
                } catch (Throwable unused) {
                    i++;
                }
            } while (i < C4116.f8228);
            C4383.m12707(yue_xin_awa(4), yue_xin_awa(5));
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            final Object obj = methodHookParam.thisObject;
            final ClassLoader classLoader = this.f23430;
            final C3828 c3828 = this.f23431;
            new Thread(new Runnable() { // from class: Yue.ۥۢۡۤۤ
                static {
                    NativeUtil.classesInit0(121);
                }

                @Override // java.lang.Runnable
                public final native void run();
            }).start();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۤۥ$ۥ۟ */
    public class RunnableC1371 implements Runnable {
        static {
            NativeUtil.classesInit0(944);
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    static {
        NativeUtil.classesInit0(124);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3916(DialogInterface dialogInterface);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3917(View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m24807();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m24808(BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m24809(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, DialogC4440 dialogC4440, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m24810();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ DialogC4440 m24811();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ int m24812();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ int m24813();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m24814();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m24815();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ TextView m24816();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ Handler m24817();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native void m24818();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native void m24819();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native int m24820(Activity activity, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m24821(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, DialogC4440 dialogC4440, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m24822(BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m24823();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m24824(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m24825(DialogInterface dialogInterface);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native LinearLayout.LayoutParams m24826();

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native void m24827(Activity activity);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native void m24828(Activity activity);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native void m24829(Activity activity);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native void m24830(Activity activity);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static native void m24831(MotionEvent motionEvent);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static native void m24832();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native void m24833();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native void m24834();

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static native void m24835();

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static native View m24836(Activity activity, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static native void m24837();

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    @Override // Yue.AbstractC5391
    public native void onLongClick();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m24838(C3828 c3828, ClassLoader classLoader) throws Throwable {
        C5309.m16286(classLoader.loadClass(c3828.m879()), new C1370(classLoader, c3828));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native void m24839(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public native int[] m24840(long j);
}
