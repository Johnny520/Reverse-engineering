package p380z8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6126b {

    /* JADX INFO: renamed from: a */
    public final Method f24689a;

    /* JADX INFO: renamed from: b */
    public final Field f24690b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6126b(Method method, Field field) {
        this.f24689a = method;
        this.f24690b = field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6126b)) {
            return false;
        }
        C6126b c6126b = (C6126b) obj;
        return this.f24689a.equals(c6126b.f24689a) && this.f24690b.equals(c6126b.f24690b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f24690b.hashCode() + (this.f24689a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VoipEventAccess(dispatch=" + this.f24689a + ", resultField=" + this.f24690b + ")";
    }
}
