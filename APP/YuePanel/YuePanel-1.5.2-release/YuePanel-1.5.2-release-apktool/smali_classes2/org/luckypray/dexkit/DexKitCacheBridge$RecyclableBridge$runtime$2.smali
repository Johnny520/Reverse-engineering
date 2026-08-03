.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->invoke()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
    .locals 10
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    new-instance v9, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 3
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getAppTag$p(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 5
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getReaperScheduler$p()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v3

    .line 6
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$1;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$1;

    .line 7
    new-instance v5, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;

    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    invoke-direct {v5, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$2;-><init>(Ljava/lang/Object;)V

    .line 8
    new-instance v6, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;

    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    invoke-direct {v6, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 9
    new-instance v7, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;

    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    invoke-direct {v7, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 10
    new-instance v8, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5;

    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    invoke-direct {v8, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    move-object v0, v9

    .line 11
    invoke-direct/range {v0 .. v8}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/util/concurrent/ScheduledThreadPoolExecutor;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)V

    return-object v9
.end method
