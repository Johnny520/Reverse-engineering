.class public final Lorg/luckypray/dexkit/result/AnnotationData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;


# instance fields
.field private final dexClass$delegate:LD0/b;

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

    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

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

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILQ0/d;)V

    .line 3
    iput p3, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeId:I

    .line 4
    iput-object p4, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lorg/luckypray/dexkit/result/AnnotationData;->visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 6
    iput-object p6, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    .line 7
    new-instance p1, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;

    invoke-direct {p1, p0}, Lorg/luckypray/dexkit/result/AnnotationData$dexClass$2;-><init>(Lorg/luckypray/dexkit/result/AnnotationData;)V

    invoke-static {p1}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/AnnotationData;->dexClass$delegate:LD0/b;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;LQ0/d;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lorg/luckypray/dexkit/result/AnnotationData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V

    return-void
.end method

.method private final getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->dexClass$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/wrap/DexClass;

    return-object v0
.end method


# virtual methods
.method public final getElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationElementData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    return-object v0
.end method

.method public final getTypeDescriptor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeId()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeId:I

    return v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationData;->getDexClass()Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexClass;->getTypeName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getVisibility()Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationData;->visibility:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationData;->typeDescriptor:Ljava/lang/String;

    invoke-static {v1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "@"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationData;->elements:Ljava/util/List;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_1

    check-cast v3, Lorg/luckypray/dexkit/result/AnnotationElementData;

    if-eqz v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_0

    :cond_1
    invoke-static {}, LE0/m;->j0()V

    const/4 v0, 0x0

    throw v0

    :cond_2
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
