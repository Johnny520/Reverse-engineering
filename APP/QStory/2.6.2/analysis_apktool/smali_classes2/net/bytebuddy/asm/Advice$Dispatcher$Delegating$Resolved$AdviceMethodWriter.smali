.class public abstract Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$Bound;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AdviceMethodWriter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodExit;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter$ForMethodEnter;
    }
.end annotation


# instance fields
.field protected final argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final delegator:Lnet/bytebuddy/asm/Advice$Delegator;

.field private final exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field protected final implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field protected final methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

.field protected final methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

.field private final offsetMappings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;",
            ">;"
        }
    .end annotation
.end field

.field private final postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

.field private final relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

.field protected final stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

.field private final suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

.field protected final typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$PostProcessor;Ljava/util/List;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$Delegator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;",
            ">;",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Lnet/bytebuddy/implementation/Implementation$Context;",
            "Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;",
            "Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/asm/Advice$Delegator;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->offsetMappings:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 19
    .line 20
    iput-object p9, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 21
    .line 22
    iput-object p10, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 23
    .line 24
    iput-object p11, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 25
    .line 26
    iput-object p12, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 27
    .line 28
    iput-object p13, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    .line 29
    .line 30
    iput-object p14, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 31
    .line 32
    iput-object p15, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public apply()V
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onStart(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->offsetMappings:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    .line 29
    .line 30
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 31
    .line 32
    invoke-virtual {v6}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    add-int/lit8 v7, v4, 0x1

    .line 37
    .line 38
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription;

    .line 43
    .line 44
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/2addr v3, v4

    .line 53
    invoke-interface {v5}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;->resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 58
    .line 59
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 60
    .line 61
    invoke-interface {v4, v5, v6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    add-int/2addr v4, v3

    .line 70
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    move v4, v7

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->delegator:Lnet/bytebuddy/asm/Advice$Delegator;

    .line 77
    .line 78
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 79
    .line 80
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 81
    .line 82
    invoke-interface {v0, v3, v4}, Lnet/bytebuddy/asm/Advice$Delegator;->apply(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 87
    .line 88
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 89
    .line 90
    invoke-interface {v0, v3, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 103
    .line 104
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 105
    .line 106
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 107
    .line 108
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 109
    .line 110
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 111
    .line 112
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 113
    .line 114
    invoke-virtual {v7}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-interface/range {v2 .. v7}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onEndWithSkip(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 122
    .line 123
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 128
    .line 129
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_a

    .line 134
    .line 135
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 136
    .line 137
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 142
    .line 143
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-nez v2, :cond_a

    .line 148
    .line 149
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 150
    .line 151
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 156
    .line 157
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_a

    .line 162
    .line 163
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 164
    .line 165
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 170
    .line 171
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-nez v2, :cond_a

    .line 176
    .line 177
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 178
    .line 179
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 184
    .line 185
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_1

    .line 190
    .line 191
    goto/16 :goto_5

    .line 192
    .line 193
    :cond_1
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 194
    .line 195
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 200
    .line 201
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_3

    .line 206
    .line 207
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 208
    .line 209
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 214
    .line 215
    if-eqz v2, :cond_2

    .line 216
    .line 217
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    goto :goto_1

    .line 222
    :cond_2
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    :goto_1
    const/16 v3, 0x37

    .line 227
    .line 228
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_7

    .line 232
    .line 233
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 234
    .line 235
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 240
    .line 241
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eqz v2, :cond_5

    .line 246
    .line 247
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 248
    .line 249
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 254
    .line 255
    if-eqz v2, :cond_4

    .line 256
    .line 257
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    goto :goto_2

    .line 262
    :cond_4
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    :goto_2
    const/16 v3, 0x38

    .line 267
    .line 268
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 269
    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 273
    .line 274
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 279
    .line 280
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_7

    .line 285
    .line 286
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 287
    .line 288
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 293
    .line 294
    if-eqz v2, :cond_6

    .line 295
    .line 296
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    goto :goto_3

    .line 301
    :cond_6
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    :goto_3
    const/16 v3, 0x39

    .line 306
    .line 307
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 312
    .line 313
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 318
    .line 319
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 324
    .line 325
    if-eqz v2, :cond_8

    .line 326
    .line 327
    invoke-virtual {v3, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 328
    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_8
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 336
    .line 337
    if-eqz v1, :cond_9

    .line 338
    .line 339
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    goto :goto_4

    .line 344
    :cond_9
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    :goto_4
    const/16 v2, 0x3a

    .line 349
    .line 350
    invoke-virtual {v3, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 351
    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_a
    :goto_5
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 355
    .line 356
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 361
    .line 362
    if-eqz v2, :cond_b

    .line 363
    .line 364
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    goto :goto_6

    .line 369
    :cond_b
    invoke-interface {v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    :goto_6
    const/16 v3, 0x36

    .line 374
    .line 375
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 376
    .line 377
    .line 378
    :goto_7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 379
    .line 380
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->postProcessor:Lnet/bytebuddy/asm/Advice$PostProcessor;

    .line 381
    .line 382
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 383
    .line 384
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 385
    .line 386
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 387
    .line 388
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 389
    .line 390
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 391
    .line 392
    iget-object v8, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 393
    .line 394
    invoke-interface/range {v2 .. v8}, Lnet/bytebuddy/asm/Advice$PostProcessor;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 399
    .line 400
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 401
    .line 402
    invoke-interface {v2, v3, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 411
    .line 412
    .line 413
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 414
    .line 415
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->relocationHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;

    .line 416
    .line 417
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 418
    .line 419
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context;

    .line 420
    .line 421
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->isExitAdvice()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->argumentHandler:Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;

    .line 426
    .line 427
    if-eqz v5, :cond_c

    .line 428
    .line 429
    invoke-interface {v6}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    goto :goto_8

    .line 434
    :cond_c
    invoke-interface {v6}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    :goto_8
    invoke-interface {v2, v3, v4, v5}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;I)I

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 443
    .line 444
    .line 445
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;

    .line 446
    .line 447
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 448
    .line 449
    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectCompletionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 450
    .line 451
    .line 452
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 453
    .line 454
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 455
    .line 456
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    invoke-interface {v1, v0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 473
    .line 474
    .line 475
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodSizeHandler:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;

    .line 476
    .line 477
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 478
    .line 479
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 484
    .line 485
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 494
    .line 495
    .line 496
    move-result p0

    .line 497
    add-int/2addr p0, v1

    .line 498
    invoke-interface {v0, p0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireLocalVariableLength(I)V

    .line 499
    .line 500
    .line 501
    return-void
.end method

.method public abstract isExitAdvice()Z
.end method

.method public prepare()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->suppressionHandler:Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$Delegating$Resolved$AdviceMethodWriter;->methodVisitor:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;->onPrepare(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
