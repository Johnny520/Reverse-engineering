.class public Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;


# static fields
.field static final CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

.field static final CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

.field static final CLASS_UNMODIFIABLE_SORTED_SET:Ljava/lang/Class;


# instance fields
.field final acceptHashCodes:[J

.field final classCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field final tclHashCaches:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Class;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/TreeSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSortedSet(Ljava/util/SortedSet;)Ljava/util/SortedSet;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->CLASS_UNMODIFIABLE_SORTED_SET:Ljava/lang/Class;

    .line 15
    .line 16
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

    .line 27
    .line 28
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 421
    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>(Z[Ljava/lang/String;)V

    return-void
.end method

.method public varargs constructor <init>(Z[Ljava/lang/Class;)V
    .locals 0

    .line 417
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 418
    invoke-static {p2}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->names(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object p2

    .line 419
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>(Z[Ljava/lang/String;)V

    return-void
.end method

.method public varargs constructor <init>(Z[Ljava/lang/String;)V
    .locals 105

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->tclHashCaches:Ljava/util/concurrent/ConcurrentMap;

    .line 14
    .line 15
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    const/high16 v3, 0x3f400000    # 0.75f

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const/16 v5, 0x10

    .line 21
    .line 22
    invoke-direct {v2, v5, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 23
    .line 24
    .line 25
    iput-object v2, v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->classCache:Ljava/util/Map;

    .line 26
    .line 27
    new-instance v2, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    const-class v4, Ljava/util/concurrent/TimeUnit;

    .line 36
    .line 37
    invoke-static {v4}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v36

    .line 45
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v55

    .line 51
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v56

    .line 57
    sget-object v57, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_SINGLE_SET:Ljava/lang/Class;

    .line 58
    .line 59
    sget-object v58, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_SINGLE_LIST:Ljava/lang/Class;

    .line 60
    .line 61
    sget-object v59, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

    .line 62
    .line 63
    sget-object v60, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 64
    .line 65
    sget-object v61, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

    .line 66
    .line 67
    sget-object v62, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->CLASS_UNMODIFIABLE_SORTED_SET:Ljava/lang/Class;

    .line 68
    .line 69
    new-instance v4, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v63

    .line 82
    new-instance v4, Ljava/util/TreeMap;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v64

    .line 95
    new-array v4, v3, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v65

    .line 105
    const-class v103, Ljava/lang/VerifyError;

    .line 106
    .line 107
    const-class v104, Ljava/lang/StackTraceElement;

    .line 108
    .line 109
    const-class v5, Ljava/lang/Object;

    .line 110
    .line 111
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 112
    .line 113
    const-class v7, Ljava/lang/Byte;

    .line 114
    .line 115
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 116
    .line 117
    const-class v9, Ljava/lang/Short;

    .line 118
    .line 119
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 120
    .line 121
    const-class v11, Ljava/lang/Integer;

    .line 122
    .line 123
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 124
    .line 125
    const-class v13, Ljava/lang/Long;

    .line 126
    .line 127
    sget-object v14, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 128
    .line 129
    const-class v15, Ljava/lang/Float;

    .line 130
    .line 131
    sget-object v16, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 132
    .line 133
    const-class v17, Ljava/lang/Double;

    .line 134
    .line 135
    const-class v18, Ljava/lang/Number;

    .line 136
    .line 137
    const-class v19, Ljava/math/BigInteger;

    .line 138
    .line 139
    const-class v20, Ljava/math/BigDecimal;

    .line 140
    .line 141
    const-class v21, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 142
    .line 143
    const-class v22, Ljava/util/concurrent/atomic/AtomicLong;

    .line 144
    .line 145
    const-class v23, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 146
    .line 147
    const-class v24, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 148
    .line 149
    const-class v25, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 150
    .line 151
    const-class v26, Ljava/util/concurrent/atomic/AtomicReference;

    .line 152
    .line 153
    sget-object v27, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 154
    .line 155
    const-class v28, Ljava/lang/Boolean;

    .line 156
    .line 157
    sget-object v29, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 158
    .line 159
    const-class v30, Ljava/lang/Character;

    .line 160
    .line 161
    const-class v31, Ljava/lang/String;

    .line 162
    .line 163
    const-class v32, Ljava/util/UUID;

    .line 164
    .line 165
    const-class v33, Ljava/util/Currency;

    .line 166
    .line 167
    const-class v34, Ljava/util/BitSet;

    .line 168
    .line 169
    const-class v35, Ljava/util/EnumSet;

    .line 170
    .line 171
    const-class v37, Ljava/util/Date;

    .line 172
    .line 173
    const-class v38, Ljava/util/Calendar;

    .line 174
    .line 175
    const-class v39, Ljava/time/LocalDate;

    .line 176
    .line 177
    const-class v40, Ljava/time/LocalDateTime;

    .line 178
    .line 179
    const-class v41, Ljava/time/Instant;

    .line 180
    .line 181
    const-class v42, Ljava/text/SimpleDateFormat;

    .line 182
    .line 183
    const-class v43, Ljava/time/format/DateTimeFormatter;

    .line 184
    .line 185
    const-class v44, Ljava/util/concurrent/TimeUnit;

    .line 186
    .line 187
    const-class v45, Ljava/util/Set;

    .line 188
    .line 189
    const-class v46, Ljava/util/HashSet;

    .line 190
    .line 191
    const-class v47, Ljava/util/LinkedHashSet;

    .line 192
    .line 193
    const-class v48, Ljava/util/TreeSet;

    .line 194
    .line 195
    const-class v49, Ljava/util/List;

    .line 196
    .line 197
    const-class v50, Ljava/util/ArrayList;

    .line 198
    .line 199
    const-class v51, Ljava/util/LinkedList;

    .line 200
    .line 201
    const-class v52, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 202
    .line 203
    const-class v53, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 204
    .line 205
    const-class v54, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 206
    .line 207
    const-class v66, Ljava/util/Map;

    .line 208
    .line 209
    const-class v67, Ljava/util/HashMap;

    .line 210
    .line 211
    const-class v68, Ljava/util/Hashtable;

    .line 212
    .line 213
    const-class v69, Ljava/util/TreeMap;

    .line 214
    .line 215
    const-class v70, Ljava/util/LinkedHashMap;

    .line 216
    .line 217
    const-class v71, Ljava/util/WeakHashMap;

    .line 218
    .line 219
    const-class v72, Ljava/util/IdentityHashMap;

    .line 220
    .line 221
    const-class v73, Ljava/util/concurrent/ConcurrentMap;

    .line 222
    .line 223
    const-class v74, Ljava/util/concurrent/ConcurrentHashMap;

    .line 224
    .line 225
    const-class v75, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 226
    .line 227
    const-class v76, Ljava/lang/Exception;

    .line 228
    .line 229
    const-class v77, Ljava/lang/IllegalAccessError;

    .line 230
    .line 231
    const-class v78, Ljava/lang/IllegalAccessException;

    .line 232
    .line 233
    const-class v79, Ljava/lang/IllegalArgumentException;

    .line 234
    .line 235
    const-class v80, Ljava/lang/IllegalMonitorStateException;

    .line 236
    .line 237
    const-class v81, Ljava/lang/IllegalStateException;

    .line 238
    .line 239
    const-class v82, Ljava/lang/IllegalThreadStateException;

    .line 240
    .line 241
    const-class v83, Ljava/lang/IndexOutOfBoundsException;

    .line 242
    .line 243
    const-class v84, Ljava/lang/InstantiationError;

    .line 244
    .line 245
    const-class v85, Ljava/lang/InstantiationException;

    .line 246
    .line 247
    const-class v86, Ljava/lang/InternalError;

    .line 248
    .line 249
    const-class v87, Ljava/lang/InterruptedException;

    .line 250
    .line 251
    const-class v88, Ljava/lang/LinkageError;

    .line 252
    .line 253
    const-class v89, Ljava/lang/NegativeArraySizeException;

    .line 254
    .line 255
    const-class v90, Ljava/lang/NoClassDefFoundError;

    .line 256
    .line 257
    const-class v91, Ljava/lang/NoSuchFieldError;

    .line 258
    .line 259
    const-class v92, Ljava/lang/NoSuchFieldException;

    .line 260
    .line 261
    const-class v93, Ljava/lang/NoSuchMethodError;

    .line 262
    .line 263
    const-class v94, Ljava/lang/NoSuchMethodException;

    .line 264
    .line 265
    const-class v95, Ljava/lang/NullPointerException;

    .line 266
    .line 267
    const-class v96, Ljava/lang/NumberFormatException;

    .line 268
    .line 269
    const-class v97, Ljava/lang/OutOfMemoryError;

    .line 270
    .line 271
    const-class v98, Ljava/lang/RuntimeException;

    .line 272
    .line 273
    const-class v99, Ljava/lang/SecurityException;

    .line 274
    .line 275
    const-class v100, Ljava/lang/StackOverflowError;

    .line 276
    .line 277
    const-class v101, Ljava/lang/StringIndexOutOfBoundsException;

    .line 278
    .line 279
    const-class v102, Ljava/lang/TypeNotPresentException;

    .line 280
    .line 281
    filled-new-array/range {v5 .. v104}, [Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    move v5, v3

    .line 286
    :goto_0
    const/16 v6, 0x64

    .line 287
    .line 288
    if-ge v5, v6, :cond_0

    .line 289
    .line 290
    aget-object v6, v4, v5

    .line 291
    .line 292
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    add-int/lit8 v5, v5, 0x1

    .line 300
    .line 301
    goto :goto_0

    .line 302
    :cond_0
    const-string v4, "javax.validation.ValidationException"

    .line 303
    .line 304
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    const-string v4, "javax.validation.NoProviderFoundException"

    .line 308
    .line 309
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_1
    move v4, v3

    .line 313
    :goto_1
    array-length v5, v1

    .line 314
    if-ge v4, v5, :cond_5

    .line 315
    .line 316
    aget-object v5, v1, v4

    .line 317
    .line 318
    if-eqz v5, :cond_4

    .line 319
    .line 320
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-eqz v6, :cond_2

    .line 325
    .line 326
    goto :goto_2

    .line 327
    :cond_2
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/String;)Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    if-eqz v6, :cond_3

    .line 332
    .line 333
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    :cond_3
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 341
    .line 342
    goto :goto_1

    .line 343
    :cond_5
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    new-array v4, v1, [J

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    move v5, v3

    .line 354
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-eqz v6, :cond_8

    .line 359
    .line 360
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    check-cast v6, Ljava/lang/String;

    .line 365
    .line 366
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    move v9, v3

    .line 372
    :goto_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    if-ge v9, v10, :cond_7

    .line 377
    .line 378
    invoke-virtual {v6, v9}, Ljava/lang/String;->charAt(I)C

    .line 379
    .line 380
    .line 381
    move-result v10

    .line 382
    const/16 v11, 0x24

    .line 383
    .line 384
    if-ne v10, v11, :cond_6

    .line 385
    .line 386
    const/16 v10, 0x2e

    .line 387
    .line 388
    :cond_6
    int-to-long v10, v10

    .line 389
    xor-long/2addr v7, v10

    .line 390
    const-wide v10, 0x100000001b3L

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    mul-long/2addr v7, v10

    .line 396
    add-int/lit8 v9, v9, 0x1

    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_7
    add-int/lit8 v6, v5, 0x1

    .line 400
    .line 401
    aput-wide v7, v4, v5

    .line 402
    .line 403
    move v5, v6

    .line 404
    goto :goto_3

    .line 405
    :cond_8
    if-eq v5, v1, :cond_9

    .line 406
    .line 407
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    :cond_9
    invoke-static {v4}, Ljava/util/Arrays;->sort([J)V

    .line 412
    .line 413
    .line 414
    iput-object v4, v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->acceptHashCodes:[J

    .line 415
    .line 416
    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    .line 422
    invoke-direct {p0, v0, p1}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>(Z[Ljava/lang/Class;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 420
    invoke-direct {p0, v0, p1}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>(Z[Ljava/lang/String;)V

    return-void
.end method

.method public static names(Ljava/util/Collection;)[Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Class;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Class;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    new-array p0, p0, [Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v0, p0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, [Ljava/lang/String;

    .line 44
    .line 45
    return-object p0
.end method

.method private putCacheIfAbsent(JLjava/lang/Class;)Ljava/lang/Class;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-class v1, Lcom/alibaba/fastjson2/JSON;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->tclHashCaches:Ljava/util/concurrent/ConcurrentMap;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->tclHashCaches:Ljava/util/concurrent/ConcurrentMap;

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->tclHashCaches:Ljava/util/concurrent/ConcurrentMap;

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v1, v0

    .line 62
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    .line 64
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v1, p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/Class;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->classCache:Ljava/util/Map;

    .line 76
    .line 77
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/Class;

    .line 86
    .line 87
    return-object p1
.end method


# virtual methods
.method public apply(JLjava/lang/Class;J)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/Class<",
            "*>;J)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 175
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 176
    const-class p4, Lcom/alibaba/fastjson2/JSON;

    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p4

    if-eq p3, p4, :cond_0

    .line 177
    invoke-static {p3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p3

    .line 178
    iget-object p4, p0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->tclHashCaches:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz p3, :cond_0

    .line 179
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    return-object p1

    .line 180
    :cond_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->classCache:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    return-object p1
.end method

.method public apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;J)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-string v0, "O"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, "Object"

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    const/4 v7, 0x0

    .line 16
    const-wide v0, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    move v8, v7

    .line 22
    :goto_0
    if-ge v8, v6, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/16 v3, 0x24

    .line 29
    .line 30
    if-ne v2, v3, :cond_1

    .line 31
    .line 32
    const/16 v2, 0x2e

    .line 33
    .line 34
    :cond_1
    int-to-long v2, v2

    .line 35
    xor-long/2addr v0, v2

    .line 36
    const-wide v2, 0x100000001b3L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    mul-long v9, v0, v2

    .line 42
    .line 43
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->acceptHashCodes:[J

    .line 44
    .line 45
    invoke-static {v0, v9, v10}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-ltz v0, :cond_3

    .line 50
    .line 51
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    move-object v0, p0

    .line 56
    move-object v3, p2

    .line 57
    move-wide v4, p3

    .line 58
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    if-nez v11, :cond_2

    .line 63
    .line 64
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    if-eqz v11, :cond_2

    .line 69
    .line 70
    invoke-direct {p0, v1, v2, v11}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->putCacheIfAbsent(JLjava/lang/Class;)Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    move-object v11, v1

    .line 77
    :cond_2
    if-eqz v11, :cond_3

    .line 78
    .line 79
    return-object v11

    .line 80
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    move-wide v0, v9

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v1

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    const/4 v6, 0x0

    .line 93
    if-lez v3, :cond_9

    .line 94
    .line 95
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/16 v4, 0x5b

    .line 100
    .line 101
    if-ne v3, v4, :cond_9

    .line 102
    .line 103
    move-object v0, p0

    .line 104
    move-object v3, p2

    .line 105
    move-wide v4, p3

    .line 106
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    if-eqz v7, :cond_5

    .line 111
    .line 112
    return-object v7

    .line 113
    :cond_5
    const/4 v7, 0x1

    .line 114
    invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    if-eqz p2, :cond_6

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    goto :goto_1

    .line 125
    :cond_6
    move-object v8, v6

    .line 126
    :goto_1
    invoke-virtual {p0, v7, v8, v4, v5}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    if-eqz v7, :cond_a

    .line 131
    .line 132
    if-ne v7, v8, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/TypeUtils;->getArrayClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    :goto_2
    invoke-direct {p0, v1, v2, p2}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->putCacheIfAbsent(JLjava/lang/Class;)Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_8

    .line 144
    .line 145
    return-object p1

    .line 146
    :cond_8
    return-object p2

    .line 147
    :cond_9
    move-wide v4, p3

    .line 148
    :cond_a
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/String;)Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    if-eqz v7, :cond_c

    .line 153
    .line 154
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_c

    .line 163
    .line 164
    invoke-virtual {p0, v7, p2, v4, v5}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_b

    .line 169
    .line 170
    invoke-direct {p0, v1, v2, p1}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;->putCacheIfAbsent(JLjava/lang/Class;)Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    :cond_b
    return-object p1

    .line 174
    :cond_c
    return-object v6
.end method
