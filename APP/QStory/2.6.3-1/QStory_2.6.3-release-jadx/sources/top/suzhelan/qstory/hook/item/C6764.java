package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.concurrent.CopyOnWriteArraySet;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6764 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6780 f16466;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16467;

    public /* synthetic */ C6764(C6780 c6780, int i) {
        this.f16467 = i;
        this.f16466 = c6780;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        int i = this.f16467;
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C6780 c6780 = this.f16466;
                CopyOnWriteArraySet copyOnWriteArraySet = c6780.f16489;
                if (c6780.f17770.booleanValue()) {
                    c6780.m11883();
                    Object[] objArr = methodHookParam.args;
                    AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
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
                                AbstractC9234.m14531(2025);
                                interfaces.getClass();
                                for (Class<?> cls : interfaces) {
                                    if (!cls.getName().equals(AbstractC9234.m14531(2026))) {
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
                                XposedHelpers.findAndHookMethod(cls2, AbstractC9234.m14531(2038), new Object[]{AbstractC9234.m14531(2039), Integer.TYPE, String.class, new C6764(c6780, 1)});
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
                    this.f16466.m11882(obj2.getClass());
                }
                break;
            case 2:
                if (this.f16466.f17770.booleanValue()) {
                    methodHookParam.setResult(Double.valueOf(this.f16466.f16492));
                }
                break;
            case 3:
                if (this.f16466.f17770.booleanValue()) {
                    methodHookParam.setResult(Double.valueOf(this.f16466.f16493));
                }
                break;
            default:
                C6780 c67802 = this.f16466;
                if (c67802.f17770.booleanValue()) {
                    c67802.m11883();
                    Object obj3 = methodHookParam.args[0];
                    if (obj3 != null) {
                        c67802.m11882(obj3.getClass());
                    }
                    break;
                }
                break;
        }
    }
}
