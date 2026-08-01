.class public final synthetic Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :goto_0
    iget-boolean v0, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/os/Message;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v1, p0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 30
    .line 31
    .line 32
    const-wide/16 v0, 0x14

    .line 33
    .line 34
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_0
    invoke-static {p0}, Llin/xposed/hook/javaplugin/view/DownloadPluginItemView;->飘花落叶言子楪兰世哲苏(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏兰哲;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
