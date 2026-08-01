package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p050.AbstractC7173;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6648;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6708 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashSet f16397 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f16398 = 682529568;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(873));
        final int i = 0;
        if (AbstractC7187.f17853 >= 5626) {
            m12389(classLoader.loadClass(AbstractC9234.m14531(160)).getDeclaredMethod(AbstractC9234.m14531(164), null), new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰苏楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6708 f16405;

                {
                    this.f16405 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2 = i;
                    Class cls = Long.TYPE;
                    C6708 c6708 = this.f16405;
                    switch (i2) {
                        case 0:
                            Object result = methodHookParam.getResult();
                            Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(1917), result);
                            if (num != null && num.intValue() == 8194) {
                                AbstractC7165.m12424(result, AbstractC9234.m14531(1917), 2);
                                c6708.f16397.add((Long) AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), result));
                            }
                            break;
                        default:
                            Object result2 = methodHookParam.getResult();
                            AbstractC9234.m14531(1866);
                            result2.getClass();
                            if (((Integer) result2).intValue() == 8194) {
                                methodHookParam.setResult(2);
                                c6708.f16397.add((Long) AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), methodHookParam.thisObject));
                            }
                            break;
                    }
                }
            });
        } else {
            final int i2 = 1;
            m12389(clsLoadClass.getDeclaredMethod(AbstractC9234.m14531(1911), null), new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰苏楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6708 f16405;

                {
                    this.f16405 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i22 = i2;
                    Class cls = Long.TYPE;
                    C6708 c6708 = this.f16405;
                    switch (i22) {
                        case 0:
                            Object result = methodHookParam.getResult();
                            Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(1917), result);
                            if (num != null && num.intValue() == 8194) {
                                AbstractC7165.m12424(result, AbstractC9234.m14531(1917), 2);
                                c6708.f16397.add((Long) AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), result));
                            }
                            break;
                        default:
                            Object result2 = methodHookParam.getResult();
                            AbstractC9234.m14531(1866);
                            result2.getClass();
                            if (((Integer) result2).intValue() == 8194) {
                                methodHookParam.setResult(2);
                                c6708.f16397.add((Long) AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), methodHookParam.thisObject));
                            }
                            break;
                    }
                }
            });
        }
        HashMap map = C6648.f16294;
        AbstractC7173.m12433(this, new C6709(this, 0));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1910);
    }
}
