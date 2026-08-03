.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "UsingMethodHandleLookup"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
    .locals 1

    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;

    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 28

    move-object/from16 v6, p1

    const/16 v7, 0x19

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x4

    invoke-virtual {v6, v7, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandleInfo;"

    const/4 v5, 0x0

    const/16 v1, 0xb6

    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    const-string v3, "revealDirect"

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v10, 0x3a

    const/16 v11, 0xa

    invoke-virtual {v6, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "()I"

    const/4 v5, 0x1

    const/16 v1, 0xb9

    const-string v2, "java/lang/invoke/MethodHandleInfo"

    const-string v3, "getModifiers"

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "(I)Z"

    const/4 v5, 0x0

    const/16 v1, 0xb8

    const-string v2, "java/lang/reflect/Modifier"

    const-string v3, "isProtected"

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v12, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v12}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v13, 0x99

    invoke-virtual {v6, v13, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "()Ljava/lang/Class;"

    const/16 v1, 0xb6

    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    const-string v3, "lookupClass"

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v6, v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "()Ljava/lang/Class;"

    const/4 v5, 0x1

    const/16 v1, 0xb9

    const-string v2, "java/lang/invoke/MethodHandleInfo"

    const-string v3, "getDeclaringClass"

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "(Ljava/lang/Class;Ljava/lang/Class;)Z"

    const/4 v5, 0x0

    const/16 v1, 0xb8

    const-string v2, "sun/invoke/util/VerifyAccess"

    const-string v3, "isSamePackage"

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v14, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v14}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    invoke-virtual {v6, v13, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    sget-object v12, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    const-string v24, "[B"

    const-string v25, "java/lang/invoke/MethodHandleInfo"

    const-string v15, "java/lang/invoke/MethodHandles$Lookup"

    const-string v16, "java/lang/String"

    const-string v17, "java/lang/invoke/MethodType"

    const-string v18, "java/lang/invoke/MethodType"

    const-string v19, "java/lang/invoke/MethodHandle"

    const-string v20, "java/lang/invoke/MethodType"

    const-string v22, "java/util/List"

    const-string v23, "java/util/List"

    move-object/from16 v21, v12

    filled-new-array/range {v15 .. v25}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v8, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/16 v2, 0xb

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "()I"

    const/4 v5, 0x1

    const/16 v1, 0xb9

    const-string v2, "java/lang/invoke/MethodHandleInfo"

    const-string v3, "getReferenceKind"

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v0, 0x10

    const/4 v1, 0x7

    invoke-virtual {v6, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    new-instance v15, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v15}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v0, 0xa0

    invoke-virtual {v6, v0, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v14, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v14}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v5, 0xa7

    invoke-virtual {v6, v5, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const/4 v15, 0x0

    move-object v5, v15

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    const/4 v15, 0x3

    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const/4 v4, 0x1

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v1, 0x4

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    const/16 v0, 0x36

    const/16 v1, 0xb

    invoke-virtual {v6, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v0, 0x15

    invoke-virtual {v6, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    new-instance v14, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v14}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    invoke-virtual {v6, v13, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v13, 0x9

    invoke-virtual {v6, v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v5, 0x5

    invoke-virtual {v6, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v4, 0xbd

    const-string v3, "java/lang/invoke/MethodHandles$Lookup$ClassOption"

    invoke-virtual {v6, v4, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v2, 0x59

    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v1, 0xb2

    const-string v0, "NESTMATE"

    const-string v11, "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;"

    invoke-virtual {v6, v1, v3, v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v15, 0x53

    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v9, "STRONG"

    invoke-virtual {v6, v1, v3, v9, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v19, "([BLjava/lang/Object;Z[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;"

    const/16 v20, 0x0

    const/16 v21, 0xb6

    const-string v22, "java/lang/invoke/MethodHandles$Lookup"

    const-string v23, "defineHiddenClassWithClassData"

    move-object v15, v0

    move-object/from16 v0, p1

    move/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v26, v3

    move-object/from16 v3, v23

    move-object/from16 v4, v19

    move/from16 v5, v20

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v5, 0xc

    invoke-virtual {v6, v10, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    new-instance v4, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v4}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v0, 0xa7

    invoke-virtual {v6, v0, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v6, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v0, p1

    move-object/from16 v27, v4

    move v4, v14

    move v14, v5

    move-object/from16 v5, v19

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v6, v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v1, 0x5

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    move-object/from16 v2, v26

    const/16 v1, 0xbd

    invoke-virtual {v6, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v1, 0x59

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v3, 0x3

    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v3, 0xb2

    invoke-virtual {v6, v3, v2, v15, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x53

    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v6, v3, v2, v9, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v4, "([BZ[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;"

    const/4 v5, 0x0

    const/16 v1, 0xb6

    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    const-string v3, "defineHiddenClass"

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v6, v10, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    move-object/from16 v0, v27

    invoke-virtual {v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const-string v0, "java/lang/invoke/MethodHandles$Lookup"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v4, "()Ljava/lang/Class;"

    const/4 v5, 0x0

    const/16 v1, 0xb6

    const-string v2, "java/lang/invoke/MethodHandles$Lookup"

    const-string v3, "lookupClass"

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v0, 0xa

    invoke-virtual {v6, v10, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v23, "java/util/List"

    const-string v24, "java/lang/Class"

    const-string v15, "java/lang/invoke/MethodHandles$Lookup"

    const-string v16, "java/lang/String"

    const-string v17, "java/lang/invoke/MethodType"

    const-string v18, "java/lang/invoke/MethodType"

    const-string v19, "java/lang/invoke/MethodHandle"

    const-string v20, "java/lang/invoke/MethodType"

    const-string v22, "java/util/List"

    move-object/from16 v21, v12

    filled-new-array/range {v15 .. v24}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/16 v2, 0xa

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void
.end method

.method public getLocalVariableLength()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method

.method public getStackSize()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method
