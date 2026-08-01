package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.C3902;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.enums.MatchType;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p043.InterfaceC7146;
import p303.AbstractC9234;
import p405.AbstractC9919;
import p408.C9927;
import p408.C9928;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6659 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f16308;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Method m11798() {
        C9927 c9927 = new C9927();
        c9927.m15247(AbstractC9234.m14531(2225));
        Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(2226));
        clsM15228.getClass();
        c9927.m15244(clsM15228);
        c9927.m15246(AbstractC9234.m14531(2227), AbstractC9234.m14531(1431));
        Method methodM15245 = c9927.m15245();
        if (methodM15245 != null) {
            return methodM15245;
        }
        C9927 c99272 = new C9927();
        c99272.m15247(AbstractC9234.m14531(2225));
        Class clsM152282 = AbstractC9919.m15228(AbstractC9234.m14531(160));
        clsM152282.getClass();
        c99272.m15244(clsM152282);
        c99272.m15246(AbstractC9234.m14531(2227), AbstractC9234.m14531(1431));
        Method methodM152452 = c99272.m15245();
        if (methodM152452 != null) {
            return methodM152452;
        }
        C9927 c99273 = new C9927();
        c99273.m15247(AbstractC9234.m14531(2225));
        Class clsM152283 = AbstractC9919.m15228(AbstractC9234.m14531(160));
        clsM152283.getClass();
        c99273.m15244(clsM152283);
        c99273.m15246(AbstractC9234.m14531(2228));
        return c99273.m15245();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11799() throws NoSuchFieldException, NoSuchMethodException {
        Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(160));
        clsM15228.getClass();
        Method method = clsM15228.getMethod(AbstractC9234.m14531(164), null);
        Field field = method.getReturnType().getField(AbstractC9234.m14531(2229));
        C9927 c9927 = new C9927();
        c9927.m15247(AbstractC9234.m14531(2230));
        c9927.f25838 = Boolean.TYPE;
        c9927.m15244(clsM15228);
        c9927.f25845.addAll(Arrays.asList(method));
        Field field2 = new Field[]{field}[0];
        C9928 c9928 = new C9928();
        c9928.f25853 = field2.getDeclaringClass();
        c9928.f25852 = field2.getName();
        c9928.f25851 = field2.getType();
        c9928.f25850 = field2.getModifiers();
        c9928.f25855 = MatchType.Equals;
        c9927.f25843.add(c9928);
        return c9927.m15245();
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws NoSuchFieldException, NoSuchMethodException {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Method methodM11799 = m11799();
        Method methodM11798 = m11798();
        if (methodM11799 == null) {
            m12390(methodM11798, new C6699(9));
            return;
        }
        final int i = 0;
        m12390(methodM11798, new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6659 f16316;

            {
                this.f16316 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C6659 c6659 = this.f16316;
                switch (i2) {
                    case 0:
                        c6659.f16308 = true;
                        break;
                    case 1:
                        c6659.f16308 = false;
                        break;
                    default:
                        if (c6659.f16308) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        m12389(methodM11798, new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6659 f16316;

            {
                this.f16316 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C6659 c6659 = this.f16316;
                switch (i22) {
                    case 0:
                        c6659.f16308 = true;
                        break;
                    case 1:
                        c6659.f16308 = false;
                        break;
                    default:
                        if (c6659.f16308) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        m12390(methodM11799, new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6659 f16316;

            {
                this.f16316 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i3;
                C6659 c6659 = this.f16316;
                switch (i22) {
                    case 0:
                        c6659.f16308 = true;
                        break;
                    case 1:
                        c6659.f16308 = false;
                        break;
                    default:
                        if (c6659.f16308) {
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                        break;
                }
            }
        });
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) throws NoSuchFieldException, NoSuchMethodException {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m11799();
        m11798();
    }
}
