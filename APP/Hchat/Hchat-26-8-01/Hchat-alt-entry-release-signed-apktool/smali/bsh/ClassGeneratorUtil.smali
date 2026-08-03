.class public Lbsh/ClassGeneratorUtil;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/org/objectweb/asm/Opcodes;


# static fields
.field static final ACCESS_MODIFIERS:I = 0x7

.field static final DEFAULTCONSTRUCTOR:I = -0x1

.field private static final GENERATED_CLASS_DESC:Ljava/lang/String;

.field private static final OBJECT:Ljava/lang/String; = "Ljava/lang/Object;"

.field private static final PRIMITIVE_DESC:Ljava/lang/String;

.field private static final PRIMITIVE_NAME:Ljava/lang/String;


# instance fields
.field private final classDescript:Ljava/lang/String;

.field private final classModifiers:Lbsh/Modifiers;

.field private final className:Ljava/lang/String;

.field private final constructors:[Lbsh/DelayedEvalBshMethod;

.field private final fqClassName:Ljava/lang/String;

.field private final interfaces:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final methods:[Lbsh/DelayedEvalBshMethod;

.field private final superClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final superClassName:Ljava/lang/String;

.field private final type:Lbsh/ClassGenerator$Type;

.field private final uuid:Ljava/lang/String;

.field private final vars:[Lbsh/Variable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lbsh/GeneratedClass;

    .line 2
    .line 3
    invoke-static {v0}, Lbsh/org/objectweb/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbsh/ClassGeneratorUtil;->GENERATED_CLASS_DESC:Ljava/lang/String;

    .line 8
    .line 9
    const-class v0, Lbsh/Primitive;

    .line 10
    .line 11
    invoke-static {v0}, Lbsh/org/objectweb/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, Lbsh/ClassGeneratorUtil;->PRIMITIVE_NAME:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0}, Lbsh/org/objectweb/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lbsh/ClassGeneratorUtil;->PRIMITIVE_DESC:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lbsh/Modifiers;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Lbsh/Variable;[Lbsh/DelayedEvalBshMethod;Lbsh/NameSpace;Lbsh/ClassGenerator$Type;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/Modifiers;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;[",
            "Lbsh/Variable;",
            "[",
            "Lbsh/DelayedEvalBshMethod;",
            "Lbsh/NameSpace;",
            "Lbsh/ClassGenerator$Type;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    move-object/from16 v2, p8

    .line 6
    .line 7
    move-object/from16 v3, p9

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lbsh/ClassGeneratorUtil;->classModifiers:Lbsh/Modifiers;

    .line 13
    .line 14
    iput-object p2, p0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v3, p0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 17
    .line 18
    const/16 v4, 0x2f

    .line 19
    .line 20
    const/16 v5, 0x2e

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    new-instance v6, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p3, "/"

    .line 37
    .line 38
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    iput-object p3, p0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput-object p2, p0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 52
    .line 53
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v6, "L"

    .line 56
    .line 57
    invoke-direct {p3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v6, p0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v6, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v4, ";"

    .line 70
    .line 71
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    iput-object p3, p0, Lbsh/ClassGeneratorUtil;->classDescript:Ljava/lang/String;

    .line 79
    .line 80
    if-nez p4, :cond_2

    .line 81
    .line 82
    sget-object p3, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 83
    .line 84
    if-ne v3, p3, :cond_1

    .line 85
    .line 86
    const-class p4, Ljava/lang/Enum;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const-class p4, Ljava/lang/Object;

    .line 90
    .line 91
    :cond_2
    :goto_1
    iput-object p4, p0, Lbsh/ClassGeneratorUtil;->superClass:Ljava/lang/Class;

    .line 92
    .line 93
    invoke-static {p4}, Lbsh/org/objectweb/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    iput-object p3, p0, Lbsh/ClassGeneratorUtil;->superClassName:Ljava/lang/String;

    .line 98
    .line 99
    if-nez p5, :cond_3

    .line 100
    .line 101
    sget-object p3, Lbsh/Reflect;->ZERO_TYPES:[Ljava/lang/Class;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move-object p3, p5

    .line 105
    :goto_2
    iput-object p3, p0, Lbsh/ClassGeneratorUtil;->interfaces:[Ljava/lang/Class;

    .line 106
    .line 107
    iput-object v0, p0, Lbsh/ClassGeneratorUtil;->vars:[Lbsh/Variable;

    .line 108
    .line 109
    sget-object p3, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 110
    .line 111
    const/4 p4, 0x0

    .line 112
    const/4 v4, 0x1

    .line 113
    if-ne v3, p3, :cond_4

    .line 114
    .line 115
    move p3, v4

    .line 116
    goto :goto_3

    .line 117
    :cond_4
    move p3, p4

    .line 118
    :goto_3
    iput-boolean p3, v2, Lbsh/NameSpace;->isInterface:Z

    .line 119
    .line 120
    sget-object p3, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 121
    .line 122
    if-ne v3, p3, :cond_5

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    move v4, p4

    .line 126
    :goto_4
    iput-boolean v4, v2, Lbsh/NameSpace;->isEnum:Z

    .line 127
    .line 128
    sget-object p3, Lbsh/This;->contextStore:Ljava/util/Map;

    .line 129
    .line 130
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iput-object v4, p0, Lbsh/ClassGeneratorUtil;->uuid:Ljava/lang/String;

    .line 139
    .line 140
    invoke-interface {p3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    new-instance p3, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v2, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-static {p2}, Lbsh/Types;->getBaseName(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    array-length v4, v1

    .line 158
    :goto_5
    if-ge p4, v4, :cond_8

    .line 159
    .line 160
    aget-object v5, v1, p4

    .line 161
    .line 162
    invoke-virtual {v5}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-eqz v6, :cond_7

    .line 171
    .line 172
    iget-object v6, v5, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 173
    .line 174
    const/4 v7, 0x5

    .line 175
    invoke-virtual {v6, v7}, Lbsh/Modifiers;->isAppliedContext(I)Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-nez v6, :cond_6

    .line 180
    .line 181
    iget-object v6, v5, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 182
    .line 183
    invoke-virtual {v6, v7}, Lbsh/Modifiers;->changeContext(I)V

    .line 184
    .line 185
    .line 186
    :cond_6
    invoke-virtual {p3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_7
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    :goto_6
    add-int/lit8 p4, p4, 0x1

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_8
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    new-array p2, p2, [Lbsh/DelayedEvalBshMethod;

    .line 201
    .line 202
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    check-cast p2, [Lbsh/DelayedEvalBshMethod;

    .line 207
    .line 208
    iput-object p2, p0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    new-array p2, p2, [Lbsh/DelayedEvalBshMethod;

    .line 215
    .line 216
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    check-cast p2, [Lbsh/DelayedEvalBshMethod;

    .line 221
    .line 222
    iput-object p2, p0, Lbsh/ClassGeneratorUtil;->methods:[Lbsh/DelayedEvalBshMethod;

    .line 223
    .line 224
    iget-object v3, p0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    array-length p2, v0

    .line 243
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    const-string v0, "Generate class "

    .line 248
    .line 249
    const-string v2, " "

    .line 250
    .line 251
    const-string v4, " cons:"

    .line 252
    .line 253
    const-string v6, " meths:"

    .line 254
    .line 255
    const-string v8, " vars:"

    .line 256
    .line 257
    move-object/from16 v1, p9

    .line 258
    .line 259
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    invoke-static {p2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    sget-object p2, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 267
    .line 268
    if-ne v1, p2, :cond_9

    .line 269
    .line 270
    const-string p2, "abstract"

    .line 271
    .line 272
    invoke-virtual {p1, p2}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result p3

    .line 276
    if-nez p3, :cond_9

    .line 277
    .line 278
    invoke-virtual {p1, p2}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :cond_9
    sget-object p2, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 282
    .line 283
    if-ne v1, p2, :cond_a

    .line 284
    .line 285
    const-string p2, "static"

    .line 286
    .line 287
    invoke-virtual {p1, p2}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result p3

    .line 291
    if-nez p3, :cond_a

    .line 292
    .line 293
    invoke-virtual {p1, p2}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :cond_a
    return-void
.end method

.method public static synthetic a(I)[Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/ClassGeneratorUtil;->lambda$checkAbstractMethodImplementation$3(I)[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/ClassGeneratorUtil;->lambda$checkAbstractMethodImplementation$2(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/ClassGeneratorUtil;->lambda$checkAbstractMethodImplementation$1(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static checkAbstractMethodImplementation(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lbsh/ClassGeneratorUtil$1Reflector;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lbsh/ClassGeneratorUtil$1Reflector;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lbsh/ClassGeneratorUtil$1Reflector;->gatherMethods(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lbsh/a;

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    invoke-direct {v2, v3}, Lbsh/a;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lbe/w;

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    invoke-direct {v2, v0, v3, p0}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static checkInheritanceRules(IILjava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    and-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x7

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, p0, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq p0, v1, :cond_1

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    if-eq p1, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "Cannot reduce the visibility of the inherited method from "

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_1
    :goto_0
    return v0
.end method

.method public static classContainsMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_1
    if-ge v3, v1, :cond_3

    .line 11
    .line 12
    aget-object v4, v0, v3

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_2

    .line 23
    .line 24
    array-length v5, p2

    .line 25
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5}, Lbsh/ClassGeneratorUtil;->getTypeDescriptors([Ljava/lang/Class;)[Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/4 v6, 0x1

    .line 40
    move v7, v2

    .line 41
    :goto_2
    array-length v8, p2

    .line 42
    if-ge v7, v8, :cond_1

    .line 43
    .line 44
    aget-object v6, p2, v7

    .line 45
    .line 46
    aget-object v8, v5, v7

    .line 47
    .line 48
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_0

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    :goto_3
    if-eqz v6, :cond_2

    .line 59
    .line 60
    return-object v4

    .line 61
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

.method public static synthetic d(Ljava/util/ArrayList;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lbsh/ClassGeneratorUtil;->lambda$checkAbstractMethodImplementation$4(Ljava/util/List;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static descriptorToClassName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "["

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "L"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x1

    .line 19
    invoke-static {v0, v0, p0}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_1
    :goto_0
    return-object p0
.end method

.method private doSwitchBranch(ILjava/lang/String;[Ljava/lang/String;Lbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;ILbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 12

    .line 1
    move-object/from16 v1, p7

    .line 2
    .line 3
    aget-object p1, p5, p1

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 6
    .line 7
    .line 8
    const/16 p1, 0x19

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v1, p1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 12
    .line 13
    .line 14
    array-length v7, p3

    .line 15
    move v8, v2

    .line 16
    :goto_0
    if-ge v8, v7, :cond_a

    .line 17
    .line 18
    aget-object v9, p3, v8

    .line 19
    .line 20
    const-string v2, "Z"

    .line 21
    .line 22
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v10, "getObject"

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const-string v2, "getBoolean"

    .line 31
    .line 32
    :goto_1
    move/from16 v11, p6

    .line 33
    .line 34
    move-object v4, v2

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    const-string v2, "B"

    .line 37
    .line 38
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    const-string v2, "getByte"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string v2, "C"

    .line 48
    .line 49
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    const-string v2, "getChar"

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const-string v2, "S"

    .line 59
    .line 60
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    const-string v2, "getShort"

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    const-string v2, "I"

    .line 70
    .line 71
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    const-string v2, "getInt"

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    const-string v2, "J"

    .line 81
    .line 82
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    const-string v2, "getLong"

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    const-string v2, "D"

    .line 92
    .line 93
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    const-string v2, "getDouble"

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    const-string v2, "F"

    .line 103
    .line 104
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    const-string v2, "getFloat"

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_7
    move/from16 v11, p6

    .line 114
    .line 115
    move-object v4, v10

    .line 116
    :goto_2
    invoke-virtual {v1, p1, v11}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    const-string v2, "Ljava/lang/Object;"

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    move-object v2, v9

    .line 129
    :goto_3
    const-string v3, "()"

    .line 130
    .line 131
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    const/4 v6, 0x0

    .line 136
    const/16 v2, 0xb6

    .line 137
    .line 138
    const-string v3, "bsh/This$ConstructorArgs"

    .line 139
    .line 140
    invoke-virtual/range {v1 .. v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_9

    .line 148
    .line 149
    const/16 v2, 0xc0

    .line 150
    .line 151
    invoke-static {v9}, Lbsh/ClassGeneratorUtil;->descriptorToClassName(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v1, v2, v3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_a
    const-string p1, "V"

    .line 163
    .line 164
    invoke-static {p1, p3}, Lbsh/ClassGeneratorUtil;->getMethodDescriptor(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    const-string v3, "<init>"

    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    const/16 v1, 0xb7

    .line 172
    .line 173
    move-object v2, p2

    .line 174
    move-object/from16 v0, p7

    .line 175
    .line 176
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 177
    .line 178
    .line 179
    move-object v1, v0

    .line 180
    const/16 p1, 0xa7

    .line 181
    .line 182
    move-object/from16 p2, p4

    .line 183
    .line 184
    invoke-virtual {v1, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitJumpInsn(ILbsh/org/objectweb/asm/Label;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public static synthetic e(Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/ClassGeneratorUtil;->lambda$checkAbstractMethodImplementation$0(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private generateEnumStaticInit(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lbsh/ClassGeneratorUtil;->vars:[Lbsh/Variable;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v1, :cond_2

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    const-string v5, "enum"

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    const/16 v5, 0xbb

    .line 19
    .line 20
    invoke-virtual {p3, v5, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/16 v5, 0x59

    .line 24
    .line 25
    invoke-virtual {p3, v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {p3, v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/16 v5, 0x8

    .line 36
    .line 37
    if-lt v5, v2, :cond_0

    .line 38
    .line 39
    add-int/lit8 v5, v2, 0x1

    .line 40
    .line 41
    invoke-virtual {p3, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    add-int/lit8 v5, v2, 0x1

    .line 46
    .line 47
    add-int/lit8 v2, v2, -0x3

    .line 48
    .line 49
    const/16 v6, 0x10

    .line 50
    .line 51
    invoke-virtual {p3, v6, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitIntInsn(II)V

    .line 52
    .line 53
    .line 54
    :goto_1
    const-string v10, "(Ljava/lang/String;I)V"

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    const/16 v7, 0xb7

    .line 58
    .line 59
    const-string v9, "<init>"

    .line 60
    .line 61
    move-object v8, p1

    .line 62
    move-object v6, p3

    .line 63
    invoke-virtual/range {v6 .. v11}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    const/16 p1, 0xb3

    .line 67
    .line 68
    invoke-virtual {v4}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {v6, p1, v8, p3, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    move v2, v5

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move-object v8, p1

    .line 78
    move-object v6, p3

    .line 79
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    move-object p3, v6

    .line 82
    move-object p1, v8

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-void
.end method

.method private generateEnumSupport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/ClassWriter;)V
    .locals 15

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "()["

    .line 6
    .line 7
    invoke-static {v2, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/16 v4, 0x9

    .line 14
    .line 15
    const-string v5, "values"

    .line 16
    .line 17
    move-object/from16 v3, p4

    .line 18
    .line 19
    invoke-virtual/range {v3 .. v8}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    move-object/from16 v2, p1

    .line 24
    .line 25
    invoke-static {v2, v0, v9}, Lbsh/ClassGeneratorUtil;->pushBshStatic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 26
    .line 27
    .line 28
    const-string v13, "()[Ljava/lang/Object;"

    .line 29
    .line 30
    const/4 v14, 0x0

    .line 31
    const/16 v10, 0xb6

    .line 32
    .line 33
    const-string v11, "bsh/This"

    .line 34
    .line 35
    const-string v12, "enumValues"

    .line 36
    .line 37
    invoke-virtual/range {v9 .. v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    const-string v2, "["

    .line 41
    .line 42
    invoke-static {v2, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2, v9}, Lbsh/ClassGeneratorUtil;->generatePlainReturnCode(Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 47
    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-virtual {v9, v8, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v3, "(Ljava/lang/String;)"

    .line 56
    .line 57
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const/4 v6, 0x0

    .line 68
    const/16 v3, 0x9

    .line 69
    .line 70
    const-string v4, "valueOf"

    .line 71
    .line 72
    move-object/from16 v2, p4

    .line 73
    .line 74
    invoke-virtual/range {v2 .. v7}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-static {v1}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v9, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/16 v7, 0x19

    .line 86
    .line 87
    invoke-virtual {v9, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 88
    .line 89
    .line 90
    const-string v13, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;"

    .line 91
    .line 92
    const/16 v10, 0xb8

    .line 93
    .line 94
    const-string v11, "java/lang/Enum"

    .line 95
    .line 96
    const-string v12, "valueOf"

    .line 97
    .line 98
    invoke-virtual/range {v9 .. v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v9}, Lbsh/ClassGeneratorUtil;->generatePlainReturnCode(Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9, v8, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 105
    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v2, 0x2

    .line 109
    const-string v3, "<init>"

    .line 110
    .line 111
    const-string v4, "(Ljava/lang/String;I)V"

    .line 112
    .line 113
    move-object/from16 v1, p4

    .line 114
    .line 115
    invoke-virtual/range {v1 .. v6}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v9, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 120
    .line 121
    .line 122
    const/4 v1, 0x1

    .line 123
    invoke-virtual {v9, v7, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 124
    .line 125
    .line 126
    const/16 v1, 0x15

    .line 127
    .line 128
    invoke-virtual {v9, v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 129
    .line 130
    .line 131
    const-string v13, "(Ljava/lang/String;I)V"

    .line 132
    .line 133
    const/16 v10, 0xb7

    .line 134
    .line 135
    const-string v11, "java/lang/Enum"

    .line 136
    .line 137
    const-string v12, "<init>"

    .line 138
    .line 139
    invoke-virtual/range {v9 .. v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    new-array v0, v8, [Ljava/lang/String;

    .line 149
    .line 150
    invoke-direct {p0, v0, v8, v9}, Lbsh/ClassGeneratorUtil;->generateParameterReifierCode([Ljava/lang/String;ZLbsh/org/objectweb/asm/MethodVisitor;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v1, "("

    .line 156
    .line 157
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sget-object v1, Lbsh/ClassGeneratorUtil;->GENERATED_CLASS_DESC:Ljava/lang/String;

    .line 161
    .line 162
    const-string v2, "Ljava/lang/String;[Ljava/lang/Object;)V"

    .line 163
    .line 164
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    const/16 v10, 0xb8

    .line 169
    .line 170
    const-string v11, "bsh/This"

    .line 171
    .line 172
    const-string v12, "initInstance"

    .line 173
    .line 174
    invoke-virtual/range {v9 .. v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    const/16 v0, 0xb1

    .line 178
    .line 179
    invoke-virtual {v9, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v9, v8, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method private static generateField(Ljava/lang/String;Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-static {p0, p1, p2, v0, p3}, Lbsh/ClassGeneratorUtil;->generateField(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Lbsh/org/objectweb/asm/ClassWriter;)V

    return-void
.end method

.method private static generateField(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Lbsh/org/objectweb/asm/ClassWriter;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v2, p0

    .line 3
    move-object v3, p1

    .line 4
    move v1, p2

    .line 5
    move-object v5, p3

    .line 6
    move-object v0, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/ClassWriter;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lbsh/org/objectweb/asm/FieldVisitor;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private generateMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V
    .locals 10

    .line 1
    and-int/lit8 v1, p6, 0x8

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    move v8, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v8, v7

    .line 10
    :goto_0
    if-nez p4, :cond_1

    .line 11
    .line 12
    const-string v1, "Ljava/lang/Object;"

    .line 13
    .line 14
    move-object v9, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object v9, p4

    .line 17
    :goto_1
    invoke-static {v9, p5}, Lbsh/ClassGeneratorUtil;->getMethodDescriptor(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {p5}, Lbsh/ClassGeneratorUtil;->getTypeParameterSignature([Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v3, p3

    .line 27
    move/from16 v2, p6

    .line 28
    .line 29
    move-object/from16 v1, p7

    .line 30
    .line 31
    invoke-virtual/range {v1 .. v6}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    and-int/lit16 v2, v2, 0x500

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    if-nez v8, :cond_4

    .line 41
    .line 42
    iget-object v2, p0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 43
    .line 44
    sget-object v4, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 45
    .line 46
    if-ne v2, v4, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    invoke-static {p2, p1, v1}, Lbsh/ClassGeneratorUtil;->pushBshThis(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    :goto_2
    invoke-static {p2, p1, v1}, Lbsh/ClassGeneratorUtil;->pushBshStatic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 54
    .line 55
    .line 56
    :goto_3
    invoke-virtual {v1, p3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, p5, v8, v1}, Lbsh/ClassGeneratorUtil;->generateParameterReifierCode([Ljava/lang/String;ZLbsh/org/objectweb/asm/MethodVisitor;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x4

    .line 63
    invoke-virtual {v1, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 64
    .line 65
    .line 66
    const-string p1, "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;"

    .line 67
    .line 68
    const/4 p2, 0x0

    .line 69
    const/16 p3, 0xb6

    .line 70
    .line 71
    const-string v0, "bsh/This"

    .line 72
    .line 73
    const-string v2, "invokeMethod"

    .line 74
    .line 75
    move-object p5, p1

    .line 76
    move/from16 p6, p2

    .line 77
    .line 78
    move p2, p3

    .line 79
    move-object p3, v0

    .line 80
    move-object p1, v1

    .line 81
    move-object p4, v2

    .line 82
    invoke-virtual/range {p1 .. p6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, v9, p1}, Lbsh/ClassGeneratorUtil;->generateReturnCode(Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v7, v7}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method private generateParameterReifierCode([Ljava/lang/String;ZLbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/16 v7, 0x11

    .line 7
    .line 8
    invoke-virtual {v1, v7, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitIntInsn(II)V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0xbd

    .line 12
    .line 13
    const-string v3, "java/lang/Object"

    .line 14
    .line 15
    invoke-virtual {v1, v2, v3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v8, 0x1

    .line 19
    xor-int/lit8 v2, p2, 0x1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    move v9, v2

    .line 23
    move v10, v3

    .line 24
    :goto_0
    array-length v2, v0

    .line 25
    if-ge v10, v2, :cond_6

    .line 26
    .line 27
    aget-object v11, v0, v10

    .line 28
    .line 29
    const/16 v2, 0x59

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v7, v10}, Lbsh/org/objectweb/asm/MethodVisitor;->visitIntInsn(II)V

    .line 35
    .line 36
    .line 37
    invoke-static {v11}, Lbsh/ClassGeneratorUtil;->isPrimitive(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v12, "J"

    .line 42
    .line 43
    const-string v13, "D"

    .line 44
    .line 45
    const/16 v14, 0x53

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    const-string v3, "F"

    .line 50
    .line 51
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    const/16 v3, 0x17

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    const/16 v3, 0x18

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    const/16 v3, 0x16

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/16 v3, 0x15

    .line 79
    .line 80
    :goto_1
    sget-object v4, Lbsh/ClassGeneratorUtil;->PRIMITIVE_NAME:Ljava/lang/String;

    .line 81
    .line 82
    const/16 v5, 0xbb

    .line 83
    .line 84
    invoke-virtual {v1, v5, v4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v3, v9}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 91
    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v3, "("

    .line 96
    .line 97
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v3, ")V"

    .line 101
    .line 102
    invoke-static {v2, v11, v3}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const/4 v6, 0x0

    .line 107
    const/16 v2, 0xb7

    .line 108
    .line 109
    move-object v3, v4

    .line 110
    const-string v4, "<init>"

    .line 111
    .line 112
    invoke-virtual/range {v1 .. v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    const/16 v2, 0x19

    .line 120
    .line 121
    invoke-virtual {v1, v2, v9}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 122
    .line 123
    .line 124
    new-instance v3, Lbsh/org/objectweb/asm/Label;

    .line 125
    .line 126
    invoke-direct {v3}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 127
    .line 128
    .line 129
    const/16 v4, 0xc7

    .line 130
    .line 131
    invoke-virtual {v1, v4, v3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitJumpInsn(ILbsh/org/objectweb/asm/Label;)V

    .line 132
    .line 133
    .line 134
    sget-object v4, Lbsh/ClassGeneratorUtil;->PRIMITIVE_NAME:Ljava/lang/String;

    .line 135
    .line 136
    const-string v5, "NULL"

    .line 137
    .line 138
    sget-object v6, Lbsh/ClassGeneratorUtil;->PRIMITIVE_DESC:Ljava/lang/String;

    .line 139
    .line 140
    const/16 v15, 0xb2

    .line 141
    .line 142
    invoke-virtual {v1, v15, v4, v5, v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 146
    .line 147
    .line 148
    new-instance v4, Lbsh/org/objectweb/asm/Label;

    .line 149
    .line 150
    invoke-direct {v4}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 151
    .line 152
    .line 153
    const/16 v5, 0xa7

    .line 154
    .line 155
    invoke-virtual {v1, v5, v4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitJumpInsn(ILbsh/org/objectweb/asm/Label;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2, v9}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 168
    .line 169
    .line 170
    :goto_2
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-nez v2, :cond_5

    .line 175
    .line 176
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_4

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_4
    move v2, v8

    .line 184
    goto :goto_4

    .line 185
    :cond_5
    :goto_3
    const/4 v2, 0x2

    .line 186
    :goto_4
    add-int/2addr v9, v2

    .line 187
    add-int/lit8 v10, v10, 0x1

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_6
    return-void
.end method

.method private static generatePlainReturnCode(Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 1

    .line 1
    const-string v0, "V"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xb1

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {p0}, Lbsh/ClassGeneratorUtil;->isPrimitive(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    const-string v0, "D"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/16 p0, 0xaf

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string v0, "F"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    const/16 p0, 0xae

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string v0, "J"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    const/16 p0, 0xad

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/16 p0, 0xac

    .line 55
    .line 56
    :goto_0
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    const/16 v0, 0xc0

    .line 61
    .line 62
    invoke-static {p0}, Lbsh/ClassGeneratorUtil;->descriptorToClassName(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p1, v0, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/16 p0, 0xb0

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private generateReturnCode(Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 10

    .line 1
    const-string v0, "V"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 p1, 0x57

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0xb1

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {p1}, Lbsh/ClassGeneratorUtil;->isPrimitive(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v1, 0xc0

    .line 25
    .line 26
    if-eqz v0, :cond_8

    .line 27
    .line 28
    const-string v0, "Z"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v2, 0xac

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const-string v0, "java/lang/Boolean"

    .line 39
    .line 40
    const-string v3, "booleanValue"

    .line 41
    .line 42
    :goto_0
    move-object v6, v0

    .line 43
    move-object v7, v3

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string v0, "C"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const-string v0, "java/lang/Character"

    .line 54
    .line 55
    const-string v3, "charValue"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const-string v0, "B"

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    const-string v0, "java/lang/Byte"

    .line 67
    .line 68
    const-string v3, "byteValue"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-string v0, "S"

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    const-string v0, "java/lang/Short"

    .line 80
    .line 81
    const-string v3, "shortValue"

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    const-string v0, "F"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    const/16 v2, 0xae

    .line 93
    .line 94
    const-string v0, "java/lang/Float"

    .line 95
    .line 96
    const-string v3, "floatValue"

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    const-string v0, "J"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    const/16 v2, 0xad

    .line 108
    .line 109
    const-string v0, "java/lang/Long"

    .line 110
    .line 111
    const-string v3, "longValue"

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    const-string v0, "D"

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    const/16 v2, 0xaf

    .line 123
    .line 124
    const-string v0, "java/lang/Double"

    .line 125
    .line 126
    const-string v3, "doubleValue"

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    const-string v0, "java/lang/Integer"

    .line 130
    .line 131
    const-string v3, "intValue"

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :goto_1
    invoke-virtual {p2, v1, v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v0, "()"

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    const/4 v9, 0x0

    .line 144
    const/16 v5, 0xb6

    .line 145
    .line 146
    move-object v4, p2

    .line 147
    invoke-virtual/range {v4 .. v9}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_8
    move-object v4, p2

    .line 155
    invoke-static {p1}, Lbsh/ClassGeneratorUtil;->descriptorToClassName(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {v4, v1, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const/16 p1, 0xb0

    .line 163
    .line 164
    invoke-virtual {v4, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method private generateSuperDelegateMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "I",
            "Lbsh/org/objectweb/asm/ClassWriter;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    const-string p4, "Ljava/lang/Object;"

    .line 4
    .line 5
    :cond_0
    invoke-static {p4, p5}, Lbsh/ClassGeneratorUtil;->getMethodDescriptor(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-static {p5}, Lbsh/ClassGeneratorUtil;->getTypeParameterSignature([Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "_bshSuper"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v5, 0x0

    .line 35
    move v1, p6

    .line 36
    move-object v0, p7

    .line 37
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/16 p1, 0x19

    .line 42
    .line 43
    const/4 p6, 0x0

    .line 44
    invoke-virtual {v0, p1, p6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    .line 46
    .line 47
    array-length p7, p5

    .line 48
    const/4 v1, 0x1

    .line 49
    move v2, p6

    .line 50
    move v4, v1

    .line 51
    :goto_0
    if-ge v2, p7, :cond_4

    .line 52
    .line 53
    aget-object v5, p5, v2

    .line 54
    .line 55
    invoke-static {v5}, Lbsh/ClassGeneratorUtil;->isPrimitive(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_1

    .line 60
    .line 61
    const/16 v6, 0x15

    .line 62
    .line 63
    invoke-virtual {v0, v6, v4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v0, p1, v4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 68
    .line 69
    .line 70
    :goto_1
    const-string v6, "D"

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_3

    .line 77
    .line 78
    const-string v6, "J"

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move v5, v1

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    :goto_2
    const/4 v5, 0x2

    .line 90
    :goto_3
    add-int/2addr v4, v5

    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    const/16 v1, 0xb7

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    move-object v2, p2

    .line 98
    move-object v4, v3

    .line 99
    move-object v3, p3

    .line 100
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    invoke-static {p4, v0}, Lbsh/ClassGeneratorUtil;->generatePlainReturnCode(Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p6, p6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method private static getASMModifiers(Lbsh/Modifiers;)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    or-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    :cond_0
    const/4 v2, 0x4

    .line 16
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    or-int/lit8 v1, v1, 0x4

    .line 23
    .line 24
    :cond_1
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    or-int/lit8 v1, v1, 0x8

    .line 33
    .line 34
    :cond_2
    const/16 v2, 0x20

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    or-int/lit8 v1, v1, 0x20

    .line 43
    .line 44
    :cond_3
    const/16 v2, 0x400

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    or-int/lit16 v1, v1, 0x400

    .line 53
    .line 54
    :cond_4
    const/16 v2, 0x100

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    or-int/lit16 v1, v1, 0x100

    .line 63
    .line 64
    :cond_5
    invoke-virtual {p0}, Lbsh/Modifiers;->getModifiers()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    and-int/lit8 v2, v2, 0x7

    .line 69
    .line 70
    if-nez v2, :cond_6

    .line 71
    .line 72
    or-int/2addr v1, v0

    .line 73
    invoke-virtual {p0, v0}, Lbsh/Modifiers;->addModifier(I)V

    .line 74
    .line 75
    .line 76
    :cond_6
    return v1
.end method

.method private static getMethodDescriptor(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    array-length v1, p1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, p1, v2

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x29

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static getTypeDescriptors([Ljava/lang/Class;)[Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    new-array v1, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    aget-object v3, p0, v2

    .line 8
    .line 9
    invoke-static {v3}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    aput-object v3, v1, v2

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v1
.end method

.method private static getTypeParameterSignature([Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method private static isPrimitive(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method private static synthetic lambda$checkAbstractMethodImplementation$0(Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 p0, p0, 0x400

    .line 6
    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static synthetic lambda$checkAbstractMethodImplementation$1(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    and-int/lit16 v0, v0, 0x402

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p0, p1}, Lbsh/Types;->areSignaturesEqual([Ljava/lang/Class;[Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method private static synthetic lambda$checkAbstractMethodImplementation$2(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    and-int/2addr v0, v1

    .line 7
    if-gtz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v0, v0, 0x5

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    and-int/lit8 p0, p0, 0x7

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p1, p1, 0x7

    .line 29
    .line 30
    if-ne p0, p1, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    return v1

    .line 35
    :cond_2
    :goto_0
    const/4 p0, -0x1

    .line 36
    return p0
.end method

.method private static synthetic lambda$checkAbstractMethodImplementation$3(I)[Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$checkAbstractMethodImplementation$4(Ljava/util/List;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lbe/i;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-direct {v0, p2, v1}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Lbsh/f;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, Lbsh/e;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1}, Lbsh/e;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, [Ljava/lang/reflect/Method;

    .line 35
    .line 36
    array-length v0, p0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, Lbsh/Reflect;->getClassModifiers(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "abstract"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p1, " is not abstract and does not override abstract method "

    .line 79
    .line 80
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p1, "() in "

    .line 87
    .line 88
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :cond_1
    :goto_0
    array-length p1, p0

    .line 103
    if-lez p1, :cond_2

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    const/4 v0, 0x0

    .line 110
    aget-object p0, p0, v0

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p1, p0, p2}, Lbsh/ClassGeneratorUtil;->checkInheritanceRules(IILjava/lang/Class;)Z

    .line 121
    .line 122
    .line 123
    :cond_2
    return-void
.end method

.method private static pushBshStatic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "Lbsh/This;"

    .line 19
    .line 20
    const/16 v1, 0xb2

    .line 21
    .line 22
    invoke-virtual {p2, v1, p0, p1, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private static pushBshThis(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p2, v0, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "Lbsh/This;"

    .line 25
    .line 26
    const/16 v1, 0xb4

    .line 27
    .line 28
    invoke-virtual {p2, v1, p0, p1, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static startInterpreterForClass(Ljava/lang/Class;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "class_"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v2}, Lbsh/Name;->suffix(Ljava/lang/String;I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, ".bsh"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :try_start_0
    new-instance v3, Lbsh/FileReader;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-direct {v3, v4}, Lbsh/FileReader;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    :try_start_1
    new-instance v4, Lbsh/Interpreter;

    .line 34
    .line 35
    invoke-direct {v4}, Lbsh/Interpreter;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    new-instance v6, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, "_global"

    .line 51
    .line 52
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v5, v0}, Lbsh/NameSpace;->setName(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, p0}, Lbsh/BshClassManager;->associateClass(Ljava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v3, v5, v2}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    :try_start_2
    invoke-virtual {v3}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Lbsh/TargetError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    :try_start_3
    invoke-virtual {v3}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    :try_start_4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    throw p0
    :try_end_4
    .catch Lbsh/TargetError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lbsh/EvalError; {:try_start_4 .. :try_end_4} :catch_0

    .line 86
    :catch_0
    move-exception p0

    .line 87
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v2, "Evaluation Error: "

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catch_1
    move-exception p0

    .line 108
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 109
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Script threw exception: "

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lbsh/TargetError;->inNativeCode()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_0

    .line 132
    .line 133
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 136
    .line 137
    .line 138
    :cond_0
    :goto_1
    return-void

    .line 139
    :cond_1
    new-instance v0, Lbsh/InterpreterError;

    .line 140
    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v3, "Script ("

    .line 144
    .line 145
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v2, ") for BeanShell generated class: "

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string p0, " not found."

    .line 160
    .line 161
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-direct {v0, p0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0
.end method


# virtual methods
.method public generateClass()[B
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lbsh/This;->contextStore:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->uuid:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lbsh/NameSpace;

    .line 12
    .line 13
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->classModifiers:Lbsh/Modifiers;

    .line 14
    .line 15
    invoke-static {v2}, Lbsh/ClassGeneratorUtil;->getASMModifiers(Lbsh/Modifiers;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 20
    .line 21
    sget-object v4, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 22
    .line 23
    if-ne v3, v4, :cond_1

    .line 24
    .line 25
    or-int/lit16 v2, v2, 0x601

    .line 26
    .line 27
    :cond_0
    :goto_0
    move v5, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v4, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 30
    .line 31
    if-ne v3, v4, :cond_2

    .line 32
    .line 33
    or-int/lit16 v2, v2, 0x4031

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    or-int/lit8 v2, v2, 0x21

    .line 37
    .line 38
    and-int/lit16 v3, v2, 0x400

    .line 39
    .line 40
    if-lez v3, :cond_0

    .line 41
    .line 42
    add-int/lit16 v2, v2, -0x400

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :goto_1
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->interfaces:[Ljava/lang/Class;

    .line 46
    .line 47
    array-length v2, v2

    .line 48
    const/4 v10, 0x1

    .line 49
    add-int/2addr v2, v10

    .line 50
    new-array v9, v2, [Ljava/lang/String;

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    move v2, v11

    .line 54
    :goto_2
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->interfaces:[Ljava/lang/Class;

    .line 55
    .line 56
    array-length v4, v3

    .line 57
    if-ge v2, v4, :cond_4

    .line 58
    .line 59
    aget-object v3, v3, v2

    .line 60
    .line 61
    invoke-static {v3}, Lbsh/org/objectweb/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    aput-object v3, v9, v2

    .line 66
    .line 67
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->interfaces:[Ljava/lang/Class;

    .line 68
    .line 69
    aget-object v3, v3, v2

    .line 70
    .line 71
    invoke-static {v3}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->interfaces:[Ljava/lang/Class;

    .line 78
    .line 79
    aget-object v3, v3, v2

    .line 80
    .line 81
    invoke-static {v3}, Lbsh/Reflect;->getVariables(Ljava/lang/Class;)[Lbsh/Variable;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    array-length v4, v3

    .line 86
    move v6, v11

    .line 87
    :goto_3
    if-ge v6, v4, :cond_3

    .line 88
    .line 89
    aget-object v7, v3, v6

    .line 90
    .line 91
    invoke-virtual {v1, v7}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 92
    .line 93
    .line 94
    add-int/lit8 v6, v6, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    array-length v2, v3

    .line 101
    const-class v3, Lbsh/GeneratedClass;

    .line 102
    .line 103
    invoke-static {v3}, Lbsh/org/objectweb/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    aput-object v3, v9, v2

    .line 108
    .line 109
    new-instance v7, Lbsh/org/objectweb/asm/ClassWriter;

    .line 110
    .line 111
    const/4 v2, 0x2

    .line 112
    invoke-direct {v7, v2}, Lbsh/org/objectweb/asm/ClassWriter;-><init>(I)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 116
    .line 117
    sget-object v3, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 118
    .line 119
    if-ne v2, v3, :cond_5

    .line 120
    .line 121
    new-instance v2, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v3, "Ljava/lang/Enum<"

    .line 124
    .line 125
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->classDescript:Ljava/lang/String;

    .line 129
    .line 130
    const-string v4, ">;"

    .line 131
    .line 132
    invoke-static {v2, v3, v4}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    goto :goto_4

    .line 137
    :cond_5
    const/4 v2, 0x0

    .line 138
    :goto_4
    iget-object v6, v0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v8, v0, Lbsh/ClassGeneratorUtil;->superClassName:Ljava/lang/String;

    .line 141
    .line 142
    const/16 v4, 0x34

    .line 143
    .line 144
    move-object v3, v7

    .line 145
    move-object v7, v2

    .line 146
    invoke-virtual/range {v3 .. v9}, Lbsh/org/objectweb/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    move-object v7, v3

    .line 150
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 151
    .line 152
    sget-object v3, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 153
    .line 154
    const-string v4, "Lbsh/This;"

    .line 155
    .line 156
    if-eq v2, v3, :cond_6

    .line 157
    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    sget-object v3, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-static {v2, v4, v10, v7}, Lbsh/ClassGeneratorUtil;->generateField(Ljava/lang/String;Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V

    .line 178
    .line 179
    .line 180
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    sget-object v3, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 186
    .line 187
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const/16 v3, 0x19

    .line 200
    .line 201
    invoke-static {v2, v4, v3, v7}, Lbsh/ClassGeneratorUtil;->generateField(Ljava/lang/String;Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V

    .line 202
    .line 203
    .line 204
    const-string v2, "Ljava/lang/String;"

    .line 205
    .line 206
    iget-object v4, v0, Lbsh/ClassGeneratorUtil;->uuid:Ljava/lang/String;

    .line 207
    .line 208
    const-string v5, "UUID"

    .line 209
    .line 210
    invoke-static {v5, v2, v3, v4, v7}, Lbsh/ClassGeneratorUtil;->generateField(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Lbsh/org/objectweb/asm/ClassWriter;)V

    .line 211
    .line 212
    .line 213
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->vars:[Lbsh/Variable;

    .line 214
    .line 215
    array-length v3, v2

    .line 216
    move v4, v11

    .line 217
    :goto_5
    const-string v8, "private"

    .line 218
    .line 219
    if-ge v4, v3, :cond_a

    .line 220
    .line 221
    aget-object v5, v2, v4

    .line 222
    .line 223
    invoke-virtual {v5, v8}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    if-eqz v6, :cond_7

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_7
    invoke-virtual {v5}, Lbsh/Variable;->getTypeDescriptor()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-virtual {v5}, Lbsh/Variable;->getModifiers()Lbsh/Modifiers;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-static {v8}, Lbsh/ClassGeneratorUtil;->getASMModifiers(Lbsh/Modifiers;)I

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    iget-object v9, v0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 243
    .line 244
    sget-object v12, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 245
    .line 246
    if-ne v9, v12, :cond_8

    .line 247
    .line 248
    invoke-virtual {v5}, Lbsh/Variable;->setConstant()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v5}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_8
    sget-object v12, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 256
    .line 257
    if-ne v9, v12, :cond_9

    .line 258
    .line 259
    const-string v9, "enum"

    .line 260
    .line 261
    invoke-virtual {v5, v9}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-eqz v9, :cond_9

    .line 266
    .line 267
    or-int/lit16 v8, v8, 0x4010

    .line 268
    .line 269
    iget-object v6, v0, Lbsh/ClassGeneratorUtil;->classDescript:Ljava/lang/String;

    .line 270
    .line 271
    :cond_9
    invoke-virtual {v5}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-static {v5, v6, v8, v7}, Lbsh/ClassGeneratorUtil;->generateField(Ljava/lang/String;Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V

    .line 276
    .line 277
    .line 278
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_a
    iget-object v1, v0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 282
    .line 283
    sget-object v2, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 284
    .line 285
    if-ne v1, v2, :cond_b

    .line 286
    .line 287
    iget-object v1, v0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 288
    .line 289
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 290
    .line 291
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->classDescript:Ljava/lang/String;

    .line 292
    .line 293
    invoke-direct {v0, v1, v2, v3, v7}, Lbsh/ClassGeneratorUtil;->generateEnumSupport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/ClassWriter;)V

    .line 294
    .line 295
    .line 296
    :cond_b
    invoke-virtual {v0, v7}, Lbsh/ClassGeneratorUtil;->generateStaticInitializer(Lbsh/org/objectweb/asm/ClassWriter;)V

    .line 297
    .line 298
    .line 299
    move v1, v11

    .line 300
    move v2, v1

    .line 301
    :goto_7
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 302
    .line 303
    array-length v4, v3

    .line 304
    if-ge v1, v4, :cond_e

    .line 305
    .line 306
    aget-object v3, v3, v1

    .line 307
    .line 308
    invoke-virtual {v3, v8}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_c

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_c
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 316
    .line 317
    aget-object v2, v2, v1

    .line 318
    .line 319
    invoke-virtual {v2}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-static {v2}, Lbsh/ClassGeneratorUtil;->getASMModifiers(Lbsh/Modifiers;)I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 328
    .line 329
    aget-object v3, v3, v1

    .line 330
    .line 331
    invoke-virtual {v3}, Lbsh/BshMethod;->isVarArgs()Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-eqz v3, :cond_d

    .line 336
    .line 337
    or-int/lit16 v2, v2, 0x80

    .line 338
    .line 339
    :cond_d
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 340
    .line 341
    aget-object v3, v3, v1

    .line 342
    .line 343
    invoke-virtual {v3}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-virtual {v0, v1, v3, v2, v7}, Lbsh/ClassGeneratorUtil;->generateConstructor(I[Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V

    .line 348
    .line 349
    .line 350
    move v2, v10

    .line 351
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_e
    iget-object v1, v0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 355
    .line 356
    sget-object v3, Lbsh/ClassGenerator$Type;->CLASS:Lbsh/ClassGenerator$Type;

    .line 357
    .line 358
    if-ne v1, v3, :cond_f

    .line 359
    .line 360
    if-nez v2, :cond_f

    .line 361
    .line 362
    const/4 v1, -0x1

    .line 363
    new-array v2, v11, [Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v0, v1, v2, v10, v7}, Lbsh/ClassGeneratorUtil;->generateConstructor(I[Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V

    .line 366
    .line 367
    .line 368
    :cond_f
    iget-object v9, v0, Lbsh/ClassGeneratorUtil;->methods:[Lbsh/DelayedEvalBshMethod;

    .line 369
    .line 370
    array-length v12, v9

    .line 371
    move v13, v11

    .line 372
    :goto_9
    if-ge v13, v12, :cond_16

    .line 373
    .line 374
    aget-object v14, v9, v13

    .line 375
    .line 376
    iget-boolean v1, v14, Lbsh/BshMethod;->isExtension:Z

    .line 377
    .line 378
    if-eqz v1, :cond_10

    .line 379
    .line 380
    goto/16 :goto_b

    .line 381
    .line 382
    :cond_10
    invoke-virtual {v14, v8}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-eqz v1, :cond_11

    .line 387
    .line 388
    goto/16 :goto_b

    .line 389
    .line 390
    :cond_11
    iget-object v1, v0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 391
    .line 392
    sget-object v2, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 393
    .line 394
    if-ne v1, v2, :cond_12

    .line 395
    .line 396
    const-string v1, "static"

    .line 397
    .line 398
    invoke-virtual {v14, v1}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-nez v1, :cond_12

    .line 403
    .line 404
    const-string v1, "default"

    .line 405
    .line 406
    invoke-virtual {v14, v1}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-nez v1, :cond_12

    .line 411
    .line 412
    const-string v1, "abstract"

    .line 413
    .line 414
    invoke-virtual {v14, v1}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-nez v2, :cond_12

    .line 419
    .line 420
    invoke-virtual {v14}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v2, v1}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :cond_12
    invoke-virtual {v14}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-static {v1}, Lbsh/ClassGeneratorUtil;->getASMModifiers(Lbsh/Modifiers;)I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    invoke-virtual {v14}, Lbsh/BshMethod;->isVarArgs()Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-eqz v2, :cond_13

    .line 440
    .line 441
    or-int/lit16 v1, v1, 0x80

    .line 442
    .line 443
    :cond_13
    move v6, v1

    .line 444
    and-int/lit8 v1, v6, 0x8

    .line 445
    .line 446
    if-lez v1, :cond_14

    .line 447
    .line 448
    move v15, v10

    .line 449
    goto :goto_a

    .line 450
    :cond_14
    move v15, v11

    .line 451
    :goto_a
    iget-object v1, v0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 452
    .line 453
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 454
    .line 455
    invoke-virtual {v14}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    invoke-virtual {v14}, Lbsh/DelayedEvalBshMethod;->getReturnTypeDescriptor()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    invoke-virtual {v14}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    invoke-direct/range {v0 .. v7}, Lbsh/ClassGeneratorUtil;->generateMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V

    .line 468
    .line 469
    .line 470
    iget-object v1, v0, Lbsh/ClassGeneratorUtil;->superClass:Ljava/lang/Class;

    .line 471
    .line 472
    invoke-virtual {v14}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v14}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    invoke-static {v1, v2, v3}, Lbsh/ClassGeneratorUtil;->classContainsMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    if-eqz v1, :cond_15

    .line 485
    .line 486
    if-nez v15, :cond_15

    .line 487
    .line 488
    iget-object v1, v0, Lbsh/ClassGeneratorUtil;->superClass:Ljava/lang/Class;

    .line 489
    .line 490
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->superClassName:Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v14}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-virtual {v14}, Lbsh/DelayedEvalBshMethod;->getReturnTypeDescriptor()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    invoke-virtual {v14}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    const/4 v6, 0x1

    .line 505
    invoke-direct/range {v0 .. v7}, Lbsh/ClassGeneratorUtil;->generateSuperDelegateMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V

    .line 506
    .line 507
    .line 508
    :cond_15
    :goto_b
    add-int/lit8 v13, v13, 0x1

    .line 509
    .line 510
    move-object/from16 v0, p0

    .line 511
    .line 512
    goto/16 :goto_9

    .line 513
    .line 514
    :cond_16
    invoke-virtual {v7}, Lbsh/org/objectweb/asm/ClassWriter;->toByteArray()[B

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    return-object v0
.end method

.method public generateConstructor(I[Ljava/lang/String;ILbsh/org/objectweb/asm/ClassWriter;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    add-int/lit8 v2, v2, 0x1

    .line 7
    .line 8
    array-length v3, v1

    .line 9
    add-int/lit8 v3, v3, 0x2

    .line 10
    .line 11
    const-string v4, "V"

    .line 12
    .line 13
    invoke-static {v4, v1}, Lbsh/ClassGeneratorUtil;->getMethodDescriptor(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    invoke-static {v1}, Lbsh/ClassGeneratorUtil;->getTypeParameterSignature([Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    const-string v7, "<init>"

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    move/from16 v6, p3

    .line 25
    .line 26
    move-object/from16 v5, p4

    .line 27
    .line 28
    invoke-virtual/range {v5 .. v10}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v0, v1, v4, v11}, Lbsh/ClassGeneratorUtil;->generateParameterReifierCode([Ljava/lang/String;ZLbsh/org/objectweb/asm/MethodVisitor;)V

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x3a

    .line 37
    .line 38
    invoke-virtual {v11, v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 39
    .line 40
    .line 41
    move/from16 v1, p1

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, v3, v11}, Lbsh/ClassGeneratorUtil;->generateConstructorSwitch(IIILbsh/org/objectweb/asm/MethodVisitor;)V

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x19

    .line 47
    .line 48
    invoke-virtual {v11, v1, v4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 49
    .line 50
    .line 51
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v11, v3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v11, v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v2, "("

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object v2, Lbsh/ClassGeneratorUtil;->GENERATED_CLASS_DESC:Ljava/lang/String;

    .line 67
    .line 68
    const-string v3, "Ljava/lang/String;[Ljava/lang/Object;)V"

    .line 69
    .line 70
    invoke-static {v1, v2, v3}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    const/16 v16, 0x0

    .line 75
    .line 76
    const/16 v12, 0xb8

    .line 77
    .line 78
    const-string v13, "bsh/This"

    .line 79
    .line 80
    const-string v14, "initInstance"

    .line 81
    .line 82
    invoke-virtual/range {v11 .. v16}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    const/16 v1, 0xb1

    .line 86
    .line 87
    invoke-virtual {v11, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v11, v4, v4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public generateConstructorSwitch(IIILbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v6, p3

    .line 4
    .line 5
    move-object/from16 v7, p4

    .line 6
    .line 7
    new-instance v13, Lbsh/org/objectweb/asm/Label;

    .line 8
    .line 9
    invoke-direct {v13}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Lbsh/org/objectweb/asm/Label;

    .line 13
    .line 14
    invoke-direct {v4}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 18
    .line 19
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->superClass:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lbsh/BshClassManager$MemberCache;

    .line 26
    .line 27
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->superClass:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v14

    .line 37
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 42
    .line 43
    array-length v2, v2

    .line 44
    add-int/2addr v1, v2

    .line 45
    new-array v5, v1, [Lbsh/org/objectweb/asm/Label;

    .line 46
    .line 47
    const/4 v15, 0x0

    .line 48
    move v2, v15

    .line 49
    :goto_0
    if-ge v2, v1, :cond_0

    .line 50
    .line 51
    new-instance v3, Lbsh/org/objectweb/asm/Label;

    .line 52
    .line 53
    invoke-direct {v3}, Lbsh/org/objectweb/asm/Label;-><init>()V

    .line 54
    .line 55
    .line 56
    aput-object v3, v5, v2

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->superClass:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-static {v2}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v7, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v3, v0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v2, v3, v7}, Lbsh/ClassGeneratorUtil;->pushBshStatic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 79
    .line 80
    .line 81
    const/16 v2, 0x19

    .line 82
    .line 83
    move/from16 v3, p2

    .line 84
    .line 85
    invoke-virtual {v7, v2, v3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 86
    .line 87
    .line 88
    const/16 v3, 0x10

    .line 89
    .line 90
    move/from16 v8, p1

    .line 91
    .line 92
    invoke-virtual {v7, v3, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitIntInsn(II)V

    .line 93
    .line 94
    .line 95
    const-string v11, "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;"

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    const/16 v8, 0xb8

    .line 99
    .line 100
    const-string v9, "bsh/This"

    .line 101
    .line 102
    const-string v10, "getConstructorArgs"

    .line 103
    .line 104
    invoke-virtual/range {v7 .. v12}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 105
    .line 106
    .line 107
    const/16 v3, 0x3a

    .line 108
    .line 109
    invoke-virtual {v7, v3, v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7, v2, v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 113
    .line 114
    .line 115
    const-string v3, "selector"

    .line 116
    .line 117
    const-string v8, "I"

    .line 118
    .line 119
    const/16 v9, 0xb4

    .line 120
    .line 121
    const-string v10, "bsh/This$ConstructorArgs"

    .line 122
    .line 123
    invoke-virtual {v7, v9, v10, v3, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v1, v1, -0x1

    .line 127
    .line 128
    invoke-virtual {v7, v15, v1, v13, v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTableSwitchInsn(IILbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;)V

    .line 129
    .line 130
    .line 131
    move v1, v15

    .line 132
    move v8, v1

    .line 133
    :goto_1
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-ge v8, v3, :cond_1

    .line 138
    .line 139
    move v3, v2

    .line 140
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->superClassName:Ljava/lang/String;

    .line 141
    .line 142
    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    check-cast v9, Lbsh/Invocable;

    .line 147
    .line 148
    invoke-virtual {v9}, Lbsh/Invocable;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    move-object/from16 v16, v9

    .line 153
    .line 154
    move v9, v3

    .line 155
    move-object/from16 v3, v16

    .line 156
    .line 157
    invoke-direct/range {v0 .. v7}, Lbsh/ClassGeneratorUtil;->doSwitchBranch(ILjava/lang/String;[Ljava/lang/String;Lbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;ILbsh/org/objectweb/asm/MethodVisitor;)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v8, v8, 0x1

    .line 161
    .line 162
    add-int/lit8 v1, v1, 0x1

    .line 163
    .line 164
    move/from16 v6, p3

    .line 165
    .line 166
    move-object/from16 v7, p4

    .line 167
    .line 168
    move v2, v9

    .line 169
    goto :goto_1

    .line 170
    :cond_1
    move v9, v2

    .line 171
    move v8, v15

    .line 172
    :goto_2
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 173
    .line 174
    array-length v3, v2

    .line 175
    if-ge v8, v3, :cond_2

    .line 176
    .line 177
    move-object v3, v2

    .line 178
    iget-object v2, v0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 179
    .line 180
    aget-object v3, v3, v8

    .line 181
    .line 182
    invoke-virtual {v3}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    move/from16 v6, p3

    .line 187
    .line 188
    move-object/from16 v7, p4

    .line 189
    .line 190
    invoke-direct/range {v0 .. v7}, Lbsh/ClassGeneratorUtil;->doSwitchBranch(ILjava/lang/String;[Ljava/lang/String;Lbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;ILbsh/org/objectweb/asm/MethodVisitor;)V

    .line 191
    .line 192
    .line 193
    move-object v6, v0

    .line 194
    move-object v10, v4

    .line 195
    add-int/lit8 v8, v8, 0x1

    .line 196
    .line 197
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_2
    move-object/from16 v7, p4

    .line 201
    .line 202
    move-object v6, v0

    .line 203
    move-object v10, v4

    .line 204
    invoke-virtual {v7, v13}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7, v9, v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 208
    .line 209
    .line 210
    iget-object v2, v6, Lbsh/ClassGeneratorUtil;->superClassName:Ljava/lang/String;

    .line 211
    .line 212
    const-string v4, "()V"

    .line 213
    .line 214
    const/4 v5, 0x0

    .line 215
    const/16 v1, 0xb7

    .line 216
    .line 217
    const-string v3, "<init>"

    .line 218
    .line 219
    move-object v0, v7

    .line 220
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v7, v10}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method

.method public generateStaticInitializer(Lbsh/org/objectweb/asm/ClassWriter;)V
    .locals 12

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const-string v2, "<clinit>"

    .line 6
    .line 7
    const-string v3, "()V"

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    iget-object p1, p0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "UUID"

    .line 17
    .line 18
    const-string v1, "Ljava/lang/String;"

    .line 19
    .line 20
    const/16 v2, 0xb2

    .line 21
    .line 22
    invoke-virtual {v6, v2, p1, v0, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v10, "(Ljava/lang/String;)Lbsh/This;"

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    const/16 v7, 0xb8

    .line 29
    .line 30
    const-string v8, "bsh/This"

    .line 31
    .line 32
    const-string v9, "pullBshStatic"

    .line 33
    .line 34
    invoke-virtual/range {v6 .. v11}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lbsh/ClassGeneratorUtil;->className:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "Lbsh/This;"

    .line 59
    .line 60
    const/16 v2, 0xb3

    .line 61
    .line 62
    invoke-virtual {v6, v2, p1, v0, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lbsh/ClassGeneratorUtil;->type:Lbsh/ClassGenerator$Type;

    .line 66
    .line 67
    sget-object v0, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 68
    .line 69
    if-ne p1, v0, :cond_0

    .line 70
    .line 71
    iget-object p1, p0, Lbsh/ClassGeneratorUtil;->fqClassName:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, p0, Lbsh/ClassGeneratorUtil;->classDescript:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {p0, p1, v0, v6}, Lbsh/ClassGeneratorUtil;->generateEnumStaticInit(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/MethodVisitor;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    iget-object p1, p0, Lbsh/ClassGeneratorUtil;->classDescript:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p1}, Lbsh/org/objectweb/asm/Type;->getType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {v6, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const-string v10, "(Ljava/lang/Class;)V"

    .line 88
    .line 89
    const/4 v11, 0x0

    .line 90
    const/16 v7, 0xb8

    .line 91
    .line 92
    const-string v8, "bsh/This"

    .line 93
    .line 94
    const-string v9, "initStatic"

    .line 95
    .line 96
    invoke-virtual/range {v6 .. v11}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const/16 p1, 0xb1

    .line 100
    .line 101
    invoke-virtual {v6, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    invoke-virtual {v6, p1, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public initStaticNameSpace(Lbsh/NameSpace;Lbsh/BSHBlock;)V
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lbsh/This$Keys;->BSHCLASSMODIFIERS:Lbsh/This$Keys;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lbsh/ClassGeneratorUtil;->classModifiers:Lbsh/Modifiers;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {p1, v1, v2, v3}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;

    .line 21
    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object v2, Lbsh/This$Keys;->BSHCONSTRUCTORS:Lbsh/This$Keys;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lbsh/ClassGeneratorUtil;->constructors:[Lbsh/DelayedEvalBshMethod;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v2, v3}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0, p2, v3}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    move-exception p1

    .line 61
    const-string p2, "Unable to init class static block: "

    .line 62
    .line 63
    invoke-static {p2, p1}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
