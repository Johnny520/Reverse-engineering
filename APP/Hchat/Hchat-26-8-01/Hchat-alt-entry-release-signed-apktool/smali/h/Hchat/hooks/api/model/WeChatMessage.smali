.class public final Lh/Hchat/hooks/api/model/WeChatMessage;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x0

.field private static final AT_ALL_LABELS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Ll8/d;

.field private static final MAX_WECHAT_AT_LENGTH:I = 0x28

.field private static final WECHAT_AT_SEPARATOR:C = '\u2005'


# instance fields
.field public final content:Ljava/lang/String;

.field public final createTime:J

.field public final flag:I

.field public final imagePath:Ljava/lang/String;

.field public final isSend:I

.field public final msgId:J

.field public final msgSource:Ljava/lang/String;

.field public final msgSvrId:J

.field public final reserved:Ljava/lang/String;

.field public final selfWxId:Ljava/lang/String;

.field public final status:I

.field public final talker:Ljava/lang/String;

.field public final translatedContent:Ljava/lang/String;

.field public final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ll8/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 7
    .line 8
    const-string v0, "\u5168\u54e1"

    .line 9
    .line 10
    const-string v1, "\ubaa8\ub450"

    .line 11
    .line 12
    const-string v2, "\u6240\u6709\u4eba"

    .line 13
    .line 14
    const-string v3, "all"

    .line 15
    .line 16
    const-string v4, "everyone"

    .line 17
    .line 18
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->AT_ALL_LABELS:Ljava/util/Set;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 18

    .line 63
    const-string v16, ""

    .line 64
    const-string v17, ""

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-wide/from16 v8, p8

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    .line 65
    invoke-direct/range {v0 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;-><init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 5
    .line 6
    iput-wide p3, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 7
    .line 8
    iput p5, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 9
    .line 10
    iput p6, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->status:I

    .line 11
    .line 12
    iput p7, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 13
    .line 14
    iput-wide p8, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 15
    .line 16
    iput p15, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->flag:I

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    if-nez p10, :cond_0

    .line 21
    .line 22
    move-object p10, p1

    .line 23
    :cond_0
    iput-object p10, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 24
    .line 25
    if-nez p11, :cond_1

    .line 26
    .line 27
    move-object p11, p1

    .line 28
    :cond_1
    iput-object p11, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 29
    .line 30
    if-nez p12, :cond_2

    .line 31
    .line 32
    move-object p12, p1

    .line 33
    :cond_2
    iput-object p12, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 34
    .line 35
    if-nez p13, :cond_3

    .line 36
    .line 37
    move-object p13, p1

    .line 38
    :cond_3
    iput-object p13, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->reserved:Ljava/lang/String;

    .line 39
    .line 40
    if-nez p14, :cond_4

    .line 41
    .line 42
    move-object p2, p1

    .line 43
    goto :goto_0

    .line 44
    :cond_4
    move-object p2, p14

    .line 45
    :goto_0
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->translatedContent:Ljava/lang/String;

    .line 46
    .line 47
    if-nez p16, :cond_5

    .line 48
    .line 49
    move-object p2, p1

    .line 50
    goto :goto_1

    .line 51
    :cond_5
    move-object/from16 p2, p16

    .line 52
    .line 53
    :goto_1
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSource:Ljava/lang/String;

    .line 54
    .line 55
    if-nez p17, :cond_6

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_6
    move-object/from16 p1, p17

    .line 59
    .line 60
    :goto_2
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    .line 61
    .line 62
    return-void
.end method

.method public static final synthetic access$getAT_ALL_LABELS$cp()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->AT_ALL_LABELS:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final classifyAtMention(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final effectiveAtUserList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p1, p2, :cond_1

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    if-eq p1, p2, :cond_0

    .line 19
    .line 20
    invoke-static {p0}, Ll8/d;->j(Ljava/lang/String;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    const-string p0, "announcement@all"

    .line 26
    .line 27
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    const-string p0, "notify@all"

    .line 33
    .line 34
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static final extractXml(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ll8/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final fromTransient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 12

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Ll8/d;->f(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v7

    .line 10
    const-string v10, ""

    .line 11
    .line 12
    const-string v11, ""

    .line 13
    .line 14
    const-wide/16 v8, 0x0

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object v3, p2

    .line 19
    move-wide v4, p3

    .line 20
    move/from16 v6, p5

    .line 21
    .line 22
    invoke-static/range {v1 .. v11}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final fromTransient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJ)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 12

    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    const-string v10, ""

    const-string v11, ""

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-wide/from16 v8, p7

    invoke-static/range {v1 .. v11}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    move-result-object p0

    return-object p0
.end method

.method public static final fromTransient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 1

    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-static/range {p0 .. p10}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    move-result-object p0

    return-object p0
.end method

.method public static final inferType(Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ll8/d;->f(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static final isAtMeMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Ll8/c;->h:Ll8/c;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static final isGroupTalker(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static final isNotifyAllMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Ll8/c;->i:Ll8/c;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static final isVideoNumberContent(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ll8/d;->h(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static final msgSourceValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final parseAtUserList(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ll8/d;->j(Ljava/lang/String;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final quoteSender(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    filled-new-array {p2, p1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {v0, p1}, Ll8/d;->b(Ll8/d;[Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-static {p2}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {v0, p1}, Ll8/d;->b(Ll8/d;[Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    filled-new-array {p2, p1}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method private final quoteTalker(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-static {p2}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return-object p2

    .line 20
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object p1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public static final transient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 12

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Ll8/d;->f(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v7

    .line 10
    const-string v10, ""

    .line 11
    .line 12
    const-string v11, ""

    .line 13
    .line 14
    const-wide/16 v8, 0x0

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object v3, p2

    .line 19
    move-wide v4, p3

    .line 20
    move/from16 v6, p5

    .line 21
    .line 22
    invoke-static/range {v1 .. v11}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final transient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJ)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 12

    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    const-string v10, ""

    const-string v11, ""

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-wide/from16 v8, p7

    invoke-static/range {v1 .. v11}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    move-result-object p0

    return-object p0
.end method

.method public static final transient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;
    .locals 1

    .line 27
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p0 .. p10}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    move-result-object p0

    return-object p0
.end method

.method public static final xmlAttr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final xmlSection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Ll8/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final xmlTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final appMsgType()I
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "type"

    .line 11
    .line 12
    invoke-static {v1, v0}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public final bodyContent()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    const-string v3, ":\n"

    .line 6
    .line 7
    invoke-static {v0, v3, v1, v1, v2}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 29
    .line 30
    return-object v0
.end method

.method public final getAppMsgType()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final getAtMentionType()Ll8/c;
    .locals 4

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2, v3}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final getAtUserList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ll8/d;->j(Ljava/lang/String;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getEffectiveAtUserList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getAtMentionType()Ll8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getAtUserList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const-string v0, "announcement@all"

    .line 21
    .line 22
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_1
    const-string v0, "notify@all"

    .line 28
    .line 29
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final getFileMsg()Lh/Hchat/hooks/api/model/WeChatFileMsg;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v1, "title"

    .line 19
    .line 20
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "filename"

    .line 25
    .line 26
    invoke-static {v0, v2}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    new-instance v3, Lh/Hchat/hooks/api/model/WeChatFileMsg;

    .line 39
    .line 40
    const-string v1, "totallen"

    .line 41
    .line 42
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v5

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string v1, "length"

    .line 58
    .line 59
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const-wide/16 v5, 0x0

    .line 71
    .line 72
    :goto_1
    const-string v1, "fileext"

    .line 73
    .line 74
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/16 v7, 0x2e

    .line 79
    .line 80
    const-string v8, ""

    .line 81
    .line 82
    invoke-static {v4, v7, v8}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    filled-new-array {v1, v7}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const-string v1, "filemd5"

    .line 95
    .line 96
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v8, "md5"

    .line 101
    .line 102
    invoke-static {v0, v8}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    const-string v9, "cdnthumbmd5"

    .line 107
    .line 108
    invoke-static {v0, v9}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    filled-new-array {v1, v8, v9}, [Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    const-string v1, "cdnattachurl"

    .line 121
    .line 122
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v9, "attachid"

    .line 127
    .line 128
    invoke-static {v0, v9}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    const-string v11, "url"

    .line 133
    .line 134
    invoke-static {v0, v11}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    filled-new-array {v1, v10, v11}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const-string v10, "aeskey"

    .line 147
    .line 148
    invoke-static {v0, v10}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    const-string v11, "cdnthumbaeskey"

    .line 153
    .line 154
    invoke-static {v0, v11}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    invoke-static {v10}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-static {v0, v9}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    invoke-static {v0, v2}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    move-object v9, v1

    .line 175
    invoke-direct/range {v3 .. v12}, Lh/Hchat/hooks/api/model/WeChatFileMsg;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v3
.end method

.method public final getImageMsg()Lh/Hchat/hooks/api/model/WeChatImageMsg;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImage()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 14
    .line 15
    sget-object v2, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v2, "md5"

    .line 21
    .line 22
    invoke-static {v0, v2}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v0, v2}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "cdnbigimgurl"

    .line 39
    .line 40
    invoke-static {v0, v3}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v4, "cdnmidimgurl"

    .line 57
    .line 58
    invoke-static {v0, v4}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    filled-new-array {v5, v4}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v4}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "cdnthumburl"

    .line 75
    .line 76
    invoke-static {v0, v5}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-static {v0, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    filled-new-array {v6, v5}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v5}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    const-string v6, "aeskey"

    .line 93
    .line 94
    invoke-static {v0, v6}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-static {v0, v6}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    filled-new-array {v7, v6}, [Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v6}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-string v7, "hdlength"

    .line 111
    .line 112
    invoke-static {v0, v7}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {v0, v7}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    filled-new-array {v8, v7}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-static {v7}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    const/16 v8, 0xa

    .line 129
    .line 130
    invoke-static {v8, v7}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    const/4 v9, 0x0

    .line 135
    if-eqz v7, :cond_1

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    goto :goto_0

    .line 142
    :cond_1
    move v7, v9

    .line 143
    :goto_0
    const-string v10, "length"

    .line 144
    .line 145
    invoke-static {v0, v10}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    invoke-static {v0, v10}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    filled-new-array {v11, v10}, [Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-static {v10}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    invoke-static {v8, v10}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    if-eqz v10, :cond_2

    .line 166
    .line 167
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    goto :goto_1

    .line 172
    :cond_2
    move v10, v9

    .line 173
    :goto_1
    const-string v11, "cdnthumblength"

    .line 174
    .line 175
    invoke-static {v0, v11}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-static {v0, v11}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    filled-new-array {v12, v0}, [Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v8, v0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-eqz v0, :cond_3

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    :cond_3
    move v8, v10

    .line 202
    invoke-direct/range {v1 .. v9}, Lh/Hchat/hooks/api/model/WeChatImageMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    .line 203
    .line 204
    .line 205
    return-object v1
.end method

.method public final getMsgId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMsgSource()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSource:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "msgsource"

    .line 11
    .line 12
    invoke-static {v2, v0}, Ll8/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3, v0}, Ll8/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->reserved:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v4, v0}, Ll8/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ll8/d;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public final getPatMsg()Lh/Hchat/hooks/api/model/WeChatPatMsg;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPat()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    new-instance v1, Lh/Hchat/hooks/api/model/WeChatPatMsg;

    .line 14
    .line 15
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, ""

    .line 22
    .line 23
    iget-wide v6, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 24
    .line 25
    invoke-direct/range {v1 .. v7}, Lh/Hchat/hooks/api/model/WeChatPatMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public final getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    return-object v1

    .line 11
    :cond_0
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v3, "refermsg"

    .line 21
    .line 22
    invoke-static {v1, v3}, Ll8/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "fromusr"

    .line 35
    .line 36
    invoke-static {v3, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-string v5, "referfromusr"

    .line 41
    .line 42
    invoke-static {v1, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const-string v6, "fromusername"

    .line 47
    .line 48
    invoke-static {v1, v6}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v2, v4}, Ll8/d;->a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-string v5, "chatusr"

    .line 65
    .line 66
    invoke-static {v3, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v6, "refertowusr"

    .line 71
    .line 72
    invoke-static {v1, v6}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v5}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v2, v5}, Ll8/d;->a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    new-instance v6, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 89
    .line 90
    const-string v7, "title"

    .line 91
    .line 92
    invoke-static {v1, v7}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v2, v7}, Ll8/d;->a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    const-string v8, "msgsource"

    .line 101
    .line 102
    invoke-static {v3, v8}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-static {v2, v8}, Ll8/d;->a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-direct {v0, v4, v5}, Lh/Hchat/hooks/api/model/WeChatMessage;->quoteSender(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    const-string v10, "displayname"

    .line 115
    .line 116
    invoke-static {v3, v10}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-static {v2, v10}, Ll8/d;->a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-direct {v0, v4, v5}, Lh/Hchat/hooks/api/model/WeChatMessage;->quoteTalker(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    const-string v4, "refermsgtype"

    .line 129
    .line 130
    invoke-static {v1, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    const-string v5, "type"

    .line 135
    .line 136
    invoke-static {v3, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    const/16 v5, 0xa

    .line 149
    .line 150
    invoke-static {v5, v4}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    if-eqz v4, :cond_1

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    :goto_0
    move v12, v4

    .line 161
    goto :goto_1

    .line 162
    :cond_1
    const/4 v4, 0x0

    .line 163
    goto :goto_0

    .line 164
    :goto_1
    const-string v4, "content"

    .line 165
    .line 166
    invoke-static {v3, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    const-string v5, "refermsgcontent"

    .line 171
    .line 172
    invoke-static {v1, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-static {v4}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v2, v4}, Ll8/d;->a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    const-string v4, "svrid"

    .line 189
    .line 190
    invoke-static {v3, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    const-string v5, "refermsgid"

    .line 195
    .line 196
    invoke-static {v1, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    filled-new-array {v4, v1}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const-wide/16 v4, 0x0

    .line 213
    .line 214
    if-eqz v1, :cond_2

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v14

    .line 220
    goto :goto_2

    .line 221
    :cond_2
    move-wide v14, v4

    .line 222
    :goto_2
    const-string v1, "strid"

    .line 223
    .line 224
    invoke-static {v3, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v2, v1}, Ll8/d;->a(Ll8/d;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v16

    .line 232
    const-string v1, "createtime"

    .line 233
    .line 234
    invoke-static {v3, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    if-eqz v1, :cond_3

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 245
    .line 246
    .line 247
    move-result-wide v4

    .line 248
    :cond_3
    move-wide/from16 v17, v4

    .line 249
    .line 250
    invoke-direct/range {v6 .. v18}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;J)V

    .line 251
    .line 252
    .line 253
    return-object v6
.end method

.method public final getSendTalker()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getTalker()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransferMsg()Lh/Hchat/hooks/api/model/WeChatTransferMsg;
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v1, "total_fee"

    .line 19
    .line 20
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "feederval"

    .line 25
    .line 26
    invoke-static {v0, v2}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "fee"

    .line 31
    .line 32
    invoke-static {v0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-wide/16 v2, 0x0

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    move-wide v13, v4

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-wide v13, v2

    .line 59
    :goto_0
    new-instance v6, Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 60
    .line 61
    const-string v1, "transcationid"

    .line 62
    .line 63
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v4, "transactionid"

    .line 68
    .line 69
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "transaction_id"

    .line 74
    .line 75
    invoke-static {v0, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    filled-new-array {v1, v4, v5}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const-string v1, "transferid"

    .line 88
    .line 89
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v4, "transfer_id"

    .line 94
    .line 95
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const-string v5, "trans_id"

    .line 100
    .line 101
    invoke-static {v0, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    filled-new-array {v1, v4, v5}, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    const-string v1, "payer_username"

    .line 114
    .line 115
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v4, "payerusername"

    .line 120
    .line 121
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const-string v5, "username"

    .line 126
    .line 127
    invoke-static {v0, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual/range {p0 .. p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    filled-new-array {v1, v4, v5, v9}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    const-string v1, "receiver_username"

    .line 144
    .line 145
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const-string v4, "receiverusername"

    .line 150
    .line 151
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    filled-new-array {v1, v4}, [Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    const-string v1, "invalidtime"

    .line 164
    .line 165
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    if-eqz v1, :cond_2

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 176
    .line 177
    .line 178
    move-result-wide v2

    .line 179
    :cond_2
    move-wide v11, v2

    .line 180
    const-string v1, "pay_memo"

    .line 181
    .line 182
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-string v2, "feedesc"

    .line 187
    .line 188
    invoke-static {v0, v2}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const-string v3, "desc"

    .line 193
    .line 194
    invoke-static {v0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    const-string v4, "title"

    .line 199
    .line 200
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v1}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    invoke-static {v0}, Ll8/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    invoke-direct/range {v6 .. v16}, Lh/Hchat/hooks/api/model/WeChatTransferMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-object v6
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public final getVideoMsg()Lh/Hchat/hooks/api/model/WeChatVideoMsg;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 8
    .line 9
    const/16 v1, 0x3e

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 20
    .line 21
    sget-object v2, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v2, "md5"

    .line 27
    .line 28
    invoke-static {v0, v2}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v0, v2}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "newmd5"

    .line 45
    .line 46
    invoke-static {v0, v3}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v3}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-string v4, "cdnvideourl"

    .line 63
    .line 64
    invoke-static {v0, v4}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    filled-new-array {v5, v4}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-string v5, "aeskey"

    .line 81
    .line 82
    invoke-static {v0, v5}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v0, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    filled-new-array {v6, v5}, [Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v5}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const-string v6, "length"

    .line 99
    .line 100
    invoke-static {v0, v6}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-static {v0, v6}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    filled-new-array {v7, v6}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v6}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v6}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-eqz v6, :cond_1

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v6

    .line 126
    goto :goto_0

    .line 127
    :cond_1
    const-wide/16 v6, 0x0

    .line 128
    .line 129
    :goto_0
    const-string v8, "playlength"

    .line 130
    .line 131
    invoke-static {v0, v8}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    invoke-static {v0, v8}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    filled-new-array {v9, v0}, [Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, Ll8/d;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const/16 v8, 0xa

    .line 148
    .line 149
    invoke-static {v8, v0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-eqz v0, :cond_2

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    :goto_1
    move v8, v0

    .line 160
    goto :goto_2

    .line 161
    :cond_2
    const/4 v0, 0x0

    .line 162
    goto :goto_1

    .line 163
    :goto_2
    invoke-direct/range {v1 .. v8}, Lh/Hchat/hooks/api/model/WeChatVideoMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 164
    .line 165
    .line 166
    return-object v1
.end method

.method public final isAnnounceAll()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getAtMentionType()Ll8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ll8/c;->j:Ll8/c;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final isApp()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v2, v0

    .line 12
    ushr-int/lit8 v3, v0, 0x10

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v3, 0x2710

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x2712

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :cond_3
    :goto_0
    const/16 v1, 0x31

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_1

    .line 38
    :cond_4
    const/4 v0, 0x0

    .line 39
    :goto_1
    return v0
.end method

.method public final isAtMe()Z
    .locals 1

    .line 26
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isAtMe(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final isAtMe(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2, p1}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Ll8/c;->h:Ll8/c;

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public final isChatroom()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

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
    return v0
.end method

.method public final isEmoji()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v2, v0

    .line 12
    ushr-int/lit8 v3, v0, 0x10

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v3, 0x2710

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x2712

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :cond_3
    :goto_0
    const/16 v1, 0x2f

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_4
    const/4 v0, 0x0

    .line 39
    return v0
.end method

.method public final isFile()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v3, 0x1

    .line 18
    if-lez v1, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x6

    .line 21
    if-ne v1, v0, :cond_1

    .line 22
    .line 23
    return v3

    .line 24
    :cond_1
    return v2

    .line 25
    :cond_2
    const-string v1, "<fileext>"

    .line 26
    .line 27
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_4

    .line 32
    .line 33
    const-string v1, "<filename>"

    .line 34
    .line 35
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    const-string v1, "<cdnattachurl>"

    .line 42
    .line 43
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return v2

    .line 51
    :cond_4
    :goto_0
    return v3
.end method

.method public final isFromGroup()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isGroupChat()Z
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final isImChatroom()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "@im.chatroom"

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
    return v0
.end method

.method public final isImage()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v2, v0

    .line 12
    ushr-int/lit8 v3, v0, 0x10

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v3, 0x2710

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x2712

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :cond_3
    :goto_0
    const/4 v1, 0x3

    .line 33
    if-ne v0, v1, :cond_4

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_4
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method public final isIncoming()Z
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final isLink()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x5

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final isLocation()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v2, v0

    .line 12
    ushr-int/lit8 v3, v0, 0x10

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v3, 0x2710

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x2712

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :cond_3
    :goto_0
    const/16 v1, 0x30

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_4
    const/4 v0, 0x0

    .line 39
    return v0
.end method

.method public final isMiniProgram()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x21

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x24

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public final isMusic()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0x4c

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public final isNote()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v3, 0x35

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eq v1, v3, :cond_0

    .line 20
    .line 21
    const-string v1, "solitaire"

    .line 22
    .line 23
    invoke-static {v0, v1, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const-string v1, "\u63a5\u9f99"

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    :cond_0
    return v4

    .line 38
    :cond_1
    return v2
.end method

.method public final isNotifyAll()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getAtMentionType()Ll8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ll8/c;->i:Ll8/c;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final isOfficialAccount()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "@app"

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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "gh_"

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, "newsapp"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v2

    .line 34
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 35
    return v0
.end method

.method public final isOpenIM()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "@openim"

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
    return v0
.end method

.method public final isOutgoing()Z
    .locals 2

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final isPat()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSystem()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const-string v1, "pattedUser"

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const-string v1, "pattedusername"

    .line 22
    .line 23
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const-string v1, "\u62cd\u4e86\u62cd"

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    :cond_0
    return v3

    .line 38
    :cond_1
    return v2
.end method

.method public final isPrivateChat()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOfficialAccount()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final isQuote()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x39

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    const-string v1, "<refermsg>"

    .line 15
    .line 16
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string v1, "<referfromusr>"

    .line 23
    .line 24
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const-string v1, "<refermsgid>"

    .line 31
    .line 32
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    :cond_1
    :goto_0
    return v3
.end method

.method public final isRecalled()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    const/16 v1, 0x2712

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "<revokemsg"

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "revokemsg"

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "revoke_msg"

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 39
    .line 40
    const-string v1, "\u64a4\u56de"

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return v3

    .line 51
    :cond_1
    :goto_0
    return v2
.end method

.method public final isRedBag()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isRedPacket()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v1, "nativeurl"

    .line 11
    .line 12
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v2, "receivehongbao"

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-static {v1, v2, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    const-string v4, "wxhb"

    .line 35
    .line 36
    invoke-static {v1, v4, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    const-string v4, "hongbao"

    .line 43
    .line 44
    invoke-static {v1, v4, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    invoke-static {v0, v2, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    const-string v1, "wxhb_personalreceive"

    .line 57
    .line 58
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    const-string v1, "/hongbao/"

    .line 65
    .line 66
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    const-string v1, "type"

    .line 73
    .line 74
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "2001"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    const/4 v0, 0x0

    .line 88
    return v0

    .line 89
    :cond_1
    :goto_0
    return v3
.end method

.method public final isSend()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isShareCard()Z
    .locals 2

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    const/16 v1, 0x2a

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x42

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final isSystem()Z
    .locals 6

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    const/16 v1, 0x2712

    .line 4
    .line 5
    const/16 v2, 0x2710

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit16 v3, v0, 0xff

    .line 11
    .line 12
    const v4, 0xffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v0

    .line 16
    ushr-int/lit8 v5, v0, 0x10

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-eq v4, v2, :cond_2

    .line 22
    .line 23
    if-eq v4, v1, :cond_2

    .line 24
    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    if-ne v4, v3, :cond_3

    .line 28
    .line 29
    move v0, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v4

    .line 32
    :cond_3
    :goto_0
    if-eq v0, v2, :cond_5

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_4
    const/4 v0, 0x0

    .line 38
    goto :goto_2

    .line 39
    :cond_5
    :goto_1
    const/4 v0, 0x1

    .line 40
    :goto_2
    return v0
.end method

.method public final isText()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v2, v0

    .line 12
    ushr-int/lit8 v3, v0, 0x10

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v3, 0x2710

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x2712

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :cond_3
    :goto_0
    const/4 v1, 0x1

    .line 33
    if-ne v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_4
    const/4 v1, 0x0

    .line 37
    :goto_1
    return v1
.end method

.method public final isTransfer()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x7d0

    .line 17
    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/16 v2, 0x7db

    .line 21
    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    :cond_0
    const-string v1, "<wcpayinfo>"

    .line 25
    .line 26
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    const-string v1, "<transferid>"

    .line 33
    .line 34
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const-string v1, "<transcationid>"

    .line 41
    .line 42
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    const-string v1, "<transactionid>"

    .line 49
    .line 50
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    const-string v1, "transfer_id="

    .line 57
    .line 58
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    const-string v1, "trans_id="

    .line 65
    .line 66
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    const-string v1, "transferoperation"

    .line 73
    .line 74
    invoke-static {v0, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    :cond_1
    return v3

    .line 81
    :cond_2
    const/4 v0, 0x0

    .line 82
    return v0
.end method

.method public final isVideo()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v2, v0

    .line 12
    ushr-int/lit8 v3, v0, 0x10

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v3, 0x2710

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x2712

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :cond_3
    :goto_0
    const/16 v1, 0x2b

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_4
    const/4 v0, 0x0

    .line 39
    return v0
.end method

.method public final isVideoNumberVideo()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 8
    .line 9
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ll8/d;->h(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public final isVoice()Z
    .locals 4

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v2, v0

    .line 12
    ushr-int/lit8 v3, v0, 0x10

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/16 v3, 0x2710

    .line 18
    .line 19
    if-eq v2, v3, :cond_2

    .line 20
    .line 21
    const/16 v3, 0x2712

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v0, v2

    .line 32
    :cond_3
    :goto_0
    const/16 v1, 0x22

    .line 33
    .line 34
    if-ne v0, v1, :cond_4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_1

    .line 38
    :cond_4
    const/4 v0, 0x0

    .line 39
    :goto_1
    return v0
.end method

.method public final isVoip()Z
    .locals 2

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    const/16 v1, 0x32

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const v1, 0xf4274

    .line 8
    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const v1, 0xf4275

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public final isVoipVideo()Z
    .locals 2

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    const v1, 0xf4275

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final isVoipVoice()Z
    .locals 2

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 2
    .line 3
    const/16 v1, 0x32

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const v1, 0xf4274

    .line 8
    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
.end method

.method public final nativeUrl()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "nativeurl"

    .line 11
    .line 12
    invoke-static {v1, v0}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final sendTalker()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, ":\n"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x6

    .line 16
    invoke-static {v0, v1, v2, v2, v3}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    if-lez v0, :cond_4

    .line 27
    .line 28
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 29
    .line 30
    iget-object v4, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v4, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    const-string v1, "]"

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    const-string v1, ")"

    .line 56
    .line 57
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    const-string v1, ","

    .line 64
    .line 65
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    const-string v1, ";"

    .line 72
    .line 73
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const/16 v1, 0xa

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-lez v1, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :cond_2
    return-object v0

    .line 101
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 102
    invoke-static {v1, v0}, Log/m;->k0(ILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 116
    .line 117
    return-object v0
.end method

.method public final xml()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ll8/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method
