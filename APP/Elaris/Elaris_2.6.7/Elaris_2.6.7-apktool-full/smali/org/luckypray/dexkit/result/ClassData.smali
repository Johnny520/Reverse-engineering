.class public final Lorg/luckypray/dexkit/result/ClassData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/ClassData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;


# instance fields
.field private final annotations$delegate:Le9;

.field private final descriptor:Ljava/lang/String;

.field private final dexClass$delegate:Le9;

.field private final fieldIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final fields$delegate:Le9;

.field private final interfaceIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final interfaces$delegate:Le9;

.field private final methodIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final methods$delegate:Le9;

.field private final modifiers:I

.field private final sourceFile:Ljava/lang/String;

.field private final superClass$delegate:Le9;

.field private final superClassId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/ClassData$-Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 8
    .line 9
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

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lorg/luckypray/dexkit/result/ClassData;->sourceFile:Ljava/lang/String;

    .line 5
    .line 6
    iput p5, p0, Lorg/luckypray/dexkit/result/ClassData;->modifiers:I

    .line 7
    .line 8
    iput-object p6, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p7, p0, Lorg/luckypray/dexkit/result/ClassData;->superClassId:Ljava/lang/Integer;

    .line 11
    .line 12
    iput-object p8, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaceIds:Ljava/util/List;

    .line 13
    .line 14
    iput-object p9, p0, Lorg/luckypray/dexkit/result/ClassData;->methodIds:Ljava/util/List;

    .line 15
    .line 16
    iput-object p10, p0, Lorg/luckypray/dexkit/result/ClassData;->fieldIds:Ljava/util/List;

    .line 17
    .line 18
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$dexClass$2;

    .line 19
    .line 20
    invoke-direct {p4, p0}, Lorg/luckypray/dexkit/result/ClassData$dexClass$2;-><init>(Lorg/luckypray/dexkit/result/ClassData;)V

    .line 21
    .line 22
    .line 23
    new-instance p5, Lmd;

    .line 24
    .line 25
    invoke-direct {p5, p4}, Lmd;-><init>(Lj5;)V

    .line 26
    .line 27
    .line 28
    iput-object p5, p0, Lorg/luckypray/dexkit/result/ClassData;->dexClass$delegate:Le9;

    .line 29
    .line 30
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$superClass$2;

    .line 31
    .line 32
    invoke-direct {p4, p0, p1, p3}, Lorg/luckypray/dexkit/result/ClassData$superClass$2;-><init>(Lorg/luckypray/dexkit/result/ClassData;Lorg/luckypray/dexkit/DexKitBridge;I)V

    .line 33
    .line 34
    .line 35
    new-instance p5, Lmd;

    .line 36
    .line 37
    invoke-direct {p5, p4}, Lmd;-><init>(Lj5;)V

    .line 38
    .line 39
    .line 40
    iput-object p5, p0, Lorg/luckypray/dexkit/result/ClassData;->superClass$delegate:Le9;

    .line 41
    .line 42
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;

    .line 43
    .line 44
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/ClassData$interfaces$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V

    .line 45
    .line 46
    .line 47
    new-instance p5, Lmd;

    .line 48
    .line 49
    invoke-direct {p5, p4}, Lmd;-><init>(Lj5;)V

    .line 50
    .line 51
    .line 52
    iput-object p5, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaces$delegate:Le9;

    .line 53
    .line 54
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$methods$2;

    .line 55
    .line 56
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/ClassData$methods$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V

    .line 57
    .line 58
    .line 59
    new-instance p5, Lmd;

    .line 60
    .line 61
    invoke-direct {p5, p4}, Lmd;-><init>(Lj5;)V

    .line 62
    .line 63
    .line 64
    iput-object p5, p0, Lorg/luckypray/dexkit/result/ClassData;->methods$delegate:Le9;

    .line 65
    .line 66
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$fields$2;

    .line 67
    .line 68
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/ClassData$fields$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;I)V

    .line 69
    .line 70
    .line 71
    new-instance p5, Lmd;

    .line 72
    .line 73
    invoke-direct {p5, p4}, Lmd;-><init>(Lj5;)V

    .line 74
    .line 75
    .line 76
    iput-object p5, p0, Lorg/luckypray/dexkit/result/ClassData;->fields$delegate:Le9;

    .line 77
    .line 78
    new-instance p4, Lorg/luckypray/dexkit/result/ClassData$annotations$2;

    .line 79
    .line 80
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/ClassData$annotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/ClassData;II)V

    .line 81
    .line 82
    .line 83
    new-instance p1, Lmd;

    .line 84
    .line 85
    invoke-direct {p1, p4}, Lmd;-><init>(Lj5;)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lorg/luckypray/dexkit/result/ClassData;->annotations$delegate:Le9;

    .line 89
    .line 90
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lr2;)V
    .locals 0

    .line 91
    invoke-direct/range {p0 .. p10}, Lorg/luckypray/dexkit/result/ClassData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getEncodeId(Lorg/luckypray/dexkit/result/ClassData;II)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$getFieldIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->fieldIds:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getInterfaceIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaceIds:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMethodIds$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->methodIds:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSuperClassId$p(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->superClassId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method private final getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->dexClass$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/result/ClassData;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    .line 10
    .line 11
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    .line 12
    .line 13
    iget-object p1, p1, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p0, p1}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Li5;->S0(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindField;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/base/BaseData;->getBridge()Lorg/luckypray/dexkit/DexKitBridge;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final synthetic findField(Lu5;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/ClassData;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p0

    return-object p0
.end method

.method public final findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Li5;->S0(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/base/BaseData;->getBridge()Lorg/luckypray/dexkit/DexKitBridge;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final synthetic findMethod(Lu5;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/ClassData;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p0

    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->annotations$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFieldCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->fieldIds:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getFields()Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->fields$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/FieldDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/wrap/DexClass;->getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final getInterfaceCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaceIds:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getInterfaceInstances(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 3
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

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getInterfaces()Lorg/luckypray/dexkit/result/ClassDataList;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p0}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lorg/luckypray/dexkit/result/ClassData;

    .line 32
    .line 33
    sget-object v2, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    .line 34
    .line 35
    invoke-virtual {v1}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v2, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-object v0
.end method

.method public final getInterfaces()Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->interfaces$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/ClassDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getMethodCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->methodIds:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getMethods()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->methods$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/ClassData;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexClass;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getSimpleName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexClass;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getSourceFile()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->sourceFile:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSuperClass()Lorg/luckypray/dexkit/result/ClassData;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->superClass$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getSuperClassInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getSuperClass()Lorg/luckypray/dexkit/result/ClassData;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassData;->getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/ClassData;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isArray()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexClass;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toDexClass()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toDexType()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/ClassData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lorg/luckypray/dexkit/result/ClassData;->modifiers:I

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " "

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "class "

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getSuperClass()Lorg/luckypray/dexkit/result/ClassData;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    const-string v2, " extends "

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getInterfaceCount()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-lez v1, :cond_2

    .line 78
    .line 79
    const-string v1, " implements "

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getInterfaces()Lorg/luckypray/dexkit/result/ClassDataList;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object v1, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;->INSTANCE:Lorg/luckypray/dexkit/result/ClassData$toString$1$2;

    .line 89
    .line 90
    const/16 v2, 0x1e

    .line 91
    .line 92
    const-string v3, ", "

    .line 93
    .line 94
    invoke-static {p0, v3, v1, v2}, Lh2;->k2(Ljava/lang/Iterable;Ljava/lang/String;Lu5;I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method
