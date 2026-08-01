.class public abstract Lorg/luckypray/dexkit/result/base/BaseData;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field private final bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field private final dexId:I

.field private final id:I


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 18
    iput p2, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    .line 19
    iput p3, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILzq;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move p3, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getBridge()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getBridge$dexkit_android_release()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDexId()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    .line 2
    .line 3
    return p0
.end method

.method public final getEncodeId()J
    .locals 2

    .line 1
    iget v0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lorg/luckypray/dexkit/result/base/BaseData;->dexId:I

    .line 6
    .line 7
    invoke-virtual {p0, v1, v0}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-string p0, "not has id"

    .line 13
    .line 14
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final getEncodeId(II)J
    .locals 2

    .line 20
    int-to-long p0, p1

    const/16 v0, 0x20

    shl-long/2addr p0, v0

    int-to-long v0, p2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public final getId()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/base/BaseData;->id:I

    .line 2
    .line 3
    return p0
.end method
