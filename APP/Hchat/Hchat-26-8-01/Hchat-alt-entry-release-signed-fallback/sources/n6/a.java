package n6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f9028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Type f9029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9030c;

    public a(java.lang.reflect.Type r2) {
            r1 = this;
            r1.<init>()
            java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.reflect.Type r2 = j6.h.a(r2)
            r1.f9029b = r2
            java.lang.Class r0 = j6.h.f(r2)
            r1.f9028a = r0
            int r2 = r2.hashCode()
            r1.f9030c = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof n6.a
            if (r0 == 0) goto L12
            n6.a r2 = (n6.a) r2
            java.lang.reflect.Type r2 = r2.f9029b
            java.lang.reflect.Type r0 = r1.f9029b
            boolean r2 = j6.h.c(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f9030c
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f9029b
            java.lang.String r0 = j6.h.i(r0)
            return r0
    }
}
