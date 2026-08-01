package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XC_MethodHook;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p392.AbstractC9121;
import p394.C9127;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5897 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ThreadLocal f16066 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f16067 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11235() throws NoSuchMethodException {
        C9127 c9127 = new C9127();
        c9127.m14689(AbstractC3056.m6668(-3937778234993935783L));
        c9127.m14688(AbstractC3056.m6668(-3937777444719953319L), AbstractC3056.m6668(-3937777371705509287L));
        Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937777260036359591L));
        clsM14657.getClass();
        c9127.m14690(String.class, Bitmap.class, Integer.TYPE, String.class, clsM14657);
        Method methodM14692 = c9127.m14692();
        methodM14692.getClass();
        return methodM14692;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        m11236();
        for (Method method : this.f16067) {
            final int i = 0;
            m11803(method, new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪兰苏

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5897 f16064;

                {
                    this.f16064 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    String str;
                    int i2 = i;
                    C5897 c5897 = this.f16064;
                    switch (i2) {
                        case 0:
                            c5897.f16066.set(Boolean.TRUE);
                            break;
                        case 1:
                            c5897.f16066.set(Boolean.FALSE);
                            break;
                        case 2:
                            Object obj = methodHookParam.args[0];
                            str = obj instanceof String ? (String) obj : null;
                            if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                                c5897.f16066.set(Boolean.TRUE);
                            }
                            break;
                        case 3:
                            Object obj2 = methodHookParam.args[1];
                            str = obj2 instanceof String ? (String) obj2 : null;
                            if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                                c5897.f16066.set(Boolean.FALSE);
                            }
                            break;
                        default:
                            if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4394.m8917(c5897.f16066.get(), Boolean.TRUE)) {
                                methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            m11802(method, new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪兰苏

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5897 f16064;

                {
                    this.f16064 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    String str;
                    int i22 = i2;
                    C5897 c5897 = this.f16064;
                    switch (i22) {
                        case 0:
                            c5897.f16066.set(Boolean.TRUE);
                            break;
                        case 1:
                            c5897.f16066.set(Boolean.FALSE);
                            break;
                        case 2:
                            Object obj = methodHookParam.args[0];
                            str = obj instanceof String ? (String) obj : null;
                            if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                                c5897.f16066.set(Boolean.TRUE);
                            }
                            break;
                        case 3:
                            Object obj2 = methodHookParam.args[1];
                            str = obj2 instanceof String ? (String) obj2 : null;
                            if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                                c5897.f16066.set(Boolean.FALSE);
                            }
                            break;
                        default:
                            if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4394.m8917(c5897.f16066.get(), Boolean.TRUE)) {
                                methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                            }
                            break;
                    }
                }
            });
        }
        Method methodM11235 = m11235();
        final int i3 = 2;
        m11803(methodM11235, new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5897 f16064;

            {
                this.f16064 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i3;
                C5897 c5897 = this.f16064;
                switch (i22) {
                    case 0:
                        c5897.f16066.set(Boolean.TRUE);
                        break;
                    case 1:
                        c5897.f16066.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                            c5897.f16066.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                            c5897.f16066.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4394.m8917(c5897.f16066.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        m11803(methodM11235, new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5897 f16064;

            {
                this.f16064 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i4;
                C5897 c5897 = this.f16064;
                switch (i22) {
                    case 0:
                        c5897.f16066.set(Boolean.TRUE);
                        break;
                    case 1:
                        c5897.f16066.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                            c5897.f16066.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                            c5897.f16066.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4394.m8917(c5897.f16066.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
        final int i5 = 4;
        m11803(Bitmap.class.getDeclaredMethod(AbstractC3056.m6668(-3937777749662631335L), Bitmap.CompressFormat.class, Integer.TYPE, OutputStream.class), new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5897 f16064;

            {
                this.f16064 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i5;
                C5897 c5897 = this.f16064;
                switch (i22) {
                    case 0:
                        c5897.f16066.set(Boolean.TRUE);
                        break;
                    case 1:
                        c5897.f16066.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                            c5897.f16066.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5143.m10171(str, AbstractC3056.m6668(-3937777006633289127L), false)) {
                            c5897.f16066.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC4394.m8917(c5897.f16066.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937777912871388583L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) throws NoSuchMethodException {
        AbstractC3056.m6668(-3937729770582967719L);
        m11236();
        m11235();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11236() {
        Class<?> declaringClass;
        if (this.f16067.isEmpty()) {
            C9127 c9127 = new C9127();
            c9127.m14689(AbstractC3056.m6668(-3937777788317336999L));
            c9127.m14688(AbstractC3056.m6668(-3937777564979037607L));
            Method methodM14693 = c9127.m14693();
            if (methodM14693 == null) {
                C9127 c91272 = new C9127();
                c91272.m14689(AbstractC3056.m6668(-3937777788317336999L));
                c91272.m14688(AbstractC3056.m6668(-3937777590748841383L), AbstractC3056.m6668(-3937777534914266535L));
                methodM14693 = c91272.m14693();
            }
            if (methodM14693 == null || (declaringClass = methodM14693.getDeclaringClass()) == null) {
                return;
            }
            Method[] declaredMethods = declaringClass.getDeclaredMethods();
            AbstractC3056.m6668(-3937714304405734823L);
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (AbstractC4394.m8917(method.getName(), AbstractC3056.m6668(-3937777517734397351L))) {
                    arrayList.add(method);
                }
            }
            this.f16067 = arrayList;
        }
    }
}
