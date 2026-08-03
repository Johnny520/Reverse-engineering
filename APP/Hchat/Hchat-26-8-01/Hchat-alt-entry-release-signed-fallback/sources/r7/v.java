package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends r7.l {
    public final r7.s a() {
            r2 = this;
            r7.b r0 = r2.f11569g
            r7.w r0 = (r7.w) r0
            java.lang.Class<u7.c> r1 = u7.c.class
            k7.a r0 = r0.v(r1)
            u7.c r0 = (u7.c) r0
            if (r0 == 0) goto L17
            int r1 = r2.get()
            r7.s r0 = r0.V(r1)
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // r7.l
    public final java.lang.String toString() {
            r2 = this;
            r7.s r0 = r2.a()
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.f11578m
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NULL{"
            r0.<init>(r1)
            int r1 = r2.get()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
