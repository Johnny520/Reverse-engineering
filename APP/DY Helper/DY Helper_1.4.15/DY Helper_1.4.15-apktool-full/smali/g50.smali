.class public final Lg50;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf50;


# instance fields
.field public final α:Lxn0;

.field public final β:Lh2;

.field public final γ:Lcw1;

.field public final δ:Lk50;

.field public final ε:Lrk0;


# direct methods
.method public constructor <init>(Lxn0;Lh2;)V
    .locals 5

    .line 1
    sget-object v0, Lh50;->α:Lcw1;

    .line 2
    .line 3
    new-instance v1, Lk50;

    .line 4
    .line 5
    sget-object v2, Lh50;->α:Lcw1;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lk50;->α:Lj50;

    .line 11
    .line 12
    sget-object v3, Lkt;->α:Lnc0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lpd2;->Θ(Lsp;Lup;)Lup;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lhz;->ε:Lhz;

    .line 22
    .line 23
    invoke-interface {v2, v3}, Lup;->η(Lup;)Lup;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, Lo12;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v3, v4}, Lzn0;-><init>(Lfo0;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v2, v3}, Lup;->η(Lup;)Lup;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, Lyh;->β(Lup;)Lmp;

    .line 38
    .line 39
    .line 40
    new-instance v2, Lrk0;

    .line 41
    .line 42
    const/16 v3, 0x9

    .line 43
    .line 44
    invoke-direct {v2, v3}, Lrk0;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lg50;->α:Lxn0;

    .line 51
    .line 52
    iput-object p2, p0, Lg50;->β:Lh2;

    .line 53
    .line 54
    iput-object v0, p0, Lg50;->γ:Lcw1;

    .line 55
    .line 56
    iput-object v1, p0, Lg50;->δ:Lk50;

    .line 57
    .line 58
    iput-object v2, p0, Lg50;->ε:Lrk0;

    .line 59
    .line 60
    new-instance p1, Lθ;

    .line 61
    .line 62
    const/16 p2, 0xf

    .line 63
    .line 64
    invoke-direct {p1, p2, p0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final α(Lm62;)Ln62;
    .locals 4

    .line 1
    iget-object v0, p0, Lg50;->γ:Lcw1;

    .line 2
    .line 3
    new-instance v1, Lwa;

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    invoke-direct {v1, p0, v2, p1}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, v0, Lcw1;->ζ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lzz1;

    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    iget-object v2, v0, Lcw1;->η:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lkw0;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Lkw0;->α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ln62;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-boolean v3, v2, Ln62;->ζ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object v2

    .line 33
    :cond_0
    :try_start_1
    iget-object v2, v0, Lcw1;->η:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lkw0;

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Lkw0;->γ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ln62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    :goto_0
    monitor-exit p0

    .line 47
    :try_start_2
    new-instance p0, Lqh1;

    .line 48
    .line 49
    const/16 v2, 0xa

    .line 50
    .line 51
    invoke-direct {p0, v0, v2, p1}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p0}, Lwa;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ln62;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 59
    .line 60
    iget-object v1, v0, Lcw1;->ζ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lzz1;

    .line 63
    .line 64
    monitor-enter v1

    .line 65
    :try_start_3
    iget-object v2, v0, Lcw1;->η:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lkw0;

    .line 68
    .line 69
    invoke-virtual {v2, p1}, Lkw0;->α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-nez v2, :cond_2

    .line 74
    .line 75
    iget-boolean v2, p0, Ln62;->ζ:Z

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    iget-object v0, v0, Lcw1;->η:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lkw0;

    .line 82
    .line 83
    invoke-virtual {v0, p1, p0}, Lkw0;->β(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_1
    move-exception p0

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    :goto_1
    monitor-exit v1

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v1

    .line 92
    throw p0

    .line 93
    :catch_0
    move-exception p0

    .line 94
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v0, "Could not load font"

    .line 97
    .line 98
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :goto_3
    monitor-exit p0

    .line 103
    throw p1
.end method

.method public final β(Lbr;Ld60;II)Ln62;
    .locals 6

    .line 1
    new-instance v0, Lm62;

    .line 2
    .line 3
    iget-object v1, p0, Lg50;->β:Lh2;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v1, Lh2;->ε:I

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const v2, 0x7fffffff

    .line 13
    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p2, p2, Ld60;->ε:I

    .line 19
    .line 20
    add-int/2addr p2, v1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x3e8

    .line 23
    .line 24
    invoke-static {p2, v1, v2}, Lj81;->μ(III)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    new-instance v1, Ld60;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Ld60;-><init>(I)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    move-object v2, p2

    .line 36
    :goto_1
    iget-object p2, p0, Lg50;->α:Lxn0;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v1, p1

    .line 43
    move v3, p3

    .line 44
    move v4, p4

    .line 45
    invoke-direct/range {v0 .. v5}, Lm62;-><init>(Lbr;Ld60;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lg50;->α(Lm62;)Ln62;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
