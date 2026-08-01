.class public final Ly21;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Let;
.implements Lhj1;
.implements Lf40;
.implements Lc00;
.implements Ld4;
.implements Ln72;


# instance fields
.field public ε:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    sparse-switch p1, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lzv0;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p1, v0}, Lzv0;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ly21;->ε:Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lnq;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lnq;-><init>(Ly21;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ly21;->ε:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroid/graphics/Region;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ly21;->ε:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance p1, Ln11;

    .line 42
    .line 43
    invoke-direct {p1}, Ln11;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ly21;->ε:Ljava/lang/Object;

    .line 47
    .line 48
    return-void

    .line 49
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_2
        0x8 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 49
    iput-object p1, p0, Ly21;->ε:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)Le40;
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [Le40;

    .line 4
    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    return-object p0
.end method

.method public α()Lvk1;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Ly21;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lal1;

    .line 6
    .line 7
    iget-object v2, v2, Lal1;->λ:Luk1;

    .line 8
    .line 9
    iget-boolean v2, v2, Luk1;->υ:Z

    .line 10
    .line 11
    if-nez v2, :cond_6

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Ly21;->ε:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lal1;

    .line 16
    .line 17
    invoke-virtual {v2}, Lal1;->β()Lbp1;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lbp1;->ε()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_3

    .line 26
    .line 27
    invoke-interface {v2}, Lbp1;->η()Lap1;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, v3, Lap1;->β:Lbp1;

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    iget-object v4, v3, Lap1;->γ:Ljava/lang/Throwable;

    .line 36
    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v4, 0x0

    .line 42
    :goto_1
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Lbp1;->γ()Lap1;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v2

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    :goto_2
    iget-object v4, v3, Lap1;->β:Lbp1;

    .line 52
    .line 53
    iget-object v3, v3, Lap1;->γ:Ljava/lang/Throwable;

    .line 54
    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, Ly21;->ε:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lal1;

    .line 62
    .line 63
    iget-object v2, v2, Lal1;->π:Lw6;

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Lw6;->addFirst(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    throw v3

    .line 70
    :cond_3
    invoke-interface {v2}, Lbp1;->δ()Lvk1;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    return-object p0

    .line 75
    :goto_3
    if-nez v1, :cond_4

    .line 76
    .line 77
    move-object v1, v2

    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-static {v1, v2}, Lln0;->η(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_4
    iget-object v2, p0, Ly21;->ε:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lal1;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Lal1;->α(Lvk1;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    throw v1

    .line 94
    :cond_6
    const-string p0, "Canceled"

    .line 95
    .line 96
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    return-object p0
.end method

.method public β()Lal1;
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lal1;

    .line 4
    .line 5
    return-object p0
.end method

.method public γ(Lg40;Lop;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lρ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lρ;

    .line 7
    .line 8
    iget v1, v0, Lρ;->λ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lρ;->λ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lρ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lρ;-><init>(Ly21;Lop;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lρ;->ι:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lρ;->λ:I

    .line 28
    .line 29
    sget-object v2, Ls62;->α:Ls62;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lρ;->θ:Lmp1;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lmp1;

    .line 55
    .line 56
    iget-object v1, v0, Lpp;->ζ:Lup;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-direct {p2, p1, v1}, Lmp1;-><init>(Lg40;Lup;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object p2, v0, Lρ;->θ:Lmp1;

    .line 65
    .line 66
    iput v3, v0, Lρ;->λ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 67
    .line 68
    :try_start_2
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ly12;

    .line 71
    .line 72
    invoke-interface {p0, p2, v0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    sget-object p1, Lcq;->ε:Lcq;

    .line 77
    .line 78
    if-ne p0, p1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object p0, v2

    .line 82
    :goto_1
    if-ne p0, p1, :cond_4

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_4
    move-object p0, p2

    .line 86
    :goto_2
    invoke-virtual {p0}, Lpp;->λ()V

    .line 87
    .line 88
    .line 89
    return-object v2

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    move-object p1, p0

    .line 92
    :goto_3
    move-object p0, p2

    .line 93
    goto :goto_4

    .line 94
    :catchall_2
    move-exception p1

    .line 95
    goto :goto_3

    .line 96
    :goto_4
    invoke-virtual {p0}, Lpp;->λ()V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public δ(F)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ly21;->μ()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 14
    .line 15
    float-to-int p1, p1

    .line 16
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->λ(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public ε()V
    .locals 1

    .line 1
    const-string p0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 2
    .line 3
    const-string v0, "ProfileInstaller"

    .line 4
    .line 5
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ζ(JLc4;Lc4;Lc4;)Lc4;
    .locals 6

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Li0;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Li0;->ζ(JLc4;Lc4;Lc4;)Lc4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public η(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public θ(JLc4;Lc4;Lc4;)Lc4;
    .locals 6

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Li0;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Li0;->θ(JLc4;Lc4;Lc4;)Lc4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public ι(Lc4;Lc4;Lc4;)Lc4;
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Li0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Li0;->ι(Lc4;Lc4;Lc4;)Lc4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public κ(Lc4;Lc4;Lc4;)J
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Li0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Li0;->κ(Lc4;Lc4;Lc4;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public λ()F
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    neg-float p0, p0

    .line 10
    return p0
.end method

.method public μ()V
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->θ:Landroid/widget/OverScroller;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ν()V
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Li0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public declared-synchronized ξ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lnq;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    .line 11
    return-object p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
.end method

.method public ο(Landroid/view/View;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/autofill/AutofillManager;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/autofill/AutofillManager;->notifyViewVisibilityChanged(Landroid/view/View;IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public π(Ln5;Landroidx/compose/ui/platform/AndroidComposeView;)Ln5;
    .locals 41

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, Ly21;->ε:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lzv0;

    .line 8
    .line 9
    new-instance v2, Lzv0;

    .line 10
    .line 11
    iget-object v3, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v2, v4}, Lzv0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v6, 0x0

    .line 27
    :goto_0
    if-ge v6, v4, :cond_2

    .line 28
    .line 29
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    check-cast v7, Lci1;

    .line 34
    .line 35
    iget-wide v8, v7, Lci1;->α:J

    .line 36
    .line 37
    invoke-virtual {v1, v8, v9}, Lzv0;->β(J)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    check-cast v10, Lbi1;

    .line 42
    .line 43
    if-nez v10, :cond_0

    .line 44
    .line 45
    iget-wide v10, v7, Lci1;->β:J

    .line 46
    .line 47
    iget-wide v12, v7, Lci1;->δ:J

    .line 48
    .line 49
    move-wide/from16 v25, v10

    .line 50
    .line 51
    move-wide/from16 v27, v12

    .line 52
    .line 53
    const/16 v29, 0x0

    .line 54
    .line 55
    move-object/from16 v10, p2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    iget-wide v11, v10, Lbi1;->α:J

    .line 59
    .line 60
    iget-boolean v13, v10, Lbi1;->γ:Z

    .line 61
    .line 62
    iget-wide v14, v10, Lbi1;->β:J

    .line 63
    .line 64
    move-object/from16 v10, p2

    .line 65
    .line 66
    invoke-virtual {v10, v14, v15}, Landroidx/compose/ui/platform/AndroidComposeView;->Ζ(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v14

    .line 70
    move-wide/from16 v25, v11

    .line 71
    .line 72
    move/from16 v29, v13

    .line 73
    .line 74
    move-wide/from16 v27, v14

    .line 75
    .line 76
    :goto_1
    iget-wide v11, v7, Lci1;->α:J

    .line 77
    .line 78
    new-instance v16, Lai1;

    .line 79
    .line 80
    iget-wide v13, v7, Lci1;->β:J

    .line 81
    .line 82
    move v15, v6

    .line 83
    iget-wide v5, v7, Lci1;->δ:J

    .line 84
    .line 85
    move-object/from16 v39, v3

    .line 86
    .line 87
    iget-boolean v3, v7, Lci1;->ε:Z

    .line 88
    .line 89
    move/from16 v23, v3

    .line 90
    .line 91
    iget v3, v7, Lci1;->ζ:F

    .line 92
    .line 93
    move/from16 v24, v3

    .line 94
    .line 95
    iget v3, v7, Lci1;->η:I

    .line 96
    .line 97
    move/from16 v30, v3

    .line 98
    .line 99
    iget-object v3, v7, Lci1;->ι:Ljava/util/ArrayList;

    .line 100
    .line 101
    move-object/from16 v31, v3

    .line 102
    .line 103
    move/from16 v40, v4

    .line 104
    .line 105
    iget-wide v3, v7, Lci1;->κ:J

    .line 106
    .line 107
    move-wide/from16 v32, v3

    .line 108
    .line 109
    iget v3, v7, Lci1;->λ:F

    .line 110
    .line 111
    move/from16 v34, v3

    .line 112
    .line 113
    iget-wide v3, v7, Lci1;->μ:J

    .line 114
    .line 115
    move-wide/from16 v35, v3

    .line 116
    .line 117
    iget-wide v3, v7, Lci1;->ν:J

    .line 118
    .line 119
    move-wide/from16 v37, v3

    .line 120
    .line 121
    move-wide/from16 v21, v5

    .line 122
    .line 123
    move-wide/from16 v17, v11

    .line 124
    .line 125
    move-wide/from16 v19, v13

    .line 126
    .line 127
    invoke-direct/range {v16 .. v38}, Lai1;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 128
    .line 129
    .line 130
    move-object/from16 v5, v16

    .line 131
    .line 132
    move-wide/from16 v3, v17

    .line 133
    .line 134
    invoke-virtual {v2, v3, v4, v5}, Lzv0;->δ(JLjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-boolean v3, v7, Lci1;->ε:Z

    .line 138
    .line 139
    if-eqz v3, :cond_1

    .line 140
    .line 141
    new-instance v16, Lbi1;

    .line 142
    .line 143
    iget-wide v4, v7, Lci1;->β:J

    .line 144
    .line 145
    iget-wide v6, v7, Lci1;->γ:J

    .line 146
    .line 147
    move/from16 v21, v3

    .line 148
    .line 149
    move-wide/from16 v17, v4

    .line 150
    .line 151
    move-wide/from16 v19, v6

    .line 152
    .line 153
    invoke-direct/range {v16 .. v21}, Lbi1;-><init>(JJZ)V

    .line 154
    .line 155
    .line 156
    move-object/from16 v3, v16

    .line 157
    .line 158
    invoke-virtual {v1, v8, v9, v3}, Lzv0;->δ(JLjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_1
    invoke-virtual {v1, v8, v9}, Lzv0;->ε(J)V

    .line 163
    .line 164
    .line 165
    :goto_2
    add-int/lit8 v6, v15, 0x1

    .line 166
    .line 167
    move-object/from16 v3, v39

    .line 168
    .line 169
    move/from16 v4, v40

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_2
    new-instance v1, Ln5;

    .line 174
    .line 175
    const/16 v3, 0x13

    .line 176
    .line 177
    const/4 v4, 0x0

    .line 178
    invoke-direct {v1, v3, v2, v0, v4}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 179
    .line 180
    .line 181
    return-object v1
.end method

.method public ρ(Lym0;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ly21;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Region;

    .line 4
    .line 5
    iget v0, p1, Lym0;->α:I

    .line 6
    .line 7
    iget v1, p1, Lym0;->β:I

    .line 8
    .line 9
    iget v2, p1, Lym0;->γ:I

    .line 10
    .line 11
    iget p1, p1, Lym0;->δ:I

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/graphics/Region;->set(IIII)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
