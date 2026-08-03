.class public final Lh/Hchat/hooks/items/script/ScriptMessageBean;
.super Lme/hd/wauxv/data/bean/MsgInfoBean;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final event:Lf8/g;

.field private final observed:Lk8/o;

.field private final stored:Lh/Hchat/hooks/api/model/WeChatMessage;


# direct methods
.method public constructor <init>(Lf8/g;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 119
    invoke-direct {p0, p1, v0, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;-><init>(Lf8/g;Lk8/o;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    return-void
.end method

.method private constructor <init>(Lf8/g;Lk8/o;Lh/Hchat/hooks/api/model/WeChatMessage;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lme/hd/wauxv/data/bean/MsgInfoBean;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 5
    .line 6
    iput-object p2, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 7
    .line 8
    iput-object p3, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 9
    .line 10
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getXml()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->xml:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->sender:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSenderId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->senderId:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSendTalker()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->sendTalker:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->talker:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalkerId()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->talkerId:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->content:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getText()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->text:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgId()J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    iput-wide p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgId:J

    .line 63
    .line 64
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgType:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getType()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->type:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getCreateTime()J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    iput-wide p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->createTime:J

    .line 81
    .line 82
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgSvrId()J

    .line 83
    .line 84
    .line 85
    move-result-wide p1

    .line 86
    iput-wide p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgSvrId:J

    .line 87
    .line 88
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgSource()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->msgSource:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSelfWxId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->selfWxId:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSource()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->source:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getKind()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->kind:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getNativeUrl()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean;->nativeUrl:Ljava/lang/String;

    .line 117
    .line 118
    return-void
.end method

.method public constructor <init>(Lh/Hchat/hooks/api/model/WeChatMessage;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 121
    invoke-direct {p0, v0, v0, p1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;-><init>(Lf8/g;Lk8/o;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    return-void
.end method

.method public constructor <init>(Lk8/o;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 120
    invoke-direct {p0, v0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;-><init>(Lf8/g;Lk8/o;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    return-void
.end method

.method private final callInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v3, v2

    .line 15
    move v4, v1

    .line 16
    :goto_0
    if-ge v4, v3, :cond_2

    .line 17
    .line 18
    aget-object v5, v2, v4

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-static {v6, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    array-length v6, v6

    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    move v6, v1

    .line 45
    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v5, v0

    .line 60
    :goto_2
    if-eqz v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {v5, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_3
    invoke-direct {p0, p1, p3}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->fieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    goto :goto_4

    .line 74
    :goto_3
    new-instance p2, Lsf/f;

    .line 75
    .line 76
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :goto_4
    instance-of p1, p2, Lsf/f;

    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_4
    move-object v0, p2

    .line 85
    :goto_5
    instance-of p1, v0, Ljava/lang/Number;

    .line 86
    .line 87
    if-eqz p1, :cond_6

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-gez p1, :cond_5

    .line 96
    .line 97
    goto :goto_7

    .line 98
    :cond_5
    move v1, p1

    .line 99
    goto :goto_7

    .line 100
    :cond_6
    instance-of p1, v0, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz p1, :cond_8

    .line 103
    .line 104
    check-cast v0, Ljava/lang/String;

    .line 105
    .line 106
    const/16 p1, 0xa

    .line 107
    .line 108
    invoke-static {p1, v0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    goto :goto_6

    .line 119
    :cond_7
    move p1, v1

    .line 120
    :goto_6
    if-gez p1, :cond_5

    .line 121
    .line 122
    :cond_8
    :goto_7
    return v1
.end method

.method private final callString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    if-ge v4, v2, :cond_2

    .line 20
    .line 21
    aget-object v7, v1, v4

    .line 22
    .line 23
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-static {v8, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-eqz v8, :cond_0

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    array-length v8, v8

    .line 41
    if-nez v8, :cond_0

    .line 42
    .line 43
    move v8, v5

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_4

    .line 47
    :cond_0
    move v8, v3

    .line 48
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v7, v6

    .line 63
    :goto_2
    if-eqz v7, :cond_4

    .line 64
    .line 65
    invoke-virtual {v7, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-eqz p2, :cond_4

    .line 76
    .line 77
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    xor-int/2addr v1, v5

    .line 82
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    move-object p2, v6

    .line 94
    :goto_3
    if-eqz p2, :cond_4

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_4
    invoke-direct {p0, p1, p3}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->fieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_5
    if-nez v6, :cond_6

    .line 108
    .line 109
    move-object p2, v0

    .line 110
    goto :goto_5

    .line 111
    :cond_6
    move-object p2, v6

    .line 112
    goto :goto_5

    .line 113
    :goto_4
    new-instance p2, Lsf/f;

    .line 114
    .line 115
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    :goto_5
    instance-of p1, p2, Lsf/f;

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_7
    move-object v0, p2

    .line 124
    :goto_6
    check-cast v0, Ljava/lang/String;

    .line 125
    .line 126
    return-object v0
.end method

.method private final fallbackQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v3, v1

    .line 21
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v5, v3

    .line 26
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getCreateTime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    move-object v6, v5

    .line 31
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isSend()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgSvrId()J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgSource()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSelfWxId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-static/range {v0 .. v10}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method private final fieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_1
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    aget-object v5, v2, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    move-object v1, v5

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    invoke-virtual {v1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return-object v1
.end method

.method private final varargs firstNotBlank([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    aget-object v2, p1, v1

    .line 9
    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v2

    .line 20
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0
.end method

.method private final kindOf(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "red_packet"

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string p1, "transfer"

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    const-string p1, "quote"

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    const-string p1, "file"

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPat()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    const-string p1, "pat"

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLink()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    const-string p1, "link"

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isMusic()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    const-string p1, "music"

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_6
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isNote()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    const-string p1, "note"

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_7
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideoNumberVideo()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_8

    .line 78
    .line 79
    const-string p1, "video_number_video"

    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_8
    iget p1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 83
    .line 84
    const/16 v0, 0x2712

    .line 85
    .line 86
    const/16 v1, 0x2710

    .line 87
    .line 88
    if-gtz p1, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    and-int/lit16 v2, p1, 0xff

    .line 92
    .line 93
    const v3, 0xffff

    .line 94
    .line 95
    .line 96
    and-int/2addr v3, p1

    .line 97
    ushr-int/lit8 v4, p1, 0x10

    .line 98
    .line 99
    if-nez v4, :cond_a

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_a
    if-eq v3, v1, :cond_c

    .line 103
    .line 104
    if-eq v3, v0, :cond_c

    .line 105
    .line 106
    if-eqz v2, :cond_b

    .line 107
    .line 108
    if-ne v3, v2, :cond_b

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_b
    :goto_0
    move v2, p1

    .line 112
    goto :goto_1

    .line 113
    :cond_c
    move v2, v3

    .line 114
    :goto_1
    const/4 v3, 0x1

    .line 115
    if-eq v2, v3, :cond_12

    .line 116
    .line 117
    const/4 v3, 0x3

    .line 118
    if-eq v2, v3, :cond_11

    .line 119
    .line 120
    const/16 v3, 0x22

    .line 121
    .line 122
    if-eq v2, v3, :cond_10

    .line 123
    .line 124
    const/16 v3, 0x2b

    .line 125
    .line 126
    if-eq v2, v3, :cond_f

    .line 127
    .line 128
    if-eq v2, v1, :cond_e

    .line 129
    .line 130
    if-eq v2, v0, :cond_d

    .line 131
    .line 132
    packed-switch v2, :pswitch_data_0

    .line 133
    .line 134
    .line 135
    const-string v0, "unknown("

    .line 136
    .line 137
    const-string v1, ")"

    .line 138
    .line 139
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :pswitch_0
    const-string p1, "app"

    .line 145
    .line 146
    return-object p1

    .line 147
    :pswitch_1
    const-string p1, "location"

    .line 148
    .line 149
    return-object p1

    .line 150
    :pswitch_2
    const-string p1, "emoji"

    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_d
    const-string p1, "recalled"

    .line 154
    .line 155
    return-object p1

    .line 156
    :cond_e
    const-string p1, "system"

    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_f
    const-string p1, "video"

    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_10
    const-string p1, "voice"

    .line 163
    .line 164
    return-object p1

    .line 165
    :cond_11
    const-string p1, "image"

    .line 166
    .line 167
    return-object p1

    .line 168
    :cond_12
    const-string p1, "text"

    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final storedSender(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final toWaImageMsg(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    instance-of v0, p1, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_1
    const-string v0, "getMd5"

    .line 11
    .line 12
    const-string v1, "md5"

    .line 13
    .line 14
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v0, "getBigImgUrl"

    .line 19
    .line 20
    const-string v1, "bigImgUrl"

    .line 21
    .line 22
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const-string v0, "getMidImgUrl"

    .line 27
    .line 28
    const-string v1, "midImgUrl"

    .line 29
    .line 30
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v0, "getThumbUrl"

    .line 35
    .line 36
    const-string v1, "thumbUrl"

    .line 37
    .line 38
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const-string v0, "getKey"

    .line 43
    .line 44
    const-string v1, "key"

    .line 45
    .line 46
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "getAesKey"

    .line 51
    .line 52
    const-string v2, "aesKey"

    .line 53
    .line 54
    invoke-direct {p0, p1, v1, v2}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callString(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    const-string v0, "getBigLength"

    .line 67
    .line 68
    const-string v1, "bigLength"

    .line 69
    .line 70
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    const-string v0, "getMidLength"

    .line 75
    .line 76
    const-string v1, "midLength"

    .line 77
    .line 78
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    const-string v0, "getThumbLength"

    .line 83
    .line 84
    const-string v1, "thumbLength"

    .line 85
    .line 86
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->callInt(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    new-instance v2, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;

    .line 91
    .line 92
    invoke-direct/range {v2 .. v10}, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    .line 93
    .line 94
    .line 95
    return-object v2
.end method


# virtual methods
.method public final getAtUserList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getAtUserList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getAtUserList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-eqz v0, :cond_3

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_3
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lk8/o;->e:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v1, v0, Lf8/g;->d:Ljava/lang/String;

    .line 29
    .line 30
    :cond_3
    if-nez v1, :cond_4

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_4
    return-object v1
.end method

.method public final getCreateTime()J
    .locals 8

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-wide v6, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 11
    .line 12
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    cmp-long v6, v6, v3

    .line 17
    .line 18
    if-lez v6, :cond_0

    .line 19
    .line 20
    move v6, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v6, v1

    .line 23
    :goto_0
    if-eqz v6, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v0, v5

    .line 27
    :goto_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0

    .line 34
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 35
    .line 36
    if-eqz v0, :cond_5

    .line 37
    .line 38
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getCreateTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move-wide v6, v3

    .line 48
    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    cmp-long v6, v6, v3

    .line 53
    .line 54
    if-lez v6, :cond_4

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_4
    if-eqz v1, :cond_5

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_5
    move-object v0, v5

    .line 61
    :goto_3
    if-eqz v0, :cond_6

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    return-wide v0

    .line 68
    :cond_6
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 69
    .line 70
    if-eqz v0, :cond_7

    .line 71
    .line 72
    iget-wide v0, v0, Lf8/g;->f:J

    .line 73
    .line 74
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    :cond_7
    if-eqz v5, :cond_8

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    return-wide v0

    .line 85
    :cond_8
    return-wide v3
.end method

.method public final getCreateTimeSeconds()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getCreateTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x174876e800L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    const-wide/16 v2, 0x3e8

    .line 15
    .line 16
    div-long/2addr v0, v2

    .line 17
    :cond_0
    return-wide v0
.end method

.method public final getFileMsg()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getFileMsg()Lh/Hchat/hooks/api/model/WeChatFileMsg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getFileMsg()Lh/Hchat/hooks/api/model/WeChatFileMsg;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_1
    return-object v1
.end method

.method public final getImageMsg()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getImageMsg()Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getImageMsg()Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, v1

    .line 27
    :goto_0
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->toWaImageMsg(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public final getKind()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->kindOf(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->b:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-nez v0, :cond_2

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_2
    return-object v0
.end method

.method public final getMessage()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public final getMsgId()J
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgId()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_1
    return-wide v1
.end method

.method public final getMsgSource()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const-string v2, ""

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v0, v1

    .line 31
    :goto_0
    if-eqz v0, :cond_3

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_3
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    iget-object v1, v0, Lf8/g;->h:Ljava/lang/String;

    .line 39
    .line 40
    :cond_4
    if-nez v1, :cond_5

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_5
    return-object v1
.end method

.method public final getMsgSvrId()J
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-wide v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 17
    .line 18
    return-wide v0

    .line 19
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-wide v0, v0, Lf8/g;->g:J

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_0
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_3
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    return-wide v0
.end method

.method public final getMsgType()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object v4, v3

    .line 23
    :goto_1
    if-eqz v4, :cond_2

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 37
    .line 38
    if-eqz v0, :cond_6

    .line 39
    .line 40
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getType()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move v0, v1

    .line 50
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-lez v0, :cond_4

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_4
    if-eqz v1, :cond_5

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_5
    move-object v4, v3

    .line 61
    :goto_3
    if-eqz v4, :cond_6

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :cond_6
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 73
    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    iget-object v3, v0, Lf8/g;->e:Ljava/lang/String;

    .line 77
    .line 78
    :cond_7
    if-nez v3, :cond_8

    .line 79
    .line 80
    const-string v0, ""

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_8
    return-object v3
.end method

.method public final getNativeUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->nativeUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->g:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-nez v0, :cond_2

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_2
    return-object v0
.end method

.method public final getPatMsg()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getPatMsg()Lh/Hchat/hooks/api/model/WeChatPatMsg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lk8/o;->b()Lh/Hchat/hooks/api/model/WeChatPatMsg;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method

.method public final getQuoteMsg()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->Companion:Leb/f0;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Leb/f0;->a(Lh/Hchat/hooks/api/model/WeChatQuoteMsg;)Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v0, v1

    .line 36
    :goto_0
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->Companion:Leb/f0;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Leb/f0;->a(Lh/Hchat/hooks/api/model/WeChatQuoteMsg;)Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_2
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->fallbackQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->Companion:Leb/f0;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Leb/f0;->a(Lh/Hchat/hooks/api/model/WeChatQuoteMsg;)Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_3
    return-object v1
.end method

.method public final getSelfWxId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lf8/g;->i:Ljava/lang/String;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_3

    .line 30
    .line 31
    const-string v0, ""

    .line 32
    .line 33
    :cond_3
    return-object v0
.end method

.method public final getSendTalker()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->storedSender(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lk8/o;->c()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz v0, :cond_2

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public final getSender()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->storedSender(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lk8/o;->d:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v1, v0, Lf8/g;->b:Ljava/lang/String;

    .line 29
    .line 30
    :cond_3
    if-nez v1, :cond_4

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_4
    return-object v1
.end method

.method public final getSenderId()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSendTalker()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "message_db"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, Lk8/o;->a:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, v0, Lf8/g;->j:Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_3

    .line 26
    .line 27
    const-string v0, ""

    .line 28
    .line 29
    :cond_3
    return-object v0
.end method

.method public final getStoredMessage()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lk8/o;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public final getTalker()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lk8/o;->c:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object v0, v1

    .line 19
    :goto_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v1, v0, Lf8/g;->c:Ljava/lang/String;

    .line 27
    .line 28
    :cond_3
    if-nez v1, :cond_4

    .line 29
    .line 30
    const-string v0, ""

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_4
    return-object v1
.end method

.method public final getTalkerId()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getTransferMsg()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getTransferMsg()Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->p:Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getVideoMsg()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getVideoMsg()Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getVideoMsg()Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method

.method public final getXml()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->xml()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lk8/o;->f:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v1, v0, Lf8/g;->a:Ljava/lang/String;

    .line 29
    .line 30
    :cond_3
    if-nez v1, :cond_4

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_4
    return-object v1
.end method

.method public final isAnnounceAll()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

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
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isApp()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isAppMsg()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isAppMsg()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->f()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v0, v1

    .line 36
    :goto_0
    if-gtz v0, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    and-int/lit16 v2, v0, 0xff

    .line 40
    .line 41
    const v3, 0xffff

    .line 42
    .line 43
    .line 44
    and-int/2addr v3, v0

    .line 45
    ushr-int/lit8 v4, v0, 0x10

    .line 46
    .line 47
    if-nez v4, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    const/16 v4, 0x2710

    .line 51
    .line 52
    if-eq v3, v4, :cond_5

    .line 53
    .line 54
    const/16 v4, 0x2712

    .line 55
    .line 56
    if-eq v3, v4, :cond_5

    .line 57
    .line 58
    if-eqz v2, :cond_6

    .line 59
    .line 60
    if-ne v3, v2, :cond_6

    .line 61
    .line 62
    move v0, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_5
    move v0, v3

    .line 65
    :cond_6
    :goto_1
    const/16 v2, 0x31

    .line 66
    .line 67
    if-ne v0, v2, :cond_7

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    :cond_7
    return v1
.end method

.method public final isAtMe()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

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
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSelfWxId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 24
    .line 25
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgSource()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3, v0}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Ll8/c;->h:Ll8/c;

    .line 41
    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    return v0

    .line 46
    :cond_2
    const/4 v0, 0x0

    .line 47
    return v0
.end method

.method public final isChatroom()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isChatroom()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isChatroom()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isGroupChat()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
.end method

.method public final isEmoji()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isEmoji()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "47"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public final isFile()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isGroupChat()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

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
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->j()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "@chatroom"

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0
.end method

.method public final isImChatroom()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImChatroom()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImChatroom()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, "@im.chatroom"

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    return v0
.end method

.method public final isImage()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImage()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->k()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "3"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public final isLink()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLink()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->l()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isLocation()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLocation()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->m()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "48"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public final isMusic()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isMusic()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const-string v2, "music"

    .line 16
    .line 17
    iget-object v3, v0, Lk8/o;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isMusic()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_3
    return v1
.end method

.method public final isNote()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isNote()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const-string v2, "note"

    .line 16
    .line 17
    iget-object v3, v0, Lk8/o;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isNote()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_3
    return v1
.end method

.method public final isNotifyAll()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

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
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->n()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isOfficialAccount()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOfficialAccount()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOfficialAccount()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    return v1
.end method

.method public final isOpenIM()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOpenIM()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOpenIM()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, "@openim"

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    return v0
.end method

.method public final isPat()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPat()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->o()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isPrivateChat()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPrivateChat()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPrivateChat()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isGroupChat()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v1
.end method

.method public final isQuote()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isRecalled()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRecalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const-string v2, "recalled"

    .line 16
    .line 17
    iget-object v3, v0, Lk8/o;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRecalled()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_3
    return v1
.end method

.method public final isRedBag()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isRedPacket()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isRedPacket()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v1, "red_packet"

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final isSelf()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isSend()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isSend()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->q()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->event:Lf8/g;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-boolean v0, v0, Lf8/g;->k:Z

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSelfWxId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    :goto_0
    const/4 v0, 0x1

    .line 49
    return v0

    .line 50
    :cond_3
    const/4 v0, 0x0

    .line 51
    return v0
.end method

.method public final isShareCard()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isShareCard()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->r()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isSystem()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSystem()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->s()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v0, v1

    .line 36
    :goto_0
    const/16 v2, 0x2712

    .line 37
    .line 38
    const/16 v3, 0x2710

    .line 39
    .line 40
    if-gtz v0, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    and-int/lit16 v4, v0, 0xff

    .line 44
    .line 45
    const v5, 0xffff

    .line 46
    .line 47
    .line 48
    and-int/2addr v5, v0

    .line 49
    ushr-int/lit8 v6, v0, 0x10

    .line 50
    .line 51
    if-nez v6, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    if-eq v5, v3, :cond_5

    .line 55
    .line 56
    if-eq v5, v2, :cond_5

    .line 57
    .line 58
    if-eqz v4, :cond_6

    .line 59
    .line 60
    if-ne v5, v4, :cond_6

    .line 61
    .line 62
    move v0, v4

    .line 63
    goto :goto_1

    .line 64
    :cond_5
    move v0, v5

    .line 65
    :cond_6
    :goto_1
    if-eq v0, v3, :cond_7

    .line 66
    .line 67
    if-ne v0, v2, :cond_8

    .line 68
    .line 69
    :cond_7
    const/4 v1, 0x1

    .line 70
    :cond_8
    return v1
.end method

.method public final isText()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v1, "text"

    .line 15
    .line 16
    iget-object v0, v0, Lk8/o;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "1"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public final isTransfer()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const-string v2, "transfer"

    .line 16
    .line 17
    iget-object v3, v0, Lk8/o;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_3
    return v1
.end method

.method public final isVideo()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideo()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_1

    .line 12
    .line 13
    iget v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 14
    .line 15
    const/16 v3, 0x3e

    .line 16
    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v2

    .line 21
    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    :cond_2
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v0}, Lk8/o;->t()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    return v0

    .line 39
    :cond_3
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v3, "43"

    .line 44
    .line 45
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v3, "62"

    .line 56
    .line 57
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    return v2

    .line 65
    :cond_5
    :goto_1
    return v1
.end method

.method public final isVideoNumberVideo()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideoNumberVideo()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const-string v2, "video_number_video"

    .line 16
    .line 17
    iget-object v3, v0, Lk8/o;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideoNumberVideo()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_3
    return v1
.end method

.method public final isVoice()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->u()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "34"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public final isVoip()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoip()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lk8/o;->v()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final isVoipVideo()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVideo()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVideo()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    return v1
.end method

.method public final isVoipVoice()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->stored:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVoice()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptMessageBean;->observed:Lk8/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVoice()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getTalker()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getSender()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMsgType()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->isSend()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getContent()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, ", sender="

    .line 22
    .line 23
    const-string v6, ", type="

    .line 24
    .line 25
    const-string v7, "ScriptMessageBean(talker="

    .line 26
    .line 27
    invoke-static {v7, v0, v5, v1, v6}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", send="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", content="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ")"

    .line 48
    .line 49
    invoke-static {v0, v4, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method
