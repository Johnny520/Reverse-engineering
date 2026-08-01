package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import p303.AbstractC9234;
import p405.C9915;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6782 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6786 f16494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16495;

    public /* synthetic */ C6782(C6786 c6786, int i) {
        this.f16495 = i;
        this.f16494 = c6786;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16495;
        C6786 c6786 = this.f16494;
        switch (i) {
            case 0:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c6786.f17770.booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    try {
                        C9915.m15223(obj, AbstractC9234.m14532("喵喵呜呜呜喵呜喵"), Boolean.FALSE);
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        C9915.m15223(obj, AbstractC9234.m14532("喵喵呜呜喵呜呜喵"), Boolean.FALSE);
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        C9915.m15223(obj, AbstractC9234.m14532("喵喵呜呜喵呜呜呜"), Boolean.FALSE);
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                }
                break;
            case 1:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c6786.f17770.booleanValue()) {
                    Object obj2 = methodHookParam.args[0];
                    try {
                        C9921 c9921M15230 = C9921.m15230(obj2);
                        c9921M15230.f25826 = AbstractC9234.m14531(1942);
                        c9921M15230.m15233(obj2, new Object[0]);
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
        switch (this.f16495) {
            case 2:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (this.f16494.f17770.booleanValue()) {
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
