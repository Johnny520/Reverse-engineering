package yyds;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᲇᲁᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2538 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f12516;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Method f12517;

    public C2538(Method method, int i) {
        this.f12516 = i;
        this.f12517 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2538)) {
            return false;
        }
        C2538 c2538 = (C2538) obj;
        return this.f12516 == c2538.f12516 && this.f12517.getName().equals(c2538.f12517.getName());
    }

    public final int hashCode() {
        return this.f12517.getName().hashCode() + (this.f12516 * 31);
    }
}
