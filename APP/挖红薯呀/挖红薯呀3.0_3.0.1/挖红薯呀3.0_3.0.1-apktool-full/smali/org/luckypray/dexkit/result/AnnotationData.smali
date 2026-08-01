.class public final Lorg/luckypray/dexkit/result/AnnotationData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;


# instance fields
.field private final dexClass$delegate:Lu60;

.field private final elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationElementData;",
            ">;"
        }
    .end annotation
.end field

.field private final typeDescriptor:Ljava/lang/String;

.field private final typeId:I

.field private final visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "II",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationElementData;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILpl;)V

    .line 8
    .line 9
    .line 10
    iput p3, v0, Lorg/luckypray/dexkit/result/AnnotationData;->typeId:I

    .line 11
    .line 12
    iput-object p4, v0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p5, v0, Lorg/luckypray/dexkit/result/AnnotationData;->visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 15
    .line 16
    iput-object p6, v0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    .line 17
    .line 18
    new-instance p0, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;-><init>(Lorg/luckypray/dexkit/result/AnnotationData;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lx51;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lx51;-><init>(Lhw;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v0, Lorg/luckypray/dexkit/result/AnnotationData;->dexClass$delegate:Lu60;

    .line 29
    .line 30
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;Lpl;)V
    .locals 0

    .line 31
    invoke-direct/range {p0 .. p6}, Lorg/luckypray/dexkit/result/AnnotationData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V

    return-void
.end method

.method private final getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->dexClass$delegate:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

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
.method public final getElements()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationElementData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTypeDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTypeId()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeId:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

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

.method public final getVisibility()Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 2
    .line 3
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
    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "@"

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "("

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 v1, 0x0

    .line 41
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    add-int/lit8 v3, v1, 0x1

    .line 52
    .line 53
    if-ltz v1, :cond_1

    .line 54
    .line 55
    check-cast v2, Lorg/luckypray/dexkit/result/AnnotationElementData;

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    const-string v1, ", "

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    move v1, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-static {}, Lo30;->A()V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0

    .line 74
    :cond_2
    const-string p0, ")"

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
