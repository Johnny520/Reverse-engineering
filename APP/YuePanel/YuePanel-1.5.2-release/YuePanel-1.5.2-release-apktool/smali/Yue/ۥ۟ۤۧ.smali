.class public LYue/ۥ۟ۤۧ;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yuexin/panel/utils/entity/RegionInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile synthetic ۥ۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2ab

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LYue/ۥ۟ۤۧ;->ۥ:Ljava/util/Map;

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۤۧ;->ۥ۟۟(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native ۥ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/RegionEntity;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method

.method public static native ۥ۟(Ljava/lang/String;)Lcom/yuexin/panel/utils/entity/RegionInfo;
.end method

.method public static native ۥ۟۟(Landroid/content/Context;)V
.end method
