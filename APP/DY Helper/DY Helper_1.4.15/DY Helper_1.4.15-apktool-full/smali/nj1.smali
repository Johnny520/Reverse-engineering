.class public abstract Lnj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/lang/Object;

.field public static final γ:Ljava/util/WeakHashMap;

.field public static final δ:Ljava/util/WeakHashMap;

.field public static final ε:Ljava/util/WeakHashMap;

.field public static volatile ζ:F

.field public static volatile η:F

.field public static final θ:Lli1;

.field public static final ι:Lli1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lnj1;->β:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v0, Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lnj1;->γ:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    new-instance v0, Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    new-instance v0, Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lnj1;->ε:Ljava/util/WeakHashMap;

    .line 36
    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    sput v0, Lnj1;->ζ:F

    .line 40
    .line 41
    sput v0, Lnj1;->η:F

    .line 42
    .line 43
    new-instance v0, Lli1;

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-direct {v0, v1}, Lli1;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lnj1;->θ:Lli1;

    .line 50
    .line 51
    new-instance v0, Lli1;

    .line 52
    .line 53
    const/4 v1, 0x7

    .line 54
    invoke-direct {v0, v1}, Lli1;-><init>(I)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lnj1;->ι:Lli1;

    .line 58
    .line 59
    return-void
.end method

.method public static α(Landroid/view/View;Z)V
    .locals 3

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    sget-object p1, Lnj1;->β:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    sget-object v0, Lnj1;->γ:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p0, p1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit p1

    .line 27
    throw p0

    .line 28
    :cond_1
    invoke-static {}, Lnj1;->η()V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lrj1;->α:Ljava/util/Set;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-static {p1, v0}, Lrj1;->α(FF)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    sget-object v0, Lnj1;->β:Ljava/lang/Object;

    .line 44
    .line 45
    monitor-enter v0

    .line 46
    :try_start_1
    sget-object v1, Lnj1;->γ:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    monitor-exit v0

    .line 56
    sget v0, Lnj1;->ζ:F

    .line 57
    .line 58
    invoke-static {p1, v0}, Lrj1;->α(FF)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-static {p0, p1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    monitor-exit v0

    .line 68
    throw p0
.end method

.method public static β(Landroid/view/View;)Z
    .locals 4

    .line 1
    sget-object v0, Lnj1;->ε:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    instance-of v1, v0, Ljava/util/Collection;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Ljava/util/Collection;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-object v2, p0

    .line 46
    :goto_0
    if-eqz v2, :cond_1

    .line 47
    .line 48
    if-ne v2, v1, :cond_2

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    instance-of v3, v2, Landroid/view/View;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    check-cast v2, Landroid/view/View;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 v2, 0x0

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public static γ(Landroid/view/View;ZF)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {p2, v0}, Lrj1;->α(FF)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Lnj1;->β:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter p1

    .line 12
    :try_start_0
    sget-object p2, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {p2, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit p1

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit p1

    .line 24
    throw p0

    .line 25
    :cond_0
    invoke-static {}, Lnj1;->ζ()V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lnj1;->β:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter p1

    .line 31
    :try_start_1
    invoke-static {p0}, Lnj1;->β(Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    sget-object v0, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    goto :goto_0

    .line 44
    :catchall_1
    move-exception p0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sget-object v0, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    :goto_0
    monitor-exit p1

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-static {p0, p2}, Lnj1;->θ(Landroid/view/View;F)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    sget p1, Lnj1;->η:F

    .line 64
    .line 65
    invoke-static {p2, p1}, Lrj1;->α(FF)F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p0, p1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_1
    monitor-exit p1

    .line 74
    throw p0
.end method

.method public static δ()V
    .locals 7

    .line 1
    sget-object v0, Lnj1;->β:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v3, 0xa

    .line 18
    .line 19
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    new-instance v6, Ll91;

    .line 51
    .line 52
    invoke-direct {v6, v5, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v1

    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_0
    sget-object v1, Lnj1;->ε:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v1, Ljava/lang/Iterable;

    .line 72
    .line 73
    new-instance v4, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Ljava/util/Map$Entry;

    .line 97
    .line 98
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-instance v6, Ll91;

    .line 107
    .line 108
    invoke-direct {v6, v5, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    monitor-exit v0

    .line 116
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_2

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ll91;

    .line 131
    .line 132
    iget-object v2, v1, Ll91;->ε:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, Landroid/view/View;

    .line 135
    .line 136
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    sget-object v3, Lrj1;->α:Ljava/util/Set;

    .line 145
    .line 146
    sget v3, Lnj1;->η:F

    .line 147
    .line 148
    invoke-static {v1, v3}, Lrj1;->α(FF)F

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v2, v1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_3

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Ll91;

    .line 171
    .line 172
    iget-object v2, v1, Ll91;->ε:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, Landroid/view/View;

    .line 175
    .line 176
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    sget-object v3, Lrj1;->α:Ljava/util/Set;

    .line 185
    .line 186
    sget v3, Lnj1;->η:F

    .line 187
    .line 188
    invoke-static {v1, v3}, Lrj1;->α(FF)F

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-static {v2, v1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_3
    return-void

    .line 197
    :goto_4
    monitor-exit v0

    .line 198
    throw v1
.end method

.method public static ε()V
    .locals 6

    .line 1
    sget-object v0, Lnj1;->β:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lnj1;->γ:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v3, 0xa

    .line 18
    .line 19
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    new-instance v5, Ll91;

    .line 51
    .line 52
    invoke-direct {v5, v4, v3}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v1

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    monitor-exit v0

    .line 62
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Ll91;

    .line 77
    .line 78
    iget-object v2, v1, Ll91;->ε:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Landroid/view/View;

    .line 81
    .line 82
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ljava/lang/Float;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v3, Lrj1;->α:Ljava/util/Set;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    sget v3, Lnj1;->ζ:F

    .line 99
    .line 100
    invoke-static {v1, v3}, Lrj1;->α(FF)F

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-static {v2, v1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    return-void

    .line 109
    :goto_2
    monitor-exit v0

    .line 110
    throw v1
.end method

.method public static ζ()V
    .locals 3

    .line 1
    const-string v0, "profile_video_comment_bar_alpha"

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move v0, v1

    .line 15
    :goto_0
    const/4 v2, 0x0

    .line 16
    invoke-static {v0, v2, v1}, Lj81;->μ(III)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v0, v0

    .line 21
    const/high16 v1, 0x42c80000    # 100.0f

    .line 22
    .line 23
    div-float/2addr v0, v1

    .line 24
    sput v0, Lnj1;->η:F

    .line 25
    .line 26
    return-void
.end method

.method public static η()V
    .locals 3

    .line 1
    const-string v0, "profile_video_search_alpha"

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move v0, v1

    .line 15
    :goto_0
    const/4 v2, 0x0

    .line 16
    invoke-static {v0, v2, v1}, Lj81;->μ(III)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v0, v0

    .line 21
    const/high16 v1, 0x42c80000    # 100.0f

    .line 22
    .line 23
    div-float/2addr v0, v1

    .line 24
    sput v0, Lnj1;->ζ:F

    .line 25
    .line 26
    return-void
.end method

.method public static θ(Landroid/view/View;F)V
    .locals 2

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
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    new-instance p1, Leo1;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p0, p1

    .line 28
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "ProfileVideoOverlayAlpha: \u4e3b\u7ebf\u7a0b\u5e94\u7528\u900f\u660e\u5ea6\u5931\u8d25: "

    .line 39
    .line 40
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void

    .line 44
    :cond_1
    new-instance v0, Lmj1;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1}, Lmj1;-><init>(Landroid/view/View;F)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    return-void
.end method
