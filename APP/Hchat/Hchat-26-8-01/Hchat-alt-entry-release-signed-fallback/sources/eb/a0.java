package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb.c0 f2486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bsh.Interpreter f2487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f2488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f2489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f2490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f2491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f2492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f2493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f2494i;

    public a0(eb.c0 r1, bsh.Interpreter r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.f2486a = r1
            r0.f2487b = r2
            r0.f2488c = r3
            r0.f2489d = r4
            r0.f2490e = r5
            r0.f2491f = r6
            r0.f2492g = r7
            r0.f2493h = r8
            r0.f2494i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L52
        L3:
            boolean r0 = r3 instanceof eb.a0
            if (r0 != 0) goto L8
            goto L50
        L8:
            eb.a0 r3 = (eb.a0) r3
            eb.c0 r0 = r2.f2486a
            eb.c0 r1 = r3.f2486a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L50
        L15:
            bsh.Interpreter r0 = r2.f2487b
            bsh.Interpreter r1 = r3.f2487b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L50
        L20:
            boolean r0 = r2.f2488c
            boolean r1 = r3.f2488c
            if (r0 == r1) goto L27
            goto L50
        L27:
            boolean r0 = r2.f2489d
            boolean r1 = r3.f2489d
            if (r0 == r1) goto L2e
            goto L50
        L2e:
            boolean r0 = r2.f2490e
            boolean r1 = r3.f2490e
            if (r0 == r1) goto L35
            goto L50
        L35:
            boolean r0 = r2.f2491f
            boolean r1 = r3.f2491f
            if (r0 == r1) goto L3c
            goto L50
        L3c:
            boolean r0 = r2.f2492g
            boolean r1 = r3.f2492g
            if (r0 == r1) goto L43
            goto L50
        L43:
            boolean r0 = r2.f2493h
            boolean r1 = r3.f2493h
            if (r0 == r1) goto L4a
            goto L50
        L4a:
            boolean r0 = r2.f2494i
            boolean r3 = r3.f2494i
            if (r0 == r3) goto L52
        L50:
            r3 = 0
            return r3
        L52:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            eb.c0 r0 = r3.f2486a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            bsh.Interpreter r2 = r3.f2487b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f2488c
            int r0 = eh.a.h(r2, r1, r0)
            boolean r2 = r3.f2489d
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2490e
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2491f
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2492g
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2493h
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f2494i
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r11 = this;
            eb.c0 r0 = r11.f2486a
            bsh.Interpreter r1 = r11.f2487b
            boolean r2 = r11.f2488c
            boolean r3 = r11.f2489d
            boolean r4 = r11.f2490e
            boolean r5 = r11.f2491f
            boolean r6 = r11.f2492g
            boolean r7 = r11.f2493h
            boolean r8 = r11.f2494i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "LoadedPlugin(plugin="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r0 = ", interpreter="
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = ", hasSendButtonCallback="
            r9.append(r0)
            java.lang.String r0 = ", hasHandleMsgCallback="
            java.lang.String r1 = ", hasOpenSettingsCallback="
            p.a.x(r9, r2, r0, r3, r1)
            java.lang.String r0 = ", hasMemberChangeCallback="
            java.lang.String r1 = ", hasNewFriendCallback="
            p.a.x(r9, r4, r0, r5, r1)
            java.lang.String r0 = ", hasProtobufPacketCallback="
            java.lang.String r1 = ", hasImageDownloadCallback="
            p.a.x(r9, r6, r0, r7, r1)
            java.lang.String r0 = ")"
            java.lang.String r0 = p.a.m(r0, r9, r8)
            return r0
    }
}
