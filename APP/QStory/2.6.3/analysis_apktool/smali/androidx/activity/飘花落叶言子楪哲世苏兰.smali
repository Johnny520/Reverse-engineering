.class public final synthetic Landroidx/activity/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    iget v0, p0, Landroidx/activity/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/activity/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    iput-boolean v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 15
    .line 16
    iget v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-boolean v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏:Z

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/activity/飘花落叶言子楪世兰哲苏;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/activity/飘花落叶言子楪世兰哲苏;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/activity/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    throw p0

    .line 39
    :pswitch_0
    check-cast p0, Landroidx/activity/飘花落叶言子楪兰世苏哲;

    .line 40
    .line 41
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(Landroidx/activity/飘花落叶言子楪兰世苏哲;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_1
    check-cast p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;

    .line 46
    .line 47
    iget-object v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput-object v0, p0, Landroidx/activity/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

    .line 56
    .line 57
    :cond_1
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
