.class public final synthetic Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getDirectInternalSingle-yxL6bBk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;La80;La80;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp80;",
        "Lp70;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "ensureUsable()V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 6
    .line 7
    const-string v4, "ensureUsable"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$1;->invoke()V

    sget-object p0, Ls62;->α:Ls62;

    return-object p0
.end method

.method public final invoke()V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 4
    .line 5
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->access$ensureUsable(Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
