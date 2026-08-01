.class public Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/implementation/Implementation$Target;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v3, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 11
    .line 12
    invoke-static {v3}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-interface {v3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 25
    .line 26
    iget-object v4, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 27
    .line 28
    invoke-static {v4}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v4}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-interface {v4}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x0

    .line 45
    move v6, v5

    .line 46
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/4 v8, 0x3

    .line 51
    const/4 v9, 0x4

    .line 52
    const/4 v10, 0x2

    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 60
    .line 61
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 62
    .line 63
    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    sget-object v13, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 68
    .line 69
    invoke-virtual {v13}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->load()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    iget-object v14, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 74
    .line 75
    invoke-static {v14}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$200(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    const-class v15, Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {v15}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    move/from16 v16, v2

    .line 86
    .line 87
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 88
    .line 89
    invoke-interface {v14, v15, v7, v2}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    new-array v7, v9, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 94
    .line 95
    aput-object v1, v7, v5

    .line 96
    .line 97
    aput-object v12, v7, v16

    .line 98
    .line 99
    aput-object v13, v7, v10

    .line 100
    .line 101
    aput-object v2, v7, v8

    .line 102
    .line 103
    invoke-direct {v11, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 104
    .line 105
    .line 106
    aput-object v11, v3, v6

    .line 107
    .line 108
    add-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    move/from16 v2, v16

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    move/from16 v16, v2

    .line 114
    .line 115
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 116
    .line 117
    iget-object v2, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 118
    .line 119
    invoke-static {v2}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-interface {v2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_1

    .line 128
    .line 129
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_1
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 133
    .line 134
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iget-object v6, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 139
    .line 140
    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    const-string v7, "target"

    .line 145
    .line 146
    invoke-static {v7}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-interface {v6, v7}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    check-cast v6, Lnet/bytebuddy/description/field/FieldList;

    .line 155
    .line 156
    invoke-interface {v6}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 161
    .line 162
    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-interface {v6}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    new-array v7, v10, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 171
    .line 172
    aput-object v4, v7, v5

    .line 173
    .line 174
    aput-object v6, v7, v16

    .line 175
    .line 176
    invoke-direct {v2, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 177
    .line 178
    .line 179
    :goto_1
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 180
    .line 181
    invoke-direct {v4, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 182
    .line 183
    .line 184
    iget-object v3, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 185
    .line 186
    invoke-static {v3}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    iget-object v6, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 195
    .line 196
    invoke-static {v6}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$200(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    iget-object v0, v0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 201
    .line 202
    invoke-static {v0}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->access$100(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    sget-object v11, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 215
    .line 216
    invoke-interface {v6, v0, v7, v11}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const/4 v6, 0x5

    .line 221
    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 222
    .line 223
    aput-object v2, v6, v5

    .line 224
    .line 225
    aput-object v4, v6, v16

    .line 226
    .line 227
    aput-object v3, v6, v10

    .line 228
    .line 229
    aput-object v0, v6, v8

    .line 230
    .line 231
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 232
    .line 233
    aput-object v0, v6, v9

    .line 234
    .line 235
    invoke-direct {v1, v6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v0, p1

    .line 239
    .line 240
    move-object/from16 v2, p2

    .line 241
    .line 242
    invoke-virtual {v1, v0, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 247
    .line 248
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-direct {v1, v0, v2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 257
    .line 258
    .line 259
    return-object v1
.end method

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$MethodCall;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
