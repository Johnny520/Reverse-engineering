.class public final Lk8/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Z

.field public final j:Lh/Hchat/hooks/api/model/WeChatMessage;

.field public final k:Lh/Hchat/hooks/api/model/WeChatMessage;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:J

.field public final p:Lh/Hchat/hooks/api/model/WeChatTransferMsg;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;)V
    .locals 17

    .line 112
    const-string v14, ""

    const-wide/16 v15, 0x0

    const-string v12, ""

    const-string v13, ""

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v16}, Lk8/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLh/Hchat/hooks/api/model/WeChatMessage;Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    iput-object p1, p0, Lk8/o;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lk8/o;->b:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    move-object p1, p3

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object p1, v0

    .line 19
    :goto_1
    iput-object p1, p0, Lk8/o;->c:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    move-object p1, p4

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move-object p1, v0

    .line 26
    :goto_2
    iput-object p1, p0, Lk8/o;->d:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p5, :cond_3

    .line 29
    .line 30
    move-object p1, p5

    .line 31
    goto :goto_3

    .line 32
    :cond_3
    move-object p1, v0

    .line 33
    :goto_3
    iput-object p1, p0, Lk8/o;->e:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p6, :cond_4

    .line 36
    .line 37
    move-object p1, p6

    .line 38
    goto :goto_4

    .line 39
    :cond_4
    move-object p1, v0

    .line 40
    :goto_4
    iput-object p1, p0, Lk8/o;->f:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz p7, :cond_5

    .line 43
    .line 44
    goto :goto_5

    .line 45
    :cond_5
    move-object p7, v0

    .line 46
    :goto_5
    iput-object p7, p0, Lk8/o;->g:Ljava/lang/String;

    .line 47
    .line 48
    iput-boolean p8, p0, Lk8/o;->h:Z

    .line 49
    .line 50
    iput-boolean p9, p0, Lk8/o;->i:Z

    .line 51
    .line 52
    move-object/from16 p1, p10

    .line 53
    .line 54
    iput-object p1, p0, Lk8/o;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 55
    .line 56
    if-nez p11, :cond_6

    .line 57
    .line 58
    goto :goto_6

    .line 59
    :cond_6
    move-object/from16 p1, p11

    .line 60
    .line 61
    :goto_6
    if-nez p1, :cond_8

    .line 62
    .line 63
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_7

    .line 68
    .line 69
    move-object v2, p5

    .line 70
    goto :goto_7

    .line 71
    :cond_7
    move-object v2, p6

    .line 72
    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    move-object v0, p3

    .line 77
    move-object v1, p4

    .line 78
    move v5, p9

    .line 79
    invoke-static/range {v0 .. v5}, Lh/Hchat/hooks/api/model/WeChatMessage;->fromTransient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :cond_8
    iput-object p1, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 84
    .line 85
    move-object/from16 p2, p12

    .line 86
    .line 87
    iput-object p2, p0, Lk8/o;->l:Ljava/lang/String;

    .line 88
    .line 89
    move-object/from16 p2, p13

    .line 90
    .line 91
    iput-object p2, p0, Lk8/o;->m:Ljava/lang/String;

    .line 92
    .line 93
    move-object/from16 p2, p14

    .line 94
    .line 95
    iput-object p2, p0, Lk8/o;->n:Ljava/lang/String;

    .line 96
    .line 97
    move-wide/from16 p2, p15

    .line 98
    .line 99
    iput-wide p2, p0, Lk8/o;->o:J

    .line 100
    .line 101
    if-eqz p1, :cond_9

    .line 102
    .line 103
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->getTransferMsg()Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    goto :goto_8

    .line 108
    :cond_9
    const/4 p1, 0x0

    .line 109
    :goto_8
    iput-object p1, p0, Lk8/o;->p:Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getContent()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lk8/o;->e:Ljava/lang/String;

    .line 11
    .line 12
    return-object v0
.end method

.method public final b()Lh/Hchat/hooks/api/model/WeChatPatMsg;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lk8/o;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Lk8/o;->l:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lk8/o;->m:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getPatMsg()Lh/Hchat/hooks/api/model/WeChatPatMsg;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_2
    return-object v1

    .line 36
    :cond_3
    :goto_0
    new-instance v1, Lh/Hchat/hooks/api/model/WeChatPatMsg;

    .line 37
    .line 38
    iget-object v5, p0, Lk8/o;->n:Ljava/lang/String;

    .line 39
    .line 40
    iget-wide v6, p0, Lk8/o;->o:J

    .line 41
    .line 42
    iget-object v2, p0, Lk8/o;->c:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p0, Lk8/o;->l:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v4, p0, Lk8/o;->m:Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct/range {v1 .. v7}, Lh/Hchat/hooks/api/model/WeChatPatMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getSendTalker()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lk8/o;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getTalker()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lk8/o;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isAnnounceAll()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final f()Z
    .locals 2

    .line 1
    const-string v0, "app"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

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

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isAtMe()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final h()Z
    .locals 2

    .line 1
    const-string v0, "emoji"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isEmoji()Z

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

.method public final i()Z
    .locals 2

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

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

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final k()Z
    .locals 2

    .line 1
    const-string v0, "image"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImage()Z

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

.method public final l()Z
    .locals 2

    .line 1
    const-string v0, "link"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLink()Z

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

.method public final m()Z
    .locals 2

    .line 1
    const-string v0, "location"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLocation()Z

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

.method public final n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isNotifyAll()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final o()Z
    .locals 2

    .line 1
    const-string v0, "pat"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPat()Z

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

.method public final p()Z
    .locals 2

    .line 1
    const-string v0, "quote"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

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

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk8/o;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public final r()Z
    .locals 2

    .line 1
    const-string v0, "share_card"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isShareCard()Z

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

.method public final s()Z
    .locals 2

    .line 1
    const-string v0, "system"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSystem()Z

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

.method public final t()Z
    .locals 2

    .line 1
    const-string v0, "video"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideo()Z

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

.method public final u()Z
    .locals 2

    .line 1
    const-string v0, "voice"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

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

.method public final v()Z
    .locals 2

    .line 1
    const-string v0, "voip"

    .line 2
    .line 3
    iget-object v1, p0, Lk8/o;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoip()Z

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
