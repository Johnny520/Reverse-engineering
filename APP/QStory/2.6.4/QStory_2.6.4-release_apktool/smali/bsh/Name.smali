.class Lbsh/Name;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static FINISHED:Ljava/lang/String;

.field private static final noOverride:Ljava/util/regex/Pattern;


# instance fields
.field asClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private callstackDepth:I

.field classOfStaticMethod:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private evalBaseObject:Ljava/lang/Object;

.field private evalName:Ljava/lang/String;

.field private lastEvalName:Ljava/lang/String;

.field public namespace:Lbsh/NameSpace;

.field value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "eval|assert"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbsh/Name;->noOverride:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static clearParts()V
    .locals 2

    .line 1
    sget-object v0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
.end method

.method private completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p3

    .line 10
    :cond_0
    const-string p0, "lastEvalName = "

    .line 11
    .line 12
    invoke-static {p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method private consumeNextObjectField(Lbsh/CallStack;Lbsh/Interpreter;ZZ)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 16
    .line 17
    iget-object v5, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v4, p2

    .line 23
    invoke-virtual/range {v1 .. v6}, Lbsh/Name;->resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 28
    .line 29
    if-eq p0, p1, :cond_1

    .line 30
    .line 31
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 32
    .line 33
    sget-object p2, Lbsh/Name;->FINISHED:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v1, p1, p2, p0}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_0
    move-object v1, p0

    .line 41
    move-object v2, p1

    .line 42
    move-object v4, p2

    .line 43
    :cond_1
    iget-object p0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-static {p0, p1}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object p0, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    instance-of p2, p0, Lbsh/This;

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    :cond_2
    if-nez p3, :cond_4

    .line 59
    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    iget-object v3, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-virtual/range {v1 .. v6}, Lbsh/Name;->resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    check-cast p0, Lbsh/This;

    .line 71
    .line 72
    iget-object v3, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    invoke-virtual/range {v1 .. v6}, Lbsh/Name;->resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :goto_0
    sget-object p2, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 80
    .line 81
    if-eq p0, p2, :cond_4

    .line 82
    .line 83
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p1}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {v1, v5, p1, p0}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :cond_4
    iget-object p0, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 95
    .line 96
    const/4 p2, 0x0

    .line 97
    if-nez p0, :cond_8

    .line 98
    .line 99
    const-string p0, "trying class: "

    .line 100
    .line 101
    iget-object v0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 102
    .line 103
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move p0, p1

    .line 111
    move-object v0, p2

    .line 112
    move-object v2, v0

    .line 113
    :goto_1
    iget-object v3, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v3}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-gt p0, v3, :cond_6

    .line 120
    .line 121
    iget-object v0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v0, p0}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v0, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    add-int/lit8 p0, p0, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_6
    :goto_2
    iget-object v3, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 140
    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    invoke-static {v3}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    sub-int/2addr p1, p0

    .line 148
    invoke-static {v3, p1}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    new-instance p1, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 153
    .line 154
    invoke-direct {p1, v0}, Lbsh/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/Class;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {v1, v2, p0, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :cond_7
    const-string p0, "not a class, trying var prefix "

    .line 163
    .line 164
    filled-new-array {p0, v3}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_8
    iget-object p0, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 172
    .line 173
    if-eqz p0, :cond_9

    .line 174
    .line 175
    instance-of v0, p0, Lbsh/This;

    .line 176
    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    :cond_9
    if-nez p3, :cond_c

    .line 180
    .line 181
    if-eqz p4, :cond_c

    .line 182
    .line 183
    if-nez p0, :cond_a

    .line 184
    .line 185
    iget-object p0, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_a
    check-cast p0, Lbsh/This;

    .line 189
    .line 190
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 191
    .line 192
    :goto_3
    new-instance p2, Lbsh/NameSpace;

    .line 193
    .line 194
    const-string p3, "auto: "

    .line 195
    .line 196
    invoke-static {p3, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    invoke-direct {p2, p0, p3}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, v4}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    iget-object p3, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 208
    .line 209
    const/4 p4, 0x0

    .line 210
    if-nez p3, :cond_b

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_b
    move p1, p4

    .line 214
    :goto_4
    invoke-virtual {p0, v5, p2, p4, p1}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;

    .line 215
    .line 216
    .line 217
    iget-object p0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {p0}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-direct {v1, v5, p0, p2}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    :cond_c
    if-nez p0, :cond_e

    .line 229
    .line 230
    iget-object p0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {p0}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    if-nez p0, :cond_d

    .line 237
    .line 238
    iget-object p0, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 239
    .line 240
    invoke-virtual {p0, v5, v4}, Lbsh/NameSpace;->getPropertyValue(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 245
    .line 246
    sget-object p2, Lbsh/Name;->FINISHED:Ljava/lang/String;

    .line 247
    .line 248
    invoke-direct {v1, p1, p2, p0}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :cond_d
    new-instance p0, Lbsh/UtilEvalError;

    .line 254
    .line 255
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 256
    .line 257
    new-instance p2, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string p3, "Class or variable not found: "

    .line 260
    .line 261
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p0

    .line 275
    :cond_e
    sget-object p4, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 276
    .line 277
    if-eq p0, p4, :cond_1b

    .line 278
    .line 279
    sget-object p4, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 280
    .line 281
    if-eq p0, p4, :cond_1a

    .line 282
    .line 283
    instance-of p4, p0, Lbsh/Primitive;

    .line 284
    .line 285
    if-nez p4, :cond_19

    .line 286
    .line 287
    instance-of p4, p0, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 288
    .line 289
    if-eqz p4, :cond_16

    .line 290
    .line 291
    check-cast p0, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 292
    .line 293
    iget-object p0, p0, Lbsh/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 294
    .line 295
    iget-object p3, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {p3, p1}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p3

    .line 301
    const-string p4, "this"

    .line 302
    .line 303
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result p4

    .line 307
    if-eqz p4, :cond_11

    .line 308
    .line 309
    iget-object p1, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 310
    .line 311
    :goto_5
    if-eqz p1, :cond_10

    .line 312
    .line 313
    iget-object p2, p1, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 314
    .line 315
    if-eqz p2, :cond_f

    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    if-ne p2, p0, :cond_f

    .line 322
    .line 323
    iget-object p0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 324
    .line 325
    invoke-static {p0}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    iget-object p1, p1, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 330
    .line 331
    invoke-direct {v1, p3, p0, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    return-object p0

    .line 336
    :cond_f
    invoke-virtual {p1}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    goto :goto_5

    .line 341
    :cond_10
    new-instance p1, Lbsh/UtilEvalError;

    .line 342
    .line 343
    const-string p2, "Can\'t find enclosing \'this\' instance of class: "

    .line 344
    .line 345
    invoke-static {p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-direct {p1, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw p1

    .line 353
    :cond_11
    sget-object p4, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 354
    .line 355
    invoke-virtual {p4, p0, p3}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    :try_start_0
    const-string p4, "Name call to getStaticFieldValue, class: "

    .line 359
    .line 360
    const-string v0, ", field:"

    .line 361
    .line 362
    filled-new-array {p4, p0, v0, p3}, [Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p4

    .line 366
    invoke-static {p4}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-static {p3, p0, p2, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p2
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    goto :goto_6

    .line 374
    :catch_0
    move-exception v0

    .line 375
    move-object p1, v0

    .line 376
    const-string p4, "field reflect error: "

    .line 377
    .line 378
    filled-new-array {p4, p1}, [Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    :goto_6
    if-nez p2, :cond_14

    .line 386
    .line 387
    new-instance p1, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p4

    .line 396
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string p4, "$"

    .line 400
    .line 401
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    iget-object p4, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 412
    .line 413
    invoke-virtual {p4, p1}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    iget-object p4, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 418
    .line 419
    iget-object p4, p4, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 420
    .line 421
    if-nez p4, :cond_13

    .line 422
    .line 423
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 424
    .line 425
    .line 426
    move-result p4

    .line 427
    if-eqz p4, :cond_13

    .line 428
    .line 429
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 430
    .line 431
    .line 432
    move-result-object p4

    .line 433
    const-string v0, "static"

    .line 434
    .line 435
    invoke-virtual {p4, v0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 436
    .line 437
    .line 438
    move-result p4

    .line 439
    if-eqz p4, :cond_12

    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_12
    new-instance p1, Lbsh/UtilEvalError;

    .line 443
    .line 444
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    new-instance p2, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string p4, "an enclosing instance that contains "

    .line 451
    .line 452
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    const-string p0, "."

    .line 459
    .line 460
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    const-string p0, " is required"

    .line 467
    .line 468
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    invoke-direct {p1, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw p1

    .line 479
    :cond_13
    :goto_7
    if-eqz p1, :cond_14

    .line 480
    .line 481
    new-instance p2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 482
    .line 483
    invoke-direct {p2, p1}, Lbsh/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/Class;)V

    .line 484
    .line 485
    .line 486
    :cond_14
    if-nez p2, :cond_15

    .line 487
    .line 488
    invoke-static {p0, p3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    :cond_15
    iget-object p0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 493
    .line 494
    invoke-static {p0}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    invoke-direct {v1, p3, p0, p2}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    return-object p0

    .line 503
    :cond_16
    if-nez p3, :cond_18

    .line 504
    .line 505
    iget-object p0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 506
    .line 507
    invoke-static {p0, p1}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    sget-object p1, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 512
    .line 513
    invoke-virtual {p1}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 514
    .line 515
    .line 516
    const-string p1, "length"

    .line 517
    .line 518
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    if-eqz p1, :cond_17

    .line 523
    .line 524
    iget-object p1, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 525
    .line 526
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 531
    .line 532
    .line 533
    move-result p1

    .line 534
    if-eqz p1, :cond_17

    .line 535
    .line 536
    new-instance p1, Lbsh/Primitive;

    .line 537
    .line 538
    iget-object p2, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 539
    .line 540
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 541
    .line 542
    .line 543
    move-result p2

    .line 544
    invoke-direct {p1, p2}, Lbsh/Primitive;-><init>(I)V

    .line 545
    .line 546
    .line 547
    iget-object p2, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 548
    .line 549
    invoke-static {p2}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p2

    .line 553
    invoke-direct {v1, p0, p2, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    return-object p0

    .line 558
    :cond_17
    :try_start_1
    iget-object p1, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 559
    .line 560
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    iget-object p2, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 565
    .line 566
    invoke-static {p2}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object p2

    .line 570
    invoke-direct {v1, p0, p2, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object p0
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 574
    return-object p0

    .line 575
    :catch_1
    iget-object p1, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 576
    .line 577
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    iget-object p2, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 582
    .line 583
    invoke-static {p2}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p2

    .line 587
    invoke-direct {v1, p0, p2, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    return-object p0

    .line 592
    :cond_18
    new-instance p0, Lbsh/UtilEvalError;

    .line 593
    .line 594
    new-instance p1, Ljava/lang/StringBuilder;

    .line 595
    .line 596
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 597
    .line 598
    .line 599
    iget-object p2, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 600
    .line 601
    const-string p3, " does not resolve to a class name."

    .line 602
    .line 603
    invoke-static {p1, p2, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    throw p0

    .line 611
    :cond_19
    new-instance p0, Lbsh/UtilEvalError;

    .line 612
    .line 613
    iget-object p1, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 614
    .line 615
    new-instance p2, Ljava/lang/StringBuilder;

    .line 616
    .line 617
    const-string p3, "Can\'t treat primitive like an object. Error while evaluating: "

    .line 618
    .line 619
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object p1

    .line 629
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    throw p0

    .line 633
    :cond_1a
    new-instance p0, Lbsh/UtilEvalError;

    .line 634
    .line 635
    iget-object p1, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 636
    .line 637
    new-instance p2, Ljava/lang/StringBuilder;

    .line 638
    .line 639
    const-string p3, "Undefined variable or class name while evaluating: "

    .line 640
    .line 641
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    throw p0

    .line 655
    :cond_1b
    new-instance p0, Lbsh/UtilTargetError;

    .line 656
    .line 657
    new-instance p1, Ljava/lang/NullPointerException;

    .line 658
    .line 659
    new-instance p2, Ljava/lang/StringBuilder;

    .line 660
    .line 661
    const-string p3, "Null Pointer while evaluating: "

    .line 662
    .line 663
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    iget-object p3, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 667
    .line 668
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object p2

    .line 675
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    invoke-direct {p0, p1}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 679
    .line 680
    .line 681
    throw p0
.end method

.method public static countParts(Ljava/lang/String;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-static {p0}, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lbsh/飘花落叶言子世哲兰苏楪;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:I

    .line 10
    .line 11
    return p0
.end method

.method public static getClassNameSpace(Lbsh/NameSpace;)Lbsh/NameSpace;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Lbsh/NameSpace;->isClass:Z

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_1
    iget-boolean v1, p0, Lbsh/NameSpace;->isMethod:Z

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-boolean v1, v1, Lbsh/NameSpace;->isClass:Z

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v0
.end method

.method private invokeLocalMethod(Lbsh/Interpreter;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, "invokeLocalMethod: "

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_6

    .line 14
    .line 15
    iget-object v2, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :try_start_0
    sget-object v3, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v3, v3, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_5

    .line 35
    :goto_0
    :try_start_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_4

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    move-object v5, p3

    .line 52
    move-object v6, p4

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_0
    :try_start_2
    iget-object v5, p0, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 56
    .line 57
    const-string v7, "this"
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_1

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    move-object v3, p0

    .line 61
    move-object v6, p1

    .line 62
    move-object v4, p3

    .line 63
    :try_start_3
    invoke-virtual/range {v3 .. v8}, Lbsh/Name;->resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_0

    .line 67
    move-object v5, v4

    .line 68
    move-object v4, v6

    .line 69
    :try_start_4
    instance-of p1, p0, Lbsh/This;

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_2

    .line 77
    :cond_1
    move-object v9, p0

    .line 78
    goto :goto_3

    .line 79
    :catch_0
    move-object v5, v4

    .line 80
    move-object v4, v6

    .line 81
    goto :goto_2

    .line 82
    :catch_1
    move-object v3, p0

    .line 83
    move-object v4, p1

    .line 84
    move-object v5, p3

    .line 85
    :catch_2
    :goto_2
    move-object v9, v0

    .line 86
    :goto_3
    const/4 p0, 0x0

    .line 87
    if-eqz v9, :cond_2

    .line 88
    .line 89
    :try_start_5
    sget-object p1, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 90
    .line 91
    if-eq v9, p1, :cond_2

    .line 92
    .line 93
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 94
    .line 95
    if-eq v9, p1, :cond_2

    .line 96
    .line 97
    iget-object p1, v3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 98
    .line 99
    invoke-static {v9, p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-virtual {p1, p3, v2, v1}, Lbsh/NameSpace;->getExtensionMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    goto :goto_4

    .line 108
    :catch_3
    move-exception v0

    .line 109
    move-object p0, v0

    .line 110
    goto :goto_5

    .line 111
    :cond_2
    :goto_4
    if-nez v0, :cond_3

    .line 112
    .line 113
    iget-object p1, v3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 114
    .line 115
    invoke-virtual {p1, v2, v1, p0, p0}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;ZZ)Lbsh/BshMethod;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_5
    .catch Lbsh/UtilEvalError; {:try_start_5 .. :try_end_5} :catch_3

    .line 119
    goto :goto_6

    .line 120
    :goto_5
    const-string p1, "Local method invocation"

    .line 121
    .line 122
    invoke-virtual {p0, p1, p4, v5}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    throw p0

    .line 127
    :cond_3
    :goto_6
    iget-object v1, v3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 128
    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    iget-boolean p1, v1, Lbsh/NameSpace;->isMethod:Z

    .line 132
    .line 133
    if-nez p1, :cond_4

    .line 134
    .line 135
    iget-boolean p1, v0, Lbsh/BshMethod;->isScriptedObject:Z

    .line 136
    .line 137
    if-nez p1, :cond_4

    .line 138
    .line 139
    iget-object p1, v0, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 140
    .line 141
    invoke-virtual {v1, p1}, Lbsh/NameSpace;->isChildOf(Lbsh/NameSpace;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    iget-object p1, v3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 148
    .line 149
    invoke-virtual {p1}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget-boolean p1, p1, Lbsh/NameSpace;->isClass:Z

    .line 154
    .line 155
    if-nez p1, :cond_4

    .line 156
    .line 157
    sget-object p1, Lbsh/Name;->noOverride:Ljava/util/regex/Pattern;

    .line 158
    .line 159
    invoke-virtual {v0}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    invoke-virtual {p1, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-nez p1, :cond_4

    .line 172
    .line 173
    const/4 p0, 0x1

    .line 174
    :cond_4
    move v8, p0

    .line 175
    move-object v7, p4

    .line 176
    move-object v3, v0

    .line 177
    move-object v6, v5

    .line 178
    move-object v5, v4

    .line 179
    move-object v4, p2

    .line 180
    invoke-virtual/range {v3 .. v9}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :cond_5
    move-object v3, p2

    .line 186
    move-object v6, p4

    .line 187
    invoke-virtual/range {v1 .. v6}, Lbsh/NameSpace;->invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :catch_4
    move-exception v0

    .line 193
    move-object p0, v0

    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :catch_5
    move-exception v0

    .line 197
    move-object v5, p3

    .line 198
    move-object v6, p4

    .line 199
    move-object p0, v0

    .line 200
    :goto_7
    invoke-virtual {p0, v6, v5}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    throw p0

    .line 205
    :cond_6
    const-string p0, "invokeLocalMethod: interpreter = null"

    .line 206
    .line 207
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-object v0
.end method

.method public static isCompound(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-le p0, v0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static prefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 42
    invoke-static {p0}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p0, v0}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static prefix(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lbsh/飘花落叶言子世哲兰苏楪;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-gt v1, p1, :cond_3

    .line 12
    .line 13
    iget v1, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:I

    .line 14
    .line 15
    if-ge v1, p1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    aget-object v1, v0, p1

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-interface {p0, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "."

    .line 30
    .line 31
    invoke-static {v1, p0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    aput-object p0, v0, p1

    .line 36
    .line 37
    :cond_2
    aget-object p0, v0, p1

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method private reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 2
    .line 3
    iput-object v0, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lbsh/Name;->callstackDepth:I

    .line 10
    .line 11
    return-void
.end method

.method public static suffix(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 43
    invoke-static {p0}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p0, v0}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static suffix(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lbsh/飘花落叶言子世哲兰苏楪;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-gt v1, p1, :cond_3

    .line 12
    .line 13
    iget v1, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:I

    .line 14
    .line 15
    if-ge v1, p1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    aget-object v2, v0, p1

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 23
    .line 24
    sub-int v2, v1, p1

    .line 25
    .line 26
    invoke-interface {p0, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v1, "."

    .line 31
    .line 32
    invoke-static {v1, p0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    aput-object p0, v0, p1

    .line 37
    .line 38
    :cond_2
    aget-object p0, v0, p1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method


# virtual methods
.method public invokeMethod(Lbsh/Interpreter;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    invoke-virtual {p1}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p3}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v4, p0, Lbsh/Name;->classOfStaticMethod:Ljava/lang/Class;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sget-object p1, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    invoke-virtual {p1, v4, v3, p2}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lbsh/Name;->classOfStaticMethod:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-static {v2, p0, v3, p2, p4}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏哲兰(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    iget-object v4, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v4}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/Name;->invokeLocalMethod(Lbsh/Interpreter;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    iget-object v4, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v4}, Lbsh/Name;->prefix(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v5, "super"

    .line 52
    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    iget-object v5, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v5}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    const/4 v6, 0x2

    .line 66
    if-ne v5, v6, :cond_4

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5, p4}, Lbsh/NameSpace;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lbsh/Name;->getClassNameSpace(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    invoke-virtual {v5}, Lbsh/NameSpace;->getClassInstance()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget-object p0, v5, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 90
    .line 91
    sget-object p1, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 92
    .line 93
    invoke-virtual {p1, v4, v3, p2}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 97
    .line 98
    if-nez p1, :cond_2

    .line 99
    .line 100
    new-instance p1, Lbsh/飘花落叶言子楪哲兰苏世;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    sput-object p1, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 106
    .line 107
    :cond_2
    sget-object p1, Lbsh/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance p3, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    sget-object p4, Lbsh/This$Keys;->BSHSUPER:Lbsh/This$Keys;

    .line 126
    .line 127
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p4

    .line 134
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object p4

    .line 148
    const/4 v0, 0x0

    .line 149
    invoke-static {p1, p3, p4, v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-eqz p1, :cond_3

    .line 154
    .line 155
    invoke-virtual {p1, v4, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_3
    const/4 v7, 0x0

    .line 161
    move-object v6, p2

    .line 162
    move-object v5, v3

    .line 163
    move-object v3, p0

    .line 164
    invoke-static/range {v2 .. v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰哲苏(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0, v4, v6}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :cond_4
    move-object v6, p2

    .line 174
    invoke-virtual {v0, v4}, Lbsh/NameSpace;->getNameResolver(Ljava/lang/String;)Lbsh/Name;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    move-object v0, v2

    .line 179
    invoke-virtual {p2, p3, p1}, Lbsh/Name;->toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    sget-object v4, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 184
    .line 185
    if-eq v2, v4, :cond_9

    .line 186
    .line 187
    instance-of v4, v2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 188
    .line 189
    if-nez v4, :cond_8

    .line 190
    .line 191
    instance-of p0, v2, Lbsh/Primitive;

    .line 192
    .line 193
    if-eqz p0, :cond_6

    .line 194
    .line 195
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 196
    .line 197
    if-eq v2, p0, :cond_5

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_5
    new-instance p0, Lbsh/UtilTargetError;

    .line 201
    .line 202
    new-instance p1, Ljava/lang/NullPointerException;

    .line 203
    .line 204
    new-instance p3, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string p4, "Null Pointer in Method Invocation of "

    .line 207
    .line 208
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string p4, "() on variable: "

    .line 215
    .line 216
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {p0, p1}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    throw p0

    .line 233
    :cond_6
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-eqz p0, :cond_7

    .line 242
    .line 243
    invoke-static {v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    if-eqz p0, :cond_7

    .line 248
    .line 249
    invoke-static {v6}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    invoke-virtual {p0, v3, p2, v1}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    if-eqz p0, :cond_7

    .line 258
    .line 259
    invoke-virtual {p0, v6, p1, p3, p4}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    :cond_7
    sget-object p0, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 265
    .line 266
    invoke-virtual {p0, v2, v3, v6}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    move-object v5, p1

    .line 270
    move-object v7, p4

    .line 271
    move-object v4, v6

    .line 272
    move-object v6, p3

    .line 273
    invoke-static/range {v2 .. v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :cond_8
    move-object v7, p4

    .line 279
    const-string p1, "invokeMethod: trying static - "

    .line 280
    .line 281
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    check-cast v2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 289
    .line 290
    iget-object p1, v2, Lbsh/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 291
    .line 292
    iput-object p1, p0, Lbsh/Name;->classOfStaticMethod:Ljava/lang/Class;

    .line 293
    .line 294
    sget-object p0, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;

    .line 295
    .line 296
    invoke-virtual {p0, p1, v3, v6}, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v0, p1, v3, v6, v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏哲兰(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    return-object p0

    .line 304
    :cond_9
    new-instance p0, Lbsh/UtilEvalError;

    .line 305
    .line 306
    new-instance p1, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string p3, "Attempt to resolve method: "

    .line 309
    .line 310
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string p3, "() on undefined variable or class name: "

    .line 317
    .line 318
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw p0
.end method

.method public resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "this"

    .line 2
    .line 3
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_6

    .line 9
    .line 10
    move-object p1, p2

    .line 11
    :goto_0
    if-eqz p1, :cond_2

    .line 12
    .line 13
    sget-object p4, Lbsh/This$Keys;->BSHEXTENSIONMETHODRECEIVER:Lbsh/This$Keys;

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    invoke-virtual {p1, p4, v2}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;Z)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 24
    .line 25
    if-eq p4, v0, :cond_0

    .line 26
    .line 27
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 28
    .line 29
    if-eq p4, v0, :cond_0

    .line 30
    .line 31
    return-object p4

    .line 32
    :cond_0
    iget-boolean p4, p1, Lbsh/NameSpace;->isClass:Z

    .line 33
    .line 34
    if-eqz p4, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    if-nez p5, :cond_5

    .line 43
    .line 44
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p2}, Lbsh/Name;->getClassNameSpace(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    iget-object p0, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p0}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_3
    invoke-virtual {p2}, Lbsh/NameSpace;->getClassInstance()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    return-object p1

    .line 77
    :cond_5
    new-instance p0, Lbsh/UtilEvalError;

    .line 78
    .line 79
    const-string p1, "Redundant to call .this on This type"

    .line 80
    .line 81
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_6
    const-string v1, "super"

    .line 86
    .line 87
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getSuper(Lbsh/Interpreter;)Lbsh/This;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-eqz p2, :cond_7

    .line 106
    .line 107
    invoke-virtual {p1}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    iget-boolean p2, p2, Lbsh/NameSpace;->isClass:Z

    .line 112
    .line 113
    if-eqz p2, :cond_7

    .line 114
    .line 115
    invoke-virtual {p1, p3}, Lbsh/NameSpace;->getSuper(Lbsh/Interpreter;)Lbsh/This;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    :cond_7
    return-object p0

    .line 120
    :cond_8
    const-string v1, "global"

    .line 121
    .line 122
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    const/4 v3, 0x0

    .line 127
    if-eqz v1, :cond_9

    .line 128
    .line 129
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getGlobal(Lbsh/Interpreter;)Lbsh/This;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    goto :goto_2

    .line 134
    :cond_9
    move-object v1, v3

    .line 135
    :goto_2
    if-nez v1, :cond_e

    .line 136
    .line 137
    if-eqz p5, :cond_e

    .line 138
    .line 139
    const-string v4, "namespace"

    .line 140
    .line 141
    invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_a

    .line 146
    .line 147
    move-object v1, p2

    .line 148
    goto :goto_3

    .line 149
    :cond_a
    const-string v4, "variables"

    .line 150
    .line 151
    invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_b

    .line 156
    .line 157
    invoke-virtual {p2}, Lbsh/NameSpace;->getVariableNames()[Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    goto :goto_3

    .line 162
    :cond_b
    const-string v4, "methods"

    .line 163
    .line 164
    invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_c

    .line 169
    .line 170
    invoke-virtual {p2}, Lbsh/NameSpace;->getMethodNames()[Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto :goto_3

    .line 175
    :cond_c
    const-string v4, "interpreter"

    .line 176
    .line 177
    invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_e

    .line 182
    .line 183
    iget-object v1, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_d

    .line 190
    .line 191
    move-object v1, p3

    .line 192
    goto :goto_3

    .line 193
    :cond_d
    new-instance p0, Lbsh/UtilEvalError;

    .line 194
    .line 195
    const-string p1, "Can only call .interpreter on literal \'this\'"

    .line 196
    .line 197
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p0

    .line 201
    :cond_e
    :goto_3
    const/4 v4, 0x1

    .line 202
    const-string v5, "no callstack"

    .line 203
    .line 204
    if-nez v1, :cond_12

    .line 205
    .line 206
    if-eqz p5, :cond_12

    .line 207
    .line 208
    const-string v6, "caller"

    .line 209
    .line 210
    invoke-virtual {p4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eqz v7, :cond_12

    .line 215
    .line 216
    iget-object p2, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    if-nez p2, :cond_10

    .line 223
    .line 224
    iget-object p2, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-eqz p2, :cond_f

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_f
    new-instance p0, Lbsh/UtilEvalError;

    .line 234
    .line 235
    const-string p1, "Can only call .caller on literal \'this\' or literal \'.caller\'"

    .line 236
    .line 237
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw p0

    .line 241
    :cond_10
    :goto_4
    if-eqz p1, :cond_11

    .line 242
    .line 243
    iget p2, p0, Lbsh/Name;->callstackDepth:I

    .line 244
    .line 245
    add-int/2addr p2, v4

    .line 246
    iput p2, p0, Lbsh/Name;->callstackDepth:I

    .line 247
    .line 248
    invoke-virtual {p1, p2}, Lbsh/CallStack;->get(I)Lbsh/NameSpace;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :cond_11
    invoke-static {v5}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-object v3

    .line 261
    :cond_12
    if-nez v1, :cond_15

    .line 262
    .line 263
    if-eqz p5, :cond_15

    .line 264
    .line 265
    const-string p3, "callstack"

    .line 266
    .line 267
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p3

    .line 271
    if-eqz p3, :cond_15

    .line 272
    .line 273
    iget-object p3, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p3

    .line 279
    if-eqz p3, :cond_14

    .line 280
    .line 281
    if-eqz p1, :cond_13

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_13
    invoke-static {v5}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-object v3

    .line 288
    :cond_14
    new-instance p0, Lbsh/UtilEvalError;

    .line 289
    .line 290
    const-string p1, "Can only call .callstack on literal \'this\'"

    .line 291
    .line 292
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw p0

    .line 296
    :cond_15
    move-object p1, v1

    .line 297
    :goto_5
    if-nez p1, :cond_17

    .line 298
    .line 299
    iget-object p0, p0, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 300
    .line 301
    if-nez p0, :cond_16

    .line 302
    .line 303
    move v2, v4

    .line 304
    :cond_16
    invoke-virtual {p2, p4, v2}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;Z)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    :cond_17
    if-nez p1, :cond_18

    .line 309
    .line 310
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 311
    .line 312
    return-object p0

    .line 313
    :cond_18
    return-object p1
.end method

.method public declared-synchronized toClass()Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-string v0, "Class: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lbsh/Name;->asClass:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lbsh/Name;->reset()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "var"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v1, :cond_4

    .line 23
    .line 24
    iget-object v1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 25
    .line 26
    const-string v3, "val"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 36
    .line 37
    iget-object v3, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    :try_start_2
    invoke-virtual {p0, v2, v2, v3}, Lbsh/Name;->toObject(Lbsh/CallStack;Lbsh/Interpreter;Z)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    :catch_0
    :goto_0
    :try_start_3
    instance-of v3, v2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    check-cast v2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 58
    .line 59
    iget-object v1, v2, Lbsh/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 60
    .line 61
    :cond_2
    if-eqz v1, :cond_3

    .line 62
    .line 63
    iput-object v1, p0, Lbsh/Name;->asClass:Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 64
    .line 65
    monitor-exit p0

    .line 66
    return-object v1

    .line 67
    :cond_3
    :try_start_4
    new-instance v1, Ljava/lang/ClassNotFoundException;

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v0, " not found in namespace"

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {v1, v0}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_4
    :goto_1
    iput-object v2, p0, Lbsh/Name;->asClass:Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 93
    .line 94
    monitor-exit p0

    .line 95
    return-object v2

    .line 96
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    throw v0
.end method

.method public declared-synchronized toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lbsh/Name;->reset()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object p1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 15
    .line 16
    const-string p2, "this"

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 25
    .line 26
    iget-boolean p2, p1, Lbsh/NameSpace;->isClass:Z

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    new-instance p2, Lbsh/LHS;

    .line 31
    .line 32
    iget-object v0, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {p2, p1, v0}, Lbsh/LHS;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    new-instance p2, Lbsh/LHS;

    .line 42
    .line 43
    iget-object v0, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p2, p1, v0, v1}, Lbsh/LHS;-><init>(Lbsh/NameSpace;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    :goto_0
    monitor-exit p0

    .line 49
    return-object p2

    .line 50
    :cond_1
    :try_start_1
    new-instance p1, Lbsh/UtilEvalError;

    .line 51
    .line 52
    const-string p2, "Can\'t assign to \'this\'."

    .line 53
    .line 54
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    :cond_2
    const/4 v0, 0x0

    .line 59
    :goto_1
    :try_start_2
    iget-object v2, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-static {v2}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-direct {p0, p1, p2, v1, v3}, Lbsh/Name;->consumeNextObjectField(Lbsh/CallStack;Lbsh/Interpreter;ZZ)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    goto :goto_1

    .line 75
    :catch_0
    move-exception p1

    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_3
    :try_start_3
    iget-object p1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 79
    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    instance-of p2, v0, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 83
    .line 84
    if-nez p2, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    new-instance p1, Lbsh/UtilEvalError;

    .line 88
    .line 89
    new-instance p2, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v0, "Can\'t assign to class: "

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_5
    :goto_2
    if-eqz v0, :cond_a

    .line 113
    .line 114
    instance-of p2, v0, Lbsh/This;

    .line 115
    .line 116
    if-eqz p2, :cond_7

    .line 117
    .line 118
    const-string p2, "namespace"

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_6

    .line 125
    .line 126
    iget-object p1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 127
    .line 128
    const-string p2, "variables"

    .line 129
    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_6

    .line 135
    .line 136
    iget-object p1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 137
    .line 138
    const-string p2, "methods"

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-nez p1, :cond_6

    .line 145
    .line 146
    iget-object p1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 147
    .line 148
    const-string p2, "caller"

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_6

    .line 155
    .line 156
    const-string p1, "found This reference evaluating LHS"

    .line 157
    .line 158
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 166
    .line 167
    const-string p2, "super"

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    xor-int/2addr p1, v3

    .line 174
    new-instance p2, Lbsh/LHS;

    .line 175
    .line 176
    check-cast v0, Lbsh/This;

    .line 177
    .line 178
    iget-object v0, v0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 179
    .line 180
    iget-object v1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 181
    .line 182
    invoke-direct {p2, v0, v1, p1}, Lbsh/LHS;-><init>(Lbsh/NameSpace;Ljava/lang/String;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 183
    .line 184
    .line 185
    monitor-exit p0

    .line 186
    return-object p2

    .line 187
    :cond_6
    :try_start_4
    new-instance p1, Lbsh/UtilEvalError;

    .line 188
    .line 189
    new-instance p2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v0, "Can\'t assign to special variable: "

    .line 195
    .line 196
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 212
    :cond_7
    if-eqz p1, :cond_9

    .line 213
    .line 214
    :try_start_5
    instance-of p2, v0, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 215
    .line 216
    if-eqz p2, :cond_8

    .line 217
    .line 218
    move-object p2, v0

    .line 219
    check-cast p2, Lbsh/飘花落叶言子楪兰哲世苏;

    .line 220
    .line 221
    iget-object p2, p2, Lbsh/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 222
    .line 223
    invoke-static {p2, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Lbsh/LHS;

    .line 224
    .line 225
    .line 226
    move-result-object p1
    :try_end_5
    .catch Lbsh/ReflectError; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 227
    monitor-exit p0

    .line 228
    return-object p1

    .line 229
    :cond_8
    :try_start_6
    invoke-static {v0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 230
    .line 231
    .line 232
    move-result-object p1
    :try_end_6
    .catch Lbsh/ReflectError; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 233
    monitor-exit p0

    .line 234
    return-object p1

    .line 235
    :catch_1
    :try_start_7
    new-instance p1, Lbsh/LHS;

    .line 236
    .line 237
    iget-object p2, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 238
    .line 239
    invoke-direct {p1, v0, p2}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 240
    .line 241
    .line 242
    monitor-exit p0

    .line 243
    return-object p1

    .line 244
    :cond_9
    :try_start_8
    new-instance p1, Lbsh/InterpreterError;

    .line 245
    .line 246
    const-string p2, "Internal error in lhs..."

    .line 247
    .line 248
    invoke-direct {p1, p2}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p1

    .line 252
    :cond_a
    new-instance p1, Lbsh/UtilEvalError;

    .line 253
    .line 254
    new-instance p2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const-string v0, "Error in LHS: "

    .line 260
    .line 261
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 265
    .line 266
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p1

    .line 277
    :goto_3
    new-instance p2, Lbsh/UtilEvalError;

    .line 278
    .line 279
    new-instance v0, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    const-string v1, "LHS evaluation: "

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-direct {p2, v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    throw p2

    .line 304
    :goto_4
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 305
    throw p1
.end method

.method public toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, p1, p2, v0}, Lbsh/Name;->toObject(Lbsh/CallStack;Lbsh/Interpreter;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public declared-synchronized toObject(Lbsh/CallStack;Lbsh/Interpreter;Z)Ljava/lang/Object;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lbsh/Name;->reset()V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3, v0}, Lbsh/Name;->consumeNextObjectField(Lbsh/CallStack;Lbsh/Interpreter;ZZ)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :cond_1
    :try_start_1
    new-instance p1, Lbsh/InterpreterError;

    .line 23
    .line 24
    const-string p2, "null value in toObject()"

    .line 25
    .line 26
    invoke-direct {p1, p2}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
