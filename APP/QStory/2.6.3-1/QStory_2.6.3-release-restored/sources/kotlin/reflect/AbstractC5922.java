package kotlin.reflect;

import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.InterfaceC5959;
import kotlin.text.AbstractC5971;
import p050.AbstractC7176;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5922 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5917 m10659(InterfaceC5919 interfaceC5919) {
        interfaceC5919.getClass();
        return new C5917(interfaceC5919, KVariance.INVARIANT);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Type m10660(C5917 c5917) {
        KVariance kVariance = c5917.f14983;
        if (kVariance == null) {
            return C5921.f14985;
        }
        InterfaceC5919 interfaceC5919 = c5917.f14982;
        interfaceC5919.getClass();
        int i = AbstractC5915.f14977[kVariance.ordinal()];
        if (i == 1) {
            return new C5921(null, m10662(interfaceC5919, true));
        }
        if (i == 2) {
            return m10662(interfaceC5919, true);
        }
        if (i == 3) {
            return new C5921(m10662(interfaceC5919, true), null);
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5916 m10661(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m10660((C5917) it.next()));
            }
            return new C5916(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m10660((C5917) it2.next()));
            }
            return new C5916(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C5916 c5916M10661 = m10661(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m10660((C5917) it3.next()));
        }
        return new C5916(cls, c5916M10661, arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Type m10662(InterfaceC5919 interfaceC5919, boolean z) {
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        if (interfaceC5924Mo9458 instanceof AbstractC5226) {
            AbstractC5226 abstractC5226 = (AbstractC5226) interfaceC5924Mo9458;
            GenericDeclaration genericDeclaration = (GenericDeclaration) abstractC5226.f13318.getValue();
            if (genericDeclaration == null) {
                C5043.m9155(interfaceC5919, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (AbstractC5227.m9466(typeVariable2.getName(), abstractC5226.mo9460())) {
                    if (z2) {
                        C6755.m11869("Array contains more than one matching element.");
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
            C5043.m9176("Array contains no element matching the predicate.");
            return null;
        }
        if (!(interfaceC5924Mo9458 instanceof InterfaceC5925)) {
            C5043.m9155(interfaceC5919, "Unsupported type classifier: ");
            return null;
        }
        InterfaceC5925 interfaceC5925 = (InterfaceC5925) interfaceC5924Mo9458;
        Class clsM7317 = z ? AbstractC3889.m7317(interfaceC5925) : AbstractC3889.m7316(interfaceC5925);
        List listMo9457 = interfaceC5919.mo9457();
        if (listMo9457.isEmpty()) {
            return clsM7317;
        }
        if (!clsM7317.isArray()) {
            return m10661(clsM7317, listMo9457);
        }
        if (clsM7317.getComponentType().isPrimitive()) {
            return clsM7317;
        }
        C5917 c5917 = (C5917) AbstractC5176.m9340(listMo9457);
        if (c5917 == null) {
            C5043.m9163(interfaceC5919, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        KVariance kVariance = c5917.f14983;
        InterfaceC5919 interfaceC59192 = c5917.f14982;
        int i = kVariance == null ? -1 : AbstractC5915.f14977[kVariance.ordinal()];
        if (i == -1 || i == 1) {
            return clsM7317;
        }
        if (i != 2 && i != 3) {
            C5043.m9170();
            return null;
        }
        interfaceC59192.getClass();
        Type typeM10662 = m10662(interfaceC59192, false);
        return typeM10662 instanceof Class ? clsM7317 : new C5928(typeM10662);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m10663(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC5959 interfaceC5959M10674 = AbstractC5954.m10674(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) AbstractC5954.m10667(interfaceC5959M10674)).getName());
        Iterator it = interfaceC5959M10674.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC7176.m12480();
                throw null;
            }
        }
        sb.append(AbstractC5971.m10687(i, "[]"));
        return sb.toString();
    }
}
