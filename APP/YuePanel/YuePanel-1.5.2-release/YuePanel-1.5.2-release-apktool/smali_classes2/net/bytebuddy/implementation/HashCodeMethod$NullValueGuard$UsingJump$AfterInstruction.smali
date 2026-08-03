.class public Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AfterInstruction"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction;->this$0:Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;

    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 5

    iget-object v0, p0, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction;->this$0:Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;

    invoke-static {v0}, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;->access$300(Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/jar/asm/Label;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/bytebuddy/description/type/TypeDescription;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 p2, 0x1

    aput-object v2, v3, p2

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same1(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/List;)V

    sget-object p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction;->this$0:Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;

    check-cast p1, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction;

    iget-object p1, p1, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction;->this$0:Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;

    invoke-virtual {v2, p1}, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction;->this$0:Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
