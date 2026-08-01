.class public Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ConditionalReturn"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final jumpCondition:I

.field private final value:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x3

    .line 9
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(II)V

    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->jumpCondition:I

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->value:I

    .line 7
    .line 8
    return-void
.end method

.method public static onIdentity()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 2
    .line 3
    const/16 v1, 0xa6

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static onNonEqualInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 2
    .line 3
    const/16 v1, 0x9f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static onNonIdentity()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 2
    .line 3
    const/16 v1, 0xa5

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static onNonZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 2
    .line 3
    const/16 v1, 0x99

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static onNullValue()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 2
    .line 3
    const/16 v1, 0xc7

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 2
    .line 3
    const/16 v1, 0x9a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->jumpCondition:I

    .line 7
    .line 8
    invoke-virtual {p1, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 9
    .line 10
    .line 11
    iget p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->value:I

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 14
    .line 15
    .line 16
    const/16 p0, 0xac

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-class v0, Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x2

    .line 39
    new-array v1, v1, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    aput-object p2, v1, v2

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    aput-object v0, v1, p2

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 55
    .line 56
    const/4 p1, -0x1

    .line 57
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 58
    .line 59
    .line 60
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
    iget v2, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->jumpCondition:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->jumpCondition:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->value:I

    .line 30
    .line 31
    iget p1, p1, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->value:I

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
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
    iget v1, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->jumpCondition:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->value:I

    .line 17
    .line 18
    add-int/2addr v0, p0

    .line 19
    return v0
.end method

.method public returningTrue()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 2
    .line 3
    iget p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->jumpCondition:I

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;-><init>(II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
