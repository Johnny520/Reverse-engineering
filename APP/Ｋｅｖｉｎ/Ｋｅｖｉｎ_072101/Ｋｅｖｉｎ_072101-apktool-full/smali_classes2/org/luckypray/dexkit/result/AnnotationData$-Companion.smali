.class public final Lorg/luckypray/dexkit/result/AnnotationData$-Companion;
.super Ljava/lang/Object;
.source "AnnotationData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/AnnotationData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0008j\u0002`\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationData$-Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/result/AnnotationData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "annotationMeta",
        "Lorg/luckypray/dexkit/schema/-AnnotationMeta;",
        "Lorg/luckypray/dexkit/InnerAnnotationMeta;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;
    .locals 11
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "annotationMeta"    # Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    const-string v0, "bridge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationMeta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    nop

    .line 47
    nop

    .line 48
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getDexId-pVg5ArA()I

    move-result v3

    .line 49
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getTypeId-pVg5ArA()I

    move-result v4

    .line 50
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getTypeDescriptor()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 51
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getVisibility()B

    move-result v1

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;->from(B)Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    move-result-object v6

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    move-object v0, v7

    .local v0, "$this$from_u24lambda_u240":Ljava/util/List;
    const/4 v1, 0x0

    .line 53
    .local v1, "$i$a$-apply-AnnotationData$-Companion$from$1":I
    const/4 v2, 0x0

    .local v2, "i":I
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getElementsLength()I

    move-result v8

    :goto_0
    if-ge v2, v8, :cond_0

    .line 54
    sget-object v9, Lorg/luckypray/dexkit/result/AnnotationElementData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->elements(I)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v9, p1, v10}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/result/AnnotationElementData;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    .end local v2    # "i":I
    :cond_0
    nop

    .end local v0    # "$this$from_u24lambda_u240":Ljava/util/List;
    .end local v1    # "$i$a$-apply-AnnotationData$-Companion$from$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    nop

    .line 46
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationData;

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lorg/luckypray/dexkit/result/AnnotationData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    return-object v0
.end method
