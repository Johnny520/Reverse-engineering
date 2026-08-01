.class public final Lxhss/ᲈᲇᛱᛶ;
.super Lxhss/ᛱᛶᛶᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final ᛳᲁᲇᛸ:Z


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lxhss/ᲈᲇᛱᛶ;->ᛳᲁᲇᛸ:Z

    .line 6
    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-le p2, v0, :cond_2

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    sub-int/2addr v2, v0

    .line 25
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/16 v3, 0x27

    .line 30
    .line 31
    if-ne v1, v3, :cond_0

    .line 32
    .line 33
    if-ne v2, v3, :cond_0

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    sub-int/2addr p2, v0

    .line 40
    invoke-interface {p1, v0, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/16 v3, 0x22

    .line 46
    .line 47
    if-ne v1, v3, :cond_1

    .line 48
    .line 49
    if-ne v2, v3, :cond_1

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sub-int/2addr v1, v0

    .line 56
    invoke-interface {p1, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-boolean p2, p0, Lxhss/ᲈᲇᛱᛶ;->ᛳᲁᲇᛸ:Z

    .line 61
    .line 62
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Lxhss/ᛵᛵᛲᲈ;->ᛱᛳᲁᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lxhss/ᲈᲇᛱᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lxhss/ᲈᲇᛱᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lxhss/ᲈᲇᛱᛶ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    instance-of v1, p1, Lxhss/ᛸᛷᲈᛶ;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    check-cast p1, Lxhss/ᛱᛶᛶᛱ;

    .line 16
    .line 17
    invoke-virtual {p1}, Lxhss/ᛱᛶᛶᛱ;->ᛸᛴᛶᛳ()Lxhss/ᲈᲇᛱᛶ;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p0, p0, Lxhss/ᲈᲇᛱᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iget-object p1, p1, Lxhss/ᲈᲇᛱᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-object p0, p1, Lxhss/ᲈᲇᛱᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 35
    .line 36
    if-nez p0, :cond_4

    .line 37
    .line 38
    :cond_3
    return v0

    .line 39
    :cond_4
    :goto_0
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lxhss/ᲈᲇᛱᛶ;->ᛳᲁᲇᛸ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "\'"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "\""

    .line 9
    .line 10
    :goto_0
    iget-object p0, p0, Lxhss/ᲈᲇᛱᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 11
    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    new-instance v2, Ljava/io/StringWriter;

    .line 22
    .line 23
    mul-int/lit8 v3, v1, 0x2

    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/io/StringWriter;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    :goto_1
    if-ge v3, v1, :cond_b

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/16 v5, 0xfff

    .line 36
    .line 37
    if-le v4, v5, :cond_2

    .line 38
    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v6, "\\u"

    .line 50
    .line 51
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_2
    const/16 v5, 0xff

    .line 67
    .line 68
    if-le v4, v5, :cond_3

    .line 69
    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    new-instance v5, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v6, "\\u0"

    .line 81
    .line 82
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :cond_3
    const/16 v5, 0x7f

    .line 98
    .line 99
    const-string v6, "\\u00"

    .line 100
    .line 101
    if-le v4, v5, :cond_4

    .line 102
    .line 103
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    new-instance v5, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_2

    .line 127
    .line 128
    :cond_4
    const/16 v5, 0x20

    .line 129
    .line 130
    const/16 v7, 0x5c

    .line 131
    .line 132
    if-ge v4, v5, :cond_6

    .line 133
    .line 134
    packed-switch v4, :pswitch_data_0

    .line 135
    .line 136
    .line 137
    :pswitch_0
    const/16 v5, 0xf

    .line 138
    .line 139
    if-le v4, v5, :cond_5

    .line 140
    .line 141
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    new-instance v5, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_2

    .line 165
    .line 166
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    new-instance v5, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v6, "\\u000"

    .line 177
    .line 178
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :pswitch_1
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 193
    .line 194
    .line 195
    const/16 v4, 0x72

    .line 196
    .line 197
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :pswitch_2
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 202
    .line 203
    .line 204
    const/16 v4, 0x66

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(I)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :pswitch_3
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 211
    .line 212
    .line 213
    const/16 v4, 0x6e

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(I)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :pswitch_4
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 220
    .line 221
    .line 222
    const/16 v4, 0x74

    .line 223
    .line 224
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :pswitch_5
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 229
    .line 230
    .line 231
    const/16 v4, 0x62

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(I)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_6
    const/16 v5, 0x22

    .line 238
    .line 239
    if-eq v4, v5, :cond_a

    .line 240
    .line 241
    const/16 v5, 0x27

    .line 242
    .line 243
    if-eq v4, v5, :cond_9

    .line 244
    .line 245
    const/16 v5, 0x2f

    .line 246
    .line 247
    if-eq v4, v5, :cond_8

    .line 248
    .line 249
    if-eq v4, v7, :cond_7

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Ljava/io/StringWriter;->write(I)V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_7
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_8
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v5}, Ljava/io/StringWriter;->write(I)V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_9
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v5}, Ljava/io/StringWriter;->write(I)V

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_a
    invoke-virtual {v2, v7}, Ljava/io/StringWriter;->write(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v5}, Ljava/io/StringWriter;->write(I)V

    .line 280
    .line 281
    .line 282
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 283
    .line 284
    goto/16 :goto_1

    .line 285
    .line 286
    :cond_b
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    :goto_3
    invoke-static {v0, p0, v0}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final ᛸᛴᛶᛳ()Lxhss/ᲈᲇᛱᛶ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᛸᛷᲈᲈ(Lxhss/ᲈᲀᲇᛵ;)Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ()Lxhss/ᛸᛷᲈᛶ;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲈᲇᛱᛶ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lxhss/ᛸᛷᲈᛶ;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lxhss/ᛸᛷᲈᛶ;-><init>(Ljava/math/BigDecimal;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :catch_0
    sget-object p0, Lxhss/ᛸᛷᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛸᛷᲈᛶ;

    .line 15
    .line 16
    return-object p0
.end method
