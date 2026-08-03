.class public Lcom/yuexin/panel/myClass/LinDuo/Sheet;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private desc:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "desc"
    .end annotation
.end field

.field private favCount:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "favCount"
    .end annotation
.end field

.field private isPrivate:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "isPrivate"
    .end annotation
.end field

.field private modifyTime:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "modifyTime"
    .end annotation
.end field

.field private orderMode:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "orderMode"
    .end annotation
.end field

.field private playCount:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "playCount"
    .end annotation
.end field

.field private ringCount:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ringCount"
    .end annotation
.end field

.field private sheetId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sheetId"
    .end annotation
.end field

.field private sheetImg:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sheetImg"
    .end annotation
.end field

.field private showInSquare:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "showInSquare"
    .end annotation
.end field

.field private tags:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tags"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private timestamp:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field private title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private uid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "uid"
    .end annotation
.end field

.field private updateTime:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updateTime"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x21d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getDesc()Ljava/lang/String;
.end method

.method public native getFavCount()Ljava/lang/Integer;
.end method

.method public native getModifyTime()Ljava/lang/Long;
.end method

.method public native getOrderMode()Ljava/lang/Integer;
.end method

.method public native getPlayCount()Ljava/lang/Integer;
.end method

.method public native getPrivate()Ljava/lang/Boolean;
.end method

.method public native getRingCount()Ljava/lang/Integer;
.end method

.method public native getSheetId()Ljava/lang/Integer;
.end method

.method public native getSheetImg()Ljava/lang/String;
.end method

.method public native getShowInSquare()Ljava/lang/Integer;
.end method

.method public native getTags()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public native getTimestamp()Ljava/lang/Long;
.end method

.method public native getTitle()Ljava/lang/String;
.end method

.method public native getUid()Ljava/lang/String;
.end method

.method public native getUpdateTime()Ljava/lang/Long;
.end method

.method public native setDesc(Ljava/lang/String;)V
.end method

.method public native setFavCount(Ljava/lang/Integer;)V
.end method

.method public native setModifyTime(Ljava/lang/Long;)V
.end method

.method public native setOrderMode(Ljava/lang/Integer;)V
.end method

.method public native setPlayCount(Ljava/lang/Integer;)V
.end method

.method public native setPrivate(Ljava/lang/Boolean;)V
.end method

.method public native setRingCount(Ljava/lang/Integer;)V
.end method

.method public native setSheetId(Ljava/lang/Integer;)V
.end method

.method public native setSheetImg(Ljava/lang/String;)V
.end method

.method public native setShowInSquare(Ljava/lang/Integer;)V
.end method

.method public native setTags(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public native setTimestamp(Ljava/lang/Long;)V
.end method

.method public native setTitle(Ljava/lang/String;)V
.end method

.method public native setUid(Ljava/lang/String;)V
.end method

.method public native setUpdateTime(Ljava/lang/Long;)V
.end method
