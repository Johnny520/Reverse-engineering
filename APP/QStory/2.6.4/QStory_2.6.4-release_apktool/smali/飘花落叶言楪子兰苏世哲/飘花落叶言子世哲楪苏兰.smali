.class public abstract L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

.field public final 飘花落叶言子世兰哲苏楪:Z

.field public final 飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

.field public final 飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

.field public 飘花落叶言子世兰苏哲楪:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

.field public final 飘花落叶言子世兰苏楪哲:Z

.field public final 飘花落叶言子苏楪世哲兰:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V
    .locals 12

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p3

    .line 5
    move-wide/from16 v3, p4

    .line 6
    .line 7
    move-object/from16 v5, p6

    .line 8
    .line 9
    move-object/from16 v7, p7

    .line 10
    .line 11
    move-object/from16 v8, p8

    .line 12
    .line 13
    move-object/from16 v9, p9

    .line 14
    .line 15
    move-object/from16 v10, p10

    .line 16
    .line 17
    move-object/from16 v11, p11

    .line 18
    .line 19
    invoke-direct/range {v0 .. v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 20
    .line 21
    .line 22
    move-object/from16 v0, p12

    .line 23
    .line 24
    move-object p3, v5

    .line 25
    iput-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    and-long/2addr v0, v3

    .line 32
    const-wide/16 v5, 0x0

    .line 33
    .line 34
    cmp-long v0, v0, v5

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    move v0, v7

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v0, v6

    .line 43
    :goto_0
    iput-boolean v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲苏楪:Z

    .line 44
    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    const-class v0, Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object v0, p2

    .line 51
    :goto_1
    iput-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 52
    .line 53
    instance-of v0, v0, Ljava/lang/Class;

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    move-object v2, p2

    .line 58
    check-cast v2, Ljava/lang/Class;

    .line 59
    .line 60
    iput-object v2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    const-class v0, Ljava/lang/Enum;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    new-instance p2, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏楪哲世;

    .line 73
    .line 74
    move-object/from16 v9, p9

    .line 75
    .line 76
    invoke-direct {p2, v9, v2, v3, v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏楪哲世;-><init>(Ljava/lang/Class;Ljava/lang/Class;J)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const-class v0, Ljava/lang/String;

    .line 83
    .line 84
    if-ne v2, v0, :cond_3

    .line 85
    .line 86
    sget-object p2, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪哲苏世兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏世楪兰;

    .line 87
    .line 88
    iput-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏楪世哲;

    .line 92
    .line 93
    move-object/from16 v1, p8

    .line 94
    .line 95
    move-wide v4, v3

    .line 96
    move-object v3, p2

    .line 97
    invoke-direct/range {v0 .. v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏楪世哲;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iput-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 108
    .line 109
    :cond_5
    :goto_2
    iget-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 110
    .line 111
    if-eqz p2, :cond_6

    .line 112
    .line 113
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_6

    .line 118
    .line 119
    move v6, v7

    .line 120
    :cond_6
    iput-boolean v6, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏楪哲:Z

    .line 121
    .line 122
    if-eqz p3, :cond_7

    .line 123
    .line 124
    iget-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 125
    .line 126
    const-class v0, Ljava/util/Date;

    .line 127
    .line 128
    if-ne p2, v0, :cond_7

    .line 129
    .line 130
    new-instance p2, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

    .line 131
    .line 132
    const/4 v0, 0x0

    .line 133
    invoke-direct {p2, p3, v0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 134
    .line 135
    .line 136
    iput-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 137
    .line 138
    :cond_7
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-ne p2, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏哲楪:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    iget-boolean v1, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 8
    .line 9
    const-wide/16 v9, 0x0

    .line 10
    .line 11
    const/4 v11, 0x0

    .line 12
    const/4 v12, 0x1

    .line 13
    iget-wide v4, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 14
    .line 15
    if-eqz v1, :cond_c

    .line 16
    .line 17
    invoke-virtual {v2, v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v13, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    and-long/2addr v13, v5

    .line 26
    cmp-long v1, v13, v9

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    move v13, v12

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v13, v11

    .line 33
    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v14

    .line 37
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 38
    .line 39
    iget-wide v3, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 40
    .line 41
    and-long/2addr v3, v5

    .line 42
    cmp-long v1, v3, v9

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    move v1, v12

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v1, v11

    .line 49
    :goto_1
    iget-object v3, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {v2, v3, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世(Ljava/lang/Class;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世兰哲子(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {v2, v14}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 69
    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    :goto_2
    if-ge v11, v14, :cond_b

    .line 74
    .line 75
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_a

    .line 85
    .line 86
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    if-eq v9, v3, :cond_7

    .line 91
    .line 92
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏兰哲楪()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v3, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 97
    .line 98
    if-ne v9, v3, :cond_4

    .line 99
    .line 100
    iget-object v3, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 101
    .line 102
    if-eqz v3, :cond_4

    .line 103
    .line 104
    :goto_3
    move-object v7, v3

    .line 105
    goto :goto_4

    .line 106
    :cond_4
    invoke-virtual {v0, v2, v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    goto :goto_3

    .line 111
    :goto_4
    if-eqz v1, :cond_5

    .line 112
    .line 113
    iget-object v1, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 114
    .line 115
    if-ne v9, v1, :cond_6

    .line 116
    .line 117
    iget-boolean v1, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏楪哲:Z

    .line 118
    .line 119
    :goto_5
    xor-int/2addr v1, v12

    .line 120
    :cond_5
    move-object v10, v9

    .line 121
    move v9, v1

    .line 122
    :goto_6
    move-object v1, v7

    .line 123
    goto :goto_7

    .line 124
    :cond_6
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    goto :goto_5

    .line 129
    :cond_7
    move v9, v1

    .line 130
    move-object v10, v3

    .line 131
    goto :goto_6

    .line 132
    :goto_7
    if-eqz v9, :cond_8

    .line 133
    .line 134
    invoke-virtual {v2, v11, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲兰苏子(ILjava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_8

    .line 139
    .line 140
    goto :goto_9

    .line 141
    :cond_8
    move-object v3, v4

    .line 142
    iget-object v4, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 143
    .line 144
    if-eqz v13, :cond_9

    .line 145
    .line 146
    invoke-interface/range {v1 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 147
    .line 148
    .line 149
    move-object/from16 v2, p1

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_9
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    move-wide v6, v5

    .line 157
    move-object v5, v4

    .line 158
    move-object v4, v2

    .line 159
    move-object/from16 v2, p1

    .line 160
    .line 161
    invoke-interface/range {v1 .. v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 162
    .line 163
    .line 164
    move-wide v5, v6

    .line 165
    :goto_8
    if-eqz v9, :cond_a

    .line 166
    .line 167
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪苏世(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_a
    :goto_9
    move-object v7, v1

    .line 171
    move v1, v9

    .line 172
    move-object v3, v10

    .line 173
    :goto_a
    add-int/lit8 v11, v11, 0x1

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_b
    return-void

    .line 177
    :cond_c
    invoke-virtual {v2, v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v3

    .line 181
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 182
    .line 183
    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 184
    .line 185
    and-long/2addr v5, v3

    .line 186
    cmp-long v1, v5, v9

    .line 187
    .line 188
    if-eqz v1, :cond_d

    .line 189
    .line 190
    move v1, v12

    .line 191
    goto :goto_b

    .line 192
    :cond_d
    move v1, v11

    .line 193
    :goto_b
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏世哲()V

    .line 194
    .line 195
    .line 196
    move v13, v11

    .line 197
    const/4 v5, 0x0

    .line 198
    const/4 v7, 0x0

    .line 199
    :goto_c
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-ge v13, v6, :cond_19

    .line 204
    .line 205
    if-eqz v13, :cond_e

    .line 206
    .line 207
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪世苏()V

    .line 208
    .line 209
    .line 210
    :cond_e
    move-wide v14, v3

    .line 211
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    if-nez v3, :cond_f

    .line 216
    .line 217
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_11

    .line 221
    .line 222
    :cond_f
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    const-class v6, Ljava/lang/String;

    .line 227
    .line 228
    if-ne v4, v6, :cond_10

    .line 229
    .line 230
    check-cast v3, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_11

    .line 236
    .line 237
    :cond_10
    iget-boolean v6, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲苏楪:Z

    .line 238
    .line 239
    if-eqz v6, :cond_11

    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_11

    .line 249
    :cond_11
    if-ne v4, v7, :cond_12

    .line 250
    .line 251
    move-object/from16 v17, v7

    .line 252
    .line 253
    :goto_d
    move/from16 v16, v1

    .line 254
    .line 255
    move-object v1, v5

    .line 256
    goto :goto_f

    .line 257
    :cond_12
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 258
    .line 259
    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 260
    .line 261
    and-long/2addr v5, v14

    .line 262
    cmp-long v1, v5, v9

    .line 263
    .line 264
    if-eqz v1, :cond_13

    .line 265
    .line 266
    move v1, v12

    .line 267
    goto :goto_e

    .line 268
    :cond_13
    move v1, v11

    .line 269
    :goto_e
    invoke-virtual {v0, v2, v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    if-eqz v1, :cond_14

    .line 274
    .line 275
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    xor-int/2addr v1, v12

    .line 280
    :cond_14
    move-object/from16 v17, v4

    .line 281
    .line 282
    goto :goto_d

    .line 283
    :goto_f
    if-eqz v16, :cond_15

    .line 284
    .line 285
    invoke-virtual {v2, v13, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲兰苏子(ILjava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_15

    .line 290
    .line 291
    goto :goto_10

    .line 292
    :cond_15
    iget-boolean v4, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲楪苏兰:Z

    .line 293
    .line 294
    if-eqz v4, :cond_17

    .line 295
    .line 296
    iget-object v4, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 297
    .line 298
    if-nez v4, :cond_16

    .line 299
    .line 300
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 301
    .line 302
    const/16 v5, 0x8

    .line 303
    .line 304
    invoke-direct {v4, v5}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 305
    .line 306
    .line 307
    iput-object v4, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 308
    .line 309
    :cond_16
    iget-object v4, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 310
    .line 311
    sget-object v5, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 312
    .line 313
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    :cond_17
    const/4 v4, 0x0

    .line 317
    iget-object v5, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 318
    .line 319
    move-wide v6, v14

    .line 320
    invoke-interface/range {v1 .. v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 321
    .line 322
    .line 323
    if-eqz v16, :cond_18

    .line 324
    .line 325
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪苏世(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_18
    :goto_10
    move-object v5, v1

    .line 329
    move/from16 v1, v16

    .line 330
    .line 331
    move-object/from16 v7, v17

    .line 332
    .line 333
    :goto_11
    add-int/lit8 v13, v13, 0x1

    .line 334
    .line 335
    move-wide v3, v14

    .line 336
    goto/16 :goto_c

    .line 337
    .line 338
    :cond_19
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 339
    .line 340
    .line 341
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p1, p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世(Ljava/lang/Class;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世兰哲子(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲苏子(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    return-object p2

    .line 10
    :cond_0
    invoke-virtual {p1, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 18
    .line 19
    if-ne p2, v0, :cond_d

    .line 20
    .line 21
    iget-object v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_2
    iget-object v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_c

    .line 29
    .line 30
    iget-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const-class p1, Ljava/lang/Double;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-ne p2, p1, :cond_3

    .line 41
    .line 42
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪世苏哲;

    .line 43
    .line 44
    new-instance p1, Ljava/text/DecimalFormat;

    .line 45
    .line 46
    invoke-direct {p1, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪世苏哲;-><init>(Ljava/text/DecimalFormat;I)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    const-class p1, Ljava/lang/Float;

    .line 54
    .line 55
    if-ne p2, p1, :cond_4

    .line 56
    .line 57
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪世苏哲;

    .line 58
    .line 59
    new-instance p1, Ljava/text/DecimalFormat;

    .line 60
    .line 61
    invoke-direct {p1, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p2, 0x1

    .line 65
    invoke-direct {p0, p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪世苏哲;-><init>(Ljava/text/DecimalFormat;I)V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_4
    const-class p1, Ljava/math/BigDecimal;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    if-ne p2, p1, :cond_5

    .line 73
    .line 74
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏兰世楪;

    .line 75
    .line 76
    new-instance p1, Ljava/text/DecimalFormat;

    .line 77
    .line 78
    invoke-direct {p1, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, p1, v0, v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏兰世楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_5
    const-class p1, Ljava/time/LocalDate;

    .line 86
    .line 87
    if-ne p2, p1, :cond_6

    .line 88
    .line 89
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏世楪哲;

    .line 90
    .line 91
    invoke-direct {p0, v1, v2}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_6
    const-class p1, Ljava/time/LocalDateTime;

    .line 96
    .line 97
    if-ne p2, p1, :cond_7

    .line 98
    .line 99
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏世哲楪;

    .line 100
    .line 101
    invoke-direct {p0, v1, v2}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 102
    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_7
    const-class p1, Ljava/time/LocalTime;

    .line 106
    .line 107
    if-ne p2, p1, :cond_8

    .line 108
    .line 109
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲楪世;

    .line 110
    .line 111
    invoke-direct {p0, v1, v2}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_8
    const-class p1, Ljava/util/Date;

    .line 116
    .line 117
    if-ne p2, p1, :cond_9

    .line 118
    .line 119
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

    .line 120
    .line 121
    invoke-direct {p0, v1, v2}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 122
    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_9
    const-class p1, Ljava/time/OffsetDateTime;

    .line 126
    .line 127
    if-ne p2, p1, :cond_a

    .line 128
    .line 129
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰哲楪世苏;

    .line 130
    .line 131
    invoke-direct {p0, v1, v2}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 132
    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_a
    const-class p1, Ljava/time/ZonedDateTime;

    .line 136
    .line 137
    if-ne p2, p1, :cond_b

    .line 138
    .line 139
    new-instance p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰哲苏世楪;

    .line 140
    .line 141
    invoke-direct {p0, v1, v2, v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰哲苏世楪;-><init>(Ljava/lang/String;Ljava/util/Locale;Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_b
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p0, p2, p1, v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_c
    iget-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 155
    .line 156
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iput-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_d
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p1, p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/util/List;)V
    .locals 14

    .line 1
    move-object v1, p1

    .line 2
    move-object/from16 v7, p2

    .line 3
    .line 4
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v8, 0x1

    .line 11
    iget-wide v9, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 12
    .line 13
    if-eqz v0, :cond_c

    .line 14
    .line 15
    move-object v0, v4

    .line 16
    move v6, v5

    .line 17
    invoke-virtual {p1, v9, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    and-long/2addr v9, v4

    .line 26
    cmp-long v9, v9, v2

    .line 27
    .line 28
    if-eqz v9, :cond_0

    .line 29
    .line 30
    move v9, v8

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v9, v6

    .line 33
    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    sget-object v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 38
    .line 39
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 40
    .line 41
    and-long/2addr v11, v4

    .line 42
    cmp-long v11, v11, v2

    .line 43
    .line 44
    if-eqz v11, :cond_1

    .line 45
    .line 46
    if-nez v10, :cond_1

    .line 47
    .line 48
    goto/16 :goto_9

    .line 49
    .line 50
    :cond_1
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 51
    .line 52
    .line 53
    sget-object v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 54
    .line 55
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 56
    .line 57
    and-long/2addr v11, v4

    .line 58
    cmp-long v2, v11, v2

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    move v2, v8

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v2, v6

    .line 65
    :goto_1
    iget-object v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-virtual {p1, v3, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世(Ljava/lang/Class;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世兰哲子(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {p1, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 85
    .line 86
    .line 87
    move-object v3, v0

    .line 88
    move v11, v6

    .line 89
    :goto_2
    if-ge v11, v10, :cond_d

    .line 90
    .line 91
    move v6, v2

    .line 92
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-nez v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 99
    .line 100
    .line 101
    move v2, v6

    .line 102
    goto/16 :goto_8

    .line 103
    .line 104
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    if-eq v12, v0, :cond_8

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏兰哲楪()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 115
    .line 116
    if-ne v12, v3, :cond_5

    .line 117
    .line 118
    iget-object v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 119
    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    invoke-virtual {p0, p1, v12}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    :goto_3
    if-eqz v0, :cond_6

    .line 128
    .line 129
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪哲苏:Ljava/lang/Class;

    .line 130
    .line 131
    if-ne v12, v0, :cond_7

    .line 132
    .line 133
    iget-boolean v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰苏楪哲:Z

    .line 134
    .line 135
    :goto_4
    xor-int/2addr v0, v8

    .line 136
    :cond_6
    move v13, v0

    .line 137
    move-object v0, v3

    .line 138
    goto :goto_5

    .line 139
    :cond_7
    invoke-static {v12}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    goto :goto_4

    .line 144
    :cond_8
    move-object v12, v0

    .line 145
    move-object v0, v3

    .line 146
    move v13, v6

    .line 147
    :goto_5
    if-eqz v13, :cond_9

    .line 148
    .line 149
    invoke-virtual {p1, v11, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲兰苏子(ILjava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_9

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_9
    iget-object v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 157
    .line 158
    if-eqz v9, :cond_a

    .line 159
    .line 160
    invoke-interface/range {v0 .. v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 161
    .line 162
    .line 163
    move-object v1, p1

    .line 164
    goto :goto_6

    .line 165
    :cond_a
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    move-wide v5, v4

    .line 170
    move-object v4, v3

    .line 171
    move-object v3, v1

    .line 172
    move-object v1, p1

    .line 173
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 174
    .line 175
    .line 176
    move-wide v4, v5

    .line 177
    :goto_6
    if-eqz v13, :cond_b

    .line 178
    .line 179
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪苏世(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_b
    :goto_7
    move-object v3, v0

    .line 183
    move-object v0, v12

    .line 184
    move v2, v13

    .line 185
    :goto_8
    add-int/lit8 v11, v11, 0x1

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_c
    move-object v0, v4

    .line 189
    move v6, v5

    .line 190
    invoke-virtual {p1, v9, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(J)J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 195
    .line 196
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 197
    .line 198
    and-long/2addr v9, v4

    .line 199
    cmp-long v9, v9, v2

    .line 200
    .line 201
    if-eqz v9, :cond_e

    .line 202
    .line 203
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_e

    .line 208
    .line 209
    :cond_d
    :goto_9
    return-void

    .line 210
    :cond_e
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 211
    .line 212
    .line 213
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 214
    .line 215
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 216
    .line 217
    and-long/2addr v9, v4

    .line 218
    cmp-long v2, v9, v2

    .line 219
    .line 220
    if-eqz v2, :cond_f

    .line 221
    .line 222
    move v2, v8

    .line 223
    goto :goto_a

    .line 224
    :cond_f
    move v2, v6

    .line 225
    :goto_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏世哲()V

    .line 226
    .line 227
    .line 228
    move-object v3, v0

    .line 229
    move v9, v6

    .line 230
    :goto_b
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-ge v9, v6, :cond_19

    .line 235
    .line 236
    if-eqz v9, :cond_10

    .line 237
    .line 238
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪世苏()V

    .line 239
    .line 240
    .line 241
    :cond_10
    move v6, v2

    .line 242
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    if-nez v2, :cond_11

    .line 247
    .line 248
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 249
    .line 250
    .line 251
    goto :goto_c

    .line 252
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    const-class v11, Ljava/lang/String;

    .line 257
    .line 258
    if-ne v10, v11, :cond_12

    .line 259
    .line 260
    check-cast v2, Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :goto_c
    move v2, v6

    .line 266
    move-wide v5, v4

    .line 267
    goto :goto_10

    .line 268
    :cond_12
    if-ne v10, v0, :cond_13

    .line 269
    .line 270
    move-object v10, v0

    .line 271
    move v11, v6

    .line 272
    :goto_d
    move-object v0, v3

    .line 273
    goto :goto_e

    .line 274
    :cond_13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏兰哲楪()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    invoke-virtual {p0, p1, v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    if-eqz v0, :cond_14

    .line 283
    .line 284
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    xor-int/2addr v0, v8

    .line 289
    :cond_14
    move v11, v0

    .line 290
    goto :goto_d

    .line 291
    :goto_e
    if-eqz v11, :cond_15

    .line 292
    .line 293
    invoke-virtual {p1, v9, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲兰苏子(ILjava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-eqz v3, :cond_17

    .line 298
    .line 299
    move-wide v5, v4

    .line 300
    goto :goto_f

    .line 301
    :cond_15
    iget-boolean v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲楪苏兰:Z

    .line 302
    .line 303
    if-eqz v3, :cond_17

    .line 304
    .line 305
    iget-object v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 306
    .line 307
    if-nez v3, :cond_16

    .line 308
    .line 309
    new-instance v3, Ljava/util/IdentityHashMap;

    .line 310
    .line 311
    const/16 v6, 0x8

    .line 312
    .line 313
    invoke-direct {v3, v6}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 314
    .line 315
    .line 316
    iput-object v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 317
    .line 318
    :cond_16
    iget-object v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲苏兰:Ljava/util/IdentityHashMap;

    .line 319
    .line 320
    sget-object v6, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪兰苏;

    .line 321
    .line 322
    invoke-interface {v3, v2, v6}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    :cond_17
    const/4 v3, 0x0

    .line 326
    move-wide v5, v4

    .line 327
    iget-object v4, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世兰楪苏哲:Ljava/lang/reflect/Type;

    .line 328
    .line 329
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 330
    .line 331
    .line 332
    if-eqz v11, :cond_18

    .line 333
    .line 334
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪苏世(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_18
    :goto_f
    move-object v3, v0

    .line 338
    move-object v0, v10

    .line 339
    move v2, v11

    .line 340
    :goto_10
    add-int/lit8 v9, v9, 0x1

    .line 341
    .line 342
    move-wide v4, v5

    .line 343
    goto :goto_b

    .line 344
    :cond_19
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 345
    .line 346
    .line 347
    return-void
.end method
