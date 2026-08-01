.class public final L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰世苏哲;
.super Ljava/util/TimerTask;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 10
    .line 11
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏楪兰哲;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏楪兰哲;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
