package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vu implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f19846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.a f19847i;

    public /* synthetic */ vu(android.app.Activity r2, fg.a r3) {
            r1 = this;
            r0 = 0
            r1.f19845g = r0
            r1.<init>()
            r1.f19846h = r2
            r1.f19847i = r3
            return
    }

    public /* synthetic */ vu(xa.m r1, android.app.Activity r2, fg.a r3) {
            r0 = this;
            r1 = 1
            r0.f19845g = r1
            r0.<init>()
            r0.f19846h = r2
            r0.f19847i = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f19845g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            android.app.Activity r0 = r2.f19846h
            boolean r0 = xa.m.a(r0)
            if (r0 == 0) goto L12
            fg.a r0 = r2.f19847i
            r0.invoke()
        L12:
            return
        L13:
            android.app.Activity r0 = r2.f19846h
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L26
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L26
            fg.a r0 = r2.f19847i
            r0.invoke()
        L26:
            return
    }
}
