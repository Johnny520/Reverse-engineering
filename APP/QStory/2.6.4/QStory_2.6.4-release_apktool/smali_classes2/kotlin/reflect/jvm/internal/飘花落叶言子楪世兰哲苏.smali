.class public final Lkotlin/reflect/jvm/internal/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世兰哲苏;

    .line 12
    .line 13
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世兰哲苏;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/reflect/Member;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v4, v0, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    const/4 v5, 0x6

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    move-object v1, v0

    .line 31
    check-cast v1, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 44
    .line 45
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getIndex()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    check-cast v0, Ljava/lang/reflect/Executable;

    .line 50
    .line 51
    invoke-direct {v1, v0, p0, v5}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;-><init>(Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const-string p0, "Only static methods are supported for now: "

    .line 56
    .line 57
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_1
    instance-of v4, v0, Ljava/lang/reflect/Constructor;

    .line 63
    .line 64
    if-eqz v4, :cond_6

    .line 65
    .line 66
    move-object v3, v0

    .line 67
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object v6, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 77
    .line 78
    invoke-virtual {v6, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    const-string v4, "java.version"

    .line 89
    .line 90
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    const-string v6, "1."

    .line 97
    .line 98
    invoke-static {v4, v6, v1}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-ne v4, v2, :cond_2

    .line 103
    .line 104
    const/4 v1, -0x1

    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_3

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    array-length v1, v1

    .line 121
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    array-length v2, v2

    .line 126
    sub-int/2addr v1, v2

    .line 127
    add-int/lit8 v1, v1, 0x2

    .line 128
    .line 129
    :cond_3
    :goto_0
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 130
    .line 131
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getIndex()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    add-int/2addr p0, v1

    .line 136
    check-cast v0, Ljava/lang/reflect/Executable;

    .line 137
    .line 138
    invoke-direct {v2, v0, p0, v5}, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;-><init>(Ljava/lang/Object;II)V

    .line 139
    .line 140
    .line 141
    move-object v1, v2

    .line 142
    :goto_1
    iget p0, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 143
    .line 144
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Ljava/lang/reflect/Executable;

    .line 147
    .line 148
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 149
    .line 150
    if-eqz v1, :cond_4

    .line 151
    .line 152
    check-cast v0, Ljava/lang/reflect/Method;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    aget-object p0, v0, p0

    .line 159
    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏哲兰世楪([Ljava/lang/Object;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    goto :goto_2

    .line 168
    :cond_4
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    .line 169
    .line 170
    if-eqz v1, :cond_5

    .line 171
    .line 172
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    aget-object p0, v0, p0

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏哲兰世楪([Ljava/lang/Object;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    goto :goto_2

    .line 188
    :cond_5
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 189
    .line 190
    :goto_2
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪兰世苏哲(Ljava/util/List;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    goto :goto_3

    .line 195
    :cond_6
    const-string p0, "Unsupported parameter owner: "

    .line 196
    .line 197
    invoke-static {v0, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :goto_3
    return-object v3

    .line 201
    :pswitch_0
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子兰苏哲世楪;

    .line 202
    .line 203
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子兰苏哲楪世;

    .line 204
    .line 205
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子兰苏哲楪世;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子兰苏哲世楪;)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_1
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子兰楪哲苏世;

    .line 210
    .line 211
    invoke-static {p0, v2}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/飘花落叶言子兰楪哲世苏;Z)L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_2
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子兰楪苏世哲;

    .line 217
    .line 218
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏世楪兰;

    .line 219
    .line 220
    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪哲世兰苏()Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰苏世;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    instance-of v1, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子哲世苏兰楪;

    .line 225
    .line 226
    if-nez v1, :cond_8

    .line 227
    .line 228
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪兰苏世哲(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_7

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_7
    const-string p0, "Only constructors and top-level callables are supported for now: "

    .line 236
    .line 237
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_8
    :goto_4
    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-interface {v0}, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;->getParameterTypes()Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    iget p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 250
    .line 251
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    move-object v3, p0

    .line 256
    check-cast v3, Ljava/lang/reflect/Type;

    .line 257
    .line 258
    :goto_5
    return-object v3

    .line 259
    :pswitch_3
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子兰楪世哲苏;

    .line 260
    .line 261
    invoke-static {p0}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲世苏(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世兰苏哲;)Ljava/lang/reflect/Type;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-nez v0, :cond_9

    .line 266
    .line 267
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-interface {p0}, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰苏哲;->getReturnType()Ljava/lang/reflect/Type;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    :cond_9
    return-object v0

    .line 276
    :pswitch_4
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰苏世楪;

    .line 277
    .line 278
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰苏楪世;

    .line 279
    .line 280
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰苏楪世;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰苏世楪;)V

    .line 281
    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_5
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰世苏楪;

    .line 285
    .line 286
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰世楪苏;

    .line 287
    .line 288
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰世楪苏;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰世苏楪;)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_6
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰楪苏世;

    .line 293
    .line 294
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰楪世苏;

    .line 295
    .line 296
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰楪世苏;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子哲兰楪苏世;)V

    .line 297
    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_7
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲世苏楪兰;

    .line 301
    .line 302
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;

    .line 303
    .line 304
    sget-object v4, Lkotlin/reflect/jvm/internal/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世兰哲:[Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 305
    .line 306
    aget-object v4, v4, v1

    .line 307
    .line 308
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->invoke()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲苏兰;

    .line 313
    .line 314
    if-eqz v0, :cond_14

    .line 315
    .line 316
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;

    .line 317
    .line 318
    sget-object v4, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世苏兰哲:[Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 319
    .line 320
    aget-object v1, v4, v1

    .line 321
    .line 322
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->invoke()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    check-cast p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世兰哲苏;

    .line 330
    .line 331
    iget-object p0, p0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 332
    .line 333
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲世兰;

    .line 336
    .line 337
    iget-object v4, p0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 340
    .line 341
    iget-object v5, v0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 342
    .line 343
    invoke-static {v5}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    if-nez v7, :cond_13

    .line 352
    .line 353
    invoke-static {v5}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    iget-object v5, v5, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 358
    .line 359
    iget-object v7, v0, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪哲兰苏子/飘花落叶言子楪世苏兰哲;

    .line 360
    .line 361
    iget-object v8, v7, L飘花落叶言世楪哲兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 362
    .line 363
    sget-object v9, Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;->MULTIFILE_CLASS:Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader$Kind;

    .line 364
    .line 365
    if-ne v8, v9, :cond_e

    .line 366
    .line 367
    iget-object v7, v7, L飘花落叶言世楪哲兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 368
    .line 369
    if-ne v8, v9, :cond_a

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_a
    move-object v7, v3

    .line 373
    :goto_6
    if-eqz v7, :cond_b

    .line 374
    .line 375
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    :cond_b
    if-nez v3, :cond_c

    .line 383
    .line 384
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 385
    .line 386
    :cond_c
    new-instance v7, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    :cond_d
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    if-eqz v8, :cond_f

    .line 400
    .line 401
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    check-cast v8, Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {v8}, L飘花落叶言世苏子哲楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世苏子哲楪兰/飘花落叶言子楪世苏兰哲;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    new-instance v9, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 412
    .line 413
    iget-object v8, v8, L飘花落叶言世苏子哲楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 414
    .line 415
    const/16 v10, 0x2f

    .line 416
    .line 417
    const/16 v11, 0x2e

    .line 418
    .line 419
    invoke-virtual {v8, v10, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    invoke-direct {v9, v8}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    new-instance v8, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;

    .line 427
    .line 428
    invoke-virtual {v9}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    iget-object v9, v9, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲兰苏;

    .line 433
    .line 434
    invoke-virtual {v9}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    invoke-direct {v8, v10, v9}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;-><init>(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)V

    .line 439
    .line 440
    .line 441
    iget-object v9, p0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v9, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世苏兰哲;

    .line 444
    .line 445
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    iget-object v10, v10, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世苏兰;

    .line 450
    .line 451
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    sget-object v10, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世兰哲苏;

    .line 455
    .line 456
    invoke-static {v9, v8, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲世苏兰(L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世苏兰哲;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世苏兰哲;L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世兰哲苏;)L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲苏兰;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    if-eqz v8, :cond_d

    .line 461
    .line 462
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_e
    invoke-static {v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    :cond_f
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/飘花落叶言子楪哲世兰苏;

    .line 471
    .line 472
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    iget-object v3, v3, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲苏世;

    .line 477
    .line 478
    invoke-direct {p0, v3, v5, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/飘花落叶言子楪哲世兰苏;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲苏世;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;I)V

    .line 479
    .line 480
    .line 481
    new-instance v2, Ljava/util/ArrayList;

    .line 482
    .line 483
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 484
    .line 485
    .line 486
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    :cond_10
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v7

    .line 494
    if-eqz v7, :cond_11

    .line 495
    .line 496
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    check-cast v7, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲苏兰;

    .line 501
    .line 502
    invoke-virtual {v1, p0, v7}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪兰苏哲;L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲苏兰;)Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏兰世;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    if-eqz v7, :cond_10

    .line 507
    .line 508
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    goto :goto_8

    .line 512
    :cond_11
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;)Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    new-instance v1, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    const-string v2, "package "

    .line 519
    .line 520
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    const-string v2, " ("

    .line 527
    .line 528
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    const/16 v0, 0x29

    .line 535
    .line 536
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-static {v0, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/util/List;)L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世兰苏;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    invoke-virtual {v4, v6, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    if-nez v0, :cond_12

    .line 552
    .line 553
    move-object v7, p0

    .line 554
    goto :goto_9

    .line 555
    :cond_12
    move-object v7, v0

    .line 556
    :cond_13
    :goto_9
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    check-cast v7, L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世兰苏;

    .line 560
    .line 561
    goto :goto_a

    .line 562
    :cond_14
    sget-object v7, L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏子兰楪哲/飘花落叶言子楪哲世苏兰;

    .line 563
    .line 564
    :goto_a
    return-object v7

    .line 565
    :pswitch_8
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子世兰苏哲楪;

    .line 566
    .line 567
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子世兰苏楪哲;

    .line 568
    .line 569
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子世兰苏楪哲;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子世兰苏哲楪;)V

    .line 570
    .line 571
    .line 572
    return-object v0

    .line 573
    :pswitch_9
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子世楪苏哲兰;

    .line 574
    .line 575
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰哲苏世;

    .line 576
    .line 577
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰哲苏世;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子世楪苏哲兰;)V

    .line 578
    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_a
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰哲世苏;

    .line 582
    .line 583
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰苏哲世;

    .line 584
    .line 585
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰苏哲世;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰哲世苏;)V

    .line 586
    .line 587
    .line 588
    return-object v0

    .line 589
    :pswitch_b
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰苏世哲;

    .line 590
    .line 591
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰世哲苏;

    .line 592
    .line 593
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰世哲苏;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰苏世哲;)V

    .line 594
    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_c
    check-cast p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰世苏哲;

    .line 598
    .line 599
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪哲兰苏世;

    .line 600
    .line 601
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言子楪哲兰苏世;-><init>(Lkotlin/reflect/jvm/internal/飘花落叶言子楪兰世苏哲;)V

    .line 602
    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_d
    check-cast p0, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世苏哲兰;

    .line 606
    .line 607
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;

    .line 608
    .line 609
    if-eqz p0, :cond_15

    .line 610
    .line 611
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->invoke()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    move-object v3, p0

    .line 616
    check-cast v3, Ljava/lang/reflect/Type;

    .line 617
    .line 618
    :cond_15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    invoke-static {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object p0

    .line 625
    return-object p0

    .line 626
    :pswitch_e
    check-cast p0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 627
    .line 628
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 629
    .line 630
    if-eqz p0, :cond_16

    .line 631
    .line 632
    check-cast p0, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪兰世苏哲;

    .line 633
    .line 634
    return-object p0

    .line 635
    :cond_16
    const-string p0, "result"

    .line 636
    .line 637
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    throw v3

    .line 641
    :pswitch_f
    check-cast p0, Ljava/lang/Class;

    .line 642
    .line 643
    return-object p0

    .line 644
    nop

    .line 645
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
