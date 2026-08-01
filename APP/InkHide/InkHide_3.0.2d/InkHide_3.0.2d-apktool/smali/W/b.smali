.class public final LW/b;
.super LT/y;
.source "SourceFile"


# static fields
.field public static final d:LW/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LW/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LW/b;->d:LW/a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LT/l;LT/y;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LW/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LW/s;

    invoke-direct {v0, p1, p2, p3}, LW/s;-><init>(LT/l;LT/y;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, LW/b;->b:Ljava/lang/Object;

    .line 3
    iput-object p3, p0, LW/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LT/l;Ljava/lang/reflect/Type;LT/y;LV/p;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LW/b;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, LW/s;

    invoke-direct {v0, p1, p3, p2}, LW/s;-><init>(LT/l;LT/y;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, LW/b;->b:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, LW/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LW/f;II)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, LW/b;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LW/b;->b:Ljava/lang/Object;

    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LW/b;->c:Ljava/lang/Object;

    .line 10
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p2, p3, p1}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 12
    invoke-static {p2, p3}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_0
    sget p1, LV/i;->a:I

    const/16 v1, 0x9

    if-lt p1, v1, :cond_1

    .line 14
    invoke-static {p2, p3}, LV/d;->h(II)Ljava/text/SimpleDateFormat;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public constructor <init>(LW/t;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LW/b;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, LW/b;->b:Ljava/lang/Object;

    iput-object p2, p0, LW/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lb0/b;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LW/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LW/t;

    .line 9
    .line 10
    iget-object v0, v0, LW/t;->c:LT/y;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, LW/b;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v2, LT/p;

    .line 30
    .line 31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v4, "Expected a "

    .line 34
    .line 35
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, " but was "

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, "; at path "

    .line 62
    .line 63
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v2

    .line 81
    :cond_1
    :goto_0
    return-object v0

    .line 82
    :pswitch_0
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/16 v1, 0x9

    .line 87
    .line 88
    if-ne v0, v1, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {p1}, Lb0/b;->v()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v1, p0, LW/b;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Ljava/util/ArrayList;

    .line 102
    .line 103
    monitor-enter v1

    .line 104
    :try_start_0
    iget-object v2, p0, LW/b;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    :catch_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_3

    .line 117
    .line 118
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Ljava/text/DateFormat;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    :try_start_1
    invoke-virtual {v3, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 125
    .line 126
    .line 127
    move-result-object p1
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    :try_start_2
    monitor-exit v1

    .line 129
    goto :goto_1

    .line 130
    :catchall_0
    move-exception p1

    .line 131
    goto :goto_3

    .line 132
    :cond_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    :try_start_3
    new-instance v1, Ljava/text/ParsePosition;

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-direct {v1, v2}, Ljava/text/ParsePosition;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v1}, LX/a;->b(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    .line 140
    .line 141
    .line 142
    move-result-object p1
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_1

    .line 143
    :goto_1
    iget-object v0, p0, LW/b;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, LW/f;

    .line 146
    .line 147
    invoke-virtual {v0, p1}, LW/f;->a(Ljava/util/Date;)Ljava/util/Date;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :goto_2
    return-object p1

    .line 152
    :catch_1
    move-exception v1

    .line 153
    new-instance v2, LT/p;

    .line 154
    .line 155
    const-string v3, "Failed parsing \'"

    .line 156
    .line 157
    const-string v4, "\' as Date; at path "

    .line 158
    .line 159
    invoke-static {v3, v0, v4}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p1}, Lb0/b;->j()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw v2

    .line 178
    :goto_3
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 179
    throw p1

    .line 180
    :pswitch_1
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    const/16 v1, 0x9

    .line 185
    .line 186
    if-ne v0, v1, :cond_4

    .line 187
    .line 188
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 189
    .line 190
    .line 191
    const/4 p1, 0x0

    .line 192
    goto :goto_5

    .line 193
    :cond_4
    iget-object v0, p0, LW/b;->c:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, LV/p;

    .line 196
    .line 197
    invoke-interface {v0}, LV/p;->n()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/util/Collection;

    .line 202
    .line 203
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 204
    .line 205
    .line 206
    :goto_4
    invoke-virtual {p1}, Lb0/b;->k()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    iget-object v1, p0, LW/b;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v1, LW/s;

    .line 215
    .line 216
    iget-object v1, v1, LW/s;->c:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v1, LT/y;

    .line 219
    .line 220
    invoke-virtual {v1, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_5
    invoke-virtual {p1}, Lb0/b;->e()V

    .line 229
    .line 230
    .line 231
    move-object p1, v0

    .line 232
    :goto_5
    return-object p1

    .line 233
    :pswitch_2
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    const/16 v1, 0x9

    .line 238
    .line 239
    if-ne v0, v1, :cond_6

    .line 240
    .line 241
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 242
    .line 243
    .line 244
    const/4 p1, 0x0

    .line 245
    goto :goto_8

    .line 246
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 252
    .line 253
    .line 254
    :goto_6
    invoke-virtual {p1}, Lb0/b;->k()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_7

    .line 259
    .line 260
    iget-object v1, p0, LW/b;->b:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v1, LW/s;

    .line 263
    .line 264
    iget-object v1, v1, LW/s;->c:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v1, LT/y;

    .line 267
    .line 268
    invoke-virtual {v1, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_7
    invoke-virtual {p1}, Lb0/b;->e()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    iget-object v1, p0, LW/b;->c:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v1, Ljava/lang/Class;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_9

    .line 292
    .line 293
    invoke-static {v1, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    const/4 v2, 0x0

    .line 298
    :goto_7
    if-ge v2, p1, :cond_8

    .line 299
    .line 300
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    add-int/lit8 v2, v2, 0x1

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_8
    move-object p1, v1

    .line 311
    goto :goto_8

    .line 312
    :cond_9
    invoke-static {v1, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    check-cast p1, [Ljava/lang/Object;

    .line 317
    .line 318
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    :goto_8
    return-object p1

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lb0/c;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LW/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LW/t;

    .line 9
    .line 10
    iget-object v0, v0, LW/t;->c:LT/y;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, LT/y;->b(Lb0/c;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p2, Ljava/util/Date;

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, LW/b;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/text/DateFormat;

    .line 34
    .line 35
    iget-object v1, p0, LW/b;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    monitor-enter v1

    .line 40
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-virtual {p1, p2}, Lb0/c;->p(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1

    .line 52
    :pswitch_1
    check-cast p2, Ljava/util/Collection;

    .line 53
    .line 54
    if-nez p2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    invoke-virtual {p1}, Lb0/c;->b()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v1, p0, LW/b;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, LW/s;

    .line 80
    .line 81
    invoke-virtual {v1, p1, v0}, LW/s;->b(Lb0/c;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {p1}, Lb0/c;->e()V

    .line 86
    .line 87
    .line 88
    :goto_2
    return-void

    .line 89
    :pswitch_2
    if-nez p2, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_3
    invoke-virtual {p1}, Lb0/c;->b()V

    .line 96
    .line 97
    .line 98
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    const/4 v1, 0x0

    .line 103
    :goto_3
    if-ge v1, v0, :cond_4

    .line 104
    .line 105
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v3, p0, LW/b;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, LW/s;

    .line 112
    .line 113
    invoke-virtual {v3, p1, v2}, LW/s;->b(Lb0/c;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    invoke-virtual {p1}, Lb0/c;->e()V

    .line 120
    .line 121
    .line 122
    :goto_4
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LW/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LW/b;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/text/DateFormat;

    .line 21
    .line 22
    instance-of v1, v0, Ljava/text/SimpleDateFormat;

    .line 23
    .line 24
    const/16 v2, 0x29

    .line 25
    .line 26
    const-string v3, "DefaultDateTypeAdapter("

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast v0, Ljava/text/SimpleDateFormat;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_0
    return-object v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
