.class public final synthetic Lc9/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc9/q;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    iget v0, p0, Lc9/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "Hchat-KeywordNotify"

    .line 7
    .line 8
    :goto_0
    const/4 v1, 0x1

    .line 9
    invoke-static {v0, v1, p1}, Lj8/b;->n(Ljava/lang/String;ZLjava/lang/Runnable;)Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :pswitch_0
    const-string v0, "Hchat-AutoReply-Timer"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_1
    const-string v0, "Hchat-AutoReply"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_2
    const-string v0, "Hchat-AutoMessageForward"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_3
    const-string v0, "HchatZombieAction"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_4
    const-string v0, "HchatZombieCheck"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_5
    const-string v0, "Hchat-DexInstall"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_6
    const-string v0, "Hchat-VoiceForwardSend"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_7
    const-string v0, "Hchat-TextVoice"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_8
    const-string v0, "Hchat-SwipeRepeatVoice"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_9
    const-string v0, "HchatQQMusicOrder"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_a
    const-string v0, "HchatLocalSendFallback"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_b
    const-string v0, "HchatXmlThumbPrefetch"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_c
    const-string v0, "Hchat-MomentsFake"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_d
    const-string v0, "Hchat-CustomMassSend"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_e
    const-string v0, "Hchat-MomentsPostNotify"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_f
    const-string v0, "Hchat-MomentsAutoRefresh"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_10
    const-string v0, "Hchat-MomentsAutoLike"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_11
    const-string v0, "Hchat-MomentsAutoForward"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_12
    const-string v0, "Hchat-MomentsAutoComment"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_13
    const-string v0, "Hchat-Agent-Session-Save"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_14
    invoke-static {p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->c(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :pswitch_15
    invoke-static {p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->m(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :pswitch_16
    invoke-static {p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->q(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :pswitch_17
    const-string v0, "HchatScriptMessage"

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_18
    const-string v0, "Hchat-QuickReply"

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_19
    const-string v0, "Hchat-CustomNotify"

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_1a
    const-string v0, "Hchat-MessageForward"

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :pswitch_1b
    const-string v0, "Hchat-ConversationGroup"

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_1c
    const-string v0, "Hchat-ConversationGroupMenu"

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
