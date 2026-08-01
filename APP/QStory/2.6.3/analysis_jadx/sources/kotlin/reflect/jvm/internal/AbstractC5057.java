package kotlin.reflect.jvm.internal;

import androidx.collection.C0276;
import androidx.compose.ui.semantics.C1945;
import com.bumptech.glide.AbstractC3056;
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
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.AbstractC5081;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.reflect.jvm.internal.types.C4929;
import kotlin.reflect.jvm.internal.types.C4937;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1945 f14598 = AbstractC3056.m6718(C5016.f14458, C5016.f14457);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m10003(Object obj) {
        obj.getClass();
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + obj + '\'').toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m10004(AbstractC5024 abstractC5024) {
        abstractC5024.getClass();
        return AbstractC5067.m10074(abstractC5024) == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5059 m10005(InterfaceC5093 interfaceC5093) {
        if (interfaceC5093 instanceof C5004) {
            C5074 c5074 = ((C5045) ((C5004) interfaceC5093).f14425.getValue()).f14543;
            InterfaceC5088 interfaceC5088 = C5045.f14536[18];
            Object objInvoke = c5074.invoke();
            objInvoke.getClass();
            return (C5059) objInvoke;
        }
        if (interfaceC5093 instanceof C4929) {
            return m10005(((C4929) interfaceC5093).f14279);
        }
        C0276.m845(AbstractC4396.f12975.mo8917(interfaceC5093.getClass()), "Unknown type ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Collection m10006(InterfaceC5093 interfaceC5093) {
        C5074 c5074 = ((C5045) ((C5004) interfaceC5093).f14425.getValue()).f14545;
        InterfaceC5088 interfaceC5088 = C5045.f14536[16];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9829(r0) == true) goto L18;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.InterfaceC5087 m10007(kotlin.reflect.InterfaceC5087 r7, java.lang.String r8) {
        /*
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.types.AbstractC4926
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰 r0 = (kotlin.reflect.jvm.internal.types.AbstractC4926) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            kotlin.reflect.飘花落叶言子楪世兰苏哲 r2 = r0.mo8899()
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.C5058
            if (r2 != 0) goto L29
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.types.C4938
            if (r2 == 0) goto L1b
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲世兰 r0 = (kotlin.reflect.jvm.internal.types.C4938) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L2a
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r0 = r0.f14294
            if (r0 == 0) goto L2a
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4893.m9829(r0)
            r2 = 1
            if (r0 != r2) goto L2a
        L29:
            return r7
        L2a:
            kotlin.reflect.飘花落叶言子楪世兰苏哲 r0 = r7.mo8899()
            if (r0 == 0) goto L6e
            java.util.List r2 = r7.mo8898()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.AbstractC4345.m8822(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r2.next()
            kotlin.reflect.飘花落叶言子世楪哲兰苏 r4 = (kotlin.reflect.C5085) r4
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r5 = r4.f14637
            if (r5 == 0) goto L58
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r5 = m10007(r5, r8)
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
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰 r7 = kotlin.reflect.full.AbstractC4406.m8931(r0, r3, r8, r7)
            return r7
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.Class r7 = r7.getClass()
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r2 = kotlin.jvm.internal.AbstractC4396.f12975
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r7 = r2.mo8917(r7)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5057.m10007(kotlin.reflect.飘花落叶言子世楪苏兰哲, java.lang.String):kotlin.reflect.飘花落叶言子世楪苏兰哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4937 m10008(List list, List list2) {
        if (list.size() != list2.size()) {
            return null;
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return C4937.f14289;
        }
        ArrayList<Pair> arrayListM8821 = AbstractC4344.m8821(list, list2);
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(arrayListM8821, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Pair pair : arrayListM8821) {
            AbstractC4394 abstractC4394 = (AbstractC4394) pair.component1();
            AbstractC4394 abstractC43942 = (AbstractC4394) pair.component2();
            C5085 c5085 = C5085.f14636;
            Pair pair2 = new Pair(abstractC4394, AbstractC5090.m10100(AbstractC4406.m8930(abstractC43942, null, 7)));
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        return new C4937(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5054 m10009(AbstractC5024 abstractC5024, AbstractC4922 abstractC4922) {
        SignatureKind signatureKind;
        Field fieldM10096;
        Class<?> declaringClass;
        List parameters = abstractC5024.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC5108) obj).getKind() != KParameter$Kind.INSTANCE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC5108) it.next()).getType());
        }
        boolean z = abstractC5024 instanceof InterfaceC5088;
        if (z && (fieldM10096 = AbstractC5081.m10096((InterfaceC5088) abstractC5024)) != null && (declaringClass = fieldM10096.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            signatureKind = SignatureKind.FIELD_IN_JAVA_CLASS;
        } else if (z) {
            signatureKind = SignatureKind.PROPERTY;
        } else {
            if (!(abstractC5024 instanceof InterfaceC5110)) {
                C0276.m845(AbstractC4396.f12975.mo8917(abstractC5024.getClass()), "Unknown kind for ");
                return null;
            }
            signatureKind = SignatureKind.FUNCTION;
        }
        SignatureKind signatureKind2 = signatureKind;
        InterfaceC5110 interfaceC5110 = abstractC5024 instanceof InterfaceC5110 ? (InterfaceC5110) abstractC5024 : null;
        Method methodM10095 = interfaceC5110 != null ? AbstractC5081.m10095(interfaceC5110) : null;
        Type[] genericParameterTypes = methodM10095 != null ? methodM10095.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listM8846 = AbstractC4347.m8846(genericParameterTypes);
        Class<?>[] parameterTypes = methodM10095 != null ? methodM10095.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new C5054(signatureKind2, abstractC5024.getName(), methodM10095 != null ? methodM10095.getName() : null, abstractC5024.getTypeParameters(), arrayList2, AbstractC4347.m8846(parameterTypes), listM8846, m10004(abstractC5024), abstractC4922);
    }
}
