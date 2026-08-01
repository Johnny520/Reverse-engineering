.class public final L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/text/Regex;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-static {p0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v0, 0x7

    .line 19
    invoke-static {p1, v0}, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_14

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    long-to-int v3, v3

    .line 70
    if-ne v0, v3, :cond_3

    .line 71
    .line 72
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    :cond_3
    const/4 v0, 0x2

    .line 85
    invoke-static {p1, v0}, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_14

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_6

    .line 120
    .line 121
    goto/16 :goto_1

    .line 122
    .line 123
    :cond_6
    const-string v3, "."

    .line 124
    .line 125
    invoke-static {p0, v3, v2}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_f

    .line 130
    .line 131
    const-string v4, ".."

    .line 132
    .line 133
    invoke-virtual {p0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_7

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :cond_7
    if-eqz v0, :cond_f

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-nez v5, :cond_8

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_8
    invoke-static {v0, v3, v2}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-nez v5, :cond_f

    .line 155
    .line 156
    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_9

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_9
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-nez v4, :cond_a

    .line 168
    .line 169
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    goto :goto_0

    .line 174
    :cond_a
    move-object v4, p0

    .line 175
    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-nez v5, :cond_b

    .line 180
    .line 181
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;)J

    .line 190
    .line 191
    .line 192
    move-result-wide v5

    .line 193
    long-to-int v5, v5

    .line 194
    if-ne v3, v5, :cond_c

    .line 195
    .line 196
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    :cond_c
    const-string v3, "*"

    .line 209
    .line 210
    invoke-static {v0, v3, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-nez v3, :cond_d

    .line 215
    .line 216
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    goto :goto_2

    .line 221
    :cond_d
    const-string v3, "*."

    .line 222
    .line 223
    invoke-static {v0, v3, v2}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_f

    .line 228
    .line 229
    const/16 v5, 0x2a

    .line 230
    .line 231
    const/4 v6, 0x4

    .line 232
    invoke-static {v0, v5, v1, v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰楪世苏(Ljava/lang/CharSequence;CII)I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    const/4 v7, -0x1

    .line 237
    if-eq v5, v7, :cond_e

    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_e
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-ge v5, v8, :cond_10

    .line 249
    .line 250
    :cond_f
    :goto_1
    move v0, v2

    .line 251
    goto :goto_2

    .line 252
    :cond_10
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_11

    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_11
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-nez v3, :cond_12

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_12
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    sub-int/2addr v3, v0

    .line 279
    if-lez v3, :cond_13

    .line 280
    .line 281
    add-int/lit8 v3, v3, -0x1

    .line 282
    .line 283
    const/16 v0, 0x2e

    .line 284
    .line 285
    invoke-static {v4, v0, v3, v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(Ljava/lang/String;CII)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eq v0, v7, :cond_13

    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_13
    move v0, v1

    .line 293
    :goto_2
    if-eqz v0, :cond_5

    .line 294
    .line 295
    :goto_3
    return v1

    .line 296
    :cond_14
    :goto_4
    return v2
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/security/cert/X509Certificate;I)Ljava/util/List;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/util/List;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x2

    .line 38
    if-ge v2, v3, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v2, 0x0

    .line 42
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    return-object v0

    .line 71
    :catch_0
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 72
    .line 73
    return-object p0
.end method


# virtual methods
.method public final verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    long-to-int v0, v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    aget-object p0, p0, v1

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 29
    .line 30
    invoke-static {p1, p0}, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 31
    .line 32
    .line 33
    move-result p0
    :try_end_0
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return p0

    .line 35
    :catch_0
    :cond_0
    return v1
.end method
