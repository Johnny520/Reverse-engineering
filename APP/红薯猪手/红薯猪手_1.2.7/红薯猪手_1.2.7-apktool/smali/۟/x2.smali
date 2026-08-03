.class public final L۟/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static ۥ()Ljava/lang/String;
    .locals 3

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0

    :array_0
    .array-data 1
        0x65t
        0x37t
        0x42t
        0x74t
        0x17t
        0x3at
        0x6ct
    .end array-data

    :array_1
    .array-data 1
        0x8t
        0x58t
        0x37t
        0x1at
        0x63t
        0x5ft
    .end array-data
.end method

.method public static ۥ۟(Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-static {}, L۟/x2;->ۥ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const-string v3, ""

    .line 11
    .line 12
    const/16 v4, 0x59

    .line 13
    .line 14
    const/4 v5, 0x6

    .line 15
    const/4 v6, 0x0

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-array v1, v2, [B

    .line 23
    .line 24
    const/16 v7, -0x7c

    .line 25
    .line 26
    aput-byte v7, v1, v6

    .line 27
    .line 28
    new-array v7, v5, [B

    .line 29
    .line 30
    fill-array-data v7, :array_0

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    move-object v1, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-array v1, v2, [B

    .line 46
    .line 47
    aput-byte v4, v1, v6

    .line 48
    .line 49
    new-array v7, v5, [B

    .line 50
    .line 51
    fill-array-data v7, :array_1

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-array v1, v2, [B

    .line 74
    .line 75
    const/16 v7, 0x57

    .line 76
    .line 77
    aput-byte v7, v1, v6

    .line 78
    .line 79
    new-array v7, v5, [B

    .line 80
    .line 81
    fill-array-data v7, :array_2

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    new-array v7, v2, [B

    .line 93
    .line 94
    const/16 v8, -0xb

    .line 95
    .line 96
    aput-byte v8, v7, v6

    .line 97
    .line 98
    new-array v8, v5, [B

    .line 99
    .line 100
    fill-array-data v8, :array_3

    .line 101
    .line 102
    .line 103
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {p0, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-le v1, p0, :cond_2

    .line 112
    .line 113
    new-instance p0, Ljava/io/File;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    move-object v0, p0

    .line 123
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_4

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {}, L۟/x2;->ۥ()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    new-array v1, v2, [B

    .line 142
    .line 143
    aput-byte v4, v1, v6

    .line 144
    .line 145
    new-array v4, v5, [B

    .line 146
    .line 147
    fill-array-data v4, :array_4

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    new-instance v1, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    array-length v4, p0

    .line 164
    move v7, v6

    .line 165
    :goto_1
    if-ge v7, v4, :cond_4

    .line 166
    .line 167
    aget-object v8, p0, v7

    .line 168
    .line 169
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-nez v9, :cond_3

    .line 174
    .line 175
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-nez v9, :cond_3

    .line 180
    .line 181
    new-array v9, v2, [B

    .line 182
    .line 183
    const/16 v10, -0x9

    .line 184
    .line 185
    aput-byte v10, v9, v6

    .line 186
    .line 187
    new-array v10, v5, [B

    .line 188
    .line 189
    fill-array-data v10, :array_5

    .line 190
    .line 191
    .line 192
    invoke-static {v9, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    new-instance v8, Ljava/io/File;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    if-nez v9, :cond_3

    .line 216
    .line 217
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-nez v8, :cond_3

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_4
    :goto_2
    return-void

    .line 228
    nop

    .line 229
    :array_0
    .array-data 1
        -0x55t
        0x60t
        -0x36t
        -0x6et
        0x5bt
        0x4t
    .end array-data

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    nop

    .line 237
    :array_1
    .array-data 1
        0x76t
        0x32t
        -0x14t
        -0x72t
        -0x42t
        0x37t
    .end array-data

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    nop

    .line 245
    :array_2
    .array-data 1
        0x79t
        -0x5ft
        0x0t
        -0x7ct
        0x6ct
        -0x4et
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    nop

    .line 253
    :array_3
    .array-data 1
        -0x26t
        0x70t
        -0x58t
        0x39t
        0x71t
        -0x1ft
    .end array-data

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    nop

    .line 261
    :array_4
    .array-data 1
        0x76t
        -0x3at
        0x47t
        0x32t
        -0x63t
        0x41t
    .end array-data

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    nop

    .line 269
    :array_5
    .array-data 1
        -0x28t
        -0x6ct
        0x25t
        -0x63t
        -0x40t
        0x22t
    .end array-data
.end method
