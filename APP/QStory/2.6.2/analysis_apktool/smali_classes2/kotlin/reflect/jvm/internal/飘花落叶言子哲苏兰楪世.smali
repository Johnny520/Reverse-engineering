.class public final Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰楪世;
.super Ljava/lang/Object;

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;

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
    iget v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const-string v2, "Only constructors and top-level functions are supported for now: "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏哲兰楪(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget-object v0, v4, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰苏世;

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    instance-of p0, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲世苏兰楪;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4, v2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_1
    :goto_0
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪哲苏兰()Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v2, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏哲兰楪(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v7, 0x1

    .line 46
    if-eqz v6, :cond_5

    .line 47
    .line 48
    instance-of v6, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪苏世兰;

    .line 49
    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪苏世兰;

    .line 54
    .line 55
    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪苏兰哲世()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_2
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏楪兰哲(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_4

    .line 68
    .line 69
    invoke-interface {v0}, Lkotlin/jvm/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->getParameters()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;

    .line 101
    .line 102
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    sget-object v0, Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;->CALL_BY_NAME:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

    .line 114
    .line 115
    sget-object v1, Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;->KOTLIN:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;

    .line 116
    .line 117
    new-instance v5, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;

    .line 118
    .line 119
    invoke-direct {v5, p0, v2, v0, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :cond_4
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪哲苏兰()Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v4, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世兰苏哲;Ljava/lang/String;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    iget-object v1, p0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Ljava/util/Set;

    .line 137
    .line 138
    check-cast v1, Ljava/util/Collection;

    .line 139
    .line 140
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-interface {v0}, Lkotlin/jvm/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    new-instance v6, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-interface {v0}, Lkotlin/jvm/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0, p0, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/ClassLoader;Ljava/lang/String;Z)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-static {v6, p0, v7, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰苏世;->飘花落叶言子世楪苏兰哲(Ljava/util/ArrayList;Ljava/util/ArrayList;ZZ)V

    .line 179
    .line 180
    .line 181
    :try_start_0
    new-array p0, v3, [Ljava/lang/Class;

    .line 182
    .line 183
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    check-cast p0, [Ljava/lang/Class;

    .line 188
    .line 189
    array-length v0, p0

    .line 190
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, [Ljava/lang/Class;

    .line 195
    .line 196
    invoke-virtual {v1, p0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 197
    .line 198
    .line 199
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    goto :goto_4

    .line 201
    :catch_0
    move-object p0, v5

    .line 202
    goto :goto_4

    .line 203
    :cond_5
    :goto_2
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世兰苏哲;Ljava/lang/String;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iget-object v6, v1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v6, Ljava/util/Set;

    .line 212
    .line 213
    check-cast v6, Ljava/util/Collection;

    .line 214
    .line 215
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 216
    .line 217
    .line 218
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-interface {v6}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/reflect/Member;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-interface {v6}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    xor-int/2addr v6, v7

    .line 244
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏哲兰()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    if-eqz v8, :cond_6

    .line 249
    .line 250
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-eqz v9, :cond_6

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_6
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    :cond_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-eqz v9, :cond_8

    .line 266
    .line 267
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    check-cast v9, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;

    .line 272
    .line 273
    invoke-interface {v9}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getKind()Lkotlin/reflect/KParameter$Kind;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    sget-object v10, Lkotlin/reflect/KParameter$Kind;->EXTENSION_RECEIVER:Lkotlin/reflect/KParameter$Kind;

    .line 278
    .line 279
    if-ne v9, v10, :cond_7

    .line 280
    .line 281
    move v3, v7

    .line 282
    :cond_8
    :goto_3
    invoke-virtual {v0, p0, v1, v6, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰苏世;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/reflect/Method;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    :goto_4
    instance-of v0, p0, Ljava/lang/reflect/Constructor;

    .line 287
    .line 288
    if-eqz v0, :cond_9

    .line 289
    .line 290
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 291
    .line 292
    invoke-virtual {v4, p0, v7}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/Constructor;Z)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    goto :goto_5

    .line 297
    :cond_9
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 298
    .line 299
    if-eqz v0, :cond_a

    .line 300
    .line 301
    check-cast p0, Ljava/lang/reflect/Method;

    .line 302
    .line 303
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-interface {v0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    invoke-virtual {v4, p0, v0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪兰苏哲世(Ljava/lang/reflect/Method;Z)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲苏世兰;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    goto :goto_5

    .line 316
    :cond_a
    move-object p0, v5

    .line 317
    :goto_5
    if-eqz p0, :cond_b

    .line 318
    .line 319
    invoke-static {v2, v4, p0, v7}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(Ljava/util/List;Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;Z)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    :cond_b
    :goto_6
    return-object v5

    .line 324
    :pswitch_0
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏哲兰楪(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    iget-object v0, v4, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰苏世;

    .line 329
    .line 330
    if-nez p0, :cond_d

    .line 331
    .line 332
    instance-of p0, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲世苏兰楪;

    .line 333
    .line 334
    if-eqz p0, :cond_c

    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_c
    invoke-static {v4, v2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    goto/16 :goto_c

    .line 341
    .line 342
    :cond_d
    :goto_7
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪哲苏兰()Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏哲兰楪(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-eqz v6, :cond_11

    .line 353
    .line 354
    instance-of v6, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪苏世兰;

    .line 355
    .line 356
    if-eqz v6, :cond_e

    .line 357
    .line 358
    move-object v6, v0

    .line 359
    check-cast v6, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪苏世兰;

    .line 360
    .line 361
    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪苏兰哲世()Z

    .line 362
    .line 363
    .line 364
    move-result v6

    .line 365
    if-eqz v6, :cond_e

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_e
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏楪兰哲(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 369
    .line 370
    .line 371
    move-result p0

    .line 372
    if-eqz p0, :cond_10

    .line 373
    .line 374
    invoke-interface {v0}, Lkotlin/jvm/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->getParameters()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    new-instance v2, Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-static {v0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 389
    .line 390
    .line 391
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_f

    .line 400
    .line 401
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    check-cast v1, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;

    .line 406
    .line 407
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪哲苏兰世;->getName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_f
    sget-object v0, Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;->POSITIONAL_CALL:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

    .line 419
    .line 420
    sget-object v1, Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;->KOTLIN:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;

    .line 421
    .line 422
    new-instance v5, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;

    .line 423
    .line 424
    invoke-direct {v5, p0, v2, v0, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;)V

    .line 425
    .line 426
    .line 427
    goto :goto_c

    .line 428
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-interface {v0}, Lkotlin/jvm/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    invoke-interface {v0}, Lkotlin/jvm/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-static {v0, v2, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/ClassLoader;Ljava/lang/String;Z)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    iget-object v0, v0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Ljava/util/ArrayList;

    .line 453
    .line 454
    :try_start_1
    new-array v1, v3, [Ljava/lang/Class;

    .line 455
    .line 456
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    check-cast v0, [Ljava/lang/Class;

    .line 461
    .line 462
    array-length v1, v0

    .line 463
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, [Ljava/lang/Class;

    .line 468
    .line 469
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 470
    .line 471
    .line 472
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 473
    goto :goto_a

    .line 474
    :catch_1
    move-object p0, v5

    .line 475
    goto :goto_a

    .line 476
    :cond_11
    :goto_9
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/km/jvm/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v0, p0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲楪兰苏世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    :goto_a
    instance-of v0, p0, Ljava/lang/reflect/Constructor;

    .line 483
    .line 484
    if-eqz v0, :cond_12

    .line 485
    .line 486
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 487
    .line 488
    invoke-virtual {v4, p0, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/Constructor;Z)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    goto :goto_b

    .line 493
    :cond_12
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 494
    .line 495
    if-eqz v0, :cond_13

    .line 496
    .line 497
    check-cast p0, Ljava/lang/reflect/Method;

    .line 498
    .line 499
    invoke-virtual {v4, p0, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪兰苏哲世(Ljava/lang/reflect/Method;Z)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲苏世兰;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    :goto_b
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 504
    .line 505
    invoke-static {v0, v4, p0, v3}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(Ljava/util/List;Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;Z)L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    goto :goto_c

    .line 510
    :cond_13
    const-string p0, "Could not compute caller for function: "

    .line 511
    .line 512
    invoke-static {v4, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    :goto_c
    return-object v5

    .line 516
    :pswitch_1
    iget-object v6, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;

    .line 517
    .line 518
    invoke-static {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子世苏哲楪兰(Lkotlin/reflect/jvm/internal/飘花落叶言楪子世苏兰哲;)Z

    .line 519
    .line 520
    .line 521
    move-result p0

    .line 522
    if-eqz p0, :cond_14

    .line 523
    .line 524
    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪兰哲世苏()Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪苏兰哲()Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

    .line 529
    .line 530
    .line 531
    move-result-object v8

    .line 532
    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪兰苏哲()Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object v9

    .line 536
    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪哲兰苏()Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;

    .line 537
    .line 538
    .line 539
    move-result-object v10

    .line 540
    const/4 v11, 0x0

    .line 541
    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏世楪兰;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;Ljava/util/List;Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;Z)Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object p0

    .line 545
    goto :goto_d

    .line 546
    :cond_14
    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世苏哲兰()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    :goto_d
    return-object p0

    .line 551
    :pswitch_2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;

    .line 552
    .line 553
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪兰哲世苏()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪苏兰哲()Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪兰苏哲()Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏兰世楪;->飘花落叶言子世楪哲兰苏()Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    const/4 v5, 0x1

    .line 570
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/飘花落叶言子哲苏世楪兰;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;Ljava/util/List;Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;Z)Ljava/util/List;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    return-object p0

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
