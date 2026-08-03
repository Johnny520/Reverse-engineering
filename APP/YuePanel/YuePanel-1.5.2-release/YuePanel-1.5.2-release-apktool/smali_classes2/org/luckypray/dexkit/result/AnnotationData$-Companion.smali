.class public final Lorg/luckypray/dexkit/result/AnnotationData$-Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;
    .locals 9
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/schema/-AnnotationMeta;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "bridge"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationMeta"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getDexId-pVg5ArA()I

    move-result v3

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getTypeId-pVg5ArA()I

    move-result v4

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getTypeDescriptor()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getVisibility()B

    move-result v1

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;->from(B)Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->getElementsLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationElementData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;->elements(I)Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;

    move-result-object v8

    invoke-static {v8}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v8}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/result/AnnotationElementData;

    move-result-object v2

    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance p2, Lorg/luckypray/dexkit/result/AnnotationData;

    const/4 v8, 0x0

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lorg/luckypray/dexkit/result/AnnotationData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;LYue/ۥ۟ۨۥۢ;)V

    return-object p2
.end method
