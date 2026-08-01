.class public Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForMethodCall"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall$Factory;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall$ArgumentProvider;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final appender:Lnet/bytebuddy/implementation/MethodCall$Appender;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

.field private final targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/MethodCall$Appender;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->appender:Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;

    .line 11
    .line 12
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->appender:Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->appender:Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lnet/bytebuddy/implementation/MethodCall$Appender;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->appender:Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 13
    .line 14
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/MethodCall$Appender;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/2addr p0, v0

    .line 39
    return p0
.end method

.method public toStackManipulation(Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->appender:Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3, v4}, Lnet/bytebuddy/implementation/MethodCall$Appender;->toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 16
    .line 17
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v3}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-interface {v3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :goto_0
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {p2, v2, v3, p3}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const/4 p3, 0x2

    .line 47
    new-array p3, p3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    aput-object v1, p3, v2

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    aput-object p2, p3, v1

    .line 54
    .line 55
    invoke-direct {v0, p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 66
    .line 67
    const-string p2, " to "

    .line 68
    .line 69
    const-string p3, "Cannot assign return type of "

    .line 70
    .line 71
    invoke-static {p3, p0, p2, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method
