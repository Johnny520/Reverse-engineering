.class public final Lkv;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljv;


# instance fields
.field public final a:Lr3;

.field public final b:Lp5;

.field public final c:Ld;

.field public final d:Lov;

.field public final e:Lx1;


# direct methods
.method public constructor <init>(Lr3;Lp5;)V
    .locals 5

    .line 1
    sget-object v0, Llv;->a:Ld;

    .line 2
    .line 3
    new-instance v1, Lov;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lov;->a:Lnv;

    .line 9
    .line 10
    sget-object v3, Lho;->a:Lhy;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Lpf1;->J(Lnk;Lpk;)Lpk;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Lfs;->d:Lfs;

    .line 20
    .line 21
    invoke-interface {v2, v3}, Lpk;->h(Lpk;)Lpk;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Ld51;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-direct {v3, v4}, Le40;-><init>(Lc40;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, v3}, Lpk;->h(Lpk;)Lpk;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Lp30;->e(Lpk;)Lhk;

    .line 36
    .line 37
    .line 38
    new-instance v2, Lx1;

    .line 39
    .line 40
    const/16 v3, 0x12

    .line 41
    .line 42
    invoke-direct {v2, v3}, Lx1;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lkv;->a:Lr3;

    .line 49
    .line 50
    iput-object p2, p0, Lkv;->b:Lp5;

    .line 51
    .line 52
    iput-object v0, p0, Lkv;->c:Ld;

    .line 53
    .line 54
    iput-object v1, p0, Lkv;->d:Lov;

    .line 55
    .line 56
    iput-object v2, p0, Lkv;->e:Lx1;

    .line 57
    .line 58
    new-instance p1, Lo;

    .line 59
    .line 60
    const/4 p2, 0x5

    .line 61
    invoke-direct {p1, p2, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(Laa1;)Lba1;
    .locals 6

    .line 1
    iget-object v0, p0, Lkv;->c:Ld;

    .line 2
    .line 3
    iget-object v1, v0, Ld;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljo0;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Ld;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lfc0;

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Lfc0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lba1;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-boolean v3, v2, Lba1;->e:Z
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
    iget-object v2, v0, Ld;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lfc0;

    .line 29
    .line 30
    iget-object v3, v2, Lfc0;->c:Lr3;

    .line 31
    .line 32
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :try_start_2
    iget-object v4, v2, Lfc0;->b:Lx1;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v4, v4, Lx1;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-virtual {v4, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    iget v5, v2, Lfc0;->d:I

    .line 49
    .line 50
    add-int/lit8 v5, v5, -0x1

    .line 51
    .line 52
    iput v5, v2, Lfc0;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    :try_start_3
    monitor-exit v3

    .line 58
    check-cast v4, Lba1;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    goto :goto_7

    .line 63
    :goto_1
    monitor-exit v3

    .line 64
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    :cond_2
    :goto_2
    monitor-exit v1

    .line 66
    :try_start_4
    iget-object v1, p0, Lkv;->d:Lov;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v1, p1, Laa1;->a:Lz51;

    .line 72
    .line 73
    iget-object p0, p0, Lkv;->e:Lx1;

    .line 74
    .line 75
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 76
    .line 77
    iget p0, p1, Laa1;->c:I

    .line 78
    .line 79
    iget-object v2, p1, Laa1;->b:Lzv;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    instance-of v4, v1, Lwl;

    .line 85
    .line 86
    if-eqz v4, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    instance-of v4, v1, Lmx;

    .line 90
    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    check-cast v1, Lmx;

    .line 94
    .line 95
    iget-object v1, v1, Lmx;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v1, v2, p0}, Ljo0;->n(Ljava/lang/String;Lzv;I)Landroid/graphics/Typeface;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    goto :goto_4

    .line 102
    :cond_4
    :goto_3
    invoke-static {v3, v2, p0}, Ljo0;->n(Ljava/lang/String;Lzv;I)Landroid/graphics/Typeface;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_4
    new-instance v3, Lba1;

    .line 107
    .line 108
    invoke-direct {v3, p0}, Lba1;-><init>(Landroid/graphics/Typeface;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 109
    .line 110
    .line 111
    :cond_5
    if-eqz v3, :cond_7

    .line 112
    .line 113
    iget-object p0, v0, Ld;->e:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Ljo0;

    .line 116
    .line 117
    monitor-enter p0

    .line 118
    :try_start_5
    iget-object v1, v0, Ld;->f:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Lfc0;

    .line 121
    .line 122
    invoke-virtual {v1, p1}, Lfc0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-nez v1, :cond_6

    .line 127
    .line 128
    iget-boolean v1, v3, Lba1;->e:Z

    .line 129
    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    iget-object v0, v0, Ld;->f:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Lfc0;

    .line 135
    .line 136
    invoke-virtual {v0, p1, v3}, Lfc0;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :catchall_2
    move-exception p1

    .line 141
    goto :goto_6

    .line 142
    :cond_6
    :goto_5
    monitor-exit p0

    .line 143
    return-object v3

    .line 144
    :goto_6
    monitor-exit p0

    .line 145
    throw p1

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
    :goto_7
    monitor-exit v1

    .line 164
    throw p0
.end method

.method public final b(Lz51;Lzv;II)Lba1;
    .locals 6

    .line 1
    new-instance v0, Laa1;

    .line 2
    .line 3
    iget-object v1, p0, Lkv;->b:Lp5;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v1, Lp5;->d:I

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
    iget p2, p2, Lzv;->d:I

    .line 19
    .line 20
    add-int/2addr p2, v1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x3e8

    .line 23
    .line 24
    invoke-static {p2, v1, v2}, Lw60;->n(III)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    new-instance v1, Lzv;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Lzv;-><init>(I)V

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
    iget-object p2, p0, Lkv;->a:Lr3;

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
    invoke-direct/range {v0 .. v5}, Laa1;-><init>(Lz51;Lzv;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lkv;->a(Laa1;)Lba1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
