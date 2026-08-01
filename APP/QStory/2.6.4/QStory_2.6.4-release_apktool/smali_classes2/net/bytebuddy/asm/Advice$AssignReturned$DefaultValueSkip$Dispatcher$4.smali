.class final enum Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$4;
.super Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    const/16 p0, 0x18

    .line 2
    .line 3
    invoke-virtual {p1, p0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 4
    .line 5
    .line 6
    const/16 p0, 0xe

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x97

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 14
    .line 15
    .line 16
    const/16 p0, 0x99

    .line 17
    .line 18
    invoke-virtual {p1, p0, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    const/4 p2, 0x4

    .line 25
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method
