.class public Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;Lnet/bytebuddy/implementation/Implementation$Target;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

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
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 10

    .line 1
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 11
    .line 12
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

    .line 17
    .line 18
    invoke-static {v2}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;->access$500(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;)Lnet/bytebuddy/implementation/MethodAccessorFactory;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

    .line 23
    .line 24
    invoke-static {v3}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;->access$400(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;)Lnet/bytebuddy/description/field/FieldDescription;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    sget-object v4, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->DEFAULT:Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 29
    .line 30
    invoke-interface {v2, v3, v4}, Lnet/bytebuddy/implementation/MethodAccessorFactory;->registerSetterFor(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 35
    .line 36
    iget-object v4, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

    .line 37
    .line 38
    invoke-static {v4}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;->access$400(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;)Lnet/bytebuddy/description/field/FieldDescription;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const/4 v5, 0x2

    .line 47
    const/4 v6, 0x1

    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 54
    .line 55
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget-object v8, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    const-string v9, "instance"

    .line 66
    .line 67
    invoke-static {v9}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-interface {v8, v9}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    check-cast v8, Lnet/bytebuddy/description/field/FieldList;

    .line 76
    .line 77
    invoke-interface {v8}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 82
    .line 83
    invoke-static {v8}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-interface {v8}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    new-array v9, v5, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 92
    .line 93
    aput-object v7, v9, v1

    .line 94
    .line 95
    aput-object v8, v9, v6

    .line 96
    .line 97
    invoke-direct {v4, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v7, v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

    .line 109
    .line 110
    invoke-static {p0}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;->access$600(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 123
    .line 124
    invoke-interface {v8}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    sget-object v9, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 129
    .line 130
    invoke-interface {p0, v0, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const/4 v2, 0x5

    .line 139
    new-array v2, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 140
    .line 141
    aput-object v4, v2, v1

    .line 142
    .line 143
    aput-object v7, v2, v6

    .line 144
    .line 145
    aput-object p0, v2, v5

    .line 146
    .line 147
    const/4 p0, 0x3

    .line 148
    aput-object v0, v2, p0

    .line 149
    .line 150
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 151
    .line 152
    const/4 v0, 0x4

    .line 153
    aput-object p0, v2, v0

    .line 154
    .line 155
    invoke-direct {v3, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 163
    .line 164
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 173
    .line 174
    .line 175
    return-object p1
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldSetter;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
