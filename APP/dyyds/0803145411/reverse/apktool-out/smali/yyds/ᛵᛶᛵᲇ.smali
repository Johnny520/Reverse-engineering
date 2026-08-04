.class public final Lyyds/ᛵᛶᛵᲇ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/String;

.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛵᛶᛵᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᛶᛵᲇ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛵᛶᛵᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛵᛶᛵᲇ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛶᲈ()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object v0, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

    .line 30
    .line 31
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x1

    .line 36
    const/4 v2, 0x0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const v3, 0x2932e0

    .line 44
    .line 45
    .line 46
    if-le v0, v3, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    const/4 v0, 0x2

    .line 50
    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    array-length v3, v0

    .line 55
    if-gt v1, v3, :cond_1

    .line 56
    .line 57
    const v4, 0x1e8481

    .line 58
    .line 59
    .line 60
    if-ge v3, v4, :cond_1

    .line 61
    .line 62
    invoke-static {v0}, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ([B)Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const-wide v3, -0x1ff4ee68a836eL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :goto_0
    new-instance v3, Lyyds/ᲈᛵᛵᛴ;

    .line 89
    .line 90
    invoke-direct {v3, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object v0, v3

    .line 94
    :goto_1
    instance-of v3, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    move-object v0, v2

    .line 99
    :cond_2
    check-cast v0, Landroid/graphics/Bitmap;

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    :goto_2
    move-object v0, v2

    .line 103
    :goto_3
    sget-object v3, Lyyds/ᛵᛴᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 104
    .line 105
    iget-object p0, p0, Lyyds/ᛵᛶᛵᲇ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 106
    .line 107
    monitor-enter v3

    .line 108
    :try_start_1
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛲᛱᲁᛳ:Lyyds/ᛳᲀᛲ;

    .line 114
    .line 115
    sget-object v5, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 116
    .line 117
    const/16 v6, 0x22

    .line 118
    .line 119
    aget-object v5, v5, v6

    .line 120
    .line 121
    invoke-virtual {v4, v5}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v4, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_5

    .line 132
    .line 133
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛶᲈ()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-static {v4, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_5

    .line 142
    .line 143
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-nez p1, :cond_4

    .line 148
    .line 149
    if-nez v0, :cond_4

    .line 150
    .line 151
    const-wide v4, -0x26b45e68a836eL

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1}, Lyyds/ᛷᛳᛲᛳ;->ᛵᲁᛴᛴ(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    sget-object p1, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

    .line 164
    .line 165
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    const-wide v4, -0x1ffd8e68a836eL

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    invoke-static {p1}, Lyyds/ᛷᛳᛲᛳ;->ᛷᛴᛶᛳ(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    new-instance v0, Lyyds/ᛸᛷᛴᛴ;

    .line 185
    .line 186
    invoke-direct {v0, v2, p1}, Lyyds/ᛸᛷᛴᛴ;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    sput-object v0, Lyyds/ᛵᛴᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛴᛴ;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :catchall_1
    move-exception p0

    .line 193
    goto :goto_5

    .line 194
    :cond_4
    new-instance p1, Lyyds/ᛸᛷᛴᛴ;

    .line 195
    .line 196
    invoke-direct {p1, v0, p0}, Lyyds/ᛸᛷᛴᛴ;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    sput-object p1, Lyyds/ᛵᛴᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛴᛴ;

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_5
    const/4 v1, 0x0

    .line 203
    :goto_4
    sget-object p1, Lyyds/ᛵᛴᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-eqz p0, :cond_6

    .line 210
    .line 211
    sput-object v2, Lyyds/ᛵᛴᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 212
    .line 213
    :cond_6
    monitor-exit v3

    .line 214
    if-eqz v1, :cond_7

    .line 215
    .line 216
    sget-object p0, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

    .line 217
    .line 218
    invoke-static {}, Lyyds/ᛵᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 219
    .line 220
    .line 221
    :cond_7
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 222
    .line 223
    return-object p0

    .line 224
    :goto_5
    monitor-exit v3

    .line 225
    throw p0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 1

    .line 1
    iget p1, p0, Lyyds/ᛵᛶᛵᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛵᛶᛵᲇ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lyyds/ᛵᛶᛵᲇ;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, Lyyds/ᛵᛶᛵᲇ;-><init>(Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lyyds/ᛵᛶᛵᲇ;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, Lyyds/ᛵᛶᛵᲇ;-><init>(Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛵᛶᛵᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛶᛵᲇ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛵᛶᛵᲇ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛵᛶᛵᲇ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛶᛵᲇ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lyyds/ᛵᛶᛵᲇ;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lyyds/ᛵᛶᛵᲇ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
