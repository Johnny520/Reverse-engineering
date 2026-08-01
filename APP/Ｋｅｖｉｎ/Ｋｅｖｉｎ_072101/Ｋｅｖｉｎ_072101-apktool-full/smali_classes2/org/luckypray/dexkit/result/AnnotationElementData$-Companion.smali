.class public final Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;
.super Ljava/lang/Object;
.source "AnnotationElementData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/AnnotationElementData;
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/result/AnnotationElementData;
    .locals 5
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "element"    # Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;

    const-string v0, "bridge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v0, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;-><init>()V

    invoke-virtual {p2, v0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->value(Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .local v0, "value":Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;
    new-instance v1, Lorg/luckypray/dexkit/result/AnnotationElementData;

    .line 44
    nop

    .line 45
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    sget-object v3, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    invoke-virtual {v3, p1, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    move-result-object v3

    .line 43
    const/4 v4, 0x0

    invoke-direct {v1, p1, v2, v3, v4}, Lorg/luckypray/dexkit/result/AnnotationElementData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
