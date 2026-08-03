.class public final Ld9/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Landroid/graphics/Paint;


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/Map;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ld9/m;->j:Landroid/graphics/Paint;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld9/m;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Ld9/m;->b:Lab/b;

    .line 10
    .line 11
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ld9/m;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 16
    .line 17
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Ld9/m;->d:Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Ld9/m;->e:Ljava/util/Map;

    .line 28
    .line 29
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Ld9/m;->f:Ljava/util/Map;

    .line 34
    .line 35
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ld9/m;->g:Ljava/util/Map;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ld9/m;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    return-void
.end method

.method public static final a(Ld9/m;Ljava/lang/String;Ld9/a;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Ld9/m;->a:Lr8/g;

    .line 2
    .line 3
    invoke-static {p1}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    iget-object p0, p0, Ld9/m;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Ld9/j;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    iget-wide v6, p2, Ld9/j;->a:J

    .line 27
    .line 28
    sub-long v6, v4, v6

    .line 29
    .line 30
    const-wide/16 v8, 0x3e8

    .line 31
    .line 32
    cmp-long v6, v6, v8

    .line 33
    .line 34
    if-gtz v6, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p2, v1

    .line 38
    :goto_0
    if-eqz p2, :cond_1

    .line 39
    .line 40
    iget-object p0, p2, Ld9/j;->b:Lc9/a;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object p2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {p2}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v6, v0

    .line 64
    check-cast v6, Lc9/a;

    .line 65
    .line 66
    iget-object v6, v6, Lc9/a;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v6}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_2

    .line 77
    .line 78
    move-object v1, v0

    .line 79
    :cond_3
    move-object p2, v1

    .line 80
    check-cast p2, Lc9/a;

    .line 81
    .line 82
    new-instance v0, Ld9/j;

    .line 83
    .line 84
    invoke-direct {v0, v4, v5, p2}, Ld9/j;-><init>(JLc9/a;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-object p0, p2

    .line 91
    :goto_1
    if-eqz p0, :cond_5

    .line 92
    .line 93
    iget-object p0, p0, Lc9/a;->h:Ljava/lang/String;

    .line 94
    .line 95
    if-eqz p0, :cond_5

    .line 96
    .line 97
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    xor-int/2addr p0, v3

    .line 102
    if-ne p0, v3, :cond_5

    .line 103
    .line 104
    return v3

    .line 105
    :cond_4
    iget-object p0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 106
    .line 107
    const-string p1, "Hchat_custom_friend_avatar_config"

    .line 108
    .line 109
    invoke-static {p0, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v1, "enable"

    .line 114
    .line 115
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_6

    .line 120
    .line 121
    :cond_5
    return v2

    .line 122
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_c

    .line 127
    .line 128
    if-eq p2, v3, :cond_b

    .line 129
    .line 130
    const/4 v0, 0x2

    .line 131
    if-eq p2, v0, :cond_a

    .line 132
    .line 133
    const/4 v0, 0x3

    .line 134
    if-eq p2, v0, :cond_9

    .line 135
    .line 136
    const/4 v0, 0x4

    .line 137
    if-eq p2, v0, :cond_8

    .line 138
    .line 139
    const/4 v0, 0x5

    .line 140
    if-ne p2, v0, :cond_7

    .line 141
    .line 142
    const-string p2, "scope_other_ui"

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    invoke-static {}, Lokio/a;->k()V

    .line 146
    .line 147
    .line 148
    const/4 p0, 0x0

    .line 149
    return p0

    .line 150
    :cond_8
    const-string p2, "scope_moments"

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    const-string p2, "scope_profile"

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_a
    const-string p2, "scope_contacts"

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_b
    const-string p2, "scope_conversation"

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_c
    const-string p2, "scope_chat"

    .line 163
    .line 164
    :goto_2
    invoke-static {p0, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-interface {p0, p2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    return p0
.end method

.method public static final b(Ld9/m;[Ljava/lang/Object;II)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p3, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of p3, p0, Ljava/lang/Number;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, v0

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_1
    and-int/lit8 p0, p0, 0x4

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_2
    invoke-static {p2, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    instance-of p1, p0, Ljava/lang/Number;

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    check-cast p0, Ljava/lang/Number;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    move-object p0, v0

    .line 42
    :goto_2
    if-eqz p0, :cond_6

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p2, 0x0

    .line 53
    cmpl-float p0, p0, p2

    .line 54
    .line 55
    if-lez p0, :cond_4

    .line 56
    .line 57
    move-object v0, p1

    .line 58
    :cond_4
    if-eqz v0, :cond_6

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    const/high16 p1, 0x3f000000    # 0.5f

    .line 65
    .line 66
    cmpl-float p2, p0, p1

    .line 67
    .line 68
    if-lez p2, :cond_5

    .line 69
    .line 70
    return p1

    .line 71
    :cond_5
    return p0

    .line 72
    :cond_6
    :goto_3
    const p0, 0x3dcccccd    # 0.1f

    .line 73
    .line 74
    .line 75
    return p0
.end method

.method public static final c(Ld9/m;Landroid/graphics/Bitmap;Ljava/lang/Float;)Landroid/graphics/Bitmap;
    .locals 11

    .line 1
    iget-object v0, p0, Ld9/m;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "Hchat_round_avatar_config"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "round_avatar_enable"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const v2, 0x3dcccccd    # 0.1f

    .line 20
    .line 21
    .line 22
    const/high16 v3, 0x3f000000    # 0.5f

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object p0, p0, Ld9/m;->a:Lr8/g;

    .line 27
    .line 28
    iget-object p0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 29
    .line 30
    const-string p2, "Hchat_round_avatar_config"

    .line 31
    .line 32
    invoke-static {p0, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p2, "round_avatar_radius_factor"

    .line 37
    .line 38
    invoke-interface {p0, p2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p0, v2, v3}, Lr9/e0;->q(FFF)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    const/high16 p2, 0x42c80000    # 100.0f

    .line 47
    .line 48
    mul-float/2addr p0, p2

    .line 49
    invoke-static {p0}, Lig/a;->X(F)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    int-to-float p0, p0

    .line 54
    div-float v2, p0, p2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    if-eqz p2, :cond_3

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const/4 v0, 0x0

    .line 64
    cmpl-float p0, p0, v0

    .line 65
    .line 66
    if-lez p0, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object p2, v1

    .line 70
    :goto_0
    if-eqz p2, :cond_3

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    cmpl-float p2, p0, v3

    .line 77
    .line 78
    if-lez p2, :cond_2

    .line 79
    .line 80
    move v2, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v2, p0

    .line 83
    :cond_3
    :goto_1
    sget-object p0, Ld9/c;->a:Ld9/c;

    .line 84
    .line 85
    monitor-enter p0

    .line 86
    :try_start_0
    sget-object p2, Ld9/c;->b:Ljava/util/WeakHashMap;

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ld9/b;

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iget v3, v0, Ld9/b;->a:F

    .line 97
    .line 98
    cmpg-float v3, v3, v2

    .line 99
    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-object v0, v1

    .line 104
    :goto_2
    if-eqz v0, :cond_6

    .line 105
    .line 106
    iget-object v0, v0, Ld9/b;->b:Ljava/lang/ref/WeakReference;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Landroid/graphics/Bitmap;

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 117
    .line 118
    .line 119
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    if-nez v3, :cond_5

    .line 121
    .line 122
    move-object v1, v0

    .line 123
    :cond_5
    if-eqz v1, :cond_6

    .line 124
    .line 125
    monitor-exit p0

    .line 126
    return-object v1

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    move-object p1, v0

    .line 129
    goto :goto_5

    .line 130
    :cond_6
    :try_start_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 139
    .line 140
    invoke-static {v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v10, Landroid/graphics/Paint;

    .line 148
    .line 149
    const/4 v1, 0x3

    .line 150
    invoke-direct {v10, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 151
    .line 152
    .line 153
    new-instance v1, Landroid/graphics/BitmapShader;

    .line 154
    .line 155
    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 156
    .line 157
    invoke-direct {v1, p1, v3, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    int-to-float v1, v1

    .line 176
    mul-float v8, v1, v2

    .line 177
    .line 178
    new-instance v3, Landroid/graphics/Canvas;

    .line 179
    .line 180
    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    int-to-float v6, v1

    .line 188
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    int-to-float v7, v1

    .line 193
    const/4 v4, 0x0

    .line 194
    const/4 v5, 0x0

    .line 195
    move v9, v8

    .line 196
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 197
    .line 198
    .line 199
    new-instance v1, Ld9/b;

    .line 200
    .line 201
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 202
    .line 203
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-direct {v1, v2, v3}, Ld9/b;-><init>(FLjava/lang/ref/WeakReference;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    move-object p2, v0

    .line 215
    :try_start_2
    new-instance v0, Lsf/f;

    .line 216
    .line 217
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_3
    instance-of p2, v0, Lsf/f;

    .line 221
    .line 222
    if-eqz p2, :cond_7

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_7
    move-object p1, v0

    .line 226
    :goto_4
    check-cast p1, Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 227
    .line 228
    monitor-exit p0

    .line 229
    return-object p1

    .line 230
    :goto_5
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 231
    throw p1
.end method

.method public static f(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

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
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v2, Landroid/widget/ImageView;

    .line 32
    .line 33
    const-class v3, Ljava/lang/String;

    .line 34
    .line 35
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public static g(Ljava/lang/reflect/Constructor;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x7

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    aget-object v0, p0, v2

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "com.tencent.mm.sdk.coroutines.LifecycleScope"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    aget-object v1, p0, v0

    .line 26
    .line 27
    const-class v3, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    aget-object v1, p0, v1

    .line 37
    .line 38
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    array-length v1, p0

    .line 47
    move v3, v2

    .line 48
    :goto_0
    if-ge v3, v1, :cond_1

    .line 49
    .line 50
    aget-object v4, p0, v3

    .line 51
    .line 52
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    return v0

    .line 61
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return v2
.end method


# virtual methods
.method public final varargs d([Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Ld9/m;->a:Lr8/g;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    new-instance v2, Lch/e;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lfh/k;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    array-length v4, p1

    .line 16
    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v2}, Lhh/o;->t()Z

    .line 53
    .line 54
    .line 55
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lhh/o;->p()Llh/d;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, v4}, Llh/d;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v2, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v2

    .line 78
    :try_start_3
    new-instance v3, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object v2, v3

    .line 84
    :goto_1
    nop

    .line 85
    instance-of v3, v2, Lsf/f;

    .line 86
    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    :cond_2
    check-cast v2, Ljava/lang/reflect/Executable;

    .line 91
    .line 92
    if-eqz v2, :cond_0

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_1
    move-exception p1

    .line 99
    new-instance v1, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-nez p1, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    iget-object v0, p0, Ld9/m;->b:Lab/b;

    .line 112
    .line 113
    const-string v1, "\u5b9a\u4f4d\u5934\u50cf\u5165\u53e3\u5931\u8d25"

    .line 114
    .line 115
    invoke-virtual {v0, v1, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 119
    .line 120
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 121
    .line 122
    return-object v1
.end method

.method public final e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ljava/lang/reflect/Method;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1
    iget-object v0, p0, Ld9/m;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_2
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 41
    .line 42
    invoke-virtual {v1, p1, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 43
    .line 44
    .line 45
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p2

    .line 49
    new-instance v1, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p2, v1

    .line 55
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance p2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v0, "\u81ea\u5b9a\u4e49\u597d\u53cb\u5934\u50cf Hook \u5b89\u88c5\u5931\u8d25: "

    .line 68
    .line 69
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p2, p0, Ld9/m;->b:Lab/b;

    .line 80
    .line 81
    invoke-virtual {p2, p1, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    .line 86
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    return p1
.end method

.method public final h()Ld9/i;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ld9/m;->a:Lr8/g;

    .line 4
    .line 5
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v3, "Hchat_custom_friend_avatar_method_cache"

    .line 8
    .line 9
    invoke-static {v2, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, v1, Lr8/g;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-static {v3, v1}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "|custom_friend_avatar_v1"

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "legacy_load"

    .line 28
    .line 29
    invoke-static {v2, v3, v1, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    invoke-static {v5}, Ld9/m;->f(Ljava/lang/reflect/Method;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v5, 0x0

    .line 43
    :goto_0
    const-string v7, "worker_constructor"

    .line 44
    .line 45
    invoke-static {v2, v3, v1, v7}, Le8/b;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    if-eqz v8, :cond_1

    .line 50
    .line 51
    invoke-static {v8}, Ld9/m;->g(Ljava/lang/reflect/Constructor;)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v8, 0x0

    .line 59
    :goto_1
    const-string v9, "worker_draw"

    .line 60
    .line 61
    const-string v10, "worker_modify"

    .line 62
    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    if-eqz v8, :cond_2

    .line 66
    .line 67
    invoke-static {v2, v3, v1, v10}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    invoke-static {v2, v3, v1, v9}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-eqz v12, :cond_2

    .line 90
    .line 91
    new-instance v2, Ld9/i;

    .line 92
    .line 93
    invoke-direct {v2, v5, v8, v11, v1}, Ld9/i;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 94
    .line 95
    .line 96
    return-object v2

    .line 97
    :cond_2
    const-string v1, "MicroMsg.AvatarDrawable"

    .line 98
    .line 99
    filled-new-array {v1}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Ld9/m;->d([Ljava/lang/String;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    new-instance v5, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_4

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    instance-of v11, v8, Ljava/lang/reflect/Method;

    .line 127
    .line 128
    if-eqz v11, :cond_3

    .line 129
    .line 130
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-eqz v8, :cond_6

    .line 148
    .line 149
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    move-object v11, v8

    .line 154
    check-cast v11, Ljava/lang/reflect/Method;

    .line 155
    .line 156
    invoke-static {v11}, Ld9/m;->f(Ljava/lang/reflect/Method;)Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_5

    .line 161
    .line 162
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    new-instance v5, Ljava/util/HashSet;

    .line 167
    .line 168
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 169
    .line 170
    .line 171
    new-instance v8, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    if-eqz v11, :cond_8

    .line 185
    .line 186
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    move-object v12, v11

    .line 191
    check-cast v12, Ljava/lang/reflect/Method;

    .line 192
    .line 193
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-virtual {v5, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-eqz v12, :cond_7

    .line 202
    .line 203
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    const-string v1, "workerScope"

    .line 208
    .line 209
    const-string v5, "username"

    .line 210
    .line 211
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v0, v1}, Ld9/m;->d([Ljava/lang/String;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    new-instance v5, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    :cond_9
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    if-eqz v12, :cond_a

    .line 233
    .line 234
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    instance-of v13, v12, Ljava/lang/reflect/Constructor;

    .line 239
    .line 240
    if-eqz v13, :cond_9

    .line 241
    .line 242
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_a
    new-instance v11, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    :cond_b
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    if-eqz v12, :cond_c

    .line 260
    .line 261
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    move-object v13, v12

    .line 266
    check-cast v13, Ljava/lang/reflect/Constructor;

    .line 267
    .line 268
    invoke-static {v13}, Ld9/m;->g(Ljava/lang/reflect/Constructor;)Z

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    if-eqz v13, :cond_b

    .line 273
    .line 274
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_c
    new-instance v5, Ljava/util/HashSet;

    .line 279
    .line 280
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 281
    .line 282
    .line 283
    new-instance v12, Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    :cond_d
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    if-eqz v13, :cond_e

    .line 297
    .line 298
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    move-object v14, v13

    .line 303
    check-cast v14, Ljava/lang/reflect/Constructor;

    .line 304
    .line 305
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    invoke-virtual {v5, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v14

    .line 313
    if-eqz v14, :cond_d

    .line 314
    .line 315
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_e
    invoke-static {v8}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    check-cast v5, Ljava/lang/reflect/Method;

    .line 324
    .line 325
    if-eqz v5, :cond_1a

    .line 326
    .line 327
    invoke-static {v12}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    check-cast v8, Ljava/lang/reflect/Constructor;

    .line 332
    .line 333
    if-eqz v8, :cond_1a

    .line 334
    .line 335
    new-instance v11, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    :cond_f
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    if-eqz v12, :cond_10

    .line 349
    .line 350
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    instance-of v13, v12, Ljava/lang/reflect/Method;

    .line 355
    .line 356
    if-eqz v13, :cond_f

    .line 357
    .line 358
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    goto :goto_8

    .line 362
    :cond_10
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    const/4 v12, 0x0

    .line 367
    const/4 v13, 0x0

    .line 368
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v14

    .line 372
    sget-object v15, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 373
    .line 374
    if-eqz v14, :cond_16

    .line 375
    .line 376
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v14

    .line 380
    move-object/from16 v16, v14

    .line 381
    .line 382
    check-cast v16, Ljava/lang/reflect/Method;

    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    const/16 v18, 0x0

    .line 394
    .line 395
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    move-result-object v11

    .line 399
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 400
    .line 401
    .line 402
    move-result v19

    .line 403
    invoke-static/range {v19 .. v19}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 404
    .line 405
    .line 406
    move-result v19

    .line 407
    const/16 v20, 0x1

    .line 408
    .line 409
    if-eqz v19, :cond_12

    .line 410
    .line 411
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-static {v0, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-eqz v0, :cond_12

    .line 420
    .line 421
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-static {v0, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_12

    .line 430
    .line 431
    array-length v0, v11

    .line 432
    move-object/from16 v16, v1

    .line 433
    .line 434
    const/16 v1, 0x8

    .line 435
    .line 436
    if-ne v0, v1, :cond_13

    .line 437
    .line 438
    aget-object v0, v11, v18

    .line 439
    .line 440
    invoke-static {v0, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-eqz v0, :cond_13

    .line 445
    .line 446
    aget-object v0, v11, v20

    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    const-string v1, "com.tencent.mm.sdk.coroutines.LifecycleScope"

    .line 453
    .line 454
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_13

    .line 459
    .line 460
    const/4 v0, 0x2

    .line 461
    aget-object v0, v11, v0

    .line 462
    .line 463
    const-class v1, Ljava/lang/String;

    .line 464
    .line 465
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_13

    .line 470
    .line 471
    const/4 v0, 0x3

    .line 472
    aget-object v0, v11, v0

    .line 473
    .line 474
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 475
    .line 476
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_13

    .line 481
    .line 482
    array-length v0, v11

    .line 483
    move/from16 v1, v18

    .line 484
    .line 485
    :goto_a
    if-ge v1, v0, :cond_13

    .line 486
    .line 487
    aget-object v6, v11, v1

    .line 488
    .line 489
    move/from16 v19, v0

    .line 490
    .line 491
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 492
    .line 493
    invoke-static {v6, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_11

    .line 498
    .line 499
    move/from16 v0, v20

    .line 500
    .line 501
    goto :goto_b

    .line 502
    :cond_11
    add-int/lit8 v1, v1, 0x1

    .line 503
    .line 504
    move/from16 v0, v19

    .line 505
    .line 506
    goto :goto_a

    .line 507
    :cond_12
    move-object/from16 v16, v1

    .line 508
    .line 509
    :cond_13
    move/from16 v0, v18

    .line 510
    .line 511
    :goto_b
    if-eqz v0, :cond_15

    .line 512
    .line 513
    if-eqz v12, :cond_14

    .line 514
    .line 515
    :goto_c
    move-object/from16 v13, v17

    .line 516
    .line 517
    goto :goto_d

    .line 518
    :cond_14
    move-object/from16 v0, p0

    .line 519
    .line 520
    move-object v13, v14

    .line 521
    move-object/from16 v1, v16

    .line 522
    .line 523
    move/from16 v12, v20

    .line 524
    .line 525
    goto/16 :goto_9

    .line 526
    .line 527
    :cond_15
    move-object/from16 v0, p0

    .line 528
    .line 529
    move-object/from16 v1, v16

    .line 530
    .line 531
    goto/16 :goto_9

    .line 532
    .line 533
    :cond_16
    const/16 v17, 0x0

    .line 534
    .line 535
    if-nez v12, :cond_17

    .line 536
    .line 537
    goto :goto_c

    .line 538
    :cond_17
    :goto_d
    check-cast v13, Ljava/lang/reflect/Method;

    .line 539
    .line 540
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    const-class v1, Landroid/graphics/Canvas;

    .line 545
    .line 546
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    const-string v6, "draw"

    .line 551
    .line 552
    invoke-static {v0, v6, v1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    if-eqz v0, :cond_1b

    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    invoke-static {v1, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_18

    .line 567
    .line 568
    goto :goto_e

    .line 569
    :cond_18
    move-object/from16 v0, v17

    .line 570
    .line 571
    :goto_e
    if-eqz v0, :cond_1b

    .line 572
    .line 573
    invoke-static {v2, v3, v4, v5}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 574
    .line 575
    .line 576
    invoke-static {v2, v3, v7, v8}, Le8/b;->i(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Constructor;)V

    .line 577
    .line 578
    .line 579
    if-eqz v13, :cond_19

    .line 580
    .line 581
    invoke-static {v2, v3, v10, v13}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 582
    .line 583
    .line 584
    :cond_19
    invoke-static {v2, v3, v9, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 585
    .line 586
    .line 587
    new-instance v1, Ld9/i;

    .line 588
    .line 589
    invoke-direct {v1, v5, v8, v13, v0}, Ld9/i;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 590
    .line 591
    .line 592
    return-object v1

    .line 593
    :cond_1a
    const/16 v17, 0x0

    .line 594
    .line 595
    :cond_1b
    return-object v17
.end method
