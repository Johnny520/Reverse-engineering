package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f2419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f2420i;

    public /* synthetic */ e(android.content.Context r1, android.net.Uri r2, int r3) {
            r0 = this;
            r0.f2418g = r3
            r0.f2419h = r1
            r0.f2420i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f2418g
            switch(r0) {
                case 0: goto L34;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r5.f2419h
            android.net.Uri r1 = r5.f2420i
            android.media.Ringtone r0 = android.media.RingtoneManager.getRingtone(r0, r1)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L15:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L1b
            r0 = 0
        L1b:
            android.media.Ringtone r0 = (android.media.Ringtone) r0
            if (r0 == 0) goto L33
            r1 = 5
            r0.setStreamType(r1)     // Catch: java.lang.Throwable -> L23
        L23:
            r0.play()     // Catch: java.lang.Throwable -> L26
        L26:
            android.os.Handler r1 = x9.d.f21410b
            e9.g r2 = new e9.g
            r3 = 1
            r2.<init>(r0, r3)
            r3 = 3500(0xdac, double:1.729E-320)
            r1.postDelayed(r2, r3)
        L33:
            return
        L34:
            android.content.Context r0 = r5.f2419h
            android.net.Uri r1 = r5.f2420i
            android.media.Ringtone r0 = android.media.RingtoneManager.getRingtone(r0, r1)     // Catch: java.lang.Throwable -> L3d
            goto L44
        L3d:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L44:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L4a
            r0 = 0
        L4a:
            android.media.Ringtone r0 = (android.media.Ringtone) r0
            if (r0 == 0) goto L62
            r1 = 5
            r0.setStreamType(r1)     // Catch: java.lang.Throwable -> L52
        L52:
            r0.play()     // Catch: java.lang.Throwable -> L55
        L55:
            android.os.Handler r1 = e9.q.f2465f
            e9.g r2 = new e9.g
            r3 = 0
            r2.<init>(r0, r3)
            r3 = 3500(0xdac, double:1.729E-320)
            r1.postDelayed(r2, r3)
        L62:
            return
    }
}
