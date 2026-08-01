.class public final Lxhss/ᛶᲈᛷᲁ;
.super Lxhss/ᛲᛶᛲᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:Ljava/util/List;

.field public final synthetic ᲇᛴᲇᛵ:I

.field public ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛶᲈᛷᲁ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public ᛵᛷᛲᛸ(Lxhss/ᛷᛴᛲᛲ;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲁᛶᛷ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 10
    .line 11
    return-void
.end method

.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 13

    .line 1
    iget v0, p0, Lxhss/ᛶᲈᛷᲁ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x7

    .line 7
    const/16 v5, 0x8

    .line 8
    .line 9
    const/4 v6, -0x1

    .line 10
    const-string v7, "not has id"

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    const/4 v9, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lxhss/ᛶᲈᛷᲁ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    new-instance v10, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    if-eqz v11, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    check-cast v11, Lxhss/ᲇᛸᛳᛸ;

    .line 45
    .line 46
    iget v12, v11, Lxhss/ᲁᛵᛷᛷ;->ᛷᛵᛵᲈ:I

    .line 47
    .line 48
    if-ltz v12, :cond_0

    .line 49
    .line 50
    iget v11, v11, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ:I

    .line 51
    .line 52
    invoke-static {v11, v12}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v7}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_1
    invoke-static {v10}, Lxhss/ᛷᲇᛵᛳ;->ᛴᛷᛵᛴ(Ljava/util/ArrayList;)[J

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    array-length v7, v0

    .line 73
    invoke-virtual {p1, v5, v7, v5}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛸᛳᲁ(III)V

    .line 74
    .line 75
    .line 76
    array-length v5, v0

    .line 77
    sub-int/2addr v5, v8

    .line 78
    :goto_1
    if-ge v6, v5, :cond_2

    .line 79
    .line 80
    aget-wide v10, v0, v5

    .line 81
    .line 82
    invoke-virtual {p1, v10, v11}, Lxhss/ᛱᲁᛴᲈ;->ᛳᲁᲇᛸ(J)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v5, v5, -0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move v0, v9

    .line 94
    :goto_2
    iget-object p0, p0, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 95
    .line 96
    check-cast p0, Lxhss/ᲁᛶᛷ;

    .line 97
    .line 98
    if-eqz p0, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lxhss/ᲁᛶᛷ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    move p0, v9

    .line 106
    :goto_3
    invoke-virtual {p1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v3, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v2, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v8, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v9, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    invoke-virtual {p1, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 129
    .line 130
    .line 131
    :goto_4
    return v9

    .line 132
    :pswitch_0
    iget-object v0, p0, Lxhss/ᛶᲈᛷᲁ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 133
    .line 134
    if-eqz v0, :cond_8

    .line 135
    .line 136
    new-instance v10, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-static {v0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    if-eqz v11, :cond_6

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    check-cast v11, Lxhss/ᲇᛸᛳᛸ;

    .line 160
    .line 161
    iget v12, v11, Lxhss/ᲁᛵᛷᛷ;->ᛷᛵᛵᲈ:I

    .line 162
    .line 163
    if-ltz v12, :cond_5

    .line 164
    .line 165
    iget v11, v11, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ:I

    .line 166
    .line 167
    invoke-static {v11, v12}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 168
    .line 169
    .line 170
    move-result-wide v11

    .line 171
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    invoke-static {v7}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_9

    .line 183
    :cond_6
    invoke-static {v10}, Lxhss/ᛷᲇᛵᛳ;->ᛴᛷᛵᛴ(Ljava/util/ArrayList;)[J

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    array-length v7, v0

    .line 188
    invoke-virtual {p1, v5, v7, v5}, Lxhss/ᛱᲁᛴᲈ;->ᲇᛸᛳᲁ(III)V

    .line 189
    .line 190
    .line 191
    array-length v5, v0

    .line 192
    sub-int/2addr v5, v8

    .line 193
    :goto_6
    if-ge v6, v5, :cond_7

    .line 194
    .line 195
    aget-wide v10, v0, v5

    .line 196
    .line 197
    invoke-virtual {p1, v10, v11}, Lxhss/ᛱᲁᛴᲈ;->ᛳᲁᲇᛸ(J)V

    .line 198
    .line 199
    .line 200
    add-int/lit8 v5, v5, -0x1

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_7
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛲᲀᛵ()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    goto :goto_7

    .line 208
    :cond_8
    move v0, v9

    .line 209
    :goto_7
    iget-object p0, p0, Lxhss/ᛶᲈᛷᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛵᛱ;

    .line 210
    .line 211
    check-cast p0, Lxhss/ᛴᲁᛶᲁ;

    .line 212
    .line 213
    if-eqz p0, :cond_9

    .line 214
    .line 215
    invoke-virtual {p0, p1}, Lxhss/ᛴᲁᛶᲁ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    goto :goto_8

    .line 220
    :cond_9
    move p0, v9

    .line 221
    :goto_8
    invoke-virtual {p1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v3, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v2, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v8, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v9, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    invoke-virtual {p1, v9}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 244
    .line 245
    .line 246
    :goto_9
    return v9

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
