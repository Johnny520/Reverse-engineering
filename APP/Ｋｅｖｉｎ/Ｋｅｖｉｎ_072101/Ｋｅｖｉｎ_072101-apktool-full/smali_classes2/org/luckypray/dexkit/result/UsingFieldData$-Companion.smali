.class public final Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;
.super Ljava/lang/Object;
.source "UsingFieldData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/UsingFieldData;
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
        "Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/result/UsingFieldData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "usingFieldMeta",
        "Lorg/luckypray/dexkit/schema/-UsingFieldMeta;",
        "Lorg/luckypray/dexkit/InnerUsingFieldMeta;",
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

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-UsingFieldMeta;)Lorg/luckypray/dexkit/result/UsingFieldData;
    .locals 5
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "usingFieldMeta"    # Lorg/luckypray/dexkit/schema/-UsingFieldMeta;

    const-string v0, "bridge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingFieldMeta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sget-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-UsingFieldMeta;->getField()Lorg/luckypray/dexkit/schema/-FieldMeta;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v0

    .line 14
    .local v0, "fieldData":Lorg/luckypray/dexkit/result/FieldData;
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-UsingFieldMeta;->getUsingType()B

    move-result v1

    .line 15
    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    sget-object v1, Lorg/luckypray/dexkit/result/FieldUsingType;->Read:Lorg/luckypray/dexkit/result/FieldUsingType;

    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    sget-object v1, Lorg/luckypray/dexkit/result/FieldUsingType;->Write:Lorg/luckypray/dexkit/result/FieldUsingType;

    .line 14
    :goto_0
    nop

    .line 19
    .local v1, "usingType":Lorg/luckypray/dexkit/result/FieldUsingType;
    new-instance v2, Lorg/luckypray/dexkit/result/UsingFieldData;

    invoke-direct {v2, v0, v1}, Lorg/luckypray/dexkit/result/UsingFieldData;-><init>(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)V

    return-object v2

    .line 17
    .end local v1    # "usingType":Lorg/luckypray/dexkit/result/FieldUsingType;
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-UsingFieldMeta;->getUsingType()B

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown using type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
