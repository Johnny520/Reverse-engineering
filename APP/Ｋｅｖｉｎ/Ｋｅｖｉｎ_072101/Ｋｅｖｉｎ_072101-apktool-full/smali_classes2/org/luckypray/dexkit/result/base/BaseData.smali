.class public abstract Lorg/luckypray/dexkit/result/base/BaseData;
.super Ljava/lang/Object;
.source "BaseData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\t\n\u0000\u0008&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\r\u0010\u0008\u001a\u00020\u0003H\u0001\u00a2\u0006\u0002\u0008\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0010"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/base/BaseData;",
        "",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "id",
        "",
        "dexId",
        "(Lorg/luckypray/dexkit/DexKitBridge;II)V",
        "getBridge",
        "()Lorg/luckypray/dexkit/DexKitBridge;",
        "getDexId",
        "()I",
        "getId",
        "getBridge$dexkit_android_release",
        "getEncodeId",
        "",
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


# instance fields
.field private final bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field private final dexId:I

.field private final id:I


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 1
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "id"    # I
    .param p3, "dexId"    # I

    const-string v0, "bridge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 30
    iput p2, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    .line 31
    iput p3, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    .line 28
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 28
    and-int/lit8 p5, p4, 0x2

    const/4 v0, -0x1

    if-eqz p5, :cond_0

    .line 30
    move p2, v0

    .line 28
    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 31
    move p3, v0

    .line 28
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 42
    return-void
.end method


# virtual methods
.method protected final getBridge()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 29
    iget-object v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    return-object v0
.end method

.method public final getBridge$dexkit_android_release()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    .line 34
    iget-object v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    return-object v0
.end method

.method protected final getDexId()I
    .locals 1

    .line 31
    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    return v0
.end method

.method public final getEncodeId()J
    .locals 2

    .line 39
    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    if-ltz v0, :cond_0

    .line 40
    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    iget v1, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    move-result-wide v0

    return-wide v0

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not has id"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method protected final getEncodeId(II)J
    .locals 4
    .param p1, "dexId"    # I
    .param p2, "id"    # I

    .line 36
    int-to-long v0, p1

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    int-to-long v2, p2

    or-long/2addr v0, v2

    return-wide v0
.end method

.method protected final getId()I
    .locals 1

    .line 30
    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    return v0
.end method
