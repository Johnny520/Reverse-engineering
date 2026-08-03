.class public final Lorg/luckypray/dexkit/result/MethodData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/MethodData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

.field public static final ACC_DECLARED_SYNCHRONIZED:I = 0x20000


# instance fields
.field private final annotations$delegate:LD0/b;

.field private final callers$delegate:LD0/b;

.field private final classId:I

.field private final declaredClass$delegate:LD0/b;

.field private final descriptor:Ljava/lang/String;

.field private final dexMethod$delegate:LD0/b;

.field private final invokes$delegate:LD0/b;

.field private final modifiers:I

.field private final opCodes$delegate:LD0/b;

.field private final paramAnnotations$delegate:LD0/b;

.field private final paramNames$delegate:LD0/b;

.field private final paramTypeIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final paramTypes$delegate:LD0/b;

.field private final returnType$delegate:LD0/b;

.field private final returnTypeId:I

.field private final usingFields$delegate:LD0/b;

.field private final usingStrings$delegate:LD0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/MethodData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/MethodData$-Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "IIII",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 3
    iput p4, p0, Lorg/luckypray/dexkit/result/MethodData;->classId:I

    .line 4
    iput p5, p0, Lorg/luckypray/dexkit/result/MethodData;->modifiers:I

    .line 5
    iput-object p6, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    .line 6
    iput p7, p0, Lorg/luckypray/dexkit/result/MethodData;->returnTypeId:I

    .line 7
    iput-object p8, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypeIds:Ljava/util/List;

    .line 8
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$dexMethod$2;

    invoke-direct {p4, p0}, Lorg/luckypray/dexkit/result/MethodData$dexMethod$2;-><init>(Lorg/luckypray/dexkit/result/MethodData;)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->dexMethod$delegate:LD0/b;

    .line 9
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->declaredClass$delegate:LD0/b;

    .line 10
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$returnType$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/MethodData$returnType$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->returnType$delegate:LD0/b;

    .line 11
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypes$delegate:LD0/b;

    .line 12
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$paramNames$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$paramNames$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->paramNames$delegate:LD0/b;

    .line 13
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$annotations$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$annotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->annotations$delegate:LD0/b;

    .line 14
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$paramAnnotations$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$paramAnnotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->paramAnnotations$delegate:LD0/b;

    .line 15
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$opCodes$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$opCodes$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->opCodes$delegate:LD0/b;

    .line 16
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$callers$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$callers$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->callers$delegate:LD0/b;

    .line 17
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$invokes$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$invokes$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->invokes$delegate:LD0/b;

    .line 18
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$usingStrings$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$usingStrings$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/MethodData;->usingStrings$delegate:LD0/b;

    .line 19
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$usingFields$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$usingFields$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/MethodData;->usingFields$delegate:LD0/b;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;LQ0/d;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lorg/luckypray/dexkit/result/MethodData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getClassId$p(Lorg/luckypray/dexkit/result/MethodData;)I
    .locals 0

    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData;->classId:I

    return p0
.end method

.method public static final synthetic access$getEncodeId(Lorg/luckypray/dexkit/result/MethodData;II)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$getParamTypeIds$p(Lorg/luckypray/dexkit/result/MethodData;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypeIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getReturnTypeId$p(Lorg/luckypray/dexkit/result/MethodData;)I
    .locals 0

    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData;->returnTypeId:I

    return p0
.end method

.method private final getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->dexMethod$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/wrap/DexMethod;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/result/MethodData;

    if-eqz v1, :cond_1

    check-cast p1, Lorg/luckypray/dexkit/result/MethodData;

    iget-object p1, p1, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    invoke-static {p1, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->annotations$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getCallers()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->callers$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodDataList;

    return-object v0
.end method

.method public final getClassInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getConstructorInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;->getConstructorInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    return-object p1
.end method

.method public final getDeclaredClass()Lorg/luckypray/dexkit/result/ClassData;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->declaredClass$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    return-object v0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    return-object v0
.end method

.method public final getInvokes()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->invokes$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodDataList;

    return-object v0
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final getMethodName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getMethodSign()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getModifiers()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/result/MethodData;->modifiers:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getOpCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->opCodes$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getOpNames()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getOpCodes()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpFormat(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final getParamAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramAnnotations$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getParamCount()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypeIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getParamNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramNames$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getParamTypeNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getParamTypeNames()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getParamTypes()Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypes$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassDataList;

    return-object v0
.end method

.method public final getReturnType()Lorg/luckypray/dexkit/result/ClassData;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->returnType$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    return-object v0
.end method

.method public final getReturnTypeInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final getReturnTypeName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getReturnTypeName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getUsingFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/UsingFieldData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->usingFields$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getUsingStrings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->usingStrings$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isConstructor()Z
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isConstructor()Z

    move-result v0

    return v0
.end method

.method public final isMethod()Z
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isMethod()Z

    move-result v0

    return v0
.end method

.method public final isStaticInitializer()Z
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isStaticInitializer()Z

    move-result v0

    return v0
.end method

.method public final toDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/luckypray/dexkit/result/MethodData;->modifiers:I

    const-string v2, " "

    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getParamTypeNames()Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v3, ", "

    const/4 v4, 0x0

    const/16 v7, 0x3e

    invoke-static/range {v2 .. v7}, LE0/l;->r0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/l;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
