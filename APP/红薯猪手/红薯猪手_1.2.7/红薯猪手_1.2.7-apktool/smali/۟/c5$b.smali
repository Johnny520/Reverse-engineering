.class public final L۟/c5$b;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/c5;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/c5;


# direct methods
.method public constructor <init>(L۟/c5;)V
    .locals 0

    iput-object p1, p0, L۟/c5$b;->ۥ:L۟/c5;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, L۟/c5$b;->ۥ:L۟/c5;

    .line 2
    .line 3
    iget-object v0, v0, L۟/c5;->ۥۣۡ:Landroid/widget/EditText;

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, L۟/va;->ۥۡۦ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-lez v2, :cond_0

    .line 31
    .line 32
    move v2, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v2, v4

    .line 35
    :goto_0
    if-eqz v2, :cond_7

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    new-array v2, v2, [B

    .line 39
    .line 40
    fill-array-data v2, :array_0

    .line 41
    .line 42
    .line 43
    new-array v5, v1, [B

    .line 44
    .line 45
    fill-array-data v5, :array_1

    .line 46
    .line 47
    .line 48
    invoke-static {v2, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-array v5, v3, [B

    .line 53
    .line 54
    const/16 v6, -0x3f

    .line 55
    .line 56
    aput-byte v6, v5, v4

    .line 57
    .line 58
    new-array v6, v1, [B

    .line 59
    .line 60
    fill-array-data v6, :array_2

    .line 61
    .line 62
    .line 63
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-static {v0, v2, v5}, L۟/ta;->ۥ۠ۨ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-array v2, v3, [Ljava/lang/String;

    .line 72
    .line 73
    new-array v5, v3, [B

    .line 74
    .line 75
    const/16 v6, 0x70

    .line 76
    .line 77
    aput-byte v6, v5, v4

    .line 78
    .line 79
    new-array v6, v1, [B

    .line 80
    .line 81
    fill-array-data v6, :array_3

    .line 82
    .line 83
    .line 84
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    aput-object v5, v2, v4

    .line 89
    .line 90
    invoke-static {v0, v2}, L۟/va;->ۥۡۥ(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    const/4 v6, 0x2

    .line 99
    if-eq v5, v6, :cond_1

    .line 100
    .line 101
    sget v0, L۟/o;->ۥ:I

    .line 102
    .line 103
    const/16 v0, 0x18

    .line 104
    .line 105
    new-array v0, v0, [B

    .line 106
    .line 107
    fill-array-data v0, :array_4

    .line 108
    .line 109
    .line 110
    new-array v1, v1, [B

    .line 111
    .line 112
    fill-array-data v1, :array_5

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_5

    .line 120
    :cond_1
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v5}, L۟/sa;->ۥۣ۠(Ljava/lang/String;)Ljava/lang/Double;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const-wide/16 v6, 0x0

    .line 131
    .line 132
    if-eqz v5, :cond_2

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 135
    .line 136
    .line 137
    move-result-wide v8

    .line 138
    goto :goto_1

    .line 139
    :cond_2
    move-wide v8, v6

    .line 140
    :goto_1
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v2}, L۟/sa;->ۥۣ۠(Ljava/lang/String;)Ljava/lang/Double;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    if-eqz v2, :cond_3

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 153
    .line 154
    .line 155
    move-result-wide v10

    .line 156
    goto :goto_2

    .line 157
    :cond_3
    move-wide v10, v6

    .line 158
    :goto_2
    cmpg-double v2, v8, v6

    .line 159
    .line 160
    if-nez v2, :cond_4

    .line 161
    .line 162
    move v2, v3

    .line 163
    goto :goto_3

    .line 164
    :cond_4
    move v2, v4

    .line 165
    :goto_3
    if-nez v2, :cond_6

    .line 166
    .line 167
    cmpg-double v2, v10, v6

    .line 168
    .line 169
    if-nez v2, :cond_5

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_5
    move v3, v4

    .line 173
    :goto_4
    if-eqz v3, :cond_7

    .line 174
    .line 175
    :cond_6
    sget v0, L۟/o;->ۥ:I

    .line 176
    .line 177
    const/16 v0, 0x23

    .line 178
    .line 179
    new-array v0, v0, [B

    .line 180
    .line 181
    fill-array-data v0, :array_6

    .line 182
    .line 183
    .line 184
    new-array v1, v1, [B

    .line 185
    .line 186
    fill-array-data v1, :array_7

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    :goto_5
    invoke-static {v4, v0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_7
    iget-object v1, p0, L۟/c5$b;->ۥ:L۟/c5;

    .line 200
    .line 201
    iget-object v1, v1, L۟/c5;->ۥۡۡ:L۟/g3;

    .line 202
    .line 203
    invoke-interface {v1, v0}, L۟/g3;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 207
    .line 208
    :goto_6
    return-object v0

    .line 209
    :cond_8
    const/16 v0, 0xd

    .line 210
    .line 211
    new-array v0, v0, [B

    .line 212
    .line 213
    fill-array-data v0, :array_8

    .line 214
    .line 215
    .line 216
    new-array v1, v1, [B

    .line 217
    .line 218
    fill-array-data v1, :array_9

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const/4 v0, 0x0

    .line 229
    throw v0

    .line 230
    nop

    .line 231
    :array_0
    .array-data 1
        0x66t
        -0x4ct
        0x22t
    .end array-data

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :array_1
    .array-data 1
        -0x77t
        0x8t
        -0x52t
        -0x77t
        0x3ct
        -0x80t
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
        -0x13t
        0x71t
        -0x33t
        0x34t
        0x3ft
        -0xft
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
        0x5ct
        -0x30t
        0x6at
        0x2et
        -0x76t
        0x29t
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
        -0x4t
        -0x35t
        0x75t
        -0x4bt
        0x3ct
        -0x6bt
        -0xdt
        -0x11t
        0x62t
        -0x4ct
        0x4t
        -0x43t
        -0xdt
        -0x38t
        0x48t
        -0x4ct
        0x1t
        -0x43t
        -0xet
        -0x28t
        0x45t
        -0x49t
        0x18t
        -0x62t
    .end array-data

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
    .line 275
    .line 276
    .line 277
    :array_5
    .array-data 1
        0x14t
        0x75t
        -0x1at
        0x50t
        -0x47t
        0x30t
    .end array-data

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    nop

    .line 285
    :array_6
    .array-data 1
        0x1ft
        -0x3bt
        0x12t
        0x73t
        -0x1et
        -0x66t
        0x10t
        -0x1ft
        0x5t
        0x72t
        -0x26t
        -0x4et
        0x10t
        -0x3at
        0x2ft
        0x72t
        -0x21t
        -0x4et
        0x11t
        -0x2at
        0x22t
        0x71t
        -0x3at
        -0x6ft
        -0x25t
        -0x61t
        0x39t
        0x1bt
        -0x71t
        -0x44t
        0x4at
        -0x61t
        0x39t
        0x2ct
        0x57t
    .end array-data

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :array_7
    .array-data 1
        -0x9t
        0x7bt
        -0x7ft
        -0x6at
        0x67t
        0x3ft
    .end array-data

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    nop

    .line 315
    :array_8
    .array-data 1
        -0x23t
        0x49t
        -0x6ft
        0x16t
        -0x2at
        -0x3dt
        -0x21t
        0x6ft
        -0x6ct
        0xbt
        -0x35t
        -0x20t
        -0x22t
    .end array-data

    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    nop

    .line 327
    :array_9
    .array-data 1
        -0x50t
        0xct
        -0xbt
        0x7ft
        -0x5et
        -0x71t
    .end array-data
.end method
