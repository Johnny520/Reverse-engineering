.class public final synthetic L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

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
    iget v0, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object p0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰:Ljava/util/HashMap;

    .line 10
    .line 11
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 v1, 0x1

    .line 13
    :try_start_1
    iput-boolean v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲:Z

    .line 14
    .line 15
    iget-object v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 18
    .line 19
    .line 20
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏兰哲楪(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    iget p0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:I

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏兰楪哲(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    iget-object p0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 41
    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    new-instance p0, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 45
    .line 46
    sget v1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲兰苏:I

    .line 47
    .line 48
    invoke-direct {p0, v1}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object p0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 52
    .line 53
    :cond_1
    iget p0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲:I

    .line 54
    .line 55
    if-nez p0, :cond_2

    .line 56
    .line 57
    const/16 p0, 0xc

    .line 58
    .line 59
    iput p0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲:I

    .line 60
    .line 61
    :cond_2
    iget-boolean p0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰:Z

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏楪哲兰世(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;)V

    .line 66
    .line 67
    .line 68
    const-string p0, "rewrite data"

    .line 69
    .line 70
    invoke-static {v0, p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    .line 73
    :cond_3
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :catchall_1
    move-exception v1

    .line 76
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    :try_start_4
    throw v1

    .line 78
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 79
    throw p0

    .line 80
    :pswitch_0
    iget-object p0, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 81
    .line 82
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏兰楪世哲(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
