package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.reflect.jvm.internal.types.C5769;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5886 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f14932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f14933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f14934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f14936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SignatureKind f14937;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14938;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final List f14939;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC5754 f14940;

    public C5886(SignatureKind signatureKind, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, AbstractC5754 abstractC5754) {
        signatureKind.getClass();
        str.getClass();
        list2.getClass();
        list3.getClass();
        this.f14937 = signatureKind;
        this.f14936 = str;
        this.f14935 = str2;
        this.f14934 = list;
        this.f14933 = arrayList;
        this.f14932 = list2;
        this.f14939 = list3;
        this.f14938 = z;
        this.f14940 = abstractC5754;
        if (signatureKind != SignatureKind.FIELD_IN_JAVA_CLASS || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            C6755.m11871(AbstractC0900.m708(sb, str, '\''));
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
        C5769 c5769M10567;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5886) {
            C5886 c5886 = (C5886) obj;
            List list2 = c5886.f14934;
            List list3 = c5886.f14932;
            String str = c5886.f14936;
            ArrayList arrayList = c5886.f14933;
            AbstractC5754 abstractC5754 = c5886.f14940;
            AbstractC5754 abstractC57542 = this.f14940;
            boolean zEquals = abstractC57542.equals(abstractC5754);
            String str2 = this.f14936;
            if (!zEquals) {
                C6755.m11871(AbstractC0900.m718("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                return false;
            }
            SignatureKind signatureKind = c5886.f14937;
            SignatureKind signatureKind2 = this.f14937;
            if (signatureKind2 == signatureKind && this.f14938 == c5886.f14938) {
                ArrayList arrayList2 = this.f14933;
                if (arrayList2.size() == arrayList.size()) {
                    if (!abstractC57542.equals(C5773.f14645) || signatureKind2 != SignatureKind.FUNCTION) {
                        if (!AbstractC5227.m9466(str2, str) || (c5769M10567 = AbstractC5889.m10567((list = this.f14934), list2)) == null) {
                            return false;
                        }
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            AbstractC5226 abstractC5226 = (AbstractC5226) list.get(i);
                            AbstractC5226 abstractC52262 = (AbstractC5226) list2.get(i);
                            if (abstractC5226.getUpperBounds().size() != abstractC52262.getUpperBounds().size()) {
                                return false;
                            }
                            List<InterfaceC5919> upperBounds = abstractC5226.getUpperBounds();
                            ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(upperBounds, 10));
                            for (InterfaceC5919 interfaceC5919 : upperBounds) {
                                C5769 c5769 = C5769.f14634;
                                InterfaceC5919 interfaceC59192 = c5769M10567.m10487(interfaceC5919, KVariance.INVARIANT).f14982;
                                if (interfaceC59192 == null) {
                                    AbstractC5889.m10562(str2);
                                    throw null;
                                }
                                arrayList3.add(interfaceC59192);
                            }
                            ArrayList<Pair> arrayListM9380 = AbstractC5176.m9380(AbstractC5176.m9337(arrayList3, new C5888(str2)), AbstractC5176.m9337(abstractC52262.getUpperBounds(), new C5888(str)));
                            if (!arrayListM9380.isEmpty()) {
                                for (Pair pair : arrayListM9380) {
                                    InterfaceC5919 interfaceC59193 = (InterfaceC5919) pair.getFirst();
                                    InterfaceC5919 interfaceC59194 = (InterfaceC5919) pair.getSecond();
                                    if (!AbstractC5238.m9496(interfaceC59193, interfaceC59194) || !AbstractC5238.m9496(interfaceC59194, interfaceC59193)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            InterfaceC5919 interfaceC59195 = (InterfaceC5919) arrayList2.get(i2);
                            C5769 c57692 = C5769.f14634;
                            InterfaceC5919 interfaceC59196 = c5769M10567.m10487(interfaceC59195, KVariance.INVARIANT).f14982;
                            if (interfaceC59196 == null) {
                                AbstractC5889.m10562(str2);
                                throw null;
                            }
                            InterfaceC5919 interfaceC59197 = (InterfaceC5919) arrayList.get(i2);
                            if (!AbstractC5238.m9496(interfaceC59196, interfaceC59197) || !AbstractC5238.m9496(interfaceC59197, interfaceC59196)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    if (AbstractC5227.m9466(this.f14935, c5886.f14935)) {
                        List list4 = this.f14932;
                        if (list4.size() == list3.size()) {
                            if (list4.size() != arrayList2.size()) {
                                StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                sb.append(list4.size());
                                sb.append(") and kotlinParameterTypes.size (");
                                sb.append(arrayList2.size());
                                sb.append(") must be equal for member '");
                                C6755.m11871(AbstractC0900.m708(sb, str2, '\''));
                                return false;
                            }
                            int size3 = list4.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Type type = (Type) this.f14939.get(i3);
                                Class cls = (Class) list4.get(i3);
                                Type type2 = (Type) c5886.f14939.get(i3);
                                Class cls2 = (Class) list3.get(i3);
                                TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                if (z || z2) {
                                    if (cls.isPrimitive() != cls2.isPrimitive()) {
                                        return false;
                                    }
                                    InterfaceC5919 interfaceC5919M10566 = AbstractC5889.m10566((InterfaceC5919) arrayList2.get(i3), str2);
                                    InterfaceC5919 interfaceC5919M105662 = AbstractC5889.m10566((InterfaceC5919) arrayList.get(i3), str);
                                    if (!AbstractC5238.m9496(interfaceC5919M10566, interfaceC5919M105662) || !AbstractC5238.m9496(interfaceC5919M105662, interfaceC5919M10566)) {
                                        return false;
                                    }
                                } else if (!AbstractC5227.m9466(cls, cls2)) {
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
        boolean zEquals = this.f14940.equals(C5773.f14645);
        SignatureKind signatureKind = this.f14937;
        boolean z = zEquals && signatureKind == SignatureKind.FUNCTION;
        boolean z2 = this.f14938;
        ArrayList arrayList = this.f14933;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{signatureKind, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.f14936});
            }
            C5043.m9170();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.f14935;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{signatureKind, numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.f14937 + ", name=" + this.f14936 + ", jvmNameIfFunction=" + this.f14935 + ", typeParameters=" + this.f14934 + ", kotlinParameterTypes=" + this.f14933 + ", javaParameterTypesIfFunction=" + this.f14932 + ", javaGenericParameterTypesIfFunction=" + this.f14939 + ", isStatic=" + this.f14938 + ", equalityMode=" + this.f14940 + ')';
    }
}
