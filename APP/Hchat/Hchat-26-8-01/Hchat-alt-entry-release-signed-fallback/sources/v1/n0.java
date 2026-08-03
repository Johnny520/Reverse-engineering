package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface n0 {
    default int a(v1.o r10, java.util.List r11, int r12) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L27
            java.lang.Object r4 = r11.get(r3)
            v1.m0 r4 = (v1.m0) r4
            v1.h r5 = new v1.h
            v1.q r6 = v1.q.f14015g
            r7 = 0
            v1.p r8 = v1.p.f14010h
            r5.<init>(r4, r8, r6, r7)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L27:
            r11 = 7
            long r11 = u2.b.b(r2, r2, r2, r12, r11)
            v1.s r1 = new v1.s
            u2.m r2 = r10.getLayoutDirection()
            r1.<init>(r10, r2)
            v1.o0 r10 = r9.h(r1, r0, r11)
            int r10 = r10.h()
            return r10
    }

    default int c(v1.o r10, java.util.List r11, int r12) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L27
            java.lang.Object r4 = r11.get(r3)
            v1.m0 r4 = (v1.m0) r4
            v1.h r5 = new v1.h
            v1.q r6 = v1.q.f14015g
            r7 = 0
            v1.p r8 = v1.p.f14009g
            r5.<init>(r4, r8, r6, r7)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L27:
            r11 = 7
            long r11 = u2.b.b(r2, r2, r2, r12, r11)
            v1.s r1 = new v1.s
            u2.m r2 = r10.getLayoutDirection()
            r1.<init>(r10, r2)
            v1.o0 r10 = r9.h(r1, r0, r11)
            int r10 = r10.h()
            return r10
    }

    default int g(v1.o r10, java.util.List r11, int r12) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L27
            java.lang.Object r4 = r11.get(r3)
            v1.m0 r4 = (v1.m0) r4
            v1.h r5 = new v1.h
            v1.q r6 = v1.q.f14016h
            r7 = 0
            v1.p r8 = v1.p.f14010h
            r5.<init>(r4, r8, r6, r7)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L27:
            r11 = 13
            long r11 = u2.b.b(r2, r12, r2, r2, r11)
            v1.s r1 = new v1.s
            u2.m r2 = r10.getLayoutDirection()
            r1.<init>(r10, r2)
            v1.o0 r10 = r9.h(r1, r0, r11)
            int r10 = r10.g()
            return r10
    }

    v1.o0 h(v1.p0 r1, java.util.List r2, long r3);

    default int i(v1.o r10, java.util.List r11, int r12) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L27
            java.lang.Object r4 = r11.get(r3)
            v1.m0 r4 = (v1.m0) r4
            v1.h r5 = new v1.h
            v1.q r6 = v1.q.f14016h
            r7 = 0
            v1.p r8 = v1.p.f14009g
            r5.<init>(r4, r8, r6, r7)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L27:
            r11 = 13
            long r11 = u2.b.b(r2, r12, r2, r2, r11)
            v1.s r1 = new v1.s
            u2.m r2 = r10.getLayoutDirection()
            r1.<init>(r10, r2)
            v1.o0 r10 = r9.h(r1, r0, r11)
            int r10 = r10.g()
            return r10
    }
}
