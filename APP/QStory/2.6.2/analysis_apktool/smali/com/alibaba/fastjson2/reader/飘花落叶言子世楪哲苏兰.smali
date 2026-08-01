.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲苏兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final 飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final 飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final 飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Ljava/time/ZonedDateTime;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "set "

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 17
    .line 18
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 19
    .line 20
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 21
    .line 22
    and-long/2addr v2, v4

    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    cmp-long v2, v2, v4

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 33
    .line 34
    cmp-long v2, v4, v2

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 39
    .line 40
    invoke-virtual {p0, p1, v4, v5, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    :try_start_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception p0

    .line 51
    const-string p1, " error"

    .line 52
    .line 53
    invoke-static {v1, v0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    const-string p0, " error, object is null"

    .line 62
    .line 63
    invoke-static {v1, v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final 飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/time/Instant;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子世楪苏哲兰(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    const-class p1, Ljava/time/Instant;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 4
    .line 5
    if-eq p0, p1, :cond_1

    .line 6
    .line 7
    const-class p1, Ljava/lang/Long;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 6
    .line 7
    invoke-virtual {p2, p3}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 10
    .line 11
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/time/LocalDateTime;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, p1

    .line 22
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 25
    .line 26
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/time/LocalDateTime;

    .line 31
    .line 32
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
