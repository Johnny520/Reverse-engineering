.class public final L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪苏兰世哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Ljava/lang/String;

.field public 飘花落叶言子楪世兰苏哲:Ljava/lang/String;

.field public 飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

.field public 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:Z

.field public 飘花落叶言子楪世苏哲兰:Ljava/lang/String;

.field public 飘花落叶言子楪苏世兰哲:Ljava/util/List;

.field public 飘花落叶言子楪苏世哲兰:Ljava/lang/String;

.field public 飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏楪哲兰;

.field public 飘花落叶言子楪苏哲兰世:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏兰楪;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "http://localhost"

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世楪兰(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    invoke-static {v0, v1}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    new-instance v2, Lio/ktor/http/URLParserException;

    .line 27
    .line 28
    invoke-direct {v2, v1, v0}, Lio/ktor/http/URLParserException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v2
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 2
    .line 3
    sget-object v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    iput-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput-boolean v2, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 20
    .line 21
    iput v2, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    iput-object v3, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 25
    .line 26
    iput-object v3, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v3, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v3, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 31
    .line 32
    sget-object v3, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v5, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {v3, v5, v1, v2, v2}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/nio/charset/CharsetEncoder;Lkotlinx/io/飘花落叶言子楪苏哲兰世;Ljava/lang/CharSequence;II)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;

    .line 58
    .line 59
    const/4 v3, 0x6

    .line 60
    invoke-direct {v1, v4, v3}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v5, v1}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Lkotlinx/io/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iput-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 71
    .line 72
    new-instance v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v3, 0xa

    .line 75
    .line 76
    invoke-static {v0, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    const/4 v5, 0x2

    .line 92
    const/4 v6, 0x1

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v7, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    sget-object v8, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 110
    .line 111
    move v9, v2

    .line 112
    :goto_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-ge v9, v10, :cond_5

    .line 117
    .line 118
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    sget-object v11, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 123
    .line 124
    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    invoke-interface {v11, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    if-nez v11, :cond_4

    .line 133
    .line 134
    sget-object v11, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/Set;

    .line 135
    .line 136
    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    invoke-interface {v11, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    if-eqz v11, :cond_0

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_0
    const v11, 0xd800

    .line 148
    .line 149
    .line 150
    if-gt v11, v10, :cond_1

    .line 151
    .line 152
    const v11, 0xe000

    .line 153
    .line 154
    .line 155
    if-ge v10, v11, :cond_1

    .line 156
    .line 157
    move v10, v5

    .line 158
    goto :goto_2

    .line 159
    :cond_1
    move v10, v6

    .line 160
    :goto_2
    invoke-virtual {v8}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    add-int/2addr v10, v9

    .line 168
    new-instance v12, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 169
    .line 170
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-static {v11, v12, v4, v9, v10}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/nio/charset/CharsetEncoder;Lkotlinx/io/飘花落叶言子楪苏哲兰世;Ljava/lang/CharSequence;II)V

    .line 174
    .line 175
    .line 176
    :cond_2
    invoke-virtual {v12}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏()Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-nez v9, :cond_3

    .line 181
    .line 182
    :goto_3
    invoke-virtual {v12}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏()Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    if-nez v9, :cond_2

    .line 187
    .line 188
    invoke-virtual {v12}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readByte()B

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    invoke-static {v9}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(B)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_3
    move v9, v10

    .line 201
    goto :goto_1

    .line 202
    :cond_4
    :goto_4
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    add-int/lit8 v9, v9, 0x1

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_5
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_6
    iput-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Ljava/util/List;

    .line 218
    .line 219
    new-instance v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏楪哲兰;

    .line 220
    .line 221
    invoke-direct {v0, v5}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;-><init>(I)V

    .line 222
    .line 223
    .line 224
    sget-object v1, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 225
    .line 226
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_8

    .line 235
    .line 236
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    sget-object v5, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 246
    .line 247
    invoke-static {v4, v2}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;Z)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    new-instance v7, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-static {v5, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    if-eqz v8, :cond_7

    .line 269
    .line 270
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    check-cast v8, Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v8, v6}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;Z)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_7
    invoke-virtual {v0, v4, v7}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏兰哲(Ljava/lang/String;Ljava/util/List;)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_8
    iput-object v0, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏楪哲兰;

    .line 292
    .line 293
    new-instance v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏兰楪;

    .line 294
    .line 295
    invoke-direct {v1, v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏兰楪;-><init>(L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏楪哲兰;)V

    .line 296
    .line 297
    .line 298
    iput-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏兰楪;

    .line 299
    .line 300
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;Ljava/lang/StringBuilder;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/high16 v0, 0x10000

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "Port must be between 0 and 65535, or 0 if not set. Provided: "

    .line 11
    .line 12
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 6
    .line 7
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 8
    .line 9
    :cond_0
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;
    .locals 12

    .line 1
    invoke-virtual {p0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 5
    .line 6
    iget-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 7
    .line 8
    iget-object v2, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    iget v3, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    iget-object v4, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Ljava/util/List;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    new-instance v4, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v6, 0xa

    .line 18
    .line 19
    invoke-static {v5, v6}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const/4 v7, 0x7

    .line 35
    const/4 v8, 0x0

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v8, v8, v6, v7}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v5, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏兰楪;

    .line 53
    .line 54
    iget-object v5, v5, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏楪哲兰;

    .line 55
    .line 56
    invoke-static {v5}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏楪哲兰;)L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪兰苏哲;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iget-object v6, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 61
    .line 62
    const/16 v9, 0xf

    .line 63
    .line 64
    invoke-static {v8, v8, v6, v9}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget-object v9, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    if-eqz v9, :cond_1

    .line 72
    .line 73
    invoke-static {v8, v8, v9, v7}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move-object v9, v10

    .line 79
    :goto_1
    iget-object v11, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v11, :cond_2

    .line 82
    .line 83
    invoke-static {v8, v8, v11, v7}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    :cond_2
    move-object v7, v9

    .line 88
    move-object v8, v10

    .line 89
    iget-boolean v9, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 90
    .line 91
    invoke-virtual {p0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 92
    .line 93
    .line 94
    new-instance v10, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const/16 v11, 0x100

    .line 97
    .line 98
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v10}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;Ljava/lang/StringBuilder;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-direct/range {v0 .. v10}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;-><init>(L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;Ljava/lang/String;ILjava/util/ArrayList;L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪兰苏哲;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰()L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "file"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 26
    .line 27
    iget-object v1, v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 36
    .line 37
    iput-object v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲楪苏兰;

    .line 38
    .line 39
    :cond_2
    iget v1, p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    iget v0, v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 44
    .line 45
    invoke-virtual {p0, v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    return-void
.end method
