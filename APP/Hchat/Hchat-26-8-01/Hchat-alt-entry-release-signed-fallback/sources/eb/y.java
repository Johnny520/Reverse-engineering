package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2691g;

    public y(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.f2685a = r1
            r0.f2686b = r2
            r0.f2687c = r3
            r0.f2688d = r4
            r0.f2689e = r5
            r0.f2690f = r6
            r0.f2691g = r7
            return
    }

    public final eb.y a(eb.y r11) {
            r10 = this;
            r11.getClass()
            eb.y r0 = new eb.y
            boolean r1 = r10.f2685a
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L12
            boolean r1 = r11.f2685a
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            boolean r4 = r10.f2686b
            if (r4 != 0) goto L1f
            boolean r4 = r11.f2686b
            if (r4 == 0) goto L1c
            goto L1f
        L1c:
            r4 = r2
            r2 = r3
            goto L20
        L1f:
            r4 = r2
        L20:
            boolean r5 = r10.f2687c
            if (r5 != 0) goto L2b
            boolean r5 = r11.f2687c
            if (r5 == 0) goto L29
            goto L2b
        L29:
            r5 = r3
            goto L2d
        L2b:
            r5 = r3
            r3 = r4
        L2d:
            boolean r6 = r10.f2688d
            if (r6 != 0) goto L39
            boolean r6 = r11.f2688d
            if (r6 == 0) goto L36
            goto L39
        L36:
            r6 = r4
            r4 = r5
            goto L3a
        L39:
            r6 = r4
        L3a:
            boolean r7 = r10.f2689e
            if (r7 != 0) goto L45
            boolean r7 = r11.f2689e
            if (r7 == 0) goto L43
            goto L45
        L43:
            r7 = r5
            goto L47
        L45:
            r7 = r5
            r5 = r6
        L47:
            boolean r8 = r10.f2690f
            if (r8 != 0) goto L53
            boolean r8 = r11.f2690f
            if (r8 == 0) goto L50
            goto L53
        L50:
            r8 = r6
            r6 = r7
            goto L54
        L53:
            r8 = r6
        L54:
            boolean r9 = r10.f2691g
            if (r9 != 0) goto L5c
            boolean r11 = r11.f2691g
            if (r11 == 0) goto L5d
        L5c:
            r7 = r8
        L5d:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof eb.y
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            eb.y r5 = (eb.y) r5
            boolean r1 = r4.f2685a
            boolean r3 = r5.f2685a
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.f2686b
            boolean r3 = r5.f2686b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r4.f2687c
            boolean r3 = r5.f2687c
            if (r1 == r3) goto L21
            return r2
        L21:
            boolean r1 = r4.f2688d
            boolean r3 = r5.f2688d
            if (r1 == r3) goto L28
            return r2
        L28:
            boolean r1 = r4.f2689e
            boolean r3 = r5.f2689e
            if (r1 == r3) goto L2f
            return r2
        L2f:
            boolean r1 = r4.f2690f
            boolean r3 = r5.f2690f
            if (r1 == r3) goto L36
            return r2
        L36:
            boolean r1 = r4.f2691g
            boolean r5 = r5.f2691g
            if (r1 == r5) goto L3d
            return r2
        L3d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f2685a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f2686b
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2687c
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2688d
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2689e
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f2690f
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f2691g
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CallbackFlags(hasSendButton="
            r0.<init>(r1)
            boolean r1 = r5.f2685a
            r0.append(r1)
            java.lang.String r1 = ", hasHandleMsg="
            r0.append(r1)
            boolean r1 = r5.f2686b
            r0.append(r1)
            java.lang.String r1 = ", hasOpenSettings="
            r0.append(r1)
            java.lang.String r1 = ", hasMemberChange="
            java.lang.String r2 = ", hasNewFriend="
            boolean r3 = r5.f2687c
            boolean r4 = r5.f2688d
            p.a.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", hasProtobufPacket="
            java.lang.String r2 = ", hasImageDownload="
            boolean r3 = r5.f2689e
            boolean r4 = r5.f2690f
            p.a.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r2 = r5.f2691g
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
