package p275s9;

import gg.AbstractC1416l;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: s9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3945a {

    /* JADX INFO: renamed from: a */
    public final Field f12936a;

    /* JADX INFO: renamed from: b */
    public final Field f12937b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3945a(Field field, Field field2) {
        this.f12936a = field;
        this.f12937b = field2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3945a)) {
            return false;
        }
        C3945a c3945a = (C3945a) obj;
        return this.f12936a.equals(c3945a.f12936a) && AbstractC1416l.m3825a(this.f12937b, c3945a.f12937b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f12936a.hashCode() * 31;
        Field field = this.f12937b;
        return iHashCode + (field == null ? 0 : field.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AvatarFields(avatar=" + this.f12936a + ", mask=" + this.f12937b + ")";
    }
}
