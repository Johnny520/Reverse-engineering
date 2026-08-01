.class public Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

.field public 飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# direct methods
.method public constructor <init>(IJLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/Locale;Ljava/util/function/BiConsumer;)V
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    move v4, p1

    .line 3
    move-wide v5, p2

    .line 4
    move-object/from16 v10, p4

    .line 5
    .line 6
    move-object/from16 v3, p5

    .line 7
    .line 8
    move-object/from16 v9, p6

    .line 9
    .line 10
    move-object/from16 v1, p7

    .line 11
    .line 12
    move-object/from16 v7, p8

    .line 13
    .line 14
    move-object/from16 v12, p9

    .line 15
    .line 16
    move-object/from16 v11, p10

    .line 17
    .line 18
    move-object/from16 v2, p11

    .line 19
    .line 20
    move-object/from16 v8, p12

    .line 21
    .line 22
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 p1, p13

    .line 26
    .line 27
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 28
    .line 29
    return-void
.end method

.method public static 飘花落叶言子世楪苏兰哲(Ljava/util/Map;Ljava/util/Collection;Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;Ljava/util/function/BiConsumer;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    move-object v4, p0

    .line 4
    move-object v1, p2

    .line 5
    move-object v2, p3

    .line 6
    move-object v3, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

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
    if-nez p2, :cond_1

    .line 9
    .line 10
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 11
    .line 12
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 13
    .line 14
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 15
    .line 16
    and-long/2addr v0, v2

    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v0, v0, v2

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 27
    .line 28
    if-ne v1, v0, :cond_3

    .line 29
    .line 30
    instance-of v0, p2, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    check-cast p2, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x0

    .line 41
    if-lez v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    .line 57
    .line 58
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 65
    .line 66
    invoke-static {p2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    :try_start_0
    invoke-interface {v0, p1, p2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_0
    move-exception p1

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 81
    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 93
    .line 94
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 95
    .line 96
    invoke-virtual {v1, p1, v2, v3, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :goto_1
    new-instance p2, Lcom/alibaba/fastjson2/JSONException;

    .line 101
    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v2, "set "

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    goto :goto_2

    .line 116
    :cond_7
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 117
    .line 118
    :goto_2
    const-string v0, " error"

    .line 119
    .line 120
    invoke-static {v1, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-direct {p2, p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    throw p2
.end method

.method public 飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 12
    .line 13
    instance-of v0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲世兰()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 26
    .line 27
    invoke-interface {v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 40
    .line 41
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 42
    .line 43
    invoke-interface {v0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, p2, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v1, p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p0

    .line 55
    const-string p1, "read unwrapped field error"

    .line 56
    .line 57
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰子苏世()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲兰苏:Z

    .line 2
    .line 3
    const-wide/16 v8, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 8
    .line 9
    iget-wide v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 10
    .line 11
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 12
    .line 13
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v6, v4

    .line 16
    cmp-long v0, v6, v8

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰子苏世()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 25
    .line 26
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 27
    .line 28
    and-long/2addr v4, v6

    .line 29
    cmp-long v0, v4, v8

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "not support none-Serializable"

    .line 35
    .line 36
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/Locale;

    .line 50
    .line 51
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 52
    .line 53
    invoke-static {v5, v2, v0, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 63
    .line 64
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 69
    .line 70
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_6

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v2, ".."

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    invoke-virtual {p0, p2, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    invoke-virtual {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    const/4 v10, 0x0

    .line 97
    :try_start_0
    iget-char v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_d

    .line 104
    .line 105
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    goto/16 :goto_6

    .line 110
    .line 111
    :cond_7
    const-class v0, Ljava/util/OptionalInt;

    .line 112
    .line 113
    if-ne v2, v0, :cond_8

    .line 114
    .line 115
    invoke-static {}, Ljava/util/OptionalInt;->empty()Ljava/util/OptionalInt;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto/16 :goto_6

    .line 120
    .line 121
    :catch_0
    move-exception v0

    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :catch_1
    move-exception v0

    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :cond_8
    const-class v0, Ljava/util/OptionalLong;

    .line 128
    .line 129
    if-ne v2, v0, :cond_9

    .line 130
    .line 131
    invoke-static {}, Ljava/util/OptionalLong;->empty()Ljava/util/OptionalLong;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_9
    const-class v0, Ljava/util/OptionalDouble;

    .line 138
    .line 139
    if-ne v2, v0, :cond_a

    .line 140
    .line 141
    invoke-static {}, Ljava/util/OptionalDouble;->empty()Ljava/util/OptionalDouble;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :cond_a
    const-class v0, Ljava/util/Optional;

    .line 148
    .line 149
    if-ne v2, v0, :cond_b

    .line 150
    .line 151
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    goto/16 :goto_6

    .line 156
    .line 157
    :cond_b
    const/16 v0, 0x6e

    .line 158
    .line 159
    if-ne v4, v0, :cond_c

    .line 160
    .line 161
    goto/16 :goto_5

    .line 162
    .line 163
    :cond_c
    const-string v0, ""

    .line 164
    .line 165
    goto/16 :goto_6

    .line 166
    .line 167
    :cond_d
    iget-boolean v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 168
    .line 169
    if-eqz v4, :cond_10

    .line 170
    .line 171
    const-class v4, Ljava/lang/Object;

    .line 172
    .line 173
    if-ne v2, v4, :cond_f

    .line 174
    .line 175
    const-class v7, Ljava/lang/Object;

    .line 176
    .line 177
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 178
    .line 179
    const-wide/16 v3, 0x0

    .line 180
    .line 181
    move-object v2, p1

    .line 182
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_e

    .line 187
    .line 188
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 189
    .line 190
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 191
    .line 192
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 193
    .line 194
    move-object v3, p1

    .line 195
    move-object v2, v0

    .line 196
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    goto/16 :goto_6

    .line 201
    .line 202
    :cond_e
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    goto/16 :goto_6

    .line 207
    .line 208
    :cond_f
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 209
    .line 210
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 211
    .line 212
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 213
    .line 214
    move-object v3, p1

    .line 215
    move-object v2, v0

    .line 216
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    goto :goto_6

    .line 221
    :cond_10
    move-object v2, v0

    .line 222
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 223
    .line 224
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 225
    .line 226
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 227
    .line 228
    move-object v3, p1

    .line 229
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONSchemaValidException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessError; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    goto :goto_6

    .line 234
    :goto_2
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 235
    .line 236
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 237
    .line 238
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 239
    .line 240
    and-long/2addr v4, v6

    .line 241
    cmp-long v2, v4, v8

    .line 242
    .line 243
    if-nez v2, :cond_13

    .line 244
    .line 245
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 246
    .line 247
    if-eqz v2, :cond_11

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_11
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 251
    .line 252
    :goto_3
    if-eqz v2, :cond_12

    .line 253
    .line 254
    new-instance v1, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v4, "read field \'"

    .line 257
    .line 258
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v2}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v4, "."

    .line 273
    .line 274
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-interface {v2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    goto :goto_4

    .line 289
    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    const-string v4, "read field "

    .line 292
    .line 293
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 297
    .line 298
    const-string v4, " error"

    .line 299
    .line 300
    invoke-static {v2, v1, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    :goto_4
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :cond_13
    :goto_5
    move-object v0, v10

    .line 313
    :goto_6
    invoke-virtual {p0, p2, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲楪兰:Z

    .line 317
    .line 318
    if-eqz v1, :cond_1b

    .line 319
    .line 320
    if-eqz v0, :cond_1b

    .line 321
    .line 322
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/reflect/Type;

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 329
    .line 330
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, [Ljava/lang/reflect/Field;

    .line 335
    .line 336
    const/4 v3, 0x0

    .line 337
    if-nez v2, :cond_18

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    array-length v4, v2

    .line 344
    move v5, v3

    .line 345
    :goto_7
    if-ge v5, v4, :cond_17

    .line 346
    .line 347
    aget-object v6, v2, v5

    .line 348
    .line 349
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-eqz v6, :cond_16

    .line 358
    .line 359
    new-instance v4, Ljava/util/ArrayList;

    .line 360
    .line 361
    array-length v5, v2

    .line 362
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 363
    .line 364
    .line 365
    array-length v5, v2

    .line 366
    move v6, v3

    .line 367
    :goto_8
    if-ge v6, v5, :cond_15

    .line 368
    .line 369
    aget-object v7, v2, v6

    .line 370
    .line 371
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    if-eqz v8, :cond_14

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_14
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    :goto_9
    add-int/lit8 v6, v6, 0x1

    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_15
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    new-array v2, v2, [Ljava/lang/reflect/Field;

    .line 393
    .line 394
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    check-cast v2, [Ljava/lang/reflect/Field;

    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_16
    add-int/lit8 v5, v5, 0x1

    .line 402
    .line 403
    goto :goto_7

    .line 404
    :cond_17
    :goto_a
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 405
    .line 406
    invoke-virtual {v4, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    :cond_18
    array-length v4, v2

    .line 410
    :goto_b
    if-ge v3, v4, :cond_1a

    .line 411
    .line 412
    aget-object v5, v2, v3

    .line 413
    .line 414
    const-string v6, "this$0"

    .line 415
    .line 416
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-eqz v6, :cond_19

    .line 425
    .line 426
    move-object v10, v5

    .line 427
    :cond_19
    add-int/lit8 v3, v3, 0x1

    .line 428
    .line 429
    goto :goto_b

    .line 430
    :cond_1a
    if-eqz v10, :cond_1b

    .line 431
    .line 432
    const/4 v2, 0x1

    .line 433
    invoke-virtual {v10, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 434
    .line 435
    .line 436
    :try_start_1
    invoke-virtual {v10, v0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2

    .line 437
    .line 438
    .line 439
    goto :goto_c

    .line 440
    :catch_2
    const-string v0, "setNoneStaticMemberClassParent error, class "

    .line 441
    .line 442
    invoke-static {v1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    :cond_1b
    :goto_c
    return-void

    .line 450
    :catch_3
    move-exception v0

    .line 451
    throw v0
.end method

.method public 飘花落叶言子楪兰哲苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲兰苏:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v4, -0x6e

    .line 14
    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 18
    .line 19
    iget-wide v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 20
    .line 21
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 22
    .line 23
    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 24
    .line 25
    and-long/2addr v7, v5

    .line 26
    cmp-long v0, v7, v2

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰子苏世()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 35
    .line 36
    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 37
    .line 38
    and-long/2addr v5, v7

    .line 39
    cmp-long v0, v5, v2

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    const-class v0, Ljava/lang/Object;

    .line 44
    .line 45
    if-ne v1, v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪世哲苏()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世()B

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eq v0, v4, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-string p0, "not support none-Serializable"

    .line 61
    .line 62
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 71
    .line 72
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 73
    .line 74
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 79
    .line 80
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, ".."

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0, p2, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    invoke-virtual {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_5
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 107
    .line 108
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 109
    .line 110
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 111
    .line 112
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 113
    .line 114
    move-object v5, p1

    .line 115
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-nez p1, :cond_7

    .line 120
    .line 121
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 122
    .line 123
    invoke-virtual {v5, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏(J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v6

    .line 127
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 128
    .line 129
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 130
    .line 131
    and-long/2addr v6, v8

    .line 132
    cmp-long v0, v6, v2

    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_6

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    const-string p0, "primitive value not support input null"

    .line 144
    .line 145
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_7
    :goto_1
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 22
    .line 23
    move-object v2, p1

    .line 24
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, p1

    .line 30
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 33
    .line 34
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 39
    .line 40
    invoke-interface {p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲世苏兰()Ljava/util/function/Function;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_2
    return-object p1
.end method

.method public 飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/Locale;

    .line 20
    .line 21
    invoke-static {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    const-class v1, Ljava/util/Map;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 45
    .line 46
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 47
    .line 48
    invoke-static {p1, v0, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    const-class v1, Ljava/util/Collection;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 70
    .line 71
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 85
    .line 86
    return-object p1
.end method

.method public 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/Locale;

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const-class v0, Ljava/util/Map;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 38
    .line 39
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 40
    .line 41
    invoke-static {p1, v0, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2
    const-class v0, Ljava/util/Collection;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 74
    .line 75
    return-object p1
.end method

.method public final 飘花落叶言子楪苏兰哲世()Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Ljava/util/function/BiConsumer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 2
    .line 3
    return-object p0
.end method
