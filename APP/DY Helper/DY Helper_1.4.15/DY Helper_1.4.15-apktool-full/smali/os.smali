.class public final Los;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static volatile Α:Landroid/widget/TextView;

.field public static volatile Β:Landroid/widget/LinearLayout;

.field public static volatile Γ:Landroid/widget/TextView;

.field public static volatile Δ:Landroid/widget/TextView;

.field public static volatile Ε:Landroid/widget/FrameLayout;

.field public static volatile Ζ:Ljava/util/List;

.field public static volatile Η:Landroid/widget/FrameLayout;

.field public static final Θ:Ljava/util/ArrayList;

.field public static volatile Ι:Landroid/animation/ObjectAnimator;

.field public static final Κ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final Λ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile Μ:Landroid/widget/ScrollView;

.field public static volatile Ν:Ljava/lang/String;

.field public static final Ξ:Ljava/lang/Object;

.field public static final Ο:Ljava/util/LinkedHashMap;

.field public static volatile Π:Ls0;

.field public static volatile Ρ:Ls0;

.field public static final α:Landroid/os/Handler;

.field public static final β:I

.field public static final γ:I

.field public static final δ:I

.field public static final ε:I

.field public static final ζ:I

.field public static final η:I

.field public static final θ:I

.field public static final ι:I

.field public static final κ:I

.field public static final λ:I

.field public static final μ:I

.field public static final ν:I

.field public static final ξ:I

.field public static volatile ο:Ljava/lang/ref/WeakReference;

.field public static volatile π:Landroid/app/AlertDialog;

.field public static volatile ρ:Landroid/widget/ScrollView;

.field public static volatile σ:Landroid/widget/TextView;

.field public static volatile τ:Landroid/widget/TextView;

.field public static volatile υ:Landroid/widget/TextView;

.field public static volatile φ:Landroid/widget/TextView;

.field public static volatile χ:Landroid/widget/ProgressBar;

.field public static volatile ψ:Landroid/widget/TextView;

.field public static volatile ω:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Los;->α:Landroid/os/Handler;

    .line 11
    .line 12
    const/16 v0, 0xfb

    .line 13
    .line 14
    const/16 v1, 0xfe

    .line 15
    .line 16
    const/16 v2, 0xff

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput v0, Los;->β:I

    .line 23
    .line 24
    const/16 v0, 0xd7

    .line 25
    .line 26
    const/16 v1, 0xe8

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sput v0, Los;->γ:I

    .line 33
    .line 34
    const/16 v0, 0xf1

    .line 35
    .line 36
    const/16 v1, 0xf7

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    sput v3, Los;->δ:I

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    sput v0, Los;->ε:I

    .line 49
    .line 50
    const/16 v0, 0xe2

    .line 51
    .line 52
    const/16 v3, 0xee

    .line 53
    .line 54
    invoke-static {v2, v0, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sput v0, Los;->ζ:I

    .line 59
    .line 60
    const/16 v0, 0xfa

    .line 61
    .line 62
    invoke-static {v2, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sput v0, Los;->η:I

    .line 67
    .line 68
    const/16 v0, 0xe7

    .line 69
    .line 70
    const/16 v1, 0xf0

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    sput v0, Los;->θ:I

    .line 77
    .line 78
    const/16 v0, 0x6f

    .line 79
    .line 80
    const/16 v1, 0xa5

    .line 81
    .line 82
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    sput v3, Los;->ι:I

    .line 87
    .line 88
    const/16 v3, 0x2f

    .line 89
    .line 90
    const/16 v4, 0x3a

    .line 91
    .line 92
    const/16 v5, 0x3d

    .line 93
    .line 94
    invoke-static {v5, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    sput v3, Los;->κ:I

    .line 99
    .line 100
    const/16 v3, 0x6a

    .line 101
    .line 102
    const/16 v4, 0x76

    .line 103
    .line 104
    const/16 v5, 0x7b

    .line 105
    .line 106
    invoke-static {v5, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    sput v3, Los;->λ:I

    .line 111
    .line 112
    const/16 v3, 0x8f

    .line 113
    .line 114
    const/16 v4, 0x99

    .line 115
    .line 116
    const/16 v5, 0x9b

    .line 117
    .line 118
    invoke-static {v5, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    sput v3, Los;->μ:I

    .line 123
    .line 124
    const/16 v3, 0xc8

    .line 125
    .line 126
    const/16 v4, 0x57

    .line 127
    .line 128
    invoke-static {v2, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    sput v3, Los;->ν:I

    .line 133
    .line 134
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    sput v0, Los;->ξ:I

    .line 139
    .line 140
    sget-object v0, Ljz;->ε:Ljz;

    .line 141
    .line 142
    sput-object v0, Los;->Ζ:Ljava/util/List;

    .line 143
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    sput-object v0, Los;->Θ:Ljava/util/ArrayList;

    .line 150
    .line 151
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 152
    .line 153
    const/4 v1, 0x0

    .line 154
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 155
    .line 156
    .line 157
    sput-object v0, Los;->Κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 158
    .line 159
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 160
    .line 161
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 162
    .line 163
    .line 164
    sput-object v0, Los;->Λ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 165
    .line 166
    const-string v0, ""

    .line 167
    .line 168
    sput-object v0, Los;->Ν:Ljava/lang/String;

    .line 169
    .line 170
    new-instance v0, Ljava/lang/Object;

    .line 171
    .line 172
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 173
    .line 174
    .line 175
    sput-object v0, Los;->Ξ:Ljava/lang/Object;

    .line 176
    .line 177
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 180
    .line 181
    .line 182
    sput-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 183
    .line 184
    return-void
.end method

.method public static Α(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    sget-object v0, Los;->Ξ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lns;->η:Lns;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    goto :goto_2

    .line 11
    :cond_0
    sget-object v1, Lns;->θ:Lns;

    .line 12
    .line 13
    :goto_0
    sget-object v2, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lms;

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    new-instance p1, Lms;

    .line 24
    .line 25
    invoke-direct {p1, p0, p0, v1}, Lms;-><init>(Ljava/lang/String;Ljava/lang/String;Lns;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object p0, v3, Lms;->γ:Lns;

    .line 35
    .line 36
    sget-object p1, Lns;->θ:Lns;

    .line 37
    .line 38
    if-eq p0, p1, :cond_3

    .line 39
    .line 40
    sget-object p0, Lns;->η:Lns;

    .line 41
    .line 42
    iput-object p0, v3, Lms;->γ:Lns;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    sget-object p0, Lns;->θ:Lns;

    .line 46
    .line 47
    iput-object p0, v3, Lms;->γ:Lns;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    :cond_3
    :goto_1
    monitor-exit v0

    .line 50
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 51
    .line 52
    new-instance p1, Ls0;

    .line 53
    .line 54
    const/16 v0, 0x13

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ls0;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    invoke-static {}, Los;->Ε()V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Los;->Δ()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :goto_2
    monitor-exit v0

    .line 70
    throw p0
.end method

.method public static Β(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "task restarted from terminal state, taskId="

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Los;->Ξ:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    invoke-static {}, Los;->γ()V

    .line 10
    .line 11
    .line 12
    sget-object v2, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lms;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    new-instance v0, Lms;

    .line 24
    .line 25
    sget-object v3, Lns;->ζ:Lns;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1, v3}, Lms;-><init>(Ljava/lang/String;Ljava/lang/String;Lns;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-object v2, v3, Lms;->γ:Lns;

    .line 37
    .line 38
    iput-object p1, v3, Lms;->β:Ljava/lang/String;

    .line 39
    .line 40
    sget-object p1, Lns;->ζ:Lns;

    .line 41
    .line 42
    iput-object p1, v3, Lms;->γ:Lns;

    .line 43
    .line 44
    invoke-static {v2}, Los;->τ(Lns;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    sget-object p0, Lns;->ε:Lns;

    .line 58
    .line 59
    if-eq v2, p0, :cond_3

    .line 60
    .line 61
    invoke-static {v2}, Los;->τ(Lns;)Z

    .line 62
    .line 63
    .line 64
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v4, 0x0

    .line 69
    :cond_3
    :goto_0
    monitor-exit v1

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    invoke-static {}, Los;->Ε()V

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-static {}, Los;->Δ()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :goto_1
    monitor-exit v1

    .line 80
    throw p0
.end method

.method public static Γ(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sput-object v0, Los;->ο:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-static {p0}, Los;->ρ(Landroid/app/Activity;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    invoke-static {}, Los;->ε()V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Los;->γ()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit p0

    .line 29
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v0, Ls0;

    .line 32
    .line 33
    const/16 v1, 0x14

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ls0;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    monitor-exit p0

    .line 44
    throw v0

    .line 45
    :cond_0
    invoke-static {}, Los;->β()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    invoke-static {}, Los;->Ε()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public static Δ()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Los;->ρ:Landroid/widget/ScrollView;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {}, Los;->Μ()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v0, Los;->Λ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :cond_2
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v1, Ls0;

    .line 37
    .line 38
    const/16 v2, 0x15

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ls0;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static Ε()V
    .locals 5

    .line 1
    invoke-static {}, Los;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Los;->Ξ:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Los;->Π:Ls0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :cond_1
    :try_start_1
    sget-object v1, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_4

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast v1, Ljava/lang/Iterable;

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    check-cast v2, Ljava/util/Collection;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lms;

    .line 59
    .line 60
    iget-object v2, v2, Lms;->γ:Lns;

    .line 61
    .line 62
    sget-object v3, Lns;->ε:Lns;

    .line 63
    .line 64
    if-eq v2, v3, :cond_3

    .line 65
    .line 66
    new-instance v1, Ls0;

    .line 67
    .line 68
    const/16 v2, 0x16

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ls0;-><init>(I)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Los;->Π:Ls0;

    .line 74
    .line 75
    sget-object v2, Los;->α:Landroid/os/Handler;

    .line 76
    .line 77
    const-wide/16 v3, 0x50

    .line 78
    .line 79
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    .line 82
    monitor-exit v0

    .line 83
    return-void

    .line 84
    :catchall_0
    move-exception v1

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    :goto_0
    monitor-exit v0

    .line 87
    return-void

    .line 88
    :goto_1
    monitor-exit v0

    .line 89
    throw v1
.end method

.method public static Ζ(IZ)V
    .locals 5

    .line 1
    sget-object v0, Los;->χ:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0x64

    .line 8
    .line 9
    invoke-static {p0, v1, v2}, Lj81;->μ(III)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sget-object v1, Los;->π:Landroid/app/AlertDialog;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v4, 0x1

    .line 23
    if-ne v1, v4, :cond_6

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ne v1, p0, :cond_1

    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :cond_1
    sget-object v1, Los;->Ι:Landroid/animation/ObjectAnimator;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    .line 37
    .line 38
    .line 39
    :cond_2
    sput-object v3, Los;->Ι:Landroid/animation/ObjectAnimator;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sub-int v1, p0, v1

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    if-ge p0, v2, :cond_5

    .line 54
    .line 55
    const/16 p1, 0x8

    .line 56
    .line 57
    if-le v1, p1, :cond_5

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    filled-new-array {p1, p0}, [I

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string p1, "progress"

    .line 68
    .line 69
    invoke-static {v0, p1, p0}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-wide/16 v3, 0x168

    .line 74
    .line 75
    int-to-long v0, v1

    .line 76
    mul-long/2addr v0, v3

    .line 77
    int-to-long v2, v2

    .line 78
    div-long/2addr v0, v2

    .line 79
    const-wide/16 v2, 0x78

    .line 80
    .line 81
    cmp-long p1, v0, v2

    .line 82
    .line 83
    if-gez p1, :cond_3

    .line 84
    .line 85
    move-wide v0, v2

    .line 86
    :cond_3
    const-wide/16 v2, 0x1a4

    .line 87
    .line 88
    cmp-long p1, v0, v2

    .line 89
    .line 90
    if-lez p1, :cond_4

    .line 91
    .line 92
    move-wide v0, v2

    .line 93
    :cond_4
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 94
    .line 95
    .line 96
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 97
    .line 98
    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 105
    .line 106
    .line 107
    sput-object p0, Los;->Ι:Landroid/animation/ObjectAnimator;

    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    invoke-virtual {v0, p0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    sget-object p1, Los;->Ι:Landroid/animation/ObjectAnimator;

    .line 115
    .line 116
    if-eqz p1, :cond_7

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    .line 119
    .line 120
    .line 121
    :cond_7
    sput-object v3, Los;->Ι:Landroid/animation/ObjectAnimator;

    .line 122
    .line 123
    invoke-virtual {v0, p0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public static Η(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget-object v0, Los;->π:Landroid/app/AlertDialog;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 22
    .line 23
    int-to-float p0, p0

    .line 24
    const v1, 0x3f6147ae    # 0.88f

    .line 25
    .line 26
    .line 27
    mul-float/2addr p0, v1

    .line 28
    float-to-int p0, p0

    .line 29
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 43
    .line 44
    .line 45
    const v1, 0x3ec28f5c    # 0.38f

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 49
    .line 50
    .line 51
    const v1, 0x80020

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 55
    .line 56
    .line 57
    const/4 v1, -0x2

    .line 58
    invoke-virtual {v0, p0, v1}, Landroid/view/Window;->setLayout(II)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance v0, Ls0;

    .line 66
    .line 67
    const/16 v1, 0xe

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ls0;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static Θ(Lls;)V
    .locals 11

    .line 1
    sget-object v0, Los;->ρ:Landroid/widget/ScrollView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, "showFinishedUi: progressView is null, cannot show finished UI"

    .line 6
    .line 7
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v0, Los;->σ:Landroid/widget/TextView;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-boolean v1, p0, Lls;->ε:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const-string v1, "\ud83c\udf53 \u9002\u914d\u5b8c\u6210\uff0c\u90e8\u5206\u4efb\u52a1\u5931\u8d25"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const-string v1, "\ud83c\udf89 \u9002\u914d\u5b8c\u6210\u5566\uff01"

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    sget-object v0, Los;->τ:Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iget-boolean v1, p0, Lls;->ε:Z

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    const-string v1, "\u90e8\u5206 DexKit \u76ee\u6807\u6ca1\u6709\u627e\u5230\uff0c\u6a21\u5757\u4e0d\u4f1a\u963b\u6b62\u4f7f\u7528\u3002"

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    const-string v1, "\u5f53\u524d\u7248\u672c\u5df2\u7ecf\u8ba4\u8bc6\u597d\u5566\uff5e"

    .line 39
    .line 40
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :cond_4
    sget-object v0, Los;->φ:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget v1, p0, Lls;->β:I

    .line 48
    .line 49
    iget v2, p0, Lls;->α:I

    .line 50
    .line 51
    const-string v3, "/"

    .line 52
    .line 53
    const-string v4, ")"

    .line 54
    .line 55
    const-string v5, "\u2728 100% ("

    .line 56
    .line 57
    invoke-static {v5, v1, v3, v2, v4}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    :cond_5
    const/16 v0, 0x64

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-static {v0, v1}, Los;->Ζ(IZ)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Los;->ψ:Landroid/widget/TextView;

    .line 71
    .line 72
    if-eqz v0, :cond_9

    .line 73
    .line 74
    iget-boolean v2, p0, Lls;->ε:Z

    .line 75
    .line 76
    if-eqz v2, :cond_8

    .line 77
    .line 78
    iget-object v3, p0, Lls;->ζ:Ljava/util/ArrayList;

    .line 79
    .line 80
    new-instance v8, Lhm;

    .line 81
    .line 82
    const/4 v2, 0x7

    .line 83
    invoke-direct {v8, v2}, Lhm;-><init>(I)V

    .line 84
    .line 85
    .line 86
    const/16 v9, 0x1e

    .line 87
    .line 88
    const-string v4, "\n"

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-object v3, p0, Lls;->ζ:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    const/4 v8, 0x0

    .line 107
    const/16 v9, 0x3e

    .line 108
    .line 109
    const-string v4, "|"

    .line 110
    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    sget-object v5, Los;->Ν:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v5, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_7

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    sput-object v4, Los;->Ν:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    new-instance v8, Lhm;

    .line 134
    .line 135
    const/16 v4, 0x8

    .line 136
    .line 137
    invoke-direct {v8, v4}, Lhm;-><init>(I)V

    .line 138
    .line 139
    .line 140
    const/16 v9, 0x1e

    .line 141
    .line 142
    const-string v4, "; "

    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    const/4 v6, 0x0

    .line 146
    const/4 v7, 0x0

    .line 147
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    new-instance v4, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v5, "DexKit scan finished with missing targets, count="

    .line 154
    .line 155
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v5, ", targets="

    .line 162
    .line 163
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v3}, Los;->φ(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :goto_2
    const-string v3, "\u4ee5\u4e0b\u9002\u914d\u9879\u626b\u63cf\u4e3a\u7a7a\u6216\u626b\u63cf\u9519\u8bef\uff0c\u5df2\u6309\u5f53\u524d\u7248\u672c\u8bb0\u5f55\u4e3a\u5931\u8d25\uff0c\u4e0b\u6b21\u4ec5\u7248\u672c\u53d8\u5316\u540e\u91cd\u626b\u3002\n"

    .line 177
    .line 178
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    goto :goto_3

    .line 183
    :cond_8
    const-string v2, "\u6240\u6709\u6b65\u9aa4\u90fd\u5b8c\u6210\u5566\uff5e\n\u5efa\u8bae\u7acb\u5373\u91cd\u542f\u6296\u97f3\uff0c\u8ba9\u5168\u90e8\u529f\u80fd\u751f\u6548\u3002"

    .line 184
    .line 185
    :goto_3
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    .line 187
    .line 188
    :cond_9
    sget-object v0, Los;->ω:Landroid/widget/TextView;

    .line 189
    .line 190
    if-eqz v0, :cond_a

    .line 191
    .line 192
    const/16 v2, 0x8

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 195
    .line 196
    .line 197
    :cond_a
    sget-object v0, Los;->Α:Landroid/widget/TextView;

    .line 198
    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 202
    .line 203
    .line 204
    :cond_b
    sget-object v0, Los;->Β:Landroid/widget/LinearLayout;

    .line 205
    .line 206
    if-eqz v0, :cond_c

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 210
    .line 211
    :cond_c
    sget-object v0, Los;->Γ:Landroid/widget/TextView;

    .line 212
    .line 213
    const/4 v1, 0x1

    .line 214
    if-eqz v0, :cond_d

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 217
    .line 218
    .line 219
    :cond_d
    sget-object v0, Los;->Δ:Landroid/widget/TextView;

    .line 220
    .line 221
    if-eqz v0, :cond_e

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 224
    .line 225
    .line 226
    :cond_e
    iget-boolean p0, p0, Lls;->ε:Z

    .line 227
    .line 228
    if-nez p0, :cond_f

    .line 229
    .line 230
    invoke-static {}, Los;->σ()Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    if-nez p0, :cond_f

    .line 235
    .line 236
    invoke-static {}, Los;->ω()V

    .line 237
    .line 238
    .line 239
    const-string p0, "showFinishedUi: auto marked restart prompt as acked"

    .line 240
    .line 241
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_f
    sget-object p0, Los;->ρ:Landroid/widget/ScrollView;

    .line 245
    .line 246
    if-nez p0, :cond_10

    .line 247
    .line 248
    return-void

    .line 249
    :cond_10
    new-instance v0, Lis;

    .line 250
    .line 251
    const/4 v2, 0x0

    .line 252
    invoke-direct {v0, v2, v1}, Lis;-><init>(IZ)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 256
    .line 257
    .line 258
    return-void
.end method

.method public static Ι()V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Ls0;

    .line 18
    .line 19
    const/16 v2, 0x19

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ls0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object v0, Los;->ο:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/app/Activity;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    :goto_0
    const/4 v1, 0x0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const-string v0, "no active activity, cannot show dialog"

    .line 44
    .line 45
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Los;->Κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_7

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {}, Los;->β()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_4

    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    :try_start_0
    invoke-static {v1}, Los;->κ(Z)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Los;->υ(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v0, v2}, Los;->θ(Landroid/app/Activity;Landroid/graphics/drawable/Drawable;)Landroid/widget/ScrollView;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    sput-object v2, Los;->ρ:Landroid/widget/ScrollView;

    .line 86
    .line 87
    sget-object v3, Los;->Γ:Landroid/widget/TextView;

    .line 88
    .line 89
    if-eqz v3, :cond_5

    .line 90
    .line 91
    new-instance v4, Lpa;

    .line 92
    .line 93
    const/4 v5, 0x2

    .line 94
    invoke-direct {v4, v5}, Lpa;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    sget-object v3, Los;->Δ:Landroid/widget/TextView;

    .line 101
    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    new-instance v4, Lpa;

    .line 105
    .line 106
    const/4 v5, 0x3

    .line 107
    invoke-direct {v4, v5}, Lpa;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 114
    .line 115
    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    sput-object v2, Los;->π:Landroid/app/AlertDialog;

    .line 131
    .line 132
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 133
    .line 134
    .line 135
    sget-object v2, Los;->Κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 136
    .line 137
    const/4 v3, 0x1

    .line 138
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0}, Los;->Η(Landroid/app/Activity;)V

    .line 142
    .line 143
    .line 144
    invoke-static {}, Los;->Λ()V

    .line 145
    .line 146
    .line 147
    invoke-static {}, Los;->Μ()V

    .line 148
    .line 149
    .line 150
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 151
    .line 152
    new-instance v2, Ls0;

    .line 153
    .line 154
    const/16 v3, 0xd

    .line 155
    .line 156
    invoke-direct {v2, v3}, Ls0;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 160
    .line 161
    .line 162
    const-string v0, "progress dialog shown successfully"

    .line 163
    .line 164
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :catch_0
    move-exception v0

    .line 169
    const-string v2, "show dialog failed"

    .line 170
    .line 171
    const-string v3, "r459ca5a644abf82d"

    .line 172
    .line 173
    invoke-static {v3, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v1}, Los;->κ(Z)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    :goto_1
    const-string v0, "activity is finishing/destroyed, cannot show dialog"

    .line 181
    .line 182
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    sget-object v0, Los;->Κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public static Κ(Lls;I)V
    .locals 6

    .line 1
    sget-object v0, Los;->σ:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "\ud83d\udc3e DYHelper \u840c\u840c\u9002\u914d\u4e2d"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v0, Los;->τ:Landroid/widget/TextView;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v1, "\u6b63\u5728\u8ba4\u8bc6\u5f53\u524d\u6296\u97f3\u7248\u672c\uff0c\u8bf7\u7a0d\u7b49\u4e00\u4e0b\uff5e"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    sget-object v0, Los;->φ:Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget v1, p0, Lls;->β:I

    .line 24
    .line 25
    iget v2, p0, Lls;->α:I

    .line 26
    .line 27
    const-string v3, "% ("

    .line 28
    .line 29
    const-string v4, "/"

    .line 30
    .line 31
    const-string v5, "\u2728 "

    .line 32
    .line 33
    invoke-static {v5, p1, v3, v1, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, ")"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    const/4 v0, 0x1

    .line 53
    invoke-static {p1, v0}, Los;->Ζ(IZ)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Los;->ψ:Landroid/widget/TextView;

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    iget-object p0, p0, Lls;->γ:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    const-string v0, "\u6b63\u5728\u5904\u7406\uff1a"

    .line 65
    .line 66
    const-string v1, "\n\u8bf7\u7a0d\u7b49\uff0c\u9a6c\u4e0a\u5c31\u597d\uff5e"

    .line 67
    .line 68
    invoke-static {v0, p0, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const-string p0, "\u7b49\u5f85\u4efb\u52a1..."

    .line 74
    .line 75
    :goto_0
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    sget-object p0, Los;->ω:Landroid/widget/TextView;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    :cond_5
    sget-object p0, Los;->ω:Landroid/widget/TextView;

    .line 87
    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    const-string v0, "\u9996\u6b21\u542f\u52a8\u4f1a\u6162\u4e00\u70b9\uff0c\u5b8c\u6210\u540e\u5c31\u4f1a\u53d8\u5feb\u5566"

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    sget-object p0, Los;->Α:Landroid/widget/TextView;

    .line 96
    .line 97
    const/16 v0, 0x8

    .line 98
    .line 99
    if-eqz p0, :cond_7

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    :cond_7
    sget-object p0, Los;->Β:Landroid/widget/LinearLayout;

    .line 105
    .line 106
    if-eqz p0, :cond_8

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    :cond_8
    sget-object p0, Los;->ρ:Landroid/widget/ScrollView;

    .line 112
    .line 113
    if-nez p0, :cond_9

    .line 114
    .line 115
    return-void

    .line 116
    :cond_9
    new-instance v0, Lis;

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    invoke-direct {v0, v1, p1}, Lis;-><init>(IZ)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public static Λ()V
    .locals 17

    .line 1
    invoke-static {}, Los;->δ()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Los;->Ε:Landroid/widget/FrameLayout;

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v6, -0x1

    .line 16
    const/4 v7, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget-object v8, Los;->Θ:Ljava/util/ArrayList;

    .line 20
    .line 21
    sget-object v9, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 22
    .line 23
    const/high16 v10, 0x40e00000    # 7.0f

    .line 24
    .line 25
    invoke-static {v10}, Los;->λ(F)F

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    neg-float v10, v10

    .line 30
    new-array v11, v2, [F

    .line 31
    .line 32
    aput v7, v11, v4

    .line 33
    .line 34
    aput v10, v11, v3

    .line 35
    .line 36
    aput v7, v11, v5

    .line 37
    .line 38
    invoke-static {v1, v9, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-wide/16 v9, 0x514

    .line 43
    .line 44
    invoke-virtual {v1, v9, v10}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_0
    sget-object v1, Los;->σ:Landroid/widget/TextView;

    .line 57
    .line 58
    const-wide/16 v8, 0x44c

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    sget-object v10, Los;->Θ:Ljava/util/ArrayList;

    .line 63
    .line 64
    sget-object v11, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 65
    .line 66
    new-array v12, v5, [F

    .line 67
    .line 68
    fill-array-data v12, :array_0

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v11, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v5}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    sget-object v1, Los;->Ζ:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move v10, v4

    .line 97
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-eqz v11, :cond_3

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    add-int/lit8 v12, v10, 0x1

    .line 108
    .line 109
    if-ltz v10, :cond_2

    .line 110
    .line 111
    check-cast v11, Landroid/view/View;

    .line 112
    .line 113
    sget-object v13, Los;->Θ:Ljava/util/ArrayList;

    .line 114
    .line 115
    sget-object v14, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 116
    .line 117
    const/high16 v15, 0x40800000    # 4.0f

    .line 118
    .line 119
    move/from16 v16, v3

    .line 120
    .line 121
    int-to-float v3, v10

    .line 122
    add-float/2addr v3, v15

    .line 123
    invoke-static {v3}, Los;->λ(F)F

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    neg-float v3, v3

    .line 128
    new-array v15, v2, [F

    .line 129
    .line 130
    aput v7, v15, v4

    .line 131
    .line 132
    aput v3, v15, v16

    .line 133
    .line 134
    aput v7, v15, v5

    .line 135
    .line 136
    invoke-static {v11, v14, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    int-to-long v10, v10

    .line 141
    const-wide/16 v14, 0x8c

    .line 142
    .line 143
    mul-long/2addr v14, v10

    .line 144
    add-long/2addr v14, v8

    .line 145
    invoke-virtual {v3, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 146
    .line 147
    .line 148
    const-wide/16 v14, 0x64

    .line 149
    .line 150
    mul-long/2addr v10, v14

    .line 151
    invoke-virtual {v3, v10, v11}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move v10, v12

    .line 164
    move/from16 v3, v16

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_2
    invoke-static {}, Lyh;->х()V

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    throw v0

    .line 172
    :cond_3
    sget-object v0, Los;->Θ:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_4

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Landroid/animation/Animator;

    .line 189
    .line 190
    invoke-virtual {v1}, Landroid/animation/Animator;->start()V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_4
    return-void

    .line 195
    :array_0
    .array-data 4
        0x3f5c28f6    # 0.86f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static Μ()V
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Los;->ρ:Landroid/widget/ScrollView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "updateProgressDialog: progressView is null, skipping update"

    .line 6
    .line 7
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Los;->ι()Lls;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, v0, Lls;->α:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-gtz v1, :cond_8

    .line 19
    .line 20
    sget-object v0, Los;->σ:Landroid/widget/TextView;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string v1, "\ud83d\udc3e \u6b63\u5728\u51c6\u5907\u5c0f\u9c7c\u5e72..."

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    sget-object v0, Los;->τ:Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const-string v1, "\u7b49\u5f85\u9002\u914d\u4efb\u52a1\u5f00\u59cb\uff5e"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    sget-object v0, Los;->φ:Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-string v1, "\u2728 0%"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-static {v2, v2}, Los;->Ζ(IZ)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Los;->ψ:Landroid/widget/TextView;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    const-string v1, "\u7b49\u5f85\u4efb\u52a1\u9192\u6765..."

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    sget-object v0, Los;->ω:Landroid/widget/TextView;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    :cond_5
    sget-object v0, Los;->Α:Landroid/widget/TextView;

    .line 67
    .line 68
    const/16 v1, 0x8

    .line 69
    .line 70
    if-eqz v0, :cond_6

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    :cond_6
    sget-object v0, Los;->Β:Landroid/widget/LinearLayout;

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    :cond_7
    return-void

    .line 83
    :cond_8
    iget v3, v0, Lls;->β:I

    .line 84
    .line 85
    const/16 v4, 0x64

    .line 86
    .line 87
    mul-int/2addr v3, v4

    .line 88
    div-int/2addr v3, v1

    .line 89
    invoke-static {v3, v2, v4}, Lj81;->μ(III)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iget-boolean v2, v0, Lls;->δ:Z

    .line 94
    .line 95
    if-eqz v2, :cond_9

    .line 96
    .line 97
    invoke-static {v0}, Los;->Θ(Lls;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_9
    invoke-static {v0, v1}, Los;->Κ(Lls;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :catch_0
    move-exception v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "update dialog failed: "

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public static α()V
    .locals 9

    .line 1
    sget-object v0, Los;->ο:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    sget-object v1, Los;->π:Landroid/app/AlertDialog;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_1
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    const v3, 0x3f6147ae    # 0.88f

    .line 47
    .line 48
    .line 49
    mul-float/2addr v1, v3

    .line 50
    float-to-int v1, v1

    .line 51
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 52
    .line 53
    int-to-float v0, v0

    .line 54
    mul-float/2addr v0, v3

    .line 55
    float-to-int v0, v0

    .line 56
    sget-object v3, Los;->Μ:Landroid/widget/ScrollView;

    .line 57
    .line 58
    const/4 v4, -0x2

    .line 59
    if-eqz v3, :cond_6

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_6

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    sub-int v7, v1, v7

    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    sub-int/2addr v7, v8

    .line 79
    if-gez v7, :cond_4

    .line 80
    .line 81
    move v7, v5

    .line 82
    :cond_4
    const/high16 v8, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    invoke-virtual {v6, v7, v5}, Landroid/view/View;->measure(II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    add-int/2addr v6, v5

    .line 104
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    add-int/2addr v5, v6

    .line 109
    if-le v5, v0, :cond_5

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    move v0, v4

    .line 113
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    if-eqz v5, :cond_6

    .line 118
    .line 119
    iget v6, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 120
    .line 121
    if-eq v6, v0, :cond_6

    .line 122
    .line 123
    iput v0, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 124
    .line 125
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    invoke-virtual {v2, v1, v4}, Landroid/view/Window;->setLayout(II)V

    .line 129
    .line 130
    .line 131
    :cond_7
    :goto_1
    return-void
.end method

.method public static β()Z
    .locals 6

    .line 1
    invoke-static {}, Los;->σ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "canShowProgressDialog: restart prompt already acked"

    .line 9
    .line 10
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    sget-object v0, Los;->Ξ:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    sget-object v2, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x1

    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v2, Ljava/lang/Iterable;

    .line 34
    .line 35
    instance-of v3, v2, Ljava/util/Collection;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Ljava/util/Collection;

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lms;

    .line 66
    .line 67
    iget-object v3, v3, Lms;->γ:Lns;

    .line 68
    .line 69
    sget-object v5, Lns;->ε:Lns;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    if-eq v3, v5, :cond_2

    .line 72
    .line 73
    move v2, v4

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    :goto_0
    move v2, v1

    .line 76
    :goto_1
    monitor-exit v0

    .line 77
    if-nez v2, :cond_4

    .line 78
    .line 79
    const-string v0, "canShowProgressDialog: no showable tasks"

    .line 80
    .line 81
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return v1

    .line 85
    :cond_4
    return v4

    .line 86
    :goto_2
    monitor-exit v0

    .line 87
    throw v1
.end method

.method public static γ()V
    .locals 2

    .line 1
    sget-object v0, Los;->Ρ:Ls0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Los;->α:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Los;->Ρ:Ls0;

    .line 12
    .line 13
    return-void
.end method

.method public static δ()V
    .locals 4

    .line 1
    sget-object v0, Los;->Ι:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    sput-object v0, Los;->Ι:Landroid/animation/ObjectAnimator;

    .line 10
    .line 11
    sget-object v0, Los;->Θ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroid/animation/Animator;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object v0, Los;->Θ:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    sget-object v1, Los;->Ε:Landroid/widget/FrameLayout;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    sget-object v1, Los;->σ:Landroid/widget/TextView;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    sget-object v1, Los;->τ:Landroid/widget/TextView;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    sget-object v1, Los;->υ:Landroid/widget/TextView;

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_5
    sget-object v1, Los;->φ:Landroid/widget/TextView;

    .line 72
    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_6
    sget-object v1, Los;->Ζ:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Landroid/view/View;

    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 104
    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, Landroid/view/View;->setRotation(F)V

    .line 111
    .line 112
    .line 113
    const/high16 v2, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleY(F)V

    .line 119
    .line 120
    .line 121
    sget-object v3, Los;->Η:Landroid/widget/FrameLayout;

    .line 122
    .line 123
    if-ne v1, v3, :cond_7

    .line 124
    .line 125
    const v2, 0x3e99999a    # 0.3f

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    return-void
.end method

.method public static ε()V
    .locals 2

    .line 1
    sget-object v0, Los;->Π:Ls0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Los;->α:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Los;->Π:Ls0;

    .line 12
    .line 13
    return-void
.end method

.method public static ζ(Landroid/app/Activity;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :goto_0
    new-instance v0, Leo1;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object p0, v0

    .line 44
    :goto_1
    instance-of v0, p0, Leo1;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move-object p1, p0

    .line 50
    :goto_2
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    return-object p1
.end method

.method public static η(Landroid/app/Activity;Ljava/lang/String;I)Landroid/widget/TextView;
    .locals 7

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x11

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x2

    .line 22
    const/high16 v1, 0x41600000    # 14.0f

    .line 23
    .line 24
    invoke-virtual {v0, p2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 25
    .line 26
    .line 27
    sget-object p2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 28
    .line 29
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {v0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 37
    .line 38
    .line 39
    new-instance p2, Landroid/graphics/drawable/StateListDrawable;

    .line 40
    .line 41
    invoke-direct {p2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 42
    .line 43
    .line 44
    const v1, 0x10100a7

    .line 45
    .line 46
    .line 47
    filled-new-array {v1}, [I

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget v2, Los;->ζ:I

    .line 52
    .line 53
    const/high16 v3, 0x41900000    # 18.0f

    .line 54
    .line 55
    const/high16 v4, 0x3f800000    # 1.0f

    .line 56
    .line 57
    sget v5, Los;->γ:I

    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v5}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {p2, v1, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    const v1, 0x101009c

    .line 67
    .line 68
    .line 69
    filled-new-array {v1}, [I

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {p0, v2, v3, v4, v5}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p2, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 78
    .line 79
    .line 80
    new-array p1, p1, [I

    .line 81
    .line 82
    sget v1, Los;->ε:I

    .line 83
    .line 84
    invoke-static {p0, v1, v3, v4, v5}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p2, p1, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method

.method public static θ(Landroid/app/Activity;Landroid/graphics/drawable/Drawable;)Landroid/widget/ScrollView;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/ScrollView;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    const/4 v4, -0x2

    .line 12
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-virtual {v1, v5}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v5}, Landroid/view/View;->setOverScrollMode(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v5}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->setScrollbarFadingEnabled(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Los;->Μ:Landroid/widget/ScrollView;

    .line 42
    .line 43
    new-instance v6, Landroid/widget/FrameLayout;

    .line 44
    .line 45
    invoke-direct {v6, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 52
    .line 53
    .line 54
    const/high16 v7, 0x41200000    # 10.0f

    .line 55
    .line 56
    invoke-static {v0, v7}, Los;->μ(Landroid/app/Activity;F)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-static {v0, v7}, Los;->μ(Landroid/app/Activity;F)I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    invoke-static {v0, v7}, Los;->μ(Landroid/app/Activity;F)I

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    invoke-static {v0, v7}, Los;->μ(Landroid/app/Activity;F)I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    invoke-virtual {v6, v8, v9, v10, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 73
    .line 74
    .line 75
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    invoke-direct {v8, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v6, v8}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    .line 82
    .line 83
    new-instance v8, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v8, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 92
    .line 93
    .line 94
    sget v9, Los;->β:I

    .line 95
    .line 96
    sget v10, Los;->γ:I

    .line 97
    .line 98
    const/high16 v11, 0x41e00000    # 28.0f

    .line 99
    .line 100
    const/high16 v12, 0x3f800000    # 1.0f

    .line 101
    .line 102
    invoke-static {v0, v9, v11, v12, v10}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v8, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 107
    .line 108
    .line 109
    const/high16 v9, 0x41c00000    # 24.0f

    .line 110
    .line 111
    invoke-static {v0, v9}, Los;->μ(Landroid/app/Activity;F)I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    const/high16 v14, 0x41900000    # 18.0f

    .line 116
    .line 117
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 118
    .line 119
    .line 120
    move-result v14

    .line 121
    invoke-static {v0, v9}, Los;->μ(Landroid/app/Activity;F)I

    .line 122
    .line 123
    .line 124
    move-result v15

    .line 125
    const/high16 v11, 0x41a00000    # 20.0f

    .line 126
    .line 127
    invoke-static {v0, v11}, Los;->μ(Landroid/app/Activity;F)I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    invoke-virtual {v8, v13, v14, v15, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 143
    .line 144
    const/high16 v13, 0x41400000    # 12.0f

    .line 145
    .line 146
    mul-float/2addr v11, v13

    .line 147
    invoke-virtual {v8, v11}, Landroid/view/View;->setElevation(F)V

    .line 148
    .line 149
    .line 150
    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 151
    .line 152
    invoke-direct {v11, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 153
    .line 154
    .line 155
    const/high16 v14, 0x40c00000    # 6.0f

    .line 156
    .line 157
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-virtual {v11, v15, v7, v13, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    .line 178
    .line 179
    new-instance v4, Landroid/widget/FrameLayout;

    .line 180
    .line 181
    invoke-direct {v4, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 188
    .line 189
    .line 190
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 191
    .line 192
    const/high16 v11, 0x42a40000    # 82.0f

    .line 193
    .line 194
    invoke-static {v0, v11}, Los;->μ(Landroid/app/Activity;F)I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    invoke-direct {v7, v3, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 202
    .line 203
    .line 204
    sget v7, Los;->ν:I

    .line 205
    .line 206
    const/high16 v11, 0x41b80000    # 23.0f

    .line 207
    .line 208
    const-string v13, "\u2726"

    .line 209
    .line 210
    invoke-static {v0, v13, v7, v11}, Los;->χ(Landroid/app/Activity;Ljava/lang/String;IF)Landroid/widget/TextView;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 215
    .line 216
    const/high16 v13, 0x42080000    # 34.0f

    .line 217
    .line 218
    invoke-static {v0, v13}, Los;->μ(Landroid/app/Activity;F)I

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    invoke-static {v0, v13}, Los;->μ(Landroid/app/Activity;F)I

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    const v9, 0x800013

    .line 227
    .line 228
    .line 229
    invoke-direct {v11, v15, v14, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 230
    .line 231
    .line 232
    invoke-static {v0, v13}, Los;->μ(Landroid/app/Activity;F)I

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    iput v9, v11, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 237
    .line 238
    invoke-virtual {v4, v7, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 239
    .line 240
    .line 241
    new-instance v9, Landroid/widget/FrameLayout;

    .line 242
    .line 243
    invoke-direct {v9, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 244
    .line 245
    .line 246
    const/4 v11, 0x2

    .line 247
    invoke-virtual {v9, v11}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 248
    .line 249
    .line 250
    sget v14, Los;->δ:I

    .line 251
    .line 252
    new-instance v15, Landroid/graphics/drawable/GradientDrawable;

    .line 253
    .line 254
    invoke-direct {v15}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v15, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v15, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 261
    .line 262
    .line 263
    invoke-static {v0, v12}, Los;->μ(Landroid/app/Activity;F)I

    .line 264
    .line 265
    .line 266
    move-result v14

    .line 267
    invoke-virtual {v15, v14, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 271
    .line 272
    .line 273
    const/high16 v14, 0x41000000    # 8.0f

    .line 274
    .line 275
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 276
    .line 277
    .line 278
    move-result v15

    .line 279
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    invoke-virtual {v9, v15, v5, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 292
    .line 293
    .line 294
    invoke-static/range {p0 .. p1}, Los;->ζ(Landroid/app/Activity;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    const/high16 v12, 0x42000000    # 32.0f

    .line 299
    .line 300
    const-string v13, "\ud83d\udc3e"

    .line 301
    .line 302
    const/16 v15, 0x11

    .line 303
    .line 304
    if-eqz v5, :cond_0

    .line 305
    .line 306
    new-instance v14, Landroid/widget/ImageView;

    .line 307
    .line 308
    invoke-direct {v14, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v14, v11}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 312
    .line 313
    .line 314
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 315
    .line 316
    invoke-virtual {v14, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v14, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 320
    .line 321
    .line 322
    goto :goto_0

    .line 323
    :cond_0
    new-instance v14, Landroid/widget/TextView;

    .line 324
    .line 325
    invoke-direct {v14, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v14, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v14, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v14, v11, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 338
    .line 339
    .line 340
    :goto_0
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 341
    .line 342
    const/4 v5, -0x1

    .line 343
    invoke-direct {v3, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v9, v14, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 347
    .line 348
    .line 349
    sput-object v9, Los;->Ε:Landroid/widget/FrameLayout;

    .line 350
    .line 351
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 352
    .line 353
    const/high16 v5, 0x428c0000    # 70.0f

    .line 354
    .line 355
    invoke-static {v0, v5}, Los;->μ(Landroid/app/Activity;F)I

    .line 356
    .line 357
    .line 358
    move-result v14

    .line 359
    invoke-static {v0, v5}, Los;->μ(Landroid/app/Activity;F)I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    invoke-direct {v3, v14, v5, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4, v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 367
    .line 368
    .line 369
    sget v3, Los;->ξ:I

    .line 370
    .line 371
    const-string v5, "\u2661"

    .line 372
    .line 373
    const/high16 v9, 0x41c00000    # 24.0f

    .line 374
    .line 375
    invoke-static {v0, v5, v3, v9}, Los;->χ(Landroid/app/Activity;Ljava/lang/String;IF)Landroid/widget/TextView;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 380
    .line 381
    const/high16 v14, 0x42080000    # 34.0f

    .line 382
    .line 383
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 388
    .line 389
    .line 390
    move-result v11

    .line 391
    const v14, 0x800035

    .line 392
    .line 393
    .line 394
    invoke-direct {v9, v2, v11, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 395
    .line 396
    .line 397
    const/high16 v2, 0x40800000    # 4.0f

    .line 398
    .line 399
    invoke-static {v0, v2}, Los;->μ(Landroid/app/Activity;F)I

    .line 400
    .line 401
    .line 402
    move-result v11

    .line 403
    iput v11, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 404
    .line 405
    const/high16 v11, 0x42500000    # 52.0f

    .line 406
    .line 407
    invoke-static {v0, v11}, Los;->μ(Landroid/app/Activity;F)I

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    iput v11, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 412
    .line 413
    invoke-virtual {v4, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 414
    .line 415
    .line 416
    sget v9, Los;->ι:I

    .line 417
    .line 418
    const/high16 v11, 0x41b00000    # 22.0f

    .line 419
    .line 420
    const-string v14, "\u273f"

    .line 421
    .line 422
    invoke-static {v0, v14, v9, v11}, Los;->χ(Landroid/app/Activity;Ljava/lang/String;IF)Landroid/widget/TextView;

    .line 423
    .line 424
    .line 425
    move-result-object v11

    .line 426
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 427
    .line 428
    const/high16 v15, 0x42080000    # 34.0f

    .line 429
    .line 430
    invoke-static {v0, v15}, Los;->μ(Landroid/app/Activity;F)I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    invoke-static {v0, v15}, Los;->μ(Landroid/app/Activity;F)I

    .line 435
    .line 436
    .line 437
    move-result v15

    .line 438
    move-object/from16 v19, v1

    .line 439
    .line 440
    const v1, 0x800055

    .line 441
    .line 442
    .line 443
    invoke-direct {v14, v2, v15, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 444
    .line 445
    .line 446
    invoke-static {v0, v12}, Los;->μ(Landroid/app/Activity;F)I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    iput v2, v14, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 451
    .line 452
    const/high16 v2, 0x40800000    # 4.0f

    .line 453
    .line 454
    invoke-static {v0, v2}, Los;->μ(Landroid/app/Activity;F)I

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    iput v2, v14, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 459
    .line 460
    invoke-virtual {v4, v11, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 461
    .line 462
    .line 463
    new-instance v2, Landroid/widget/TextView;

    .line 464
    .line 465
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 466
    .line 467
    .line 468
    const-string v4, "\ud83d\udc3e DexKit \u840c\u840c\u9002\u914d\u4e2d"

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    const/16 v4, 0x11

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 476
    .line 477
    .line 478
    sget v4, Los;->κ:I

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 481
    .line 482
    .line 483
    const/high16 v12, 0x41980000    # 19.0f

    .line 484
    .line 485
    const/4 v14, 0x2

    .line 486
    invoke-virtual {v2, v14, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 487
    .line 488
    .line 489
    sget-object v12, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 490
    .line 491
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 492
    .line 493
    .line 494
    sput-object v2, Los;->σ:Landroid/widget/TextView;

    .line 495
    .line 496
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 497
    .line 498
    const/4 v1, -0x2

    .line 499
    const/4 v15, -0x1

    .line 500
    invoke-direct {v14, v15, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v8, v2, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 504
    .line 505
    .line 506
    new-instance v1, Landroid/widget/TextView;

    .line 507
    .line 508
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 509
    .line 510
    .line 511
    const-string v2, "\u6b63\u5728\u8ba4\u8bc6\u65b0\u7248\u672c\uff0c\u8bf7\u7a0d\u7b49\u4e00\u4e0b\uff5e"

    .line 512
    .line 513
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 514
    .line 515
    .line 516
    const/16 v2, 0x11

    .line 517
    .line 518
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 519
    .line 520
    .line 521
    sget v2, Los;->λ:I

    .line 522
    .line 523
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 524
    .line 525
    .line 526
    const/high16 v14, 0x41500000    # 13.0f

    .line 527
    .line 528
    const/4 v15, 0x2

    .line 529
    invoke-virtual {v1, v15, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 530
    .line 531
    .line 532
    sput-object v1, Los;->τ:Landroid/widget/TextView;

    .line 533
    .line 534
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 535
    .line 536
    move-object/from16 v20, v5

    .line 537
    .line 538
    const/4 v5, -0x2

    .line 539
    const/4 v14, -0x1

    .line 540
    invoke-direct {v15, v14, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 541
    .line 542
    .line 543
    const/high16 v5, 0x40c00000    # 6.0f

    .line 544
    .line 545
    invoke-static {v0, v5}, Los;->μ(Landroid/app/Activity;F)I

    .line 546
    .line 547
    .line 548
    move-result v14

    .line 549
    iput v14, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 550
    .line 551
    invoke-virtual {v8, v1, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 552
    .line 553
    .line 554
    new-instance v1, Landroid/widget/TextView;

    .line 555
    .line 556
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 557
    .line 558
    .line 559
    invoke-static {v0}, Los;->ο(Landroid/content/Context;)Lks;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    iget-object v14, v5, Lks;->γ:Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 566
    .line 567
    .line 568
    move-result v15

    .line 569
    if-eqz v15, :cond_1

    .line 570
    .line 571
    const-string v14, "\u672a\u77e5"

    .line 572
    .line 573
    :cond_1
    move-object v15, v6

    .line 574
    iget-wide v5, v5, Lks;->β:J

    .line 575
    .line 576
    move-object/from16 v21, v7

    .line 577
    .line 578
    const-string v7, "\u5bbf\u4e3b\u7248\u672c\uff1a"

    .line 579
    .line 580
    move-object/from16 v22, v11

    .line 581
    .line 582
    const-string v11, " ("

    .line 583
    .line 584
    invoke-static {v7, v14, v5, v6, v11}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    const-string v6, ")"

    .line 589
    .line 590
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 598
    .line 599
    .line 600
    const/16 v5, 0x11

    .line 601
    .line 602
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 603
    .line 604
    .line 605
    sget v5, Los;->μ:I

    .line 606
    .line 607
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 608
    .line 609
    .line 610
    const/high16 v6, 0x41400000    # 12.0f

    .line 611
    .line 612
    const/4 v14, 0x2

    .line 613
    invoke-virtual {v1, v14, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 614
    .line 615
    .line 616
    const/4 v6, 0x0

    .line 617
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 618
    .line 619
    .line 620
    sput-object v1, Los;->υ:Landroid/widget/TextView;

    .line 621
    .line 622
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 623
    .line 624
    const/4 v7, -0x2

    .line 625
    const/4 v14, -0x1

    .line 626
    invoke-direct {v6, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 627
    .line 628
    .line 629
    const/high16 v7, 0x40c00000    # 6.0f

    .line 630
    .line 631
    invoke-static {v0, v7}, Los;->μ(Landroid/app/Activity;F)I

    .line 632
    .line 633
    .line 634
    move-result v7

    .line 635
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 636
    .line 637
    invoke-virtual {v8, v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 638
    .line 639
    .line 640
    new-instance v1, Landroid/widget/TextView;

    .line 641
    .line 642
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 643
    .line 644
    .line 645
    const-string v6, "\u2728 0%"

    .line 646
    .line 647
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 648
    .line 649
    .line 650
    const/16 v6, 0x11

    .line 651
    .line 652
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 653
    .line 654
    .line 655
    const/4 v6, 0x0

    .line 656
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 660
    .line 661
    .line 662
    const/high16 v6, 0x41700000    # 15.0f

    .line 663
    .line 664
    const/4 v14, 0x2

    .line 665
    invoke-virtual {v1, v14, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 669
    .line 670
    .line 671
    sget v6, Los;->ε:I

    .line 672
    .line 673
    const v7, 0x4479c000    # 999.0f

    .line 674
    .line 675
    .line 676
    const/high16 v11, 0x3f800000    # 1.0f

    .line 677
    .line 678
    invoke-static {v0, v6, v7, v11, v10}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 683
    .line 684
    .line 685
    const/high16 v6, 0x41800000    # 16.0f

    .line 686
    .line 687
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 688
    .line 689
    .line 690
    move-result v11

    .line 691
    const/high16 v14, 0x40e00000    # 7.0f

    .line 692
    .line 693
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 694
    .line 695
    .line 696
    move-result v7

    .line 697
    move-object/from16 v23, v15

    .line 698
    .line 699
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 700
    .line 701
    .line 702
    move-result v15

    .line 703
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 704
    .line 705
    .line 706
    move-result v14

    .line 707
    invoke-virtual {v1, v11, v7, v15, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 708
    .line 709
    .line 710
    sput-object v1, Los;->φ:Landroid/widget/TextView;

    .line 711
    .line 712
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 713
    .line 714
    const/4 v11, -0x2

    .line 715
    invoke-direct {v7, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 716
    .line 717
    .line 718
    const/4 v11, 0x1

    .line 719
    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 720
    .line 721
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 722
    .line 723
    .line 724
    move-result v11

    .line 725
    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 726
    .line 727
    invoke-virtual {v8, v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 728
    .line 729
    .line 730
    new-instance v1, Landroid/widget/ProgressBar;

    .line 731
    .line 732
    const/4 v7, 0x0

    .line 733
    const v11, 0x1010078

    .line 734
    .line 735
    .line 736
    invoke-direct {v1, v0, v7, v11}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 737
    .line 738
    .line 739
    const/4 v7, 0x0

    .line 740
    invoke-virtual {v1, v7}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 741
    .line 742
    .line 743
    const/16 v11, 0x64

    .line 744
    .line 745
    invoke-virtual {v1, v11}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v1, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 749
    .line 750
    .line 751
    sget v11, Los;->θ:I

    .line 752
    .line 753
    const/4 v14, 0x0

    .line 754
    const v15, 0x4479c000    # 999.0f

    .line 755
    .line 756
    .line 757
    invoke-static {v0, v11, v15, v14, v7}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 758
    .line 759
    .line 760
    move-result-object v11

    .line 761
    invoke-static {v0, v9, v15, v14, v7}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 762
    .line 763
    .line 764
    move-result-object v14

    .line 765
    new-instance v15, Landroid/graphics/drawable/ClipDrawable;

    .line 766
    .line 767
    const v6, 0x800003

    .line 768
    .line 769
    .line 770
    move/from16 v16, v7

    .line 771
    .line 772
    const/4 v7, 0x1

    .line 773
    invoke-direct {v15, v14, v6, v7}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 774
    .line 775
    .line 776
    new-instance v6, Landroid/graphics/drawable/LayerDrawable;

    .line 777
    .line 778
    move/from16 v17, v7

    .line 779
    .line 780
    const/4 v14, 0x2

    .line 781
    new-array v7, v14, [Landroid/graphics/drawable/Drawable;

    .line 782
    .line 783
    aput-object v11, v7, v16

    .line 784
    .line 785
    aput-object v15, v7, v17

    .line 786
    .line 787
    invoke-direct {v6, v7}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 788
    .line 789
    .line 790
    const/high16 v7, 0x1020000

    .line 791
    .line 792
    move/from16 v11, v16

    .line 793
    .line 794
    invoke-virtual {v6, v11, v7}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 795
    .line 796
    .line 797
    const v7, 0x102000d

    .line 798
    .line 799
    .line 800
    move/from16 v11, v17

    .line 801
    .line 802
    invoke-virtual {v6, v11, v7}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v1, v6}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 806
    .line 807
    .line 808
    const/high16 v6, 0x41400000    # 12.0f

    .line 809
    .line 810
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 811
    .line 812
    .line 813
    move-result v7

    .line 814
    invoke-virtual {v1, v7}, Landroid/view/View;->setMinimumHeight(I)V

    .line 815
    .line 816
    .line 817
    sput-object v1, Los;->χ:Landroid/widget/ProgressBar;

    .line 818
    .line 819
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 820
    .line 821
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    const/4 v14, -0x1

    .line 826
    invoke-direct {v7, v14, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 827
    .line 828
    .line 829
    const/high16 v6, 0x41800000    # 16.0f

    .line 830
    .line 831
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 832
    .line 833
    .line 834
    move-result v11

    .line 835
    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 836
    .line 837
    invoke-virtual {v8, v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 838
    .line 839
    .line 840
    new-instance v1, Landroid/widget/TextView;

    .line 841
    .line 842
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 843
    .line 844
    .line 845
    const-string v6, "\u6b63\u5728\u521d\u59cb\u5316..."

    .line 846
    .line 847
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 848
    .line 849
    .line 850
    const/16 v6, 0x11

    .line 851
    .line 852
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 856
    .line 857
    .line 858
    const/high16 v4, 0x41600000    # 14.0f

    .line 859
    .line 860
    const/4 v14, 0x2

    .line 861
    invoke-virtual {v1, v14, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 862
    .line 863
    .line 864
    sget v6, Los;->η:I

    .line 865
    .line 866
    const/high16 v7, 0x41800000    # 16.0f

    .line 867
    .line 868
    const/high16 v11, 0x3f800000    # 1.0f

    .line 869
    .line 870
    invoke-static {v0, v6, v7, v11, v10}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 871
    .line 872
    .line 873
    move-result-object v14

    .line 874
    invoke-virtual {v1, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 875
    .line 876
    .line 877
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 878
    .line 879
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 880
    .line 881
    .line 882
    const/4 v7, 0x4

    .line 883
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 884
    .line 885
    .line 886
    invoke-static {}, Landroid/text/method/ScrollingMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 887
    .line 888
    .line 889
    move-result-object v11

    .line 890
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 891
    .line 892
    .line 893
    const/4 v11, 0x1

    .line 894
    invoke-virtual {v1, v11}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v1, v11}, Landroid/view/View;->setOverScrollMode(I)V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 901
    .line 902
    .line 903
    move-result-object v11

    .line 904
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 905
    .line 906
    .line 907
    move-result-object v11

    .line 908
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 909
    .line 910
    const/high16 v14, 0x40400000    # 3.0f

    .line 911
    .line 912
    mul-float/2addr v11, v14

    .line 913
    const/high16 v15, 0x3f800000    # 1.0f

    .line 914
    .line 915
    invoke-virtual {v1, v11, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 916
    .line 917
    .line 918
    const/high16 v11, 0x42400000    # 48.0f

    .line 919
    .line 920
    invoke-static {v0, v11}, Los;->μ(Landroid/app/Activity;F)I

    .line 921
    .line 922
    .line 923
    move-result v15

    .line 924
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 925
    .line 926
    .line 927
    const/high16 v15, 0x43280000    # 168.0f

    .line 928
    .line 929
    invoke-static {v0, v15}, Los;->μ(Landroid/app/Activity;F)I

    .line 930
    .line 931
    .line 932
    move-result v15

    .line 933
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setMaxHeight(I)V

    .line 934
    .line 935
    .line 936
    invoke-static {v0, v4}, Los;->μ(Landroid/app/Activity;F)I

    .line 937
    .line 938
    .line 939
    move-result v15

    .line 940
    move/from16 v24, v14

    .line 941
    .line 942
    const/high16 v14, 0x41200000    # 10.0f

    .line 943
    .line 944
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 945
    .line 946
    .line 947
    move-result v7

    .line 948
    invoke-static {v0, v4}, Los;->μ(Landroid/app/Activity;F)I

    .line 949
    .line 950
    .line 951
    move-result v11

    .line 952
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 953
    .line 954
    .line 955
    move-result v4

    .line 956
    invoke-virtual {v1, v15, v7, v11, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 957
    .line 958
    .line 959
    new-instance v4, Ljs;

    .line 960
    .line 961
    const/4 v7, 0x0

    .line 962
    invoke-direct {v4, v7, v1}, Ljs;-><init>(ILjava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 966
    .line 967
    .line 968
    sput-object v1, Los;->ψ:Landroid/widget/TextView;

    .line 969
    .line 970
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 971
    .line 972
    const/4 v7, -0x2

    .line 973
    const/4 v14, -0x1

    .line 974
    invoke-direct {v4, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 975
    .line 976
    .line 977
    const/high16 v7, 0x41800000    # 16.0f

    .line 978
    .line 979
    invoke-static {v0, v7}, Los;->μ(Landroid/app/Activity;F)I

    .line 980
    .line 981
    .line 982
    move-result v11

    .line 983
    iput v11, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 984
    .line 985
    invoke-virtual {v8, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 986
    .line 987
    .line 988
    new-instance v1, Landroid/widget/TextView;

    .line 989
    .line 990
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 991
    .line 992
    .line 993
    const-string v4, "\u9996\u6b21\u542f\u52a8\u4f1a\u6162\u4e00\u70b9\uff0c\u5b8c\u6210\u540e\u5c31\u4f1a\u53d8\u5feb\u5566"

    .line 994
    .line 995
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 996
    .line 997
    .line 998
    const/16 v4, 0x11

    .line 999
    .line 1000
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1004
    .line 1005
    .line 1006
    const/high16 v4, 0x41400000    # 12.0f

    .line 1007
    .line 1008
    const/4 v14, 0x2

    .line 1009
    invoke-virtual {v1, v14, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1010
    .line 1011
    .line 1012
    sput-object v1, Los;->ω:Landroid/widget/TextView;

    .line 1013
    .line 1014
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1015
    .line 1016
    const/4 v7, -0x2

    .line 1017
    const/4 v14, -0x1

    .line 1018
    invoke-direct {v5, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1019
    .line 1020
    .line 1021
    invoke-static {v0, v4}, Los;->μ(Landroid/app/Activity;F)I

    .line 1022
    .line 1023
    .line 1024
    move-result v4

    .line 1025
    iput v4, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1026
    .line 1027
    invoke-virtual {v8, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1028
    .line 1029
    .line 1030
    new-instance v1, Landroid/widget/TextView;

    .line 1031
    .line 1032
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1033
    .line 1034
    .line 1035
    const-string v4, "\u9996\u6b21\u9002\u914d\u5b8c\u6210\uff0c\u5efa\u8bae\u91cd\u542f\u6296\u97f3\uff0c\u8ba9\u5168\u90e8\u529f\u80fd\u7acb\u5373\u751f\u6548\uff5e"

    .line 1036
    .line 1037
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1038
    .line 1039
    .line 1040
    const/16 v4, 0x11

    .line 1041
    .line 1042
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1046
    .line 1047
    .line 1048
    const/high16 v3, 0x41500000    # 13.0f

    .line 1049
    .line 1050
    const/4 v14, 0x2

    .line 1051
    invoke-virtual {v1, v14, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1055
    .line 1056
    .line 1057
    const/16 v3, 0x8

    .line 1058
    .line 1059
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v4

    .line 1066
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v4

    .line 1070
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 1071
    .line 1072
    mul-float v14, v24, v4

    .line 1073
    .line 1074
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1075
    .line 1076
    invoke-virtual {v1, v14, v11}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1077
    .line 1078
    .line 1079
    const/high16 v7, 0x41800000    # 16.0f

    .line 1080
    .line 1081
    invoke-static {v0, v6, v7, v11, v10}, Los;->ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v4

    .line 1085
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1086
    .line 1087
    .line 1088
    const/high16 v4, 0x41600000    # 14.0f

    .line 1089
    .line 1090
    invoke-static {v0, v4}, Los;->μ(Landroid/app/Activity;F)I

    .line 1091
    .line 1092
    .line 1093
    move-result v5

    .line 1094
    const/high16 v14, 0x41200000    # 10.0f

    .line 1095
    .line 1096
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 1097
    .line 1098
    .line 1099
    move-result v6

    .line 1100
    invoke-static {v0, v4}, Los;->μ(Landroid/app/Activity;F)I

    .line 1101
    .line 1102
    .line 1103
    move-result v7

    .line 1104
    invoke-static {v0, v14}, Los;->μ(Landroid/app/Activity;F)I

    .line 1105
    .line 1106
    .line 1107
    move-result v10

    .line 1108
    invoke-virtual {v1, v5, v6, v7, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1109
    .line 1110
    .line 1111
    sput-object v1, Los;->Α:Landroid/widget/TextView;

    .line 1112
    .line 1113
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1114
    .line 1115
    const/4 v7, -0x2

    .line 1116
    const/4 v14, -0x1

    .line 1117
    invoke-direct {v5, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1118
    .line 1119
    .line 1120
    invoke-static {v0, v4}, Los;->μ(Landroid/app/Activity;F)I

    .line 1121
    .line 1122
    .line 1123
    move-result v4

    .line 1124
    iput v4, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1125
    .line 1126
    invoke-virtual {v8, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1127
    .line 1128
    .line 1129
    new-instance v1, Landroid/widget/LinearLayout;

    .line 1130
    .line 1131
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1132
    .line 1133
    .line 1134
    const/4 v6, 0x0

    .line 1135
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1136
    .line 1137
    .line 1138
    const/16 v4, 0x11

    .line 1139
    .line 1140
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1144
    .line 1145
    .line 1146
    sput-object v1, Los;->Β:Landroid/widget/LinearLayout;

    .line 1147
    .line 1148
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1149
    .line 1150
    invoke-direct {v3, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1151
    .line 1152
    .line 1153
    const/high16 v7, 0x41800000    # 16.0f

    .line 1154
    .line 1155
    invoke-static {v0, v7}, Los;->μ(Landroid/app/Activity;F)I

    .line 1156
    .line 1157
    .line 1158
    move-result v4

    .line 1159
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1160
    .line 1161
    invoke-virtual {v8, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1162
    .line 1163
    .line 1164
    const-string v3, "\u91cd\u542f\u6296\u97f3"

    .line 1165
    .line 1166
    invoke-static {v0, v3, v9}, Los;->η(Landroid/app/Activity;Ljava/lang/String;I)Landroid/widget/TextView;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v3

    .line 1170
    sput-object v3, Los;->Γ:Landroid/widget/TextView;

    .line 1171
    .line 1172
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1173
    .line 1174
    const/high16 v5, 0x42400000    # 48.0f

    .line 1175
    .line 1176
    invoke-static {v0, v5}, Los;->μ(Landroid/app/Activity;F)I

    .line 1177
    .line 1178
    .line 1179
    move-result v6

    .line 1180
    const/4 v7, 0x0

    .line 1181
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1182
    .line 1183
    invoke-direct {v4, v7, v6, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1184
    .line 1185
    .line 1186
    const/high16 v6, 0x41000000    # 8.0f

    .line 1187
    .line 1188
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 1189
    .line 1190
    .line 1191
    move-result v8

    .line 1192
    iput v8, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1193
    .line 1194
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1195
    .line 1196
    .line 1197
    const-string v3, "\u6682\u4e0d\u91cd\u542f"

    .line 1198
    .line 1199
    invoke-static {v0, v3, v2}, Los;->η(Landroid/app/Activity;Ljava/lang/String;I)Landroid/widget/TextView;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v2

    .line 1203
    sput-object v2, Los;->Δ:Landroid/widget/TextView;

    .line 1204
    .line 1205
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1206
    .line 1207
    invoke-static {v0, v5}, Los;->μ(Landroid/app/Activity;F)I

    .line 1208
    .line 1209
    .line 1210
    move-result v4

    .line 1211
    invoke-direct {v3, v7, v4, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1212
    .line 1213
    .line 1214
    invoke-static {v0, v6}, Los;->μ(Landroid/app/Activity;F)I

    .line 1215
    .line 1216
    .line 1217
    move-result v4

    .line 1218
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1219
    .line 1220
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1221
    .line 1222
    .line 1223
    new-instance v1, Landroid/widget/FrameLayout;

    .line 1224
    .line 1225
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 1226
    .line 1227
    .line 1228
    const v2, 0x3e99999a    # 0.3f

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 1232
    .line 1233
    .line 1234
    const/4 v14, 0x2

    .line 1235
    invoke-virtual {v1, v14}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1236
    .line 1237
    .line 1238
    invoke-static/range {p0 .. p1}, Los;->ζ(Landroid/app/Activity;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v2

    .line 1242
    if-eqz v2, :cond_2

    .line 1243
    .line 1244
    new-instance v3, Landroid/widget/ImageView;

    .line 1245
    .line 1246
    invoke-direct {v3, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v3, v14}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1250
    .line 1251
    .line 1252
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 1253
    .line 1254
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1258
    .line 1259
    .line 1260
    goto :goto_1

    .line 1261
    :cond_2
    new-instance v3, Landroid/widget/TextView;

    .line 1262
    .line 1263
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1267
    .line 1268
    .line 1269
    const/16 v4, 0x11

    .line 1270
    .line 1271
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 1272
    .line 1273
    .line 1274
    const/4 v6, 0x0

    .line 1275
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1279
    .line 1280
    .line 1281
    const/high16 v2, 0x41e00000    # 28.0f

    .line 1282
    .line 1283
    invoke-virtual {v3, v14, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1287
    .line 1288
    .line 1289
    :goto_1
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 1290
    .line 1291
    const/4 v14, -0x1

    .line 1292
    invoke-direct {v2, v14, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1296
    .line 1297
    .line 1298
    sput-object v1, Los;->Η:Landroid/widget/FrameLayout;

    .line 1299
    .line 1300
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 1301
    .line 1302
    const/high16 v5, 0x42400000    # 48.0f

    .line 1303
    .line 1304
    invoke-static {v0, v5}, Los;->μ(Landroid/app/Activity;F)I

    .line 1305
    .line 1306
    .line 1307
    move-result v3

    .line 1308
    invoke-static {v0, v5}, Los;->μ(Landroid/app/Activity;F)I

    .line 1309
    .line 1310
    .line 1311
    move-result v0

    .line 1312
    const v4, 0x800055

    .line 1313
    .line 1314
    .line 1315
    invoke-direct {v2, v3, v0, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 1316
    .line 1317
    .line 1318
    move-object/from16 v15, v23

    .line 1319
    .line 1320
    invoke-virtual {v15, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1321
    .line 1322
    .line 1323
    const/4 v0, 0x4

    .line 1324
    new-array v0, v0, [Landroid/view/View;

    .line 1325
    .line 1326
    const/16 v16, 0x0

    .line 1327
    .line 1328
    aput-object v21, v0, v16

    .line 1329
    .line 1330
    const/16 v17, 0x1

    .line 1331
    .line 1332
    aput-object v22, v0, v17

    .line 1333
    .line 1334
    const/16 v18, 0x2

    .line 1335
    .line 1336
    aput-object v20, v0, v18

    .line 1337
    .line 1338
    const/4 v2, 0x3

    .line 1339
    aput-object v1, v0, v2

    .line 1340
    .line 1341
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    sput-object v0, Los;->Ζ:Ljava/util/List;

    .line 1346
    .line 1347
    return-object v19
.end method

.method public static ι()Lls;
    .locals 12

    .line 1
    sget-object v1, Los;->Ξ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    instance-of v2, v0, Ljava/util/Collection;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    move-object v2, v0

    .line 26
    check-cast v2, Ljava/util/Collection;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    move v2, v5

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto/16 :goto_a

    .line 38
    .line 39
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move v2, v5

    .line 44
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_4

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lms;

    .line 55
    .line 56
    iget-object v6, v6, Lms;->γ:Lns;

    .line 57
    .line 58
    sget-object v7, Lns;->η:Lns;

    .line 59
    .line 60
    if-eq v6, v7, :cond_2

    .line 61
    .line 62
    sget-object v7, Lns;->θ:Lns;

    .line 63
    .line 64
    if-ne v6, v7, :cond_1

    .line 65
    .line 66
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    if-ltz v2, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-static {}, Lyh;->ф()V

    .line 72
    .line 73
    .line 74
    throw v4

    .line 75
    :cond_4
    :goto_1
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    check-cast v0, Ljava/lang/Iterable;

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    move-object v7, v6

    .line 101
    check-cast v7, Lms;

    .line 102
    .line 103
    iget-object v7, v7, Lms;->γ:Lns;

    .line 104
    .line 105
    sget-object v8, Lns;->ζ:Lns;

    .line 106
    .line 107
    if-ne v7, v8, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move-object v6, v4

    .line 111
    :goto_2
    check-cast v6, Lms;

    .line 112
    .line 113
    if-nez v6, :cond_9

    .line 114
    .line 115
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    check-cast v0, Ljava/lang/Iterable;

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_8

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    move-object v7, v6

    .line 141
    check-cast v7, Lms;

    .line 142
    .line 143
    iget-object v7, v7, Lms;->γ:Lns;

    .line 144
    .line 145
    sget-object v8, Lns;->ε:Lns;

    .line 146
    .line 147
    if-ne v7, v8, :cond_7

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    move-object v6, v4

    .line 151
    :goto_3
    check-cast v6, Lms;

    .line 152
    .line 153
    :cond_9
    const/4 v0, 0x1

    .line 154
    if-lez v3, :cond_d

    .line 155
    .line 156
    sget-object v7, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    check-cast v7, Ljava/lang/Iterable;

    .line 166
    .line 167
    instance-of v8, v7, Ljava/util/Collection;

    .line 168
    .line 169
    if-eqz v8, :cond_a

    .line 170
    .line 171
    move-object v8, v7

    .line 172
    check-cast v8, Ljava/util/Collection;

    .line 173
    .line 174
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_a

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_a
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    :cond_b
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_c

    .line 190
    .line 191
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    check-cast v8, Lms;

    .line 196
    .line 197
    iget-object v8, v8, Lms;->γ:Lns;

    .line 198
    .line 199
    sget-object v9, Lns;->η:Lns;

    .line 200
    .line 201
    if-eq v8, v9, :cond_b

    .line 202
    .line 203
    sget-object v9, Lns;->θ:Lns;

    .line 204
    .line 205
    if-ne v8, v9, :cond_d

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_c
    :goto_5
    move-object v7, v6

    .line 209
    move v6, v0

    .line 210
    goto :goto_6

    .line 211
    :cond_d
    move-object v7, v6

    .line 212
    move v6, v5

    .line 213
    :goto_6
    sget-object v8, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 214
    .line 215
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    check-cast v8, Ljava/lang/Iterable;

    .line 223
    .line 224
    instance-of v9, v8, Ljava/util/Collection;

    .line 225
    .line 226
    if-eqz v9, :cond_e

    .line 227
    .line 228
    move-object v9, v8

    .line 229
    check-cast v9, Ljava/util/Collection;

    .line 230
    .line 231
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_e

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_e
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    :cond_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    if-eqz v9, :cond_10

    .line 247
    .line 248
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    check-cast v9, Lms;

    .line 253
    .line 254
    iget-object v9, v9, Lms;->γ:Lns;

    .line 255
    .line 256
    sget-object v10, Lns;->θ:Lns;

    .line 257
    .line 258
    if-ne v9, v10, :cond_f

    .line 259
    .line 260
    move v5, v0

    .line 261
    :cond_10
    :goto_7
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    check-cast v0, Ljava/lang/Iterable;

    .line 271
    .line 272
    new-instance v8, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 275
    .line 276
    .line 277
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    :cond_11
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    if-eqz v9, :cond_12

    .line 286
    .line 287
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    move-object v10, v9

    .line 292
    check-cast v10, Lms;

    .line 293
    .line 294
    iget-object v10, v10, Lms;->γ:Lns;

    .line 295
    .line 296
    sget-object v11, Lns;->θ:Lns;

    .line 297
    .line 298
    if-ne v10, v11, :cond_11

    .line 299
    .line 300
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_12
    move-object v0, v8

    .line 305
    new-instance v8, Ljava/util/ArrayList;

    .line 306
    .line 307
    const/16 v9, 0xa

    .line 308
    .line 309
    invoke-static {v0, v9}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    if-eqz v9, :cond_13

    .line 325
    .line 326
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    check-cast v9, Lms;

    .line 331
    .line 332
    iget-object v9, v9, Lms;->β:Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_13
    move-object v0, v4

    .line 339
    move v4, v2

    .line 340
    new-instance v2, Lls;

    .line 341
    .line 342
    if-eqz v7, :cond_14

    .line 343
    .line 344
    iget-object v0, v7, Lms;->β:Ljava/lang/String;

    .line 345
    .line 346
    :cond_14
    move v7, v5

    .line 347
    move-object v5, v0

    .line 348
    invoke-direct/range {v2 .. v8}, Lls;-><init>(IILjava/lang/String;ZZLjava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    .line 350
    .line 351
    monitor-exit v1

    .line 352
    return-object v2

    .line 353
    :goto_a
    monitor-exit v1

    .line 354
    throw v0
.end method

.method public static κ(Z)V
    .locals 5

    .line 1
    const-string v0, "dismiss dialog failed: "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    invoke-static {}, Los;->δ()V

    .line 6
    .line 7
    .line 8
    sget-object v3, Los;->π:Landroid/app/AlertDialog;

    .line 9
    .line 10
    if-eqz v3, :cond_1

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/app/Dialog;->isShowing()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v3, v2

    .line 20
    :goto_0
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_5

    .line 28
    :catch_0
    move-exception v3

    .line 29
    goto :goto_4

    .line 30
    :cond_1
    :goto_1
    if-eqz p0, :cond_2

    .line 31
    .line 32
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter p0

    .line 35
    :try_start_1
    invoke-static {}, Los;->γ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    :goto_2
    monitor-exit p0

    .line 39
    goto :goto_3

    .line 40
    :catchall_1
    move-exception v0

    .line 41
    monitor-exit p0

    .line 42
    throw v0

    .line 43
    :cond_2
    :goto_3
    sput-object v2, Los;->π:Landroid/app/AlertDialog;

    .line 44
    .line 45
    sput-object v2, Los;->ρ:Landroid/widget/ScrollView;

    .line 46
    .line 47
    sput-object v2, Los;->Μ:Landroid/widget/ScrollView;

    .line 48
    .line 49
    sput-object v2, Los;->σ:Landroid/widget/TextView;

    .line 50
    .line 51
    sput-object v2, Los;->τ:Landroid/widget/TextView;

    .line 52
    .line 53
    sput-object v2, Los;->υ:Landroid/widget/TextView;

    .line 54
    .line 55
    sput-object v2, Los;->φ:Landroid/widget/TextView;

    .line 56
    .line 57
    sput-object v2, Los;->χ:Landroid/widget/ProgressBar;

    .line 58
    .line 59
    sput-object v2, Los;->ψ:Landroid/widget/TextView;

    .line 60
    .line 61
    sput-object v2, Los;->ω:Landroid/widget/TextView;

    .line 62
    .line 63
    sput-object v2, Los;->Α:Landroid/widget/TextView;

    .line 64
    .line 65
    sput-object v2, Los;->Β:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    sput-object v2, Los;->Γ:Landroid/widget/TextView;

    .line 68
    .line 69
    sput-object v2, Los;->Δ:Landroid/widget/TextView;

    .line 70
    .line 71
    sput-object v2, Los;->Ε:Landroid/widget/FrameLayout;

    .line 72
    .line 73
    sput-object v2, Los;->Η:Landroid/widget/FrameLayout;

    .line 74
    .line 75
    sget-object p0, Ljz;->ε:Ljz;

    .line 76
    .line 77
    sput-object p0, Los;->Ζ:Ljava/util/List;

    .line 78
    .line 79
    sget-object p0, Los;->Κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_4
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v4, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    .line 103
    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 107
    .line 108
    monitor-enter p0

    .line 109
    :try_start_3
    invoke-static {}, Los;->γ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_2
    move-exception v0

    .line 114
    monitor-exit p0

    .line 115
    throw v0

    .line 116
    :goto_5
    if-eqz p0, :cond_3

    .line 117
    .line 118
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 119
    .line 120
    monitor-enter p0

    .line 121
    :try_start_4
    invoke-static {}, Los;->γ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 122
    .line 123
    .line 124
    monitor-exit p0

    .line 125
    goto :goto_6

    .line 126
    :catchall_3
    move-exception v0

    .line 127
    monitor-exit p0

    .line 128
    throw v0

    .line 129
    :cond_3
    :goto_6
    sput-object v2, Los;->π:Landroid/app/AlertDialog;

    .line 130
    .line 131
    sput-object v2, Los;->ρ:Landroid/widget/ScrollView;

    .line 132
    .line 133
    sput-object v2, Los;->Μ:Landroid/widget/ScrollView;

    .line 134
    .line 135
    sput-object v2, Los;->σ:Landroid/widget/TextView;

    .line 136
    .line 137
    sput-object v2, Los;->τ:Landroid/widget/TextView;

    .line 138
    .line 139
    sput-object v2, Los;->υ:Landroid/widget/TextView;

    .line 140
    .line 141
    sput-object v2, Los;->φ:Landroid/widget/TextView;

    .line 142
    .line 143
    sput-object v2, Los;->χ:Landroid/widget/ProgressBar;

    .line 144
    .line 145
    sput-object v2, Los;->ψ:Landroid/widget/TextView;

    .line 146
    .line 147
    sput-object v2, Los;->ω:Landroid/widget/TextView;

    .line 148
    .line 149
    sput-object v2, Los;->Α:Landroid/widget/TextView;

    .line 150
    .line 151
    sput-object v2, Los;->Β:Landroid/widget/LinearLayout;

    .line 152
    .line 153
    sput-object v2, Los;->Γ:Landroid/widget/TextView;

    .line 154
    .line 155
    sput-object v2, Los;->Δ:Landroid/widget/TextView;

    .line 156
    .line 157
    sput-object v2, Los;->Ε:Landroid/widget/FrameLayout;

    .line 158
    .line 159
    sput-object v2, Los;->Η:Landroid/widget/FrameLayout;

    .line 160
    .line 161
    sget-object p0, Ljz;->ε:Ljz;

    .line 162
    .line 163
    sput-object p0, Los;->Ζ:Ljava/util/List;

    .line 164
    .line 165
    sget-object p0, Los;->Κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 166
    .line 167
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 168
    .line 169
    .line 170
    throw v0
.end method

.method public static λ(F)F
    .locals 1

    .line 1
    sget-object v0, Los;->ρ:Landroid/widget/ScrollView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :cond_0
    sget-object v0, Los;->ο:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/app/Activity;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

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
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 41
    .line 42
    :goto_1
    mul-float/2addr p0, v0

    .line 43
    return p0
.end method

.method public static μ(Landroid/app/Activity;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public static ν(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "task restarted from terminal state: "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Los;->Ξ:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    sget-object v2, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Lms;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    new-instance v0, Lms;

    .line 21
    .line 22
    sget-object v3, Lns;->ε:Lns;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, v3}, Lms;-><init>(Ljava/lang/String;Ljava/lang/String;Lns;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iput-object p1, v3, Lms;->β:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p1, v3, Lms;->γ:Lns;

    .line 36
    .line 37
    invoke-static {p1}, Los;->τ(Lns;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    sget-object p1, Lns;->ε:Lns;

    .line 44
    .line 45
    iput-object p1, v3, Lms;->γ:Lns;

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v4, 0x0

    .line 56
    :goto_0
    monitor-exit v1

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    invoke-static {}, Los;->Δ()V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void

    .line 63
    :goto_1
    monitor-exit v1

    .line 64
    throw p0
.end method

.method public static ξ()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Ls0;

    .line 18
    .line 19
    const/16 v2, 0x18

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ls0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {}, Los;->β()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, "ensureDialogShown: cannot show dialog, returning"

    .line 35
    .line 36
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    sget-object v0, Los;->π:Landroid/app/AlertDialog;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v1, 0x1

    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    const-string v0, "ensureDialogShown: dialog already showing"

    .line 52
    .line 53
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    const-string v0, "ensureDialogShown: showing new dialog"

    .line 58
    .line 59
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Los;->Ι()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static ο(Landroid/content/Context;)Lks;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    new-instance v5, Lks;

    .line 24
    .line 25
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    :cond_1
    invoke-direct {v5, v3, v4, v1, v2}, Lks;-><init>(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    new-instance v5, Leo1;

    .line 36
    .line 37
    invoke-direct {v5, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    new-instance v5, Lks;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_3

    .line 54
    .line 55
    move-object p0, v0

    .line 56
    :cond_3
    const-wide/16 v1, 0x0

    .line 57
    .line 58
    invoke-direct {v5, v1, v2, p0, v0}, Lks;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    check-cast v5, Lks;

    .line 62
    .line 63
    return-object v5
.end method

.method public static π(Landroid/app/Activity;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0}, Los;->ο(Landroid/content/Context;)Lks;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v0, v0, Lks;->β:J

    .line 6
    .line 7
    :try_start_0
    const-class v2, Lbd;

    .line 8
    .line 9
    const-string v3, "VERSION_CODE"

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-long v2, v2

    .line 21
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v2

    .line 27
    new-instance v3, Leo1;

    .line 28
    .line 29
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v2, v3

    .line 33
    :goto_0
    const-wide/16 v3, 0x0

    .line 34
    .line 35
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    instance-of v4, v2, Leo1;

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    move-object v2, v3

    .line 44
    :cond_0
    check-cast v2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v4, "restart_ack_"

    .line 55
    .line 56
    const-string v5, "_"

    .line 57
    .line 58
    invoke-static {v4, p0, v0, v1, v5}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string v0, "_m"

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, "_s2"

    .line 71
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
    return-object p0
.end method

.method public static ρ(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    const-string v1, "dyhelper_dexkit_progress"

    .line 6
    .line 7
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p0}, Los;->π(Landroid/app/Activity;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {v1, p0, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    new-instance v0, Leo1;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    instance-of v1, p0, Leo1;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    move-object p0, v0

    .line 38
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0
.end method

.method public static synthetic σ()Z
    .locals 1

    .line 1
    sget-object v0, Los;->ο:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/app/Activity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Los;->ρ(Landroid/app/Activity;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public static τ(Lns;)Z
    .locals 1

    .line 1
    sget-object v0, Lns;->η:Lns;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lns;->θ:Lns;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static υ(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lx01;->α:Lx01;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    new-instance v1, Leo1;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object v0, v1

    .line 19
    :goto_0
    instance-of v1, v0, Leo1;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-object v0, v2

    .line 25
    :cond_0
    check-cast v0, Landroid/content/Context;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    if-eq v0, p0, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    new-array v1, v1, [Landroid/content/Context;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    aput-object v0, v1, v3

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    aput-object p0, v1, v0

    .line 39
    .line 40
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Landroid/content/Context;

    .line 64
    .line 65
    const v1, 0x7f0d0001

    .line 66
    .line 67
    .line 68
    :try_start_1
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    goto :goto_2

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    new-instance v1, Leo1;

    .line 75
    .line 76
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object v0, v1

    .line 80
    :goto_2
    instance-of v1, v0, Leo1;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    move-object v0, v2

    .line 85
    :cond_3
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_4
    return-object v2
.end method

.method public static φ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "r459ca5a644abf82d"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static χ(Landroid/app/Activity;Ljava/lang/String;IF)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x11

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    invoke-virtual {v0, p0, p3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static ψ(Landroid/app/Activity;IFFI)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 22
    .line 23
    mul-float/2addr p2, p1

    .line 24
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    cmpl-float p1, p3, p1

    .line 29
    .line 30
    if-lez p1, :cond_0

    .line 31
    .line 32
    invoke-static {p0, p3}, Los;->μ(Landroid/app/Activity;F)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-virtual {v0, p0, p4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object v0
.end method

.method public static ω()V
    .locals 3

    .line 1
    sget-object v0, Los;->ο:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    const-string v1, "dyhelper_dexkit_progress"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0}, Los;->π(Landroid/app/Activity;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method
