package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.C3070;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.MatchType;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p027.InterfaceC6317;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p392.C9098;
import p392.C9099;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5829 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15963;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Method m11239() {
        C9098 c9098 = new C9098();
        c9098.m14688(AbstractC8405.m13972(2225));
        Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2226));
        clsM14669.getClass();
        c9098.m14685(clsM14669);
        c9098.m14687(AbstractC8405.m13972(2227), AbstractC8405.m13972(1431));
        Method methodM14686 = c9098.m14686();
        if (methodM14686 != null) {
            return methodM14686;
        }
        C9098 c90982 = new C9098();
        c90982.m14688(AbstractC8405.m13972(2225));
        Class clsM146692 = AbstractC9090.m14669(AbstractC8405.m13972(160));
        clsM146692.getClass();
        c90982.m14685(clsM146692);
        c90982.m14687(AbstractC8405.m13972(2227), AbstractC8405.m13972(1431));
        Method methodM146862 = c90982.m14686();
        if (methodM146862 != null) {
            return methodM146862;
        }
        C9098 c90983 = new C9098();
        c90983.m14688(AbstractC8405.m13972(2225));
        Class clsM146693 = AbstractC9090.m14669(AbstractC8405.m13972(160));
        clsM146693.getClass();
        c90983.m14685(clsM146693);
        c90983.m14687(AbstractC8405.m13972(2228));
        return c90983.m14686();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11240() throws NoSuchFieldException, NoSuchMethodException {
        Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(160));
        clsM14669.getClass();
        Method method = clsM14669.getMethod(AbstractC8405.m13972(164), null);
        Field field = method.getReturnType().getField(AbstractC8405.m13972(2229));
        C9098 c9098 = new C9098();
        c9098.m14688(AbstractC8405.m13972(2230));
        c9098.f25493 = Boolean.TYPE;
        c9098.m14685(clsM14669);
        c9098.f25500.addAll(Arrays.asList(method));
        Field field2 = new Field[]{field}[0];
        C9099 c9099 = new C9099();
        c9099.f25508 = field2.getDeclaringClass();
        c9099.f25507 = field2.getName();
        c9099.f25506 = field2.getType();
        c9099.f25505 = field2.getModifiers();
        c9099.f25510 = MatchType.Equals;
        c9098.f25498.add(c9099);
        return c9098.m14686();
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws NoSuchFieldException, NoSuchMethodException {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method methodM11240 = m11240();
        Method methodM11239 = m11239();
        if (methodM11240 == null) {
            m11831(methodM11239, new C5869(9));
            return;
        }
        final int i = 0;
        m11831(methodM11239, new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5829 f15971;

            {
                this.f15971 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C5829 c5829 = this.f15971;
                switch (i2) {
                    case 0:
                        c5829.f15963 = true;
                        break;
                    case 1:
                        c5829.f15963 = false;
                        break;
                    default:
                        if (c5829.f15963) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        m11830(methodM11239, new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5829 f15971;

            {
                this.f15971 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C5829 c5829 = this.f15971;
                switch (i22) {
                    case 0:
                        c5829.f15963 = true;
                        break;
                    case 1:
                        c5829.f15963 = false;
                        break;
                    default:
                        if (c5829.f15963) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        m11831(methodM11240, new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5829 f15971;

            {
                this.f15971 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i3;
                C5829 c5829 = this.f15971;
                switch (i22) {
                    case 0:
                        c5829.f15963 = true;
                        break;
                    case 1:
                        c5829.f15963 = false;
                        break;
                    default:
                        if (c5829.f15963) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) throws NoSuchFieldException, NoSuchMethodException {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m11240();
        m11239();
    }
}
