.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n*L\n236#1:1820\n236#1:1822\n236#1:1824\n236#1:1826\n236#1:1821\n236#1:1825\n236#1:1823\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2;->invoke()Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n*L\n236#1:1820\n236#1:1822\n236#1:1824\n236#1:1826\n236#1:1821\n236#1:1825\n236#1:1823\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;->invoke()V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4;->this$0:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 3
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 5
    sget-object v3, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    :try_start_0
    sget-object v3, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    const-string v3, "listener"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$getAppTag$p(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;->onBridgeReleased(Ljava/lang/String;)V

    .line 7
    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-static {v2}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    sget-object v3, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v2}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
