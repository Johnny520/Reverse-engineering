.class public Lcom/yuexin/panel/utils/entity/comment/CommentBean;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private aweme_id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "aweme_id"
    .end annotation
.end field

.field private cid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cid"
    .end annotation
.end field

.field private content_type:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "content_type"
    .end annotation
.end field

.field private send_name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "send_name"
    .end annotation
.end field

.field private send_uid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "send_uid"
    .end annotation
.end field

.field private status:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "status"
    .end annotation
.end field

.field private text:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text"
    .end annotation
.end field

.field private time:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time"
    .end annotation
.end field

.field private uid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "uid"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getAweme_id()Ljava/lang/String;
.end method

.method public native getCid()Ljava/lang/String;
.end method

.method public native getContent_type()I
.end method

.method public native getSend_name()Ljava/lang/String;
.end method

.method public native getSend_uid()Ljava/lang/String;
.end method

.method public native getStatus()I
.end method

.method public native getText()Ljava/lang/String;
.end method

.method public native getTime()J
.end method

.method public native getUid()Ljava/lang/String;
.end method

.method public native setAweme_id(Ljava/lang/String;)V
.end method

.method public native setCid(Ljava/lang/String;)V
.end method

.method public native setContent_type(I)V
.end method

.method public native setSend_name(Ljava/lang/String;)V
.end method

.method public native setSend_uid(Ljava/lang/String;)V
.end method

.method public native setStatus(I)V
.end method

.method public native setText(Ljava/lang/String;)V
.end method

.method public native setTime(J)V
.end method

.method public native setUid(Ljava/lang/String;)V
.end method
