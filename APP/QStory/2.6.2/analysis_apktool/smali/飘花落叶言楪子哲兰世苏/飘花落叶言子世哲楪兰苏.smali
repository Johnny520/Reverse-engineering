.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子世哲楪兰苏;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏兰哲楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move v3, p2

    .line 4
    move-wide/from16 v4, p3

    .line 5
    .line 6
    move-object/from16 v6, p5

    .line 7
    .line 8
    move-object/from16 v7, p6

    .line 9
    .line 10
    move-object/from16 v2, p7

    .line 11
    .line 12
    move-object/from16 v10, p8

    .line 13
    .line 14
    move-object/from16 v11, p9

    .line 15
    .line 16
    move-object/from16 v8, p11

    .line 17
    .line 18
    move-object/from16 v9, p12

    .line 19
    .line 20
    move-object/from16 v12, p13

    .line 21
    .line 22
    invoke-direct/range {v0 .. v12}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏兰哲楪;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 p1, p10

    .line 26
    .line 27
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()Ljava/util/function/Function;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/util/List;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰世楪(I)V

    .line 26
    .line 27
    .line 28
    move-object v3, v2

    .line 29
    :goto_0
    if-ge v1, v0, :cond_3

    .line 30
    .line 31
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-ne v5, v2, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {p0, p1, v5}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    move-object v2, v5

    .line 53
    :goto_1
    invoke-interface {v3, p1, v4}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    return-void

    .line 60
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 61
    .line 62
    .line 63
    move-object v0, v2

    .line 64
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-ge v1, v3, :cond_8

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 73
    .line 74
    .line 75
    :cond_5
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-nez v3, :cond_6

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 82
    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-ne v4, v2, :cond_7

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    invoke-virtual {p0, p1, v4}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v2, v4

    .line 97
    :goto_4
    invoke-interface {v0, p1, v3}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世哲楪兰苏;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iget-wide v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    iget-object p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 17
    .line 18
    iget-wide v5, p2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 19
    .line 20
    or-long/2addr v3, v5

    .line 21
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 26
    .line 27
    iget-wide v7, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 28
    .line 29
    or-long/2addr v5, v7

    .line 30
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 31
    .line 32
    iget-wide v7, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 33
    .line 34
    or-long/2addr v5, v7

    .line 35
    and-long/2addr v5, v3

    .line 36
    cmp-long p2, v5, v0

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v3, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲世楪(J)V

    .line 45
    .line 46
    .line 47
    return v2

    .line 48
    :cond_1
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 49
    .line 50
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 51
    .line 52
    and-long/2addr v3, v5

    .line 53
    cmp-long v0, v3, v0

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {p1, p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲楪兰世(L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return v2

    .line 80
    :cond_3
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 81
    .line 82
    const-class v1, Ljava/lang/String;

    .line 83
    .line 84
    if-ne v0, v1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return v2

    .line 97
    :catch_0
    move-exception p0

    .line 98
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    :goto_1
    const/4 p0, 0x0

    .line 105
    return p0

    .line 106
    :cond_5
    throw p0
.end method
