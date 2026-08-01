package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.C4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.C4775;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5115;
import p066.AbstractC6870;
import p066.AbstractC6876;
import p079.AbstractC6989;
import p079.C7004;
import p098.C7240;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4485 f13132 = new C4485("InvalidModuleNotifier", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC4477 m9074(InterfaceC4499 interfaceC4499) {
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4499.mo9028();
        if (interfaceC4499Mo9028 == null || (interfaceC4499 instanceof InterfaceC4466)) {
            return null;
        }
        if (!(interfaceC4499Mo9028.mo9028() instanceof InterfaceC4466)) {
            return m9074(interfaceC4499Mo9028);
        }
        if (interfaceC4499Mo9028 instanceof InterfaceC4477) {
            return (InterfaceC4477) interfaceC4499Mo9028;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC6989 m9075(InterfaceC4486 interfaceC4486, C4688 c4688, C0325 c0325) {
        interfaceC4486.getClass();
        c4688.getClass();
        c0325.getClass();
        AbstractC6989 abstractC6989M9077 = m9077(interfaceC4486, c4688);
        return abstractC6989M9077 != null ? abstractC6989M9077 : c0325.m967(c4688, AbstractC5122.m10110(AbstractC5122.m10111(AbstractC5122.m10115(c4688, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                return ((C4688) obj).m9324();
            }
        }), C4494.f13136)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC4477 m9076(InterfaceC4486 interfaceC4486, C4688 c4688) {
        interfaceC4486.getClass();
        c4688.getClass();
        if (interfaceC4486.mo9065(AbstractC6876.f18318) != null) {
            C2942.m6394();
            return null;
        }
        C7004 c7004Mo9062 = interfaceC4486.mo9062(c4688.f13699);
        C4686 c4686 = c4688.f13698.f13696;
        c4686.getClass();
        List listM9311 = C4686.m9311(c4686);
        InterfaceC4477 interfaceC4477Mo9155 = c7004Mo9062.f18814.mo9155((C4691) AbstractC4344.m8820(listM9311), NoLookupLocation.FROM_DESERIALIZATION);
        if (interfaceC4477Mo9155 != null) {
            for (C4691 c4691 : listM9311.subList(1, listM9311.size())) {
                if (interfaceC4477Mo9155 instanceof AbstractC6989) {
                    InterfaceC4477 interfaceC4477Mo91552 = ((AbstractC6989) interfaceC4477Mo9155).mo9215().mo9155(c4691, NoLookupLocation.FROM_DESERIALIZATION);
                    interfaceC4477Mo9155 = interfaceC4477Mo91552 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo91552 : null;
                    if (interfaceC4477Mo9155 != null) {
                    }
                }
            }
            return interfaceC4477Mo9155;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC6989 m9077(InterfaceC4486 interfaceC4486, C4688 c4688) {
        interfaceC4486.getClass();
        c4688.getClass();
        InterfaceC4477 interfaceC4477M9076 = m9076(interfaceC4486, c4688);
        if (interfaceC4477M9076 instanceof AbstractC6989) {
            return (AbstractC6989) interfaceC4477M9076;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List m9078(InterfaceC4496 interfaceC4496) {
        List parameters;
        Object next;
        InterfaceC4873 interfaceC4873Mo9001;
        List listMo9015 = interfaceC4496.mo9015();
        listMo9015.getClass();
        if (!interfaceC4496.mo9011() && !(interfaceC4496.mo9028() instanceof InterfaceC4481)) {
            return listMo9015;
        }
        int i = AbstractC4773.f13909;
        C4775 c4775 = C4775.f13913;
        List listM10110 = AbstractC5122.m10110(AbstractC5122.m10114(new C5115(new C4346(AbstractC5122.m10117(AbstractC5122.m10115(interfaceC4496, c4775), 1), 5), true, C4494.f13135), C4494.f13134));
        Iterator it = AbstractC5122.m10117(AbstractC5122.m10115(interfaceC4496, c4775), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof AbstractC6989) {
                break;
            }
        }
        AbstractC6989 abstractC6989 = (AbstractC6989) next;
        if (abstractC6989 != null && (interfaceC4873Mo9001 = abstractC6989.mo9001()) != null) {
            parameters = interfaceC4873Mo9001.getParameters();
        }
        if (parameters == null) {
            parameters = EmptyList.INSTANCE;
        }
        if (listM10110.isEmpty() && parameters.isEmpty()) {
            List listMo90152 = interfaceC4496.mo9015();
            listMo90152.getClass();
            return listMo90152;
        }
        ArrayList<InterfaceC4463> arrayListM8793 = AbstractC4344.m8793(parameters, listM10110);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(arrayListM8793, 10));
        for (InterfaceC4463 interfaceC4463 : arrayListM8793) {
            interfaceC4463.getClass();
            arrayList.add(new C4479(interfaceC4463, interfaceC4496, listMo9015.size()));
        }
        return AbstractC4344.m8793(arrayList, listMo9015);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0108 m9079(AbstractC4878 abstractC4878, InterfaceC4496 interfaceC4496, int i) {
        if (interfaceC4496 == null || C7240.m12467(interfaceC4496)) {
            return null;
        }
        int size = interfaceC4496.mo9015().size() + i;
        if (interfaceC4496.mo9011()) {
            List listSubList = abstractC4878.mo9726().subList(i, size);
            InterfaceC4499 interfaceC4499Mo9028 = interfaceC4496.mo9028();
            return new C0108(interfaceC4496, listSubList, m9079(abstractC4878, interfaceC4499Mo9028 instanceof InterfaceC4496 ? (InterfaceC4496) interfaceC4499Mo9028 : null, size));
        }
        if (size != abstractC4878.mo9726().size()) {
            AbstractC6870.m12108(interfaceC4496);
        }
        return new C0108(interfaceC4496, abstractC4878.mo9726().subList(i, abstractC4878.mo9726().size()), (C0108) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC6989 m9080(InterfaceC4486 interfaceC4486, C4687 c4687, NoLookupLocation noLookupLocation) {
        InterfaceC7254 interfaceC7254Mo9215;
        interfaceC4486.getClass();
        c4687.getClass();
        noLookupLocation.getClass();
        C4686 c4686 = c4687.f13696;
        if (!c4686.m9314()) {
            InterfaceC4477 interfaceC4477Mo9155 = interfaceC4486.mo9062(c4687.m9320()).f18814.mo9155(c4686.m9318(), noLookupLocation);
            AbstractC6989 abstractC6989 = interfaceC4477Mo9155 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9155 : null;
            if (abstractC6989 != null) {
                return abstractC6989;
            }
            AbstractC6989 abstractC6989M9080 = m9080(interfaceC4486, c4687.m9320(), noLookupLocation);
            InterfaceC4477 interfaceC4477Mo91552 = (abstractC6989M9080 == null || (interfaceC7254Mo9215 = abstractC6989M9080.mo9215()) == null) ? null : interfaceC7254Mo9215.mo9155(c4686.m9318(), noLookupLocation);
            if (interfaceC4477Mo91552 instanceof AbstractC6989) {
                return (AbstractC6989) interfaceC4477Mo91552;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m9081(InterfaceC4475 interfaceC4475, C4687 c4687) {
        interfaceC4475.getClass();
        c4687.getClass();
        return interfaceC4475.mo8952(c4687);
    }
}
