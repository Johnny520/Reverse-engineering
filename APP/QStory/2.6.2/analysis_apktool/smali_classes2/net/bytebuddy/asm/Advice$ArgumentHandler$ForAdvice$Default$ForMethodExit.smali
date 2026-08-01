.class public Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;
.super Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForMethodExit"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final enterType:Lnet/bytebuddy/description/type/TypeDefinition;

.field private final throwableSize:Lnet/bytebuddy/implementation/bytecode/StackSize;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/SortedMap;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/implementation/bytecode/StackSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Ljava/util/SortedMap<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/SortedMap;)V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->enterType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 5
    .line 6
    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->throwableSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->throwableSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->throwableSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->enterType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->enterType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    .locals 2

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->enterType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->throwableSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public mapped(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->exitType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->namedTypes:Ljava/util/SortedMap;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v0

    .line 24
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->enterType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 25
    .line 26
    invoke-static {v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 31
    .line 32
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v1, v0

    .line 45
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->throwableSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 46
    .line 47
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int/2addr v0, v1

    .line 52
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 53
    .line 54
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    sub-int/2addr v0, p0

    .line 63
    add-int/2addr v0, p1

    .line 64
    return v0
.end method

.method public returned()I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->exitType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->namedTypes:Ljava/util/SortedMap;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v0

    .line 24
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->enterType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 25
    .line 26
    invoke-static {p0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public thrown()I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->exitType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->namedTypes:Ljava/util/SortedMap;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v0

    .line 24
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;->enterType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 25
    .line 26
    invoke-static {v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 31
    .line 32
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v0

    .line 45
    return p0
.end method
