package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import p392.C9117;
import p392.C9125;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5947 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5946 f16135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16136;

    public /* synthetic */ C5947(C5946 c5946, int i) {
        this.f16136 = i;
        this.f16135 = c5946;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16136;
        C5946 c5946 = this.f16135;
        switch (i) {
            case 0:
                "param";
                methodHookParam.getClass();
                if (c5946.f17376.booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    try {
                        C9117.m14650(obj, "I", Boolean.FALSE);
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        C9117.m14650(obj, "E", Boolean.FALSE);
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        C9117.m14650(obj, "D", Boolean.FALSE);
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                }
                break;
            case 1:
                "param";
                methodHookParam.getClass();
                if (c5946.f17376.booleanValue()) {
                    Object obj2 = methodHookParam.args[0];
                    try {
                        C9125 c9125M14679 = C9125.m14679(obj2);
                        c9125M14679.f25504 = "finishRefresh";
                        c9125M14679.m14682(obj2, new Object[0]);
                    } catch (Exception unused4) {
                        return;
                    }
                    break;
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16136) {
            case 2:
                "param";
                methodHookParam.getClass();
                if (this.f16135.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                    break;
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
