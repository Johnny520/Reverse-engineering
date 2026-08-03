package Yue;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
@InterfaceC4772
public final class C8018 implements TypeVariable<GenericDeclaration>, InterfaceC8011 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC5611 f3194;

    public C8018(@InterfaceC6399 InterfaceC5611 interfaceC5611) {
        C5499.m17103(interfaceC5611, "typeParameter");
        this.f3194 = interfaceC5611;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (C5499.m17094(getName(), typeVariable.getName()) && C5499.m17094(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @InterfaceC6399
    public Type[] getBounds() {
        List<InterfaceC5609> upperBounds = this.f3194.getUpperBounds();
        ArrayList arrayList = new ArrayList(C3881.m10756(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(C8038.m25413((InterfaceC5609) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @InterfaceC6399
    public GenericDeclaration getGenericDeclaration() {
        throw new C6398("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f3194));
    }

    @Override // java.lang.reflect.TypeVariable
    @InterfaceC6399
    public String getName() {
        return this.f3194.getName();
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC8011
    @InterfaceC6399
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return getTypeName();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final <T extends Annotation> T m4032(@InterfaceC6399 Class<T> cls) {
        C5499.m17103(cls, "annotationClass");
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final Annotation[] m4033() {
        return new Annotation[0];
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Annotation[] m25298() {
        return new Annotation[0];
    }
}
