package Yue;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4798 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1118;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long f1119 = 300;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long f10736 = 250;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f10737;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Set<String> f10738;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Set<String> f10739;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Set<Class<?>> f10740;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f10741;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float f10742 = 0.09f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final ThreadLocal<Boolean> f10743;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile InterfaceC4800 f10744 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile InterfaceC4799 f10745 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile InterfaceC4801 f10746 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile InterfaceC4804 f10747 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final WeakHashMap<View, C4802> f10748;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f10749 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f10750 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f10751 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10752;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10753;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10754;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10755;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10756;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10757;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10758;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10759;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10760;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10761;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10762;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10763;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10764;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10765;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10766;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10767;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10768;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10769;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10770;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10771;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10772;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10773;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10774;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10775;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10776;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10777;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10778;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10779;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ */
    public class C0493 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10780;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10781;

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f10780;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(5218504443212994094L);
                f10780 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f10781;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-6928568828955568645L);
            f10781 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Object[] objArr;
            if (Boolean.TRUE.equals(C4798.m14478().get()) || !(methodHookParam.thisObject instanceof View) || (objArr = methodHookParam.args) == null || objArr.length == 0) {
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() != 0) {
                    return;
                }
                View view = (View) methodHookParam.thisObject;
                C4802 c4802M14481 = C4798.m14481(view);
                if (c4802M14481.f10783 && c4802M14481.f10799 && C4798.m14483(view, motionEvent.getX(), motionEvent.getY())) {
                    c4802M14481.f10799 = false;
                    C4798.m14480(yue_xin_awa(1));
                }
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Object[] objArr;
            Boolean bool = Boolean.TRUE;
            if (bool.equals(C4798.m14478().get())) {
                return;
            }
            Object obj = methodHookParam.thisObject;
            if (!(obj instanceof View) || (objArr = methodHookParam.args) == null || objArr.length == 0 || !(objArr[0] instanceof MotionEvent)) {
                return;
            }
            View view = (View) obj;
            Activity activityM14479 = C4798.m14479(view);
            if (activityM14479 == null) {
                C4798.m14480(yue_xin_awa(0));
                return;
            }
            MotionEvent motionEvent = (MotionEvent) methodHookParam.args[0];
            if (C4798.m14482(activityM14479, view, motionEvent, motionEvent.getActionMasked(), C4798.m14481(view))) {
                methodHookParam.setResult(bool);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ۟ */
    public static class C0494 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f1120;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f1121;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Object f10782;

        static {
            NativeUtil.classesInit0(995);
        }

        public C0494(boolean z, boolean z2) {
            this.f1120 = z;
            this.f1121 = z2;
        }

        /* JADX INFO: renamed from: ۥ */
        public static native C0494 m1701();

        /* JADX INFO: renamed from: ۥ۟ */
        public static native C0494 m1702();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static native C0494 m14530();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static native C0494 m14531();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC4799 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo1703(Activity activity, float f, float f2, Object obj);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4800 {
        /* JADX INFO: renamed from: ۥ */
        C0494 m1704(Activity activity, float f, float f2, int i, int i2);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4801 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo1705(Activity activity, float f, float f2, Object obj);
    }

    /* JADX WARN: Enum visitor error
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "this.exitBlock" is null
    	at jadx.core.dex.nodes.MethodNode.getPreExitBlocks(MethodNode.java:405)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:287)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class EnumC4803 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final EnumC4803 f10805;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final EnumC4803 f10806;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final EnumC4803 f10807;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final /* synthetic */ EnumC4803[] f10808;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10809;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10810;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f10811;

        static {
            NativeUtil.classesInit0(435);
            f10805 = new EnumC4803(yue_xin_awa(0), 0);
            f10806 = new EnumC4803(yue_xin_awa(1), 1);
            f10807 = new EnumC4803(yue_xin_awa(2), 2);
            f10808 = m1706();
        }

        public EnumC4803(String str, int i) {
        }

        public static native EnumC4803 valueOf(String str);

        public static native EnumC4803[] values();

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ EnumC4803[] m1706();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public interface InterfaceC4804 {
        /* JADX INFO: renamed from: ۥ */
        EnumC4803 m1707(View view, View view2, float f, float f2);
    }

    static {
        NativeUtil.classesInit0(90);
        f1118 = yue_xin_awa(0);
        f10737 = yue_xin_awa(1);
        f10738 = new CopyOnWriteArraySet();
        f10739 = new CopyOnWriteArraySet();
        f10740 = Collections.newSetFromMap(new WeakHashMap());
        f10743 = new ThreadLocal<>();
        f10741 = C4093.m11556(yue_xin_awa(27));
        f10748 = new WeakHashMap<>();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1699(C4802 c4802, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m1700(View view, MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3, MotionEvent motionEvent4);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m14477(C4802 c4802, Activity activity, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ ThreadLocal m14478();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ Activity m14479(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m14480(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ C4802 m14481(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m14482(Activity activity, View view, MotionEvent motionEvent, int i, C4802 c4802);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m14483(View view, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native void m14484(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native void m14485(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native void m14486(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native void m14487(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native void m14488(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native void m14489(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native boolean m14490(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native void m14491(C4802 c4802);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native void m14492(C4802 c4802);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native void m14493();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native void m14494();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native MotionEvent m14495(MotionEvent motionEvent);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native void m14496(View view, MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3, MotionEvent motionEvent4);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native void m14497(View view, MotionEvent motionEvent, MotionEvent motionEvent2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native void m14498(View view, MotionEvent motionEvent);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native void m14499(View view, MotionEvent motionEvent);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native boolean m14500(View view, View view2, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native int m14501(View view, View view2, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native C4802 m14502(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static native boolean m14503(Activity activity, View view, MotionEvent motionEvent, C4802 c4802);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static native boolean m14504(View view, MotionEvent motionEvent, C4802 c4802);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native boolean m14505(Activity activity, View view, MotionEvent motionEvent, int i, C4802 c4802);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native boolean m14506(Activity activity, View view, MotionEvent motionEvent, C4802 c4802);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static native boolean m14507(View view, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static boolean m14508(View view) {
        try {
            Object objectField = XposedHelpers.getObjectField(view, yue_xin_awa(25));
            if (objectField != null) {
                return XposedHelpers.getObjectField(objectField, yue_xin_awa(26)) != null;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static native boolean m14509(View view, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static native void m14510(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static boolean m14511(Class<?> cls) {
        if (cls == null || !View.class.isAssignableFrom(cls)) {
            return false;
        }
        Set<Class<?>> set = f10740;
        synchronized (set) {
            try {
                if (set.contains(cls)) {
                    return true;
                }
                set.add(cls);
                try {
                    C5309.m16287(cls, yue_xin_awa(7), new C0493());
                    return true;
                } catch (Throwable th) {
                    Set<Class<?>> set2 = f10740;
                    synchronized (set2) {
                        set2.remove(cls);
                        m14519(yue_xin_awa(5) + cls.getName() + yue_xin_awa(6) + th.getMessage());
                        return false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static boolean m14512(ClassLoader classLoader, String str) {
        try {
            return m14511(XposedHelpers.findClass(str, classLoader));
        } catch (Throwable th) {
            m14519(yue_xin_awa(5) + str + yue_xin_awa(6) + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static native boolean m14513(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static native boolean m14514(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static native boolean m14515(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m14516(C4802 c4802, Activity activity, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m14517(View view, MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3, MotionEvent motionEvent4);

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m14518(C4802 c4802, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static native void m14519(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static native float[] m14520(ViewGroup viewGroup, View view, float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static native String m14521(String str);

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static native void m14522(MotionEvent motionEvent);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m14523(C4802 c4802);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native Activity m14524(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native EnumC4803 m14525(View view, View view2, float f, float f2);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native void m14526(InterfaceC4800 interfaceC4800);

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static native void m14527(InterfaceC4799 interfaceC4799);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static native void m14528(InterfaceC4801 interfaceC4801);

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static native void m14529(InterfaceC4804 interfaceC4804);

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4802 {

        /* JADX INFO: renamed from: ۥ */
        public long f1122;

        /* JADX INFO: renamed from: ۥ۟ */
        public long f1123;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f10783;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f10784;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f10785;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public long f10786;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f10787;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f10788;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Runnable f10789;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public View f10790;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean f10791;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public Runnable f10792;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public View f10793;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public float f10794;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public float f10795;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f10796;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean f10797;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean f10798;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean f10799;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f10800;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f10801;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public MotionEvent f10802;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public MotionEvent f10803;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public MotionEvent f10804;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4802() {
            this.f1123 = 250L;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:3) call: Yue.ۥ۠ۡۧۢ.ۥ۟۟۟۠.<init>():void type: THIS */
        public /* synthetic */ C4802(C0493 c0493) {
            this();
        }
    }
}
