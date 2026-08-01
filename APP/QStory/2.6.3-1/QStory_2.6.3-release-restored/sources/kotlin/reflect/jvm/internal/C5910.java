package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3888;
import io.ktor.util.C5043;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.C5229;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.InterfaceC5215;
import kotlin.jvm.internal.InterfaceC5219;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5929;
import kotlin.reflect.InterfaceC5932;
import kotlin.reflect.InterfaceC5934;
import kotlin.reflect.InterfaceC5935;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.InterfaceC5944;
import kotlin.reflect.InterfaceC5946;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.p009km.C5362;
import kotlin.reflect.jvm.internal.impl.p009km.C5370;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5759;
import kotlin.reflect.jvm.internal.types.C5770;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.method.MethodDescription;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p082.AbstractC7699;
import p095.AbstractC7818;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5910 extends C5229 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static AbstractC5835 m10650(CallableReference callableReference) {
        InterfaceC5923 owner = callableReference.getOwner();
        return owner instanceof AbstractC5835 ? (AbstractC5835) owner : C5772.f14644;
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5944 mo9472(MutablePropertyReference1 mutablePropertyReference1) {
        AbstractC5835 abstractC5835M10650 = m10650(mutablePropertyReference1);
        String signature = mutablePropertyReference1.getSignature();
        return !AbstractC5905.f14967 ? new C5805(new C5874(abstractC5835M10650, mutablePropertyReference1, signature, 4)) : new C5854(abstractC5835M10650, mutablePropertyReference1.getName(), signature, mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC5946 mo9473(MutablePropertyReference0 mutablePropertyReference0) {
        AbstractC5835 abstractC5835M10650 = m10650(mutablePropertyReference0);
        String signature = mutablePropertyReference0.getSignature();
        return !AbstractC5905.f14967 ? new C5804(new C5874(signature, abstractC5835M10650, mutablePropertyReference0, 2)) : new C5851(abstractC5835M10650, mutablePropertyReference0.getName(), signature, mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5919 mo9474(InterfaceC5919 interfaceC5919) {
        String strMo9444;
        interfaceC5919.getClass();
        if (!AbstractC5905.f14967) {
            C5759 c5759 = (C5759) interfaceC5919;
            InterfaceC5924 interfaceC5924 = c5759.f14616;
            InterfaceC5925 interfaceC5925 = interfaceC5924 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924 : null;
            if (interfaceC5925 == null || (strMo9444 = interfaceC5925.mo9444()) == null) {
                C5043.m9154(interfaceC5919, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            String str = C5242.f13332;
            C5519 c5519M9506 = C5242.m9506(new C5518(strMo9444));
            if (c5519M9506 != null) {
                return new C5759(c5759.f14616, c5759.f14617, c5759.f14611, c5759.f14610, c5759.f14614, c5759.f14615, c5759.f14612, c5759.f14613, AbstractC7176.m12456((InterfaceC5925) interfaceC5924, c5519M9506), null);
            }
            C5043.m9163(interfaceC5919, "Not a readonly collection: ");
            return null;
        }
        AbstractC5714 abstractC5714 = ((C5770) interfaceC5919).f14639;
        if (!(abstractC5714 instanceof AbstractC5710)) {
            C6385.m11431(interfaceC5919, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
        AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
        if (abstractC7818 == null) {
            C5043.m9163(interfaceC5919, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        AbstractC5710 abstractC5710 = (AbstractC5710) abstractC5714;
        String str2 = C5242.f13332;
        int i = AbstractC5605.f14254;
        C5518 c5518M12660 = AbstractC7699.m12660(abstractC7818);
        c5518M12660.getClass();
        C5519 c5519M95062 = C5242.m9506(c5518M12660);
        if (c5519M95062 == null) {
            C5043.m9163(abstractC7818, "Not a readonly collection: ");
            return null;
        }
        AbstractC7818 abstractC7818M12598 = AbstractC5605.m10058(abstractC7818).m12598(c5519M95062);
        abstractC7818M12598.getClass();
        InterfaceC5705 interfaceC5705Mo9560 = abstractC7818M12598.mo9560();
        interfaceC5705Mo9560.getClass();
        C5706 c5706Mo10282 = abstractC5710.mo10282();
        List listMo10285 = abstractC5710.mo10285();
        boolean zMo10284 = abstractC5710.mo10284();
        c5706Mo10282.getClass();
        listMo10285.getClass();
        return new C5770(AbstractC5725.m10377(listMo10285, c5706Mo10282, interfaceC5705Mo9560, zMo10284), null, false);
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5923 mo9475(Class cls) {
        C5846 c5846 = AbstractC5847.f14795;
        cls.getClass();
        return (InterfaceC5923) AbstractC5847.f14794.m10547(cls);
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5925 mo9476(Class cls) {
        return AbstractC5847.m10548(cls);
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5942 mo9477(FunctionReference functionReference) throws IOException {
        AbstractC5835 abstractC5835M10650 = m10650(functionReference);
        String name = functionReference.getName();
        String signature = functionReference.getSignature();
        if (!AbstractC5905.f14967) {
            if (name.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
                if (abstractC5835M10650 instanceof C5836) {
                    C5836 c5836 = (C5836) abstractC5835M10650;
                    if (c5836.f14769.getAnnotation(Metadata.class) != null) {
                        signature.getClass();
                        C5381 c5381M10541 = c5836.m10541();
                        Iterable iterable = c5381M10541 != null ? c5381M10541.f13641 : null;
                        if (iterable == null) {
                            iterable = EmptyList.INSTANCE;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            C5362 c5362 = (C5362) obj;
                            c5362.getClass();
                            if (String.valueOf(AbstractC3888.m7273(c5362).f19295).equals(signature)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.size() == 1) {
                            return new C5838(abstractC5835M10650, signature, functionReference.getBoundReceiver(), (C5362) AbstractC5176.m9338(arrayList));
                        }
                        C5381 c5381M105412 = c5836.m10541();
                        Iterable iterable2 = c5381M105412 != null ? c5381M105412.f13641 : null;
                        if (iterable2 == null) {
                            iterable2 = EmptyList.INSTANCE;
                        }
                        String strM9369 = AbstractC5176.m9369(iterable2, "\n", null, null, C5848.f14808, 30);
                        StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                        sb.append(signature);
                        sb.append(") not resolved in ");
                        sb.append(abstractC5835M10650);
                        sb.append(':');
                        sb.append(strM9369.length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(strM9369));
                        throw new KotlinReflectionInternalError(sb.toString());
                    }
                }
            } else if (abstractC5835M10650 instanceof C5824) {
                signature.getClass();
                C5824 c5824 = (C5824) abstractC5835M10650;
                ArrayList arrayListM10530 = c5824.m10530();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListM10530) {
                    C5370 c5370 = (C5370) obj2;
                    if (AbstractC5227.m9466(c5370.f13581, name) && String.valueOf(AbstractC3888.m7274(c5370).f19293).equals(signature)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() == 1) {
                    return new C5808(abstractC5835M10650, signature, functionReference.getBoundReceiver(), (C5370) AbstractC5176.m9338(arrayList2));
                }
                String strM93692 = AbstractC5176.m9369(c5824.m10530(), "\n", null, null, C5848.f14810, 30);
                StringBuilder sbM12141 = AbstractC7012.m12141("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbM12141.append(abstractC5835M10650);
                sbM12141.append(':');
                sbM12141.append(strM93692.length() == 0 ? " no members found" : " several matching members found:\n".concat(strM93692));
                throw new KotlinReflectionInternalError(sbM12141.toString());
            }
        }
        Object boundReceiver = functionReference.getBoundReceiver();
        name.getClass();
        signature.getClass();
        return new C5858(abstractC5835M10650, name, signature, null, boundReceiver, C5883.f14920);
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final InterfaceC5919 mo9478(InterfaceC5924 interfaceC5924, List list, boolean z) {
        if (!(interfaceC5924 instanceof InterfaceC5219)) {
            return AbstractC5238.m9490(interfaceC5924, list, z, Collections.EMPTY_LIST);
        }
        Class clsMo9438 = ((InterfaceC5219) interfaceC5924).mo9438();
        C5846 c5846 = AbstractC5847.f14795;
        clsMo9438.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (InterfaceC5919) AbstractC5847.f14792.m10547(clsMo9438) : (InterfaceC5919) AbstractC5847.f14793.m10547(clsMo9438);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC5847.f14791.m10547(clsMo9438);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            AbstractC5758 abstractC5758M9490 = AbstractC5238.m9490(AbstractC5847.m10548(clsMo9438), list, z, EmptyList.INSTANCE);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, abstractC5758M9490);
            obj = objPutIfAbsent == null ? abstractC5758M9490 : objPutIfAbsent;
        }
        return (InterfaceC5919) obj;
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC5226 mo9480(InterfaceC5925 interfaceC5925, KVariance kVariance) {
        List<AbstractC5226> typeParameters;
        if (interfaceC5925 != null) {
            typeParameters = interfaceC5925.getTypeParameters();
        } else {
            if (!(interfaceC5925 instanceof InterfaceC5926)) {
                C5043.m9163(interfaceC5925, "Type parameter container must be a class or a callable: ");
                return null;
            }
            typeParameters = ((InterfaceC5926) interfaceC5925).getTypeParameters();
        }
        for (AbstractC5226 abstractC5226 : typeParameters) {
            if (abstractC5226.mo9460().equals("PluginConfigT")) {
                return abstractC5226;
            }
        }
        C5043.m9163(interfaceC5925, "Type parameter PluginConfigT is not found in container: ");
        return null;
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5929 mo9481(PropertyReference0 propertyReference0) {
        AbstractC5835 abstractC5835M10650 = m10650(propertyReference0);
        String signature = propertyReference0.getSignature();
        return !AbstractC5905.f14967 ? new C5802(new C5874(signature, abstractC5835M10650, propertyReference0, 1)) : new C5781(abstractC5835M10650, propertyReference0.getName(), signature, propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5935 mo9482(MutablePropertyReference2 mutablePropertyReference2) {
        return new C5852(m10650(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final String mo9483(InterfaceC5215 interfaceC5215) throws IOException {
        C5858 c5858M10657 = AbstractC5913.m10657(interfaceC5215);
        if (c5858M10657 == null) {
            return super.mo9483(interfaceC5215);
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC5940 interfaceC5940M9487 = AbstractC5238.m9487(c5858M10657);
        if (interfaceC5940M9487 != null) {
            sb.append(C5901.m10641(interfaceC5940M9487.getType(), false));
            sb.append(".");
        }
        AbstractC5176.m9368(AbstractC5238.m9493(c5858M10657), sb, ", ", "(", ")", C5848.f14801, 48);
        sb.append(" -> ");
        sb.append(C5901.m10641(c5858M10657.getReturnType(), false));
        return sb.toString();
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final String mo9484(Lambda lambda) {
        return mo9483(lambda);
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC5934 mo9485(PropertyReference1 propertyReference1) {
        AbstractC5835 abstractC5835M10650 = m10650(propertyReference1);
        String signature = propertyReference1.getSignature();
        return !AbstractC5905.f14967 ? new C5803(new C5874(abstractC5835M10650, propertyReference1, signature, 3)) : new C5782(abstractC5835M10650, propertyReference1.getName(), signature, propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC5932 mo9486(PropertyReference2 propertyReference2) {
        return new C5775(m10650(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.C5229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9479(AbstractC5226 abstractC5226, List list) {
    }
}
