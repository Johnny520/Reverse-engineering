.class public final synthetic Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;
.super Lhx;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->getInternalList-hUnOzRk(Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;ZLhw;Lww;Lsw;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhx;",
        "Lhw;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v6, "ensureUsable()V"

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 6
    .line 7
    const-string v5, "ensureUsable"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v4, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lgx;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getInternalList$1;->invoke()V

    sget-object p0, Lna1;->a:Lna1;

    return-object p0
.end method

.method public final invoke()V
    .locals 0

    .line 1
    iget-object p0, p0, Lqc;->receiver:Ljava/lang/Object;

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
