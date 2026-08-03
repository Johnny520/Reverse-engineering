.class public abstract Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/AccessControllerPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Initializer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithoutProperty;,
        Lnet/bytebuddy/build/AccessControllerPlugin$Initializer$WithProperty;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iput-object p2, p0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 16

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

    const-class v12, Ljava/lang/ClassNotFoundException;

    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v1, v8, v9, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTryCatchBlock(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Ljava/lang/String;)V

    const-class v13, Ljava/lang/SecurityException;

    invoke-static {v13}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v1, v8, v10, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTryCatchBlock(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const-string v1, "java.security.AccessController"

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/4 v14, 0x3

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-class v1, Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v4

    const-class v5, Ljava/lang/ClassLoader;

    invoke-static {v5}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v5

    filled-new-array {v2, v4, v5}, [Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0xb8

    const-string v4, "forName"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v1, 0x57

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual/range {p0 .. p1}, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->onAccessController(Lnet/bytebuddy/jar/asm/MethodVisitor;)I

    move-result v2

    iget-object v3, v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->name:Ljava/lang/String;

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0xb3

    invoke-virtual {v7, v6, v3, v4, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const/16 v3, 0xa7

    invoke-virtual {v7, v3, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v4

    invoke-static {v12}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v4, v7, v5, v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same1(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/List;)V

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    iget-object v4, v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v4}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->name:Ljava/lang/String;

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v6, v4, v5, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v3, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v3

    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v7, v4, v5}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same1(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/List;)V

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v1, 0x4

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    iget-object v1, v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->name:Ljava/lang/String;

    invoke-static {v15}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v6, v1, v3, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v7, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v3, 0x0

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
    iget-object v2, p0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->name:Ljava/lang/String;

    check-cast p1, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;

    iget-object v3, p1, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object p1, p1, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

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

    iget-object v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$Initializer;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public abstract onAccessController(Lnet/bytebuddy/jar/asm/MethodVisitor;)I
.end method
