.class public abstract Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$MethodSizeHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;,
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$WithCopiedArguments;,
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$WithRetainedArguments;
    }
.end annotation


# instance fields
.field protected final initialTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field protected localVariableLength:I

.field protected final postMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final preMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected stackSize:I


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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->initialTypes:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->preMethodTypes:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->postMethodTypes:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZI)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;
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
            ">;ZI)",
            "Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;"
        }
    .end annotation

    .line 1
    and-int/lit8 p5, p5, 0x3

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-eqz p4, :cond_1

    .line 9
    .line 10
    new-instance p4, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$WithCopiedArguments;

    .line 11
    .line 12
    invoke-direct {p4, p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$WithCopiedArguments;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object p4

    .line 16
    :cond_1
    new-instance p4, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$WithRetainedArguments;

    .line 17
    .line 18
    invoke-direct {p4, p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$WithRetainedArguments;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-object p4
.end method


# virtual methods
.method public bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->initialTypes:Ljava/util/List;

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
    invoke-direct {v0, p0, p1, v2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;-><init>(Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;I)V

    .line 17
    .line 18
    .line 19
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

.method public compoundStackSize(I)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->stackSize:I

    .line 2
    .line 3
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public requireLocalVariableLength(I)V
    .locals 1

    .line 1
    iget v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->localVariableLength:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->localVariableLength:I

    .line 8
    .line 9
    return-void
.end method

.method public requireStackSize(I)V
    .locals 1

    .line 1
    iget v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->stackSize:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->stackSize:I

    .line 8
    .line 9
    return-void
.end method
