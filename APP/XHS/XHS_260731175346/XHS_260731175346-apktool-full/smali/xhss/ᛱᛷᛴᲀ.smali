.class public final Lxhss/ᛱᛷᛴᲀ;
.super Lxhss/ᲈᲈᛱᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;


# instance fields
.field public ᛷᛴᛷᛱ:Lxhss/ᛳᛴᛵ;

.field public final synthetic ᛸᛲᲀᛵ:Ljava/lang/String;

.field public final synthetic ᛸᛴᛶᛳ:Ljava/lang/Object;

.field public final synthetic ᛸᛷᲈᲈ:Ljava/lang/String;

.field public final synthetic ᲀᲇᛳᲁ:Ljava/lang/Object;

.field public ᲇᛶᛴᲀ:I

.field public final synthetic ᲈᛳᲀ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lxhss/ᛱᛴᛶᛴ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛱᛷᛴᲀ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛲᲀᛵ:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛷᲈᲈ:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lxhss/ᛱᛷᛴᲀ;->ᲈᛳᲀ:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {p0, p6}, Lxhss/ᛸᛴᛳᛷ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lxhss/ᛲᛸᲁᲇ;

    .line 2
    .line 3
    check-cast p2, Lxhss/ᛱᛴᛶᛴ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxhss/ᛱᛷᛴᲀ;->ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxhss/ᛱᛷᛴᲀ;

    .line 10
    .line 11
    sget-object p1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxhss/ᛱᛷᛴᲀ;->ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lxhss/ᛱᛷᛴᲀ;->ᲇᛶᛴᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lxhss/ᛱᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᛵ;

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :catchall_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    goto/16 :goto_8

    .line 18
    .line 19
    :catch_0
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    const-wide p0, -0xea471b858845L

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-static {p1}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const-wide v2, -0xea111b858845L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lxhss/ᛳᛴᛵ;->ᛶᲀᛵᲇ(Ljava/lang/String;)Lxhss/ᛳᛴᛵ;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :try_start_1
    iget-object v0, p0, Lxhss/ᛱᛷᛴᲀ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 58
    .line 59
    const-wide v3, -0xea151b858845L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v4, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v3, v4}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛶᛴᲈ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/io/File;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_0
    move-object v6, v0

    .line 78
    goto :goto_3

    .line 79
    :goto_1
    move-object v8, p1

    .line 80
    move-object p1, p0

    .line 81
    move-object p0, v8

    .line 82
    goto/16 :goto_8

    .line 83
    .line 84
    :goto_2
    move-object v8, p1

    .line 85
    move-object p1, p0

    .line 86
    move-object p0, v8

    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :catchall_1
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    goto :goto_1

    .line 92
    :catch_1
    move-exception v0

    .line 93
    move-object p0, v0

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 96
    .line 97
    const-wide v2, -0xea191b858845L

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-wide v3, -0xea231b858845L

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v3}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛶᛴᲀ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛲᲀᛵ(Ljava/lang/String;)Ljava/io/File;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_0

    .line 127
    :goto_3
    iget-object v4, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛲᲀᛵ:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v5, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛷᲈᲈ:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v3, p0, Lxhss/ᛱᛷᛴᲀ;->ᲈᛳᲀ:Landroid/content/Context;

    .line 132
    .line 133
    iput-object p1, p0, Lxhss/ᛱᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᛵ;

    .line 134
    .line 135
    iput v1, p0, Lxhss/ᛱᛷᛴᲀ;->ᲇᛶᛴᲀ:I

    .line 136
    .line 137
    new-instance v2, Lxhss/ᛴᲇᲈᛲ;

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    invoke-direct/range {v2 .. v7}, Lxhss/ᛴᲇᲈᛲ;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lxhss/ᛱᛴᛶᛴ;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, Lxhss/ᛴᛱᛶᛸ;

    .line 144
    .line 145
    iget-object v1, p0, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 146
    .line 147
    invoke-direct {v0, v1, p0}, Lxhss/ᛴᛱᛶᛸ;-><init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛸᛴᛳᛷ;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v0, v2}, Lxhss/ᲁᛵᛸᛳ;->ᛴᲈᛱᛴ(Lxhss/ᛴᛱᛶᛸ;Lxhss/ᛴᛱᛶᛸ;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    sget-object v0, Lxhss/ᛸᛴᛸᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛸᲈ;

    .line 155
    .line 156
    if-ne p0, v0, :cond_3

    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_3
    move-object v8, p1

    .line 160
    move-object p1, p0

    .line 161
    move-object p0, v8

    .line 162
    :goto_4
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_4

    .line 169
    .line 170
    sget-object p1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 171
    .line 172
    const-wide v0, -0xea271b858845L

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᲁᛴᲁ(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_4
    sget-object p1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 189
    .line 190
    const-wide v0, -0xea2c1b858845L

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-static {v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᲁᛴᲁ(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 203
    .line 204
    .line 205
    :goto_5
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᲁᛳᛲ()V

    .line 206
    .line 207
    .line 208
    goto :goto_7

    .line 209
    :goto_6
    const-wide v0, -0xea311b858845L

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    :try_start_3
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const-wide v1, -0xfd181b858845L

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    const-wide v1, -0xfd201b858845L

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {v0, p1}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-wide v2, -0xea401b858845L

    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-static {p1}, Lxhss/ᲇᲁᛱᛸ;->ᲁᲁᛴᲁ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :goto_7
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 278
    .line 279
    return-object p0

    .line 280
    :goto_8
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᲁᛳᛲ()V

    .line 281
    .line 282
    .line 283
    throw p1
.end method

.method public final ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;
    .locals 7

    .line 1
    new-instance v0, Lxhss/ᛱᛷᛴᲀ;

    .line 2
    .line 3
    iget-object v4, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛷᲈᲈ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, Lxhss/ᛱᛷᛴᲀ;->ᲈᛳᲀ:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛱᛷᛴᲀ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛴᛶᛳ:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v3, p0, Lxhss/ᛱᛷᛴᲀ;->ᛸᛲᲀᛵ:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lxhss/ᛱᛷᛴᲀ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lxhss/ᛱᛴᛶᛴ;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
