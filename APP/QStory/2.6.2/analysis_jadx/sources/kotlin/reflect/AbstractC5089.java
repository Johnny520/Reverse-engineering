package kotlin.reflect;

import io.ktor.util.C4210;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.InterfaceC5126;
import kotlin.text.AbstractC5138;
import p053.AbstractC6560;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5089 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5084 m10096(InterfaceC5086 interfaceC5086) {
        interfaceC5086.getClass();
        return new C5084(interfaceC5086, KVariance.INVARIANT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Type m10097(C5084 c5084) {
        KVariance kVariance = c5084.f14638;
        if (kVariance == null) {
            return C5088.f14640;
        }
        InterfaceC5086 interfaceC5086 = c5084.f14637;
        interfaceC5086.getClass();
        int i = AbstractC5082.f14632[kVariance.ordinal()];
        if (i == 1) {
            return new C5088(null, m10099(interfaceC5086, true));
        }
        if (i == 2) {
            return m10099(interfaceC5086, true);
        }
        if (i == 3) {
            return new C5088(m10099(interfaceC5086, true), null);
        }
        C4210.m8621();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5083 m10098(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m10097((C5084) it.next()));
            }
            return new C5083(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m10097((C5084) it2.next()));
            }
            return new C5083(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C5083 c5083M10098 = m10098(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m10097((C5084) it3.next()));
        }
        return new C5083(cls, c5083M10098, arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Type m10099(InterfaceC5086 interfaceC5086, boolean z) {
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        if (interfaceC5091Mo8909 instanceof AbstractC4393) {
            AbstractC4393 abstractC4393 = (AbstractC4393) interfaceC5091Mo8909;
            GenericDeclaration genericDeclaration = (GenericDeclaration) abstractC4393.f12969.getValue();
            if (genericDeclaration == null) {
                C4210.m8606(interfaceC5086, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (AbstractC4394.m8917(typeVariable2.getName(), abstractC4393.mo8911())) {
                    if (z2) {
                        C5919.m11249("Array contains more than one matching element.");
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
            C4210.m8627("Array contains no element matching the predicate.");
            return null;
        }
        if (!(interfaceC5091Mo8909 instanceof InterfaceC5092)) {
            C4210.m8606(interfaceC5086, "Unsupported type classifier: ");
            return null;
        }
        InterfaceC5092 interfaceC5092 = (InterfaceC5092) interfaceC5091Mo8909;
        Class clsM12026 = z ? AbstractC6560.m12026(interfaceC5092) : AbstractC6560.m12029(interfaceC5092);
        List listMo8908 = interfaceC5086.mo8908();
        if (listMo8908.isEmpty()) {
            return clsM12026;
        }
        if (!clsM12026.isArray()) {
            return m10098(clsM12026, listMo8908);
        }
        if (clsM12026.getComponentType().isPrimitive()) {
            return clsM12026;
        }
        C5084 c5084 = (C5084) AbstractC4343.m8815(listMo8908);
        if (c5084 == null) {
            C4210.m8614(interfaceC5086, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        KVariance kVariance = c5084.f14638;
        InterfaceC5086 interfaceC50862 = c5084.f14637;
        int i = kVariance == null ? -1 : AbstractC5082.f14632[kVariance.ordinal()];
        if (i == -1 || i == 1) {
            return clsM12026;
        }
        if (i != 2 && i != 3) {
            C4210.m8621();
            return null;
        }
        interfaceC50862.getClass();
        Type typeM10099 = m10099(interfaceC50862, false);
        return typeM10099 instanceof Class ? clsM12026 : new C5095(typeM10099);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m10100(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC5126 interfaceC5126M10112 = AbstractC5121.m10112(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) AbstractC5121.m10110(interfaceC5126M10112)).getName());
        Iterator it = interfaceC5126M10112.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC8189.m13663();
                throw null;
            }
        }
        sb.append(AbstractC5138.m10126(i, "[]"));
        return sb.toString();
    }
}
