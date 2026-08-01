.class public final synthetic Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;
.super Lh6;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lj5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getInternalList-hUnOzRk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;ZLj5;Ly5;Lu5;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh6;",
        "Lj5;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    .line 1
    const-string v4, "ensureUsable"

    .line 2
    .line 3
    const-string v5, "ensureUsable()V"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-class v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v2, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lg6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;->invoke()V

    sget-object p0, Lb5;->d:Lb5;

    return-object p0
.end method

.method public final invoke()V
    .locals 0

    .line 1
    iget-object p0, p0, Le1;->receiver:Ljava/lang/Object;

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
