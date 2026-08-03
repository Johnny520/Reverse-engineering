package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nb.w f9273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nb.k f9274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f9276k;

    public /* synthetic */ h(nb.w r2, nb.k r3, int r4, long r5) {
            r1 = this;
            r0 = 1
            r1.f9272g = r0
            r1.<init>()
            r1.f9273h = r2
            r1.f9274i = r3
            r1.f9275j = r4
            r1.f9276k = r5
            return
    }

    public /* synthetic */ h(nb.w r2, nb.k r3, long r4, int r6) {
            r1 = this;
            r0 = 0
            r1.f9272g = r0
            r1.<init>()
            r1.f9273h = r2
            r1.f9274i = r3
            r1.f9276k = r4
            r1.f9275j = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f9272g
            switch(r0) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            nb.w r2 = r8.f9273h
            nb.k r3 = r8.f9274i
            int r7 = r8.f9275j
            long r4 = r8.f9276k
            nb.m r0 = nb.w.r(r3, r7)     // Catch: java.lang.Throwable -> L13
        L11:
            r6 = r0
            goto L42
        L13:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = ":"
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r0 = nb.w.h(r0)
            java.lang.String r1 = "resolveError="
            java.lang.String r0 = r1.concat(r0)
            r3.f9294j = r0
            r0 = 0
            goto L11
        L42:
            android.os.Handler r0 = r2.f9312b
            nb.g r1 = new nb.g
            r1.<init>(r2, r3, r4, r6, r7)
            r0.post(r1)
            return
        L4d:
            nb.w r3 = r8.f9273h
            nb.k r4 = r8.f9274i
            long r6 = r8.f9276k
            int r5 = r8.f9275j
            boolean r0 = r3.f(r4, r6)
            if (r0 != 0) goto L5c
            goto L77
        L5c:
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 != 0) goto L6f
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r3.f9314d
            java.lang.String r1 = r4.f9285a
            r0.remove(r1)
            java.lang.String r0 = "[Hchat:TextSpeech] 等待语音文件失败: 任务 API 未就绪"
            fb.v0.m(r0)
            goto L77
        L6f:
            nb.h r2 = new nb.h
            r2.<init>(r3, r4, r5, r6)
            r0.d(r2)
        L77:
            return
    }
}
