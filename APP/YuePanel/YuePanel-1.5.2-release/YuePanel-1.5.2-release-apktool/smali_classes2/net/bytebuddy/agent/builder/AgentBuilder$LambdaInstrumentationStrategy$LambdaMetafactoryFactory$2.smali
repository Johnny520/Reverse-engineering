.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$2;
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
    .locals 32

    move-object/from16 v6, p1

    const/16 v7, 0x19

    const/4 v8, 0x3

    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x6

    invoke-virtual {v6, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v10, 0x32

    invoke-virtual {v6, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v11, 0xc0

    const-string v12, "java/lang/Integer"

    invoke-virtual {v6, v11, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const-string v4, "()I"

    const/4 v5, 0x0

    const/16 v1, 0xb6

    const-string v2, "java/lang/Integer"

    const-string v3, "intValue"

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v13, 0x36

    const/4 v14, 0x4

    invoke-virtual {v6, v13, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v15, 0x7

    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v5, 0x5

    invoke-virtual {v6, v13, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v4, 0x15

    invoke-virtual {v6, v4, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v3, 0x7e

    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v2, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v1, 0x99

    invoke-virtual {v6, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v4, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v5, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    invoke-virtual {v6, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v11, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const-string v16, "()I"

    const/16 v17, 0x0

    const/16 v18, 0xb6

    const-string v19, "java/lang/Integer"

    const-string v20, "intValue"

    move v11, v0

    move-object/from16 v0, p1

    move v10, v1

    move/from16 v1, v18

    move-object v11, v2

    move-object/from16 v2, v19

    move v10, v3

    move-object/from16 v3, v20

    move v10, v4

    move-object/from16 v4, v16

    move v14, v5

    move/from16 v5, v17

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v6, v13, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v10, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xbd

    const-string v4, "java/lang/Class"

    invoke-virtual {v6, v5, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v3, 0x3a

    invoke-virtual {v6, v3, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v10, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v7, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v10, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v17, "(Ljava/lang/Object;ILjava/lang/Object;II)V"

    const/16 v21, 0x0

    const/16 v1, 0xb8

    const-string v2, "java/lang/System"

    const-string v22, "arraycopy"

    move v7, v3

    move-object/from16 v3, v22

    move-object v7, v4

    move-object/from16 v4, v17

    move v9, v5

    move/from16 v5, v21

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v6, v10, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v10, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v0, 0x60

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v13, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    new-instance v5, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v5}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v4, 0xa7

    invoke-virtual {v6, v4, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    sget-object v11, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    filled-new-array {v11, v11}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v23, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x2

    move-object/from16 v0, p1

    move/from16 v4, v21

    move-object v15, v5

    move-object/from16 v5, v23

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v9, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/4 v0, 0x6

    const/16 v1, 0x3a

    invoke-virtual {v6, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const-string v0, "[Ljava/lang/Class;"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-virtual {v6, v10, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v0, 0x7e

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v7, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v7}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v0, 0x99

    invoke-virtual {v6, v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    const/16 v0, 0x19

    invoke-virtual {v6, v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v10, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v14, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    const/16 v0, 0x32

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v0, 0xc0

    invoke-virtual {v6, v0, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const-string v4, "()I"

    const/4 v5, 0x0

    const/16 v1, 0xb6

    const-string v2, "java/lang/Integer"

    const-string v3, "intValue"

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v12, 0x8

    invoke-virtual {v6, v13, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v10, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v15, "java/lang/invoke/MethodType"

    invoke-virtual {v6, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/4 v0, 0x7

    const/16 v1, 0x3a

    invoke-virtual {v6, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v1, 0x19

    invoke-virtual {v6, v1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v10, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v10, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "(Ljava/lang/Object;ILjava/lang/Object;II)V"

    const/16 v1, 0xb8

    const-string v2, "java/lang/System"

    const-string v3, "arraycopy"

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v5, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v5}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v4, 0xa7

    invoke-virtual {v6, v4, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const/4 v7, 0x0

    const/16 v18, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v13, v4

    move v4, v7

    move-object v7, v5

    move-object/from16 v5, v18

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/4 v0, 0x7

    const/16 v1, 0x3a

    invoke-virtual {v6, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const-string v0, "[Ljava/lang/invoke/MethodType;"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    const/16 v0, 0x19

    invoke-virtual {v6, v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v1, 0x32

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v2, 0xc0

    invoke-virtual {v6, v2, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v3, 0x3a

    invoke-virtual {v6, v3, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v4, 0x4

    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v4, "java/lang/invoke/MethodHandle"

    invoke-virtual {v6, v2, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v7, 0x9

    invoke-virtual {v6, v3, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v2, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {v6, v3, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v0, 0x4

    invoke-virtual {v6, v10, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v1, 0x7e

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v2, 0x99

    invoke-virtual {v6, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v9, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v9}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    invoke-virtual {v6, v13, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    filled-new-array {v15, v4, v15}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x3

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const/4 v4, 0x1

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    const/16 v0, 0xb

    const/16 v1, 0x36

    invoke-virtual {v6, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v0, 0x19

    const/4 v1, 0x6

    invoke-virtual {v6, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "([Ljava/lang/Object;)Ljava/util/List;"

    const/4 v5, 0x0

    const/16 v1, 0xb8

    const-string v2, "java/util/Arrays"

    const-string v3, "asList"

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v0, 0xc

    const/16 v1, 0x3a

    invoke-virtual {v6, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v0, 0x19

    const/4 v1, 0x7

    invoke-virtual {v6, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "([Ljava/lang/Object;)Ljava/util/List;"

    const/16 v1, 0xb8

    const-string v2, "java/util/Arrays"

    const-string v3, "asList"

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v0, 0xd

    const/16 v1, 0x3a

    invoke-virtual {v6, v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v0, 0x19

    invoke-virtual {v6, v0, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x4

    invoke-virtual {v6, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0xa

    invoke-virtual {v6, v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v1, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0xb

    invoke-virtual {v6, v10, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x6

    const/16 v3, 0x36

    invoke-virtual {v6, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0xc

    invoke-virtual {v6, v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x7

    invoke-virtual {v6, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0xd

    invoke-virtual {v6, v0, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v30, "java/util/List"

    const-string v31, "java/util/List"

    const-string v23, "java/lang/invoke/MethodHandles$Lookup"

    const-string v24, "java/lang/String"

    const-string v25, "java/lang/invoke/MethodType"

    const-string v26, "java/lang/invoke/MethodType"

    const-string v27, "java/lang/invoke/MethodHandle"

    const-string v28, "java/lang/invoke/MethodType"

    move-object/from16 v29, v11

    filled-new-array/range {v23 .. v31}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x9

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void
.end method
