.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc50;",
        "Lhw;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 49
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->invoke()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
    .locals 9

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 4
    .line 5
    invoke-static {v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getAppTag$p(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 10
    .line 11
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getReaperScheduler$p()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$1;

    .line 16
    .line 17
    new-instance v5, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;

    .line 18
    .line 19
    iget-object v6, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v6, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;

    .line 25
    .line 26
    iget-object v7, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 27
    .line 28
    invoke-direct {v6, v7}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 29
    .line 30
    .line 31
    new-instance v7, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;

    .line 32
    .line 33
    iget-object v8, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 34
    .line 35
    invoke-direct {v7, v8}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 36
    .line 37
    .line 38
    new-instance v8, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5;

    .line 39
    .line 40
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 41
    .line 42
    invoke-direct {v8, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v0 .. v8}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lhw;Lhw;Lhw;Lhw;Lhw;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method
