package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12644h;

    public /* synthetic */ k(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f12643g = r2
            r0.f12644h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r12 = this;
            int r0 = r12.f12643g
            java.lang.Object r1 = r12.f12644h
            switch(r0) {
                case 0: goto Ld6;
                case 1: goto Lcf;
                case 2: goto Lc6;
                case 3: goto Lbf;
                case 4: goto Lb6;
                case 5: goto Laf;
                case 6: goto La6;
                case 7: goto L9f;
                case 8: goto L96;
                case 9: goto L8f;
                case 10: goto L86;
                case 11: goto L7f;
                default: goto L7;
            }
        L7:
            i0.j0 r1 = (i0.j0) r1
            java.util.ArrayList r0 = r1.f5934a
            int r1 = r0.size()
            f.k0 r2 = new f.k0
            r2.<init>(r1)
            int r1 = r0.size()
            r3 = 0
            r4 = r3
        L1a:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r0.get(r4)
            l0.e r5 = (l0.e) r5
            java.lang.Object r6 = r5.f7661b
            int r7 = r5.f7660a
            if (r6 == 0) goto L34
            i0.p0 r6 = new i0.p0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r5.f7661b
            r6.<init>(r7, r8)
            goto L38
        L34:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
        L38:
            int r7 = r2.f(r6)
            if (r7 >= 0) goto L40
            r8 = 1
            goto L41
        L40:
            r8 = r3
        L41:
            if (r8 == 0) goto L45
            r9 = 0
            goto L49
        L45:
            java.lang.Object[] r9 = r2.f2850c
            r9 = r9[r7]
        L49:
            if (r9 != 0) goto L4c
            goto L66
        L4c:
            boolean r10 = r9 instanceof f.f0
            if (r10 == 0) goto L57
            f.f0 r9 = (f.f0) r9
            r9.a(r5)
            r5 = r9
            goto L66
        L57:
            java.lang.Object[] r10 = f.p0.f2882a
            f.f0 r10 = new f.f0
            r11 = 2
            r10.<init>(r11)
            r10.a(r9)
            r10.a(r5)
            r5 = r10
        L66:
            if (r8 == 0) goto L72
            int r7 = ~r7
            java.lang.Object[] r8 = r2.f2849b
            r8[r7] = r6
            java.lang.Object[] r6 = r2.f2850c
            r6[r7] = r5
            goto L76
        L72:
            java.lang.Object[] r6 = r2.f2850c
            r6[r7] = r5
        L76:
            int r4 = r4 + 1
            goto L1a
        L79:
            j0.a r0 = new j0.a
            r0.<init>(r2)
            return r0
        L7f:
            i.k1 r1 = (i.k1) r1
            i.e1 r0 = r1.f()
            return r0
        L86:
            i.k1 r1 = (i.k1) r1
            i0.j1 r0 = r1.f5710d
            java.lang.Object r0 = r0.getValue()
            return r0
        L8f:
            i.k1 r1 = (i.k1) r1
            i.e1 r0 = r1.f()
            return r0
        L96:
            i.k1 r1 = (i.k1) r1
            i0.j1 r0 = r1.f5710d
            java.lang.Object r0 = r0.getValue()
            return r0
        L9f:
            i.k1 r1 = (i.k1) r1
            i.e1 r0 = r1.f()
            return r0
        La6:
            i.k1 r1 = (i.k1) r1
            i0.j1 r0 = r1.f5710d
            java.lang.Object r0 = r0.getValue()
            return r0
        Laf:
            i.k1 r1 = (i.k1) r1
            i.e1 r0 = r1.f()
            return r0
        Lb6:
            i.k1 r1 = (i.k1) r1
            i0.j1 r0 = r1.f5710d
            java.lang.Object r0 = r0.getValue()
            return r0
        Lbf:
            i.k1 r1 = (i.k1) r1
            i.e1 r0 = r1.f()
            return r0
        Lc6:
            i.k1 r1 = (i.k1) r1
            i0.j1 r0 = r1.f5710d
            java.lang.Object r0 = r0.getValue()
            return r0
        Lcf:
            i.k1 r1 = (i.k1) r1
            i.e1 r0 = r1.f()
            return r0
        Ld6:
            i.k1 r1 = (i.k1) r1
            i0.j1 r0 = r1.f5710d
            java.lang.Object r0 = r0.getValue()
            return r0
    }
}
