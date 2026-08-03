.class public final Lbsh/This;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

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
    new-instance v0, Lbsh/h;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, v1}, Lbsh/h;-><init>(I)V

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

.method public static synthetic a(Lbsh/GeneratedClass;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/This;->lambda$initInstance$0(Lbsh/GeneratedClass;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b()Ljava/util/Map;
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
    if-eqz v1, :cond_9

    .line 10
    .line 11
    const/4 v4, -0x1

    .line 12
    if-ne v3, v4, :cond_0

    .line 13
    .line 14
    sget-object v0, Lbsh/This$ConstructorArgs;->DEFAULT:Lbsh/This$ConstructorArgs;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v6, Lbsh/This$Keys;->BSHCONSTRUCTORS:Lbsh/This$Keys;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v5, v6}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    sget-object v6, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 32
    .line 33
    if-eq v5, v6, :cond_8

    .line 34
    .line 35
    check-cast v5, [Lbsh/DelayedEvalBshMethod;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 36
    .line 37
    aget-object v6, v5, v3

    .line 38
    .line 39
    invoke-virtual {v6}, Lbsh/DelayedEvalBshMethod;->getAltConstructor()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    if-nez v7, :cond_1

    .line 44
    .line 45
    sget-object v0, Lbsh/This$ConstructorArgs;->DEFAULT:Lbsh/This$ConstructorArgs;

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    invoke-virtual {v6}, Lbsh/DelayedEvalBshMethod;->getArgsNode()Lbsh/BSHArguments;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    new-instance v9, Lbsh/NameSpace;

    .line 53
    .line 54
    invoke-virtual {v1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    const-string v11, "consArgs"

    .line 59
    .line 60
    invoke-direct {v9, v10, v11}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6}, Lbsh/BshMethod;->getParameterNames()[Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-virtual {v6}, Lbsh/DelayedEvalBshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    const/4 v12, 0x0

    .line 72
    :goto_0
    array-length v13, v2

    .line 73
    if-ge v12, v13, :cond_2

    .line 74
    .line 75
    :try_start_1
    aget-object v13, v10, v12

    .line 76
    .line 77
    aget-object v14, v11, v12

    .line 78
    .line 79
    aget-object v15, v2, v12

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-virtual {v9, v13, v14, v15, v4}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    add-int/lit8 v12, v12, 0x1

    .line 86
    .line 87
    const/4 v4, -0x1

    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception v0

    .line 90
    const-string v1, "err setting local cons arg:"

    .line 91
    .line 92
    invoke-static {v1, v0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    return-object v0

    .line 97
    :cond_2
    new-instance v2, Lbsh/CallStack;

    .line 98
    .line 99
    invoke-direct {v2}, Lbsh/CallStack;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v9}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Lbsh/DelayedEvalBshMethod;->getConstructorArgs()[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    iget-object v1, v1, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 110
    .line 111
    if-eqz v8, :cond_3

    .line 112
    .line 113
    :try_start_2
    invoke-virtual {v8, v2, v1}, Lbsh/BSHArguments;->getArguments(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4
    :try_end_2
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_1

    .line 117
    goto :goto_1

    .line 118
    :catch_1
    move-exception v0

    .line 119
    const-string v1, "Error evaluating constructor args: "

    .line 120
    .line 121
    invoke-static {v1, v0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    return-object v0

    .line 126
    :cond_3
    :goto_1
    invoke-static {v4}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v4}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const-string v4, "super"

    .line 135
    .line 136
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_5

    .line 141
    .line 142
    sget-object v3, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 143
    .line 144
    invoke-virtual {v3, v0}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, Lbsh/BshClassManager$MemberCache;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v3, v0, v1}, Lbsh/BshClassManager$MemberCache;->findMemberIndex(Ljava/lang/String;[Ljava/lang/Class;)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    const/4 v4, -0x1

    .line 159
    if-eq v0, v4, :cond_4

    .line 160
    .line 161
    new-instance v1, Lbsh/This$ConstructorArgs;

    .line 162
    .line 163
    invoke-direct {v1, v0, v2}, Lbsh/This$ConstructorArgs;-><init>(I[Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    return-object v1

    .line 167
    :cond_4
    const-string v0, "can\'t find super constructor for args!"

    .line 168
    .line 169
    invoke-static {v0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const/4 v0, 0x0

    .line 173
    return-object v0

    .line 174
    :cond_5
    const/4 v4, -0x1

    .line 175
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-static {v1, v5}, Lbsh/Reflect;->findMostSpecificBshMethodIndex([Ljava/lang/Class;Ljava/util/List;)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eq v1, v4, :cond_7

    .line 184
    .line 185
    sget-object v4, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 186
    .line 187
    invoke-virtual {v4, v0}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    check-cast v4, Lbsh/BshClassManager$MemberCache;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v4, v0}, Lbsh/BshClassManager$MemberCache;->memberCount(Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    add-int/2addr v1, v0

    .line 202
    add-int/2addr v0, v3

    .line 203
    if-eq v1, v0, :cond_6

    .line 204
    .line 205
    new-instance v0, Lbsh/This$ConstructorArgs;

    .line 206
    .line 207
    invoke-direct {v0, v1, v2}, Lbsh/This$ConstructorArgs;-><init>(I[Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    return-object v0

    .line 211
    :cond_6
    const-string v0, "Recursive constructor call."

    .line 212
    .line 213
    invoke-static {v0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/4 v0, 0x0

    .line 217
    return-object v0

    .line 218
    :cond_7
    const-string v0, "can\'t find this constructor for args!"

    .line 219
    .line 220
    invoke-static {v0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    return-object v0

    .line 225
    :cond_8
    :try_start_3
    new-instance v0, Lbsh/InterpreterError;

    .line 226
    .line 227
    const-string v1, "Unable to find constructors array in class"

    .line 228
    .line 229
    invoke-direct {v0, v1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 233
    :catch_2
    move-exception v0

    .line 234
    const-string v1, "Unable to get instance initializers: "

    .line 235
    .line 236
    invoke-static {v1, v0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    const/4 v0, 0x0

    .line 240
    return-object v0

    .line 241
    :cond_9
    const-string v0, "Unititialized class: no static"

    .line 242
    .line 243
    invoke-static {v0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const/4 v0, 0x0

    .line 247
    return-object v0
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
    .locals 5

    .line 1
    invoke-static {p0, p1}, Lbsh/Reflect;->getClassInstanceThis(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

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
    invoke-static {v0, p1}, Lbsh/Reflect;->getClassStaticThis(Ljava/lang/Class;Ljava/lang/String;)Lbsh/This;

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
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    sget-object v4, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p0, p1}, Lbsh/Reflect;->getLHSObjectField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1, v2, v3}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p0}, Lbsh/NameSpace;->setClassInstance(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :try_start_1
    invoke-virtual {v0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object p1, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Lbsh/BSHBlock;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    .line 109
    :try_start_2
    new-instance p1, Lbsh/CallStack;

    .line 110
    .line 111
    invoke-direct {p1, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, v2, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 115
    .line 116
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 117
    .line 118
    sget-object v4, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSINSTANCEMETHODS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 119
    .line 120
    invoke-virtual {p0, p1, v0, v3, v4}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    new-instance p1, Lbsh/CallStack;

    .line 124
    .line 125
    invoke-direct {p1, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, v2, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 129
    .line 130
    sget-object v1, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSINSTANCEFIELDS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 131
    .line 132
    invoke-virtual {p0, p1, v0, v3, v1}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 133
    .line 134
    .line 135
    return-object v2

    .line 136
    :catch_0
    move-exception p0

    .line 137
    const-string p1, "Error in class instance This initialization: "

    .line 138
    .line 139
    invoke-static {p1, p0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :goto_1
    const/4 p0, 0x0

    .line 143
    return-object p0

    .line 144
    :catch_1
    move-exception p0

    .line 145
    const-string p1, "unable to get instance initializer: "

    .line 146
    .line 147
    invoke-static {p1, p0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :catch_2
    move-exception p0

    .line 152
    const-string p1, "Error in class gen setup: "

    .line 153
    .line 154
    invoke-static {p1, p0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

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
    new-instance v3, Lae/g;

    .line 44
    .line 45
    const/4 v5, 0x5

    .line 46
    invoke-direct {v3, p0, v5}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 50
    .line 51
    .line 52
    iget-boolean v2, v1, Lbsh/NameSpace;->isEnum:Z

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    sget-object v2, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ljava/util/Map;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Ljava/util/Map;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-interface {p2, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, [Ljava/lang/Object;

    .line 89
    .line 90
    :cond_1
    invoke-static {p1}, Lbsh/Types;->getBaseName(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-static {p2}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const/4 v5, 0x1

    .line 99
    invoke-virtual {v1, v2, v3, v5}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    array-length v2, p2

    .line 104
    if-lez v2, :cond_3

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    new-instance p0, Lbsh/InterpreterError;

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v1, "Can\'t find constructor: "

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-static {p1, p2}, Lbsh/StringUtil;->methodString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p0, p1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 137
    .line 138
    iget-object p1, v0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 139
    .line 140
    invoke-virtual {v1, p2, p1}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-static {p0}, Lbsh/Reflect;->getVariables(Ljava/lang/Object;)[Lbsh/Variable;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    array-length p1, p0

    .line 148
    move p2, v4

    .line 149
    :goto_2
    if-ge p2, p1, :cond_5

    .line 150
    .line 151
    aget-object v0, p0, p2

    .line 152
    .line 153
    invoke-virtual {v0, v4}, Lbsh/Variable;->validateFinalIsSet(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .line 155
    .line 156
    add-int/lit8 p2, p2, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    return-void

    .line 160
    :catch_0
    move-exception p0

    .line 161
    instance-of p1, p0, Lbsh/TargetError;

    .line 162
    .line 163
    if-eqz p1, :cond_6

    .line 164
    .line 165
    check-cast p0, Lbsh/TargetError;

    .line 166
    .line 167
    invoke-virtual {p0}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, Ljava/lang/Exception;

    .line 172
    .line 173
    :cond_6
    instance-of p1, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 174
    .line 175
    if-eqz p1, :cond_7

    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Ljava/lang/Exception;

    .line 182
    .line 183
    :cond_7
    const-string p1, "Error in class instance initialization: "

    .line 184
    .line 185
    invoke-static {p1, p0}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
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
    invoke-static {p0, v0}, Lbsh/Reflect;->getClassStaticThis(Ljava/lang/Class;Ljava/lang/String;)Lbsh/This;

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
    sget-object v5, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSSTATICMETHODS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 37
    .line 38
    invoke-virtual {v2, v3, p0, v4, v5}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object v5, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSSTATICFIELDS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 42
    .line 43
    invoke-virtual {v2, v3, p0, v4, v5}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lbsh/Reflect;->getVariables(Lbsh/NameSpace;)[Lbsh/Variable;

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
    invoke-static {v2, v0, v3}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

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


# virtual methods
.method public cloneMethodImpl(Lbsh/Node;Lbsh/CallStack;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 238
    invoke-virtual {p0, p1, p2, v0}, Lbsh/This;->cloneMethodImpl(Lbsh/Node;Lbsh/CallStack;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public cloneMethodImpl(Lbsh/Node;Lbsh/CallStack;Ljava/lang/Object;)Ljava/lang/Object;
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
    iget-object p3, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 45
    .line 46
    invoke-virtual {v0, p3}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :catch_0
    move-exception p3

    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :catch_1
    move-exception p3

    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :catch_2
    move-exception p3

    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :catch_3
    move-exception p3

    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :catch_4
    move-exception p3

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :catch_5
    move-exception p3

    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :catch_6
    move-exception p3

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
    invoke-static {p3, v1}, Lbsh/Reflect;->getLHSObjectField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    iget-object v2, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 182
    .line 183
    invoke-virtual {v0, v2}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v1, v0}, Lbsh/LHS;->assign(Ljava/lang/Object;)Ljava/lang/Object;
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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v1, "Unable to assign clone instance This: "

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {p3, v0, p1, p2}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    throw p1

    .line 214
    :goto_3
    new-instance v0, Lbsh/EvalError;

    .line 215
    .line 216
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p3

    .line 220
    new-instance v1, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v2, "Unable to clone from This reference: "

    .line 223
    .line 224
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p3

    .line 234
    invoke-direct {v0, p3, p1, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 235
    .line 236
    .line 237
    throw v0
.end method

.method public enumValues()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lbsh/NameSpace;->classStatic:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0}, Lbsh/Reflect;->getEnumConstants(Ljava/lang/Class;)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

    .line 62
    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbsh/This;->getInterface([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getInterface([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
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
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    add-int/lit8 v3, v3, 0x3

    .line 26
    .line 27
    mul-int/2addr v1, v3

    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, p0, Lbsh/This;->interfaces:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    aget-object v0, p1, v0

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v2, p0, Lbsh/This;->invocationHandler:Ljava/lang/reflect/InvocationHandler;

    .line 50
    .line 51
    invoke-static {v0, p1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, p0, Lbsh/This;->interfaces:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    return-object v2
.end method

.method public getNameSpace()Lbsh/NameSpace;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 2
    .line 3
    return-object v0
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
    invoke-virtual/range {v0 .. v6}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lbsh/Reflect;->ZERO_ARGS:[Ljava/lang/Object;

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
    sget-object p5, Lbsh/Node;->JAVACODE:Lbsh/Node;

    .line 35
    .line 36
    :cond_4
    move-object v5, p5

    .line 37
    invoke-static {v2}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p3, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 42
    .line 43
    invoke-static {p3, p1, p2, p6}, Lbsh/Reflect;->getMethod(Lbsh/NameSpace;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-eqz p3, :cond_5

    .line 48
    .line 49
    invoke-virtual {p3, v2, v3, v4, v5}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

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
    const-class p1, Lbsh/This;

    .line 66
    .line 67
    return-object p1

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
    move-result-object p1

    .line 83
    return-object p1

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
    move-result p1

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

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
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    return-object p1

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
    invoke-virtual {p0, v5, v4}, Lbsh/This;->cloneMethodImpl(Lbsh/Node;Lbsh/CallStack;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

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
    invoke-virtual/range {v0 .. v6}, Lbsh/NameSpace;->invokeDefaultInvokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;[Z)Ljava/lang/Object;

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
    invoke-virtual/range {v0 .. v6}, Lbsh/NameSpace;->invokeCommand(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    return-object p1

    .line 165
    :catch_0
    move-exception v0

    .line 166
    move-object p1, v0

    .line 167
    new-instance p3, Lbsh/EvalException;

    .line 168
    .line 169
    invoke-static {v1, p2}, Lbsh/StringUtil;->methodString(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    iget-object p4, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 174
    .line 175
    invoke-virtual {p4}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p4

    .line 179
    new-instance p5, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string p6, "Method "

    .line 182
    .line 183
    invoke-direct {p5, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string p2, " not found in bsh scripted object: "

    .line 190
    .line 191
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-direct {p3, p2, v5, v4, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    throw p3
.end method

.method public invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 8

    .line 205
    new-instance v5, Lbsh/CallStack;

    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    invoke-direct {v5, v0}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 206
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    invoke-virtual {v0}, Lbsh/NameSpace;->getNode()Lbsh/Node;

    move-result-object v6

    .line 207
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbsh/NameSpace;->setNode(Lbsh/Node;)V

    .line 208
    :try_start_0
    iget-object v4, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v7, p3

    invoke-virtual/range {v1 .. v7}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    move-result-object p1

    .line 209
    instance-of p2, p1, Lbsh/Primitive;

    if-eqz p2, :cond_0

    sget-object p2, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    if-eq p1, p2, :cond_0

    .line 210
    check-cast p1, Lbsh/Primitive;

    invoke-virtual {p1}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-object p1

    .line 211
    :goto_0
    new-instance p2, Lbsh/EvalException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, v6, v5, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public run()V
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "run"

    .line 2
    .line 3
    sget-object v1, Lbsh/Reflect;->ZERO_ARGS:[Ljava/lang/Object;

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
    iget-object v1, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "Exception in runnable:"

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1, v0}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Class;

    .line 5
    .line 6
    const-string v3, "toString"

    .line 7
    .line 8
    invoke-static {v0, v3, v2}, Lbsh/Reflect;->getMethod(Lbsh/NameSpace;Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v2, p0, Lbsh/This;->declaringInterpreter:Lbsh/Interpreter;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :catch_0
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "\'this\' reference to Bsh object: "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method
