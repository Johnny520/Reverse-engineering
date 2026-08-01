package p041V;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: renamed from: V.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0310c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f682a;

    /* JADX INFO: renamed from: b */
    public final Type f683b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0310c(Type[] typeArr, Type[] typeArr2) {
        AbstractC0311d.m540b(typeArr2.length <= 1);
        AbstractC0311d.m540b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC0311d.m541c(typeArr[0]);
            this.f683b = null;
            this.f682a = AbstractC0311d.m539a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC0311d.m541c(typeArr2[0]);
        AbstractC0311d.m540b(typeArr[0] == Object.class);
        this.f683b = AbstractC0311d.m539a(typeArr2[0]);
        this.f682a = Object.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0311d.m542d(this, (WildcardType) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f683b;
        return type != null ? new Type[]{type} : AbstractC0311d.f684a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f682a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Type type = this.f683b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f682a.hashCode() + 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Type type = this.f683b;
        if (type != null) {
            return "? super " + AbstractC0311d.m548j(type);
        }
        Type type2 = this.f682a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC0311d.m548j(type2);
    }
}
