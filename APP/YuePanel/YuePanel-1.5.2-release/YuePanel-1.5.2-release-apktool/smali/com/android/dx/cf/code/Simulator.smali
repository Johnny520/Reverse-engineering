.class public Lcom/android/dx/cf/code/Simulator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/Simulator$SimVisitor;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final LOCAL_MISMATCH_ERROR:Ljava/lang/String; = "This is symptomatic of .class transformation tools that ignore local variable information."


# instance fields
.field private final code:Lcom/android/dx/cf/code/BytecodeArray;

.field private final dexOptions:Lcom/android/dx/dex/DexOptions;

.field private final localVariables:Lcom/android/dx/cf/code/LocalVariableList;

.field private final machine:Lcom/android/dx/cf/code/Machine;

.field private method:Lcom/android/dx/cf/code/ConcreteMethod;

.field private final visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/cf/code/Machine;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/dex/DexOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->machine:Lcom/android/dx/cf/code/Machine;

    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    move-result-object p1

    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->code:Lcom/android/dx/cf/code/BytecodeArray;

    iput-object p2, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getLocalVariables()Lcom/android/dx/cf/code/LocalVariableList;

    move-result-object p1

    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    new-instance p1, Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-direct {p1, p0}, Lcom/android/dx/cf/code/Simulator$SimVisitor;-><init>(Lcom/android/dx/cf/code/Simulator;)V

    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    iput-object p3, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->isDefaultOrStaticInterfaceMethod()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p2}, Lcom/android/dx/cf/code/Simulator;->checkInterfaceMethodDeclaration(Lcom/android/dx/cf/code/ConcreteMethod;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "dexOptions == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "machine == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic access$000(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/Machine;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator;->machine:Lcom/android/dx/cf/code/Machine;

    return-object p0
.end method

.method public static synthetic access$100()Lcom/android/dx/cf/code/SimException;
    .locals 1

    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->illegalTos()Lcom/android/dx/cf/code/SimException;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$200(Lcom/android/dx/cf/code/Simulator;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$300(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;
    .locals 0

    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Simulator;->requiredArrayTypeFor(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$400(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/LocalVariableList;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    return-object p0
.end method

.method public static synthetic access$500(Lcom/android/dx/cf/code/Simulator;ILcom/android/dx/rop/cst/CstMethodRef;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Simulator;->checkInvokeInterfaceSupported(ILcom/android/dx/rop/cst/CstMethodRef;)V

    return-void
.end method

.method public static synthetic access$600(Lcom/android/dx/cf/code/Simulator;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->checkInvokeSignaturePolymorphic(I)V

    return-void
.end method

.method public static synthetic access$700(Lcom/android/dx/cf/code/Simulator;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/dx/cf/code/SimException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->checkInvokeDynamicSupported(I)V

    return-void
.end method

.method public static synthetic access$800(Lcom/android/dx/cf/code/Simulator;Lcom/android/dx/rop/cst/Constant;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/dx/cf/code/SimException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->checkConstMethodHandleSupported(Lcom/android/dx/rop/cst/Constant;)V

    return-void
.end method

.method private checkConstMethodHandleSupported(Lcom/android/dx/rop/cst/Constant;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/dx/cf/code/SimException;
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    const/16 v1, 0x1c

    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget v1, v1, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "invalid constant type %s requires --min-sdk-version >= %d (currently %d)"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private checkInterfaceMethodDeclaration(Lcom/android/dx/cf/code/ConcreteMethod;)V
    .locals 4

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->isStaticMethod()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "static"

    goto :goto_0

    :cond_0
    const-string v0, "default"

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget v2, v2, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, v1, v2, v3, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->warn(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private checkInvokeDynamicSupported(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/dx/cf/code/SimException;
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget v1, v1, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private checkInvokeInterfaceSupported(ILcom/android/dx/rop/cst/CstMethodRef;)V
    .locals 5

    const/16 v0, 0xb9

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget-boolean v2, v0, Lcom/android/dx/dex/DexOptions;->allowAllInterfaceMethodInvokes:Z

    const/16 v3, 0xb8

    if-ne p1, v3, :cond_2

    const/16 v4, 0x15

    invoke-virtual {v0, v4}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    move-result v0

    and-int/2addr v2, v0

    :cond_2
    if-ne p1, v3, :cond_3

    const-string p1, "static"

    goto :goto_0

    :cond_3
    const-string p1, "default"

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget v2, v2, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p1, v0, p2, v1, v2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->warn(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget v2, v2, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p1, v0, p2, v1, v2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private checkInvokeSignaturePolymorphic(I)V
    .locals 2

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget v0, v0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0xb6

    if-eq p1, v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported signature polymorphic invocation ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/android/dx/cf/code/ByteOps;->opName(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private fail(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "ERROR in %s.%s: %s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/android/dx/cf/code/SimException;

    invoke-direct {v0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static illegalTos()Lcom/android/dx/cf/code/SimException;
    .locals 2

    new-instance v0, Lcom/android/dx/cf/code/SimException;

    const-string v1, "stack mismatch: illegal top-of-stack for opcode"

    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static requiredArrayTypeFor(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;
    .locals 1

    sget-object v0, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getArrayType()Lcom/android/dx/rop/type/Type;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    if-ne p0, v0, :cond_2

    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isArray()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    sget-object v0, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    if-ne p0, v0, :cond_3

    sget-object v0, Lcom/android/dx/rop/type/Type;->BOOLEAN_ARRAY:Lcom/android/dx/rop/type/Type;

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getArrayType()Lcom/android/dx/rop/type/Type;

    move-result-object p0

    return-object p0
.end method

.method private warn(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "WARNING in %s.%s: %s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    iget-object v0, v0, Lcom/android/dx/dex/DexOptions;->err:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public simulate(ILcom/android/dx/cf/code/Frame;)I
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-virtual {v0, p2}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->setFrame(Lcom/android/dx/cf/code/Frame;)V

    .line 9
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator;->code:Lcom/android/dx/cf/code/BytecodeArray;

    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-virtual {p2, p1, v0}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    move-result p1

    return p1
.end method

.method public simulate(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ByteBlock;->getEnd()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-virtual {v1, p2}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->setFrame(Lcom/android/dx/cf/code/Frame;)V

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ByteBlock;->getStart()I

    move-result p1

    :goto_0
    if-ge p1, v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->code:Lcom/android/dx/cf/code/BytecodeArray;

    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-virtual {v1, p1, v2}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    move-result v1

    .line 5
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-virtual {v2, p1}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->setPreviousOffset(I)V
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p1, v1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    return-void

    .line 6
    :goto_1
    invoke-virtual {p2, p1}, Lcom/android/dx/cf/code/Frame;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 7
    throw p1
.end method
