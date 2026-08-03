package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends tf.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0.b f10064h;

    public /* synthetic */ h(p0.b r1, int r2) {
            r0 = this;
            r0.f10063g = r2
            r0.f10064h = r1
            r0.<init>()
            return
    }

    @Override // tf.a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f10063g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            p0.b r0 = r3.f10064h
            boolean r4 = r0.containsKey(r4)
            return r4
        Lc:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L3a
        L12:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            p0.b r2 = r3.f10064h
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L29
            java.lang.Object r4 = r4.getValue()
            boolean r1 = r0.equals(r4)
            goto L3a
        L29:
            java.lang.Object r0 = r4.getValue()
            if (r0 != 0) goto L3a
            java.lang.Object r4 = r4.getKey()
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L3a
            r1 = 1
        L3a:
            return r1
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            int r0 = r1.f10063g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            p0.b r0 = r1.f10064h
            r0.getClass()
            int r0 = r0.f10051h
            return r0
        Ld:
            p0.b r0 = r1.f10064h
            r0.getClass()
            int r0 = r0.f10051h
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r7 = this;
            int r0 = r7.f10063g
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            p0.i r0 = new p0.i
            p0.b r1 = r7.f10064h
            p0.j r1 = r1.f10050g
            r2 = 8
            p0.k[] r3 = new p0.k[r2]
            r4 = 0
        L10:
            if (r4 >= r2) goto L1d
            p0.l r5 = new p0.l
            r6 = 1
            r5.<init>(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L10
        L1d:
            r0.<init>(r1, r3)
            return r0
        L21:
            p0.i r0 = new p0.i
            p0.b r1 = r7.f10064h
            p0.j r1 = r1.f10050g
            r2 = 8
            p0.k[] r3 = new p0.k[r2]
            r4 = 0
        L2c:
            if (r4 >= r2) goto L39
            p0.l r5 = new p0.l
            r6 = 0
            r5.<init>(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2c
        L39:
            r0.<init>(r1, r3)
            return r0
    }
}
