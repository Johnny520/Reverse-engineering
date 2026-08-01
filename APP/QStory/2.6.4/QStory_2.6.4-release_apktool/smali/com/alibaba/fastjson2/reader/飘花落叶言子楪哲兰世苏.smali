.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世哲苏兰楪:Ljava/util/function/BiConsumer;


# direct methods
.method public constructor <init>(IJLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/Locale;Ljava/util/function/BiConsumer;)V
    .locals 14

    .line 1
    move-object/from16 v7, p8

    .line 2
    .line 3
    if-nez v7, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 6
    .line 7
    move-object/from16 v8, p12

    .line 8
    .line 9
    :goto_0
    move v4, p1

    .line 10
    move-wide/from16 v5, p2

    .line 11
    .line 12
    move-object/from16 v10, p4

    .line 13
    .line 14
    move-object/from16 v3, p5

    .line 15
    .line 16
    move-object/from16 v9, p6

    .line 17
    .line 18
    move-object/from16 v1, p7

    .line 19
    .line 20
    move-object/from16 v12, p9

    .line 21
    .line 22
    move-object/from16 v11, p10

    .line 23
    .line 24
    move-object/from16 v2, p11

    .line 25
    .line 26
    move-object v13, v0

    .line 27
    move-object v0, p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 30
    .line 31
    move-object/from16 v8, p12

    .line 32
    .line 33
    invoke-direct {v0, v7, v8}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    invoke-direct/range {v0 .. v13}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 p1, p13

    .line 41
    .line 42
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世哲苏兰楪:Ljava/util/function/BiConsumer;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final 飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世哲苏兰楪:Ljava/util/function/BiConsumer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "set "

    .line 12
    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    const-string v2, " error"

    .line 16
    .line 17
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    :try_start_0
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v3, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p0

    .line 30
    invoke-static {v1, v0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-wide/16 v3, -0x1

    .line 39
    .line 40
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 41
    .line 42
    cmp-long v3, v5, v3

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 47
    .line 48
    invoke-virtual {p0, p1, v5, v6, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    :try_start_1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catch_1
    move-exception p0

    .line 59
    invoke-static {v1, v0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    const-string p0, " error, object is null"

    .line 68
    .line 69
    invoke-static {v1, v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final 飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Ljava/time/ZonedDateTime;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    new-instance p2, Ljava/util/Date;

    .line 10
    .line 11
    invoke-direct {p2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final 飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p2, v0}, Ljava/time/chrono/ChronoLocalDateTime;->toInstant(Ljava/time/ZoneOffset;)Ljava/time/Instant;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, Ljava/util/Date;->from(Ljava/time/Instant;)Ljava/util/Date;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final 飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/time/Instant;)V
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/util/Date;->from(Ljava/time/Instant;)Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;J)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, Ljava/util/Date;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/Date;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    move-object p1, v0

    .line 19
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 20
    .line 21
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 24
    .line 25
    and-long/2addr v0, v2

    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    throw p1
.end method
