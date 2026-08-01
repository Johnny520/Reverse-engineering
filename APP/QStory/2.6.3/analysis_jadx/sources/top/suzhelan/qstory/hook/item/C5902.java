package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import com.bumptech.glide.C3070;
import de.robv.android.xposed.XC_MethodHook;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p027.InterfaceC6317;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p392.C9098;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏兰楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5902 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ThreadLocal f16073 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f16074 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11296() throws NoSuchMethodException {
        C9098 c9098 = new C9098();
        c9098.m14688(AbstractC8405.m13972(2100));
        c9098.m14687(AbstractC8405.m13972(2109), AbstractC8405.m13972(2110));
        Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2111));
        clsM14669.getClass();
        c9098.m14685(String.class, Bitmap.class, Integer.TYPE, String.class, clsM14669);
        Method methodM14689 = c9098.m14689();
        methodM14689.getClass();
        return methodM14689;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        m11297();
        for (Method method : this.f16074) {
            final int i = 0;
            m11831(method, new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5902 f16075;

                {
                    this.f16075 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    String str;
                    int i2 = i;
                    C5902 c5902 = this.f16075;
                    switch (i2) {
                        case 0:
                            c5902.f16073.set(Boolean.TRUE);
                            break;
                        case 1:
                            c5902.f16073.set(Boolean.FALSE);
                            break;
                        case 2:
                            Object obj = methodHookParam.args[0];
                            str = obj instanceof String ? (String) obj : null;
                            if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                                c5902.f16073.set(Boolean.TRUE);
                            }
                            break;
                        case 3:
                            Object obj2 = methodHookParam.args[1];
                            str = obj2 instanceof String ? (String) obj2 : null;
                            if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                                c5902.f16073.set(Boolean.FALSE);
                            }
                            break;
                        default:
                            if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4395.m8907(c5902.f16073.get(), Boolean.TRUE)) {
                                methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            m11830(method, new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5902 f16075;

                {
                    this.f16075 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    String str;
                    int i22 = i2;
                    C5902 c5902 = this.f16075;
                    switch (i22) {
                        case 0:
                            c5902.f16073.set(Boolean.TRUE);
                            break;
                        case 1:
                            c5902.f16073.set(Boolean.FALSE);
                            break;
                        case 2:
                            Object obj = methodHookParam.args[0];
                            str = obj instanceof String ? (String) obj : null;
                            if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                                c5902.f16073.set(Boolean.TRUE);
                            }
                            break;
                        case 3:
                            Object obj2 = methodHookParam.args[1];
                            str = obj2 instanceof String ? (String) obj2 : null;
                            if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                                c5902.f16073.set(Boolean.FALSE);
                            }
                            break;
                        default:
                            if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4395.m8907(c5902.f16073.get(), Boolean.TRUE)) {
                                methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                            }
                            break;
                    }
                }
            });
        }
        Method methodM11296 = m11296();
        final int i3 = 2;
        m11831(methodM11296, new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5902 f16075;

            {
                this.f16075 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i3;
                C5902 c5902 = this.f16075;
                switch (i22) {
                    case 0:
                        c5902.f16073.set(Boolean.TRUE);
                        break;
                    case 1:
                        c5902.f16073.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                            c5902.f16073.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                            c5902.f16073.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4395.m8907(c5902.f16073.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        m11831(methodM11296, new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5902 f16075;

            {
                this.f16075 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i4;
                C5902 c5902 = this.f16075;
                switch (i22) {
                    case 0:
                        c5902.f16073.set(Boolean.TRUE);
                        break;
                    case 1:
                        c5902.f16073.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                            c5902.f16073.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                            c5902.f16073.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4395.m8907(c5902.f16073.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
        final int i5 = 4;
        m11831(Bitmap.class.getDeclaredMethod(AbstractC8405.m13972(2104), Bitmap.CompressFormat.class, Integer.TYPE, OutputStream.class), new InterfaceC6312(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5902 f16075;

            {
                this.f16075 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i5;
                C5902 c5902 = this.f16075;
                switch (i22) {
                    case 0:
                        c5902.f16073.set(Boolean.TRUE);
                        break;
                    case 1:
                        c5902.f16073.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                            c5902.f16073.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5144.m10176(str, AbstractC8405.m13972(2112), false)) {
                            c5902.f16073.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4395.m8907(c5902.f16073.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2103);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) throws NoSuchMethodException {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m11297();
        m11296();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11297() {
        Class<?> declaringClass;
        if (this.f16074.isEmpty()) {
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(2105));
            c9098.m14687(AbstractC8405.m13972(2106));
            Method methodM14686 = c9098.m14686();
            if (methodM14686 == null) {
                C9098 c90982 = new C9098();
                c90982.m14688(AbstractC8405.m13972(2105));
                c90982.m14687(AbstractC8405.m13972(2107), AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜"));
                methodM14686 = c90982.m14686();
            }
            if (methodM14686 == null || (declaringClass = methodM14686.getDeclaringClass()) == null) {
                return;
            }
            Method[] declaredMethods = declaringClass.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (AbstractC4395.m8907(method.getName(), AbstractC8405.m13972(2108))) {
                    arrayList.add(method);
                }
            }
            this.f16074 = arrayList;
        }
    }
}
