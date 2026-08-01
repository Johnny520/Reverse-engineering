.class public Llin/xposed/hook/login/model/User;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static currentUser:Llin/xposed/hook/login/model/User;


# instance fields
.field private identityName:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private uid:Ljava/lang/String;

.field private uin:Ljava/lang/String;

.field private userIdentity:I

.field private userLabel:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getCurrentUser()Llin/xposed/hook/login/model/User;
    .locals 2

    .line 1
    sget-object v0, Llin/xposed/hook/login/model/User;->currentUser:Llin/xposed/hook/login/model/User;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Llin/xposed/hook/login/model/User;

    .line 6
    .line 7
    invoke-direct {v0}, Llin/xposed/hook/login/model/User;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Llin/xposed/hook/login/model/User;->setUserIdentity(I)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x32d

    .line 15
    .line 16
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Llin/xposed/hook/login/model/User;->setName(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x32e

    .line 24
    .line 25
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Llin/xposed/hook/login/model/User;->setUin(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-object v0
.end method

.method public static setCurrentUser(Llin/xposed/hook/login/model/User;)V
    .locals 0

    .line 1
    sput-object p0, Llin/xposed/hook/login/model/User;->currentUser:Llin/xposed/hook/login/model/User;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public getIdentity()I
    .locals 0

    .line 1
    iget p0, p0, Llin/xposed/hook/login/model/User;->userIdentity:I

    .line 2
    .line 3
    return p0
.end method

.method public getIdentityName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/login/model/User;->identityName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/login/model/User;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/login/model/User;->uid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUin()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/login/model/User;->uin:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUserLabel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/login/model/User;->userLabel:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setIdentityName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/login/model/User;->identityName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/login/model/User;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/login/model/User;->uid:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setUin(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/login/model/User;->uin:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setUserIdentity(I)V
    .locals 0

    .line 1
    iput p1, p0, Llin/xposed/hook/login/model/User;->userIdentity:I

    .line 2
    .line 3
    return-void
.end method

.method public setUserLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/login/model/User;->userLabel:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
