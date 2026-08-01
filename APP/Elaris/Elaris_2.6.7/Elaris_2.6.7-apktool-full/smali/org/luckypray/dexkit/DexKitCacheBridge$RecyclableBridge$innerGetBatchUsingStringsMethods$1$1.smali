.class final Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1;
.super Ld9;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lj5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;->innerGetBatchUsingStringsMethods(Ljava/lang/String;Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9;",
        "Lj5;"
    }
.end annotation


# instance fields
.field final synthetic $query:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1;->$query:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Ld9;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1;->invoke()Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final invoke()Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 6
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$innerGetBatchUsingStringsMethods$1$1;->$query:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    return-object p0
.end method
