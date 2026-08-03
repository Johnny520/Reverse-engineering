package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b8.j f518g;

    public int a() {
            r1 = this;
            r0 = 0
            return r0
    }

    public b8.j c() {
            r1 = this;
            b8.j r0 = r1.f518g
            return r0
    }

    public final b8.j d() {
            r1 = this;
            b8.j r0 = r1.c()
            if (r0 == 0) goto Lb
            b8.j r0 = r0.d()
            return r0
        Lb:
            return r1
    }

    public int g() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String i(boolean r2) {
            r1 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1.k(r0, r2)     // Catch: java.io.IOException -> Le
            r0.flush()     // Catch: java.io.IOException -> Le
            r0.close()     // Catch: java.io.IOException -> Le
        Le:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.util.Iterator iterator() {
            r1 = this;
            z7.h r0 = z7.h.f22606g
            return r0
    }

    public abstract void k(java.io.StringWriter r1, boolean r2);

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 10
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f8.i.d(r0, r1, r2)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
