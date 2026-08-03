.class public Lcom/yuexin/panel/myClass/LinDuo/LinMainItems;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private desc:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private isPackage:Z

.field private name:Ljava/lang/String;

.field private packageCount:I

.field private size:J

.field private uploadName:Ljava/lang/String;

.field private uploadTime:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b7

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/yuexin/panel/myClass/LinDuo/LinMainItems;->isPackage:Z

    return-void
.end method


# virtual methods
.method public native getDesc()Ljava/lang/String;
.end method

.method public native getId()Ljava/lang/String;
.end method

.method public native getName()Ljava/lang/String;
.end method

.method public native getPackageCount()I
.end method

.method public native getSize()J
.end method

.method public native getUploadName()Ljava/lang/String;
.end method

.method public native getUploadTime()Ljava/lang/String;
.end method

.method public native getUrl()Ljava/lang/String;
.end method

.method public native isPackage()Z
.end method

.method public native setDesc(Ljava/lang/String;)V
.end method

.method public native setId(Ljava/lang/String;)V
.end method

.method public native setName(Ljava/lang/String;)V
.end method

.method public native setPackage(Z)V
.end method

.method public native setPackageCount(I)V
.end method

.method public native setSize(J)V
.end method

.method public native setUploadName(Ljava/lang/String;)V
.end method

.method public native setUploadTime(Ljava/lang/String;)V
.end method

.method public native setUrl(Ljava/lang/String;)V
.end method
