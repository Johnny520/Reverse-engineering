.class public Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field final synthetic this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;-><init>(Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 34
    .line 35
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 36
    .line 37
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-array v5, v5, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 50
    .line 51
    aput-object v7, v5, v4

    .line 52
    .line 53
    aput-object v2, v5, v3

    .line 54
    .line 55
    invoke-direct {v6, v5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 63
    .line 64
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 65
    .line 66
    invoke-direct {v2, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 70
    .line 71
    invoke-static {v1}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;->access$300(Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v6, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 80
    .line 81
    invoke-static {v6}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;->access$400(Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 86
    .line 87
    invoke-static {p0}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;->access$300(Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 100
    .line 101
    invoke-interface {v6, p0, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    const/4 v7, 0x4

    .line 114
    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 115
    .line 116
    aput-object v2, v7, v4

    .line 117
    .line 118
    aput-object v1, v7, v3

    .line 119
    .line 120
    aput-object p0, v7, v5

    .line 121
    .line 122
    const/4 p0, 0x3

    .line 123
    aput-object v6, v7, p0

    .line 124
    .line 125
    invoke-direct {v0, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 133
    .line 134
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 143
    .line 144
    .line 145
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
