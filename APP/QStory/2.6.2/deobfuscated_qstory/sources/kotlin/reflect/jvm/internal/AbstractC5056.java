package kotlin.reflect.jvm.internal;

import androidx.collection.C0276;
import androidx.compose.ui.semantics.C1945;
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
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.AbstractC5080;
import kotlin.reflect.jvm.internal.types.C4928;
import kotlin.reflect.jvm.internal.types.C4936;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1945 f14596 = AbstractC7738.m13041(C5015.f14456, C5015.f14455);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m10006(Object obj) {
        obj.getClass();
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + obj + '\'').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m10007(AbstractC5023 abstractC5023) {
        abstractC5023.getClass();
        return AbstractC5066.m10070(abstractC5023) == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5058 m10008(InterfaceC5092 interfaceC5092) {
        if (interfaceC5092 instanceof C5003) {
            C5073 c5073 = ((C5044) ((C5003) interfaceC5092).f14423.getValue()).f14541;
            InterfaceC5087 interfaceC5087 = C5044.f14534[18];
            Object objInvoke = c5073.invoke();
            objInvoke.getClass();
            return (C5058) objInvoke;
        }
        if (interfaceC5092 instanceof C4928) {
            return m10008(((C4928) interfaceC5092).f14277);
        }
        C0276.m844(AbstractC4395.f12971.mo8927(interfaceC5092.getClass()), "Unknown type ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Collection m10009(InterfaceC5092 interfaceC5092) {
        C5073 c5073 = ((C5044) ((C5003) interfaceC5092).f14423.getValue()).f14543;
        InterfaceC5087 interfaceC5087 = C5044.f14534[16];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.AbstractC4892.m9835(r0) == true) goto L18;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.InterfaceC5086 m10010(kotlin.reflect.InterfaceC5086 r7, java.lang.String r8) {
        /*
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.types.AbstractC4925
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰 r0 = (kotlin.reflect.jvm.internal.types.AbstractC4925) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            kotlin.reflect.飘花落叶言子楪世兰苏哲 r2 = r0.mo8909()
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.C5057
            if (r2 != 0) goto L29
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.types.C4937
            if (r2 == 0) goto L1b
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲世兰 r0 = (kotlin.reflect.jvm.internal.types.C4937) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L2a
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r0 = r0.f14292
            if (r0 == 0) goto L2a
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4892.m9835(r0)
            r2 = 1
            if (r0 != r2) goto L2a
        L29:
            return r7
        L2a:
            kotlin.reflect.飘花落叶言子楪世兰苏哲 r0 = r7.mo8909()
            if (r0 == 0) goto L6e
            java.util.List r2 = r7.mo8908()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.AbstractC4344.m8832(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r2.next()
            kotlin.reflect.飘花落叶言子世楪哲兰苏 r4 = (kotlin.reflect.C5084) r4
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r5 = r4.f14637
            if (r5 == 0) goto L58
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r5 = m10010(r5, r8)
            goto L59
        L58:
            r5 = r1
        L59:
            kotlin.reflect.KVariance r4 = r4.f14638
            kotlin.reflect.飘花落叶言子世楪哲兰苏 r6 = new kotlin.reflect.飘花落叶言子世楪哲兰苏
            r6.<init>(r5, r4)
            r3.add(r6)
            goto L43
        L64:
            java.util.List r7 = r7.getAnnotations()
            r8 = 0
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰 r7 = kotlin.reflect.full.AbstractC4405.m8941(r0, r3, r8, r7)
            return r7
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.Class r7 = r7.getClass()
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r2 = kotlin.jvm.internal.AbstractC4395.f12971
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r7 = r2.mo8927(r7)
            java.lang.String r2 = "' ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") which belongs to member '"
            r1.append(r7)
            r1.append(r8)
            r7 = 39
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5056.m10010(kotlin.reflect.飘花落叶言子世楪苏兰哲, java.lang.String):kotlin.reflect.飘花落叶言子世楪苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4936 m10011(List list, List list2) {
        if (list.size() != list2.size()) {
            return null;
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return C4936.f14287;
        }
        ArrayList<Pair> arrayListM8797 = AbstractC4343.m8797(list, list2);
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(arrayListM8797, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (Pair pair : arrayListM8797) {
            AbstractC4393 abstractC4393 = (AbstractC4393) pair.component1();
            AbstractC4393 abstractC43932 = (AbstractC4393) pair.component2();
            C5084 c5084 = C5084.f14636;
            Pair pair2 = new Pair(abstractC4393, AbstractC5089.m10096(AbstractC4405.m8940(abstractC43932, null, 7)));
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        return new C4936(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5053 m10012(AbstractC5023 abstractC5023, AbstractC7738 abstractC7738) {
        SignatureKind signatureKind;
        Field fieldM10092;
        Class<?> declaringClass;
        List parameters = abstractC5023.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5107) obj).getKind() != KParameter$Kind.INSTANCE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC5107) it.next()).getType());
        }
        boolean z = abstractC5023 instanceof InterfaceC5087;
        if (z && (fieldM10092 = AbstractC5080.m10092((InterfaceC5087) abstractC5023)) != null && (declaringClass = fieldM10092.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            signatureKind = SignatureKind.FIELD_IN_JAVA_CLASS;
        } else if (z) {
            signatureKind = SignatureKind.PROPERTY;
        } else {
            if (!(abstractC5023 instanceof InterfaceC5109)) {
                C0276.m844(AbstractC4395.f12971.mo8927(abstractC5023.getClass()), "Unknown kind for ");
                return null;
            }
            signatureKind = SignatureKind.FUNCTION;
        }
        SignatureKind signatureKind2 = signatureKind;
        InterfaceC5109 interfaceC5109 = abstractC5023 instanceof InterfaceC5109 ? (InterfaceC5109) abstractC5023 : null;
        Method methodM10091 = interfaceC5109 != null ? AbstractC5080.m10091(interfaceC5109) : null;
        Type[] genericParameterTypes = methodM10091 != null ? methodM10091.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listM8850 = AbstractC4346.m8850(genericParameterTypes);
        Class<?>[] parameterTypes = methodM10091 != null ? methodM10091.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new C5053(signatureKind2, abstractC5023.getName(), methodM10091 != null ? methodM10091.getName() : null, abstractC5023.getTypeParameters(), arrayList2, AbstractC4346.m8850(parameterTypes), listM8850, m10007(abstractC5023), abstractC7738);
    }
}
