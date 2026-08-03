.class public Lcom/yuexin/panel/panel/voice/audiobuild/AudioData;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private audioRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "audioRecords"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;",
            ">;"
        }
    .end annotation
.end field

.field private current:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current"
    .end annotation
.end field

.field private pages:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pages"
    .end annotation
.end field

.field private remainingPages:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "remainingPages"
    .end annotation
.end field

.field private total:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x183

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getAudioRecords()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;",
            ">;"
        }
    .end annotation
.end method

.method public native getCurrent()I
.end method

.method public native getPages()I
.end method

.method public native getRemainingPages()I
.end method

.method public native getTotal()I
.end method

.method public native setAudioRecords(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;",
            ">;)V"
        }
    .end annotation
.end method

.method public native setCurrent(I)V
.end method

.method public native setPages(I)V
.end method

.method public native setRemainingPages(I)V
.end method

.method public native setTotal(I)V
.end method
