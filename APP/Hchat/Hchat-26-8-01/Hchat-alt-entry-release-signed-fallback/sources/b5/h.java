package b5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.HashMap f474a;

    public h() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f474a = r0
            return
    }

    public void a(nd.b0 r4, nd.b0 r5) {
            r3 = this;
            if (r4 != r5) goto L3
            return
        L3:
            java.util.HashMap r0 = r3.f474a
            me.a r1 = new me.a
            r2 = 12
            r1.<init>(r2)
            java.lang.Object r4 = r0.computeIfAbsent(r4, r1)
            java.util.Set r4 = (java.util.Set) r4
            r4.add(r5)
            return
    }

    public b5.f b(b5.f r3) {
            r2 = this;
            java.util.HashMap r0 = r2.f474a
            java.lang.Object r1 = r0.get(r3)
            b5.f r1 = (b5.f) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            r0.put(r3, r3)
            return r3
    }

    public void c(java.util.function.BiConsumer r4) {
            r3 = this;
            java.util.HashMap r0 = r3.f474a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            r4.accept(r2, r1)
            goto La
        L24:
            return
    }
}
