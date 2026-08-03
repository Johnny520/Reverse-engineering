.class public final Lorg/luckypray/dexkit/result/AnnotationElementData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationElementData;",
        "Lorg/luckypray/dexkit/result/base/BaseData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "name",
        "",
        "value",
        "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
        "(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;)V",
        "getName",
        "()Ljava/lang/String;",
        "getValue",
        "()Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
        "toString",
        "-Companion",
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private final name:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationElementData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationElementData$-Companion;

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;)V
    .locals 6

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILYue/ۥ۟ۨۥۢ;)V

    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/AnnotationElementData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lorg/luckypray/dexkit/result/AnnotationEncodeValue;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationElementData;->value:Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
