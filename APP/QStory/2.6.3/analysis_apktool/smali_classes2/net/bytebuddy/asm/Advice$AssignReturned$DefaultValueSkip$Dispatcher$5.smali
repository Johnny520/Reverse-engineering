.class final enum Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$5;
.super Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;ILnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    const/16 p0, 0x19

    .line 2
    .line 3
    invoke-virtual {p1, p0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 4
    .line 5
    .line 6
    const/16 p0, 0xc6

    .line 7
    .line 8
    invoke-virtual {p1, p0, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 p2, 0x2

    .line 15
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method
