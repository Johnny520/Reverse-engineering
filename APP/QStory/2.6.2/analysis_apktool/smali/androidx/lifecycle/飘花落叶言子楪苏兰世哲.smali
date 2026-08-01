.class public final Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言子世哲楪兰苏/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public 飘花落叶言子楪哲兰世苏:Z

.field public 飘花落叶言子楪哲兰苏世:Z

.field public 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Z

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Z

    .line 23
    .line 24
    new-instance p1, Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 25
    .line 26
    invoke-direct {p1}, Landroidx/collection/飘花落叶言子世兰楪苏哲;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public 飘花落叶言子楪世苏兰哲()V
    .locals 14

    .line 1
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:[J

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    add-int/lit8 v2, v2, -0x2

    .line 11
    .line 12
    if-ltz v2, :cond_3

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    aget-wide v5, v1, v4

    .line 17
    .line 18
    not-long v7, v5

    .line 19
    const/4 v9, 0x7

    .line 20
    shl-long/2addr v7, v9

    .line 21
    and-long/2addr v7, v5

    .line 22
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v7, v9

    .line 28
    cmp-long v7, v7, v9

    .line 29
    .line 30
    if-eqz v7, :cond_2

    .line 31
    .line 32
    sub-int v7, v4, v2

    .line 33
    .line 34
    not-int v7, v7

    .line 35
    ushr-int/lit8 v7, v7, 0x1f

    .line 36
    .line 37
    const/16 v8, 0x8

    .line 38
    .line 39
    rsub-int/lit8 v7, v7, 0x8

    .line 40
    .line 41
    move v9, v3

    .line 42
    :goto_1
    if-ge v9, v7, :cond_1

    .line 43
    .line 44
    const-wide/16 v10, 0xff

    .line 45
    .line 46
    and-long/2addr v10, v5

    .line 47
    const-wide/16 v12, 0x80

    .line 48
    .line 49
    cmp-long v10, v10, v12

    .line 50
    .line 51
    if-gez v10, :cond_0

    .line 52
    .line 53
    shl-int/lit8 v10, v4, 0x3

    .line 54
    .line 55
    add-int/2addr v10, v9

    .line 56
    aget-object v10, v0, v10

    .line 57
    .line 58
    instance-of v11, v10, Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 59
    .line 60
    if-eqz v11, :cond_0

    .line 61
    .line 62
    check-cast v10, Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 63
    .line 64
    iget-object v11, v10, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v10, v10, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 67
    .line 68
    move v12, v3

    .line 69
    :goto_2
    if-ge v12, v10, :cond_0

    .line 70
    .line 71
    aget-object v13, v11, v12

    .line 72
    .line 73
    add-int/lit8 v12, v12, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_0
    shr-long/2addr v5, v8

    .line 77
    add-int/lit8 v9, v9, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    if-ne v7, v8, :cond_3

    .line 81
    .line 82
    :cond_2
    if-eq v4, v2, :cond_3

    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-virtual {p0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    iget-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    iput-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 13
    .line 14
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_5

    .line 19
    .line 20
    iget-boolean v3, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Z

    .line 21
    .line 22
    if-nez v3, :cond_3

    .line 23
    .line 24
    iget-boolean v3, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Z

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move v3, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_3
    :goto_1
    move v3, v1

    .line 32
    :goto_2
    if-nez v3, :cond_4

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Runnable;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_4

    .line 49
    :cond_5
    :goto_3
    iput-boolean v2, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 50
    .line 51
    return-void

    .line 52
    :goto_4
    iput-boolean v2, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 53
    .line 54
    throw v0
.end method
