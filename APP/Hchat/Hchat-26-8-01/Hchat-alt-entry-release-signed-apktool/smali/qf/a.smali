.class public final Lqf/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lnf/a;


# instance fields
.field public final a:Lqf/b;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(Lqf/b;Ljava/lang/String;IIIJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqf/a;->a:Lqf/b;

    .line 5
    .line 6
    iput-object p2, p0, Lqf/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lqf/a;->d:I

    .line 9
    .line 10
    iput p4, p0, Lqf/a;->e:I

    .line 11
    .line 12
    iput p5, p0, Lqf/a;->c:I

    .line 13
    .line 14
    iput-wide p6, p0, Lqf/a;->f:J

    .line 15
    .line 16
    iput-wide p8, p0, Lqf/a;->g:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final b()Ljava/io/InputStream;
    .locals 6

    .line 1
    iget-object v0, p0, Lqf/a;->a:Lqf/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, v0, Lqf/b;->k:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lqf/b;->l(Lqf/a;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_2

    .line 14
    :cond_0
    :goto_0
    iget v1, p0, Lqf/a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    iget-object v2, v0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    iget v3, p0, Lqf/a;->e:I

    .line 19
    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-ne v1, v4, :cond_1

    .line 23
    .line 24
    :try_start_1
    iget-wide v4, p0, Lqf/a;->f:J

    .line 25
    .line 26
    long-to-int v1, v4

    .line 27
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    new-instance v1, Lpf/a;

    .line 44
    .line 45
    invoke-direct {v1, v2}, Lpf/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Ljava/util/zip/Inflater;

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    invoke-direct {v2, v3}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Ljava/util/zip/InflaterInputStream;

    .line 55
    .line 56
    const/16 v4, 0x1000

    .line 57
    .line 58
    invoke-direct {v3, v1, v2, v4}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception v1

    .line 63
    :try_start_2
    invoke-virtual {v0, p0, v1}, Lqf/b;->a(Lqf/a;Ljava/lang/Exception;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Lqf/b;->k(Lqf/a;)Lnf/a;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v1}, Lnf/a;->b()Ljava/io/InputStream;

    .line 71
    .line 72
    .line 73
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    monitor-exit v0

    .line 75
    return-object v1

    .line 76
    :cond_1
    :try_start_3
    iget-wide v4, p0, Lqf/a;->g:J

    .line 77
    .line 78
    long-to-int v1, v4

    .line 79
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    new-instance v3, Lpf/a;

    .line 96
    .line 97
    invoke-direct {v3, v2}, Lpf/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    iget-boolean v1, v0, Lqf/b;->l:Z

    .line 101
    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    new-instance v1, Lpf/b;

    .line 105
    .line 106
    iget-wide v4, p0, Lqf/a;->g:J

    .line 107
    .line 108
    invoke-direct {v1, v3, v4, v5}, Lpf/b;-><init>(Ljava/io/InputStream;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 109
    .line 110
    .line 111
    monitor-exit v0

    .line 112
    return-object v1

    .line 113
    :cond_2
    monitor-exit v0

    .line 114
    return-object v3

    .line 115
    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 116
    throw v1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lqf/a;->g:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lqf/a;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getBytes()[B
    .locals 5

    .line 1
    iget-object v0, p0, Lqf/a;->a:Lqf/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, v0, Lqf/b;->k:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lqf/b;->l(Lqf/a;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    iget v1, p0, Lqf/a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    iget-object v2, v0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    :try_start_1
    invoke-static {v2, p0}, Li3/a;->a(Ljava/nio/ByteBuffer;Lqf/a;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    monitor-exit v0

    .line 27
    return-object v1

    .line 28
    :catch_0
    move-exception v1

    .line 29
    :try_start_2
    invoke-virtual {v0, p0, v1}, Lqf/b;->a(Lqf/a;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lqf/b;->k(Lqf/a;)Lnf/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Lnf/a;->getBytes()[B

    .line 37
    .line 38
    .line 39
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    monitor-exit v0

    .line 41
    return-object v1

    .line 42
    :cond_1
    :try_start_3
    iget v1, p0, Lqf/a;->e:I

    .line 43
    .line 44
    iget-wide v3, p0, Lqf/a;->g:J

    .line 45
    .line 46
    long-to-int v3, v3

    .line 47
    new-array v3, v3, [B

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-object v3

    .line 60
    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 61
    throw v1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isDirectory()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lqf/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lqf/a;->a:Lqf/b;

    .line 2
    .line 3
    iget-object v0, v0, Lqf/b;->g:Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lqf/a;->b:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, ":"

    .line 12
    .line 13
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
