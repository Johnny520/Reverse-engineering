package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nb.w f9242h;

    public /* synthetic */ e(nb.w r1, int r2) {
            r0 = this;
            r0.f9241g = r2
            r0.f9242h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f9241g
            switch(r0) {
                case 0: goto Lee;
                case 1: goto Le8;
                case 2: goto Le2;
                case 3: goto Ldc;
                case 4: goto L94;
                case 5: goto L36;
                case 6: goto L1c;
                case 7: goto Le;
                default: goto L5;
            }
        L5:
            nb.w r0 = r5.f9242h
            r0.getClass()
            r0.u()
            return
        Le:
            nb.w r0 = r5.f9242h
            boolean r1 = r0.f9328r
            if (r1 == 0) goto L18
            r0.z()
            goto L1b
        L18:
            r0.m()
        L1b:
            return
        L1c:
            nb.w r0 = r5.f9242h
            nb.z r1 = r0.y()
            java.lang.String r2 = "text_speech_volume_control"
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L32
            nb.l r1 = r0.f9325o
            if (r1 == 0) goto L32
            r0.c()
            goto L35
        L32:
            r0.o()
        L35:
            return
        L36:
            nb.w r0 = r5.f9242h
            long r1 = r0.f9336z
            r3 = 1
            long r1 = r1 + r3
            r0.f9336z = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r0.f9314d
            r1.clear()
            java.util.ArrayDeque r1 = r0.f9313c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r1.next()
            r4 = r3
            nb.l r4 = (nb.l) r4
            boolean r4 = r4 instanceof nb.o
            if (r4 != 0) goto L4f
            r2.add(r3)
            goto L4f
        L64:
            java.util.ArrayDeque r1 = r0.f9313c
            r1.clear()
            java.util.ArrayDeque r1 = r0.f9313c
            r1.addAll(r2)
            nb.l r1 = r0.f9325o
            boolean r1 = r1 instanceof nb.o
            if (r1 == 0) goto L93
            r1 = 0
            r0.f9325o = r1
            r1 = 0
            r0.f9328r = r1
            r0.g()
            j8.p r1 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r1 == 0) goto L90
            j8.y r1 = r1.f6816b
            if (r1 == 0) goto L90
            j8.u r2 = new j8.u
            r3 = 2
            r2.<init>(r1, r3)
            r1.r(r2)
        L90:
            r0.n()
        L93:
            return
        L94:
            nb.w r0 = r5.f9242h
            long r1 = r0.f9336z
            r3 = 1
            long r1 = r1 + r3
            r0.f9336z = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r0.f9314d
            r1.clear()
            java.lang.String r1 = ""
            r0.f9326p = r1
            r1 = 0
            r0.f9327q = r1
            r0.f9328r = r1
            r0.f9330t = r1
            r0.p()
            r1 = 0
            r0.f9325o = r1
            java.util.ArrayDeque r1 = r0.f9313c
            r1.clear()
            android.speech.tts.TextToSpeech r1 = r0.f9316f     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto Lbf
            r1.stop()     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r0.g()
            j8.p r1 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r1 == 0) goto Ld5
            j8.y r1 = r1.f6816b
            if (r1 == 0) goto Ld5
            j8.u r2 = new j8.u
            r3 = 2
            r2.<init>(r1, r3)
            r1.r(r2)
        Ld5:
            r0.o()
            r0.w()
            return
        Ldc:
            nb.w r0 = r5.f9242h
            r0.j()
            return
        Le2:
            nb.w r0 = r5.f9242h
            r0.j()
            return
        Le8:
            nb.w r0 = r5.f9242h
            r0.j()
            return
        Lee:
            nb.w r0 = r5.f9242h
            r0.t()
            return
    }
}
