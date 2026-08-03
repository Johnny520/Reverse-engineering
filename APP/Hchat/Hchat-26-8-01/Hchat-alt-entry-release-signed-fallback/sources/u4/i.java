package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements z4.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u4.r f13382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u4.t f13383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u4.o f13384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u4.p f13385j;

    public i(u4.r r1, u4.t r2, u4.o r3, u4.p r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L20
            if (r2 == 0) goto L19
            if (r4 == 0) goto L12
            r0.f13382g = r1
            r0.f13383h = r2
            r0.f13384i = r3
            r0.f13385j = r4
            return
        L12:
            java.lang.String r1 = "sources == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L19:
            java.lang.String r1 = "position == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L20:
            java.lang.String r1 = "opcode == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r7 = this;
            java.lang.String r0 = r7.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 80
            r1.<init>(r2)
            u4.t r2 = r7.f13383h
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            u4.r r2 = r7.f13382g
            java.lang.String r3 = r2.f13412g
            if (r3 == 0) goto L1c
            goto L20
        L1c:
            java.lang.String r3 = r2.toString()
        L20:
            r1.append(r3)
            if (r0 == 0) goto L32
            java.lang.String r2 = "("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
        L32:
            java.lang.String r0 = " "
            java.lang.String r2 = " ."
            u4.o r3 = r7.f13384i
            r4 = 1
            if (r3 != 0) goto L3f
            r1.append(r2)
            goto L49
        L3f:
            r1.append(r0)
            java.lang.String r3 = r3.n(r4)
            r1.append(r3)
        L49:
            java.lang.String r3 = " <-"
            r1.append(r3)
            u4.p r3 = r7.f13385j
            java.lang.Object[] r5 = r3.f22543h
            int r5 = r5.length
            if (r5 != 0) goto L59
            r1.append(r2)
            goto L6f
        L59:
            r2 = 0
        L5a:
            if (r2 >= r5) goto L6f
            r1.append(r0)
            java.lang.Object r6 = r3.l(r2)
            u4.o r6 = (u4.o) r6
            java.lang.String r6 = r6.n(r4)
            r1.append(r6)
            int r2 = r2 + 1
            goto L5a
        L6f:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public abstract void d(u4.h r1);

    public abstract w4.e e();

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public java.lang.String h() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = java.lang.System.identityHashCode(r1)
            return r0
    }

    public abstract u4.i i(w4.c r1);

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 80
            r1.<init>(r2)
            java.lang.String r2 = "Insn{"
            r1.append(r2)
            u4.t r2 = r4.f13383h
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            u4.r r3 = r4.f13382g
            r1.append(r3)
            if (r0 == 0) goto L27
            r1.append(r2)
            r1.append(r0)
        L27:
            java.lang.String r0 = " :: "
            r1.append(r0)
            u4.o r0 = r4.f13384i
            if (r0 == 0) goto L38
            r1.append(r0)
            java.lang.String r0 = " <- "
            r1.append(r0)
        L38:
            u4.p r0 = r4.f13385j
            r1.append(r0)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
