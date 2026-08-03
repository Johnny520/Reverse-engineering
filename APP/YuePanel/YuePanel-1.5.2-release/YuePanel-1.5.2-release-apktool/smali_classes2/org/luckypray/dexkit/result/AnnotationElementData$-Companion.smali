.class public final Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0008j\u0002`\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/result/AnnotationElementData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "element",
        "Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;",
        "Lorg/luckypray/dexkit/InnerAnnotationElementMeta;",
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
    value = Lorg/luckypray/dexkit/result/AnnotationElementData;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/result/AnnotationElementData;
    .locals 3
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "bridge"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;-><init>()V

    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->value(Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lorg/luckypray/dexkit/result/AnnotationElementData;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    invoke-virtual {v2, p1, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v0, v2}, Lorg/luckypray/dexkit/result/AnnotationElementData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;LYue/ۥ۟ۨۥۢ;)V

    return-object v1
.end method
