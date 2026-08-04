package yyds;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛱᛶᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0139 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Field f846;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Method f847;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Constructor f848;

    public C0139(Field field, Method method, Constructor constructor) {
        AbstractC2328.m4341(-389046300476270L);
        AbstractC2328.m4341(-389106430018414L);
        AbstractC2328.m4341(-389153674658670L);
        this.f846 = field;
        this.f847 = method;
        this.f848 = constructor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0139)) {
            return false;
        }
        C0139 c0139 = (C0139) obj;
        return this.f846.equals(c0139.f846) && this.f847.equals(c0139.f847) && this.f848.equals(c0139.f848);
    }

    public final int hashCode() {
        return this.f848.hashCode() + ((this.f847.hashCode() + (this.f846.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-389424257598318L) + this.f846 + AbstractC2328.m4341(-389553106617198L) + this.f847 + AbstractC2328.m4341(-389613236159342L) + this.f848 + ')';
    }
}
