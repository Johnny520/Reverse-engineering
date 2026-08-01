.class public final Lkl1;
.super Lun;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Α:Lf02;

.field public static final Β:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final α:Lk3;

.field public final β:Lm6;

.field public final γ:Ljava/lang/Object;

.field public δ:Lfo0;

.field public ε:Ljava/lang/Throwable;

.field public final ζ:Ljava/util/ArrayList;

.field public η:Ljava/lang/Object;

.field public θ:Lc21;

.field public final ι:Lk21;

.field public final κ:Ljava/util/ArrayList;

.field public final λ:Ljava/util/ArrayList;

.field public final μ:Lb21;

.field public final ν:Ln5;

.field public final ξ:Lb21;

.field public final ο:Lb21;

.field public π:Ljava/util/ArrayList;

.field public ρ:Lc21;

.field public σ:Lae;

.field public final τ:Lf02;

.field public υ:Z

.field public final φ:Lf02;

.field public final χ:Lzn0;

.field public final ψ:Lup;

.field public final ω:Lrk0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Loa1;->θ:Loa1;

    .line 2
    .line 3
    invoke-static {v0}, Lln0;->δ(Ljava/lang/Object;)Lf02;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lkl1;->Α:Lf02;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lkl1;->Β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lup;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk3;

    .line 5
    .line 6
    new-instance v1, Ldl1;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, Ldl1;-><init>(Lkl1;I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lk3;-><init>(Ldl1;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lkl1;->α:Lk3;

    .line 16
    .line 17
    new-instance v1, Lm6;

    .line 18
    .line 19
    new-instance v2, Ldl1;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v2, p0, v3}, Ldl1;-><init>(Lkl1;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v2}, Lm6;-><init>(Ldl1;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lkl1;->β:Lm6;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/Object;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lkl1;->ζ:Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance v1, Lc21;

    .line 45
    .line 46
    invoke-direct {v1}, Lc21;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lkl1;->θ:Lc21;

    .line 50
    .line 51
    new-instance v1, Lk21;

    .line 52
    .line 53
    const/16 v2, 0x10

    .line 54
    .line 55
    new-array v2, v2, [Lzn;

    .line 56
    .line 57
    invoke-direct {v1, v2}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lkl1;->ι:Lk21;

    .line 61
    .line 62
    new-instance v1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Lkl1;->κ:Ljava/util/ArrayList;

    .line 68
    .line 69
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lkl1;->λ:Ljava/util/ArrayList;

    .line 75
    .line 76
    new-instance v1, Lb21;

    .line 77
    .line 78
    invoke-direct {v1}, Lb21;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lkl1;->μ:Lb21;

    .line 82
    .line 83
    new-instance v1, Ln5;

    .line 84
    .line 85
    const/16 v2, 0x16

    .line 86
    .line 87
    invoke-direct {v1, v2}, Ln5;-><init>(I)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lkl1;->ν:Ln5;

    .line 91
    .line 92
    new-instance v1, Lb21;

    .line 93
    .line 94
    invoke-direct {v1}, Lb21;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v1, p0, Lkl1;->ξ:Lb21;

    .line 98
    .line 99
    new-instance v1, Lb21;

    .line 100
    .line 101
    invoke-direct {v1}, Lb21;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Lkl1;->ο:Lb21;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-static {v1}, Lln0;->δ(Ljava/lang/Object;)Lf02;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iput-object v1, p0, Lkl1;->τ:Lf02;

    .line 112
    .line 113
    sget-object v1, Lfl1;->η:Lfl1;

    .line 114
    .line 115
    invoke-static {v1}, Lln0;->δ(Ljava/lang/Object;)Lf02;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, p0, Lkl1;->φ:Lf02;

    .line 120
    .line 121
    new-instance v1, Lm6;

    .line 122
    .line 123
    const/16 v2, 0xb

    .line 124
    .line 125
    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    .line 126
    .line 127
    .line 128
    sget-object v1, Lxn0;->ζ:Lxn0;

    .line 129
    .line 130
    invoke-interface {p1, v1}, Lup;->θ(Ltp;)Lsp;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lfo0;

    .line 135
    .line 136
    new-instance v2, Lzn0;

    .line 137
    .line 138
    invoke-direct {v2, v1}, Lzn0;-><init>(Lfo0;)V

    .line 139
    .line 140
    .line 141
    new-instance v1, Lcl1;

    .line 142
    .line 143
    invoke-direct {v1, v3, p0}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v1}, Lfo0;->Κ(La80;)Lvt;

    .line 147
    .line 148
    .line 149
    iput-object v2, p0, Lkl1;->χ:Lzn0;

    .line 150
    .line 151
    invoke-interface {p1, v0}, Lup;->η(Lup;)Lup;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-interface {p1, v2}, Lup;->η(Lup;)Lup;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iput-object p1, p0, Lkl1;->ψ:Lup;

    .line 160
    .line 161
    new-instance p1, Lrk0;

    .line 162
    .line 163
    const/16 v0, 0x14

    .line 164
    .line 165
    invoke-direct {p1, v0}, Lrk0;-><init>(I)V

    .line 166
    .line 167
    .line 168
    iput-object p1, p0, Lkl1;->ω:Lrk0;

    .line 169
    .line 170
    return-void
.end method

.method public static final Ε(Ljava/util/ArrayList;Lkl1;Lzn;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lkl1;->γ:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object p1, p1, Lkl1;->λ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lf11;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    monitor-exit p0

    .line 34
    throw p1
.end method

.method public static υ(Lf21;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lf21;->ψ()Lg81;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lvw1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lf21;->γ()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-virtual {p0}, Lf21;->γ()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method


# virtual methods
.method public final Α()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkl1;->υ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lkl1;->β:Lm6;

    .line 6
    .line 7
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lb8;

    .line 10
    .line 11
    iget-object p0, p0, Lb8;->γ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lj7;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const v0, 0x7ffffff

    .line 20
    .line 21
    .line 22
    and-int/2addr p0, v0

    .line 23
    if-lez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final Β()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkl1;->θ:Lc21;

    .line 5
    .line 6
    invoke-virtual {v1}, Lc21;->θ()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Lkl1;->ι:Lk21;

    .line 13
    .line 14
    iget v1, v1, Lk21;->η:I

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lkl1;->ψ()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Lkl1;->Α()Z

    .line 26
    .line 27
    .line 28
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    return p0

    .line 39
    :goto_2
    monitor-exit v0

    .line 40
    throw p0
.end method

.method public final Γ()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lkl1;->η:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lkl1;->ζ:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    sget-object v0, Ljz;->ε:Ljz;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :goto_0
    iput-object v0, p0, Lkl1;->η:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0
.end method

.method public final Δ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lkl1;->χ()Lyd;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Lkl1;->φ:Lf02;

    .line 9
    .line 10
    invoke-virtual {v2}, Lf02;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lfl1;

    .line 15
    .line 16
    sget-object v3, Lfl1;->ζ:Lfl1;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-lez v2, :cond_1

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object p0, Ls62;->α:Ls62;

    .line 28
    .line 29
    check-cast v1, Lae;

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Lae;->ζ(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :cond_1
    :try_start_1
    const-string v1, "Recomposer shutdown; frame clock awaiter will never resume"

    .line 36
    .line 37
    iget-object p0, p0, Lkl1;->ε:Ljava/lang/Throwable;

    .line 38
    .line 39
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 40
    .line 41
    invoke-direct {v2, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    monitor-exit v0

    .line 50
    throw p0
.end method

.method public final Ζ(Ljava/util/List;Lc21;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_0
    if-ge v4, v2, :cond_1

    .line 18
    .line 19
    move-object/from16 v5, p1

    .line 20
    .line 21
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    move-object v7, v6

    .line 26
    check-cast v7, Lf11;

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    if-nez v8, :cond_0

    .line 37
    .line 38
    new-instance v8, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_0
    check-cast v8, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_11

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/util/Map$Entry;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lzn;

    .line 79
    .line 80
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/util/List;

    .line 85
    .line 86
    iget-object v6, v5, Lzn;->ω:Lv80;

    .line 87
    .line 88
    iget-boolean v6, v6, Lv80;->Θ:Z

    .line 89
    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    const-string v6, "Check failed"

    .line 93
    .line 94
    invoke-static {v6}, Lsn;->α(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    new-instance v6, Lcl1;

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    invoke-direct {v6, v7, v5}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance v7, Lqh1;

    .line 104
    .line 105
    const/4 v8, 0x3

    .line 106
    move-object/from16 v9, p2

    .line 107
    .line 108
    invoke-direct {v7, v5, v8, v9}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    instance-of v10, v8, Lf21;

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    if-eqz v10, :cond_3

    .line 119
    .line 120
    check-cast v8, Lf21;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    move-object v8, v11

    .line 124
    :goto_2
    if-eqz v8, :cond_10

    .line 125
    .line 126
    invoke-virtual {v8, v6, v7}, Lf21;->Ε(La80;La80;)Lf21;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    if-eqz v6, :cond_10

    .line 131
    .line 132
    :try_start_0
    invoke-virtual {v6}, Ltw1;->κ()Ltw1;

    .line 133
    .line 134
    .line 135
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 136
    :try_start_1
    iget-object v8, v0, Lkl1;->γ:Ljava/lang/Object;

    .line 137
    .line 138
    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    :try_start_2
    new-instance v10, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    const/4 v13, 0x0

    .line 153
    :goto_3
    if-ge v13, v12, :cond_4

    .line 154
    .line 155
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    check-cast v14, Lf11;

    .line 160
    .line 161
    iget-object v15, v0, Lkl1;->μ:Lb21;

    .line 162
    .line 163
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v15}, Li11;->α(Lb21;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    move-object/from16 v16, v15

    .line 171
    .line 172
    check-cast v16, Lf11;

    .line 173
    .line 174
    new-instance v3, Ll91;

    .line 175
    .line 176
    invoke-direct {v3, v14, v15}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    add-int/lit8 v13, v13, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto/16 :goto_d

    .line 187
    .line 188
    :cond_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    const/4 v4, 0x0

    .line 193
    :goto_4
    if-ge v4, v3, :cond_8

    .line 194
    .line 195
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    check-cast v12, Ll91;

    .line 200
    .line 201
    iget-object v13, v12, Ll91;->ζ:Ljava/lang/Object;

    .line 202
    .line 203
    if-nez v13, :cond_7

    .line 204
    .line 205
    iget-object v13, v0, Lkl1;->ν:Ln5;

    .line 206
    .line 207
    iget-object v12, v12, Ll91;->ε:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v12, Lf11;

    .line 210
    .line 211
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v12, v13, Ln5;->ζ:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v12, Lb21;

    .line 217
    .line 218
    invoke-virtual {v12, v11}, Lb21;->β(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-eqz v12, :cond_7

    .line 223
    .line 224
    new-instance v3, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    const/4 v11, 0x0

    .line 238
    :goto_5
    if-ge v11, v4, :cond_6

    .line 239
    .line 240
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    check-cast v12, Ll91;

    .line 245
    .line 246
    iget-object v13, v12, Ll91;->ζ:Ljava/lang/Object;

    .line 247
    .line 248
    if-nez v13, :cond_5

    .line 249
    .line 250
    iget-object v13, v0, Lkl1;->ν:Ln5;

    .line 251
    .line 252
    iget-object v14, v12, Ll91;->ε:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v14, Lf11;

    .line 255
    .line 256
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget-object v14, v13, Ln5;->ζ:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v14, Lb21;

    .line 262
    .line 263
    invoke-static {v14}, Li11;->α(Lb21;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v15

    .line 267
    check-cast v15, Lt21;

    .line 268
    .line 269
    invoke-virtual {v14}, Lb21;->ι()Z

    .line 270
    .line 271
    .line 272
    move-result v14

    .line 273
    if-eqz v14, :cond_5

    .line 274
    .line 275
    iget-object v13, v13, Ln5;->η:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v13, Lb21;

    .line 278
    .line 279
    invoke-virtual {v13}, Lb21;->α()V

    .line 280
    .line 281
    .line 282
    :cond_5
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 283
    .line 284
    .line 285
    add-int/lit8 v11, v11, 0x1

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_6
    move-object v10, v3

    .line 289
    goto :goto_6

    .line 290
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_8
    :goto_6
    :try_start_3
    monitor-exit v8

    .line 294
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    const/4 v4, 0x0

    .line 299
    :goto_7
    if-ge v4, v3, :cond_f

    .line 300
    .line 301
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    check-cast v8, Ll91;

    .line 306
    .line 307
    iget-object v8, v8, Ll91;->ζ:Ljava/lang/Object;

    .line 308
    .line 309
    if-nez v8, :cond_9

    .line 310
    .line 311
    add-int/lit8 v4, v4, 0x1

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_9
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    const/4 v4, 0x0

    .line 319
    :goto_8
    if-ge v4, v3, :cond_f

    .line 320
    .line 321
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    check-cast v8, Ll91;

    .line 326
    .line 327
    iget-object v8, v8, Ll91;->ζ:Ljava/lang/Object;

    .line 328
    .line 329
    if-eqz v8, :cond_a

    .line 330
    .line 331
    add-int/lit8 v4, v4, 0x1

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    const/4 v8, 0x0

    .line 348
    :goto_9
    if-ge v8, v4, :cond_c

    .line 349
    .line 350
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    check-cast v11, Ll91;

    .line 355
    .line 356
    iget-object v12, v11, Ll91;->ζ:Ljava/lang/Object;

    .line 357
    .line 358
    if-nez v12, :cond_b

    .line 359
    .line 360
    iget-object v11, v11, Ll91;->ε:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v11, Lf11;

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :catchall_1
    move-exception v0

    .line 366
    goto :goto_e

    .line 367
    :cond_b
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_c
    iget-object v4, v0, Lkl1;->γ:Ljava/lang/Object;

    .line 371
    .line 372
    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 373
    :try_start_4
    iget-object v8, v0, Lkl1;->λ:Ljava/util/ArrayList;

    .line 374
    .line 375
    invoke-static {v8, v3}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 376
    .line 377
    .line 378
    :try_start_5
    monitor-exit v4

    .line 379
    new-instance v3, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    const/4 v8, 0x0

    .line 393
    :goto_b
    if-ge v8, v4, :cond_e

    .line 394
    .line 395
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v11

    .line 399
    move-object v12, v11

    .line 400
    check-cast v12, Ll91;

    .line 401
    .line 402
    iget-object v12, v12, Ll91;->ζ:Ljava/lang/Object;

    .line 403
    .line 404
    if-eqz v12, :cond_d

    .line 405
    .line 406
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_e
    move-object v10, v3

    .line 413
    goto :goto_c

    .line 414
    :catchall_2
    move-exception v0

    .line 415
    monitor-exit v4

    .line 416
    throw v0

    .line 417
    :cond_f
    :goto_c
    invoke-virtual {v5, v10}, Lzn;->ρ(Ljava/util/ArrayList;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 418
    .line 419
    .line 420
    :try_start_6
    invoke-static {v7}, Ltw1;->ρ(Ltw1;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 421
    .line 422
    .line 423
    invoke-static {v6}, Lkl1;->υ(Lf21;)V

    .line 424
    .line 425
    .line 426
    goto/16 :goto_1

    .line 427
    .line 428
    :catchall_3
    move-exception v0

    .line 429
    goto :goto_f

    .line 430
    :goto_d
    :try_start_7
    monitor-exit v8

    .line 431
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 432
    :goto_e
    :try_start_8
    invoke-static {v7}, Ltw1;->ρ(Ltw1;)V

    .line 433
    .line 434
    .line 435
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 436
    :goto_f
    invoke-static {v6}, Lkl1;->υ(Lf21;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :cond_10
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 441
    .line 442
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    const/4 v0, 0x0

    .line 446
    return-object v0

    .line 447
    :cond_11
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    check-cast v0, Ljava/lang/Iterable;

    .line 452
    .line 453
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    return-object v0
.end method

.method public final Η(Lzn;Lc21;)Lzn;
    .locals 5

    .line 1
    iget-object v0, p1, Lzn;->ω:Lv80;

    .line 2
    .line 3
    iget-boolean v0, v0, Lv80;->Θ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    iget v0, p1, Lzn;->Α:I

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object p0, p0, Lkl1;->ρ:Lc21;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lc21;->γ(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ne p0, v0, :cond_1

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_1
    new-instance p0, Lcl1;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {p0, v2, p1}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lqh1;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    invoke-direct {v2, p1, v3, p2}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    instance-of v4, v3, Lf21;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    check-cast v3, Lf21;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v3, v1

    .line 50
    :goto_0
    if-eqz v3, :cond_5

    .line 51
    .line 52
    invoke-virtual {v3, p0, v2}, Lf21;->Ε(La80;La80;)Lf21;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_5

    .line 57
    .line 58
    :try_start_0
    invoke-virtual {p0}, Ltw1;->κ()Ltw1;

    .line 59
    .line 60
    .line 61
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 62
    if-eqz p2, :cond_4

    .line 63
    .line 64
    :try_start_1
    invoke-virtual {p2}, Lc21;->θ()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-ne v3, v0, :cond_4

    .line 69
    .line 70
    new-instance v3, Lz61;

    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    invoke-direct {v3, p2, v4, p1}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p2, p1, Lzn;->ω:Lv80;

    .line 77
    .line 78
    iget-boolean v4, p2, Lv80;->Θ:Z

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    const-string v4, "Preparing a composition while composing is not supported"

    .line 83
    .line 84
    invoke-static {v4}, Lsn;->α(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    iput-boolean v0, p2, Lv80;->Θ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    :try_start_2
    invoke-virtual {v3}, Lz61;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    .line 92
    .line 93
    :try_start_3
    iput-boolean v0, p2, Lv80;->Θ:Z

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    iput-boolean v0, p2, Lv80;->Θ:Z

    .line 98
    .line 99
    throw p1

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lzn;->χ()Z

    .line 103
    .line 104
    .line 105
    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 106
    :try_start_4
    invoke-static {v2}, Ltw1;->ρ(Ltw1;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 107
    .line 108
    .line 109
    invoke-static {p0}, Lkl1;->υ(Lf21;)V

    .line 110
    .line 111
    .line 112
    if-eqz p2, :cond_6

    .line 113
    .line 114
    return-object p1

    .line 115
    :catchall_2
    move-exception p1

    .line 116
    goto :goto_3

    .line 117
    :goto_2
    :try_start_5
    invoke-static {v2}, Ltw1;->ρ(Ltw1;)V

    .line 118
    .line 119
    .line 120
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 121
    :goto_3
    invoke-static {p0}, Lkl1;->υ(Lf21;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_5
    const-string p0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 126
    .line 127
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const/4 p0, 0x0

    .line 131
    return-object p0

    .line 132
    :cond_6
    :goto_4
    return-object v1
.end method

.method public final Θ(Ljava/lang/Throwable;Lzn;)V
    .locals 4

    .line 1
    sget-object v0, Lkl1;->Β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    instance-of v0, p1, Lgn;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    const-string v2, "Error was captured in composition while live edit was enabled."

    .line 24
    .line 25
    const-string v3, "ComposeInternal"

    .line 26
    .line 27
    invoke-static {v3, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lkl1;->κ:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lkl1;->ι:Lk21;

    .line 36
    .line 37
    invoke-virtual {v2}, Lk21;->η()V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lc21;

    .line 41
    .line 42
    invoke-direct {v2}, Lc21;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lkl1;->θ:Lc21;

    .line 46
    .line 47
    iget-object v2, p0, Lkl1;->λ:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lkl1;->μ:Lb21;

    .line 53
    .line 54
    invoke-virtual {v2}, Lb21;->α()V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Lkl1;->ξ:Lb21;

    .line 58
    .line 59
    invoke-virtual {v2}, Lb21;->α()V

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lkl1;->τ:Lf02;

    .line 63
    .line 64
    new-instance v3, Lel1;

    .line 65
    .line 66
    invoke-direct {v3, p1}, Lel1;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1, v3}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    if-eqz p2, :cond_0

    .line 76
    .line 77
    invoke-virtual {p0, p2}, Lkl1;->Κ(Lzn;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lkl1;->χ()Lyd;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    const-string p0, "expected to go to inactive state due to composition error"

    .line 90
    .line 91
    invoke-static {p0}, Lsn;->α(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    :cond_1
    monitor-exit v0

    .line 95
    return-void

    .line 96
    :goto_1
    monitor-exit v0

    .line 97
    throw p0

    .line 98
    :cond_2
    iget-object p2, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 99
    .line 100
    monitor-enter p2

    .line 101
    :try_start_1
    const-string v0, "Error was captured in composition."

    .line 102
    .line 103
    const-string v2, "ComposeInternal"

    .line 104
    .line 105
    invoke-static {v2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lkl1;->τ:Lf02;

    .line 109
    .line 110
    invoke-virtual {v0}, Lf02;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lel1;

    .line 115
    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    iget-object p0, p0, Lkl1;->τ:Lf02;

    .line 119
    .line 120
    new-instance v0, Lel1;

    .line 121
    .line 122
    invoke-direct {v0, p1}, Lel1;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v1, v0}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    .line 130
    .line 131
    monitor-exit p2

    .line 132
    throw p1

    .line 133
    :catchall_1
    move-exception p0

    .line 134
    goto :goto_2

    .line 135
    :cond_3
    :try_start_2
    iget-object p0, v0, Lel1;->α:Ljava/lang/Throwable;

    .line 136
    .line 137
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    :goto_2
    monitor-exit p2

    .line 139
    throw p0
.end method

.method public final Ι()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkl1;->θ:Lc21;

    .line 5
    .line 6
    invoke-virtual {v1}, Lc21;->η()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lkl1;->ω()Z

    .line 13
    .line 14
    .line 15
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lkl1;->Γ()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lkl1;->θ:Lc21;

    .line 26
    .line 27
    new-instance v3, Lvq1;

    .line 28
    .line 29
    invoke-direct {v3, v2}, Lvq1;-><init>(Lc21;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lc21;

    .line 33
    .line 34
    invoke-direct {v2}, Lc21;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lkl1;->θ:Lc21;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    :try_start_2
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v2, 0x0

    .line 45
    :goto_0
    if-ge v2, v0, :cond_1

    .line 46
    .line 47
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lzn;

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Lzn;->ψ(Lvq1;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Lkl1;->φ:Lf02;

    .line 57
    .line 58
    invoke-virtual {v4}, Lf02;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lfl1;

    .line 63
    .line 64
    sget-object v5, Lfl1;->ζ:Lfl1;

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 67
    .line 68
    .line 69
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    if-lez v4, :cond_1

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 78
    .line 79
    monitor-enter v0

    .line 80
    :try_start_3
    invoke-virtual {p0}, Lkl1;->χ()Lyd;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-nez v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0}, Lkl1;->ω()Z

    .line 87
    .line 88
    .line 89
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 90
    monitor-exit v0

    .line 91
    return p0

    .line 92
    :catchall_2
    move-exception p0

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v1, "called outside of runRecomposeAndApplyChanges"

    .line 97
    .line 98
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 102
    :goto_1
    monitor-exit v0

    .line 103
    throw p0

    .line 104
    :goto_2
    iget-object v1, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-enter v1

    .line 107
    :try_start_5
    iget-object p0, p0, Lkl1;->θ:Lc21;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {p0, v3}, Lc21;->κ(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    monitor-exit v1

    .line 131
    throw v0

    .line 132
    :catchall_3
    move-exception p0

    .line 133
    monitor-exit v1

    .line 134
    throw p0

    .line 135
    :goto_4
    monitor-exit v0

    .line 136
    throw p0
.end method

.method public final Κ(Lzn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkl1;->π:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkl1;->π:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lkl1;->ζ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Lkl1;->η:Ljava/lang/Object;

    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final Λ(Lq3;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Ljl1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ljl1;-><init>(Lkl1;Lop;)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p1, Lpp;->ζ:Lup;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Ls1;->μ(Lup;)Lk3;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, Lhl1;

    .line 17
    .line 18
    invoke-direct {v4, p0, v0, v3, v1}, Lhl1;-><init>(Lkl1;Ljl1;Lk3;Lop;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lkl1;->α:Lk3;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {v2, p0}, Lup;->η(Lup;)Lup;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lyh;->Α(Lup;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lcq;->ε:Lcq;

    .line 37
    .line 38
    sget-object v3, Ls62;->α:Ls62;

    .line 39
    .line 40
    if-ne p0, v2, :cond_0

    .line 41
    .line 42
    new-instance v1, Lwq1;

    .line 43
    .line 44
    invoke-direct {v1, p1, p0}, Lwq1;-><init>(Lop;Lup;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v1, v4}, Li91;->ο(Lwq1;Lwq1;Le80;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sget-object v5, Lx;->Γ:Lx;

    .line 53
    .line 54
    invoke-interface {p0, v5}, Lup;->θ(Ltp;)Lsp;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-interface {v2, v5}, Lup;->θ(Ltp;)Lsp;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v6, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    new-instance v2, Lq62;

    .line 69
    .line 70
    invoke-direct {v2, p0, p1}, Lq62;-><init>(Lup;Lq3;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, v2, Lο;->η:Lup;

    .line 74
    .line 75
    invoke-static {p0, v1}, Lpd2;->б(Lup;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :try_start_0
    invoke-static {v2, v2, v4}, Li91;->ο(Lwq1;Lwq1;Le80;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    invoke-static {p0, p1}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object p0, v1

    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    invoke-static {p0, p1}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_1
    new-instance v1, Lht;

    .line 94
    .line 95
    invoke-direct {v1, p1, p0}, Lwq1;-><init>(Lop;Lup;)V

    .line 96
    .line 97
    .line 98
    :try_start_1
    invoke-static {v1, v1, v4}, Lxb;->ρ(Lop;Lop;Le80;)Lop;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lxb;->Θ(Lop;)Lop;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0, v3}, Ljx0;->Ψ(Lop;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    .line 108
    .line 109
    sget-object p0, Lht;->ι:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 110
    .line 111
    :cond_2
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    const/4 p0, 0x2

    .line 118
    if-ne p1, p0, :cond_4

    .line 119
    .line 120
    sget-object p0, Lfo0;->ε:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 121
    .line 122
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lxb;->д(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    instance-of p1, p0, Lom;

    .line 131
    .line 132
    if-nez p1, :cond_3

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    check-cast p0, Lom;

    .line 136
    .line 137
    iget-object p0, p0, Lom;->α:Ljava/lang/Throwable;

    .line 138
    .line 139
    throw p0

    .line 140
    :cond_4
    const-string p0, "Already suspended"

    .line 141
    .line 142
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const/4 p0, 0x0

    .line 146
    return-object p0

    .line 147
    :cond_5
    const/4 p1, 0x0

    .line 148
    const/4 v2, 0x1

    .line 149
    invoke-virtual {p0, v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_2

    .line 154
    .line 155
    move-object p0, v0

    .line 156
    :goto_0
    if-ne p0, v0, :cond_6

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    move-object p0, v3

    .line 160
    :goto_1
    if-ne p0, v0, :cond_7

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_7
    return-object v3

    .line 164
    :catchall_1
    move-exception p0

    .line 165
    new-instance p1, Leo1;

    .line 166
    .line 167
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1}, Lο;->ζ(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    throw p0
.end method

.method public final α(Lzn;Le80;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lzn;->ω:Lv80;

    .line 2
    .line 3
    iget-boolean v0, v0, Lv80;->Θ:Z

    .line 4
    .line 5
    iget-object v1, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, p0, Lkl1;->φ:Lf02;

    .line 9
    .line 10
    invoke-virtual {v2}, Lf02;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lfl1;

    .line 15
    .line 16
    sget-object v3, Lfl1;->ζ:Lfl1;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v4, 0x1

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lkl1;->Γ()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    xor-int/2addr v4, v2

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_0
    :goto_0
    monitor-exit v1

    .line 39
    :try_start_1
    new-instance v1, Lcl1;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, v2, p1}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Lqh1;

    .line 46
    .line 47
    const/4 v5, 0x3

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-direct {v2, p1, v5, v6}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    instance-of v7, v5, Lf21;

    .line 57
    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    check-cast v5, Lf21;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v5, v6

    .line 64
    :goto_1
    if-eqz v5, :cond_6

    .line 65
    .line 66
    invoke-virtual {v5, v1, v2}, Lf21;->Ε(La80;La80;)Lf21;

    .line 67
    .line 68
    .line 69
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    :try_start_2
    invoke-virtual {v1}, Ltw1;->κ()Ltw1;

    .line 73
    .line 74
    .line 75
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 76
    :try_start_3
    invoke-virtual {p1, p2}, Lzn;->κ(Le80;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 77
    .line 78
    .line 79
    :try_start_4
    invoke-static {v2}, Ltw1;->ρ(Ltw1;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 80
    .line 81
    .line 82
    :try_start_5
    invoke-static {v1}, Lkl1;->υ(Lf21;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 83
    .line 84
    .line 85
    iget-object p2, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter p2

    .line 88
    :try_start_6
    iget-object v1, p0, Lkl1;->φ:Lf02;

    .line 89
    .line 90
    invoke-virtual {v1}, Lf02;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Lfl1;

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-lez v1, :cond_2

    .line 101
    .line 102
    invoke-virtual {p0}, Lkl1;->Γ()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_2

    .line 111
    .line 112
    iget-object v1, p0, Lkl1;->ζ:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    iput-object v6, p0, Lkl1;->η:Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catchall_1
    move-exception p0

    .line 121
    goto :goto_3

    .line 122
    :cond_2
    :goto_2
    monitor-exit p2

    .line 123
    if-nez v0, :cond_3

    .line 124
    .line 125
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Ltw1;->ν()V

    .line 130
    .line 131
    .line 132
    :cond_3
    :try_start_7
    iget-object p2, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 133
    .line 134
    monitor-enter p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 135
    :try_start_8
    iget-object v1, p0, Lkl1;->λ:Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 141
    if-gtz v2, :cond_5

    .line 142
    .line 143
    :try_start_9
    monitor-exit p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 144
    :try_start_a
    invoke-virtual {p1}, Lzn;->δ()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lzn;->ζ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 148
    .line 149
    .line 150
    if-nez v0, :cond_4

    .line 151
    .line 152
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p0}, Ltw1;->ν()V

    .line 157
    .line 158
    .line 159
    :cond_4
    return-void

    .line 160
    :catchall_2
    move-exception p1

    .line 161
    invoke-virtual {p0, p1, v6}, Lkl1;->Θ(Ljava/lang/Throwable;Lzn;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_5
    const/4 v0, 0x0

    .line 166
    :try_start_b
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Lf11;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const/4 v0, 0x0

    .line 176
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 177
    :catchall_3
    move-exception v0

    .line 178
    :try_start_c
    monitor-exit p2

    .line 179
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 180
    :catchall_4
    move-exception p2

    .line 181
    invoke-virtual {p0, p2, p1}, Lkl1;->Θ(Ljava/lang/Throwable;Lzn;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :goto_3
    monitor-exit p2

    .line 186
    throw p0

    .line 187
    :catchall_5
    move-exception p2

    .line 188
    goto :goto_5

    .line 189
    :catchall_6
    move-exception p2

    .line 190
    goto :goto_4

    .line 191
    :catchall_7
    move-exception p2

    .line 192
    :try_start_d
    invoke-static {v2}, Ltw1;->ρ(Ltw1;)V

    .line 193
    .line 194
    .line 195
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 196
    :goto_4
    :try_start_e
    invoke-static {v1}, Lkl1;->υ(Lf21;)V

    .line 197
    .line 198
    .line 199
    throw p2

    .line 200
    :cond_6
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 203
    .line 204
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 208
    :goto_5
    if-eqz v4, :cond_7

    .line 209
    .line 210
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 211
    .line 212
    monitor-enter v0

    .line 213
    monitor-exit v0

    .line 214
    :cond_7
    invoke-virtual {p0, p2, p1}, Lkl1;->Θ(Ljava/lang/Throwable;Lzn;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :goto_6
    monitor-exit v1

    .line 219
    throw p0
.end method

.method public final γ()Z
    .locals 0

    .line 1
    sget-object p0, Lkl1;->Β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final δ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ε()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ζ()J
    .locals 2

    .line 1
    const/16 p0, 0x3e8

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final η()Ltn;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final ι()Lup;
    .locals 0

    .line 1
    iget-object p0, p0, Lkl1;->ψ:Lup;

    .line 2
    .line 3
    return-object p0
.end method

.method public final κ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final λ(Lzn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkl1;->ι:Lk21;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lk21;->θ(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lkl1;->ι:Lk21;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lk21;->β(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lkl1;->χ()Lyd;

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
    goto :goto_1

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    sget-object p1, Ls62;->α:Ls62;

    .line 29
    .line 30
    check-cast p0, Lae;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lae;->ζ(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p0
.end method

.method public final μ(Lf11;)Le11;
    .locals 1

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lkl1;->ξ:Lb21;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Le11;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0

    .line 16
    throw p0
.end method

.method public final ν(Ljava/util/Set;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ο(Lzn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkl1;->ρ:Lc21;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    sget v1, Luq1;->α:I

    .line 9
    .line 10
    new-instance v1, Lc21;

    .line 11
    .line 12
    invoke-direct {v1}, Lc21;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lkl1;->ρ:Lc21;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v1, p1}, Lc21;->α(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final π(Lk1;)Lbe;
    .locals 2

    .line 1
    iget-object p0, p0, Lkl1;->β:Lm6;

    .line 2
    .line 3
    iget-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb8;

    .line 6
    .line 7
    new-instance v1, Lg31;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, v1, Lg31;->α:Lk1;

    .line 13
    .line 14
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lp3;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Lb8;->δ(La8;Lp70;)Lbe;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final τ(Lzn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkl1;->ζ:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lkl1;->η:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lkl1;->ι:Lk21;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lk21;->κ(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lkl1;->κ:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    monitor-exit v0

    .line 29
    throw p0
.end method

.method public final φ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lkl1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lkl1;->φ:Lf02;

    .line 5
    .line 6
    invoke-virtual {v1}, Lf02;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lfl1;

    .line 11
    .line 12
    sget-object v2, Lfl1;->ι:Lfl1;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-ltz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lkl1;->φ:Lf02;

    .line 22
    .line 23
    sget-object v3, Lfl1;->ζ:Lfl1;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    iget-object p0, p0, Lkl1;->χ:Lzn0;

    .line 36
    .line 37
    invoke-virtual {p0, v2}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p0
.end method

.method public final χ()Lyd;
    .locals 9

    .line 1
    iget-object v0, p0, Lkl1;->φ:Lf02;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf02;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lfl1;

    .line 8
    .line 9
    sget-object v2, Lfl1;->ζ:Lfl1;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lkl1;->τ:Lf02;

    .line 16
    .line 17
    iget-object v3, p0, Lkl1;->λ:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v4, p0, Lkl1;->κ:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v5, p0, Lkl1;->ι:Lk21;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    if-gtz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Lkl1;->Γ()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v7, 0x0

    .line 35
    :goto_0
    if-ge v7, v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    check-cast v8, Lzn;

    .line 42
    .line 43
    add-int/lit8 v7, v7, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Lkl1;->ζ:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 49
    .line 50
    .line 51
    sget-object v0, Ljz;->ε:Ljz;

    .line 52
    .line 53
    iput-object v0, p0, Lkl1;->η:Ljava/lang/Object;

    .line 54
    .line 55
    new-instance v0, Lc21;

    .line 56
    .line 57
    invoke-direct {v0}, Lc21;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lkl1;->θ:Lc21;

    .line 61
    .line 62
    invoke-virtual {v5}, Lk21;->η()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 69
    .line 70
    .line 71
    iput-object v6, p0, Lkl1;->π:Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v0, p0, Lkl1;->σ:Lae;

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {v0, v6}, Lae;->ο(Ljava/lang/Throwable;)Z

    .line 78
    .line 79
    .line 80
    :cond_1
    iput-object v6, p0, Lkl1;->σ:Lae;

    .line 81
    .line 82
    invoke-virtual {v2, v6}, Lf02;->θ(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object v6

    .line 86
    :cond_2
    invoke-virtual {v2}, Lf02;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    sget-object v2, Lfl1;->κ:Lfl1;

    .line 91
    .line 92
    sget-object v7, Lfl1;->η:Lfl1;

    .line 93
    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    iget-object v1, p0, Lkl1;->δ:Lfo0;

    .line 98
    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    new-instance v1, Lc21;

    .line 102
    .line 103
    invoke-direct {v1}, Lc21;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, Lkl1;->θ:Lc21;

    .line 107
    .line 108
    invoke-virtual {v5}, Lk21;->η()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lkl1;->ψ()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    invoke-virtual {p0}, Lkl1;->Α()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    :cond_4
    sget-object v7, Lfl1;->θ:Lfl1;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    iget v1, v5, Lk21;->η:I

    .line 127
    .line 128
    if-eqz v1, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    iget-object v1, p0, Lkl1;->θ:Lc21;

    .line 132
    .line 133
    invoke-virtual {v1}, Lc21;->θ()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_8

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_8

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    invoke-virtual {p0}, Lkl1;->ψ()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_8

    .line 156
    .line 157
    invoke-virtual {p0}, Lkl1;->Α()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_8

    .line 162
    .line 163
    iget-object v1, p0, Lkl1;->μ:Lb21;

    .line 164
    .line 165
    invoke-virtual {v1}, Lb21;->κ()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_7
    sget-object v7, Lfl1;->ι:Lfl1;

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    :goto_1
    move-object v7, v2

    .line 176
    :cond_9
    :goto_2
    invoke-virtual {v0, v6, v7}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    if-ne v7, v2, :cond_a

    .line 180
    .line 181
    iget-object v0, p0, Lkl1;->σ:Lae;

    .line 182
    .line 183
    iput-object v6, p0, Lkl1;->σ:Lae;

    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_a
    return-object v6
.end method

.method public final ψ()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkl1;->υ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lkl1;->α:Lk3;

    .line 6
    .line 7
    iget-object p0, p0, Lk3;->η:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lb8;

    .line 10
    .line 11
    iget-object p0, p0, Lb8;->γ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lj7;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const v0, 0x7ffffff

    .line 20
    .line 21
    .line 22
    and-int/2addr p0, v0

    .line 23
    if-lez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final ω()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkl1;->ι:Lk21;

    .line 2
    .line 3
    iget v0, v0, Lk21;->η:I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lkl1;->ψ()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lkl1;->Α()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Lkl1;->μ:Lb21;

    .line 21
    .line 22
    invoke-virtual {p0}, Lb21;->κ()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 32
    return p0
.end method
