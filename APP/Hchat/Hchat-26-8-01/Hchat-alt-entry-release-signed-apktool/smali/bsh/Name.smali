.class Lbsh/Name;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/Name$Parts;
    }
.end annotation


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
    invoke-static {}, Lbsh/Name$Parts;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-static {}, Lbsh/Name$Parts;->a()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
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
    const-string p2, "lastEvalName = "

    .line 11
    .line 12
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1
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
    move-result-object p1

    .line 27
    sget-object p2, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 28
    .line 29
    if-eq p1, p2, :cond_1

    .line 30
    .line 31
    iget-object p2, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 32
    .line 33
    sget-object p3, Lbsh/Name;->FINISHED:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {p0, p2, p3, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_0
    move-object v1, p0

    .line 41
    move-object v2, p1

    .line 42
    move-object v4, p2

    .line 43
    :cond_1
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    invoke-static {p1, p2}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object p1, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    instance-of v0, p1, Lbsh/This;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    :cond_2
    if-nez p3, :cond_4

    .line 59
    .line 60
    if-nez p1, :cond_3

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
    move-result-object p1

    .line 69
    move-object v1, p0

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    check-cast p1, Lbsh/This;

    .line 72
    .line 73
    iget-object v3, p1, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 74
    .line 75
    const/4 v6, 0x1

    .line 76
    move-object v1, p0

    .line 77
    invoke-virtual/range {v1 .. v6}, Lbsh/Name;->resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_0
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 82
    .line 83
    if-eq p1, v0, :cond_4

    .line 84
    .line 85
    iget-object p2, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p2}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-direct {p0, v5, p2, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :cond_4
    iget-object p1, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    if-nez p1, :cond_8

    .line 100
    .line 101
    const-string p1, "trying class: "

    .line 102
    .line 103
    iget-object v0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 104
    .line 105
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move p1, p2

    .line 113
    move-object v0, v2

    .line 114
    move-object v3, v0

    .line 115
    :goto_1
    iget-object v6, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v6}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-gt p1, v6, :cond_6

    .line 122
    .line 123
    iget-object v0, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v0, p1}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget-object v0, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 130
    .line 131
    invoke-virtual {v0, v3}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    add-int/lit8 p1, p1, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    :goto_2
    iget-object v6, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 142
    .line 143
    if-eqz v0, :cond_7

    .line 144
    .line 145
    invoke-static {v6}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    sub-int/2addr p2, p1

    .line 150
    invoke-static {v6, p2}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance p2, Lbsh/ClassIdentifier;

    .line 155
    .line 156
    invoke-direct {p2, v0}, Lbsh/ClassIdentifier;-><init>(Ljava/lang/Class;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, v3, p1, p2}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    return-object p1

    .line 164
    :cond_7
    const-string p1, "not a class, trying var prefix "

    .line 165
    .line 166
    filled-new-array {p1, v6}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    iget-object p1, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 174
    .line 175
    if-eqz p1, :cond_9

    .line 176
    .line 177
    instance-of v0, p1, Lbsh/This;

    .line 178
    .line 179
    if-eqz v0, :cond_c

    .line 180
    .line 181
    :cond_9
    if-nez p3, :cond_c

    .line 182
    .line 183
    if-eqz p4, :cond_c

    .line 184
    .line 185
    if-nez p1, :cond_a

    .line 186
    .line 187
    iget-object p1, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_a
    check-cast p1, Lbsh/This;

    .line 191
    .line 192
    iget-object p1, p1, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 193
    .line 194
    :goto_3
    new-instance p3, Lbsh/NameSpace;

    .line 195
    .line 196
    const-string p4, "auto: "

    .line 197
    .line 198
    invoke-static {p4, v5}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p4

    .line 202
    invoke-direct {p3, p1, p4}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3, v4}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    iget-object p4, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 210
    .line 211
    const/4 v0, 0x0

    .line 212
    if-nez p4, :cond_b

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_b
    move p2, v0

    .line 216
    :goto_4
    invoke-virtual {p1, v5, p3, v0, p2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;ZZ)Lbsh/Variable;

    .line 217
    .line 218
    .line 219
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {p1}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-direct {p0, v5, p1, p3}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    return-object p1

    .line 230
    :cond_c
    if-nez p1, :cond_e

    .line 231
    .line 232
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {p1}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-nez p1, :cond_d

    .line 239
    .line 240
    iget-object p1, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 241
    .line 242
    invoke-virtual {p1, v5, v4}, Lbsh/NameSpace;->getPropertyValue(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iget-object p2, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 247
    .line 248
    sget-object p3, Lbsh/Name;->FINISHED:Ljava/lang/String;

    .line 249
    .line 250
    invoke-direct {p0, p2, p3, p1}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    return-object p1

    .line 255
    :cond_d
    new-instance p1, Lbsh/UtilEvalError;

    .line 256
    .line 257
    iget-object p2, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 258
    .line 259
    new-instance p3, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string p4, "Class or variable not found: "

    .line 262
    .line 263
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
    :cond_e
    sget-object p4, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 278
    .line 279
    if-eq p1, p4, :cond_1b

    .line 280
    .line 281
    sget-object p4, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 282
    .line 283
    if-eq p1, p4, :cond_1a

    .line 284
    .line 285
    instance-of p4, p1, Lbsh/Primitive;

    .line 286
    .line 287
    if-nez p4, :cond_19

    .line 288
    .line 289
    instance-of p4, p1, Lbsh/ClassIdentifier;

    .line 290
    .line 291
    if-eqz p4, :cond_16

    .line 292
    .line 293
    check-cast p1, Lbsh/ClassIdentifier;

    .line 294
    .line 295
    invoke-virtual {p1}, Lbsh/ClassIdentifier;->getTargetClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iget-object p3, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 300
    .line 301
    invoke-static {p3, p2}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    const-string p3, "this"

    .line 306
    .line 307
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result p3

    .line 311
    if-eqz p3, :cond_11

    .line 312
    .line 313
    iget-object p3, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 314
    .line 315
    :goto_5
    if-eqz p3, :cond_10

    .line 316
    .line 317
    iget-object p4, p3, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 318
    .line 319
    if-eqz p4, :cond_f

    .line 320
    .line 321
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object p4

    .line 325
    if-ne p4, p1, :cond_f

    .line 326
    .line 327
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 328
    .line 329
    invoke-static {p1}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    iget-object p3, p3, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 334
    .line 335
    invoke-direct {p0, p2, p1, p3}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    return-object p1

    .line 340
    :cond_f
    invoke-virtual {p3}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 341
    .line 342
    .line 343
    move-result-object p3

    .line 344
    goto :goto_5

    .line 345
    :cond_10
    new-instance p2, Lbsh/UtilEvalError;

    .line 346
    .line 347
    const-string p3, "Can\'t find enclosing \'this\' instance of class: "

    .line 348
    .line 349
    invoke-static {p1, p3}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-direct {p2, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw p2

    .line 357
    :cond_11
    sget-object p3, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 358
    .line 359
    invoke-virtual {p3, p1, p2}, Lbsh/security/MainSecurityGuard;->canGetStaticField(Ljava/lang/Class;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    :try_start_0
    const-string p3, "Name call to getStaticFieldValue, class: "

    .line 363
    .line 364
    const-string p4, ", field:"

    .line 365
    .line 366
    filled-new-array {p3, p1, p4, p2}, [Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object p3

    .line 370
    invoke-static {p3}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    invoke-static {p1, p2}, Lbsh/Reflect;->getStaticFieldValue(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v2
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    goto :goto_6

    .line 378
    :catch_0
    move-exception v0

    .line 379
    move-object p3, v0

    .line 380
    const-string p4, "field reflect error: "

    .line 381
    .line 382
    filled-new-array {p4, p3}, [Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object p3

    .line 386
    invoke-static {p3}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    :goto_6
    if-nez v2, :cond_14

    .line 390
    .line 391
    new-instance p3, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p4

    .line 400
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string p4, "$"

    .line 404
    .line 405
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p3

    .line 415
    iget-object p4, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 416
    .line 417
    invoke-virtual {p4, p3}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    move-result-object p3

    .line 421
    iget-object p4, v1, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 422
    .line 423
    iget-object p4, p4, Lbsh/NameSpace;->classInstance:Ljava/lang/Object;

    .line 424
    .line 425
    if-nez p4, :cond_13

    .line 426
    .line 427
    invoke-static {p3}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 428
    .line 429
    .line 430
    move-result p4

    .line 431
    if-eqz p4, :cond_13

    .line 432
    .line 433
    invoke-static {p3}, Lbsh/Reflect;->getClassModifiers(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 434
    .line 435
    .line 436
    move-result-object p4

    .line 437
    const-string v0, "static"

    .line 438
    .line 439
    invoke-virtual {p4, v0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 440
    .line 441
    .line 442
    move-result p4

    .line 443
    if-eqz p4, :cond_12

    .line 444
    .line 445
    goto :goto_7

    .line 446
    :cond_12
    new-instance p3, Lbsh/UtilEvalError;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    new-instance p4, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    const-string v0, "an enclosing instance that contains "

    .line 455
    .line 456
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    const-string p1, "."

    .line 463
    .line 464
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    const-string p1, " is required"

    .line 471
    .line 472
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    invoke-direct {p3, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw p3

    .line 483
    :cond_13
    :goto_7
    if-eqz p3, :cond_14

    .line 484
    .line 485
    new-instance v2, Lbsh/ClassIdentifier;

    .line 486
    .line 487
    invoke-direct {v2, p3}, Lbsh/ClassIdentifier;-><init>(Ljava/lang/Class;)V

    .line 488
    .line 489
    .line 490
    :cond_14
    if-nez v2, :cond_15

    .line 491
    .line 492
    invoke-static {p1, p2}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    :cond_15
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 497
    .line 498
    invoke-static {p1}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    invoke-direct {p0, p2, p1, v2}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    return-object p1

    .line 507
    :cond_16
    if-nez p3, :cond_18

    .line 508
    .line 509
    iget-object p1, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 510
    .line 511
    invoke-static {p1, p2}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 516
    .line 517
    iget-object p3, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 518
    .line 519
    invoke-virtual {p2, p3, p1}, Lbsh/security/MainSecurityGuard;->canGetField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    const-string p2, "length"

    .line 523
    .line 524
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result p2

    .line 528
    if-eqz p2, :cond_17

    .line 529
    .line 530
    iget-object p2, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 531
    .line 532
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-result-object p2

    .line 536
    invoke-virtual {p2}, Ljava/lang/Class;->isArray()Z

    .line 537
    .line 538
    .line 539
    move-result p2

    .line 540
    if-eqz p2, :cond_17

    .line 541
    .line 542
    new-instance p2, Lbsh/Primitive;

    .line 543
    .line 544
    iget-object p3, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 545
    .line 546
    invoke-static {p3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 547
    .line 548
    .line 549
    move-result p3

    .line 550
    invoke-direct {p2, p3}, Lbsh/Primitive;-><init>(I)V

    .line 551
    .line 552
    .line 553
    iget-object p3, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 554
    .line 555
    invoke-static {p3}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p3

    .line 559
    invoke-direct {p0, p1, p3, p2}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    return-object p1

    .line 564
    :cond_17
    :try_start_1
    iget-object p2, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 565
    .line 566
    invoke-static {p2, p1}, Lbsh/Reflect;->getObjectFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object p2

    .line 570
    iget-object p3, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 571
    .line 572
    invoke-static {p3}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object p3

    .line 576
    invoke-direct {p0, p1, p3, p2}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object p1
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 580
    return-object p1

    .line 581
    :catch_1
    iget-object p2, v1, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 582
    .line 583
    invoke-static {p2, p1}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object p2

    .line 587
    iget-object p3, v1, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 588
    .line 589
    invoke-static {p3}, Lbsh/Name;->suffix(Ljava/lang/String;)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object p3

    .line 593
    invoke-direct {p0, p1, p3, p2}, Lbsh/Name;->completeRound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    return-object p1

    .line 598
    :cond_18
    new-instance p1, Lbsh/UtilEvalError;

    .line 599
    .line 600
    new-instance p2, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 603
    .line 604
    .line 605
    iget-object p3, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 606
    .line 607
    const-string p4, " does not resolve to a class name."

    .line 608
    .line 609
    invoke-static {p2, p3, p4}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object p2

    .line 613
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    throw p1

    .line 617
    :cond_19
    new-instance p1, Lbsh/UtilEvalError;

    .line 618
    .line 619
    iget-object p2, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 620
    .line 621
    new-instance p3, Ljava/lang/StringBuilder;

    .line 622
    .line 623
    const-string p4, "Can\'t treat primitive like an object. Error while evaluating: "

    .line 624
    .line 625
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object p2

    .line 635
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    throw p1

    .line 639
    :cond_1a
    new-instance p1, Lbsh/UtilEvalError;

    .line 640
    .line 641
    iget-object p2, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 642
    .line 643
    new-instance p3, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    const-string p4, "Undefined variable or class name while evaluating: "

    .line 646
    .line 647
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p2

    .line 657
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    throw p1

    .line 661
    :cond_1b
    new-instance p1, Lbsh/UtilTargetError;

    .line 662
    .line 663
    new-instance p2, Ljava/lang/NullPointerException;

    .line 664
    .line 665
    new-instance p3, Ljava/lang/StringBuilder;

    .line 666
    .line 667
    const-string p4, "Null Pointer while evaluating: "

    .line 668
    .line 669
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    iget-object p4, v1, Lbsh/Name;->value:Ljava/lang/String;

    .line 673
    .line 674
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object p3

    .line 681
    invoke-direct {p2, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    invoke-direct {p1, p2}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 685
    .line 686
    .line 687
    throw p1
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
    invoke-static {p0}, Lbsh/Name$Parts;->get(Ljava/lang/String;)Lbsh/Name$Parts;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Lbsh/Name$Parts;->count:I

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

.method private invokeLocalMethod(Lbsh/Interpreter;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;
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
    if-eqz p1, :cond_5

    .line 13
    .line 14
    iget-object v2, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p2}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :try_start_0
    sget-object v1, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 21
    .line 22
    invoke-virtual {v1, v2, p2}, Lbsh/security/MainSecurityGuard;->canInvokeLocalMethod(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_4

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    :try_start_1
    iget-object v5, p0, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 27
    .line 28
    const-string v7, "this"
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_1

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    move-object v3, p0

    .line 32
    move-object v6, p1

    .line 33
    move-object v4, p3

    .line 34
    :try_start_2
    invoke-virtual/range {v3 .. v8}, Lbsh/Name;->resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 38
    move-object p3, v3

    .line 39
    move-object v5, v4

    .line 40
    move-object v4, v6

    .line 41
    :try_start_3
    instance-of v3, p1, Lbsh/This;

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_2

    .line 49
    :cond_0
    move-object v9, p1

    .line 50
    goto :goto_1

    .line 51
    :catch_0
    move-object p3, v3

    .line 52
    move-object v5, v4

    .line 53
    move-object v4, v6

    .line 54
    goto :goto_0

    .line 55
    :catch_1
    move-object v4, p1

    .line 56
    move-object v5, p3

    .line 57
    move-object p3, p0

    .line 58
    :catch_2
    :goto_0
    move-object v9, v1

    .line 59
    :goto_1
    if-eqz v9, :cond_1

    .line 60
    .line 61
    :try_start_4
    sget-object p1, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 62
    .line 63
    if-eq v9, p1, :cond_1

    .line 64
    .line 65
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 66
    .line 67
    if-eq v9, p1, :cond_1

    .line 68
    .line 69
    iget-object p1, p3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 70
    .line 71
    invoke-static {v9}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1, v1, v2, v0}, Lbsh/NameSpace;->getExtensionMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_2

    .line 80
    :catch_3
    move-exception v0

    .line 81
    move-object p1, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_1
    :goto_2
    const/4 p1, 0x0

    .line 84
    if-nez v1, :cond_2

    .line 85
    .line 86
    iget-object v1, p3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 87
    .line 88
    invoke-virtual {v1, v2, v0, p1, p1}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;ZZ)Lbsh/BshMethod;

    .line 89
    .line 90
    .line 91
    move-result-object v1
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_3

    .line 92
    :cond_2
    move-object v3, v1

    .line 93
    goto :goto_4

    .line 94
    :goto_3
    const-string p2, "Local method invocation"

    .line 95
    .line 96
    invoke-virtual {p1, p2, p4, v5}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    throw p1

    .line 101
    :goto_4
    iget-object v1, p3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 102
    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    iget-boolean v0, v1, Lbsh/NameSpace;->isMethod:Z

    .line 106
    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    iget-boolean v0, v3, Lbsh/BshMethod;->isScriptedObject:Z

    .line 110
    .line 111
    if-nez v0, :cond_3

    .line 112
    .line 113
    iget-object v0, v3, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 114
    .line 115
    invoke-virtual {v1, v0}, Lbsh/NameSpace;->isChildOf(Lbsh/NameSpace;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    iget-object v0, p3, Lbsh/Name;->namespace:Lbsh/NameSpace;

    .line 122
    .line 123
    invoke-virtual {v0}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget-boolean v0, v0, Lbsh/NameSpace;->isClass:Z

    .line 128
    .line 129
    if-nez v0, :cond_3

    .line 130
    .line 131
    sget-object v0, Lbsh/Name;->noOverride:Ljava/util/regex/Pattern;

    .line 132
    .line 133
    invoke-virtual {v3}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_3

    .line 146
    .line 147
    const/4 p1, 0x1

    .line 148
    :cond_3
    move v8, p1

    .line 149
    move-object v7, p4

    .line 150
    move-object v6, v5

    .line 151
    move-object v5, v4

    .line 152
    move-object v4, p2

    .line 153
    invoke-virtual/range {v3 .. v9}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;ZLjava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    return-object p1

    .line 158
    :cond_4
    move-object v3, p2

    .line 159
    move-object v6, p4

    .line 160
    invoke-virtual/range {v1 .. v6}, Lbsh/NameSpace;->invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :catch_4
    move-exception v0

    .line 166
    move-object v5, p3

    .line 167
    move-object v6, p4

    .line 168
    move-object p3, p0

    .line 169
    move-object p1, v0

    .line 170
    invoke-virtual {p1, v6, v5}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    throw p1

    .line 175
    :cond_5
    move-object p3, p0

    .line 176
    const-string p1, "invokeLocalMethod: interpreter = null"

    .line 177
    .line 178
    invoke-static {p1}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const/4 p1, 0x0

    .line 182
    return-object p1
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

    .line 14
    invoke-static {p0}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p0, v0}, Lbsh/Name;->prefix(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static prefix(Ljava/lang/String;I)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {p0}, Lbsh/Name$Parts;->get(Ljava/lang/String;)Lbsh/Name$Parts;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lbsh/Name$Parts;->prefix(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
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

    .line 14
    invoke-static {p0}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p0, v0}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static suffix(Ljava/lang/String;I)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {p0}, Lbsh/Name$Parts;->get(Ljava/lang/String;)Lbsh/Name$Parts;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Lbsh/Name$Parts;->suffix(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public invokeMethod(Lbsh/Interpreter;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;
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
    move-object v6, v3

    .line 9
    invoke-virtual {p1}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {p3}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Lbsh/Name;->classOfStaticMethod:Ljava/lang/Class;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sget-object p1, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 22
    .line 23
    invoke-virtual {p1, v2, v6, p2}, Lbsh/security/MainSecurityGuard;->canInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lbsh/Name;->classOfStaticMethod:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {v3, p1, v6, p2, p4}, Lbsh/Reflect;->invokeStaticMethod(Lbsh/BshClassManager;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Node;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    iget-object v2, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/Name;->invokeLocalMethod(Lbsh/Interpreter;[Ljava/lang/Object;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    iget-object v2, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2}, Lbsh/Name;->prefix(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v4, "super"

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    iget-object v4, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v4}, Lbsh/Name;->countParts(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const/4 v5, 0x2

    .line 67
    if-ne v4, v5, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v4, p4}, Lbsh/NameSpace;->setNode(Lbsh/Node;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v4}, Lbsh/Name;->getClassNameSpace(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    move-object v5, v4

    .line 87
    invoke-virtual {v5}, Lbsh/NameSpace;->getClassInstance()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-object v5, v5, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 92
    .line 93
    sget-object p1, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 94
    .line 95
    invoke-virtual {p1, v4, v6, p2}, Lbsh/security/MainSecurityGuard;->canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {}, Lbsh/ClassGenerator;->getClassGenerator()Lbsh/ClassGenerator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    move-object v7, p2

    .line 103
    invoke-virtual/range {v2 .. v7}, Lbsh/ClassGenerator;->invokeSuperclassMethod(Lbsh/BshClassManager;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_2
    move-object v4, p2

    .line 109
    invoke-virtual {v0, v2}, Lbsh/NameSpace;->getNameResolver(Ljava/lang/String;)Lbsh/Name;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p2, p3, p1}, Lbsh/Name;->toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 118
    .line 119
    if-eq v2, v0, :cond_8

    .line 120
    .line 121
    instance-of v0, v2, Lbsh/ClassIdentifier;

    .line 122
    .line 123
    if-nez v0, :cond_6

    .line 124
    .line 125
    instance-of v0, v2, Lbsh/Primitive;

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 130
    .line 131
    if-eq v2, v0, :cond_3

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_3
    new-instance p1, Lbsh/UtilTargetError;

    .line 135
    .line 136
    new-instance p3, Ljava/lang/NullPointerException;

    .line 137
    .line 138
    new-instance p4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v0, "Null Pointer in Method Invocation of "

    .line 141
    .line 142
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v0, "() on variable: "

    .line 149
    .line 150
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-direct {p3, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {p1, p3}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_4
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_5

    .line 176
    .line 177
    invoke-static {v2}, Lbsh/Reflect;->getThisNS(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    if-eqz p2, :cond_5

    .line 182
    .line 183
    invoke-static {v4}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {p2, v6, v0, v1}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    if-eqz p2, :cond_5

    .line 192
    .line 193
    invoke-virtual {p2, v4, p1, p3, p4}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1

    .line 198
    :cond_5
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 199
    .line 200
    invoke-virtual {p2, v2, v6, v4}, Lbsh/security/MainSecurityGuard;->canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    move-object v5, p1

    .line 204
    move-object v7, p4

    .line 205
    move-object v3, v6

    .line 206
    move-object v6, p3

    .line 207
    invoke-static/range {v2 .. v7}, Lbsh/Reflect;->invokeObjectMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    return-object p1

    .line 212
    :cond_6
    move-object v7, p4

    .line 213
    const-string p1, "invokeMethod: trying static - "

    .line 214
    .line 215
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    check-cast v2, Lbsh/ClassIdentifier;

    .line 223
    .line 224
    invoke-virtual {v2}, Lbsh/ClassIdentifier;->getTargetClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iput-object p1, p0, Lbsh/Name;->classOfStaticMethod:Ljava/lang/Class;

    .line 229
    .line 230
    if-eqz p1, :cond_7

    .line 231
    .line 232
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 233
    .line 234
    invoke-virtual {p2, p1, v6, v4}, Lbsh/security/MainSecurityGuard;->canInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v3, p1, v6, v4, v7}, Lbsh/Reflect;->invokeStaticMethod(Lbsh/BshClassManager;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Node;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    return-object p1

    .line 242
    :cond_7
    new-instance p1, Lbsh/UtilEvalError;

    .line 243
    .line 244
    new-instance p3, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string p4, "invokeMethod: unknown target: "

    .line 247
    .line 248
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw p1

    .line 262
    :cond_8
    new-instance p1, Lbsh/UtilEvalError;

    .line 263
    .line 264
    new-instance p3, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string p4, "Attempt to resolve method: "

    .line 267
    .line 268
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string p4, "() on undefined variable or class name: "

    .line 275
    .line 276
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw p1
.end method

.method public resolveThisFieldReference(Lbsh/CallStack;Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 7

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
    iget-object p1, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_3
    invoke-virtual {p2}, Lbsh/NameSpace;->getClassInstance()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_4
    return-object p1

    .line 76
    :cond_5
    new-instance p1, Lbsh/UtilEvalError;

    .line 77
    .line 78
    const-string p2, "Redundant to call .this on This type"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_6
    const-string v1, "super"

    .line 85
    .line 86
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_8

    .line 91
    .line 92
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getSuper(Lbsh/Interpreter;)Lbsh/This;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p2}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    if-eqz p4, :cond_7

    .line 105
    .line 106
    invoke-virtual {p2}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 107
    .line 108
    .line 109
    move-result-object p4

    .line 110
    iget-boolean p4, p4, Lbsh/NameSpace;->isClass:Z

    .line 111
    .line 112
    if-eqz p4, :cond_7

    .line 113
    .line 114
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getSuper(Lbsh/Interpreter;)Lbsh/This;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_7
    return-object p1

    .line 119
    :cond_8
    const-string v1, "global"

    .line 120
    .line 121
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_9

    .line 126
    .line 127
    invoke-virtual {p2, p3}, Lbsh/NameSpace;->getGlobal(Lbsh/Interpreter;)Lbsh/This;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    goto :goto_2

    .line 132
    :cond_9
    const/4 v1, 0x0

    .line 133
    :goto_2
    if-nez v1, :cond_e

    .line 134
    .line 135
    if-eqz p5, :cond_e

    .line 136
    .line 137
    const-string v3, "namespace"

    .line 138
    .line 139
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_a

    .line 144
    .line 145
    move-object v1, p2

    .line 146
    goto :goto_3

    .line 147
    :cond_a
    const-string v3, "variables"

    .line 148
    .line 149
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_b

    .line 154
    .line 155
    invoke-virtual {p2}, Lbsh/NameSpace;->getVariableNames()[Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    goto :goto_3

    .line 160
    :cond_b
    const-string v3, "methods"

    .line 161
    .line 162
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_c

    .line 167
    .line 168
    invoke-virtual {p2}, Lbsh/NameSpace;->getMethodNames()[Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    goto :goto_3

    .line 173
    :cond_c
    const-string v3, "interpreter"

    .line 174
    .line 175
    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_e

    .line 180
    .line 181
    iget-object v1, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_d

    .line 188
    .line 189
    move-object v1, p3

    .line 190
    goto :goto_3

    .line 191
    :cond_d
    new-instance p1, Lbsh/UtilEvalError;

    .line 192
    .line 193
    const-string p2, "Can only call .interpreter on literal \'this\'"

    .line 194
    .line 195
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :cond_e
    :goto_3
    const/4 v3, 0x1

    .line 200
    const-string v4, "no callstack"

    .line 201
    .line 202
    if-nez v1, :cond_12

    .line 203
    .line 204
    if-eqz p5, :cond_12

    .line 205
    .line 206
    const-string v5, "caller"

    .line 207
    .line 208
    invoke-virtual {p4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_12

    .line 213
    .line 214
    iget-object p2, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    if-nez p2, :cond_10

    .line 221
    .line 222
    iget-object p2, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    if-eqz p2, :cond_f

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_f
    new-instance p1, Lbsh/UtilEvalError;

    .line 232
    .line 233
    const-string p2, "Can only call .caller on literal \'this\' or literal \'.caller\'"

    .line 234
    .line 235
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw p1

    .line 239
    :cond_10
    :goto_4
    if-eqz p1, :cond_11

    .line 240
    .line 241
    iget p2, p0, Lbsh/Name;->callstackDepth:I

    .line 242
    .line 243
    add-int/2addr p2, v3

    .line 244
    iput p2, p0, Lbsh/Name;->callstackDepth:I

    .line 245
    .line 246
    invoke-virtual {p1, p2}, Lbsh/CallStack;->get(I)Lbsh/NameSpace;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    return-object p1

    .line 255
    :cond_11
    invoke-static {v4}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    const/4 p1, 0x0

    .line 259
    return-object p1

    .line 260
    :cond_12
    if-nez v1, :cond_15

    .line 261
    .line 262
    if-eqz p5, :cond_15

    .line 263
    .line 264
    const-string p3, "callstack"

    .line 265
    .line 266
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p3

    .line 270
    if-eqz p3, :cond_15

    .line 271
    .line 272
    iget-object p3, p0, Lbsh/Name;->lastEvalName:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result p3

    .line 278
    if-eqz p3, :cond_14

    .line 279
    .line 280
    if-eqz p1, :cond_13

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_13
    invoke-static {v4}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    const/4 p1, 0x0

    .line 287
    return-object p1

    .line 288
    :cond_14
    new-instance p1, Lbsh/UtilEvalError;

    .line 289
    .line 290
    const-string p2, "Can only call .callstack on literal \'this\'"

    .line 291
    .line 292
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw p1

    .line 296
    :cond_15
    move-object p1, v1

    .line 297
    :goto_5
    if-nez p1, :cond_17

    .line 298
    .line 299
    iget-object p1, p0, Lbsh/Name;->evalBaseObject:Ljava/lang/Object;

    .line 300
    .line 301
    if-nez p1, :cond_16

    .line 302
    .line 303
    move v2, v3

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
    sget-object p1, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 311
    .line 312
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
    instance-of v3, v2, Lbsh/ClassIdentifier;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    check-cast v2, Lbsh/ClassIdentifier;

    .line 58
    .line 59
    invoke-virtual {v2}, Lbsh/ClassIdentifier;->getTargetClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_2
    if-eqz v1, :cond_3

    .line 64
    .line 65
    iput-object v1, p0, Lbsh/Name;->asClass:Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-object v1

    .line 69
    :cond_3
    :try_start_4
    new-instance v1, Ljava/lang/ClassNotFoundException;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, " not found in namespace"

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {v1, v0}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :cond_4
    :goto_1
    iput-object v2, p0, Lbsh/Name;->asClass:Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 95
    .line 96
    monitor-exit p0

    .line 97
    return-object v2

    .line 98
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 99
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
    instance-of p2, v0, Lbsh/ClassIdentifier;

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
    instance-of p2, v0, Lbsh/ClassIdentifier;

    .line 215
    .line 216
    if-eqz p2, :cond_8

    .line 217
    .line 218
    move-object p1, v0

    .line 219
    check-cast p1, Lbsh/ClassIdentifier;

    .line 220
    .line 221
    invoke-virtual {p1}, Lbsh/ClassIdentifier;->getTargetClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iget-object p2, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {p1, p2}, Lbsh/Reflect;->getLHSStaticField(Ljava/lang/Class;Ljava/lang/String;)Lbsh/LHS;

    .line 228
    .line 229
    .line 230
    move-result-object p1
    :try_end_5
    .catch Lbsh/ReflectError; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 231
    monitor-exit p0

    .line 232
    return-object p1

    .line 233
    :cond_8
    :try_start_6
    invoke-static {v0, p1}, Lbsh/Reflect;->getLHSObjectField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 234
    .line 235
    .line 236
    move-result-object p1
    :try_end_6
    .catch Lbsh/ReflectError; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 237
    monitor-exit p0

    .line 238
    return-object p1

    .line 239
    :catch_1
    :try_start_7
    new-instance p1, Lbsh/LHS;

    .line 240
    .line 241
    iget-object p2, p0, Lbsh/Name;->evalName:Ljava/lang/String;

    .line 242
    .line 243
    invoke-direct {p1, v0, p2}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 244
    .line 245
    .line 246
    monitor-exit p0

    .line 247
    return-object p1

    .line 248
    :cond_9
    :try_start_8
    new-instance p1, Lbsh/InterpreterError;

    .line 249
    .line 250
    const-string p2, "Internal error in lhs..."

    .line 251
    .line 252
    invoke-direct {p1, p2}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :cond_a
    new-instance p1, Lbsh/UtilEvalError;

    .line 257
    .line 258
    new-instance p2, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const-string v0, "Error in LHS: "

    .line 264
    .line 265
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw p1

    .line 281
    :goto_3
    new-instance p2, Lbsh/UtilEvalError;

    .line 282
    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const-string v1, "LHS evaluation: "

    .line 289
    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-direct {p2, v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    throw p2

    .line 308
    :goto_4
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 309
    throw p1
.end method

.method public toObject(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, p1, p2, v0}, Lbsh/Name;->toObject(Lbsh/CallStack;Lbsh/Interpreter;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Name;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
