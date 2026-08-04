.class public final Lyyds/ᛱᛴᲇᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/List;

.field public final ᛲᲈᲁ:Ljava/lang/ThreadLocal;

.field public final ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛳᲈᛱᲀ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

.field public final ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Lyyds/ᲇᲇᲀᲈ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 90
    sget-object v0, Lyyds/ᛲᲀᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲀᛵ;

    invoke-direct {p0, v0}, Lyyds/ᛱᛴᲇᲀ;-><init>(Lyyds/ᛲᲀᛵ;)V

    return-void
.end method

.method public constructor <init>(Lyyds/ᛲᲀᛵ;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛱᛴᲇᲀ;->ᛲᲈᲁ:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛱᛴᲇᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    iget-object v0, p1, Lyyds/ᛲᲀᛵ;->ᛲᲈᲁ:Lyyds/ᲁᛲᛳᛳ;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    iget-object v1, p1, Lyyds/ᛲᲀᛵ;->ᛵᛸᛸᛷ:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, p0, Lyyds/ᛱᛴᲇᲀ;->ᲇᲇᲇᛱ:Z

    .line 29
    .line 30
    iget-object v1, p1, Lyyds/ᛲᲀᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲈᛱᲀ;

    .line 31
    .line 32
    iput-object v1, p0, Lyyds/ᛱᛴᲇᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲈᛱᲀ;

    .line 33
    .line 34
    iget-object v1, p1, Lyyds/ᛲᲀᛵ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static {v1}, Lyyds/ᛲᲀᛵ;->ᛵᛸᛸᛷ(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    iget-object v1, p1, Lyyds/ᛲᲀᛵ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static {v1}, Lyyds/ᛲᲀᛵ;->ᛵᛸᛸᛷ(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    iget-object v1, p1, Lyyds/ᛲᲀᛵ;->ᲇᲇᲇᛱ:Ljava/util/ArrayDeque;

    .line 45
    .line 46
    invoke-static {v1}, Lyyds/ᛲᲀᛵ;->ᛵᛸᛸᛷ(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v2, Lyyds/ᛲᲀᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲀᛵ;

    .line 51
    .line 52
    if-ne p1, v2, :cond_0

    .line 53
    .line 54
    sget-object p1, Lyyds/ᛲᲀᛵ;->ᛷᛲᲈᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 55
    .line 56
    iput-object p1, p0, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

    .line 57
    .line 58
    sget-object p1, Lyyds/ᛲᲀᛵ;->ᛷᛵᲇᲀ:Lyyds/ᲇᲇᲀᲈ;

    .line 59
    .line 60
    iput-object p1, p0, Lyyds/ᛱᛴᲇᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲇᲀᲈ;

    .line 61
    .line 62
    sget-object p1, Lyyds/ᛲᲀᛵ;->ᛱᛳᲇ:Ljava/util/List;

    .line 63
    .line 64
    iput-object p1, p0, Lyyds/ᛱᛴᲇᲀ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    new-instance v2, Lyyds/ᲀᲈᛶᲈ;

    .line 68
    .line 69
    const/16 v3, 0x11

    .line 70
    .line 71
    invoke-direct {v2, v0, v3, v1}, Lyyds/ᲀᲈᛶᲈ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object v2, p0, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

    .line 75
    .line 76
    new-instance v0, Lyyds/ᲇᲇᲀᲈ;

    .line 77
    .line 78
    invoke-direct {v0, v2}, Lyyds/ᲇᲇᲀᲈ;-><init>(Lyyds/ᲀᲈᛶᲈ;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lyyds/ᛱᛴᲇᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲇᲇᲀᲈ;

    .line 82
    .line 83
    invoke-virtual {p1, v2, v0}, Lyyds/ᛲᲀᛵ;->ᛲᲈᲁ(Lyyds/ᲀᲈᛶᲈ;Lyyds/ᲇᲇᲀᲈ;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lyyds/ᛱᛴᲇᲀ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{serializeNulls:false,factories:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛱᛴᲇᲀ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ",instanceCreators:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲈᛶᲈ;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "}"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    iget-boolean v2, p0, Lyyds/ᛱᛴᲇᲀ;->ᲇᲇᲇᛱ:Z

    .line 4
    .line 5
    iget-object v3, p0, Lyyds/ᛱᛴᲇᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲈᛱᲀ;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v4, Lyyds/ᛸᛶᲈᛶ;

    .line 15
    .line 16
    invoke-direct {v4, p1}, Lyyds/ᛸᛶᲈᛶ;-><init>(Ljava/lang/StringBuilder;)V

    .line 17
    .line 18
    .line 19
    new-instance v5, Lyyds/ᛶᲀᛳᲁ;

    .line 20
    .line 21
    invoke-direct {v5, v4}, Lyyds/ᛶᲀᛳᲁ;-><init>(Ljava/io/Writer;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5, v3}, Lyyds/ᛶᲀᛳᲁ;->ᛸᛸᛷᛱ(Lyyds/ᛳᲈᛱᲀ;)V

    .line 25
    .line 26
    .line 27
    iput-boolean v2, v5, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 28
    .line 29
    iput v1, v5, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 30
    .line 31
    iput-boolean v0, v5, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 32
    .line 33
    invoke-virtual {p0, v5}, Lyyds/ᛱᛴᲇᲀ;->ᛶᛷᛲᲁ(Lyyds/ᛶᲀᛳᲁ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    new-instance p1, Lyyds/ᛷᛷᲀᲈ;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    :try_start_1
    new-instance v6, Lyyds/ᛸᛶᲈᛶ;

    .line 58
    .line 59
    invoke-direct {v6, v5}, Lyyds/ᛸᛶᲈᛶ;-><init>(Ljava/lang/StringBuilder;)V

    .line 60
    .line 61
    .line 62
    new-instance v7, Lyyds/ᛶᲀᛳᲁ;

    .line 63
    .line 64
    invoke-direct {v7, v6}, Lyyds/ᛶᲀᛳᲁ;-><init>(Ljava/io/Writer;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v3}, Lyyds/ᛶᲀᛳᲁ;->ᛸᛸᛷᛱ(Lyyds/ᛳᲈᛱᲀ;)V

    .line 68
    .line 69
    .line 70
    iput-boolean v2, v7, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 71
    .line 72
    iput v1, v7, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 73
    .line 74
    iput-boolean v0, v7, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 75
    .line 76
    invoke-virtual {p0, p1, v4, v7}, Lyyds/ᛱᛴᲇᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Class;Lyyds/ᛶᲀᛳᲁ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :catch_1
    move-exception p0

    .line 85
    new-instance p1, Lyyds/ᛷᛷᲀᲈ;

    .line 86
    .line 87
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    throw p1
.end method

.method public final ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᲈᲈᛸᛳ;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lyyds/ᲈᲈᛸᛳ;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lyyds/ᛱᛴᲇᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᲈᲈᛸᛳ;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᲈᲈᛸᛳ;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Ljava/io/StringReader;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lyyds/ᲀᛲᛴᲇ;

    .line 11
    .line 12
    invoke-direct {p1, v1}, Lyyds/ᲀᛲᛴᲇ;-><init>(Ljava/io/StringReader;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "AssertionError (GSON 2.14.0): "

    .line 16
    .line 17
    const-string v2, "Type adapter \'"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iput v3, p1, Lyyds/ᲀᛲᛴᲇ;->ᛶᛳᛶᛵ:I

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    :try_start_0
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {p0, p2}, Lyyds/ᛱᛴᲇᲀ;->ᲇᲈᛵᛷ(Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p2, p2, Lyyds/ᲈᲈᛸᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {p2}, Lyyds/ᲀᲀᛸᛱ;->ᛵᛶᛲᲀ(Ljava/lang/Class;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance v6, Ljava/lang/ClassCastException;

    .line 51
    .line 52
    new-instance v7, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, "\' returned wrong type; requested "

    .line 61
    .line 62
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, " but got instance of "

    .line 69
    .line 70
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, "\nVerify that the adapter was registered for the correct type."

    .line 81
    .line 82
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-direct {v6, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v6
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_7

    .line 95
    :catch_0
    move-exception p0

    .line 96
    goto :goto_1

    .line 97
    :catch_1
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :catch_2
    move-exception p0

    .line 100
    goto :goto_3

    .line 101
    :catch_3
    move-exception p0

    .line 102
    goto :goto_4

    .line 103
    :cond_2
    :goto_0
    iput v4, p1, Lyyds/ᲀᛲᛴᲇ;->ᛶᛳᛶᛵ:I

    .line 104
    .line 105
    move-object v0, v5

    .line 106
    goto :goto_5

    .line 107
    :goto_1
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 108
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-direct {p2, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :goto_2
    new-instance p2, Lyyds/ᛷᛷᲀᲈ;

    .line 130
    .line 131
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw p2

    .line 135
    :goto_3
    new-instance p2, Lyyds/ᛷᛷᲀᲈ;

    .line 136
    .line 137
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :goto_4
    if-eqz v3, :cond_5

    .line 142
    .line 143
    iput v4, p1, Lyyds/ᲀᛲᛴᲇ;->ᛶᛳᛶᛵ:I

    .line 144
    .line 145
    :goto_5
    if-eqz v0, :cond_4

    .line 146
    .line 147
    :try_start_2
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    const/16 p1, 0xa

    .line 152
    .line 153
    if-ne p0, p1, :cond_3

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_3
    new-instance p0, Lyyds/ᛷᛷᲀᲈ;

    .line 157
    .line 158
    const-string p1, "JSON document was not fully consumed."

    .line 159
    .line 160
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0
    :try_end_2
    .catch Lyyds/ᛴᛴᛸᛵ; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 164
    :catch_4
    move-exception p0

    .line 165
    new-instance p1, Lyyds/ᛷᛷᲀᲈ;

    .line 166
    .line 167
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :catch_5
    move-exception p0

    .line 172
    new-instance p1, Lyyds/ᛷᛷᲀᲈ;

    .line 173
    .line 174
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :cond_4
    :goto_6
    return-object v0

    .line 179
    :cond_5
    :try_start_3
    new-instance p2, Lyyds/ᛷᛷᲀᲈ;

    .line 180
    .line 181
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    :goto_7
    iput v4, p1, Lyyds/ᲀᛲᛴᲇ;->ᛶᛳᛶᛵ:I

    .line 186
    .line 187
    throw p0
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᛶᲀᛳᲁ;)V
    .locals 6

    .line 1
    sget-object v0, Lyyds/ᛱᲇᛲᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛱᲇᛲᲁ;

    .line 2
    .line 3
    const-string v1, "AssertionError (GSON 2.14.0): "

    .line 4
    .line 5
    iget v2, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 6
    .line 7
    iget-boolean v3, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 8
    .line 9
    iget-boolean v4, p1, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 10
    .line 11
    iget-boolean p0, p0, Lyyds/ᛱᛴᲇᲀ;->ᲇᲇᲇᛱ:Z

    .line 12
    .line 13
    iput-boolean p0, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    iput-boolean p0, p1, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 17
    .line 18
    const/4 p0, 0x2

    .line 19
    if-ne v2, p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    iput p0, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 23
    .line 24
    :cond_0
    :try_start_0
    sget-object p0, Lyyds/ᛲᛶᛴ;->ᛲᲈᲁ:Lyyds/ᛲᛶᛴ;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lyyds/ᛲᛶᛴ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛳᲁ;Lyyds/ᛳᛱᛶᲁ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    iput v2, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 33
    .line 34
    iput-boolean v3, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 35
    .line 36
    iput-boolean v4, p1, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    move-exception p0

    .line 40
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 41
    .line 42
    new-instance v5, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-direct {v0, v1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_0

    .line 64
    :catch_1
    move-exception p0

    .line 65
    new-instance v0, Lyyds/ᛷᛷᲀᲈ;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :goto_0
    iput v2, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 72
    .line 73
    iput-boolean v3, p1, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 74
    .line 75
    iput-boolean v4, p1, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 76
    .line 77
    throw p0
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᲈᛸᛷ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᲈᲈᛸᛳ;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lyyds/ᲈᲈᛸᛳ;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lyyds/ᛱᛴᲇᲀ;->ᲇᲈᛵᛷ(Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Class;Lyyds/ᛶᲀᛳᲁ;)V
    .locals 4

    .line 1
    const-string v0, "AssertionError (GSON 2.14.0): "

    .line 2
    .line 3
    new-instance v1, Lyyds/ᲈᲈᛸᛳ;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lyyds/ᲈᲈᛸᛳ;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lyyds/ᛱᛴᲇᲀ;->ᲇᲈᛵᛷ(Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget v1, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iput v2, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 19
    .line 20
    :cond_0
    iget-boolean v2, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 21
    .line 22
    iget-boolean v3, p3, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 23
    .line 24
    iget-boolean p0, p0, Lyyds/ᛱᛴᲇᲀ;->ᲇᲇᲇᛱ:Z

    .line 25
    .line 26
    iput-boolean p0, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    iput-boolean p0, p3, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p2, p3, p1}, Lyyds/ᲈᛸᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    iput v1, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 35
    .line 36
    iput-boolean v2, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 37
    .line 38
    iput-boolean v3, p3, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 45
    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p1, p2, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :catch_1
    move-exception p0

    .line 67
    new-instance p1, Lyyds/ᛷᛷᲀᲈ;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :goto_0
    iput v1, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 74
    .line 75
    iput-boolean v2, p3, Lyyds/ᛶᲀᛳᲁ;->ᛷᛲᲈᛱ:Z

    .line 76
    .line 77
    iput-boolean v3, p3, Lyyds/ᛶᲀᛳᲁ;->ᛲᛲᲈᲈ:Z

    .line 78
    .line 79
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;
    .locals 9

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛴᲇᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lyyds/ᲈᛸᛷ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lyyds/ᛱᛴᲇᲀ;->ᛲᲈᲁ:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/util/Map;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lyyds/ᲈᛸᛷ;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    :goto_0
    :try_start_0
    new-instance v4, Lyyds/ᛷᛶᛴᲀ;

    .line 43
    .line 44
    invoke-direct {v4}, Lyyds/ᛷᛶᛴᲀ;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lyyds/ᛱᛴᲇᲀ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v6, 0x0

    .line 57
    move-object v7, v6

    .line 58
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_5

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Lyyds/ᛳᛸᛴ;

    .line 69
    .line 70
    invoke-interface {v7, p0, p1}, Lyyds/ᛳᛸᛴ;->ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    iget-object p0, v4, Lyyds/ᛷᛶᛴᲀ;->ᛲᲈᲁ:Lyyds/ᲈᛸᛷ;

    .line 77
    .line 78
    if-nez p0, :cond_4

    .line 79
    .line 80
    iput-object v7, v4, Lyyds/ᛷᛶᛴᲀ;->ᛲᲈᲁ:Lyyds/ᲈᛸᛷ;

    .line 81
    .line 82
    invoke-interface {v2, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    .line 89
    .line 90
    const-string p1, "Delegate is already set"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 99
    .line 100
    .line 101
    :cond_6
    if-eqz v7, :cond_8

    .line 102
    .line 103
    if-eqz v3, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    return-object v7

    .line 109
    :cond_8
    const-string p0, "GSON (2.14.0) cannot handle "

    .line 110
    .line 111
    invoke-static {p1, p0}, Lyyds/ᛱᛸᛶᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v6

    .line 115
    :goto_2
    if-eqz v3, :cond_9

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 118
    .line 119
    .line 120
    :cond_9
    throw p0
.end method
