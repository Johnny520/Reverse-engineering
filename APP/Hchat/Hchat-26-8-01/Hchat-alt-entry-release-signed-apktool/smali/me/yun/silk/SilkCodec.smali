.class public Lme/yun/silk/SilkCodec;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final MAX_DURATION_MS:J = 0xea60L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public native autoToPcm(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public native autoToSilk(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public native flacToPcm(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public native flacToSilk(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public native getDuration(Ljava/lang/String;)J
.end method

.method public getDurationLimited(Ljava/lang/String;)J
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lme/yun/silk/SilkCodec;->getDuration(Ljava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0xea60

    .line 6
    .line 7
    .line 8
    cmp-long p1, v0, v2

    .line 9
    .line 10
    if-lez p1, :cond_0

    .line 11
    .line 12
    return-wide v2

    .line 13
    :cond_0
    return-wide v0
.end method

.method public native getFileType(Ljava/lang/String;)I
.end method

.method public native mp3ToPcm(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public native mp3ToSilk(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public native oggToPcm(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public native oggToSilk(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public native pcmToSilk(Ljava/lang/String;Ljava/lang/String;III)I
.end method

.method public native silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public native silkToPcm(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public native wavToPcm(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public native wavToSilk(Ljava/lang/String;Ljava/lang/String;I)I
.end method
