package p086r0;

import java.lang.reflect.Field;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0820A {

    /* JADX INFO: renamed from: a */
    public final Field f2735a;

    /* JADX INFO: renamed from: b */
    public final Field f2736b;

    /* JADX INFO: renamed from: c */
    public final Field f2737c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0820A(Field field, Field field2, Field field3) {
        this.f2735a = field;
        this.f2736b = field2;
        this.f2737c = field3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0820A)) {
            return false;
        }
        C0820A c0820a = (C0820A) obj;
        return AbstractC0223g.m414a(this.f2735a, c0820a.f2735a) && AbstractC0223g.m414a(this.f2736b, c0820a.f2736b) && AbstractC0223g.m414a(this.f2737c, c0820a.f2737c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f2736b.hashCode() + (this.f2735a.hashCode() * 31)) * 31;
        Field field = this.f2737c;
        return iHashCode + (field == null ? 0 : field.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MappingContainerFields(sparseField=" + this.f2735a + ", mapField=" + this.f2736b + ", countField=" + this.f2737c + ")";
    }
}
