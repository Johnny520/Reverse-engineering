.class public Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$WithRetainedArguments;
.super Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithRetainedArguments"
.end annotation


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 4
    .line 5
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->postMethodTypes:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v2, v1

    .line 16
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->initialTypes:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v2

    .line 23
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->preMethodTypes:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, v1

    .line 30
    invoke-direct {v0, p0, p1, v2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;-><init>(Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;I)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public compoundLocalVariableLength(I)I
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->localVariableLength:I

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->postMethodTypes:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, p1

    .line 10
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->initialTypes:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    add-int/2addr p1, v1

    .line 17
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->preMethodTypes:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/2addr p0, p1

    .line 24
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method
