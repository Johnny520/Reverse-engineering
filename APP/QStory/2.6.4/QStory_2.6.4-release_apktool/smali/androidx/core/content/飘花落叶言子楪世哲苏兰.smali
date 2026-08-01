.class public final Landroidx/core/content/飘花落叶言子楪世哲苏兰;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Landroidx/core/content/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/core/content/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Landroidx/core/content/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    iget-object p2, p0, Landroidx/core/content/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    new-instance v0, Lkotlin/Result$Failure;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lkotlin/Result$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p2, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->resumeWith(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Landroidx/core/content/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    throw p1
.end method
