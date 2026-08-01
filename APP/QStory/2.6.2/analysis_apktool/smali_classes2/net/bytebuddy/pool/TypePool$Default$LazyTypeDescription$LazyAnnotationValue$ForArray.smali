.class Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;
.super Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForArray"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

.field private transient synthetic resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

.field private final typePool:Lnet/bytebuddy/pool/TypePool;

.field private final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/pool/TypePool;",
            "Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue;-><init>(Lnet/bytebuddy/pool/TypePool$1;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 6
    .line 7
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

    .line 8
    .line 9
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;-><init>(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public doResolve()Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "resolved"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->componentTypeReference:Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;

    .line 9
    .line 10
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;->resolve()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_d

    .line 15
    .line 16
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 17
    .line 18
    invoke-interface {v2, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_1
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;->isEnum()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 46
    .line 47
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 52
    .line 53
    const-class v3, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 54
    .line 55
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :cond_2
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isAnnotation()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 71
    .line 72
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 77
    .line 78
    const-class v3, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 79
    .line 80
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_3
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-class v3, Ljava/lang/Class;

    .line 90
    .line 91
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 98
    .line 99
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 104
    .line 105
    const-class v3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 106
    .line 107
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :cond_4
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-class v3, Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 125
    .line 126
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 131
    .line 132
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :cond_5
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 142
    .line 143
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_6

    .line 148
    .line 149
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 150
    .line 151
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 156
    .line 157
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_1

    .line 161
    .line 162
    :cond_6
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 175
    .line 176
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 181
    .line 182
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :cond_7
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 192
    .line 193
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 200
    .line 201
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 206
    .line 207
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :cond_8
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 217
    .line 218
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_9

    .line 223
    .line 224
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 225
    .line 226
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 231
    .line 232
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :cond_9
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 242
    .line 243
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_a

    .line 248
    .line 249
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 250
    .line 251
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 256
    .line 257
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_a
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 267
    .line 268
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_b

    .line 273
    .line 274
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 275
    .line 276
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 281
    .line 282
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_b
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 291
    .line 292
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-eqz v0, :cond_c

    .line 297
    .line 298
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 299
    .line 300
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 305
    .line 306
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 307
    .line 308
    .line 309
    goto :goto_1

    .line 310
    :cond_c
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 315
    .line 316
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_d

    .line 321
    .line 322
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;

    .line 323
    .line 324
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 329
    .line 330
    invoke-direct {v1, v3, v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 331
    .line 332
    .line 333
    goto :goto_1

    .line 334
    :cond_d
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->NONE:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 335
    .line 336
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->values:Ljava/util/List;

    .line 337
    .line 338
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    :goto_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    if-eqz v3, :cond_e

    .line 351
    .line 352
    invoke-virtual {v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->isDefined()Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-nez v3, :cond_e

    .line 357
    .line 358
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v0, Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 363
    .line 364
    invoke-interface {v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->getSort()Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    goto :goto_0

    .line 369
    :cond_e
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType;

    .line 370
    .line 371
    sget-object v3, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 372
    .line 373
    invoke-virtual {v3, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->toArrayErrorString(Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-direct {v2, v3, v0, v1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 378
    .line 379
    .line 380
    move-object v1, v2

    .line 381
    :goto_1
    if-nez v1, :cond_f

    .line 382
    .line 383
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 384
    .line 385
    return-object p0

    .line 386
    :cond_f
    iput-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray;->resolved:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 387
    .line 388
    return-object v1
.end method

.method public getSort()Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ARRAY:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 2
    .line 3
    return-object p0
.end method
