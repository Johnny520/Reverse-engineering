.class public final synthetic L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-wide v2, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    const-wide/16 v4, 0x3e8

    .line 16
    .line 17
    div-long/2addr v0, v4

    .line 18
    const-wide/16 v4, 0x5

    .line 19
    .line 20
    sub-long/2addr v4, v0

    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    cmp-long p1, v2, v0

    .line 24
    .line 25
    if-lez p1, :cond_0

    .line 26
    .line 27
    cmp-long p1, v4, v0

    .line 28
    .line 29
    if-lez p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 37
    .line 38
    iget-object p1, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲苏兰;

    .line 39
    .line 40
    new-instance v0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;

    .line 41
    .line 42
    const/16 v1, 0xc

    .line 43
    .line 44
    invoke-direct {v0, p0, v1}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void

    .line 51
    :pswitch_0
    iget-object p0, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;

    .line 52
    .line 53
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
