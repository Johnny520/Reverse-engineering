package p098g9;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: g9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2547a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: q */
    public final Type f6811q;

    public C2547a(Type type) {
        type.getClass();
        this.f6811q = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC1061t.m3842c(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f6811q;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return AbstractC2567u.m9100h(this.f6811q) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
