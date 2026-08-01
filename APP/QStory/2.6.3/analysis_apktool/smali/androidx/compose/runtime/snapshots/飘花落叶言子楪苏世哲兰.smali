.class public abstract Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:I

.field public 飘花落叶言子楪世哲苏兰:Z

.field public 飘花落叶言子楪世苏兰哲:J

.field public 飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(JLandroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    iput-wide p1, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:J

    .line 7
    .line 8
    sget-object p3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/飘花落叶言子苏世楪兰哲;

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long p3, p1, v0

    .line 13
    .line 14
    if-eqz p3, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    iget-wide v2, p3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:J

    .line 21
    .line 22
    iget-object v4, p3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:[J

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    aget-wide p1, v4, p1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-wide v4, p3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:J

    .line 31
    .line 32
    cmp-long v6, v4, v0

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    :goto_0
    int-to-long p1, p1

    .line 41
    add-long/2addr p1, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-wide v4, p3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:J

    .line 44
    .line 45
    cmp-long p3, v4, v0

    .line 46
    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    const-wide/16 p1, 0x40

    .line 50
    .line 51
    add-long/2addr v2, p1

    .line 52
    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    sget-object p3, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 58
    .line 59
    monitor-enter p3

    .line 60
    :try_start_0
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏哲兰世;

    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(J)I

    .line 63
    .line 64
    .line 65
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit p3

    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    monitor-exit p3

    .line 70
    throw p0

    .line 71
    :cond_3
    const/4 p1, -0x1

    .line 72
    :goto_2
    iput p1, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 73
    .line 74
    return-void
.end method

.method public static 飘花落叶言子楪哲兰世苏(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲楪兰苏(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract 飘花落叶言子楪世兰哲苏()Z
.end method

.method public abstract 飘花落叶言子楪世兰苏哲()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
.end method

.method public 飘花落叶言子楪世哲兰苏()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract 飘花落叶言子楪世哲苏兰()V
.end method

.method public 飘花落叶言子楪世苏兰哲()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(J)Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0

    .line 14
    throw p0
.end method

.method public 飘花落叶言子楪兰世哲苏(I)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Updating write count is not supported for this snapshot"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言子楪兰世苏哲(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:J

    .line 2
    .line 3
    return-void
.end method

.method public abstract 飘花落叶言子楪兰苏世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;
.end method

.method public abstract 飘花落叶言子楪哲世兰苏(Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;)V
.end method

.method public abstract 飘花落叶言子楪哲世苏兰()V
.end method

.method public 飘花落叶言子楪哲兰苏世(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲(I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public 飘花落叶言子楪哲苏兰世()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public 飘花落叶言子楪苏世兰哲()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子楪苏世哲兰()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract 飘花落叶言子楪苏兰世哲()V
.end method

.method public abstract 飘花落叶言子楪苏兰哲世()V
.end method

.method public abstract 飘花落叶言子楪苏哲世兰()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
.end method

.method public final 飘花落叶言子楪苏哲兰世()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲楪兰苏(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method
