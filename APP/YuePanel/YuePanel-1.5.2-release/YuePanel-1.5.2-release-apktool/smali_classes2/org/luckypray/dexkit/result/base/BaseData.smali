.class public abstract Lorg/luckypray/dexkit/result/base/BaseData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\t\n\u0000\u0008&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\r\u0010\u0008\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\u0008\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0010"
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
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final dexId:I

.field private final id:I


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "bridge"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 3
    iput p2, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    .line 4
    iput p3, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILYue/ۥ۟ۨۥۢ;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, -0x1

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    return-void
.end method


# virtual methods
.method public final getBridge()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    return-object v0
.end method

.method public final synthetic getBridge$dexkit_android_release()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    return-object v0
.end method

.method public final getDexId()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    return v0
.end method

.method public final getEncodeId()J
    .locals 2

    .line 2
    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    if-ltz v0, :cond_0

    .line 3
    iget v1, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    invoke-virtual {p0, v1, v0}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    move-result-wide v0

    return-wide v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not has id"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getEncodeId(II)J
    .locals 2

    .line 1
    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    int-to-long p1, p2

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    return v0
.end method
