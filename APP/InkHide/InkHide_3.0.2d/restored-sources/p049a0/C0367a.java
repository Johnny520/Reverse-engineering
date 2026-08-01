package p049a0;

import java.lang.reflect.Type;
import java.util.Objects;
import p041V.AbstractC0311d;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0367a {

    /* JADX INFO: renamed from: a */
    public final Class f860a;

    /* JADX INFO: renamed from: b */
    public final Type f861b;

    /* JADX INFO: renamed from: c */
    public final int f862c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0367a(Type type) {
        Objects.requireNonNull(type);
        Type typeM539a = AbstractC0311d.m539a(type);
        this.f861b = typeM539a;
        this.f860a = AbstractC0311d.m545g(typeM539a);
        this.f862c = typeM539a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0367a) {
            return AbstractC0311d.m542d(this.f861b, ((C0367a) obj).f861b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f862c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0311d.m548j(this.f861b);
    }
}
