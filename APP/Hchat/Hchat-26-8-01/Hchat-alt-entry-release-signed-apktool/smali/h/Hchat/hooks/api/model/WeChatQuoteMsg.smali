.class public final Lh/Hchat/hooks/api/model/WeChatQuoteMsg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# instance fields
.field public final content:Ljava/lang/String;

.field public final createTime:J

.field public final displayName:Ljava/lang/String;

.field public final msgSource:Ljava/lang/String;

.field public final sendTalker:Ljava/lang/String;

.field public final strId:Ljava/lang/String;

.field public final svrId:J

.field public final talker:Ljava/lang/String;

.field public final title:Ljava/lang/String;

.field public final type:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 22
    .line 23
    iput p6, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 24
    .line 25
    iput-object p7, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 26
    .line 27
    iput-wide p8, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 28
    .line 29
    iput-object p10, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 30
    .line 31
    iput-wide p11, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic copy$default(Lh/Hchat/hooks/api/model/WeChatQuoteMsg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;JILjava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatQuoteMsg;
    .locals 0

    .line 1
    and-int/lit8 p14, p13, 0x1

    .line 2
    .line 3
    if-eqz p14, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p14, p13, 0x2

    .line 8
    .line 9
    if-eqz p14, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p14, p13, 0x4

    .line 14
    .line 15
    if-eqz p14, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p14, p13, 0x8

    .line 20
    .line 21
    if-eqz p14, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p14, p13, 0x10

    .line 26
    .line 27
    if-eqz p14, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p14, p13, 0x20

    .line 32
    .line 33
    if-eqz p14, :cond_5

    .line 34
    .line 35
    iget p6, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p14, p13, 0x40

    .line 38
    .line 39
    if-eqz p14, :cond_6

    .line 40
    .line 41
    iget-object p7, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p14, p13, 0x80

    .line 44
    .line 45
    if-eqz p14, :cond_7

    .line 46
    .line 47
    iget-wide p8, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 48
    .line 49
    :cond_7
    and-int/lit16 p14, p13, 0x100

    .line 50
    .line 51
    if-eqz p14, :cond_8

    .line 52
    .line 53
    iget-object p10, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 54
    .line 55
    :cond_8
    and-int/lit16 p13, p13, 0x200

    .line 56
    .line 57
    if-eqz p13, :cond_9

    .line 58
    .line 59
    iget-wide p11, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 60
    .line 61
    :cond_9
    move-wide p13, p11

    .line 62
    move-object p12, p10

    .line 63
    move-wide p10, p8

    .line 64
    move p8, p6

    .line 65
    move-object p9, p7

    .line 66
    move-object p6, p4

    .line 67
    move-object p7, p5

    .line 68
    move-object p4, p2

    .line 69
    move-object p5, p3

    .line 70
    move-object p2, p0

    .line 71
    move-object p3, p1

    .line 72
    invoke-virtual/range {p2 .. p14}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;J)Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component10()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component6()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component8()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;J)Lh/Hchat/hooks/api/model/WeChatQuoteMsg;
    .locals 13

    .line 1
    invoke-static/range {p1 .. p5}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move-object/from16 v3, p3

    .line 15
    .line 16
    move-object/from16 v4, p4

    .line 17
    .line 18
    move-object/from16 v5, p5

    .line 19
    .line 20
    move/from16 v6, p6

    .line 21
    .line 22
    move-object/from16 v7, p7

    .line 23
    .line 24
    move-wide/from16 v8, p8

    .line 25
    .line 26
    move-object/from16 v10, p10

    .line 27
    .line 28
    move-wide/from16 v11, p11

    .line 29
    .line 30
    invoke-direct/range {v0 .. v12}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 12
    .line 13
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 69
    .line 70
    iget v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 71
    .line 72
    if-eq v1, v3, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-wide v3, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 87
    .line 88
    iget-wide v5, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 89
    .line 90
    cmp-long v1, v3, v5

    .line 91
    .line 92
    if-eqz v1, :cond_9

    .line 93
    .line 94
    return v2

    .line 95
    :cond_9
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_a

    .line 104
    .line 105
    return v2

    .line 106
    :cond_a
    iget-wide v3, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 107
    .line 108
    iget-wide v5, p1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 109
    .line 110
    cmp-long p1, v3, v5

    .line 111
    .line 112
    if-eqz p1, :cond_b

    .line 113
    .line 114
    return v2

    .line 115
    :cond_b
    return v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMsgSource()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSendTalker()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStrId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSvrId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTalker()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 59
    .line 60
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v1, v0

    .line 65
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->msgSource:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->sendTalker:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->displayName:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->talker:Ljava/lang/String;

    .line 10
    .line 11
    iget v5, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->type:I

    .line 12
    .line 13
    iget-object v6, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 14
    .line 15
    iget-wide v7, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->svrId:J

    .line 16
    .line 17
    iget-object v9, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->strId:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v10, p0, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->createTime:J

    .line 20
    .line 21
    const-string v12, ", msgSource="

    .line 22
    .line 23
    const-string v13, ", sendTalker="

    .line 24
    .line 25
    const-string v14, "WeChatQuoteMsg(title="

    .line 26
    .line 27
    invoke-static {v14, v0, v12, v1, v13}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, ", displayName="

    .line 32
    .line 33
    const-string v12, ", talker="

    .line 34
    .line 35
    invoke-static {v0, v2, v1, v3, v12}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", type="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ", content="

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", svrId="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", strId="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", createTime="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, ")"

    .line 79
    .line 80
    invoke-static {v0, v10, v11, v1}, Leh/a;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0
.end method
