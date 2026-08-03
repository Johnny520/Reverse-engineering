package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4614 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1002;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1003;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9894;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9895;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9896;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9897;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9898;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9899;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9900;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۣ$ۥ */
    public class C0454 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f9901;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f9902;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f9903;

        public C0454(C3828 c3828) {
            this.f9903 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f9901;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(7844401026106168148L);
                f9901 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f9902;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-4938113237667786353L);
            f9902 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            List list;
            if (C4093.m11556(yue_xin_awa(0)) && (list = (List) methodHookParam.getResult()) != null) {
                for (Object obj : list) {
                    if (obj.getClass().getName().equals(this.f9903.m879())) {
                        C4116.f8221.add(obj);
                        new C4805().m14538(obj).m14540(Integer.TYPE).m14537(yue_xin_awa(1), 0);
                    }
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(696);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);
}
