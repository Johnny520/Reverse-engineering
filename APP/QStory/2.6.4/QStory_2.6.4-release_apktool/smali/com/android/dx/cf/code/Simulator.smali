.class public Lcom/android/dx/cf/code/Simulator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
.method public constructor <init>(Lcom/android/dx/cf/code/Machine;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/dex/DexOptions;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->machine:Lcom/android/dx/cf/code/Machine;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->code:Lcom/android/dx/cf/code/BytecodeArray;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getLocalVariables()Lcom/android/dx/cf/code/LocalVariableList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    .line 26
    .line 27
    new-instance p1, Lcom/android/dx/cf/code/Simulator$SimVisitor;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lcom/android/dx/cf/code/Simulator$SimVisitor;-><init>(Lcom/android/dx/cf/code/Simulator;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    .line 33
    .line 34
    iput-object p3, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->isDefaultOrStaticInterfaceMethod()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-direct {p0, p2}, Lcom/android/dx/cf/code/Simulator;->checkInterfaceMethodDeclaration(Lcom/android/dx/cf/code/ConcreteMethod;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    :cond_1
    const-string p0, "dexOptions == null"

    .line 47
    .line 48
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_2
    const-string p0, "method == null"

    .line 53
    .line 54
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_3
    const-string p0, "machine == null"

    .line 59
    .line 60
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public static synthetic access$000(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/Machine;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator;->machine:Lcom/android/dx/cf/code/Machine;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100()Lcom/android/dx/cf/code/SimException;
    .locals 1

    .line 1
    invoke-static {}, Lcom/android/dx/cf/code/Simulator;->illegalTos()Lcom/android/dx/cf/code/SimException;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic access$200(Lcom/android/dx/cf/code/Simulator;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$300(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Simulator;->requiredArrayTypeFor(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$400(Lcom/android/dx/cf/code/Simulator;)Lcom/android/dx/cf/code/LocalVariableList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/android/dx/cf/code/Simulator;ILcom/android/dx/rop/cst/CstMethodRef;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Simulator;->checkInvokeInterfaceSupported(ILcom/android/dx/rop/cst/CstMethodRef;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$600(Lcom/android/dx/cf/code/Simulator;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->checkInvokeSignaturePolymorphic(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$700(Lcom/android/dx/cf/code/Simulator;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->checkInvokeDynamicSupported(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$800(Lcom/android/dx/cf/code/Simulator;Lcom/android/dx/rop/cst/Constant;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->checkConstMethodHandleSupported(Lcom/android/dx/rop/cst/Constant;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private checkConstMethodHandleSupported(Lcom/android/dx/rop/cst/Constant;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 20
    .line 21
    iget v1, v1, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "invalid constant type %s requires --min-sdk-version >= %d (currently %d)"

    .line 32
    .line 33
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method private checkInterfaceMethodDeclaration(Lcom/android/dx/cf/code/ConcreteMethod;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->isStaticMethod()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string v0, "static"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "default"

    .line 21
    .line 22
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 27
    .line 28
    iget v2, v2, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    filled-new-array {v0, v1, v2, v3, p1}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v0, "defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s"

    .line 55
    .line 56
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->warn(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method private checkInvokeDynamicSupported(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 20
    .line 21
    iget v1, v1, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)"

    .line 32
    .line 33
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method private checkInvokeInterfaceSupported(ILcom/android/dx/rop/cst/CstMethodRef;)V
    .locals 5

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0xb9

    .line 8
    .line 9
    if-ne p1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 22
    .line 23
    iget-boolean v2, v0, Lcom/android/dx/dex/DexOptions;->allowAllInterfaceMethodInvokes:Z

    .line 24
    .line 25
    const/16 v3, 0xb8

    .line 26
    .line 27
    if-ne p1, v3, :cond_2

    .line 28
    .line 29
    const/16 v4, 0x15

    .line 30
    .line 31
    invoke-virtual {v0, v4}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    and-int/2addr v2, v0

    .line 36
    :cond_2
    if-ne p1, v3, :cond_3

    .line 37
    .line 38
    const-string p1, "static"

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const-string p1, "default"

    .line 42
    .line 43
    :goto_1
    if-eqz v2, :cond_4

    .line 44
    .line 45
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 62
    .line 63
    iget v2, v2, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    filled-new-array {p1, v0, p2, v1, v2}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string p2, "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)"

    .line 74
    .line 75
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->warn(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 100
    .line 101
    iget v2, v2, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    filled-new-array {p1, v0, p2, v1, v2}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string p2, "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)"

    .line 112
    .line 113
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method private checkInvokeSignaturePolymorphic(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 16
    .line 17
    iget v0, v0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)"

    .line 28
    .line 29
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/16 v0, 0xb6

    .line 38
    .line 39
    if-eq p1, v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "Unsupported signature polymorphic invocation ("

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/android/dx/cf/code/ByteOps;->opName(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, ")"

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Simulator;->fail(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method private fail(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, "."

    .line 22
    .line 23
    const-string v2, ": "

    .line 24
    .line 25
    const-string v3, "ERROR in "

    .line 26
    .line 27
    invoke-static {v3, v0, v1, p0, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance p1, Lcom/android/dx/cf/code/SimException;

    .line 39
    .line 40
    invoke-direct {p1, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method private static illegalTos()Lcom/android/dx/cf/code/SimException;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/SimException;

    .line 2
    .line 3
    const-string v1, "stack mismatch: illegal top-of-stack for opcode"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private static requiredArrayTypeFor(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Type;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getArrayType()Lcom/android/dx/rop/type/Type;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    sget-object v0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 18
    .line 19
    if-ne p0, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    sget-object v0, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 39
    .line 40
    if-ne p0, v0, :cond_3

    .line 41
    .line 42
    sget-object v0, Lcom/android/dx/rop/type/Type;->BOOLEAN_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 43
    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getArrayType()Lcom/android/dx/rop/type/Type;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method private warn(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "."

    .line 22
    .line 23
    const-string v3, ": "

    .line 24
    .line 25
    const-string v4, "WARNING in "

    .line 26
    .line 27
    invoke-static {v4, v0, v2, v1, v3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 39
    .line 40
    iget-object p0, p0, Lcom/android/dx/dex/DexOptions;->err:Ljava/io/PrintStream;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public simulate(ILcom/android/dx/cf/code/Frame;)I
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-virtual {v0, p2}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->setFrame(Lcom/android/dx/cf/code/Frame;)V

    .line 39
    iget-object p2, p0, Lcom/android/dx/cf/code/Simulator;->code:Lcom/android/dx/cf/code/BytecodeArray;

    iget-object p0, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    invoke-virtual {p2, p1, p0}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    move-result p0

    return p0
.end method

.method public simulate(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ByteBlock;->getEnd()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->setFrame(Lcom/android/dx/cf/code/Frame;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ByteBlock;->getStart()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    :goto_0
    if-ge p1, v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/android/dx/cf/code/Simulator;->code:Lcom/android/dx/cf/code/BytecodeArray;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    .line 19
    .line 20
    invoke-virtual {v1, p1, v2}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lcom/android/dx/cf/code/Simulator;->visitor:Lcom/android/dx/cf/code/Simulator$SimVisitor;

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Lcom/android/dx/cf/code/Simulator$SimVisitor;->setPreviousOffset(I)V
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    add-int/2addr p1, v1

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    return-void

    .line 34
    :goto_1
    invoke-virtual {p2, p0}, Lcom/android/dx/cf/code/Frame;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 35
    .line 36
    .line 37
    throw p0
.end method
