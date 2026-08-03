.class public interface abstract Lcom/alibaba/fastjson2/JSONB;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/JSONB$Constants;
    }
.end annotation


# direct methods
.method public static varargs copy(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;[",
            "Lcom/alibaba/fastjson2/JSONWriter$Feature;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/JSON;->copy(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static dump([B)V
    .locals 2

    .line 17
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const/4 v1, 0x1

    .line 18
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/JSONB;->toJSONString([BZ)Ljava/lang/String;

    move-result-object p0

    .line 19
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public static dump([BLcom/alibaba/fastjson2/SymbolTable;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONBDump;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lcom/alibaba/fastjson2/JSONBDump;-><init>([BLcom/alibaba/fastjson2/SymbolTable;Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static fromJSONBytes([B)[B
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of([B)Lcom/alibaba/fastjson2/JSONReader;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const-class p0, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v3, 0x0

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/Object;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static fromJSONString(Ljava/lang/String;)[B
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSON;->parse(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/Object;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static parse(Ljava/io/InputStream;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 1

    .line 76
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v0, p1, p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    .line 77
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0

    .line 78
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 79
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 80
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 81
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static parse([BLcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 3

    .line 70
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, p1, p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 71
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0

    .line 72
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 73
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 74
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 75
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parse([BLcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8

    .line 82
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 83
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 84
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v2

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p2

    .line 85
    :goto_0
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length v2, p0

    invoke-direct {v3, v1, p0, p2, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 86
    :try_start_0
    const-class p0, Ljava/lang/Object;

    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    .line 87
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 88
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 89
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 90
    :cond_1
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 91
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static varargs parse([B[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 4
    .line 5
    invoke-direct {v1, v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 6
    .line 7
    .line 8
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 9
    .line 10
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 11
    .line 12
    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 13
    .line 14
    and-long/2addr v2, v4

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long p1, v2, v4

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v2

    .line 25
    :goto_0
    new-instance v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 26
    .line 27
    array-length v3, p0

    .line 28
    invoke-direct {v4, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    const-class p0, Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 v6, 0x0

    .line 38
    const-wide/16 v7, 0x0

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p1, v4, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p0, v0

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    :goto_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :goto_2
    :try_start_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :goto_3
    throw p0
.end method

.method public static parseArray(Ljava/io/InputStream;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 1

    .line 64
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v0, p1, p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    .line 65
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readArray()Ljava/util/List;

    move-result-object p0

    check-cast p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 66
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 67
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 68
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 69
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static parseArray([B)Lcom/alibaba/fastjson2/JSONArray;
    .locals 4

    .line 70
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    const/4 v2, 0x0

    array-length v3, p0

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 71
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readArray()Ljava/util/List;

    move-result-object p0

    check-cast p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 72
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 73
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 74
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 75
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static parseArray([BLjava/lang/reflect/Type;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/util/ParameterizedTypeImpl;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    new-array v2, v2, [Ljava/lang/reflect/Type;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object p1, v2, v3

    .line 15
    .line 16
    const-class p1, Ljava/util/List;

    .line 17
    .line 18
    invoke-direct {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/util/ParameterizedTypeImpl;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 22
    .line 23
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 24
    .line 25
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 28
    .line 29
    .line 30
    array-length v2, p0

    .line 31
    invoke-direct {p1, v0, p0, v3, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/util/List;

    .line 39
    .line 40
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :goto_2
    throw p0

    .line 63
    :cond_2
    :goto_3
    return-object v0
.end method

.method public static varargs parseArray([BLjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 76
    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_3

    .line 77
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/util/ParameterizedTypeImpl;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/reflect/Type;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-class p1, Ljava/util/List;

    invoke-direct {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/util/ParameterizedTypeImpl;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 78
    new-instance p1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v2, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    array-length p2, p0

    invoke-direct {p1, v0, p0, v3, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 79
    :try_start_0
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    .line 80
    iget-object p2, p1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p2, :cond_1

    .line 81
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 82
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 83
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_2
    :goto_3
    return-object v0
.end method

.method public static varargs parseArray([B[Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B[",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_2

    .line 84
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_3

    .line 85
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    const/4 v2, 0x0

    array-length v3, p0

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 86
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readList([Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 87
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 88
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 89
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 90
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_2
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs parseArray([B[Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B[",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_2

    .line 91
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_3

    .line 92
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v1, v2, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    const/4 p2, 0x0

    array-length v2, p0

    invoke-direct {v0, v1, p0, p2, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 93
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readList([Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p0

    .line 94
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 95
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 96
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 97
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_2
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseObject(Ljava/io/InputStream;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 1

    .line 152
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v0, p1, p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    .line 153
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    move-result-object p0

    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 154
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 155
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 156
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 157
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static parseObject([B)Lcom/alibaba/fastjson2/JSONObject;
    .locals 4

    .line 215
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    const/4 v2, 0x0

    array-length v3, p0

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 216
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    move-result-object p0

    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 217
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 218
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 219
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 220
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([B[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 3

    .line 146
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v1, v2, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    const/4 p1, 0x0

    array-length v2, p0

    invoke-direct {v0, v1, p0, p1, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 147
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readObject()Ljava/util/Map;

    move-result-object p0

    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 148
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 149
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 150
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 151
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static parseObject(Ljava/io/InputStream;ILjava/lang/reflect/Type;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "I",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    .line 244
    const-string v0, "deserialize failed. expected read length: "

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v1, v3

    .line 245
    aget-object v1, v2, v1

    .line 246
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    if-nez v3, :cond_0

    const/16 v3, 0x2000

    .line 247
    new-array v3, v3, [B

    .line 248
    :cond_0
    :try_start_0
    array-length v4, v3

    if-ge v4, p1, :cond_1

    .line 249
    new-array v3, p1, [B

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x0

    .line 250
    invoke-virtual {p0, v3, v4, p1}, Ljava/io/InputStream;->read([BII)I

    move-result p0

    if-ne p0, p1, :cond_2

    .line 251
    invoke-static {v3, v4, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONB;->parseObject([BIILjava/lang/reflect/Type;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 252
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    .line 253
    :cond_2
    :try_start_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " but actual read: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 254
    :goto_1
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    throw p0
.end method

.method public static varargs parseObject(Ljava/io/InputStream;ILjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 256
    const-string v0, "deserialize failed. expected read length: "

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v1, v3

    .line 257
    aget-object v1, v2, v1

    .line 258
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    if-nez v3, :cond_0

    const/16 v3, 0x2000

    .line 259
    new-array v3, v3, [B

    .line 260
    :cond_0
    :try_start_0
    array-length v4, v3

    if-ge v4, p1, :cond_1

    .line 261
    new-array v3, p1, [B

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x0

    .line 262
    invoke-virtual {p0, v3, v4, p1}, Ljava/io/InputStream;->read([BII)I

    move-result p0

    if-ne p0, p1, :cond_2

    .line 263
    invoke-static {v3, v4, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONB;->parseObject([BIILjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    .line 265
    :cond_2
    :try_start_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " but actual read: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 266
    :goto_1
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    throw p0
.end method

.method public static parseObject(Ljava/io/InputStream;Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/lang/Class;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    .line 235
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v1, p2, p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    .line 236
    :try_start_0
    const-class p0, Ljava/lang/Object;

    if-ne p1, p0, :cond_0

    .line 237
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 238
    :cond_0
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p1

    .line 239
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 240
    :goto_0
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 241
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 243
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject(Ljava/io/InputStream;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/lang/Class;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 222
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p2

    .line 223
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONB;->parseObject(Ljava/io/InputStream;Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    .line 226
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v1, p2, p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    .line 227
    :try_start_0
    const-class p0, Ljava/lang/Object;

    if-ne p1, p0, :cond_0

    .line 228
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 229
    :cond_0
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p1

    .line 230
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 231
    :goto_0
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 232
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 234
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/InputStream;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 224
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p2

    .line 225
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONB;->parseObject(Ljava/io/InputStream;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static parseObject([BIILjava/lang/Class;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 312
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 313
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 314
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v3, v1, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 315
    :try_start_0
    iget-wide p0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v1, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, v1

    const-wide/16 v1, 0x0

    cmp-long p0, p0, v1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 316
    :goto_0
    invoke-virtual {v0, p3, p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p3

    .line 317
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 318
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 319
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 320
    :cond_1
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 321
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static parseObject([BIILjava/lang/Class;Lcom/alibaba/fastjson2/SymbolTable;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/SymbolTable;",
            ")TT;"
        }
    .end annotation

    .line 361
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 362
    invoke-static {p4}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(Lcom/alibaba/fastjson2/SymbolTable;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p4

    invoke-direct {v1, p4, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 363
    :try_start_0
    invoke-virtual {v1, p3}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p3

    .line 364
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 365
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 366
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 367
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 368
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([BIILjava/lang/Class;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/SymbolTable;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 377
    invoke-static {p4, p5}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p4

    .line 378
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    .line 379
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v1, p4, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p3

    .line 380
    :try_start_0
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 381
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 382
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 383
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 384
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([BIILjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 332
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 333
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    const/4 v2, 0x0

    move v3, v2

    .line 334
    :goto_0
    array-length v4, p4

    if-ge v3, v4, :cond_0

    .line 335
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object v6, p4, v3

    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v4, v6

    iput-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 336
    :cond_0
    new-instance v5, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v5, v1, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 337
    :try_start_0
    iget-wide p0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, v3

    const-wide/16 v3, 0x0

    cmp-long p0, p0, v3

    if-eqz p0, :cond_1

    const/4 v2, 0x1

    .line 338
    :cond_1
    invoke-virtual {v0, p3, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v6, p3

    .line 339
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 340
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 341
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 342
    :cond_2
    :goto_1
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 343
    :goto_2
    :try_start_1
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static parseObject([BIILjava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 322
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 323
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 324
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v3, v1, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 325
    :try_start_0
    iget-wide p0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v1, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, v1

    const-wide/16 v1, 0x0

    cmp-long p0, p0, v1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 326
    :goto_0
    invoke-virtual {v0, p3, p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p3

    .line 327
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 328
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 329
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 330
    :cond_1
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 331
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static parseObject([BIILjava/lang/reflect/Type;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    .line 344
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v1, p4, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 345
    :try_start_0
    iget-wide p0, p4, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, p0, v2

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 346
    :goto_0
    iget-object p1, p4, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {p1, p3, p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p3

    .line 347
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 348
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 349
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 350
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 351
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static parseObject([BIILjava/lang/reflect/Type;Lcom/alibaba/fastjson2/SymbolTable;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/SymbolTable;",
            ")TT;"
        }
    .end annotation

    .line 369
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 370
    invoke-static {p4}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(Lcom/alibaba/fastjson2/SymbolTable;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p4

    invoke-direct {v1, p4, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 371
    :try_start_0
    invoke-virtual {v1, p3}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p3

    .line 372
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 373
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 374
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 375
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 376
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([BIILjava/lang/reflect/Type;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/SymbolTable;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 385
    invoke-static {p4, p5}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p4

    .line 386
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    .line 387
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v1, p4, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p3

    .line 388
    :try_start_0
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 389
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 390
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 391
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 392
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([BIILjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([BII",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 352
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 353
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p4}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 354
    invoke-virtual {v1, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    .line 355
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v3, v1, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p3

    .line 356
    :try_start_0
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 357
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 358
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 359
    :cond_0
    :goto_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 360
    :goto_1
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([BLcom/alibaba/fastjson2/TypeReference;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Lcom/alibaba/fastjson2/TypeReference;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 221
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/TypeReference;->getType()Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONB;->parseObject([BLjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static parseObject([BLjava/lang/Class;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 158
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 159
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 160
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    .line 161
    :goto_0
    new-instance v5, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length v4, p0

    invoke-direct {v5, v1, p0, v3, v4}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 162
    :try_start_0
    const-class p0, Ljava/lang/Object;

    if-ne p1, p0, :cond_1

    .line 163
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 164
    :cond_1
    invoke-virtual {v0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v6, p1

    .line 165
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 166
    :goto_1
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_2

    .line 167
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    :cond_2
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 169
    :goto_2
    :try_start_1
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static parseObject([BLjava/lang/Class;Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")TT;"
        }
    .end annotation

    .line 286
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length v0, p0

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, v2, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 287
    :try_start_0
    const-class p0, Ljava/lang/Object;

    if-ne p1, p0, :cond_1

    .line 288
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getType()B

    move-result p0

    const/16 v0, -0x6e

    if-ne p0, v0, :cond_0

    .line 289
    const-class v2, Ljava/lang/Object;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    .line 290
    iget-wide v4, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    const/4 v3, 0x0

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 291
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, p1

    .line 292
    iget-wide v3, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    .line 293
    :cond_2
    iget-object p1, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {p1, p0, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    .line 294
    iget-wide p1, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, v2

    cmp-long p1, p1, v5

    if-eqz p1, :cond_3

    .line 295
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isArray()Z

    move-result p1

    if-eqz p1, :cond_3

    instance-of p1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    if-eqz p1, :cond_3

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p0

    .line 296
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_3
    move-object v2, p0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    .line 297
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 298
    :goto_0
    iget-object p1, v1, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_4

    .line 299
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 300
    :cond_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 301
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([BLjava/lang/Class;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 197
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 198
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 199
    invoke-virtual {v1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->config(Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 200
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length p2, p0

    const/4 v2, 0x0

    invoke-direct {v3, v1, p0, v2, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    move p0, v2

    .line 201
    :goto_0
    :try_start_0
    array-length p2, p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-ge p0, p2, :cond_0

    .line 202
    :try_start_1
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object p2, p3, p0

    iget-wide v6, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v4, v6

    iput-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v2, v3

    goto :goto_5

    .line 203
    :cond_0
    :try_start_2
    const-class p0, Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p1, p0, :cond_2

    .line 204
    :try_start_3
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getType()B

    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 p2, -0x6e

    if-ne p0, p2, :cond_1

    move-object v2, v3

    .line 205
    :try_start_4
    const-class v3, Ljava/lang/Object;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p0

    .line 206
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const/4 v5, 0x0

    move-object v4, p1

    move-object v3, v2

    move-object v2, p0

    :try_start_5
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v2

    :goto_1
    move-object p0, v0

    goto :goto_5

    .line 207
    :cond_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_2
    move-object v2, v3

    goto :goto_3

    :cond_2
    move-object v4, p1

    .line 208
    :try_start_6
    iget-wide p0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, p2

    const-wide/16 p2, 0x0

    cmp-long p0, p0, p2

    if-eqz p0, :cond_3

    const/4 v2, 0x1

    .line 209
    :cond_3
    invoke-virtual {v0, v4, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    .line 210
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v2, v3

    .line 211
    :goto_3
    :try_start_7
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_4

    .line 212
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_1

    .line 213
    :cond_4
    :goto_4
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    :catchall_3
    move-exception v0

    move-object v2, v3

    goto :goto_1

    .line 214
    :goto_5
    :try_start_8
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0
.end method

.method public static varargs parseObject([BLjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 268
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 269
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 270
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length p2, p0

    const/4 v2, 0x0

    invoke-direct {v3, v1, p0, v2, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 271
    :try_start_0
    const-class p0, Ljava/lang/Object;

    if-ne p1, p0, :cond_1

    .line 272
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getType()B

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p2, -0x6e

    if-ne p0, p2, :cond_0

    move-object v2, v3

    .line 273
    :try_start_1
    const-class v3, Ljava/lang/Object;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v3, v2

    .line 274
    :try_start_2
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception v0

    :goto_0
    move-object p0, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v2

    goto :goto_0

    .line 275
    :cond_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object v4, p1

    .line 276
    iget-wide p0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, v5

    const-wide/16 v5, 0x0

    cmp-long p0, p0, v5

    if-eqz p0, :cond_2

    const/4 v2, 0x1

    .line 277
    :cond_2
    invoke-virtual {v0, v4, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    .line 278
    iget-wide p0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p0, v0

    cmp-long p0, p0, v5

    if-eqz p0, :cond_3

    .line 279
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->isArray()Z

    move-result p0

    if-eqz p0, :cond_3

    instance-of p0, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    if-eqz p0, :cond_3

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    .line 280
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    .line 281
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 282
    :goto_1
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_4

    .line 283
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 284
    :cond_4
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 285
    :goto_2
    :try_start_3
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static parseObject([BLjava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 170
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 171
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 172
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    .line 173
    :goto_0
    invoke-virtual {v0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    .line 174
    new-instance v5, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length v0, p0

    invoke-direct {v5, v1, p0, v3, v0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v6, p1

    .line 175
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 176
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 177
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public static parseObject([BLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/SymbolTable;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/SymbolTable;",
            ")TT;"
        }
    .end annotation

    .line 179
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 180
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 181
    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, v2

    .line 182
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v3

    .line 183
    new-instance v4, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length p2, p0

    invoke-direct {v4, v1, p0, v2, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v5, p1

    .line 184
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 185
    iget-object p1, v4, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 186
    invoke-virtual {v4, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public static varargs parseObject([BLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/SymbolTable;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 187
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 188
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 189
    iget-wide p2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p2, v2

    const-wide/16 v2, 0x0

    cmp-long p2, p2, v2

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, p3

    .line 190
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    .line 191
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length p2, p0

    invoke-direct {v3, v1, p0, p3, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p1

    .line 192
    :try_start_0
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 193
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 194
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 195
    :cond_1
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 196
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static varargs parseObject([BLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/SymbolTable;",
            "[",
            "Lcom/alibaba/fastjson2/filter/Filter;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_5

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 9
    .line 10
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 11
    .line 12
    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p3, p4}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 19
    .line 20
    array-length p2, p0

    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-direct {v3, v1, p0, p3, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 23
    .line 24
    .line 25
    move p0, p3

    .line 26
    :goto_0
    :try_start_0
    array-length p2, p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    if-ge p0, p2, :cond_1

    .line 28
    .line 29
    :try_start_1
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 30
    .line 31
    aget-object p2, p4, p0

    .line 32
    .line 33
    iget-wide v6, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 34
    .line 35
    or-long/2addr v4, v6

    .line 36
    iput-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    add-int/lit8 p0, p0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p0, v0

    .line 43
    move-object v2, v3

    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    :try_start_2
    const-class p0, Ljava/lang/Object;

    .line 47
    .line 48
    if-ne p1, p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->getType()B

    .line 51
    .line 52
    .line 53
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    const/16 p2, -0x6e

    .line 55
    .line 56
    if-ne p0, p2, :cond_2

    .line 57
    .line 58
    move-object v2, v3

    .line 59
    :try_start_3
    const-class v3, Ljava/lang/Object;

    .line 60
    .line 61
    const-wide/16 v4, 0x0

    .line 62
    .line 63
    const-wide/16 v6, 0x0

    .line 64
    .line 65
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    move-object v4, p1

    .line 73
    move-object v3, v2

    .line 74
    move-object v2, p0

    .line 75
    :try_start_4
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 79
    move-object v2, v3

    .line 80
    goto :goto_2

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    move-object v2, v3

    .line 83
    :goto_1
    move-object p0, v0

    .line 84
    goto :goto_3

    .line 85
    :catchall_2
    move-exception v0

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move-object v2, v3

    .line 88
    :try_start_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->readAny()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v4, p1

    .line 94
    move-object v2, v3

    .line 95
    iget-wide p0, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 96
    .line 97
    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 98
    .line 99
    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 100
    .line 101
    and-long/2addr p0, v5

    .line 102
    const-wide/16 v5, 0x0

    .line 103
    .line 104
    cmp-long p0, p0, v5

    .line 105
    .line 106
    if-eqz p0, :cond_4

    .line 107
    .line 108
    const/4 p3, 0x1

    .line 109
    :cond_4
    invoke-virtual {v0, v4, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 110
    .line 111
    .line 112
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 113
    const/4 v5, 0x0

    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    move-object v3, v2

    .line 117
    move-object v2, p0

    .line 118
    :try_start_6
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 122
    move-object v2, v3

    .line 123
    :goto_2
    :try_start_7
    iget-object p1, v2, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 128
    .line 129
    .line 130
    :cond_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    .line 131
    .line 132
    .line 133
    return-object p0

    .line 134
    :goto_3
    :try_start_8
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :catchall_3
    move-exception v0

    .line 139
    move-object p1, v0

    .line 140
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :goto_4
    throw p0

    .line 144
    :cond_6
    :goto_5
    const/4 p0, 0x0

    .line 145
    return-object p0
.end method

.method public static varargs parseObject([BLjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 302
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 303
    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 304
    new-instance v3, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    array-length p2, p0

    const/4 v2, 0x0

    invoke-direct {v3, v1, p0, v2, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 305
    :try_start_0
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v6, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long p0, v4, v6

    if-eqz p0, :cond_0

    const/4 v2, 0x1

    .line 306
    :cond_0
    invoke-virtual {v0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p1

    .line 307
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 308
    iget-object p1, v3, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-eqz p1, :cond_1

    .line 309
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONReader;->handleResolveTasks(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 310
    :cond_1
    :goto_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V

    return-object p0

    .line 311
    :goto_1
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs parseObject([B[Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B[",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 178
    new-instance v0, Lcom/alibaba/fastjson2/util/MultiType;

    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/util/MultiType;-><init>([Ljava/lang/reflect/Type;)V

    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/JSONB;->parseObject([BLjava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static varargs symbolTable([Ljava/lang/String;)Lcom/alibaba/fastjson2/SymbolTable;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/SymbolTable;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/SymbolTable;-><init>([Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static toBytes(B)[B
    .locals 3

    .line 126
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 127
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeInt8(B)V

    .line 128
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 130
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static toBytes(I)[B
    .locals 3

    const/16 v0, -0x10

    if-lt p0, v0, :cond_0

    const/16 v0, 0x2f

    if-gt p0, v0, :cond_0

    int-to-byte p0, p0

    const/4 v0, 0x1

    .line 120
    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    return-object v0

    .line 121
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 122
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeInt32(I)V

    .line 123
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 125
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static toBytes(J)[B
    .locals 3

    const-wide/16 v0, -0x8

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/16 v0, 0xf

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, 0x20

    sub-long/2addr p0, v0

    long-to-int p0, p0

    int-to-byte p0, p0

    const/4 p1, 0x1

    .line 136
    new-array p1, p1, [B

    const/4 v0, 0x0

    aput-byte p0, p1, v0

    return-object p1

    .line 137
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 138
    :try_start_0
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeInt64(J)V

    .line 139
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 141
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static toBytes(Ljava/lang/Object;)[B
    .locals 9

    .line 149
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 150
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 151
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    const/4 v2, 0x0

    invoke-direct {v3, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    if-nez p0, :cond_0

    .line 152
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 153
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 154
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 155
    :goto_0
    invoke-virtual {v0, v2, v2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 156
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 157
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    .line 159
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static toBytes(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter$Context;)[B
    .locals 8

    if-nez p1, :cond_0

    .line 160
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createWriteContext()Lcom/alibaba/fastjson2/JSONWriter$Context;

    move-result-object p1

    .line 161
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    if-nez p0, :cond_1

    .line 162
    :try_start_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 163
    :cond_1
    iput-object p0, v1, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 164
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object v0, v1, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 165
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 166
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 167
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-virtual {v3, v2, v2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v0

    .line 168
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v6, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v2, v6

    cmp-long p1, v2, v4

    if-eqz p1, :cond_3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    .line 169
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    goto :goto_1

    :cond_3
    move-object v2, p0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    .line 170
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 171
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    .line 173
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static toBytes(Ljava/lang/Object;Lcom/alibaba/fastjson2/SymbolTable;)[B
    .locals 9

    .line 174
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 175
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    invoke-direct {v3, v0, p1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    if-nez p0, :cond_0

    .line 176
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeNull()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 177
    :cond_0
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONWriter;->setRootObject(Ljava/lang/Object;)V

    .line 178
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 179
    invoke-virtual {v0, p1, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 180
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 181
    :goto_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    .line 183
    :goto_1
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static varargs toBytes(Ljava/lang/Object;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 184
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 185
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 186
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    invoke-direct {v3, v1, p1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    if-nez p0, :cond_0

    .line 187
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 188
    :cond_0
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONWriter;->setRootObject(Ljava/lang/Object;)V

    .line 189
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 190
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v6, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long p2, v4, v6

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 191
    :goto_0
    invoke-virtual {v0, p1, p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    .line 192
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v6

    if-eqz p1, :cond_2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 193
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    goto :goto_1

    :cond_2
    move-object v4, p0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    .line 194
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 195
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    .line 197
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static varargs toBytes(Ljava/lang/Object;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 198
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 199
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 200
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 201
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    invoke-direct {v3, v1, p1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    if-nez p0, :cond_0

    .line 202
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 203
    :cond_0
    invoke-virtual {v3, p0}, Lcom/alibaba/fastjson2/JSONWriter;->setRootObject(Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 205
    iget-wide p2, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, p2, v4

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 206
    :goto_0
    invoke-virtual {v0, p1, p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    .line 207
    iget-wide p1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr p1, v0

    cmp-long p1, p1, v4

    if-eqz p1, :cond_2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 208
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    goto :goto_1

    :cond_2
    move-object v4, p0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    .line 209
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 210
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    .line 212
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static varargs toBytes(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 9

    .line 213
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 214
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    invoke-direct {v1, v0, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 215
    new-instance v3, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    const/4 p1, 0x0

    invoke-direct {v3, v1, p1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    if-nez p0, :cond_0

    .line 216
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeNull()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    .line 217
    :cond_0
    iput-object p0, v3, Lcom/alibaba/fastjson2/JSONWriter;->rootObject:Ljava/lang/Object;

    .line 218
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    iput-object p1, v3, Lcom/alibaba/fastjson2/JSONWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 219
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v6, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 220
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 221
    invoke-virtual {v0, v2, v2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object v2

    .line 222
    iget-wide v0, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v4

    cmp-long p1, v0, v6

    if-eqz p1, :cond_2

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p0

    .line 223
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    goto :goto_1

    :cond_2
    move-object v4, p0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    .line 224
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 225
    :goto_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    .line 227
    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
.end method

.method public static toBytes(Ljava/lang/String;)[B
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x1

    .line 142
    new-array p0, p0, [B

    const/16 v0, -0x51

    const/4 v1, 0x0

    aput-byte v0, p0, v1

    return-object p0

    .line 143
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 144
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeString(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 147
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static toBytes(Ljava/lang/String;Ljava/nio/charset/Charset;)[B
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    new-array p0, v0, [B

    .line 6
    .line 7
    const/16 p1, -0x51

    .line 8
    .line 9
    aput-byte p1, p0, v1

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    if-ne p1, v2, :cond_1

    .line 15
    .line 16
    const/16 v2, 0x7b

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    if-ne p1, v2, :cond_2

    .line 22
    .line 23
    const/16 v2, 0x7d

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 27
    .line 28
    if-ne p1, v2, :cond_3

    .line 29
    .line 30
    const/16 v2, 0x7c

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    if-ne p1, v2, :cond_4

    .line 36
    .line 37
    const/16 v2, 0x7a

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    sget-object v2, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 41
    .line 42
    if-eq p1, v2, :cond_7

    .line 43
    .line 44
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    if-ne p1, v2, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    if-eqz p1, :cond_6

    .line 50
    .line 51
    const-string v2, "GB18030"

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_6

    .line 62
    .line 63
    const/16 v2, 0x7e

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_6
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_7
    :goto_0
    const/16 v2, 0x79

    .line 72
    .line 73
    :goto_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    array-length p1, p0

    .line 78
    add-int/lit8 v3, p1, 0x2

    .line 79
    .line 80
    array-length v4, p0

    .line 81
    const/16 v5, 0x2f

    .line 82
    .line 83
    if-gt v4, v5, :cond_8

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_8
    array-length v3, p0

    .line 87
    const/16 v4, 0x7ff

    .line 88
    .line 89
    if-gt v3, v4, :cond_9

    .line 90
    .line 91
    add-int/lit8 v3, p1, 0x3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_9
    array-length v3, p0

    .line 95
    const v4, 0x3ffff

    .line 96
    .line 97
    .line 98
    if-gt v3, v4, :cond_a

    .line 99
    .line 100
    add-int/lit8 v3, p1, 0x4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_a
    add-int/lit8 v3, p1, 0x6

    .line 104
    .line 105
    :goto_2
    new-array p1, v3, [B

    .line 106
    .line 107
    aput-byte v2, p1, v1

    .line 108
    .line 109
    array-length v2, p0

    .line 110
    invoke-static {p1, v0, v2}, Lcom/alibaba/fastjson2/JSONB;->writeInt([BII)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    add-int/2addr v2, v0

    .line 115
    array-length v0, p0

    .line 116
    invoke-static {p0, v1, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 117
    .line 118
    .line 119
    return-object p1
.end method

.method public static toBytes(S)[B
    .locals 3

    .line 131
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    new-instance v1, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 132
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeInt16(S)V

    .line 133
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 135
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static toBytes(Z)[B
    .locals 2

    if-eqz p0, :cond_0

    const/16 p0, -0x4f

    goto :goto_0

    :cond_0
    const/16 p0, -0x50

    :goto_0
    const/4 v0, 0x1

    .line 148
    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    return-object v0
.end method

.method public static toJSONString([B)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONBDump;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/alibaba/fastjson2/JSONBDump;-><init>([BZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static toJSONString([BLcom/alibaba/fastjson2/SymbolTable;)Ljava/lang/String;
    .locals 2

    .line 14
    new-instance v0, Lcom/alibaba/fastjson2/JSONBDump;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/alibaba/fastjson2/JSONBDump;-><init>([BLcom/alibaba/fastjson2/SymbolTable;Z)V

    .line 15
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toJSONString([BZ)Ljava/lang/String;
    .locals 1

    .line 12
    new-instance v0, Lcom/alibaba/fastjson2/JSONBDump;

    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/JSONBDump;-><init>([BZ)V

    .line 13
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONBDump;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static typeName(B)Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0x48

    .line 2
    .line 3
    const-string v1, "INT32 "

    .line 4
    .line 5
    if-eq p0, v0, :cond_9

    .line 6
    .line 7
    const/16 v0, 0x7f

    .line 8
    .line 9
    if-eq p0, v0, :cond_8

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string v0, "INT64 "

    .line 15
    .line 16
    packed-switch p0, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    packed-switch p0, :pswitch_data_2

    .line 20
    .line 21
    .line 22
    const/16 v2, -0x6c

    .line 23
    .line 24
    if-lt p0, v2, :cond_0

    .line 25
    .line 26
    const/16 v2, -0x5c

    .line 27
    .line 28
    if-gt p0, v2, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "ARRAY "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    const/16 v2, 0x49

    .line 43
    .line 44
    if-lt p0, v2, :cond_1

    .line 45
    .line 46
    const/16 v2, 0x79

    .line 47
    .line 48
    if-gt p0, v2, :cond_1

    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "STR_ASCII "

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_1
    const/16 v2, -0x10

    .line 63
    .line 64
    if-lt p0, v2, :cond_2

    .line 65
    .line 66
    const/16 v2, 0x2f

    .line 67
    .line 68
    if-gt p0, v2, :cond_2

    .line 69
    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_2
    const/16 v2, 0x30

    .line 81
    .line 82
    if-lt p0, v2, :cond_3

    .line 83
    .line 84
    const/16 v2, 0x3f

    .line 85
    .line 86
    if-gt p0, v2, :cond_3

    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_3
    const/16 v2, 0x40

    .line 99
    .line 100
    if-lt p0, v2, :cond_4

    .line 101
    .line 102
    const/16 v2, 0x47

    .line 103
    .line 104
    if-gt p0, v2, :cond_4

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_4
    const/16 v1, -0x28

    .line 117
    .line 118
    if-lt p0, v1, :cond_5

    .line 119
    .line 120
    const/16 v1, -0x11

    .line 121
    .line 122
    if-gt p0, v1, :cond_5

    .line 123
    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0, v1}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_5
    const/16 v1, -0x38

    .line 135
    .line 136
    if-lt p0, v1, :cond_6

    .line 137
    .line 138
    const/16 v1, -0x29

    .line 139
    .line 140
    if-gt p0, v1, :cond_6

    .line 141
    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p0, v1}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_6
    const/16 v1, -0x40

    .line 153
    .line 154
    if-lt p0, v1, :cond_7

    .line 155
    .line 156
    const/16 v1, -0x39

    .line 157
    .line 158
    if-gt p0, v1, :cond_7

    .line 159
    .line 160
    new-instance v1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p0, v1}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :cond_7
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v1, "STR_UTF16BE "

    .line 178
    .line 179
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v1, "STR_UTF16LE "

    .line 190
    .line 191
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v1, "STR_UTF16 "

    .line 202
    .line 203
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0

    .line 211
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v1, "STR_UTF8 "

    .line 214
    .line 215
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :pswitch_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-static {p0, v1}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v1, "INT8 "

    .line 236
    .line 237
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v1, "INT16 "

    .line 248
    .line 249
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v1, "BIGINT "

    .line 260
    .line 261
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    return-object p0

    .line 269
    :pswitch_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v1, "DECIMAL "

    .line 272
    .line 273
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v1, "FLOAT "

    .line 284
    .line 285
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    return-object p0

    .line 293
    :pswitch_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v1, "DOUBLE "

    .line 296
    .line 297
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    return-object p0

    .line 305
    :pswitch_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v1, "TRUE "

    .line 308
    .line 309
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :pswitch_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-string v1, "FALSE "

    .line 320
    .line 321
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v1, "NULL "

    .line 332
    .line 333
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    return-object p0

    .line 341
    :pswitch_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-string v1, "TIMESTAMP "

    .line 344
    .line 345
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    return-object p0

    .line 353
    :pswitch_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v1, "TIMESTAMP_MINUTES "

    .line 356
    .line 357
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    return-object p0

    .line 365
    :pswitch_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v1, "TIMESTAMP_SECONDS "

    .line 368
    .line 369
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :pswitch_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v1, "TIMESTAMP_MILLIS "

    .line 380
    .line 381
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    return-object p0

    .line 389
    :pswitch_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v1, "TIMESTAMP_WITH_TIMEZONE "

    .line 392
    .line 393
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    return-object p0

    .line 401
    :pswitch_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    const-string v1, "LOCAL_DATE "

    .line 404
    .line 405
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    return-object p0

    .line 413
    :pswitch_14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    const-string v1, "LOCAL_DATETIME "

    .line 416
    .line 417
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    return-object p0

    .line 425
    :pswitch_15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    const-string v1, "LOCAL_TIME "

    .line 428
    .line 429
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    return-object p0

    .line 437
    :pswitch_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    const-string v1, "OBJECT "

    .line 440
    .line 441
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    return-object p0

    .line 449
    :pswitch_17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v1, "OBJECT_END "

    .line 452
    .line 453
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    return-object p0

    .line 461
    :pswitch_18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    const-string v1, "REFERENCE "

    .line 464
    .line 465
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    return-object p0

    .line 473
    :pswitch_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 474
    .line 475
    const-string v1, "TYPED_ANY "

    .line 476
    .line 477
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    return-object p0

    .line 485
    :pswitch_1a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v1, "BINARY "

    .line 488
    .line 489
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    return-object p0

    .line 497
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v1, "SYMBOL "

    .line 500
    .line 501
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p0

    .line 508
    return-object p0

    .line 509
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    invoke-static {p0, v0}, Lbc/e;->f(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    return-object p0

    :pswitch_data_0
    .packed-switch -0x6f
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x5b
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x7a
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static writeInt([BII)I
    .locals 3

    .line 1
    const/16 v0, -0x10

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p2, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x2f

    .line 7
    .line 8
    if-gt p2, v0, :cond_0

    .line 9
    .line 10
    int-to-byte p2, p2

    .line 11
    aput-byte p2, p0, p1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    const/16 v0, -0x800

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-lt p2, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x7ff

    .line 20
    .line 21
    if-gt p2, v0, :cond_1

    .line 22
    .line 23
    shr-int/lit8 v0, p2, 0x8

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x38

    .line 26
    .line 27
    int-to-byte v0, v0

    .line 28
    aput-byte v0, p0, p1

    .line 29
    .line 30
    add-int/2addr p1, v1

    .line 31
    int-to-byte p2, p2

    .line 32
    aput-byte p2, p0, p1

    .line 33
    .line 34
    return v2

    .line 35
    :cond_1
    const/high16 v0, -0x40000

    .line 36
    .line 37
    if-lt p2, v0, :cond_2

    .line 38
    .line 39
    const v0, 0x3ffff

    .line 40
    .line 41
    .line 42
    if-gt p2, v0, :cond_2

    .line 43
    .line 44
    shr-int/lit8 v0, p2, 0x10

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x44

    .line 47
    .line 48
    int-to-byte v0, v0

    .line 49
    aput-byte v0, p0, p1

    .line 50
    .line 51
    add-int/lit8 v0, p1, 0x1

    .line 52
    .line 53
    shr-int/lit8 v1, p2, 0x8

    .line 54
    .line 55
    int-to-byte v1, v1

    .line 56
    aput-byte v1, p0, v0

    .line 57
    .line 58
    add-int/2addr p1, v2

    .line 59
    int-to-byte p2, p2

    .line 60
    aput-byte p2, p0, p1

    .line 61
    .line 62
    const/4 p0, 0x3

    .line 63
    return p0

    .line 64
    :cond_2
    const/16 v0, 0x48

    .line 65
    .line 66
    aput-byte v0, p0, p1

    .line 67
    .line 68
    add-int/lit8 v0, p1, 0x1

    .line 69
    .line 70
    ushr-int/lit8 v1, p2, 0x18

    .line 71
    .line 72
    int-to-byte v1, v1

    .line 73
    aput-byte v1, p0, v0

    .line 74
    .line 75
    add-int/lit8 v0, p1, 0x2

    .line 76
    .line 77
    ushr-int/lit8 v1, p2, 0x10

    .line 78
    .line 79
    int-to-byte v1, v1

    .line 80
    aput-byte v1, p0, v0

    .line 81
    .line 82
    add-int/lit8 v0, p1, 0x3

    .line 83
    .line 84
    ushr-int/lit8 v1, p2, 0x8

    .line 85
    .line 86
    int-to-byte v1, v1

    .line 87
    aput-byte v1, p0, v0

    .line 88
    .line 89
    add-int/lit8 p1, p1, 0x4

    .line 90
    .line 91
    int-to-byte p2, p2

    .line 92
    aput-byte p2, p0, p1

    .line 93
    .line 94
    const/4 p0, 0x5

    .line 95
    return p0
.end method

.method public static varargs writeTo(Ljava/io/OutputStream;Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)I
    .locals 7

    .line 1
    :try_start_0
    new-instance v1, Lcom/alibaba/fastjson2/JSONWriterJSONB;

    .line 2
    .line 3
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 6
    .line 7
    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lcom/alibaba/fastjson2/JSONWriterJSONB;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Context;Lcom/alibaba/fastjson2/SymbolTable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-virtual {v1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->config([Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 15
    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->writeNull()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object p0, v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONWriter;->setRootObject(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {v1, p2, p2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v4, 0x0

    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    move-object v2, p1

    .line 42
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->flushTo(Ljava/io/OutputStream;)I

    .line 46
    .line 47
    .line 48
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :try_start_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    .line 51
    .line 52
    return p0

    .line 53
    :goto_1
    :try_start_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriterJSONB;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    move-object p1, v0

    .line 59
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :goto_2
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 63
    :catch_0
    move-exception v0

    .line 64
    move-object p0, v0

    .line 65
    const-string p1, "writeJSONString error"

    .line 66
    .line 67
    invoke-static {p1, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return p0
.end method
