.class public Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

.field private final initialized:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field final synthetic this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Object;Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;)V
    .locals 0
    .param p2    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "TT;",
            "Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->initialized:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 7

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    .line 2
    .line 3
    invoke-interface {v0, p3}, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, " from "

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p3}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "Cannot set instance field "

    .line 24
    .line 25
    invoke-static {p0, v0, v3, p3}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable;->isFinal()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const-string p0, "Cannot set final field "

    .line 43
    .line 44
    invoke-static {p0, v0, v3, p3}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_3
    :goto_1
    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;

    .line 49
    .line 50
    iget-object v3, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->initialized:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v4, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 53
    .line 54
    invoke-virtual {v1, v3, v0, v4, p3}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;->resolve(Ljava/lang/Object;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 65
    .line 66
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 67
    .line 68
    invoke-interface {p3}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    :goto_2
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object p0, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;

    .line 90
    .line 91
    invoke-static {p0}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;->access$200(Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;)Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0, p3}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const/4 v5, 0x4

    .line 100
    new-array v5, v5, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    aput-object v4, v5, v6

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    aput-object v1, v5, v4

    .line 107
    .line 108
    const/4 v1, 0x2

    .line 109
    aput-object v0, v5, v1

    .line 110
    .line 111
    const/4 v0, 0x3

    .line 112
    aput-object p0, v5, v0

    .line 113
    .line 114
    invoke-direct {v3, v5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-direct {v2, p0, p1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 130
    .line 131
    .line 132
    return-object v2

    .line 133
    :cond_5
    const-string p0, "Set value cannot be assigned to "

    .line 134
    .line 135
    invoke-static {v0, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v2
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->initialized:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->initialized:Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_6

    .line 46
    .line 47
    return v1

    .line 48
    :cond_4
    if-eqz v2, :cond_6

    .line 49
    .line 50
    :cond_5
    return v1

    .line 51
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_7

    .line 60
    .line 61
    return v1

    .line 62
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_8

    .line 71
    .line 72
    return v1

    .line 73
    :cond_8
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->initialized:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v0, v2

    .line 27
    :cond_0
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object p0, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$Appender;->this$0:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;

    .line 37
    .line 38
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v2

    .line 43
    return p0
.end method
