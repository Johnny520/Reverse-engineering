.class Lme/yun/silk/AacCodec$DecodeResult;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/yun/silk/AacCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DecodeResult"
.end annotation


# instance fields
.field audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

.field code:I


# direct methods
.method public constructor <init>(ILme/yun/silk/AacCodec$AudioInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lme/yun/silk/AacCodec$DecodeResult;->code:I

    .line 5
    .line 6
    iput-object p2, p0, Lme/yun/silk/AacCodec$DecodeResult;->audioInfo:Lme/yun/silk/AacCodec$AudioInfo;

    .line 7
    .line 8
    return-void
.end method
