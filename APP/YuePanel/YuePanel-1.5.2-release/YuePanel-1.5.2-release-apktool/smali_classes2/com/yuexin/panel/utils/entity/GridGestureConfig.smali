.class public Lcom/yuexin/panel/utils/entity/GridGestureConfig;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuexin/panel/utils/entity/GridGestureConfig$ۥ;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x134fdf5L

.field private static volatile synthetic yue_xin_qwq0:Ljava/lang/String;


# instance fields
.field public cells:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yuexin/panel/utils/entity/GridGestureConfig$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public cols:I

.field public rows:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x19b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/yuexin/panel/utils/entity/GridGestureConfig;->rows:I

    iput v0, p0, Lcom/yuexin/panel/utils/entity/GridGestureConfig;->cols:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yuexin/panel/utils/entity/GridGestureConfig;->cells:Ljava/util/Map;

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native deepCopy()Lcom/yuexin/panel/utils/entity/GridGestureConfig;
.end method

.method public native getCell(II)Lcom/yuexin/panel/utils/entity/GridGestureConfig$ۥ;
.end method

.method public native getOrCreateCell(II)Lcom/yuexin/panel/utils/entity/GridGestureConfig$ۥ;
.end method

.method public native hasConfig(II)Z
.end method

.method public native removeCell(II)V
.end method

.method public native setCell(IILcom/yuexin/panel/utils/entity/GridGestureConfig$ۥ;)V
.end method
