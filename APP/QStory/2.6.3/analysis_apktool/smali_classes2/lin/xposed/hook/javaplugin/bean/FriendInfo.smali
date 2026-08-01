.class public Llin/xposed/hook/javaplugin/bean/FriendInfo;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public isVip:Z

.field public name:Ljava/lang/String;

.field public remark:Ljava/lang/String;

.field public uin:Ljava/lang/String;

.field public vipLevel:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Llin/xposed/hook/javaplugin/bean/FriendInfo;->isVip:Z

    .line 6
    .line 7
    iput v0, p0, Llin/xposed/hook/javaplugin/bean/FriendInfo;->vipLevel:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
