.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$1;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;-><init>(Ljava/lang/String;IIILnet/bytebuddy/agent/builder/AgentBuilder$1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onDispatch(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 13

    .line 1
    const/4 p0, 0x3

    .line 2
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 3
    .line 4
    .line 5
    const/16 p0, 0x36

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    invoke-virtual {p1, p0, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 9
    .line 10
    .line 11
    const-string v5, "()Ljava/util/List;"

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/16 v2, 0xb8

    .line 15
    .line 16
    const-string v3, "java/util/Collections"

    .line 17
    .line 18
    const-string v4, "emptyList"

    .line 19
    .line 20
    move-object v1, p1

    .line 21
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    move-object v7, v1

    .line 25
    const/4 p0, 0x7

    .line 26
    const/16 p1, 0x3a

    .line 27
    .line 28
    invoke-virtual {v7, p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 29
    .line 30
    .line 31
    const-string v11, "()Ljava/util/List;"

    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    const/16 v8, 0xb8

    .line 35
    .line 36
    const-string v9, "java/util/Collections"

    .line 37
    .line 38
    const-string v10, "emptyList"

    .line 39
    .line 40
    invoke-virtual/range {v7 .. v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const/16 p0, 0x8

    .line 44
    .line 45
    invoke-virtual {v7, p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    .line 49
    .line 50
    const-string p1, "java/util/List"

    .line 51
    .line 52
    filled-new-array {p0, p1, p1}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v8, 0x1

    .line 59
    const/4 v9, 0x3

    .line 60
    invoke-virtual/range {v7 .. v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
