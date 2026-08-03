.class public Lcom/yuexin/panel/utils/entity/GroupBean;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private array:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/UserBean;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private time:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2e1

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getArray()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/UserBean;",
            ">;"
        }
    .end annotation
.end method

.method public native getId()Ljava/lang/String;
.end method

.method public native getName()Ljava/lang/String;
.end method

.method public native getTime()J
.end method

.method public native setArray(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/utils/entity/UserBean;",
            ">;)V"
        }
    .end annotation
.end method

.method public native setId(Ljava/lang/String;)V
.end method

.method public native setName(Ljava/lang/String;)V
.end method

.method public native setTime(J)V
.end method
