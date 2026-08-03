.class public Lcom/yuexin/panel/myClass/LinDuo/Response;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private resCode:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "resCode"
    .end annotation
.end field

.field private resMsg:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "resMsg"
    .end annotation
.end field

.field private sheetList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sheetList"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Sheet;",
            ">;"
        }
    .end annotation
.end field

.field private videoList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "videoList"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Video;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb1

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getResCode()Ljava/lang/Integer;
.end method

.method public native getResMsg()Ljava/lang/String;
.end method

.method public native getSheetList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Sheet;",
            ">;"
        }
    .end annotation
.end method

.method public native getVideoList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Video;",
            ">;"
        }
    .end annotation
.end method

.method public native setResCode(Ljava/lang/Integer;)V
.end method

.method public native setResMsg(Ljava/lang/String;)V
.end method

.method public native setSheetList(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Sheet;",
            ">;)V"
        }
    .end annotation
.end method

.method public native setVideoList(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Video;",
            ">;)V"
        }
    .end annotation
.end method
