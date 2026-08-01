.class public final Lxhss/ᛳᛳᛷᲇ;
.super Lxhss/ᲈᛳᛷᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛸᛴᛶᛳ:Lxhss/ᛳᲇᲁᲈ;

.field public ᲀᲇᛳᲁ:Z

.field public ᲇᛶᛴᲀ:J


# direct methods
.method public constructor <init>(Lxhss/ᛳᲇᲁᲈ;Lxhss/ᛷᛶᲁᛵ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛳᛳᛷᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛳᲇᲁᲈ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lxhss/ᲈᛳᛷᲁ;-><init>(Lxhss/ᛳᲇᲁᲈ;Lxhss/ᛷᛶᲁᛵ;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 p1, -0x1

    .line 7
    .line 8
    iput-wide p1, p0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lxhss/ᛳᛳᛷᲇ;->ᲀᲇᛳᲁ:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᲈᛳᛷᲁ;->ᲇᛴᲇᛵ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lxhss/ᛳᛳᛷᲇ;->ᲀᲇᛳᲁ:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x64

    .line 11
    .line 12
    :try_start_0
    invoke-static {p0, v0}, Lxhss/ᛶᛴᲀᛲ;->ᲇᛶᛴᲀ(Lxhss/ᲇᲁᲀᲇ;I)Z

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    goto :goto_0

    .line 17
    :catch_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lxhss/ᛳᛳᛷᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛳᲇᲁᲈ;

    .line 21
    .line 22
    iget-object v0, v0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 23
    .line 24
    invoke-interface {v0}, Lxhss/ᲀᲀᲁᛱ;->ᛸᛴᛶᛳ()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛶᛴᲀ:Lxhss/ᲁᛸᛱᛵ;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lxhss/ᲈᛳᛷᲁ;->ᛱᛱᛲᲇ(Lxhss/ᲁᛸᛱᛵ;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lxhss/ᲈᛳᛷᲁ;->ᲇᛴᲇᛵ:Z

    .line 34
    .line 35
    return-void
.end method

.method public final ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxhss/ᛳᛳᛷᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛳᲇᲁᲈ;

    .line 4
    .line 5
    iget-object v2, v1, Lxhss/ᛳᲇᲁᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 6
    .line 7
    iget-boolean v3, v0, Lxhss/ᲈᛳᛷᲁ;->ᲇᛴᲇᛵ:Z

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    if-nez v3, :cond_e

    .line 12
    .line 13
    iget-boolean v3, v0, Lxhss/ᛳᛳᛷᲇ;->ᲀᲇᛳᲁ:Z

    .line 14
    .line 15
    const-wide/16 v6, -0x1

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    iget-wide v8, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 22
    .line 23
    cmp-long v3, v8, v4

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    cmp-long v3, v8, v6

    .line 28
    .line 29
    if-nez v3, :cond_b

    .line 30
    .line 31
    :cond_1
    cmp-long v3, v8, v6

    .line 32
    .line 33
    const-wide v8, 0x7fffffffffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-object v3, v2, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lxhss/ᲁᛸᛵᛳ;

    .line 43
    .line 44
    invoke-virtual {v3, v8, v9}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛸᛳᲁ(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    :cond_2
    :try_start_0
    iget-object v3, v2, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lxhss/ᲁᛸᛵᛳ;

    .line 50
    .line 51
    iget-object v10, v3, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 52
    .line 53
    const-wide/16 v11, 0x1

    .line 54
    .line 55
    invoke-virtual {v3, v11, v12}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 56
    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    move v12, v11

    .line 60
    :goto_0
    add-int/lit8 v13, v12, 0x1

    .line 61
    .line 62
    int-to-long v14, v13

    .line 63
    invoke-virtual {v3, v14, v15}, Lxhss/ᲁᛸᛵᛳ;->ᛳᲈᲈᛲ(J)Z

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-eqz v14, :cond_8

    .line 68
    .line 69
    int-to-long v14, v12

    .line 70
    invoke-virtual {v10, v14, v15}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ(J)B

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    const/16 v15, 0x30

    .line 75
    .line 76
    if-lt v14, v15, :cond_3

    .line 77
    .line 78
    const/16 v15, 0x39

    .line 79
    .line 80
    if-le v14, v15, :cond_5

    .line 81
    .line 82
    :cond_3
    const/16 v15, 0x61

    .line 83
    .line 84
    if-lt v14, v15, :cond_4

    .line 85
    .line 86
    const/16 v15, 0x66

    .line 87
    .line 88
    if-le v14, v15, :cond_5

    .line 89
    .line 90
    :cond_4
    const/16 v15, 0x41

    .line 91
    .line 92
    if-lt v14, v15, :cond_6

    .line 93
    .line 94
    const/16 v15, 0x46

    .line 95
    .line 96
    if-le v14, v15, :cond_5

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move v12, v13

    .line 100
    goto :goto_0

    .line 101
    :cond_6
    :goto_1
    if-eqz v12, :cond_7

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 105
    .line 106
    const/16 v1, 0x10

    .line 107
    .line 108
    invoke-static {v1}, Lxhss/ᲁᛵᛸᛳ;->ᛱᛱᛲᲇ(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v14, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :cond_8
    :goto_2
    invoke-virtual {v10}, Lxhss/ᛴᛲᛴᛶ;->ᛷᲁᲁ()J

    .line 126
    .line 127
    .line 128
    move-result-wide v12

    .line 129
    iput-wide v12, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 130
    .line 131
    iget-object v2, v2, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v2, Lxhss/ᲁᛸᛵᛳ;

    .line 134
    .line 135
    invoke-virtual {v2, v8, v9}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛸᛳᲁ(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v2}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛳᛸᲇ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget-wide v8, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 148
    .line 149
    cmp-long v3, v8, v4

    .line 150
    .line 151
    if-ltz v3, :cond_d

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-lez v3, :cond_9

    .line 158
    .line 159
    const-string v3, ";"

    .line 160
    .line 161
    invoke-static {v2, v3, v11}, Lxhss/ᛲᲈᛷᛸ;->ᛱᛱᛴᲀ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    if-eqz v3, :cond_d

    .line 166
    .line 167
    :cond_9
    iget-wide v2, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 168
    .line 169
    cmp-long v2, v2, v4

    .line 170
    .line 171
    if-nez v2, :cond_a

    .line 172
    .line 173
    iput-boolean v11, v0, Lxhss/ᛳᛳᛷᲇ;->ᲀᲇᛳᲁ:Z

    .line 174
    .line 175
    iget-object v2, v1, Lxhss/ᛳᲇᲁᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛷᲇᲁ;

    .line 176
    .line 177
    invoke-virtual {v2}, Lxhss/ᛱᛷᲇᲁ;->ᛷᛵᛵᲈ()Lxhss/ᲁᛸᛱᛵ;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v2}, Lxhss/ᲈᛳᛷᲁ;->ᛱᛱᛲᲇ(Lxhss/ᲁᛸᛱᛵ;)V

    .line 182
    .line 183
    .line 184
    :cond_a
    iget-boolean v2, v0, Lxhss/ᛳᛳᛷᲇ;->ᲀᲇᛳᲁ:Z

    .line 185
    .line 186
    if-nez v2, :cond_b

    .line 187
    .line 188
    :goto_3
    return-wide v6

    .line 189
    :cond_b
    iget-wide v2, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 190
    .line 191
    const-wide/16 v4, 0x2000

    .line 192
    .line 193
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 194
    .line 195
    .line 196
    move-result-wide v2

    .line 197
    move-object/from16 v4, p3

    .line 198
    .line 199
    invoke-super {v0, v2, v3, v4}, Lxhss/ᲈᛳᛷᲁ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v2

    .line 203
    cmp-long v4, v2, v6

    .line 204
    .line 205
    if-eqz v4, :cond_c

    .line 206
    .line 207
    iget-wide v4, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 208
    .line 209
    sub-long/2addr v4, v2

    .line 210
    iput-wide v4, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 211
    .line 212
    return-wide v2

    .line 213
    :cond_c
    iget-object v1, v1, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 214
    .line 215
    invoke-interface {v1}, Lxhss/ᲀᲀᲁᛱ;->ᛸᛴᛶᛳ()V

    .line 216
    .line 217
    .line 218
    new-instance v1, Ljava/net/ProtocolException;

    .line 219
    .line 220
    const-string v2, "unexpected end of stream"

    .line 221
    .line 222
    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    sget-object v2, Lxhss/ᛳᲇᲁᲈ;->ᲇᛶᛴᲀ:Lxhss/ᲁᛸᛱᛵ;

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Lxhss/ᲈᛳᛷᲁ;->ᛱᛱᛲᲇ(Lxhss/ᲁᛸᛱᛵ;)V

    .line 228
    .line 229
    .line 230
    throw v1

    .line 231
    :cond_d
    :try_start_1
    new-instance v1, Ljava/net/ProtocolException;

    .line 232
    .line 233
    new-instance v3, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v4, "expected chunk size and optional extensions but was \""

    .line 239
    .line 240
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget-wide v4, v0, Lxhss/ᛳᛳᛷᲇ;->ᲇᛶᛴᲀ:J

    .line 244
    .line 245
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const/16 v0, 0x22

    .line 252
    .line 253
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 264
    :catch_0
    move-exception v0

    .line 265
    new-instance v1, Ljava/net/ProtocolException;

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v1

    .line 275
    :cond_e
    const-string v0, "closed"

    .line 276
    .line 277
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-wide v4
.end method
