.class Lbsh/BSHClassDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final CLASSINITNAME:Ljava/lang/String; = "_bshClassInit"

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field extend:Z

.field private generatedClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field modifiers:Lbsh/Modifiers;

.field name:Ljava/lang/String;

.field numInterfaces:I

.field type:Lbsh/ClassGenerator$Type;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lbsh/Modifiers;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lbsh/Modifiers;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lbsh/BSHClassDeclaration;->modifiers:Lbsh/Modifiers;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Lbsh/BshMethod;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/BSHClassDeclaration;->lambda$generateClass$0(Lbsh/BshMethod;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private generateClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-boolean v2, p0, Lbsh/BSHClassDeclaration;->extend:Z

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v10, 0x0

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lbsh/BSHAmbiguousName;

    .line 18
    .line 19
    invoke-virtual {v2, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :try_start_0
    sget-object v4, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Lbsh/security/MainSecurityGuard;->canExtends(Ljava/lang/Class;)V
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-static {v2}, Lbsh/Reflect;->getClassModifiers(Ljava/lang/Class;)Lbsh/Modifiers;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const-string v5, "final"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    invoke-static {v2}, Lbsh/Reflect;->getDeclaredMethods(Ljava/lang/Class;)[Lbsh/BshMethod;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    new-instance v5, Lbsh/a;

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-direct {v5, v6}, Lbsh/a;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/util/Collection;

    .line 73
    .line 74
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, Lbsh/EvalException;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "Cannot inherit from final class "

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-direct {v0, v1, v10, v10}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_1
    :goto_0
    move-object v5, v2

    .line 95
    move v2, v3

    .line 96
    goto :goto_1

    .line 97
    :catch_0
    move-exception v0

    .line 98
    invoke-virtual {v0, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    throw v0

    .line 103
    :cond_2
    move v2, v1

    .line 104
    move-object v5, v10

    .line 105
    :goto_1
    iget v4, p0, Lbsh/BSHClassDeclaration;->numInterfaces:I

    .line 106
    .line 107
    new-array v4, v4, [Ljava/lang/Class;

    .line 108
    .line 109
    :goto_2
    iget v6, p0, Lbsh/BSHClassDeclaration;->numInterfaces:I

    .line 110
    .line 111
    if-ge v1, v6, :cond_4

    .line 112
    .line 113
    add-int/lit8 v6, v2, 0x1

    .line 114
    .line 115
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lbsh/BSHAmbiguousName;

    .line 120
    .line 121
    invoke-virtual {v2, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    aput-object v7, v4, v1

    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/Class;->isInterface()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_3

    .line 132
    .line 133
    :try_start_1
    sget-object v2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 134
    .line 135
    aget-object v7, v4, v1

    .line 136
    .line 137
    invoke-virtual {v2, v7}, Lbsh/security/MainSecurityGuard;->canImplements(Ljava/lang/Class;)V
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_1

    .line 138
    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    move v2, v6

    .line 143
    goto :goto_2

    .line 144
    :catch_1
    move-exception v0

    .line 145
    invoke-virtual {v0, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    throw v0

    .line 150
    :cond_3
    new-instance v0, Lbsh/EvalException;

    .line 151
    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v3, "Type: "

    .line 155
    .line 156
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget-object v2, v2, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 160
    .line 161
    const-string v3, " is not an interface!"

    .line 162
    .line 163
    invoke-static {v1, v2, v3}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, v1, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_4
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    move-object v6, v1

    .line 176
    check-cast v6, Lbsh/BSHBlock;

    .line 177
    .line 178
    iget-object v1, p0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 179
    .line 180
    sget-object v2, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 181
    .line 182
    if-ne v1, v2, :cond_5

    .line 183
    .line 184
    iget-object v1, p0, Lbsh/BSHClassDeclaration;->modifiers:Lbsh/Modifiers;

    .line 185
    .line 186
    invoke-virtual {v1, v3}, Lbsh/Modifiers;->changeContext(I)V

    .line 187
    .line 188
    .line 189
    :cond_5
    invoke-static {}, Lbsh/ClassGenerator;->getClassGenerator()Lbsh/ClassGenerator;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iget-object v2, p0, Lbsh/BSHClassDeclaration;->name:Ljava/lang/String;

    .line 194
    .line 195
    iget-object v3, p0, Lbsh/BSHClassDeclaration;->modifiers:Lbsh/Modifiers;

    .line 196
    .line 197
    iget-object v7, p0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 198
    .line 199
    move-object v8, p1

    .line 200
    move-object v9, p2

    .line 201
    invoke-virtual/range {v1 .. v9}, Lbsh/ClassGenerator;->generateClass(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_7

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, Lbsh/BshMethod;

    .line 220
    .line 221
    invoke-virtual {v2}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v2}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v1, v3, v4}, Lbsh/Reflect;->getDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    if-nez v3, :cond_6

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    new-instance v0, Lbsh/EvalException;

    .line 237
    .line 238
    invoke-virtual {v2}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-static {v5}, Lbsh/StringUtil;->typeString(Ljava/lang/Class;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    new-instance v3, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    const-string v4, "Cannot override "

    .line 249
    .line 250
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string v1, "() in "

    .line 257
    .line 258
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v1, " overridden method is final"

    .line 265
    .line 266
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-direct {v0, v1, v10, v10}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 274
    .line 275
    .line 276
    throw v0

    .line 277
    :cond_7
    return-object v1
.end method

.method private static synthetic lambda$generateClass$0(Lbsh/BshMethod;)Z
    .locals 1

    .line 1
    const-string v0, "final"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "private"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method


# virtual methods
.method public declared-synchronized eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/BSHClassDeclaration;->generatedClass:Ljava/lang/Class;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lbsh/BSHClassDeclaration;->generateClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lbsh/BSHClassDeclaration;->generatedClass:Ljava/lang/Class;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    iget-object p1, p0, Lbsh/BSHClassDeclaration;->generatedClass:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lbsh/BSHClassDeclaration;->name:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
