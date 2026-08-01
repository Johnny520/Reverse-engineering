.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "UsingMethodHandleLookup"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/16 v6, 0x19

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    invoke-virtual {v0, v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 7
    .line 8
    .line 9
    const/4 v8, 0x4

    .line 10
    invoke-virtual {v0, v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 11
    .line 12
    .line 13
    const-string v4, "(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandleInfo;"

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/16 v1, 0xb6

    .line 17
    .line 18
    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    .line 19
    .line 20
    const-string v3, "revealDirect"

    .line 21
    .line 22
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    const/16 v9, 0x3a

    .line 26
    .line 27
    const/16 v10, 0xa

    .line 28
    .line 29
    invoke-virtual {v0, v9, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v6, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 33
    .line 34
    .line 35
    const-string v4, "()I"

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    const/16 v1, 0xb9

    .line 39
    .line 40
    const-string v2, "java/lang/invoke/MethodHandleInfo"

    .line 41
    .line 42
    const-string v3, "getModifiers"

    .line 43
    .line 44
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v4, "(I)Z"

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/16 v1, 0xb8

    .line 51
    .line 52
    const-string v2, "java/lang/reflect/Modifier"

    .line 53
    .line 54
    const-string v3, "isProtected"

    .line 55
    .line 56
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    new-instance v11, Lnet/bytebuddy/jar/asm/Label;

    .line 60
    .line 61
    invoke-direct {v11}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 62
    .line 63
    .line 64
    const/16 v12, 0x99

    .line 65
    .line 66
    invoke-virtual {v0, v12, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 70
    .line 71
    .line 72
    const-string v4, "()Ljava/lang/Class;"

    .line 73
    .line 74
    const/16 v1, 0xb6

    .line 75
    .line 76
    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    .line 77
    .line 78
    const-string v3, "lookupClass"

    .line 79
    .line 80
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v6, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 84
    .line 85
    .line 86
    const-string v4, "()Ljava/lang/Class;"

    .line 87
    .line 88
    const/4 v5, 0x1

    .line 89
    const/16 v1, 0xb9

    .line 90
    .line 91
    const-string v2, "java/lang/invoke/MethodHandleInfo"

    .line 92
    .line 93
    const-string v3, "getDeclaringClass"

    .line 94
    .line 95
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v4, "(Ljava/lang/Class;Ljava/lang/Class;)Z"

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    const/16 v1, 0xb8

    .line 102
    .line 103
    const-string v2, "sun/invoke/util/VerifyAccess"

    .line 104
    .line 105
    const-string v3, "isSamePackage"

    .line 106
    .line 107
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 108
    .line 109
    .line 110
    new-instance v13, Lnet/bytebuddy/jar/asm/Label;

    .line 111
    .line 112
    invoke-direct {v13}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 119
    .line 120
    .line 121
    sget-object v20, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    .line 122
    .line 123
    const-string v23, "[B"

    .line 124
    .line 125
    const-string v24, "java/lang/invoke/MethodHandleInfo"

    .line 126
    .line 127
    const-string v14, "java/lang/invoke/MethodHandles$Lookup"

    .line 128
    .line 129
    const-string v15, "java/lang/String"

    .line 130
    .line 131
    const-string v16, "java/lang/invoke/MethodType"

    .line 132
    .line 133
    const-string v17, "java/lang/invoke/MethodType"

    .line 134
    .line 135
    const-string v18, "java/lang/invoke/MethodHandle"

    .line 136
    .line 137
    const-string v19, "java/lang/invoke/MethodType"

    .line 138
    .line 139
    const-string v21, "java/util/List"

    .line 140
    .line 141
    const-string v22, "java/util/List"

    .line 142
    .line 143
    filled-new-array/range {v14 .. v24}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    const/4 v4, 0x0

    .line 148
    new-array v5, v7, [Ljava/lang/Object;

    .line 149
    .line 150
    const/4 v1, 0x0

    .line 151
    const/16 v2, 0xb

    .line 152
    .line 153
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v6, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 157
    .line 158
    .line 159
    const-string v4, "()I"

    .line 160
    .line 161
    const/4 v5, 0x1

    .line 162
    const/16 v1, 0xb9

    .line 163
    .line 164
    const-string v2, "java/lang/invoke/MethodHandleInfo"

    .line 165
    .line 166
    const-string v3, "getReferenceKind"

    .line 167
    .line 168
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 169
    .line 170
    .line 171
    const/16 v1, 0x10

    .line 172
    .line 173
    const/4 v2, 0x7

    .line 174
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 175
    .line 176
    .line 177
    new-instance v11, Lnet/bytebuddy/jar/asm/Label;

    .line 178
    .line 179
    invoke-direct {v11}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 180
    .line 181
    .line 182
    const/16 v1, 0xa0

    .line 183
    .line 184
    invoke-virtual {v0, v1, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 188
    .line 189
    .line 190
    const/4 v4, 0x0

    .line 191
    const/4 v5, 0x0

    .line 192
    const/4 v1, 0x3

    .line 193
    const/4 v2, 0x0

    .line 194
    const/4 v3, 0x0

    .line 195
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 199
    .line 200
    .line 201
    new-instance v13, Lnet/bytebuddy/jar/asm/Label;

    .line 202
    .line 203
    invoke-direct {v13}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 204
    .line 205
    .line 206
    const/16 v14, 0xa7

    .line 207
    .line 208
    invoke-virtual {v0, v14, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    const/4 v11, 0x3

    .line 218
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 222
    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    filled-new-array/range {v20 .. v20}, [Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    const/4 v1, 0x4

    .line 230
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const/16 v1, 0x36

    .line 234
    .line 235
    const/16 v2, 0xb

    .line 236
    .line 237
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 238
    .line 239
    .line 240
    const/16 v1, 0x15

    .line 241
    .line 242
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 243
    .line 244
    .line 245
    new-instance v13, Lnet/bytebuddy/jar/asm/Label;

    .line 246
    .line 247
    invoke-direct {v13}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 254
    .line 255
    .line 256
    const/16 v12, 0x9

    .line 257
    .line 258
    invoke-virtual {v0, v6, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v6, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 265
    .line 266
    .line 267
    const/4 v15, 0x5

    .line 268
    invoke-virtual {v0, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 269
    .line 270
    .line 271
    const/16 v1, 0xbd

    .line 272
    .line 273
    const-string v2, "java/lang/invoke/MethodHandles$Lookup$ClassOption"

    .line 274
    .line 275
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 276
    .line 277
    .line 278
    const/16 v3, 0x59

    .line 279
    .line 280
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 284
    .line 285
    .line 286
    const/16 v4, 0xb2

    .line 287
    .line 288
    const-string v5, "NESTMATE"

    .line 289
    .line 290
    const-string v10, "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;"

    .line 291
    .line 292
    invoke-virtual {v0, v4, v2, v5, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const/16 v11, 0x53

    .line 296
    .line 297
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 304
    .line 305
    .line 306
    const-string v15, "STRONG"

    .line 307
    .line 308
    invoke-virtual {v0, v4, v2, v15, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 312
    .line 313
    .line 314
    move/from16 v18, v4

    .line 315
    .line 316
    const-string v4, "([BLjava/lang/Object;Z[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;"

    .line 317
    .line 318
    move-object/from16 v19, v5

    .line 319
    .line 320
    const/4 v5, 0x0

    .line 321
    move/from16 v21, v1

    .line 322
    .line 323
    const/16 v1, 0xb6

    .line 324
    .line 325
    move-object/from16 v22, v2

    .line 326
    .line 327
    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    .line 328
    .line 329
    move/from16 v23, v3

    .line 330
    .line 331
    const-string v3, "defineHiddenClassWithClassData"

    .line 332
    .line 333
    move-object/from16 v26, v19

    .line 334
    .line 335
    move/from16 v11, v21

    .line 336
    .line 337
    move-object/from16 v25, v22

    .line 338
    .line 339
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 340
    .line 341
    .line 342
    const/16 v1, 0xc

    .line 343
    .line 344
    invoke-virtual {v0, v9, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 345
    .line 346
    .line 347
    new-instance v2, Lnet/bytebuddy/jar/asm/Label;

    .line 348
    .line 349
    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 353
    .line 354
    .line 355
    new-instance v2, Lnet/bytebuddy/jar/asm/Label;

    .line 356
    .line 357
    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v14, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 364
    .line 365
    .line 366
    filled-new-array/range {v20 .. v20}, [Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    const/4 v4, 0x0

    .line 371
    const/4 v5, 0x0

    .line 372
    move v13, v1

    .line 373
    const/4 v1, 0x1

    .line 374
    move-object v14, v2

    .line 375
    const/4 v2, 0x1

    .line 376
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v6, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 386
    .line 387
    .line 388
    const/4 v1, 0x5

    .line 389
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 390
    .line 391
    .line 392
    move-object/from16 v1, v25

    .line 393
    .line 394
    invoke-virtual {v0, v11, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const/16 v2, 0x59

    .line 398
    .line 399
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 400
    .line 401
    .line 402
    const/4 v3, 0x3

    .line 403
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v4, v26

    .line 407
    .line 408
    const/16 v3, 0xb2

    .line 409
    .line 410
    invoke-virtual {v0, v3, v1, v4, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    const/16 v4, 0x53

    .line 414
    .line 415
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v3, v1, v15, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 428
    .line 429
    .line 430
    const-string v4, "([BZ[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;"

    .line 431
    .line 432
    const/4 v5, 0x0

    .line 433
    const/16 v1, 0xb6

    .line 434
    .line 435
    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    .line 436
    .line 437
    const-string v3, "defineHiddenClass"

    .line 438
    .line 439
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v9, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 446
    .line 447
    .line 448
    const-string v1, "java/lang/invoke/MethodHandles$Lookup"

    .line 449
    .line 450
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    const/4 v4, 0x0

    .line 455
    const/4 v5, 0x0

    .line 456
    const/4 v1, 0x1

    .line 457
    const/4 v2, 0x1

    .line 458
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v6, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 462
    .line 463
    .line 464
    const-string v4, "()Ljava/lang/Class;"

    .line 465
    .line 466
    const/4 v5, 0x0

    .line 467
    const/16 v1, 0xb6

    .line 468
    .line 469
    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    .line 470
    .line 471
    const-string v3, "lookupClass"

    .line 472
    .line 473
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 474
    .line 475
    .line 476
    const/16 v1, 0xa

    .line 477
    .line 478
    invoke-virtual {v0, v9, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 479
    .line 480
    .line 481
    const-string v22, "java/util/List"

    .line 482
    .line 483
    const-string v23, "java/lang/Class"

    .line 484
    .line 485
    const-string v14, "java/lang/invoke/MethodHandles$Lookup"

    .line 486
    .line 487
    const-string v15, "java/lang/String"

    .line 488
    .line 489
    const-string v16, "java/lang/invoke/MethodType"

    .line 490
    .line 491
    const-string v17, "java/lang/invoke/MethodType"

    .line 492
    .line 493
    const-string v18, "java/lang/invoke/MethodHandle"

    .line 494
    .line 495
    const-string v19, "java/lang/invoke/MethodType"

    .line 496
    .line 497
    const-string v21, "java/util/List"

    .line 498
    .line 499
    filled-new-array/range {v14 .. v23}, [Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    const/4 v4, 0x0

    .line 504
    const/4 v5, 0x0

    .line 505
    const/4 v1, 0x0

    .line 506
    const/16 v2, 0xa

    .line 507
    .line 508
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-void
.end method

.method public getLocalVariableLength()I
    .locals 0

    .line 1
    const/16 p0, 0xf

    .line 2
    .line 3
    return p0
.end method

.method public getStackSize()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method
