package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class rt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f18956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f18957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fb.a1 f18958d;

    public rt(long r1, java.lang.String r3, java.util.List r4, fb.a1 r5) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f18955a = r1
            r0.f18956b = r3
            r0.f18957c = r4
            r0.f18958d = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof wb.rt
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.rt r8 = (wb.rt) r8
            long r3 = r7.f18955a
            long r5 = r8.f18955a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.f18956b
            java.lang.String r3 = r8.f18956b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.util.List r1 = r7.f18957c
            java.util.List r3 = r8.f18957c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            fb.a1 r1 = r7.f18958d
            fb.a1 r8 = r8.f18958d
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L36
            return r2
        L36:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f18955a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f18956b
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r3.f18957c
            int r0 = j8.b.e(r2, r0, r1)
            fb.a1 r1 = r3.f18958d
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1f
        L1b:
            int r1 = r1.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScriptPluginAgentPendingMessage(id="
            r0.<init>(r1)
            long r1 = r3.f18955a
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            java.lang.String r1 = r3.f18956b
            r0.append(r1)
            java.lang.String r1 = ", attachments="
            r0.append(r1)
            java.util.List r1 = r3.f18957c
            r0.append(r1)
            java.lang.String r1 = ", quotedMessage="
            r0.append(r1)
            fb.a1 r1 = r3.f18958d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
