.class final synthetic Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;
.super LYue/ۥۣۣ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->invoke()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "createBridge()Lorg/luckypray/dexkit/DexKitBridge;"

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-class v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const-string v4, "createBridge"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, LYue/ۥۣۣ۠ۦ;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;->invoke()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    iget-object v0, p0, LYue/ۥۣ۟ۦۦ;->receiver:Ljava/lang/Object;

    check-cast v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$createBridge(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    return-object v0
.end method
