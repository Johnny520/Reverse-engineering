.class Lcom/tendcloud/tenddata/az$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final DEFAULT_MAX_BSS_ENTRIES:I = 0x32

.field public static final DEFAULT_MAX_FINGERPRINTS:I = 0xa

.field public static final DEFAULT_MIN_FINGERPRINTS:I = 0x3

.field public static final DEFAULT_RSSI_THRESHOLD:I = -0x55


# instance fields
.field private maxBssEntries:I

.field private maxFingerprints:I

.field private minFingerprints:I

.field private rssiThreshold:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->maxFingerprints:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->minFingerprints:I

    const/16 v0, 0x32

    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->maxBssEntries:I

    const/16 v0, -0x55

    iput v0, p0, Lcom/tendcloud/tenddata/az$b;->rssiThreshold:I

    return-void
.end method


# virtual methods
.method public getMaxBssEntries()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->maxBssEntries:I

    return v0
.end method

.method public getMaxFingerprints()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->maxFingerprints:I

    return v0
.end method

.method public getMinFingerprints()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->minFingerprints:I

    return v0
.end method

.method public getRssiThreshold()I
    .locals 1

    iget v0, p0, Lcom/tendcloud/tenddata/az$b;->rssiThreshold:I

    return v0
.end method

.method public setMaxBssEntries(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->maxBssEntries:I

    return-void
.end method

.method public setMaxFingerprints(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->maxFingerprints:I

    return-void
.end method

.method public setMinFingerprints(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->minFingerprints:I

    return-void
.end method

.method public setRssiThreshold(I)V
    .locals 0

    iput p1, p0, Lcom/tendcloud/tenddata/az$b;->rssiThreshold:I

    return-void
.end method
