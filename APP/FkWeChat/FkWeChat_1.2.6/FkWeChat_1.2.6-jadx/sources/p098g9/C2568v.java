package p098g9;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: g9.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2568v implements WildcardType, Type {

    /* JADX INFO: renamed from: s */
    public static final a f6835s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C2568v f6836t = new C2568v(null, null);

    /* JADX INFO: renamed from: q */
    public final Type f6837q;

    /* JADX INFO: renamed from: r */
    public final Type f6838r;

    public C2568v(Type type, Type type2) {
        this.f6837q = type;
        this.f6838r = type2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f6838r;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f6838r != null) {
            return "? super " + AbstractC2567u.m9100h(this.f6838r);
        }
        Type type = this.f6837q;
        if (type == null || AbstractC1061t.m3842c(type, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC2567u.m9100h(this.f6837q);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f6837q;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }

    /* JADX INFO: renamed from: g9.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2568v m9103a() {
            return C2568v.f6836t;
        }

        public a() {
        }
    }
}
