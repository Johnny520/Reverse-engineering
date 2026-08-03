.class Lcom/tendcloud/tenddata/az$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private band:B

.field private bssid:Ljava/lang/String;

.field private channel:B

.field private rssi:B

.field private ssid:Ljava/lang/String;

.field public final synthetic this$0:Lcom/tendcloud/tenddata/az;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/az;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$a;->this$0:Lcom/tendcloud/tenddata/az;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, ""

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$a;->ssid:Ljava/lang/String;

    const-string p1, "00:00:00:00:00:00"

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$a;->bssid:Ljava/lang/String;

    const/16 p1, -0x7f

    iput-byte p1, p0, Lcom/tendcloud/tenddata/az$a;->rssi:B

    const/4 p1, 0x1

    iput-byte p1, p0, Lcom/tendcloud/tenddata/az$a;->band:B

    iput-byte p1, p0, Lcom/tendcloud/tenddata/az$a;->channel:B

    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/az;Ljava/lang/String;Ljava/lang/String;BBB)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$a;->this$0:Lcom/tendcloud/tenddata/az;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/tendcloud/tenddata/az$a;->ssid:Ljava/lang/String;

    iput-object p3, p0, Lcom/tendcloud/tenddata/az$a;->bssid:Ljava/lang/String;

    iput-byte p4, p0, Lcom/tendcloud/tenddata/az$a;->rssi:B

    iput-byte p5, p0, Lcom/tendcloud/tenddata/az$a;->band:B

    iput-byte p6, p0, Lcom/tendcloud/tenddata/az$a;->channel:B

    return-void
.end method


# virtual methods
.method public cloneBssEntry()Lcom/tendcloud/tenddata/az$a;
    .locals 8

    new-instance v7, Lcom/tendcloud/tenddata/az$a;

    iget-object v1, p0, Lcom/tendcloud/tenddata/az$a;->this$0:Lcom/tendcloud/tenddata/az;

    iget-object v2, p0, Lcom/tendcloud/tenddata/az$a;->ssid:Ljava/lang/String;

    iget-object v3, p0, Lcom/tendcloud/tenddata/az$a;->bssid:Ljava/lang/String;

    iget-byte v4, p0, Lcom/tendcloud/tenddata/az$a;->rssi:B

    iget-byte v5, p0, Lcom/tendcloud/tenddata/az$a;->band:B

    iget-byte v6, p0, Lcom/tendcloud/tenddata/az$a;->channel:B

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/tendcloud/tenddata/az$a;-><init>(Lcom/tendcloud/tenddata/az;Ljava/lang/String;Ljava/lang/String;BBB)V

    return-object v7
.end method

.method public getBand()B
    .locals 1

    iget-byte v0, p0, Lcom/tendcloud/tenddata/az$a;->band:B

    return v0
.end method

.method public getBssid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/az$a;->bssid:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel()B
    .locals 1

    iget-byte v0, p0, Lcom/tendcloud/tenddata/az$a;->channel:B

    return v0
.end method

.method public getRssi()B
    .locals 1

    iget-byte v0, p0, Lcom/tendcloud/tenddata/az$a;->rssi:B

    return v0
.end method

.method public getSsid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/az$a;->ssid:Ljava/lang/String;

    return-object v0
.end method

.method public setBand(B)V
    .locals 0

    iput-byte p1, p0, Lcom/tendcloud/tenddata/az$a;->band:B

    return-void
.end method

.method public setBssid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$a;->bssid:Ljava/lang/String;

    return-void
.end method

.method public setChannel(B)V
    .locals 0

    iput-byte p1, p0, Lcom/tendcloud/tenddata/az$a;->channel:B

    return-void
.end method

.method public setRssi(B)V
    .locals 0

    iput-byte p1, p0, Lcom/tendcloud/tenddata/az$a;->rssi:B

    return-void
.end method

.method public setSsid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$a;->ssid:Ljava/lang/String;

    return-void
.end method
