.class public final Lretrofit2/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lretrofit2/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子楪苏兰世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lretrofit2/飘花落叶言子楪苏兰世哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Lretrofit2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lretrofit2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFailure(Lretrofit2/飘花落叶言子楪世兰苏哲;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Lretrofit2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lretrofit2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onResponse(Lretrofit2/飘花落叶言子楪世兰苏哲;Lretrofit2/飘花落叶言子世兰楪哲苏;)V
    .locals 0

    .line 1
    iget p1, p0, Lretrofit2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lretrofit2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p2, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;

    .line 13
    .line 14
    iget-boolean p1, p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子世苏楪哲兰:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p2, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Lretrofit2/HttpException;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Lretrofit2/HttpException;-><init>(Lretrofit2/飘花落叶言子世兰楪哲苏;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
