.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001J%\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ5\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000c\u0010\u000f\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
        "",
        "",
        "data",
        "",
        "totalLength",
        "",
        "",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf",
        "([BJ)[Ljava/lang/String;",
        "id",
        "chunks",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2",
        "(J[Ljava/lang/String;)Ljava/lang/String;",
        "Ljava/lang/Class;",
        "deobfuscatorClass",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170",
        "(J[Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;",
        "core"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final 飘花落叶言子楪世哲兰苏([BJ)[Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Ljava/io/DataInputStream;

    .line 5
    .line 6
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    const-wide/16 v1, 0x1ffe

    .line 15
    .line 16
    add-long/2addr v1, p1

    .line 17
    const-wide/16 v3, 0x1fff

    .line 18
    .line 19
    :try_start_1
    div-long/2addr v1, v3

    .line 20
    long-to-int p0, v1

    .line 21
    new-array v1, p0, [Ljava/lang/String;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    move v5, v2

    .line 25
    :goto_0
    if-ge v5, p0, :cond_0

    .line 26
    .line 27
    const-string v6, ""

    .line 28
    .line 29
    aput-object v6, v1, v5

    .line 30
    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-wide/16 v5, 0x0

    .line 35
    .line 36
    move p0, v2

    .line 37
    :goto_1
    cmp-long v7, v5, p1

    .line 38
    .line 39
    if-gez v7, :cond_2

    .line 40
    .line 41
    sub-long v7, p1, v5

    .line 42
    .line 43
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    long-to-int v7, v7

    .line 48
    new-array v8, v7, [C

    .line 49
    .line 50
    move v9, v2

    .line 51
    :goto_2
    if-ge v9, v7, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readChar()C

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    aput-char v10, v8, v9

    .line 58
    .line 59
    add-int/lit8 v9, v9, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    add-int/lit8 v9, p0, 0x1

    .line 63
    .line 64
    new-instance v10, Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v10, v8}, Ljava/lang/String;-><init>([C)V

    .line 67
    .line 68
    .line 69
    aput-object v10, v1, p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    int-to-long v7, v7

    .line 72
    add-long/2addr v5, v7

    .line 73
    move p0, v9

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    :try_start_4
    invoke-static {v0, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 86
    :catch_0
    move-exception p0

    .line 87
    const-string p1, "Failed to load obfuscated strings"

    .line 88
    .line 89
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(J[Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide v0, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    and-long/2addr v0, p0

    .line 10
    invoke-static {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    ushr-long v3, v0, v2

    .line 21
    .line 22
    const-wide/32 v5, 0xffff

    .line 23
    .line 24
    .line 25
    and-long/2addr v3, v5

    .line 26
    invoke-static {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const/16 v7, 0x10

    .line 31
    .line 32
    ushr-long v7, v0, v7

    .line 33
    .line 34
    const-wide v9, 0xffff0000L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v7, v9

    .line 40
    ushr-long/2addr p0, v2

    .line 41
    xor-long/2addr p0, v3

    .line 42
    xor-long/2addr p0, v7

    .line 43
    long-to-int p0, p0

    .line 44
    invoke-static {p0, p2, v0, v1, p3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(I[Ljava/lang/String;JLjava/lang/Class;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    ushr-long v3, v0, v2

    .line 49
    .line 50
    and-long/2addr v3, v5

    .line 51
    long-to-int p1, v3

    .line 52
    new-array v3, p1, [C

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    :goto_0
    if-ge v4, p1, :cond_0

    .line 56
    .line 57
    add-int v7, p0, v4

    .line 58
    .line 59
    add-int/lit8 v7, v7, 0x1

    .line 60
    .line 61
    invoke-static {v7, p2, v0, v1, p3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(I[Ljava/lang/String;JLjava/lang/Class;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    ushr-long v7, v0, v2

    .line 66
    .line 67
    and-long/2addr v7, v5

    .line 68
    long-to-int v7, v7

    .line 69
    int-to-char v7, v7

    .line 70
    aput-char v7, v3, v4

    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    .line 78
    .line 79
    .line 80
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(J[Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide v0, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    and-long/2addr v0, p0

    .line 10
    invoke-static {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    ushr-long v3, v0, v2

    .line 21
    .line 22
    const-wide/32 v5, 0xffff

    .line 23
    .line 24
    .line 25
    and-long/2addr v3, v5

    .line 26
    invoke-static {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const/16 v7, 0x10

    .line 31
    .line 32
    ushr-long v7, v0, v7

    .line 33
    .line 34
    const-wide v9, 0xffff0000L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v7, v9

    .line 40
    ushr-long/2addr p0, v2

    .line 41
    xor-long/2addr p0, v3

    .line 42
    xor-long/2addr p0, v7

    .line 43
    long-to-int p0, p0

    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-static {p0, p2, v0, v1, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(I[Ljava/lang/String;JLjava/lang/Class;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    ushr-long v3, v0, v2

    .line 50
    .line 51
    and-long/2addr v3, v5

    .line 52
    long-to-int v3, v3

    .line 53
    new-array v4, v3, [C

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    :goto_0
    if-ge v7, v3, :cond_0

    .line 57
    .line 58
    add-int v8, p0, v7

    .line 59
    .line 60
    add-int/lit8 v8, v8, 0x1

    .line 61
    .line 62
    invoke-static {v8, p2, v0, v1, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(I[Ljava/lang/String;JLjava/lang/Class;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    ushr-long v8, v0, v2

    .line 67
    .line 68
    and-long/2addr v8, v5

    .line 69
    long-to-int v8, v8

    .line 70
    int-to-char v8, v8

    .line 71
    aput-char v8, v4, v7

    .line 72
    .line 73
    add-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {p0, v4}, Ljava/lang/String;-><init>([C)V

    .line 79
    .line 80
    .line 81
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(I[Ljava/lang/String;JLjava/lang/Class;)J
    .locals 5

    .line 1
    invoke-static {p2, p3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p2

    .line 5
    div-int/lit16 v0, p0, 0x1fff

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    if-ltz v0, :cond_3

    .line 10
    .line 11
    array-length v3, p1

    .line 12
    if-ge v0, v3, :cond_3

    .line 13
    .line 14
    aget-object v3, p1, v0

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    if-eqz p4, :cond_0

    .line 19
    .line 20
    :try_start_0
    const-string v3, "ensureChunkLoaded"

    .line 21
    .line 22
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p4, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {p4, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-object v3, p4

    .line 49
    check-cast v3, Ljava/lang/String;

    .line 50
    .line 51
    aput-object v3, p1, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p0

    .line 55
    const-string p1, "Failed to load chunk "

    .line 56
    .line 57
    invoke-static {v0, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-wide v1

    .line 65
    :cond_0
    const-string p0, "Chunk is null at index: "

    .line 66
    .line 67
    invoke-static {v0, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-wide v1

    .line 75
    :cond_1
    :goto_0
    mul-int/lit16 v0, v0, 0x1fff

    .line 76
    .line 77
    sub-int/2addr p0, v0

    .line 78
    if-ltz p0, :cond_2

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-ge p0, p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v3, p0}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    int-to-long p0, p0

    .line 91
    const/16 p4, 0x20

    .line 92
    .line 93
    shl-long/2addr p0, p4

    .line 94
    xor-long/2addr p0, p2

    .line 95
    return-wide p0

    .line 96
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const-string p2, "Index in chunk out of bounds: "

    .line 101
    .line 102
    const-string p3, ", chunk length: "

    .line 103
    .line 104
    invoke-static {p0, p1, p2, p3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-wide v1

    .line 112
    :cond_3
    const-string p0, "Chunk index out of bounds: "

    .line 113
    .line 114
    invoke-static {v0, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-wide v1
.end method
