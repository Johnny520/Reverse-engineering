.class public Lnet/bytebuddy/implementation/HashCodeMethod$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/HashCodeMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldDescriptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final identity:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final initialValue:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final multiplier:I

.field private final nonNullable:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;ILjava/util/List;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "I",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->initialValue:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->multiplier:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->fieldDescriptions:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->identity:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 6

    .line 1
    invoke-interface {p3}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->fieldDescriptions:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    mul-int/lit8 v1, v1, 0x8

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->initialValue:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->fieldDescriptions:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v2, 0x0

    .line 47
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 58
    .line 59
    iget v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->multiplier:I

    .line 60
    .line 61
    invoke-static {v4}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/Multiplication;->INTEGER:Lnet/bytebuddy/implementation/bytecode/Multiplication;

    .line 69
    .line 70
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v4}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_0

    .line 100
    .line 101
    iget-object v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->identity:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 102
    .line 103
    invoke-interface {v4, v3}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_0

    .line 108
    .line 109
    sget-object v3, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->REFERENCE_IDENTITY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/Addition;->INTEGER:Lnet/bytebuddy/implementation/bytecode/Addition;

    .line 115
    .line 116
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-interface {v3}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_2

    .line 129
    .line 130
    invoke-interface {v3}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_2

    .line 139
    .line 140
    iget-object v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 141
    .line 142
    invoke-interface {v4, v3}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_1
    new-instance v4, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;

    .line 150
    .line 151
    invoke-direct {v4, p3}, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_2
    :goto_1
    sget-object v4, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$NoOp;

    .line 156
    .line 157
    :goto_2
    invoke-interface {v4}, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard;->before()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    invoke-interface {v3}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-static {v3}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/Addition;->INTEGER:Lnet/bytebuddy/implementation/bytecode/Addition;

    .line 176
    .line 177
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    invoke-interface {v4}, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard;->after()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    invoke-interface {v4}, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard;->getRequiredVariablePadding()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_3
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 198
    .line 199
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 203
    .line 204
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 205
    .line 206
    invoke-direct {v1, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    add-int/2addr p2, v2

    .line 222
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    :cond_4
    const-string p0, "Hash code method does not return primitive integer: "

    .line 227
    .line 228
    invoke-static {p0, p3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    :cond_5
    const-string p0, "Hash code method must not be static: "

    .line 237
    .line 238
    invoke-static {p0, p3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
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
    iget v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->multiplier:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->multiplier:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->initialValue:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->initialValue:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->fieldDescriptions:Ljava/util/List;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->fieldDescriptions:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->identity:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->identity:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->initialValue:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Lnet/bytebuddy/implementation/bytecode/StackManipulation;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->multiplier:I

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->fieldDescriptions:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;->identity:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method
