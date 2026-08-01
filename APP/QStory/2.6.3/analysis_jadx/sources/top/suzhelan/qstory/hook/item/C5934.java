package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.concurrent.CopyOnWriteArraySet;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5934 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5950 f16121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16122;

    public /* synthetic */ C5934(C5950 c5950, int i) {
        this.f16122 = i;
        this.f16121 = c5950;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        int i = this.f16122;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C5950 c5950 = this.f16121;
                CopyOnWriteArraySet copyOnWriteArraySet = c5950.f16144;
                if (c5950.f17425.booleanValue()) {
                    c5950.m11324();
                    Object[] objArr = methodHookParam.args;
                    AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                    objArr.getClass();
                    int length = objArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            obj = null;
                        } else {
                            obj = objArr[i2];
                            if (obj != null) {
                                Class<?>[] interfaces = obj.getClass().getInterfaces();
                                AbstractC8405.m13972(2025);
                                interfaces.getClass();
                                for (Class<?> cls : interfaces) {
                                    if (!cls.getName().equals(AbstractC8405.m13972(2026))) {
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (!copyOnWriteArraySet.contains(cls2.getName())) {
                            copyOnWriteArraySet.add(cls2.getName());
                            try {
                                XposedHelpers.findAndHookMethod(cls2, AbstractC8405.m13972(2038), new Object[]{AbstractC8405.m13972(2039), Integer.TYPE, String.class, new C5934(c5950, 1)});
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                Object obj2 = methodHookParam.args[0];
                if (obj2 != null) {
                    this.f16121.m11323(obj2.getClass());
                }
                break;
            case 2:
                if (this.f16121.f17425.booleanValue()) {
                    methodHookParam.setResult(Double.valueOf(this.f16121.f16147));
                }
                break;
            case 3:
                if (this.f16121.f17425.booleanValue()) {
                    methodHookParam.setResult(Double.valueOf(this.f16121.f16148));
                }
                break;
            default:
                C5950 c59502 = this.f16121;
                if (c59502.f17425.booleanValue()) {
                    c59502.m11324();
                    Object obj3 = methodHookParam.args[0];
                    if (obj3 != null) {
                        c59502.m11323(obj3.getClass());
                    }
                    break;
                }
                break;
        }
    }
}
