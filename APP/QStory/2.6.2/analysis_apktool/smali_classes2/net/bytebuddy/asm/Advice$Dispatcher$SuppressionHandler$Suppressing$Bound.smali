.class public Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Bound"
.end annotation


# instance fields
.field private final endOfMethod:Lnet/bytebuddy/jar/asm/Label;

.field private final exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final startOfMethod:Lnet/bytebuddy/jar/asm/Label;

.field private final suppressedType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->suppressedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 7
    .line 8
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 9
    .line 10
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->startOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 14
    .line 15
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 16
    .line 17
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->endOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public onEnd(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDefinition;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->endOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p4, p1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectExceptionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->exceptionHandler:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 p2, 0x1

    .line 20
    add-int/2addr p0, p2

    .line 21
    invoke-interface {p3, p0}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler;->requireStackSize(I)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_5

    .line 31
    .line 32
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_5

    .line 39
    .line 40
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_5

    .line 47
    .line 48
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_1

    .line 72
    .line 73
    const/16 p0, 0x9

    .line 74
    .line 75
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_2

    .line 86
    .line 87
    const/16 p0, 0xb

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_3

    .line 100
    .line 101
    const/16 p0, 0xe

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    invoke-interface {p5, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-nez p0, :cond_4

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 116
    .line 117
    .line 118
    :cond_4
    return-void

    .line 119
    :cond_5
    :goto_0
    const/4 p0, 0x3

    .line 120
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public onEndWithSkip(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDefinition;)V
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xa7

    .line 7
    .line 8
    invoke-virtual {p1, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->onEnd(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p4, p1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;->injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onPrepare(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->startOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->endOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->suppressedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1, v0, v1, v1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTryCatchBlock(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onStart(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing$Bound;->startOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
