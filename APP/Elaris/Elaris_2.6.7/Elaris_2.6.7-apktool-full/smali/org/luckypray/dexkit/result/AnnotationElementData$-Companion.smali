.class public final Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
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

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;)Lorg/luckypray/dexkit/result/AnnotationElementData;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->value(Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationElementData;

    .line 20
    .line 21
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationElementMeta;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    .line 29
    .line 30
    invoke-virtual {v1, p1, p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p1, p2, p0, v1}, Lorg/luckypray/dexkit/result/AnnotationElementData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;Lr2;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method
