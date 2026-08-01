package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.MatchType;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p392.AbstractC9121;
import p394.C9127;
import p394.C9128;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪苏兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5827 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15962;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Method m11184() {
        C9127 c9127 = new C9127();
        c9127.m14689(AbstractC3056.m6668(-3937799211614209447L));
        Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937799069880288679L));
        clsM14657.getClass();
        c9127.m14690(clsM14657);
        c9127.m14688(AbstractC3056.m6668(-3937798919556433319L), AbstractC3056.m6668(-3937694487426631079L));
        Method methodM14693 = c9127.m14693();
        if (methodM14693 != null) {
            return methodM14693;
        }
        C9127 c91272 = new C9127();
        c91272.m14689(AbstractC3056.m6668(-3937799211614209447L));
        Class clsM146572 = AbstractC9121.m14657(AbstractC3056.m6668(-3937564551781025191L));
        clsM146572.getClass();
        c91272.m14690(clsM146572);
        c91272.m14688(AbstractC3056.m6668(-3937798919556433319L), AbstractC3056.m6668(-3937694487426631079L));
        Method methodM146932 = c91272.m14693();
        if (methodM146932 != null) {
            return methodM146932;
        }
        C9127 c91273 = new C9127();
        c91273.m14689(AbstractC3056.m6668(-3937799211614209447L));
        Class clsM146573 = AbstractC9121.m14657(AbstractC3056.m6668(-3937564551781025191L));
        clsM146573.getClass();
        c91273.m14690(clsM146573);
        c91273.m14688(AbstractC3056.m6668(-3937798958211138983L));
        return c91273.m14693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11185() throws NoSuchFieldException, NoSuchMethodException {
        Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937564551781025191L));
        clsM14657.getClass();
        Method method = clsM14657.getMethod(AbstractC3056.m6668(-3937563495219070375L), null);
        Field field = method.getReturnType().getField(AbstractC3056.m6668(-3937798837952054695L));
        C9127 c9127 = new C9127();
        c9127.m14689(AbstractC3056.m6668(-3937798773527545255L));
        c9127.f25516 = Boolean.TYPE;
        c9127.m14690(clsM14657);
        c9127.f25523.addAll(Arrays.asList(method));
        Field field2 = new Field[]{field}[0];
        C9128 c9128 = new C9128();
        c9128.f25531 = field2.getDeclaringClass();
        c9128.f25530 = field2.getName();
        c9128.f25529 = field2.getType();
        c9128.f25528 = field2.getModifiers();
        c9128.f25533 = MatchType.Equals;
        c9127.f25521.add(c9128);
        return c9127.m14693();
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws NoSuchFieldException, NoSuchMethodException {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Method methodM11185 = m11185();
        Method methodM11184 = m11184();
        if (methodM11185 == null) {
            m11803(methodM11184, new C5864(9));
            return;
        }
        final int i = 0;
        m11803(methodM11184, new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰哲楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5827 f15981;

            {
                this.f15981 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C5827 c5827 = this.f15981;
                switch (i2) {
                    case 0:
                        c5827.f15962 = true;
                        break;
                    case 1:
                        c5827.f15962 = false;
                        break;
                    default:
                        if (c5827.f15962) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        m11802(methodM11184, new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰哲楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5827 f15981;

            {
                this.f15981 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C5827 c5827 = this.f15981;
                switch (i22) {
                    case 0:
                        c5827.f15962 = true;
                        break;
                    case 1:
                        c5827.f15962 = false;
                        break;
                    default:
                        if (c5827.f15962) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        m11803(methodM11185, new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰哲楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5827 f15981;

            {
                this.f15981 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i3;
                C5827 c5827 = this.f15981;
                switch (i22) {
                    case 0:
                        c5827.f15962 = true;
                        break;
                    case 1:
                        c5827.f15962 = false;
                        break;
                    default:
                        if (c5827.f15962) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) throws NoSuchFieldException, NoSuchMethodException {
        AbstractC3056.m6668(-3937729770582967719L);
        m11185();
        m11184();
    }
}
