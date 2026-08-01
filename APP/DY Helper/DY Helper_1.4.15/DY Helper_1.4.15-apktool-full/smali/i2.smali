.class public final Li2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le50;
.implements Lrr;
.implements Lx32;
.implements Lt6;
.implements Lp52;
.implements Ltp;
.implements Lox1;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Li2;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p0, Lkw0;

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lkw0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Ltq1;->α:[J

    .line 16
    .line 17
    new-instance p0, Lb21;

    .line 18
    .line 19
    invoke-direct {p0}, Lb21;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 23
    iput p1, p0, Li2;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Α(Lw90;Lx90;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lui1;->Α()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0}, Li2;->φ(Lw90;)Lw90;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0, p1}, Li2;->Β(Lw90;Lx90;)Lw90;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "gesture_grid_first_vertical"

    .line 23
    .line 24
    iget v1, p0, Lw90;->α:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 27
    .line 28
    .line 29
    const-string v0, "gesture_grid_second_vertical"

    .line 30
    .line 31
    iget v1, p0, Lw90;->β:F

    .line 32
    .line 33
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 34
    .line 35
    .line 36
    const-string v0, "gesture_grid_first_horizontal"

    .line 37
    .line 38
    iget v1, p0, Lw90;->γ:F

    .line 39
    .line 40
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 41
    .line 42
    .line 43
    const-string v0, "gesture_grid_second_horizontal"

    .line 44
    .line 45
    iget v1, p0, Lw90;->δ:F

    .line 46
    .line 47
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 48
    .line 49
    .line 50
    const-string v0, "gesture_grid_left_margin"

    .line 51
    .line 52
    iget v1, p0, Lw90;->ε:F

    .line 53
    .line 54
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 55
    .line 56
    .line 57
    const-string v0, "gesture_grid_right_margin"

    .line 58
    .line 59
    iget v1, p0, Lw90;->ζ:F

    .line 60
    .line 61
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 62
    .line 63
    .line 64
    const-string v0, "gesture_grid_top_margin"

    .line 65
    .line 66
    iget v1, p0, Lw90;->η:F

    .line 67
    .line 68
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 69
    .line 70
    .line 71
    const-string v0, "gesture_grid_bottom_margin"

    .line 72
    .line 73
    iget v1, p0, Lw90;->θ:F

    .line 74
    .line 75
    invoke-static {v0, v1}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 76
    .line 77
    .line 78
    const-string v0, "gesture_grid_sync_left_right"

    .line 79
    .line 80
    iget-boolean v1, p1, Lx90;->α:Z

    .line 81
    .line 82
    invoke-static {v0, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    const-string v0, "gesture_grid_sync_top_bottom"

    .line 86
    .line 87
    iget-boolean v1, p1, Lx90;->β:Z

    .line 88
    .line 89
    invoke-static {v0, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Li2;->σ()Lw90;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0, p0}, Lw90;->β(Lw90;Lw90;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_1

    .line 101
    .line 102
    invoke-static {}, Li2;->τ()Lx90;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0, p1}, Lx90;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_1

    .line 111
    .line 112
    const/4 p0, 0x1

    .line 113
    return p0

    .line 114
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 115
    return p0
.end method

.method public static Β(Lw90;Lx90;)Lw90;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Li2;->φ(Lw90;)Lw90;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget p0, v0, Lw90;->ε:F

    .line 12
    .line 13
    iget v1, v0, Lw90;->ζ:F

    .line 14
    .line 15
    add-float v2, p0, v1

    .line 16
    .line 17
    const/high16 v3, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr v2, v3

    .line 20
    const v4, 0x3eb33333    # 0.35f

    .line 21
    .line 22
    .line 23
    cmpl-float v5, v2, v4

    .line 24
    .line 25
    if-lez v5, :cond_0

    .line 26
    .line 27
    move v2, v4

    .line 28
    :cond_0
    iget v5, v0, Lw90;->η:F

    .line 29
    .line 30
    iget v6, v0, Lw90;->θ:F

    .line 31
    .line 32
    add-float v7, v5, v6

    .line 33
    .line 34
    div-float/2addr v7, v3

    .line 35
    cmpl-float v3, v7, v4

    .line 36
    .line 37
    if-lez v3, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v4, v7

    .line 41
    :goto_0
    iget-boolean v3, p1, Lx90;->α:Z

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    move p0, v2

    .line 46
    :cond_2
    if-eqz v3, :cond_3

    .line 47
    .line 48
    move v1, v2

    .line 49
    :cond_3
    iget-boolean p1, p1, Lx90;->β:Z

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    move v7, v4

    .line 54
    goto :goto_1

    .line 55
    :cond_4
    move v7, v5

    .line 56
    :goto_1
    if-eqz p1, :cond_5

    .line 57
    .line 58
    move v8, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_5
    move v8, v6

    .line 61
    :goto_2
    const/16 v9, 0xf

    .line 62
    .line 63
    move v6, v1

    .line 64
    const/4 v1, 0x0

    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    move v5, p0

    .line 69
    invoke-static/range {v0 .. v9}, Lw90;->α(Lw90;FFFFFFFFI)Lw90;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static final ε(Li2;Ljava/lang/String;)Luf;
    .locals 1

    .line 1
    new-instance p0, Luf;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Luf;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Luf;->δ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static final ζ(Li7;)V
    .locals 8

    .line 1
    sget-object v0, Li7;->θ:Lv;

    .line 2
    .line 3
    sget-object v0, Li7;->ι:Li7;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Li7;

    .line 9
    .line 10
    invoke-direct {v0}, Li7;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Li7;->ι:Li7;

    .line 14
    .line 15
    new-instance v0, Lh7;

    .line 16
    .line 17
    const-string v2, "Okio Watchdog"

    .line 18
    .line 19
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    iget-wide v4, p0, Lm42;->γ:J

    .line 33
    .line 34
    iget-boolean v0, p0, Lm42;->α:Z

    .line 35
    .line 36
    const-wide/16 v6, 0x0

    .line 37
    .line 38
    cmp-long v6, v4, v6

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lm42;->γ()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    sub-long/2addr v6, v2

    .line 49
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    add-long/2addr v4, v2

    .line 54
    iput-wide v4, p0, Li7;->η:J

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-eqz v6, :cond_2

    .line 58
    .line 59
    add-long/2addr v2, v4

    .line 60
    iput-wide v2, p0, Li7;->η:J

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    if-eqz v0, :cond_5

    .line 64
    .line 65
    invoke-virtual {p0}, Lm42;->γ()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    iput-wide v2, p0, Li7;->η:J

    .line 70
    .line 71
    :goto_0
    sget-object v0, Li7;->θ:Lv;

    .line 72
    .line 73
    iget v2, v0, Lv;->α:I

    .line 74
    .line 75
    add-int/2addr v2, v1

    .line 76
    iput v2, v0, Lv;->α:I

    .line 77
    .line 78
    iget-object v3, v0, Lv;->β:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, [Li7;

    .line 81
    .line 82
    array-length v4, v3

    .line 83
    if-ne v2, v4, :cond_3

    .line 84
    .line 85
    mul-int/lit8 v4, v2, 0x2

    .line 86
    .line 87
    new-array v4, v4, [Li7;

    .line 88
    .line 89
    const/16 v5, 0xe

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-static {v3, v4, v6, v6, v5}, Lg7;->Π([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 93
    .line 94
    .line 95
    iput-object v4, v0, Lv;->β:Ljava/lang/Object;

    .line 96
    .line 97
    :cond_3
    invoke-virtual {v0, v2, p0}, Lv;->δ(ILi7;)V

    .line 98
    .line 99
    .line 100
    iget p0, p0, Li7;->ζ:I

    .line 101
    .line 102
    if-ne p0, v1, :cond_4

    .line 103
    .line 104
    sget-object p0, Li7;->λ:Ljava/util/concurrent/locks/Condition;

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void

    .line 110
    :cond_5
    new-instance p0, Ljava/lang/AssertionError;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p0
.end method

.method public static final η(F[F[F)F
    .locals 7

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1, v0}, Ljava/util/Arrays;->binarySearch([FF)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ltz v2, :cond_0

    .line 14
    .line 15
    aget p0, p2, v2

    .line 16
    .line 17
    mul-float/2addr v1, p0

    .line 18
    return v1

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    neg-int v2, v2

    .line 22
    add-int/lit8 v3, v2, -0x1

    .line 23
    .line 24
    array-length v4, p1

    .line 25
    add-int/lit8 v4, v4, -0x1

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-lt v3, v4, :cond_2

    .line 29
    .line 30
    array-length v0, p1

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    aget v0, p1, v0

    .line 34
    .line 35
    array-length p1, p1

    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    aget p1, p2, p1

    .line 39
    .line 40
    cmpg-float p2, v0, v5

    .line 41
    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    return v5

    .line 45
    :cond_1
    div-float/2addr p1, v0

    .line 46
    mul-float/2addr p1, p0

    .line 47
    return p1

    .line 48
    :cond_2
    const/4 p0, -0x1

    .line 49
    if-ne v3, p0, :cond_3

    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    aget p1, p1, p0

    .line 53
    .line 54
    aget p0, p2, p0

    .line 55
    .line 56
    move p2, p1

    .line 57
    move p1, v5

    .line 58
    move v3, p1

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    aget p0, p1, v3

    .line 61
    .line 62
    aget p1, p1, v2

    .line 63
    .line 64
    aget v3, p2, v3

    .line 65
    .line 66
    aget p2, p2, v2

    .line 67
    .line 68
    move v6, p1

    .line 69
    move p1, p0

    .line 70
    move p0, p2

    .line 71
    move p2, v6

    .line 72
    :goto_0
    cmpg-float v2, p1, p2

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    move v0, v5

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    sub-float/2addr v0, p1

    .line 79
    sub-float/2addr p2, p1

    .line 80
    div-float/2addr v0, p2

    .line 81
    :goto_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {v5, p1}, Ljava/lang/Math;->max(FF)F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    sub-float/2addr p0, v3

    .line 92
    mul-float/2addr p0, p1

    .line 93
    add-float/2addr p0, v3

    .line 94
    mul-float/2addr p0, v1

    .line 95
    return p0
.end method

.method public static θ()Li7;
    .locals 9

    .line 1
    sget-object v0, Li7;->θ:Lv;

    .line 2
    .line 3
    iget-object v1, v0, Lv;->β:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [Li7;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    sget-object v1, Li7;->λ:Ljava/util/concurrent/locks/Condition;

    .line 18
    .line 19
    sget-wide v6, Li7;->μ:J

    .line 20
    .line 21
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    invoke-interface {v1, v6, v7, v8}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Lv;->β:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, [Li7;

    .line 29
    .line 30
    aget-object v0, v0, v2

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    sub-long/2addr v0, v4

    .line 39
    sget-wide v4, Li7;->ν:J

    .line 40
    .line 41
    cmp-long v0, v0, v4

    .line 42
    .line 43
    if-ltz v0, :cond_0

    .line 44
    .line 45
    sget-object v0, Li7;->ι:Li7;

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_0
    return-object v3

    .line 49
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    iget-wide v6, v1, Li7;->η:J

    .line 54
    .line 55
    sub-long/2addr v6, v4

    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    cmp-long v2, v6, v4

    .line 59
    .line 60
    if-lez v2, :cond_2

    .line 61
    .line 62
    sget-object v0, Li7;->λ:Ljava/util/concurrent/locks/Condition;

    .line 63
    .line 64
    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 65
    .line 66
    invoke-interface {v0, v6, v7, v1}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 67
    .line 68
    .line 69
    return-object v3

    .line 70
    :cond_2
    invoke-virtual {v0, v1}, Lv;->ζ(Li7;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x2

    .line 74
    iput v0, v1, Li7;->ε:I

    .line 75
    .line 76
    return-object v1
.end method

.method public static ι(FFLw90;)Lv90;
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Li2;->φ(Lw90;)Lw90;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    new-instance v0, Lv90;

    .line 9
    .line 10
    iget v1, p2, Lw90;->ε:F

    .line 11
    .line 12
    mul-float/2addr v1, p0

    .line 13
    iget v2, p2, Lw90;->η:F

    .line 14
    .line 15
    mul-float/2addr v2, p1

    .line 16
    iget v3, p2, Lw90;->ζ:F

    .line 17
    .line 18
    const/high16 v4, 0x3f800000    # 1.0f

    .line 19
    .line 20
    sub-float v3, v4, v3

    .line 21
    .line 22
    mul-float/2addr v3, p0

    .line 23
    iget p0, p2, Lw90;->θ:F

    .line 24
    .line 25
    sub-float/2addr v4, p0

    .line 26
    mul-float/2addr v4, p1

    .line 27
    invoke-direct {v0, v1, v2, v3, v4}, Lv90;-><init>(FFFF)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static λ(Ljava/lang/String;)Ldd;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rem-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_0

    .line 19
    .line 20
    mul-int/lit8 v3, v2, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Lyh;->ε(C)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    shl-int/lit8 v4, v4, 0x4

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v3}, Lyh;->ε(C)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v3, v4

    .line 43
    int-to-byte v3, v3

    .line 44
    aput-byte v3, v1, v2

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Ldd;

    .line 50
    .line 51
    invoke-direct {p0, v1}, Ldd;-><init>([B)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    const-string v0, "Unexpected hex string: "

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public static μ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "\u65e0"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p0, "\u672a\u8bbe\u7f6e"

    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public static ν(Ljava/lang/String;)Ldd;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldd;

    .line 5
    .line 6
    sget-object v1, Lmf;->α:Ljava/nio/charset/Charset;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ldd;-><init>([B)V

    .line 16
    .line 17
    .line 18
    iput-object p0, v0, Ldd;->η:Ljava/lang/String;

    .line 19
    .line 20
    return-object v0
.end method

.method public static ο(Lpy;Landroid/text/Editable;IIZ)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_19

    .line 3
    .line 4
    if-ltz p2, :cond_19

    .line 5
    .line 6
    if-gez p3, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-eq v1, v3, :cond_19

    .line 20
    .line 21
    if-eq v2, v3, :cond_19

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x1

    .line 28
    if-eqz p4, :cond_16

    .line 29
    .line 30
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-ltz v1, :cond_3

    .line 39
    .line 40
    if-ge p4, v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-gez p2, :cond_4

    .line 44
    .line 45
    :cond_3
    :goto_0
    move v1, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_1
    move p4, v0

    .line 48
    :goto_2
    if-nez p2, :cond_5

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gez v1, :cond_7

    .line 54
    .line 55
    if-eqz p4, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    move v1, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_7
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz p4, :cond_9

    .line 65
    .line 66
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-nez p4, :cond_8

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_8
    add-int/lit8 p2, p2, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_a

    .line 81
    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_a
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_b

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_b
    move p4, v4

    .line 93
    goto :goto_2

    .line 94
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-ltz v2, :cond_d

    .line 103
    .line 104
    if-ge p3, v2, :cond_c

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_c
    if-gez p2, :cond_e

    .line 108
    .line 109
    :cond_d
    :goto_4
    move p3, v3

    .line 110
    goto :goto_7

    .line 111
    :cond_e
    :goto_5
    move p4, v0

    .line 112
    :goto_6
    if-nez p2, :cond_f

    .line 113
    .line 114
    move p3, v2

    .line 115
    goto :goto_7

    .line 116
    :cond_f
    if-lt v2, p3, :cond_10

    .line 117
    .line 118
    if-eqz p4, :cond_15

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_10
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz p4, :cond_12

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    if-nez p4, :cond_11

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_11
    add-int/lit8 p2, p2, -0x1

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_13

    .line 144
    .line 145
    add-int/lit8 p2, p2, -0x1

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_13
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    if-eqz p4, :cond_14

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    move p4, v4

    .line 160
    goto :goto_6

    .line 161
    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    .line 162
    .line 163
    if-ne p3, v3, :cond_17

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_16
    sub-int/2addr v1, p2

    .line 167
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v2, p3

    .line 172
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    :cond_17
    const-class p2, Ll62;

    .line 181
    .line 182
    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, [Ll62;

    .line 187
    .line 188
    if-eqz p2, :cond_19

    .line 189
    .line 190
    array-length p4, p2

    .line 191
    if-lez p4, :cond_19

    .line 192
    .line 193
    array-length p4, p2

    .line 194
    move v2, v0

    .line 195
    :goto_8
    if-ge v2, p4, :cond_18

    .line 196
    .line 197
    aget-object v3, p2, v2

    .line 198
    .line 199
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result p4

    .line 226
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result p3

    .line 230
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 231
    .line 232
    .line 233
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 237
    .line 238
    .line 239
    return v4

    .line 240
    :cond_19
    :goto_9
    return v0
.end method

.method public static π(FFFFLw90;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    cmpg-float v1, p2, v0

    .line 6
    .line 7
    if-lez v1, :cond_6

    .line 8
    .line 9
    cmpg-float v1, p3, v0

    .line 10
    .line 11
    if-lez v1, :cond_6

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 18
    .line 19
    .line 20
    cmpg-float v1, v1, v2

    .line 21
    .line 22
    if-gtz v1, :cond_6

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    cmpg-float v1, v1, v2

    .line 29
    .line 30
    if-gtz v1, :cond_6

    .line 31
    .line 32
    cmpg-float v1, p0, v0

    .line 33
    .line 34
    if-ltz v1, :cond_6

    .line 35
    .line 36
    cmpl-float v1, p0, p2

    .line 37
    .line 38
    if-gtz v1, :cond_6

    .line 39
    .line 40
    cmpg-float v0, p1, v0

    .line 41
    .line 42
    if-ltz v0, :cond_6

    .line 43
    .line 44
    cmpl-float v0, p1, p3

    .line 45
    .line 46
    if-lez v0, :cond_0

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_0
    invoke-static {p4}, Li2;->φ(Lw90;)Lw90;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    invoke-static {p2, p3, p4}, Li2;->ι(FFLw90;)Lv90;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget p3, p2, Lv90;->β:F

    .line 59
    .line 60
    iget v0, p2, Lv90;->α:F

    .line 61
    .line 62
    cmpg-float v1, p0, v0

    .line 63
    .line 64
    if-ltz v1, :cond_6

    .line 65
    .line 66
    iget v1, p2, Lv90;->γ:F

    .line 67
    .line 68
    cmpl-float v1, p0, v1

    .line 69
    .line 70
    if-gez v1, :cond_6

    .line 71
    .line 72
    cmpg-float v1, p1, p3

    .line 73
    .line 74
    if-ltz v1, :cond_6

    .line 75
    .line 76
    iget v1, p2, Lv90;->δ:F

    .line 77
    .line 78
    cmpl-float v1, p1, v1

    .line 79
    .line 80
    if-ltz v1, :cond_1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    sub-float/2addr p0, v0

    .line 84
    invoke-virtual {p2}, Lv90;->β()F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    div-float/2addr p0, v0

    .line 89
    sub-float/2addr p1, p3

    .line 90
    invoke-virtual {p2}, Lv90;->α()F

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    div-float/2addr p1, p2

    .line 95
    iget p2, p4, Lw90;->α:F

    .line 96
    .line 97
    cmpg-float p2, p0, p2

    .line 98
    .line 99
    const/4 p3, 0x2

    .line 100
    const/4 v0, 0x1

    .line 101
    const/4 v1, 0x0

    .line 102
    if-gez p2, :cond_2

    .line 103
    .line 104
    move p0, v1

    .line 105
    goto :goto_0

    .line 106
    :cond_2
    iget p2, p4, Lw90;->β:F

    .line 107
    .line 108
    cmpg-float p0, p0, p2

    .line 109
    .line 110
    if-gez p0, :cond_3

    .line 111
    .line 112
    move p0, v0

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    move p0, p3

    .line 115
    :goto_0
    iget p2, p4, Lw90;->γ:F

    .line 116
    .line 117
    cmpg-float p2, p1, p2

    .line 118
    .line 119
    if-gez p2, :cond_4

    .line 120
    .line 121
    move p3, v1

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    iget p2, p4, Lw90;->δ:F

    .line 124
    .line 125
    cmpg-float p1, p1, p2

    .line 126
    .line 127
    if-gez p1, :cond_5

    .line 128
    .line 129
    move p3, v0

    .line 130
    :cond_5
    :goto_1
    mul-int/lit8 p3, p3, 0x3

    .line 131
    .line 132
    add-int/2addr p3, p0

    .line 133
    packed-switch p3, :pswitch_data_0

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :pswitch_0
    const-string p0, "\u53f3\u4e0b\u533a\u57df"

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_1
    const-string p0, "\u5e95\u90e8\u533a\u57df"

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_2
    const-string p0, "\u5de6\u4e0b\u533a\u57df"

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_3
    const-string p0, "\u53f3\u4fa7\u4e92\u52a8\u533a"

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_4
    const-string p0, "\u4e2d\u95f4\u533a\u57df"

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_5
    const-string p0, "\u5de6\u4fa7\u4e92\u52a8\u533a"

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_6
    const-string p0, "\u53f3\u4e0a\u533a\u57df"

    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_7
    const-string p0, "\u9876\u90e8\u533a\u57df"

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_8
    const-string p0, "\u5de6\u4e0a\u533a\u57df"

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 165
    return-object p0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ρ(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->φ:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static σ()Lw90;
    .locals 11

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v1, Lw90;

    .line 11
    .line 12
    const-string v0, "gesture_grid_first_vertical"

    .line 13
    .line 14
    sget-object v2, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 15
    .line 16
    const v2, 0x3eaaaaab

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 24
    .line 25
    .line 26
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move v0, v2

    .line 29
    :goto_0
    const-string v3, "gesture_grid_second_vertical"

    .line 30
    .line 31
    const v4, 0x3f2aaaab

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-interface {v5, v3, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 39
    .line 40
    .line 41
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    goto :goto_1

    .line 43
    :catchall_1
    move v3, v4

    .line 44
    :goto_1
    const-string v5, "gesture_grid_first_horizontal"

    .line 45
    .line 46
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {v6, v5, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 51
    .line 52
    .line 53
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 54
    :catchall_2
    const-string v5, "gesture_grid_second_horizontal"

    .line 55
    .line 56
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-interface {v6, v5, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 61
    .line 62
    .line 63
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 64
    :catchall_3
    move v5, v4

    .line 65
    const-string v4, "gesture_grid_left_margin"

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-interface {v7, v4, v6}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 73
    .line 74
    .line 75
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 76
    goto :goto_2

    .line 77
    :catchall_4
    move v4, v6

    .line 78
    :goto_2
    const-string v7, "gesture_grid_right_margin"

    .line 79
    .line 80
    :try_start_5
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-interface {v8, v7, v6}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 85
    .line 86
    .line 87
    move-result v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 88
    goto :goto_3

    .line 89
    :catchall_5
    move v7, v6

    .line 90
    :goto_3
    const-string v8, "gesture_grid_top_margin"

    .line 91
    .line 92
    :try_start_6
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-interface {v9, v8, v6}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 97
    .line 98
    .line 99
    move-result v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 100
    goto :goto_4

    .line 101
    :catchall_6
    move v8, v6

    .line 102
    :goto_4
    const-string v9, "gesture_grid_bottom_margin"

    .line 103
    .line 104
    :try_start_7
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-interface {v10, v9, v6}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 109
    .line 110
    .line 111
    move-result v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 112
    :catchall_7
    move v9, v6

    .line 113
    move v6, v4

    .line 114
    move v4, v2

    .line 115
    move v2, v0

    .line 116
    invoke-direct/range {v1 .. v9}, Lw90;-><init>(FFFFFFFF)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Li2;->φ(Lw90;)Lw90;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0
.end method

.method public static τ()Lx90;
    .locals 4

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->ο:Lx90;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Lx90;

    .line 11
    .line 12
    const-string v1, "gesture_grid_sync_left_right"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v3, "gesture_grid_sync_top_bottom"

    .line 20
    .line 21
    invoke-static {v3, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-direct {v0, v1, v2}, Lx90;-><init>(ZZ)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public static υ(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const-string v1, "\u6253\u5f00\u8bc4\u8bba\u533a"

    .line 22
    .line 23
    const-string v2, "\u5206\u4eab\u4f5c\u54c1"

    .line 24
    .line 25
    const-string v3, "\u5173\u6ce8\u4f5c\u8005"

    .line 26
    .line 27
    const-string v4, "\u6253\u5f00\u4f5c\u8005\u4e3b\u9875"

    .line 28
    .line 29
    const-string v5, "\u6536\u85cf\u4f5c\u54c1"

    .line 30
    .line 31
    const-string v6, "\u70b9\u8d5e\u4f5c\u54c1"

    .line 32
    .line 33
    sparse-switch v0, :sswitch_data_0

    .line 34
    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :sswitch_0
    const-string v0, "\u6dfb\u52a0\u4e2a\u4eba\u4e3b\u9875\u4e66\u7b7e"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_2
    return-object v0

    .line 49
    :sswitch_1
    const-string v0, "\u6dfb\u52a0\u4f5c\u54c1\u4e66\u7b7e"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_3

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_3
    return-object v0

    .line 60
    :sswitch_2
    const-string v0, "\u5207\u6362\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_4

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_4
    return-object v0

    .line 71
    :sswitch_3
    const-string v0, "\u6e05\u723d\u6a21\u5f0f\u5f00\u5173"

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_5

    .line 78
    .line 79
    goto/16 :goto_2

    .line 80
    .line 81
    :cond_5
    return-object v0

    .line 82
    :sswitch_4
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_8

    .line 87
    .line 88
    goto/16 :goto_2

    .line 89
    .line 90
    :sswitch_5
    const-string v0, "\u6a21\u5757\u83dc\u5355"

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_6

    .line 97
    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :cond_6
    return-object v0

    .line 101
    :sswitch_6
    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_9

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :sswitch_7
    const-string v0, "\u64cd\u4f5c\u83dc\u5355"

    .line 110
    .line 111
    :goto_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :sswitch_8
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-nez p0, :cond_11

    .line 121
    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :sswitch_9
    const-string v0, "\u53d1\u5e03\u6309\u94ae"

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-nez p0, :cond_7

    .line 131
    .line 132
    goto/16 :goto_2

    .line 133
    .line 134
    :cond_7
    return-object v0

    .line 135
    :sswitch_a
    const-string v0, "\u53f3\u4fa7\u8bc4\u8bba"

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-nez p0, :cond_13

    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :sswitch_b
    const-string v0, "\u53f3\u4fa7\u70b9\u8d5e"

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_8

    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :cond_8
    return-object v6

    .line 156
    :sswitch_c
    const-string v0, "\u53f3\u4fa7\u6536\u85cf"

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_9

    .line 163
    .line 164
    goto/16 :goto_2

    .line 165
    .line 166
    :cond_9
    return-object v5

    .line 167
    :sswitch_d
    const-string v0, "\u53f3\u4fa7\u5173\u6ce8"

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-nez p0, :cond_a

    .line 174
    .line 175
    goto/16 :goto_2

    .line 176
    .line 177
    :sswitch_e
    const-string v0, "\u53f3\u4fa7\u5206\u4eab"

    .line 178
    .line 179
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_b

    .line 184
    .line 185
    goto/16 :goto_2

    .line 186
    .line 187
    :sswitch_f
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    if-nez p0, :cond_a

    .line 192
    .line 193
    goto/16 :goto_2

    .line 194
    .line 195
    :cond_a
    return-object v3

    .line 196
    :sswitch_10
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-nez p0, :cond_b

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_b
    return-object v2

    .line 204
    :sswitch_11
    const-string v0, "\u4fee\u6539\u500d\u901f"

    .line 205
    .line 206
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-nez p0, :cond_c

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_c
    return-object v0

    .line 214
    :sswitch_12
    const-string v0, "\u4e00\u952e\u5df2\u8bfb"

    .line 215
    .line 216
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-nez p0, :cond_d

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_d
    return-object v0

    .line 224
    :sswitch_13
    const-string v0, "\u4e0b\u8f7d\u97f3\u9891"

    .line 225
    .line 226
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-nez p0, :cond_e

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_e
    return-object v0

    .line 234
    :sswitch_14
    const-string v0, "\u4e0b\u8f7d\u4f5c\u54c1"

    .line 235
    .line 236
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    if-nez p0, :cond_f

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_f
    return-object v0

    .line 244
    :sswitch_15
    const-string v0, "\u4e0d\u611f\u5174\u8da3"

    .line 245
    .line 246
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    if-nez p0, :cond_10

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_10
    return-object v0

    .line 254
    :sswitch_16
    const-string v0, "\u53f3\u4fa7\u4f5c\u8005\u4e3b\u9875"

    .line 255
    .line 256
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    if-nez p0, :cond_11

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_11
    return-object v4

    .line 264
    :sswitch_17
    const-string v0, "\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 265
    .line 266
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    if-nez p0, :cond_12

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_12
    return-object v0

    .line 274
    :sswitch_18
    const-string v0, "\u8c03\u8bd5\u53f3\u4fa7\u626b\u63cf"

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :sswitch_19
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    if-nez p0, :cond_13

    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_13
    return-object v1

    .line 286
    :sswitch_1a
    const-string v0, "\u4e00\u952e\u7eed\u706b\u82b1"

    .line 287
    .line 288
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    if-nez p0, :cond_14

    .line 293
    .line 294
    :goto_2
    const-string p0, "\u65e0"

    .line 295
    .line 296
    return-object p0

    .line 297
    :cond_14
    return-object v0

    .line 298
    nop

    .line 299
    :sswitch_data_0
    .sparse-switch
        -0x6f1be69b -> :sswitch_1a
        -0x6921d4a9 -> :sswitch_19
        -0x3a8d54f6 -> :sswitch_18
        -0x383aa726 -> :sswitch_17
        -0x36aae869 -> :sswitch_16
        0x24f1dae1 -> :sswitch_15
        0x259e8737 -> :sswitch_14
        0x25a79550 -> :sswitch_13
        0x25b0dff7 -> :sswitch_12
        0x25dbbdfd -> :sswitch_11
        0x267a690a -> :sswitch_10
        0x26a944be -> :sswitch_f
        0x275e8279 -> :sswitch_e
        0x275e8ee9 -> :sswitch_d
        0x27610c6d -> :sswitch_c
        0x276278d9 -> :sswitch_b
        0x2765bd8a -> :sswitch_a
        0x27874a97 -> :sswitch_9
        0x2945c010 -> :sswitch_8
        0x2f0c7f68 -> :sswitch_7
        0x300245fe -> :sswitch_6
        0x31967ecf -> :sswitch_5
        0x355a476a -> :sswitch_4
        0x391e98d9 -> :sswitch_3
        0x50be4979 -> :sswitch_2
        0x5e3d5f02 -> :sswitch_1
        0x65aa3707 -> :sswitch_0
    .end sparse-switch
.end method

.method public static φ(Lw90;)Lw90;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lw90;->α:F

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 17
    .line 18
    .line 19
    cmpg-float v1, v1, v3

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-gtz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v2, v4

    .line 26
    :goto_0
    const v1, 0x3eaaaaab

    .line 27
    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    sget-object v2, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 37
    .line 38
    move v2, v1

    .line 39
    :goto_1
    iget v5, v0, Lw90;->β:F

    .line 40
    .line 41
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    cmpg-float v5, v5, v3

    .line 50
    .line 51
    if-gtz v5, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move-object v6, v4

    .line 55
    :goto_2
    const v5, 0x3f2aaaab

    .line 56
    .line 57
    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    sget-object v6, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 66
    .line 67
    move v6, v5

    .line 68
    :goto_3
    iget v7, v0, Lw90;->γ:F

    .line 69
    .line 70
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    cmpg-float v7, v7, v3

    .line 79
    .line 80
    if-gtz v7, :cond_4

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    move-object v8, v4

    .line 84
    :goto_4
    if-eqz v8, :cond_5

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    goto :goto_5

    .line 91
    :cond_5
    sget-object v7, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 92
    .line 93
    :goto_5
    iget v7, v0, Lw90;->δ:F

    .line 94
    .line 95
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    cmpg-float v3, v7, v3

    .line 104
    .line 105
    if-gtz v3, :cond_6

    .line 106
    .line 107
    move-object v4, v8

    .line 108
    :cond_6
    if-eqz v4, :cond_7

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    goto :goto_6

    .line 115
    :cond_7
    sget-object v3, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 116
    .line 117
    :goto_6
    iget v3, v0, Lw90;->ε:F

    .line 118
    .line 119
    iget v4, v0, Lw90;->ζ:F

    .line 120
    .line 121
    sget-object v7, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 122
    .line 123
    invoke-static {v3, v4}, Li2;->χ(FF)Ll91;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget v4, v0, Lw90;->η:F

    .line 128
    .line 129
    iget v0, v0, Lw90;->θ:F

    .line 130
    .line 131
    invoke-static {v4, v0}, Li2;->χ(FF)Ll91;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const v4, 0x3e19999a    # 0.15f

    .line 136
    .line 137
    .line 138
    const v7, 0x3f333333    # 0.7f

    .line 139
    .line 140
    .line 141
    invoke-static {v2, v4, v7}, Lj81;->λ(FFF)F

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    add-float v2, v9, v4

    .line 146
    .line 147
    const v8, 0x3f59999a    # 0.85f

    .line 148
    .line 149
    .line 150
    invoke-static {v6, v2, v8}, Lj81;->λ(FFF)F

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    invoke-static {v1, v4, v7}, Lj81;->λ(FFF)F

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    add-float/2addr v4, v11

    .line 159
    invoke-static {v5, v4, v8}, Lj81;->λ(FFF)F

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    new-instance v8, Lw90;

    .line 164
    .line 165
    iget-object v1, v3, Ll91;->ε:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    iget-object v1, v3, Ll91;->ζ:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v1, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    iget-object v1, v0, Ll91;->ε:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result v15

    .line 189
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 194
    .line 195
    .line 196
    move-result v16

    .line 197
    invoke-direct/range {v8 .. v16}, Lw90;-><init>(FFFFFFFF)V

    .line 198
    .line 199
    .line 200
    return-object v8
.end method

.method public static χ(FF)Ll91;
    .locals 5

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    .line 11
    .line 12
    cmpg-float p0, p0, v1

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-gtz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    :goto_0
    const/4 p0, 0x0

    .line 20
    const v3, 0x3ee66666    # 0.45f

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0, p0, v3}, Lj81;->λ(FFF)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v0, p0

    .line 35
    :goto_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    cmpg-float p1, p1, v1

    .line 44
    .line 45
    if-gtz p1, :cond_2

    .line 46
    .line 47
    move-object v2, v4

    .line 48
    :cond_2
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p1, p0, v3}, Lj81;->λ(FFF)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    :cond_3
    add-float p1, v0, p0

    .line 59
    .line 60
    const v1, 0x3f333333    # 0.7f

    .line 61
    .line 62
    .line 63
    cmpl-float v2, p1, v1

    .line 64
    .line 65
    if-lez v2, :cond_4

    .line 66
    .line 67
    div-float/2addr v1, p1

    .line 68
    mul-float/2addr v0, v1

    .line 69
    mul-float/2addr p0, v1

    .line 70
    :cond_4
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v0, Ll91;

    .line 79
    .line 80
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method

.method public static ψ(F)F
    .locals 6

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 6
    .line 7
    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_4

    .line 11
    .line 12
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->σ:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    :goto_0
    move-object p0, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v2, v1

    .line 39
    check-cast v2, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sub-float/2addr v2, p0

    .line 46
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    move-object v4, v3

    .line 55
    check-cast v4, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    sub-float/2addr v4, p0

    .line 62
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-static {v2, v4}, Ljava/lang/Float;->compare(FF)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-lez v5, :cond_3

    .line 71
    .line 72
    move-object v1, v3

    .line 73
    move v2, v4

    .line 74
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :goto_1
    check-cast p0, Ljava/lang/Float;

    .line 82
    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_4
    const/high16 p0, 0x40000000    # 2.0f

    .line 91
    .line 92
    return p0
.end method

.method public static ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "gesture_"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, "_"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Li2;->ε:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    const-string p0, "CompositionErrorContext"

    .line 12
    .line 13
    return-object p0

    .line 14
    :sswitch_1
    const-string p0, "Empty"

    .line 15
    .line 16
    return-object p0

    .line 17
    :sswitch_2
    const-string p0, "Arrangement#Top"

    .line 18
    .line 19
    return-object p0

    .line 20
    :sswitch_3
    const-string p0, "Arrangement#Start"

    .line 21
    .line 22
    return-object p0

    .line 23
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_3
        0x6 -> :sswitch_2
        0xd -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public α(Ljavax/net/ssl/SSLSocket;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string p1, "com.google.android.gms.org.conscrypt."

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, p1, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public γ(Ljavax/net/ssl/SSLSocket;)Lmx1;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move-object p1, p0

    .line 6
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "OpenSSLSocketImpl"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "No OpenSSLSocketImpl superclass of socket of type "

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    new-instance p0, Lc3;

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lc3;-><init>(Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    return-object p0
.end method

.method public δ(ILrx0;[I[I)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p3, p4, p0}, Lu6;->β([I[IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public κ(JJ)J
    .locals 5

    .line 1
    iget p0, p0, Li2;->ε:I

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    const-wide v1, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    shr-long v3, p1, v0

    .line 14
    .line 15
    long-to-int p0, v3

    .line 16
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    shr-long v3, p3, v0

    .line 21
    .line 22
    long-to-int v3, v3

    .line 23
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    cmpg-float p0, p0, v3

    .line 28
    .line 29
    if-gtz p0, :cond_0

    .line 30
    .line 31
    and-long v3, p1, v1

    .line 32
    .line 33
    long-to-int p0, v3

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    and-long v3, p3, v1

    .line 39
    .line 40
    long-to-int v3, v3

    .line 41
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    cmpg-float p0, p0, v3

    .line 46
    .line 47
    if-gtz p0, :cond_0

    .line 48
    .line 49
    const/high16 p0, 0x3f800000    # 1.0f

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long p1, p1

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    int-to-long p3, p0

    .line 61
    shl-long p0, p1, v0

    .line 62
    .line 63
    and-long p2, p3, v1

    .line 64
    .line 65
    or-long/2addr p0, p2

    .line 66
    sget p2, Lsq1;->α:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {p1, p2, p3, p4}, Lkn0;->δ(JJ)F

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-long p1, p1

    .line 78
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    int-to-long p3, p0

    .line 83
    shl-long p0, p1, v0

    .line 84
    .line 85
    and-long p2, p3, v1

    .line 86
    .line 87
    or-long/2addr p0, p2

    .line 88
    sget p2, Lsq1;->α:I

    .line 89
    .line 90
    :goto_0
    return-wide p0

    .line 91
    :pswitch_0
    invoke-static {p1, p2, p3, p4}, Lkn0;->δ(JJ)F

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    int-to-long p1, p1

    .line 100
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    int-to-long p3, p0

    .line 105
    shl-long p0, p1, v0

    .line 106
    .line 107
    and-long p2, p3, v1

    .line 108
    .line 109
    or-long/2addr p0, p2

    .line 110
    sget p2, Lsq1;->α:I

    .line 111
    .line 112
    return-wide p0

    .line 113
    :pswitch_1
    shr-long v3, p3, v0

    .line 114
    .line 115
    long-to-int p0, v3

    .line 116
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    shr-long v3, p1, v0

    .line 121
    .line 122
    long-to-int v3, v3

    .line 123
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    div-float/2addr p0, v3

    .line 128
    and-long/2addr p3, v1

    .line 129
    long-to-int p3, p3

    .line 130
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    and-long/2addr p1, v1

    .line 135
    long-to-int p1, p1

    .line 136
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    div-float/2addr p3, p1

    .line 141
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    int-to-long p0, p0

    .line 146
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    int-to-long p2, p2

    .line 151
    shl-long/2addr p0, v0

    .line 152
    and-long/2addr p2, v1

    .line 153
    or-long/2addr p0, p2

    .line 154
    sget p2, Lsq1;->α:I

    .line 155
    .line 156
    return-wide p0

    .line 157
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized ξ(Ljava/lang/String;)Luf;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    sget-object v0, Luf;->δ:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Luf;

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const-string v1, "SSL_"

    .line 16
    .line 17
    const-string v2, "TLS_"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {p1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p1, v1, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v1, p1

    .line 52
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Luf;

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    new-instance v1, Luf;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Luf;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_3
    monitor-exit p0

    .line 72
    return-object v1

    .line 73
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    throw p1
.end method
