.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

.field public final synthetic 飘花落叶言子世哲楪苏兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;I)V
    .locals 13

    .line 1
    move/from16 v0, p12

    .line 2
    .line 3
    iput v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪苏兰:I

    .line 4
    .line 5
    const/4 v12, 0x0

    .line 6
    move-object v3, p2

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move/from16 v4, p3

    .line 11
    .line 12
    move-wide/from16 v5, p4

    .line 13
    .line 14
    move-object/from16 v7, p6

    .line 15
    .line 16
    move-object/from16 v8, p7

    .line 17
    .line 18
    move-object/from16 v9, p8

    .line 19
    .line 20
    move-object/from16 v10, p9

    .line 21
    .line 22
    move-object/from16 v11, p10

    .line 23
    .line 24
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 p1, p11

    .line 28
    .line 29
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    instance-of p0, p2, Ljava/lang/Boolean;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :cond_1
    invoke-interface {v1, p1, p2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏楪哲兰(Ljava/lang/Object;)Ljava/lang/Byte;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-interface {v1, p1, p0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲兰楪苏(Ljava/lang/Object;)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏世兰哲(Ljava/lang/Long;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-interface {v1, p1, p0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏世哲兰(Ljava/lang/Integer;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-interface {v1, p1, p0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_3
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰楪苏哲(Ljava/lang/Object;)Ljava/lang/Short;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-interface {v1, p1, p0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_4
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;)Ljava/lang/Float;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏(Ljava/lang/Float;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-interface {v1, p1, p0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_5
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏哲兰楪(Ljava/lang/Object;)Ljava/lang/Double;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲(Ljava/lang/Double;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    invoke-interface {v1, p1, p0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_6
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 118
    .line 119
    .line 120
    :cond_8
    invoke-interface {v1, p1, p0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_7
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)Ljava/math/BigInteger;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-eqz v2, :cond_9

    .line 129
    .line 130
    invoke-virtual {v2, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_9
    :try_start_0
    invoke-interface {v1, p1, p2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :catch_0
    move-exception p1

    .line 138
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    :goto_0
    return-void

    .line 142
    :pswitch_8
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;)Ljava/math/BigDecimal;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    if-eqz v2, :cond_a

    .line 147
    .line 148
    invoke-virtual {v2, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_a
    :try_start_1
    invoke-interface {v1, p1, p2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catch_1
    move-exception p1

    .line 156
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲兰苏(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    return-void

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲子兰苏()Ljava/lang/Number;

    .line 16
    .line 17
    .line 18
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 26
    .line 27
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 28
    .line 29
    and-long/2addr v6, v8

    .line 30
    cmp-long p1, v6, v4

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    :goto_0
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    throw p0

    .line 44
    :pswitch_0
    :try_start_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-nez p0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->byteValue()B

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 56
    .line 57
    .line 58
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 59
    goto :goto_1

    .line 60
    :catch_1
    move-exception p0

    .line 61
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 66
    .line 67
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 68
    .line 69
    and-long/2addr v6, v8

    .line 70
    cmp-long p1, v6, v4

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    :goto_1
    if-eqz v2, :cond_3

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    throw p0

    .line 84
    :pswitch_1
    :try_start_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 88
    goto :goto_2

    .line 89
    :catch_2
    move-exception p0

    .line 90
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 95
    .line 96
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 97
    .line 98
    and-long/2addr v6, v8

    .line 99
    cmp-long p1, v6, v4

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    :goto_2
    if-eqz v2, :cond_5

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏世兰哲(Ljava/lang/Long;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    throw p0

    .line 113
    :pswitch_2
    :try_start_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 117
    goto :goto_3

    .line 118
    :catch_3
    move-exception p0

    .line 119
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 124
    .line 125
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 126
    .line 127
    and-long/2addr v6, v8

    .line 128
    cmp-long p1, v6, v4

    .line 129
    .line 130
    if-eqz p1, :cond_8

    .line 131
    .line 132
    :goto_3
    if-eqz v2, :cond_7

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏世哲兰(Ljava/lang/Integer;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_8
    throw p0

    .line 142
    :pswitch_3
    :try_start_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-nez p0, :cond_9

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Integer;->shortValue()S

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 154
    .line 155
    .line 156
    move-result-object v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 157
    goto :goto_4

    .line 158
    :catch_4
    move-exception p0

    .line 159
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v6

    .line 163
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 164
    .line 165
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 166
    .line 167
    and-long/2addr v6, v8

    .line 168
    cmp-long p1, v6, v4

    .line 169
    .line 170
    if-eqz p1, :cond_b

    .line 171
    .line 172
    :goto_4
    if-eqz v2, :cond_a

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_b
    throw p0

    .line 182
    :pswitch_4
    :try_start_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲楪苏世()Ljava/lang/Float;

    .line 183
    .line 184
    .line 185
    move-result-object v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 186
    goto :goto_5

    .line 187
    :catch_5
    move-exception p0

    .line 188
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 193
    .line 194
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 195
    .line 196
    and-long/2addr v6, v8

    .line 197
    cmp-long p1, v6, v4

    .line 198
    .line 199
    if-eqz p1, :cond_d

    .line 200
    .line 201
    :goto_5
    if-eqz v2, :cond_c

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏(Ljava/lang/Float;)V

    .line 204
    .line 205
    .line 206
    :cond_c
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_d
    throw p0

    .line 211
    :pswitch_5
    :try_start_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪哲世()Ljava/lang/Double;

    .line 212
    .line 213
    .line 214
    move-result-object v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 215
    goto :goto_6

    .line 216
    :catch_6
    move-exception v0

    .line 217
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 222
    .line 223
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 224
    .line 225
    and-long/2addr v6, v8

    .line 226
    cmp-long p1, v6, v4

    .line 227
    .line 228
    if-eqz p1, :cond_10

    .line 229
    .line 230
    :goto_6
    if-nez v3, :cond_e

    .line 231
    .line 232
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 233
    .line 234
    if-eqz p0, :cond_e

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_e
    if-eqz v2, :cond_f

    .line 238
    .line 239
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲(Ljava/lang/Double;)V

    .line 240
    .line 241
    .line 242
    :cond_f
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :goto_7
    return-void

    .line 246
    :cond_10
    throw v0

    .line 247
    :pswitch_6
    :try_start_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object v3
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 251
    goto :goto_8

    .line 252
    :catch_7
    move-exception p0

    .line 253
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v6

    .line 257
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 258
    .line 259
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 260
    .line 261
    and-long/2addr v6, v8

    .line 262
    cmp-long p1, v6, v4

    .line 263
    .line 264
    if-eqz p1, :cond_12

    .line 265
    .line 266
    :goto_8
    if-eqz v2, :cond_11

    .line 267
    .line 268
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 269
    .line 270
    .line 271
    :cond_11
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_12
    throw p0

    .line 276
    :pswitch_7
    :try_start_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 277
    .line 278
    .line 279
    move-result-object v3
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 280
    goto :goto_9

    .line 281
    :catch_8
    move-exception p0

    .line 282
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v6

    .line 286
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 287
    .line 288
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 289
    .line 290
    and-long/2addr v6, v8

    .line 291
    cmp-long p1, v6, v4

    .line 292
    .line 293
    if-eqz p1, :cond_14

    .line 294
    .line 295
    :goto_9
    if-eqz v2, :cond_13

    .line 296
    .line 297
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_13
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :cond_14
    throw p0

    .line 305
    :pswitch_8
    :try_start_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世楪苏哲()Ljava/math/BigDecimal;

    .line 306
    .line 307
    .line 308
    move-result-object v3
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    .line 309
    goto :goto_a

    .line 310
    :catch_9
    move-exception p0

    .line 311
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲(J)J

    .line 312
    .line 313
    .line 314
    move-result-wide v6

    .line 315
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 316
    .line 317
    iget-wide v8, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 318
    .line 319
    and-long/2addr v6, v8

    .line 320
    cmp-long p1, v6, v4

    .line 321
    .line 322
    if-eqz p1, :cond_16

    .line 323
    .line 324
    :goto_a
    if-eqz v2, :cond_15

    .line 325
    .line 326
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_15
    invoke-interface {v1, p2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_16
    throw p0

    .line 334
    nop

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲子兰苏()Ljava/lang/Number;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    int-to-short p0, p0

    .line 31
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲楪苏世()Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪哲世()Ljava/lang/Double;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世楪苏哲()Ljava/math/BigDecimal;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲世苏兰()Ljava/util/function/BiConsumer;
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲楪兰苏:Ljava/util/function/BiConsumer;

    .line 34
    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
