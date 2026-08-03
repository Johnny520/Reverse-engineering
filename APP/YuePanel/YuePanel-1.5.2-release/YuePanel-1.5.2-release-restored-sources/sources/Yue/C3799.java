package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3799 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static List f508;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f509;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7017;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7018;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7019;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7020;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7021;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7022;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7023;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7024;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7025;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7026;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7027;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7028;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۥ$ۥ */
    public class C0255 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7029;

        public C0255(ClassLoader classLoader) {
            this.f7029 = classLoader;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                Object result = methodHookParam.getResult();
                List list = (List) C5898.m18284(result, ((Field) C3799.m845(C3799.this, result, this.f7029).get(0)).getName(), ArrayList.class);
                if (C3799.f508 == null || list.size() > C3799.f508.size()) {
                    C3799.f508 = list;
                }
                C3799.m846(C3799.this);
            } catch (Throwable th) {
                C6334.m19809(th.getMessage());
            }
        }
    }

    static {
        NativeUtil.classesInit0(1065);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ List m845(C3799 c3799, Object obj, ClassLoader classLoader) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m846(C3799 c3799) throws Throwable;

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native List<Field> m10503(Object obj, ClassLoader classLoader) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m10504() throws Throwable;
}
