.class public Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SingleBytePush"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final value:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;->value:B

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    const/16 p2, 0x10

    .line 2
    .line 3
    iget-byte p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;->value:B

    .line 4
    .line 5
    invoke-virtual {p1, p2, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->access$000()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
    iget-byte p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;->value:B

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;

    .line 23
    .line 24
    iget-byte p1, p1, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;->value:B

    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    iget-byte p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;->value:B

    .line 12
    .line 13
    add-int/2addr v0, p0

    .line 14
    return v0
.end method
