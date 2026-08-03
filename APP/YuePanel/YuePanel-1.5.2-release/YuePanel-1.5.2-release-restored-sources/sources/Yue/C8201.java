package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥۣۢۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8201 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f3312;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f3313;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24458;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24459;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24460;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24461;

    /* JADX INFO: renamed from: Yue.ۥۣۢۨۢ$ۥ */
    public class C1462 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24462;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24463;

        public C1462() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f24462;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-7358406702375995059L);
                f24462 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f24463;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(1890184754014383161L);
            f24463 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                if (C4093.m11556(yue_xin_awa(0))) {
                    List list = (List) new C4805().m14538(methodHookParam.args[0]).m14540(List.class).m14536(methodHookParam.args[0].getClass().getName()).m1709(yue_xin_awa(1));
                    List list2 = (List) methodHookParam.getResult();
                    if (list == null || list2 == null) {
                        return;
                    }
                    C8201.m4222(C8201.this, list, list2);
                }
            } catch (Throwable th) {
                C6334.m19809(th.getMessage());
            }
        }
    }

    static {
        NativeUtil.classesInit0(110);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4222(C8201 c8201, List list, List list2);

    @Override // Yue.AbstractC5391
    public native MethodDataList dexKit(DexKitBridge dexKitBridge);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟ */
    public final native void m4223(List list, List list2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m27162(List list, List list2);
}
