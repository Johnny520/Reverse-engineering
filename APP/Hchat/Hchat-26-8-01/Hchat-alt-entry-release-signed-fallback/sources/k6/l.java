package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h6.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k6.k f7353i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0.q0 f7354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7355h;

    static {
            k6.k r0 = new k6.k
            r1 = 0
            r0.<init>(r1)
            k6.l.f7353i = r0
            k6.k r0 = new k6.k
            r0.<init>(r1)
            return
    }

    public l(h0.q0 r1) {
            r0 = this;
            r0.<init>()
            r0.f7354g = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f7355h = r1
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r8, n6.a r9) {
            r7 = this;
            java.lang.Class r0 = r9.f9028a
            java.lang.Class<i6.a> r1 = i6.a.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            r5 = r0
            i6.a r5 = (i6.a) r5
            if (r5 != 0) goto Lf
            r8 = 0
            return r8
        Lf:
            h0.q0 r2 = r7.f7354g
            r6 = 1
            r1 = r7
            r3 = r8
            r4 = r9
            h6.n r8 = r1.b(r2, r3, r4, r5, r6)
            return r8
    }

    public final h6.n b(h0.q0 r3, h6.f r4, n6.a r5, i6.a r6, boolean r7) {
            r2 = this;
            java.lang.Class r0 = r6.value()
            n6.a r1 = new n6.a
            r1.<init>(r0)
            r0 = 1
            j6.o r3 = r3.c(r1, r0)
            java.lang.Object r3 = r3.d()
            boolean r6 = r6.nullSafe()
            boolean r0 = r3 instanceof h6.n
            if (r0 == 0) goto L1d
            h6.n r3 = (h6.n) r3
            goto L36
        L1d:
            boolean r0 = r3 instanceof h6.o
            if (r0 == 0) goto L3f
            h6.o r3 = (h6.o) r3
            if (r7 == 0) goto L32
            java.lang.Class r7 = r5.f9028a
            java.util.concurrent.ConcurrentHashMap r0 = r2.f7355h
            java.lang.Object r7 = r0.putIfAbsent(r7, r3)
            h6.o r7 = (h6.o) r7
            if (r7 == 0) goto L32
            r3 = r7
        L32:
            h6.n r3 = r3.a(r4, r5)
        L36:
            if (r3 == 0) goto L3e
            if (r6 == 0) goto L3e
            h6.m r3 = r3.a()
        L3e:
            return r3
        L3f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.reflect.Type r5 = r5.f9029b
            java.lang.String r5 = j6.h.i(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Invalid attempt to bind an instance of "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = " as a @JsonAdapter for "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r4.<init>(r3)
            throw r4
    }
}
