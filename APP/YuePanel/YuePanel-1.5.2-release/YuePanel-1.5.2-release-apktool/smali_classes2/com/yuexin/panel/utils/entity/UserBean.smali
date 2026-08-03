.class public Lcom/yuexin/panel/utils/entity/UserBean;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# instance fields
.field private chatType:I

.field private id:Ljava/lang/String;

.field private isSwitch:Z

.field private msg:Ljava/lang/String;

.field private sendTime:J

.field private shortID:J

.field private sleep:I

.field private time:J

.field private uin:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x389

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native getChatType()I
.end method

.method public native getId()Ljava/lang/String;
.end method

.method public native getMsg()Ljava/lang/String;
.end method

.method public native getSendTime()J
.end method

.method public native getShortID()J
.end method

.method public native getSleep()I
.end method

.method public native getTime()J
.end method

.method public native getUin()Ljava/lang/String;
.end method

.method public native isSwitch()Z
.end method

.method public native setChatType(I)V
.end method

.method public native setId(Ljava/lang/String;)V
.end method

.method public native setMsg(Ljava/lang/String;)V
.end method

.method public native setSendTime(J)V
.end method

.method public native setShortID(J)V
.end method

.method public native setSleep(I)V
.end method

.method public native setSwitch(Z)V
.end method

.method public native setTime(J)V
.end method

.method public native setUin(Ljava/lang/String;)V
.end method
