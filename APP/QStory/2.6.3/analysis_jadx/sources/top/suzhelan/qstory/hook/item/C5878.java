package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p034.AbstractC6344;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5818;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5878 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashSet f16052 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f16053 = 682529568;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(873));
        final int i = 0;
        if (AbstractC6358.f17508 >= 5626) {
            m11830(classLoader.loadClass(AbstractC8405.m13972(160)).getDeclaredMethod(AbstractC8405.m13972(164), null), new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰苏楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5878 f16060;

                {
                    this.f16060 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2 = i;
                    Class cls = Long.TYPE;
                    C5878 c5878 = this.f16060;
                    switch (i2) {
                        case 0:
                            Object result = methodHookParam.getResult();
                            Integer num = (Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(1917), result);
                            if (num != null && num.intValue() == 8194) {
                                AbstractC6336.m11865(result, AbstractC8405.m13972(1917), 2);
                                c5878.f16052.add((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), result));
                            }
                            break;
                        default:
                            Object result2 = methodHookParam.getResult();
                            AbstractC8405.m13972(1866);
                            result2.getClass();
                            if (((Integer) result2).intValue() == 8194) {
                                methodHookParam.setResult(2);
                                c5878.f16052.add((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), methodHookParam.thisObject));
                            }
                            break;
                    }
                }
            });
        } else {
            final int i2 = 1;
            m11830(clsLoadClass.getDeclaredMethod(AbstractC8405.m13972(1911), null), new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰苏楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5878 f16060;

                {
                    this.f16060 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i22 = i2;
                    Class cls = Long.TYPE;
                    C5878 c5878 = this.f16060;
                    switch (i22) {
                        case 0:
                            Object result = methodHookParam.getResult();
                            Integer num = (Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(1917), result);
                            if (num != null && num.intValue() == 8194) {
                                AbstractC6336.m11865(result, AbstractC8405.m13972(1917), 2);
                                c5878.f16052.add((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), result));
                            }
                            break;
                        default:
                            Object result2 = methodHookParam.getResult();
                            AbstractC8405.m13972(1866);
                            result2.getClass();
                            if (((Integer) result2).intValue() == 8194) {
                                methodHookParam.setResult(2);
                                c5878.f16052.add((Long) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), methodHookParam.thisObject));
                            }
                            break;
                    }
                }
            });
        }
        HashMap map = C5818.f15949;
        AbstractC6344.m11874(this, new C5879(this, 0));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1910);
    }
}
