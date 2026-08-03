package p364y8;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import p099h.Hchat.utils.KavaReflector;
import p126ia.C2026t;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: y8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6002b extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6004d f24368b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6002b(C6004d c6004d, int i9) {
        this.f24367a = i9;
        this.f24368b = c6004d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int iIntValue;
        Method methodFindMethodRecursive;
        XC_MethodHook.Unhook c3959f;
        switch (this.f24367a) {
            case 0:
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                obj.getClass();
                Object objM10756b = C6004d.m10756b(obj, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                Activity activity = objM10756b instanceof Activity ? (Activity) objM10756b : null;
                if (activity != null) {
                    Object[] objArr = methodHookParam.args;
                    objArr.getClass();
                    Object objM8391z0 = AbstractC4165l.m8391z0(objArr);
                    Number number = objM8391z0 instanceof Number ? (Number) objM8391z0 : null;
                    if (number != null) {
                        this.f24368b.m10757c(activity, number.intValue(), 80L);
                    }
                }
                break;
            case 1:
                C6004d c6004d = this.f24368b;
                C2026t c2026t = c6004d.f24375a;
                methodHookParam.getClass();
                Object obj2 = methodHookParam.thisObject;
                Integer numValueOf = null;
                Activity activity2 = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity2 != null) {
                    LinkedHashSet linkedHashSet = c6004d.f24381g;
                    Object objM10756b2 = C6004d.m10756b(activity2, "androidx.viewpager.widget.ViewPager$OnPageChangeListener");
                    if (objM10756b2 != null) {
                        Class<?> cls = objM10756b2.getClass();
                        Class cls2 = Integer.TYPE;
                        cls2.getClass();
                        Method methodFindMethodRecursive2 = KavaReflector.findMethodRecursive(cls, "onPageSelected", cls2);
                        if (C6004d.m10755a(methodFindMethodRecursive2)) {
                            methodFindMethodRecursive2.getClass();
                            if (linkedHashSet.add(methodFindMethodRecursive2)) {
                                try {
                                    c3959f = C3744i.f12154b.m7763b(methodFindMethodRecursive2, new C6002b(c6004d, 0));
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b != null) {
                                    linkedHashSet.remove(methodFindMethodRecursive2);
                                    if (!c6004d.f24382h) {
                                        c6004d.f24382h = true;
                                        c2026t.invoke("安装聊天媒体翻页 Hook 失败", thM8182b);
                                    }
                                }
                            }
                        } else if (!c6004d.f24382h) {
                            c6004d.f24382h = true;
                            c2026t.invoke("未找到聊天媒体翻页回调", null);
                        }
                    } else if (!c6004d.f24382h) {
                        c6004d.f24382h = true;
                        c2026t.invoke("未找到聊天媒体翻页监听器", null);
                    }
                    Object objM10756b3 = C6004d.m10756b(activity2, "com.tencent.mm.ui.base.MMViewPager");
                    if (objM10756b3 != null && (methodFindMethodRecursive = KavaReflector.findMethodRecursive(objM10756b3.getClass(), "getCurrentItem", new Class[0])) != null) {
                        Object objInvoke = KavaReflector.invoke(methodFindMethodRecursive, objM10756b3, new Object[0]);
                        Number number2 = objInvoke instanceof Number ? (Number) objInvoke : null;
                        if (number2 != null) {
                            numValueOf = Integer.valueOf(number2.intValue());
                        }
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer num = (Integer) c6004d.f24379e.get(activity2);
                        iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
                    }
                    c6004d.m10757c(activity2, iIntValue, 0L);
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f24367a) {
            case 2:
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    C6004d c6004d = this.f24368b;
                    Runnable runnable = (Runnable) c6004d.f24378d.remove(activity);
                    if (runnable != null) {
                        c6004d.f24377c.removeCallbacks(runnable);
                    }
                    c6004d.f24379e.remove(activity);
                    c6004d.f24380f.remove(activity);
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
