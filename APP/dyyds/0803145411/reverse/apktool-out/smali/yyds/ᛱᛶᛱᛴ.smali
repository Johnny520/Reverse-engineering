.class public final Lyyds/ᛱᛶᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    }
.end annotation


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛱᛶᛱᛴ;

.field private static final ᛵᛸᛸᛷ:Lyyds/ᛴᛳᲈᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛱᛶᛱᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛶᛱᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛱᛶᛱᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛶᛱᛴ;

    .line 7
    .line 8
    new-instance v0, Lyyds/ᛴᛳᲇᲇ;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛴᛳᲇᲇ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v1, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛶᛷᛲᲁ(ILyyds/ᲁᛶᲁᲀ;)Lyyds/ᛴᛳᲈᛵ;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lyyds/ᛱᛶᛱᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛳᲈᛵ;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final ᛲᛴᛳᛲ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛱᛶᛱᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛶᛱᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛶᛱᛴ;->ᛵᛸᛸᛷ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic ᛲᲈᲁ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 1

    .line 1
    invoke-static {}, Lyyds/ᛱᛶᛱᛴ;->ᛲᛴᛳᛲ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final ᛵᛸᛸᛷ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 5

    .line 1
    new-instance p0, Ljava/security/SecureRandom;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, 0x7ffffffe

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/Random;->nextInt(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/Random;->nextLong()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide v3, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v1, v3

    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long p0, v1, v3

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    const-wide/16 v1, 0x1

    .line 32
    .line 33
    :cond_0
    new-instance p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 34
    .line 35
    invoke-direct {p0, v0, v1, v2}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;-><init>(IJ)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method private final ᲇᲇᲇᛱ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 5

    .line 1
    :try_start_0
    new-instance p0, Ljava/io/File;

    .line 2
    .line 3
    const-wide v0, -0x272bae68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    new-instance v1, Ljava/io/InputStreamReader;

    .line 18
    .line 19
    new-instance v2, Ljava/io/FileInputStream;

    .line 20
    .line 21
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 25
    .line 26
    .line 27
    :try_start_1
    invoke-static {v1}, Lyyds/ᛳᛴᲁᲇ;->ᛷᲈᲈᲁ(Ljava/io/Reader;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x20

    .line 35
    .line 36
    const/4 v1, 0x6

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {p0, v0, v2, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/16 v3, 0x29

    .line 43
    .line 44
    invoke-static {p0, v3, v2, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛶᛷᲀ(Ljava/lang/String;CII)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-lez v0, :cond_4

    .line 49
    .line 50
    if-le v1, v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-wide v3, -0x272dee68a836eL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-wide v3, -0x272ede68a836eL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-wide v3, -0x272fce68a836eL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v2}, Lyyds/ᛲᲇᛸᲇ;->ᛶᲀᲈᲇ(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_0

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    goto :goto_0

    .line 125
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 126
    .line 127
    const/16 v4, 0xa

    .line 128
    .line 129
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    :cond_1
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->end()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_1

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-object p0, v3

    .line 173
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    const/16 v2, 0x13

    .line 178
    .line 179
    if-le v1, v2, :cond_3

    .line 180
    .line 181
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    if-lez v0, :cond_2

    .line 192
    .line 193
    const-wide/16 v3, 0x0

    .line 194
    .line 195
    cmp-long p0, v1, v3

    .line 196
    .line 197
    if-lez p0, :cond_2

    .line 198
    .line 199
    new-instance p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 200
    .line 201
    invoke-direct {p0, v0, v1, v2}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;-><init>(IJ)V

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_2
    const-wide v0, -0x27314e68a836eL

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_3
    const-wide v0, -0x27300e68a836eL

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 234
    .line 235
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_4
    const-wide v0, -0x272cae68a836eL

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 262
    :catchall_0
    move-exception p0

    .line 263
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 264
    :catchall_1
    move-exception v0

    .line 265
    :try_start_4
    invoke-static {v1, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 269
    :catchall_2
    move-exception p0

    .line 270
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 271
    .line 272
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    move-object p0, v0

    .line 276
    :goto_1
    instance-of v0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 277
    .line 278
    if-eqz v0, :cond_5

    .line 279
    .line 280
    const/4 p0, 0x0

    .line 281
    :cond_5
    check-cast p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 282
    .line 283
    return-object p0
.end method

.method private final ᲇᲈᛵᛷ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛱᛶᛱᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛳᲈᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᛴᛳᲈᛵ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final ᲀᛲᛳᲀ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;
    .locals 6

    .line 1
    invoke-direct {p0}, Lyyds/ᛱᛶᛱᛴ;->ᲇᲇᲇᛱ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-wide v0, -0x27263e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-wide v0, -0x27275e68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    const-wide v1, -0x27276e68a836eL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    const-wide v1, -0x27283e68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    const-wide v2, -0x27284e68a836eL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const/4 v3, 0x1

    .line 66
    invoke-static {v0, v2, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    const-wide v4, -0x2728ce68a836eL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v1, v0, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    invoke-direct {p0}, Lyyds/ᛱᛶᛱᛴ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_3
    new-instance p0, Ljava/lang/SecurityException;

    .line 93
    .line 94
    const-wide v0, -0x27293e68a836eL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p0
.end method
