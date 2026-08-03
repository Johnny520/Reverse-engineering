package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1318a;

    public /* synthetic */ q(int r1) {
            r0 = this;
            r0.f1318a = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            int r0 = r2.f1318a
            switch(r0) {
                case 0: goto L67;
                case 1: goto L64;
                case 2: goto L61;
                case 3: goto L5e;
                case 4: goto L5b;
                case 5: goto L58;
                case 6: goto L53;
                case 7: goto L4e;
                case 8: goto L49;
                case 9: goto L46;
                case 10: goto L43;
                case 11: goto L40;
                case 12: goto L3d;
                case 13: goto L3a;
                case 14: goto L37;
                case 15: goto L34;
                case 16: goto L31;
                case 17: goto L2e;
                case 18: goto L2b;
                case 19: goto L28;
                case 20: goto L25;
                case 21: goto L22;
                case 22: goto L1f;
                case 23: goto L1c;
                case 24: goto L19;
                case 25: goto L16;
                case 26: goto L13;
                case 27: goto L10;
                case 28: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "Hchat-KeywordNotify"
        L7:
            r1 = 1
            java.lang.Thread r3 = j8.b.n(r0, r1, r3)
            return r3
        Ld:
            java.lang.String r0 = "Hchat-AutoReply-Timer"
            goto L7
        L10:
            java.lang.String r0 = "Hchat-AutoReply"
            goto L7
        L13:
            java.lang.String r0 = "Hchat-AutoMessageForward"
            goto L7
        L16:
            java.lang.String r0 = "HchatZombieAction"
            goto L7
        L19:
            java.lang.String r0 = "HchatZombieCheck"
            goto L7
        L1c:
            java.lang.String r0 = "Hchat-DexInstall"
            goto L7
        L1f:
            java.lang.String r0 = "Hchat-VoiceForwardSend"
            goto L7
        L22:
            java.lang.String r0 = "Hchat-TextVoice"
            goto L7
        L25:
            java.lang.String r0 = "Hchat-SwipeRepeatVoice"
            goto L7
        L28:
            java.lang.String r0 = "HchatQQMusicOrder"
            goto L7
        L2b:
            java.lang.String r0 = "HchatLocalSendFallback"
            goto L7
        L2e:
            java.lang.String r0 = "HchatXmlThumbPrefetch"
            goto L7
        L31:
            java.lang.String r0 = "Hchat-MomentsFake"
            goto L7
        L34:
            java.lang.String r0 = "Hchat-CustomMassSend"
            goto L7
        L37:
            java.lang.String r0 = "Hchat-MomentsPostNotify"
            goto L7
        L3a:
            java.lang.String r0 = "Hchat-MomentsAutoRefresh"
            goto L7
        L3d:
            java.lang.String r0 = "Hchat-MomentsAutoLike"
            goto L7
        L40:
            java.lang.String r0 = "Hchat-MomentsAutoForward"
            goto L7
        L43:
            java.lang.String r0 = "Hchat-MomentsAutoComment"
            goto L7
        L46:
            java.lang.String r0 = "Hchat-Agent-Session-Save"
            goto L7
        L49:
            java.lang.Thread r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.c(r3)
            return r3
        L4e:
            java.lang.Thread r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.m(r3)
            return r3
        L53:
            java.lang.Thread r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.q(r3)
            return r3
        L58:
            java.lang.String r0 = "HchatScriptMessage"
            goto L7
        L5b:
            java.lang.String r0 = "Hchat-QuickReply"
            goto L7
        L5e:
            java.lang.String r0 = "Hchat-CustomNotify"
            goto L7
        L61:
            java.lang.String r0 = "Hchat-MessageForward"
            goto L7
        L64:
            java.lang.String r0 = "Hchat-ConversationGroup"
            goto L7
        L67:
            java.lang.String r0 = "Hchat-ConversationGroupMenu"
            goto L7
    }
}
