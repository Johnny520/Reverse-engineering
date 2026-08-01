.class public final Lkf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lkf;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/Map;

.field public static volatile δ:Ljava/lang/ref/WeakReference;

.field public static volatile ε:Ljava/lang/ref/WeakReference;

.field public static volatile ζ:J

.field public static volatile η:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkf;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkf;->α:Lkf;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lkf;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sput-object v0, Lkf;->γ:Ljava/util/Map;

    .line 29
    .line 30
    return-void
.end method

.method public static Γ(Landroid/view/View;F)Z
    .locals 6

    .line 1
    const-string v0, "getState"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "get_state"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Lwe;

    .line 20
    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    invoke-direct {v2, v3}, Lwe;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x6

    .line 27
    invoke-static {v0, v3, v2}, Lkf;->η(Ljava/lang/Object;ILa80;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    instance-of v2, p0, Landroid/widget/ProgressBar;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    check-cast p0, Landroid/widget/ProgressBar;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object p0, v3

    .line 43
    :goto_0
    if-nez p0, :cond_3

    .line 44
    .line 45
    :goto_1
    return v1

    .line 46
    :cond_3
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    int-to-float v2, v2

    .line 51
    const/4 v4, 0x0

    .line 52
    const/high16 v5, 0x42c80000    # 100.0f

    .line 53
    .line 54
    invoke-static {p1, v4, v5}, Lj81;->λ(FFF)F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    div-float/2addr p1, v5

    .line 59
    mul-float/2addr p1, v2

    .line 60
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {p1, v1, v2}, Lj81;->μ(III)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string p1, "LJJLIIIJILLIZJL"

    .line 80
    .line 81
    invoke-virtual {p0, p1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const/4 p1, 0x1

    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    new-instance p1, Leo1;

    .line 97
    .line 98
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    move-object p0, p1

    .line 102
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-nez p1, :cond_4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    new-instance p1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v0, "component seek failed: "

    .line 116
    .line 117
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lkf;->Ζ(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 131
    .line 132
    :goto_3
    check-cast p0, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    return p0
.end method

.method public static Ε(Landroid/view/View;F)Z
    .locals 3

    .line 1
    const-string v0, "getState"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "get_state"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "context"

    .line 19
    .line 20
    invoke-static {v0, p0}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-string v0, "LJIIL"

    .line 28
    .line 29
    invoke-static {p0, v0}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lkf;->κ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    :goto_0
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :cond_3
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/high16 v2, 0x42c80000    # 100.0f

    .line 54
    .line 55
    :try_start_0
    invoke-static {p1, v1, v2}, Lj81;->λ(FFF)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    new-instance p1, Leo1;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object p0, p1

    .line 80
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-nez p1, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance p1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v0, "state player seek failed: "

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Lkf;->Ζ(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 109
    .line 110
    :goto_2
    check-cast p0, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    return p0
.end method

.method public static Ζ(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Lkf;->η:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x9c4

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sput-wide v0, Lkf;->η:J

    .line 17
    .line 18
    invoke-static {p0}, Lkf;->ο(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final α(Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lkf;->γ:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lhf;

    .line 10
    .line 11
    invoke-direct {v1}, Lhf;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    check-cast v1, Lhf;

    .line 18
    .line 19
    iget-object v0, v1, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-eqz v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    sget-object v0, Lkf;->δ:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    invoke-static {p0, v0}, Lkf;->β(Landroid/view/View;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "bind latest aweme to "

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, "@"

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lkf;->ο(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    return-void
.end method

.method public static β(Landroid/view/View;Ljava/lang/Object;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lkf;->γ:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lhf;

    .line 15
    .line 16
    invoke-direct {v2}, Lhf;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    check-cast v2, Lhf;

    .line 23
    .line 24
    iget-object v1, v2, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, v3

    .line 35
    :goto_0
    const/4 v4, 0x0

    .line 36
    if-eq v1, p1, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move p1, v4

    .line 41
    :goto_1
    iput-object v0, v2, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    const-wide/16 v5, 0x0

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    const/4 p1, -0x1

    .line 48
    iput p1, v2, Lhf;->β:I

    .line 49
    .line 50
    const/high16 p1, -0x40800000    # -1.0f

    .line 51
    .line 52
    iput p1, v2, Lhf;->γ:F

    .line 53
    .line 54
    iput-wide v5, v2, Lhf;->δ:J

    .line 55
    .line 56
    iput v4, v2, Lhf;->ε:I

    .line 57
    .line 58
    iput-wide v5, v2, Lhf;->ζ:J

    .line 59
    .line 60
    sget-object p1, Ljz;->ε:Ljz;

    .line 61
    .line 62
    iput-object p1, v2, Lhf;->η:Ljava/util/List;

    .line 63
    .line 64
    const-wide/16 v4, -0x1

    .line 65
    .line 66
    iput-wide v4, v2, Lhf;->θ:J

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    iget-object p1, v2, Lhf;->η:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    iput v4, v2, Lhf;->ε:I

    .line 78
    .line 79
    iput-wide v5, v2, Lhf;->ζ:J

    .line 80
    .line 81
    :cond_4
    :goto_2
    sput-object v0, Lkf;->δ:Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    sget-object p1, Lkf;->ε:Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    move-object v3, p1

    .line 92
    check-cast v3, Landroid/view/View;

    .line 93
    .line 94
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v0, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    .line 103
    .line 104
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_7

    .line 113
    .line 114
    if-eqz v3, :cond_7

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    return-void

    .line 136
    :cond_7
    :goto_3
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 137
    .line 138
    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    sput-object p1, Lkf;->ε:Ljava/lang/ref/WeakReference;

    .line 142
    .line 143
    return-void
.end method

.method public static γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    new-instance p1, Leo1;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    move-object p0, p1

    .line 16
    :goto_0
    instance-of p1, p0, Leo1;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_0
    return-object p0
.end method

.method public static ε(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance p1, Leo1;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, p1

    .line 13
    :goto_0
    instance-of p1, p0, Leo1;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 19
    .line 20
    return-object p0
.end method

.method public static ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    new-instance v0, Ljf;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v2, v1}, Ljf;-><init>(Ljava/lang/Class;Lop;I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Le81;->ι(Le80;)Lts1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lts1;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_a

    .line 17
    .line 18
    invoke-virtual {p0}, Lts1;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v1, v0

    .line 23
    check-cast v1, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    array-length v3, v3

    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    const-class v1, Ljava/lang/Boolean;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    const-class v1, Ljava/lang/Byte;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_3

    .line 91
    .line 92
    const-class v1, Ljava/lang/Character;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    const-class v1, Ljava/lang/Short;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    const-class v1, Ljava/lang/Integer;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_6

    .line 124
    .line 125
    const-class v1, Ljava/lang/Long;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_7

    .line 135
    .line 136
    const-class v1, Ljava/lang/Float;

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_7
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_8

    .line 146
    .line 147
    const-class v1, Ljava/lang/Double;

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_8
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 151
    .line 152
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_9

    .line 157
    .line 158
    const-class v1, Ljava/lang/Void;

    .line 159
    .line 160
    :cond_9
    :goto_0
    const-class v3, Ljava/lang/Number;

    .line 161
    .line 162
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_0

    .line 167
    .line 168
    move-object v2, v0

    .line 169
    :cond_a
    check-cast v2, Ljava/lang/reflect/Method;

    .line 170
    .line 171
    return-object v2
.end method

.method public static η(Ljava/lang/Object;ILa80;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v0, p2, p0, v1}, Lkf;->θ(ILjava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final θ(ILjava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 6

    .line 1
    if-le p4, p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    invoke-static {p3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_1
    invoke-interface {p2, p3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    return-object p3

    .line 33
    :cond_2
    instance-of v0, p3, Ljava/lang/String;

    .line 34
    .line 35
    if-nez v0, :cond_7

    .line 36
    .line 37
    instance-of v0, p3, Ljava/lang/Number;

    .line 38
    .line 39
    if-nez v0, :cond_7

    .line 40
    .line 41
    instance-of v0, p3, Ljava/lang/Boolean;

    .line 42
    .line 43
    if-nez v0, :cond_7

    .line 44
    .line 45
    instance-of v0, p3, Ljava/lang/Class;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    if-eqz v0, :cond_7

    .line 55
    .line 56
    const-class v1, Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_7

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    array-length v2, v1

    .line 72
    const/4 v3, 0x0

    .line 73
    :goto_1
    if-ge v3, v2, :cond_6

    .line 74
    .line 75
    aget-object v4, v1, v3

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_5

    .line 86
    .line 87
    invoke-static {p3, v4}, Lkf;->τ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-nez v4, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    add-int/lit8 v5, p4, 0x1

    .line 95
    .line 96
    invoke-static {p0, p1, p2, v4, v5}, Lkf;->θ(ILjava/util/Set;La80;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    return-object v4

    .line 103
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    goto :goto_0

    .line 111
    :cond_7
    :goto_3
    const/4 p0, 0x0

    .line 112
    return-object p0
.end method

.method public static final ι(Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_7

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p3, v1, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_2
    instance-of v1, p2, Ljava/lang/String;

    .line 39
    .line 40
    if-nez v1, :cond_7

    .line 41
    .line 42
    instance-of v1, p2, Ljava/lang/Number;

    .line 43
    .line 44
    if-nez v1, :cond_7

    .line 45
    .line 46
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 47
    .line 48
    if-nez v1, :cond_7

    .line 49
    .line 50
    instance-of v1, p2, Ljava/lang/Class;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_0
    if-eqz v1, :cond_7

    .line 60
    .line 61
    const-class v2, Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_7

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    array-length v3, v2

    .line 77
    const/4 v4, 0x0

    .line 78
    :goto_1
    if-ge v4, v3, :cond_6

    .line 79
    .line 80
    aget-object v5, v2, v4

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {p2, v5}, Lkf;->τ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-nez v5, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    add-int/lit8 v6, p3, 0x1

    .line 93
    .line 94
    invoke-static {p0, p1, v5, v6}, Lkf;->ι(Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_5

    .line 99
    .line 100
    return-object v5

    .line 101
    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    goto :goto_0

    .line 109
    :cond_7
    :goto_3
    return-object v0
.end method

.method public static κ(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    const-string v0, "getDuration"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkf;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_8

    .line 9
    .line 10
    const-string v0, "currentPosition"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkf;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    new-instance v0, Ljf;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, p0, v1, v2}, Ljf;-><init>(Ljava/lang/Class;Lop;I)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Lf7;

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lf7;-><init>(Le80;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lwe;

    .line 32
    .line 33
    const/16 v2, 0x9

    .line 34
    .line 35
    invoke-direct {v0, v2}, Lwe;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ly30;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {v2, p0, v3, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Lx30;

    .line 45
    .line 46
    invoke-direct {p0, v2}, Lx30;-><init>(Ly30;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lx30;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    invoke-virtual {p0}, Lx30;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p0}, Lx30;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move-object v0, v1

    .line 68
    check-cast v0, Ljava/lang/reflect/Method;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "seek"

    .line 75
    .line 76
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/16 v4, 0x1f4

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    move v2, v4

    .line 86
    goto :goto_0

    .line 87
    :cond_3
    move v2, v5

    .line 88
    :goto_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-string v6, "$"

    .line 96
    .line 97
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_4

    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x32

    .line 104
    .line 105
    :cond_4
    invoke-virtual {p0}, Lx30;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    move-object v7, v0

    .line 110
    check-cast v7, Ljava/lang/reflect/Method;

    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {v8, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_5

    .line 121
    .line 122
    move v8, v4

    .line 123
    goto :goto_1

    .line 124
    :cond_5
    move v8, v5

    .line 125
    :goto_1
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v7, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-nez v7, :cond_6

    .line 137
    .line 138
    add-int/lit8 v8, v8, 0x32

    .line 139
    .line 140
    :cond_6
    if-ge v2, v8, :cond_7

    .line 141
    .line 142
    move-object v1, v0

    .line 143
    move v2, v8

    .line 144
    :cond_7
    invoke-virtual {p0}, Lx30;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_4

    .line 149
    .line 150
    :goto_2
    check-cast v1, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    :cond_8
    :goto_3
    return-object v1
.end method

.method public static λ(Ljava/lang/Object;)Landroid/view/View;
    .locals 4

    .line 1
    const-string v0, "mSeekbarView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/view/View;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-nez v0, :cond_3

    .line 17
    .line 18
    const-string v0, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    .line 19
    .line 20
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static {v1, v0, p0, v3}, Lkf;->ι(Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Landroid/view/View;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v0, v2

    .line 46
    :goto_1
    if-nez v0, :cond_3

    .line 47
    .line 48
    const-string v0, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1B2D4E37F4031BB4E143F99F5369ADBB467DF3A6526DA150A61A2"

    .line 49
    .line 50
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1, v0, p0, v3}, Lkf;->ι(Ljava/util/Set;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    instance-of v0, p0, Landroid/view/View;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    check-cast p0, Landroid/view/View;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_2
    return-object v2

    .line 75
    :cond_3
    return-object v0
.end method

.method public static μ(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 5

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v2, v1

    .line 20
    :goto_1
    if-ge v0, v2, :cond_1

    .line 21
    .line 22
    aget-object v3, v1, v0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    array-length v3, v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return v0
.end method

.method public static ν(Ljava/lang/Class;Ljava/lang/String;Lm01;)V
    .locals 4

    .line 1
    const-string v0, "#"

    .line 2
    .line 3
    const-string v1, "hook "

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lxq0;->α:Lxq0;

    .line 6
    .line 7
    invoke-virtual {v2, p0, p1, p2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, " count="

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Lkf;->ο(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object p2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p2

    .line 52
    new-instance v2, Leo1;

    .line 53
    .line 54
    invoke-direct {v2, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object p2, v2

    .line 58
    :goto_0
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-eqz p2, :cond_0

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const-string v2, " failed: "

    .line 73
    .line 74
    invoke-static {v1, p0, v0, p1, v2}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lkf;->ο(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    return-void
.end method

.method public static ξ(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getMoreChapterList"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkf;->μ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "chapterData"

    .line 14
    .line 15
    invoke-static {p0, v0}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "getAid"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lkf;->μ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static ο(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const-string v2, "DYHelper: ChapterSeekBarSegmentSkip"

    .line 4
    .line 5
    invoke-static {v2, p0, v0, v1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static π(Ljava/lang/Long;)Ljava/lang/Long;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v0

    .line 16
    :goto_0
    if-eqz p0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide/16 v2, 0x1

    .line 23
    .line 24
    cmp-long v2, v2, v0

    .line 25
    .line 26
    if-gtz v2, :cond_1

    .line 27
    .line 28
    const-wide/16 v2, 0x3e8

    .line 29
    .line 30
    cmp-long v4, v0, v2

    .line 31
    .line 32
    if-gez v4, :cond_1

    .line 33
    .line 34
    mul-long/2addr v0, v2

    .line 35
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_1
    return-object p0

    .line 40
    :cond_2
    return-object v0
.end method

.method public static ρ(Ljava/lang/Float;)Ljava/lang/Float;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 13
    .line 14
    .line 15
    cmpg-float v2, v2, v3

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-gtz v2, :cond_0

    .line 19
    .line 20
    cmpl-float v1, v1, v3

    .line 21
    .line 22
    if-ltz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p0, v0

    .line 26
    :goto_0
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/high16 v0, 0x3f800000    # 1.0f

    .line 33
    .line 34
    cmpg-float v1, p0, v0

    .line 35
    .line 36
    if-gtz v1, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    const/high16 v1, 0x42c80000    # 100.0f

    .line 40
    .line 41
    cmpg-float v2, p0, v1

    .line 42
    .line 43
    if-gtz v2, :cond_2

    .line 44
    .line 45
    :goto_1
    div-float/2addr p0, v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const v1, 0x461c4000    # 10000.0f

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :goto_2
    invoke-static {p0, v3, v0}, Lj81;->λ(FFF)F

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_3
    return-object v0
.end method

.method public static σ(Ljava/lang/Object;)Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Ljz;->ε:Ljz;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    :try_start_0
    const-string v1, "getMoreChapterList"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of v1, p0, Ljava/util/List;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/util/List;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object p0, v2

    .line 26
    :goto_0
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-static {p0}, Lxh;->Ж(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :cond_2
    if-nez v2, :cond_3

    .line 33
    .line 34
    move-object v2, v0

    .line 35
    goto :goto_2

    .line 36
    :goto_1
    new-instance v2, Leo1;

    .line 37
    .line 38
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    :goto_2
    instance-of p0, v2, Leo1;

    .line 42
    .line 43
    if-eqz p0, :cond_4

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_4
    move-object v0, v2

    .line 47
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 48
    .line 49
    return-object v0
.end method

.method public static τ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Leo1;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    instance-of p1, p0, Leo1;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v1, p0

    .line 35
    :goto_1
    return-object v1
.end method

.method public static υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_1
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    aget-object v5, v2, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    move-object v1, v5

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-static {p0, v1}, Lkf;->τ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return-object v1
.end method

.method public static φ(Ljava/lang/Object;[Ljava/lang/String;)J
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_3

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-static {p0, v2}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    instance-of v3, v2, Ljava/lang/Number;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, Ljava/lang/Number;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move-object v2, v4

    .line 20
    :goto_1
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :cond_1
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    const-wide/16 v5, 0x0

    .line 37
    .line 38
    cmp-long v2, v2, v5

    .line 39
    .line 40
    if-lez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide p0

    .line 46
    return-wide p0

    .line 47
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const-wide/16 p0, -0x1

    .line 51
    .line 52
    return-wide p0
.end method

.method public static χ(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Set;
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, [I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    check-cast p0, [I

    .line 11
    .line 12
    array-length p1, p0

    .line 13
    if-eqz p1, :cond_9

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq p1, v1, :cond_1

    .line 17
    .line 18
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    array-length v1, p0

    .line 21
    invoke-static {v1}, Lex0;->Κ(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {p1, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 26
    .line 27
    .line 28
    array-length v1, p0

    .line 29
    :goto_0
    if-ge v0, v1, :cond_0

    .line 30
    .line 31
    aget v2, p0, v0

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object p1

    .line 44
    :cond_1
    aget p0, p0, v0

    .line 45
    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_2
    instance-of p1, p0, [J

    .line 56
    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    check-cast p0, [J

    .line 60
    .line 61
    new-instance p1, Ljava/util/ArrayList;

    .line 62
    .line 63
    array-length v1, p0

    .line 64
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    array-length v1, p0

    .line 68
    :goto_1
    if-ge v0, v1, :cond_3

    .line 69
    .line 70
    aget-wide v2, p0, v0

    .line 71
    .line 72
    long-to-int v2, v2

    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {p1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_4
    instance-of p1, p0, Ljava/util/Collection;

    .line 89
    .line 90
    if-eqz p1, :cond_9

    .line 91
    .line 92
    check-cast p0, Ljava/lang/Iterable;

    .line 93
    .line 94
    new-instance p1, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    instance-of v1, v0, Ljava/lang/Number;

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    check-cast v0, Ljava/lang/Number;

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move-object v0, v2

    .line 122
    :goto_3
    if-eqz v0, :cond_7

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    :cond_7
    if-eqz v2, :cond_5

    .line 133
    .line 134
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_8
    invoke-static {p1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :cond_9
    sget-object p0, Lnz;->ε:Lnz;

    .line 144
    .line 145
    return-object p0
.end method

.method public static ψ(Landroid/view/View;)Ljava/lang/Float;
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/widget/ProgressBar;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Landroid/widget/ProgressBar;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v1

    .line 10
    :goto_0
    if-nez p0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-gtz v0, :cond_2

    .line 18
    .line 19
    :goto_1
    return-object v1

    .line 20
    :cond_2
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-float p0, p0

    .line 25
    int-to-float v0, v0

    .line 26
    div-float/2addr p0, v0

    .line 27
    const/4 v0, 0x0

    .line 28
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lj81;->λ(FFF)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static ω(Ljava/lang/Object;)J
    .locals 10

    .line 1
    const-string v0, "timestamp"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/lang/Number;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    const-wide/16 v3, -0x1

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-wide v0, v3

    .line 26
    :goto_1
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    cmp-long v7, v0, v5

    .line 29
    .line 30
    if-ltz v7, :cond_2

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_2
    const-string v0, "startTime"

    .line 34
    .line 35
    const-string v1, "startTimeMs"

    .line 36
    .line 37
    const-string v7, "timeStamp"

    .line 38
    .line 39
    filled-new-array {v7, v0, v1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    :goto_2
    const/4 v7, 0x3

    .line 45
    if-ge v1, v7, :cond_6

    .line 46
    .line 47
    aget-object v7, v0, v1

    .line 48
    .line 49
    invoke-static {p0, v7}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    instance-of v8, v7, Ljava/lang/Number;

    .line 54
    .line 55
    if-eqz v8, :cond_3

    .line 56
    .line 57
    check-cast v7, Ljava/lang/Number;

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    move-object v7, v2

    .line 61
    :goto_3
    if-eqz v7, :cond_4

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    move-object v7, v2

    .line 73
    :goto_4
    if-eqz v7, :cond_5

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v8

    .line 79
    cmp-long v8, v8, v5

    .line 80
    .line 81
    if-ltz v8, :cond_5

    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    return-wide v0

    .line 88
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_6
    return-wide v3
.end method


# virtual methods
.method public final Α(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "getState"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "get_state"

    .line 11
    .line 12
    invoke-static {p1, v1}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Lwe;

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    invoke-direct {p1, p0, v2}, Lwe;-><init>(Lkf;I)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x4

    .line 29
    invoke-static {v1, p0, p1}, Lkf;->η(Ljava/lang/Object;ILa80;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_1

    .line 34
    :goto_0
    new-instance p1, Leo1;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, p1

    .line 40
    :goto_1
    instance-of p1, p0, Leo1;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    move-object v0, p0

    .line 46
    :goto_2
    return-object v0
.end method

.method public final Β(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "getState"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "get_state"

    .line 11
    .line 12
    invoke-static {p1, v1}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Lwe;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    invoke-direct {p1, p0, v2}, Lwe;-><init>(Lkf;I)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x4

    .line 29
    invoke-static {v1, p0, p1}, Lkf;->η(Ljava/lang/Object;ILa80;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_1

    .line 34
    :goto_0
    new-instance p1, Leo1;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, p1

    .line 40
    :goto_1
    instance-of p1, p0, Leo1;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    move-object v0, p0

    .line 46
    :goto_2
    return-object v0
.end method

.method public final Δ(Landroid/view/View;F)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lkf;->Α(Landroid/view/View;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lkf;->κ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 v0, 0x1

    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const/high16 v1, 0x42c80000    # 100.0f

    .line 26
    .line 27
    :try_start_0
    invoke-static {p2, v0, v1}, Lj81;->λ(FFF)F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    new-instance p1, Leo1;

    .line 47
    .line 48
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object p0, p1

    .line 52
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance p1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string p2, "pro seek failed: "

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, Lkf;->Ζ(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    :goto_2
    check-cast p0, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0
.end method

.method public final δ(Landroid/view/View;Ljava/lang/Float;)V
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 1
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4b

    .line 2
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    .line 3
    sget-object v0, Lkf;->γ:Ljava/util/Map;

    .line 4
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    .line 5
    new-instance v5, Lhf;

    invoke-direct {v5}, Lhf;-><init>()V

    .line 6
    invoke-interface {v0, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    :cond_1
    check-cast v5, Lhf;

    .line 8
    iget-wide v6, v5, Lhf;->δ:J

    sub-long v6, v3, v6

    const-wide/16 v8, 0xdc

    cmp-long v0, v6, v8

    if-gez v0, :cond_2

    goto/16 :goto_4b

    .line 9
    :cond_2
    iput-wide v3, v5, Lhf;->δ:J

    .line 10
    invoke-static {}, Lui1;->Α()Z

    move-result v0

    if-eqz v0, :cond_80

    .line 11
    invoke-static {}, Lx9;->α()Z

    move-result v0

    if-eqz v0, :cond_80

    .line 12
    const-string v0, "chapter_ad_skip_enabled"

    const/4 v6, 0x0

    .line 13
    invoke-static {v0, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_80

    .line 14
    iget-object v0, v5, Lhf;->η:Ljava/util/List;

    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v7, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    if-eqz v0, :cond_5e

    .line 16
    sget-object v12, Ljz;->ε:Ljz;

    .line 17
    iget-object v0, v5, Lhf;->η:Ljava/util/List;

    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 19
    iget-wide v13, v5, Lhf;->θ:J

    cmp-long v0, v13, v8

    if-lez v0, :cond_3

    goto/16 :goto_3a

    .line 20
    :cond_3
    iget v0, v5, Lhf;->ε:I

    const/4 v13, 0x4

    if-lt v0, v13, :cond_4

    goto/16 :goto_4b

    .line 21
    :cond_4
    iget-wide v13, v5, Lhf;->ζ:J

    cmp-long v13, v3, v13

    if-gez v13, :cond_5

    goto/16 :goto_4b

    :cond_5
    add-int/2addr v0, v10

    .line 22
    iput v0, v5, Lhf;->ε:I

    const-wide/16 v13, 0x28a

    add-long/2addr v13, v3

    .line 23
    iput-wide v13, v5, Lhf;->ζ:J

    .line 24
    invoke-virtual/range {p0 .. p1}, Lkf;->Β(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v13

    .line 25
    iget-object v0, v5, Lhf;->α:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_7

    .line 26
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    move-object v14, v0

    goto :goto_4

    .line 27
    :cond_7
    :goto_1
    sget-object v0, Lkf;->δ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_6

    if-nez v13, :cond_9

    :goto_3
    const/4 v0, 0x0

    goto :goto_0

    .line 28
    :cond_9
    const-string v0, "LIZLLL"

    invoke-static {v13, v0}, Lkf;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_3

    .line 29
    :cond_a
    invoke-static {v0}, Lkf;->ξ(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    goto :goto_0

    .line 30
    :cond_b
    new-instance v14, Lwe;

    const/4 v15, 0x7

    invoke-direct {v14, v15}, Lwe;-><init>(I)V

    const/4 v15, 0x3

    .line 31
    invoke-static {v0, v15, v14}, Lkf;->η(Ljava/lang/Object;ILa80;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :goto_4
    if-eqz v14, :cond_d

    .line 32
    iget-object v0, v5, Lhf;->α:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_c

    .line 33
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_c
    const/4 v0, 0x0

    :goto_5
    if-nez v0, :cond_d

    .line 34
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 35
    iput-object v0, v5, Lhf;->α:Ljava/lang/ref/WeakReference;

    .line 36
    :cond_d
    const-string v15, "duration"

    if-eqz v13, :cond_11

    .line 37
    :try_start_0
    new-array v0, v6, [Ljava/lang/Object;

    invoke-static {v13, v15, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-wide/from16 v16, v8

    :try_start_1
    instance-of v8, v0, Ljava/lang/Number;

    if-eqz v8, :cond_e

    check-cast v0, Ljava/lang/Number;

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_e
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_8

    :cond_f
    const/4 v0, 0x0

    goto :goto_8

    :catchall_1
    move-exception v0

    move-wide/from16 v16, v8

    .line 38
    :goto_7
    new-instance v8, Leo1;

    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v8

    .line 39
    :goto_8
    instance-of v8, v0, Leo1;

    if-eqz v8, :cond_10

    const/4 v0, 0x0

    .line 40
    :cond_10
    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_12

    .line 41
    invoke-static {v0}, Lkf;->π(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_9

    :cond_11
    move-wide/from16 v16, v8

    :cond_12
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_13

    goto/16 :goto_17

    .line 42
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v18, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1B2D4E37F4031BB4E143F99F5369ADBB467DF3A6526DA150A61A2"

    invoke-static/range {v18 .. v18}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 43
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 44
    const-string v8, "l"

    if-eqz v0, :cond_16

    .line 45
    invoke-static {v2, v8}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v9, v0, Ljava/lang/Number;

    if-eqz v9, :cond_14

    check-cast v0, Ljava/lang/Number;

    goto :goto_a

    :cond_14
    const/4 v0, 0x0

    :goto_a
    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_b

    :cond_15
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_16

    .line 46
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    cmp-long v9, v21, v16

    if-lez v9, :cond_16

    .line 47
    invoke-static {v0}, Lkf;->π(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_11

    .line 48
    :cond_16
    const-string v0, "videoDuration"

    const-string v9, "durationMs"

    filled-new-array {v15, v0, v9, v8}, [Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-static {v2, v0}, Lkf;->φ(Ljava/lang/Object;[Ljava/lang/String;)J

    move-result-wide v21

    cmp-long v0, v21, v16

    if-lez v0, :cond_17

    .line 50
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_11

    :cond_17
    if-eqz v14, :cond_18

    .line 51
    :try_start_2
    const-string v0, "getVideo"

    new-array v8, v6, [Ljava/lang/Object;

    invoke-static {v14, v0, v8}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v0

    .line 52
    new-instance v8, Leo1;

    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v8

    .line 53
    :goto_c
    instance-of v8, v0, Leo1;

    if-eqz v8, :cond_19

    :cond_18
    const/4 v0, 0x0

    :cond_19
    if-eqz v0, :cond_20

    .line 54
    filled-new-array {v15, v9}, [Ljava/lang/String;

    move-result-object v8

    .line 55
    invoke-static {v0, v8}, Lkf;->φ(Ljava/lang/Object;[Ljava/lang/String;)J

    move-result-wide v8

    cmp-long v15, v8, v16

    if-lez v15, :cond_1a

    .line 56
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_11

    .line 57
    :cond_1a
    invoke-static {v14}, Lkf;->σ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 58
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 59
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1b
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 60
    invoke-static {v15}, Lkf;->ω(Ljava/lang/Object;)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    cmp-long v18, v21, v16

    if-ltz v18, :cond_1c

    goto :goto_e

    :cond_1c
    const/4 v15, 0x0

    :goto_e
    if-eqz v15, :cond_1b

    .line 61
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 62
    :cond_1d
    invoke-static {v9}, Lxh;->С(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    if-eqz v8, :cond_1e

    .line 63
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_f

    :cond_1e
    move-wide/from16 v8, v16

    .line 64
    :goto_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    invoke-static {v15}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    move-result-object v15

    new-instance v11, Lwe;

    const/16 v6, 0xc

    invoke-direct {v11, v6}, Lwe;-><init>(I)V

    .line 66
    new-instance v6, Ly30;

    invoke-direct {v6, v15, v10, v11}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 67
    new-instance v11, Lwe;

    const/16 v15, 0xd

    invoke-direct {v11, v15}, Lwe;-><init>(I)V

    .line 68
    new-instance v15, Ly30;

    invoke-direct {v15, v6, v10, v11}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 69
    new-instance v6, Lef;

    const/4 v11, 0x0

    invoke-direct {v6, v11, v0}, Lef;-><init>(ILjava/lang/Object;)V

    invoke-static {v15, v6}, Lus1;->Α(Lss1;La80;)Ly30;

    move-result-object v0

    .line 70
    new-instance v6, Lmc;

    invoke-direct {v6, v10, v8, v9}, Lmc;-><init>(IJ)V

    .line 71
    new-instance v8, Ly30;

    invoke-direct {v8, v0, v10, v6}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 72
    invoke-static {v8}, Lus1;->Β(Lss1;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1f

    .line 73
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_10

    :cond_1f
    const-wide/16 v8, -0x1

    :goto_10
    cmp-long v0, v8, v16

    if-lez v0, :cond_20

    .line 74
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_11

    .line 75
    :cond_20
    invoke-static {}, Lpr1;->η()Lor1;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 76
    iget-wide v8, v0, Lor1;->β:J

    .line 77
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    cmp-long v6, v8, v16

    if-lez v6, :cond_21

    goto :goto_11

    :cond_21
    const/4 v0, 0x0

    :goto_11
    if-eqz v0, :cond_22

    goto :goto_17

    .line 78
    :cond_22
    invoke-virtual/range {p0 .. p1}, Lkf;->Α(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_23

    :goto_12
    const/4 v0, 0x0

    goto :goto_16

    .line 79
    :cond_23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v8, "getDuration"

    invoke-static {v6, v8}, Lkf;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v6

    if-nez v6, :cond_24

    goto :goto_12

    .line 80
    :cond_24
    invoke-virtual {v6, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v8, 0x0

    .line 81
    :try_start_3
    invoke-virtual {v6, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Ljava/lang/Number;

    if-eqz v6, :cond_25

    check-cast v0, Ljava/lang/Number;

    goto :goto_13

    :catchall_3
    move-exception v0

    goto :goto_14

    :cond_25
    const/4 v0, 0x0

    :goto_13
    if-eqz v0, :cond_26

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_15

    :cond_26
    const/4 v0, 0x0

    goto :goto_15

    .line 82
    :goto_14
    new-instance v6, Leo1;

    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v6

    .line 83
    :goto_15
    instance-of v6, v0, Leo1;

    if-eqz v6, :cond_27

    const/4 v0, 0x0

    .line 84
    :cond_27
    check-cast v0, Ljava/lang/Long;

    .line 85
    :goto_16
    invoke-static {v0}, Lkf;->π(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_28

    goto :goto_17

    .line 86
    :cond_28
    invoke-static {}, Lpr1;->η()Lor1;

    move-result-object v0

    if-eqz v0, :cond_29

    .line 87
    iget-wide v8, v0, Lor1;->β:J

    .line 88
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    cmp-long v6, v8, v16

    if-lez v6, :cond_29

    goto :goto_17

    :cond_29
    const/4 v0, 0x0

    :goto_17
    if-eqz v0, :cond_5d

    .line 89
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v26

    .line 90
    invoke-static {v14}, Lkf;->σ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 91
    sget-object v0, Lnz;->ε:Lnz;

    if-nez v14, :cond_2a

    :goto_18
    move-object v8, v0

    goto :goto_19

    .line 92
    :cond_2a
    const-string v8, "chapterData"

    invoke-static {v14, v8}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_2b

    goto :goto_18

    .line 93
    :cond_2b
    const-string v0, "adChapterAutoSkipIndexList"

    invoke-static {v8, v0}, Lkf;->χ(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    .line 94
    move-object v9, v0

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_2c

    goto :goto_18

    .line 95
    :cond_2c
    const-string v0, "adChapterIndexList"

    invoke-static {v8, v0}, Lkf;->χ(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    goto :goto_18

    .line 96
    :goto_19
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v9, 0x2

    if-lt v0, v9, :cond_39

    move-object v0, v8

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_39

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v13, 0x0

    :goto_1a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_30

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v13, 0x1

    if-ltz v13, :cond_2f

    .line 99
    invoke-static {v14}, Lkf;->ω(Ljava/lang/Object;)J

    move-result-wide v22

    cmp-long v14, v22, v16

    if-gez v14, :cond_2d

    move/from16 v28, v10

    const/4 v10, 0x0

    goto :goto_1b

    .line 100
    :cond_2d
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const-wide/16 v24, 0x0

    invoke-static/range {v22 .. v27}, Lj81;->ξ(JJJ)J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    move/from16 v28, v10

    .line 101
    new-instance v10, Ll91;

    invoke-direct {v10, v13, v14}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1b
    if-eqz v10, :cond_2e

    .line 102
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2e
    move v13, v15

    move/from16 v10, v28

    goto :goto_1a

    .line 103
    :cond_2f
    invoke-static {}, Lyh;->х()V

    const/16 v18, 0x0

    throw v18

    :cond_30
    move/from16 v28, v10

    .line 104
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 105
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_31
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_32

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 107
    move-object v14, v13

    check-cast v14, Ll91;

    .line 108
    iget-object v14, v14, Ll91;->ζ:Ljava/lang/Object;

    .line 109
    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    .line 110
    invoke-virtual {v10, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_31

    .line 111
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .line 112
    :cond_32
    new-instance v0, Ld50;

    const/16 v10, 0x1c

    .line 113
    invoke-direct {v0, v10}, Ld50;-><init>(I)V

    .line 114
    invoke-static {v11, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 115
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    if-ge v10, v9, :cond_33

    goto :goto_20

    .line 116
    :cond_33
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 117
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_1d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_38

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v13, v10, 0x1

    if-ltz v10, :cond_37

    .line 118
    check-cast v11, Ll91;

    .line 119
    iget-object v10, v11, Ll91;->ζ:Ljava/lang/Object;

    .line 120
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v31

    .line 121
    invoke-static {v13, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll91;

    if-eqz v10, :cond_34

    .line 122
    iget-object v10, v10, Ll91;->ζ:Ljava/lang/Object;

    .line 123
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    move-wide/from16 v33, v14

    goto :goto_1e

    :cond_34
    move-wide/from16 v33, v26

    :goto_1e
    cmp-long v10, v33, v31

    if-gtz v10, :cond_35

    const/4 v10, 0x0

    goto :goto_1f

    .line 124
    :cond_35
    iget-object v10, v11, Ll91;->ε:Ljava/lang/Object;

    .line 125
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v30

    .line 126
    new-instance v29, Lff;

    .line 127
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v35

    .line 128
    invoke-direct/range {v29 .. v35}, Lff;-><init>(IJJZ)V

    move-object/from16 v10, v29

    :goto_1f
    if-eqz v10, :cond_36

    .line 129
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_36
    move v10, v13

    goto :goto_1d

    .line 130
    :cond_37
    invoke-static {}, Lyh;->х()V

    const/16 v18, 0x0

    throw v18

    :cond_38
    :goto_20
    move-wide/from16 v19, v3

    move-wide/from16 v3, v26

    goto/16 :goto_37

    :cond_39
    move/from16 v28, v10

    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 132
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto :goto_20

    :cond_3a
    if-nez v13, :cond_3b

    .line 133
    invoke-virtual/range {p0 .. p1}, Lkf;->Β(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_3b

    goto :goto_20

    .line 134
    :cond_3b
    :try_start_4
    const-string v0, "LJIIIIZZ"

    const/4 v11, 0x0

    new-array v9, v11, [Ljava/lang/Object;

    invoke-static {v13, v0, v9}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_21

    :catchall_4
    move-exception v0

    .line 135
    new-instance v9, Leo1;

    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v9

    .line 136
    :goto_21
    instance-of v9, v0, Leo1;

    if-eqz v9, :cond_3c

    const/4 v0, 0x0

    :cond_3c
    if-nez v0, :cond_3d

    goto :goto_20

    .line 137
    :cond_3d
    const-string v9, "LIZIZ"

    invoke-static {v0, v9}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v10, v0, Ljava/util/List;

    if-eqz v10, :cond_3e

    check-cast v0, Ljava/util/List;

    goto :goto_22

    :cond_3e
    const/4 v0, 0x0

    :goto_22
    if-eqz v0, :cond_3f

    .line 138
    invoke-static {v0}, Lxh;->Ж(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_23

    :cond_3f
    const/4 v0, 0x0

    :goto_23
    if-nez v0, :cond_40

    move-object v0, v12

    .line 139
    :cond_40
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_41

    goto :goto_20

    .line 140
    :cond_41
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 141
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v30, 0x0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v13, v30, 0x1

    if-ltz v30, :cond_4d

    .line 142
    invoke-static {v11, v9}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/Number;

    if-eqz v15, :cond_42

    check-cast v14, Ljava/lang/Number;

    goto :goto_25

    :cond_42
    const/4 v14, 0x0

    :goto_25
    if-eqz v14, :cond_4b

    .line 143
    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    .line 144
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    cmp-long v14, v14, v16

    if-ltz v14, :cond_43

    goto :goto_26

    :cond_43
    const/16 v22, 0x0

    :goto_26
    if-eqz v22, :cond_4b

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    .line 145
    const-string v14, "LIZJ"

    invoke-static {v11, v14}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/Number;

    if-eqz v15, :cond_44

    check-cast v14, Ljava/lang/Number;

    goto :goto_27

    :cond_44
    const/4 v14, 0x0

    :goto_27
    if-eqz v14, :cond_45

    .line 146
    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    move-wide/from16 v33, v14

    goto :goto_28

    :cond_45
    const-wide/16 v33, -0x1

    .line 147
    :goto_28
    const-string v14, "LIZ"

    invoke-static {v11, v14}, Lkf;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    instance-of v14, v11, Ljava/lang/String;

    if-eqz v14, :cond_46

    check-cast v11, Ljava/lang/String;

    goto :goto_29

    :cond_46
    const/4 v11, 0x0

    .line 148
    :goto_29
    new-instance v29, Lgf;

    const-wide/16 v24, 0x0

    invoke-static/range {v22 .. v27}, Lj81;->ξ(JJJ)J

    move-result-wide v31

    if-eqz v11, :cond_49

    .line 149
    invoke-static {v11}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_49

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v14

    if-lez v14, :cond_47

    goto :goto_2a

    :cond_47
    const/4 v11, 0x0

    :goto_2a
    if-nez v11, :cond_48

    goto :goto_2b

    .line 150
    :cond_48
    const-string v14, "\u5e7f\u544a"

    const/4 v15, 0x0

    .line 151
    invoke-static {v11, v14, v15}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v14

    if-nez v14, :cond_4a

    .line 152
    const-string v14, "\u63a8\u5e7f"

    .line 153
    invoke-static {v11, v14, v15}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v14

    if-nez v14, :cond_4a

    .line 154
    const-string v14, "\u8425\u9500"

    .line 155
    invoke-static {v11, v14, v15}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v14

    if-nez v14, :cond_4a

    .line 156
    const-string v14, "\u8d5e\u52a9"

    .line 157
    invoke-static {v11, v14, v15}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v11

    if-eqz v11, :cond_49

    goto :goto_2c

    :cond_49
    :goto_2b
    const/16 v35, 0x0

    goto :goto_2d

    :cond_4a
    :goto_2c
    move/from16 v35, v28

    .line 158
    :goto_2d
    invoke-direct/range {v29 .. v35}, Lgf;-><init>(IJJZ)V

    move-object/from16 v11, v29

    goto :goto_2e

    :cond_4b
    const/4 v11, 0x0

    :goto_2e
    if-eqz v11, :cond_4c

    .line 159
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4c
    move/from16 v30, v13

    goto/16 :goto_24

    .line 160
    :cond_4d
    invoke-static {}, Lyh;->х()V

    const/16 v18, 0x0

    throw v18

    .line 161
    :cond_4e
    new-instance v0, Ld50;

    const/16 v9, 0x1d

    .line 162
    invoke-direct {v0, v9}, Ld50;-><init>(I)V

    .line 163
    invoke-static {v10, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_4f

    goto/16 :goto_20

    .line 165
    :cond_4f
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 166
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v11, 0x0

    :goto_2f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_38

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v13, v11, 0x1

    if-ltz v11, :cond_57

    .line 167
    check-cast v10, Lgf;

    .line 168
    invoke-static {v13, v0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lgf;

    if-eqz v14, :cond_50

    .line 169
    iget-wide v14, v14, Lgf;->β:J

    :goto_30
    move-wide/from16 v19, v3

    goto :goto_31

    :cond_50
    move-wide/from16 v14, v26

    goto :goto_30

    .line 170
    :goto_31
    iget-wide v3, v10, Lgf;->γ:J

    .line 171
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-wide/from16 v23, v3

    .line 172
    iget-wide v3, v10, Lgf;->β:J

    cmp-long v3, v23, v3

    if-lez v3, :cond_51

    goto :goto_32

    :cond_51
    const/16 v22, 0x0

    :goto_32
    if-eqz v22, :cond_52

    .line 173
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    .line 174
    iget-wide v3, v10, Lgf;->β:J

    move-wide/from16 v24, v3

    .line 175
    invoke-static/range {v22 .. v27}, Lj81;->ξ(JJJ)J

    move-result-wide v14

    :cond_52
    move-wide/from16 v3, v26

    move-wide/from16 v33, v14

    .line 176
    iget-wide v14, v10, Lgf;->β:J

    cmp-long v22, v33, v14

    if-gtz v22, :cond_53

    move-object/from16 v22, v0

    const/4 v0, 0x0

    goto :goto_36

    .line 177
    :cond_53
    new-instance v29, Lff;

    move-object/from16 v22, v0

    .line 178
    iget v0, v10, Lgf;->α:I

    .line 179
    iget-boolean v10, v10, Lgf;->δ:Z

    if-nez v10, :cond_55

    .line 180
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_55

    .line 181
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_54

    goto :goto_34

    :cond_54
    const/16 v35, 0x0

    :goto_33
    move/from16 v30, v0

    move-wide/from16 v31, v14

    goto :goto_35

    :cond_55
    :goto_34
    move/from16 v35, v28

    goto :goto_33

    .line 182
    :goto_35
    invoke-direct/range {v29 .. v35}, Lff;-><init>(IJJZ)V

    move-object/from16 v0, v29

    :goto_36
    if-eqz v0, :cond_56

    .line 183
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_56
    move-wide/from16 v26, v3

    move v11, v13

    move-wide/from16 v3, v19

    move-object/from16 v0, v22

    goto/16 :goto_2f

    .line 184
    :cond_57
    invoke-static {}, Lyh;->х()V

    const/16 v18, 0x0

    throw v18

    .line 185
    :goto_37
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_58

    .line 186
    iget v0, v5, Lhf;->ε:I

    .line 187
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    const-string v2, ", chapters="

    const-string v3, ", adIndexes="

    .line 188
    const-string v4, "no segments, attempt="

    invoke-static {v4, v0, v2, v1, v3}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 189
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 190
    invoke-static {v0}, Lkf;->Ζ(Ljava/lang/String;)V

    goto/16 :goto_4b

    .line 191
    :cond_58
    iput-object v12, v5, Lhf;->η:Ljava/util/List;

    .line 192
    iput-wide v3, v5, Lhf;->θ:J

    .line 193
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    .line 194
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5a

    const/4 v11, 0x0

    :cond_59
    const/16 v18, 0x0

    goto :goto_39

    .line 195
    :cond_5a
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v11, 0x0

    :goto_38
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_59

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lff;

    .line 196
    iget-boolean v4, v4, Lff;->δ:Z

    if-eqz v4, :cond_5c

    add-int/lit8 v11, v11, 0x1

    if-ltz v11, :cond_5b

    goto :goto_38

    .line 197
    :cond_5b
    invoke-static {}, Lyh;->ф()V

    const/16 v18, 0x0

    throw v18

    :cond_5c
    const/16 v18, 0x0

    goto :goto_38

    .line 198
    :goto_39
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "cached segments="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ads="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 199
    invoke-static {v0}, Lkf;->ο(Ljava/lang/String;)V

    goto :goto_3b

    .line 200
    :cond_5d
    iget v0, v5, Lhf;->ε:I

    .line 201
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no duration, attempt="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkf;->Ζ(Ljava/lang/String;)V

    goto/16 :goto_4b

    :cond_5e
    :goto_3a
    move-wide/from16 v19, v3

    move-wide/from16 v16, v8

    move/from16 v28, v10

    const/16 v18, 0x0

    .line 202
    :goto_3b
    iget-wide v3, v5, Lhf;->θ:J

    .line 203
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    cmp-long v0, v3, v16

    if-lez v0, :cond_5f

    goto :goto_3c

    :cond_5f
    move-object/from16 v8, v18

    :goto_3c
    if-eqz v8, :cond_80

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    .line 204
    iget-object v0, v5, Lhf;->η:Ljava/util/List;

    .line 205
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_60

    goto/16 :goto_4b

    .line 206
    :cond_60
    invoke-static {}, Lpr1;->η()Lor1;

    move-result-object v3

    .line 207
    invoke-static/range {p2 .. p2}, Lkf;->ρ(Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v4

    const/4 v6, 0x0

    if-eqz v4, :cond_61

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_40

    :cond_61
    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v3, :cond_62

    .line 208
    iget v3, v3, Lor1;->ε:F

    .line 209
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    cmpg-float v9, v6, v3

    if-gtz v9, :cond_62

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_62

    goto :goto_3d

    :cond_62
    move-object/from16 v8, v18

    :goto_3d
    if-eqz v8, :cond_63

    .line 210
    :goto_3e
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_40

    .line 211
    :cond_63
    invoke-static {v2}, Lkf;->ψ(Landroid/view/View;)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_64

    .line 212
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_40

    .line 213
    :cond_64
    iget v3, v5, Lhf;->γ:F

    .line 214
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    cmpg-float v9, v6, v3

    if-gtz v9, :cond_65

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_65

    goto :goto_3f

    :cond_65
    move-object/from16 v8, v18

    :goto_3f
    if-eqz v8, :cond_7f

    goto :goto_3e

    .line 215
    :goto_40
    iput v3, v5, Lhf;->γ:F

    long-to-double v8, v13

    float-to-double v3, v3

    mul-double/2addr v3, v8

    double-to-long v3, v3

    const-wide/16 v11, 0x0

    move-wide/from16 v36, v8

    move-wide v9, v3

    move-wide/from16 v3, v36

    .line 216
    invoke-static/range {v9 .. v14}, Lj81;->ξ(JJJ)J

    move-result-wide v8

    .line 217
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    invoke-interface {v0, v10}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v10

    .line 218
    :goto_41
    invoke-interface {v10}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v11

    if-eqz v11, :cond_67

    .line 219
    invoke-interface {v10}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v11

    .line 220
    move-object v12, v11

    check-cast v12, Lff;

    move-object/from16 v16, v7

    .line 221
    iget-wide v6, v12, Lff;->β:J

    cmp-long v6, v8, v6

    if-ltz v6, :cond_66

    goto :goto_42

    :cond_66
    move-object/from16 v7, v16

    const/4 v6, 0x0

    goto :goto_41

    :cond_67
    move-object/from16 v16, v7

    move-object/from16 v11, v18

    .line 222
    :goto_42
    move-object v6, v11

    check-cast v6, Lff;

    if-nez v6, :cond_68

    .line 223
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no current segment, current="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " segments="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkf;->Ζ(Ljava/lang/String;)V

    return-void

    .line 224
    :cond_68
    iget v7, v6, Lff;->α:I

    .line 225
    iput v7, v5, Lhf;->β:I

    .line 226
    iget-boolean v5, v6, Lff;->δ:Z

    if-nez v5, :cond_69

    goto/16 :goto_4b

    .line 227
    :cond_69
    iget-wide v10, v6, Lff;->γ:J

    move-wide/from16 v22, v3

    .line 228
    iget-wide v3, v6, Lff;->β:J

    cmp-long v5, v10, v3

    if-gtz v5, :cond_6a

    goto/16 :goto_4b

    :cond_6a
    cmp-long v3, v8, v3

    if-ltz v3, :cond_80

    cmp-long v3, v8, v10

    if-ltz v3, :cond_6b

    goto/16 :goto_4b

    .line 229
    :cond_6b
    sget-wide v3, Lkf;->ζ:J

    sub-long v3, v19, v3

    const-wide/16 v10, 0x6a4

    cmp-long v3, v3, v10

    if-gez v3, :cond_6c

    goto/16 :goto_4b

    .line 230
    :cond_6c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lff;

    .line 231
    iget v5, v4, Lff;->α:I

    .line 232
    iget v7, v6, Lff;->α:I

    if-le v5, v7, :cond_6d

    .line 233
    iget-boolean v4, v4, Lff;->δ:Z

    if-nez v4, :cond_6d

    goto :goto_43

    :cond_6e
    move-object/from16 v3, v18

    .line 234
    :goto_43
    check-cast v3, Lff;

    move-wide v4, v8

    if-nez v3, :cond_6f

    .line 235
    new-instance v9, Lff;

    .line 236
    iget v0, v6, Lff;->α:I

    add-int/lit8 v10, v0, 0x1

    .line 237
    iget-wide v11, v6, Lff;->γ:J

    const/4 v15, 0x0

    .line 238
    invoke-direct/range {v9 .. v15}, Lff;-><init>(IJJZ)V

    move-object v3, v9

    .line 239
    :cond_6f
    iget-wide v7, v3, Lff;->β:J

    const-wide/16 v9, 0x1c2

    add-long/2addr v9, v7

    const-wide/16 v11, 0x0

    .line 240
    invoke-static/range {v9 .. v14}, Lj81;->ξ(JJJ)J

    move-result-wide v7

    const-wide/16 v9, 0xfa

    add-long/2addr v9, v4

    cmp-long v0, v7, v9

    if-gtz v0, :cond_70

    goto/16 :goto_4b

    :cond_70
    long-to-double v9, v7

    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    mul-double/2addr v9, v11

    div-double v9, v9, v22

    double-to-float v0, v9

    const/high16 v9, 0x42c80000    # 100.0f

    const/4 v10, 0x0

    .line 241
    invoke-static {v0, v10, v9}, Lj81;->λ(FFF)F

    move-result v0

    .line 242
    sget-wide v9, Lkf;->ζ:J

    .line 243
    sput-wide v19, Lkf;->ζ:J

    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static/range {v16 .. v16}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 245
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_71

    .line 246
    invoke-static {v2, v0}, Lkf;->Ε(Landroid/view/View;F)Z

    move-result v11

    if-eqz v11, :cond_71

    .line 247
    const-string v0, "state-player"

    goto/16 :goto_45

    .line 248
    :cond_71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static/range {v16 .. v16}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 249
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_72

    .line 250
    invoke-static {v2, v0}, Lkf;->Γ(Landroid/view/View;F)Z

    move-result v11

    if-eqz v11, :cond_72

    .line 251
    const-string v0, "component"

    goto :goto_45

    .line 252
    :cond_72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static/range {v16 .. v16}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 253
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_73

    .line 254
    invoke-virtual {v1, v2, v0}, Lkf;->Δ(Landroid/view/View;F)Z

    move-result v11

    if-eqz v11, :cond_73

    .line 255
    const-string v0, "walk-player"

    goto :goto_45

    .line 256
    :cond_73
    sget-object v11, Lkf;->ε:Ljava/lang/ref/WeakReference;

    if-eqz v11, :cond_74

    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    goto :goto_44

    :cond_74
    move-object/from16 v11, v18

    :goto_44
    if-eqz v11, :cond_77

    if-eq v11, v2, :cond_77

    .line 257
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-static/range {v16 .. v16}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 258
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_77

    .line 259
    invoke-static {v11, v0}, Lkf;->Ε(Landroid/view/View;F)Z

    move-result v12

    if-eqz v12, :cond_75

    const-string v0, "latest-state-player"

    goto :goto_45

    .line 260
    :cond_75
    invoke-static {v11, v0}, Lkf;->Γ(Landroid/view/View;F)Z

    move-result v12

    if-eqz v12, :cond_76

    const-string v0, "latest-component"

    goto :goto_45

    .line 261
    :cond_76
    invoke-virtual {v1, v11, v0}, Lkf;->Δ(Landroid/view/View;F)Z

    move-result v0

    if-eqz v0, :cond_77

    const-string v0, "latest-walk-player"

    goto :goto_45

    :cond_77
    move-object/from16 v0, v18

    :goto_45
    if-eqz v0, :cond_7e

    .line 262
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 263
    invoke-static {}, Lui1;->Α()Z

    move-result v2

    if-eqz v2, :cond_7d

    .line 264
    const-string v2, "chapter_seekbar_segment_skip_notify"

    const/4 v11, 0x0

    .line 265
    invoke-static {v2, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_7d

    if-eqz v1, :cond_7d

    :goto_46
    if-eqz v1, :cond_7b

    add-int/lit8 v2, v11, 0x1

    const/16 v9, 0x8

    if-ge v11, v9, :cond_7b

    .line 266
    instance-of v9, v1, Landroid/app/Activity;

    if-eqz v9, :cond_78

    move-object v11, v1

    check-cast v11, Landroid/app/Activity;

    move-object v15, v11

    goto :goto_49

    .line 267
    :cond_78
    instance-of v9, v1, Landroid/content/ContextWrapper;

    if-eqz v9, :cond_79

    check-cast v1, Landroid/content/ContextWrapper;

    goto :goto_47

    :cond_79
    move-object/from16 v1, v18

    :goto_47
    if-eqz v1, :cond_7a

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_48

    :cond_7a
    move-object/from16 v1, v18

    :goto_48
    move v11, v2

    goto :goto_46

    :cond_7b
    move-object/from16 v15, v18

    :goto_49
    if-nez v15, :cond_7c

    goto :goto_4a

    .line 268
    :cond_7c
    sget-object v1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 269
    iget v1, v6, Lff;->α:I

    add-int/lit8 v1, v1, 0x1

    iget v2, v3, Lff;->α:I

    add-int/lit8 v2, v2, 0x1

    .line 270
    const-string v3, "\u7ae0\u8282 "

    const-string v9, " -> "

    .line 271
    invoke-static {v1, v2, v3, v9}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 272
    const-string v11, "\u5df2\u8df3\u8fc7\u5e7f\u544a\u7ae0\u8282"

    invoke-static {v11}, Lcom/example/dyhelper/ui/а;->ε(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 273
    invoke-static {v1}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sget-object v14, Lf52;->ζ:Lf52;

    .line 274
    new-instance v9, Ld52;

    const/16 v13, 0x64

    const-wide/16 v16, 0x578

    invoke-direct/range {v9 .. v17}, Ld52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;Landroid/app/Activity;J)V

    invoke-static {v9}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 275
    :cond_7d
    :goto_4a
    iget v1, v6, Lff;->α:I

    .line 276
    iget-wide v2, v6, Lff;->β:J

    .line 277
    iget-wide v9, v6, Lff;->γ:J

    .line 278
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "skip chapter index="

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", from="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " to="

    const-string v4, " ad="

    .line 279
    invoke-static {v6, v1, v7, v8, v4}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 280
    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "-"

    const-string v2, ", route="

    .line 281
    invoke-static {v6, v1, v9, v10, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 282
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 283
    invoke-static {v0}, Lkf;->ο(Ljava/lang/String;)V

    goto :goto_4b

    .line 284
    :cond_7e
    sput-wide v9, Lkf;->ζ:J

    .line 285
    const-string v0, "seek bridge not found"

    invoke-static {v0}, Lkf;->Ζ(Ljava/lang/String;)V

    goto :goto_4b

    .line 286
    :cond_7f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "no progress ratio, arg="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkf;->Ζ(Ljava/lang/String;)V

    :cond_80
    :goto_4b
    return-void
.end method
