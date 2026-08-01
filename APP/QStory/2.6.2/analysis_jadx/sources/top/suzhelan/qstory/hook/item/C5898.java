package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p026.InterfaceC6294;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪世兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5898 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[][] f16068 = {new String[]{AbstractC3056.m6668(-3937781868536268199L), AbstractC3056.m6668(-3937781847061431719L)}, new String[]{AbstractC3056.m6668(-3937781718212412839L), AbstractC3056.m6668(-3937781731097314727L)}};

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        String strM6668 = AbstractC3056.m6668(-3937781370320061863L);
        Class cls = Integer.TYPE;
        final int i = 0;
        m11803(Activity.class.getMethod(strM6668, String.class, cls, cls), new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5898 f16069;

            {
                this.f16069 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C5898 c5898 = this.f16069;
                switch (i2) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937713569966327207L);
                        obj.getClass();
                        String str = (String) obj;
                        for (String[] strArr : c5898.f16068) {
                            if (AbstractC4394.m8917(strArr[1], str)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                    default:
                        Object obj2 = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937713569966327207L);
                        obj2.getClass();
                        String str2 = (String) obj2;
                        for (String[] strArr2 : c5898.f16068) {
                            if (AbstractC4394.m8917(strArr2[1], str2)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        m11803(Activity.class.getMethod(AbstractC3056.m6668(-3937781301600585127L), String.class), new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5898 f16069;

            {
                this.f16069 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C5898 c5898 = this.f16069;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937713569966327207L);
                        obj.getClass();
                        String str = (String) obj;
                        for (String[] strArr : c5898.f16068) {
                            if (AbstractC4394.m8917(strArr[1], str)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                    default:
                        Object obj2 = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937713569966327207L);
                        obj2.getClass();
                        String str2 = (String) obj2;
                        for (String[] strArr2 : c5898.f16068) {
                            if (AbstractC4394.m8917(strArr2[1], str2)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937781593658361255L);
    }
}
