package Yue;

import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۦ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3998 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f613;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f614;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7988;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7989;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7990;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7991;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7992;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7993;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7994;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7995;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7996;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7997;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7998;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7999;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8000;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8001;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8002;

    static {
        NativeUtil.classesInit0(635);
        f613 = new String[]{yue_xin_awa(14), yue_xin_awa(15)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m971(BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m972(BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m11315(XC_MethodHook.MethodHookParam methodHookParam, ClassLoader classLoader) {
        Object[] objArr;
        if (C6263.m2730()) {
            m11316((methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length <= 0) ? null : objArr[0], classLoader);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m11316(Object obj, ClassLoader classLoader) {
        if (obj == null) {
            return;
        }
        try {
            Class<?> clsLoadClass = classLoader.loadClass(obj.getClass().getName());
            int iM11558 = C4093.m11558(yue_xin_awa(5));
            Class<?> clsLoadClass2 = classLoader.loadClass(yue_xin_awa(6));
            String name = C4806.m1710(clsLoadClass, CharSequence.class, 1).get(0).getName();
            CharSequence charSequence = (CharSequence) XposedHelpers.getObjectField(obj, name);
            if (!C3991.m967(obj) && C4093.m11556(yue_xin_awa(2))) {
                if (iM11558 == 1) {
                    charSequence = yue_xin_awa(7) + ((Object) charSequence);
                    C5898.m18291(obj, name, charSequence);
                }
                if (charSequence != null) {
                    List list = (List) XposedHelpers.getObjectField(obj, C4806.m1710(clsLoadClass, List.class, 17).get(0).getName());
                    if (list.isEmpty()) {
                        Object objNewInstance = clsLoadClass2.newInstance();
                        if (iM11558 == 0) {
                            C5898.m18291(objNewInstance, yue_xin_awa(8), 1);
                            C5898.m18291(objNewInstance, yue_xin_awa(9), Integer.valueOf(charSequence.length()));
                            C5898.m18291(objNewInstance, yue_xin_awa(10), 0);
                        }
                        list.add(objNewInstance);
                    }
                    for (Object obj2 : list) {
                        if (iM11558 == 0) {
                            C5898.m18291(obj2, yue_xin_awa(10), 0);
                            C5898.m18291(obj2, yue_xin_awa(8), 1);
                        } else if (iM11558 == 1) {
                            C5898.m18291(obj2, yue_xin_awa(10), 0);
                            C5898.m18291(obj2, yue_xin_awa(8), 33);
                        }
                        C5898.m18291(obj2, yue_xin_awa(9), Integer.valueOf(charSequence.length()));
                    }
                }
            }
        } catch (Throwable th) {
            C6334.m19808(yue_xin_awa(11) + th, 1);
        }
    }

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void onClick();
}
