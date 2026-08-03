package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5653 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1597;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1598;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13860;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13861;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13862;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13863;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13864;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13865;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f13866;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦۥ$ۥ */
    public class C0826 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13867;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13868;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13869;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13870;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13871;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13872;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13873;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f13874;

        public C0826() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f13867;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-4912081090513265124L);
                    f13867 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f13868;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(7139754222167825334L);
                    f13868 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f13869;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(-2374793623175230916L);
                    f13869 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f13870;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(-175740923703507937L);
                    f13870 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f13871;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(8211994431723730288L);
                    f13871 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f13872;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(4403773322437445569L);
                    f13872 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f13873;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-3687430008059539288L);
                    f13873 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f13874;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(7600716569970236465L);
                    f13874 = strM22678;
                    return strM22678;
                default:
                    return null;
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            List list;
            try {
                if (C4093.m11556(yue_xin_awa(0)) && C6263.m2730() && (list = (List) methodHookParam.args[0]) != null) {
                    ArrayList arrayList = new ArrayList(list);
                    for (int i = 0; i < arrayList.size(); i++) {
                        Object obj = arrayList.get(i);
                        if (C6337.m19825()) {
                            C5863.m2536(obj + yue_xin_awa(1), System.currentTimeMillis() + yue_xin_awa(2) + i);
                        }
                        C4805 c4805M14538 = new C4805().m14538(obj);
                        if (((Boolean) c4805M14538.m14540(Boolean.TYPE).m1709(yue_xin_awa(3))).booleanValue()) {
                            C6334.m19808(yue_xin_awa(5) + ((String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(4))) + yue_xin_awa(6), 3);
                            list.remove(obj);
                        }
                    }
                }
            } catch (Throwable th) {
                C6334.m19807(yue_xin_awa(7) + th, 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(581);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
