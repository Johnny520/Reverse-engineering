.class public final L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世楪苏兰/飘花落叶言子楪世兰苏哲;

.field public 飘花落叶言子楪哲兰苏世:Landroid/os/Handler;

.field public 飘花落叶言子楪哲苏兰世:L飘花落叶言子哲世楪苏兰/飘花落叶言子楪世哲兰苏;


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:L飘花落叶言子哲世楪苏兰/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪世哲兰苏;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲世楪苏兰/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v2, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    const/16 v3, 0xb

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v2, v3, v1, v0, v4}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method
