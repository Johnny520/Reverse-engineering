package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.animation.core.C1171;
import androidx.core.view.C3040;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5618;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5619;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5707;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.C5718;
import kotlin.reflect.jvm.internal.impl.types.C5723;
import kotlin.reflect.jvm.internal.impl.types.C5734;
import kotlin.reflect.jvm.internal.impl.types.C5738;
import kotlin.reflect.jvm.internal.impl.types.C5745;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5953;
import p023.C6986;
import p050.AbstractC7176;
import p061.AbstractC7302;
import p061.C7291;
import p062.C7311;
import p062.C7314;
import p062.InterfaceC7310;
import p065.AbstractC7355;
import p065.AbstractC7359;
import p082.AbstractC7699;
import p086.AbstractC7728;
import p086.AbstractC7738;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5680 f14366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5680 f14367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f14368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5642 f14370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5656 f14371;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map f14372;

    public C5642(C5656 c5656, C5642 c5642, List list, String str, String str2) {
        Map linkedHashMap;
        list.getClass();
        this.f14371 = c5656;
        this.f14370 = c5642;
        this.f14369 = str;
        this.f14368 = str2;
        C5677 c5677 = c5656.f14407.f14437;
        int i = 0;
        this.f14367 = c5677.m10137(new C5635(this, i));
        this.f14366 = c5677.m10137(new C5635(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = AbstractC5171.m9335();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter) it.next();
                linkedHashMap.put(Integer.valueOf(protoBuf$TypeParameter.getId()), new C5619(this.f14371, protoBuf$TypeParameter, i));
                i++;
            }
        }
        this.f14372 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C5706 m10103(List list, InterfaceC7310 interfaceC7310) {
        C5706 c5706M10326;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C5734) it.next()).getClass();
            if (interfaceC7310.isEmpty()) {
                C5706.f14520.getClass();
                c5706M10326 = C5706.f14521;
            } else {
                C5707 c5707 = C5706.f14520;
                List listM12487 = AbstractC7176.m12487(new C5745(interfaceC7310));
                c5707.getClass();
                c5706M10326 = C5707.m10326(listM12487);
            }
            arrayList.add(c5706M10326);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC5176.m9363((Iterable) it2.next(), arrayList2);
        }
        C5706.f14520.getClass();
        return C5707.m10326(arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ArrayList m10104(ProtoBuf$Type protoBuf$Type, C5642 c5642) {
        List<ProtoBuf$Type.Argument> argumentList = protoBuf$Type.getArgumentList();
        argumentList.getClass();
        ProtoBuf$Type protoBuf$TypeM12756 = AbstractC7738.m12756(protoBuf$Type, c5642.f14371.f14404);
        Iterable iterableM10104 = protoBuf$TypeM12756 != null ? m10104(protoBuf$TypeM12756, c5642) : null;
        if (iterableM10104 == null) {
            iterableM10104 = EmptyList.INSTANCE;
        }
        return AbstractC5176.m9352(iterableM10104, argumentList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC5710 m10105(AbstractC5710 abstractC5710, AbstractC5714 abstractC5714) {
        AbstractC7359 abstractC7359M6877 = AbstractC3738.m6877(abstractC5710);
        InterfaceC7310 annotations = abstractC5710.getAnnotations();
        AbstractC5714 abstractC5714M6860 = AbstractC3738.m6860(abstractC5710);
        List listM6878 = AbstractC3738.m6878(abstractC5710);
        List listM9360 = AbstractC5176.m9360(1, AbstractC3738.m6866(abstractC5710));
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM9360, 10));
        Iterator it = listM9360.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC5702) it.next()).mo10300());
        }
        return AbstractC3738.m6880(abstractC7359M6877, annotations, abstractC5714M6860, listM6878, arrayList, abstractC5714, true).mo10290(abstractC5710.mo10284());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC7818 m10106(C5642 c5642, ProtoBuf$Type protoBuf$Type, int i) {
        C5656 c5656 = c5642.f14371;
        C5520 c5520M8878 = AbstractC4765.m8878(c5656.f14406, i);
        C5953 c5953M10670 = AbstractC5954.m10670(AbstractC5954.m10674(protoBuf$Type, new C5635(c5642, 2)), C5643.f14373);
        ArrayList arrayList = new ArrayList();
        Iterator it = c5953M10670.iterator();
        while (true) {
            C3040 c3040 = (C3040) it;
            if (!c3040.hasNext()) {
                break;
            }
            arrayList.add(c3040.next());
        }
        Iterator it2 = AbstractC5954.m10674(c5520M8878, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return ((C5520) obj).m9883();
            }
        }).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 < 0) {
                AbstractC7176.m12480();
                throw null;
            }
        }
        while (arrayList.size() < i2) {
            arrayList.add(0);
        }
        return c5656.f14407.f14449.m1527(c5520M8878, arrayList);
    }

    public final String toString() {
        C5642 c5642 = this.f14370;
        return this.f14369.concat(c5642 == null ? "" : ". Child of ".concat(c5642.f14369));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5710 m10107(ProtoBuf$Type protoBuf$Type, boolean z) {
        InterfaceC5705 interfaceC5705M13028;
        InterfaceC5309 interfaceC5309M10106;
        Object next;
        AbstractC5710 abstractC5710M10377;
        AbstractC5710 abstractC5710M103772;
        AbstractC7302 abstractC7302M6875;
        AbstractC5702 abstractC5702;
        AbstractC5714 abstractC5714Mo10300;
        int size;
        Variance variance;
        AbstractC5702 c5717;
        C5656 c5656 = this.f14371;
        C6986 c6986 = c5656.f14404;
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        C5665 c5665 = c5656.f14407;
        protoBuf$Type.getClass();
        if (protoBuf$Type.hasClassName()) {
            if (AbstractC4765.m8878(c5656.f14406, protoBuf$Type.getClassName()).f14042) {
                c5656.f14407.f14447.getClass();
            }
        } else if (protoBuf$Type.hasTypeAliasName()) {
            if (AbstractC4765.m8878(c5656.f14406, protoBuf$Type.getTypeAliasName()).f14042) {
                c5656.f14407.f14447.getClass();
            }
        }
        if (!protoBuf$Type.hasClassName()) {
            if (protoBuf$Type.hasTypeParameter()) {
                interfaceC5309M10106 = m10108(protoBuf$Type.getTypeParameter());
                if (interfaceC5309M10106 == null) {
                    C8069 c8069 = C8069.f19636;
                    interfaceC5705M13028 = C8069.m13028(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(protoBuf$Type.getTypeParameter()), this.f14368);
                }
            } else if (protoBuf$Type.hasTypeParameterName()) {
                String string = c5656.f14406.getString(protoBuf$Type.getTypeParameterName());
                Iterator it = m10109().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC5227.m9466(((InterfaceC5295) next).getName().m9894(), string)) {
                        break;
                    }
                }
                InterfaceC5295 interfaceC5295 = (InterfaceC5295) next;
                if (interfaceC5295 == null) {
                    C8069 c80692 = C8069.f19636;
                    interfaceC5705M13028 = C8069.m13028(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, interfaceC5331.toString());
                } else {
                    interfaceC5309M10106 = interfaceC5295;
                }
            } else if (protoBuf$Type.hasTypeAliasName()) {
                interfaceC5309M10106 = (InterfaceC5309) this.f14366.invoke(Integer.valueOf(protoBuf$Type.getTypeAliasName()));
                if (interfaceC5309M10106 == null) {
                    interfaceC5309M10106 = m10106(this, protoBuf$Type, protoBuf$Type.getTypeAliasName());
                }
            } else {
                C8069 c80693 = C8069.f19636;
                interfaceC5705M13028 = C8069.m13028(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            boolean z2 = true;
            if (!C8069.m13026(interfaceC5705M13028.mo9770())) {
                C8069 c80694 = C8069.f19636;
                ErrorTypeKind errorTypeKind = ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
                String[] strArr = {interfaceC5705M13028.toString()};
                errorTypeKind.getClass();
                return C8069.m13027(errorTypeKind, EmptyList.INSTANCE, interfaceC5705M13028, (String[]) Arrays.copyOf(strArr, 1));
            }
            C5618 c5618 = new C5618(c5665.f14437, new C5860(this, 9, protoBuf$Type));
            C5706 c5706M10103 = m10103(c5665.f14443, c5618);
            ArrayList arrayListM10104 = m10104(protoBuf$Type, this);
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(arrayListM10104, 10));
            int i = 0;
            for (Object obj : arrayListM10104) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC7176.m12479();
                    throw null;
                }
                ProtoBuf$Type.Argument argument = (ProtoBuf$Type.Argument) obj;
                List parameters = interfaceC5705M13028.getParameters();
                parameters.getClass();
                InterfaceC5295 interfaceC52952 = (InterfaceC5295) AbstractC5176.m9377(i, parameters);
                if (argument.getProjection() == ProtoBuf$Type.Argument.Projection.STAR) {
                    c5717 = interfaceC52952 == null ? new C5718(c5665.f14436.mo9620()) : new C5717(interfaceC52952);
                } else {
                    ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
                    projection.getClass();
                    int i3 = AbstractC5639.f14358[projection.ordinal()];
                    if (i3 == 1) {
                        variance = Variance.IN_VARIANCE;
                    } else if (i3 == 2) {
                        variance = Variance.OUT_VARIANCE;
                    } else {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                C5043.m9170();
                                return null;
                            }
                            C5043.m9163(projection, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        variance = Variance.INVARIANT;
                    }
                    ProtoBuf$Type protoBuf$TypeM12750 = AbstractC7738.m12750(argument, c6986);
                    c5717 = protoBuf$TypeM12750 == null ? new C5717(C8069.m13029(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new C5717(m10110(protoBuf$TypeM12750), variance);
                }
                arrayList.add(c5717);
                i = i2;
            }
            Object obj2 = null;
            List listM9356 = AbstractC5176.m9356(arrayList);
            InterfaceC5309 interfaceC5309Mo9770 = interfaceC5705M13028.mo9770();
            if (z && (interfaceC5309Mo9770 instanceof AbstractC7825)) {
                AbstractC7825 abstractC7825 = (AbstractC7825) interfaceC5309Mo9770;
                listM9356.getClass();
                C5723 c5723 = new C5723();
                List parameters2 = abstractC7825.f19096.getParameters();
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((InterfaceC5295) it2.next()).mo9561());
                }
                C1171 c1171 = new C1171(obj2, abstractC7825, listM9356, AbstractC5171.m9330(AbstractC5176.m9380(arrayList2, listM9356)), 14);
                C5706.f14520.getClass();
                C5706 c5706 = C5706.f14521;
                c5706.getClass();
                AbstractC5710 abstractC5710M10356 = c5723.m10356(c1171, c5706, false, 0, true);
                List list = c5665.f14443;
                ArrayList arrayListM9349 = AbstractC5176.m9349(c5618, abstractC5710M10356.getAnnotations());
                C5706 c5706M101032 = m10103(list, arrayListM9349.isEmpty() ? C7311.f18113 : new C7314(0, arrayListM9349));
                if (!AbstractC5749.m10403(abstractC5710M10356) && !protoBuf$Type.getNullable()) {
                    z2 = false;
                }
                abstractC5710M10377 = abstractC5710M10356.mo10290(z2).mo10329(c5706M101032);
            } else if (AbstractC7728.f18729.mo12740(protoBuf$Type.getFlags()).booleanValue()) {
                boolean nullable = protoBuf$Type.getNullable();
                int size2 = interfaceC5705M13028.getParameters().size() - listM9356.size();
                if (size2 != 0) {
                    if (size2 == 1 && (size = listM9356.size() - 1) >= 0) {
                        InterfaceC5705 interfaceC5705Mo9560 = interfaceC5705M13028.mo10052().m12589(size).mo9560();
                        interfaceC5705Mo9560.getClass();
                        abstractC5710M103772 = AbstractC5725.m10377(listM9356, c5706M10103, interfaceC5705Mo9560, nullable);
                    } else {
                        abstractC5710M103772 = null;
                    }
                    if (abstractC5710M103772 != null) {
                        C8069 c80695 = C8069.f19636;
                        abstractC5710M10377 = C8069.m13027(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, listM9356, interfaceC5705M13028, new String[0]);
                    } else {
                        abstractC5710M10377 = abstractC5710M103772;
                    }
                } else {
                    abstractC5710M103772 = AbstractC5725.m10377(listM9356, c5706M10103, interfaceC5705M13028, nullable);
                    InterfaceC5309 interfaceC5309Mo97702 = abstractC5710M103772.mo10281().mo9770();
                    if (interfaceC5309Mo97702 != null && (interfaceC5309Mo97702 instanceof AbstractC7818) && AbstractC7359.m12573(interfaceC5309Mo97702)) {
                        int i4 = AbstractC5605.f14254;
                        C5518 c5518M12660 = AbstractC7699.m12660(interfaceC5309Mo97702);
                        c5518M12660.getClass();
                        abstractC7302M6875 = AbstractC3738.m6875(c5518M12660);
                    } else {
                        abstractC7302M6875 = null;
                    }
                    if (AbstractC5227.m9466(abstractC7302M6875, C7291.f18079) && (abstractC5702 = (AbstractC5702) AbstractC5176.m9371(AbstractC3738.m6866(abstractC5710M103772))) != null && (abstractC5714Mo10300 = abstractC5702.mo10300()) != null) {
                        InterfaceC5309 interfaceC5309Mo97703 = abstractC5714Mo10300.mo10281().mo9770();
                        C5519 c5519M10064 = interfaceC5309Mo97703 != null ? AbstractC5605.m10064(interfaceC5309Mo97703) : null;
                        if (abstractC5714Mo10300.mo10285().size() == 1 && (AbstractC5227.m9466(c5519M10064, AbstractC7355.f18196) || AbstractC5227.m9466(c5519M10064, AbstractC5641.f14365))) {
                            AbstractC5714 abstractC5714Mo103002 = ((AbstractC5702) AbstractC5176.m9338(abstractC5714Mo10300.mo10285())).mo10300();
                            abstractC5714Mo103002.getClass();
                            InterfaceC5313 interfaceC5313 = interfaceC5331 instanceof InterfaceC5313 ? (InterfaceC5313) interfaceC5331 : null;
                            abstractC5710M103772 = AbstractC5227.m9466(interfaceC5313 != null ? AbstractC5605.m10060(interfaceC5313) : null, AbstractC5636.f14355) ? m10105(abstractC5710M103772, abstractC5714Mo103002) : m10105(abstractC5710M103772, abstractC5714Mo103002);
                        }
                    }
                    if (abstractC5710M103772 != null) {
                    }
                }
            } else {
                abstractC5710M10377 = AbstractC5725.m10377(listM9356, c5706M10103, interfaceC5705M13028, protoBuf$Type.getNullable());
                if (AbstractC7728.f18728.mo12740(protoBuf$Type.getFlags()).booleanValue()) {
                    C5738 c5738M10348 = C5723.m10348(abstractC5710M10377, true);
                    if (c5738M10348 == null) {
                        C5043.m9152(abstractC5710M10377, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    abstractC5710M10377 = c5738M10348;
                }
            }
            ProtoBuf$Type protoBuf$TypeM12749 = AbstractC7738.m12749(protoBuf$Type, c6986);
            return protoBuf$TypeM12749 != null ? AbstractC5725.m10365(abstractC5710M10377, m10107(protoBuf$TypeM12749, false)) : abstractC5710M10377;
        }
        interfaceC5309M10106 = (InterfaceC5309) this.f14367.invoke(Integer.valueOf(protoBuf$Type.getClassName()));
        if (interfaceC5309M10106 == null) {
            interfaceC5309M10106 = m10106(this, protoBuf$Type, protoBuf$Type.getClassName());
        }
        interfaceC5705M13028 = interfaceC5309M10106.mo9560();
        interfaceC5705M13028.getClass();
        boolean z22 = true;
        if (!C8069.m13026(interfaceC5705M13028.mo9770())) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5295 m10108(int i) {
        InterfaceC5295 interfaceC5295 = (InterfaceC5295) this.f14372.get(Integer.valueOf(i));
        if (interfaceC5295 != null) {
            return interfaceC5295;
        }
        C5642 c5642 = this.f14370;
        if (c5642 != null) {
            return c5642.m10108(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m10109() {
        return AbstractC5176.m9356(this.f14372.values());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC5714 m10110(ProtoBuf$Type protoBuf$Type) {
        protoBuf$Type.getClass();
        if (!protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            return m10107(protoBuf$Type, true);
        }
        C5656 c5656 = this.f14371;
        String string = c5656.f14406.getString(protoBuf$Type.getFlexibleTypeCapabilitiesId());
        AbstractC5710 abstractC5710M10107 = m10107(protoBuf$Type, true);
        ProtoBuf$Type protoBuf$TypeM12744 = AbstractC7738.m12744(protoBuf$Type, c5656.f14404);
        protoBuf$TypeM12744.getClass();
        return c5656.f14407.f14451.mo9825(protoBuf$Type, string, abstractC5710M10107, m10107(protoBuf$TypeM12744, true));
    }
}
