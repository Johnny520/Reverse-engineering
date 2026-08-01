.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForAllArguments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final includeSelf:Z

.field private final nullIfEmpty:Z

.field private final readOnly:Z

.field private final target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/asm/Advice$AllArguments;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;->access$800()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;->access$900()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-class v2, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 30
    .line 31
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 36
    .line 37
    const-class v2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 38
    .line 39
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v5, v0

    .line 44
    check-cast v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 45
    .line 46
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;->access$1000()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments$Factory;->access$1100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p2, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    check-cast p2, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    move-object v2, p0

    .line 83
    move-object v3, p1

    .line 84
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;ZZ)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;ZZ)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 90
    iput-boolean p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->readOnly:Z

    .line 91
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 92
    iput-boolean p4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 93
    iput-boolean p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    return-void
.end method


# virtual methods
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->readOnly:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->readOnly:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    .line 37
    .line 38
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    .line 39
    .line 40
    if-eq v2, v3, :cond_5

    .line 41
    .line 42
    return v1

    .line 43
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 44
    .line 45
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_6

    .line 52
    .line 53
    return v1

    .line 54
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 55
    .line 56
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_7

    .line 63
    .line 64
    return v1

    .line 65
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->readOnly:Z

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 31
    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    .line 35
    .line 36
    add-int/2addr v2, p0

    .line 37
    return v2
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 10

    .line 1
    iget-boolean p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-boolean p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    :cond_0
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->readOnly:Z

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;

    .line 30
    .line 31
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation$Writable;

    .line 38
    .line 39
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 40
    .line 41
    sget-object p2, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 42
    .line 43
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation$Writable;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    const/4 v2, 0x0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    move v0, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    move v0, v2

    .line 64
    :goto_0
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    add-int/2addr v3, v0

    .line 73
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 77
    .line 78
    const/4 v3, 0x2

    .line 79
    const/4 v4, 0x0

    .line 80
    const-string v5, " to "

    .line 81
    .line 82
    const-string v6, "Cannot assign "

    .line 83
    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_7

    .line 91
    .line 92
    invoke-virtual {p5, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->isPremature(Lnet/bytebuddy/description/method/MethodDescription;)Z

    .line 93
    .line 94
    .line 95
    move-result p5

    .line 96
    if-eqz p5, :cond_5

    .line 97
    .line 98
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 99
    .line 100
    .line 101
    move-result p5

    .line 102
    if-nez p5, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const-string p0, "Cannot include self in all arguments array from "

    .line 106
    .line 107
    invoke-static {p0, p2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v4

    .line 115
    :cond_5
    :goto_1
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 116
    .line 117
    .line 118
    move-result-object p5

    .line 119
    invoke-interface {p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 120
    .line 121
    .line 122
    move-result-object p5

    .line 123
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 124
    .line 125
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 126
    .line 127
    invoke-interface {p3, p5, v0, v7}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 128
    .line 129
    .line 130
    move-result-object p5

    .line 131
    invoke-interface {p5}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 138
    .line 139
    sget-object v7, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 140
    .line 141
    invoke-interface {p4, v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    invoke-virtual {v7, v8}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    new-array v8, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 150
    .line 151
    aput-object v7, v8, v2

    .line 152
    .line 153
    aput-object p5, v8, v1

    .line 154
    .line 155
    invoke-direct {v0, v8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 175
    .line 176
    invoke-static {p1, v5, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object v4

    .line 180
    :cond_7
    :goto_2
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 181
    .line 182
    .line 183
    move-result-object p5

    .line 184
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object p5

    .line 188
    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_9

    .line 193
    .line 194
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 199
    .line 200
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    iget-object v8, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 205
    .line 206
    iget-object v9, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 207
    .line 208
    invoke-interface {p3, v7, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    invoke-interface {v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_8

    .line 217
    .line 218
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 219
    .line 220
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-interface {p4, v0}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    invoke-virtual {v9, v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-array v9, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 241
    .line 242
    aput-object v0, v9, v2

    .line 243
    .line 244
    aput-object v7, v9, v1

    .line 245
    .line 246
    invoke-direct {v8, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 262
    .line 263
    invoke-static {p1, v5, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-object v4

    .line 267
    :cond_9
    iget-boolean p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->readOnly:Z

    .line 268
    .line 269
    if-eqz p5, :cond_a

    .line 270
    .line 271
    new-instance p2, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForArray$ReadOnly;

    .line 272
    .line 273
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 274
    .line 275
    invoke-direct {p2, p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForArray$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 276
    .line 277
    .line 278
    return-object p2

    .line 279
    :cond_a
    new-instance p5, Ljava/util/ArrayList;

    .line 280
    .line 281
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 282
    .line 283
    if-eqz v0, :cond_b

    .line 284
    .line 285
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_b

    .line 290
    .line 291
    move v0, v1

    .line 292
    goto :goto_4

    .line 293
    :cond_b
    move v0, v2

    .line 294
    :goto_4
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 299
    .line 300
    .line 301
    move-result v7

    .line 302
    add-int/2addr v7, v0

    .line 303
    mul-int/2addr v7, v3

    .line 304
    invoke-direct {p5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 305
    .line 306
    .line 307
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->includeSelf:Z

    .line 308
    .line 309
    if-eqz v0, :cond_d

    .line 310
    .line 311
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-nez v0, :cond_d

    .line 316
    .line 317
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 318
    .line 319
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    iget-object v8, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 328
    .line 329
    invoke-interface {p3, v0, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-eqz v7, :cond_c

    .line 338
    .line 339
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 340
    .line 341
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 342
    .line 343
    invoke-interface {p4, v2}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 344
    .line 345
    .line 346
    move-result v9

    .line 347
    invoke-virtual {v8, v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    new-array v9, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 352
    .line 353
    aput-object v0, v9, v2

    .line 354
    .line 355
    aput-object v8, v9, v1

    .line 356
    .line 357
    invoke-direct {v7, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 370
    .line 371
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-static {p1, v5, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    return-object v4

    .line 382
    :cond_d
    :goto_5
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object p2

    .line 390
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_f

    .line 395
    .line 396
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 401
    .line 402
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 403
    .line 404
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    iget-object v9, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 409
    .line 410
    invoke-interface {p3, v7, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    invoke-interface {v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 415
    .line 416
    .line 417
    move-result v8

    .line 418
    if-eqz v8, :cond_e

    .line 419
    .line 420
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 421
    .line 422
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    invoke-interface {p4, v0}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    invoke-virtual {v9, v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    new-array v9, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 443
    .line 444
    aput-object v7, v9, v2

    .line 445
    .line 446
    aput-object v0, v9, v1

    .line 447
    .line 448
    invoke-direct {v8, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {p5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_6

    .line 455
    :cond_e
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 456
    .line 457
    invoke-static {v6, p0, v5, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    return-object v4

    .line 461
    :cond_f
    new-instance p2, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForArray$ReadWrite;

    .line 462
    .line 463
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForAllArguments;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 464
    .line 465
    invoke-direct {p2, p0, p1, p5}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForArray$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;)V

    .line 466
    .line 467
    .line 468
    return-object p2
.end method
