.class public final Lyv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lvt;


# instance fields
.field public final ε:Lk12;

.field public final ζ:J

.field public final η:Ljava/lang/Object;

.field public final θ:Lae;


# direct methods
.method public constructor <init>(Lk12;JLjava/lang/Object;Lae;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyv1;->ε:Lk12;

    .line 5
    .line 6
    iput-wide p2, p0, Lyv1;->ζ:J

    .line 7
    .line 8
    iput-object p4, p0, Lyv1;->η:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p5, p0, Lyv1;->θ:Lae;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 6

    .line 1
    iget-object v0, p0, Lyv1;->ε:Lk12;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p0, Lyv1;->ζ:J

    .line 5
    .line 6
    invoke-virtual {v0}, Lk12;->ξ()J

    .line 7
    .line 8
    .line 9
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-gez v1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    iget-object v1, v0, Lk12;->μ:[Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-wide v2, p0, Lyv1;->ζ:J

    .line 22
    .line 23
    long-to-int v4, v2

    .line 24
    array-length v5, v1

    .line 25
    add-int/lit8 v5, v5, -0x1

    .line 26
    .line 27
    and-int/2addr v4, v5

    .line 28
    aget-object v4, v1, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    if-eq v4, p0, :cond_1

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :cond_1
    :try_start_2
    sget-object p0, Lpd2;->η:Luy;

    .line 35
    .line 36
    invoke-static {v1, v2, v3, p0}, Lpd2;->β([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lk12;->ι()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    monitor-exit v0

    .line 46
    throw p0
.end method
