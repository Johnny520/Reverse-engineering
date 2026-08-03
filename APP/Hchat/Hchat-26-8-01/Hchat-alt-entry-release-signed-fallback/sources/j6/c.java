package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h6.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile h6.n f6718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h6.f f6720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n6.a f6721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j6.d f6722e;

    public c(j6.d r1, boolean r2, h6.f r3, n6.a r4) {
            r0 = this;
            r0.<init>()
            r0.f6722e = r1
            r0.f6719b = r2
            r0.f6720c = r3
            r0.f6721d = r4
            return
    }

    @Override // h6.n
    public final void b(o6.a r11, java.lang.Object r12) {
            r10 = this;
            boolean r0 = r10.f6719b
            if (r0 == 0) goto L8
            r11.l()
            return
        L8:
            h6.n r0 = r10.f6718a
            if (r0 != 0) goto L91
            h6.f r0 = r10.f6720c
            j6.d r1 = r10.f6722e
            n6.a r2 = r10.f6721d
            k6.l r3 = r0.f5114d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f7355h
            k6.k r5 = k6.l.f7353i
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.f9028a
            java.lang.Object r7 = r4.get(r5)
            h6.o r7 = (h6.o) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<i6.a> r7 = i6.a.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            i6.a r7 = (i6.a) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<h6.o> r8 = h6.o.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            h0.q0 r8 = r3.f7354g
            n6.a r9 = new n6.a
            r9.<init>(r7)
            j6.o r7 = r8.c(r9, r6)
            java.lang.Object r7 = r7.d()
            h6.o r7 = (h6.o) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            h6.o r4 = (h6.o) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.f5115e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            h6.o r5 = (h6.o) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            h6.n r5 = r5.a(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            h6.n r0 = r0.b(r2)
        L88:
            r10.f6718a = r0
            goto L91
        L8b:
            java.lang.String r11 = "GSON cannot serialize or deserialize "
            g1.d.f(r2, r11)
            return
        L91:
            r0.b(r11, r12)
            return
    }
}
