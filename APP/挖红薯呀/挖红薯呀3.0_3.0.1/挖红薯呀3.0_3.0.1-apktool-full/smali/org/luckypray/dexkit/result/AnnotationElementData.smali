.class public final Lorg/luckypray/dexkit/result/AnnotationElementData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;


# instance fields
.field private final name:Ljava/lang/String;

.field private final value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationElementData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;)V
    .locals 6

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
    iput-object p2, v0, Lorg/luckypray/dexkit/result/AnnotationElementData;->name:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, v0, Lorg/luckypray/dexkit/result/AnnotationElementData;->value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;Lpl;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/AnnotationElementData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->name:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " = "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
