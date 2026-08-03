.class public Lme/yun/silk/AacCodec$AudioInfo;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/yun/silk/AacCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AudioInfo"
.end annotation


# instance fields
.field channelCount:I

.field sampleRate:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lme/yun/silk/AacCodec$AudioInfo;->sampleRate:I

    .line 5
    .line 6
    iput p2, p0, Lme/yun/silk/AacCodec$AudioInfo;->channelCount:I

    .line 7
    .line 8
    return-void
.end method
