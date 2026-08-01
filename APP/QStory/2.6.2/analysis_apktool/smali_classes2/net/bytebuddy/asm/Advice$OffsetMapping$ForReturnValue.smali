.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForReturnValue"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final readOnly:Z

.field private final target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/asm/Advice$Return;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue$Factory;->access$2300()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

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
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue$Factory;->access$2400()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p2, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const-class v1, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 30
    .line 31
    invoke-interface {p2, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 36
    .line 37
    const-class v1, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 38
    .line 39
    invoke-interface {p2, v1}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 44
    .line 45
    invoke-direct {p0, p1, v0, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 51
    iput-boolean p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->readOnly:Z

    .line 52
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->readOnly:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->readOnly:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->readOnly:Z

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 6

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 8
    .line 9
    invoke-interface {p3, p1, p5, v0}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 14
    .line 15
    .line 16
    move-result p5

    .line 17
    const/4 v0, 0x0

    .line 18
    const-string v1, " to "

    .line 19
    .line 20
    const-string v2, "Cannot assign "

    .line 21
    .line 22
    if-eqz p5, :cond_4

    .line 23
    .line 24
    iget-boolean p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->readOnly:Z

    .line 25
    .line 26
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    if-eqz p5, :cond_1

    .line 29
    .line 30
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-interface {p3, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-eqz p3, :cond_0

    .line 39
    .line 40
    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadOnly;

    .line 41
    .line 42
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;

    .line 49
    .line 50
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->returned()I

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    invoke-direct {p0, p2, p3, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 63
    .line 64
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 69
    .line 70
    invoke-interface {p3, p5, v4, v5}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-interface {p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 75
    .line 76
    .line 77
    move-result p5

    .line 78
    if-eqz p5, :cond_3

    .line 79
    .line 80
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 81
    .line 82
    .line 83
    move-result-object p5

    .line 84
    invoke-interface {p5, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 85
    .line 86
    .line 87
    move-result p5

    .line 88
    if-eqz p5, :cond_2

    .line 89
    .line 90
    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadWrite;

    .line 91
    .line 92
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 93
    .line 94
    invoke-direct {p1, p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_2
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;

    .line 99
    .line 100
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->returned()I

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    invoke-direct {p0, p2, p4, p1, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 118
    .line 119
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p1, v1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForReturnValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 143
    .line 144
    invoke-static {p1, v1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-object v0
.end method
