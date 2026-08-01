.class public abstract Lxhss/ᛶᛱᛱᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Ljava/util/TreeMap;

.field public static final ᛳᲁᲇᛸ:Ljava/util/HashSet;

.field public static final ᛷᛵᛵᲈ:Ljava/util/TreeMap;

.field public static final ᲇᛴᲇᛵ:Ljava/util/TreeMap;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    new-instance v1, Lxhss/ᛸᛲᲇᲁ;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Lxhss/ᛸᛲᲇᲁ;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ:Ljava/util/TreeMap;

    .line 13
    .line 14
    new-instance v0, Ljava/util/TreeMap;

    .line 15
    .line 16
    new-instance v1, Lxhss/ᛸᛲᲇᲁ;

    .line 17
    .line 18
    invoke-direct {v1, v2}, Lxhss/ᛸᛲᲇᲁ;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lxhss/ᛶᛱᛱᛳ;->ᛱᛱᛲᲇ:Ljava/util/TreeMap;

    .line 25
    .line 26
    new-instance v0, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ:Ljava/util/HashSet;

    .line 32
    .line 33
    new-instance v1, Ljava/util/TreeMap;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lxhss/ᛶᛱᛱᛳ;->ᲇᛴᲇᛵ:Ljava/util/TreeMap;

    .line 39
    .line 40
    const-string v1, "\u00e0"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    const-string v1, "at"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    const-string v1, "MEZ"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    const-string v1, "Uhr"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    const-string v1, "h"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    const-string v1, "pm"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    const-string v1, "PM"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    const-string v1, "am"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    const-string v1, "AM"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    const-string v1, "min"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    const-string v1, "um"

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    const-string v1, "o\'clock"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/util/TimeZone;->getAvailableIDs()[Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    array-length v1, v0

    .line 105
    const/4 v3, 0x0

    .line 106
    move v4, v3

    .line 107
    :goto_0
    if-ge v4, v1, :cond_0

    .line 108
    .line 109
    aget-object v5, v0, v4

    .line 110
    .line 111
    sget-object v6, Lxhss/ᛶᛱᛱᛳ;->ᲇᛴᲇᛵ:Ljava/util/TreeMap;

    .line 112
    .line 113
    invoke-static {v5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v6, v5, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    invoke-static {}, Ljava/text/DateFormatSymbols;->getAvailableLocales()[Ljava/util/Locale;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    array-length v1, v0

    .line 128
    move v4, v3

    .line 129
    :goto_1
    if-ge v4, v1, :cond_d

    .line 130
    .line 131
    aget-object v5, v0, v4

    .line 132
    .line 133
    const-string v6, "ja"

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_1

    .line 144
    .line 145
    goto/16 :goto_a

    .line 146
    .line 147
    :cond_1
    const-string v6, "ko"

    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_2

    .line 158
    .line 159
    goto/16 :goto_a

    .line 160
    .line 161
    :cond_2
    const-string v6, "zh"

    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_3

    .line 172
    .line 173
    goto/16 :goto_a

    .line 174
    .line 175
    :cond_3
    invoke-static {v5}, Ljava/text/DateFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DateFormatSymbols;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-virtual {v5}, Ljava/text/DateFormatSymbols;->getMonths()[Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    move v7, v3

    .line 184
    :goto_2
    array-length v8, v6

    .line 185
    if-ge v7, v8, :cond_5

    .line 186
    .line 187
    aget-object v8, v6, v7

    .line 188
    .line 189
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-nez v8, :cond_4

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_4
    sget-object v8, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ:Ljava/util/TreeMap;

    .line 197
    .line 198
    aget-object v9, v6, v7

    .line 199
    .line 200
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-static {v8, v9, v10}, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 205
    .line 206
    .line 207
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_5
    invoke-virtual {v5}, Ljava/text/DateFormatSymbols;->getShortMonths()[Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    move v7, v3

    .line 215
    :goto_4
    array-length v8, v6

    .line 216
    const-string v9, ""

    .line 217
    .line 218
    const-string v10, "."

    .line 219
    .line 220
    if-ge v7, v8, :cond_8

    .line 221
    .line 222
    aget-object v8, v6, v7

    .line 223
    .line 224
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    if-nez v11, :cond_6

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_6
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    sub-int/2addr v11, v2

    .line 236
    invoke-virtual {v8, v11}, Ljava/lang/String;->charAt(I)C

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    invoke-static {v8}, Ljava/lang/Character;->isDigit(C)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    if-eqz v8, :cond_7

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_7
    sget-object v8, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ:Ljava/util/TreeMap;

    .line 248
    .line 249
    aget-object v11, v6, v7

    .line 250
    .line 251
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    invoke-static {v8, v11, v12}, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 256
    .line 257
    .line 258
    aget-object v11, v6, v7

    .line 259
    .line 260
    invoke-virtual {v11, v10, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-static {v8, v9, v10}, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 269
    .line 270
    .line 271
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_8
    invoke-virtual {v5}, Ljava/text/DateFormatSymbols;->getWeekdays()[Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    move v7, v3

    .line 279
    :goto_6
    array-length v8, v6

    .line 280
    if-ge v7, v8, :cond_a

    .line 281
    .line 282
    aget-object v8, v6, v7

    .line 283
    .line 284
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    if-nez v11, :cond_9

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_9
    sget-object v11, Lxhss/ᛶᛱᛱᛳ;->ᛱᛱᛲᲇ:Ljava/util/TreeMap;

    .line 292
    .line 293
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    invoke-static {v11, v8, v12}, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8, v10, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v12

    .line 308
    invoke-static {v11, v8, v12}, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 309
    .line 310
    .line 311
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_a
    invoke-virtual {v5}, Ljava/text/DateFormatSymbols;->getShortWeekdays()[Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    move v6, v3

    .line 319
    :goto_8
    array-length v7, v5

    .line 320
    if-ge v6, v7, :cond_c

    .line 321
    .line 322
    aget-object v7, v5, v6

    .line 323
    .line 324
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-nez v8, :cond_b

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_b
    sget-object v8, Lxhss/ᛶᛱᛱᛳ;->ᛱᛱᛲᲇ:Ljava/util/TreeMap;

    .line 332
    .line 333
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    invoke-static {v8, v7, v11}, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7, v10, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    invoke-static {v8, v7, v11}, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 349
    .line 350
    .line 351
    :goto_9
    add-int/lit8 v6, v6, 0x1

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_c
    :goto_a
    add-int/lit8 v4, v4, 0x1

    .line 355
    .line 356
    goto/16 :goto_1

    .line 357
    .line 358
    :cond_d
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/util/Date;
    .locals 1

    .line 1
    invoke-static {p0, p1, p2}, Lxhss/ᛶᛱᛱᛳ;->ᲀᲇᛳᲁ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0xb

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-virtual {p1, v0, p0}, Ljava/util/Calendar;->set(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, p1, p2}, Lxhss/ᛶᛱᛱᛳ;->ᲀᲇᛳᲁ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    const/16 v0, 0xc

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-virtual {p1, v0, p0}, Ljava/util/Calendar;->set(II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_2
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0, p1, p2}, Lxhss/ᛶᛱᛱᛳ;->ᲀᲇᛳᲁ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-nez p0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_3
    const/16 v0, 0xd

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {p1, v0, p0}, Ljava/util/Calendar;->set(II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_4
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0, p1, p2}, Lxhss/ᛶᛱᛱᛳ;->ᲀᲇᛳᲁ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-nez p0, :cond_5

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_5
    invoke-static {p0, p1, p2}, Lxhss/ᛶᛱᛱᛳ;->ᲀᲇᛳᲁ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    const/4 v0, 0x4

    .line 119
    if-ne p2, v0, :cond_6

    .line 120
    .line 121
    const/4 p2, 0x0

    .line 122
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-static {p2}, Ljava/lang/Character;->isDigit(C)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_6

    .line 131
    .line 132
    const/4 p2, 0x1

    .line 133
    invoke-static {p0}, Lxhss/ᛶᛱᛱᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-virtual {p1, p2, p0}, Ljava/util/Calendar;->set(II)V

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0
.end method

.method public static ᛳᲁᲇᛸ(Ljava/util/TreeMap;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const-string v0, "\u00e9"

    .line 5
    .line 6
    const-string v1, "e"

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "\u00fb"

    .line 13
    .line 14
    const-string v1, "u"

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static ᛷᛴᛷᛱ()Ljava/util/GregorianCalendar;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/GregorianCalendar;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    const/16 v1, 0x7d0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct/range {v0 .. v6}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/GregorianCalendar;->getTimeZone()Ljava/util/TimeZone;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    invoke-virtual {v1}, Ljava/util/TimeZone;->getRawOffset()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    neg-int v1, v1

    .line 28
    int-to-long v1, v1

    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static ᛷᛵᛵᲈ(Ljava/util/StringTokenizer;Ljava/util/GregorianCalendar;)Ljava/util/Date;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1, p0}, Lxhss/ᛶᛱᛱᛳ;->ᛱᛱᛲᲇ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/util/Date;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static ᲀᲇᛳᲁ(Ljava/lang/String;Ljava/util/GregorianCalendar;Ljava/util/StringTokenizer;)Ljava/lang/String;
    .locals 2

    .line 1
    :goto_0
    sget-object v0, Lxhss/ᛶᛱᛱᛳ;->ᲇᛴᲇᛵ:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/TimeZone;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    sget-object v0, Lxhss/ᛶᛱᛱᛳ;->ᛳᲁᲇᛸ:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    const-string v0, "pm"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/16 v1, 0x9

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-virtual {p1, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 46
    .line 47
    .line 48
    :cond_2
    const-string v0, "am"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    invoke-virtual {p1, v1, p0}, Ljava/util/Calendar;->add(II)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_4

    .line 65
    .line 66
    :goto_1
    const/4 p0, 0x0

    .line 67
    return-object p0

    .line 68
    :cond_4
    invoke-virtual {p2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_0

    .line 73
    :cond_5
    return-object p0
.end method

.method public static ᲇᛴᲇᛵ(Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x64

    .line 6
    .line 7
    if-ge p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x1e

    .line 10
    .line 11
    if-le p0, v0, :cond_0

    .line 12
    .line 13
    add-int/lit16 p0, p0, 0x7d0

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    add-int/lit16 p0, p0, 0x76c

    .line 17
    .line 18
    :cond_1
    return p0
.end method

.method public static ᲇᛶᛴᲀ(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/lit8 p0, p0, -0x1

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object v0, Lxhss/ᛶᛱᛱᛳ;->ᛷᛵᛵᲈ:Ljava/util/TreeMap;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    const-string v0, "can not parse "

    .line 35
    .line 36
    const-string v1, " as month"

    .line 37
    .line 38
    invoke-static {v0, p0, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛲᛷᛱ(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method
