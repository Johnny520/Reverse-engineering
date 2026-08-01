.class Lbsh/BSHClassDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field static final CLASSINITNAME:Ljava/lang/String; = "_bshClassInit"


# instance fields
.field extend:Z

.field private generatedClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field modifiers:Lbsh/Modifiers;

.field name:Ljava/lang/String;

.field numInterfaces:I

.field type:Lbsh/ClassGenerator$Type;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lbsh/Modifiers;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lbsh/Modifiers;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lbsh/BSHClassDeclaration;->modifiers:Lbsh/Modifiers;

    .line 11
    .line 12
    return-void
.end method

.method private generateClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-boolean v2, p0, Lbsh/BSHClassDeclaration;->extend:Z

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lbsh/BSHAmbiguousName;

    .line 18
    .line 19
    invoke-virtual {v2, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :try_start_0
    sget-object v5, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    iget-object v5, v5, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    invoke-static {v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const-string v6, "final"

    .line 58
    .line 59
    invoke-virtual {v5, v6}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    invoke-static {v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;)[Lbsh/BshMethod;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v5}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    new-instance v6, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 74
    .line 75
    invoke-direct {v6, v1}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v5, v6}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {v5, v6}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Ljava/util/Collection;

    .line 91
    .line 92
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    new-instance p0, Lbsh/EvalException;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string p2, "Cannot inherit from final class "

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p0, p1, v4, v4}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_2
    :goto_1
    move-object v8, v2

    .line 113
    move v2, v3

    .line 114
    goto :goto_2

    .line 115
    :catch_0
    move-exception v0

    .line 116
    move-object p2, v0

    .line 117
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    throw p0

    .line 122
    :cond_3
    move v2, v1

    .line 123
    move-object v8, v4

    .line 124
    :goto_2
    iget v5, p0, Lbsh/BSHClassDeclaration;->numInterfaces:I

    .line 125
    .line 126
    new-array v7, v5, [Ljava/lang/Class;

    .line 127
    .line 128
    :goto_3
    iget v5, p0, Lbsh/BSHClassDeclaration;->numInterfaces:I

    .line 129
    .line 130
    if-ge v1, v5, :cond_7

    .line 131
    .line 132
    add-int/lit8 v5, v2, 0x1

    .line 133
    .line 134
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Lbsh/BSHAmbiguousName;

    .line 139
    .line 140
    invoke-virtual {v2, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    aput-object v6, v7, v1

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/Class;->isInterface()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_6

    .line 151
    .line 152
    :try_start_1
    sget-object v2, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 153
    .line 154
    aget-object v6, v7, v1

    .line 155
    .line 156
    iget-object v2, v2, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_5

    .line 167
    .line 168
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    check-cast v9, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 173
    .line 174
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const-class v9, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 178
    .line 179
    if-eq v6, v9, :cond_4

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_4
    invoke-static {v6}, Lbsh/security/SecurityError;->cantImplements(Ljava/lang/Class;)Lbsh/security/SecurityError;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    throw p2
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_1

    .line 187
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    move v2, v5

    .line 190
    goto :goto_3

    .line 191
    :catch_1
    move-exception v0

    .line 192
    move-object p2, v0

    .line 193
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    throw p0

    .line 198
    :cond_6
    new-instance p2, Lbsh/EvalException;

    .line 199
    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    const-string v1, "Type: "

    .line 203
    .line 204
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iget-object v1, v2, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 208
    .line 209
    const-string v2, " is not an interface!"

    .line 210
    .line 211
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 216
    .line 217
    .line 218
    throw p2

    .line 219
    :cond_7
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    move-object v9, v1

    .line 224
    check-cast v9, Lbsh/BSHBlock;

    .line 225
    .line 226
    iget-object v1, p0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 227
    .line 228
    sget-object v2, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 229
    .line 230
    if-ne v1, v2, :cond_8

    .line 231
    .line 232
    iget-object v1, p0, Lbsh/BSHClassDeclaration;->modifiers:Lbsh/Modifiers;

    .line 233
    .line 234
    invoke-virtual {v1, v3}, Lbsh/Modifiers;->changeContext(I)V

    .line 235
    .line 236
    .line 237
    :cond_8
    sget-object v1, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 238
    .line 239
    if-nez v1, :cond_9

    .line 240
    .line 241
    new-instance v1, Lbsh/飘花落叶言子楪哲兰苏世;

    .line 242
    .line 243
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 244
    .line 245
    .line 246
    sput-object v1, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 247
    .line 248
    :cond_9
    sget-object v1, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 249
    .line 250
    iget-object v5, p0, Lbsh/BSHClassDeclaration;->name:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v6, p0, Lbsh/BSHClassDeclaration;->modifiers:Lbsh/Modifiers;

    .line 253
    .line 254
    iget-object v10, p0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-object v11, p1

    .line 260
    move-object v12, p2

    .line 261
    invoke-static/range {v5 .. v12}, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    if-eqz p2, :cond_d

    .line 274
    .line 275
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    check-cast p2, Lbsh/BshMethod;

    .line 280
    .line 281
    invoke-virtual {p2}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {p2}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-nez v2, :cond_a

    .line 294
    .line 295
    move-object v2, v4

    .line 296
    goto :goto_6

    .line 297
    :cond_a
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-static {v2, v0, v1, v3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲世兰苏(Lbsh/NameSpace;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    if-nez v2, :cond_b

    .line 306
    .line 307
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-nez v5, :cond_b

    .line 312
    .line 313
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-static {v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-static {v2, v0, v1, v3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲世兰苏(Lbsh/NameSpace;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    :cond_b
    :goto_6
    if-nez v2, :cond_c

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_c
    new-instance p0, Lbsh/EvalException;

    .line 329
    .line 330
    invoke-virtual {p2}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-static {v8}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    new-instance v0, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    const-string v1, "Cannot override "

    .line 341
    .line 342
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    const-string p1, "() in "

    .line 349
    .line 350
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string p1, " overridden method is final"

    .line 357
    .line 358
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-direct {p0, p1, v4, v4}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 366
    .line 367
    .line 368
    throw p0

    .line 369
    :cond_d
    return-object p0
.end method

.method private static synthetic lambda$generateClass$0(Lbsh/BshMethod;)Z
    .locals 1

    .line 1
    const-string v0, "final"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "private"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lbsh/BshMethod;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/BSHClassDeclaration;->lambda$generateClass$0(Lbsh/BshMethod;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public declared-synchronized eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/BSHClassDeclaration;->generatedClass:Ljava/lang/Class;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lbsh/BSHClassDeclaration;->generateClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lbsh/BSHClassDeclaration;->generatedClass:Ljava/lang/Class;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    iget-object p1, p0, Lbsh/BSHClassDeclaration;->generatedClass:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lbsh/BSHClassDeclaration;->name:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
