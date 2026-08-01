package kotlin.reflect;

import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.InterfaceC5127;
import kotlin.text.AbstractC5139;
import p034.AbstractC6347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5090 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5085 m10100(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        return new C5085(interfaceC5087, KVariance.INVARIANT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Type m10101(C5085 c5085) {
        KVariance kVariance = c5085.f14638;
        if (kVariance == null) {
            return C5089.f14640;
        }
        InterfaceC5087 interfaceC5087 = c5085.f14637;
        interfaceC5087.getClass();
        int i = AbstractC5083.f14632[kVariance.ordinal()];
        if (i == 1) {
            return new C5089(null, m10103(interfaceC5087, true));
        }
        if (i == 2) {
            return m10103(interfaceC5087, true);
        }
        if (i == 3) {
            return new C5089(m10103(interfaceC5087, true), null);
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5084 m10102(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m10101((C5085) it.next()));
            }
            return new C5084(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m10101((C5085) it2.next()));
            }
            return new C5084(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C5084 c5084M10102 = m10102(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m10101((C5085) it3.next()));
        }
        return new C5084(cls, c5084M10102, arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Type m10103(InterfaceC5087 interfaceC5087, boolean z) {
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        if (interfaceC5092Mo8899 instanceof AbstractC4394) {
            AbstractC4394 abstractC4394 = (AbstractC4394) interfaceC5092Mo8899;
            GenericDeclaration genericDeclaration = (GenericDeclaration) abstractC4394.f12973.getValue();
            if (genericDeclaration == null) {
                C4211.m8596(interfaceC5087, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (AbstractC4395.m8907(typeVariable2.getName(), abstractC4394.mo8901())) {
                    if (z2) {
                        C5925.m11310("Array contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                typeVariable.getClass();
                return typeVariable;
            }
            C4211.m8617("Array contains no element matching the predicate.");
            return null;
        }
        if (!(interfaceC5092Mo8899 instanceof InterfaceC5093)) {
            C4211.m8596(interfaceC5087, "Unsupported type classifier: ");
            return null;
        }
        InterfaceC5093 interfaceC5093 = (InterfaceC5093) interfaceC5092Mo8899;
        Class clsM6757 = z ? AbstractC3057.m6757(interfaceC5093) : AbstractC3057.m6756(interfaceC5093);
        List listMo8898 = interfaceC5087.mo8898();
        if (listMo8898.isEmpty()) {
            return clsM6757;
        }
        if (!clsM6757.isArray()) {
            return m10102(clsM6757, listMo8898);
        }
        if (clsM6757.getComponentType().isPrimitive()) {
            return clsM6757;
        }
        C5085 c5085 = (C5085) AbstractC4344.m8781(listMo8898);
        if (c5085 == null) {
            C4211.m8604(interfaceC5087, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        KVariance kVariance = c5085.f14638;
        InterfaceC5087 interfaceC50872 = c5085.f14637;
        int i = kVariance == null ? -1 : AbstractC5083.f14632[kVariance.ordinal()];
        if (i == -1 || i == 1) {
            return clsM6757;
        }
        if (i != 2 && i != 3) {
            C4211.m8611();
            return null;
        }
        interfaceC50872.getClass();
        Type typeM10103 = m10103(interfaceC50872, false);
        return typeM10103 instanceof Class ? clsM6757 : new C5096(typeM10103);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m10104(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC5127 interfaceC5127M10115 = AbstractC5122.m10115(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) AbstractC5122.m10108(interfaceC5127M10115)).getName());
        Iterator it = interfaceC5127M10115.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC6347.m11921();
                throw null;
            }
        }
        sb.append(AbstractC5139.m10128(i, "[]"));
        return sb.toString();
    }
}
