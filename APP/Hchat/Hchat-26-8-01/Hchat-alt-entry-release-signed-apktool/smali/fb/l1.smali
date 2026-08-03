.class public final Lfb/l1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:Log/k;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/io/File;

.field public final c:Lfb/k1;

.field public d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "classes(\\d*)\\.dex"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lfb/l1;->e:Log/k;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lfb/l1;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "SHA-256"

    .line 9
    .line 10
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->digest([B)[B

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v1, Lfb/g0;

    .line 31
    .line 32
    const/16 v2, 0x12

    .line 33
    .line 34
    invoke-direct {v1, v2}, Lfb/g0;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v1}, Ltf/l;->E0([BLfg/l;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const/16 v1, 0x18

    .line 42
    .line 43
    invoke-static {v1, p2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const-string v1, ".json"

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lfb/l1;->b:Ljava/io/File;

    .line 57
    .line 58
    new-instance p1, Lfb/k1;

    .line 59
    .line 60
    const/4 p2, 0x1

    .line 61
    const/4 v0, 0x0

    .line 62
    const/16 v1, 0x40

    .line 63
    .line 64
    const/high16 v2, 0x3f400000    # 0.75f

    .line 65
    .line 66
    invoke-direct {p1, v1, v2, p2, v0}, Lfb/k1;-><init>(IFZI)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lfb/l1;->c:Lfb/k1;

    .line 70
    .line 71
    const-string p1, ""

    .line 72
    .line 73
    iput-object p1, p0, Lfb/l1;->d:Ljava/lang/String;

    .line 74
    .line 75
    return-void
.end method

.method public static final a(Lfb/l1;Ljava/lang/String;)I
    .locals 0

    .line 1
    const-string p0, "classes"

    .line 2
    .line 3
    invoke-static {p1, p0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string p1, ".dex"

    .line 8
    .line 9
    invoke-static {p0, p1}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/16 p1, 0xa

    .line 22
    .line 23
    invoke-static {p1, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_1
    const p0, 0x7fffffff

    .line 35
    .line 36
    .line 37
    return p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x4c

    .line 16
    .line 17
    invoke-static {p0, v0}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x3b

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-static {p0, v2}, Log/m;->l0(Ljava/lang/CharSequence;C)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const/16 v1, 0x2e

    .line 33
    .line 34
    const/16 v3, 0x2f

    .line 35
    .line 36
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    new-array v3, v1, [C

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    aput-char v0, v3, v4

    .line 48
    .line 49
    invoke-static {p0, v3}, Log/m;->W0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-array v0, v1, [C

    .line 54
    .line 55
    aput-char v2, v0, v4

    .line 56
    .line 57
    invoke-static {p0, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string v0, "L"

    .line 62
    .line 63
    const-string v1, ";"

    .line 64
    .line 65
    invoke-static {v0, p0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_1
    const-string p0, "\u7c7b descriptor \u4e3a\u7a7a"

    .line 71
    .line 72
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method

.method public static h(Lk5/u;)La5/a;
    .locals 3

    .line 1
    new-instance v0, La5/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, La5/a;-><init>(BI)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0xf

    .line 9
    .line 10
    iput v1, v0, La5/a;->h:I

    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, La5/a;->i:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object p0, p0, Lk5/u;->c:Lf5/g;

    .line 20
    .line 21
    iget p0, p0, Lf5/g;->b:I

    .line 22
    .line 23
    iput p0, v0, La5/a;->h:I

    .line 24
    .line 25
    return-object v0
.end method

.method public static j(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)Lk5/u;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of p1, p0, Ljava/io/BufferedInputStream;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    check-cast p0, Ljava/io/BufferedInputStream;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/io/BufferedInputStream;

    .line 16
    .line 17
    const/16 v0, 0x2000

    .line 18
    .line 19
    invoke-direct {p1, p0, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 20
    .line 21
    .line 22
    move-object p0, p1

    .line 23
    :goto_0
    :try_start_0
    invoke-static {p0}, Lk5/u;->a(Ljava/io/BufferedInputStream;)Lk5/u;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v0

    .line 34
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "offset"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p4, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {v2, v1, v3}, Lr9/e0;->r(III)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-string v3, "max_chars"

    .line 17
    .line 18
    const/16 v4, 0x5dc0

    .line 19
    .line 20
    invoke-virtual {p4, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    const/16 v3, 0x3e8

    .line 25
    .line 26
    const v4, 0x1d4c0

    .line 27
    .line 28
    .line 29
    invoke-static {p4, v3, v4}, Lr9/e0;->r(III)I

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    add-int/2addr p4, v2

    .line 34
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-le p4, v3, :cond_0

    .line 39
    .line 40
    move p4, v3

    .line 41
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x1

    .line 46
    if-ge p4, v3, :cond_1

    .line 47
    .line 48
    add-int/lit8 v3, p4, -0x1

    .line 49
    .line 50
    const/4 v5, 0x4

    .line 51
    const/16 v6, 0xa

    .line 52
    .line 53
    invoke-static {p3, v6, v3, v5}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/lit16 v5, v2, 0x3e8

    .line 58
    .line 59
    if-lt v3, v5, :cond_1

    .line 60
    .line 61
    add-int/lit8 p4, v3, 0x1

    .line 62
    .line 63
    :cond_1
    new-instance v3, Lorg/json/JSONObject;

    .line 64
    .line 65
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v5, "ok"

    .line 69
    .line 70
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v5, "descriptor"

    .line 74
    .line 75
    invoke-virtual {v3, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string p1, "sourceEntry"

    .line 79
    .line 80
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    const-string p1, "sourcePath"

    .line 84
    .line 85
    iget-object p2, p0, Lfb/l1;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    const-string p1, "returnedLength"

    .line 94
    .line 95
    sub-int p2, p4, v2

    .line 96
    .line 97
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    const-string p1, "totalLength"

    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-ge p4, p1, :cond_2

    .line 114
    .line 115
    move v1, v4

    .line 116
    :cond_2
    const-string p1, "truncated"

    .line 117
    .line 118
    invoke-virtual {v3, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-ge p4, p1, :cond_3

    .line 126
    .line 127
    const-string p1, "nextOffset"

    .line 128
    .line 129
    invoke-virtual {v3, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    :cond_3
    const-string p1, "smali"

    .line 133
    .line 134
    invoke-virtual {p3, v2, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    return-object p1
.end method

.method public final d(Ljava/util/zip/ZipFile;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Lm1/f0;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lm1/f0;-><init>(Ljava/util/Enumeration;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lng/m;->R(Ljava/util/Iterator;)Lng/j;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lfb/g0;

    .line 18
    .line 19
    const/16 v1, 0x11

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lfb/g0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lng/i;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-direct {v1, p1, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Lc9/a0;

    .line 31
    .line 32
    const/16 v0, 0xe

    .line 33
    .line 34
    invoke-direct {p1, p0, v0}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v0}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p1}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_1

    .line 70
    .line 71
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    move-object p1, v1

    .line 99
    :goto_1
    return-object p1
.end method

.method public final e(Ljava/lang/String;Lfb/b;)Lfb/i1;
    .locals 9

    .line 1
    iget-object v0, p0, Lfb/l1;->c:Lfb/k1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfb/l1;->k()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/zip/ZipFile;

    .line 7
    .line 8
    iget-object v2, p0, Lfb/l1;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v0, p1}, Lfb/k1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-static {v1, v4}, Lfb/l1;->j(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)Lk5/u;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, Lk5/q;

    .line 36
    .line 37
    invoke-direct {v5, v4}, Lk5/q;-><init>(Lk5/u;)V

    .line 38
    .line 39
    .line 40
    new-instance v6, Lo5/n;

    .line 41
    .line 42
    invoke-direct {v6, v5}, Lo5/n;-><init>(Lo5/o;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {v6}, Lo5/n;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    invoke-virtual {v6}, Lo5/n;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    move-object v7, v5

    .line 56
    check-cast v7, Lk5/o;

    .line 57
    .line 58
    invoke-virtual {v7}, Lk5/o;->getType()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-static {v7, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_1
    move-object v5, v3

    .line 73
    :goto_0
    check-cast v5, Lk5/o;

    .line 74
    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    new-instance p1, Lfb/i1;

    .line 78
    .line 79
    invoke-direct {p1, v2, v4, v5}, Lfb/i1;-><init>(Ljava/lang/String;Lk5/u;Lk5/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_2
    :try_start_1
    invoke-virtual {v0, p1}, Lfb/k1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lfb/l1;->l()V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p0, v1}, Lfb/l1;->d(Ljava/util/zip/ZipFile;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Ljava/util/zip/ZipEntry;

    .line 111
    .line 112
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v4}, Lfb/l1;->j(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)Lk5/u;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    new-instance v6, Lk5/q;

    .line 120
    .line 121
    invoke-direct {v6, v5}, Lk5/q;-><init>(Lk5/u;)V

    .line 122
    .line 123
    .line 124
    new-instance v7, Lo5/n;

    .line 125
    .line 126
    invoke-direct {v7, v6}, Lo5/n;-><init>(Lo5/o;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    invoke-virtual {v7}, Lo5/n;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_6

    .line 134
    .line 135
    invoke-virtual {v7}, Lo5/n;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    move-object v8, v6

    .line 140
    check-cast v8, Lk5/o;

    .line 141
    .line 142
    invoke-virtual {v8}, Lk5/o;->getType()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-static {v8, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_5

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_6
    move-object v6, v3

    .line 154
    :goto_1
    check-cast v6, Lk5/o;

    .line 155
    .line 156
    if-eqz v6, :cond_4

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lfb/l1;->l()V

    .line 166
    .line 167
    .line 168
    new-instance p1, Lfb/i1;

    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-direct {p1, p2, v5, v6}, Lfb/i1;-><init>(Ljava/lang/String;Lk5/u;Lk5/o;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V

    .line 181
    .line 182
    .line 183
    return-object p1

    .line 184
    :cond_7
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V

    .line 185
    .line 186
    .line 187
    return-object v3

    .line 188
    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 189
    :catchall_1
    move-exception p2

    .line 190
    invoke-static {v1, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    throw p2
.end method

.method public final f(Ljava/util/List;Lfb/b;)Ljava/util/Map;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1}, Lfb/l1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    sget-object p1, Ltf/u;->g:Ltf/u;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lfb/l1;->k()V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v1, Ljava/util/zip/ZipFile;

    .line 48
    .line 49
    iget-object v2, p0, Lfb/l1;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const/4 v3, 0x0

    .line 59
    move v4, v3

    .line 60
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    iget-object v6, p0, Lfb/l1;->c:Lfb/k1;

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v6, v5}, Lfb/k1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    check-cast v8, Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v8, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1, v8}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    if-eqz v9, :cond_3

    .line 88
    .line 89
    invoke-interface {p1, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_3
    invoke-virtual {v6, v5}, Lfb/k1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move v4, v7

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_6

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    move-object v8, v5

    .line 121
    check-cast v8, Ljava/lang/String;

    .line 122
    .line 123
    invoke-interface {p1, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-nez v8, :cond_5

    .line 128
    .line 129
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    invoke-virtual {p0, v1}, Lfb/l1;->d(Ljava/util/zip/ZipFile;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_c

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    check-cast v5, Ljava/util/zip/ZipEntry;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-eqz v8, :cond_8

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_8
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v5}, Lfb/l1;->j(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)Lk5/u;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    new-instance v9, Lk5/q;

    .line 168
    .line 169
    invoke-direct {v9, v8}, Lk5/q;-><init>(Lk5/u;)V

    .line 170
    .line 171
    .line 172
    new-instance v8, Lo5/n;

    .line 173
    .line 174
    invoke-direct {v8, v9}, Lo5/n;-><init>(Lo5/o;)V

    .line 175
    .line 176
    .line 177
    move v9, v3

    .line 178
    :goto_4
    invoke-virtual {v8}, Lo5/n;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-eqz v10, :cond_7

    .line 183
    .line 184
    invoke-virtual {v8}, Lo5/n;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    check-cast v10, Lk5/o;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-eqz v11, :cond_9

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_9
    add-int/lit8 v11, v9, 0x1

    .line 198
    .line 199
    rem-int/lit16 v9, v9, 0x800

    .line 200
    .line 201
    if-nez v9, :cond_a

    .line 202
    .line 203
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 204
    .line 205
    .line 206
    :cond_a
    invoke-virtual {v10}, Lk5/o;->getType()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-virtual {v2, v9}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    if-eqz v9, :cond_b

    .line 215
    .line 216
    invoke-virtual {v10}, Lk5/o;->getType()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-interface {p1, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v10}, Lk5/o;->getType()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-virtual {v6, v4, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    .line 237
    .line 238
    move v4, v7

    .line 239
    :cond_b
    move v9, v11

    .line 240
    goto :goto_4

    .line 241
    :cond_c
    :goto_5
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V

    .line 242
    .line 243
    .line 244
    if-eqz v4, :cond_d

    .line 245
    .line 246
    invoke-virtual {p0}, Lfb/l1;->l()V

    .line 247
    .line 248
    .line 249
    :cond_d
    return-object p1

    .line 250
    :goto_6
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 251
    :catchall_1
    move-exception p2

    .line 252
    invoke-static {v1, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    throw p2
.end method

.method public final g(Ljava/lang/String;Lfb/b;)Lfb/j1;
    .locals 4

    .line 1
    const-string v0, "Dex \u6761\u76ee\u4e0d\u5b58\u5728: "

    .line 2
    .line 3
    invoke-static {p1}, Lfb/l1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lfb/l1;->e(Ljava/lang/String;Lfb/b;)Lfb/i1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-object v1, v1, Lfb/i1;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p2}, Lfb/b;->d()V

    .line 16
    .line 17
    .line 18
    new-instance p2, Ljava/util/zip/ZipFile;

    .line 19
    .line 20
    iget-object v2, p0, Lfb/l1;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {p2, v2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p2, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2, v2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    instance-of v2, v0, Ljava/io/BufferedInputStream;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    check-cast v0, Ljava/io/BufferedInputStream;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 48
    .line 49
    const/16 v3, 0x2000

    .line 50
    .line 51
    invoke-direct {v2, v0, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    move-object v0, v2

    .line 55
    :goto_0
    :try_start_1
    invoke-static {v0}, Lg4/a;->G(Ljava/io/InputStream;)[B

    .line 56
    .line 57
    .line 58
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/util/zip/ZipFile;->close()V

    .line 63
    .line 64
    .line 65
    new-instance p2, Lfb/j1;

    .line 66
    .line 67
    invoke-direct {p2, p1, v1, v2}, Lfb/j1;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 68
    .line 69
    .line 70
    return-object p2

    .line 71
    :catchall_1
    move-exception p1

    .line 72
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 73
    :catchall_2
    move-exception v1

    .line 74
    :try_start_4
    invoke-static {v0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 88
    :goto_1
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 89
    :catchall_3
    move-exception v0

    .line 90
    invoke-static {p2, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_2
    const-string p2, "\u6ca1\u6709\u627e\u5230\u7c7b: "

    .line 95
    .line 96
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    return-object p1
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfb/l1;->b:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lfb/h1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2}, Lfb/h1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    new-array v0, v0, [Ljava/io/File;

    .line 25
    .line 26
    :cond_1
    new-instance v1, Lfb/r;

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lfb/r;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Ltf/l;->H0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/16 v1, 0x8

    .line 38
    .line 39
    invoke-static {v1, v0}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/io/File;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 12

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lfb/l1;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    new-instance v6, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, ":"

    .line 25
    .line 26
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, p0, Lfb/l1;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_4

    .line 43
    .line 44
    iget-object v3, p0, Lfb/l1;->c:Lfb/k1;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/util/AbstractMap;->clear()V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lfb/l1;->d:Ljava/lang/String;

    .line 50
    .line 51
    const-string v2, ""

    .line 52
    .line 53
    iget-object v4, p0, Lfb/l1;->b:Ljava/io/File;

    .line 54
    .line 55
    :try_start_0
    new-instance v5, Landroid/util/AtomicFile;

    .line 56
    .line 57
    invoke-direct {v5, v4}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/util/AtomicFile;->openRead()Ljava/io/FileInputStream;

    .line 61
    .line 62
    .line 63
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :try_start_1
    new-instance v6, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v5}, Lg4/a;->G(Ljava/io/InputStream;)[B

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    sget-object v8, Log/a;->a:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    invoke-direct {v6, v7, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    :try_start_2
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    .line 79
    .line 80
    .line 81
    new-instance v5, Lorg/json/JSONObject;

    .line 82
    .line 83
    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v6, "schema"

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v7, 0x1

    .line 94
    if-ne v6, v7, :cond_2

    .line 95
    .line 96
    const-string v6, "apkPath"

    .line 97
    .line 98
    invoke-virtual {v5, v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v6, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    const-string v1, "apkLength"

    .line 109
    .line 110
    const-wide/16 v6, -0x1

    .line 111
    .line 112
    invoke-virtual {v5, v1, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v8

    .line 116
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 117
    .line 118
    .line 119
    move-result-wide v10

    .line 120
    cmp-long v1, v8, v10

    .line 121
    .line 122
    if-nez v1, :cond_2

    .line 123
    .line 124
    const-string v1, "apkLastModified"

    .line 125
    .line 126
    invoke-virtual {v5, v1, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    cmp-long v0, v6, v0

    .line 135
    .line 136
    if-eqz v0, :cond_0

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_0
    const-string v0, "entries"

    .line 140
    .line 141
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_3

    .line 159
    .line 160
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    check-cast v5, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const/16 v7, 0x4c

    .line 174
    .line 175
    invoke-static {v5, v7}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_1

    .line 180
    .line 181
    const/16 v7, 0x3b

    .line 182
    .line 183
    invoke-static {v5, v7}, Log/m;->l0(Ljava/lang/CharSequence;C)Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-eqz v7, :cond_1

    .line 188
    .line 189
    sget-object v7, Lfb/l1;->e:Log/k;

    .line 190
    .line 191
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v6}, Log/k;->d(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_1

    .line 199
    .line 200
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :catchall_0
    move-exception v0

    .line 205
    goto :goto_2

    .line 206
    :cond_2
    :goto_1
    new-instance v0, Landroid/util/AtomicFile;

    .line 207
    .line 208
    invoke-direct {v0, v4}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Landroid/util/AtomicFile;->delete()V

    .line 212
    .line 213
    .line 214
    :cond_3
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 219
    :catchall_2
    move-exception v1

    .line 220
    :try_start_4
    invoke-static {v5, v0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 224
    :goto_2
    new-instance v1, Lsf/f;

    .line 225
    .line 226
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    move-object v0, v1

    .line 230
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-eqz v0, :cond_4

    .line 235
    .line 236
    new-instance v0, Landroid/util/AtomicFile;

    .line 237
    .line 238
    invoke-direct {v0, v4}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Landroid/util/AtomicFile;->delete()V

    .line 242
    .line 243
    .line 244
    :cond_4
    return-void
.end method

.method public final l()V
    .locals 7

    .line 1
    iget-object v0, p0, Lfb/l1;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lfb/l1;->b:Ljava/io/File;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 12
    .line 13
    .line 14
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "schema"

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    const-string v4, "apkPath"

    .line 31
    .line 32
    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    const-string v0, "apkLength"

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-virtual {v3, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string v0, "apkLastModified"

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {v3, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    const-string v0, "entries"

    .line 54
    .line 55
    new-instance v2, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Lfb/l1;->c:Lfb/k1;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_1

    .line 75
    .line 76
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Ljava/util/Map$Entry;

    .line 81
    .line 82
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Ljava/lang/String;

    .line 87
    .line 88
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v2, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    new-instance v0, Landroid/util/AtomicFile;

    .line 102
    .line 103
    invoke-direct {v0, v1}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 107
    .line 108
    .line 109
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 110
    :try_start_1
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget-object v3, Log/a;->a:Ljava/nio/charset/Charset;

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    .line 132
    :try_start_2
    invoke-virtual {p0}, Lfb/l1;->i()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :catchall_0
    move-exception v2

    .line 137
    invoke-virtual {v0, v1}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 138
    .line 139
    .line 140
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 141
    :catchall_1
    return-void
.end method
