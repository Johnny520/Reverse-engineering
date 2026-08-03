.class public Lme/hd/wauxv/data/bean/MsgInfoBean;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;
    }
.end annotation


# instance fields
.field public content:Ljava/lang/String;

.field public createTime:J

.field public kind:Ljava/lang/String;

.field public msgId:J

.field public msgSource:Ljava/lang/String;

.field public msgSvrId:J

.field public msgType:Ljava/lang/String;

.field public nativeUrl:Ljava/lang/String;

.field public selfWxId:Ljava/lang/String;

.field public sendTalker:Ljava/lang/String;

.field public sender:Ljava/lang/String;

.field public senderId:Ljava/lang/String;

.field public source:Ljava/lang/String;

.field public talker:Ljava/lang/String;

.field public talkerId:Ljava/lang/String;

.field public text:Ljava/lang/String;

.field public type:Ljava/lang/String;

.field public xml:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->xml:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->sender:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->senderId:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->sendTalker:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->talker:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->talkerId:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->content:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->text:Ljava/lang/String;

    .line 21
    .line 22
    const-wide/16 v1, 0x0

    .line 23
    .line 24
    iput-wide v1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgId:J

    .line 25
    .line 26
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgType:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->type:Ljava/lang/String;

    .line 29
    .line 30
    iput-wide v1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->createTime:J

    .line 31
    .line 32
    iput-wide v1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgSvrId:J

    .line 33
    .line 34
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgSource:Ljava/lang/String;

    .line 35
    .line 36
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->selfWxId:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->source:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->kind:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->nativeUrl:Ljava/lang/String;

    .line 43
    .line 44
    return-void
.end method
