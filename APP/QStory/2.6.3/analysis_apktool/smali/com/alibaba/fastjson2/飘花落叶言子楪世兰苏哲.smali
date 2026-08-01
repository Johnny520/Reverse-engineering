.class public interface abstract Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世兰哲苏(I)Z
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0xf8

    .line 2
    .line 3
    const/16 v0, 0x40

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static 飘花落叶言子楪世兰苏哲(I)Z
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0xf8

    .line 2
    .line 3
    const/16 v0, 0xc0

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    new-array p0, v0, [B

    .line 6
    .line 7
    const/16 v0, -0x51

    .line 8
    .line 9
    aput-byte v0, p0, v1

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 13
    .line 14
    const/16 v3, 0x8

    .line 15
    .line 16
    const/16 v4, 0x2f

    .line 17
    .line 18
    if-ne v2, v3, :cond_4

    .line 19
    .line 20
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    array-length v3, v2

    .line 25
    if-gt v3, v4, :cond_5

    .line 26
    .line 27
    move v4, v1

    .line 28
    :goto_0
    if-ge v4, v3, :cond_2

    .line 29
    .line 30
    aget-char v5, v2, v4

    .line 31
    .line 32
    const/16 v6, 0x7f

    .line 33
    .line 34
    if-le v5, v6, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    array-length p0, v2

    .line 41
    add-int/2addr p0, v0

    .line 42
    new-array p0, p0, [B

    .line 43
    .line 44
    add-int/lit8 v0, v3, 0x49

    .line 45
    .line 46
    int-to-byte v0, v0

    .line 47
    aput-byte v0, p0, v1

    .line 48
    .line 49
    :goto_1
    if-ge v1, v3, :cond_3

    .line 50
    .line 51
    add-int/lit8 v0, v1, 0x1

    .line 52
    .line 53
    aget-char v1, v2, v1

    .line 54
    .line 55
    int-to-byte v1, v1

    .line 56
    aput-byte v1, p0, v0

    .line 57
    .line 58
    move v1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    return-object p0

    .line 61
    :cond_4
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 62
    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 66
    .line 67
    invoke-interface {v3, p0}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_5

    .line 72
    .line 73
    invoke-interface {v2, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, [B

    .line 78
    .line 79
    array-length v3, v2

    .line 80
    if-gt v3, v4, :cond_5

    .line 81
    .line 82
    array-length p0, v2

    .line 83
    add-int/2addr p0, v0

    .line 84
    new-array p0, p0, [B

    .line 85
    .line 86
    add-int/lit8 v3, v3, 0x49

    .line 87
    .line 88
    int-to-byte v3, v3

    .line 89
    aput-byte v3, p0, v1

    .line 90
    .line 91
    array-length v3, v2

    .line 92
    invoke-static {v2, v1, p0, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_5
    :goto_2
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;

    .line 97
    .line 98
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 99
    .line 100
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 101
    .line 102
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 106
    .line 107
    .line 108
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object p0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 112
    .line 113
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 114
    .line 115
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 116
    .line 117
    .line 118
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->close()V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :catchall_0
    move-exception p0

    .line 124
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception v0

    .line 129
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :goto_3
    throw p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(I)Z
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0xf0

    .line 2
    .line 3
    const/16 v0, 0x30

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0x48

    .line 2
    .line 3
    const-string v1, "INT32 "

    .line 4
    .line 5
    if-eq p0, v0, :cond_9

    .line 6
    .line 7
    const/16 v0, 0x7f

    .line 8
    .line 9
    if-eq p0, v0, :cond_8

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string v0, "INT64 "

    .line 15
    .line 16
    packed-switch p0, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    packed-switch p0, :pswitch_data_2

    .line 20
    .line 21
    .line 22
    const/16 v2, -0x6c

    .line 23
    .line 24
    if-lt p0, v2, :cond_0

    .line 25
    .line 26
    const/16 v2, -0x5c

    .line 27
    .line 28
    if-gt p0, v2, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "ARRAY "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    const/16 v2, 0x49

    .line 43
    .line 44
    if-lt p0, v2, :cond_1

    .line 45
    .line 46
    const/16 v2, 0x79

    .line 47
    .line 48
    if-gt p0, v2, :cond_1

    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "STR_ASCII "

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_1
    const/16 v2, -0x10

    .line 63
    .line 64
    if-lt p0, v2, :cond_2

    .line 65
    .line 66
    const/16 v2, 0x2f

    .line 67
    .line 68
    if-gt p0, v2, :cond_2

    .line 69
    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_2
    const/16 v2, 0x30

    .line 81
    .line 82
    if-lt p0, v2, :cond_3

    .line 83
    .line 84
    const/16 v2, 0x3f

    .line 85
    .line 86
    if-gt p0, v2, :cond_3

    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_3
    const/16 v2, 0x40

    .line 99
    .line 100
    if-lt p0, v2, :cond_4

    .line 101
    .line 102
    const/16 v2, 0x47

    .line 103
    .line 104
    if-gt p0, v2, :cond_4

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_4
    const/16 v1, -0x28

    .line 117
    .line 118
    if-lt p0, v1, :cond_5

    .line 119
    .line 120
    const/16 v1, -0x11

    .line 121
    .line 122
    if-gt p0, v1, :cond_5

    .line 123
    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_5
    const/16 v1, -0x38

    .line 135
    .line 136
    if-lt p0, v1, :cond_6

    .line 137
    .line 138
    const/16 v1, -0x29

    .line 139
    .line 140
    if-gt p0, v1, :cond_6

    .line 141
    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_6
    const/16 v1, -0x40

    .line 153
    .line 154
    if-lt p0, v1, :cond_7

    .line 155
    .line 156
    const/16 v1, -0x39

    .line 157
    .line 158
    if-gt p0, v1, :cond_7

    .line 159
    .line 160
    new-instance v1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :cond_7
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v1, "STR_UTF16BE "

    .line 178
    .line 179
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v1, "STR_UTF16LE "

    .line 190
    .line 191
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v1, "STR_UTF16 "

    .line 202
    .line 203
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0

    .line 211
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string v1, "STR_UTF8 "

    .line 214
    .line 215
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :pswitch_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v1, "INT8 "

    .line 236
    .line 237
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v1, "INT16 "

    .line 248
    .line 249
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v1, "BIGINT "

    .line 260
    .line 261
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    return-object p0

    .line 269
    :pswitch_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v1, "DECIMAL "

    .line 272
    .line 273
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v1, "FLOAT "

    .line 284
    .line 285
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    return-object p0

    .line 293
    :pswitch_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v1, "DOUBLE "

    .line 296
    .line 297
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    return-object p0

    .line 305
    :pswitch_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v1, "TRUE "

    .line 308
    .line 309
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :pswitch_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-string v1, "FALSE "

    .line 320
    .line 321
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v1, "NULL "

    .line 332
    .line 333
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    return-object p0

    .line 341
    :pswitch_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-string v1, "TIMESTAMP "

    .line 344
    .line 345
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    return-object p0

    .line 353
    :pswitch_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v1, "TIMESTAMP_MINUTES "

    .line 356
    .line 357
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    return-object p0

    .line 365
    :pswitch_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v1, "TIMESTAMP_SECONDS "

    .line 368
    .line 369
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :pswitch_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v1, "TIMESTAMP_MILLIS "

    .line 380
    .line 381
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    return-object p0

    .line 389
    :pswitch_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v1, "TIMESTAMP_WITH_TIMEZONE "

    .line 392
    .line 393
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    return-object p0

    .line 401
    :pswitch_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    const-string v1, "LOCAL_DATE "

    .line 404
    .line 405
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    return-object p0

    .line 413
    :pswitch_14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    const-string v1, "LOCAL_DATETIME "

    .line 416
    .line 417
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    return-object p0

    .line 425
    :pswitch_15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    const-string v1, "LOCAL_TIME "

    .line 428
    .line 429
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    return-object p0

    .line 437
    :pswitch_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    const-string v1, "OBJECT "

    .line 440
    .line 441
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    return-object p0

    .line 449
    :pswitch_17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v1, "OBJECT_END "

    .line 452
    .line 453
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    return-object p0

    .line 461
    :pswitch_18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    const-string v1, "REFERENCE "

    .line 464
    .line 465
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    return-object p0

    .line 473
    :pswitch_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 474
    .line 475
    const-string v1, "TYPED_ANY "

    .line 476
    .line 477
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    return-object p0

    .line 485
    :pswitch_1a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v1, "BINARY "

    .line 488
    .line 489
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    return-object p0

    .line 497
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v1, "SYMBOL "

    .line 500
    .line 501
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p0

    .line 508
    return-object p0

    .line 509
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    return-object p0

    :pswitch_data_0
    .packed-switch -0x6f
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x5b
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x7a
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪世苏哲兰(I)Z
    .locals 0

    .line 1
    add-int/lit8 p0, p0, 0x38

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xf0

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(I)Z
    .locals 1

    .line 1
    const/16 v0, -0x28

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, -0x11

    .line 6
    .line 7
    if-gt p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(I)Z
    .locals 1

    .line 1
    const/16 v0, -0x10

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x48

    .line 6
    .line 7
    if-gt p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static 飘花落叶言子楪苏哲世兰(I)Z
    .locals 1

    .line 1
    const/16 v0, -0x10

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x2f

    .line 6
    .line 7
    if-gt p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method
