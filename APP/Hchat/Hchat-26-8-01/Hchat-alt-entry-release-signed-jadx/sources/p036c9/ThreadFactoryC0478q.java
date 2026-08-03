package p036c9;

import java.util.concurrent.ThreadFactory;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: c9.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0478q implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1416a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [fb.g1.<clinit>():void, h.Hchat.hooks.items.script.ScriptPluginRuntime.<clinit>():void, r8.e.<clinit>():void] */
    public /* synthetic */ ThreadFactoryC0478q(int i9) {
        this.f1416a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        switch (this.f1416a) {
            case 0:
                str = "Hchat-ConversationGroupMenu";
                break;
            case 1:
                str = "Hchat-ConversationGroup";
                break;
            case 2:
                str = "Hchat-MessageForward";
                break;
            case 3:
                str = "Hchat-CustomNotify";
                break;
            case 4:
                str = "Hchat-QuickReply";
                break;
            case 5:
                str = "HchatScriptMessage";
                break;
            case 6:
                return ScriptPluginRuntime.snsPrepareExecutor$lambda$0(runnable);
            case 7:
                return ScriptPluginRuntime.protobufCallbackExecutor$lambda$0(runnable);
            case 8:
                return ScriptPluginRuntime.imageDownloadCallbackExecutor$lambda$0(runnable);
            case 9:
                str = "Hchat-Agent-Session-Save";
                break;
            case 10:
                str = "Hchat-MomentsAutoComment";
                break;
            case 11:
                str = "Hchat-MomentsAutoForward";
                break;
            case 12:
                str = "Hchat-MomentsAutoLike";
                break;
            case 13:
                str = "Hchat-MomentsAutoRefresh";
                break;
            case 14:
                str = "Hchat-MomentsPostNotify";
                break;
            case 15:
                str = "Hchat-CustomMassSend";
                break;
            case 16:
                str = "Hchat-MomentsFake";
                break;
            case 17:
                str = "HchatXmlThumbPrefetch";
                break;
            case 18:
                str = "HchatLocalSendFallback";
                break;
            case 19:
                str = "HchatQQMusicOrder";
                break;
            case 20:
                str = "Hchat-SwipeRepeatVoice";
                break;
            case 21:
                str = "Hchat-TextVoice";
                break;
            case 22:
                str = "Hchat-VoiceForwardSend";
                break;
            case 23:
                str = "Hchat-DexInstall";
                break;
            case 24:
                str = "HchatZombieCheck";
                break;
            case 25:
                str = "HchatZombieAction";
                break;
            case 26:
                str = "Hchat-AutoMessageForward";
                break;
            case 27:
                str = "Hchat-AutoReply";
                break;
            case 28:
                str = "Hchat-AutoReply-Timer";
                break;
            default:
                str = "Hchat-KeywordNotify";
                break;
        }
        return AbstractC2091b.m5167n(str, true, runnable);
    }
}
