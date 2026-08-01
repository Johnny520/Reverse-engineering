.class public final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final synthetic create$dexkit_android_release(Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;Lzq;)V

    return-object v0
.end method

.method public final synthetic create$dexkit_android_release(Ljava/lang/String;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;Lzq;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final synthetic create$dexkit_android_release(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;-><init>(Ljava/lang/String;Ljava/lang/String;[[BLjava/lang/ClassLoader;Lzq;)V

    return-object v0
.end method
