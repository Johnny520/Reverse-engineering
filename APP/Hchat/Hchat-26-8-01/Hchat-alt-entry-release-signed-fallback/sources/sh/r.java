package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sh.r f12796a = null;

    static {
            sh.r r0 = new sh.r
            r0.<init>()
            sh.r.f12796a = r0
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r38, java.util.List r39, long r40) {
            r37 = this;
            r0 = r38
            r1 = 8
            float r1 = (float) r1
            int r1 = r0.G0(r1)
            java.util.Iterator r2 = r39.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            r5 = r3
            v1.m0 r5 = (v1.m0) r5
            java.lang.Object r5 = v1.w.i(r5)
            java.lang.String r6 = "start"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto Ld
            goto L28
        L27:
            r3 = 0
        L28:
            v1.m0 r3 = (v1.m0) r3
            java.util.Iterator r2 = r39.iterator()
        L2e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L2c6
            java.lang.Object r5 = r2.next()
            v1.m0 r5 = (v1.m0) r5
            java.lang.Object r6 = v1.w.i(r5)
            java.lang.String r7 = "center"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L2e
            java.util.Iterator r2 = r39.iterator()
        L4a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L64
            java.lang.Object r6 = r2.next()
            r7 = r6
            v1.m0 r7 = (v1.m0) r7
            java.lang.Object r7 = v1.w.i(r7)
            java.lang.String r8 = "end"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L4a
            goto L65
        L64:
            r6 = 0
        L65:
            v1.m0 r6 = (v1.m0) r6
            int r16 = u2.a.h(r40)
            int r2 = u2.a.g(r40)
            if (r3 == 0) goto L73
            r9 = 1
            goto L74
        L73:
            r9 = 0
        L74:
            if (r6 == 0) goto L78
            r10 = 1
            goto L79
        L78:
            r10 = 0
        L79:
            if (r9 == 0) goto L7d
            r14 = r1
            goto L7e
        L7d:
            r14 = 0
        L7e:
            if (r10 == 0) goto L81
            goto L82
        L81:
            r1 = 0
        L82:
            int r11 = r16 - r14
            int r11 = r11 - r1
            if (r11 >= 0) goto L88
            r11 = 0
        L88:
            if (r3 == 0) goto L8f
            int r1 = r3.M(r2)
            goto L90
        L8f:
            r1 = 0
        L90:
            int r12 = r5.M(r2)
            if (r6 == 0) goto L9b
            int r13 = r6.M(r2)
            goto L9c
        L9b:
            r13 = 0
        L9c:
            int r15 = r1 + r12
            int r15 = r15 + r13
            if (r15 > r11) goto Lb1
            int r11 = r11 - r1
            int r11 = r11 - r13
            if (r11 >= 0) goto La6
            r11 = 0
        La6:
            r7 = r1
            r22 = r5
            r24 = r6
        Lab:
            r28 = r11
        Lad:
            r32 = r13
            goto L23c
        Lb1:
            if (r3 == 0) goto Lb8
            int r17 = r3.G(r2)
            goto Lba
        Lb8:
            r17 = 0
        Lba:
            int r4 = r5.G(r2)
            if (r6 == 0) goto Lc7
            int r18 = r6.G(r2)
            r8 = r18
            goto Lc8
        Lc7:
            r8 = 0
        Lc8:
            if (r9 == 0) goto Lce
            r7 = 2
        Lcb:
            r20 = r9
            goto Ld0
        Lce:
            r7 = 0
            goto Lcb
        Ld0:
            if (r10 == 0) goto Ld4
            r9 = 3
            goto Ld5
        Ld4:
            r9 = 0
        Ld5:
            int r22 = r7 + 5
            r23 = r10
            int r10 = r22 + r9
            if (r10 <= 0) goto L1c6
            r22 = r5
            r24 = r6
            long r5 = (long) r11
            r25 = r5
            long r5 = (long) r7
            long r5 = r5 * r25
            r27 = r5
            long r5 = (long) r10
            r29 = r5
            long r5 = r27 / r29
            int r5 = (int) r5
            r6 = 5
            long r6 = (long) r6
            long r6 = r6 * r25
            long r6 = r6 / r29
            int r6 = (int) r6
            long r9 = (long) r9
            long r9 = r9 * r25
            long r9 = r9 / r29
            int r7 = (int) r9
            if (r20 == 0) goto L102
            if (r1 <= r5) goto L102
            r9 = 1
            goto L103
        L102:
            r9 = 0
        L103:
            if (r12 <= r6) goto L107
            r10 = 1
            goto L108
        L107:
            r10 = 0
        L108:
            if (r23 == 0) goto L10f
            if (r13 <= r7) goto L10f
            r20 = 1
            goto L111
        L10f:
            r20 = 0
        L111:
            int r23 = r9 + r10
            r25 = r5
            int r5 = r23 + r20
            r23 = r6
            r6 = 1
            if (r5 == r6) goto L1a2
            r6 = 2
            if (r5 == r6) goto L13b
            r6 = 3
            if (r5 == r6) goto L129
            if (r15 >= r11) goto L1cd
            int r5 = r11 - r15
            int r12 = r12 + r5
            goto L1cd
        L129:
            int r5 = r25 + r23
            int r5 = r5 + r7
            if (r5 >= r11) goto L137
            int r1 = r11 - r5
            int r12 = r1 + r23
            r13 = r7
        L133:
            r1 = r25
            goto L1cd
        L137:
            r13 = r7
            r12 = r23
            goto L133
        L13b:
            if (r9 != 0) goto L141
            int r5 = r11 - r1
            r6 = r1
            goto L143
        L141:
            r5 = r11
            r6 = 0
        L143:
            if (r10 != 0) goto L148
            int r5 = r5 - r12
            r7 = r12
            goto L149
        L148:
            r7 = 0
        L149:
            if (r20 != 0) goto L14e
            int r5 = r5 - r13
            r15 = r13
            goto L14f
        L14e:
            r15 = 0
        L14f:
            if (r9 == 0) goto L154
            r18 = r1
            goto L156
        L154:
            r18 = 0
        L156:
            if (r10 == 0) goto L15b
            r19 = r12
            goto L15d
        L15b:
            r19 = 0
        L15d:
            int r18 = r18 + r19
            if (r20 == 0) goto L166
            r19 = r13
        L163:
            r21 = r6
            goto L169
        L166:
            r19 = 0
            goto L163
        L169:
            int r6 = r18 + r19
            if (r6 <= 0) goto L19d
            r18 = r10
            if (r9 == 0) goto L17e
            long r9 = (long) r5
            r25 = r9
            long r9 = (long) r1
            long r9 = r9 * r25
            r25 = r9
            long r9 = (long) r6
            long r9 = r25 / r9
            int r1 = (int) r9
            goto L180
        L17e:
            r1 = r21
        L180:
            if (r18 == 0) goto L18e
            long r9 = (long) r5
            r18 = r9
            long r9 = (long) r12
            long r9 = r9 * r18
            r18 = r9
            long r9 = (long) r6
            long r9 = r18 / r9
            int r7 = (int) r9
        L18e:
            r12 = r7
            if (r20 == 0) goto L19b
            long r9 = (long) r5
            r18 = r9
            long r9 = (long) r13
            long r9 = r9 * r18
            long r5 = (long) r6
            long r9 = r9 / r5
            int r13 = (int) r9
            goto L1cd
        L19b:
            r13 = r15
            goto L1cd
        L19d:
            r12 = r7
            r13 = r15
            r1 = r21
            goto L1cd
        L1a2:
            r18 = r10
            if (r9 != 0) goto L1a9
            int r5 = r11 - r1
            goto L1ab
        L1a9:
            r5 = r11
            r1 = 0
        L1ab:
            if (r18 != 0) goto L1af
            int r5 = r5 - r12
            goto L1b0
        L1af:
            r12 = 0
        L1b0:
            if (r20 != 0) goto L1b9
            int r5 = r5 - r13
            r36 = r13
            r13 = r5
            r5 = r36
            goto L1bb
        L1b9:
            r13 = r5
            r5 = 0
        L1bb:
            if (r9 == 0) goto L1be
            r1 = r13
        L1be:
            if (r18 == 0) goto L1c1
            r12 = r13
        L1c1:
            if (r20 == 0) goto L1c4
            goto L1cd
        L1c4:
            r13 = r5
            goto L1cd
        L1c6:
            r22 = r5
            r24 = r6
            r12 = r11
            r1 = 0
            r13 = 0
        L1cd:
            int r5 = r12 + 1
            if (r5 > r4) goto L202
            if (r4 > r11) goto L202
            int r5 = r4 - r12
            int r6 = r1 - r17
            if (r6 >= 0) goto L1da
            r6 = 0
        L1da:
            int r7 = r13 - r8
            if (r7 >= 0) goto L1df
            r7 = 0
        L1df:
            int r9 = r6 + r7
            if (r9 <= 0) goto L202
            r10 = r12
            r15 = r13
            long r12 = (long) r5
            r18 = r4
            r19 = r5
            long r4 = (long) r6
            long r12 = r12 * r4
            long r4 = (long) r9
            long r12 = r12 / r4
            int r4 = (int) r12
            if (r4 <= r6) goto L1f2
            goto L1f3
        L1f2:
            r6 = r4
        L1f3:
            int r5 = r19 - r6
            if (r5 >= 0) goto L1f8
            r5 = 0
        L1f8:
            if (r5 <= r7) goto L1fb
            goto L1fc
        L1fb:
            r7 = r5
        L1fc:
            int r1 = r1 - r6
            int r13 = r15 - r7
            int r6 = r6 + r7
            int r6 = r6 + r10
            goto L208
        L202:
            r18 = r4
            r10 = r12
            r15 = r13
            r6 = r10
            r13 = r15
        L208:
            int r4 = r13 + 1
            if (r4 > r8) goto L237
            if (r8 > r11) goto L237
            int r8 = r8 - r13
            int r4 = r1 - r17
            if (r4 >= 0) goto L214
            r4 = 0
        L214:
            int r5 = r6 - r18
            if (r5 >= 0) goto L219
            r5 = 0
        L219:
            int r7 = r4 + r5
            if (r7 <= 0) goto L237
            long r9 = (long) r8
            long r11 = (long) r4
            long r9 = r9 * r11
            long r11 = (long) r7
            long r9 = r9 / r11
            int r7 = (int) r9
            if (r7 <= r4) goto L226
            goto L227
        L226:
            r4 = r7
        L227:
            int r8 = r8 - r4
            if (r8 >= 0) goto L22b
            r8 = 0
        L22b:
            if (r8 <= r5) goto L22e
            goto L22f
        L22e:
            r5 = r8
        L22f:
            int r1 = r1 - r4
            int r11 = r6 - r5
            int r4 = r4 + r5
            int r13 = r13 + r4
            r7 = r1
            goto Lab
        L237:
            r7 = r1
            r28 = r6
            goto Lad
        L23c:
            if (r3 == 0) goto L24f
            r9 = 0
            r10 = 12
            r6 = 0
            r8 = 0
            r4 = r40
            long r6 = u2.a.a(r4, r6, r7, r8, r9, r10)
            v1.b1 r1 = r3.Q(r6)
            r12 = r1
            goto L250
        L24f:
            r12 = 0
        L250:
            if (r12 == 0) goto L256
            int r1 = r12.f13900g
            r13 = r1
            goto L257
        L256:
            r13 = 0
        L257:
            if (r12 == 0) goto L25d
            int r1 = r12.f13901h
            r9 = r1
            goto L25e
        L25d:
            r9 = 0
        L25e:
            r30 = 0
            r31 = 12
            r27 = 0
            r29 = 0
            r25 = r40
            long r3 = u2.a.a(r25, r27, r28, r29, r30, r31)
            r5 = r22
            v1.b1 r10 = r5.Q(r3)
            if (r24 == 0) goto L28a
            r34 = 0
            r35 = 12
            r31 = 0
            r33 = 0
            r29 = r40
            long r3 = u2.a.a(r29, r31, r32, r33, r34, r35)
            r6 = r24
            v1.b1 r1 = r6.Q(r3)
            r15 = r1
            goto L28b
        L28a:
            r15 = 0
        L28b:
            if (r15 == 0) goto L291
            int r8 = r15.f13901h
            r11 = r8
            goto L292
        L291:
            r11 = 0
        L292:
            int r1 = r10.f13901h
            int r1 = java.lang.Math.max(r1, r11)
            int r8 = java.lang.Math.max(r9, r1)
            int r1 = u2.a.i(r40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L2ab
            r4 = r3
            goto L2ac
        L2ab:
            r4 = 0
        L2ac:
            if (r4 == 0) goto L2b3
            int r2 = r4.intValue()
            goto L2b4
        L2b3:
            r2 = r8
        L2b4:
            int r1 = r9.e0.r(r8, r1, r2)
            sh.q r7 = new sh.q
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = r16
            tf.u r3 = tf.u.f13168g
            v1.o0 r0 = r0.z(r2, r1, r3, r7)
            return r0
        L2c6:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            j8.o.l(r0)
            r0 = 0
            return r0
    }
}
