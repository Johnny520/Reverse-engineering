.class public final Loh;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Loh;

.field public static volatile β:Z = false

.field public static volatile γ:Z = false

.field public static volatile δ:Z = false

.field public static volatile ε:Z = true

.field public static volatile ζ:Z = false

.field public static volatile η:Z = true

.field public static volatile θ:F = 0.4f

.field public static volatile ι:Z

.field public static final κ:Ljava/util/Set;

.field public static final λ:Ljava/util/Set;

.field public static final μ:Ljava/util/Set;

.field public static final ν:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Loh;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loh;->α:Loh;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sput-object v0, Loh;->κ:Ljava/util/Set;

    .line 25
    .line 26
    new-instance v0, Ljava/util/WeakHashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sput-object v0, Loh;->λ:Ljava/util/Set;

    .line 43
    .line 44
    new-instance v0, Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sput-object v0, Loh;->μ:Ljava/util/Set;

    .line 61
    .line 62
    new-instance v0, Ljava/util/WeakHashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sput-object v0, Loh;->ν:Ljava/util/Map;

    .line 75
    .line 76
    return-void
.end method

.method public static α(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {}, Loh;->ε()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Loh;->ν:Ljava/util/Map;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sget-object v1, Loh;->μ:Ljava/util/Set;

    .line 24
    .line 25
    monitor-enter v1

    .line 26
    :try_start_1
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    monitor-exit v1

    .line 31
    invoke-static {p0, v0}, Loh;->ι(Landroid/view/View;F)V

    .line 32
    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    cmpl-float v0, v0, v1

    .line 38
    .line 39
    if-lez v0, :cond_0

    .line 40
    .line 41
    invoke-static {p0}, Loh;->κ(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    monitor-exit v1

    .line 47
    throw p0

    .line 48
    :cond_0
    return-void

    .line 49
    :catchall_1
    move-exception p0

    .line 50
    monitor-exit v0

    .line 51
    throw p0

    .line 52
    :cond_1
    sget-object v0, Loh;->λ:Ljava/util/Set;

    .line 53
    .line 54
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    sget-object v0, Loh;->ν:Ljava/util/Map;

    .line 58
    .line 59
    monitor-enter v0

    .line 60
    :try_start_2
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_2
    move-exception p0

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    :goto_0
    monitor-exit v0

    .line 81
    sget-boolean v0, Loh;->η:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    sget-boolean v0, Loh;->γ:Z

    .line 86
    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    sget-object v0, Loh;->κ:Ljava/util/Set;

    .line 90
    .line 91
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    sget v0, Loh;->θ:F

    .line 101
    .line 102
    :goto_1
    invoke-static {p0, v0}, Loh;->β(Landroid/view/View;F)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :goto_2
    monitor-exit v0

    .line 107
    throw p0
.end method

.method public static β(Landroid/view/View;F)V
    .locals 5

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

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
    const/4 v2, 0x0

    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    cmpg-float v0, p1, v2

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    sget-object v3, Loh;->μ:Ljava/util/Set;

    .line 21
    .line 22
    monitor-enter v3

    .line 23
    :try_start_0
    invoke-interface {v3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v3, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-interface {v3, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :goto_1
    monitor-exit v3

    .line 39
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    cmpg-float v1, v3, v1

    .line 44
    .line 45
    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    .line 47
    if-gtz v1, :cond_2

    .line 48
    .line 49
    invoke-static {p1, v2, v3}, Lj81;->λ(FFF)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    cmpg-float p1, v3, v2

    .line 54
    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    const v3, 0x3a83126f    # 0.001f

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p0, v3}, Loh;->ι(Landroid/view/View;F)V

    .line 61
    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    invoke-static {p0}, Loh;->κ(Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    return-void

    .line 71
    :goto_2
    monitor-exit v3

    .line 72
    throw p0
.end method

.method public static γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V
    .locals 4

    .line 1
    const-string v0, "r8551834247ed4397"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lxq0;->α:Lxq0;

    .line 4
    .line 5
    invoke-virtual {v1, p0, p1, p2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Lux;->ρ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object p2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p2

    .line 42
    new-instance v0, Leo1;

    .line 43
    .line 44
    invoke-direct {v0, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object p2, v0

    .line 48
    :goto_0
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "#"

    .line 63
    .line 64
    const-string v2, " failed: "

    .line 65
    .line 66
    const-string v3, "hook "

    .line 67
    .line 68
    invoke-static {v3, p0, v1, p1, v2}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string p1, "r2a13f9ab3a7ddc68"

    .line 80
    .line 81
    invoke-static {p1, p0, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    return-void
.end method

.method public static ε()Z
    .locals 1

    .line 1
    sget-boolean v0, Loh;->δ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-boolean v0, Loh;->ε:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-boolean v0, Loh;->ζ:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public static η()V
    .locals 5

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
    return-void

    .line 8
    :cond_0
    const-string v0, "clean_progress_bar_enabled"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput-boolean v0, Loh;->δ:Z

    .line 16
    .line 17
    const-string v0, "clean_progress_bar_only_in_clean_mode"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput-boolean v0, Loh;->ε:Z

    .line 25
    .line 26
    const-string v0, "clean_mode_enabled"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sput-boolean v0, Loh;->ζ:Z

    .line 33
    .line 34
    const-string v0, "clean_progress_bar_restore_alpha_on_pause"

    .line 35
    .line 36
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sput-boolean v0, Loh;->η:Z

    .line 41
    .line 42
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "clean_progress_bar_alpha"

    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    new-instance v1, Leo1;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :goto_0
    instance-of v1, v0, Leo1;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    move-object v0, v2

    .line 70
    :cond_1
    instance-of v1, v0, Ljava/lang/Float;

    .line 71
    .line 72
    const/high16 v3, 0x3f800000    # 1.0f

    .line 73
    .line 74
    const/high16 v4, 0x42c80000    # 100.0f

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    check-cast v0, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    cmpl-float v1, v1, v3

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-lez v1, :cond_9

    .line 91
    .line 92
    :goto_1
    div-float/2addr v0, v4

    .line 93
    goto :goto_3

    .line 94
    :cond_2
    instance-of v1, v0, Ljava/lang/Integer;

    .line 95
    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    goto :goto_1

    .line 105
    :cond_3
    instance-of v1, v0, Ljava/lang/Long;

    .line 106
    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    check-cast v0, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    long-to-float v0, v0

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    instance-of v1, v0, Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v1, :cond_8

    .line 120
    .line 121
    check-cast v0, Ljava/lang/String;

    .line 122
    .line 123
    :try_start_1
    invoke-static {v0}, Lw02;->Η(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    .line 135
    .line 136
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 137
    :catch_0
    :cond_5
    if-nez v2, :cond_6

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    cmpl-float v0, v0, v3

    .line 145
    .line 146
    if-lez v0, :cond_7

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    goto :goto_1

    .line 153
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    goto :goto_3

    .line 158
    :cond_8
    :goto_2
    const v0, 0x3ecccccd    # 0.4f

    .line 159
    .line 160
    .line 161
    :cond_9
    :goto_3
    const/4 v1, 0x0

    .line 162
    invoke-static {v0, v1, v3}, Lj81;->λ(FFF)F

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    sput v0, Loh;->θ:F

    .line 167
    .line 168
    return-void
.end method

.method public static θ(Z)V
    .locals 3

    .line 1
    sput-boolean p0, Loh;->γ:Z

    .line 2
    .line 3
    invoke-static {}, Loh;->ε()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    sget-object v0, Loh;->λ:Ljava/util/Set;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    move-object v1, v0

    .line 14
    check-cast v1, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    monitor-exit v0

    .line 21
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/view/View;

    .line 36
    .line 37
    sget-object v2, Loh;->α:Loh;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    const/high16 v2, 0x3f800000    # 1.0f

    .line 42
    .line 43
    :try_start_1
    invoke-static {v1, v2}, Loh;->β(Landroid/view/View;F)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v2, v1}, Loh;->ζ(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    :goto_1
    return-void

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    monitor-exit v0

    .line 54
    throw p0
.end method

.method public static ι(Landroid/view/View;F)V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v1, v0}, Lj81;->λ(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    cmpg-float v0, v0, v1

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    move v0, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v2

    .line 21
    :goto_0
    cmpg-float v1, p1, v1

    .line 22
    .line 23
    if-gtz v1, :cond_1

    .line 24
    .line 25
    move v2, v3

    .line 26
    :cond_1
    if-eq v0, v2, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-float/2addr v0, p1

    .line 34
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const v1, 0x3ba3d70a    # 0.005f

    .line 39
    .line 40
    .line 41
    cmpl-float v0, v0, v1

    .line 42
    .line 43
    if-lez v0, :cond_3

    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public static κ(Landroid/view/View;)V
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/widget/ProgressBar;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ProgressBar;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-nez p0, :cond_1

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_1
    new-instance v0, Lν;

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    invoke-direct {v0, v1, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    new-instance v0, Leo1;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object p0, v0

    .line 34
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v0, "r74a1540a4b215b1"

    .line 45
    .line 46
    const-string v1, "r2a13f9ab3a7ddc68"

    .line 47
    .line 48
    invoke-static {v0, p0, v1}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method public final δ(Lz81;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Loh;->β:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    sput-boolean v0, Loh;->β:Z

    .line 11
    .line 12
    invoke-static {}, Loh;->η()V

    .line 13
    .line 14
    .line 15
    sget-boolean v1, Loh;->ι:Z

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    invoke-static {}, Lui1;->Α()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    monitor-enter p0

    .line 27
    :try_start_0
    sget-boolean v1, Loh;->ι:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    :try_start_1
    new-instance v1, Lgh;

    .line 34
    .line 35
    const/4 v2, 0x6

    .line 36
    invoke-direct {v1, v2}, Lgh;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    sput-boolean v0, Loh;->ι:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    monitor-exit p0

    .line 50
    throw p1

    .line 51
    :cond_3
    :goto_0
    const-string v0, "~794484268AD6F67E0BEA2ECA830A11B407AB19CC18A67D1BB8C5239DB6B26E3D515E30639A76AC116B176E66FFFDA894D17CDC98"

    .line 52
    .line 53
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 58
    .line 59
    :try_start_2
    invoke-static {v1, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    goto :goto_1

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    new-instance v1, Leo1;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object v0, v1

    .line 71
    :goto_1
    instance-of v1, v0, Leo1;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    move-object v0, v2

    .line 77
    :cond_4
    check-cast v0, Ljava/lang/Class;

    .line 78
    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    const-string v0, "rb30d325659409141"

    .line 82
    .line 83
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    const-string v1, "startAnimation"

    .line 88
    .line 89
    new-instance v3, Lh;

    .line 90
    .line 91
    const/16 v4, 0xc

    .line 92
    .line 93
    invoke-direct {v3, v4}, Lh;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v1, v3}, Loh;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 97
    .line 98
    .line 99
    const-string v1, "stopAnimationV2"

    .line 100
    .line 101
    new-instance v3, Lh;

    .line 102
    .line 103
    const/16 v4, 0xd

    .line 104
    .line 105
    invoke-direct {v3, v4}, Lh;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v1, v3}, Loh;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 109
    .line 110
    .line 111
    const-string v0, "r9c6704ec7e66435d"

    .line 112
    .line 113
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    const-string v0, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    .line 117
    .line 118
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object p1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 123
    .line 124
    :try_start_3
    invoke-static {p1, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    goto :goto_3

    .line 129
    :catchall_2
    move-exception p1

    .line 130
    new-instance v0, Leo1;

    .line 131
    .line 132
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object p1, v0

    .line 136
    :goto_3
    instance-of v0, p1, Leo1;

    .line 137
    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_6
    move-object v2, p1

    .line 142
    :goto_4
    check-cast v2, Ljava/lang/Class;

    .line 143
    .line 144
    if-nez v2, :cond_7

    .line 145
    .line 146
    const-string p0, "r2178d927a39127b6"

    .line 147
    .line 148
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_7
    :try_start_4
    const-class p1, Landroid/content/Context;

    .line 153
    .line 154
    const-class v0, Landroid/util/AttributeSet;

    .line 155
    .line 156
    new-instance v1, Lnh;

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    invoke-direct {v1, v3, p0}, Lnh;-><init>(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {v2, p0}, Lqe0;->δ(Ljava/lang/Class;[Ljava/lang/Object;)Ll01;

    .line 167
    .line 168
    .line 169
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 170
    goto :goto_5

    .line 171
    :catchall_3
    move-exception p0

    .line 172
    new-instance p1, Leo1;

    .line 173
    .line 174
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    move-object p0, p1

    .line 178
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    if-eqz p0, :cond_8

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    const-string p1, "r627c3155e8d52328"

    .line 189
    .line 190
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    const-string p0, "onDraw"

    .line 194
    .line 195
    new-instance p1, Lh;

    .line 196
    .line 197
    const/16 v0, 0xe

    .line 198
    .line 199
    invoke-direct {p1, v0}, Lh;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-static {v2, p0, p1}, Loh;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 203
    .line 204
    .line 205
    const-string p0, "setProgress"

    .line 206
    .line 207
    new-instance p1, Lh;

    .line 208
    .line 209
    const/16 v0, 0xf

    .line 210
    .line 211
    invoke-direct {p1, v0}, Lh;-><init>(I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v2, p0, p1}, Loh;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 215
    .line 216
    .line 217
    const-string p0, "onTouchEvent"

    .line 218
    .line 219
    new-instance p1, Lh;

    .line 220
    .line 221
    const/16 v0, 0x10

    .line 222
    .line 223
    invoke-direct {p1, v0}, Lh;-><init>(I)V

    .line 224
    .line 225
    .line 226
    invoke-static {v2, p0, p1}, Loh;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 227
    .line 228
    .line 229
    const-string p0, "r37f4c2160ce791f0"

    .line 230
    .line 231
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :goto_6
    const-string p0, "r3726b5e350b0f428"

    .line 235
    .line 236
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public final ζ(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p1}, Loh;->α(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Ljb;

    .line 5
    .line 6
    const/16 v1, 0x13

    .line 7
    .line 8
    invoke-direct {v0, v1, p1, p0}, Ljb;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    return-void
.end method
