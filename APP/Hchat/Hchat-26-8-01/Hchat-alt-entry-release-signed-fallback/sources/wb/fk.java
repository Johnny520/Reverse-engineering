package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16198h;

    public /* synthetic */ fk(i0.a1 r1, int r2) {
            r0 = this;
            r0.f16197g = r2
            r0.f16198h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r17 = this;
            r0 = r17
            int r1 = r0.f16197g
            switch(r1) {
                case 0: goto L1a5;
                case 1: goto L19c;
                case 2: goto L193;
                case 3: goto L18a;
                case 4: goto L181;
                case 5: goto L15f;
                case 6: goto L156;
                case 7: goto L14d;
                case 8: goto L144;
                case 9: goto L13b;
                case 10: goto L132;
                case 11: goto L129;
                case 12: goto L120;
                case 13: goto L117;
                case 14: goto L10e;
                case 15: goto L105;
                case 16: goto Lfc;
                case 17: goto L67;
                case 18: goto L5f;
                case 19: goto L57;
                case 20: goto L4f;
                case 21: goto L47;
                case 22: goto L3f;
                case 23: goto L37;
                case 24: goto L2f;
                case 25: goto L27;
                case 26: goto L1f;
                case 27: goto L18;
                case 28: goto L11;
                default: goto L7;
            }
        L7:
            i0.a1 r1 = r0.f16198h
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
        Le:
            sf.n r1 = sf.n.f12433a
            return r1
        L11:
            i0.a1 r1 = r0.f16198h
            r2 = 0
            r1.setValue(r2)
            goto Le
        L18:
            i0.a1 r1 = r0.f16198h
            r2 = 0
            r1.setValue(r2)
            goto Le
        L1f:
            i0.a1 r1 = r0.f16198h
            wb.fq r2 = wb.fq.f16251a
            r1.setValue(r2)
            goto Le
        L27:
            i0.a1 r1 = r0.f16198h
            wb.g r2 = wb.g.f16287h
            r1.setValue(r2)
            goto Le
        L2f:
            i0.a1 r1 = r0.f16198h
            wb.g r2 = wb.g.f16286g
            r1.setValue(r2)
            goto Le
        L37:
            i0.a1 r1 = r0.f16198h
            wb.g r2 = wb.g.f16288i
            r1.setValue(r2)
            goto Le
        L3f:
            i0.a1 r1 = r0.f16198h
            wb.g r2 = wb.g.f16287h
            r1.setValue(r2)
            goto Le
        L47:
            i0.a1 r1 = r0.f16198h
            wb.g r2 = wb.g.f16288i
            r1.setValue(r2)
            goto Le
        L4f:
            i0.a1 r1 = r0.f16198h
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            goto Le
        L57:
            i0.a1 r1 = r0.f16198h
            wb.uv r2 = wb.uv.f19582a
            r1.setValue(r2)
            goto Le
        L5f:
            i0.a1 r1 = r0.f16198h
            tf.t r2 = tf.t.f13167g
            r1.setValue(r2)
            goto Le
        L67:
            i0.a1 r1 = r0.f16198h
            rb.k r2 = fb.v0.f3834a
            if (r2 == 0) goto L72
            rb.m r2 = r2.l()
            goto L89
        L72:
            rb.m r3 = new rb.m
            tf.t r10 = tf.t.f13167g
            r15 = 0
            r16 = 0
            r4 = 0
            r5 = 0
            java.lang.String r6 = "等待检测"
            java.lang.String r7 = ""
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = r3
        L89:
            java.util.List r2 = r2.f11935g
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L94:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r2.next()
            r5 = r4
            rb.d r5 = (rb.d) r5
            rb.e r5 = r5.f11883c
            rb.e r6 = rb.e.f11886h
            if (r5 != r6) goto L94
            r3.add(r4)
            goto L94
        Lab:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = tf.n.e1(r3)
            r2.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        Lb8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()
            rb.d r4 = (rb.d) r4
            java.lang.String r4 = r4.f11881a
            r2.add(r4)
            goto Lb8
        Lca:
            java.util.Set r2 = tf.m.U1(r2)
            wb.tv r3 = new wb.tv
            wb.wv r4 = wb.wv.f20071i
            wb.v0 r5 = new wb.v0
            wb.u0 r7 = wb.u0.f19344g
            r8 = r2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r12 = 0
            r13 = 62
            java.lang.String r9 = "|"
            r10 = 0
            r11 = 0
            java.lang.String r9 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            wb.jk r10 = new wb.jk
            r2 = 21
            r10.<init>(r2)
            r11 = 1
            r12 = 192(0xc0, float:2.69E-43)
            java.lang.String r6 = "批量删除好友"
            r8 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.<init>(r4, r5)
            r1.setValue(r3)
            goto Le
        Lfc:
            i0.a1 r1 = r0.f16198h
            wb.po r2 = wb.po.f18500a
            r1.setValue(r2)
            goto Le
        L105:
            i0.a1 r1 = r0.f16198h
            wb.cu r2 = wb.cu.f15571b
            r1.setValue(r2)
            goto Le
        L10e:
            i0.a1 r1 = r0.f16198h
            wb.cu r2 = wb.cu.f15571b
            r1.setValue(r2)
            goto Le
        L117:
            i0.a1 r1 = r0.f16198h
            wb.cu r2 = wb.cu.f15572c
            r1.setValue(r2)
            goto Le
        L120:
            i0.a1 r1 = r0.f16198h
            wb.cu r2 = wb.cu.f15571b
            r1.setValue(r2)
            goto Le
        L129:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17591b
            r1.setValue(r2)
            goto Le
        L132:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17591b
            r1.setValue(r2)
            goto Le
        L13b:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17592c
            r1.setValue(r2)
            goto Le
        L144:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17592c
            r1.setValue(r2)
            goto Le
        L14d:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17592c
            r1.setValue(r2)
            goto Le
        L156:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17592c
            r1.setValue(r2)
            goto Le
        L15f:
            i0.a1 r1 = r0.f16198h
            wb.n2 r2 = new wb.n2
            wb.v0 r3 = new wb.v0
            wb.u0 r5 = wb.u0.f19347j
            w0.l r8 = new w0.l
            r4 = 12
            r8.<init>(r4)
            r9 = 1
            r10 = 192(0xc0, float:2.69E-43)
            java.lang.String r4 = "添加通知会话"
            r6 = 1
            java.lang.String r7 = ""
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.<init>(r3)
            r1.setValue(r2)
            goto Le
        L181:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17590a
            r1.setValue(r2)
            goto Le
        L18a:
            i0.a1 r1 = r0.f16198h
            wb.m2 r2 = wb.m2.f17592c
            r1.setValue(r2)
            goto Le
        L193:
            i0.a1 r1 = r0.f16198h
            wb.r3 r2 = wb.r3.f18753g
            r1.setValue(r2)
            goto Le
        L19c:
            i0.a1 r1 = r0.f16198h
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            goto Le
        L1a5:
            i0.a1 r1 = r0.f16198h
            r2 = 0
            r1.setValue(r2)
            goto Le
    }
}
