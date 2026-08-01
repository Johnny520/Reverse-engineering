.class public final Lxhss/ᛱᛸᛷᲇ;
.super Lxhss/ᛳᛳᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲇᛶᛴᲀ:Lxhss/ᛶᛵᲇᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxhss/ᛱᛸᛷᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 9
    .line 10
    return-void
.end method

.method public static ᛸᛷᲈᲈ(Lxhss/ᛳᛳᛵᛱ;Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;Lxhss/ᲇᛸᛲᲀ;)V
    .locals 11

    .line 1
    move-object v4, p4

    .line 2
    move-object/from16 v5, p5

    .line 3
    .line 4
    iget-object v6, v4, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 5
    .line 6
    iget-object v0, v6, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    instance-of v0, p3, Ljava/util/Map;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-interface {v5, p3}, Lxhss/ᲇᛸᛲᲀ;->ᲇᛶᛴᲀ(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual/range {p0 .. p4}, Lxhss/ᛳᛳᛵᛱ;->ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p2, v6, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 25
    .line 26
    invoke-virtual {p2, p3}, Lxhss/ᲇᛵᛲᲁ;->ᛷᲁᲁ(Ljava/lang/Object;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_6

    .line 39
    .line 40
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, "[\'"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, "\']"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v2, v6, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v2, p3

    .line 77
    check-cast v2, Ljava/util/Map;

    .line 78
    .line 79
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    sget-object v7, Lxhss/ᲇᛵᛲᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 84
    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    move-object v3, v7

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object v3, v2

    .line 94
    :goto_1
    if-eq v3, v7, :cond_1

    .line 95
    .line 96
    new-instance v2, Lxhss/ᛵᛵᲀᲇ;

    .line 97
    .line 98
    invoke-direct {v2, p3}, Lxhss/ᛴᛴᛴᛷ;-><init>(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, v2, Lxhss/ᛵᛵᲀᲇ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 102
    .line 103
    move-object v0, p0

    .line 104
    invoke-static/range {v0 .. v5}, Lxhss/ᛱᛸᛷᲇ;->ᛸᛷᲈᲈ(Lxhss/ᛳᛳᛵᛱ;Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;Lxhss/ᲇᛸᛲᲀ;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    iget-object v0, v6, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 109
    .line 110
    iget-object v1, v6, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    instance-of v0, p3, Ljava/util/List;

    .line 116
    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    invoke-interface {v5, p3}, Lxhss/ᲇᛸᛲᲀ;->ᲇᛶᛴᲀ(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    const-string v6, "]"

    .line 124
    .line 125
    const-string v7, "["

    .line 126
    .line 127
    const/4 v2, 0x0

    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->ᛷᛴᛷᛱ()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    invoke-virtual/range {p0 .. p4}, Lxhss/ᛳᛳᛵᛱ;->ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->ᛸᛲᲀᛵ()Lxhss/ᛳᛳᛵᛱ;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v1, p3}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛲᛷᛱ(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    move v8, v2

    .line 153
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-eqz v9, :cond_5

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    new-instance v10, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    iput v8, v0, Lxhss/ᛳᛳᛵᛱ;->ᛷᛴᛷᛱ:I

    .line 185
    .line 186
    invoke-virtual {v0, v10, p2, v9, p4}, Lxhss/ᛳᛳᛵᛱ;->ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V

    .line 187
    .line 188
    .line 189
    add-int/lit8 v8, v8, 0x1

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_5
    :goto_3
    invoke-virtual {v1, p3}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛲᛷᛱ(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    move v8, v2

    .line 201
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_6

    .line 206
    .line 207
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    new-instance v2, Lxhss/ᛷᛷᛳᛶ;

    .line 233
    .line 234
    invoke-direct {v2, p3}, Lxhss/ᛴᛴᛴᛷ;-><init>(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    iput v8, v2, Lxhss/ᛷᛷᛳᛶ;->ᲇᛴᲇᛵ:I

    .line 238
    .line 239
    move-object v0, p0

    .line 240
    invoke-static/range {v0 .. v5}, Lxhss/ᛱᛸᛷᲇ;->ᛸᛷᲈᲈ(Lxhss/ᛳᛳᛵᛱ;Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;Lxhss/ᲇᛸᛲᲀ;)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 v8, v8, 0x1

    .line 244
    .line 245
    move-object v4, p4

    .line 246
    move-object/from16 v5, p5

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, ".."

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->ᛸᛲᲀᛵ()Lxhss/ᛳᛳᛵᛱ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of p0, v0, Lxhss/ᛵᲀᛲᲇ;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lxhss/ᛳᛱᛲᲀ;

    .line 11
    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Lxhss/ᛵᲀᛲᲇ;

    .line 14
    .line 15
    const/16 v3, 0xe

    .line 16
    .line 17
    invoke-direct {p0, v2, p4, v3, v1}, Lxhss/ᛳᛱᛲᲀ;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 18
    .line 19
    .line 20
    :goto_0
    move-object v5, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move-object v3, p3

    .line 24
    move-object v4, p4

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    instance-of p0, v0, Lxhss/ᲈᛷᲇᛳ;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    new-instance p0, Lxhss/ᲇᛵᛲᲁ;

    .line 31
    .line 32
    const/16 v1, 0x14

    .line 33
    .line 34
    invoke-direct {p0, v1, p4}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of p0, v0, Lxhss/ᛸᛷᛲᛶ;

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    new-instance p0, Lxhss/ᛶᛵᲇᛸ;

    .line 43
    .line 44
    const/16 v1, 0x15

    .line 45
    .line 46
    invoke-direct {p0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    instance-of p0, v0, Lxhss/ᛱᛳᛶᛵ;

    .line 51
    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    new-instance p0, Lxhss/ᛳᛱᛲᲀ;

    .line 55
    .line 56
    move-object v2, v0

    .line 57
    check-cast v2, Lxhss/ᛱᛳᛶᛵ;

    .line 58
    .line 59
    const/16 v3, 0xd

    .line 60
    .line 61
    invoke-direct {p0, v2, p4, v3, v1}, Lxhss/ᛳᛱᛲᲀ;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    sget-object p0, Lxhss/ᛱᛸᛷᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    invoke-static/range {v0 .. v5}, Lxhss/ᛱᛸᛷᲇ;->ᛸᛷᲈᲈ(Lxhss/ᛳᛳᛵᛱ;Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;Lxhss/ᲇᛸᛲᲀ;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final ᲀᲇᛳᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
