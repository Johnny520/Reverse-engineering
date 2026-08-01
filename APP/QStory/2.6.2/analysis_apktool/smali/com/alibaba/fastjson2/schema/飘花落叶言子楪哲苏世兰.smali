.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子世楪兰苏哲:Ljava/util/regex/Pattern;

.field public static final 飘花落叶言子世楪哲兰苏:Ljava/util/regex/Pattern;

.field public static final 飘花落叶言子世楪哲苏兰:Ljava/util/regex/Pattern;


# instance fields
.field public final 飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

.field public final 飘花落叶言子世楪苏哲兰:Ljava/util/Set;

.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/regex/Pattern;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪兰哲世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪兰哲苏世:Ljava/lang/String;

.field public final 飘花落叶言子楪兰苏世哲:Z

.field public final 飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/String;

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^\\s*?(.+)@(.+?)\\s*$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪哲苏兰:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^\\[(.*)\\]$"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪哲兰苏:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "^\\s*(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:\'\\\\\\\"\\.\\[\\]]|\')+|(\"[^\"]*\"))(\\.(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:\'\\\\\\\"\\.\\[\\]]|\')+|(\"[^\"]*\")))*$"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONObject;)V
    .locals 9

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "type"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "string"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Z

    .line 17
    .line 18
    const-string v0, "minLength"

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 26
    .line 27
    const-string v0, "maxLength"

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 34
    .line 35
    const-string v0, "pattern"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    move-object v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_0
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/regex/Pattern;

    .line 53
    .line 54
    const-string v0, "format"

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 61
    .line 62
    const-string v3, "anyOf"

    .line 63
    .line 64
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    instance-of v4, v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 69
    .line 70
    const-class v5, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    check-cast v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 75
    .line 76
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iput-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 84
    .line 85
    :goto_1
    const-string v3, "oneOf"

    .line 86
    .line 87
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    instance-of v4, v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 92
    .line 93
    if-eqz v4, :cond_2

    .line 94
    .line 95
    check-cast v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 96
    .line 97
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iput-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 105
    .line 106
    :goto_2
    const-string v3, "const"

    .line 107
    .line 108
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iput-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/String;

    .line 113
    .line 114
    const-string v3, "enum"

    .line 115
    .line 116
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    instance-of v6, v4, Ljava/util/Collection;

    .line 121
    .line 122
    const/4 v7, 0x1

    .line 123
    const/4 v8, 0x0

    .line 124
    if-eqz v6, :cond_3

    .line 125
    .line 126
    check-cast v4, Ljava/util/Collection;

    .line 127
    .line 128
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 129
    .line 130
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    const/high16 v5, 0x3f800000    # 1.0f

    .line 135
    .line 136
    invoke-direct {p1, v3, v5}, Ljava/util/LinkedHashSet;-><init>(IF)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_3
    instance-of v4, v4, [Ljava/lang/Object;

    .line 144
    .line 145
    if-eqz v4, :cond_4

    .line 146
    .line 147
    new-instance v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;

    .line 148
    .line 149
    new-array v6, v7, [Ljava/lang/reflect/Type;

    .line 150
    .line 151
    aput-object v5, v6, v8

    .line 152
    .line 153
    const-class v5, Ljava/util/LinkedHashSet;

    .line 154
    .line 155
    invoke-direct {v4, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;-><init>(Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    .line 156
    .line 157
    .line 158
    new-array v5, v8, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 159
    .line 160
    invoke-virtual {p1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONObject;->getObject(Ljava/lang/String;Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Ljava/util/Set;

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_4
    move-object p1, v2

    .line 168
    :goto_3
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏哲兰:Ljava/util/Set;

    .line 169
    .line 170
    if-nez v0, :cond_5

    .line 171
    .line 172
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 173
    .line 174
    return-void

    .line 175
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    const/16 v3, 0x8

    .line 180
    .line 181
    const/4 v4, 0x7

    .line 182
    const/4 v5, 0x6

    .line 183
    sparse-switch p1, :sswitch_data_0

    .line 184
    .line 185
    .line 186
    goto/16 :goto_4

    .line 187
    .line 188
    :sswitch_0
    const-string p1, "email"

    .line 189
    .line 190
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-nez p1, :cond_6

    .line 195
    .line 196
    goto/16 :goto_4

    .line 197
    .line 198
    :cond_6
    move v1, v3

    .line 199
    goto/16 :goto_4

    .line 200
    .line 201
    :sswitch_1
    const-string p1, "uuid"

    .line 202
    .line 203
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-nez p1, :cond_7

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    move v1, v4

    .line 211
    goto :goto_4

    .line 212
    :sswitch_2
    const-string p1, "time"

    .line 213
    .line 214
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-nez p1, :cond_8

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_8
    move v1, v5

    .line 222
    goto :goto_4

    .line 223
    :sswitch_3
    const-string p1, "ipv6"

    .line 224
    .line 225
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-nez p1, :cond_9

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_9
    const/4 v1, 0x5

    .line 233
    goto :goto_4

    .line 234
    :sswitch_4
    const-string p1, "ipv4"

    .line 235
    .line 236
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    if-nez p1, :cond_a

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_a
    const/4 v1, 0x4

    .line 244
    goto :goto_4

    .line 245
    :sswitch_5
    const-string p1, "date"

    .line 246
    .line 247
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-nez p1, :cond_b

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_b
    const/4 v1, 0x3

    .line 255
    goto :goto_4

    .line 256
    :sswitch_6
    const-string p1, "uri"

    .line 257
    .line 258
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-nez p1, :cond_c

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_c
    const/4 v1, 0x2

    .line 266
    goto :goto_4

    .line 267
    :sswitch_7
    const-string p1, "date-time"

    .line 268
    .line 269
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-nez p1, :cond_d

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_d
    move v1, v7

    .line 277
    goto :goto_4

    .line 278
    :sswitch_8
    const-string p1, "duration"

    .line 279
    .line 280
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    if-nez p1, :cond_e

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_e
    move v1, v8

    .line 288
    :goto_4
    packed-switch v1, :pswitch_data_0

    .line 289
    .line 290
    .line 291
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_0
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 295
    .line 296
    invoke-direct {p1, v5}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 297
    .line 298
    .line 299
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_1
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 303
    .line 304
    const/16 v0, 0xe

    .line 305
    .line 306
    invoke-direct {p1, v0}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 307
    .line 308
    .line 309
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_2
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 313
    .line 314
    const/16 v0, 0xc

    .line 315
    .line 316
    invoke-direct {p1, v0}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 317
    .line 318
    .line 319
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 320
    .line 321
    return-void

    .line 322
    :pswitch_3
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 323
    .line 324
    invoke-direct {p1, v3}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 325
    .line 326
    .line 327
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_4
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 331
    .line 332
    invoke-direct {p1, v4}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 333
    .line 334
    .line 335
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 336
    .line 337
    return-void

    .line 338
    :pswitch_5
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 339
    .line 340
    const/16 v0, 0xb

    .line 341
    .line 342
    invoke-direct {p1, v0}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 343
    .line 344
    .line 345
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_6
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 349
    .line 350
    const/16 v0, 0x9

    .line 351
    .line 352
    invoke-direct {p1, v0}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 353
    .line 354
    .line 355
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_7
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 359
    .line 360
    const/16 v0, 0xa

    .line 361
    .line 362
    invoke-direct {p1, v0}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 363
    .line 364
    .line 365
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 366
    .line 367
    return-void

    .line 368
    :pswitch_8
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 369
    .line 370
    const/16 v0, 0xd

    .line 371
    .line 372
    invoke-direct {p1, v0}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 373
    .line 374
    .line 375
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 376
    .line 377
    return-void

    .line 378
    nop

    .line 379
    :sswitch_data_0
    .sparse-switch
        -0x76bbb26c -> :sswitch_8
        -0x1195de74 -> :sswitch_7
        0x1c56c -> :sswitch_6
        0x2eefae -> :sswitch_5
        0x316de5 -> :sswitch_4
        0x316de7 -> :sswitch_3
        0x3652cd -> :sswitch_2
        0x36f3bb -> :sswitch_1
        0x5c24b9c -> :sswitch_0
    .end sparse-switch

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪哲苏世兰:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_9

    .line 14
    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    iget v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 20
    .line 21
    if-gez v1, :cond_1

    .line 22
    .line 23
    if-ltz v0, :cond_3

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->codePointCount(II)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-ltz v1, :cond_2

    .line 34
    .line 35
    if-ge v3, v1, :cond_2

    .line 36
    .line 37
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "minLength not match, expect >= %s, but %s"

    .line 56
    .line 57
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    if-ltz v0, :cond_3

    .line 62
    .line 63
    if-le v3, v0, :cond_3

    .line 64
    .line 65
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "maxLength not match, expect <= %s, but %s"

    .line 84
    .line 85
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/regex/Pattern;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_4

    .line 102
    .line 103
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 104
    .line 105
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 106
    .line 107
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "pattern not match, expect %s, but %s"

    .line 112
    .line 113
    invoke-direct {v0, p1, p0, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Predicate;

    .line 118
    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    invoke-interface {v0, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_5

    .line 126
    .line 127
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 128
    .line 129
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 130
    .line 131
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const-string p1, "format not match, expect %s, but %s"

    .line 136
    .line 137
    invoke-direct {v0, p1, p0, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 150
    .line 151
    if-nez v1, :cond_6

    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 155
    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 163
    .line 164
    if-nez v1, :cond_7

    .line 165
    .line 166
    return-object v0

    .line 167
    :cond_7
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/String;

    .line 168
    .line 169
    if-eqz v0, :cond_8

    .line 170
    .line 171
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_8

    .line 176
    .line 177
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 178
    .line 179
    const-string v1, "must be const %s, but %s"

    .line 180
    .line 181
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-direct {p0, v1, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 186
    .line 187
    .line 188
    return-object p0

    .line 189
    :cond_8
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏哲兰:Ljava/util/Set;

    .line 190
    .line 191
    if-eqz p0, :cond_a

    .line 192
    .line 193
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-nez p0, :cond_a

    .line 198
    .line 199
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 200
    .line 201
    const-string v0, "not in enum values, %s"

    .line 202
    .line 203
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 208
    .line 209
    .line 210
    return-object p0

    .line 211
    :cond_9
    if-nez v0, :cond_b

    .line 212
    .line 213
    :cond_a
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 214
    .line 215
    return-object p0

    .line 216
    :cond_b
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 217
    .line 218
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->String:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    const-string v0, "expect type %s, but %s"

    .line 229
    .line 230
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 231
    .line 232
    .line 233
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世()Lcom/alibaba/fastjson2/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "type"

    .line 7
    .line 8
    const-string v2, "string"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    iget v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:I

    .line 15
    .line 16
    if-eq v2, v1, :cond_0

    .line 17
    .line 18
    const-string v1, "minLength"

    .line 19
    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const-string v2, "format"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const-string v1, "pattern"

    .line 41
    .line 42
    iget-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/regex/Pattern;

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    const-string v2, "anyOf"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    const-string v2, "oneOf"

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_4
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    const-string v2, "const"

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏哲兰:Ljava/util/Set;

    .line 75
    .line 76
    if-eqz p0, :cond_6

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_6

    .line 83
    .line 84
    const-string v1, "enum"

    .line 85
    .line 86
    invoke-virtual {v0, v1, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_6
    return-object v0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->String:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
