.class public final L۟/y7$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/y7;->ۥ(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/y7;


# direct methods
.method public constructor <init>(L۟/y7;)V
    .locals 0

    iput-object p1, p0, L۟/y7$a;->ۥ:L۟/y7;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, L۟/l3;->ۥ۟ۡ()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v2, L۟/k8;->ۥۣ۟:L۟/k;

    .line 27
    .line 28
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v2, v2, L۟/k;->ۥۤۦ:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v2}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 43
    .line 44
    const/16 v0, 0xa

    .line 45
    .line 46
    new-array v0, v0, [B

    .line 47
    .line 48
    fill-array-data v0, :array_2

    .line 49
    .line 50
    .line 51
    new-array v2, v1, [B

    .line 52
    .line 53
    fill-array-data v2, :array_3

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, L۟/jb;->ۥ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 v0, 0x0

    .line 68
    const/4 v2, 0x0

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget-object v3, v3, L۟/k;->ۥۥ۟:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p1, v3}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move-object v3, v2

    .line 83
    :goto_0
    if-nez v3, :cond_3

    .line 84
    .line 85
    sget v4, L۟/g5;->ۥ:I

    .line 86
    .line 87
    const/16 v4, 0x35

    .line 88
    .line 89
    new-array v4, v4, [B

    .line 90
    .line 91
    fill-array-data v4, :array_4

    .line 92
    .line 93
    .line 94
    new-array v5, v1, [B

    .line 95
    .line 96
    fill-array-data v5, :array_5

    .line 97
    .line 98
    .line 99
    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-eqz p1, :cond_2

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move-object v5, v2

    .line 115
    :goto_1
    invoke-static {v4, v5}, L۟/r2;->ۥ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    const/16 v5, 0xd

    .line 124
    .line 125
    new-array v5, v5, [B

    .line 126
    .line 127
    fill-array-data v5, :array_6

    .line 128
    .line 129
    .line 130
    new-array v6, v1, [B

    .line 131
    .line 132
    fill-array-data v6, :array_7

    .line 133
    .line 134
    .line 135
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-static {v5, v4}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v4}, L۟/g5;->ۥ(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    if-eqz v3, :cond_4

    .line 146
    .line 147
    new-array v4, v1, [B

    .line 148
    .line 149
    fill-array-data v4, :array_8

    .line 150
    .line 151
    .line 152
    new-array v1, v1, [B

    .line 153
    .line 154
    fill-array-data v1, :array_9

    .line 155
    .line 156
    .line 157
    invoke-static {v4, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-array v4, v0, [Ljava/lang/Object;

    .line 162
    .line 163
    invoke-static {v3, v1, v4}, L۟/r3;->ۥ۟(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Ljava/lang/Integer;

    .line 168
    .line 169
    if-eqz v1, :cond_4

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    :cond_4
    if-eqz p1, :cond_5

    .line 176
    .line 177
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    iget-object v1, v1, L۟/k;->ۥۥ۠:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {p1, v1}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eqz p1, :cond_5

    .line 188
    .line 189
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iget-object v1, v1, L۟/k;->ۥۥۡ:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {p1, v1}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    :cond_5
    iget-object p1, p0, L۟/y7$a;->ۥ:L۟/y7;

    .line 200
    .line 201
    invoke-static {p1, v2}, L۟/y7;->ۥ۟۟(L۟/y7;Ljava/lang/Object;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p1, v0}, L۟/y7;->ۥ۟۠(Ljava/util/List;I)V

    .line 206
    .line 207
    .line 208
    :goto_2
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 209
    .line 210
    return-object p1

    .line 211
    :array_0
    .array-data 1
        0x11t
        -0x2ct
    .end array-data

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    nop

    .line 217
    :array_1
    .array-data 1
        0x78t
        -0x60t
        0x71t
        0x42t
        -0x53t
        -0x68t
    .end array-data

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    nop

    .line 225
    :array_2
    .array-data 1
        0xat
        0x10t
        0x39t
        -0x6dt
        -0x2at
        0x0t
        0x14t
        0x1dt
        0x33t
        -0x6ct
    .end array-data

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    nop

    .line 235
    :array_3
    .array-data 1
        0x7et
        0x78t
        0x50t
        -0x20t
        -0x67t
        0x62t
    .end array-data

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    nop

    .line 243
    :array_4
    .array-data 1
        0x10t
        -0x2dt
        0x55t
        0x54t
        0x35t
        -0x1ft
        -0x28t
        0x3at
        -0x79t
        -0x3bt
        -0x16t
        0x18t
        -0x75t
        0x34t
        -0x6at
        -0x28t
        -0x2bt
        0x19t
        -0x42t
        0x28t
        -0x74t
        -0x2et
        -0x66t
        -0x6et
        0x5ct
        -0x14t
        0xat
        0x5t
        0x1ft
        0x5bt
        -0x28t
        0x34t
        -0x71t
        -0x30t
        -0x23t
        0x12t
        -0x4bt
        0x3ct
        -0x6at
        -0x3dt
        -0x2dt
        0xft
        -0x45t
        0x32t
        -0x74t
        -0x3bt
        -0x38t
        0x18t
        -0x6ct
        0x31t
        -0x79t
        -0x3dt
        -0x80t
    .end array-data

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    nop

    .line 275
    :array_5
    .array-data 1
        -0x8t
        0x5dt
        -0x1et
        -0x4ft
        -0x46t
        0x77t
    .end array-data

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    nop

    .line 283
    :array_6
    .array-data 1
        -0x11t
        0x6t
        0x46t
        0x29t
        -0x1ct
        -0x4bt
        -0xbt
        0xet
        0x3dt
        0x73t
        -0x48t
        -0xet
        -0x4et
    .end array-data

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    nop

    .line 295
    :array_7
    .array-data 1
        -0x65t
        0x69t
        0x15t
        0x5dt
        -0x6at
        -0x24t
    .end array-data

    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    nop

    .line 303
    :array_8
    .array-data 1
        0x16t
        -0x60t
        0x5ct
        0x53t
        -0x15t
        0x6ft
    .end array-data

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    nop

    .line 311
    :array_9
    .array-data 1
        0x7ft
        -0x32t
        0x2at
        0x3ct
        -0x80t
        0xat
    .end array-data
.end method
