.class public final Lyl0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxl0;


# instance fields
.field public final a:Lgd3;

.field public final b:Ly8;

.field public final c:Ldq1;

.field public final d:Lcm0;

.field public final e:Lhh1;


# direct methods
.method public constructor <init>(Lgd3;Ly8;)V
    .locals 5

    .line 1
    sget-object v0, Lzl0;->a:Ldq1;

    .line 2
    .line 3
    new-instance v1, Lcm0;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lcm0;->a:Lbm0;

    .line 9
    .line 10
    sget-object v3, Ln90;->a:Lvr0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Lxe1;->f0(Ly10;La20;)La20;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Lzd0;->h:Lzd0;

    .line 20
    .line 21
    invoke-interface {v2, v3}, La20;->k(La20;)La20;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lmw2;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v3, v4}, Lm21;-><init>(Lk21;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, v3}, La20;->k(La20;)La20;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Lte;->e(La20;)Ls00;

    .line 36
    .line 37
    .line 38
    new-instance v2, Lhh1;

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    invoke-direct {v2, v3}, Lhh1;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lyl0;->a:Lgd3;

    .line 48
    .line 49
    iput-object p2, p0, Lyl0;->b:Ly8;

    .line 50
    .line 51
    iput-object v0, p0, Lyl0;->c:Ldq1;

    .line 52
    .line 53
    iput-object v1, p0, Lyl0;->d:Lcm0;

    .line 54
    .line 55
    iput-object v2, p0, Lyl0;->e:Lhh1;

    .line 56
    .line 57
    new-instance p1, Lv;

    .line 58
    .line 59
    const/16 p2, 0xa

    .line 60
    .line 61
    invoke-direct {p1, p2, p0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(Ll63;)Lm63;
    .locals 6

    .line 1
    iget-object v0, p0, Lyl0;->c:Ldq1;

    .line 2
    .line 3
    iget-object v1, v0, Ldq1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lix2;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Ldq1;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lxd1;

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Lxd1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lm63;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-boolean v3, v2, Lm63;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    monitor-exit v1

    .line 25
    return-object v2

    .line 26
    :cond_0
    :try_start_1
    iget-object v2, v0, Ldq1;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lxd1;

    .line 29
    .line 30
    iget-object v3, v2, Lxd1;->c:Li51;

    .line 31
    .line 32
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :try_start_2
    iget-object v4, v2, Lxd1;->b:Lvb1;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v4, v4, Lvb1;->a:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-virtual {v4, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    iget v5, v2, Lxd1;->d:I

    .line 47
    .line 48
    add-int/lit8 v5, v5, -0x1

    .line 49
    .line 50
    iput v5, v2, Lxd1;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    :try_start_3
    monitor-exit v3

    .line 56
    check-cast v4, Lm63;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    goto :goto_8

    .line 61
    :goto_1
    monitor-exit v3

    .line 62
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :cond_2
    :goto_2
    monitor-exit v1

    .line 64
    :try_start_4
    iget-object v1, p0, Lyl0;->d:Lcm0;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v1, p1, Ll63;->a:Lmx2;

    .line 70
    .line 71
    iget-object p0, p0, Lyl0;->e:Lhh1;

    .line 72
    .line 73
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Ly02;

    .line 76
    .line 77
    iget v2, p1, Ll63;->c:I

    .line 78
    .line 79
    iget-object v3, p1, Ll63;->b:Lim0;

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    instance-of v4, v1, Lo50;

    .line 84
    .line 85
    if-eqz v4, :cond_3

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    instance-of v4, v1, Lso0;

    .line 89
    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    check-cast v1, Lso0;

    .line 93
    .line 94
    invoke-interface {p0, v1, v3, v2}, Ly02;->h(Lso0;Lim0;I)Landroid/graphics/Typeface;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_4

    .line 99
    :cond_4
    const/4 p0, 0x0

    .line 100
    goto :goto_5

    .line 101
    :cond_5
    :goto_3
    invoke-interface {p0, v3, v2}, Ly02;->c(Lim0;I)Landroid/graphics/Typeface;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_4
    new-instance v1, Lm63;

    .line 106
    .line 107
    invoke-direct {v1, p0}, Lm63;-><init>(Landroid/graphics/Typeface;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 108
    .line 109
    .line 110
    move-object p0, v1

    .line 111
    :goto_5
    if-eqz p0, :cond_7

    .line 112
    .line 113
    iget-object v1, v0, Ldq1;->i:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, Lix2;

    .line 116
    .line 117
    monitor-enter v1

    .line 118
    :try_start_5
    iget-object v2, v0, Ldq1;->j:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lxd1;

    .line 121
    .line 122
    invoke-virtual {v2, p1}, Lxd1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-nez v2, :cond_6

    .line 127
    .line 128
    iget-boolean v2, p0, Lm63;->i:Z

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    iget-object v0, v0, Ldq1;->j:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Lxd1;

    .line 135
    .line 136
    invoke-virtual {v0, p1, p0}, Lxd1;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :catchall_2
    move-exception p0

    .line 141
    goto :goto_7

    .line 142
    :cond_6
    :goto_6
    monitor-exit v1

    .line 143
    return-object p0

    .line 144
    :goto_7
    monitor-exit v1

    .line 145
    throw p0

    .line 146
    :cond_7
    :try_start_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    const-string p1, "Could not load font"

    .line 149
    .line 150
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 154
    :catch_0
    move-exception p0

    .line 155
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 156
    .line 157
    const-string v0, "Could not load font"

    .line 158
    .line 159
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    throw p1

    .line 163
    :goto_8
    monitor-exit v1

    .line 164
    throw p0
.end method

.method public final b(Lmx2;Lim0;II)Lm63;
    .locals 6

    .line 1
    new-instance v0, Ll63;

    .line 2
    .line 3
    iget-object v1, p0, Lyl0;->b:Ly8;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v1, Ly8;->h:I

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
    iget p2, p2, Lim0;->h:I

    .line 19
    .line 20
    add-int/2addr p2, v1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x3e8

    .line 23
    .line 24
    invoke-static {p2, v1, v2}, Lci0;->D(III)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    new-instance v1, Lim0;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Lim0;-><init>(I)V

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
    iget-object p2, p0, Lyl0;->a:Lgd3;

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
    invoke-direct/range {v0 .. v5}, Ll63;-><init>(Lmx2;Lim0;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lyl0;->a(Ll63;)Lm63;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
