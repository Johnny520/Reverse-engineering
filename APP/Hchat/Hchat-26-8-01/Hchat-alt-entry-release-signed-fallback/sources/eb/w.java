package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f2678i;

    public /* synthetic */ w(android.content.Context r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f2676g = r3
            r0.f2678i = r1
            r0.f2677h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ w(java.lang.String r1, android.content.Context r2, int r3) {
            r0 = this;
            r0.f2676g = r3
            r0.f2677h = r1
            r0.f2678i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f2676g
            sf.n r1 = sf.n.f12433a
            r2 = 0
            java.lang.String r3 = r5.f2677h
            android.content.Context r4 = r5.f2678i
            switch(r0) {
                case 0: goto L9f;
                case 1: goto L9b;
                case 2: goto L97;
                case 3: goto L77;
                case 4: goto L6f;
                case 5: goto L60;
                case 6: goto L32;
                case 7: goto L14;
                default: goto Lc;
            }
        Lc:
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r3, r2)
            r0.show()
            return
        L14:
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r3, r2)     // Catch: java.lang.Throwable -> L1c
            r0.show()     // Catch: java.lang.Throwable -> L1c
            goto L22
        L1c:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
        L22:
            java.lang.Throwable r0 = sf.g.b(r1)
            if (r0 == 0) goto L31
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:KeywordNotification] Toast失败: "
            eh.a.x(r2, r1, r0)
        L31:
            return
        L32:
            fb.g1 r0 = fb.g1.f3523a     // Catch: java.lang.Throwable -> L4e
            r4.getClass()     // Catch: java.lang.Throwable -> L4e
            r3.getClass()     // Catch: java.lang.Throwable -> L4e
            fb.g1.e(r4, r3)     // Catch: java.lang.Throwable -> L4e
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4e
            java.io.File r2 = fb.g1.a(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = fb.g1.m(r3)     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L4e
            dg.l.b0(r0)     // Catch: java.lang.Throwable -> L4e
            goto L54
        L4e:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
        L54:
            java.lang.Throwable r0 = sf.g.b(r1)
            if (r0 == 0) goto L5f
            java.lang.String r1 = "[Hchat:ScriptAgent] 清理空会话失败: "
            eh.a.x(r1, r3, r0)
        L5f:
            return
        L60:
            java.lang.String r0 = "已完成，但会话保存失败"
            java.lang.String r0 = r3.concat(r0)
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r1)
            r0.show()
            return
        L6f:
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r3, r2)
            r0.show()
            return
        L77:
            fb.o1.f3691d = r3
            boolean r0 = fb.o1.f3690c
            if (r0 == 0) goto L81
            fb.o1.a(r3)
            goto L96
        L81:
            android.speech.tts.TextToSpeech r0 = fb.o1.f3689b
            if (r0 == 0) goto L86
            goto L96
        L86:
            android.speech.tts.TextToSpeech r0 = new android.speech.tts.TextToSpeech
            android.content.Context r1 = r4.getApplicationContext()
            fb.m1 r2 = new fb.m1
            r2.<init>()
            r0.<init>(r1, r2)
            fb.o1.f3689b = r0
        L96:
            return
        L97:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.n(r4, r3)
            return
        L9b:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.x(r4, r3)
            return
        L9f:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.v(r4, r3)
            return
    }
}
