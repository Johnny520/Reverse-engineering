.class final Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;
.super Ljava/lang/ref/WeakReference;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
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


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0
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

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;->key:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry$KeyedWeakReference;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
