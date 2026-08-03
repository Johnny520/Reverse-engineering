.class final Lcom/tendcloud/tenddata/bq;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# static fields
.field public static final a:J = 0x2bf20L


# instance fields
.field public b:J

.field public c:J

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tendcloud/tenddata/bq;->b:J

    iput-wide v0, p0, Lcom/tendcloud/tenddata/bq;->c:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/tendcloud/tenddata/bq;->e:I

    return-void
.end method

.method private a()V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/bm;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tendcloud/tenddata/bq$1;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/bq$1;-><init>(Lcom/tendcloud/tenddata/bq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public onCellLocationChanged(Landroid/telephony/CellLocation;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {p1}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/tendcloud/tenddata/bq;->d:I

    invoke-direct {p0}, Lcom/tendcloud/tenddata/bq;->a()V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/telephony/cdma/CdmaCellLocation;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, Landroid/telephony/cdma/CdmaCellLocation;

    invoke-virtual {p1}, Landroid/telephony/cdma/CdmaCellLocation;->getNetworkId()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_1
    :goto_1
    return-void
.end method
