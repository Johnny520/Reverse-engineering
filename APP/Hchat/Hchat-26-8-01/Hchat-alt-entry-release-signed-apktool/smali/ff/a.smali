.class public final Lff/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lmh/b;

.field public static d:I


# instance fields
.field public final a:Lfd/h;

.field public b:Lm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lff/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lff/a;->c:Lmh/b;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sput v0, Lff/a;->d:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lfd/h;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm/a;

    .line 5
    .line 6
    new-instance v1, Lb/e;

    .line 7
    .line 8
    new-instance v2, Lrf/c;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const-class v3, Lnf/d;

    .line 14
    .line 15
    invoke-static {v3}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/16 v4, 0x1d

    .line 20
    .line 21
    invoke-direct {v1, v2, v4, v3}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x7

    .line 25
    invoke-direct {v0, v1, v2}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lff/a;->b:Lm/a;

    .line 29
    .line 30
    iput-object p1, p0, Lff/a;->a:Lfd/h;

    .line 31
    .line 32
    return-void
.end method

.method public static b([B[B)Z
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    array-length v1, p0

    .line 3
    const/4 v2, 0x0

    .line 4
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    move v1, v2

    .line 8
    :goto_0
    if-ge v1, v0, :cond_2

    .line 9
    .line 10
    aget-byte v3, p0, v1

    .line 11
    .line 12
    aget-byte v4, p1, v1

    .line 13
    .line 14
    if-eq v3, v4, :cond_1

    .line 15
    .line 16
    :goto_1
    return v2

    .line 17
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 p0, 0x1

    .line 21
    return p0
.end method


# virtual methods
.method public final a(Ljava/io/File;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    sget-object v0, Lff/a;->c:Lmh/b;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lff/a;->b:Lm/a;

    .line 9
    .line 10
    invoke-virtual {v2, p1}, Lm/a;->r(Ljava/io/File;)Lnf/c;

    .line 11
    .line 12
    .line 13
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 14
    :try_start_1
    iget-object v3, v2, Lnf/c;->h:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_5

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Lnf/a;

    .line 31
    .line 32
    invoke-interface {v4}, Lnf/a;->isDirectory()Z

    .line 33
    .line 34
    .line 35
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :try_start_2
    invoke-interface {v4}, Lnf/a;->a()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    invoke-interface {v4}, Lnf/a;->getBytes()[B

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v4}, Lnf/a;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    sget-object v7, Ljf/c;->a:[B

    .line 54
    .line 55
    invoke-static {v5, v7}, Lff/a;->b([B[B)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    const-string v7, ".dex"

    .line 62
    .line 63
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    invoke-virtual {p0, v6, v5}, Lff/a;->d(Ljava/lang/String;[B)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    goto :goto_2

    .line 78
    :catchall_0
    move-exception v3

    .line 79
    goto :goto_4

    .line 80
    :catch_0
    move-exception v5

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    invoke-interface {v4}, Lnf/a;->b()Ljava/io/InputStream;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v4}, Lnf/a;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const/4 v7, 0x0

    .line 91
    invoke-virtual {p0, v7, v5, v6}, Lff/a;->c(Ljava/io/File;Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-nez v6, :cond_0

    .line 100
    .line 101
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :goto_3
    :try_start_3
    const-string v6, "Failed to read zip entry: {}"

    .line 106
    .line 107
    invoke-interface {v0, v4, v6, v5}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    :try_start_4
    invoke-virtual {v2}, Lnf/c;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 112
    .line 113
    .line 114
    goto :goto_7

    .line 115
    :catch_1
    move-exception v2

    .line 116
    goto :goto_6

    .line 117
    :goto_4
    if-eqz v2, :cond_6

    .line 118
    .line 119
    :try_start_5
    invoke-virtual {v2}, Lnf/c;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :catchall_1
    move-exception v2

    .line 124
    :try_start_6
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :cond_6
    :goto_5
    throw v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 128
    :goto_6
    const-string v3, "Failed to process zip file: {}"

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {v0, p1, v3, v2}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :goto_7
    return-object v1
.end method

.method public final c(Ljava/io/File;Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/io/InputStream;->markSupported()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 11
    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :goto_0
    const/4 v0, 0x4

    .line 15
    :try_start_0
    new-array v1, v0, [B

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->mark(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v1}, Ljava/io/InputStream;->read([B)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eq v2, v0, :cond_1

    .line 25
    .line 26
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_1
    :try_start_1
    sget-object v0, Ljf/c;->a:[B

    .line 36
    .line 37
    invoke-static {v1, v0}, Lff/a;->b([B[B)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, -0x1

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/io/InputStream;->reset()V

    .line 46
    .line 47
    .line 48
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 51
    .line 52
    .line 53
    const/16 v0, 0x2000

    .line 54
    .line 55
    new-array v0, v0, [B

    .line 56
    .line 57
    :goto_1
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-ne v1, v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p3, p1}, Lff/a;->d(Ljava/lang/String;[B)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_2
    :try_start_2
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const-string v0, ".dex"

    .line 80
    .line 81
    invoke-virtual {p3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-static {v1}, Lbf/b;->a([B)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v4, Ljava/lang/String;

    .line 92
    .line 93
    sget-object v5, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 94
    .line 95
    invoke-direct {v4, v1, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 96
    .line 97
    .line 98
    sget-object v5, Lff/a;->c:Lmh/b;

    .line 99
    .line 100
    const-string v6, "Invalid DEX magic: 0x{}(\"{}\") in file: {}"

    .line 101
    .line 102
    filled-new-array {v0, v4, p3}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {v5, v6, v0}, Lmh/b;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    if-eqz p1, :cond_8

    .line 110
    .line 111
    sget-object v0, Ljf/c;->b:[B

    .line 112
    .line 113
    invoke-static {v1, v0}, Lff/a;->b([B[B)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_7

    .line 118
    .line 119
    sget-object v0, Lyc/a;->a:Ljava/util/Set;

    .line 120
    .line 121
    const/16 v0, 0x2e

    .line 122
    .line 123
    invoke-virtual {p3, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-ne v0, v3, :cond_5

    .line 128
    .line 129
    const/4 p3, 0x0

    .line 130
    goto :goto_2

    .line 131
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    :goto_2
    if-nez p3, :cond_6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    sget-object v0, Lyc/a;->a:Ljava/util/Set;

    .line 141
    .line 142
    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    :goto_3
    if-eqz v2, :cond_8

    .line 147
    .line 148
    :cond_7
    invoke-virtual {p0, p1}, Lff/a;->a(Ljava/io/File;)Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 153
    .line 154
    .line 155
    return-object p1

    .line 156
    :cond_8
    :try_start_3
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :goto_4
    :try_start_4
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :catchall_1
    move-exception p2

    .line 167
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    :goto_5
    throw p1
.end method

.method public final d(Ljava/lang/String;[B)Ljava/util/List;
    .locals 5

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    invoke-static {p2, v0}, Lx6/d;->e0([BI)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x78

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v0, 0x20

    .line 14
    .line 15
    invoke-static {p2, v0}, Lx6/d;->e0([BI)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x70

    .line 20
    .line 21
    invoke-static {p2, v1}, Lx6/d;->e0([BI)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x74

    .line 26
    .line 27
    invoke-static {p2, v2}, Lx6/d;->e0([BI)I

    .line 28
    .line 29
    .line 30
    new-instance v2, Lb5/k;

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-direct {v2, v0, v1, v3}, Lb5/k;-><init>(III)V

    .line 34
    .line 35
    .line 36
    move-object v0, v2

    .line 37
    :goto_0
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget v2, v0, Lb5/k;->b:I

    .line 41
    .line 42
    iget v0, v0, Lb5/k;->c:I

    .line 43
    .line 44
    array-length v3, p2

    .line 45
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    if-lt v2, v0, :cond_1

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, Ld4/b;

    .line 68
    .line 69
    invoke-direct {v1, p0, p1, p2}, Ld4/b;-><init>(Lff/a;Ljava/lang/String;[B)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Ljava/util/List;

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_1
    add-int/lit8 v1, v2, 0x20

    .line 88
    .line 89
    invoke-static {p2, v1}, Lx6/d;->e0([BI)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/2addr v1, v2

    .line 94
    move v4, v2

    .line 95
    move v2, v1

    .line 96
    move v1, v4

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {p0, p1, p2, v1}, Lff/a;->e(Ljava/lang/String;[BI)Lff/e;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1
.end method

.method public final e(Ljava/lang/String;[BI)Lff/e;
    .locals 5

    .line 1
    iget-object v0, p0, Lff/a;->a:Lfd/h;

    .line 2
    .line 3
    iget-boolean v0, v0, Lfd/h;->g:Z

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    add-int/lit8 v0, p3, 0x20

    .line 8
    .line 9
    add-int/lit8 v1, p3, 0x24

    .line 10
    .line 11
    array-length v2, p2

    .line 12
    if-gt v1, v2, :cond_2

    .line 13
    .line 14
    invoke-static {p2, v0}, Lx6/d;->e0([BI)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int v1, p3, v0

    .line 19
    .line 20
    array-length v2, p2

    .line 21
    if-gt v1, v2, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, p3, 0x8

    .line 24
    .line 25
    invoke-static {p2, v1}, Lx6/d;->e0([BI)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    new-instance v2, Ljava/util/zip/Adler32;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/zip/Adler32;-><init>()V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v3, p3, 0xc

    .line 35
    .line 36
    add-int/lit8 v0, v0, -0xc

    .line 37
    .line 38
    invoke-virtual {v2, p2, v3, v0}, Ljava/util/zip/Adler32;->update([BII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/zip/Adler32;->getValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    long-to-int v0, v2

    .line 46
    if-ne v1, v0, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p2, Laf/d;

    .line 50
    .line 51
    const-string p3, "Bad dex file checksum: 0x%08x, expected: 0x%08x, file: %s"

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p2

    .line 73
    :cond_1
    new-instance p2, Laf/d;

    .line 74
    .line 75
    new-instance p3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, "Dex file truncated, length in header: "

    .line 78
    .line 79
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, ", file: "

    .line 86
    .line 87
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p2

    .line 101
    :cond_2
    new-instance p2, Laf/d;

    .line 102
    .line 103
    const-string p3, "Dex file truncated, can\'t read file length, file: "

    .line 104
    .line 105
    invoke-static {p3, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p2

    .line 113
    :cond_3
    :goto_0
    new-instance v0, Lff/e;

    .line 114
    .line 115
    const-class v1, Lff/a;

    .line 116
    .line 117
    monitor-enter v1

    .line 118
    :try_start_0
    sget v2, Lff/a;->d:I

    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    add-int/2addr v2, v3

    .line 122
    sput v2, Lff/a;->d:I

    .line 123
    .line 124
    const v4, 0xffff

    .line 125
    .line 126
    .line 127
    if-lt v2, v4, :cond_4

    .line 128
    .line 129
    sput v3, Lff/a;->d:I

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :catchall_0
    move-exception p1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    :goto_1
    sget v2, Lff/a;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    monitor-exit v1

    .line 137
    invoke-direct {v0, v2, p1, p2, p3}, Lff/e;-><init>(ILjava/lang/String;[BI)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    throw p1
.end method
