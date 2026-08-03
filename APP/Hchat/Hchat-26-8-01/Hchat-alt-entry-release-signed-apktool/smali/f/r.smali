.class public final Lf/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lf/r;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lf/r;->b:I

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Landroidx/lifecycle/e0;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p1, v0}, Landroidx/lifecycle/e0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lf/r;->f:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p1, La2/a;

    .line 20
    .line 21
    const/16 v0, 0xc

    .line 22
    .line 23
    invoke-direct {p1, v0}, La2/a;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lf/r;->g:Ljava/lang/Object;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string p1, "maxSize <= 0"

    .line 30
    .line 31
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    throw p1
.end method

.method public constructor <init>(Lac/k;Lac/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf/r;->a:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lf/r;->f:Ljava/lang/Object;

    .line 38
    iput-object p2, p0, Lf/r;->g:Ljava/lang/Object;

    return-void
.end method

.method public static c(Lac/k;Lac/k;Z)Lnc/b;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_2

    .line 3
    .line 4
    invoke-virtual {p0}, Lac/k;->K()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p2, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq p2, v1, :cond_1

    .line 13
    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Laf/d;

    .line 19
    .line 20
    const-string p1, "Unknown annotation visibility value: "

    .line 21
    .line 22
    invoke-static {p2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    move v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    move v1, v0

    .line 33
    :cond_3
    :goto_0
    invoke-static {p0}, La/a;->H0(Lac/k;)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p0}, La/a;->H0(Lac/k;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 44
    .line 45
    .line 46
    :goto_1
    if-ge v0, v2, :cond_4

    .line 47
    .line 48
    invoke-static {p0}, La/a;->H0(Lac/k;)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {p1, v4}, Lac/k;->v(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {p0, p1}, La7/a;->N(Lac/k;Lac/k;)Lnc/a;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {p1, p2}, Lac/k;->y(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance p1, Lnc/b;

    .line 71
    .line 72
    invoke-direct {p1, v1, p0, v3}, Lnc/b;-><init>(ILjava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 73
    .line 74
    .line 75
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lf/r;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/a;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lf/r;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroidx/lifecycle/e0;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget v1, p0, Lf/r;->d:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    iput v1, p0, Lf/r;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-object p1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    :try_start_1
    iget p1, p0, Lf/r;->e:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    iput p1, p0, Lf/r;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    monitor-exit v0

    .line 38
    const/4 p1, 0x0

    .line 39
    return-object p1

    .line 40
    :goto_0
    monitor-exit v0

    .line 41
    throw p1
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf/r;->g:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La2/a;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget v1, p0, Lf/r;->c:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    iput v1, p0, Lf/r;->c:I

    .line 14
    .line 15
    iget-object v1, p0, Lf/r;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroidx/lifecycle/e0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget p2, p0, Lf/r;->c:I

    .line 31
    .line 32
    add-int/lit8 p2, p2, -0x1

    .line 33
    .line 34
    iput p2, p0, Lf/r;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    iget p2, p0, Lf/r;->b:I

    .line 42
    .line 43
    :goto_1
    iget-object v0, p0, Lf/r;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La2/a;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_1
    iget v1, p0, Lf/r;->c:I

    .line 49
    .line 50
    if-ltz v1, :cond_5

    .line 51
    .line 52
    iget-object v1, p0, Lf/r;->f:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Landroidx/lifecycle/e0;

    .line 55
    .line 56
    iget-object v1, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    iget v1, p0, Lf/r;->c:I

    .line 65
    .line 66
    if-nez v1, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_1
    move-exception p1

    .line 70
    goto :goto_4

    .line 71
    :cond_1
    :goto_2
    iget v1, p0, Lf/r;->c:I

    .line 72
    .line 73
    if-le v1, p2, :cond_4

    .line 74
    .line 75
    iget-object v1, p0, Lf/r;->f:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Landroidx/lifecycle/e0;

    .line 78
    .line 79
    iget-object v1, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_2
    iget-object v1, p0, Lf/r;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroidx/lifecycle/e0;

    .line 91
    .line 92
    iget-object v1, v1, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast v1, Ljava/lang/Iterable;

    .line 102
    .line 103
    invoke-static {v1}, Ltf/m;->u1(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/util/Map$Entry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    if-nez v1, :cond_3

    .line 110
    .line 111
    monitor-exit v0

    .line 112
    return-object p1

    .line 113
    :cond_3
    :try_start_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iget-object v3, p0, Lf/r;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, Landroidx/lifecycle/e0;

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v3, v3, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    iget v2, p0, Lf/r;->c:I

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    add-int/lit8 v2, v2, -0x1

    .line 142
    .line 143
    iput v2, p0, Lf/r;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 144
    .line 145
    monitor-exit v0

    .line 146
    goto :goto_1

    .line 147
    :cond_4
    :goto_3
    monitor-exit v0

    .line 148
    return-object p1

    .line 149
    :cond_5
    :try_start_3
    const-string p1, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 150
    .line 151
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 157
    :goto_4
    monitor-exit v0

    .line 158
    throw p1

    .line 159
    :goto_5
    monitor-exit v0

    .line 160
    throw p1
.end method

.method public d(I)Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, Lf/r;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lac/k;

    .line 4
    .line 5
    iget-object v1, v0, Lac/k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lac/k;->a(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x0

    .line 36
    :goto_0
    if-ge v4, p1, :cond_2

    .line 37
    .line 38
    mul-int/lit8 v5, v4, 0x4

    .line 39
    .line 40
    add-int/2addr v5, v3

    .line 41
    invoke-virtual {v0, v5}, Lac/k;->a(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v0, v5}, Lac/k;->a(I)V

    .line 49
    .line 50
    .line 51
    iget-object v5, p0, Lf/r;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, Lac/k;

    .line 54
    .line 55
    const/4 v6, 0x1

    .line 56
    invoke-static {v0, v5, v6}, Lf/r;->c(Lac/k;Lac/k;Z)Lnc/b;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object v2
.end method

.method public e(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf/r;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lac/k;

    .line 4
    .line 5
    iget-object v1, v0, Lac/k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput p1, p0, Lf/r;->b:I

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lf/r;->c:I

    .line 15
    .line 16
    iput p1, p0, Lf/r;->d:I

    .line 17
    .line 18
    iput p1, p0, Lf/r;->e:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iput p1, v0, Lac/k;->h:I

    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    invoke-virtual {v0, p1}, Lac/k;->B(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lf/r;->c:I

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lf/r;->d:I

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Lf/r;->e:I

    .line 44
    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lf/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "LruCache[maxSize="

    .line 12
    .line 13
    iget-object v1, p0, Lf/r;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La2/a;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget v2, p0, Lf/r;->d:I

    .line 19
    .line 20
    iget v3, p0, Lf/r;->e:I

    .line 21
    .line 22
    add-int/2addr v3, v2

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v2, v2, 0x64

    .line 26
    .line 27
    div-int/2addr v2, v3

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lf/r;->b:I

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ",hits="

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v0, p0, Lf/r;->d:I

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ",misses="

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget v0, p0, Lf/r;->e:I

    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, ",hitRate="

    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, "%]"

    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    monitor-exit v1

    .line 80
    return-object v0

    .line 81
    :goto_1
    monitor-exit v1

    .line 82
    throw v0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
