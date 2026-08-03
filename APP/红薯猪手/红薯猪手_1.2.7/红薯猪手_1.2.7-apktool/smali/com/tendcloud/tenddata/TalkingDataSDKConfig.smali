.class public Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    iput-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    return-void
.end method


# virtual methods
.method public getRules()I
    .locals 6

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    iget-boolean v1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-boolean v3, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    iget-boolean v4, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    if-eqz v4, :cond_2

    const/16 v4, 0x8

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    iget-boolean v5, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    if-eqz v5, :cond_3

    const/16 v2, 0x10

    :cond_3
    or-int/2addr v2, v4

    or-int/2addr v2, v3

    or-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method

.method public isAppListEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    return v0
.end method

.method public isIMEIAndMEIDEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    return v0
.end method

.method public isLocationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    return v0
.end method

.method public isMACEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    return v0
.end method

.method public isWiFiEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    return v0
.end method

.method public setAppListEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->c:Z

    return-object p0
.end method

.method public setIMEIAndMEIDEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->b:Z

    return-object p0
.end method

.method public setLocationEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->d:Z

    return-object p0
.end method

.method public setMACEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->a:Z

    return-object p0
.end method

.method public setWifiEnabled(Z)Lcom/tendcloud/tenddata/TalkingDataSDKConfig;
    .locals 0

    iput-boolean p1, p0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;->e:Z

    return-object p0
.end method
