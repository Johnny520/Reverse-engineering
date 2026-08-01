package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.C4396;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.InterfaceC4382;
import kotlin.jvm.internal.InterfaceC4386;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5096;
import kotlin.reflect.InterfaceC5099;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5102;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.InterfaceC5113;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.AbstractC5080;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.km.C4529;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.types.AbstractC4925;
import kotlin.reflect.jvm.internal.types.C4926;
import kotlin.reflect.jvm.internal.types.C4937;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p251.AbstractC8174;
import p316.C8675;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5077 extends C4396 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static AbstractC5002 m10087(CallableReference callableReference) {
        InterfaceC5090 owner = callableReference.getOwner();
        return owner instanceof AbstractC5002 ? (AbstractC5002) owner : C4939.f14297;
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5111 mo8923(MutablePropertyReference1 mutablePropertyReference1) {
        AbstractC5002 abstractC5002M10087 = m10087(mutablePropertyReference1);
        String signature = mutablePropertyReference1.getSignature();
        return !AbstractC5072.f14622 ? new C4972(new C5041(abstractC5002M10087, mutablePropertyReference1, signature, 4)) : new C5021(abstractC5002M10087, mutablePropertyReference1.getName(), signature, mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC5113 mo8924(MutablePropertyReference0 mutablePropertyReference0) {
        AbstractC5002 abstractC5002M10087 = m10087(mutablePropertyReference0);
        String signature = mutablePropertyReference0.getSignature();
        return !AbstractC5072.f14622 ? new C4971(new C5041(signature, abstractC5002M10087, mutablePropertyReference0, 2)) : new C5018(abstractC5002M10087, mutablePropertyReference0.getName(), signature, mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5086 mo8925(InterfaceC5086 interfaceC5086) {
        String strMo8895;
        interfaceC5086.getClass();
        if (!AbstractC5072.f14622) {
            C4926 c4926 = (C4926) interfaceC5086;
            InterfaceC5091 interfaceC5091 = c4926.f14269;
            InterfaceC5092 interfaceC5092 = interfaceC5091 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5091 : null;
            if (interfaceC5092 == null || (strMo8895 = interfaceC5092.mo8895()) == null) {
                C4210.m8605(interfaceC5086, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            String str = C4409.f12983;
            C4686 c4686M8957 = C4409.m8957(new C4685(strMo8895));
            if (c4686M8957 != null) {
                return new C4926(c4926.f14269, c4926.f14270, c4926.f14264, c4926.f14263, c4926.f14267, c4926.f14268, c4926.f14265, c4926.f14266, C8675.m14363((InterfaceC5092) interfaceC5091, c4686M8957), null);
            }
            C4210.m8614(interfaceC5086, "Not a readonly collection: ");
            return null;
        }
        AbstractC4881 abstractC4881 = ((C4937) interfaceC5086).f14292;
        if (!(abstractC4881 instanceof AbstractC4877)) {
            C5553.m10815(interfaceC5086, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
        if (abstractC6988 == null) {
            C4210.m8614(interfaceC5086, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        AbstractC4877 abstractC4877 = (AbstractC4877) abstractC4881;
        String str2 = C4409.f12983;
        int i = AbstractC4772.f13905;
        C4685 c4685M12073 = AbstractC6869.m12073(abstractC6988);
        c4685M12073.getClass();
        C4686 c4686M89572 = C4409.m8957(c4685M12073);
        if (c4686M89572 == null) {
            C4210.m8614(abstractC6988, "Not a readonly collection: ");
            return null;
        }
        AbstractC6988 abstractC6988M11996 = AbstractC4772.m9509(abstractC6988).m11996(c4686M89572);
        abstractC6988M11996.getClass();
        InterfaceC4872 interfaceC4872Mo9011 = abstractC6988M11996.mo9011();
        interfaceC4872Mo9011.getClass();
        C4873 c4873Mo9733 = abstractC4877.mo9733();
        List listMo9736 = abstractC4877.mo9736();
        boolean zMo9735 = abstractC4877.mo9735();
        c4873Mo9733.getClass();
        listMo9736.getClass();
        return new C4937(AbstractC4892.m9824(listMo9736, c4873Mo9733, interfaceC4872Mo9011, zMo9735), null, false);
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5090 mo8926(Class cls) {
        C5013 c5013 = AbstractC5014.f14448;
        cls.getClass();
        return (InterfaceC5090) AbstractC5014.f14447.m9991(cls);
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5092 mo8927(Class cls) {
        return AbstractC5014.m9992(cls);
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5109 mo8928(FunctionReference functionReference) throws IOException {
        AbstractC5002 abstractC5002M10087 = m10087(functionReference);
        String name = functionReference.getName();
        String signature = functionReference.getSignature();
        if (!AbstractC5072.f14622) {
            if (name.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
                if (abstractC5002M10087 instanceof C5003) {
                    C5003 c5003 = (C5003) abstractC5002M10087;
                    if (c5003.f14422.getAnnotation(Metadata.class) != null) {
                        signature.getClass();
                        C4548 c4548M9985 = c5003.m9985();
                        Iterable iterable = c4548M9985 != null ? c4548M9985.f13292 : null;
                        if (iterable == null) {
                            iterable = EmptyList.INSTANCE;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            C4529 c4529 = (C4529) obj;
                            c4529.getClass();
                            if (String.valueOf(AbstractC8174.m13616(c4529).f18955).equals(signature)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.size() == 1) {
                            return new C5005(abstractC5002M10087, signature, functionReference.getBoundReceiver(), (C4529) AbstractC4343.m8818(arrayList));
                        }
                        C4548 c4548M99852 = c5003.m9985();
                        Iterable iterable2 = c4548M99852 != null ? c4548M99852.f13292 : null;
                        if (iterable2 == null) {
                            iterable2 = EmptyList.INSTANCE;
                        }
                        String strM8813 = AbstractC4343.m8813(iterable2, "\n", null, null, C5015.f14461, 30);
                        StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                        sb.append(signature);
                        sb.append(") not resolved in ");
                        sb.append(abstractC5002M10087);
                        sb.append(':');
                        sb.append(strM8813.length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(strM8813));
                        throw new KotlinReflectionInternalError(sb.toString());
                    }
                }
            } else if (abstractC5002M10087 instanceof C4991) {
                signature.getClass();
                C4991 c4991 = (C4991) abstractC5002M10087;
                ArrayList arrayListM9974 = c4991.m9974();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListM9974) {
                    C4537 c4537 = (C4537) obj2;
                    if (AbstractC4394.m8917(c4537.f13232, name) && String.valueOf(AbstractC8174.m13617(c4537).f18953).equals(signature)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() == 1) {
                    return new C4975(abstractC5002M10087, signature, functionReference.getBoundReceiver(), (C4537) AbstractC4343.m8818(arrayList2));
                }
                String strM88132 = AbstractC4343.m8813(c4991.m9974(), "\n", null, null, C5015.f14463, 30);
                StringBuilder sbM11551 = AbstractC6136.m11551("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbM11551.append(abstractC5002M10087);
                sbM11551.append(':');
                sbM11551.append(strM88132.length() == 0 ? " no members found" : " several matching members found:\n".concat(strM88132));
                throw new KotlinReflectionInternalError(sbM11551.toString());
            }
        }
        Object boundReceiver = functionReference.getBoundReceiver();
        name.getClass();
        signature.getClass();
        return new C5025(abstractC5002M10087, name, signature, null, boundReceiver, C5050.f14573);
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final InterfaceC5086 mo8929(InterfaceC5091 interfaceC5091, List list, boolean z) {
        if (!(interfaceC5091 instanceof InterfaceC4386)) {
            return AbstractC4405.m8941(interfaceC5091, list, z, Collections.EMPTY_LIST);
        }
        Class clsMo8889 = ((InterfaceC4386) interfaceC5091).mo8889();
        C5013 c5013 = AbstractC5014.f14448;
        clsMo8889.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (InterfaceC5086) AbstractC5014.f14445.m9991(clsMo8889) : (InterfaceC5086) AbstractC5014.f14446.m9991(clsMo8889);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC5014.f14444.m9991(clsMo8889);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            AbstractC4925 abstractC4925M8941 = AbstractC4405.m8941(AbstractC5014.m9992(clsMo8889), list, z, EmptyList.INSTANCE);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, abstractC4925M8941);
            obj = objPutIfAbsent == null ? abstractC4925M8941 : objPutIfAbsent;
        }
        return (InterfaceC5086) obj;
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC4393 mo8931(InterfaceC5092 interfaceC5092, KVariance kVariance) {
        List<AbstractC4393> typeParameters;
        if (interfaceC5092 != null) {
            typeParameters = interfaceC5092.getTypeParameters();
        } else {
            if (!(interfaceC5092 instanceof InterfaceC5093)) {
                C4210.m8614(interfaceC5092, "Type parameter container must be a class or a callable: ");
                return null;
            }
            typeParameters = ((InterfaceC5093) interfaceC5092).getTypeParameters();
        }
        for (AbstractC4393 abstractC4393 : typeParameters) {
            if (abstractC4393.mo8911().equals("PluginConfigT")) {
                return abstractC4393;
            }
        }
        C4210.m8614(interfaceC5092, "Type parameter PluginConfigT is not found in container: ");
        return null;
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5096 mo8932(PropertyReference0 propertyReference0) {
        AbstractC5002 abstractC5002M10087 = m10087(propertyReference0);
        String signature = propertyReference0.getSignature();
        return !AbstractC5072.f14622 ? new C4969(new C5041(signature, abstractC5002M10087, propertyReference0, 1)) : new C4948(abstractC5002M10087, propertyReference0.getName(), signature, propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5102 mo8933(MutablePropertyReference2 mutablePropertyReference2) {
        return new C5019(m10087(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final String mo8934(InterfaceC4382 interfaceC4382) throws IOException {
        C5025 c5025M10094 = AbstractC5080.m10094(interfaceC4382);
        if (c5025M10094 == null) {
            return super.mo8934(interfaceC4382);
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC5107 interfaceC5107M8938 = AbstractC4405.m8938(c5025M10094);
        if (interfaceC5107M8938 != null) {
            sb.append(C5068.m10078(interfaceC5107M8938.getType(), false));
            sb.append(".");
        }
        AbstractC4343.m8829(AbstractC4405.m8944(c5025M10094), sb, ", ", "(", ")", C5015.f14454, 48);
        sb.append(" -> ");
        sb.append(C5068.m10078(c5025M10094.getReturnType(), false));
        return sb.toString();
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final String mo8935(Lambda lambda) {
        return mo8934(lambda);
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC5101 mo8936(PropertyReference1 propertyReference1) {
        AbstractC5002 abstractC5002M10087 = m10087(propertyReference1);
        String signature = propertyReference1.getSignature();
        return !AbstractC5072.f14622 ? new C4970(new C5041(abstractC5002M10087, propertyReference1, signature, 3)) : new C4949(abstractC5002M10087, propertyReference1.getName(), signature, propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC5099 mo8937(PropertyReference2 propertyReference2) {
        return new C4942(m10087(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.C4396
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8930(AbstractC4393 abstractC4393, List list) {
    }
}
