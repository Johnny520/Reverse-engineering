package p050c0;

import java.lang.reflect.Field;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631W0 extends AbstractC0635Y0 {

    /* JADX INFO: renamed from: a */
    public final Field f1943a;

    public C0631W0(Field field) {
        this.f1943a = field;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0631W0) && AbstractC0307g.m699a(this.f1943a, ((C0631W0) obj).f1943a);
    }

    public final int hashCode() {
        return this.f1943a.hashCode();
    }

    public final String toString() {
        return "FieldValue(field=" + this.f1943a + ")";
    }
}
