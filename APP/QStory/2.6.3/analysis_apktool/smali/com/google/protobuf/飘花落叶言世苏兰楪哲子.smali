.class public final Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

.field public final 飘花落叶言子楪世哲苏兰:Z

.field public final 飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

.field public final 飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 5
    .line 6
    invoke-virtual {p2, p3}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput-boolean p1, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 11
    .line 12
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final newInstance()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 2
    .line 3
    instance-of v0, p0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite;->newMutableInstance()Lcom/google/protobuf/GeneratedMessageLite;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;->newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;->buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[BIILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    move-object/from16 v6, p5

    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    check-cast v1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 12
    .line 13
    iget-object v3, v1, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 14
    .line 15
    sget-object v5, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 16
    .line 17
    if-ne v3, v5, :cond_0

    .line 18
    .line 19
    new-instance v3, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 20
    .line 21
    invoke-direct {v3}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v3, v1, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 25
    .line 26
    :cond_0
    move-object v5, v3

    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, Lcom/google/protobuf/GeneratedMessageLite$飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$飘花落叶言子楪世苏哲兰;->ensureExtensionsAreMutable()Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    move/from16 v1, p3

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_0
    if-ge v1, v4, :cond_b

    .line 39
    .line 40
    move-object v9, v3

    .line 41
    invoke-static {v2, v1, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世([BILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget v1, v6, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 46
    .line 47
    iget-object v10, v6, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 48
    .line 49
    const/16 v11, 0xb

    .line 50
    .line 51
    iget-object v12, v0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 52
    .line 53
    iget-object v13, v0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 54
    .line 55
    const/4 v14, 0x2

    .line 56
    if-eq v1, v11, :cond_3

    .line 57
    .line 58
    and-int/lit8 v11, v1, 0x7

    .line 59
    .line 60
    if-ne v11, v14, :cond_2

    .line 61
    .line 62
    ushr-int/lit8 v9, v1, 0x3

    .line 63
    .line 64
    invoke-virtual {v13, v10, v12, v9}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    check-cast v9, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;

    .line 69
    .line 70
    if-eqz v9, :cond_1

    .line 71
    .line 72
    sget-object v1, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 73
    .line 74
    iget-object v10, v9, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 75
    .line 76
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-virtual {v1, v10}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1, v2, v3, v4, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;[BIILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-object v3, v9, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;

    .line 89
    .line 90
    iget-object v10, v6, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {v7, v3, v10}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    move-object v3, v9

    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-static/range {v1 .. v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世(I[BIILcom/google/protobuf/飘花落叶言苏子兰哲楪世;Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-static {v1, v2, v3, v4, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰哲世苏(I[BIILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    const/4 v1, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    :goto_2
    if-ge v3, v4, :cond_9

    .line 110
    .line 111
    invoke-static {v2, v3, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世([BILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    iget v15, v6, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 116
    .line 117
    ushr-int/lit8 v8, v15, 0x3

    .line 118
    .line 119
    and-int/lit8 v0, v15, 0x7

    .line 120
    .line 121
    if-eq v8, v14, :cond_6

    .line 122
    .line 123
    const/4 v14, 0x3

    .line 124
    if-eq v8, v14, :cond_4

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    if-eqz v9, :cond_5

    .line 128
    .line 129
    sget-object v0, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;

    .line 130
    .line 131
    iget-object v8, v9, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v0, v8}, Lcom/google/protobuf/飘花落叶言世哲楪兰苏子;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0, v2, v3, v4, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;[BIILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    iget-object v0, v9, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪兰世哲子苏;

    .line 146
    .line 147
    iget-object v8, v6, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 148
    .line 149
    invoke-virtual {v7, v0, v8}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :goto_3
    const/4 v14, 0x2

    .line 153
    move-object/from16 v0, p0

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    const/4 v8, 0x2

    .line 157
    if-ne v0, v8, :cond_7

    .line 158
    .line 159
    invoke-static {v2, v3, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰([BILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    iget-object v0, v6, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 164
    .line 165
    move-object v11, v0

    .line 166
    check-cast v11, Lcom/google/protobuf/ByteString;

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    if-nez v0, :cond_7

    .line 170
    .line 171
    invoke-static {v2, v3, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世([BILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    iget v1, v6, Lcom/google/protobuf/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 176
    .line 177
    invoke-virtual {v13, v10, v12, v1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    move-object v9, v0

    .line 182
    check-cast v9, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    :goto_4
    const/16 v0, 0xc

    .line 186
    .line 187
    if-ne v15, v0, :cond_8

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_8
    invoke-static {v15, v2, v3, v4, v6}, Lcom/google/protobuf/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰哲世苏(I[BIILcom/google/protobuf/飘花落叶言子楪哲苏兰世;)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    goto :goto_3

    .line 195
    :cond_9
    :goto_5
    if-eqz v11, :cond_a

    .line 196
    .line 197
    shl-int/lit8 v0, v1, 0x3

    .line 198
    .line 199
    const/4 v8, 0x2

    .line 200
    or-int/2addr v0, v8

    .line 201
    invoke-virtual {v5, v0, v11}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_a
    move-object/from16 v0, p0

    .line 205
    .line 206
    move v1, v3

    .line 207
    goto :goto_1

    .line 208
    :cond_b
    if-ne v1, v4, :cond_c

    .line 209
    .line 210
    return-void

    .line 211
    :cond_c
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->parseFailure()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    throw v0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V
    .locals 7

    .line 1
    iget-object v5, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 2
    .line 3
    invoke-virtual {v5, p1}, Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 8
    .line 9
    invoke-virtual {v3, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    :goto_0
    :try_start_0
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世楪兰苏哲()I

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    const v1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    :cond_0
    check-cast p1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 23
    .line 24
    iput-object v6, p1, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    move-object v0, p0

    .line 28
    move-object v1, p2

    .line 29
    move-object v2, p3

    .line 30
    :try_start_1
    invoke-virtual/range {v0 .. v6}, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;)Z

    .line 31
    .line 32
    .line 33
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    move-object p0, v0

    .line 37
    move-object p2, v1

    .line 38
    move-object p3, v2

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    check-cast p1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 43
    .line 44
    iput-object v6, p1, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 45
    .line 46
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪哲兰世苏()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 2
    .line 3
    check-cast v0, Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 12
    .line 13
    iget-boolean v1, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰苏哲:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰苏哲:Z

    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰世哲苏()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;

    .line 28
    .line 29
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子世兰楪哲苏()Lcom/google/protobuf/WireFormat$JavaType;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    sget-object v4, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->飘花落叶言子楪苏世哲兰()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->isPacked()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    instance-of v3, v1, Lcom/google/protobuf/飘花落叶言世子兰苏楪哲;

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    check-cast v1, Lcom/google/protobuf/飘花落叶言世子兰苏楪哲;

    .line 58
    .line 59
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言世子兰苏楪哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Map$Entry;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/ByteString;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p2, v2, v1}, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;->飘花落叶言子楪兰苏哲世(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-interface {v2}, Lcom/google/protobuf/飘花落叶言楪苏兰世子哲;->getNumber()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p2, v2, v1}, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;->飘花落叶言子楪兰苏哲世(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const-string p0, "Found invalid MessageSet item."

    .line 88
    .line 89
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 94
    .line 95
    check-cast p0, Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    check-cast p1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 101
    .line 102
    iget-object p0, p1, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    sget-object p1, Lcom/google/protobuf/Writer$FieldOrder;->ASCENDING:Lcom/google/protobuf/Writer$FieldOrder;

    .line 108
    .line 109
    sget-object v0, Lcom/google/protobuf/Writer$FieldOrder;->DESCENDING:Lcom/google/protobuf/Writer$FieldOrder;

    .line 110
    .line 111
    if-ne p1, v0, :cond_3

    .line 112
    .line 113
    iget p1, p0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏哲兰:I

    .line 114
    .line 115
    add-int/lit8 p1, p1, -0x1

    .line 116
    .line 117
    :goto_1
    if-ltz p1, :cond_4

    .line 118
    .line 119
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏兰哲:[I

    .line 120
    .line 121
    aget v0, v0, p1

    .line 122
    .line 123
    ushr-int/lit8 v0, v0, 0x3

    .line 124
    .line 125
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世哲苏兰:[Ljava/lang/Object;

    .line 126
    .line 127
    aget-object v1, v1, p1

    .line 128
    .line 129
    invoke-virtual {p2, v0, v1}, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;->飘花落叶言子楪兰苏哲世(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    add-int/lit8 p1, p1, -0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    const/4 p1, 0x0

    .line 136
    :goto_2
    iget v0, p0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏哲兰:I

    .line 137
    .line 138
    if-ge p1, v0, :cond_4

    .line 139
    .line 140
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏兰哲:[I

    .line 141
    .line 142
    aget v0, v0, p1

    .line 143
    .line 144
    ushr-int/lit8 v0, v0, 0x3

    .line 145
    .line 146
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世哲苏兰:[Ljava/lang/Object;

    .line 147
    .line 148
    aget-object v1, v1, p1

    .line 149
    .line 150
    invoke-virtual {p2, v0, v1}, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;->飘花落叶言子楪兰苏哲世(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 p1, p1, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世兰子哲楪苏;->飘花落叶言子楪苏兰哲世(Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-object v0, p2, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪兰苏哲世(Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/GeneratedMessageLite;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 2
    .line 3
    check-cast v0, Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p2, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessageLite;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 2
    .line 3
    check-cast v0, Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-boolean v1, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    mul-int/lit8 v0, v0, 0x35

    .line 25
    .line 26
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰楪子苏哲;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v0

    .line 33
    return p0

    .line 34
    :cond_0
    return v0
.end method

.method public final 飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;

    .line 2
    .line 3
    check-cast v0, Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/protobuf/GeneratedMessageLite;->unknownFields:Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;

    .line 12
    .line 13
    iget v1, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世哲兰苏:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    iget v3, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏哲兰:I

    .line 22
    .line 23
    if-ge v1, v3, :cond_1

    .line 24
    .line 25
    iget-object v3, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世苏兰哲:[I

    .line 26
    .line 27
    aget v3, v3, v1

    .line 28
    .line 29
    const/4 v4, 0x3

    .line 30
    ushr-int/2addr v3, v4

    .line 31
    iget-object v5, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世哲苏兰:[Ljava/lang/Object;

    .line 32
    .line 33
    aget-object v5, v5, v1

    .line 34
    .line 35
    check-cast v5, Lcom/google/protobuf/ByteString;

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    invoke-static {v6}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x2

    .line 43
    mul-int/2addr v6, v7

    .line 44
    invoke-static {v7, v3}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世苏兰(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    add-int/2addr v3, v6

    .line 49
    invoke-static {v4, v5}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏(ILcom/google/protobuf/ByteString;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/2addr v4, v3

    .line 54
    add-int/2addr v2, v4

    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iput v2, v0, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世哲兰苏:I

    .line 59
    .line 60
    move v1, v2

    .line 61
    :goto_1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲苏兰:Z

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;->飘花落叶言子楪苏兰世哲()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    add-int/2addr p0, v1

    .line 76
    return p0

    .line 77
    :cond_2
    return v1
.end method

.method public final 飘花落叶言子楪苏哲兰世(Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;)Z
    .locals 8

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪兰苏哲世()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xb

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏兰楪哲子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    and-int/lit8 v1, v0, 0x7

    .line 15
    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    ushr-int/lit8 v0, v0, 0x3

    .line 19
    .line 20
    invoke-virtual {p3, p2, p0, v0}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p3, p1, p0, p2, p4}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V

    .line 27
    .line 28
    .line 29
    return v4

    .line 30
    :cond_0
    invoke-virtual {p5, v3, p1, p6}, Lcom/google/protobuf/飘花落叶言苏子哲世兰楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/飘花落叶言世哲兰子楪苏;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世苏兰哲楪()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    move-object v1, v0

    .line 42
    :cond_3
    :goto_0
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世楪兰苏哲()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const v6, 0x7fffffff

    .line 47
    .line 48
    .line 49
    const/16 v7, 0xc

    .line 50
    .line 51
    if-ne v5, v6, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪兰苏哲世()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/16 v6, 0x10

    .line 59
    .line 60
    if-ne v5, v6, :cond_5

    .line 61
    .line 62
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪哲苏兰世()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p3, p2, p0, v3}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_0

    .line 71
    :cond_5
    const/16 v6, 0x1a

    .line 72
    .line 73
    if-ne v5, v6, :cond_7

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-virtual {p3, p1, v0, p2, p4}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_6
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世苏哲楪兰()Lcom/google/protobuf/ByteString;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_0

    .line 86
    :cond_7
    if-ne v5, v7, :cond_8

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_8
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子世苏兰哲楪()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_3

    .line 94
    .line 95
    :goto_1
    invoke-interface {p1}, Lcom/google/protobuf/飘花落叶言世哲兰子楪苏;->飘花落叶言子楪兰苏哲世()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-ne p0, v7, :cond_b

    .line 100
    .line 101
    if-eqz v1, :cond_a

    .line 102
    .line 103
    if-eqz v0, :cond_9

    .line 104
    .line 105
    invoke-virtual {p3, v1, v0, p2, p4}, Lcom/google/protobuf/飘花落叶言楪苏子兰世哲;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/ByteString;Ljava/lang/Object;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;Lcom/google/protobuf/飘花落叶言楪苏兰世哲子;)V

    .line 106
    .line 107
    .line 108
    return v4

    .line 109
    :cond_9
    check-cast p5, Lcom/google/protobuf/飘花落叶言苏子兰哲世楪;

    .line 110
    .line 111
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    shl-int/lit8 p0, v3, 0x3

    .line 115
    .line 116
    or-int/2addr p0, v2

    .line 117
    invoke-virtual {p6, p0, v1}, Lcom/google/protobuf/飘花落叶言苏子兰哲楪世;->飘花落叶言子楪世兰哲苏(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_a
    return v4

    .line 121
    :cond_b
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    throw p0
.end method
