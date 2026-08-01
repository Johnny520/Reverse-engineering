.class public final Lbsh/This;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/This$Handler;,
        Lbsh/This$Keys;,
        Lbsh/This$ConstructorArgs;
    }
.end annotation


# static fields
.field static final CONTEXT_ARGS:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final CONTEXT_INTERPRETER:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lbsh/Interpreter;",
            ">;"
        }
    .end annotation
.end field

.field private static final CONTEXT_NAMESPACE:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lbsh/NameSpace;",
            ">;"
        }
    .end annotation
.end field

.field public static final contextStore:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/NameSpace;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field transient declaringInterpreter:Lbsh/Interpreter;

.field private interfaces:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final invocationHandler:Ljava/lang/reflect/InvocationHandler;

.field final namespace:Lbsh/NameSpace;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/This;->contextStore:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lbsh/This;->CONTEXT_NAMESPACE:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lbsh/This;->CONTEXT_INTERPRETER:Ljava/lang/ThreadLocal;

    .line 21
    .line 22
    new-instance v0, Lbsh/飘花落叶言子世苏兰哲楪;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子世苏兰哲楪;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Lbsh/Interpreter;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbsh/This$Handler;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lbsh/This$Handler;-><init>(Lbsh/This;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/This;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 10
    .line 11
    iput-object p1, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 12
    .line 13
    iput-object p2, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 14
    .line 15
    return-void
.end method

.method public static bind(Lbsh/This;Lbsh/NameSpace;Lbsh/Interpreter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/NameSpace;->setParent(Lbsh/NameSpace;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 7
    .line 8
    return-void
.end method

.method public static getConstructorArgs(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/This;",
            "[",
            "Ljava/lang/Object;",
            "I)",
            "Lbsh/This$ConstructorArgs;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_9

    .line 11
    .line 12
    const/4 v5, -0x1

    .line 13
    if-ne v3, v5, :cond_0

    .line 14
    .line 15
    sget-object v0, Lbsh/This$ConstructorArgs;->DEFAULT:Lbsh/This$ConstructorArgs;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    sget-object v7, Lbsh/This$Keys;->BSHCONSTRUCTORS:Lbsh/This$Keys;

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    invoke-virtual {v6, v7}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    sget-object v7, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 33
    .line 34
    if-eq v6, v7, :cond_8

    .line 35
    .line 36
    check-cast v6, [Lbsh/DelayedEvalBshMethod;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 37
    .line 38
    aget-object v7, v6, v3

    .line 39
    .line 40
    invoke-virtual {v7}, Lbsh/DelayedEvalBshMethod;->getAltConstructor()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    if-nez v8, :cond_1

    .line 45
    .line 46
    sget-object v0, Lbsh/This$ConstructorArgs;->DEFAULT:Lbsh/This$ConstructorArgs;

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    invoke-virtual {v7}, Lbsh/DelayedEvalBshMethod;->getArgsNode()Lbsh/BSHArguments;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    new-instance v10, Lbsh/NameSpace;

    .line 54
    .line 55
    invoke-virtual {v1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    const-string v12, "consArgs"

    .line 60
    .line 61
    invoke-direct {v10, v11, v12}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Lbsh/BshMethod;->getParameterNames()[Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-virtual {v7}, Lbsh/DelayedEvalBshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    const/4 v13, 0x0

    .line 73
    :goto_0
    array-length v14, v2

    .line 74
    if-ge v13, v14, :cond_2

    .line 75
    .line 76
    :try_start_1
    aget-object v14, v11, v13

    .line 77
    .line 78
    aget-object v15, v12, v13

    .line 79
    .line 80
    aget-object v5, v2, v13

    .line 81
    .line 82
    invoke-virtual {v10, v14, v15, v5, v4}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    add-int/lit8 v13, v13, 0x1

    .line 86
    .line 87
    const/4 v5, -0x1

    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception v0

    .line 90
    const-string v1, "err setting local cons arg:"

    .line 91
    .line 92
    invoke-static {v1, v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-object v4

    .line 96
    :cond_2
    new-instance v2, Lbsh/CallStack;

    .line 97
    .line 98
    invoke-direct {v2}, Lbsh/CallStack;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v10}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7}, Lbsh/DelayedEvalBshMethod;->getConstructorArgs()[Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    iget-object v1, v1, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 109
    .line 110
    if-eqz v9, :cond_3

    .line 111
    .line 112
    :try_start_2
    invoke-virtual {v9, v2, v1}, Lbsh/BSHArguments;->getArguments(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5
    :try_end_2
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_1

    .line 116
    goto :goto_1

    .line 117
    :catch_1
    move-exception v0

    .line 118
    const-string v1, "Error evaluating constructor args: "

    .line 119
    .line 120
    invoke-static {v1, v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    return-object v4

    .line 124
    :cond_3
    :goto_1
    invoke-static {v5}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v5}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const-string v5, "super"

    .line 133
    .line 134
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    sget-object v3, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 141
    .line 142
    invoke-virtual {v3, v0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v3, v0}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v1, v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏([Ljava/lang/Class;Ljava/util/List;)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    const/4 v5, -0x1

    .line 161
    if-eq v0, v5, :cond_4

    .line 162
    .line 163
    new-instance v1, Lbsh/This$ConstructorArgs;

    .line 164
    .line 165
    invoke-direct {v1, v0, v2}, Lbsh/This$ConstructorArgs;-><init>(I[Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-object v1

    .line 169
    :cond_4
    const-string v0, "can\'t find super constructor for args!"

    .line 170
    .line 171
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v4

    .line 175
    :cond_5
    const/4 v5, -0x1

    .line 176
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-static {v1, v6}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰([Ljava/lang/Class;Ljava/util/List;)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eq v1, v5, :cond_7

    .line 185
    .line 186
    sget-object v5, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 187
    .line 188
    invoke-virtual {v5, v0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v5, v0}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    add-int/2addr v1, v0

    .line 207
    add-int/2addr v0, v3

    .line 208
    if-eq v1, v0, :cond_6

    .line 209
    .line 210
    new-instance v0, Lbsh/This$ConstructorArgs;

    .line 211
    .line 212
    invoke-direct {v0, v1, v2}, Lbsh/This$ConstructorArgs;-><init>(I[Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    return-object v0

    .line 216
    :cond_6
    const-string v0, "Recursive constructor call."

    .line 217
    .line 218
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object v4

    .line 222
    :cond_7
    const-string v0, "can\'t find this constructor for args!"

    .line 223
    .line 224
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-object v4

    .line 228
    :catch_2
    move-exception v0

    .line 229
    goto :goto_2

    .line 230
    :cond_8
    :try_start_3
    new-instance v0, Lbsh/InterpreterError;

    .line 231
    .line 232
    const-string v1, "Unable to find constructors array in class"

    .line 233
    .line 234
    invoke-direct {v0, v1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 238
    :goto_2
    const-string v1, "Unable to get instance initializers: "

    .line 239
    .line 240
    invoke-static {v1, v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    return-object v4

    .line 244
    :cond_9
    const-string v0, "Unititialized class: no static"

    .line 245
    .line 246
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-object v4
.end method

.method public static getThis(Lbsh/NameSpace;Lbsh/Interpreter;)Lbsh/This;
    .locals 1

    .line 1
    new-instance v0, Lbsh/This;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lbsh/This;-><init>(Lbsh/NameSpace;Lbsh/Interpreter;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static initClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;
    .locals 6

    .line 1
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;)Lbsh/This;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lbsh/NameSpace;->copy()Lbsh/NameSpace;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lbsh/This;->CONTEXT_NAMESPACE:Ljava/lang/ThreadLocal;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lbsh/NameSpace;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lbsh/NameSpace;->setParent(Lbsh/NameSpace;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object v2, Lbsh/This;->CONTEXT_INTERPRETER:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lbsh/Interpreter;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v2, v0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_0
    const/4 v3, 0x0

    .line 66
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    sget-object v5, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 72
    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const/4 v4, 0x0

    .line 88
    invoke-virtual {p1, v2, v4}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p0}, Lbsh/NameSpace;->setClassInstance(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :try_start_1
    invoke-virtual {v0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    sget-object p1, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Lbsh/BSHBlock;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 109
    .line 110
    :try_start_2
    new-instance p1, Lbsh/CallStack;

    .line 111
    .line 112
    invoke-direct {p1, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v2, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 116
    .line 117
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    sget-object v5, Lbsh/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Lbsh/飘花落叶言子楪哲兰世苏;

    .line 120
    .line 121
    invoke-virtual {p0, p1, v0, v4, v5}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    new-instance p1, Lbsh/CallStack;

    .line 125
    .line 126
    invoke-direct {p1, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v2, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 130
    .line 131
    sget-object v1, Lbsh/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Lbsh/飘花落叶言子楪哲兰世苏;

    .line 132
    .line 133
    invoke-virtual {p0, p1, v0, v4, v1}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 134
    .line 135
    .line 136
    return-object v2

    .line 137
    :catch_0
    move-exception p0

    .line 138
    const-string p1, "Error in class instance This initialization: "

    .line 139
    .line 140
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    return-object v3

    .line 144
    :catch_1
    move-exception p0

    .line 145
    const-string p1, "unable to get instance initializer: "

    .line 146
    .line 147
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    return-object v3

    .line 151
    :catch_2
    move-exception p0

    .line 152
    const-string p1, "Error in class gen setup: "

    .line 153
    .line 154
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    return-object v3

    .line 158
    :cond_2
    return-object v0
.end method

.method public static initInstance(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lbsh/This;->initClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :goto_0
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v2, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v3, Lbsh/飘花落叶言子苏世楪哲兰;

    .line 44
    .line 45
    invoke-direct {v3, p0, v4}, Lbsh/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 49
    .line 50
    .line 51
    iget-boolean v2, v1, Lbsh/NameSpace;->isEnum:Z

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    sget-object v2, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/util/Map;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Ljava/util/Map;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {p2, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    check-cast p2, [Ljava/lang/Object;

    .line 88
    .line 89
    :cond_1
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/4 v5, 0x1

    .line 98
    invoke-virtual {v1, v2, v3, v5}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    array-length v2, p2

    .line 103
    if-lez v2, :cond_3

    .line 104
    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    new-instance p0, Lbsh/InterpreterError;

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v1, "Can\'t find constructor: "

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-static {p1, p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-direct {p0, p1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p0

    .line 139
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 140
    .line 141
    iget-object p1, v0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 142
    .line 143
    invoke-virtual {v1, p2, p1}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_4
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰苏世哲(Lbsh/NameSpace;)[Lbsh/Variable;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    array-length p1, p0

    .line 155
    move p2, v4

    .line 156
    :goto_2
    if-ge p2, p1, :cond_5

    .line 157
    .line 158
    aget-object v0, p0, p2

    .line 159
    .line 160
    invoke-virtual {v0, v4}, Lbsh/Variable;->validateFinalIsSet(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    add-int/lit8 p2, p2, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    return-void

    .line 167
    :catch_0
    move-exception p0

    .line 168
    instance-of p1, p0, Lbsh/TargetError;

    .line 169
    .line 170
    if-eqz p1, :cond_6

    .line 171
    .line 172
    check-cast p0, Lbsh/TargetError;

    .line 173
    .line 174
    invoke-virtual {p0}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, Ljava/lang/Exception;

    .line 179
    .line 180
    :cond_6
    instance-of p1, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 181
    .line 182
    if-eqz p1, :cond_7

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Ljava/lang/Exception;

    .line 189
    .line 190
    :cond_7
    const-string p1, "Error in class instance initialization: "

    .line 191
    .line 192
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public static initStatic(Ljava/lang/Class;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-static {p0, v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;)Lbsh/This;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object p0, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget-object v2, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lbsh/BSHBlock;

    .line 28
    .line 29
    new-instance v3, Lbsh/CallStack;

    .line 30
    .line 31
    invoke-direct {v3, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 32
    .line 33
    .line 34
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    sget-object v5, Lbsh/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Lbsh/飘花落叶言子楪哲兰世苏;

    .line 37
    .line 38
    invoke-virtual {v2, v3, p0, v4, v5}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object v5, Lbsh/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Lbsh/飘花落叶言子楪哲兰世苏;

    .line 42
    .line 43
    invoke-virtual {v2, v3, p0, v4, v5}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰苏世哲(Lbsh/NameSpace;)[Lbsh/Variable;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    array-length v1, p0

    .line 51
    const/4 v2, 0x0

    .line 52
    :goto_0
    if-ge v2, v1, :cond_0

    .line 53
    .line 54
    aget-object v3, p0, v2

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-virtual {v3, v4}, Lbsh/Variable;->validateFinalIsSet(Z)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception p0

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    return-void

    .line 66
    :cond_1
    new-instance p0, Lbsh/UtilEvalError;

    .line 67
    .line 68
    const-string v1, "No namespace or interpreter for statitc This. Start interpreter for class not implemented yet."

    .line 69
    .line 70
    invoke-direct {p0, v1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :goto_1
    new-instance v1, Lbsh/UtilEvalError;

    .line 75
    .line 76
    const-string v2, "Exception in static init block <clinit> for class "

    .line 77
    .line 78
    const-string v3, ". With message: "

    .line 79
    .line 80
    invoke-static {v2, v0, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {v1, v0, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    throw v1
.end method

.method public static isExposedThisMethod(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "invokeMethod"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "getInterface"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "wait"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "notify"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "notifyAll"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method private static synthetic lambda$initInstance$0(Lbsh/GeneratedClass;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/This;->initClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$static$1()Ljava/util/Map;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static pullBshStatic(Ljava/lang/String;)Lbsh/This;
    .locals 3

    .line 1
    sget-object v0, Lbsh/This;->contextStore:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lbsh/NameSpace;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-static {v2, v2}, Lbsh/This;->getThis(Lbsh/NameSpace;Lbsh/Interpreter;)Lbsh/This;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static registerConstructorContext(Lbsh/CallStack;Lbsh/Interpreter;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lbsh/This;->CONTEXT_NAMESPACE:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    invoke-virtual {p0}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object p0, Lbsh/This;->CONTEXT_NAMESPACE:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 16
    .line 17
    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    sget-object p0, Lbsh/This;->CONTEXT_INTERPRETER:Ljava/lang/ThreadLocal;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    sget-object p0, Lbsh/This;->CONTEXT_INTERPRETER:Ljava/lang/ThreadLocal;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lbsh/This;->lambda$static$1()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lbsh/GeneratedClass;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/This;->lambda$initInstance$0(Lbsh/GeneratedClass;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public cloneMethodImpl(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 238
    invoke-virtual {p0, p1, p2, v0}, Lbsh/This;->cloneMethodImpl(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public cloneMethodImpl(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Lbsh/NameSpace;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 4
    .line 5
    invoke-virtual {v1}, Lbsh/NameSpace;->getParent()Lbsh/NameSpace;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 15
    .line 16
    invoke-virtual {v3}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, " clone"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-direct {v0, v1, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-nez p3, :cond_1

    .line 37
    .line 38
    :try_start_0
    iget-object p3, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 39
    .line 40
    iget-object p3, p3, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 41
    .line 42
    if-nez p3, :cond_0

    .line 43
    .line 44
    iget-object p0, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :catch_0
    move-exception p0

    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :catch_1
    move-exception p0

    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :catch_2
    move-exception p0

    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :catch_3
    move-exception p0

    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :catch_4
    move-exception p0

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :catch_5
    move-exception p0

    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :catch_6
    move-exception p0

    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :cond_0
    invoke-virtual {p3, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    :cond_1
    invoke-virtual {v0, p3}, Lbsh/NameSpace;->setClassInstance(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 84
    .line 85
    iget-object v2, v2, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lbsh/NameSpace;->setClassStatic(Ljava/lang/Class;)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    iput-boolean v2, v0, Lbsh/NameSpace;->isClass:Z

    .line 92
    .line 93
    iput-boolean v2, v0, Lbsh/NameSpace;->isMethod:Z

    .line 94
    .line 95
    iget-object v3, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 96
    .line 97
    invoke-virtual {v3}, Lbsh/NameSpace;->getVariables()[Lbsh/Variable;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    array-length v4, v3

    .line 102
    const/4 v5, 0x0

    .line 103
    move v6, v5

    .line 104
    :goto_0
    if-ge v6, v4, :cond_2

    .line 105
    .line 106
    aget-object v7, v3, v6

    .line 107
    .line 108
    invoke-virtual {v0, v7}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v6, v6, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    new-instance v3, Lbsh/NameSpace;

    .line 115
    .line 116
    invoke-direct {v3, v0, v1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, p3}, Lbsh/NameSpace;->setClassInstance(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, v0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 123
    .line 124
    invoke-virtual {v3, v1}, Lbsh/NameSpace;->setClassStatic(Ljava/lang/Class;)V

    .line 125
    .line 126
    .line 127
    iput-boolean v2, v3, Lbsh/NameSpace;->isClass:Z

    .line 128
    .line 129
    iput-boolean v2, v3, Lbsh/NameSpace;->isMethod:Z

    .line 130
    .line 131
    iget-object v1, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 132
    .line 133
    invoke-virtual {v1}, Lbsh/NameSpace;->getMethods()[Lbsh/BshMethod;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    array-length v2, v1

    .line 138
    :goto_1
    if-ge v5, v2, :cond_3

    .line 139
    .line 140
    aget-object v4, v1, v5

    .line 141
    .line 142
    invoke-virtual {v4}, Lbsh/BshMethod;->clone()Lbsh/BshMethod;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    iput-object v3, v4, Lbsh/BshMethod;->declaringNameSpace:Lbsh/NameSpace;

    .line 147
    .line 148
    invoke-virtual {v0, v4}, Lbsh/NameSpace;->setMethod(Lbsh/BshMethod;)V

    .line 149
    .line 150
    .line 151
    add-int/lit8 v5, v5, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    sget-object v2, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    iget-object v2, v0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-static {p3, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    iget-object p0, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 182
    .line 183
    invoke-virtual {v0, p0}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {v1, p0}, Lbsh/LHS;->assign(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    .line 189
    .line 190
    return-object p3

    .line 191
    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v0, "Unable to assign clone instance This: "

    .line 194
    .line 195
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    invoke-virtual {p0, p3, p1, p2}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    throw p0

    .line 214
    :goto_3
    new-instance p3, Lbsh/EvalError;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v1, "Unable to clone from This reference: "

    .line 223
    .line 224
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-direct {p3, p0, p1, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 235
    .line 236
    .line 237
    throw p3
.end method

.method public enumValues()[Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lbsh/飘花落叶言子楪兰世哲苏;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, p0, v2}, Lbsh/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Lbsh/飘花落叶言子楪世哲苏兰;

    .line 28
    .line 29
    const/16 v2, 0xe

    .line 30
    .line 31
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    const/4 v2, 0x5

    .line 41
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Lbsh/飘花落叶言子苏楪哲兰世;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v1, p0, v2}, Lbsh/飘花落叶言子苏楪哲兰世;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public getInterface(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 60
    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbsh/This;->getInterface([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getInterface([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/This;->interfaces:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbsh/This;->interfaces:Ljava/util/Map;

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    const/16 v1, 0x15

    .line 14
    .line 15
    move v2, v0

    .line 16
    :goto_0
    array-length v3, p1

    .line 17
    if-ge v2, v3, :cond_1

    .line 18
    .line 19
    aget-object v3, p1, v2

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    invoke-static {v4, v1, v3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Lbsh/This;->interfaces:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    aget-object v0, p1, v0

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v2, p0, Lbsh/This;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 48
    .line 49
    invoke-static {v0, p1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p0, p0, Lbsh/This;->interfaces:Ljava/util/Map;

    .line 54
    .line 55
    invoke-interface {p0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_2
    return-object v2
.end method

.method public getNameSpace()Lbsh/NameSpace;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 2
    .line 3
    return-object p0
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 212
    invoke-virtual/range {v0 .. v6}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 4
    .line 5
    :cond_0
    move-object v2, p2

    .line 6
    if-nez p3, :cond_1

    .line 7
    .line 8
    iget-object p3, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 9
    .line 10
    :cond_1
    move-object v3, p3

    .line 11
    invoke-virtual {v3}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget-object p2, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 18
    .line 19
    invoke-virtual {v3, p2}, Lbsh/Interpreter;->setNameSpace(Lbsh/NameSpace;)V

    .line 20
    .line 21
    .line 22
    :cond_2
    if-nez p4, :cond_3

    .line 23
    .line 24
    new-instance p4, Lbsh/CallStack;

    .line 25
    .line 26
    iget-object p2, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 27
    .line 28
    invoke-direct {p4, p2}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 29
    .line 30
    .line 31
    :cond_3
    move-object v4, p4

    .line 32
    if-nez p5, :cond_4

    .line 33
    .line 34
    sget-object p5, Lbsh/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 35
    .line 36
    :cond_4
    move-object v5, p5

    .line 37
    invoke-static {v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p3, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 42
    .line 43
    invoke-static {p3, p1, p2, p6}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲世兰苏(Lbsh/NameSpace;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-eqz p3, :cond_5

    .line 48
    .line 49
    invoke-virtual {p3, v2, v3, v4, v5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_5
    const-string p3, "getClass"

    .line 55
    .line 56
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-eqz p3, :cond_6

    .line 61
    .line 62
    array-length p3, v2

    .line 63
    if-nez p3, :cond_6

    .line 64
    .line 65
    const-class p0, Lbsh/This;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_6
    const-string p3, "toString"

    .line 69
    .line 70
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_7

    .line 75
    .line 76
    array-length p3, v2

    .line 77
    if-nez p3, :cond_7

    .line 78
    .line 79
    invoke-virtual {p0}, Lbsh/This;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_7
    const-string p3, "hashCode"

    .line 85
    .line 86
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    if-eqz p3, :cond_8

    .line 91
    .line 92
    array-length p3, v2

    .line 93
    if-nez p3, :cond_8

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_8
    const-string p3, "equals"

    .line 105
    .line 106
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    const/4 p4, 0x0

    .line 111
    const/4 p5, 0x1

    .line 112
    if-eqz p3, :cond_a

    .line 113
    .line 114
    array-length p3, v2

    .line 115
    if-ne p3, p5, :cond_a

    .line 116
    .line 117
    aget-object p1, v2, p4

    .line 118
    .line 119
    if-ne p0, p1, :cond_9

    .line 120
    .line 121
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_9
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_a
    const-string p3, "clone"

    .line 128
    .line 129
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p3

    .line 133
    if-eqz p3, :cond_b

    .line 134
    .line 135
    array-length p3, v2

    .line 136
    if-nez p3, :cond_b

    .line 137
    .line 138
    invoke-virtual {p0, v5, v4}, Lbsh/This;->cloneMethodImpl(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :cond_b
    new-array v6, p5, [Z

    .line 144
    .line 145
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 146
    .line 147
    move-object v1, p1

    .line 148
    invoke-virtual/range {v0 .. v6}, Lbsh/NameSpace;->invokeDefaultInvokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;[Z)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    aget-boolean p3, v6, p4

    .line 153
    .line 154
    if-eqz p3, :cond_c

    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_c
    :try_start_0
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 158
    .line 159
    const/4 v6, 0x1

    .line 160
    invoke-virtual/range {v0 .. v6}, Lbsh/NameSpace;->invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    return-object p0

    .line 165
    :catch_0
    move-exception v0

    .line 166
    move-object p1, v0

    .line 167
    new-instance p3, Lbsh/EvalException;

    .line 168
    .line 169
    invoke-static {v1, p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 174
    .line 175
    invoke-virtual {p0}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    new-instance p4, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string p5, "Method "

    .line 182
    .line 183
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string p2, " not found in bsh scripted object: "

    .line 190
    .line 191
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-direct {p3, p0, v5, v4, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    throw p3
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 7

    .line 205
    new-instance v4, Lbsh/CallStack;

    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    invoke-direct {v4, v0}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 206
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    invoke-virtual {v0}, Lbsh/NameSpace;->getNode()Lbsh/飘花落叶言子世兰苏楪哲;

    move-result-object v5

    .line 207
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbsh/NameSpace;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 208
    :try_start_0
    iget-object v3, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v6, p3

    invoke-virtual/range {v0 .. v6}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    move-result-object p0

    .line 209
    instance-of p1, p0, Lbsh/Primitive;

    if-eqz p1, :cond_0

    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    if-eq p0, p1, :cond_0

    .line 210
    check-cast p0, Lbsh/Primitive;

    invoke-virtual {p0}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    move-object p0, v0

    goto :goto_0

    :cond_0
    return-object p0

    .line 211
    :goto_0
    new-instance p1, Lbsh/EvalException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v5, v4, p0}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public run()V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "run"

    .line 2
    .line 3
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    iget-object p0, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "Exception in runnable:"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Class;

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "toString"

    .line 8
    .line 9
    invoke-static {v0, v4, v2, v3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲世兰苏(Lbsh/NameSpace;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v2, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :catch_0
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "\'this\' reference to Bsh object: "

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
