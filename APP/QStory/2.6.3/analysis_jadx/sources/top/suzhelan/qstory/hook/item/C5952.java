package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;
import p389.C9086;
import p389.C9092;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5952 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5956 f16149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16150;

    public /* synthetic */ C5952(C5956 c5956, int i) {
        this.f16150 = i;
        this.f16149 = c5956;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16150;
        C5956 c5956 = this.f16149;
        switch (i) {
            case 0:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c5956.f17425.booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    try {
                        C9086.m14664(obj, AbstractC8405.m13973("喵喵呜呜呜喵呜喵"), Boolean.FALSE);
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        C9086.m14664(obj, AbstractC8405.m13973("喵喵呜呜喵呜呜喵"), Boolean.FALSE);
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        C9086.m14664(obj, AbstractC8405.m13973("喵喵呜呜喵呜呜呜"), Boolean.FALSE);
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                }
                break;
            case 1:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c5956.f17425.booleanValue()) {
                    Object obj2 = methodHookParam.args[0];
                    try {
                        C9092 c9092M14671 = C9092.m14671(obj2);
                        c9092M14671.f25481 = AbstractC8405.m13972(1942);
                        c9092M14671.m14674(obj2, new Object[0]);
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
        switch (this.f16150) {
            case 2:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (this.f16149.f17425.booleanValue()) {
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
