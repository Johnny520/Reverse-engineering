.class public final synthetic L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;

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
    iget v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()V

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x4ef

    .line 12
    .line 13
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    :try_start_0
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->detectUpdates()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰()L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    .line 27
    new-instance v0, Landroid/os/Handler;

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {v1, p0, v2}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    new-instance p0, Landroid/os/Handler;

    .line 47
    .line 48
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    const/4 v1, 0x7

    .line 58
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
