package kotlin.reflect.jvm.internal;

import androidx.compose.ui.semantics.C1945;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3057;
import com.bumptech.glide.AbstractC3065;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.km.C4530;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.C4538;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import kotlin.text.Regex;
import net.bytebuddy.utility.JavaConstant;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5016 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14477;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5016 f14475 = new C5016(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5016 f14476 = new C5016(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5016 f14470 = new C5016(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5016 f14469 = new C5016(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5016 f14473 = new C5016(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5016 f14474 = new C5016(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C5016 f14471 = new C5016(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5016 f14472 = new C5016(7);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C5016 f14462 = new C5016(8);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5016 f14461 = new C5016(9);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5016 f14460 = new C5016(10);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C5016 f14459 = new C5016(11);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C5016 f14458 = new C5016(12);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C5016 f14457 = new C5016(13);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C5016 f14468 = new C5016(14);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C5016 f14467 = new C5016(15);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C5016 f14466 = new C5016(16);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C5016 f14465 = new C5016(17);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C5016 f14464 = new C5016(18);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C5016 f14463 = new C5016(19);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C5016 f14454 = new C5016(20);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C5016 f14453 = new C5016(21);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C5016 f14456 = new C5016(22);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C5016 f14455 = new C5016(23);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C5016 f14451 = new C5016(24);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final C5016 f14452 = new C5016(25);

    public /* synthetic */ C5016(int i) {
        this.f14477 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f14477) {
            case 0:
                Class cls = (Class) obj;
                C5014 c5014 = AbstractC5015.f14450;
                cls.getClass();
                return new C5004(cls);
            case 1:
                Class cls2 = (Class) obj;
                C5014 c50142 = AbstractC5015.f14450;
                cls2.getClass();
                return new C4992(cls2);
            case 2:
                Class cls3 = (Class) obj;
                C5014 c50143 = AbstractC5015.f14450;
                cls3.getClass();
                C5004 c5004M9989 = AbstractC5015.m9989(cls3);
                EmptyList emptyList = EmptyList.INSTANCE;
                return AbstractC4406.m8931(c5004M9989, emptyList, false, emptyList);
            case 3:
                Class cls4 = (Class) obj;
                C5014 c50144 = AbstractC5015.f14450;
                cls4.getClass();
                C5004 c5004M99892 = AbstractC5015.m9989(cls4);
                EmptyList emptyList2 = EmptyList.INSTANCE;
                return AbstractC4406.m8931(c5004M99892, emptyList2, true, emptyList2);
            case 4:
                C5014 c50145 = AbstractC5015.f14450;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 5:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object objM8825 = AbstractC4347.m8825(bounds);
                if (objM8825 instanceof TypeVariable) {
                    return (TypeVariable) objM8825;
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
                return AbstractC4347.m8838(typeParameters);
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
                return AbstractC4347.m8846(actualTypeArguments);
            case 10:
                C4534 c4534 = (C4534) obj;
                c4534.getClass();
                return c4534.f13204;
            case 11:
                C4534 c45342 = (C4534) obj;
                c45342.getClass();
                return c45342.f13206;
            case 12:
                AbstractC5024 abstractC5024 = (AbstractC5024) obj;
                C1945 c1945 = AbstractC5057.f14598;
                abstractC5024.getClass();
                InterfaceC5091 interfaceC5091Mo9943 = abstractC5024.mo9943();
                InterfaceC5093 interfaceC5093 = interfaceC5091Mo9943 instanceof InterfaceC5093 ? (InterfaceC5093) interfaceC5091Mo9943 : null;
                return Boolean.valueOf(interfaceC5093 != null && AbstractC3057.m6756(interfaceC5093).isInterface());
            case 13:
                AbstractC5024 abstractC50242 = (AbstractC5024) obj;
                C1945 c19452 = AbstractC5057.f14598;
                abstractC50242.getClass();
                return Boolean.valueOf(AbstractC4395.m8907(abstractC50242.mo9943(), AbstractC4396.f12975.mo8917(Object.class)));
            case 14:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return AbstractC4431.m8976(returnType);
            case 15:
                Class cls7 = (Class) obj;
                cls7.getClass();
                return AbstractC4431.m8976(cls7);
            case 16:
                InterfaceC4473 interfaceC4473 = (InterfaceC4473) obj;
                Regex regex = AbstractC5003.f14422;
                interfaceC4473.getClass();
                return C4744.f13888.m9473(interfaceC4473) + " | " + AbstractC5068.m10080(interfaceC4473).mo10001();
            case 17:
                C4538 c4538 = (C4538) obj;
                Regex regex2 = AbstractC5003.f14422;
                c4538.getClass();
                return c4538.f13236 + " | " + AbstractC3056.m6714(c4538).f18948;
            case 18:
                InterfaceC4484 interfaceC4484 = (InterfaceC4484) obj;
                Regex regex3 = AbstractC5003.f14422;
                interfaceC4484.getClass();
                return C4744.f13888.m9473(interfaceC4484) + " | " + AbstractC5068.m10079(interfaceC4484).mo9995();
            case 19:
                C4530 c4530 = (C4530) obj;
                Regex regex4 = AbstractC5003.f14422;
                c4530.getClass();
                return String.valueOf(AbstractC3056.m6713(c4530).f18950);
            case 20:
                InterfaceC5108 interfaceC5108 = (InterfaceC5108) obj;
                interfaceC5108.getClass();
                StringBuilder sb = new StringBuilder();
                String name = interfaceC5108.getName();
                if (name == null) {
                    name = JavaConstant.Dynamic.DEFAULT_NAME;
                }
                sb.append(name);
                sb.append(": ");
                sb.append(interfaceC5108.getType());
                return sb.toString();
            case 21:
                InterfaceC5108 interfaceC51082 = (InterfaceC5108) obj;
                interfaceC51082.getClass();
                return C5069.m10082(interfaceC51082.getType(), false);
            case 22:
                InterfaceC5108 interfaceC51083 = (InterfaceC5108) obj;
                interfaceC51083.getClass();
                return C5069.m10082(interfaceC51083.getType(), false);
            case 23:
                C4691 c4691 = (C4691) obj;
                c4691.getClass();
                return AbstractC3065.m6815(c4691);
            case 24:
                Class cls8 = (Class) obj;
                cls8.getClass();
                return AbstractC4431.m8976(cls8);
            default:
                InterfaceC5087 interfaceC5087 = (InterfaceC5087) obj;
                C4687 c4687 = AbstractC5067.f14608;
                interfaceC5087.getClass();
                return AbstractC5067.m10070(interfaceC5087);
        }
    }
}
