package Yue;

import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2964 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f15;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f16;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4269;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4270;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4271;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4272;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4273;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4274;

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠۠$ۥ */
    public class C0004 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4275;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4276;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4277;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f4278;

        public C0004(ClassLoader classLoader) {
            this.f4278 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f4275;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-5019277460014409320L);
                f4275 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f4276;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(3525063710357537117L);
                f4276 = strM22672;
                return strM22672;
            }
            if (i != 2) {
                return null;
            }
            String str3 = f4277;
            if (str3 != null) {
                return str3;
            }
            String strM22673 = C5523.m2267(-4061799449780968636L);
            f4277 = strM22673;
            return strM22673;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            String strGroup;
            super.beforeHookedMethod(methodHookParam);
            Object obj = methodHookParam.args[1];
            Object obj2 = XposedHelpers.findFirstFieldByExactType(obj.getClass(), this.f4278.loadClass(yue_xin_awa(0))).get(obj);
            Matcher matcher = Pattern.compile(yue_xin_awa(2)).matcher(XposedHelpers.findFirstFieldByExactType(obj2.getClass(), this.f4278.loadClass(yue_xin_awa(1))).get(obj2).toString());
            if (matcher.find()) {
                int i = Integer.parseInt(matcher.group(1));
                if (i == 1) {
                    try {
                        strGroup = C8145.m26792(matcher.group(2));
                    } catch (Exception unused) {
                        strGroup = matcher.group(2);
                    }
                    C6263.m19285(strGroup);
                } else if (i == 2) {
                    C6263.m19285(matcher.group(2));
                }
                C6263.m19284(i);
                C6263.m19286(matcher.group(4));
                C5740.m17794(C6263.m19271());
            }
        }
    }

    static {
        NativeUtil.classesInit0(255);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
