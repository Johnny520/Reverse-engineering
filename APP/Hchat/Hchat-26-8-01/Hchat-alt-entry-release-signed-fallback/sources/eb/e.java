package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements k8.h {
    @Override // k8.h
    public final void a(b.e r18) {
            r17 = this;
            r0 = r18
            java.lang.Object r0 = r0.f333i
            h.Hchat.hooks.api.model.WeChatMessage r0 = (h.Hchat.hooks.api.model.WeChatMessage) r0
            if (r0 == 0) goto L219
            h.Hchat.hooks.items.script.ScriptMessageBean r1 = new h.Hchat.hooks.items.script.ScriptMessageBean
            r1.<init>(r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r0 = eb.f.f2543d
            int r4 = r0.size()
            r5 = 128(0x80, float:1.8E-43)
            r6 = 4
            r7 = 10
            if (r4 >= r5) goto L1f
            goto L30
        L1f:
            java.util.Set r4 = r0.entrySet()
            ca.c r5 = new ca.c
            r5.<init>(r2, r6)
            be.i r8 = new be.i
            r8.<init>(r5, r7)
            r4.removeIf(r8)
        L30:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
            java.lang.String r5 = r1.getTalker()
            java.lang.String r6 = ""
            if (r5 != 0) goto L3e
            r5 = r6
        L3e:
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r1.getSender()
            if (r8 != 0) goto L4d
            r8 = r6
        L4d:
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            int r9 = r8.length()
            if (r9 <= 0) goto L62
            boolean r9 = r8.equals(r5)
            if (r9 != 0) goto L62
            goto L63
        L62:
            r8 = r6
        L63:
            java.lang.String r9 = r1.getMsgType()
            if (r9 != 0) goto L6a
            r9 = r6
        L6a:
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = r1.getContent()
            if (r10 != 0) goto L79
            goto L7a
        L79:
            r6 = r10
        L7a:
            java.lang.String r10 = "\r\n"
            java.lang.String r11 = "\n"
            r12 = 0
            java.lang.String r6 = og.t.a0(r6, r10, r11, r12)
            r10 = 13
            java.lang.String r6 = r6.replace(r10, r7)
            r6.getClass()
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r10 = "@chatroom"
            r11 = 1
            boolean r13 = og.t.W(r5, r10, r11)
            java.lang.String r14 = ":"
            if (r13 == 0) goto L11d
            boolean r13 = og.m.t0(r6)
            if (r13 == 0) goto La7
            goto L11d
        La7:
            boolean r13 = og.m.t0(r8)
            if (r13 != 0) goto Lca
            java.lang.String r13 = ":\n"
            java.lang.String r13 = r8.concat(r13)
            boolean r15 = og.t.d0(r6, r13, r12)
            if (r15 == 0) goto Lca
            int r7 = r13.length()
            java.lang.String r6 = r6.substring(r7)
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            goto L11d
        Lca:
            r13 = 6
            int r7 = og.m.q0(r6, r7, r12, r13)
            if (r7 > 0) goto Ld2
            goto L11d
        Ld2:
            java.lang.String r13 = r6.substring(r12, r7)
            java.lang.CharSequence r13 = og.m.R0(r13)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = og.m.B0(r13, r14)
            boolean r15 = og.m.t0(r13)
            if (r15 != 0) goto L11d
            int r15 = r13.length()
            r18 = r11
            r11 = 80
            if (r15 <= r11) goto Lf3
            goto L11d
        Lf3:
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r11 = j8.b.l(r11, r13, r11)
            java.lang.String r13 = "@openim"
            boolean r13 = og.t.W(r11, r13, r12)
            if (r13 != 0) goto L10f
            boolean r10 = og.t.W(r11, r10, r12)
            if (r10 != 0) goto L10f
            og.k r10 = eb.f.f2541b
            boolean r10 = r10.d(r11)
            if (r10 == 0) goto L11d
        L10f:
            int r7 = r7 + 1
            java.lang.String r6 = r6.substring(r7)
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
        L11d:
            long r10 = r1.getMsgId()
            r15 = 0
            int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            java.lang.String r13 = "msg:"
            if (r7 <= 0) goto L13e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r13)
            r7.append(r5)
            r7.append(r14)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r4.add(r7)
        L13e:
            long r10 = r1.getMsgSvrId()
            int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r7 <= 0) goto L15d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r15 = "svr:"
            r7.<init>(r15)
            r7.append(r5)
            r7.append(r14)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r4.add(r7)
        L15d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "raw:"
            r7.<init>(r10)
            r7.append(r5)
            r10 = 124(0x7c, float:1.74E-43)
            r7.append(r10)
            r7.append(r8)
            r7.append(r10)
            r7.append(r9)
            r7.append(r10)
            boolean r11 = r1.isSend()
            r7.append(r11)
            r7.append(r10)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r4.add(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "body:"
            r7.<init>(r10)
            r7.append(r5)
            java.lang.String r10 = "|"
            j8.b.t(r7, r10, r8, r10, r9)
            r7.append(r10)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r4.add(r7)
            boolean r7 = r1.isSend()
            if (r7 == 0) goto L1be
            java.lang.String r7 = "chat:"
            java.lang.StringBuilder r5 = bc.e.p(r7, r5, r10, r9, r10)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.add(r5)
        L1be:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L1c5
            goto L1f6
        L1c5:
            java.util.Iterator r5 = r4.iterator()
        L1c9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1f6
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.get(r6)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L1c9
            long r7 = r7.longValue()
            long r7 = r2 - r7
            eb.f r9 = eb.f.f2540a
            boolean r6 = og.t.d0(r6, r13, r12)
            if (r6 == 0) goto L1ef
            r9 = 60000(0xea60, double:2.9644E-319)
            goto L1f1
        L1ef:
            r9 = 1000(0x3e8, double:4.94E-321)
        L1f1:
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 >= 0) goto L1c9
            goto L219
        L1f6:
            java.util.Iterator r4 = r4.iterator()
        L1fa:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L20e
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r0.put(r5, r6)
            goto L1fa
        L20e:
            java.util.concurrent.ExecutorService r0 = eb.f.f2544e
            a1.a r2 = new a1.a
            r3 = 7
            r2.<init>(r1, r3)
            r0.execute(r2)
        L219:
            return
    }
}
