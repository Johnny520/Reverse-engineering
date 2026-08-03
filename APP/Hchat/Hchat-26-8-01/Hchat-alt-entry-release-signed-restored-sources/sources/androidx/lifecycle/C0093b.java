package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0093b {

    /* JADX INFO: renamed from: a */
    public final int f275a;

    /* JADX INFO: renamed from: b */
    public final Method f276b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0093b(Method method, int i9) {
        this.f275a = i9;
        this.f276b = method;
        method.setAccessible(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093b)) {
            return false;
        }
        C0093b c0093b = (C0093b) obj;
        return this.f275a == c0093b.f275a && this.f276b.getName().equals(c0093b.f276b.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f276b.getName().hashCode() + (this.f275a * 31);
    }
}
