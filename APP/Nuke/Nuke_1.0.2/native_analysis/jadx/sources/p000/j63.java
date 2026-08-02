package p000;

import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class j63<T> {

    /* JADX INFO: renamed from: a */
    public final Class f4904a;

    /* JADX INFO: renamed from: b */
    public final Type f4905b;

    /* JADX INFO: renamed from: c */
    public final int f4906c;

    public j63(Type type) {
        Objects.requireNonNull(type);
        Type typeM5315n = AbstractC0738tl.m5315n(type);
        this.f4905b = typeM5315n;
        this.f4904a = AbstractC0738tl.m5279F(typeM5315n);
        this.f4906c = typeM5315n.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j63) {
            return AbstractC0738tl.m5324w(this.f4905b, ((j63) obj).f4905b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4906c;
    }

    public final String toString() {
        return AbstractC0738tl.m5305d0(this.f4905b);
    }
}
