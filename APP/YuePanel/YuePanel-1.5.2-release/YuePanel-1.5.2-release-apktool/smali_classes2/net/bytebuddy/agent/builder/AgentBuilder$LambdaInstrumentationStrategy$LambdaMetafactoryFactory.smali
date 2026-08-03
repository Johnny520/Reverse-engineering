.class public abstract enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "LambdaMetafactoryFactory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

.field public static final enum ALTERNATIVE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

.field private static final LOADER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

.field public static final enum REGULAR:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;


# instance fields
.field private final localVariableLength:I

.field private final stackSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$1;

    const/16 v1, 0xb

    const-string v2, "REGULAR"

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-direct {v0, v2, v3, v4, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$1;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->REGULAR:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$2;

    const/4 v2, 0x1

    const/16 v5, 0x10

    const-string v6, "ALTERNATIVE"

    invoke-direct {v1, v6, v2, v4, v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$2;-><init>(Ljava/lang/String;III)V

    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->ALTERNATIVE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    const/4 v4, 0x2

    new-array v4, v4, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    aput-object v0, v4, v3

    aput-object v1, v4, v2

    sput-object v4, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->resolve()Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->LOADER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->stackSize:I

    .line 4
    iput p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->localVariableLength:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILnet/bytebuddy/agent/builder/AgentBuilder$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;-><init>(Ljava/lang/String;III)V

    return-void
.end method

.method private static resolve()Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;
    .locals 11
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Exception should not be rethrown but trigger a fallback."
        value = {
            "DE_MIGHT_IGNORE",
            "REC_CATCH_EXCEPTION"
        }
    .end annotation

    const-string v0, "[Ljava.lang.invoke.MethodHandles$Lookup$ClassOption;"

    const-class v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "java.lang.invoke.MethodHandles$Lookup"

    invoke-static {v4, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "defineHiddenClass"

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v1, v6, v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v5, "defineHiddenClassWithClassData"

    const-class v7, Ljava/lang/Object;

    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v1, v7, v6, v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    move-result-object v0

    array-length v4, v0

    move v5, v3

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v0, v5

    :try_start_1
    invoke-virtual {v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->getType()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x2f

    const/16 v9, 0x2e

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v7

    const-string v8, "defineAnonymousClass"

    const-class v9, Ljava/lang/Class;

    const-class v10, [Ljava/lang/Object;

    filled-new-array {v9, v1, v10}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v6

    :catch_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$Unavailable;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$Unavailable;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
    .locals 1

    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    invoke-virtual/range {p0 .. p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->onDispatch(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    const-string v5, "()Ljava/lang/ClassLoader;"

    const/4 v6, 0x0

    const/16 v2, 0xb8

    const-string v3, "java/lang/ClassLoader"

    const-string v4, "getSystemClassLoader"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "net.bytebuddy.agent.builder.LambdaFactory"

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const-string v5, "(Ljava/lang/String;)Ljava/lang/Class;"

    const/16 v2, 0xb6

    const-string v3, "java/lang/ClassLoader"

    const-string v4, "loadClass"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "make"

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v8, 0x10

    const/16 v9, 0x9

    invoke-virtual {v7, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    const-string v1, "java/lang/Class"

    const/16 v10, 0xbd

    invoke-virtual {v7, v10, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v11, 0x59

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v12, 0x3

    invoke-virtual {v7, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v1, "Ljava/lang/Object;"

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v13, 0x53

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v14, 0x4

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v2, "Ljava/lang/String;"

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v15, 0x5

    invoke-virtual {v7, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v6, 0x6

    invoke-virtual {v7, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v5, 0x7

    invoke-virtual {v7, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v4, 0x8

    invoke-virtual {v7, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    const-string v1, "TYPE"

    const-string v2, "Ljava/lang/Class;"

    const/16 v3, 0xb2

    const-string v6, "java/lang/Boolean"

    invoke-virtual {v7, v3, v6, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    const-string v1, "Ljava/util/List;"

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v1

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v6, "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;"

    const/16 v16, 0x0

    const/16 v2, 0xb6

    const-string v17, "java/lang/Class"

    const-string v18, "getDeclaredMethod"

    move-object/from16 v1, p1

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    move-object v5, v6

    move/from16 v6, v16

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    const-string v6, "java/lang/Object"

    invoke-virtual {v7, v10, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v5, 0x19

    const/4 v4, 0x0

    invoke-virtual {v7, v5, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v5, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v3, 0x2

    invoke-virtual {v7, v5, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v1, 0x6

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v5, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v2, 0x7

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v5, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v14, 0x8

    invoke-virtual {v7, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v5, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    const/16 v15, 0x15

    invoke-virtual {v7, v15, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v15, "(Z)Ljava/lang/Boolean;"

    const/16 v17, 0xb8

    const-string v18, "java/lang/Boolean"

    const-string v19, "valueOf"

    move-object/from16 v1, p1

    move v10, v2

    move/from16 v2, v17

    move v12, v3

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move v12, v5

    move-object v5, v15

    move-object v15, v6

    move/from16 v6, v16

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    invoke-virtual {v7, v12, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v8, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    invoke-virtual {v7, v12, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v5, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v6, 0x0

    const/16 v2, 0xb6

    const-string v3, "java/lang/reflect/Method"

    const-string v4, "invoke"

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v1, 0xc0

    const-string v2, "[B"

    invoke-virtual {v7, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v1, 0x3a

    invoke-virtual {v7, v1, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    sget-object v8, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->LOADER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

    invoke-interface {v8, v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    const/4 v1, 0x2

    invoke-virtual {v7, v12, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v5, "()I"

    const/16 v2, 0xb6

    const-string v3, "java/lang/invoke/MethodType"

    const-string v4, "parameterCount"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v9, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v9}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v1, 0x9a

    invoke-virtual {v7, v1, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    const/16 v10, 0xbb

    const-string v13, "java/lang/invoke/ConstantCallSite"

    invoke-virtual {v7, v10, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/4 v1, 0x2

    invoke-virtual {v7, v12, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v5, "()Ljava/lang/Class;"

    const-string v3, "java/lang/invoke/MethodType"

    const-string v4, "returnType"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v14, 0xa

    invoke-virtual {v7, v12, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v5, "()[Ljava/lang/reflect/Constructor;"

    const-string v3, "java/lang/Class"

    const-string v4, "getDeclaredConstructors"

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 v1, 0x3

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v2, 0x32

    invoke-virtual {v7, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const/16 v1, 0xbd

    invoke-virtual {v7, v1, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const-string v5, "([Ljava/lang/Object;)Ljava/lang/Object;"

    const/16 v2, 0xb6

    const-string v3, "java/lang/reflect/Constructor"

    const-string v4, "newInstance"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v5, "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;"

    const/16 v2, 0xb8

    const-string v3, "java/lang/invoke/MethodHandles"

    const-string v4, "constant"

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v5, "(Ljava/lang/invoke/MethodHandle;)V"

    const/16 v2, 0xb7

    const-string v3, "java/lang/invoke/ConstantCallSite"

    const-string v4, "<init>"

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v15, Lnet/bytebuddy/jar/asm/Label;

    invoke-direct {v15}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    const/16 v1, 0xa7

    invoke-virtual {v7, v1, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    invoke-virtual {v7, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    sget-object v26, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    const-string v29, "[B"

    const-string v30, "java/lang/Class"

    const-string v20, "java/lang/invoke/MethodHandles$Lookup"

    const-string v21, "java/lang/String"

    const-string v22, "java/lang/invoke/MethodType"

    const-string v23, "java/lang/invoke/MethodType"

    const-string v24, "java/lang/invoke/MethodHandle"

    const-string v25, "java/lang/invoke/MethodType"

    const-string v27, "java/util/List"

    const-string v28, "java/util/List"

    filled-new-array/range {v20 .. v30}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v1, 0x0

    new-array v6, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/16 v3, 0xb

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    invoke-virtual {v7, v10, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    invoke-virtual {v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    const-string v1, "IMPL_LOOKUP"

    const-string v2, "Ljava/lang/invoke/MethodHandles$Lookup;"

    const-string v3, "java/lang/invoke/MethodHandles$Lookup"

    const/16 v4, 0xb2

    invoke-virtual {v7, v4, v3, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v12, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v1, "get$Lambda"

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-virtual {v7, v12, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v5, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;"

    const/4 v6, 0x0

    const/16 v2, 0xb6

    const-string v3, "java/lang/invoke/MethodHandles$Lookup"

    const-string v4, "findStatic"

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v5, "(Ljava/lang/invoke/MethodHandle;)V"

    const/16 v2, 0xb7

    const-string v3, "java/lang/invoke/ConstantCallSite"

    const-string v4, "<init>"

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v7, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    const-string v1, "java/lang/invoke/CallSite"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    const/16 v1, 0xb0

    invoke-virtual {v7, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    iget v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->stackSize:I

    invoke-interface {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;->getStackSize()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->localVariableLength:I

    invoke-interface {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;->getLocalVariableLength()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object v1
.end method

.method public abstract onDispatch(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
.end method
