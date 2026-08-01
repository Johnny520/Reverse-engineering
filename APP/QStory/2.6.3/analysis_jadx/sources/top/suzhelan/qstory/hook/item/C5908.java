package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5908 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[][] f16081 = {new String[]{AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜喵呜呜呜喵~呜呜喵喵喵喵呜喵~呜喵喵喵呜呜呜喵~呜呜呜呜呜喵喵呜~呜呜喵呜喵呜呜喵"), AbstractC8405.m13972(2069)}, new String[]{AbstractC8405.m13973("呜喵喵呜呜喵呜呜~呜呜喵呜呜喵呜喵~呜呜喵呜喵呜呜呜~呜喵喵喵喵喵喵呜~呜呜呜呜呜喵呜喵~呜呜喵呜呜呜呜呜"), AbstractC8405.m13972(2070)}};

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        String strM13972 = AbstractC8405.m13972(2072);
        Class cls = Integer.TYPE;
        final int i = 0;
        m11831(Activity.class.getMethod(strM13972, String.class, cls, cls), new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5908 f16077;

            {
                this.f16077 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C5908 c5908 = this.f16077;
                switch (i2) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        AbstractC8405.m13972(1559);
                        obj.getClass();
                        String str = (String) obj;
                        for (String[] strArr : c5908.f16081) {
                            if (AbstractC4395.m8907(strArr[1], str)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                    default:
                        Object obj2 = methodHookParam.args[0];
                        AbstractC8405.m13972(1559);
                        obj2.getClass();
                        String str2 = (String) obj2;
                        for (String[] strArr2 : c5908.f16081) {
                            if (AbstractC4395.m8907(strArr2[1], str2)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        m11831(Activity.class.getMethod(AbstractC8405.m13972(2073), String.class), new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5908 f16077;

            {
                this.f16077 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C5908 c5908 = this.f16077;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        AbstractC8405.m13972(1559);
                        obj.getClass();
                        String str = (String) obj;
                        for (String[] strArr : c5908.f16081) {
                            if (AbstractC4395.m8907(strArr[1], str)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                    default:
                        Object obj2 = methodHookParam.args[0];
                        AbstractC8405.m13972(1559);
                        obj2.getClass();
                        String str2 = (String) obj2;
                        for (String[] strArr2 : c5908.f16081) {
                            if (AbstractC4395.m8907(strArr2[1], str2)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2071);
    }
}
