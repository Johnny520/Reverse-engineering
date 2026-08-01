.class public final Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

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
    .locals 2

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->dismiss()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getAnimationDuration()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/lit8 v0, v0, 0x32

    .line 17
    .line 18
    int-to-long v0, v0

    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->delayDismiss(J)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
