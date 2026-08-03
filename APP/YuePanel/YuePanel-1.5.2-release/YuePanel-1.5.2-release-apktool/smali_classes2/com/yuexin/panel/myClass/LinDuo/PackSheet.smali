.class public Lcom/yuexin/panel/myClass/LinDuo/PackSheet;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
    name = "sheet"
    strict = false
.end annotation


# instance fields
.field private page:Lcom/yuexin/panel/myClass/LinDuo/Page;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation

    .annotation runtime Lorg/simpleframework/xml/Element;
        name = "page"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xbf

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getPage()Lcom/yuexin/panel/myClass/LinDuo/Page;
.end method

.method public native setPage(Lcom/yuexin/panel/myClass/LinDuo/Page;)V
.end method
