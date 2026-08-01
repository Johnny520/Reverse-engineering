.class final enum Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer$4;
.super Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;
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
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/ToStringMethod$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 6

    .line 1
    const-string v4, "(J)Ljava/lang/StringBuilder;"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/16 v1, 0xb6

    .line 5
    .line 6
    const-string v2, "java/lang/StringBuilder"

    .line 7
    .line 8
    const-string v3, "append"

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 15
    .line 16
    const/4 p1, -0x1

    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method
