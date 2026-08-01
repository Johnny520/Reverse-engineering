.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;
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
    name = "ForExitValue"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final readOnly:Z

.field private final target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/asm/Advice$Exit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue$Factory;->access$2100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

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
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue$Factory;->access$2200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p3, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    const-class v1, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 30
    .line 31
    invoke-interface {p3, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    check-cast p3, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 36
    .line 37
    const-class v1, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 38
    .line 39
    invoke-interface {p3, v1}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    check-cast p3, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 44
    .line 45
    invoke-direct {p0, p1, p2, v0, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 51
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 52
    iput-boolean p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->readOnly:Z

    .line 53
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->readOnly:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->readOnly:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->readOnly:Z

    .line 25
    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 4

    .line 1
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 6
    .line 7
    invoke-interface {p3, p1, p2, p5}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 p5, 0x0

    .line 16
    const-string v0, " to "

    .line 17
    .line 18
    const-string v1, "Cannot assign "

    .line 19
    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    iget-boolean p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->readOnly:Z

    .line 23
    .line 24
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;

    .line 29
    .line 30
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-direct {p0, v2, p2, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 39
    .line 40
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 41
    .line 42
    invoke-interface {p3, v2, p2, v3}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-interface {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 51
    .line 52
    if-eqz p3, :cond_1

    .line 53
    .line 54
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;

    .line 55
    .line 56
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-direct {p0, v2, p3, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 73
    .line 74
    invoke-static {p1, v0, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object p5

    .line 78
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->exitType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForExitValue;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 89
    .line 90
    invoke-static {p1, v0, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object p5
.end method
