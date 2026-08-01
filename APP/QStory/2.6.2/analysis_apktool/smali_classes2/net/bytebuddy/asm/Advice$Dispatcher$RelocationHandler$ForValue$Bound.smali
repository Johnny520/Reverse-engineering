.class public Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    .line 9
    .line 10
    iput p4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 10
    .line 11
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    .line 15
    .line 16
    if-gez v1, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 19
    .line 20
    invoke-static {p2}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3300(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 25
    .line 26
    invoke-static {v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3400(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1, v1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v1, 0x19

    .line 35
    .line 36
    invoke-virtual {p1, v1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xc6

    .line 40
    .line 41
    invoke-virtual {p1, v2, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    .line 46
    .line 47
    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 48
    .line 49
    invoke-static {p3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3300(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    iget v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    .line 54
    .line 55
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    add-int/lit8 p2, p2, 0x1

    .line 68
    .line 69
    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 74
    .line 75
    invoke-static {p3}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3500(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 80
    .line 81
    .line 82
    :goto_0
    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 83
    .line 84
    invoke-virtual {p3, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->convertValue(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 85
    .line 86
    .line 87
    iget-boolean p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    .line 88
    .line 89
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 90
    .line 91
    if-eqz p3, :cond_1

    .line 92
    .line 93
    invoke-static {v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3600(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    invoke-static {v1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->access$3700(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    :goto_1
    invoke-virtual {p1, p3, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    .line 106
    .line 107
    invoke-interface {p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 111
    .line 112
    .line 113
    return p2

    .line 114
    :cond_2
    const-string p1, "Cannot skip code execution from constructor: "

    .line 115
    .line 116
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 117
    .line 118
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    return p0
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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 48
    .line 49
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_7

    .line 67
    .line 68
    return v1

    .line 69
    :cond_7
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->relocation:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->index:I

    .line 27
    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->inverted:Z

    .line 31
    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v2

    .line 41
    return p0
.end method
