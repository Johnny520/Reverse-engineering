.class public Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private createTime:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "create_time"
    .end annotation
.end field

.field private isDefault:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_default"
    .end annotation
.end field

.field private listName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "list_name"
    .end annotation
.end field

.field private listUid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "list_uid"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x427

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;->listUid:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;->listName:Ljava/lang/String;

    .line 5
    iput-boolean p2, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;->isDefault:Z

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;->createTime:J

    return-void
.end method


# virtual methods
.method public native getCreateTime()J
.end method

.method public native getListName()Ljava/lang/String;
.end method

.method public native getListUid()Ljava/lang/String;
.end method

.method public native isDefault()Z
.end method

.method public native setCreateTime(J)V
.end method

.method public native setDefault(Z)V
.end method

.method public native setListName(Ljava/lang/String;)V
.end method

.method public native setListUid(Ljava/lang/String;)V
.end method
