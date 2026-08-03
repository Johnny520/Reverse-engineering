package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4621 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static String f1015;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f1016;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static List<String> f9911;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9912;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9913;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9914;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9915;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9916;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9917;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9918;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9919;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9920;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9921;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9922;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9923;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9924;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9925;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9926;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9927;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9928;

    static {
        NativeUtil.classesInit0(719);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1576(int i, List list, Class cls, Object obj, Object obj2);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m1577(Object obj, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m13889(Object obj, int i) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m13890(int i, List list, Class cls, Object obj, Object obj2) {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String str = (String) new C4805().m14538(list.get(i2)).m14540(String.class).m1709(yue_xin_awa(10));
                if (str != null) {
                    XposedHelpers.callStaticMethod(cls, f1016, new Object[]{obj, str, obj2, yue_xin_awa(11), yue_xin_awa(12), null});
                }
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(13) + th);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m13891(Object obj, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m13892(Object obj);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
