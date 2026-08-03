package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f347h;

    public /* synthetic */ c(fg.a r1, int r2) {
            r0 = this;
            r0.f346g = r2
            r0.f347h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f346g
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L47;
                case 2: goto L29;
                case 3: goto L23;
                case 4: goto L1d;
                case 5: goto L17;
                case 6: goto L11;
                case 7: goto Lb;
                default: goto L5;
            }
        L5:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
        Lb:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
        L11:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
        L17:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
        L1d:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
        L23:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
        L29:
            fg.a r0 = r3.f347h
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L37:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:FloatingShortcut] 主线程悬浮层操作失败: "
            eh.a.x(r2, r1, r0)
        L46:
            return
        L47:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
        L4d:
            fg.a r0 = r3.f347h
            r0.invoke()
            return
    }
}
