package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f5529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5530b;

    public d(java.lang.Object r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f5529a = r1
            r0.f5530b = r2
            return
    }

    public final java.lang.String toString() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r10.f5530b
            int r1 = t3.c.b(r1)
            java.lang.String r2 = "."
            java.lang.Object r3 = r10.f5529a
            switch(r1) {
                case 7: goto Lbe;
                case 8: goto Laf;
                case 9: goto L68;
                case 10: goto L4d;
                case 11: goto L2c;
                case 12: goto L1e;
                case 13: goto L17;
                default: goto L12;
            }
        L12:
            r0.append(r3)
            goto Lc9
        L17:
            java.lang.String r1 = "null"
            r0.append(r1)
            goto Lc9
        L1e:
            r3.getClass()
            hh.a r3 = (hh.a) r3
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            goto Lc9
        L2c:
            java.lang.String r1 = "{"
            r0.append(r1)
            r3.getClass()
            hh.c r3 = (hh.c) r3
            java.util.ArrayList r4 = r3.f5528h
            r8 = 0
            r9 = 62
            java.lang.String r5 = ", "
            r6 = 0
            r7 = 0
            java.lang.String r1 = tf.m.A1(r4, r5, r6, r7, r8, r9)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            goto Lc9
        L4d:
            r3.getClass()
            hh.l r3 = (hh.l) r3
            lh.b r1 = r3.p()
            java.lang.String r1 = r1.f8060i
            r0.append(r1)
            r0.append(r2)
            lh.b r1 = r3.p()
            java.lang.String r1 = r1.f8059h
            r0.append(r1)
            goto Lc9
        L68:
            r3.getClass()
            hh.o r3 = (hh.o) r3
            lh.d r1 = r3.p()
            java.lang.String r1 = r1.f8066j
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            lh.d r1 = r3.p()
            java.lang.String r1 = r1.f8063g
            r0.append(r1)
            r0.append(r2)
            lh.d r1 = r3.p()
            java.lang.String r1 = r1.f8064h
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            lh.d r1 = r3.p()
            java.util.ArrayList r2 = r1.f8065i
            r6 = 0
            r7 = 62
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            java.lang.String r1 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            goto Lc9
        Laf:
            r3.getClass()
            hh.i r3 = (hh.i) r3
            lh.a r1 = r3.p()
            java.lang.String r1 = r1.f8057g
            r0.append(r1)
            goto Lc9
        Lbe:
            java.lang.String r1 = "\""
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
        Lc9:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
