.class final synthetic Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2;
.super LYue/ۥۣۣ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


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
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->toBridgeQuery(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;)LYue/ۥۣ۠ۡ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e3\u06e3\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "Lorg/luckypray/dexkit/result/ClassData;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;

    const-string v4, "build"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, LYue/ۥۣۣ۠ۦ;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$toBridgeQuery$2;->invoke(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, LYue/ۥۣ۟ۦۦ;->receiver:Ljava/lang/Object;

    check-cast v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;

    invoke-interface {v0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$BridgeClassBuilder;->build(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p1

    return-object p1
.end method
