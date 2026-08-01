package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4211;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4397;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.InterfaceC4383;
import kotlin.jvm.internal.InterfaceC4387;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5100;
import kotlin.reflect.InterfaceC5102;
import kotlin.reflect.InterfaceC5103;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.InterfaceC5114;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.AbstractC5081;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.km.C4530;
import kotlin.reflect.jvm.internal.impl.km.C4538;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import kotlin.reflect.jvm.internal.types.C4927;
import kotlin.reflect.jvm.internal.types.C4938;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.method.MethodDescription;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p066.AbstractC6870;
import p079.AbstractC6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5078 extends C4397 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static AbstractC5003 m10091(CallableReference callableReference) {
        InterfaceC5091 owner = callableReference.getOwner();
        return owner instanceof AbstractC5003 ? (AbstractC5003) owner : C4940.f14299;
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5112 mo8913(MutablePropertyReference1 mutablePropertyReference1) {
        AbstractC5003 abstractC5003M10091 = m10091(mutablePropertyReference1);
        String signature = mutablePropertyReference1.getSignature();
        return !AbstractC5073.f14622 ? new C4973(new C5042(abstractC5003M10091, mutablePropertyReference1, signature, 4)) : new C5022(abstractC5003M10091, mutablePropertyReference1.getName(), signature, mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC5114 mo8914(MutablePropertyReference0 mutablePropertyReference0) {
        AbstractC5003 abstractC5003M10091 = m10091(mutablePropertyReference0);
        String signature = mutablePropertyReference0.getSignature();
        return !AbstractC5073.f14622 ? new C4972(new C5042(signature, abstractC5003M10091, mutablePropertyReference0, 2)) : new C5019(abstractC5003M10091, mutablePropertyReference0.getName(), signature, mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5087 mo8915(InterfaceC5087 interfaceC5087) {
        String strMo8885;
        interfaceC5087.getClass();
        if (!AbstractC5073.f14622) {
            C4927 c4927 = (C4927) interfaceC5087;
            InterfaceC5092 interfaceC5092 = c4927.f14271;
            InterfaceC5093 interfaceC5093 = interfaceC5092 instanceof InterfaceC5093 ? (InterfaceC5093) interfaceC5092 : null;
            if (interfaceC5093 == null || (strMo8885 = interfaceC5093.mo8885()) == null) {
                C4211.m8595(interfaceC5087, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            String str = C4410.f12987;
            C4687 c4687M8947 = C4410.m8947(new C4686(strMo8885));
            if (c4687M8947 != null) {
                return new C4927(c4927.f14271, c4927.f14272, c4927.f14266, c4927.f14265, c4927.f14269, c4927.f14270, c4927.f14267, c4927.f14268, AbstractC6347.m11897((InterfaceC5093) interfaceC5092, c4687M8947), null);
            }
            C4211.m8604(interfaceC5087, "Not a readonly collection: ");
            return null;
        }
        AbstractC4882 abstractC4882 = ((C4938) interfaceC5087).f14294;
        if (!(abstractC4882 instanceof AbstractC4878)) {
            C5554.m10872(interfaceC5087, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
        AbstractC6989 abstractC6989 = interfaceC4477Mo9211 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9211 : null;
        if (abstractC6989 == null) {
            C4211.m8604(interfaceC5087, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        AbstractC4878 abstractC4878 = (AbstractC4878) abstractC4882;
        String str2 = C4410.f12987;
        int i = AbstractC4773.f13909;
        C4686 c4686M12101 = AbstractC6870.m12101(abstractC6989);
        c4686M12101.getClass();
        C4687 c4687M89472 = C4410.m8947(c4686M12101);
        if (c4687M89472 == null) {
            C4211.m8604(abstractC6989, "Not a readonly collection: ");
            return null;
        }
        AbstractC6989 abstractC6989M12039 = AbstractC4773.m9499(abstractC6989).m12039(c4687M89472);
        abstractC6989M12039.getClass();
        InterfaceC4873 interfaceC4873Mo9001 = abstractC6989M12039.mo9001();
        interfaceC4873Mo9001.getClass();
        C4874 c4874Mo9723 = abstractC4878.mo9723();
        List listMo9726 = abstractC4878.mo9726();
        boolean zMo9725 = abstractC4878.mo9725();
        c4874Mo9723.getClass();
        listMo9726.getClass();
        return new C4938(AbstractC4893.m9818(listMo9726, c4874Mo9723, interfaceC4873Mo9001, zMo9725), null, false);
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5091 mo8916(Class cls) {
        C5014 c5014 = AbstractC5015.f14450;
        cls.getClass();
        return (InterfaceC5091) AbstractC5015.f14449.m9988(cls);
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5093 mo8917(Class cls) {
        return AbstractC5015.m9989(cls);
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5110 mo8918(FunctionReference functionReference) throws IOException {
        AbstractC5003 abstractC5003M10091 = m10091(functionReference);
        String name = functionReference.getName();
        String signature = functionReference.getSignature();
        if (!AbstractC5073.f14622) {
            if (name.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
                if (abstractC5003M10091 instanceof C5004) {
                    C5004 c5004 = (C5004) abstractC5003M10091;
                    if (c5004.f14424.getAnnotation(Metadata.class) != null) {
                        signature.getClass();
                        C4549 c4549M9982 = c5004.m9982();
                        Iterable iterable = c4549M9982 != null ? c4549M9982.f13296 : null;
                        if (iterable == null) {
                            iterable = EmptyList.INSTANCE;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            C4530 c4530 = (C4530) obj;
                            c4530.getClass();
                            if (String.valueOf(AbstractC3056.m6713(c4530).f18950).equals(signature)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.size() == 1) {
                            return new C5006(abstractC5003M10091, signature, functionReference.getBoundReceiver(), (C4530) AbstractC4344.m8779(arrayList));
                        }
                        C4549 c4549M99822 = c5004.m9982();
                        Iterable iterable2 = c4549M99822 != null ? c4549M99822.f13296 : null;
                        if (iterable2 == null) {
                            iterable2 = EmptyList.INSTANCE;
                        }
                        String strM8810 = AbstractC4344.m8810(iterable2, "\n", null, null, C5016.f14463, 30);
                        StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                        sb.append(signature);
                        sb.append(") not resolved in ");
                        sb.append(abstractC5003M10091);
                        sb.append(':');
                        sb.append(strM8810.length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(strM8810));
                        throw new KotlinReflectionInternalError(sb.toString());
                    }
                }
            } else if (abstractC5003M10091 instanceof C4992) {
                signature.getClass();
                C4992 c4992 = (C4992) abstractC5003M10091;
                ArrayList arrayListM9971 = c4992.m9971();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListM9971) {
                    C4538 c4538 = (C4538) obj2;
                    if (AbstractC4395.m8907(c4538.f13236, name) && String.valueOf(AbstractC3056.m6714(c4538).f18948).equals(signature)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() == 1) {
                    return new C4976(abstractC5003M10091, signature, functionReference.getBoundReceiver(), (C4538) AbstractC4344.m8779(arrayList2));
                }
                String strM88102 = AbstractC4344.m8810(c4992.m9971(), "\n", null, null, C5016.f14465, 30);
                StringBuilder sbM11582 = AbstractC6183.m11582("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbM11582.append(abstractC5003M10091);
                sbM11582.append(':');
                sbM11582.append(strM88102.length() == 0 ? " no members found" : " several matching members found:\n".concat(strM88102));
                throw new KotlinReflectionInternalError(sbM11582.toString());
            }
        }
        Object boundReceiver = functionReference.getBoundReceiver();
        name.getClass();
        signature.getClass();
        return new C5026(abstractC5003M10091, name, signature, null, boundReceiver, C5051.f14575);
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final InterfaceC5087 mo8919(InterfaceC5092 interfaceC5092, List list, boolean z) {
        if (!(interfaceC5092 instanceof InterfaceC4387)) {
            return AbstractC4406.m8931(interfaceC5092, list, z, Collections.EMPTY_LIST);
        }
        Class clsMo8879 = ((InterfaceC4387) interfaceC5092).mo8879();
        C5014 c5014 = AbstractC5015.f14450;
        clsMo8879.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (InterfaceC5087) AbstractC5015.f14447.m9988(clsMo8879) : (InterfaceC5087) AbstractC5015.f14448.m9988(clsMo8879);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC5015.f14446.m9988(clsMo8879);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            AbstractC4926 abstractC4926M8931 = AbstractC4406.m8931(AbstractC5015.m9989(clsMo8879), list, z, EmptyList.INSTANCE);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, abstractC4926M8931);
            obj = objPutIfAbsent == null ? abstractC4926M8931 : objPutIfAbsent;
        }
        return (InterfaceC5087) obj;
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC4394 mo8921(InterfaceC5093 interfaceC5093, KVariance kVariance) {
        List<AbstractC4394> typeParameters;
        if (interfaceC5093 != null) {
            typeParameters = interfaceC5093.getTypeParameters();
        } else {
            if (!(interfaceC5093 instanceof InterfaceC5094)) {
                C4211.m8604(interfaceC5093, "Type parameter container must be a class or a callable: ");
                return null;
            }
            typeParameters = ((InterfaceC5094) interfaceC5093).getTypeParameters();
        }
        for (AbstractC4394 abstractC4394 : typeParameters) {
            if (abstractC4394.mo8901().equals("PluginConfigT")) {
                return abstractC4394;
            }
        }
        C4211.m8604(interfaceC5093, "Type parameter PluginConfigT is not found in container: ");
        return null;
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5097 mo8922(PropertyReference0 propertyReference0) {
        AbstractC5003 abstractC5003M10091 = m10091(propertyReference0);
        String signature = propertyReference0.getSignature();
        return !AbstractC5073.f14622 ? new C4970(new C5042(signature, abstractC5003M10091, propertyReference0, 1)) : new C4949(abstractC5003M10091, propertyReference0.getName(), signature, propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5103 mo8923(MutablePropertyReference2 mutablePropertyReference2) {
        return new C5020(m10091(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final String mo8924(InterfaceC4383 interfaceC4383) throws IOException {
        C5026 c5026M10098 = AbstractC5081.m10098(interfaceC4383);
        if (c5026M10098 == null) {
            return super.mo8924(interfaceC4383);
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC5108 interfaceC5108M8928 = AbstractC4406.m8928(c5026M10098);
        if (interfaceC5108M8928 != null) {
            sb.append(C5069.m10082(interfaceC5108M8928.getType(), false));
            sb.append(".");
        }
        AbstractC4344.m8809(AbstractC4406.m8934(c5026M10098), sb, ", ", "(", ")", C5016.f14456, 48);
        sb.append(" -> ");
        sb.append(C5069.m10082(c5026M10098.getReturnType(), false));
        return sb.toString();
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final String mo8925(Lambda lambda) {
        return mo8924(lambda);
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC5102 mo8926(PropertyReference1 propertyReference1) {
        AbstractC5003 abstractC5003M10091 = m10091(propertyReference1);
        String signature = propertyReference1.getSignature();
        return !AbstractC5073.f14622 ? new C4971(new C5042(abstractC5003M10091, propertyReference1, signature, 3)) : new C4950(abstractC5003M10091, propertyReference1.getName(), signature, propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC5100 mo8927(PropertyReference2 propertyReference2) {
        return new C4943(m10091(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.C4397
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8920(AbstractC4394 abstractC4394, List list) {
    }
}
