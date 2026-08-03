package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends v7.j0 {
    @Override // v7.j0
    public final java.lang.String N() {
            r14 = this;
            v7.a r0 = v7.a.f14137i
            v7.k0 r1 = r14.T()
            v7.k0[] r0 = r0.f14144h
            r2 = 0
            r3 = r2
        La:
            int r4 = r0.length
            if (r3 >= r4) goto L1eb
            r4 = r0[r3]
            if (r1 != r4) goto L1e7
            java.lang.String r0 = r14.Y()
            if (r0 != 0) goto L1e4
            int r0 = r14.Z()
            l7.f r1 = r14.i()
            r3 = 0
            if (r1 != 0) goto L23
            goto L29
        L23:
            l7.l r4 = r1.Y()
            if (r4 != 0) goto L2b
        L29:
            r0 = r3
            goto L2f
        L2b:
            t7.b r0 = r4.X(r1, r0)
        L2f:
            if (r0 == 0) goto L1e3
            int r1 = r14.O()
            r4 = 1
            java.util.Iterator r0 = r0.d(r4)
            r5 = r3
        L3b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r0.next()
            v7.d r6 = (v7.d) r6
            java.lang.Class<l7.m> r7 = l7.m.class
            k7.a r7 = r6.u(r7)
            l7.m r7 = (l7.m) r7
            if (r7 == 0) goto L58
            p7.a r7 = r7.f7869m
            p7.k r7 = (p7.k) r7
            v7.y r7 = r7.f10302v
            goto L59
        L58:
            r7 = r3
        L59:
            if (r7 == 0) goto L66
            v7.a0 r7 = r7.f14200n
            byte[] r7 = r7.r()
            boolean r7 = v7.z.R(r7)
            goto L67
        L66:
            r7 = r2
        L67:
            if (r7 == 0) goto L6b
            r5 = r6
            goto L6f
        L6b:
            if (r5 != 0) goto L3b
            r5 = r6
            goto L3b
        L6f:
            if (r5 != 0) goto L73
            goto L1e3
        L73:
            v7.g0 r0 = r5.f14150k
            boolean r5 = r0 instanceof v7.c0
            if (r5 == 0) goto L7c
            v7.c0 r0 = (v7.c0) r0
            goto L7d
        L7c:
            r0 = r3
        L7d:
            if (r0 == 0) goto L84
            k7.a r0 = r0.f14154l
            j7.c r0 = (j7.c) r0
            goto L85
        L84:
            r0 = r3
        L85:
            if (r0 == 0) goto Lc1
            z7.c r5 = r0.f9563k
            int r5 = r5.size()
            if (r5 != 0) goto L90
            goto Lc1
        L90:
            z7.c r0 = r0.f9563k
            if (r0 != 0) goto L96
        L94:
            r6 = r3
            goto Lbf
        L96:
            int r5 = r0.size()
            m.a[] r6 = new m.a[r5]
            r7 = r2
            r8 = r3
        L9e:
            if (r7 >= r5) goto Lbd
            m.a r9 = new m.a
            java.lang.Object[] r10 = r0.f22584g
            r10 = r10[r7]
            v7.e0 r10 = (v7.e0) r10
            r11 = 26
            r9.<init>(r10, r11)
            r6[r7] = r9
            if (r8 != 0) goto Lba
            v7.b r11 = v7.b.f14145h
            v7.b r10 = r10.a0()
            if (r11 != r10) goto Lba
            r8 = r9
        Lba:
            int r7 = r7 + 1
            goto L9e
        Lbd:
            if (r8 == 0) goto L94
        Lbf:
            if (r6 != 0) goto Lc3
        Lc1:
            r0 = r3
            goto Lca
        Lc3:
            m.a r0 = new m.a
            r5 = 25
            r0.<init>(r6, r5)
        Lca:
            if (r0 == 0) goto L1e3
            java.lang.Object r5 = r0.f8069h
            m.a[] r5 = (m.a[]) r5
            m.a r0 = r0.p()
            java.lang.Object r0 = r0.f8069h
            v7.e0 r0 = (v7.e0) r0
            v7.b r6 = r0.a0()
            v7.b r7 = v7.b.f14145h
            if (r6 != r7) goto L163
            v7.a r6 = v7.a.f14140l
            int r0 = r0.O()
            int r6 = r6.f14143g
            r0 = r0 & r6
            if (r0 != r6) goto L163
            int r0 = r5.length
            m.a[] r6 = new m.a[r0]
            r7 = r2
        Lef:
            if (r7 >= r0) goto L13f
            r8 = r5[r7]
            java.lang.Object r9 = r8.f8069h
            v7.e0 r9 = (v7.e0) r9
            v7.b r9 = r9.a0()
            if (r9 == 0) goto Lff
            r9 = r4
            goto L100
        Lff:
            r9 = r2
        L100:
            if (r9 == 0) goto L103
            goto L13c
        L103:
            java.lang.Object r9 = r8.f8069h
            v7.e0 r9 = (v7.e0) r9
            int r9 = r9.O()
            r10 = r1 & r9
            if (r10 == r9) goto L110
            goto L13c
        L110:
            if (r1 != r9) goto L118
            m.a[] r0 = new m.a[]{r8}
            goto L18e
        L118:
            r10 = r2
        L119:
            r11 = -1
            if (r10 >= r0) goto L130
            r12 = r6[r10]
            if (r12 != 0) goto L121
            goto L138
        L121:
            java.lang.Object r12 = r12.f8069h
            v7.e0 r12 = (v7.e0) r12
            int r12 = r12.O()
            if (r12 != 0) goto L12c
            goto L138
        L12c:
            r13 = r12 & r9
            if (r13 != r9) goto L132
        L130:
            r10 = r11
            goto L138
        L132:
            if (r13 != r12) goto L135
            goto L138
        L135:
            int r10 = r10 + 1
            goto L119
        L138:
            if (r10 < 0) goto L13c
            r6[r10] = r8
        L13c:
            int r7 = r7 + 1
            goto Lef
        L13f:
            r1 = r2
            r5 = r1
        L141:
            if (r1 >= r0) goto L14c
            r7 = r6[r1]
            if (r7 == 0) goto L149
            int r5 = r5 + 1
        L149:
            int r1 = r1 + 1
            goto L141
        L14c:
            if (r5 != 0) goto L150
        L14e:
            r0 = r3
            goto L18e
        L150:
            m.a[] r1 = new m.a[r5]
            r5 = r2
            r7 = r5
        L154:
            if (r5 >= r0) goto L161
            r8 = r6[r5]
            if (r8 == 0) goto L15e
            r1[r7] = r8
            int r7 = r7 + 1
        L15e:
            int r5 = r5 + 1
            goto L154
        L161:
            r0 = r1
            goto L18e
        L163:
            int r0 = r5.length
            r6 = r2
        L165:
            if (r6 >= r0) goto L187
            r7 = r5[r6]
            java.lang.Object r8 = r7.f8069h
            v7.e0 r8 = (v7.e0) r8
            v7.b r8 = r8.a0()
            if (r8 == 0) goto L175
            r8 = r4
            goto L176
        L175:
            r8 = r2
        L176:
            if (r8 == 0) goto L179
            goto L184
        L179:
            java.lang.Object r8 = r7.f8069h
            v7.e0 r8 = (v7.e0) r8
            int r8 = r8.O()
            if (r1 != r8) goto L184
            goto L188
        L184:
            int r6 = r6 + 1
            goto L165
        L187:
            r7 = r3
        L188:
            if (r7 == 0) goto L14e
            m.a[] r0 = new m.a[]{r7}
        L18e:
            if (r0 != 0) goto L191
            goto L1e3
        L191:
            int r1 = r0.length
            if (r1 != 0) goto L195
            goto L1e3
        L195:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r2
        L19b:
            if (r2 >= r1) goto L1dc
            r7 = r0[r2]
            if (r7 != 0) goto L1a2
            goto L1d9
        L1a2:
            if (r6 == 0) goto L1a9
            java.lang.String r6 = "|"
            r5.append(r6)
        L1a9:
            java.lang.Object r6 = r7.f8069h
            v7.e0 r6 = (v7.e0) r6
            v7.b r7 = r6.a0()
            if (r7 == 0) goto L1b5
        L1b3:
            r6 = r3
            goto L1d2
        L1b5:
            int r7 = r6.Z()
            l7.f r6 = r6.i()
            if (r6 != 0) goto L1c0
            goto L1c6
        L1c0:
            l7.l r8 = r6.Y()
            if (r8 != 0) goto L1c8
        L1c6:
            r6 = r3
            goto L1cc
        L1c8:
            t7.b r6 = r8.X(r6, r7)
        L1cc:
            if (r6 == 0) goto L1b3
            java.lang.String r6 = r6.b()
        L1d2:
            if (r6 != 0) goto L1d5
            goto L1e3
        L1d5:
            r5.append(r6)
            r6 = r4
        L1d9:
            int r2 = r2 + 1
            goto L19b
        L1dc:
            if (r6 == 0) goto L1e3
            java.lang.String r0 = r5.toString()
            goto L1e4
        L1e3:
            r0 = r3
        L1e4:
            if (r0 == 0) goto L1eb
            return r0
        L1e7:
            int r3 = r3 + 1
            goto La
        L1eb:
            java.lang.String r0 = super.N()
            return r0
    }

    public java.lang.String Y() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract int Z();
}
