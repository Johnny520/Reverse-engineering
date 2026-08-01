package p027E4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: E4.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0310Y implements GenericArrayType {

    /* JADX INFO: renamed from: d */
    public final Type f1024d;

    public C0310Y(Type type) {
        this.f1024d = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0315b0.m534e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f1024d;
    }

    public final int hashCode() {
        return this.f1024d.hashCode();
    }

    public final String toString() {
        return AbstractC0315b0.m548s(this.f1024d) + "[]";
    }
}
