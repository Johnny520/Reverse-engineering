.class final Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge;->create(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbp0;",
        "Lp70;"
    }
.end annotation


# instance fields
.field final synthetic $appTag:Ljava/lang/String;

.field final synthetic $dexArray:[[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[[B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;->$appTag:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;->$dexArray:[[B

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;->invoke()Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 2

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->Companion:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;->$appTag:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;->$dexArray:[[B

    .line 6
    .line 7
    invoke-virtual {v0, v1, p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$Companion;->create$dexkit_android_release(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
