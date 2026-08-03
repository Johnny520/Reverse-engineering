.class public final Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/api/MessageAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MessageData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/api/MessageAPI$MessageData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/lua/api/MessageAPI$MessageData$Companion;

.field public static final TALKER_ENTERPRISE:I = 0x3

.field public static final TALKER_GROUP:I = 0x1

.field public static final TALKER_OFFICIAL:I = 0x2

.field public static final TALKER_PRIVATE:I = 0x0

.field public static final TYPE_CARD:I = 0x31

.field public static final TYPE_EMOJI:I = 0x2f

.field public static final TYPE_FILE:I = 0x41000031

.field public static final TYPE_IMAGE:I = 0x3

.field public static final TYPE_NEW_YEAR_RED:I = 0x1c000031

.field public static final TYPE_RED_PACKET:I = 0x1a000031

.field public static final TYPE_REPLY:I = 0x31000031

.field public static final TYPE_TEXT:I = 0x1

.field public static final TYPE_TIP:I = 0x2710

.field public static final TYPE_TRANSFER:I = 0x19000031

.field public static final TYPE_VIDEO:I = 0x2b

.field public static final TYPE_VOICE:I = 0x22


# instance fields
.field private final content:Ljava/lang/String;

.field private final createTime:J

.field private final isSend:I

.field private final msgId:J

.field private final sendTalker:Ljava/lang/String;

.field private final talker:Ljava/lang/String;

.field private final talkerId:I

.field private final talkerType:I

.field private final type:I

.field private final values:Landroid/content/ContentValues;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->Companion:Lio/github/cherrywechat/lua/api/MessageAPI$MessageData$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;)V
    .locals 2

    const-wide v0, -0x10d60fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10d67fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10d72fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    .line 4
    iput p3, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    .line 5
    iput p4, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    .line 6
    iput p5, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    .line 7
    iput-wide p6, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    .line 8
    iput-wide p8, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    .line 9
    iput-object p10, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    .line 10
    iput p11, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    .line 11
    iput-object p12, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;ILOc;)V
    .locals 14

    move/from16 v0, p13

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v13, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v12, p11

    goto :goto_1

    :cond_0
    move-object/from16 v13, p12

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {v1 .. v13}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;-><init>(Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;ILjava/lang/Object;)Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-wide p6, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-wide p8, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p10, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p11, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    :cond_8
    and-int/lit16 p13, p13, 0x200

    if-eqz p13, :cond_9

    iget-object p12, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    :cond_9
    move p13, p11

    move-object p14, p12

    move-object p12, p10

    move-wide p10, p8

    move-wide p8, p6

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p14}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->copy(Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;)Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Landroid/content/ContentValues;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    return v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    return-wide v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;)Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;
    .locals 15

    const-wide v0, -0x10d7afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10d01fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x10d0cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-wide/from16 v8, p6

    move-wide/from16 v10, p8

    move-object/from16 v12, p10

    move/from16 v13, p11

    move-object/from16 v14, p12

    invoke-direct/range {v2 .. v14}, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;-><init>(Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;)V

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    iget v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    iget v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    iget v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    iget-wide v5, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    iget-wide v5, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    iget v3, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    iget-object p1, p1, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreateTime()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    return-wide v0
.end method

.method public final getMsgId()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    return-wide v0
.end method

.method public final getSendTalker()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    return-object v0
.end method

.method public final getTalker()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    return-object v0
.end method

.method public final getTalkerId()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    return v0
.end method

.method public final getTalkerType()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    return v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    return v0
.end method

.method public final getValues()Landroid/content/ContentValues;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-wide v2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/content/ContentValues;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isCard()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const/16 v1, 0x31

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isEmoji()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isEnterprise()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isFile()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const v1, 0x41000031    # 8.000047f

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isGroupChat()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isImage()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isOfficialAccount()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isPrivateChat()Z
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isRedPacket()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const v1, 0x1a000031

    if-eq v0, v1, :cond_1

    const v1, 0x1c000031

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isReply()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const v1, 0x31000031

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSend()I
    .locals 1

    .line 1
    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    return v0
.end method

.method public final isSend()Z
    .locals 2

    .line 2
    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isText()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isTip()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const/16 v1, 0x2710

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isTransfer()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const v1, 0x19000031

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVideo()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const/16 v1, 0x2b

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVoice()Z
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x10d14fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talker:Ljava/lang/String;

    const-wide v2, -0x10d28fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->sendTalker:Ljava/lang/String;

    const-wide v2, -0x10d36fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->isSend:I

    const-wide v2, -0x10dc0fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerId:I

    const-wide v2, -0x10dccfffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->type:I

    const-wide v2, -0x10dd4fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-wide v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->msgId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v1, -0x10dddfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v1, -0x10debfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->content:Ljava/lang/String;

    const-wide v2, -0x10df6fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->talkerType:I

    const-wide v2, -0x10d84fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/MessageAPI$MessageData;->values:Landroid/content/ContentValues;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
