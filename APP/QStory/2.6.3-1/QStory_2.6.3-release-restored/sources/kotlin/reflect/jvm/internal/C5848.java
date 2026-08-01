package kotlin.reflect.jvm.internal;

import androidx.compose.p001ui.semantics.C2780;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3897;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.C5362;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.C5370;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.text.Regex;
import net.bytebuddy.utility.JavaConstant;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5848 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14822;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5848 f14820 = new C5848(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5848 f14821 = new C5848(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5848 f14815 = new C5848(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5848 f14814 = new C5848(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5848 f14818 = new C5848(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5848 f14819 = new C5848(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C5848 f14816 = new C5848(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5848 f14817 = new C5848(7);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C5848 f14807 = new C5848(8);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5848 f14806 = new C5848(9);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5848 f14805 = new C5848(10);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C5848 f14804 = new C5848(11);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C5848 f14803 = new C5848(12);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C5848 f14802 = new C5848(13);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C5848 f14813 = new C5848(14);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C5848 f14812 = new C5848(15);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C5848 f14811 = new C5848(16);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C5848 f14810 = new C5848(17);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C5848 f14809 = new C5848(18);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C5848 f14808 = new C5848(19);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C5848 f14799 = new C5848(20);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C5848 f14798 = new C5848(21);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C5848 f14801 = new C5848(22);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C5848 f14800 = new C5848(23);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C5848 f14796 = new C5848(24);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final C5848 f14797 = new C5848(25);

    public /* synthetic */ C5848(int i) {
        this.f14822 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f14822) {
            case 0:
                Class cls = (Class) obj;
                C5846 c5846 = AbstractC5847.f14795;
                cls.getClass();
                return new C5836(cls);
            case 1:
                Class cls2 = (Class) obj;
                C5846 c58462 = AbstractC5847.f14795;
                cls2.getClass();
                return new C5824(cls2);
            case 2:
                Class cls3 = (Class) obj;
                C5846 c58463 = AbstractC5847.f14795;
                cls3.getClass();
                C5836 c5836M10548 = AbstractC5847.m10548(cls3);
                EmptyList emptyList = EmptyList.INSTANCE;
                return AbstractC5238.m9490(c5836M10548, emptyList, false, emptyList);
            case 3:
                Class cls4 = (Class) obj;
                C5846 c58464 = AbstractC5847.f14795;
                cls4.getClass();
                C5836 c5836M105482 = AbstractC5847.m10548(cls4);
                EmptyList emptyList2 = EmptyList.INSTANCE;
                return AbstractC5238.m9490(c5836M105482, emptyList2, true, emptyList2);
            case 4:
                C5846 c58465 = AbstractC5847.f14795;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 5:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object objM9384 = AbstractC5179.m9384(bounds);
                if (objM9384 instanceof TypeVariable) {
                    return (TypeVariable) objM9384;
                }
                return null;
            case 6:
                Class cls5 = (Class) obj;
                cls5.getClass();
                if (Modifier.isStatic(cls5.getModifiers())) {
                    return null;
                }
                return cls5.getDeclaringClass();
            case 7:
                Class cls6 = (Class) obj;
                cls6.getClass();
                TypeVariable[] typeParameters = cls6.getTypeParameters();
                typeParameters.getClass();
                return AbstractC5179.m9397(typeParameters);
            case 8:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 9:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return AbstractC5179.m9405(actualTypeArguments);
            case 10:
                C5366 c5366 = (C5366) obj;
                c5366.getClass();
                return c5366.f13549;
            case 11:
                C5366 c53662 = (C5366) obj;
                c53662.getClass();
                return c53662.f13551;
            case 12:
                AbstractC5856 abstractC5856 = (AbstractC5856) obj;
                C2780 c2780 = AbstractC5889.f14943;
                abstractC5856.getClass();
                InterfaceC5923 interfaceC5923Mo10502 = abstractC5856.mo10502();
                InterfaceC5925 interfaceC5925 = interfaceC5923Mo10502 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5923Mo10502 : null;
                return Boolean.valueOf(interfaceC5925 != null && AbstractC3889.m7316(interfaceC5925).isInterface());
            case 13:
                AbstractC5856 abstractC58562 = (AbstractC5856) obj;
                C2780 c27802 = AbstractC5889.f14943;
                abstractC58562.getClass();
                return Boolean.valueOf(AbstractC5227.m9466(abstractC58562.mo10502(), AbstractC5228.f13320.mo9476(Object.class)));
            case 14:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return AbstractC5263.m9535(returnType);
            case 15:
                Class cls7 = (Class) obj;
                cls7.getClass();
                return AbstractC5263.m9535(cls7);
            case 16:
                InterfaceC5305 interfaceC5305 = (InterfaceC5305) obj;
                Regex regex = AbstractC5835.f14767;
                interfaceC5305.getClass();
                return C5576.f14233.m10032(interfaceC5305) + " | " + AbstractC5900.m10639(interfaceC5305).mo10560();
            case 17:
                C5370 c5370 = (C5370) obj;
                Regex regex2 = AbstractC5835.f14767;
                c5370.getClass();
                return c5370.f13581 + " | " + AbstractC3888.m7274(c5370).f19293;
            case 18:
                InterfaceC5316 interfaceC5316 = (InterfaceC5316) obj;
                Regex regex3 = AbstractC5835.f14767;
                interfaceC5316.getClass();
                return C5576.f14233.m10032(interfaceC5316) + " | " + AbstractC5900.m10638(interfaceC5316).mo10554();
            case 19:
                C5362 c5362 = (C5362) obj;
                Regex regex4 = AbstractC5835.f14767;
                c5362.getClass();
                return String.valueOf(AbstractC3888.m7273(c5362).f19295);
            case 20:
                InterfaceC5940 interfaceC5940 = (InterfaceC5940) obj;
                interfaceC5940.getClass();
                StringBuilder sb = new StringBuilder();
                String name = interfaceC5940.getName();
                if (name == null) {
                    name = JavaConstant.Dynamic.DEFAULT_NAME;
                }
                sb.append(name);
                sb.append(": ");
                sb.append(interfaceC5940.getType());
                return sb.toString();
            case 21:
                InterfaceC5940 interfaceC59402 = (InterfaceC5940) obj;
                interfaceC59402.getClass();
                return C5901.m10641(interfaceC59402.getType(), false);
            case 22:
                InterfaceC5940 interfaceC59403 = (InterfaceC5940) obj;
                interfaceC59403.getClass();
                return C5901.m10641(interfaceC59403.getType(), false);
            case 23:
                C5523 c5523 = (C5523) obj;
                c5523.getClass();
                return AbstractC3897.m7375(c5523);
            case 24:
                Class cls8 = (Class) obj;
                cls8.getClass();
                return AbstractC5263.m9535(cls8);
            default:
                InterfaceC5919 interfaceC5919 = (InterfaceC5919) obj;
                C5519 c5519 = AbstractC5899.f14953;
                interfaceC5919.getClass();
                return AbstractC5899.m10629(interfaceC5919);
        }
    }
}
