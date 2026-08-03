.class public Lcom/yuexin/panel/panel/voice/audiobuild/AudioResponse;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private code:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "code"
    .end annotation
.end field

.field private data:Lcom/yuexin/panel/panel/voice/audiobuild/AudioData;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "data"
    .end annotation
.end field

.field private msg:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "msg"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a1

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getCode()I
.end method

.method public native getData()Lcom/yuexin/panel/panel/voice/audiobuild/AudioData;
.end method

.method public native getMsg()Ljava/lang/String;
.end method

.method public native setCode(I)V
.end method

.method public native setData(Lcom/yuexin/panel/panel/voice/audiobuild/AudioData;)V
.end method

.method public native setMsg(Ljava/lang/String;)V
.end method
