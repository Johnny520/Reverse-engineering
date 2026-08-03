.class public final Lb7/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lb7/a;


# instance fields
.field public a:La7/d;

.field public b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb7/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb7/a;->c:Lb7/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()La7/d;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb7/a;->a:La7/d;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    monitor-exit p0

    .line 8
    return-object v0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0}, La7/d;->x()Z

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object v0

    .line 16
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v0
.end method

.method public final b()Ljava/util/Map;
    .locals 5

    .line 1
    iget-object v0, p0, Lb7/a;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x24

    .line 13
    .line 14
    const/16 v2, 0x17

    .line 15
    .line 16
    :goto_0
    if-ge v2, v1, :cond_3

    .line 17
    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v4, "/frameworks/android/android-"

    .line 21
    .line 22
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v4, ".apk"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-class v4, Lb7/a;

    .line 38
    .line 39
    invoke-virtual {v4, v3}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 40
    .line 41
    .line 42
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    :catch_0
    :try_start_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v2, 0x1

    .line 57
    .line 58
    if-ne v3, v1, :cond_2

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    iput-object v0, p0, Lb7/a;->b:Ljava/util/HashMap;

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-object v0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    throw v0
.end method

.method public final c(I)La7/d;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lb7/a;->b()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    const/16 p1, 0x2f

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-gez p1, :cond_0

    .line 26
    .line 27
    sget-char p1, Ljava/io/File;->separatorChar:C

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :cond_0
    if-lez p1, :cond_1

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object p1, v0

    .line 43
    :goto_0
    const/16 v1, 0x2e

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    if-ltz v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_2
    const-class v1, La7/a;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Lc7/a;

    .line 63
    .line 64
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 67
    .line 68
    .line 69
    const v4, 0xfa000

    .line 70
    .line 71
    .line 72
    new-array v5, v4, [B

    .line 73
    .line 74
    :cond_3
    :goto_1
    array-length v6, v5

    .line 75
    invoke-virtual {v0, v5, v2, v6}, Ljava/io/InputStream;->read([BII)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-ltz v6, :cond_4

    .line 80
    .line 81
    invoke-virtual {v3, v5, v2, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 82
    .line 83
    .line 84
    array-length v7, v5

    .line 85
    if-ne v6, v7, :cond_3

    .line 86
    .line 87
    const v6, 0x9c4000

    .line 88
    .line 89
    .line 90
    if-ge v7, v6, :cond_3

    .line 91
    .line 92
    add-int/2addr v7, v4

    .line 93
    new-array v5, v7, [B

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v2, Li7/d;

    .line 107
    .line 108
    invoke-direct {v2, v0}, Li7/d;-><init>([B)V

    .line 109
    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-direct {v1, v2, v0}, Lc7/a;-><init>(Li7/f;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Lc7/a;->a()Lc7/f;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v1, La7/d;

    .line 120
    .line 121
    invoke-direct {v1, p1, v0}, La7/d;-><init>(Ljava/lang/String;Lc7/f;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, La7/d;->w()V

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    :cond_5
    const-string v0, "No resource found for version: "

    .line 129
    .line 130
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    return-object p1
.end method
