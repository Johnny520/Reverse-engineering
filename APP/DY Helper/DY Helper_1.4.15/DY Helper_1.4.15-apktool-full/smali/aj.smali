.class public final synthetic Laj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Laj;->α:I

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
    .locals 1

    .line 1
    iget p0, p0, Laj;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "DY-ShareActionSave"

    .line 7
    .line 8
    :goto_0
    const/4 v0, 0x1

    .line 9
    invoke-static {p1, p0, v0}, Lnx;->σ(Ljava/lang/Runnable;Ljava/lang/String;Z)Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    const-string p0, "DY-IMRuleDialog"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_1
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->γ(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_2
    const-string p0, "r835fa64311f18a7"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_3
    const-string p0, "r6cf01fd093683163"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_4
    const-string p0, "r22ccd7c86882c0eb"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_5
    const-string p0, "rcd202de33ab849df"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_6
    const-string p0, "DY-IMInteractiveDelete"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_7
    const-string p0, "DY-IMConversationDelete"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_8
    const-string p0, "DY-IMDeleteLoad"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_9
    const-string p0, "DY-IMCatalogNameResolve"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_a
    const-string p0, "DY-HiddenContactDialog"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_b
    const-string p0, "DY-GroupApply"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_c
    const-string p0, "DY-GroupApply-Auto"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_d
    const-string p0, "r5990943ada2f0d15"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_e
    invoke-static {p1}, Lorg/luckypray/dexkit/DexKitCacheBridge;->α(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_f
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->ε(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_10
    const-string p0, "r399daf3090944eff"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_11
    const-string p0, "rbb0ae2e153222b7"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_12
    const-string p0, "rd1ce5956d5212b55"

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
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
