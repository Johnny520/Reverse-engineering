package Yue;

import android.view.View;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥۣۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6564 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static Class<?> f2146;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16824;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16825;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16826;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16827;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16828;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16829;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16830;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16831;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16832;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16833;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16834;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16835;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16836;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16837;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16838;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16839;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16840;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16841;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16842;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16843;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16844;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16845;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16846;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16847;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16848;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16849;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16850;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16851;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16852;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16853;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16854;

    /* JADX INFO: renamed from: ۥ */
    public boolean f2147 = false;

    /* JADX INFO: renamed from: Yue.ۥۣۣۡ$ۥ */
    public class C1012 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16855;

        public C1012() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f16855;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-5227725857423341886L);
            f16855 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            for (View view : C8369.m27916((View) methodHookParam.args[0])) {
                if (view.getClass().getSimpleName().equals(yue_xin_awa(0))) {
                    C6564.m20877(C6564.this, ((TextView) view).getText().toString());
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣۡ$ۥ۟ */
    public class C1013 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16857;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16858;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16859;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f16860;

        public C1013() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f16857;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(6103388874163358400L);
                f16857 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f16858;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(1963438220296187393L);
                f16858 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f16859;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-6773262607257815580L);
                f16859 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f16860;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(9048707163930524327L);
            f16860 = strM22674;
            return strM22674;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                List list = (List) methodHookParam.args[1];
                C7139.m3427(C3270.m6705());
                if (C6564.m20878(C6564.this)) {
                    return;
                }
                if (C4093.m11556(yue_xin_awa(0))) {
                    list.add(C6564.m20880(C6564.this, list.get(0), yue_xin_awa(1), C2597R.C9029.f30466));
                }
                list.add(C6564.m20880(C6564.this, list.get(0), yue_xin_awa(2), C2597R.C9029.f30483));
                C6564.m20879(C6564.this, true);
            } catch (Throwable th) {
                C6334.m19807(yue_xin_awa(3) + th, 1);
            }
        }
    }

    static {
        NativeUtil.classesInit0(406);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3024(int i, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m3025(C6564 c6564, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m20877(C6564 c6564, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m20878(C6564 c6564);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m20879(C6564 c6564, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ Object m20880(C6564 c6564, Object obj, String str, int i) throws Throwable;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m20881(int i, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    private native void m20882(int i);

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native /* synthetic */ boolean m20883(MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Object m20884(Object obj, String str, int i) throws Throwable {
        Class<?> cls = obj.getClass();
        Class<?> cls2 = C8573.m28561(cls, 1)[0];
        List<Method> listM4543 = C8573.m4543(cls2, Void.TYPE, 1, new Class[]{String.class});
        Object objNewInstance = cls2.newInstance();
        XposedHelpers.callMethod(objNewInstance, listM4543.get(0).getName(), new Object[]{str});
        if (C3270.m6712() >= 380001) {
            try {
                C5898.m18291(objNewInstance, yue_xin_awa(23), Integer.valueOf(i));
            } catch (Throwable unused) {
            }
        }
        return cls.getConstructor(cls2).newInstance(objNewInstance);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m20885() {
        ArrayList<C6321> arrayList = new ArrayList(C4119.f689);
        Object obj = C4116.f8224;
        StringBuilder sb = new StringBuilder();
        if (arrayList.isEmpty()) {
            C6334.m19807(yue_xin_awa(13), 3);
            return;
        }
        if (obj == null) {
            C6334.m19807(yue_xin_awa(14), 3);
            return;
        }
        C6334.m19807(yue_xin_awa(15), 3);
        try {
            Object objNewInstance = f2146.getConstructor(C3270.m6707().loadClass(obj.getClass().getName())).newInstance(obj);
            for (C6321 c6321 : arrayList) {
                try {
                    XposedHelpers.callMethod(objNewInstance, yue_xin_awa(16), new Object[]{c6321.m19706()});
                    sb.append(yue_xin_awa(17));
                    sb.append(c6321.m19706());
                    sb.append(yue_xin_awa(18));
                    sb.append(c6321.m2786());
                    sb.append(yue_xin_awa(19));
                } catch (Throwable unused) {
                    sb.append(yue_xin_awa(20));
                    sb.append(c6321.m19706());
                    sb.append(yue_xin_awa(18));
                    sb.append(c6321.m2786());
                    sb.append(yue_xin_awa(19));
                }
            }
        } catch (Throwable unused2) {
        }
        if (C6337.m19825()) {
            MessageDialog.show(yue_xin_awa(10), sb.toString(), yue_xin_awa(21));
        }
        C6334.m19807(yue_xin_awa(22), 2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final native void m20886(String str);
}
