.class public Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;
.super Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private prependLineNumber:Z

.field private final startOfMethod:Lnet/bytebuddy/jar/asm/Label;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;->startOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;->prependLineNumber:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public onAfterExceptionTable()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;->startOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitLineNumber(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;->prependLineNumber:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;->startOfMethod:Lnet/bytebuddy/jar/asm/Label;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/LineNumberPrependingMethodVisitor;->prependLineNumber:Z

    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLineNumber(ILnet/bytebuddy/jar/asm/Label;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
