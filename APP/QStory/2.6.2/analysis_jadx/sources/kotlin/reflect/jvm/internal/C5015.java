package kotlin.reflect.jvm.internal;

import androidx.compose.ui.semantics.C1945;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.km.C4529;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.text.Regex;
import net.bytebuddy.utility.JavaConstant;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5015 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14475;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5015 f14473 = new C5015(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5015 f14474 = new C5015(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5015 f14468 = new C5015(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5015 f14467 = new C5015(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5015 f14471 = new C5015(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5015 f14472 = new C5015(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C5015 f14469 = new C5015(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5015 f14470 = new C5015(7);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C5015 f14460 = new C5015(8);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5015 f14459 = new C5015(9);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5015 f14458 = new C5015(10);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C5015 f14457 = new C5015(11);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C5015 f14456 = new C5015(12);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C5015 f14455 = new C5015(13);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C5015 f14466 = new C5015(14);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C5015 f14465 = new C5015(15);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C5015 f14464 = new C5015(16);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C5015 f14463 = new C5015(17);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C5015 f14462 = new C5015(18);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C5015 f14461 = new C5015(19);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C5015 f14452 = new C5015(20);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C5015 f14451 = new C5015(21);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C5015 f14454 = new C5015(22);

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C5015 f14453 = new C5015(23);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C5015 f14449 = new C5015(24);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final C5015 f14450 = new C5015(25);

    public /* synthetic */ C5015(int i) {
        this.f14475 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f14475) {
            case 0:
                Class cls = (Class) obj;
                C5013 c5013 = AbstractC5014.f14448;
                cls.getClass();
                return new C5003(cls);
            case 1:
                Class cls2 = (Class) obj;
                C5013 c50132 = AbstractC5014.f14448;
                cls2.getClass();
                return new C4991(cls2);
            case 2:
                Class cls3 = (Class) obj;
                C5013 c50133 = AbstractC5014.f14448;
                cls3.getClass();
                C5003 c5003M9992 = AbstractC5014.m9992(cls3);
                EmptyList emptyList = EmptyList.INSTANCE;
                return AbstractC4405.m8941(c5003M9992, emptyList, false, emptyList);
            case 3:
                Class cls4 = (Class) obj;
                C5013 c50134 = AbstractC5014.f14448;
                cls4.getClass();
                C5003 c5003M99922 = AbstractC5014.m9992(cls4);
                EmptyList emptyList2 = EmptyList.INSTANCE;
                return AbstractC4405.m8941(c5003M99922, emptyList2, true, emptyList2);
            case 4:
                C5013 c50135 = AbstractC5014.f14448;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 5:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object objM8849 = AbstractC4346.m8849(bounds);
                if (objM8849 instanceof TypeVariable) {
                    return (TypeVariable) objM8849;
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
                return AbstractC4346.m8841(typeParameters);
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
                return AbstractC4346.m8850(actualTypeArguments);
            case 10:
                C4533 c4533 = (C4533) obj;
                c4533.getClass();
                return c4533.f13200;
            case 11:
                C4533 c45332 = (C4533) obj;
                c45332.getClass();
                return c45332.f13202;
            case 12:
                AbstractC5023 abstractC5023 = (AbstractC5023) obj;
                C1945 c1945 = AbstractC5056.f14596;
                abstractC5023.getClass();
                InterfaceC5090 interfaceC5090Mo9946 = abstractC5023.mo9946();
                InterfaceC5092 interfaceC5092 = interfaceC5090Mo9946 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5090Mo9946 : null;
                return Boolean.valueOf(interfaceC5092 != null && AbstractC6560.m12029(interfaceC5092).isInterface());
            case 13:
                AbstractC5023 abstractC50232 = (AbstractC5023) obj;
                C1945 c19452 = AbstractC5056.f14596;
                abstractC50232.getClass();
                return Boolean.valueOf(AbstractC4394.m8917(abstractC50232.mo9946(), AbstractC4395.f12971.mo8927(Object.class)));
            case 14:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return AbstractC4430.m8986(returnType);
            case 15:
                Class cls7 = (Class) obj;
                cls7.getClass();
                return AbstractC4430.m8986(cls7);
            case 16:
                InterfaceC4472 interfaceC4472 = (InterfaceC4472) obj;
                Regex regex = AbstractC5002.f14420;
                interfaceC4472.getClass();
                return C4743.f13884.m9483(interfaceC4472) + " | " + AbstractC5067.m10076(interfaceC4472).mo10004();
            case 17:
                C4537 c4537 = (C4537) obj;
                Regex regex2 = AbstractC5002.f14420;
                c4537.getClass();
                return c4537.f13232 + " | " + AbstractC8174.m13617(c4537).f18953;
            case 18:
                InterfaceC4483 interfaceC4483 = (InterfaceC4483) obj;
                Regex regex3 = AbstractC5002.f14420;
                interfaceC4483.getClass();
                return C4743.f13884.m9483(interfaceC4483) + " | " + AbstractC5067.m10075(interfaceC4483).mo9998();
            case 19:
                C4529 c4529 = (C4529) obj;
                Regex regex4 = AbstractC5002.f14420;
                c4529.getClass();
                return String.valueOf(AbstractC8174.m13616(c4529).f18955);
            case 20:
                InterfaceC5107 interfaceC5107 = (InterfaceC5107) obj;
                interfaceC5107.getClass();
                StringBuilder sb = new StringBuilder();
                String name = interfaceC5107.getName();
                if (name == null) {
                    name = JavaConstant.Dynamic.DEFAULT_NAME;
                }
                sb.append(name);
                sb.append(": ");
                sb.append(interfaceC5107.getType());
                return sb.toString();
            case 21:
                InterfaceC5107 interfaceC51072 = (InterfaceC5107) obj;
                interfaceC51072.getClass();
                return C5068.m10078(interfaceC51072.getType(), false);
            case 22:
                InterfaceC5107 interfaceC51073 = (InterfaceC5107) obj;
                interfaceC51073.getClass();
                return C5068.m10078(interfaceC51073.getType(), false);
            case 23:
                C4690 c4690 = (C4690) obj;
                c4690.getClass();
                return AbstractC6560.m12017(c4690);
            case 24:
                Class cls8 = (Class) obj;
                cls8.getClass();
                return AbstractC4430.m8986(cls8);
            default:
                InterfaceC5086 interfaceC5086 = (InterfaceC5086) obj;
                C4686 c4686 = AbstractC5066.f14608;
                interfaceC5086.getClass();
                return AbstractC5066.m10066(interfaceC5086);
        }
    }
}
