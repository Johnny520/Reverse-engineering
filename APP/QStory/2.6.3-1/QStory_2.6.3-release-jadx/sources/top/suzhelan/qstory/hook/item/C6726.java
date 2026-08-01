package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6726 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6725 f16416;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16417;

    public /* synthetic */ C6726(C6725 c6725, int i) {
        this.f16417 = i;
        this.f16416 = c6725;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16417;
        C6725 c6725 = this.f16416;
        switch (i) {
            case 0:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c6725.f17770.booleanValue()) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                    objArr.getClass();
                    if (objArr.length != 0) {
                        try {
                            Object obj = methodHookParam.args[0];
                            Field declaredField = obj.getClass().getDeclaredField(AbstractC9234.m14531(1868));
                            Field declaredField2 = obj.getClass().getDeclaredField(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵"));
                            declaredField.setAccessible(true);
                            declaredField2.setAccessible(true);
                            declaredField.set(obj, 0);
                            declaredField2.set(obj, 0);
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c6725.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            default:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c6725.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
        }
    }
}
