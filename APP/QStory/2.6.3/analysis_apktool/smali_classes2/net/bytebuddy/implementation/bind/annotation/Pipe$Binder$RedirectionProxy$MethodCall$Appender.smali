.class Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;
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

.field final synthetic this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bind/annotation/Pipe$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;-><init>(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 11

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-array v1, v1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x2

    .line 24
    const/4 v6, 0x1

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lnet/bytebuddy/description/field/FieldDescription;

    .line 32
    .line 33
    add-int/lit8 v7, v3, 0x1

    .line 34
    .line 35
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 36
    .line 37
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-static {v4}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-interface {v4}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-array v5, v5, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 50
    .line 51
    aput-object v9, v5, v2

    .line 52
    .line 53
    aput-object v4, v5, v6

    .line 54
    .line 55
    invoke-direct {v8, v5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 56
    .line 57
    .line 58
    aput-object v8, v1, v3

    .line 59
    .line 60
    move v3, v7

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 63
    .line 64
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 65
    .line 66
    invoke-virtual {v3, v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v4, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 71
    .line 72
    invoke-static {v4}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$500(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const-class v7, Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    iget-object v8, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 83
    .line 84
    invoke-static {v8}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$400(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-interface {v8}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    sget-object v9, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 97
    .line 98
    invoke-interface {v4, v7, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 103
    .line 104
    invoke-direct {v7, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 108
    .line 109
    invoke-static {v1}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$400(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v8, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 118
    .line 119
    invoke-static {v8}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$500(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 124
    .line 125
    invoke-static {p0}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$400(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    invoke-interface {v8, p0, v10, v9}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    const/4 v8, 0x6

    .line 142
    new-array v8, v8, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 143
    .line 144
    aput-object v3, v8, v2

    .line 145
    .line 146
    aput-object v4, v8, v6

    .line 147
    .line 148
    aput-object v7, v8, v5

    .line 149
    .line 150
    const/4 v2, 0x3

    .line 151
    aput-object v1, v8, v2

    .line 152
    .line 153
    const/4 v1, 0x4

    .line 154
    aput-object p0, v8, v1

    .line 155
    .line 156
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 157
    .line 158
    const/4 v1, 0x5

    .line 159
    aput-object p0, v8, v1

    .line 160
    .line 161
    invoke-direct {v0, v8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 169
    .line 170
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 179
    .line 180
    .line 181
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
