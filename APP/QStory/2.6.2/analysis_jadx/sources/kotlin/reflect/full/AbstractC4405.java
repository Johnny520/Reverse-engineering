package kotlin.reflect.full;

import androidx.compose.foundation.text.C1012;
import androidx.core.view.C2242;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC5072;
import kotlin.reflect.jvm.internal.C4988;
import kotlin.reflect.jvm.internal.C5003;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.C4890;
import kotlin.reflect.jvm.internal.impl.types.C4907;
import kotlin.reflect.jvm.internal.impl.types.C4911;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.reflect.jvm.internal.types.AbstractC4925;
import kotlin.reflect.jvm.internal.types.C4926;
import kotlin.reflect.jvm.internal.types.C4930;
import kotlin.reflect.jvm.internal.types.C4937;
import p103.AbstractC7274;
import p175.AbstractC7738;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.full.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4405 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5107 m8938(InterfaceC5109 interfaceC5109) {
        interfaceC5109.getClass();
        Iterator it = interfaceC5109.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((InterfaceC5107) next).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
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
        return (InterfaceC5107) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC4925 m8939(InterfaceC5091 interfaceC5091, List list, boolean z, List list2, InterfaceC5092 interfaceC5092) {
        InterfaceC4476 interfaceC4476M9986;
        C4884 c4884;
        interfaceC5091.getClass();
        list.getClass();
        list2.getClass();
        if (!AbstractC5072.f14622) {
            InterfaceC5092 interfaceC50922 = interfaceC5091 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5091 : null;
            List listM9886 = interfaceC50922 != null ? AbstractC4921.m9886(interfaceC50922) : null;
            if (listM9886 == null) {
                listM9886 = EmptyList.INSTANCE;
            }
            m8943(listM9886.size(), list.size());
            return new C4926(interfaceC5091, list, z, list2, null, false, false, false, interfaceC5092, null);
        }
        if (interfaceC5091 instanceof C5003) {
            interfaceC4476M9986 = ((C5003) interfaceC5091).m9986();
        } else {
            if (!(interfaceC5091 instanceof C4988)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(interfaceC5091);
                Class<?> cls = interfaceC5091.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
            C4988 c4988 = (C4988) interfaceC5091;
            InterfaceC4462 interfaceC4462 = c4988.f14392;
            if (interfaceC4462 == null) {
                C4210.m8602(c4988, "Descriptor-less type parameter: ");
                return null;
            }
            interfaceC4476M9986 = interfaceC4462;
        }
        m8943(interfaceC4476M9986.mo9011().getParameters().size(), list.size());
        InterfaceC4872 interfaceC4872Mo9011 = interfaceC4476M9986.mo9011();
        interfaceC4872Mo9011.getClass();
        List parameters = interfaceC4872Mo9011.getParameters();
        parameters.getClass();
        C4873.f14171.getClass();
        C4873 c4873 = C4873.f14172;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            C5084 c5084 = (C5084) obj;
            C4937 c4937 = (C4937) c5084.f14637;
            AbstractC4881 abstractC4881 = c4937 != null ? c4937.f14292 : null;
            KVariance kVariance = c5084.f14638;
            int i3 = kVariance == null ? -1 : AbstractC4406.f12974[kVariance.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters.get(i);
                obj2.getClass();
                c4884 = new C4884((InterfaceC4462) obj2);
            } else if (i3 == 1) {
                Variance variance = Variance.INVARIANT;
                abstractC4881.getClass();
                c4884 = new C4884(abstractC4881, variance);
            } else if (i3 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                abstractC4881.getClass();
                c4884 = new C4884(abstractC4881, variance2);
            } else {
                if (i3 != 3) {
                    C4210.m8621();
                    return null;
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                abstractC4881.getClass();
                c4884 = new C4884(abstractC4881, variance3);
            }
            arrayList.add(c4884);
            i = i2;
        }
        return new C4937(AbstractC4892.m9824(arrayList, c4873, interfaceC4872Mo9011, z), null, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC4925 m8940(InterfaceC5091 interfaceC5091, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = EmptyList.INSTANCE;
        }
        return m8941(interfaceC5091, list, false, EmptyList.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC4925 m8941(InterfaceC5091 interfaceC5091, List list, boolean z, List list2) {
        interfaceC5091.getClass();
        list.getClass();
        list2.getClass();
        return m8939(interfaceC5091, list, z, list2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC4925 m8942(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        List<AbstractC4393> listM9886 = AbstractC4921.m9886(interfaceC5092);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM9886, 10));
        for (AbstractC4393 abstractC4393 : listM9886) {
            arrayList.add(new C5084(m8940(abstractC4393, null, 7), KVariance.INVARIANT));
        }
        return m8940(interfaceC5092, arrayList, 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8943(int i, int i2) {
        if (i == i2) {
            return;
        }
        C4210.m8620("Class declares ", i, " type parameters, but ", i2, " were provided.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ArrayList m8944(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        List parameters = interfaceC5093.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5107) obj).getKind() == KParameter$Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ArrayList m8945(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        Collection collectionMo8888 = interfaceC5092.mo8888();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo8888) {
            if (obj instanceof InterfaceC5109) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m8946(InterfaceC5092 interfaceC5092, InterfaceC5092 interfaceC50922) {
        interfaceC50922.getClass();
        return interfaceC5092.equals(interfaceC50922) || AbstractC7274.m12465(AbstractC8189.m13660(interfaceC5092), new C2242(new PropertyReference1Impl() { // from class: kotlin.reflect.full.KClasses$isSubclassOf$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5101
            public Object get(Object obj) {
                InterfaceC5092 interfaceC50923 = (InterfaceC5092) obj;
                interfaceC50923.getClass();
                List listMo8891 = interfaceC50923.mo8891();
                ArrayList arrayList = new ArrayList();
                Iterator it = listMo8891.iterator();
                while (it.hasNext()) {
                    InterfaceC5091 interfaceC5091Mo8909 = ((InterfaceC5086) it.next()).mo8909();
                    InterfaceC5092 interfaceC50924 = interfaceC5091Mo8909 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5091Mo8909 : null;
                    if (interfaceC50924 != null) {
                        arrayList.add(interfaceC50924);
                    }
                }
                return arrayList;
            }
        }, 17), new C1012(interfaceC50922, 2)).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m8947(InterfaceC5086 interfaceC5086, InterfaceC5086 interfaceC50862) {
        interfaceC5086.getClass();
        interfaceC50862.getClass();
        if (AbstractC5072.f14622) {
            return AbstractC7738.m13028(((C4937) interfaceC5086).f14292, ((C4937) interfaceC50862).f14292);
        }
        C4907 c4907 = C4907.f14228;
        C4911 c4911 = C4911.f14236;
        C4930 c4930 = C4930.f14279;
        C4871 c4871 = new C4871(false, false, false, c4930, c4907, c4911);
        AbstractC4925 abstractC4925 = (AbstractC4925) interfaceC5086;
        AbstractC4925 abstractC49252 = (AbstractC4925) interfaceC50862;
        if (abstractC4925 == abstractC49252) {
            return true;
        }
        return C4890.f14207.m9799(c4871, c4930, abstractC4925, abstractC49252);
    }
}
