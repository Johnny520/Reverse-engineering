.class public final Lxz0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg92;


# instance fields
.field public final a:Lwk;

.field public final b:Ljava/util/ArrayList;

.field public final c:Z

.field public final d:Ltd1;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;ZLtd1;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwk;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lwk;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxz0;->a:Lwk;

    .line 11
    .line 12
    iput-object p1, p0, Lxz0;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-boolean p2, p0, Lxz0;->c:Z

    .line 15
    .line 16
    iput-object p3, p0, Lxz0;->d:Ltd1;

    .line 17
    .line 18
    iput-boolean p4, p0, Lxz0;->e:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILov1;)Ld92;
    .locals 11

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    iget-boolean v0, p0, Lxz0;->e:Z

    .line 4
    .line 5
    iget-boolean v1, p0, Lxz0;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    iget-object v0, p0, Lxz0;->d:Ltd1;

    .line 10
    .line 11
    if-eqz v0, :cond_8

    .line 12
    .line 13
    sget-object v2, Llo;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :cond_0
    const/4 v5, 0x0

    .line 23
    :try_start_0
    const-class v6, [B

    .line 24
    .line 25
    const/16 v7, 0x4000

    .line 26
    .line 27
    invoke-virtual {v0, v7, v6}, Ltd1;->c(ILjava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    move v8, v3

    .line 34
    :goto_0
    if-ge v8, v7, :cond_2

    .line 35
    .line 36
    rsub-int v9, v8, 0x4000

    .line 37
    .line 38
    :try_start_1
    invoke-virtual {p1, v6, v8, v9}, Ljava/io/InputStream;->read([BII)I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    const/4 v10, -0x1

    .line 43
    if-ne v9, v10, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/2addr v8, v9

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    move-object v5, v6

    .line 50
    goto :goto_5

    .line 51
    :cond_2
    :goto_1
    if-nez v8, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0, v6}, Ltd1;->g(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    add-int/2addr v4, v8

    .line 61
    if-ge v8, v7, :cond_0

    .line 62
    .line 63
    :goto_2
    if-eqz v1, :cond_4

    .line 64
    .line 65
    :try_start_2
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_3

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    goto :goto_5

    .line 72
    :cond_4
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_5

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, [B

    .line 91
    .line 92
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-virtual {p1, v6, v3, v8}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    .line 99
    sub-int/2addr v4, v8

    .line 100
    invoke-virtual {v0, v6}, Ltd1;->g(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    .line 106
    .line 107
    :try_start_3
    invoke-static {p1}, Llo;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 111
    goto :goto_7

    .line 112
    :catchall_2
    move-exception p0

    .line 113
    const/4 v3, 0x1

    .line 114
    :goto_5
    if-nez v3, :cond_7

    .line 115
    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    invoke-virtual {v0, v5}, Ltd1;->g(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_7

    .line 130
    .line 131
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    check-cast p2, [B

    .line 136
    .line 137
    invoke-virtual {v0, p2}, Ltd1;->g(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_7
    throw p0

    .line 142
    :cond_8
    invoke-static {p1, v1}, Llo;->b(Ljava/io/InputStream;Z)Ljava/nio/ByteBuffer;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    :goto_7
    invoke-static {p1}, La4;->f(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object p0, p0, Lxz0;->a:Lwk;

    .line 151
    .line 152
    invoke-virtual {p0, p1, p2, p3, p4}, Lwk;->c(Landroid/graphics/ImageDecoder$Source;IILov1;)Lal;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0
.end method

.method public final b(Ljava/lang/Object;Lov1;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    iget-boolean p2, p0, Lxz0;->e:Z

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p2, p0, Lxz0;->d:Ltd1;

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    iget-object p0, p0, Lxz0;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {p0, p1, p2}, Lse;->I(Ljava/util/List;Ljava/io/InputStream;Ltd1;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 20
    .line 21
    if-eq p0, p1, :cond_2

    .line 22
    .line 23
    :goto_0
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method
