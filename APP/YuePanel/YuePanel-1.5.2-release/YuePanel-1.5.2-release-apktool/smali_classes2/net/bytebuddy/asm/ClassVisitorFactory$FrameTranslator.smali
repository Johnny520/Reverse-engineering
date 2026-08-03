.class public Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/ClassVisitorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FrameTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "frames"


# instance fields
.field private final sourceLabel:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final targetLabel:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    new-instance v8, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v8}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    new-instance v9, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v9}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    new-instance v10, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v10}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    new-instance v11, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v11}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v12, 0x19

    const/4 v13, 0x1

    invoke-virtual {v7, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0xc7

    invoke-virtual {v7, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v14, 0xb0

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v3

    invoke-static {v2, v3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    invoke-virtual {v7, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v1, 0xbe

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-class v15, Ljava/lang/Object;

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xbd

    invoke-virtual {v7, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v2, 0x3a

    const/4 v6, 0x2

    invoke-virtual {v7, v2, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v5, 0x3

    invoke-virtual {v7, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v2, 0x36

    invoke-virtual {v7, v2, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v2

    const-class v16, [Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    sget-object v17, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    new-array v14, v6, [Lnet/bytebuddy/description/type/TypeDescription;

    const/4 v6, 0x0

    aput-object v3, v14, v6

    aput-object v4, v14, v13

    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v14

    invoke-interface {v14}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v14

    invoke-static {v4, v14}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v7, v3, v4}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->append(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    const/16 v14, 0x15

    invoke-virtual {v7, v14, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v1, 0xa2

    invoke-virtual {v7, v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    const/4 v4, 0x2

    invoke-virtual {v7, v12, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v14, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v14, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x32

    invoke-virtual {v7, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc1

    invoke-virtual {v7, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v1, 0x99

    invoke-virtual {v7, v1, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v12, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v14, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc0

    invoke-virtual {v7, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v18

    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    filled-new-array {v2}, [Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v2, 0xb7

    const-string v21, "label"

    move-object/from16 v1, p1

    move-object/from16 v3, v18

    move/from16 v18, v4

    move-object/from16 v4, v21

    move-object/from16 v5, v19

    move/from16 v14, v18

    move/from16 v18, v6

    move/from16 v6, v20

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v1, 0xa7

    invoke-virtual {v7, v1, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v2

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    new-array v5, v14, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v3, v5, v18

    aput-object v4, v5, v13

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v5

    invoke-interface {v5}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    new-array v1, v14, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v6, v1, v18

    aput-object v11, v1, v13

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v4, v5, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v7, v3, v1}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->full(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v7, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v1, 0x3

    const/16 v2, 0x15

    invoke-virtual {v7, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0x32

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v2

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {v15}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    new-array v6, v1, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v3, v6, v18

    aput-object v4, v6, v13

    aput-object v5, v6, v14

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v5

    invoke-interface {v5}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    new-array v11, v14, [Lnet/bytebuddy/description/type/TypeDescription;

    aput-object v6, v11, v18

    aput-object v9, v11, v13

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v7, v3, v4}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->full(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    const/16 v2, 0x53

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    const/16 v1, 0xa7

    invoke-virtual {v7, v1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    move-result-object v3

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v7, v13, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->chop(Lnet/bytebuddy/jar/asm/MethodVisitor;ILjava/util/List;)V

    invoke-virtual {v7, v12, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v1, 0xb0

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    const/4 v2, 0x5

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
