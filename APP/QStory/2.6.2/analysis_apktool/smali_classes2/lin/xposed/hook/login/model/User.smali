.class public Llin/xposed/hook/login/model/User;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
    .locals 3

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
    const-wide v1, -0x36a549ee051405a7L    # -2.3827197181355223E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Llin/xposed/hook/login/model/User;->setName(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-wide v1, -0x36a549d7051405a7L    # -2.382751024113279E45

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Llin/xposed/hook/login/model/User;->setUin(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
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
