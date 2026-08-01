.class public final Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0008\u0010\u0003\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR$\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000e\u0010\u0003\u001a\u0004\u0008\u000f\u0010\n\"\u0004\u0008\u0010\u0010\u000cR$\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0012\u0010\u0003\u001a\u0004\u0008\u0013\u0010\n\"\u0004\u0008\u0014\u0010\u000c\u00a8\u0006\u0015"
    }
    d2 = {
        "Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;",
        "",
        "<init>",
        "()V",
        "BASE_URL",
        "",
        "SIGN_SECRET",
        "STICKER_DIR",
        "getSTICKER_DIR$annotations",
        "getSTICKER_DIR",
        "()Ljava/lang/String;",
        "setSTICKER_DIR",
        "(Ljava/lang/String;)V",
        "USER_UIN",
        "getUSER_UIN$annotations",
        "getUSER_UIN",
        "setUSER_UIN",
        "USER_NICKNAME",
        "getUSER_NICKNAME$annotations",
        "getUSER_NICKNAME",
        "setUSER_NICKNAME",
        "online-sticker-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final BASE_URL:Ljava/lang/String; = "https://sticker.suzhelan.top/api/v1/"

.field public static final INSTANCE:Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;

.field public static final SIGN_SECRET:Ljava/lang/String; = "UHa6q8eD7T4qzqpksbXX"

.field private static STICKER_DIR:Ljava/lang/String;

.field private static USER_NICKNAME:Ljava/lang/String;

.field private static USER_UIN:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->INSTANCE:Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    sput-object v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->STICKER_DIR:Ljava/lang/String;

    .line 11
    .line 12
    sput-object v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->USER_UIN:Ljava/lang/String;

    .line 13
    .line 14
    sput-object v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->USER_NICKNAME:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final getSTICKER_DIR()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->STICKER_DIR:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getSTICKER_DIR$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getUSER_NICKNAME()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->USER_NICKNAME:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getUSER_NICKNAME$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getUSER_UIN()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->USER_UIN:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getUSER_UIN$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final setSTICKER_DIR(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->STICKER_DIR:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final setUSER_NICKNAME(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->USER_NICKNAME:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final setUSER_UIN(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Ltop/suzhelan/sticker/sdk/net/StickerSdkConfig;->USER_UIN:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method
