.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForThisReference"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final optional:Z

.field private final readOnly:Z

.field private final target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/asm/Advice$This;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;->access$500()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

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
    move-result v0

    .line 21
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;->access$600()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {p2, v2}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-class v3, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 30
    .line 31
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 36
    .line 37
    const-class v3, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 38
    .line 39
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 44
    .line 45
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference$Factory;->access$700()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {p2, v3}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p2, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-direct {p0, p1, v0, v2, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Z)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Z)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 69
    iput-boolean p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->readOnly:Z

    .line 70
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 71
    iput-boolean p4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->optional:Z

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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->readOnly:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->readOnly:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->optional:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->optional:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 48
    .line 49
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->readOnly:Z

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->optional:Z

    .line 31
    .line 32
    add-int/2addr v2, p0

    .line 33
    return v2
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 6

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p5, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->isPremature(Lnet/bytebuddy/description/method/MethodDescription;)Z

    .line 9
    .line 10
    .line 11
    move-result p5

    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 22
    .line 23
    invoke-interface {p3, p2, p5, v0}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    const-string v0, " to "

    .line 32
    .line 33
    const-string v2, "Cannot assign "

    .line 34
    .line 35
    if-eqz p5, :cond_3

    .line 36
    .line 37
    iget-boolean p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->readOnly:Z

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz p5, :cond_1

    .line 41
    .line 42
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;

    .line 43
    .line 44
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p4, v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    invoke-direct {p0, p1, p3, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 57
    .line 58
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 63
    .line 64
    invoke-interface {p3, p5, v4, v5}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-interface {p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 69
    .line 70
    .line 71
    move-result p5

    .line 72
    if-eqz p5, :cond_2

    .line 73
    .line 74
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;

    .line 75
    .line 76
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p4, v3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    invoke-direct {p0, p1, p4, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 89
    .line 90
    invoke-static {v2, p0, v0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 103
    .line 104
    invoke-static {p2, v0, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_4
    :goto_0
    iget-boolean p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->optional:Z

    .line 109
    .line 110
    if-eqz p3, :cond_6

    .line 111
    .line 112
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForThisReference;->readOnly:Z

    .line 113
    .line 114
    if-eqz p0, :cond_5

    .line 115
    .line 116
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadOnly;

    .line 117
    .line 118
    invoke-direct {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_5
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadWrite;

    .line 123
    .line 124
    invoke-direct {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 125
    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_6
    const-string p0, "Cannot map this reference for static method or constructor start: "

    .line 129
    .line 130
    invoke-static {p0, p2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v1
.end method
