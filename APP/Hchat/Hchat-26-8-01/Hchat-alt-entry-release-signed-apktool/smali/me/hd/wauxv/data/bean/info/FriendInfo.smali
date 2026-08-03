.class public Lme/hd/wauxv/data/bean/info/FriendInfo;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final alias:Ljava/lang/String;

.field private final avatarBackupUrl:Ljava/lang/String;

.field private final avatarUrl:Ljava/lang/String;

.field private final city:Ljava/lang/String;

.field private final encryptedUsername:Ljava/lang/String;

.field private final gender:I

.field private final nickname:Ljava/lang/String;

.field private final province:Ljava/lang/String;

.field private final remark:Ljava/lang/String;

.field private final type:I

.field private final wxid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p2}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p3}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p4}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->alias:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p5}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->avatarUrl:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p6}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->avatarBackupUrl:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p7}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->encryptedUsername:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p8}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->province:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p9}, Lme/hd/wauxv/data/bean/info/FriendInfo;->safe(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->city:Ljava/lang/String;

    .line 57
    .line 58
    iput p10, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->gender:I

    .line 59
    .line 60
    iput p11, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->type:I

    .line 61
    .line 62
    return-void
.end method

.method private static safe(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method


# virtual methods
.method public getAlias()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->alias:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAvatarBackupUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->avatarBackupUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAvatarUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->city:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lme/hd/wauxv/data/bean/info/FriendInfo;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getEncryptedUsername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->encryptedUsername:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 1
    iget v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->gender:I

    .line 2
    .line 3
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " ("

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 33
    .line 34
    const-string v2, ")"

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_0
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 64
    .line 65
    return-object v0
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProvince()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->province:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRegion()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->province:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->city:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->province:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->city:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_0
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->province:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->province:Ljava/lang/String;

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->city:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->city:Ljava/lang/String;

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    const-string v0, ""

    .line 65
    .line 66
    return-object v0
.end method

.method public getRemark()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRemarkName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSex()I
    .locals 1

    .line 1
    iget v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->gender:I

    .line 2
    .line 3
    return v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWxId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWxid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isGroup()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "@chatroom"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "@im.chatroom"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public isOfficialAccount()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "gh_"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FriendInfo(wxid="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->wxid:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", nickname="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->nickname:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", remark="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/FriendInfo;->remark:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, ")"

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
