.class public final Lxhss/ᛴᲇᛴᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Ljava/lang/String;

.field public ᛳᲁᲇᛸ:Ljava/lang/String;

.field public ᛷᛴᛷᛱ:I

.field public ᛷᛵᛵᲈ:Ljava/lang/String;

.field public ᛸᛴᛶᛳ:Ljava/lang/String;

.field public ᲀᲇᛳᲁ:Ljava/util/ArrayList;

.field public ᲇᛴᲇᛵ:Ljava/lang/String;

.field public final ᲇᛶᛴᲀ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛴᛷᛱ:I

    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v2, Lxhss/ᛳᛲᛷᛷ;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v2, v3, v0}, Lxhss/ᛳᛲᛷᛷ;-><init>(Z[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛶᛴᲀ:Ljava/util/ArrayList;

    .line 29
    .line 30
    return-void
.end method

.method public static ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "://"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, "//"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x3a

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_3

    .line 42
    .line 43
    :goto_1
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const/16 v1, 0x40

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {v1, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛱᛲᛸᲇ(Ljava/lang/CharSequence;C)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/16 v1, 0x5b

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x5d

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    iget v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛴᛷᛱ:I

    .line 101
    .line 102
    const/4 v3, -0x1

    .line 103
    if-ne v1, v3, :cond_6

    .line 104
    .line 105
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v1, :cond_a

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p0}, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget-object v4, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v4, :cond_9

    .line 116
    .line 117
    const-string v5, "http"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    const/16 v3, 0x50

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    const-string v5, "https"

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_8

    .line 135
    .line 136
    const/16 v3, 0x1bb

    .line 137
    .line 138
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 139
    .line 140
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_a
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛶᛴᲀ:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const/4 v3, 0x0

    .line 153
    move v4, v3

    .line 154
    :goto_4
    if-ge v4, v2, :cond_b

    .line 155
    .line 156
    const/16 v5, 0x2f

    .line 157
    .line 158
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_b
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 174
    .line 175
    if-eqz v1, :cond_10

    .line 176
    .line 177
    const/16 v1, 0x3f

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v3, v2}, Lxhss/ᛵᛵᛲᲈ;->ᛲᛴᲀᲈ(II)Lxhss/ᛱᛲᲇᲀ;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const/4 v3, 0x2

    .line 193
    invoke-static {v2, v3}, Lxhss/ᛵᛵᛲᲈ;->ᲈᛲᛵᲁ(Lxhss/ᛱᛲᲇᲀ;I)Lxhss/ᲁᛵᛶᲁ;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    iget v3, v2, Lxhss/ᲁᛵᛶᲁ;->ᛱᛱᛲᲇ:I

    .line 198
    .line 199
    iget v4, v2, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 200
    .line 201
    iget v2, v2, Lxhss/ᲁᛵᛶᲁ;->ᲇᛴᲇᛵ:I

    .line 202
    .line 203
    if-lez v2, :cond_c

    .line 204
    .line 205
    if-le v3, v4, :cond_d

    .line 206
    .line 207
    :cond_c
    if-gez v2, :cond_10

    .line 208
    .line 209
    if-gt v4, v3, :cond_10

    .line 210
    .line 211
    :cond_d
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    check-cast v5, Ljava/lang/String;

    .line 216
    .line 217
    add-int/lit8 v6, v3, 0x1

    .line 218
    .line 219
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    check-cast v6, Ljava/lang/String;

    .line 224
    .line 225
    if-lez v3, :cond_e

    .line 226
    .line 227
    const/16 v7, 0x26

    .line 228
    .line 229
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    if-eqz v6, :cond_f

    .line 236
    .line 237
    const/16 v5, 0x3d

    .line 238
    .line 239
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    :cond_f
    if-eq v3, v4, :cond_10

    .line 246
    .line 247
    add-int/2addr v3, v2

    .line 248
    goto :goto_5

    .line 249
    :cond_10
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 250
    .line 251
    if-eqz v1, :cond_11

    .line 252
    .line 253
    const/16 v1, 0x23

    .line 254
    .line 255
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    iget-object p0, p0, Lxhss/ᛴᲇᛴᛱ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()I
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛴᛷᛱ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "http"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x50

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const-string v0, "https"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    const/16 v1, 0x1bb

    .line 29
    .line 30
    :cond_2
    :goto_0
    return v1
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛷᛶᲁᛵ;Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v8, 0x0

    .line 14
    invoke-static {v2, v8, v3}, Lxhss/ᛶᛸᛲ;->ᲇᛶᛴᲀ(Ljava/lang/String;II)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {v2, v4, v3}, Lxhss/ᛶᛸᛲ;->ᲀᲇᛳᲁ(Ljava/lang/String;II)I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    sub-int v3, v9, v4

    .line 27
    .line 28
    const/16 v10, 0x30

    .line 29
    .line 30
    const/16 v11, 0x5b

    .line 31
    .line 32
    const/16 v12, 0x3a

    .line 33
    .line 34
    const/4 v13, -0x1

    .line 35
    const/4 v14, 0x2

    .line 36
    if-ge v3, v14, :cond_1

    .line 37
    .line 38
    :cond_0
    :goto_0
    move v15, v13

    .line 39
    goto :goto_3

    .line 40
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/16 v5, 0x61

    .line 45
    .line 46
    invoke-static {v3, v5}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛴᲇᛵ(II)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/16 v7, 0x41

    .line 51
    .line 52
    if-ltz v6, :cond_2

    .line 53
    .line 54
    const/16 v6, 0x7a

    .line 55
    .line 56
    invoke-static {v3, v6}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛴᲇᛵ(II)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-lez v6, :cond_3

    .line 61
    .line 62
    :cond_2
    invoke-static {v3, v7}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛴᲇᛵ(II)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-ltz v6, :cond_0

    .line 67
    .line 68
    const/16 v6, 0x5a

    .line 69
    .line 70
    invoke-static {v3, v6}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛴᲇᛵ(II)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-lez v3, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    add-int/lit8 v3, v4, 0x1

    .line 78
    .line 79
    :goto_1
    if-ge v3, v9, :cond_0

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-gt v5, v6, :cond_4

    .line 86
    .line 87
    const/16 v15, 0x7b

    .line 88
    .line 89
    if-ge v6, v15, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    if-gt v7, v6, :cond_5

    .line 93
    .line 94
    if-ge v6, v11, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    if-gt v10, v6, :cond_6

    .line 98
    .line 99
    if-ge v6, v12, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    const/16 v15, 0x2b

    .line 103
    .line 104
    if-eq v6, v15, :cond_8

    .line 105
    .line 106
    const/16 v15, 0x2d

    .line 107
    .line 108
    if-eq v6, v15, :cond_8

    .line 109
    .line 110
    const/16 v15, 0x2e

    .line 111
    .line 112
    if-ne v6, v15, :cond_7

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_7
    if-ne v6, v12, :cond_0

    .line 116
    .line 117
    move v15, v3

    .line 118
    goto :goto_3

    .line 119
    :cond_8
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :goto_3
    const-string v3, "http"

    .line 123
    .line 124
    const-string v5, "https"

    .line 125
    .line 126
    move-object v6, v3

    .line 127
    const/4 v3, 0x1

    .line 128
    if-eq v15, v13, :cond_b

    .line 129
    .line 130
    move-object v7, v6

    .line 131
    const/4 v6, 0x0

    .line 132
    move-object/from16 v16, v7

    .line 133
    .line 134
    const/4 v7, 0x6

    .line 135
    move-object/from16 v17, v5

    .line 136
    .line 137
    const-string v5, "https:"

    .line 138
    .line 139
    move-object/from16 v10, v16

    .line 140
    .line 141
    move-object/from16 v11, v17

    .line 142
    .line 143
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_9

    .line 148
    .line 149
    iput-object v11, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 150
    .line 151
    add-int/lit8 v4, v4, 0x6

    .line 152
    .line 153
    move-object/from16 v2, p2

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_9
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x5

    .line 158
    const-string v5, "http:"

    .line 159
    .line 160
    move-object/from16 v2, p2

    .line 161
    .line 162
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_a

    .line 167
    .line 168
    iput-object v10, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x5

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 174
    .line 175
    invoke-virtual {v2, v8, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    new-instance v2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 182
    .line 183
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const/16 v1, 0x27

    .line 190
    .line 191
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_b
    move-object v11, v5

    .line 203
    move-object v10, v6

    .line 204
    if-eqz v1, :cond_30

    .line 205
    .line 206
    iget-object v5, v1, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 207
    .line 208
    iput-object v5, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 209
    .line 210
    :goto_4
    move v5, v4

    .line 211
    move v6, v8

    .line 212
    :goto_5
    const/16 v7, 0x5c

    .line 213
    .line 214
    const/16 v15, 0x2f

    .line 215
    .line 216
    move/from16 v17, v3

    .line 217
    .line 218
    if-ge v5, v9, :cond_d

    .line 219
    .line 220
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eq v3, v15, :cond_c

    .line 225
    .line 226
    if-eq v3, v7, :cond_c

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 230
    .line 231
    add-int/lit8 v5, v5, 0x1

    .line 232
    .line 233
    move/from16 v3, v17

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_d
    :goto_6
    const-string v5, " \"\'<>#"

    .line 237
    .line 238
    const-string v3, ""

    .line 239
    .line 240
    iget-object v12, v0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛶᛴᲀ:Ljava/util/ArrayList;

    .line 241
    .line 242
    const/16 v7, 0x23

    .line 243
    .line 244
    if-ge v6, v14, :cond_11

    .line 245
    .line 246
    if-eqz v1, :cond_11

    .line 247
    .line 248
    iget-object v14, v1, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 249
    .line 250
    iget-object v15, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {v14, v15}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v14

    .line 256
    if-nez v14, :cond_e

    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_e
    invoke-virtual {v1}, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    iput-object v6, v0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {v1}, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    iput-object v6, v0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v6, v1, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 272
    .line 273
    iput-object v6, v0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 274
    .line 275
    iget v6, v1, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 276
    .line 277
    iput v6, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛴᛷᛱ:I

    .line 278
    .line 279
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, Lxhss/ᛷᛶᲁᛵ;->ᛳᲁᲇᛸ()Ljava/util/ArrayList;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 287
    .line 288
    .line 289
    if-eq v4, v9, :cond_f

    .line 290
    .line 291
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 292
    .line 293
    .line 294
    move-result v6

    .line 295
    if-ne v6, v7, :cond_21

    .line 296
    .line 297
    :cond_f
    invoke-virtual {v1}, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    if-eqz v1, :cond_10

    .line 302
    .line 303
    const/16 v6, 0x53

    .line 304
    .line 305
    invoke-static {v1, v8, v8, v5, v6}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-static {v1}, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    goto :goto_7

    .line 314
    :cond_10
    const/4 v1, 0x0

    .line 315
    :goto_7
    iput-object v1, v0, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 316
    .line 317
    goto/16 :goto_12

    .line 318
    .line 319
    :cond_11
    :goto_8
    add-int/2addr v4, v6

    .line 320
    move v6, v4

    .line 321
    move v1, v8

    .line 322
    move v4, v1

    .line 323
    :goto_9
    const-string v14, "@/\\?#"

    .line 324
    .line 325
    invoke-static {v6, v9, v2, v14}, Lxhss/ᛶᛸᛲ;->ᛱᛱᛲᲇ(IILjava/lang/String;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    if-eq v14, v9, :cond_12

    .line 330
    .line 331
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    goto :goto_a

    .line 336
    :cond_12
    move v15, v13

    .line 337
    :goto_a
    if-eq v15, v13, :cond_17

    .line 338
    .line 339
    if-eq v15, v7, :cond_17

    .line 340
    .line 341
    const/16 v8, 0x2f

    .line 342
    .line 343
    if-eq v15, v8, :cond_17

    .line 344
    .line 345
    const/16 v8, 0x5c

    .line 346
    .line 347
    if-eq v15, v8, :cond_17

    .line 348
    .line 349
    const/16 v8, 0x3f

    .line 350
    .line 351
    if-eq v15, v8, :cond_17

    .line 352
    .line 353
    const/16 v8, 0x40

    .line 354
    .line 355
    if-eq v15, v8, :cond_13

    .line 356
    .line 357
    const/4 v8, 0x0

    .line 358
    goto :goto_9

    .line 359
    :cond_13
    const-string v8, " \"\':;<=>@[]^`{}|/\\?#"

    .line 360
    .line 361
    const-string v15, "%40"

    .line 362
    .line 363
    if-nez v1, :cond_16

    .line 364
    .line 365
    const/16 v7, 0x3a

    .line 366
    .line 367
    invoke-static {v2, v7, v6, v14}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    const/16 v7, 0x70

    .line 372
    .line 373
    invoke-static {v2, v6, v13, v8, v7}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    if-eqz v4, :cond_14

    .line 378
    .line 379
    new-instance v4, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    iget-object v7, v0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 382
    .line 383
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    :cond_14
    iput-object v6, v0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 397
    .line 398
    if-eq v13, v14, :cond_15

    .line 399
    .line 400
    add-int/lit8 v13, v13, 0x1

    .line 401
    .line 402
    const/16 v7, 0x70

    .line 403
    .line 404
    invoke-static {v2, v13, v14, v8, v7}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    iput-object v1, v0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 409
    .line 410
    move/from16 v1, v17

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_15
    const/16 v7, 0x70

    .line 414
    .line 415
    :goto_b
    move/from16 v4, v17

    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_16
    const/16 v7, 0x70

    .line 419
    .line 420
    new-instance v13, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    iget-object v7, v0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 423
    .line 424
    invoke-direct {v13, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    const/16 v7, 0x70

    .line 431
    .line 432
    invoke-static {v2, v6, v14, v8, v7}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    iput-object v6, v0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 444
    .line 445
    :goto_c
    add-int/lit8 v6, v14, 0x1

    .line 446
    .line 447
    const/16 v7, 0x23

    .line 448
    .line 449
    const/4 v8, 0x0

    .line 450
    const/4 v13, -0x1

    .line 451
    goto/16 :goto_9

    .line 452
    .line 453
    :cond_17
    move v1, v6

    .line 454
    :goto_d
    if-ge v1, v14, :cond_1a

    .line 455
    .line 456
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    const/16 v7, 0x3a

    .line 461
    .line 462
    if-eq v4, v7, :cond_1b

    .line 463
    .line 464
    const/16 v8, 0x5b

    .line 465
    .line 466
    if-eq v4, v8, :cond_18

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 470
    .line 471
    if-ge v1, v14, :cond_19

    .line 472
    .line 473
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    const/16 v13, 0x5d

    .line 478
    .line 479
    if-ne v4, v13, :cond_18

    .line 480
    .line 481
    :cond_19
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_1a
    move v1, v14

    .line 485
    :cond_1b
    add-int/lit8 v4, v1, 0x1

    .line 486
    .line 487
    const/4 v7, 0x4

    .line 488
    const/16 v8, 0x22

    .line 489
    .line 490
    if-ge v4, v14, :cond_1e

    .line 491
    .line 492
    invoke-static {v6, v1, v7, v2}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    invoke-static {v7}, Lxhss/ᲀᲀᛶᲁ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    iput-object v7, v0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 501
    .line 502
    const/16 v7, 0x78

    .line 503
    .line 504
    :try_start_0
    invoke-static {v2, v4, v14, v3, v7}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v7

    .line 508
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 509
    .line 510
    .line 511
    move-result v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 512
    move/from16 v10, v17

    .line 513
    .line 514
    if-gt v10, v7, :cond_1c

    .line 515
    .line 516
    const/high16 v10, 0x10000

    .line 517
    .line 518
    if-ge v7, v10, :cond_1c

    .line 519
    .line 520
    goto :goto_f

    .line 521
    :catch_0
    :cond_1c
    const/4 v7, -0x1

    .line 522
    :goto_f
    iput v7, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛴᛷᛱ:I

    .line 523
    .line 524
    const/4 v13, -0x1

    .line 525
    if-eq v7, v13, :cond_1d

    .line 526
    .line 527
    goto :goto_11

    .line 528
    :cond_1d
    invoke-virtual {v2, v4, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    new-instance v1, Ljava/lang/StringBuilder;

    .line 533
    .line 534
    const-string v2, "Invalid URL port: \""

    .line 535
    .line 536
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v1

    .line 559
    :cond_1e
    const/4 v13, -0x1

    .line 560
    invoke-static {v6, v1, v7, v2}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v4

    .line 564
    invoke-static {v4}, Lxhss/ᲀᲀᛶᲁ;->ᛱᛱᛲᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    iput-object v4, v0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 569
    .line 570
    iget-object v4, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 571
    .line 572
    invoke-virtual {v4, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    if-eqz v7, :cond_1f

    .line 577
    .line 578
    const/16 v13, 0x50

    .line 579
    .line 580
    goto :goto_10

    .line 581
    :cond_1f
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    if-eqz v4, :cond_20

    .line 586
    .line 587
    const/16 v13, 0x1bb

    .line 588
    .line 589
    :cond_20
    :goto_10
    iput v13, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛴᛷᛱ:I

    .line 590
    .line 591
    :goto_11
    iget-object v4, v0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 592
    .line 593
    if-eqz v4, :cond_2f

    .line 594
    .line 595
    move v4, v14

    .line 596
    :cond_21
    :goto_12
    const-string v1, "?#"

    .line 597
    .line 598
    invoke-static {v4, v9, v2, v1}, Lxhss/ᛶᛸᛲ;->ᛱᛱᛲᲇ(IILjava/lang/String;Ljava/lang/String;)I

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    if-ne v4, v1, :cond_22

    .line 603
    .line 604
    goto/16 :goto_18

    .line 605
    .line 606
    :cond_22
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 607
    .line 608
    .line 609
    move-result v6

    .line 610
    const/16 v8, 0x2f

    .line 611
    .line 612
    if-eq v6, v8, :cond_23

    .line 613
    .line 614
    const/16 v8, 0x5c

    .line 615
    .line 616
    if-eq v6, v8, :cond_23

    .line 617
    .line 618
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 619
    .line 620
    .line 621
    move-result v6

    .line 622
    const/16 v17, 0x1

    .line 623
    .line 624
    add-int/lit8 v6, v6, -0x1

    .line 625
    .line 626
    invoke-virtual {v12, v6, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    goto :goto_13

    .line 630
    :cond_23
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    add-int/lit8 v4, v4, 0x1

    .line 637
    .line 638
    :goto_13
    if-ge v4, v1, :cond_2c

    .line 639
    .line 640
    const-string v6, "/\\"

    .line 641
    .line 642
    invoke-static {v4, v1, v2, v6}, Lxhss/ᛶᛸᛲ;->ᛱᛱᛲᲇ(IILjava/lang/String;Ljava/lang/String;)I

    .line 643
    .line 644
    .line 645
    move-result v6

    .line 646
    if-ge v6, v1, :cond_24

    .line 647
    .line 648
    const/4 v7, 0x1

    .line 649
    goto :goto_14

    .line 650
    :cond_24
    const/4 v7, 0x0

    .line 651
    :goto_14
    const-string v8, " \"<>^`{}|/\\?#"

    .line 652
    .line 653
    const/16 v10, 0x70

    .line 654
    .line 655
    invoke-static {v2, v4, v6, v8, v10}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    const-string v8, "."

    .line 660
    .line 661
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v8

    .line 665
    if-nez v8, :cond_2a

    .line 666
    .line 667
    const-string v8, "%2e"

    .line 668
    .line 669
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 670
    .line 671
    .line 672
    move-result v8

    .line 673
    if-eqz v8, :cond_25

    .line 674
    .line 675
    goto/16 :goto_17

    .line 676
    .line 677
    :cond_25
    const-string v8, ".."

    .line 678
    .line 679
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    move-result v8

    .line 683
    if-nez v8, :cond_28

    .line 684
    .line 685
    const-string v8, "%2e."

    .line 686
    .line 687
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 688
    .line 689
    .line 690
    move-result v8

    .line 691
    if-nez v8, :cond_28

    .line 692
    .line 693
    const-string v8, ".%2e"

    .line 694
    .line 695
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 696
    .line 697
    .line 698
    move-result v8

    .line 699
    if-nez v8, :cond_28

    .line 700
    .line 701
    const-string v8, "%2e%2e"

    .line 702
    .line 703
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 704
    .line 705
    .line 706
    move-result v8

    .line 707
    if-eqz v8, :cond_26

    .line 708
    .line 709
    goto :goto_16

    .line 710
    :cond_26
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 711
    .line 712
    .line 713
    move-result v8

    .line 714
    const/16 v17, 0x1

    .line 715
    .line 716
    add-int/lit8 v8, v8, -0x1

    .line 717
    .line 718
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v8

    .line 722
    check-cast v8, Ljava/lang/CharSequence;

    .line 723
    .line 724
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 725
    .line 726
    .line 727
    move-result v8

    .line 728
    if-nez v8, :cond_27

    .line 729
    .line 730
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 731
    .line 732
    .line 733
    move-result v8

    .line 734
    add-int/lit8 v8, v8, -0x1

    .line 735
    .line 736
    invoke-virtual {v12, v8, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    goto :goto_15

    .line 740
    :cond_27
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    :goto_15
    if-eqz v7, :cond_2a

    .line 744
    .line 745
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    goto :goto_17

    .line 749
    :cond_28
    :goto_16
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    const/16 v17, 0x1

    .line 754
    .line 755
    add-int/lit8 v4, v4, -0x1

    .line 756
    .line 757
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    check-cast v4, Ljava/lang/String;

    .line 762
    .line 763
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 764
    .line 765
    .line 766
    move-result v4

    .line 767
    if-nez v4, :cond_29

    .line 768
    .line 769
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    if-nez v4, :cond_29

    .line 774
    .line 775
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 776
    .line 777
    .line 778
    move-result v4

    .line 779
    add-int/lit8 v4, v4, -0x1

    .line 780
    .line 781
    invoke-virtual {v12, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    goto :goto_17

    .line 785
    :cond_29
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    :cond_2a
    :goto_17
    if-eqz v7, :cond_2b

    .line 789
    .line 790
    add-int/lit8 v4, v6, 0x1

    .line 791
    .line 792
    goto/16 :goto_13

    .line 793
    .line 794
    :cond_2b
    move v4, v6

    .line 795
    goto/16 :goto_13

    .line 796
    .line 797
    :cond_2c
    :goto_18
    if-ge v1, v9, :cond_2d

    .line 798
    .line 799
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    const/16 v8, 0x3f

    .line 804
    .line 805
    if-ne v4, v8, :cond_2d

    .line 806
    .line 807
    const/16 v4, 0x23

    .line 808
    .line 809
    invoke-static {v2, v4, v1, v9}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 810
    .line 811
    .line 812
    move-result v6

    .line 813
    add-int/lit8 v1, v1, 0x1

    .line 814
    .line 815
    const/16 v4, 0x50

    .line 816
    .line 817
    invoke-static {v2, v1, v6, v5, v4}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-static {v1}, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    iput-object v1, v0, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 826
    .line 827
    move v1, v6

    .line 828
    :cond_2d
    if-ge v1, v9, :cond_2e

    .line 829
    .line 830
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 831
    .line 832
    .line 833
    move-result v4

    .line 834
    const/16 v5, 0x23

    .line 835
    .line 836
    if-ne v4, v5, :cond_2e

    .line 837
    .line 838
    const/16 v17, 0x1

    .line 839
    .line 840
    add-int/lit8 v1, v1, 0x1

    .line 841
    .line 842
    const/16 v4, 0x30

    .line 843
    .line 844
    invoke-static {v2, v1, v9, v3, v4}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    iput-object v1, v0, Lxhss/ᛴᲇᛴᛱ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 849
    .line 850
    :cond_2e
    return-void

    .line 851
    :cond_2f
    invoke-virtual {v2, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    new-instance v1, Ljava/lang/StringBuilder;

    .line 856
    .line 857
    const-string v2, "Invalid URL host: \""

    .line 858
    .line 859
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 873
    .line 874
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    throw v1

    .line 882
    :cond_30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    const/4 v1, 0x6

    .line 887
    if-le v0, v1, :cond_31

    .line 888
    .line 889
    invoke-static {v2, v1}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛸᲁᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    const-string v1, "..."

    .line 894
    .line 895
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    goto :goto_19

    .line 900
    :cond_31
    move-object v0, v2

    .line 901
    :goto_19
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 902
    .line 903
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛷᛶᲁᛵ;
    .locals 12

    .line 1
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz v1, :cond_6

    .line 5
    .line 6
    iget-object v2, p0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x7

    .line 10
    invoke-static {v3, v3, v4, v2}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v5, p0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v3, v3, v4, v5}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    move v6, v4

    .line 21
    iget-object v4, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    move v7, v3

    .line 26
    move-object v3, v5

    .line 27
    invoke-virtual {p0}, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    new-instance v8, Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v9, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛶᛴᲀ:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {v9}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-eqz v10, :cond_0

    .line 51
    .line 52
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    check-cast v10, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v7, v7, v6, v10}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object v8, p0, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v8, :cond_2

    .line 69
    .line 70
    new-instance v9, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {v8}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-eqz v10, :cond_3

    .line 88
    .line 89
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    check-cast v10, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v10, :cond_1

    .line 96
    .line 97
    const/4 v11, 0x3

    .line 98
    invoke-static {v7, v7, v11, v10}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    goto :goto_2

    .line 103
    :cond_1
    move-object v10, v0

    .line 104
    :goto_2
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    move-object v9, v0

    .line 109
    :cond_3
    iget-object v8, p0, Lxhss/ᛴᲇᛴᛱ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v8, :cond_4

    .line 112
    .line 113
    invoke-static {v7, v7, v6, v8}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :cond_4
    move-object v7, v0

    .line 118
    invoke-virtual {p0}, Lxhss/ᛴᲇᛴᛱ;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    new-instance v0, Lxhss/ᛷᛶᲁᛵ;

    .line 123
    .line 124
    move-object v6, v9

    .line 125
    invoke-direct/range {v0 .. v8}, Lxhss/ᛷᛶᲁᛵ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_5
    const-string p0, "host == null"

    .line 130
    .line 131
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_6
    const-string p0, "scheme == null"

    .line 136
    .line 137
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object v0
.end method
