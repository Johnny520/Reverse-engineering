.class public final enum Lcom/tendcloud/tenddata/TalkingDataSharingFilter;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tendcloud/tenddata/TalkingDataSharingFilter;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ONLY_INSTALL:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

.field public static final enum SHARE:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

.field public static final enum UNSHARE:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

.field private static final synthetic a:[Lcom/tendcloud/tenddata/TalkingDataSharingFilter;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    const-string v1, "SHARE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->SHARE:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    new-instance v1, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    const-string v3, "ONLY_INSTALL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->ONLY_INSTALL:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    new-instance v3, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    const-string v5, "UNSHARE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->UNSHARE:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->a:[Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tendcloud/tenddata/TalkingDataSharingFilter;
    .locals 1

    const-class v0, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    return-object p0
.end method

.method public static values()[Lcom/tendcloud/tenddata/TalkingDataSharingFilter;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->a:[Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    invoke-virtual {v0}, [Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    return-object v0
.end method
