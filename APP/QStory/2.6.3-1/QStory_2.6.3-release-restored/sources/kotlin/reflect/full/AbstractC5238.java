package kotlin.reflect.full;

import androidx.compose.foundation.text.C1850;
import androidx.core.view.C3075;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC5905;
import kotlin.reflect.jvm.internal.C5821;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.C5704;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.C5723;
import kotlin.reflect.jvm.internal.impl.types.C5740;
import kotlin.reflect.jvm.internal.impl.types.C5744;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5759;
import kotlin.reflect.jvm.internal.types.C5763;
import kotlin.reflect.jvm.internal.types.C5770;
import p050.AbstractC7176;
import p119.AbstractC8104;

/* JADX INFO: renamed from: kotlin.reflect.full.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5238 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5940 m9487(InterfaceC5942 interfaceC5942) {
        interfaceC5942.getClass();
        Iterator it = interfaceC5942.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((InterfaceC5940) next).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (InterfaceC5940) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC5758 m9488(InterfaceC5924 interfaceC5924, List list, boolean z, List list2, InterfaceC5925 interfaceC5925) {
        InterfaceC5309 interfaceC5309M10542;
        C5717 c5717;
        interfaceC5924.getClass();
        list.getClass();
        list2.getClass();
        if (!AbstractC5905.f14967) {
            InterfaceC5925 interfaceC59252 = interfaceC5924 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924 : null;
            List listM10439 = interfaceC59252 != null ? AbstractC5754.m10439(interfaceC59252) : null;
            if (listM10439 == null) {
                listM10439 = EmptyList.INSTANCE;
            }
            m9492(listM10439.size(), list.size());
            return new C5759(interfaceC5924, list, z, list2, null, false, false, false, interfaceC5925, null);
        }
        if (interfaceC5924 instanceof C5836) {
            interfaceC5309M10542 = ((C5836) interfaceC5924).m10542();
        } else {
            if (!(interfaceC5924 instanceof C5821)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(interfaceC5924);
                Class<?> cls = interfaceC5924.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
            C5821 c5821 = (C5821) interfaceC5924;
            InterfaceC5295 interfaceC5295 = c5821.f14739;
            if (interfaceC5295 == null) {
                C5043.m9151(c5821, "Descriptor-less type parameter: ");
                return null;
            }
            interfaceC5309M10542 = interfaceC5295;
        }
        m9492(interfaceC5309M10542.mo9560().getParameters().size(), list.size());
        InterfaceC5705 interfaceC5705Mo9560 = interfaceC5309M10542.mo9560();
        interfaceC5705Mo9560.getClass();
        List parameters = interfaceC5705Mo9560.getParameters();
        parameters.getClass();
        C5706.f14520.getClass();
        C5706 c5706 = C5706.f14521;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            C5917 c5917 = (C5917) obj;
            C5770 c5770 = (C5770) c5917.f14982;
            AbstractC5714 abstractC5714 = c5770 != null ? c5770.f14639 : null;
            KVariance kVariance = c5917.f14983;
            int i3 = kVariance == null ? -1 : AbstractC5239.f13323[kVariance.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters.get(i);
                obj2.getClass();
                c5717 = new C5717((InterfaceC5295) obj2);
            } else if (i3 == 1) {
                Variance variance = Variance.INVARIANT;
                abstractC5714.getClass();
                c5717 = new C5717(abstractC5714, variance);
            } else if (i3 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                abstractC5714.getClass();
                c5717 = new C5717(abstractC5714, variance2);
            } else {
                if (i3 != 3) {
                    C5043.m9170();
                    return null;
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                abstractC5714.getClass();
                c5717 = new C5717(abstractC5714, variance3);
            }
            arrayList.add(c5717);
            i = i2;
        }
        return new C5770(AbstractC5725.m10377(arrayList, c5706, interfaceC5705Mo9560, z), null, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC5758 m9489(InterfaceC5924 interfaceC5924, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = EmptyList.INSTANCE;
        }
        return m9490(interfaceC5924, list, false, EmptyList.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC5758 m9490(InterfaceC5924 interfaceC5924, List list, boolean z, List list2) {
        interfaceC5924.getClass();
        list.getClass();
        list2.getClass();
        return m9488(interfaceC5924, list, z, list2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC5758 m9491(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        List<AbstractC5226> listM10439 = AbstractC5754.m10439(interfaceC5925);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM10439, 10));
        for (AbstractC5226 abstractC5226 : listM10439) {
            arrayList.add(new C5917(m9489(abstractC5226, null, 7), KVariance.INVARIANT));
        }
        return m9489(interfaceC5925, arrayList, 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m9492(int i, int i2) {
        if (i == i2) {
            return;
        }
        C5043.m9169("Class declares ", i, " type parameters, but ", i2, " were provided.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ArrayList m9493(InterfaceC5926 interfaceC5926) {
        interfaceC5926.getClass();
        List parameters = interfaceC5926.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5940) obj).getKind() == KParameter$Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ArrayList m9494(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        Collection collectionMo9437 = interfaceC5925.mo9437();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo9437) {
            if (obj instanceof InterfaceC5942) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m9495(InterfaceC5925 interfaceC5925, InterfaceC5925 interfaceC59252) {
        interfaceC59252.getClass();
        return interfaceC5925.equals(interfaceC59252) || AbstractC8104.m13051(AbstractC7176.m12487(interfaceC5925), new C3075(new PropertyReference1Impl() { // from class: kotlin.reflect.full.KClasses$isSubclassOf$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5934
            public Object get(Object obj) {
                InterfaceC5925 interfaceC59253 = (InterfaceC5925) obj;
                interfaceC59253.getClass();
                List listMo9440 = interfaceC59253.mo9440();
                ArrayList arrayList = new ArrayList();
                Iterator it = listMo9440.iterator();
                while (it.hasNext()) {
                    InterfaceC5924 interfaceC5924Mo9458 = ((InterfaceC5919) it.next()).mo9458();
                    InterfaceC5925 interfaceC59254 = interfaceC5924Mo9458 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924Mo9458 : null;
                    if (interfaceC59254 != null) {
                        arrayList.add(interfaceC59254);
                    }
                }
                return arrayList;
            }
        }, 17), new C1850(interfaceC59252, 2)).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m9496(InterfaceC5919 interfaceC5919, InterfaceC5919 interfaceC59192) {
        interfaceC5919.getClass();
        interfaceC59192.getClass();
        if (AbstractC5905.f14967) {
            return AbstractC3738.m6852(((C5770) interfaceC5919).f14639, ((C5770) interfaceC59192).f14639);
        }
        C5740 c5740 = C5740.f14577;
        C5744 c5744 = C5744.f14585;
        C5763 c5763 = C5763.f14626;
        C5704 c5704 = new C5704(false, false, false, c5763, c5740, c5744);
        AbstractC5758 abstractC5758 = (AbstractC5758) interfaceC5919;
        AbstractC5758 abstractC57582 = (AbstractC5758) interfaceC59192;
        if (abstractC5758 == abstractC57582) {
            return true;
        }
        return C5723.f14556.m10352(c5704, c5763, abstractC5758, abstractC57582);
    }
}
