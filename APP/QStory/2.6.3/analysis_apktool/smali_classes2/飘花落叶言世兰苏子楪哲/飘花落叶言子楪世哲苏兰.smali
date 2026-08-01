.class public final L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;
.super L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:J

.field public 飘花落叶言子楪兰苏世哲:Z

.field public final synthetic 飘花落叶言子楪兰苏哲世:L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 p1, -0x1

    .line 10
    .line 11
    iput-wide p1, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 11
    .line 12
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x64

    .line 18
    .line 19
    :try_start_0
    invoke-static {p0, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;I)Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    iget-object v0, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰苏哲;

    .line 30
    .line 31
    invoke-interface {v0}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()V

    .line 32
    .line 33
    .line 34
    sget-object v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 41
    .line 42
    return-void
.end method

.method public final 飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    iget-object v2, v1, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-boolean v3, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    if-nez v3, :cond_e

    .line 15
    .line 16
    iget-boolean v3, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 17
    .line 18
    const-wide/16 v6, -0x1

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    iget-wide v8, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 25
    .line 26
    cmp-long v3, v8, v4

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    cmp-long v3, v8, v6

    .line 31
    .line 32
    if-nez v3, :cond_b

    .line 33
    .line 34
    :cond_1
    cmp-long v3, v8, v6

    .line 35
    .line 36
    const-wide v8, 0x7fffffffffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    iget-object v3, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;

    .line 46
    .line 47
    invoke-virtual {v3, v8, v9}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰哲世苏(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    :cond_2
    :try_start_0
    iget-object v3, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;

    .line 53
    .line 54
    iget-object v10, v3, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 55
    .line 56
    const-wide/16 v11, 0x1

    .line 57
    .line 58
    invoke-virtual {v3, v11, v12}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲世兰(J)V

    .line 59
    .line 60
    .line 61
    const/4 v11, 0x0

    .line 62
    move v12, v11

    .line 63
    :goto_0
    add-int/lit8 v13, v12, 0x1

    .line 64
    .line 65
    int-to-long v14, v13

    .line 66
    invoke-virtual {v3, v14, v15}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲(J)Z

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    if-eqz v14, :cond_8

    .line 71
    .line 72
    int-to-long v14, v12

    .line 73
    invoke-virtual {v10, v14, v15}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(J)B

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    const/16 v15, 0x30

    .line 78
    .line 79
    if-lt v14, v15, :cond_3

    .line 80
    .line 81
    const/16 v15, 0x39

    .line 82
    .line 83
    if-le v14, v15, :cond_5

    .line 84
    .line 85
    :cond_3
    const/16 v15, 0x61

    .line 86
    .line 87
    if-lt v14, v15, :cond_4

    .line 88
    .line 89
    const/16 v15, 0x66

    .line 90
    .line 91
    if-le v14, v15, :cond_5

    .line 92
    .line 93
    :cond_4
    const/16 v15, 0x41

    .line 94
    .line 95
    if-lt v14, v15, :cond_6

    .line 96
    .line 97
    const/16 v15, 0x46

    .line 98
    .line 99
    if-le v14, v15, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    move v12, v13

    .line 103
    goto :goto_0

    .line 104
    :cond_6
    :goto_1
    if-eqz v12, :cond_7

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 108
    .line 109
    const/16 v1, 0x10

    .line 110
    .line 111
    invoke-static {v1}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)V

    .line 112
    .line 113
    .line 114
    invoke-static {v14, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_8
    :goto_2
    invoke-virtual {v10}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世()J

    .line 132
    .line 133
    .line 134
    move-result-wide v12

    .line 135
    iput-wide v12, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 136
    .line 137
    iget-object v2, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;

    .line 140
    .line 141
    invoke-virtual {v2, v8, v9}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰哲世苏(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-static {v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏兰楪世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-wide v8, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 154
    .line 155
    cmp-long v3, v8, v4

    .line 156
    .line 157
    if-ltz v3, :cond_d

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-lez v3, :cond_9

    .line 164
    .line 165
    const-string v3, ";"

    .line 166
    .line 167
    invoke-static {v2, v3, v11}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    if-eqz v3, :cond_d

    .line 172
    .line 173
    :cond_9
    iget-wide v2, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 174
    .line 175
    cmp-long v2, v2, v4

    .line 176
    .line 177
    if-nez v2, :cond_a

    .line 178
    .line 179
    iput-boolean v11, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 180
    .line 181
    iget-object v2, v1, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v0, v2}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    iget-boolean v2, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 191
    .line 192
    if-nez v2, :cond_b

    .line 193
    .line 194
    :goto_3
    return-wide v6

    .line 195
    :cond_b
    iget-wide v2, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 196
    .line 197
    const-wide/16 v4, 0x2000

    .line 198
    .line 199
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 200
    .line 201
    .line 202
    move-result-wide v2

    .line 203
    move-object/from16 v4, p1

    .line 204
    .line 205
    invoke-super {v0, v4, v2, v3}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰苏哲(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;J)J

    .line 206
    .line 207
    .line 208
    move-result-wide v2

    .line 209
    cmp-long v4, v2, v6

    .line 210
    .line 211
    if-eqz v4, :cond_c

    .line 212
    .line 213
    iget-wide v4, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 214
    .line 215
    sub-long/2addr v4, v2

    .line 216
    iput-wide v4, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 217
    .line 218
    return-wide v2

    .line 219
    :cond_c
    iget-object v1, v1, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰苏哲;

    .line 220
    .line 221
    invoke-interface {v1}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()V

    .line 222
    .line 223
    .line 224
    new-instance v1, Ljava/net/ProtocolException;

    .line 225
    .line 226
    const-string v2, "unexpected end of stream"

    .line 227
    .line 228
    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    sget-object v2, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;

    .line 232
    .line 233
    invoke-virtual {v0, v2}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 234
    .line 235
    .line 236
    throw v1

    .line 237
    :cond_d
    :try_start_1
    new-instance v1, Ljava/net/ProtocolException;

    .line 238
    .line 239
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v4, "expected chunk size and optional extensions but was \""

    .line 245
    .line 246
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    iget-wide v4, v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:J

    .line 250
    .line 251
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const/16 v0, 0x22

    .line 258
    .line 259
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 270
    :catch_0
    move-exception v0

    .line 271
    new-instance v1, Ljava/net/ProtocolException;

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v1

    .line 281
    :cond_e
    const-string v0, "closed"

    .line 282
    .line 283
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    return-wide v4
.end method
