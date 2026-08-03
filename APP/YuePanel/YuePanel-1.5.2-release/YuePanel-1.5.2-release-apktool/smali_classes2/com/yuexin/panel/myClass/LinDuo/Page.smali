.class public Lcom/yuexin/panel/myClass/LinDuo/Page;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
    name = "page"
    strict = false
.end annotation


# instance fields
.field private baseurl:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private expire:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private hasmore:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private num:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private ringList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Ring;",
            ">;"
        }
    .end annotation

    .annotation runtime Lorg/simpleframework/xml/ElementList;
        empty = true
        entry = "ring"
        inline = true
        required = false
    .end annotation
.end field

.field private sig:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getBaseurl()Ljava/lang/String;
.end method

.method public native getExpire()Ljava/lang/String;
.end method

.method public native getHasmore()Ljava/lang/String;
.end method

.method public native getNum()Ljava/lang/String;
.end method

.method public native getRingList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Ring;",
            ">;"
        }
    .end annotation
.end method

.method public native getSig()Ljava/lang/String;
.end method

.method public native setBaseurl(Ljava/lang/String;)V
.end method

.method public native setExpire(Ljava/lang/String;)V
.end method

.method public native setHasmore(Ljava/lang/String;)V
.end method

.method public native setNum(Ljava/lang/String;)V
.end method

.method public native setRingList(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/myClass/LinDuo/Ring;",
            ">;)V"
        }
    .end annotation
.end method

.method public native setSig(Ljava/lang/String;)V
.end method
