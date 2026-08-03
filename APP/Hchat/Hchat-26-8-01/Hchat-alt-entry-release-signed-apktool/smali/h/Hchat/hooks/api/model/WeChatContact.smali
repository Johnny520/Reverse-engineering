.class public final Lh/Hchat/hooks/api/model/WeChatContact;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# instance fields
.field public final avatarBackupUrl:Ljava/lang/String;

.field public final avatarUrl:Ljava/lang/String;

.field public final city:Ljava/lang/String;

.field public final customWxId:Ljava/lang/String;

.field public final encryptedUsername:Ljava/lang/String;

.field public final gender:I

.field public final nickname:Ljava/lang/String;

.field public final province:Ljava/lang/String;

.field public final remarkName:Ljava/lang/String;

.field public final type:I

.field public final wxId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p10, p0, Lh/Hchat/hooks/api/model/WeChatContact;->gender:I

    .line 5
    .line 6
    iput p11, p0, Lh/Hchat/hooks/api/model/WeChatContact;->type:I

    .line 7
    .line 8
    const-string p10, ""

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    move-object p1, p10

    .line 13
    :cond_0
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 14
    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    move-object p2, p10

    .line 18
    :cond_1
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 19
    .line 20
    if-nez p3, :cond_2

    .line 21
    .line 22
    move-object p3, p10

    .line 23
    :cond_2
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 24
    .line 25
    if-nez p4, :cond_3

    .line 26
    .line 27
    move-object p4, p10

    .line 28
    :cond_3
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 29
    .line 30
    if-nez p5, :cond_4

    .line 31
    .line 32
    move-object p5, p10

    .line 33
    :cond_4
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 34
    .line 35
    if-nez p6, :cond_5

    .line 36
    .line 37
    move-object p6, p10

    .line 38
    :cond_5
    iput-object p6, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 39
    .line 40
    if-nez p7, :cond_6

    .line 41
    .line 42
    move-object p7, p10

    .line 43
    :cond_6
    iput-object p7, p0, Lh/Hchat/hooks/api/model/WeChatContact;->encryptedUsername:Ljava/lang/String;

    .line 44
    .line 45
    if-nez p8, :cond_7

    .line 46
    .line 47
    move-object p8, p10

    .line 48
    :cond_7
    iput-object p8, p0, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 49
    .line 50
    if-nez p9, :cond_8

    .line 51
    .line 52
    move-object p9, p10

    .line 53
    :cond_8
    iput-object p9, p0, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final displayName()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 40
    .line 41
    const-string v2, " ("

    .line 42
    .line 43
    const-string v3, ")"

    .line 44
    .line 45
    invoke-static {v0, v2, v1, v3}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_4
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 73
    .line 74
    return-object v0
.end method

.method public final getAlias()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAvatarBackupUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCity()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getEncryptedUsername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->encryptedUsername:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGender()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->gender:I

    .line 2
    .line 3
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getNickName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProvince()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRegion()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, " "

    .line 22
    .line 23
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    const-string v0, ""

    .line 51
    .line 52
    return-object v0
.end method

.method public final getRemarkName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSex()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->gender:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWxId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWxid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isFriend()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->isOfficialAccount()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->type:I

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    and-int/2addr v0, v1

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final isGroup()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "@chatroom"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "@im.chatroom"

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v2

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public final isOfficialAccount()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "gh_"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method
