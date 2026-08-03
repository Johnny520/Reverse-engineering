package lb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f7961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f7962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f7963c;

    public e(h.Hchat.hooks.api.model.WeChatMessage r1, h.Hchat.hooks.api.model.WeChatMessage r2, h.Hchat.hooks.api.model.WeChatMessage r3) {
            r0 = this;
            r0.<init>()
            r0.f7961a = r1
            r0.f7962b = r2
            r0.f7963c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof lb.e
            if (r0 != 0) goto L8
            goto L2a
        L8:
            lb.e r3 = (lb.e) r3
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7961a
            h.Hchat.hooks.api.model.WeChatMessage r1 = r3.f7961a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7962b
            h.Hchat.hooks.api.model.WeChatMessage r1 = r3.f7962b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7963c
            h.Hchat.hooks.api.model.WeChatMessage r3 = r3.f7963c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.f7961a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            h.Hchat.hooks.api.model.WeChatMessage r2 = r3.f7962b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            h.Hchat.hooks.api.model.WeChatMessage r2 = r3.f7963c
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r2.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RepeatMessageSelection(message="
            r0.<init>(r1)
            h.Hchat.hooks.api.model.WeChatMessage r1 = r2.f7961a
            r0.append(r1)
            java.lang.String r1 = ", storedMessage="
            r0.append(r1)
            h.Hchat.hooks.api.model.WeChatMessage r1 = r2.f7962b
            r0.append(r1)
            java.lang.String r1 = ", nativeMessage="
            r0.append(r1)
            h.Hchat.hooks.api.model.WeChatMessage r1 = r2.f7963c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
