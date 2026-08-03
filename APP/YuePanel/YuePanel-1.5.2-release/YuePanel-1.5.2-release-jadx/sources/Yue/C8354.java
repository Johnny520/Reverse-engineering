package Yue;

import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.HashMap;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8354 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3425;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3426;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24941;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24942;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24943;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24944;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24945;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24946;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24947;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24948;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24949;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۣ$ۥ */
    public class C1493 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f24950;

        public C1493(ClassLoader classLoader) {
            this.f24950 = classLoader;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                Object obj = methodHookParam.args[2];
                C8354.m4317(C8354.this, obj instanceof View ? (View) obj : (View) XposedHelpers.callMethod(obj, C8573.m4543(this.f24950.loadClass(obj.getClass().getName()), View.class, 0, new Class[0]).get(0).getName(), new Object[0]));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۣ$ۥ۟ */
    public class C1494 extends XC_MethodHook {
        public C1494() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C4116.f683 = ((Integer) methodHookParam.args[0]).intValue();
        }
    }

    static {
        NativeUtil.classesInit0(379);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4317(C8354 c8354, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    private native void m27833(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟ */
    public final native void m4318(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m27834(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native void m27835(View view);
}
