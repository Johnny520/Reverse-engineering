package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4210;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.internal.types.C4936;
import p175.AbstractC7738;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f14585;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f14586;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f14587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f14589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SignatureKind f14590;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14591;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f14592;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC7738 f14593;

    public C5053(SignatureKind signatureKind, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, AbstractC7738 abstractC7738) {
        signatureKind.getClass();
        str.getClass();
        list2.getClass();
        list3.getClass();
        this.f14590 = signatureKind;
        this.f14589 = str;
        this.f14588 = str2;
        this.f14587 = list;
        this.f14586 = arrayList;
        this.f14585 = list2;
        this.f14592 = list3;
        this.f14591 = z;
        this.f14593 = abstractC7738;
        if (signatureKind != SignatureKind.FIELD_IN_JAVA_CLASS || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            C5919.m11251(AbstractC0053.m155(sb, str, '\''));
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
        sb2.append(signatureKind);
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list2.isEmpty();
        sb2.append(", kotlinParameterTypes.isEmpty(): ");
        sb2.append(zIsEmpty);
        sb2.append(",typeParameters.isEmpty(): ");
        sb2.append(zIsEmpty2);
        sb2.append(", javaParameterTypesIfFunction.isEmpty(): ");
        sb2.append(zIsEmpty3);
        sb2.append(".For member: '");
        sb2.append(str);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final boolean equals(Object obj) {
        List list;
        C4936 c4936M10011;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5053) {
            C5053 c5053 = (C5053) obj;
            List list2 = c5053.f14587;
            List list3 = c5053.f14585;
            String str = c5053.f14589;
            ArrayList arrayList = c5053.f14586;
            AbstractC7738 abstractC7738 = c5053.f14593;
            AbstractC7738 abstractC77382 = this.f14593;
            boolean zEquals = abstractC77382.equals(abstractC7738);
            String str2 = this.f14589;
            if (!zEquals) {
                C5919.m11251(AbstractC0053.m156("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                return false;
            }
            SignatureKind signatureKind = c5053.f14590;
            SignatureKind signatureKind2 = this.f14590;
            if (signatureKind2 == signatureKind && this.f14591 == c5053.f14591) {
                ArrayList arrayList2 = this.f14586;
                if (arrayList2.size() == arrayList.size()) {
                    if (!abstractC77382.equals(C4940.f14298) || signatureKind2 != SignatureKind.FUNCTION) {
                        if (!AbstractC4394.m8917(str2, str) || (c4936M10011 = AbstractC5056.m10011((list = this.f14587), list2)) == null) {
                            return false;
                        }
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            AbstractC4393 abstractC4393 = (AbstractC4393) list.get(i);
                            AbstractC4393 abstractC43932 = (AbstractC4393) list2.get(i);
                            if (abstractC4393.getUpperBounds().size() != abstractC43932.getUpperBounds().size()) {
                                return false;
                            }
                            List<InterfaceC5086> upperBounds = abstractC4393.getUpperBounds();
                            ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(upperBounds, 10));
                            for (InterfaceC5086 interfaceC5086 : upperBounds) {
                                C4936 c4936 = C4936.f14287;
                                InterfaceC5086 interfaceC50862 = c4936M10011.m9931(interfaceC5086, KVariance.INVARIANT).f14637;
                                if (interfaceC50862 == null) {
                                    AbstractC5056.m10006(str2);
                                    throw null;
                                }
                                arrayList3.add(interfaceC50862);
                            }
                            ArrayList<Pair> arrayListM8797 = AbstractC4343.m8797(AbstractC4343.m8817(arrayList3, new C5055(str2)), AbstractC4343.m8817(abstractC43932.getUpperBounds(), new C5055(str)));
                            if (!arrayListM8797.isEmpty()) {
                                for (Pair pair : arrayListM8797) {
                                    InterfaceC5086 interfaceC50863 = (InterfaceC5086) pair.getFirst();
                                    InterfaceC5086 interfaceC50864 = (InterfaceC5086) pair.getSecond();
                                    if (!AbstractC4405.m8947(interfaceC50863, interfaceC50864) || !AbstractC4405.m8947(interfaceC50864, interfaceC50863)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            InterfaceC5086 interfaceC50865 = (InterfaceC5086) arrayList2.get(i2);
                            C4936 c49362 = C4936.f14287;
                            InterfaceC5086 interfaceC50866 = c4936M10011.m9931(interfaceC50865, KVariance.INVARIANT).f14637;
                            if (interfaceC50866 == null) {
                                AbstractC5056.m10006(str2);
                                throw null;
                            }
                            InterfaceC5086 interfaceC50867 = (InterfaceC5086) arrayList.get(i2);
                            if (!AbstractC4405.m8947(interfaceC50866, interfaceC50867) || !AbstractC4405.m8947(interfaceC50867, interfaceC50866)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    if (AbstractC4394.m8917(this.f14588, c5053.f14588)) {
                        List list4 = this.f14585;
                        if (list4.size() == list3.size()) {
                            if (list4.size() != arrayList2.size()) {
                                StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                sb.append(list4.size());
                                sb.append(") and kotlinParameterTypes.size (");
                                sb.append(arrayList2.size());
                                sb.append(") must be equal for member '");
                                C5919.m11251(AbstractC0053.m155(sb, str2, '\''));
                                return false;
                            }
                            int size3 = list4.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Type type = (Type) this.f14592.get(i3);
                                Class cls = (Class) list4.get(i3);
                                Type type2 = (Type) c5053.f14592.get(i3);
                                Class cls2 = (Class) list3.get(i3);
                                TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                if (z || z2) {
                                    if (cls.isPrimitive() != cls2.isPrimitive()) {
                                        return false;
                                    }
                                    InterfaceC5086 interfaceC5086M10010 = AbstractC5056.m10010((InterfaceC5086) arrayList2.get(i3), str2);
                                    InterfaceC5086 interfaceC5086M100102 = AbstractC5056.m10010((InterfaceC5086) arrayList.get(i3), str);
                                    if (!AbstractC4405.m8947(interfaceC5086M10010, interfaceC5086M100102) || !AbstractC4405.m8947(interfaceC5086M100102, interfaceC5086M10010)) {
                                        return false;
                                    }
                                } else if (!AbstractC4394.m8917(cls, cls2)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean zEquals = this.f14593.equals(C4940.f14298);
        SignatureKind signatureKind = this.f14590;
        boolean z = zEquals && signatureKind == SignatureKind.FUNCTION;
        boolean z2 = this.f14591;
        ArrayList arrayList = this.f14586;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{signatureKind, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.f14589});
            }
            C4210.m8621();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.f14588;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{signatureKind, numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.f14590 + ", name=" + this.f14589 + ", jvmNameIfFunction=" + this.f14588 + ", typeParameters=" + this.f14587 + ", kotlinParameterTypes=" + this.f14586 + ", javaParameterTypesIfFunction=" + this.f14585 + ", javaGenericParameterTypesIfFunction=" + this.f14592 + ", isStatic=" + this.f14591 + ", equalityMode=" + this.f14593 + ')';
    }
}
