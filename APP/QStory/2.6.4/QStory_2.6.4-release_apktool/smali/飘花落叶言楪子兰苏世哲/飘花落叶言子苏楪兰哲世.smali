.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世兰楪哲苏:Z

.field public final 飘花落叶言子世兰楪苏哲:Ljava/util/function/Function;

.field public final 飘花落叶言子世兰苏哲楪:Z

.field public final 飘花落叶言子世兰苏楪哲:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V
    .locals 12

    .line 1
    const-class v8, Ljava/lang/String;

    .line 2
    .line 3
    const-class v9, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move v2, p2

    .line 9
    move-wide v3, p3

    .line 10
    move-object/from16 v5, p5

    .line 11
    .line 12
    move-object/from16 v7, p6

    .line 13
    .line 14
    move-object/from16 v10, p7

    .line 15
    .line 16
    move-object/from16 v11, p8

    .line 17
    .line 18
    invoke-direct/range {v0 .. v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 p1, p9

    .line 22
    .line 23
    iput-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪苏哲:Ljava/util/function/Function;

    .line 24
    .line 25
    const-string p1, "symbol"

    .line 26
    .line 27
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput-boolean p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 32
    .line 33
    const-string p1, "trim"

    .line 34
    .line 35
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput-boolean p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰苏楪哲:Z

    .line 40
    .line 41
    const-wide/high16 p1, 0x4000000000000L

    .line 42
    .line 43
    and-long/2addr p1, p3

    .line 44
    const-wide/16 v1, 0x0

    .line 45
    .line 46
    cmp-long p1, p1, v1

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p1, 0x0

    .line 53
    :goto_0
    iput-boolean p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰苏哲楪:Z

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()Ljava/util/function/Function;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪苏哲:Ljava/util/function/Function;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪苏哲:Ljava/util/function/Function;

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
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪苏哲:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰苏楪哲:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_0
    iget-boolean v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世哲子兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-boolean p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰苏哲楪:Z

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲苏子兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    iget-wide v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    :try_start_0
    iget-object v4, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪苏哲:Ljava/util/function/Function;

    .line 6
    .line 7
    invoke-interface {v4, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    iget-object v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 14
    .line 15
    iget-wide v4, v4, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 16
    .line 17
    or-long/2addr v0, v4

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 25
    .line 26
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 27
    .line 28
    or-long/2addr v4, v6

    .line 29
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 30
    .line 31
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 32
    .line 33
    or-long/2addr v4, v6

    .line 34
    and-long/2addr v4, v0

    .line 35
    cmp-long v4, v4, v2

    .line 36
    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-boolean v4, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰苏楪哲:Z

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :cond_1
    if-eqz p2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 57
    .line 58
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 59
    .line 60
    and-long/2addr v4, v0

    .line 61
    cmp-long v4, v4, v2

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 67
    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    if-nez p2, :cond_4

    .line 71
    .line 72
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 73
    .line 74
    iget-wide v5, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 75
    .line 76
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 77
    .line 78
    iget-wide v7, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 79
    .line 80
    or-long/2addr v5, v7

    .line 81
    and-long/2addr v0, v5

    .line 82
    cmp-long p0, v0, v2

    .line 83
    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    const-string p0, ""

    .line 87
    .line 88
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return v4

    .line 92
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 93
    .line 94
    .line 95
    return v4

    .line 96
    :cond_4
    iget-boolean v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰楪哲苏:Z

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世哲子兰(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return v4

    .line 108
    :cond_5
    iget-boolean p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子世兰苏哲楪:Z

    .line 109
    .line 110
    if-eqz p0, :cond_6

    .line 111
    .line 112
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲苏子兰(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return v4

    .line 116
    :cond_6
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return v4

    .line 120
    :catch_0
    move-exception p0

    .line 121
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(J)J

    .line 122
    .line 123
    .line 124
    move-result-wide p1

    .line 125
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNonFieldGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 126
    .line 127
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 128
    .line 129
    or-long/2addr p1, v0

    .line 130
    cmp-long p1, p1, v2

    .line 131
    .line 132
    if-eqz p1, :cond_7

    .line 133
    .line 134
    :goto_0
    const/4 p0, 0x0

    .line 135
    return p0

    .line 136
    :cond_7
    throw p0
.end method
