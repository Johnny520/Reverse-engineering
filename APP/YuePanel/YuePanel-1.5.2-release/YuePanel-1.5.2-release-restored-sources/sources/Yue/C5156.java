package Yue;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4772
public final class C5156 implements GenericArrayType, InterfaceC8011 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Type f1309;

    public C5156(@InterfaceC6399 Type type) {
        C5499.m17103(type, "elementType");
        this.f1309 = type;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof GenericArrayType) && C5499.m17094(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @InterfaceC6399
    public Type getGenericComponentType() {
        return this.f1309;
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC8011
    @InterfaceC6399
    public String getTypeName() {
        return C8038.m25420(this.f1309) + C5385.f13236;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return getTypeName();
    }
}
