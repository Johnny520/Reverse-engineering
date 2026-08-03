package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f18456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v8.a f18457i;

    public /* synthetic */ pg(fg.l r1, v8.a r2, int r3) {
            r0 = this;
            r0.f18455g = r3
            r0.f18456h = r1
            r0.f18457i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            int r1 = r0.f18455g
            switch(r1) {
                case 0: goto L13c;
                case 1: goto L118;
                case 2: goto Lf3;
                case 3: goto Ld0;
                case 4: goto Lab;
                case 5: goto L87;
                case 6: goto L64;
                case 7: goto L40;
                default: goto L7;
            }
        L7:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Long r1 = og.t.g0(r1)
            r2 = 0
            if (r1 == 0) goto L20
            long r4 = r1.longValue()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L1f
            goto L20
        L1f:
            r2 = r4
        L20:
            r13 = r2
            r18 = 0
            r19 = 15871(0x3dff, float:2.224E-41)
            v8.a r4 = r0.f18457i
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            v8.a r1 = v8.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
        L3d:
            sf.n r1 = sf.n.f12433a
            return r1
        L40:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r10 = r1.booleanValue()
            r16 = 0
            r17 = 16127(0x3eff, float:2.2599E-41)
            v8.a r2 = r0.f18457i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
        L64:
            r3 = r21
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            r16 = 0
            r17 = 16381(0x3ffd, float:2.2955E-41)
            v8.a r2 = r0.f18457i
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
        L87:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r5 = r1.booleanValue()
            r16 = 0
            r17 = 16375(0x3ff7, float:2.2946E-41)
            v8.a r2 = r0.f18457i
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
        Lab:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r4 = r1.booleanValue()
            r16 = 0
            r17 = 16379(0x3ffb, float:2.2952E-41)
            v8.a r2 = r0.f18457i
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
        Ld0:
            r16 = r21
            java.lang.String r16 = (java.lang.String) r16
            r16.getClass()
            r15 = 0
            r17 = 8191(0x1fff, float:1.1478E-41)
            v8.a r2 = r0.f18457i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
        Lf3:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r15 = r1.booleanValue()
            r16 = 0
            r17 = 12287(0x2fff, float:1.7218E-41)
            v8.a r2 = r0.f18457i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
        L118:
            r14 = r21
            java.lang.String r14 = (java.lang.String) r14
            r14.getClass()
            r16 = 0
            r17 = 14335(0x37ff, float:2.0088E-41)
            v8.a r2 = r0.f18457i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
        L13c:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r13 = r1.booleanValue()
            r16 = 0
            r17 = 15359(0x3bff, float:2.1523E-41)
            v8.a r2 = r0.f18457i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            v8.a r1 = v8.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            fg.l r2 = r0.f18456h
            r2.invoke(r1)
            goto L3d
    }
}
