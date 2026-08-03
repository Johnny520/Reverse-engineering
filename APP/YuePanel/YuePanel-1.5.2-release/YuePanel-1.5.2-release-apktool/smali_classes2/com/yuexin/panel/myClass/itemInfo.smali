.class public Lcom/yuexin/panel/myClass/itemInfo;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# static fields
.field private static volatile synthetic yue_xin_qwq0:Ljava/lang/String;


# instance fields
.field public activity:Z

.field public add:Z

.field public checkID:Ljava/lang/String;

.field public click:Z

.field public desc:Ljava/lang/String;

.field public dexKit:Z

.field public firstHook:Z

.field public id:Ljava/lang/String;

.field public isCheck:Z

.field public items:Z

.field public load:Z

.field public longClick:Z

.field public map:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public name:Ljava/lang/String;

.field public open:[Ljava/lang/String;

.field public permission:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->firstHook:Z

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->items:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/yuexin/panel/myClass/itemInfo;->load:Z

    iput-boolean v1, p0, Lcom/yuexin/panel/myClass/itemInfo;->dexKit:Z

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->activity:Z

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->add:Z

    invoke-static {v0}, Lcom/yuexin/panel/myClass/itemInfo;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/yuexin/panel/myClass/itemInfo;->desc:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->click:Z

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->longClick:Z

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->isCheck:Z

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/yuexin/panel/myClass/itemInfo;->map:Ljava/util/HashMap;

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method
