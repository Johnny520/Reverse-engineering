package kotlin.reflect.full;

import androidx.compose.foundation.text.C1012;
import androidx.core.view.C2242;
import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC5073;
import kotlin.reflect.jvm.internal.C4989;
import kotlin.reflect.jvm.internal.C5004;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4872;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.C4891;
import kotlin.reflect.jvm.internal.impl.types.C4908;
import kotlin.reflect.jvm.internal.impl.types.C4912;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import kotlin.reflect.jvm.internal.types.C4927;
import kotlin.reflect.jvm.internal.types.C4931;
import kotlin.reflect.jvm.internal.types.C4938;
import p034.AbstractC6347;
import p103.AbstractC7275;

/* JADX INFO: renamed from: kotlin.reflect.full.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4406 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5108 m8928(InterfaceC5110 interfaceC5110) {
        interfaceC5110.getClass();
        Iterator it = interfaceC5110.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((InterfaceC5108) next).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
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
        return (InterfaceC5108) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final AbstractC4926 m8929(InterfaceC5092 interfaceC5092, List list, boolean z, List list2, InterfaceC5093 interfaceC5093) {
        InterfaceC4477 interfaceC4477M9983;
        C4885 c4885;
        interfaceC5092.getClass();
        list.getClass();
        list2.getClass();
        if (!AbstractC5073.f14622) {
            InterfaceC5093 interfaceC50932 = interfaceC5092 instanceof InterfaceC5093 ? (InterfaceC5093) interfaceC5092 : null;
            List listM9880 = interfaceC50932 != null ? AbstractC4922.m9880(interfaceC50932) : null;
            if (listM9880 == null) {
                listM9880 = EmptyList.INSTANCE;
            }
            m8933(listM9880.size(), list.size());
            return new C4927(interfaceC5092, list, z, list2, null, false, false, false, interfaceC5093, null);
        }
        if (interfaceC5092 instanceof C5004) {
            interfaceC4477M9983 = ((C5004) interfaceC5092).m9983();
        } else {
            if (!(interfaceC5092 instanceof C4989)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(interfaceC5092);
                Class<?> cls = interfaceC5092.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
            C4989 c4989 = (C4989) interfaceC5092;
            InterfaceC4463 interfaceC4463 = c4989.f14394;
            if (interfaceC4463 == null) {
                C4211.m8592(c4989, "Descriptor-less type parameter: ");
                return null;
            }
            interfaceC4477M9983 = interfaceC4463;
        }
        m8933(interfaceC4477M9983.mo9001().getParameters().size(), list.size());
        InterfaceC4873 interfaceC4873Mo9001 = interfaceC4477M9983.mo9001();
        interfaceC4873Mo9001.getClass();
        List parameters = interfaceC4873Mo9001.getParameters();
        parameters.getClass();
        C4874.f14175.getClass();
        C4874 c4874 = C4874.f14176;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            C5085 c5085 = (C5085) obj;
            C4938 c4938 = (C4938) c5085.f14637;
            AbstractC4882 abstractC4882 = c4938 != null ? c4938.f14294 : null;
            KVariance kVariance = c5085.f14638;
            int i3 = kVariance == null ? -1 : AbstractC4407.f12978[kVariance.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters.get(i);
                obj2.getClass();
                c4885 = new C4885((InterfaceC4463) obj2);
            } else if (i3 == 1) {
                Variance variance = Variance.INVARIANT;
                abstractC4882.getClass();
                c4885 = new C4885(abstractC4882, variance);
            } else if (i3 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                abstractC4882.getClass();
                c4885 = new C4885(abstractC4882, variance2);
            } else {
                if (i3 != 3) {
                    C4211.m8611();
                    return null;
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                abstractC4882.getClass();
                c4885 = new C4885(abstractC4882, variance3);
            }
            arrayList.add(c4885);
            i = i2;
        }
        return new C4938(AbstractC4893.m9818(arrayList, c4874, interfaceC4873Mo9001, z), null, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC4926 m8930(InterfaceC5092 interfaceC5092, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = EmptyList.INSTANCE;
        }
        return m8931(interfaceC5092, list, false, EmptyList.INSTANCE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC4926 m8931(InterfaceC5092 interfaceC5092, List list, boolean z, List list2) {
        interfaceC5092.getClass();
        list.getClass();
        list2.getClass();
        return m8929(interfaceC5092, list, z, list2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC4926 m8932(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        List<AbstractC4394> listM9880 = AbstractC4922.m9880(interfaceC5093);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM9880, 10));
        for (AbstractC4394 abstractC4394 : listM9880) {
            arrayList.add(new C5085(m8930(abstractC4394, null, 7), KVariance.INVARIANT));
        }
        return m8930(interfaceC5093, arrayList, 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8933(int i, int i2) {
        if (i == i2) {
            return;
        }
        C4211.m8610("Class declares ", i, " type parameters, but ", i2, " were provided.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ArrayList m8934(InterfaceC5094 interfaceC5094) {
        interfaceC5094.getClass();
        List parameters = interfaceC5094.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5108) obj).getKind() == KParameter$Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ArrayList m8935(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        Collection collectionMo8878 = interfaceC5093.mo8878();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo8878) {
            if (obj instanceof InterfaceC5110) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m8936(InterfaceC5093 interfaceC5093, InterfaceC5093 interfaceC50932) {
        interfaceC50932.getClass();
        return interfaceC5093.equals(interfaceC50932) || AbstractC7275.m12492(AbstractC6347.m11928(interfaceC5093), new C2242(new PropertyReference1Impl() { // from class: kotlin.reflect.full.KClasses$isSubclassOf$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5102
            public Object get(Object obj) {
                InterfaceC5093 interfaceC50933 = (InterfaceC5093) obj;
                interfaceC50933.getClass();
                List listMo8881 = interfaceC50933.mo8881();
                ArrayList arrayList = new ArrayList();
                Iterator it = listMo8881.iterator();
                while (it.hasNext()) {
                    InterfaceC5092 interfaceC5092Mo8899 = ((InterfaceC5087) it.next()).mo8899();
                    InterfaceC5093 interfaceC50934 = interfaceC5092Mo8899 instanceof InterfaceC5093 ? (InterfaceC5093) interfaceC5092Mo8899 : null;
                    if (interfaceC50934 != null) {
                        arrayList.add(interfaceC50934);
                    }
                }
                return arrayList;
            }
        }, 17), new C1012(interfaceC50932, 2)).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m8937(InterfaceC5087 interfaceC5087, InterfaceC5087 interfaceC50872) {
        interfaceC5087.getClass();
        interfaceC50872.getClass();
        if (AbstractC5073.f14622) {
            return AbstractC2905.m6292(((C4938) interfaceC5087).f14294, ((C4938) interfaceC50872).f14294);
        }
        C4908 c4908 = C4908.f14232;
        C4912 c4912 = C4912.f14240;
        C4931 c4931 = C4931.f14281;
        C4872 c4872 = new C4872(false, false, false, c4931, c4908, c4912);
        AbstractC4926 abstractC4926 = (AbstractC4926) interfaceC5087;
        AbstractC4926 abstractC49262 = (AbstractC4926) interfaceC50872;
        if (abstractC4926 == abstractC49262) {
            return true;
        }
        return C4891.f14211.m9793(c4872, c4931, abstractC4926, abstractC49262);
    }
}
