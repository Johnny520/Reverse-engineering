.class public final Loc;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Loc;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Loc;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Loc;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lyw1;

    .line 7
    .line 8
    sget-object v0, Lax1;->γ:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-wide v1, Lax1;->ε:J

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    int-to-long v3, v3

    .line 15
    add-long/2addr v3, v1

    .line 16
    sput-wide v3, Lax1;->ε:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    iget-object p0, p0, Loc;->ζ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La80;

    .line 22
    .line 23
    new-instance v0, Lok1;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1, p0}, Lok1;-><init>(JLyw1;La80;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    monitor-exit v0

    .line 31
    throw p0

    .line 32
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 33
    .line 34
    iget-object p0, p0, Loc;->ζ:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lbe;

    .line 37
    .line 38
    invoke-interface {p0}, Lbe;->cancel()V

    .line 39
    .line 40
    .line 41
    sget-object p0, Ls62;->α:Ls62;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
