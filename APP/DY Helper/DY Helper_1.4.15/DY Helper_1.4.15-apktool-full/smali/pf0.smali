.class public final Lpf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Liw1;


# instance fields
.field public final ε:Lj60;

.field public ζ:Z

.field public final synthetic η:Luf0;


# direct methods
.method public constructor <init>(Luf0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpf0;->η:Luf0;

    .line 5
    .line 6
    new-instance v0, Lj60;

    .line 7
    .line 8
    iget-object p1, p1, Luf0;->γ:Lm6;

    .line 9
    .line 10
    iget-object p1, p1, Lm6;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lqk1;

    .line 13
    .line 14
    iget-object p1, p1, Lqk1;->ε:Liw1;

    .line 15
    .line 16
    invoke-interface {p1}, Liw1;->α()Lm42;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Lj60;-><init>(Lm42;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lpf0;->ε:Lj60;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lpf0;->ζ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lpf0;->ζ:Z

    .line 10
    .line 11
    iget-object v0, p0, Lpf0;->η:Luf0;

    .line 12
    .line 13
    iget-object v0, v0, Luf0;->γ:Lm6;

    .line 14
    .line 15
    iget-object v0, v0, Lm6;->θ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lqk1;

    .line 18
    .line 19
    const-string v1, "0\r\n\r\n"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lpf0;->ε:Lj60;

    .line 25
    .line 26
    iget-object v1, v0, Lj60;->ε:Lm42;

    .line 27
    .line 28
    sget-object v2, Lm42;->δ:Ll42;

    .line 29
    .line 30
    iput-object v2, v0, Lj60;->ε:Lm42;

    .line 31
    .line 32
    invoke-virtual {v1}, Lm42;->α()Lm42;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lm42;->β()Lm42;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lpf0;->η:Luf0;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iput v1, v0, Luf0;->δ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lpf0;->ζ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lpf0;->η:Luf0;

    .line 9
    .line 10
    iget-object v0, v0, Luf0;->γ:Lm6;

    .line 11
    .line 12
    iget-object v0, v0, Lm6;->θ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lqk1;

    .line 15
    .line 16
    invoke-virtual {v0}, Lqk1;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
.end method

.method public final α()Lm42;
    .locals 0

    .line 1
    iget-object p0, p0, Lpf0;->ε:Lj60;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ(JLsc;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lpf0;->ζ:Z

    .line 2
    .line 3
    const-string v1, "closed"

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, p1, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lpf0;->η:Luf0;

    .line 15
    .line 16
    iget-object p0, p0, Luf0;->γ:Lm6;

    .line 17
    .line 18
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lqk1;

    .line 21
    .line 22
    iget-boolean v0, p0, Lqk1;->η:Z

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lqk1;->ζ:Lsc;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Lsc;->Β(J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lqk1;->δ()Lzc;

    .line 32
    .line 33
    .line 34
    const-string v0, "\r\n"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, p2, p3}, Lqk1;->ζ(JLsc;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-static {v1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-static {v1}, Lγ;->ρ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
