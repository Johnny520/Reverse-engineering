package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4345;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.C4774;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5114;
import p066.AbstractC6869;
import p066.AbstractC6875;
import p079.AbstractC6988;
import p079.C7003;
import p098.C7239;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4484 f13128 = new C4484("InvalidModuleNotifier", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC4476 m9084(InterfaceC4498 interfaceC4498) {
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4498.mo9038();
        if (interfaceC4498Mo9038 == null || (interfaceC4498 instanceof InterfaceC4465)) {
            return null;
        }
        if (!(interfaceC4498Mo9038.mo9038() instanceof InterfaceC4465)) {
            return m9084(interfaceC4498Mo9038);
        }
        if (interfaceC4498Mo9038 instanceof InterfaceC4476) {
            return (InterfaceC4476) interfaceC4498Mo9038;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC6988 m9085(InterfaceC4485 interfaceC4485, C4687 c4687, C0325 c0325) {
        interfaceC4485.getClass();
        c4687.getClass();
        c0325.getClass();
        AbstractC6988 abstractC6988M9087 = m9087(interfaceC4485, c4687);
        return abstractC6988M9087 != null ? abstractC6988M9087 : c0325.m966(c4687, AbstractC5121.m10106(AbstractC5121.m10111(AbstractC5121.m10112(c4687, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                return ((C4687) obj).m9334();
            }
        }), C4493.f13132)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC4476 m9086(InterfaceC4485 interfaceC4485, C4687 c4687) {
        interfaceC4485.getClass();
        c4687.getClass();
        if (interfaceC4485.mo9075(AbstractC6875.f18323) != null) {
            C2941.m6336();
            return null;
        }
        C7003 c7003Mo9072 = interfaceC4485.mo9072(c4687.f13695);
        C4685 c4685 = c4687.f13694.f13692;
        c4685.getClass();
        List listM9321 = C4685.m9321(c4685);
        InterfaceC4476 interfaceC4476Mo9165 = c7003Mo9072.f18819.mo9165((C4690) AbstractC4343.m8827(listM9321), NoLookupLocation.FROM_DESERIALIZATION);
        if (interfaceC4476Mo9165 != null) {
            for (C4690 c4690 : listM9321.subList(1, listM9321.size())) {
                if (interfaceC4476Mo9165 instanceof AbstractC6988) {
                    InterfaceC4476 interfaceC4476Mo91652 = ((AbstractC6988) interfaceC4476Mo9165).mo9225().mo9165(c4690, NoLookupLocation.FROM_DESERIALIZATION);
                    interfaceC4476Mo9165 = interfaceC4476Mo91652 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo91652 : null;
                    if (interfaceC4476Mo9165 != null) {
                    }
                }
            }
            return interfaceC4476Mo9165;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC6988 m9087(InterfaceC4485 interfaceC4485, C4687 c4687) {
        interfaceC4485.getClass();
        c4687.getClass();
        InterfaceC4476 interfaceC4476M9086 = m9086(interfaceC4485, c4687);
        if (interfaceC4476M9086 instanceof AbstractC6988) {
            return (AbstractC6988) interfaceC4476M9086;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List m9088(InterfaceC4495 interfaceC4495) {
        List parameters;
        Object next;
        InterfaceC4872 interfaceC4872Mo9011;
        List listMo9025 = interfaceC4495.mo9025();
        listMo9025.getClass();
        if (!interfaceC4495.mo9021() && !(interfaceC4495.mo9038() instanceof InterfaceC4480)) {
            return listMo9025;
        }
        int i = AbstractC4772.f13905;
        C4774 c4774 = C4774.f13909;
        List listM10106 = AbstractC5121.m10106(AbstractC5121.m10105(new C5114(new C4345(AbstractC5121.m10104(AbstractC5121.m10112(interfaceC4495, c4774), 1), 5), true, C4493.f13131), C4493.f13130));
        Iterator it = AbstractC5121.m10104(AbstractC5121.m10112(interfaceC4495, c4774), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof AbstractC6988) {
                break;
            }
        }
        AbstractC6988 abstractC6988 = (AbstractC6988) next;
        if (abstractC6988 != null && (interfaceC4872Mo9011 = abstractC6988.mo9011()) != null) {
            parameters = interfaceC4872Mo9011.getParameters();
        }
        if (parameters == null) {
            parameters = EmptyList.INSTANCE;
        }
        if (listM10106.isEmpty() && parameters.isEmpty()) {
            List listMo90252 = interfaceC4495.mo9025();
            listMo90252.getClass();
            return listMo90252;
        }
        ArrayList<InterfaceC4462> arrayListM8825 = AbstractC4343.m8825(parameters, listM10106);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(arrayListM8825, 10));
        for (InterfaceC4462 interfaceC4462 : arrayListM8825) {
            interfaceC4462.getClass();
            arrayList.add(new C4478(interfaceC4462, interfaceC4495, listMo9025.size()));
        }
        return AbstractC4343.m8825(arrayList, listMo9025);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0108 m9089(AbstractC4877 abstractC4877, InterfaceC4495 interfaceC4495, int i) {
        if (interfaceC4495 == null || C7239.m12440(interfaceC4495)) {
            return null;
        }
        int size = interfaceC4495.mo9025().size() + i;
        if (interfaceC4495.mo9021()) {
            List listSubList = abstractC4877.mo9736().subList(i, size);
            InterfaceC4498 interfaceC4498Mo9038 = interfaceC4495.mo9038();
            return new C0108(interfaceC4495, listSubList, m9089(abstractC4877, interfaceC4498Mo9038 instanceof InterfaceC4495 ? (InterfaceC4495) interfaceC4498Mo9038 : null, size));
        }
        if (size != abstractC4877.mo9736().size()) {
            AbstractC6869.m12080(interfaceC4495);
        }
        return new C0108(interfaceC4495, abstractC4877.mo9736().subList(i, abstractC4877.mo9736().size()), (C0108) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AbstractC6988 m9090(InterfaceC4485 interfaceC4485, C4686 c4686, NoLookupLocation noLookupLocation) {
        InterfaceC7253 interfaceC7253Mo9225;
        interfaceC4485.getClass();
        c4686.getClass();
        noLookupLocation.getClass();
        C4685 c4685 = c4686.f13692;
        if (!c4685.m9324()) {
            InterfaceC4476 interfaceC4476Mo9165 = interfaceC4485.mo9072(c4686.m9330()).f18819.mo9165(c4685.m9328(), noLookupLocation);
            AbstractC6988 abstractC6988 = interfaceC4476Mo9165 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9165 : null;
            if (abstractC6988 != null) {
                return abstractC6988;
            }
            AbstractC6988 abstractC6988M9090 = m9090(interfaceC4485, c4686.m9330(), noLookupLocation);
            InterfaceC4476 interfaceC4476Mo91652 = (abstractC6988M9090 == null || (interfaceC7253Mo9225 = abstractC6988M9090.mo9225()) == null) ? null : interfaceC7253Mo9225.mo9165(c4685.m9328(), noLookupLocation);
            if (interfaceC4476Mo91652 instanceof AbstractC6988) {
                return (AbstractC6988) interfaceC4476Mo91652;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m9091(InterfaceC4474 interfaceC4474, C4686 c4686) {
        interfaceC4474.getClass();
        c4686.getClass();
        return interfaceC4474.mo8962(c4686);
    }
}
