.class public interface abstract Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 20
    .line 21
    .line 22
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    :try_start_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世苏哲(Lcom/alibaba/fastjson2/JSONArray;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_0
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 48
    .line 49
    const/16 v3, 0x1a

    .line 50
    .line 51
    if-eq v2, v3, :cond_4

    .line 52
    .line 53
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 54
    .line 55
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 56
    .line 57
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 58
    .line 59
    and-long/2addr v1, v3

    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    cmp-long v1, v1, v3

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 68
    .line 69
    const-string v1, "input not end"

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :goto_2
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :catchall_1
    move-exception p0

    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    throw v0

    .line 92
    :cond_5
    :goto_4
    return-object v0
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 9

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_4

    .line 10
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 20
    .line 21
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, p1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v6, 0x0

    .line 33
    const-wide/16 v7, 0x0

    .line 34
    .line 35
    move-object v5, p1

    .line 36
    :try_start_0
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p1, v4, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v4, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p0, v0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    :goto_0
    iget-char p1, v4, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 52
    .line 53
    const/16 v0, 0x1a

    .line 54
    .line 55
    if-eq p1, v0, :cond_3

    .line 56
    .line 57
    iget-wide v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 58
    .line 59
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 60
    .line 61
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 62
    .line 63
    and-long/2addr v0, v2

    .line 64
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    cmp-long p1, v0, v2

    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 72
    .line 73
    const-string p1, "input not end"

    .line 74
    .line 75
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/io/Closeable;->close()V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :goto_2
    :try_start_1
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    move-object p1, v0

    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :goto_3
    throw p0

    .line 97
    :cond_4
    :goto_4
    const/4 p0, 0x0

    .line 98
    return-object p0
.end method

.method public static varargs 飘花落叶言子楪世哲兰苏(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 8

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_5

    .line 10
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    iget-wide v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 17
    .line 18
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 19
    .line 20
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 21
    .line 22
    and-long/2addr v0, v3

    .line 23
    const-wide/16 v6, 0x0

    .line 24
    .line 25
    cmp-long p1, v0, v6

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    :goto_0
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 35
    .line 36
    invoke-virtual {v0, v2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v3, 0x0

    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    :try_start_0
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object p1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p0, v0

    .line 61
    goto :goto_3

    .line 62
    :cond_2
    :goto_1
    iget-char p1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 63
    .line 64
    const/16 v0, 0x1a

    .line 65
    .line 66
    if-eq p1, v0, :cond_4

    .line 67
    .line 68
    iget-wide p1, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 69
    .line 70
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 71
    .line 72
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 73
    .line 74
    and-long/2addr p1, v2

    .line 75
    cmp-long p1, p1, v6

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 81
    .line 82
    const-string p1, "input not end"

    .line 83
    .line 84
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :goto_3
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :goto_4
    throw p0

    .line 106
    :cond_5
    :goto_5
    const/4 p0, 0x0

    .line 107
    return-object p0
.end method

.method public static varargs 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v1, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_7

    .line 5
    .line 6
    :cond_0
    instance-of v0, p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 7
    .line 8
    if-nez v0, :cond_d

    .line 9
    .line 10
    instance-of v0, p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    if-nez p1, :cond_2

    .line 16
    .line 17
    sget-object p1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 18
    .line 19
    new-instance p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 20
    .line 21
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 30
    .line 31
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 32
    .line 33
    invoke-direct {v0, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v0

    .line 37
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    instance-of v0, v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 46
    .line 47
    const-wide/16 v9, 0x0

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 52
    .line 53
    iget-wide v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 54
    .line 55
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 56
    .line 57
    and-long/2addr v5, v3

    .line 58
    cmp-long v0, v5, v9

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move-object v0, v2

    .line 64
    check-cast v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 65
    .line 66
    iget-wide v5, v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲世苏兰:J

    .line 67
    .line 68
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 69
    .line 70
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 71
    .line 72
    and-long/2addr v5, v7

    .line 73
    cmp-long v5, v5, v9

    .line 74
    .line 75
    if-nez v5, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0, p0, v3, v4}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;J)Lcom/alibaba/fastjson2/JSONObject;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_4
    :goto_1
    :try_start_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 83
    .line 84
    .line 85
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :try_start_1
    iget-wide v7, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    move-object v4, p0

    .line 91
    invoke-interface/range {v2 .. v8}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 98
    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 99
    .line 100
    .line 101
    if-eqz p0, :cond_c

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_5
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 116
    .line 117
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :try_start_3
    iget-char p0, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 125
    .line 126
    iget-wide v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 127
    .line 128
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 129
    .line 130
    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 131
    .line 132
    and-long/2addr v3, v5

    .line 133
    cmp-long v1, v3, v9

    .line 134
    .line 135
    if-nez v1, :cond_8

    .line 136
    .line 137
    const/16 v1, 0x7b

    .line 138
    .line 139
    if-eq p0, v1, :cond_6

    .line 140
    .line 141
    const/16 v3, 0x5b

    .line 142
    .line 143
    if-ne p0, v3, :cond_8

    .line 144
    .line 145
    :cond_6
    if-ne p0, v1, :cond_7

    .line 146
    .line 147
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 148
    .line 149
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, p0, v9, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世哲苏(Ljava/util/Map;J)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    move-object p0, v0

    .line 158
    goto :goto_5

    .line 159
    :cond_7
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 160
    .line 161
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世苏哲(Lcom/alibaba/fastjson2/JSONArray;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    iget-object p1, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 168
    .line 169
    if-eqz p1, :cond_9

    .line 170
    .line 171
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_8
    const-class p0, Ljava/lang/Object;

    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    invoke-virtual {p1, p0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    const/4 v4, 0x0

    .line 183
    const-wide/16 v5, 0x0

    .line 184
    .line 185
    const/4 v3, 0x0

    .line 186
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    :cond_9
    :goto_3
    iget-char p1, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 191
    .line 192
    const/16 v1, 0x1a

    .line 193
    .line 194
    if-eq p1, v1, :cond_b

    .line 195
    .line 196
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 197
    .line 198
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 199
    .line 200
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 201
    .line 202
    and-long/2addr v0, v3

    .line 203
    cmp-long p1, v0, v9

    .line 204
    .line 205
    if-eqz p1, :cond_a

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_a
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 209
    .line 210
    const-string p1, "input not end"

    .line 211
    .line 212
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 220
    :cond_b
    :goto_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 221
    .line 222
    .line 223
    return-object p0

    .line 224
    :goto_5
    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    move-object p1, v0

    .line 230
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    :goto_6
    throw p0

    .line 234
    :cond_c
    :goto_7
    return-object v1

    .line 235
    :catch_0
    move-exception v0

    .line 236
    :goto_8
    move-object p0, v0

    .line 237
    goto :goto_a

    .line 238
    :catch_1
    move-exception v0

    .line 239
    goto :goto_8

    .line 240
    :catchall_2
    move-exception v0

    .line 241
    move-object p0, v0

    .line 242
    :try_start_5
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 243
    .line 244
    .line 245
    goto :goto_9

    .line 246
    :catchall_3
    move-exception v0

    .line 247
    move-object p1, v0

    .line 248
    :try_start_6
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    :goto_9
    throw p0
    :try_end_6
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_0

    .line 252
    :goto_a
    const-string p1, "toJSONString error"

    .line 253
    .line 254
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    return-object v1

    .line 258
    :cond_d
    move-object v4, p0

    .line 259
    return-object v4
.end method

.method public static varargs 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p0, v0

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iput-object p0, v3, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 24
    .line 25
    iput-object p1, v3, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 32
    .line 33
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 34
    .line 35
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 36
    .line 37
    and-long/2addr v1, v4

    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    cmp-long v1, v1, v4

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v1, 0x0

    .line 47
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p1, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/4 v6, 0x0

    .line 54
    const-wide/16 v7, 0x0

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    move-object v4, p0

    .line 58
    invoke-interface/range {v2 .. v8}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :goto_2
    :try_start_1
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    move-object p1, v0

    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_3
    throw p0
.end method

.method public static varargs 飘花落叶言子楪世苏哲兰(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 20
    .line 21
    .line 22
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    :try_start_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世苏哲(Lcom/alibaba/fastjson2/JSONArray;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_0
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 48
    .line 49
    const/16 v2, 0x1a

    .line 50
    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    iget-wide v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 54
    .line 55
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 56
    .line 57
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 58
    .line 59
    and-long/2addr v1, v3

    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    cmp-long p1, v1, v3

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    .line 68
    .line 69
    const-string v0, "input not end"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :goto_2
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :catchall_1
    move-exception p0

    .line 88
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    throw p1

    .line 92
    :cond_5
    :goto_4
    return-object v0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 20
    .line 21
    .line 22
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    :try_start_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 32
    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    invoke-virtual {p0, v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世哲苏(Ljava/util/Map;J)V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_0
    iget-char v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 50
    .line 51
    const/16 v5, 0x1a

    .line 52
    .line 53
    if-eq v4, v5, :cond_4

    .line 54
    .line 55
    iget-wide v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 56
    .line 57
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 58
    .line 59
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 60
    .line 61
    and-long/2addr v4, v6

    .line 62
    cmp-long v1, v4, v2

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 68
    .line 69
    const-string v1, "input not end"

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :goto_2
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :catchall_1
    move-exception p0

    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    throw v0

    .line 92
    :cond_5
    :goto_4
    return-object v0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 9
    .line 10
    .line 11
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    :try_start_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 15
    .line 16
    .line 17
    :goto_0
    move-object v4, p0

    .line 18
    goto :goto_3

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    move-object v4, p0

    .line 21
    :goto_1
    move-object p0, v0

    .line 22
    goto :goto_5

    .line 23
    :cond_0
    iput-object p0, v3, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 26
    .line 27
    iput-object v2, v3, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-class v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 34
    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-wide v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 40
    .line 41
    cmp-long v1, v7, v5

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    move-object v0, p0

    .line 46
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 53
    .line 54
    iget-wide v7, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 55
    .line 56
    cmp-long v1, v5, v5

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/4 v1, 0x0

    .line 63
    :goto_2
    invoke-virtual {v0, v2, v2, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 64
    .line 65
    .line 66
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    const/4 v6, 0x0

    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    move-object v4, p0

    .line 72
    :try_start_2
    invoke-interface/range {v2 .. v8}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 73
    .line 74
    .line 75
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    :try_start_3
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :catch_0
    move-exception v0

    .line 84
    :goto_4
    move-object p0, v0

    .line 85
    goto :goto_8

    .line 86
    :catch_1
    move-exception v0

    .line 87
    goto :goto_4

    .line 88
    :catchall_1
    move-exception v0

    .line 89
    goto :goto_1

    .line 90
    :goto_5
    :try_start_4
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 91
    .line 92
    .line 93
    goto :goto_6

    .line 94
    :catchall_2
    move-exception v0

    .line 95
    :try_start_5
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :goto_6
    throw p0
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_0

    .line 99
    :catch_2
    move-exception v0

    .line 100
    :goto_7
    move-object v4, p0

    .line 101
    goto :goto_4

    .line 102
    :catch_3
    move-exception v0

    .line 103
    goto :goto_7

    .line 104
    :goto_8
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v2, "JSON#toJSONString cannot serialize \'"

    .line 109
    .line 110
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v2, "\'"

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw v0
.end method

.method public static 飘花落叶言子楪苏哲世兰(Ljava/io/InputStream;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 7

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 12
    .line 13
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;

    .line 14
    .line 15
    invoke-direct {v2, v1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Ljava/io/InputStream;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    :try_start_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 31
    .line 32
    .line 33
    const-wide/16 v3, 0x0

    .line 34
    .line 35
    invoke-virtual {v2, p0, v3, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世哲苏(Ljava/util/Map;J)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_0
    iget-char v0, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 49
    .line 50
    const/16 v5, 0x1a

    .line 51
    .line 52
    if-eq v0, v5, :cond_4

    .line 53
    .line 54
    iget-wide v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 55
    .line 56
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 57
    .line 58
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 59
    .line 60
    and-long/2addr v0, v5

    .line 61
    cmp-long v0, v0, v3

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 67
    .line 68
    const-string v0, "input not end"

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :goto_2
    :try_start_2
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    throw p0
.end method
