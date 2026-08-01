.class public final Lxhss/ᲁᛴᛶᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

.field public final ᛳᲁᲇᛸ:I

.field public ᛳᲈᲈᛲ:Lxhss/ᛱᛷᲁᛶ;

.field public final ᛶᲇᲈᛸ:Lxhss/ᛸᲀᛷᛷ;

.field public final ᛷᛴᛷᛱ:I

.field public final ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

.field public final ᛷᲁᲁ:Z

.field public final ᛸᛲᲀᛵ:Lxhss/ᛵᲈᛱᛳ;

.field public final ᛸᛴᛶᛳ:Z

.field public ᛸᛶᲈᛶ:Lxhss/ᛱᲇᛴᲇ;

.field public final ᛸᛷᲈᲈ:Lxhss/ᲇᛵᛲᲁ;

.field public final ᲀᲇᛳᲁ:Z

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:I

.field public ᲇᛸᛳᲁ:Lxhss/ᲁᲇᛴᛳ;

.field public final ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᛸᛱᛴᛳ;Lxhss/ᲈᛲᲀᛵ;IIIIZZLxhss/ᛵᲈᛱᛳ;Lxhss/ᲇᛵᛲᲁ;Lxhss/ᛸᲇᲇᛶ;Lxhss/ᛴᛴᛴᛵ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxhss/ᲁᛴᛶᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 3
    iput-object p2, p0, Lxhss/ᲁᛴᛶᛸ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

    .line 4
    iput p3, p0, Lxhss/ᲁᛴᛶᛸ;->ᛳᲁᲇᛸ:I

    .line 5
    iput p4, p0, Lxhss/ᲁᛴᛶᛸ;->ᲇᛴᲇᛵ:I

    .line 6
    iput p5, p0, Lxhss/ᲁᛴᛶᛸ;->ᛷᛴᛷᛱ:I

    .line 7
    iput p6, p0, Lxhss/ᲁᛴᛶᛸ;->ᲇᛶᛴᲀ:I

    .line 8
    iput-boolean p7, p0, Lxhss/ᲁᛴᛶᛸ;->ᲀᲇᛳᲁ:Z

    .line 9
    iput-boolean p8, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛴᛶᛳ:Z

    .line 10
    iput-object p9, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 11
    iput-object p10, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛷᲈᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 12
    iput-object p11, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 13
    iget-object p1, p12, Lxhss/ᛴᛴᛴᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 14
    const-string p2, "GET"

    invoke-static {p1, p2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lxhss/ᲁᛴᛶᛸ;->ᛷᲁᲁ:Z

    .line 15
    new-instance p1, Lxhss/ᛸᲀᛷᛷ;

    invoke-direct {p1}, Lxhss/ᛸᲀᛷᛷ;-><init>()V

    iput-object p1, p0, Lxhss/ᲁᛴᛶᛸ;->ᛶᲇᲈᛸ:Lxhss/ᛸᲀᛷᛷ;

    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Lxhss/ᛱᛸᲁᛶ;
    .locals 13

    .line 1
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    :goto_0
    move-object v3, v1

    .line 10
    goto :goto_4

    .line 11
    :cond_0
    iget-boolean v3, p0, Lxhss/ᲁᛴᛶᛸ;->ᛷᲁᲁ:Z

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Lxhss/ᲈᲁᛲᲇ;->ᲀᲇᛳᲁ(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    monitor-enter v0

    .line 18
    iget-boolean v4, v0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :try_start_0
    iput-boolean v2, v0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 23
    .line 24
    iget-object v3, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 25
    .line 26
    invoke-virtual {v3}, Lxhss/ᛸᲇᲇᛶ;->ᛸᛴᛶᛳ()Ljava/net/Socket;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    goto :goto_3

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto/16 :goto_12

    .line 33
    .line 34
    :cond_1
    if-nez v4, :cond_4

    .line 35
    .line 36
    iget-object v3, v0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 37
    .line 38
    iget-object v3, v3, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 39
    .line 40
    iget-object v3, v3, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 41
    .line 42
    iget-object v4, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 43
    .line 44
    iget-object v4, v4, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 45
    .line 46
    iget v5, v3, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 47
    .line 48
    iget v6, v4, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 49
    .line 50
    if-ne v5, v6, :cond_2

    .line 51
    .line 52
    iget-object v3, v3, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, v4, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v3, v4}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    move v3, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const/4 v3, 0x0

    .line 65
    :goto_1
    if-nez v3, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move-object v3, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    :goto_2
    iget-object v3, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 71
    .line 72
    invoke-virtual {v3}, Lxhss/ᛸᲇᲇᛶ;->ᛸᛴᛶᛳ()Ljava/net/Socket;

    .line 73
    .line 74
    .line 75
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :goto_3
    monitor-exit v0

    .line 77
    iget-object v4, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 78
    .line 79
    iget-object v4, v4, Lxhss/ᛸᲇᲇᛶ;->ᛸᛷᲈᲈ:Lxhss/ᲈᲁᛲᲇ;

    .line 80
    .line 81
    if-eqz v4, :cond_6

    .line 82
    .line 83
    if-nez v3, :cond_5

    .line 84
    .line 85
    new-instance v3, Lxhss/ᛴᛸᲇᛵ;

    .line 86
    .line 87
    invoke-direct {v3, v0}, Lxhss/ᛴᛸᲇᛵ;-><init>(Lxhss/ᲈᲁᛲᲇ;)V

    .line 88
    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    const-string p0, "Check failed."

    .line 92
    .line 93
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_6
    if-eqz v3, :cond_7

    .line 98
    .line 99
    invoke-static {v3}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 100
    .line 101
    .line 102
    :cond_7
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 103
    .line 104
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :goto_4
    if-eqz v3, :cond_8

    .line 111
    .line 112
    return-object v3

    .line 113
    :cond_8
    invoke-virtual {p0, v1, v1}, Lxhss/ᲁᛴᛶᛸ;->ᲇᛴᲇᛵ(Lxhss/ᛳᛵᲈ;Ljava/util/List;)Lxhss/ᛴᛸᲇᛵ;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_9

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_9
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛶᲇᲈᛸ:Lxhss/ᛸᲀᛷᛷ;

    .line 121
    .line 122
    invoke-virtual {v0}, Lxhss/ᛸᲀᛷᛷ;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_a

    .line 127
    .line 128
    iget-object p0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛶᲇᲈᛸ:Lxhss/ᛸᲀᛷᛷ;

    .line 129
    .line 130
    invoke-virtual {p0}, Lxhss/ᛸᲀᛷᛷ;->removeFirst()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Lxhss/ᛱᛸᲁᛶ;

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_a
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛳᲈᲈᛲ:Lxhss/ᛱᛷᲁᛶ;

    .line 138
    .line 139
    if-eqz v0, :cond_b

    .line 140
    .line 141
    iput-object v1, p0, Lxhss/ᲁᛴᛶᛸ;->ᛳᲈᲈᛲ:Lxhss/ᛱᛷᲁᛶ;

    .line 142
    .line 143
    invoke-virtual {p0, v0, v1}, Lxhss/ᲁᛴᛶᛸ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛷᲁᛶ;Ljava/util/ArrayList;)Lxhss/ᛳᛵᲈ;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto/16 :goto_11

    .line 148
    .line 149
    :cond_b
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛱᲇᛴᲇ;

    .line 150
    .line 151
    if-eqz v0, :cond_d

    .line 152
    .line 153
    iget v3, v0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 154
    .line 155
    iget-object v4, v0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-ge v3, v4, :cond_d

    .line 164
    .line 165
    iget v2, v0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 166
    .line 167
    iget-object v3, v0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v3, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-ge v2, v4, :cond_c

    .line 176
    .line 177
    iget v2, v0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 178
    .line 179
    add-int/lit8 v4, v2, 0x1

    .line 180
    .line 181
    iput v4, v0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 182
    .line 183
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, Lxhss/ᛱᛷᲁᛶ;

    .line 188
    .line 189
    invoke-virtual {p0, v0, v1}, Lxhss/ᲁᛴᛶᛸ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛷᲁᛶ;Ljava/util/ArrayList;)Lxhss/ᛳᛵᲈ;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    goto/16 :goto_11

    .line 194
    .line 195
    :cond_c
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 196
    .line 197
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 198
    .line 199
    .line 200
    throw p0

    .line 201
    :cond_d
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᲇᛸᛳᲁ:Lxhss/ᲁᲇᛴᛳ;

    .line 202
    .line 203
    if-nez v0, :cond_e

    .line 204
    .line 205
    new-instance v0, Lxhss/ᲁᲇᛴᛳ;

    .line 206
    .line 207
    iget-object v3, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 208
    .line 209
    iget-object v4, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛷᲈᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 210
    .line 211
    iget-object v5, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 212
    .line 213
    iget-boolean v6, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛴᛶᛳ:Z

    .line 214
    .line 215
    invoke-direct {v0, v3, v4, v5, v6}, Lxhss/ᲁᲇᛴᛳ;-><init>(Lxhss/ᛵᲈᛱᛳ;Lxhss/ᲇᛵᛲᲁ;Lxhss/ᛸᲇᲇᛶ;Z)V

    .line 216
    .line 217
    .line 218
    iput-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᲇᛸᛳᲁ:Lxhss/ᲁᲇᛴᛳ;

    .line 219
    .line 220
    :cond_e
    invoke-virtual {v0}, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ()Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_2c

    .line 225
    .line 226
    invoke-virtual {v0}, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ()Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eqz v3, :cond_2b

    .line 231
    .line 232
    new-instance v3, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .line 236
    .line 237
    :cond_f
    iget v4, v0, Lxhss/ᲁᲇᛴᛳ;->ᲇᛶᛴᲀ:I

    .line 238
    .line 239
    iget-object v5, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 240
    .line 241
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    if-ge v4, v5, :cond_26

    .line 246
    .line 247
    const-string v4, "No route to "

    .line 248
    .line 249
    iget v5, v0, Lxhss/ᲁᲇᛴᛳ;->ᲇᛶᛴᲀ:I

    .line 250
    .line 251
    iget-object v6, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-ge v5, v6, :cond_25

    .line 258
    .line 259
    iget-object v5, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 260
    .line 261
    iget v6, v0, Lxhss/ᲁᲇᛴᛳ;->ᲇᛶᛴᲀ:I

    .line 262
    .line 263
    add-int/lit8 v7, v6, 0x1

    .line 264
    .line 265
    iput v7, v0, Lxhss/ᲁᲇᛴᛳ;->ᲇᛶᛴᲀ:I

    .line 266
    .line 267
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    check-cast v5, Ljava/net/Proxy;

    .line 272
    .line 273
    new-instance v6, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 276
    .line 277
    .line 278
    iput-object v6, v0, Lxhss/ᲁᲇᛴᛳ;->ᲀᲇᛳᲁ:Ljava/util/List;

    .line 279
    .line 280
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    sget-object v8, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 285
    .line 286
    if-eq v7, v8, :cond_13

    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    sget-object v8, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 293
    .line 294
    if-ne v7, v8, :cond_10

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_10
    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    instance-of v8, v7, Ljava/net/InetSocketAddress;

    .line 302
    .line 303
    if-eqz v8, :cond_12

    .line 304
    .line 305
    check-cast v7, Ljava/net/InetSocketAddress;

    .line 306
    .line 307
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    if-nez v8, :cond_11

    .line 312
    .line 313
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    goto :goto_5

    .line 318
    :cond_11
    invoke-virtual {v8}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    :goto_5
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getPort()I

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    goto :goto_7

    .line 327
    :cond_12
    const-string p0, "Proxy.address() is not an InetSocketAddress: "

    .line 328
    .line 329
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v1, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 346
    .line 347
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :cond_13
    :goto_6
    iget-object v7, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 356
    .line 357
    iget-object v7, v7, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 358
    .line 359
    iget-object v8, v7, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 360
    .line 361
    iget v7, v7, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 362
    .line 363
    :goto_7
    if-gt v2, v7, :cond_24

    .line 364
    .line 365
    const/high16 v9, 0x10000

    .line 366
    .line 367
    if-ge v7, v9, :cond_24

    .line 368
    .line 369
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    sget-object v9, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 374
    .line 375
    if-ne v4, v9, :cond_14

    .line 376
    .line 377
    invoke-static {v8, v7}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto/16 :goto_e

    .line 385
    .line 386
    :cond_14
    sget-object v4, Lxhss/ᲀᲀᛶᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛳᛴᲁ;

    .line 387
    .line 388
    iget-object v4, v4, Lxhss/ᛲᛳᛴᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v4, Ljava/util/regex/Pattern;

    .line 391
    .line 392
    invoke-virtual {v4, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    if-eqz v4, :cond_15

    .line 401
    .line 402
    invoke-static {v8}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    goto :goto_8

    .line 411
    :cond_15
    iget-object v4, v0, Lxhss/ᲁᲇᛴᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛸᲇᲇᛶ;

    .line 412
    .line 413
    iget-object v4, v4, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 414
    .line 415
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    iget-object v4, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 419
    .line 420
    iget-object v4, v4, Lxhss/ᛵᲈᛱᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 421
    .line 422
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    :try_start_1
    invoke-static {v8}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-static {v4}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 433
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 434
    .line 435
    .line 436
    move-result v9

    .line 437
    if-nez v9, :cond_23

    .line 438
    .line 439
    iget-object v8, v0, Lxhss/ᲁᲇᛴᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛸᲇᲇᛶ;

    .line 440
    .line 441
    iget-object v8, v8, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 442
    .line 443
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    :goto_8
    iget-boolean v8, v0, Lxhss/ᲁᲇᛴᛳ;->ᲇᛴᲇᛵ:Z

    .line 447
    .line 448
    if-eqz v8, :cond_1f

    .line 449
    .line 450
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    const/4 v9, 0x2

    .line 455
    if-ge v8, v9, :cond_16

    .line 456
    .line 457
    goto/16 :goto_c

    .line 458
    .line 459
    :cond_16
    new-instance v8, Ljava/util/ArrayList;

    .line 460
    .line 461
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 462
    .line 463
    .line 464
    new-instance v9, Ljava/util/ArrayList;

    .line 465
    .line 466
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object v10

    .line 473
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v11

    .line 477
    if-eqz v11, :cond_18

    .line 478
    .line 479
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v11

    .line 483
    move-object v12, v11

    .line 484
    check-cast v12, Ljava/net/InetAddress;

    .line 485
    .line 486
    instance-of v12, v12, Ljava/net/Inet6Address;

    .line 487
    .line 488
    if-eqz v12, :cond_17

    .line 489
    .line 490
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_17
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    goto :goto_9

    .line 498
    :cond_18
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 499
    .line 500
    .line 501
    move-result v10

    .line 502
    if-nez v10, :cond_1f

    .line 503
    .line 504
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    if-eqz v10, :cond_19

    .line 509
    .line 510
    goto :goto_c

    .line 511
    :cond_19
    sget-object v4, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 512
    .line 513
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 518
    .line 519
    .line 520
    move-result-object v9

    .line 521
    new-instance v10, Lxhss/ᲈᛶᲀᲈ;

    .line 522
    .line 523
    const/16 v4, 0xa

    .line 524
    .line 525
    invoke-direct {v10, v4}, Lxhss/ᲈᛶᲀᲈ;-><init>(I)V

    .line 526
    .line 527
    .line 528
    :cond_1a
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    if-nez v4, :cond_1d

    .line 533
    .line 534
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    if-eqz v4, :cond_1b

    .line 539
    .line 540
    goto :goto_b

    .line 541
    :cond_1b
    invoke-virtual {v10}, Lxhss/ᲈᛶᲀᲈ;->ᲇᛶᛴᲀ()V

    .line 542
    .line 543
    .line 544
    iput-boolean v2, v10, Lxhss/ᲈᛶᲀᲈ;->ᲇᛴᲇᛵ:Z

    .line 545
    .line 546
    iget v4, v10, Lxhss/ᲈᛶᲀᲈ;->ᛳᲁᲇᛸ:I

    .line 547
    .line 548
    if-lez v4, :cond_1c

    .line 549
    .line 550
    move-object v4, v10

    .line 551
    goto :goto_c

    .line 552
    :cond_1c
    sget-object v4, Lxhss/ᲈᛶᲀᲈ;->ᛷᛴᛷᛱ:Lxhss/ᲈᛶᲀᲈ;

    .line 553
    .line 554
    goto :goto_c

    .line 555
    :cond_1d
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 556
    .line 557
    .line 558
    move-result v4

    .line 559
    if-eqz v4, :cond_1e

    .line 560
    .line 561
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-virtual {v10, v4}, Lxhss/ᲈᛶᲀᲈ;->add(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    :cond_1e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    if-eqz v4, :cond_1a

    .line 573
    .line 574
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    invoke-virtual {v10, v4}, Lxhss/ᲈᛶᲀᲈ;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    goto :goto_a

    .line 582
    :cond_1f
    :goto_c
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    if-eqz v8, :cond_20

    .line 591
    .line 592
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v8

    .line 596
    check-cast v8, Ljava/net/InetAddress;

    .line 597
    .line 598
    new-instance v9, Ljava/net/InetSocketAddress;

    .line 599
    .line 600
    invoke-direct {v9, v8, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    goto :goto_d

    .line 607
    :cond_20
    :goto_e
    iget-object v4, v0, Lxhss/ᲁᲇᛴᛳ;->ᲀᲇᛳᲁ:Ljava/util/List;

    .line 608
    .line 609
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v6

    .line 617
    if-eqz v6, :cond_22

    .line 618
    .line 619
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v6

    .line 623
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 624
    .line 625
    new-instance v7, Lxhss/ᛱᛷᲁᛶ;

    .line 626
    .line 627
    iget-object v8, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 628
    .line 629
    invoke-direct {v7, v8, v5, v6}, Lxhss/ᛱᛷᲁᛶ;-><init>(Lxhss/ᛵᲈᛱᛳ;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 630
    .line 631
    .line 632
    iget-object v6, v0, Lxhss/ᲁᲇᛴᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛵᛲᲁ;

    .line 633
    .line 634
    monitor-enter v6

    .line 635
    :try_start_2
    iget-object v8, v6, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v8, Ljava/util/LinkedHashSet;

    .line 638
    .line 639
    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 643
    monitor-exit v6

    .line 644
    if-eqz v8, :cond_21

    .line 645
    .line 646
    iget-object v6, v0, Lxhss/ᲁᲇᛴᛳ;->ᛸᛴᛶᛳ:Ljava/util/ArrayList;

    .line 647
    .line 648
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    goto :goto_f

    .line 652
    :cond_21
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    goto :goto_f

    .line 656
    :catchall_1
    move-exception p0

    .line 657
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 658
    throw p0

    .line 659
    :cond_22
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    if-nez v4, :cond_f

    .line 664
    .line 665
    goto :goto_10

    .line 666
    :cond_23
    new-instance p0, Ljava/net/UnknownHostException;

    .line 667
    .line 668
    iget-object v0, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 669
    .line 670
    iget-object v0, v0, Lxhss/ᛵᲈᛱᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 671
    .line 672
    new-instance v1, Ljava/lang/StringBuilder;

    .line 673
    .line 674
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    const-string v0, " returned no addresses for "

    .line 681
    .line 682
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-direct {p0, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    throw p0

    .line 696
    :catch_0
    move-exception p0

    .line 697
    new-instance v0, Ljava/net/UnknownHostException;

    .line 698
    .line 699
    const-string v1, "Broken system behaviour for dns lookup of "

    .line 700
    .line 701
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 709
    .line 710
    .line 711
    throw v0

    .line 712
    :cond_24
    new-instance p0, Ljava/net/SocketException;

    .line 713
    .line 714
    new-instance v0, Ljava/lang/StringBuilder;

    .line 715
    .line 716
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    const/16 v1, 0x3a

    .line 723
    .line 724
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    const-string v1, "; port is out of range"

    .line 731
    .line 732
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-direct {p0, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    throw p0

    .line 743
    :cond_25
    new-instance p0, Ljava/net/SocketException;

    .line 744
    .line 745
    iget-object v1, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 746
    .line 747
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 748
    .line 749
    iget-object v1, v1, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 750
    .line 751
    const-string v2, "; exhausted proxy configurations: "

    .line 752
    .line 753
    iget-object v0, v0, Lxhss/ᲁᲇᛴᛳ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 754
    .line 755
    new-instance v3, Ljava/lang/StringBuilder;

    .line 756
    .line 757
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-direct {p0, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    throw p0

    .line 777
    :cond_26
    :goto_10
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    if-eqz v2, :cond_27

    .line 782
    .line 783
    iget-object v2, v0, Lxhss/ᲁᲇᛴᛳ;->ᛸᛴᛶᛳ:Ljava/util/ArrayList;

    .line 784
    .line 785
    invoke-static {v3, v2}, Lxhss/ᛷᛴᛴ;->ᛵᛲᲁᛶ(Ljava/util/ArrayList;Ljava/lang/Iterable;)V

    .line 786
    .line 787
    .line 788
    iget-object v0, v0, Lxhss/ᲁᲇᛴᛳ;->ᛸᛴᛶᛳ:Ljava/util/ArrayList;

    .line 789
    .line 790
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 791
    .line 792
    .line 793
    :cond_27
    new-instance v0, Lxhss/ᛱᲇᛴᲇ;

    .line 794
    .line 795
    const/4 v2, 0x6

    .line 796
    invoke-direct {v0, v2, v3}, Lxhss/ᛱᲇᛴᲇ;-><init>(ILjava/util/ArrayList;)V

    .line 797
    .line 798
    .line 799
    iput-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛱᲇᛴᲇ;

    .line 800
    .line 801
    iget-object v2, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 802
    .line 803
    iget-boolean v2, v2, Lxhss/ᛸᲇᲇᛶ;->ᛸᛲᛷᛱ:Z

    .line 804
    .line 805
    if-nez v2, :cond_2a

    .line 806
    .line 807
    iget v1, v0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 808
    .line 809
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    if-ge v1, v2, :cond_29

    .line 814
    .line 815
    iget v1, v0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 816
    .line 817
    add-int/lit8 v2, v1, 0x1

    .line 818
    .line 819
    iput v2, v0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 820
    .line 821
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    check-cast v0, Lxhss/ᛱᛷᲁᛶ;

    .line 826
    .line 827
    invoke-virtual {p0, v0, v3}, Lxhss/ᲁᛴᛶᛸ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛷᲁᛶ;Ljava/util/ArrayList;)Lxhss/ᛳᛵᲈ;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    :goto_11
    iget-object v1, v0, Lxhss/ᛳᛵᲈ;->ᲈᛳᲀ:Ljava/util/List;

    .line 832
    .line 833
    invoke-virtual {p0, v0, v1}, Lxhss/ᲁᛴᛶᛸ;->ᲇᛴᲇᛵ(Lxhss/ᛳᛵᲈ;Ljava/util/List;)Lxhss/ᛴᛸᲇᛵ;

    .line 834
    .line 835
    .line 836
    move-result-object p0

    .line 837
    if-eqz p0, :cond_28

    .line 838
    .line 839
    return-object p0

    .line 840
    :cond_28
    return-object v0

    .line 841
    :cond_29
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 842
    .line 843
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 844
    .line 845
    .line 846
    throw p0

    .line 847
    :cond_2a
    const-string p0, "Canceled"

    .line 848
    .line 849
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    return-object v1

    .line 853
    :cond_2b
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 854
    .line 855
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 856
    .line 857
    .line 858
    throw p0

    .line 859
    :cond_2c
    const-string p0, "exhausted all routes"

    .line 860
    .line 861
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    return-object v1

    .line 865
    :goto_12
    monitor-exit v0

    .line 866
    throw p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛱᛷᲁᛶ;Ljava/util/ArrayList;)Lxhss/ᛳᛵᲈ;
    .locals 15

    .line 1
    move-object/from16 v10, p1

    .line 2
    .line 3
    sget-object v0, Lxhss/ᲈᛲᛵᛴ;->ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

    .line 4
    .line 5
    iget-object v1, v10, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 6
    .line 7
    iget-object v2, v1, Lxhss/ᛵᲈᛱᛳ;->ᛳᲁᲇᛸ:Ljavax/net/ssl/SSLSocketFactory;

    .line 8
    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛷᲈᲈ:Ljava/util/List;

    .line 12
    .line 13
    sget-object v2, Lxhss/ᛶᛴᛴᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛴᛴᛳ;

    .line 14
    .line 15
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, v10, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 22
    .line 23
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 24
    .line 25
    iget-object v1, v1, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 26
    .line 27
    sget-object v2, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 28
    .line 29
    sget-object v2, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2, v1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p0, Ljava/net/UnknownServiceException;

    .line 46
    .line 47
    const-string v0, "CLEARTEXT communication to "

    .line 48
    .line 49
    const-string v2, " not permitted by network security policy"

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p0, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_1
    new-instance p0, Ljava/net/UnknownServiceException;

    .line 60
    .line 61
    const-string v0, "CLEARTEXT communication not enabled for client"

    .line 62
    .line 63
    invoke-direct {p0, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_2
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛲᲀᛵ:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_6

    .line 74
    .line 75
    :goto_0
    iget-object v1, v10, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 82
    .line 83
    if-eq v1, v2, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    iget-object v1, v10, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 87
    .line 88
    iget-object v2, v1, Lxhss/ᛵᲈᛱᛳ;->ᛳᲁᲇᛸ:Ljavax/net/ssl/SSLSocketFactory;

    .line 89
    .line 90
    if-nez v2, :cond_5

    .line 91
    .line 92
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛲᲀᛵ:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 102
    move-object v12, v0

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    :goto_2
    new-instance v0, Lxhss/ᲇᛸᛶ;

    .line 105
    .line 106
    const/4 v1, 0x5

    .line 107
    invoke-direct {v0, v1}, Lxhss/ᲇᛸᛶ;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iget-object v1, v10, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 111
    .line 112
    iget-object v1, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 113
    .line 114
    iput-object v1, v0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 115
    .line 116
    const-string v1, "CONNECT"

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v10, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 122
    .line 123
    iget-object v2, v1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 124
    .line 125
    const/4 v3, 0x1

    .line 126
    invoke-static {v2, v3}, Lxhss/ᛶᛴᲀᛲ;->ᛸᛴᛶᛳ(Lxhss/ᛷᛶᲁᛵ;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    iget-object v4, v0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v4, Lxhss/ᛴᲈᛱᲁ;

    .line 133
    .line 134
    const-string v5, "Host"

    .line 135
    .line 136
    invoke-virtual {v4, v5, v2}, Lxhss/ᛴᲈᛱᲁ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, v0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Lxhss/ᛴᲈᛱᲁ;

    .line 142
    .line 143
    const-string v4, "Proxy-Connection"

    .line 144
    .line 145
    const-string v5, "Keep-Alive"

    .line 146
    .line 147
    invoke-virtual {v2, v4, v5}, Lxhss/ᛴᲈᛱᲁ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v2, v0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v2, Lxhss/ᛴᲈᛱᲁ;

    .line 153
    .line 154
    const-string v4, "User-Agent"

    .line 155
    .line 156
    const-string v5, "okhttp/5.4.0"

    .line 157
    .line 158
    invoke-virtual {v2, v4, v5}, Lxhss/ᛴᲈᛱᲁ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v2, Lxhss/ᛴᛴᛴᛵ;

    .line 162
    .line 163
    invoke-direct {v2, v0}, Lxhss/ᛴᛴᛴᛵ;-><init>(Lxhss/ᲇᛸᛶ;)V

    .line 164
    .line 165
    .line 166
    sget-object v0, Lxhss/ᲇᛷᛱᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛳᲀ;

    .line 167
    .line 168
    new-instance v0, Lxhss/ᛴᲈᛱᲁ;

    .line 169
    .line 170
    invoke-direct {v0, v3}, Lxhss/ᛴᲈᛱᲁ;-><init>(I)V

    .line 171
    .line 172
    .line 173
    const-string v3, "Proxy-Authenticate"

    .line 174
    .line 175
    const-string v4, "OkHttp-Preemptive"

    .line 176
    .line 177
    invoke-virtual {v0, v3, v4}, Lxhss/ᛴᲈᛱᲁ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v0}, Lxhss/ᛷᛸᲀᲀ;->ᲈᛳᲀ(Lxhss/ᛴᲈᛱᲁ;)Lxhss/ᲁᛸᛱᛵ;

    .line 181
    .line 182
    .line 183
    iget-object v0, v1, Lxhss/ᛵᲈᛱᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛴᲀᲁ;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-object v12, v2

    .line 189
    :goto_3
    new-instance v0, Lxhss/ᛳᛵᲈ;

    .line 190
    .line 191
    iget-object v1, p0, Lxhss/ᲁᛴᛶᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛴᛳ;

    .line 192
    .line 193
    iget-object v2, p0, Lxhss/ᲁᛴᛶᛸ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

    .line 194
    .line 195
    iget v3, p0, Lxhss/ᲁᛴᛶᛸ;->ᛳᲁᲇᛸ:I

    .line 196
    .line 197
    iget v4, p0, Lxhss/ᲁᛴᛶᛸ;->ᲇᛴᲇᛵ:I

    .line 198
    .line 199
    iget v5, p0, Lxhss/ᲁᛴᛶᛸ;->ᛷᛴᛷᛱ:I

    .line 200
    .line 201
    iget v6, p0, Lxhss/ᲁᛴᛶᛸ;->ᲇᛶᛴᲀ:I

    .line 202
    .line 203
    iget-boolean v7, p0, Lxhss/ᲁᛴᛶᛸ;->ᲀᲇᛳᲁ:Z

    .line 204
    .line 205
    iget-object v8, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 206
    .line 207
    const/4 v13, -0x1

    .line 208
    const/4 v14, 0x0

    .line 209
    move-object v9, p0

    .line 210
    move-object/from16 v11, p2

    .line 211
    .line 212
    invoke-direct/range {v0 .. v14}, Lxhss/ᛳᛵᲈ;-><init>(Lxhss/ᛸᛱᛴᛳ;Lxhss/ᲈᛲᲀᛵ;IIIIZLxhss/ᛸᲇᲇᛶ;Lxhss/ᲁᛴᛶᛸ;Lxhss/ᛱᛷᲁᛶ;Ljava/util/List;Lxhss/ᛴᛴᛴᛵ;IZ)V

    .line 213
    .line 214
    .line 215
    return-object v0

    .line 216
    :cond_6
    new-instance p0, Ljava/net/UnknownServiceException;

    .line 217
    .line 218
    const-string v0, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 219
    .line 220
    invoke-direct {p0, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᲁᛲᲇ;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛶᲇᲈᛸ:Lxhss/ᛸᲀᛷᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛸᲀᛷᛷ;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛳᲈᲈᛲ:Lxhss/ᛱᛷᲁᛶ;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    if-eqz p1, :cond_5

    .line 17
    .line 18
    monitor-enter p1

    .line 19
    :try_start_0
    iget v0, p1, Lxhss/ᲈᲁᛲᲇ;->ᛷᲁᲁ:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean v0, p1, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p1, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 31
    .line 32
    iget-object v0, v0, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 33
    .line 34
    iget-object v0, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 35
    .line 36
    iget-object v3, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 37
    .line 38
    iget-object v3, v3, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 39
    .line 40
    invoke-static {v0, v3}, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ(Lxhss/ᛷᛶᲁᛵ;Lxhss/ᛷᛶᲁᛵ;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v2, p1, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    :goto_0
    monitor-exit p1

    .line 50
    if-eqz v2, :cond_5

    .line 51
    .line 52
    iput-object v2, p0, Lxhss/ᲁᛴᛶᛸ;->ᛳᲈᲈᛲ:Lxhss/ᛱᛷᲁᛶ;

    .line 53
    .line 54
    return v1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit p1

    .line 57
    throw p0

    .line 58
    :cond_5
    iget-object p1, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛱᲇᛴᲇ;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget v0, p1, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 63
    .line 64
    iget-object p1, p1, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-ge v0, p1, :cond_6

    .line 73
    .line 74
    return v1

    .line 75
    :cond_6
    iget-object p0, p0, Lxhss/ᲁᛴᛶᛸ;->ᲇᛸᛳᲁ:Lxhss/ᲁᲇᛴᛳ;

    .line 76
    .line 77
    if-nez p0, :cond_7

    .line 78
    .line 79
    :goto_1
    return v1

    .line 80
    :cond_7
    invoke-virtual {p0}, Lxhss/ᲁᲇᛴᛳ;->ᛷᛵᛵᲈ()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0
.end method

.method public final ᲇᛴᲇᛵ(Lxhss/ᛳᛵᲈ;Ljava/util/List;)Lxhss/ᛴᛸᲇᛵ;
    .locals 10

    .line 1
    iget-object v0, p0, Lxhss/ᲁᛴᛶᛸ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᲀᛵ;

    .line 2
    .line 3
    iget-boolean v1, p0, Lxhss/ᲁᛴᛶᛸ;->ᛷᲁᲁ:Z

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲁᛴᛶᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛵᲈᛱᛳ;

    .line 6
    .line 7
    iget-object v3, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lxhss/ᛳᛵᲈ;->ᲇᛴᲇᛵ()Z

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    move v6, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v6, v4

    .line 22
    :goto_0
    iget-object v0, v0, Lxhss/ᲈᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    const/4 v8, 0x0

    .line 33
    if-eqz v7, :cond_6

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Lxhss/ᲈᲁᛲᲇ;

    .line 40
    .line 41
    monitor-enter v7

    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    :try_start_0
    iget-object v9, v7, Lxhss/ᲈᲁᛲᲇ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛲᛵ;

    .line 45
    .line 46
    if-eqz v9, :cond_2

    .line 47
    .line 48
    move v9, v5

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v9, v4

    .line 51
    :goto_2
    if-nez v9, :cond_3

    .line 52
    .line 53
    :goto_3
    move v9, v4

    .line 54
    goto :goto_4

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_5

    .line 57
    :cond_3
    invoke-virtual {v7, v2, p2}, Lxhss/ᲈᲁᛲᲇ;->ᲇᛴᲇᛵ(Lxhss/ᛵᲈᛱᛳ;Ljava/util/List;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-nez v9, :cond_4

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-virtual {v3, v7}, Lxhss/ᛸᲇᲇᛶ;->ᛷᛵᛵᲈ(Lxhss/ᲈᲁᛲᲇ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    move v9, v5

    .line 68
    :goto_4
    monitor-exit v7

    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    invoke-virtual {v7, v1}, Lxhss/ᲈᲁᛲᲇ;->ᲀᲇᛳᲁ(Z)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_5

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_5
    monitor-enter v7

    .line 79
    :try_start_1
    iput-boolean v5, v7, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 80
    .line 81
    invoke-virtual {v3}, Lxhss/ᛸᲇᲇᛶ;->ᛸᛴᛶᛳ()Ljava/net/Socket;

    .line 82
    .line 83
    .line 84
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    monitor-exit v7

    .line 86
    if-eqz v8, :cond_1

    .line 87
    .line 88
    invoke-static {v8}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_1
    move-exception p0

    .line 93
    monitor-exit v7

    .line 94
    throw p0

    .line 95
    :goto_5
    monitor-exit v7

    .line 96
    throw p0

    .line 97
    :cond_6
    move-object v7, v8

    .line 98
    :goto_6
    if-nez v7, :cond_7

    .line 99
    .line 100
    return-object v8

    .line 101
    :cond_7
    if-eqz p1, :cond_8

    .line 102
    .line 103
    iget-object p2, p1, Lxhss/ᛳᛵᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛱᛷᲁᛶ;

    .line 104
    .line 105
    iput-object p2, p0, Lxhss/ᲁᛴᛶᛸ;->ᛳᲈᲈᛲ:Lxhss/ᛱᛷᲁᛶ;

    .line 106
    .line 107
    iget-object p1, p1, Lxhss/ᛳᛵᲈ;->ᛸᛶᛴᲈ:Ljava/net/Socket;

    .line 108
    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    invoke-static {p1}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

    .line 112
    .line 113
    .line 114
    :cond_8
    iget-object p0, p0, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 115
    .line 116
    iget-object p0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance p0, Lxhss/ᛴᛸᲇᛵ;

    .line 122
    .line 123
    invoke-direct {p0, v7}, Lxhss/ᛴᛸᲇᛵ;-><init>(Lxhss/ᲈᲁᛲᲇ;)V

    .line 124
    .line 125
    .line 126
    return-object p0
.end method
