.class final Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;",
        "Ljava/lang/ref/WeakReference;",
        "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
        "key",
        "",
        "referent",
        "q",
        "Ljava/lang/ref/ReferenceQueue;",
        "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/ref/ReferenceQueue;)V",
        "getKey",
        "()Ljava/lang/String;",
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

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "KeyedWeakReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
        ">;"
    }
.end annotation


# instance fields
.field private final key:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/ref/ReferenceQueue;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/ref/ReferenceQueue;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
            "Ljava/lang/ref/ReferenceQueue<",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referent"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "q"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;->key:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;->key:Ljava/lang/String;

    return-object v0
.end method
