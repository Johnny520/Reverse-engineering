.class public final Lbc/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final s:Lmh/b;


# instance fields
.field public final g:Lbc/g;

.field public final h:Lte/a;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lm/a;

.field public k:Lud/u;

.field public l:Ljava/util/ArrayList;

.field public final m:Lbc/q;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/ArrayList;

.field public final p:Ljava/util/HashMap;

.field public final q:Ljava/util/ArrayList;

.field public final r:Lue/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbc/k;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbc/k;->s:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lbc/g;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbc/k;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lxe/f;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lbc/k;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lbc/k;->o:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v0, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lbc/k;->p:Ljava/util/HashMap;

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lbc/k;->q:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance v0, Lue/a;

    .line 42
    .line 43
    invoke-direct {v0}, Lue/a;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lbc/k;->r:Lue/a;

    .line 47
    .line 48
    iput-object p1, p0, Lbc/k;->g:Lbc/g;

    .line 49
    .line 50
    new-instance v0, Lte/a;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lte/a;-><init>(Lbc/k;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lbc/k;->h:Lte/a;

    .line 56
    .line 57
    new-instance v0, Lbc/q;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Lbc/q;-><init>(Lbc/k;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lbc/k;->m:Lbc/q;

    .line 63
    .line 64
    new-instance v0, Lm/a;

    .line 65
    .line 66
    iget-object p1, p1, Lbc/g;->K:Lad/c;

    .line 67
    .line 68
    new-instance v1, Lb/e;

    .line 69
    .line 70
    const-class v2, Lnf/d;

    .line 71
    .line 72
    invoke-static {v2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/16 v3, 0x1d

    .line 77
    .line 78
    invoke-direct {v1, p1, v3, v2}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x7

    .line 82
    invoke-direct {v0, v1, p1}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lbc/k;->j:Lm/a;

    .line 86
    .line 87
    return-void
.end method

.method public static a(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :catch_0
    move-exception v2

    .line 24
    :try_start_2
    sget-object v3, Lbc/k;->s:Lmh/b;

    .line 25
    .line 26
    const-string v4, "Fail to close \'{}\'"

    .line 27
    .line 28
    invoke-interface {v3, v1, v4, v2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 37
    .line 38
    .line 39
    throw v0
.end method


# virtual methods
.method public final declared-synchronized b(Lud/e;)Lbc/l;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, Lud/e;->E:Lbc/l;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Lud/e;->d0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lbc/l;

    .line 13
    .line 14
    iget-object v1, p1, Lud/e;->x:Lud/e;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lbc/k;->b(Lud/e;)Lbc/l;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, p1, v1}, Lbc/l;-><init>(Lud/e;Lbc/l;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance v0, Lbc/l;

    .line 27
    .line 28
    invoke-direct {v0, p1, p0}, Lbc/l;-><init>(Lud/e;Lbc/k;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iput-object v0, p1, Lud/e;->E:Lbc/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    :cond_1
    monitor-exit p0

    .line 34
    return-object v0

    .line 35
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p1
.end method

.method public final declared-synchronized c(Lud/r;)Lbc/n;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, Lud/r;->I:Lbc/n;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lbc/n;

    .line 7
    .line 8
    iget-object v1, p1, Lud/r;->l:Lud/e;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lbc/k;->b(Lud/e;)Lbc/l;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Lbc/n;-><init>(Lud/r;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p1, Lud/r;->I:Lbc/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit p0

    .line 22
    return-object v0

    .line 23
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method

.method public final close()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lbc/k;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbc/k;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {v0}, Lbc/k;->a(Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lbc/k;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v0}, Lbc/k;->a(Ljava/util/ArrayList;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lbc/k;->o:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {v0}, Lbc/k;->a(Ljava/util/ArrayList;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lbc/k;->q:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {v0}, Lbc/k;->a(Ljava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lbc/k;->g:Lbc/g;

    .line 25
    .line 26
    iget-object v1, v0, Lbc/g;->J:Lve/b;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string v1, "tmp"

    .line 32
    .line 33
    sget-object v2, Lve/a;->a:Ljava/nio/file/Path;

    .line 34
    .line 35
    invoke-interface {v2, v1}, Ljava/nio/file/Path;->resolve(Ljava/lang/String;)Ljava/nio/file/Path;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, Lbf/b;->a:Lmh/b;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lbf/b;->c(Ljava/io/File;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    const/4 v2, 0x0

    .line 51
    new-array v3, v2, [Ljava/nio/file/LinkOption;

    .line 52
    .line 53
    invoke-static {v1, v3}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    :try_start_0
    invoke-static {v1, v2}, Lbf/b;->b(Ljava/nio/file/Path;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception v3

    .line 64
    sget-object v4, Lbf/b;->a:Lmh/b;

    .line 65
    .line 66
    const-string v5, "Failed to delete dir: {}"

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/nio/file/Path;->toAbsolutePath()Ljava/nio/file/Path;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v4, v1, v5, v3}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lbc/g;->close()V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lbf/b;->b:Ljava/nio/file/Path;

    .line 79
    .line 80
    new-array v1, v2, [Ljava/nio/file/LinkOption;

    .line 81
    .line 82
    invoke-static {v0, v1}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    sget-object v0, Lbf/b;->b:Ljava/nio/file/Path;

    .line 89
    .line 90
    const/4 v1, 0x1

    .line 91
    :try_start_1
    invoke-static {v0, v1}, Lbf/b;->b(Ljava/nio/file/Path;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catch_1
    move-exception v1

    .line 96
    new-instance v2, Laf/g;

    .line 97
    .line 98
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v3, "Failed to clear directory "

    .line 103
    .line 104
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw v2

    .line 112
    :cond_2
    :goto_1
    return-void
.end method

.method public final e()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lbc/k;->g()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lbc/h;->a:Lmh/b;

    .line 7
    .line 8
    iget-object v2, v1, Lbc/k;->g:Lbc/g;

    .line 9
    .line 10
    iget-object v3, v2, Lbc/g;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    iget-object v4, v1, Lbc/k;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Laf/d;

    .line 28
    .line 29
    const-string v2, "Please specify input file"

    .line 30
    .line 31
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/io/File;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance v0, Laf/d;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, "File not found "

    .line 65
    .line 66
    invoke-static {v3, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_3
    iget-object v3, v2, Lbc/g;->h:Ljava/io/File;

    .line 75
    .line 76
    iget-object v4, v2, Lbc/g;->i:Ljava/io/File;

    .line 77
    .line 78
    iget-object v5, v2, Lbc/g;->j:Ljava/io/File;

    .line 79
    .line 80
    const/16 v6, 0x2e

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    if-nez v3, :cond_8

    .line 84
    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    move-object v8, v4

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    if-eqz v5, :cond_5

    .line 90
    .line 91
    move-object v8, v5

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    iget-object v3, v2, Lbc/g;->g:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_6

    .line 100
    .line 101
    const-string v3, "jadx-output"

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_6
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ljava/io/File;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    const/4 v9, -0x1

    .line 119
    if-eq v8, v9, :cond_7

    .line 120
    .line 121
    invoke-virtual {v3, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    goto :goto_2

    .line 126
    :cond_7
    const-string v8, "-jadx-output"

    .line 127
    .line 128
    invoke-virtual {v3, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    :goto_2
    const-string v8, "output directory: {}"

    .line 133
    .line 134
    invoke-interface {v0, v3, v8}, Lmh/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v8, Ljava/io/File;

    .line 138
    .line 139
    invoke-direct {v8, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :goto_3
    iput-object v8, v2, Lbc/g;->h:Ljava/io/File;

    .line 143
    .line 144
    :cond_8
    if-nez v4, :cond_9

    .line 145
    .line 146
    new-instance v3, Ljava/io/File;

    .line 147
    .line 148
    iget-object v4, v2, Lbc/g;->h:Ljava/io/File;

    .line 149
    .line 150
    const-string v8, "sources"

    .line 151
    .line 152
    invoke-direct {v3, v4, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iput-object v3, v2, Lbc/g;->i:Ljava/io/File;

    .line 156
    .line 157
    :cond_9
    if-nez v5, :cond_a

    .line 158
    .line 159
    new-instance v3, Ljava/io/File;

    .line 160
    .line 161
    iget-object v4, v2, Lbc/g;->h:Ljava/io/File;

    .line 162
    .line 163
    const-string v5, "resources"

    .line 164
    .line 165
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iput-object v3, v2, Lbc/g;->j:Ljava/io/File;

    .line 169
    .line 170
    :cond_a
    iget-object v3, v2, Lbc/g;->h:Ljava/io/File;

    .line 171
    .line 172
    const-string v4, "Output"

    .line 173
    .line 174
    invoke-static {v3, v4}, Lbc/h;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iget-object v3, v2, Lbc/g;->i:Ljava/io/File;

    .line 178
    .line 179
    const-string v4, "Source output"

    .line 180
    .line 181
    invoke-static {v3, v4}, Lbc/h;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iget-object v3, v2, Lbc/g;->j:Ljava/io/File;

    .line 185
    .line 186
    const-string v4, "Resources output"

    .line 187
    .line 188
    invoke-static {v3, v4}, Lbc/h;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Lmh/b;->d()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_b

    .line 196
    .line 197
    const-string v3, "Effective jadx args: {}"

    .line 198
    .line 199
    invoke-interface {v0, v2, v3}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_b
    sget-object v0, Lbc/k;->s:Lmh/b;

    .line 203
    .line 204
    invoke-interface {v0}, Lmh/b;->b()V

    .line 205
    .line 206
    .line 207
    iget-object v0, v1, Lbc/k;->g:Lbc/g;

    .line 208
    .line 209
    iget-object v0, v0, Lbc/g;->J:Lve/b;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    const-string v0, "tmp"

    .line 215
    .line 216
    sget-object v2, Lve/a;->a:Ljava/nio/file/Path;

    .line 217
    .line 218
    invoke-interface {v2, v0}, Ljava/nio/file/Path;->resolve(Ljava/lang/String;)Ljava/nio/file/Path;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    sget-object v2, Lbf/b;->a:Lmh/b;

    .line 223
    .line 224
    if-eqz v0, :cond_c

    .line 225
    .line 226
    invoke-interface {v0}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {v2}, Lbf/b;->c(Ljava/io/File;)V

    .line 231
    .line 232
    .line 233
    :cond_c
    const-class v2, Lbf/b;

    .line 234
    .line 235
    monitor-enter v2

    .line 236
    if-eqz v0, :cond_d

    .line 237
    .line 238
    :try_start_0
    invoke-interface {v0}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v3}, Lbf/b;->c(Ljava/io/File;)V

    .line 243
    .line 244
    .line 245
    :cond_d
    const-string v3, "jadx-instance-"

    .line 246
    .line 247
    new-array v4, v7, [Ljava/nio/file/attribute/FileAttribute;

    .line 248
    .line 249
    invoke-static {v0, v3, v4}, Ljava/nio/file/Files;->createTempDirectory(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    sput-object v0, Lbf/b;->b:Ljava/nio/file/Path;

    .line 254
    .line 255
    invoke-interface {v0}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 260
    .line 261
    .line 262
    monitor-exit v2

    .line 263
    iget-object v0, v1, Lbc/k;->h:Lte/a;

    .line 264
    .line 265
    const-string v2, "java-input"

    .line 266
    .line 267
    iget-object v3, v1, Lbc/k;->g:Lbc/g;

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    const-string v3, "java-input"

    .line 273
    .line 274
    iget-object v0, v0, Lte/a;->e:Ljava/util/TreeMap;

    .line 275
    .line 276
    invoke-virtual {v0, v2, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    iget-object v3, v1, Lbc/k;->h:Lte/a;

    .line 280
    .line 281
    iget-object v0, v1, Lbc/k;->g:Lbc/g;

    .line 282
    .line 283
    iget-object v0, v0, Lbc/g;->O:Luc/b;

    .line 284
    .line 285
    iget-object v2, v3, Lte/a;->c:Ljava/util/TreeSet;

    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/util/TreeSet;->clear()V

    .line 288
    .line 289
    .line 290
    new-instance v2, Lwe/a;

    .line 291
    .line 292
    invoke-static {}, Ldd/a;->b()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    const-string v4, "r"

    .line 297
    .line 298
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    const-string v4, "dev"

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    invoke-interface {v0}, Luc/b;->j()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    const/16 v4, 0x14

    .line 319
    .line 320
    if-eqz v2, :cond_10

    .line 321
    .line 322
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    check-cast v2, Lff/c;

    .line 327
    .line 328
    new-instance v5, Lte/b;

    .line 329
    .line 330
    iget-object v8, v3, Lte/a;->a:Lbc/k;

    .line 331
    .line 332
    invoke-direct {v5, v8, v2}, Lte/b;-><init>(Lbc/k;Lff/c;)V

    .line 333
    .line 334
    .line 335
    iget-object v2, v3, Lte/a;->b:Ljava/util/HashSet;

    .line 336
    .line 337
    invoke-virtual {v5}, Lte/b;->a()V

    .line 338
    .line 339
    .line 340
    const-string v8, "dex-input"

    .line 341
    .line 342
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-eqz v2, :cond_e

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_e
    iget-object v2, v5, Lte/b;->i:La2/a;

    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    sget-object v2, Lte/a;->g:Lmh/b;

    .line 355
    .line 356
    const-string v8, "Loading plugin: {}"

    .line 357
    .line 358
    invoke-interface {v2, v5, v8}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iget-object v2, v3, Lte/a;->c:Ljava/util/TreeSet;

    .line 362
    .line 363
    invoke-virtual {v2, v5}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_f

    .line 368
    .line 369
    iget-object v2, v3, Lte/a;->f:Ljava/util/ArrayList;

    .line 370
    .line 371
    new-instance v8, Lae/g;

    .line 372
    .line 373
    invoke-direct {v8, v5, v4}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 377
    .line 378
    .line 379
    goto :goto_4

    .line 380
    :cond_f
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    const-class v2, Lff/c;

    .line 385
    .line 386
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    const-string v3, "Duplicate plugin id: "

    .line 391
    .line 392
    const-string v4, ", class "

    .line 393
    .line 394
    invoke-static {v3, v0, v4, v2}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :cond_10
    monitor-enter v3

    .line 403
    :try_start_1
    iget-object v0, v3, Lte/a;->c:Ljava/util/TreeSet;

    .line 404
    .line 405
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    new-instance v2, Lme/a;

    .line 410
    .line 411
    const/16 v5, 0xd

    .line 412
    .line 413
    invoke-direct {v2, v5}, Lme/a;-><init>(I)V

    .line 414
    .line 415
    .line 416
    invoke-static {v2}, Ljava/util/stream/Collectors;->groupingBy(Ljava/util/function/Function;)Ljava/util/stream/Collector;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    check-cast v0, Ljava/util/Map;

    .line 425
    .line 426
    new-instance v2, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 433
    .line 434
    .line 435
    new-instance v5, Lbe/f0;

    .line 436
    .line 437
    const/4 v8, 0x3

    .line 438
    invoke-direct {v5, v3, v8, v2}, Lbe/f0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    invoke-interface {v0, v5}, Ljava/util/Map;->forEach(Ljava/util/function/BiConsumer;)V

    .line 442
    .line 443
    .line 444
    iget-object v0, v3, Lte/a;->d:Ljava/util/TreeSet;

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V

    .line 447
    .line 448
    .line 449
    iget-object v0, v3, Lte/a;->d:Ljava/util/TreeSet;

    .line 450
    .line 451
    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 452
    .line 453
    .line 454
    monitor-exit v3

    .line 455
    sget-object v0, Lbc/k;->s:Lmh/b;

    .line 456
    .line 457
    invoke-interface {v0}, Lmh/b;->d()Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-eqz v2, :cond_11

    .line 462
    .line 463
    const-string v2, "Resolved plugins: {}"

    .line 464
    .line 465
    iget-object v3, v1, Lbc/k;->h:Lte/a;

    .line 466
    .line 467
    iget-object v3, v3, Lte/a;->d:Ljava/util/TreeSet;

    .line 468
    .line 469
    invoke-interface {v0, v3, v2}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :cond_11
    iget-object v0, v1, Lbc/k;->h:Lte/a;

    .line 473
    .line 474
    iget-object v2, v0, Lte/a;->d:Ljava/util/TreeSet;

    .line 475
    .line 476
    const-string v3, "dex-input"

    .line 477
    .line 478
    new-instance v5, Ll3/w;

    .line 479
    .line 480
    const/16 v9, 0x1c

    .line 481
    .line 482
    invoke-direct {v5, v9}, Ll3/w;-><init>(I)V

    .line 483
    .line 484
    .line 485
    iget-object v0, v0, Lte/a;->a:Lbc/k;

    .line 486
    .line 487
    iget-object v0, v0, Lbc/k;->g:Lbc/g;

    .line 488
    .line 489
    iget-object v0, v0, Lbc/g;->J:Lve/b;

    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v9

    .line 495
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    const/4 v10, 0x1

    .line 500
    if-eqz v0, :cond_13

    .line 501
    .line 502
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    move-object v11, v0

    .line 507
    check-cast v11, Lte/b;

    .line 508
    .line 509
    :try_start_2
    iget-object v0, v11, Lte/b;->k:Ll3/w;

    .line 510
    .line 511
    if-nez v0, :cond_12

    .line 512
    .line 513
    iput-object v5, v11, Lte/b;->k:Ll3/w;

    .line 514
    .line 515
    goto :goto_6

    .line 516
    :catch_0
    move-exception v0

    .line 517
    goto :goto_7

    .line 518
    :cond_12
    :goto_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    invoke-virtual {v12}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 523
    .line 524
    .line 525
    move-result-object v13

    .line 526
    iget-object v0, v11, Lte/b;->j:Ljava/lang/ClassLoader;

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 529
    .line 530
    .line 531
    :try_start_3
    iget-object v0, v11, Lte/b;->h:Lff/c;

    .line 532
    .line 533
    iget-object v14, v0, Lff/c;->a:Lfd/h;

    .line 534
    .line 535
    iget-object v15, v11, Lte/b;->g:Lbc/k;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 536
    .line 537
    :try_start_4
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    iput-object v14, v11, Lte/b;->m:Lfd/h;

    .line 541
    .line 542
    iget-object v4, v15, Lbc/k;->g:Lbc/g;

    .line 543
    .line 544
    iget-object v4, v4, Lbc/g;->M:Ljava/util/HashMap;

    .line 545
    .line 546
    invoke-virtual {v14, v4}, Lfd/h;->c(Ljava/util/HashMap;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 547
    .line 548
    .line 549
    :try_start_5
    new-instance v4, Lff/b;

    .line 550
    .line 551
    invoke-direct {v4, v0}, Lff/b;-><init>(Lff/c;)V

    .line 552
    .line 553
    .line 554
    iget-object v14, v11, Lte/b;->l:Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    iget-object v0, v0, Lff/c;->b:Lff/a;

    .line 560
    .line 561
    iget-object v4, v15, Lbc/k;->j:Lm/a;

    .line 562
    .line 563
    iput-object v4, v0, Lff/a;->b:Lm/a;

    .line 564
    .line 565
    iput-boolean v10, v11, Lte/b;->n:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 566
    .line 567
    :try_start_6
    invoke-virtual {v12, v13}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 568
    .line 569
    .line 570
    goto :goto_8

    .line 571
    :catch_1
    move-exception v0

    .line 572
    :try_start_7
    new-instance v4, Laf/g;

    .line 573
    .line 574
    invoke-virtual {v11}, Lte/b;->a()V

    .line 575
    .line 576
    .line 577
    const-string v10, "Failed to apply options for plugin: dex-input"

    .line 578
    .line 579
    invoke-direct {v4, v10, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 580
    .line 581
    .line 582
    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 583
    :catchall_0
    move-exception v0

    .line 584
    :try_start_8
    invoke-virtual {v12, v13}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 585
    .line 586
    .line 587
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 588
    :goto_7
    sget-object v4, Lte/a;->g:Lmh/b;

    .line 589
    .line 590
    const-string v10, "Failed to init plugin: {}"

    .line 591
    .line 592
    invoke-virtual {v11}, Lte/b;->a()V

    .line 593
    .line 594
    .line 595
    invoke-interface {v4, v3, v10, v0}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    :goto_8
    const/16 v4, 0x14

    .line 599
    .line 600
    goto :goto_5

    .line 601
    :cond_13
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    :cond_14
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    if-eqz v2, :cond_16

    .line 610
    .line 611
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    check-cast v2, Lte/b;

    .line 616
    .line 617
    iget-object v3, v2, Lte/b;->m:Lfd/h;

    .line 618
    .line 619
    if-eqz v3, :cond_14

    .line 620
    .line 621
    invoke-virtual {v2}, Lte/b;->a()V

    .line 622
    .line 623
    .line 624
    iget-object v2, v3, Lfd/h;->h:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast v2, Ljava/util/ArrayList;

    .line 627
    .line 628
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    if-eqz v2, :cond_15

    .line 633
    .line 634
    new-instance v3, Lae/e;

    .line 635
    .line 636
    const/16 v4, 0x1b

    .line 637
    .line 638
    invoke-direct {v3, v4}, Lae/e;-><init>(I)V

    .line 639
    .line 640
    .line 641
    invoke-interface {v2, v3}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 642
    .line 643
    .line 644
    goto :goto_9

    .line 645
    :cond_15
    const-string v0, "Null option descriptions in plugin id: dex-input"

    .line 646
    .line 647
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :cond_16
    sget-object v2, Lbc/k;->s:Lmh/b;

    .line 652
    .line 653
    invoke-interface {v2}, Lmh/b;->d()Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    const/4 v3, 0x5

    .line 658
    if-eqz v0, :cond_17

    .line 659
    .line 660
    iget-object v0, v1, Lbc/k;->p:Ljava/util/HashMap;

    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    new-instance v4, Lae/d;

    .line 671
    .line 672
    const/4 v5, 0x4

    .line 673
    invoke-direct {v4, v5}, Lae/d;-><init>(I)V

    .line 674
    .line 675
    .line 676
    invoke-interface {v0, v4}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    new-instance v4, Lae/d;

    .line 681
    .line 682
    invoke-direct {v4, v3}, Lae/d;-><init>(I)V

    .line 683
    .line 684
    .line 685
    invoke-interface {v0, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    invoke-interface {v0, v4}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    check-cast v0, Ljava/util/List;

    .line 698
    .line 699
    const-string v4, "Loaded custom passes: {} {}"

    .line 700
    .line 701
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 706
    .line 707
    .line 708
    move-result-object v5

    .line 709
    invoke-interface {v2, v5, v4, v0}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    :cond_17
    iget-object v4, v1, Lbc/k;->i:Ljava/util/ArrayList;

    .line 713
    .line 714
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 715
    .line 716
    .line 717
    iget-object v0, v1, Lbc/k;->g:Lbc/g;

    .line 718
    .line 719
    iget-object v0, v0, Lbc/g;->g:Ljava/util/ArrayList;

    .line 720
    .line 721
    new-instance v5, Lae/d;

    .line 722
    .line 723
    const/4 v9, 0x6

    .line 724
    invoke-direct {v5, v9}, Lae/d;-><init>(I)V

    .line 725
    .line 726
    .line 727
    invoke-static {v0, v5}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    sget-object v5, Lbf/b;->a:Lmh/b;

    .line 732
    .line 733
    new-instance v5, Ljava/util/ArrayList;

    .line 734
    .line 735
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 736
    .line 737
    .line 738
    move-result v9

    .line 739
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 740
    .line 741
    .line 742
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 743
    .line 744
    .line 745
    move-result-object v9

    .line 746
    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    if-eqz v0, :cond_1a

    .line 751
    .line 752
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    move-object v11, v0

    .line 757
    check-cast v11, Ljava/nio/file/Path;

    .line 758
    .line 759
    new-array v0, v7, [Ljava/nio/file/LinkOption;

    .line 760
    .line 761
    invoke-static {v11, v0}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-eqz v0, :cond_19

    .line 766
    .line 767
    :try_start_9
    sget-object v0, Ljava/nio/file/FileVisitOption;->FOLLOW_LINKS:Ljava/nio/file/FileVisitOption;

    .line 768
    .line 769
    filled-new-array {v0}, [Ljava/nio/file/FileVisitOption;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-static {v11, v0}, Ljava/nio/file/Files;->walk(Ljava/nio/file/Path;[Ljava/nio/file/FileVisitOption;)Ljava/util/stream/Stream;

    .line 774
    .line 775
    .line 776
    move-result-object v12
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 777
    :try_start_a
    new-instance v0, La7/b;

    .line 778
    .line 779
    const/16 v13, 0x15

    .line 780
    .line 781
    invoke-direct {v0, v13}, La7/b;-><init>(I)V

    .line 782
    .line 783
    .line 784
    invoke-interface {v12, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    new-instance v13, Lbe/m0;

    .line 789
    .line 790
    invoke-direct {v13, v10, v5}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 791
    .line 792
    .line 793
    invoke-interface {v0, v13}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 794
    .line 795
    .line 796
    :try_start_b
    invoke-interface {v12}, Ljava/util/stream/BaseStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    .line 797
    .line 798
    .line 799
    goto :goto_a

    .line 800
    :catch_2
    move-exception v0

    .line 801
    goto :goto_c

    .line 802
    :catchall_1
    move-exception v0

    .line 803
    move-object v13, v0

    .line 804
    if-eqz v12, :cond_18

    .line 805
    .line 806
    :try_start_c
    invoke-interface {v12}, Ljava/util/stream/BaseStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 807
    .line 808
    .line 809
    goto :goto_b

    .line 810
    :catchall_2
    move-exception v0

    .line 811
    :try_start_d
    invoke-virtual {v13, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 812
    .line 813
    .line 814
    :cond_18
    :goto_b
    throw v13
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2

    .line 815
    :goto_c
    sget-object v12, Lbf/b;->a:Lmh/b;

    .line 816
    .line 817
    const-string v13, "Failed to list files in directory: {}"

    .line 818
    .line 819
    invoke-interface {v12, v11, v13, v0}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    goto :goto_a

    .line 823
    :cond_19
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    goto :goto_a

    .line 827
    :cond_1a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 828
    .line 829
    .line 830
    move-result-wide v11

    .line 831
    iget-object v0, v1, Lbc/k;->h:Lte/a;

    .line 832
    .line 833
    iget-object v0, v0, Lte/a;->d:Ljava/util/TreeSet;

    .line 834
    .line 835
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 836
    .line 837
    .line 838
    move-result-object v9

    .line 839
    :cond_1b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_1d

    .line 844
    .line 845
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    move-object v13, v0

    .line 850
    check-cast v13, Lte/b;

    .line 851
    .line 852
    iget-object v0, v13, Lte/b;->l:Ljava/util/ArrayList;

    .line 853
    .line 854
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 855
    .line 856
    .line 857
    move-result-object v14

    .line 858
    :cond_1c
    :goto_d
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    if-eqz v0, :cond_1b

    .line 863
    .line 864
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    check-cast v0, Lff/b;

    .line 869
    .line 870
    :try_start_e
    invoke-virtual {v0, v5}, Lff/b;->a(Ljava/util/ArrayList;)Llc/a;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-interface {v0}, Llc/a;->isEmpty()Z

    .line 875
    .line 876
    .line 877
    move-result v15

    .line 878
    if-nez v15, :cond_1c

    .line 879
    .line 880
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3

    .line 881
    .line 882
    .line 883
    goto :goto_d

    .line 884
    :catch_3
    move-exception v0

    .line 885
    const-string v15, "Failed to load code for plugin: {}"

    .line 886
    .line 887
    invoke-interface {v2, v13, v15, v0}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    goto :goto_d

    .line 891
    :cond_1d
    iget-object v0, v1, Lbc/k;->n:Ljava/util/ArrayList;

    .line 892
    .line 893
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 894
    .line 895
    .line 896
    invoke-interface {v2}, Lmh/b;->d()Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-eqz v0, :cond_1e

    .line 901
    .line 902
    const-string v0, "Loaded using {} inputs plugin in {} ms"

    .line 903
    .line 904
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 913
    .line 914
    .line 915
    move-result-wide v13

    .line 916
    sub-long/2addr v13, v11

    .line 917
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    invoke-interface {v2, v4, v0, v5}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    :cond_1e
    new-instance v0, Lud/u;

    .line 925
    .line 926
    invoke-direct {v0, v1}, Lud/u;-><init>(Lbc/k;)V

    .line 927
    .line 928
    .line 929
    iput-object v0, v1, Lbc/k;->k:Lud/u;

    .line 930
    .line 931
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 932
    .line 933
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    iget-object v2, v0, Lbc/g;->D:Ljava/util/EnumSet;

    .line 937
    .line 938
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 939
    .line 940
    .line 941
    move-result v2

    .line 942
    if-nez v2, :cond_1f

    .line 943
    .line 944
    iget-object v2, v0, Lbc/g;->A:Lkd/a;

    .line 945
    .line 946
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    iget v0, v0, Lbc/g;->y:I

    .line 950
    .line 951
    iput v0, v2, Lkd/a;->e:I

    .line 952
    .line 953
    :cond_1f
    iget-object v0, v1, Lbc/k;->k:Lud/u;

    .line 954
    .line 955
    iget-object v2, v1, Lbc/k;->i:Ljava/util/ArrayList;

    .line 956
    .line 957
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 961
    .line 962
    .line 963
    move-result-object v2

    .line 964
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 965
    .line 966
    .line 967
    move-result v4

    .line 968
    if-eqz v4, :cond_20

    .line 969
    .line 970
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    check-cast v4, Llc/a;

    .line 975
    .line 976
    new-instance v5, Lud/t;

    .line 977
    .line 978
    invoke-direct {v5, v0, v10}, Lud/t;-><init>(Lud/u;I)V

    .line 979
    .line 980
    .line 981
    invoke-interface {v4, v5}, Llc/a;->n(Lud/t;)V

    .line 982
    .line 983
    .line 984
    goto :goto_e

    .line 985
    :cond_20
    iget-object v2, v1, Lbc/k;->k:Lud/u;

    .line 986
    .line 987
    iget-object v0, v1, Lbc/k;->m:Lbc/q;

    .line 988
    .line 989
    monitor-enter p0

    .line 990
    :try_start_f
    iget-object v4, v1, Lbc/k;->l:Ljava/util/ArrayList;

    .line 991
    .line 992
    if-nez v4, :cond_22

    .line 993
    .line 994
    iget-object v4, v1, Lbc/k;->k:Lud/u;

    .line 995
    .line 996
    if-nez v4, :cond_21

    .line 997
    .line 998
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 999
    .line 1000
    monitor-exit p0

    .line 1001
    goto :goto_f

    .line 1002
    :catchall_3
    move-exception v0

    .line 1003
    goto/16 :goto_23

    .line 1004
    .line 1005
    :cond_21
    :try_start_10
    iget-object v5, v1, Lbc/k;->m:Lbc/q;

    .line 1006
    .line 1007
    invoke-virtual {v5, v4}, Lbc/q;->b(Lud/u;)Ljava/util/ArrayList;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    iput-object v4, v1, Lbc/k;->l:Ljava/util/ArrayList;

    .line 1012
    .line 1013
    :cond_22
    iget-object v4, v1, Lbc/k;->l:Ljava/util/ArrayList;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 1014
    .line 1015
    monitor-exit p0

    .line 1016
    :goto_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v5

    .line 1023
    :cond_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1024
    .line 1025
    .line 1026
    move-result v9

    .line 1027
    const/4 v11, 0x0

    .line 1028
    if-eqz v9, :cond_24

    .line 1029
    .line 1030
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v9

    .line 1034
    check-cast v9, Lbc/o;

    .line 1035
    .line 1036
    iget-object v12, v9, Lbc/o;->b:Lbc/p;

    .line 1037
    .line 1038
    sget-object v13, Lbc/p;->i:Lbc/p;

    .line 1039
    .line 1040
    if-ne v12, v13, :cond_23

    .line 1041
    .line 1042
    goto :goto_10

    .line 1043
    :cond_24
    move-object v9, v11

    .line 1044
    :goto_10
    if-nez v9, :cond_25

    .line 1045
    .line 1046
    sget-object v0, Lud/u;->v:Lmh/b;

    .line 1047
    .line 1048
    const-string v2, "\'resources.arsc\' or \'resources.pb\' file not found"

    .line 1049
    .line 1050
    invoke-interface {v0, v2}, Lmh/b;->l(Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    goto :goto_14

    .line 1054
    :cond_25
    :try_start_11
    new-instance v5, Le9/a;

    .line 1055
    .line 1056
    const/16 v12, 0xa

    .line 1057
    .line 1058
    invoke-direct {v5, v0, v12, v9}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-static {v9, v5}, Lbc/q;->a(Lbc/o;Le9/a;)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    check-cast v0, Ldf/g;

    .line 1066
    .line 1067
    if-eqz v0, :cond_27

    .line 1068
    .line 1069
    iget-object v5, v0, Ldf/g;->e:Ldf/i;

    .line 1070
    .line 1071
    invoke-virtual {v2, v5}, Lud/u;->d(Ldf/i;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v2, v0, v4}, Lud/u;->k(Ldf/g;Ljava/util/List;)V

    .line 1075
    .line 1076
    .line 1077
    monitor-enter v2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_4

    .line 1078
    :try_start_12
    iget-object v4, v2, Lud/u;->u:Ldf/c;

    .line 1079
    .line 1080
    if-nez v4, :cond_26

    .line 1081
    .line 1082
    new-instance v4, Ldf/c;

    .line 1083
    .line 1084
    iget-object v5, v2, Lud/u;->a:Lbc/g;

    .line 1085
    .line 1086
    iget-object v5, v5, Lbc/g;->K:Lad/c;

    .line 1087
    .line 1088
    invoke-direct {v4, v5}, Ldf/c;-><init>(Lad/c;)V

    .line 1089
    .line 1090
    .line 1091
    iput-object v4, v2, Lud/u;->u:Ldf/c;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 1092
    .line 1093
    goto :goto_11

    .line 1094
    :catchall_4
    move-exception v0

    .line 1095
    goto :goto_12

    .line 1096
    :cond_26
    :goto_11
    :try_start_13
    monitor-exit v2

    .line 1097
    invoke-virtual {v4, v0}, Ldf/c;->d(Ldf/g;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_4

    .line 1098
    .line 1099
    .line 1100
    goto :goto_14

    .line 1101
    :catch_4
    move-exception v0

    .line 1102
    goto :goto_13

    .line 1103
    :goto_12
    :try_start_14
    monitor-exit v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 1104
    :try_start_15
    throw v0
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_4

    .line 1105
    :goto_13
    sget-object v2, Lud/u;->v:Lmh/b;

    .line 1106
    .line 1107
    const-string v4, "Failed to parse \'resources.pb\'/\'.arsc\' file"

    .line 1108
    .line 1109
    invoke-interface {v2, v4, v0}, Lmh/b;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1110
    .line 1111
    .line 1112
    :cond_27
    :goto_14
    iget-object v0, v1, Lbc/k;->k:Lud/u;

    .line 1113
    .line 1114
    iget-object v2, v0, Lud/u;->p:Ljava/util/ArrayList;

    .line 1115
    .line 1116
    iget-object v4, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1117
    .line 1118
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1119
    .line 1120
    .line 1121
    move-result v4

    .line 1122
    iget-object v5, v0, Lud/u;->l:Ljava/util/HashMap;

    .line 1123
    .line 1124
    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    .line 1125
    .line 1126
    .line 1127
    move-result v9

    .line 1128
    const/16 v12, 0xf

    .line 1129
    .line 1130
    if-eq v4, v9, :cond_28

    .line 1131
    .line 1132
    iget-object v4, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1133
    .line 1134
    invoke-interface {v4}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v4

    .line 1138
    new-instance v9, Lme/a;

    .line 1139
    .line 1140
    invoke-direct {v9, v12}, Lme/a;-><init>(I)V

    .line 1141
    .line 1142
    .line 1143
    invoke-static {v9}, Ljava/util/stream/Collectors;->groupingBy(Ljava/util/function/Function;)Ljava/util/stream/Collector;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v9

    .line 1147
    invoke-interface {v4, v9}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v4

    .line 1151
    check-cast v4, Ljava/util/Map;

    .line 1152
    .line 1153
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v4

    .line 1157
    invoke-interface {v4}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v4

    .line 1161
    new-instance v9, Lud/b;

    .line 1162
    .line 1163
    const/4 v13, 0x2

    .line 1164
    invoke-direct {v9, v13}, Lud/b;-><init>(I)V

    .line 1165
    .line 1166
    .line 1167
    invoke-interface {v4, v9}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v4

    .line 1171
    new-instance v9, Lud/t;

    .line 1172
    .line 1173
    invoke-direct {v9, v0, v7}, Lud/t;-><init>(Lud/u;I)V

    .line 1174
    .line 1175
    .line 1176
    invoke-interface {v4, v9}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 1177
    .line 1178
    .line 1179
    :cond_28
    new-instance v4, Ljava/util/ArrayList;

    .line 1180
    .line 1181
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v5

    .line 1185
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1186
    .line 1187
    .line 1188
    iput-object v4, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1189
    .line 1190
    invoke-interface {v4}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v4

    .line 1194
    new-instance v5, Lae/a;

    .line 1195
    .line 1196
    const/16 v9, 0xe

    .line 1197
    .line 1198
    invoke-direct {v5, v9}, Lae/a;-><init>(I)V

    .line 1199
    .line 1200
    .line 1201
    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->mapToInt(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v4

    .line 1205
    invoke-interface {v4}, Ljava/util/stream/IntStream;->sum()I

    .line 1206
    .line 1207
    .line 1208
    move-result v4

    .line 1209
    iget-object v5, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1210
    .line 1211
    invoke-interface {v5}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v5

    .line 1215
    new-instance v9, Lme/a;

    .line 1216
    .line 1217
    const/16 v13, 0x11

    .line 1218
    .line 1219
    invoke-direct {v9, v13}, Lme/a;-><init>(I)V

    .line 1220
    .line 1221
    .line 1222
    invoke-interface {v5, v9}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v5

    .line 1226
    new-instance v9, Lae/a;

    .line 1227
    .line 1228
    invoke-direct {v9, v12}, Lae/a;-><init>(I)V

    .line 1229
    .line 1230
    .line 1231
    invoke-interface {v5, v9}, Ljava/util/stream/Stream;->mapToInt(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v5

    .line 1235
    invoke-interface {v5}, Ljava/util/stream/IntStream;->sum()I

    .line 1236
    .line 1237
    .line 1238
    move-result v5

    .line 1239
    sget-object v9, Lud/u;->v:Lmh/b;

    .line 1240
    .line 1241
    iget-object v12, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1242
    .line 1243
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1244
    .line 1245
    .line 1246
    move-result v12

    .line 1247
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v12

    .line 1251
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v4

    .line 1255
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v5

    .line 1259
    filled-new-array {v12, v4, v5}, [Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v4

    .line 1263
    invoke-interface {v9, v4}, Lmh/b;->z([Ljava/lang/Object;)V

    .line 1264
    .line 1265
    .line 1266
    iget-object v4, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1267
    .line 1268
    new-instance v5, Lme/a;

    .line 1269
    .line 1270
    const/16 v9, 0x12

    .line 1271
    .line 1272
    invoke-direct {v5, v9}, Lme/a;-><init>(I)V

    .line 1273
    .line 1274
    .line 1275
    invoke-static {v5}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v5

    .line 1279
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 1280
    .line 1281
    .line 1282
    iget-object v4, v0, Lud/u;->a:Lbc/g;

    .line 1283
    .line 1284
    iget-boolean v4, v4, Lbc/g;->v:Z

    .line 1285
    .line 1286
    if-eqz v4, :cond_31

    .line 1287
    .line 1288
    new-instance v4, Ljava/util/ArrayList;

    .line 1289
    .line 1290
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1291
    .line 1292
    .line 1293
    iget-object v5, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1294
    .line 1295
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v5

    .line 1299
    :cond_29
    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1300
    .line 1301
    .line 1302
    move-result v9

    .line 1303
    if-eqz v9, :cond_2a

    .line 1304
    .line 1305
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v9

    .line 1309
    check-cast v9, Lud/e;

    .line 1310
    .line 1311
    iget-object v12, v9, Lud/e;->m:Lod/a;

    .line 1312
    .line 1313
    invoke-virtual {v12}, Lod/a;->o()Z

    .line 1314
    .line 1315
    .line 1316
    move-result v12

    .line 1317
    if-eqz v12, :cond_29

    .line 1318
    .line 1319
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1320
    .line 1321
    .line 1322
    goto :goto_15

    .line 1323
    :cond_2a
    new-instance v5, Ljava/util/ArrayList;

    .line 1324
    .line 1325
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v4

    .line 1332
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1333
    .line 1334
    .line 1335
    move-result v9

    .line 1336
    if-eqz v9, :cond_2e

    .line 1337
    .line 1338
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v9

    .line 1342
    check-cast v9, Lud/e;

    .line 1343
    .line 1344
    iget-object v12, v9, Lud/e;->m:Lod/a;

    .line 1345
    .line 1346
    iget-object v13, v12, Lod/a;->k:Lod/a;

    .line 1347
    .line 1348
    invoke-virtual {v0, v13}, Lud/u;->f(Lod/a;)Lud/e;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v14

    .line 1352
    if-nez v14, :cond_2b

    .line 1353
    .line 1354
    if-eqz v13, :cond_2b

    .line 1355
    .line 1356
    iget-object v13, v13, Lod/a;->j:Ljava/lang/String;

    .line 1357
    .line 1358
    invoke-virtual {v13, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1359
    .line 1360
    .line 1361
    move-result v15

    .line 1362
    if-lez v15, :cond_2b

    .line 1363
    .line 1364
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1365
    .line 1366
    .line 1367
    move-result v16

    .line 1368
    add-int/lit8 v6, v16, -0x1

    .line 1369
    .line 1370
    if-eq v15, v6, :cond_2b

    .line 1371
    .line 1372
    add-int/lit8 v6, v15, 0x1

    .line 1373
    .line 1374
    invoke-virtual {v13, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v6

    .line 1378
    invoke-virtual {v13, v7, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v13

    .line 1382
    invoke-static {v13}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v13

    .line 1386
    invoke-static {v0, v13}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v13

    .line 1390
    invoke-virtual {v0, v13}, Lud/u;->f(Lod/a;)Lud/e;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v13

    .line 1394
    if-eqz v13, :cond_2b

    .line 1395
    .line 1396
    invoke-virtual {v13, v6}, Lud/e;->n0(Ljava/lang/String;)Lud/r;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v6

    .line 1400
    if-eqz v6, :cond_2b

    .line 1401
    .line 1402
    iget-object v6, v13, Lud/e;->k:Lud/u;

    .line 1403
    .line 1404
    iget-object v14, v12, Lod/a;->g:Lqd/j;

    .line 1405
    .line 1406
    invoke-virtual {v12, v6, v14, v10}, Lod/a;->r(Lud/u;Lqd/j;Z)V

    .line 1407
    .line 1408
    .line 1409
    iget-object v6, v13, Lud/e;->m:Lod/a;

    .line 1410
    .line 1411
    iput-object v6, v12, Lod/a;->k:Lod/a;

    .line 1412
    .line 1413
    move-object v14, v13

    .line 1414
    :cond_2b
    if-nez v14, :cond_2c

    .line 1415
    .line 1416
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    iget-object v6, v9, Lud/e;->m:Lod/a;

    .line 1420
    .line 1421
    iget-object v12, v9, Lud/e;->k:Lud/u;

    .line 1422
    .line 1423
    iget-object v13, v6, Lod/a;->g:Lqd/j;

    .line 1424
    .line 1425
    invoke-virtual {v6, v12, v13, v7}, Lod/a;->r(Lud/u;Lqd/j;Z)V

    .line 1426
    .line 1427
    .line 1428
    iput-object v11, v6, Lod/a;->k:Lod/a;

    .line 1429
    .line 1430
    iput-object v9, v9, Lud/e;->x:Lud/e;

    .line 1431
    .line 1432
    goto :goto_17

    .line 1433
    :cond_2c
    iget-object v6, v14, Lud/e;->v:Ljava/util/List;

    .line 1434
    .line 1435
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1436
    .line 1437
    .line 1438
    move-result v6

    .line 1439
    if-eqz v6, :cond_2d

    .line 1440
    .line 1441
    new-instance v6, Ljava/util/ArrayList;

    .line 1442
    .line 1443
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1444
    .line 1445
    .line 1446
    iput-object v6, v14, Lud/e;->v:Ljava/util/List;

    .line 1447
    .line 1448
    :cond_2d
    iget-object v6, v14, Lud/e;->v:Ljava/util/List;

    .line 1449
    .line 1450
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1451
    .line 1452
    .line 1453
    iput-object v14, v9, Lud/e;->x:Lud/e;

    .line 1454
    .line 1455
    :goto_17
    const/16 v6, 0x2e

    .line 1456
    .line 1457
    goto :goto_16

    .line 1458
    :cond_2e
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    :cond_2f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1463
    .line 1464
    .line 1465
    move-result v4

    .line 1466
    if-eqz v4, :cond_30

    .line 1467
    .line 1468
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v4

    .line 1472
    check-cast v4, Lud/e;

    .line 1473
    .line 1474
    iget-object v4, v4, Lud/e;->v:Ljava/util/List;

    .line 1475
    .line 1476
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v4

    .line 1480
    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1481
    .line 1482
    .line 1483
    move-result v5

    .line 1484
    if-eqz v5, :cond_2f

    .line 1485
    .line 1486
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v5

    .line 1490
    check-cast v5, Lud/e;

    .line 1491
    .line 1492
    iget-object v5, v5, Lud/e;->m:Lod/a;

    .line 1493
    .line 1494
    iget-object v6, v5, Lod/a;->g:Lqd/j;

    .line 1495
    .line 1496
    invoke-virtual {v5}, Lod/a;->o()Z

    .line 1497
    .line 1498
    .line 1499
    move-result v7

    .line 1500
    invoke-virtual {v5, v0, v6, v7}, Lod/a;->r(Lud/u;Lqd/j;Z)V

    .line 1501
    .line 1502
    .line 1503
    goto :goto_18

    .line 1504
    :cond_30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v0

    .line 1508
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v3

    .line 1512
    if-eqz v3, :cond_31

    .line 1513
    .line 1514
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v3

    .line 1518
    check-cast v3, Lud/s;

    .line 1519
    .line 1520
    iget-object v3, v3, Lud/s;->o:Ljava/util/ArrayList;

    .line 1521
    .line 1522
    new-instance v4, Lud/b;

    .line 1523
    .line 1524
    invoke-direct {v4, v8}, Lud/b;-><init>(I)V

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1528
    .line 1529
    .line 1530
    goto :goto_19

    .line 1531
    :cond_31
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1532
    .line 1533
    .line 1534
    iget-object v0, v1, Lbc/k;->k:Lud/u;

    .line 1535
    .line 1536
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1537
    .line 1538
    .line 1539
    :try_start_16
    iget-object v2, v0, Lud/u;->s:Led/c;

    .line 1540
    .line 1541
    if-nez v2, :cond_33

    .line 1542
    .line 1543
    new-instance v2, Led/c;

    .line 1544
    .line 1545
    invoke-direct {v2, v0}, Led/c;-><init>(Lud/u;)V

    .line 1546
    .line 1547
    .line 1548
    iget-object v3, v0, Lud/u;->a:Lbc/g;

    .line 1549
    .line 1550
    iget-boolean v3, v3, Lbc/g;->P:Z

    .line 1551
    .line 1552
    if-eqz v3, :cond_32

    .line 1553
    .line 1554
    invoke-virtual {v2}, Led/c;->f()V

    .line 1555
    .line 1556
    .line 1557
    goto :goto_1a

    .line 1558
    :catch_5
    move-exception v0

    .line 1559
    goto/16 :goto_22

    .line 1560
    .line 1561
    :cond_32
    :goto_1a
    iget-object v3, v0, Lud/u;->n:Ljava/util/ArrayList;

    .line 1562
    .line 1563
    invoke-virtual {v2, v3}, Led/c;->a(Ljava/util/ArrayList;)V

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual {v2}, Led/c;->e()V

    .line 1567
    .line 1568
    .line 1569
    iput-object v2, v0, Lud/u;->s:Led/c;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_5

    .line 1570
    .line 1571
    :cond_33
    iget-object v0, v1, Lbc/k;->k:Lud/u;

    .line 1572
    .line 1573
    iget-object v2, v1, Lbc/k;->p:Ljava/util/HashMap;

    .line 1574
    .line 1575
    iget-object v3, v0, Lud/u;->a:Lbc/g;

    .line 1576
    .line 1577
    iget-object v4, v3, Lbc/g;->E:Lbc/b;

    .line 1578
    .line 1579
    sget-object v5, Lbc/b;->i:Lbc/b;

    .line 1580
    .line 1581
    if-eq v4, v5, :cond_35

    .line 1582
    .line 1583
    sget-object v5, Lbc/b;->h:Lbc/b;

    .line 1584
    .line 1585
    if-ne v4, v5, :cond_34

    .line 1586
    .line 1587
    goto :goto_1b

    .line 1588
    :cond_34
    new-instance v4, Lxe/l;

    .line 1589
    .line 1590
    iget-object v5, v0, Lud/u;->q:Ljava/util/ArrayList;

    .line 1591
    .line 1592
    invoke-direct {v4, v5}, Lxe/l;-><init>(Ljava/util/ArrayList;)V

    .line 1593
    .line 1594
    .line 1595
    sget-object v5, Lxc/d;->a:Lxc/c;

    .line 1596
    .line 1597
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v5

    .line 1601
    check-cast v5, Ljava/util/List;

    .line 1602
    .line 1603
    new-instance v6, Lme/a;

    .line 1604
    .line 1605
    const/16 v7, 0x13

    .line 1606
    .line 1607
    invoke-direct {v6, v7}, Lme/a;-><init>(I)V

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v4, v5, v6}, Lxe/l;->b(Ljava/util/List;Ljava/util/function/Function;)V

    .line 1611
    .line 1612
    .line 1613
    new-instance v4, Lxe/l;

    .line 1614
    .line 1615
    iget-object v5, v0, Lud/u;->r:Ldd/b;

    .line 1616
    .line 1617
    iget-object v5, v5, Ldd/b;->a:Ljava/util/ArrayList;

    .line 1618
    .line 1619
    invoke-direct {v4, v5}, Lxe/l;-><init>(Ljava/util/ArrayList;)V

    .line 1620
    .line 1621
    .line 1622
    sget-object v5, Lxc/b;->a:Lxc/c;

    .line 1623
    .line 1624
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v2

    .line 1628
    check-cast v2, Ljava/util/List;

    .line 1629
    .line 1630
    new-instance v5, Lme/a;

    .line 1631
    .line 1632
    const/16 v6, 0x14

    .line 1633
    .line 1634
    invoke-direct {v5, v6}, Lme/a;-><init>(I)V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v4, v2, v5}, Lxe/l;->b(Ljava/util/List;Ljava/util/function/Function;)V

    .line 1638
    .line 1639
    .line 1640
    iget-object v2, v3, Lbc/g;->L:Ljava/util/ArrayList;

    .line 1641
    .line 1642
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1643
    .line 1644
    .line 1645
    move-result v3

    .line 1646
    if-nez v3, :cond_35

    .line 1647
    .line 1648
    new-instance v3, Ljava/util/HashSet;

    .line 1649
    .line 1650
    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 1651
    .line 1652
    .line 1653
    new-instance v2, Lle/d;

    .line 1654
    .line 1655
    invoke-direct {v2, v3, v10}, Lle/d;-><init>(Ljava/util/HashSet;I)V

    .line 1656
    .line 1657
    .line 1658
    iget-object v3, v0, Lud/u;->q:Ljava/util/ArrayList;

    .line 1659
    .line 1660
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1661
    .line 1662
    .line 1663
    iget-object v0, v0, Lud/u;->r:Ldd/b;

    .line 1664
    .line 1665
    iget-object v0, v0, Ldd/b;->a:Ljava/util/ArrayList;

    .line 1666
    .line 1667
    invoke-interface {v0, v2}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1668
    .line 1669
    .line 1670
    :cond_35
    :goto_1b
    iget-object v2, v1, Lbc/k;->k:Lud/u;

    .line 1671
    .line 1672
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1673
    .line 1674
    .line 1675
    sget-object v3, Lud/u;->v:Lmh/b;

    .line 1676
    .line 1677
    invoke-interface {v3}, Lmh/b;->d()Z

    .line 1678
    .line 1679
    .line 1680
    move-result v4

    .line 1681
    iget-object v0, v2, Lud/u;->q:Ljava/util/ArrayList;

    .line 1682
    .line 1683
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v5

    .line 1687
    :cond_36
    :goto_1c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1688
    .line 1689
    .line 1690
    move-result v0

    .line 1691
    if-eqz v0, :cond_3a

    .line 1692
    .line 1693
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v0

    .line 1697
    move-object v6, v0

    .line 1698
    check-cast v6, Lbe/a;

    .line 1699
    .line 1700
    invoke-static {}, Lxe/s;->a()V

    .line 1701
    .line 1702
    .line 1703
    if-eqz v4, :cond_37

    .line 1704
    .line 1705
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1706
    .line 1707
    .line 1708
    move-result-wide v7

    .line 1709
    goto :goto_1d

    .line 1710
    :cond_37
    const-wide/16 v7, 0x0

    .line 1711
    .line 1712
    :goto_1d
    :try_start_17
    invoke-virtual {v6, v2}, Lbe/a;->f(Lud/u;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_6

    .line 1713
    .line 1714
    .line 1715
    goto :goto_1e

    .line 1716
    :catch_6
    move-exception v0

    .line 1717
    const-string v9, "Visitor init failed: {}"

    .line 1718
    .line 1719
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v10

    .line 1723
    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v10

    .line 1727
    invoke-interface {v3, v10, v9, v0}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1728
    .line 1729
    .line 1730
    :goto_1e
    iget-object v0, v2, Lud/u;->n:Ljava/util/ArrayList;

    .line 1731
    .line 1732
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v0

    .line 1736
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1737
    .line 1738
    .line 1739
    move-result v9

    .line 1740
    if-eqz v9, :cond_39

    .line 1741
    .line 1742
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v9

    .line 1746
    check-cast v9, Lud/e;

    .line 1747
    .line 1748
    invoke-virtual {v9}, Lud/e;->d0()Z

    .line 1749
    .line 1750
    .line 1751
    move-result v10

    .line 1752
    if-eqz v10, :cond_38

    .line 1753
    .line 1754
    goto :goto_1f

    .line 1755
    :cond_38
    invoke-static {v6, v9}, Lbe/h;->h0(Lbe/a;Lud/e;)V

    .line 1756
    .line 1757
    .line 1758
    goto :goto_1f

    .line 1759
    :cond_39
    if-eqz v4, :cond_36

    .line 1760
    .line 1761
    const-string v0, "Prepare pass: \'{}\' - {}ms"

    .line 1762
    .line 1763
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1764
    .line 1765
    .line 1766
    move-result-wide v9

    .line 1767
    sub-long/2addr v9, v7

    .line 1768
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v7

    .line 1772
    invoke-interface {v3, v6, v0, v7}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1773
    .line 1774
    .line 1775
    goto :goto_1c

    .line 1776
    :cond_3a
    iget-object v2, v1, Lbc/k;->k:Lud/u;

    .line 1777
    .line 1778
    iget-object v0, v2, Lud/u;->r:Ldd/b;

    .line 1779
    .line 1780
    iget-object v0, v0, Ldd/b;->a:Ljava/util/ArrayList;

    .line 1781
    .line 1782
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v3

    .line 1786
    :goto_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1787
    .line 1788
    .line 1789
    move-result v0

    .line 1790
    if-eqz v0, :cond_3b

    .line 1791
    .line 1792
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v0

    .line 1796
    move-object v4, v0

    .line 1797
    check-cast v4, Lbe/a;

    .line 1798
    .line 1799
    :try_start_18
    invoke-virtual {v4, v2}, Lbe/a;->f(Lud/u;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_7

    .line 1800
    .line 1801
    .line 1802
    goto :goto_20

    .line 1803
    :catch_7
    move-exception v0

    .line 1804
    sget-object v5, Ldd/b;->b:Lmh/b;

    .line 1805
    .line 1806
    const-string v6, "Visitor init failed: {}"

    .line 1807
    .line 1808
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v4

    .line 1812
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v4

    .line 1816
    invoke-interface {v5, v4, v6, v0}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1817
    .line 1818
    .line 1819
    goto :goto_20

    .line 1820
    :cond_3b
    sget-object v0, Lbc/k;->s:Lmh/b;

    .line 1821
    .line 1822
    const-string v2, "Load finished"

    .line 1823
    .line 1824
    invoke-interface {v0, v2}, Lmh/b;->l(Ljava/lang/String;)V

    .line 1825
    .line 1826
    .line 1827
    iget-object v0, v1, Lbc/k;->p:Ljava/util/HashMap;

    .line 1828
    .line 1829
    sget-object v2, Lxc/a;->a:Lxc/c;

    .line 1830
    .line 1831
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v0

    .line 1835
    check-cast v0, Ljava/util/List;

    .line 1836
    .line 1837
    if-eqz v0, :cond_3d

    .line 1838
    .line 1839
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v0

    .line 1843
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1844
    .line 1845
    .line 1846
    move-result v2

    .line 1847
    if-nez v2, :cond_3c

    .line 1848
    .line 1849
    goto :goto_21

    .line 1850
    :cond_3c
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v0

    .line 1854
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1855
    .line 1856
    .line 1857
    invoke-static {}, Lah/a;->d()V

    .line 1858
    .line 1859
    .line 1860
    :cond_3d
    :goto_21
    return-void

    .line 1861
    :goto_22
    new-instance v2, Laf/g;

    .line 1862
    .line 1863
    const-string v3, "Error loading jadx class set"

    .line 1864
    .line 1865
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1866
    .line 1867
    .line 1868
    throw v2

    .line 1869
    :goto_23
    :try_start_19
    monitor-exit p0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    .line 1870
    throw v0

    .line 1871
    :catchall_5
    move-exception v0

    .line 1872
    :try_start_1a
    monitor-exit v3
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    .line 1873
    throw v0

    .line 1874
    :catchall_6
    move-exception v0

    .line 1875
    goto :goto_24

    .line 1876
    :catch_8
    move-exception v0

    .line 1877
    :try_start_1b
    new-instance v3, Laf/g;

    .line 1878
    .line 1879
    const-string v4, "Failed to update temp root directory"

    .line 1880
    .line 1881
    invoke-direct {v3, v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1882
    .line 1883
    .line 1884
    throw v3

    .line 1885
    :goto_24
    monitor-exit v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    .line 1886
    throw v0
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object v0, p0, Lbc/k;->h:Lte/a;

    .line 2
    .line 3
    iget-object v0, v0, Lte/a;->d:Ljava/util/TreeSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lte/b;

    .line 20
    .line 21
    :try_start_0
    iget-boolean v2, v1, Lte/b;->n:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Lte/b;->h:Lff/c;

    .line 26
    .line 27
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, v1, Lte/b;->j:Ljava/lang/ClassLoader;

    .line 39
    .line 40
    invoke-virtual {v2, v4}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v2

    .line 48
    sget-object v3, Lte/a;->g:Lmh/b;

    .line 49
    .line 50
    const-string v4, "Failed to unload plugin: {}"

    .line 51
    .line 52
    invoke-virtual {v1}, Lte/b;->a()V

    .line 53
    .line 54
    .line 55
    const-string v1, "dex-input"

    .line 56
    .line 57
    invoke-interface {v3, v1, v4, v2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lbc/k;->k:Lud/u;

    .line 63
    .line 64
    iput-object v0, p0, Lbc/k;->l:Ljava/util/ArrayList;

    .line 65
    .line 66
    iget-object v0, p0, Lbc/k;->r:Lue/a;

    .line 67
    .line 68
    iget-object v0, v0, Lue/a;->a:Lm/a;

    .line 69
    .line 70
    monitor-enter v0

    .line 71
    :try_start_1
    iget-object v1, v0, Lm/a;->h:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/util/IdentityHashMap;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    monitor-exit v0

    .line 79
    return-void

    .line 80
    :catchall_0
    move-exception v1

    .line 81
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Ldd/a;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "jadx decompiler "

    .line 6
    .line 7
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
