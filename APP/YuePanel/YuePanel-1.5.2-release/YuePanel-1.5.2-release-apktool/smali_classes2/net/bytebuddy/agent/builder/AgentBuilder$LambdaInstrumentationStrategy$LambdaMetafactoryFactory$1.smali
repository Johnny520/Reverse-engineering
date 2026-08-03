.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$1;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;III)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;-><init>(Ljava/lang/String;IIILnet/bytebuddy/agent/builder/AgentBuilder$1;)V

    return-void
.end method


# virtual methods
.method public onDispatch(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 8

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v0, 0x36

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v6, "()Ljava/util/List;"

    const/4 v7, 0x0

    const/16 v3, 0xb8

    const-string v4, "java/util/Collections"

    const-string v5, "emptyList"

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 v0, 0x7

    const/16 v1, 0x3a

    invoke-virtual {p1, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v6, "()Ljava/util/List;"

    const-string v4, "java/util/Collections"

    const-string v5, "emptyList"

    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v0, 0x8

    invoke-virtual {p1, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    sget-object v0, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    const-string v1, "java/util/List"

    filled-new-array {v0, v1, v1}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x3

    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void
.end method
