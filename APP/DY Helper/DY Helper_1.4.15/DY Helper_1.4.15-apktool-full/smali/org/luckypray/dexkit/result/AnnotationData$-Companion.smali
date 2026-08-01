.class public final Lorg/luckypray/dexkit/result/AnnotationData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/AnnotationData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getDexId-pVg5ArA()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getTypeId-pVg5ArA()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getTypeDescriptor()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

    .line 23
    .line 24
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getVisibility()B

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;->from(B)Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getElementsLength()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const/4 v0, 0x0

    .line 42
    :goto_0
    if-ge v0, p0, :cond_0

    .line 43
    .line 44
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationElementData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->elements(I)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1, v7}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/result/AnnotationElementData;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationData;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    move-object v1, p1

    .line 67
    invoke-direct/range {v0 .. v7}, Lorg/luckypray/dexkit/result/AnnotationData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;Lzq;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method
