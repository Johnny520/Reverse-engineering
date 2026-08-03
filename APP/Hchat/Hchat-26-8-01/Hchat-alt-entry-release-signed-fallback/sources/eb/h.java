package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements o8.c {
    @Override // o8.c
    public final void a(l8.a r10) {
            r9 = this;
            eb.k r0 = eb.k.f2567a
            java.lang.String r0 = "insert"
            java.lang.String r1 = r10.f7892a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le
            goto L160
        Le:
            java.lang.String r0 = r10.f7893b
            java.lang.String r1 = "fmessage_msginfo"
            boolean r0 = og.t.X(r0, r1)
            if (r0 != 0) goto L1a
            goto L160
        L1a:
            android.content.ContentValues r10 = r10.f7895d
            if (r10 == 0) goto L160
            java.lang.String r1 = "isSend"
            boolean r0 = r10.containsKey(r1)
            r2 = 0
            if (r0 != 0) goto L28
            goto L6a
        L28:
            java.lang.Integer r0 = r10.getAsInteger(r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            goto L3b
        L35:
            r0 = r2
        L36:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L33
            goto L41
        L3b:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L41:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 != 0) goto L48
            goto L64
        L48:
            java.lang.Object r0 = r10.get(r1)
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L60
            r1 = 10
            java.lang.Integer r0 = og.t.e0(r1, r0)
            if (r0 == 0) goto L60
            int r2 = r0.intValue()
        L60:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L64:
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
        L6a:
            if (r2 == 0) goto L6e
            goto L160
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "msgContent"
            java.lang.String r1 = eb.k.f(r10, r1)
            eb.k.b(r0, r1)
            java.lang.String r1 = "fmsgContent"
            java.lang.String r1 = eb.k.f(r10, r1)
            eb.k.b(r0, r1)
            java.lang.String r1 = "content"
            java.lang.String r1 = eb.k.f(r10, r1)
            eb.k.b(r0, r1)
            java.lang.String r1 = "msgSource"
            java.lang.String r1 = eb.k.f(r10, r1)
            eb.k.b(r0, r1)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "talker"
            java.lang.String r4 = eb.k.f(r10, r0)
            java.lang.String r1 = "fromusername"
            java.lang.String r1 = eb.k.f(r10, r1)
            java.lang.String r3 = "fromUserName"
            java.lang.String r3 = eb.k.f(r10, r3)
            java.lang.String r5 = "encryptusername"
            java.lang.String r5 = eb.k.f(r10, r5)
            java.lang.String r6 = "encryptTalker"
            java.lang.String r6 = eb.k.f(r10, r6)
            java.lang.String r0 = eb.k.f(r10, r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r3, r5, r6, r0}
            java.lang.String r6 = eb.k.h(r0)
            java.lang.String r0 = "ticket"
            java.lang.String r0 = eb.k.f(r10, r0)
            java.lang.String r1 = "antispamticket"
            java.lang.String r1 = eb.k.f(r10, r1)
            java.lang.String r3 = "antispam_ticket"
            java.lang.String r3 = eb.k.f(r10, r3)
            java.lang.String r5 = "verifyticket"
            java.lang.String r5 = eb.k.f(r10, r5)
            java.lang.String r7 = "verify_ticket"
            java.lang.String r7 = eb.k.f(r10, r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r3, r5, r7}
            java.lang.String r7 = eb.k.h(r0)
            java.lang.String r0 = "scene"
            java.lang.String r0 = eb.k.f(r10, r0)
            java.lang.String r1 = "scence"
            java.lang.String r1 = eb.k.f(r10, r1)
            java.lang.String r3 = "sceneid"
            java.lang.String r3 = eb.k.f(r10, r3)
            java.lang.String r5 = "scene_id"
            java.lang.String r10 = eb.k.f(r10, r5)
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r3, r10}
            java.lang.String r8 = eb.k.h(r10)
            r3 = 0
            r5 = 1
            eb.i r10 = eb.k.m(r2, r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L160
            long r0 = java.lang.System.currentTimeMillis()
            eb.k.e(r0)
            eb.k.o(r10, r0)
            java.lang.String r2 = eb.k.g(r10)
            java.util.concurrent.ConcurrentHashMap r3 = eb.k.f2568b
            java.lang.Object r4 = r3.get(r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L138
            long r4 = r4.longValue()
            long r4 = r0 - r4
            r6 = 3000(0xbb8, double:1.482E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L138
            goto L160
        L138:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = eb.k.f2570d
            java.util.Iterator r0 = r0.iterator()
        L145:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L155
            java.lang.Object r1 = r0.next()
            fg.l r1 = (fg.l) r1
            r1.invoke(r10)     // Catch: java.lang.Throwable -> L145
            goto L145
        L155:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r1 = r10.f2556a
            java.lang.String r2 = r10.f2558c
            int r10 = r10.f2559d
            r0.dispatchOnNewFriend(r1, r2, r10)
        L160:
            return
    }
}
