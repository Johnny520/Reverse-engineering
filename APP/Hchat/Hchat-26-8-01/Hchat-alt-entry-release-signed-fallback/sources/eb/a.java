package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements g8.f {
    @Override // g8.f
    public final void a(b.e r12) {
            r11 = this;
            eb.d r0 = eb.d.f2520a
            boolean r0 = r12.w()
            java.lang.Object r1 = r12.f333i
            h.Hchat.hooks.api.model.WeChatChatroom r1 = (h.Hchat.hooks.api.model.WeChatChatroom) r1
            if (r0 != 0) goto Le
            goto L171
        Le:
            java.lang.String r0 = r12.n()
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            if (r2 != 0) goto L25
            goto L171
        L25:
            tf.t r2 = tf.t.f13167g
            r3 = 0
            if (r1 == 0) goto Ld3
            java.util.List<java.lang.String> r4 = r1.memberIds
            java.lang.String r5 = r1.rawDisplayNames
            int r6 = r4.size()
            boolean r7 = og.m.t0(r5)
            if (r7 == 0) goto L3a
            r8 = r2
            goto L6f
        L3a:
            java.lang.String r7 = "\n"
            java.lang.String r8 = ";"
            java.lang.String r9 = "\u0001"
            java.lang.String r10 = "\u0002"
            java.lang.String[] r7 = new java.lang.String[]{r9, r10, r7, r8}
            java.util.List r7 = a.a.y0(r7)
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.util.List r8 = og.m.G0(r5, r8)
            if (r6 <= 0) goto L6f
            int r9 = r8.size()
            if (r9 != r6) goto L4e
            goto L6f
        L6b:
            java.util.List r8 = a.a.x0(r5)
        L6f:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto Ld3
            int r5 = r8.size()
            int r6 = r4.size()
            if (r5 == r6) goto L80
            goto Ld3
        L80:
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L85:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Ld3
            java.lang.Object r6 = r4.next()
            int r7 = r5 + 1
            if (r5 < 0) goto Lcf
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = tf.m.w1(r5, r8)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto La6
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            goto La7
        La6:
            r5 = r3
        La7:
            if (r5 != 0) goto Lab
            java.lang.String r5 = ""
        Lab:
            java.util.concurrent.ConcurrentHashMap r9 = eb.d.f2523d
            java.lang.String r10 = eb.d.a(r0, r6)
            r9.remove(r10)
            boolean r10 = og.m.t0(r6)
            if (r10 != 0) goto Lcd
            boolean r10 = og.m.t0(r5)
            if (r10 != 0) goto Lcd
            boolean r10 = r5.equals(r6)
            if (r10 != 0) goto Lcd
            java.lang.String r6 = eb.d.a(r0, r6)
            r9.put(r6, r5)
        Lcd:
            r5 = r7
            goto L85
        Lcf:
            a.a.Q0()
            throw r3
        Ld3:
            if (r1 == 0) goto Ldb
            java.util.List<java.lang.String> r1 = r1.memberIds
            if (r1 == 0) goto Ldb
            r2 = r1
            goto Lec
        Ldb:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto Le9
            java.lang.String r12 = r12.n()
            java.util.List r3 = r1.i(r12)
        Le9:
            if (r3 == 0) goto Lec
            r2 = r3
        Lec:
            dg.n r12 = new dg.n
            r1 = 6
            r12.<init>(r2, r1)
            e9.h r1 = new e9.h
            r2 = 7
            r1.<init>(r2)
            ng.t r12 = ng.m.W(r12, r1)
            e9.h r1 = new e9.h
            r2 = 8
            r1.<init>(r2)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r12, r3, r1)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            ng.m.a0(r2, r12)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L118
            goto L171
        L118:
            eb.d.h(r0, r12)
            java.util.concurrent.ConcurrentHashMap r1 = eb.d.f2522c
            java.lang.Object r1 = r1.put(r0, r12)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L171
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r2 = tf.d0.T(r12, r2)
            java.util.Set r12 = tf.d0.T(r1, r12)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L13d
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L13d
            goto L171
        L13d:
            java.util.Iterator r1 = r2.iterator()
        L141:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L157
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "join"
            java.lang.String r4 = eb.d.f(r0, r2)
            eb.d.e(r3, r0, r2, r4)
            goto L141
        L157:
            java.util.Iterator r12 = r12.iterator()
        L15b:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L171
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "left"
            java.lang.String r3 = eb.d.f(r0, r1)
            eb.d.e(r2, r0, r1, r3)
            goto L15b
        L171:
            return
    }
}
