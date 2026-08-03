package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements k8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2500a;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f2500a = r1
            r0.<init>()
            return
    }

    @Override // k8.n
    public final void a(k8.o r8) {
            r7 = this;
            int r0 = r7.f2500a
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            eb.k r0 = eb.k.f2567a
            h.Hchat.hooks.items.script.ScriptMessageBean r0 = new h.Hchat.hooks.items.script.ScriptMessageBean
            r0.<init>(r8)
            eb.k.i(r0)
            return
        L10:
            eb.d r0 = eb.d.f2520a
            h.Hchat.hooks.items.script.ScriptMessageBean r0 = new h.Hchat.hooks.items.script.ScriptMessageBean
            r0.<init>(r8)
            boolean r8 = r0.isSystem()
            if (r8 == 0) goto L135
            boolean r8 = r0.isGroupChat()
            if (r8 != 0) goto L25
            goto L135
        L25:
            java.lang.String r8 = r0.getTalker()
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            int r1 = r8.length()
            if (r1 != 0) goto L39
            goto L135
        L39:
            java.lang.String r1 = r0.getXml()
            java.lang.String r0 = r0.getContent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L4f
            r2.append(r0)
        L4f:
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L5d
            r3 = 10
            r2.append(r3)
            r2.append(r1)
        L5d:
            java.lang.String r2 = r2.toString()
            boolean r3 = og.m.t0(r2)
            r4 = 0
            if (r3 == 0) goto L6a
            goto Lf3
        L6a:
            java.util.List r3 = eb.d.f2525f
            if (r3 == 0) goto L76
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L76
            goto Lf3
        L76:
            java.util.Iterator r3 = r3.iterator()
        L7a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lf3
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 1
            boolean r5 = og.m.h0(r2, r5, r6)
            if (r5 == 0) goto L7a
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L94
            goto Lb6
        L94:
            java.util.List r3 = eb.d.f2526g
            if (r3 == 0) goto L9f
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L9f
            goto Lb6
        L9f:
            java.util.Iterator r3 = r3.iterator()
        La3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb6
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = og.m.h0(r2, r5, r6)
            if (r5 == 0) goto La3
            goto Lf3
        Lb6:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            eb.d.c(r1, r2)
            eb.d.c(r0, r2)
            java.util.Set r0 = r2.entrySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r0, r2)
            e9.h r0 = new e9.h
            r0.<init>(r2)
            ng.t r0 = ng.m.W(r1, r0)
            ca.s r1 = new ca.s
            r1.<init>(r8, r6)
            ng.i r2 = new ng.i
            r2.<init>(r0, r6, r1)
            java.util.List r0 = ng.m.b0(r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lee
            goto Lf3
        Lee:
            eb.c r4 = new eb.c
            r4.<init>(r8, r0)
        Lf3:
            if (r4 == 0) goto L135
            java.util.List r0 = r4.f2505b
            java.util.Iterator r0 = r0.iterator()
        Lfb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L135
            java.lang.Object r1 = r0.next()
            sf.e r1 = (sf.e) r1
            java.lang.Object r2 = r1.f12418g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.f12419h
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L116
            goto Lfb
        L116:
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L12b
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L12b
            java.util.concurrent.ConcurrentHashMap r3 = eb.d.f2523d
            java.lang.String r4 = eb.d.a(r8, r2)
            r3.put(r4, r1)
        L12b:
            java.lang.String r1 = eb.d.f(r8, r2)
            java.lang.String r3 = "join"
            eb.d.e(r3, r8, r2, r1)
            goto Lfb
        L135:
            return
    }
}
