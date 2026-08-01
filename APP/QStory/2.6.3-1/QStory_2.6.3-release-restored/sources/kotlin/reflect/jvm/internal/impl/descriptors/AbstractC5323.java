package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5178;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.C5607;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import p082.AbstractC7699;
import p082.AbstractC7705;
import p095.AbstractC7818;
import p095.C7833;
import p114.C8069;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5323 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5317 f13477 = new C5317("InvalidModuleNotifier", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5309 m9633(InterfaceC5331 interfaceC5331) {
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5331.mo9587();
        if (interfaceC5331Mo9587 == null || (interfaceC5331 instanceof InterfaceC5298)) {
            return null;
        }
        if (!(interfaceC5331Mo9587.mo9587() instanceof InterfaceC5298)) {
            return m9633(interfaceC5331Mo9587);
        }
        if (interfaceC5331Mo9587 instanceof InterfaceC5309) {
            return (InterfaceC5309) interfaceC5331Mo9587;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC7818 m9634(InterfaceC5318 interfaceC5318, C5520 c5520, C1171 c1171) {
        interfaceC5318.getClass();
        c5520.getClass();
        c1171.getClass();
        AbstractC7818 abstractC7818M9636 = m9636(interfaceC5318, c5520);
        return abstractC7818M9636 != null ? abstractC7818M9636 : c1171.m1527(c5520, AbstractC5954.m10669(AbstractC5954.m10670(AbstractC5954.m10674(c5520, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                return ((C5520) obj).m9883();
            }
        }), C5326.f13481)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5309 m9635(InterfaceC5318 interfaceC5318, C5520 c5520) {
        interfaceC5318.getClass();
        c5520.getClass();
        if (interfaceC5318.mo9624(AbstractC7705.f18663) != null) {
            C3775.m6954();
            return null;
        }
        C7833 c7833Mo9621 = interfaceC5318.mo9621(c5520.f14044);
        C5518 c5518 = c5520.f14043.f14041;
        c5518.getClass();
        List listM9870 = C5518.m9870(c5518);
        InterfaceC5309 interfaceC5309Mo9714 = c7833Mo9621.f19159.mo9714((C5523) AbstractC5176.m9379(listM9870), NoLookupLocation.FROM_DESERIALIZATION);
        if (interfaceC5309Mo9714 != null) {
            for (C5523 c5523 : listM9870.subList(1, listM9870.size())) {
                if (interfaceC5309Mo9714 instanceof AbstractC7818) {
                    InterfaceC5309 interfaceC5309Mo97142 = ((AbstractC7818) interfaceC5309Mo9714).mo9774().mo9714(c5523, NoLookupLocation.FROM_DESERIALIZATION);
                    interfaceC5309Mo9714 = interfaceC5309Mo97142 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo97142 : null;
                    if (interfaceC5309Mo9714 != null) {
                    }
                }
            }
            return interfaceC5309Mo9714;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC7818 m9636(InterfaceC5318 interfaceC5318, C5520 c5520) {
        interfaceC5318.getClass();
        c5520.getClass();
        InterfaceC5309 interfaceC5309M9635 = m9635(interfaceC5318, c5520);
        if (interfaceC5309M9635 instanceof AbstractC7818) {
            return (AbstractC7818) interfaceC5309M9635;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List m9637(InterfaceC5328 interfaceC5328) {
        List parameters;
        Object next;
        InterfaceC5705 interfaceC5705Mo9560;
        List listMo9574 = interfaceC5328.mo9574();
        listMo9574.getClass();
        if (!interfaceC5328.mo9570() && !(interfaceC5328.mo9587() instanceof InterfaceC5313)) {
            return listMo9574;
        }
        int i = AbstractC5605.f14254;
        C5607 c5607 = C5607.f14258;
        List listM10669 = AbstractC5954.m10669(AbstractC5954.m10673(new C5947(new C5178(AbstractC5954.m10676(AbstractC5954.m10674(interfaceC5328, c5607), 1), 5), true, C5326.f13480), C5326.f13479));
        Iterator it = AbstractC5954.m10676(AbstractC5954.m10674(interfaceC5328, c5607), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof AbstractC7818) {
                break;
            }
        }
        AbstractC7818 abstractC7818 = (AbstractC7818) next;
        if (abstractC7818 != null && (interfaceC5705Mo9560 = abstractC7818.mo9560()) != null) {
            parameters = interfaceC5705Mo9560.getParameters();
        }
        if (parameters == null) {
            parameters = EmptyList.INSTANCE;
        }
        if (listM10669.isEmpty() && parameters.isEmpty()) {
            List listMo95742 = interfaceC5328.mo9574();
            listMo95742.getClass();
            return listMo95742;
        }
        ArrayList<InterfaceC5295> arrayListM9352 = AbstractC5176.m9352(parameters, listM10669);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(arrayListM9352, 10));
        for (InterfaceC5295 interfaceC5295 : arrayListM9352) {
            interfaceC5295.getClass();
            arrayList.add(new C5311(interfaceC5295, interfaceC5328, listMo9574.size()));
        }
        return AbstractC5176.m9352(arrayList, listMo9574);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0955 m9638(AbstractC5710 abstractC5710, InterfaceC5328 interfaceC5328, int i) {
        if (interfaceC5328 == null || C8069.m13026(interfaceC5328)) {
            return null;
        }
        int size = interfaceC5328.mo9574().size() + i;
        if (interfaceC5328.mo9570()) {
            List listSubList = abstractC5710.mo10285().subList(i, size);
            InterfaceC5331 interfaceC5331Mo9587 = interfaceC5328.mo9587();
            return new C0955(interfaceC5328, listSubList, m9638(abstractC5710, interfaceC5331Mo9587 instanceof InterfaceC5328 ? (InterfaceC5328) interfaceC5331Mo9587 : null, size));
        }
        if (size != abstractC5710.mo10285().size()) {
            AbstractC7699.m12667(interfaceC5328);
        }
        return new C0955(interfaceC5328, abstractC5710.mo10285().subList(i, abstractC5710.mo10285().size()), (C0955) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC7818 m9639(InterfaceC5318 interfaceC5318, C5519 c5519, NoLookupLocation noLookupLocation) {
        InterfaceC8083 interfaceC8083Mo9774;
        interfaceC5318.getClass();
        c5519.getClass();
        noLookupLocation.getClass();
        C5518 c5518 = c5519.f14041;
        if (!c5518.m9873()) {
            InterfaceC5309 interfaceC5309Mo9714 = interfaceC5318.mo9621(c5519.m9879()).f19159.mo9714(c5518.m9877(), noLookupLocation);
            AbstractC7818 abstractC7818 = interfaceC5309Mo9714 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9714 : null;
            if (abstractC7818 != null) {
                return abstractC7818;
            }
            AbstractC7818 abstractC7818M9639 = m9639(interfaceC5318, c5519.m9879(), noLookupLocation);
            InterfaceC5309 interfaceC5309Mo97142 = (abstractC7818M9639 == null || (interfaceC8083Mo9774 = abstractC7818M9639.mo9774()) == null) ? null : interfaceC8083Mo9774.mo9714(c5518.m9877(), noLookupLocation);
            if (interfaceC5309Mo97142 instanceof AbstractC7818) {
                return (AbstractC7818) interfaceC5309Mo97142;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m9640(InterfaceC5307 interfaceC5307, C5519 c5519) {
        interfaceC5307.getClass();
        c5519.getClass();
        return interfaceC5307.mo9511(c5519);
    }
}
