package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends i5.c implements v5.c, s5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f9533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9535l;

    public p(java.lang.String r1, java.lang.String r2, java.util.Set r3) {
            r0 = this;
            r0.<init>()
            r0.f9533j = r3
            r0.f9534k = r1
            r0.f9535l = r2
            return
    }

    @Override // s5.a
    public final java.lang.String e() {
            r6 = this;
            java.util.Set r0 = r6.f9533j
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            k5.b r1 = (k5.b) r1
            java.lang.String r3 = r1.getType()
            java.lang.String r4 = "Ldalvik/annotation/Signature;"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L6
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 != 0) goto L24
            goto L7c
        L24:
            k5.a r0 = r1.a()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            r1 = r0
            o5.g r1 = (o5.g) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r1 = r1.next()
            k5.c r1 = (k5.c) r1
            java.lang.String r3 = r1.a()
            java.lang.String r4 = "value"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2c
            w5.a r0 = r1.b()
            int r1 = r0.h()
            r3 = 28
            if (r1 == r3) goto L54
            goto L7c
        L54:
            p5.b r0 = (p5.b) r0
            goto L58
        L57:
            r0 = r2
        L58:
            if (r0 != 0) goto L5b
            goto L7c
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L87
            java.lang.Object r3 = r0.next()
            w5.a r3 = (w5.a) r3
            int r4 = r3.h()
            r5 = 23
            if (r4 == r5) goto L7d
        L7c:
            return r2
        L7d:
            p5.h r3 = (p5.h) r3
            java.lang.String r3 = r3.a()
            r1.append(r3)
            goto L68
        L87:
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // s5.a
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f9534k
            return r0
    }

    @Override // v5.c
    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f9535l
            return r0
    }
}
