.class public Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/ClassVisitorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CreateClassVisitorFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/asm/ClassVisitorFactory<",
        "TS;>;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final byteBuddy:Lnet/bytebuddy/ByteBuddy;

.field private final classVisitor:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TS;>;",
            "Lnet/bytebuddy/ByteBuddy;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/ByteBuddy;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 2157
    invoke-virtual {p0}, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->run()Lnet/bytebuddy/asm/ClassVisitorFactory;

    move-result-object p0

    return-object p0
.end method

.method public run()Lnet/bytebuddy/asm/ClassVisitorFactory;
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/asm/ClassVisitorFactory<",
            "TS;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "delegate"

    .line 4
    .line 5
    const-class v2, Ljava/lang/UnsupportedOperationException;

    .line 6
    .line 7
    const-string v3, "attribute"

    .line 8
    .line 9
    const-string v4, "constants"

    .line 10
    .line 11
    const-string v5, "frames"

    .line 12
    .line 13
    const-string v6, "constant"

    .line 14
    .line 15
    const-string v7, "handle"

    .line 16
    .line 17
    const-string v8, "typePath"

    .line 18
    .line 19
    const-string v9, "labels"

    .line 20
    .line 21
    const-string v10, "label"

    .line 22
    .line 23
    const-class v11, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 24
    .line 25
    const-class v12, Lnet/bytebuddy/jar/asm/Type;

    .line 26
    .line 27
    const-class v13, Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 28
    .line 29
    const-class v14, Lnet/bytebuddy/jar/asm/Label;

    .line 30
    .line 31
    const-class v15, Lnet/bytebuddy/jar/asm/Attribute;

    .line 32
    .line 33
    move-object/from16 v16, v2

    .line 34
    .line 35
    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object/from16 v17, v13

    .line 42
    .line 43
    const-string v13, "ClassVisitor"

    .line 44
    .line 45
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v13, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 50
    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    if-eqz v2, :cond_1c

    .line 54
    .line 55
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v13, Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    const-class v19, Lnet/bytebuddy/jar/asm/Attribute;

    .line 69
    .line 70
    const-class v20, Lnet/bytebuddy/jar/asm/Label;

    .line 71
    .line 72
    const-class v21, Lnet/bytebuddy/jar/asm/Type;

    .line 73
    .line 74
    const-class v22, Lnet/bytebuddy/jar/asm/TypePath;

    .line 75
    .line 76
    const-class v23, Lnet/bytebuddy/jar/asm/Handle;

    .line 77
    .line 78
    const-class v24, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 79
    .line 80
    filled-new-array/range {v19 .. v24}, [Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v19

    .line 84
    invoke-static/range {v19 .. v19}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v19

    .line 88
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v19

    .line 92
    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v20
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 96
    move-object/from16 v21, v0

    .line 97
    .line 98
    const-string v0, "."

    .line 99
    .line 100
    move-object/from16 v22, v3

    .line 101
    .line 102
    if-eqz v20, :cond_0

    .line 103
    .line 104
    :try_start_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v20

    .line 108
    move-object/from16 v3, v20

    .line 109
    .line 110
    check-cast v3, Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 111
    .line 112
    move-object/from16 v20, v4

    .line 113
    .line 114
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 139
    .line 140
    .line 141
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 142
    move-object/from16 v24, v5

    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    :try_start_3
    invoke-static {v0, v5, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 149
    :try_start_4
    invoke-virtual {v13, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :catch_0
    :goto_1
    move-object/from16 v4, v20

    .line 153
    .line 154
    move-object/from16 v0, v21

    .line 155
    .line 156
    move-object/from16 v3, v22

    .line 157
    .line 158
    move-object/from16 v5, v24

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :catch_1
    move-exception v0

    .line 162
    goto/16 :goto_18

    .line 163
    .line 164
    :catch_2
    move-object/from16 v24, v5

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_0
    move-object/from16 v20, v4

    .line 168
    .line 169
    move-object/from16 v24, v5

    .line 170
    .line 171
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 175
    const-class v4, [Lnet/bytebuddy/jar/asm/Label;

    .line 176
    .line 177
    if-eqz v3, :cond_1

    .line 178
    .line 179
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v5, "[L"

    .line 185
    .line 186
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    check-cast v5, Ljava/lang/Class;

    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v5, ";"

    .line 203
    .line 204
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    iget-object v5, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 212
    .line 213
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    move-object/from16 v19, v6

    .line 218
    .line 219
    const/4 v6, 0x0

    .line 220
    invoke-static {v3, v6, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v13, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_1
    move-object/from16 v19, v6

    .line 229
    .line 230
    :goto_2
    new-instance v3, Ljava/util/HashMap;

    .line 231
    .line 232
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 233
    .line 234
    .line 235
    new-instance v5, Ljava/util/HashMap;

    .line 236
    .line 237
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 238
    .line 239
    .line 240
    const-class v25, Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 241
    .line 242
    const-class v26, Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 243
    .line 244
    const-class v27, Lnet/bytebuddy/jar/asm/ModuleVisitor;

    .line 245
    .line 246
    const-class v28, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 247
    .line 248
    const-class v29, Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 249
    .line 250
    const-class v30, Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 251
    .line 252
    filled-new-array/range {v25 .. v30}, [Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v25
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 268
    move-object/from16 v26, v6

    .line 269
    .line 270
    const-class v6, Lnet/bytebuddy/jar/asm/Handle;

    .line 271
    .line 272
    move-object/from16 v27, v7

    .line 273
    .line 274
    const-class v7, Lnet/bytebuddy/jar/asm/TypePath;

    .line 275
    .line 276
    move-object/from16 v28, v8

    .line 277
    .line 278
    const-class v8, Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 279
    .line 280
    move-object/from16 v29, v9

    .line 281
    .line 282
    if-eqz v25, :cond_3

    .line 283
    .line 284
    :try_start_6
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v25

    .line 288
    move-object/from16 v9, v25

    .line 289
    .line 290
    check-cast v9, Ljava/lang/Class;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 291
    .line 292
    move-object/from16 v25, v4

    .line 293
    .line 294
    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 303
    .line 304
    .line 305
    move-object/from16 v43, v0

    .line 306
    .line 307
    :try_start_8
    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 319
    .line 320
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 321
    .line 322
    .line 323
    move-result-object v4
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 324
    move-object/from16 v44, v2

    .line 325
    .line 326
    const/4 v2, 0x0

    .line 327
    :try_start_9
    invoke-static {v0, v2, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v31
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    .line 331
    iget-object v0, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 332
    .line 333
    if-ne v9, v8, :cond_2

    .line 334
    .line 335
    :try_start_a
    const-class v33, Lnet/bytebuddy/jar/asm/TypePath;

    .line 336
    .line 337
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    move-object/from16 v34, v2

    .line 342
    .line 343
    check-cast v34, Ljava/lang/Class;

    .line 344
    .line 345
    const-class v35, Lnet/bytebuddy/jar/asm/Label;

    .line 346
    .line 347
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    move-object/from16 v36, v2

    .line 352
    .line 353
    check-cast v36, Ljava/lang/Class;

    .line 354
    .line 355
    const-class v37, Lnet/bytebuddy/jar/asm/Type;

    .line 356
    .line 357
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    move-object/from16 v38, v2

    .line 362
    .line 363
    check-cast v38, Ljava/lang/Class;

    .line 364
    .line 365
    const-class v39, Lnet/bytebuddy/jar/asm/Handle;

    .line 366
    .line 367
    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    move-object/from16 v40, v2

    .line 372
    .line 373
    check-cast v40, Ljava/lang/Class;

    .line 374
    .line 375
    const-class v41, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 376
    .line 377
    invoke-virtual {v13, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    move-object/from16 v42, v2

    .line 382
    .line 383
    check-cast v42, Ljava/lang/Class;

    .line 384
    .line 385
    move-object/from16 v30, v0

    .line 386
    .line 387
    move-object/from16 v32, v31

    .line 388
    .line 389
    move-object/from16 v31, v9

    .line 390
    .line 391
    invoke-static/range {v30 .. v42}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 396
    .line 397
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    move-object/from16 v33, v4

    .line 402
    .line 403
    check-cast v33, Ljava/lang/Class;

    .line 404
    .line 405
    const-class v34, Lnet/bytebuddy/jar/asm/TypePath;

    .line 406
    .line 407
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    move-object/from16 v35, v4

    .line 412
    .line 413
    check-cast v35, Ljava/lang/Class;

    .line 414
    .line 415
    const-class v36, Lnet/bytebuddy/jar/asm/Label;

    .line 416
    .line 417
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    move-object/from16 v37, v4

    .line 422
    .line 423
    check-cast v37, Ljava/lang/Class;

    .line 424
    .line 425
    const-class v38, Lnet/bytebuddy/jar/asm/Type;

    .line 426
    .line 427
    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    move-object/from16 v39, v4

    .line 432
    .line 433
    check-cast v39, Ljava/lang/Class;

    .line 434
    .line 435
    const-class v40, Lnet/bytebuddy/jar/asm/Handle;

    .line 436
    .line 437
    invoke-virtual {v13, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    move-object/from16 v41, v4

    .line 442
    .line 443
    check-cast v41, Ljava/lang/Class;

    .line 444
    .line 445
    const-class v42, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 446
    .line 447
    move-object/from16 v30, v32

    .line 448
    .line 449
    move-object/from16 v32, v31

    .line 450
    .line 451
    move-object/from16 v31, v30

    .line 452
    .line 453
    move-object/from16 v30, v2

    .line 454
    .line 455
    invoke-static/range {v30 .. v42}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    move-object/from16 v47, v32

    .line 460
    .line 461
    move-object/from16 v32, v31

    .line 462
    .line 463
    move-object/from16 v31, v47

    .line 464
    .line 465
    move-object/from16 v4, v31

    .line 466
    .line 467
    move-object/from16 v6, v32

    .line 468
    .line 469
    goto :goto_4

    .line 470
    :cond_2
    move-object/from16 v30, v0

    .line 471
    .line 472
    move-object/from16 v32, v31

    .line 473
    .line 474
    move-object/from16 v31, v9

    .line 475
    .line 476
    const-class v33, Lnet/bytebuddy/jar/asm/TypePath;

    .line 477
    .line 478
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    move-object/from16 v34, v0

    .line 483
    .line 484
    check-cast v34, Ljava/lang/Class;

    .line 485
    .line 486
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 487
    .line 488
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 489
    .line 490
    const/4 v4, 0x1

    .line 491
    new-array v6, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 492
    .line 493
    const/16 v23, 0x0

    .line 494
    .line 495
    aput-object v2, v6, v23

    .line 496
    .line 497
    invoke-direct {v0, v6}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 498
    .line 499
    .line 500
    move-object/from16 v35, v0

    .line 501
    .line 502
    invoke-static/range {v30 .. v35}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 507
    .line 508
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    move-object/from16 v33, v6

    .line 513
    .line 514
    check-cast v33, Ljava/lang/Class;

    .line 515
    .line 516
    const-class v34, Lnet/bytebuddy/jar/asm/TypePath;

    .line 517
    .line 518
    new-instance v6, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 519
    .line 520
    const/4 v7, 0x1

    .line 521
    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 522
    .line 523
    const/16 v23, 0x0

    .line 524
    .line 525
    aput-object v2, v7, v23

    .line 526
    .line 527
    invoke-direct {v6, v7}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 528
    .line 529
    .line 530
    move-object/from16 v30, v32

    .line 531
    .line 532
    move-object/from16 v32, v31

    .line 533
    .line 534
    move-object/from16 v31, v30

    .line 535
    .line 536
    move-object/from16 v30, v4

    .line 537
    .line 538
    move-object/from16 v35, v6

    .line 539
    .line 540
    invoke-static/range {v30 .. v35}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    move-object/from16 v6, v31

    .line 545
    .line 546
    move-object/from16 v4, v32

    .line 547
    .line 548
    :goto_4
    invoke-virtual {v3, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v5, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v5, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    :catch_3
    :goto_5
    move-object/from16 v4, v25

    .line 558
    .line 559
    move-object/from16 v6, v26

    .line 560
    .line 561
    move-object/from16 v7, v27

    .line 562
    .line 563
    move-object/from16 v8, v28

    .line 564
    .line 565
    move-object/from16 v9, v29

    .line 566
    .line 567
    move-object/from16 v0, v43

    .line 568
    .line 569
    move-object/from16 v2, v44

    .line 570
    .line 571
    goto/16 :goto_3

    .line 572
    .line 573
    :catch_4
    :goto_6
    move-object/from16 v44, v2

    .line 574
    .line 575
    goto :goto_5

    .line 576
    :catch_5
    move-object/from16 v43, v0

    .line 577
    .line 578
    goto :goto_6

    .line 579
    :cond_3
    move-object/from16 v25, v4

    .line 580
    .line 581
    new-instance v0, Ljava/util/ArrayList;

    .line 582
    .line 583
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 584
    .line 585
    .line 586
    new-instance v2, Ljava/util/HashMap;

    .line 587
    .line 588
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    .line 595
    if-eqz v4, :cond_4

    .line 596
    .line 597
    :try_start_b
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 598
    .line 599
    sget-object v9, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 600
    .line 601
    invoke-virtual {v4, v15, v9}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    iget-object v11, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 606
    .line 607
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v12

    .line 611
    check-cast v12, Ljava/lang/Class;

    .line 612
    .line 613
    invoke-virtual {v11, v12, v9}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 614
    .line 615
    .line 616
    move-result-object v9

    .line 617
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v11

    .line 621
    check-cast v11, Ljava/lang/Class;

    .line 622
    .line 623
    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 624
    .line 625
    .line 626
    move-result-object v12

    .line 627
    invoke-interface {v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    invoke-static {v4, v15, v11, v12, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    check-cast v11, Ljava/lang/Class;

    .line 643
    .line 644
    invoke-interface {v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 645
    .line 646
    .line 647
    move-result-object v12

    .line 648
    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    invoke-static {v9, v11, v15, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    goto :goto_7

    .line 660
    :catch_6
    move-exception v0

    .line 661
    move-object/from16 v1, p0

    .line 662
    .line 663
    goto/16 :goto_18

    .line 664
    .line 665
    :cond_4
    move-object/from16 v1, v18

    .line 666
    .line 667
    move-object v4, v1

    .line 668
    :goto_7
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 669
    .line 670
    .line 671
    move-result-object v9

    .line 672
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 673
    .line 674
    .line 675
    move-result-object v9

    .line 676
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 677
    .line 678
    .line 679
    move-result v11
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    .line 680
    const-string v12, "wrap"

    .line 681
    .line 682
    if-eqz v11, :cond_19

    .line 683
    .line 684
    :try_start_c
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v11

    .line 688
    check-cast v11, Ljava/util/Map$Entry;

    .line 689
    .line 690
    move-object/from16 v26, v1

    .line 691
    .line 692
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 701
    .line 702
    move-object/from16 v30, v1

    .line 703
    .line 704
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 713
    .line 714
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v31

    .line 718
    check-cast v31, Ljava/lang/Class;

    .line 719
    .line 720
    move-object/from16 v32, v1

    .line 721
    .line 722
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    move-object/from16 v31, v4

    .line 727
    .line 728
    array-length v4, v1

    .line 729
    move-object/from16 v33, v1

    .line 730
    .line 731
    move-object/from16 v1, v30

    .line 732
    .line 733
    move-object/from16 v30, v9

    .line 734
    .line 735
    move-object/from16 v9, v32

    .line 736
    .line 737
    move-object/from16 v32, v11

    .line 738
    .line 739
    const/4 v11, 0x0

    .line 740
    :goto_9
    if-ge v11, v4, :cond_18

    .line 741
    .line 742
    aget-object v34, v33, v11

    .line 743
    .line 744
    move/from16 v35, v4

    .line 745
    .line 746
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    .line 750
    move/from16 v37, v11

    .line 751
    .line 752
    const-class v11, Ljava/lang/Object;

    .line 753
    .line 754
    if-ne v4, v11, :cond_5

    .line 755
    .line 756
    move-object/from16 v39, v0

    .line 757
    .line 758
    move-object/from16 v40, v2

    .line 759
    .line 760
    move-object v11, v3

    .line 761
    move-object v0, v9

    .line 762
    move-object/from16 v38, v12

    .line 763
    .line 764
    move-object/from16 v46, v14

    .line 765
    .line 766
    move-object/from16 v9, v21

    .line 767
    .line 768
    move-object/from16 v14, v28

    .line 769
    .line 770
    move-object/from16 v28, v29

    .line 771
    .line 772
    move-object/from16 v29, v10

    .line 773
    .line 774
    move-object/from16 v10, v27

    .line 775
    .line 776
    move-object/from16 v27, v6

    .line 777
    .line 778
    move-object/from16 v6, v22

    .line 779
    .line 780
    move-object/from16 v22, v20

    .line 781
    .line 782
    move-object/from16 v20, v24

    .line 783
    .line 784
    move-object/from16 v24, v7

    .line 785
    .line 786
    goto/16 :goto_16

    .line 787
    .line 788
    :cond_5
    :try_start_d
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    move-result-object v4

    .line 792
    move-object/from16 v38, v12

    .line 793
    .line 794
    array-length v12, v4

    .line 795
    move-object/from16 v39, v0

    .line 796
    .line 797
    new-array v0, v12, [Ljava/lang/Class;

    .line 798
    .line 799
    move-object/from16 v40, v2

    .line 800
    .line 801
    new-instance v2, Ljava/util/ArrayList;

    .line 802
    .line 803
    move-object/from16 v41, v3

    .line 804
    .line 805
    array-length v3, v4

    .line 806
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 807
    .line 808
    .line 809
    new-instance v3, Ljava/util/ArrayList;

    .line 810
    .line 811
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 812
    .line 813
    .line 814
    move-object/from16 v44, v1

    .line 815
    .line 816
    move-object/from16 v42, v9

    .line 817
    .line 818
    const/4 v9, 0x0

    .line 819
    const/4 v12, 0x1

    .line 820
    const/16 v43, 0x0

    .line 821
    .line 822
    :goto_a
    array-length v1, v4

    .line 823
    if-ge v9, v1, :cond_13

    .line 824
    .line 825
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    if-ne v1, v8, :cond_6

    .line 830
    .line 831
    aget-object v1, v4, v9

    .line 832
    .line 833
    if-ne v1, v14, :cond_6

    .line 834
    .line 835
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    check-cast v1, Ljava/lang/Class;

    .line 840
    .line 841
    aput-object v1, v0, v9

    .line 842
    .line 843
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 852
    .line 853
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    move-object/from16 v45, v4

    .line 858
    .line 859
    aget-object v4, v0, v9

    .line 860
    .line 861
    move-object/from16 v46, v14

    .line 862
    .line 863
    const/4 v14, 0x1

    .line 864
    invoke-static {v1, v4, v10, v12, v14}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 880
    .line 881
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    aget-object v4, v45, v9

    .line 886
    .line 887
    const/4 v14, 0x1

    .line 888
    invoke-static {v1, v4, v10, v12, v14}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-object/from16 v14, v28

    .line 896
    .line 897
    move-object/from16 v28, v29

    .line 898
    .line 899
    move-object/from16 v29, v10

    .line 900
    .line 901
    :goto_b
    move-object/from16 v10, v27

    .line 902
    .line 903
    :goto_c
    move-object/from16 v27, v6

    .line 904
    .line 905
    :goto_d
    move-object/from16 v6, v22

    .line 906
    .line 907
    move-object/from16 v22, v20

    .line 908
    .line 909
    move-object/from16 v20, v24

    .line 910
    .line 911
    move-object/from16 v24, v7

    .line 912
    .line 913
    goto/16 :goto_e

    .line 914
    .line 915
    :cond_6
    move-object/from16 v45, v4

    .line 916
    .line 917
    move-object/from16 v46, v14

    .line 918
    .line 919
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    if-ne v1, v8, :cond_8

    .line 924
    .line 925
    aget-object v1, v45, v9

    .line 926
    .line 927
    move-object/from16 v4, v25

    .line 928
    .line 929
    if-ne v1, v4, :cond_7

    .line 930
    .line 931
    invoke-virtual {v13, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    check-cast v1, Ljava/lang/Class;

    .line 936
    .line 937
    aput-object v1, v0, v9

    .line 938
    .line 939
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v1

    .line 943
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 948
    .line 949
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    aget-object v14, v0, v9

    .line 954
    .line 955
    move-object/from16 v25, v4

    .line 956
    .line 957
    move-object/from16 v4, v29

    .line 958
    .line 959
    move-object/from16 v29, v10

    .line 960
    .line 961
    const/4 v10, 0x1

    .line 962
    invoke-static {v1, v14, v4, v12, v10}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v1

    .line 973
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 978
    .line 979
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    aget-object v10, v45, v9

    .line 984
    .line 985
    const/4 v14, 0x1

    .line 986
    invoke-static {v1, v10, v4, v12, v14}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 987
    .line 988
    .line 989
    move-result-object v1

    .line 990
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    move-object/from16 v10, v27

    .line 994
    .line 995
    move-object/from16 v14, v28

    .line 996
    .line 997
    move-object/from16 v28, v4

    .line 998
    .line 999
    goto :goto_c

    .line 1000
    :cond_7
    move-object/from16 v25, v4

    .line 1001
    .line 1002
    :cond_8
    move-object/from16 v4, v29

    .line 1003
    .line 1004
    move-object/from16 v29, v10

    .line 1005
    .line 1006
    aget-object v1, v45, v9

    .line 1007
    .line 1008
    if-ne v1, v7, :cond_9

    .line 1009
    .line 1010
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    check-cast v1, Ljava/lang/Class;

    .line 1015
    .line 1016
    aput-object v1, v0, v9

    .line 1017
    .line 1018
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v1

    .line 1026
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1027
    .line 1028
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    aget-object v10, v0, v9

    .line 1033
    .line 1034
    move-object/from16 v14, v28

    .line 1035
    .line 1036
    move-object/from16 v28, v4

    .line 1037
    .line 1038
    const/4 v4, 0x0

    .line 1039
    invoke-static {v1, v10, v14, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v1

    .line 1043
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v1

    .line 1050
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1055
    .line 1056
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    aget-object v4, v45, v9

    .line 1061
    .line 1062
    const/4 v10, 0x0

    .line 1063
    invoke-static {v1, v4, v14, v12, v10}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    goto/16 :goto_b

    .line 1071
    .line 1072
    :cond_9
    move-object/from16 v14, v28

    .line 1073
    .line 1074
    move-object/from16 v28, v4

    .line 1075
    .line 1076
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    if-ne v1, v8, :cond_a

    .line 1081
    .line 1082
    aget-object v1, v45, v9

    .line 1083
    .line 1084
    if-ne v1, v6, :cond_a

    .line 1085
    .line 1086
    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v1

    .line 1090
    check-cast v1, Ljava/lang/Class;

    .line 1091
    .line 1092
    aput-object v1, v0, v9

    .line 1093
    .line 1094
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v1

    .line 1098
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1103
    .line 1104
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v1

    .line 1108
    aget-object v4, v0, v9

    .line 1109
    .line 1110
    move-object/from16 v10, v27

    .line 1111
    .line 1112
    move-object/from16 v27, v6

    .line 1113
    .line 1114
    const/4 v6, 0x0

    .line 1115
    invoke-static {v1, v4, v10, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1120
    .line 1121
    .line 1122
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v1

    .line 1126
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1131
    .line 1132
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    aget-object v4, v45, v9

    .line 1137
    .line 1138
    const/4 v6, 0x0

    .line 1139
    invoke-static {v1, v4, v10, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    goto/16 :goto_d

    .line 1147
    .line 1148
    :cond_a
    move-object/from16 v10, v27

    .line 1149
    .line 1150
    move-object/from16 v27, v6

    .line 1151
    .line 1152
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v1

    .line 1156
    if-ne v1, v8, :cond_b

    .line 1157
    .line 1158
    aget-object v1, v45, v9

    .line 1159
    .line 1160
    if-ne v1, v11, :cond_b

    .line 1161
    .line 1162
    aput-object v11, v0, v9

    .line 1163
    .line 1164
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v1

    .line 1172
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1173
    .line 1174
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    move-object/from16 v4, v19

    .line 1179
    .line 1180
    const/4 v6, 0x0

    .line 1181
    invoke-static {v1, v11, v4, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v1

    .line 1185
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v1

    .line 1192
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v1

    .line 1196
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1197
    .line 1198
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v1

    .line 1202
    const/4 v6, 0x0

    .line 1203
    invoke-static {v1, v11, v4, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    move-object/from16 v19, v4

    .line 1211
    .line 1212
    goto/16 :goto_d

    .line 1213
    .line 1214
    :cond_b
    move-object/from16 v4, v19

    .line 1215
    .line 1216
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    if-ne v1, v8, :cond_d

    .line 1221
    .line 1222
    aget-object v1, v45, v9
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_6

    .line 1223
    .line 1224
    const-class v6, [Ljava/lang/Object;

    .line 1225
    .line 1226
    if-ne v1, v6, :cond_d

    .line 1227
    .line 1228
    :try_start_e
    aput-object v6, v0, v9

    .line 1229
    .line 1230
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    move-object/from16 v19, v4

    .line 1235
    .line 1236
    const-string v4, "visitFrame"

    .line 1237
    .line 1238
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1239
    .line 1240
    .line 1241
    move-result v1

    .line 1242
    if-eqz v1, :cond_c

    .line 1243
    .line 1244
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v1

    .line 1248
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v1

    .line 1252
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1253
    .line 1254
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    move-object/from16 v4, v24

    .line 1259
    .line 1260
    move-object/from16 v24, v7

    .line 1261
    .line 1262
    const/4 v7, 0x1

    .line 1263
    invoke-static {v1, v6, v4, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v1

    .line 1267
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1268
    .line 1269
    .line 1270
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v1

    .line 1274
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v1

    .line 1278
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1279
    .line 1280
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    const/4 v7, 0x1

    .line 1285
    invoke-static {v1, v6, v4, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v1

    .line 1289
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1290
    .line 1291
    .line 1292
    move-object/from16 v6, v22

    .line 1293
    .line 1294
    move-object/from16 v22, v20

    .line 1295
    .line 1296
    move-object/from16 v20, v4

    .line 1297
    .line 1298
    goto/16 :goto_e

    .line 1299
    .line 1300
    :cond_c
    move-object/from16 v4, v24

    .line 1301
    .line 1302
    move-object/from16 v24, v7

    .line 1303
    .line 1304
    const/4 v7, 0x1

    .line 1305
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v1

    .line 1309
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v1

    .line 1313
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1314
    .line 1315
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v1

    .line 1319
    move-object/from16 v7, v20

    .line 1320
    .line 1321
    move-object/from16 v20, v4

    .line 1322
    .line 1323
    const/4 v4, 0x0

    .line 1324
    invoke-static {v1, v6, v7, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1329
    .line 1330
    .line 1331
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1340
    .line 1341
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v1

    .line 1345
    const/4 v4, 0x0

    .line 1346
    invoke-static {v1, v6, v7, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v1

    .line 1350
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    move-object/from16 v6, v22

    .line 1354
    .line 1355
    move-object/from16 v22, v7

    .line 1356
    .line 1357
    goto :goto_e

    .line 1358
    :cond_d
    move-object/from16 v19, v24

    .line 1359
    .line 1360
    move-object/from16 v24, v7

    .line 1361
    .line 1362
    move-object/from16 v7, v20

    .line 1363
    .line 1364
    move-object/from16 v20, v19

    .line 1365
    .line 1366
    move-object/from16 v19, v4

    .line 1367
    .line 1368
    aget-object v1, v45, v9

    .line 1369
    .line 1370
    if-ne v1, v15, :cond_f

    .line 1371
    .line 1372
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v1

    .line 1376
    check-cast v1, Ljava/lang/Class;

    .line 1377
    .line 1378
    aput-object v1, v0, v9

    .line 1379
    .line 1380
    if-eqz v26, :cond_e

    .line 1381
    .line 1382
    if-eqz v31, :cond_e

    .line 1383
    .line 1384
    invoke-interface/range {v31 .. v31}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v1

    .line 1388
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v4

    .line 1392
    check-cast v4, Ljava/lang/Class;

    .line 1393
    .line 1394
    move-object/from16 v6, v22

    .line 1395
    .line 1396
    move-object/from16 v22, v7

    .line 1397
    .line 1398
    const/4 v7, 0x0

    .line 1399
    invoke-static {v1, v4, v6, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1404
    .line 1405
    .line 1406
    invoke-interface/range {v26 .. v26}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v1

    .line 1410
    invoke-static {v1, v15, v6, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1415
    .line 1416
    .line 1417
    goto :goto_e

    .line 1418
    :cond_e
    move-object/from16 v6, v22

    .line 1419
    .line 1420
    move-object/from16 v22, v7

    .line 1421
    .line 1422
    const/16 v43, 0x1

    .line 1423
    .line 1424
    goto :goto_e

    .line 1425
    :cond_f
    move-object/from16 v6, v22

    .line 1426
    .line 1427
    move-object/from16 v22, v7

    .line 1428
    .line 1429
    aput-object v1, v0, v9

    .line 1430
    .line 1431
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;

    .line 1432
    .line 1433
    invoke-direct {v1, v9}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;-><init>(I)V

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1437
    .line 1438
    .line 1439
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;

    .line 1440
    .line 1441
    invoke-direct {v1, v9}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;-><init>(I)V

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    :goto_e
    aget-object v1, v0, v9

    .line 1448
    .line 1449
    if-nez v1, :cond_10

    .line 1450
    .line 1451
    const/4 v1, 0x1

    .line 1452
    :goto_f
    move/from16 v4, v43

    .line 1453
    .line 1454
    goto :goto_12

    .line 1455
    :cond_10
    aget-object v1, v45, v9

    .line 1456
    .line 1457
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 1458
    .line 1459
    if-eq v1, v4, :cond_12

    .line 1460
    .line 1461
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6

    .line 1462
    .line 1463
    if-ne v1, v4, :cond_11

    .line 1464
    .line 1465
    goto :goto_10

    .line 1466
    :cond_11
    const/4 v4, 0x1

    .line 1467
    goto :goto_11

    .line 1468
    :cond_12
    :goto_10
    const/4 v4, 0x2

    .line 1469
    :goto_11
    add-int/2addr v12, v4

    .line 1470
    add-int/lit8 v9, v9, 0x1

    .line 1471
    .line 1472
    move-object/from16 v7, v24

    .line 1473
    .line 1474
    move-object/from16 v4, v45

    .line 1475
    .line 1476
    move-object/from16 v24, v20

    .line 1477
    .line 1478
    move-object/from16 v20, v22

    .line 1479
    .line 1480
    move-object/from16 v22, v6

    .line 1481
    .line 1482
    move-object/from16 v6, v27

    .line 1483
    .line 1484
    move-object/from16 v27, v10

    .line 1485
    .line 1486
    move-object/from16 v10, v29

    .line 1487
    .line 1488
    move-object/from16 v29, v28

    .line 1489
    .line 1490
    move-object/from16 v28, v14

    .line 1491
    .line 1492
    move-object/from16 v14, v46

    .line 1493
    .line 1494
    goto/16 :goto_a

    .line 1495
    .line 1496
    :cond_13
    move-object/from16 v46, v14

    .line 1497
    .line 1498
    move-object/from16 v14, v28

    .line 1499
    .line 1500
    move-object/from16 v28, v29

    .line 1501
    .line 1502
    move-object/from16 v29, v10

    .line 1503
    .line 1504
    move-object/from16 v10, v27

    .line 1505
    .line 1506
    move-object/from16 v27, v6

    .line 1507
    .line 1508
    move-object/from16 v6, v22

    .line 1509
    .line 1510
    move-object/from16 v22, v20

    .line 1511
    .line 1512
    move-object/from16 v20, v24

    .line 1513
    .line 1514
    move-object/from16 v24, v7

    .line 1515
    .line 1516
    const/4 v1, 0x0

    .line 1517
    goto :goto_f

    .line 1518
    :goto_12
    if-eqz v1, :cond_14

    .line 1519
    .line 1520
    :catch_7
    move-object/from16 v0, v18

    .line 1521
    .line 1522
    const/4 v4, 0x1

    .line 1523
    goto :goto_13

    .line 1524
    :cond_14
    :try_start_f
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v1

    .line 1528
    check-cast v1, Ljava/lang/Class;

    .line 1529
    .line 1530
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v7

    .line 1534
    invoke-virtual {v1, v7, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0
    :try_end_f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6

    .line 1538
    :goto_13
    if-eqz v4, :cond_16

    .line 1539
    .line 1540
    :try_start_10
    invoke-static/range {v34 .. v34}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v1

    .line 1544
    move-object/from16 v4, v44

    .line 1545
    .line 1546
    invoke-interface {v4, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v1

    .line 1550
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v2

    .line 1554
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v1

    .line 1558
    if-eqz v0, :cond_15

    .line 1559
    .line 1560
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    move-object/from16 v7, v42

    .line 1565
    .line 1566
    invoke-interface {v7, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v0

    .line 1570
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v2

    .line 1574
    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    :goto_14
    move-object/from16 v9, v21

    .line 1579
    .line 1580
    move-object/from16 v11, v41

    .line 1581
    .line 1582
    goto/16 :goto_16

    .line 1583
    .line 1584
    :cond_15
    move-object/from16 v7, v42

    .line 1585
    .line 1586
    move-object v0, v7

    .line 1587
    goto :goto_14

    .line 1588
    :cond_16
    move-object/from16 v7, v42

    .line 1589
    .line 1590
    move-object/from16 v4, v44

    .line 1591
    .line 1592
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v1

    .line 1596
    move-object/from16 v9, v21

    .line 1597
    .line 1598
    invoke-virtual {v1, v9}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v1

    .line 1602
    invoke-virtual {v1, v2}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v1

    .line 1606
    invoke-static/range {v34 .. v34}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v2

    .line 1610
    invoke-virtual {v2, v9}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v2

    .line 1614
    invoke-virtual {v2, v3}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v2

    .line 1618
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v3

    .line 1622
    move-object/from16 v11, v41

    .line 1623
    .line 1624
    invoke-virtual {v11, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v3

    .line 1628
    check-cast v3, Ljava/lang/Class;

    .line 1629
    .line 1630
    if-eqz v3, :cond_17

    .line 1631
    .line 1632
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v12

    .line 1636
    invoke-virtual {v5, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v12

    .line 1640
    check-cast v12, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1641
    .line 1642
    invoke-interface {v12}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v12

    .line 1646
    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v12

    .line 1650
    move-object/from16 v21, v0

    .line 1651
    .line 1652
    invoke-static/range {v38 .. v38}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    invoke-interface {v12, v0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 1661
    .line 1662
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v0

    .line 1666
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 1667
    .line 1668
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/MethodCall;->withMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v1

    .line 1676
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    check-cast v0, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1681
    .line 1682
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v0

    .line 1690
    invoke-static/range {v38 .. v38}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v3

    .line 1694
    invoke-interface {v0, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v0

    .line 1698
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 1699
    .line 1700
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v0

    .line 1704
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 1705
    .line 1706
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    invoke-virtual {v0, v2}, Lnet/bytebuddy/implementation/MethodCall;->withMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v2

    .line 1714
    goto :goto_15

    .line 1715
    :cond_17
    move-object/from16 v21, v0

    .line 1716
    .line 1717
    :goto_15
    invoke-static/range {v34 .. v34}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v0

    .line 1721
    invoke-interface {v4, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v0

    .line 1725
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v0

    .line 1729
    invoke-static/range {v21 .. v21}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    invoke-interface {v7, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v1

    .line 1737
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v1

    .line 1741
    move-object/from16 v47, v1

    .line 1742
    .line 1743
    move-object v1, v0

    .line 1744
    move-object/from16 v0, v47

    .line 1745
    .line 1746
    :goto_16
    add-int/lit8 v2, v37, 0x1

    .line 1747
    .line 1748
    move-object/from16 v21, v9

    .line 1749
    .line 1750
    move-object v3, v11

    .line 1751
    move-object/from16 v7, v24

    .line 1752
    .line 1753
    move/from16 v4, v35

    .line 1754
    .line 1755
    move-object/from16 v12, v38

    .line 1756
    .line 1757
    move-object v9, v0

    .line 1758
    move v11, v2

    .line 1759
    move-object/from16 v24, v20

    .line 1760
    .line 1761
    move-object/from16 v20, v22

    .line 1762
    .line 1763
    move-object/from16 v0, v39

    .line 1764
    .line 1765
    move-object/from16 v2, v40

    .line 1766
    .line 1767
    move-object/from16 v22, v6

    .line 1768
    .line 1769
    move-object/from16 v6, v27

    .line 1770
    .line 1771
    move-object/from16 v27, v10

    .line 1772
    .line 1773
    move-object/from16 v10, v29

    .line 1774
    .line 1775
    move-object/from16 v29, v28

    .line 1776
    .line 1777
    move-object/from16 v28, v14

    .line 1778
    .line 1779
    move-object/from16 v14, v46

    .line 1780
    .line 1781
    goto/16 :goto_9

    .line 1782
    .line 1783
    :cond_18
    move-object/from16 v39, v0

    .line 1784
    .line 1785
    move-object v4, v1

    .line 1786
    move-object/from16 v40, v2

    .line 1787
    .line 1788
    move-object v11, v3

    .line 1789
    move-object/from16 v46, v14

    .line 1790
    .line 1791
    move-object/from16 v14, v28

    .line 1792
    .line 1793
    move-object/from16 v28, v29

    .line 1794
    .line 1795
    move-object/from16 v29, v10

    .line 1796
    .line 1797
    move-object/from16 v10, v27

    .line 1798
    .line 1799
    move-object/from16 v27, v6

    .line 1800
    .line 1801
    move-object/from16 v6, v22

    .line 1802
    .line 1803
    move-object/from16 v22, v20

    .line 1804
    .line 1805
    move-object/from16 v20, v24

    .line 1806
    .line 1807
    move-object/from16 v24, v7

    .line 1808
    .line 1809
    move-object v7, v9

    .line 1810
    move-object/from16 v9, v21

    .line 1811
    .line 1812
    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v0

    .line 1816
    invoke-interface {v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v1

    .line 1820
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v2

    .line 1824
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v3

    .line 1828
    move-object/from16 v4, v40

    .line 1829
    .line 1830
    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1831
    .line 1832
    .line 1833
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v2

    .line 1837
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v3

    .line 1841
    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-object/from16 v2, v39

    .line 1845
    .line 1846
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1850
    .line 1851
    .line 1852
    move-object v0, v2

    .line 1853
    move-object v2, v4

    .line 1854
    move-object/from16 v21, v9

    .line 1855
    .line 1856
    move-object v3, v11

    .line 1857
    move-object/from16 v7, v24

    .line 1858
    .line 1859
    move-object/from16 v1, v26

    .line 1860
    .line 1861
    move-object/from16 v9, v30

    .line 1862
    .line 1863
    move-object/from16 v4, v31

    .line 1864
    .line 1865
    move-object/from16 v24, v20

    .line 1866
    .line 1867
    move-object/from16 v20, v22

    .line 1868
    .line 1869
    move-object/from16 v22, v6

    .line 1870
    .line 1871
    move-object/from16 v6, v27

    .line 1872
    .line 1873
    move-object/from16 v27, v10

    .line 1874
    .line 1875
    move-object/from16 v10, v29

    .line 1876
    .line 1877
    move-object/from16 v29, v28

    .line 1878
    .line 1879
    move-object/from16 v28, v14

    .line 1880
    .line 1881
    move-object/from16 v14, v46

    .line 1882
    .line 1883
    goto/16 :goto_8

    .line 1884
    .line 1885
    :cond_19
    move-object v4, v2

    .line 1886
    move-object/from16 v38, v12

    .line 1887
    .line 1888
    move-object v2, v0

    .line 1889
    new-instance v0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;

    .line 1890
    .line 1891
    const/4 v6, 0x0

    .line 1892
    invoke-direct {v0, v6}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;-><init>(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    .line 1893
    .line 1894
    .line 1895
    move-object/from16 v1, p0

    .line 1896
    .line 1897
    :try_start_11
    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 1898
    .line 1899
    move-object/from16 v5, v17

    .line 1900
    .line 1901
    filled-new-array {v5, v3}, [Ljava/lang/Class;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v3

    .line 1905
    invoke-virtual {v0, v3}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;->appendMostSpecific([Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v0

    .line 1909
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;->build()Ljava/lang/ClassLoader;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v0

    .line 1913
    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 1914
    .line 1915
    const-class v6, Lnet/bytebuddy/asm/ClassVisitorFactory;

    .line 1916
    .line 1917
    sget-object v7, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 1918
    .line 1919
    invoke-virtual {v3, v6, v7}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v3

    .line 1923
    invoke-static/range {v38 .. v38}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v6

    .line 1927
    invoke-interface {v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v3

    .line 1931
    iget-object v6, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 1932
    .line 1933
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v6

    .line 1937
    check-cast v6, Lnet/bytebuddy/description/type/TypeDescription;

    .line 1938
    .line 1939
    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v6

    .line 1943
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v7

    .line 1947
    invoke-interface {v6, v7}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v6

    .line 1951
    check-cast v6, Lnet/bytebuddy/description/method/MethodList;

    .line 1952
    .line 1953
    invoke-interface {v6}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v6

    .line 1957
    check-cast v6, Lnet/bytebuddy/description/method/MethodDescription;

    .line 1958
    .line 1959
    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v6

    .line 1963
    const/16 v23, 0x0

    .line 1964
    .line 1965
    filled-new-array/range {v23 .. v23}, [I

    .line 1966
    .line 1967
    .line 1968
    move-result-object v7

    .line 1969
    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v6

    .line 1973
    invoke-interface {v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v3

    .line 1977
    const-string v6, "unwrap"

    .line 1978
    .line 1979
    invoke-static {v6}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v6

    .line 1983
    invoke-interface {v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v3

    .line 1987
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v4

    .line 1991
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription;

    .line 1992
    .line 1993
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v4

    .line 1997
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v6

    .line 2001
    invoke-interface {v4, v6}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v4

    .line 2005
    check-cast v4, Lnet/bytebuddy/description/method/MethodList;

    .line 2006
    .line 2007
    invoke-interface {v4}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v4

    .line 2011
    check-cast v4, Lnet/bytebuddy/description/method/MethodDescription;

    .line 2012
    .line 2013
    invoke-static {v4}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v4

    .line 2017
    const/16 v23, 0x0

    .line 2018
    .line 2019
    filled-new-array/range {v23 .. v23}, [I

    .line 2020
    .line 2021
    .line 2022
    move-result-object v6

    .line 2023
    invoke-virtual {v4, v6}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v4

    .line 2027
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 2028
    .line 2029
    sget-object v7, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 2030
    .line 2031
    invoke-virtual {v4, v6, v7}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v4

    .line 2035
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v3

    .line 2039
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v3

    .line 2043
    invoke-interface {v3, v2}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->include(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v2

    .line 2047
    invoke-interface {v2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v2

    .line 2051
    invoke-interface {v2}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v2

    .line 2055
    const-class v3, Ljava/lang/Class;

    .line 2056
    .line 2057
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v3

    .line 2061
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v2

    .line 2065
    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 2066
    .line 2067
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v3

    .line 2071
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v2

    .line 2075
    check-cast v2, Lnet/bytebuddy/asm/ClassVisitorFactory;

    .line 2076
    .line 2077
    instance-of v3, v0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader;

    .line 2078
    .line 2079
    if-eqz v3, :cond_1b

    .line 2080
    .line 2081
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v3

    .line 2085
    if-eq v0, v3, :cond_1b

    .line 2086
    .line 2087
    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 2088
    .line 2089
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v3

    .line 2093
    if-eq v0, v3, :cond_1b

    .line 2094
    .line 2095
    move-object v3, v0

    .line 2096
    check-cast v3, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader;

    .line 2097
    .line 2098
    invoke-virtual {v3}, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;->seal()Z

    .line 2099
    .line 2100
    .line 2101
    move-result v3

    .line 2102
    if-eqz v3, :cond_1a

    .line 2103
    .line 2104
    goto :goto_17

    .line 2105
    :cond_1a
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 2106
    .line 2107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2108
    .line 2109
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2110
    .line 2111
    .line 2112
    const-string v4, "Failed to seal multiple parent class loader: "

    .line 2113
    .line 2114
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2115
    .line 2116
    .line 2117
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2118
    .line 2119
    .line 2120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v0

    .line 2124
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2125
    .line 2126
    .line 2127
    throw v2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    .line 2128
    :cond_1b
    :goto_17
    return-object v2

    .line 2129
    :goto_18
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 2130
    .line 2131
    iget-object v1, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 2132
    .line 2133
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v1

    .line 2137
    const-string v3, "Failed to generate factory for "

    .line 2138
    .line 2139
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v1

    .line 2143
    invoke-direct {v2, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2144
    .line 2145
    .line 2146
    throw v2

    .line 2147
    :cond_1c
    const-string v0, "Expected a class named ClassVisitor: "

    .line 2148
    .line 2149
    invoke-static {v13, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v0

    .line 2153
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 2154
    .line 2155
    .line 2156
    return-object v18
.end method
