.class public final Ltop/suzhelan/sticker/sdk/net/StickerClientKt;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "getStickerApiService",
        "Ltop/suzhelan/sticker/sdk/net/StickerApiService;",
        "online-sticker-sdk_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getStickerApiService()Ltop/suzhelan/sticker/sdk/net/StickerApiService;
    .locals 1

    .line 1
    invoke-static {}, Ltop/suzhelan/sticker/sdk/net/StickerClient;->getApiService()Ltop/suzhelan/sticker/sdk/net/StickerApiService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
