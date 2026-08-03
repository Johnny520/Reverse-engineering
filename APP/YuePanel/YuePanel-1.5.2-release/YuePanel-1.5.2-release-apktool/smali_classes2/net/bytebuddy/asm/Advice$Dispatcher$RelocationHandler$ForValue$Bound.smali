.class public Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Bound"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final index:I

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final inverted:Z

.field private final relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

.field final synthetic this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;IZ)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    iput p4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    iput-boolean p5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;I)I
    .locals 3

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    iget v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    if-gez v1, :cond_0

    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-static {p2}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3300(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    move-result p2

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-static {v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3400(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    move-result v1

    invoke-virtual {p1, v1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x19

    invoke-virtual {p1, v1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0xc6

    invoke-virtual {p1, v2, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {p1, v1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-static {p3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3300(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    move-result p3

    iget v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object p2

    invoke-virtual {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-static {p3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3500(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    move-result p3

    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    :goto_0
    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-virtual {p3, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->convertValue(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    iget-boolean p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    if-eqz p3, :cond_1

    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-static {p3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3600(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    move-result p3

    goto :goto_1

    :cond_1
    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-static {p3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3700(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    move-result p3

    :goto_1
    invoke-virtual {p1, p3, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    invoke-interface {p3, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    return p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Cannot skip code execution from constructor: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;

    iget v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v1

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
