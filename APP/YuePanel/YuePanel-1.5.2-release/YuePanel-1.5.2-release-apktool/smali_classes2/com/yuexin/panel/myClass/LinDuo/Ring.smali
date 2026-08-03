.class public Lcom/yuexin/panel/myClass/LinDuo/Ring;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
    name = "ring"
    strict = false
.end annotation


# static fields
.field private static volatile synthetic yue_xin_qwq0:Ljava/lang/String;


# instance fields
.field private artist:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private cid:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private date:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private duration:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private mp3url:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private name:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private rid:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field

.field private uid:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Attribute;
        required = false
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x268

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native getArtist()Ljava/lang/String;
.end method

.method public native getCid()Ljava/lang/String;
.end method

.method public native getDate()Ljava/lang/String;
.end method

.method public native getDuration()Ljava/lang/String;
.end method

.method public native getMp3url()Ljava/lang/String;
.end method

.method public native getName()Ljava/lang/String;
.end method

.method public native getRid()Ljava/lang/String;
.end method

.method public native getUid()Ljava/lang/String;
.end method

.method public native setArtist(Ljava/lang/String;)V
.end method

.method public native setCid(Ljava/lang/String;)V
.end method

.method public native setDate(Ljava/lang/String;)V
.end method

.method public native setDuration(Ljava/lang/String;)V
.end method

.method public native setMp3url(Ljava/lang/String;)V
.end method

.method public native setName(Ljava/lang/String;)V
.end method

.method public native setRid(Ljava/lang/String;)V
.end method

.method public native setUid(Ljava/lang/String;)V
.end method
