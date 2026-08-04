package yyds;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: yyds.ᛳᛵᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0600 implements GenericArrayType {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Type f2830;

    public C0600(Type type) {
        this.f2830 = AbstractC1917.m3702(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC1917.m3706(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f2830;
    }

    public final int hashCode() {
        return this.f2830.hashCode();
    }

    public final String toString() {
        return AbstractC1917.m3703(this.f2830) + "[]";
    }
}
