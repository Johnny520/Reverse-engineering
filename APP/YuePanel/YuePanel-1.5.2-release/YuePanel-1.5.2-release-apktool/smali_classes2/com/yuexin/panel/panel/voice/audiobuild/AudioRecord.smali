.class public Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private audioFormat:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audioFormat"
    .end annotation
.end field

.field private audioId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audioId"
    .end annotation
.end field

.field private audioName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audioName"
    .end annotation
.end field

.field private audioSize:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audioSize"
    .end annotation
.end field

.field private auditStatus:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "auditStatus"
    .end annotation
.end field

.field private createTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "createTime"
    .end annotation
.end field

.field private downloadCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "downloadCount"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x181

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getAudioFormat()Ljava/lang/String;
.end method

.method public native getAudioId()Ljava/lang/String;
.end method

.method public native getAudioName()Ljava/lang/String;
.end method

.method public native getAudioSize()J
.end method

.method public native getAuditStatus()Ljava/lang/String;
.end method

.method public native getCreateTime()Ljava/lang/String;
.end method

.method public native getDownloadCount()I
.end method

.method public native setAudioFormat(Ljava/lang/String;)V
.end method

.method public native setAudioId(Ljava/lang/String;)V
.end method

.method public native setAudioName(Ljava/lang/String;)V
.end method

.method public native setAudioSize(J)V
.end method

.method public native setAuditStatus(Ljava/lang/String;)V
.end method

.method public native setCreateTime(Ljava/lang/String;)V
.end method

.method public native setDownloadCount(I)V
.end method
