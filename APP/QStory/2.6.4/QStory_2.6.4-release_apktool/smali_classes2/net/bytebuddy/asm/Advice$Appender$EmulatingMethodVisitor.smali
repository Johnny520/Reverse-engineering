.class public Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Appender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EmulatingMethodVisitor"
.end annotation


# instance fields
.field private final delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

.field private localVariableLength:I

.field private stackSize:I


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;->delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;->delegate:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->getOperandStackSize()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;->getLocalVariableSize()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 25
    .line 26
    iget p2, p0, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;->stackSize:I

    .line 27
    .line 28
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;->localVariableLength:I

    .line 29
    .line 30
    invoke-direct {p1, p2, p0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public visitCode()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public visitMaxs(II)V
    .locals 0

    .line 1
    iput p1, p0, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;->stackSize:I

    .line 2
    .line 3
    iput p2, p0, Lnet/bytebuddy/asm/Advice$Appender$EmulatingMethodVisitor;->localVariableLength:I

    .line 4
    .line 5
    return-void
.end method
