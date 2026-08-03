package p134j6;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: j6.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2067e implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: g */
    public final Type f6947g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2067e(Type type) {
        Objects.requireNonNull(type);
        this.f6947g = AbstractC2070h.m5123a(type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC2070h.m5125c(this, (GenericArrayType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f6947g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6947g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2070h.m5131i(this.f6947g) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
