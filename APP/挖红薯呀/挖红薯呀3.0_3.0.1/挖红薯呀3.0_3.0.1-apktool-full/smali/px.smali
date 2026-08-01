.class public final Lpx;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lpx;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lpx;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lpx;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lpx;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, Lpx;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ld50;

    .line 11
    .line 12
    iget-object v1, p1, Ld50;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Lpx;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lwc;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    iget-object p1, p1, Ld50;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v1

    .line 27
    sget-object p0, Lna1;->a:Lna1;

    .line 28
    .line 29
    return-object p0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p0, v0

    .line 32
    monitor-exit v1

    .line 33
    throw p0

    .line 34
    :pswitch_0
    move-object v5, p1

    .line 35
    check-cast v5, Lq21;

    .line 36
    .line 37
    sget-object p1, Lt21;->c:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p1

    .line 40
    :try_start_1
    sget-wide v3, Lt21;->e:J

    .line 41
    .line 42
    const-wide/16 v0, 0x1

    .line 43
    .line 44
    add-long/2addr v0, v3

    .line 45
    sput-wide v0, Lt21;->e:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    monitor-exit p1

    .line 48
    iget-object p1, p0, Lpx;->e:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v6, p1

    .line 51
    check-cast v6, Lsw;

    .line 52
    .line 53
    iget-object p0, p0, Lpx;->f:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v7, p0

    .line 56
    check-cast v7, Lsw;

    .line 57
    .line 58
    new-instance v2, Lnh0;

    .line 59
    .line 60
    invoke-direct/range {v2 .. v7}, Lnh0;-><init>(JLq21;Lsw;Lsw;)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    monitor-exit p1

    .line 67
    throw p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
