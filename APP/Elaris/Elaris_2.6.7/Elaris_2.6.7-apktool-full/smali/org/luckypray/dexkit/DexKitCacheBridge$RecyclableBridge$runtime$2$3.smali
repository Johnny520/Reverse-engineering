.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;
.super Ld9;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lj5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->invoke()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9;",
        "Lj5;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Ld9;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;->invoke()V

    sget-object p0, Lb5;->d:Lb5;

    return-object p0
.end method

.method public final invoke()V
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 4
    .line 5
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 24
    .line 25
    sget-object v2, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getAppTag$p(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onBridgeCreated(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method
