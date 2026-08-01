.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetMethods(Ljava/lang/String;ZLorg/luckypray/dexkit/query/FindMethod;)Ljava/util/List;
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
.field final synthetic $query:Lorg/luckypray/dexkit/query/FindMethod;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/query/FindMethod;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1;->$query:Lorg/luckypray/dexkit/query/FindMethod;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1;->invoke()Lorg/luckypray/dexkit/query/FindMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/query/FindMethod;
    .locals 0

    .line 6
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1;->$query:Lorg/luckypray/dexkit/query/FindMethod;

    return-object p0
.end method
