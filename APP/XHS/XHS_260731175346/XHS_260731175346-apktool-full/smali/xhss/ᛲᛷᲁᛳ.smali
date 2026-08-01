.class public final synthetic Lxhss/ᛲᛷᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛲᛷᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛲᛷᲁᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lxhss/ᛲᛷᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lxhss/ᛲᛷᲁᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, [C

    .line 12
    .line 13
    check-cast p1, Ljava/lang/CharSequence;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p1, p0, p2, v2}, Lxhss/ᛲᛱᛲᲀ;->ᲁᛲᲈᛵ(Ljava/lang/CharSequence;[CIZ)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-gez p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v3, Lxhss/ᲀᛴᛳᛸ;

    .line 37
    .line 38
    invoke-direct {v3, p0, p1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-object v3

    .line 42
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 43
    .line 44
    move-object v6, p1

    .line 45
    check-cast v6, Ljava/lang/CharSequence;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-ne p2, v1, :cond_5

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    if-ne p2, v1, :cond_3

    .line 66
    .line 67
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Ljava/lang/String;

    .line 72
    .line 73
    const/4 p2, 0x4

    .line 74
    invoke-static {v6, p0, p1, v2, p2}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-gez p1, :cond_2

    .line 79
    .line 80
    :cond_1
    move-object p2, v3

    .line 81
    goto/16 :goto_5

    .line 82
    .line 83
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p2, Lxhss/ᲀᛴᛳᛸ;

    .line 88
    .line 89
    invoke-direct {p2, p1, p0}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_3
    const-string p0, "List has more than one element."

    .line 95
    .line 96
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_6

    .line 100
    .line 101
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 102
    .line 103
    const-string p1, "List is empty."

    .line 104
    .line 105
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :cond_5
    new-instance p2, Lxhss/ᛱᛲᲇᲀ;

    .line 110
    .line 111
    if-gez p1, :cond_6

    .line 112
    .line 113
    move p1, v2

    .line 114
    :cond_6
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-direct {p2, p1, v0, v1}, Lxhss/ᲁᛵᛶᲁ;-><init>(III)V

    .line 119
    .line 120
    .line 121
    instance-of v0, v6, Ljava/lang/String;

    .line 122
    .line 123
    iget v1, p2, Lxhss/ᲁᛵᛶᲁ;->ᲇᛴᲇᛵ:I

    .line 124
    .line 125
    iget p2, p2, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 126
    .line 127
    if-eqz v0, :cond_c

    .line 128
    .line 129
    if-lez v1, :cond_7

    .line 130
    .line 131
    if-le p1, p2, :cond_8

    .line 132
    .line 133
    :cond_7
    if-gez v1, :cond_1

    .line 134
    .line 135
    if-gt p2, p1, :cond_1

    .line 136
    .line 137
    :cond_8
    :goto_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_a

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    move-object v5, v4

    .line 152
    check-cast v5, Ljava/lang/String;

    .line 153
    .line 154
    move-object v7, v6

    .line 155
    check-cast v7, Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    invoke-virtual {v5, v2, v7, p1, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_9

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_a
    move-object v4, v3

    .line 169
    :goto_2
    check-cast v4, Ljava/lang/String;

    .line 170
    .line 171
    if-eqz v4, :cond_b

    .line 172
    .line 173
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    new-instance p2, Lxhss/ᲀᛴᛳᛸ;

    .line 178
    .line 179
    invoke-direct {p2, p0, v4}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_b
    if-eq p1, p2, :cond_1

    .line 184
    .line 185
    add-int/2addr p1, v1

    .line 186
    goto :goto_1

    .line 187
    :cond_c
    if-lez v1, :cond_d

    .line 188
    .line 189
    if-le p1, p2, :cond_e

    .line 190
    .line 191
    :cond_d
    if-gez v1, :cond_1

    .line 192
    .line 193
    if-gt p2, p1, :cond_1

    .line 194
    .line 195
    :cond_e
    move v7, p1

    .line 196
    :goto_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_10

    .line 205
    .line 206
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    move-object v4, v0

    .line 211
    check-cast v4, Ljava/lang/String;

    .line 212
    .line 213
    const/4 v5, 0x0

    .line 214
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    const/4 v9, 0x0

    .line 219
    invoke-static/range {v4 .. v9}, Lxhss/ᛲᛱᛲᲀ;->ᲇᛸᛶ(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_f

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_10
    move-object v0, v3

    .line 227
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 228
    .line 229
    if-eqz v0, :cond_11

    .line 230
    .line 231
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    new-instance p2, Lxhss/ᲀᛴᛳᛸ;

    .line 236
    .line 237
    invoke-direct {p2, p0, v0}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_11
    if-eq v7, p2, :cond_1

    .line 242
    .line 243
    add-int/2addr v7, v1

    .line 244
    goto :goto_3

    .line 245
    :goto_5
    if-eqz p2, :cond_12

    .line 246
    .line 247
    iget-object p0, p2, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 248
    .line 249
    iget-object p1, p2, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast p1, Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    new-instance v3, Lxhss/ᲀᛴᛳᛸ;

    .line 262
    .line 263
    invoke-direct {v3, p0, p1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_12
    :goto_6
    return-object v3

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
