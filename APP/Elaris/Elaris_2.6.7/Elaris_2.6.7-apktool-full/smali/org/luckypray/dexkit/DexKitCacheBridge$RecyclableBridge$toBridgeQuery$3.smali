.class final synthetic Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3;
.super Lh6;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lu5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;)Lu5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh6;",
        "Lu5;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string v4, "build"

    .line 2
    .line 3
    const-string v5, "build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/FieldData;"

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const-class v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v2, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lg6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$3;->invoke(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Le1;->receiver:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeFieldBuilder;->build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/FieldData;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
