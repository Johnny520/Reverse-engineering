package kotlin.reflect.jvm.internal;

import androidx.collection.C1123;
import androidx.compose.p001ui.semantics.C2780;
import com.bumptech.glide.AbstractC3888;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5761;
import kotlin.reflect.jvm.internal.types.C5769;
import kotlin.reflect.jvm.internal.types.C5770;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2780 f14943 = AbstractC3888.m7278(C5848.f14803, C5848.f14802);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m10562(Object obj) {
        obj.getClass();
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + obj + '\'').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m10563(AbstractC5856 abstractC5856) {
        abstractC5856.getClass();
        return AbstractC5899.m10633(abstractC5856) == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5891 m10564(InterfaceC5925 interfaceC5925) {
        if (interfaceC5925 instanceof C5836) {
            C5906 c5906 = ((C5877) ((C5836) interfaceC5925).f14770.getValue()).f14888;
            InterfaceC5920 interfaceC5920 = C5877.f14881[18];
            Object objInvoke = c5906.invoke();
            objInvoke.getClass();
            return (C5891) objInvoke;
        }
        if (interfaceC5925 instanceof C5761) {
            return m10564(((C5761) interfaceC5925).f14624);
        }
        C1123.m1405(AbstractC5228.f13320.mo9476(interfaceC5925.getClass()), "Unknown type ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Collection m10565(InterfaceC5925 interfaceC5925) {
        C5906 c5906 = ((C5877) ((C5836) interfaceC5925).f14770.getValue()).f14890;
        InterfaceC5920 interfaceC5920 = C5877.f14881[16];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.AbstractC5725.m10388(r0) == true) goto L18;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC5919 m10566(InterfaceC5919 interfaceC5919, String str) {
        AbstractC5758 abstractC5758 = interfaceC5919 instanceof AbstractC5758 ? (AbstractC5758) interfaceC5919 : null;
        if (abstractC5758 != null) {
            if (!(abstractC5758.mo9458() instanceof C5890)) {
                C5770 c5770 = abstractC5758 instanceof C5770 ? (C5770) abstractC5758 : null;
                if (c5770 != null) {
                    AbstractC5714 abstractC5714 = c5770.f14639;
                    if (abstractC5714 != null) {
                    }
                }
            }
            return interfaceC5919;
        }
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        if (interfaceC5924Mo9458 != null) {
            List<C5917> listMo9457 = interfaceC5919.mo9457();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo9457, 10));
            for (C5917 c5917 : listMo9457) {
                InterfaceC5919 interfaceC59192 = c5917.f14982;
                arrayList.add(new C5917(interfaceC59192 != null ? m10566(interfaceC59192, str) : null, c5917.f14983));
            }
            return AbstractC5238.m9490(interfaceC5924Mo9458, arrayList, false, interfaceC5919.getAnnotations());
        }
        StringBuilder sb = new StringBuilder("Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '");
        sb.append(interfaceC5919);
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(interfaceC5919.getClass());
        sb.append("' (");
        sb.append(interfaceC5925Mo9476);
        sb.append(") which belongs to member '");
        sb.append(str);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5769 m10567(List list, List list2) {
        if (list.size() != list2.size()) {
            return null;
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return C5769.f14634;
        }
        ArrayList<Pair> arrayListM9380 = AbstractC5176.m9380(list, list2);
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(arrayListM9380, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Pair pair : arrayListM9380) {
            AbstractC5226 abstractC5226 = (AbstractC5226) pair.component1();
            AbstractC5226 abstractC52262 = (AbstractC5226) pair.component2();
            C5917 c5917 = C5917.f14981;
            Pair pair2 = new Pair(abstractC5226, AbstractC5922.m10659(AbstractC5238.m9489(abstractC52262, null, 7)));
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        return new C5769(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5886 m10568(AbstractC5856 abstractC5856, AbstractC5754 abstractC5754) {
        SignatureKind signatureKind;
        Field fieldM10655;
        Class<?> declaringClass;
        List parameters = abstractC5856.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5940) obj).getKind() != KParameter$Kind.INSTANCE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC5940) it.next()).getType());
        }
        boolean z = abstractC5856 instanceof InterfaceC5920;
        if (z && (fieldM10655 = AbstractC5913.m10655((InterfaceC5920) abstractC5856)) != null && (declaringClass = fieldM10655.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            signatureKind = SignatureKind.FIELD_IN_JAVA_CLASS;
        } else if (z) {
            signatureKind = SignatureKind.PROPERTY;
        } else {
            if (!(abstractC5856 instanceof InterfaceC5942)) {
                C1123.m1405(AbstractC5228.f13320.mo9476(abstractC5856.getClass()), "Unknown kind for ");
                return null;
            }
            signatureKind = SignatureKind.FUNCTION;
        }
        SignatureKind signatureKind2 = signatureKind;
        InterfaceC5942 interfaceC5942 = abstractC5856 instanceof InterfaceC5942 ? (InterfaceC5942) abstractC5856 : null;
        Method methodM10654 = interfaceC5942 != null ? AbstractC5913.m10654(interfaceC5942) : null;
        Type[] genericParameterTypes = methodM10654 != null ? methodM10654.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listM9405 = AbstractC5179.m9405(genericParameterTypes);
        Class<?>[] parameterTypes = methodM10654 != null ? methodM10654.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new C5886(signatureKind2, abstractC5856.getName(), methodM10654 != null ? methodM10654.getName() : null, abstractC5856.getTypeParameters(), arrayList2, AbstractC5179.m9405(parameterTypes), listM9405, m10563(abstractC5856), abstractC5754);
    }
}
