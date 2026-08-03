.class public final Lorg/luckypray/dexkit/result/ClassData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/ClassData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;


# instance fields
.field private final annotations$delegate:LD0/b;

.field private final descriptor:Ljava/lang/String;

.field private final dexClass$delegate:LD0/b;

.field private final fieldIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final fields$delegate:LD0/b;

.field private final interfaceIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final interfaces$delegate:LD0/b;

.field private final methodIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final methods$delegate:LD0/b;

.field private final modifiers:I

.field private final sourceFile:Ljava/lang/String;

.field private final superClass$delegate:LD0/b;

.field private final superClassId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/ClassData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/ClassData$-Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "II",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 3
    iput-object p4, p0, Lorg/luckypray/dexkit/result/ClassData;->sourceFile:Ljava/lang/String;

    .line 4
    iput p5, p0, Lorg/luckypray/dexkit/result/ClassData;->modifiers:I

    .line 5
    iput-object p6, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    .line 6
    iput-object p7, p0, Lorg/luckypray/dexkit/result/ClassData;->superClassId:Ljava/lang/Integer;

    .line 7
    iput-object p8, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaceIds:Ljava/util/List;

    .line 8
    iput-object p9, p0, Lorg/luckypray/dexkit/result/ClassData;->methodIds:Ljava/util/List;

    .line 9
    iput-object p10, p0, Lorg/luckypray/dexkit/result/ClassData;->fieldIds:Ljava/util/List;

    .line 10
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$dexClass$2;

    invoke-direct {p4, p0}, Lorg/luckypray/dexkit/result/ClassData$dexClass$2;-><init>(Lorg/luckypray/dexkit/result/ClassData;)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/ClassData;->dexClass$delegate:LD0/b;

    .line 11
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$superClass$2;

    invoke-direct {p4, p0, p1, p3}, Lorg/luckypray/dexkit/result/ClassData$superClass$2;-><init>(Lorg/luckypray/dexkit/result/ClassData;Lorg/luckypray/dexkit/DexKitBridge;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/ClassData;->superClass$delegate:LD0/b;

    .line 12
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaces$delegate:LD0/b;

    .line 13
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$methods$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/ClassData$methods$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/ClassData;->methods$delegate:LD0/b;

    .line 14
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$fields$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/ClassData$fields$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/ClassData;->fields$delegate:LD0/b;

    .line 15
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$annotations$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/ClassData$annotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData;->annotations$delegate:LD0/b;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;LQ0/d;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$getFieldIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->fieldIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getInterfaceIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaceIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMethodIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->methodIds:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getSuperClassId$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->superClassId:Ljava/lang/Integer;

    return-object p0
.end method

.method private final findField(LP0/l;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Lorg/luckypray/dexkit/result/FieldDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/ClassData;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p1

    return-object p1
.end method

.method private final findMethod(LP0/l;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Lorg/luckypray/dexkit/result/MethodDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/ClassData;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p1

    return-object p1
.end method

.method private final getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->dexClass$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/wrap/DexClass;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/result/ClassData;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    iget-object p1, p1, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    invoke-static {v1, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    const-string v0, "findField"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindField;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;

    .line 2
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/base/BaseData;->getBridge()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p1

    return-object p1
.end method

.method public final findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    const-string v0, "findMethod"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 2
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/base/BaseData;->getBridge()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->annotations$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getDescriptor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldCount()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->fieldIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getFields()Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->fields$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/FieldDataList;

    return-object v0
.end method

.method public final getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
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

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/wrap/DexClass;->getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final getInterfaceCount()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaceIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getInterfaceInstances(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getInterfaces()Lorg/luckypray/dexkit/result/ClassDataList;

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

    check-cast v2, Lorg/luckypray/dexkit/result/ClassData;

    sget-object v3, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v2}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, p1, v2}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final getInterfaces()Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaces$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassDataList;

    return-object v0
.end method

.method public final getMethodCount()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->methodIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getMethods()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->methods$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodDataList;

    return-object v0
.end method

.method public final getModifiers()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/result/ClassData;->modifiers:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexClass;->getTypeName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSimpleName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSourceFile()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->sourceFile:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuperClass()Lorg/luckypray/dexkit/result/ClassData;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->superClass$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    return-object v0
.end method

.method public final getSuperClassInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
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

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getSuperClass()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/result/ClassData;->getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isArray()Z
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexClass;->isArray()Z

    move-result v0

    return v0
.end method

.method public final toDexType()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/luckypray/dexkit/result/ClassData;->modifiers:I

    if-lez v1, :cond_0

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getSuperClass()Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, " extends "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getInterfaceCount()I

    move-result v1

    if-lez v1, :cond_2

    const-string v1, " implements "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getInterfaces()Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v2

    sget-object v6, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;->INSTANCE:Lorg/luckypray/dexkit/result/ClassData$toString$1$2;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v3, ", "

    const/16 v7, 0x1e

    invoke-static/range {v2 .. v7}, LE0/l;->r0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/l;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
