.class final enum Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$3;
.super Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;
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
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/HashCodeMethod$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 6

    .line 1
    const-string v4, "(D)J"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/16 v1, 0xb8

    .line 5
    .line 6
    const-string v2, "java/lang/Double"

    .line 7
    .line 8
    const-string v3, "doubleToLongBits"

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/16 p0, 0x5c

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x10

    .line 20
    .line 21
    const/16 p1, 0x20

    .line 22
    .line 23
    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 24
    .line 25
    .line 26
    const/16 p0, 0x7d

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 29
    .line 30
    .line 31
    const/16 p0, 0x83

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 34
    .line 35
    .line 36
    const/16 p0, 0x88

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 39
    .line 40
    .line 41
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 42
    .line 43
    const/4 p1, -0x1

    .line 44
    const/4 p2, 0x3

    .line 45
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 46
    .line 47
    .line 48
    return-object p0
.end method
