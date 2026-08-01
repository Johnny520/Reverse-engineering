package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4211;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.reflect.jvm.internal.types.C4937;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5054 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f14587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f14588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f14589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14590;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f14591;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SignatureKind f14592;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14593;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f14594;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC4922 f14595;

    public C5054(SignatureKind signatureKind, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, AbstractC4922 abstractC4922) {
        signatureKind.getClass();
        str.getClass();
        list2.getClass();
        list3.getClass();
        this.f14592 = signatureKind;
        this.f14591 = str;
        this.f14590 = str2;
        this.f14589 = list;
        this.f14588 = arrayList;
        this.f14587 = list2;
        this.f14594 = list3;
        this.f14593 = z;
        this.f14595 = abstractC4922;
        if (signatureKind != SignatureKind.FIELD_IN_JAVA_CLASS || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            C5925.m11312(AbstractC0053.m148(sb, str, '\''));
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
        C4937 c4937M10008;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5054) {
            C5054 c5054 = (C5054) obj;
            List list2 = c5054.f14589;
            List list3 = c5054.f14587;
            String str = c5054.f14591;
            ArrayList arrayList = c5054.f14588;
            AbstractC4922 abstractC4922 = c5054.f14595;
            AbstractC4922 abstractC49222 = this.f14595;
            boolean zEquals = abstractC49222.equals(abstractC4922);
            String str2 = this.f14591;
            if (!zEquals) {
                C5925.m11312(AbstractC0053.m158("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                return false;
            }
            SignatureKind signatureKind = c5054.f14592;
            SignatureKind signatureKind2 = this.f14592;
            if (signatureKind2 == signatureKind && this.f14593 == c5054.f14593) {
                ArrayList arrayList2 = this.f14588;
                if (arrayList2.size() == arrayList.size()) {
                    if (!abstractC49222.equals(C4941.f14300) || signatureKind2 != SignatureKind.FUNCTION) {
                        if (!AbstractC4395.m8907(str2, str) || (c4937M10008 = AbstractC5057.m10008((list = this.f14589), list2)) == null) {
                            return false;
                        }
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            AbstractC4394 abstractC4394 = (AbstractC4394) list.get(i);
                            AbstractC4394 abstractC43942 = (AbstractC4394) list2.get(i);
                            if (abstractC4394.getUpperBounds().size() != abstractC43942.getUpperBounds().size()) {
                                return false;
                            }
                            List<InterfaceC5087> upperBounds = abstractC4394.getUpperBounds();
                            ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(upperBounds, 10));
                            for (InterfaceC5087 interfaceC5087 : upperBounds) {
                                C4937 c4937 = C4937.f14289;
                                InterfaceC5087 interfaceC50872 = c4937M10008.m9928(interfaceC5087, KVariance.INVARIANT).f14637;
                                if (interfaceC50872 == null) {
                                    AbstractC5057.m10003(str2);
                                    throw null;
                                }
                                arrayList3.add(interfaceC50872);
                            }
                            ArrayList<Pair> arrayListM8821 = AbstractC4344.m8821(AbstractC4344.m8778(arrayList3, new C5056(str2)), AbstractC4344.m8778(abstractC43942.getUpperBounds(), new C5056(str)));
                            if (!arrayListM8821.isEmpty()) {
                                for (Pair pair : arrayListM8821) {
                                    InterfaceC5087 interfaceC50873 = (InterfaceC5087) pair.getFirst();
                                    InterfaceC5087 interfaceC50874 = (InterfaceC5087) pair.getSecond();
                                    if (!AbstractC4406.m8937(interfaceC50873, interfaceC50874) || !AbstractC4406.m8937(interfaceC50874, interfaceC50873)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            InterfaceC5087 interfaceC50875 = (InterfaceC5087) arrayList2.get(i2);
                            C4937 c49372 = C4937.f14289;
                            InterfaceC5087 interfaceC50876 = c4937M10008.m9928(interfaceC50875, KVariance.INVARIANT).f14637;
                            if (interfaceC50876 == null) {
                                AbstractC5057.m10003(str2);
                                throw null;
                            }
                            InterfaceC5087 interfaceC50877 = (InterfaceC5087) arrayList.get(i2);
                            if (!AbstractC4406.m8937(interfaceC50876, interfaceC50877) || !AbstractC4406.m8937(interfaceC50877, interfaceC50876)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    if (AbstractC4395.m8907(this.f14590, c5054.f14590)) {
                        List list4 = this.f14587;
                        if (list4.size() == list3.size()) {
                            if (list4.size() != arrayList2.size()) {
                                StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                sb.append(list4.size());
                                sb.append(") and kotlinParameterTypes.size (");
                                sb.append(arrayList2.size());
                                sb.append(") must be equal for member '");
                                C5925.m11312(AbstractC0053.m148(sb, str2, '\''));
                                return false;
                            }
                            int size3 = list4.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Type type = (Type) this.f14594.get(i3);
                                Class cls = (Class) list4.get(i3);
                                Type type2 = (Type) c5054.f14594.get(i3);
                                Class cls2 = (Class) list3.get(i3);
                                TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                if (z || z2) {
                                    if (cls.isPrimitive() != cls2.isPrimitive()) {
                                        return false;
                                    }
                                    InterfaceC5087 interfaceC5087M10007 = AbstractC5057.m10007((InterfaceC5087) arrayList2.get(i3), str2);
                                    InterfaceC5087 interfaceC5087M100072 = AbstractC5057.m10007((InterfaceC5087) arrayList.get(i3), str);
                                    if (!AbstractC4406.m8937(interfaceC5087M10007, interfaceC5087M100072) || !AbstractC4406.m8937(interfaceC5087M100072, interfaceC5087M10007)) {
                                        return false;
                                    }
                                } else if (!AbstractC4395.m8907(cls, cls2)) {
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
        boolean zEquals = this.f14595.equals(C4941.f14300);
        SignatureKind signatureKind = this.f14592;
        boolean z = zEquals && signatureKind == SignatureKind.FUNCTION;
        boolean z2 = this.f14593;
        ArrayList arrayList = this.f14588;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{signatureKind, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.f14591});
            }
            C4211.m8611();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.f14590;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{signatureKind, numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.f14592 + ", name=" + this.f14591 + ", jvmNameIfFunction=" + this.f14590 + ", typeParameters=" + this.f14589 + ", kotlinParameterTypes=" + this.f14588 + ", javaParameterTypesIfFunction=" + this.f14587 + ", javaGenericParameterTypesIfFunction=" + this.f14594 + ", isStatic=" + this.f14593 + ", equalityMode=" + this.f14595 + ')';
    }
}
