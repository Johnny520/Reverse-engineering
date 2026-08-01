.class public Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;Lnet/bytebuddy/implementation/Implementation$Target;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

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
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;->access$200(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;)Lnet/bytebuddy/implementation/MethodAccessorFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

    .line 8
    .line 9
    invoke-static {v1}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;->access$100(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;)Lnet/bytebuddy/description/field/FieldDescription;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->DEFAULT:Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Lnet/bytebuddy/implementation/MethodAccessorFactory;->registerGetterFor(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 20
    .line 21
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

    .line 22
    .line 23
    invoke-static {v2}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;->access$100(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;)Lnet/bytebuddy/description/field/FieldDescription;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 40
    .line 41
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iget-object v7, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    const-string v8, "instance"

    .line 52
    .line 53
    invoke-static {v8}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-interface {v7, v8}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Lnet/bytebuddy/description/field/FieldList;

    .line 62
    .line 63
    invoke-interface {v7}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    check-cast v7, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 68
    .line 69
    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-interface {v7}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    new-array v8, v5, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 78
    .line 79
    aput-object v6, v8, v4

    .line 80
    .line 81
    aput-object v7, v8, v3

    .line 82
    .line 83
    invoke-direct {v2, v8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

    .line 91
    .line 92
    invoke-static {p0}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;->access$300(Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 105
    .line 106
    invoke-interface {p0, v0, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const/4 v7, 0x4

    .line 123
    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 124
    .line 125
    aput-object v2, v7, v4

    .line 126
    .line 127
    aput-object v6, v7, v3

    .line 128
    .line 129
    aput-object p0, v7, v5

    .line 130
    .line 131
    const/4 p0, 0x3

    .line 132
    aput-object v0, v7, p0

    .line 133
    .line 134
    invoke-direct {v1, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 142
    .line 143
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 152
    .line 153
    .line 154
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bind/annotation/FieldProxy$Binder$FieldGetter;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
