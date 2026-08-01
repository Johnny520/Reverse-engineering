.class public final Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/suzhelan/qstory/entity/proto/QQMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MessageHead"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$$serializer;,
        Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$Companion;,
        Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0003:;9B=\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JF\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010+\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008,\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010/\u0012\u0004\u00081\u0010.\u001a\u0004\u00080\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010+\u0012\u0004\u00083\u0010.\u001a\u0004\u00082\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010/\u0012\u0004\u00085\u0010.\u001a\u0004\u00084\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00106\u0012\u0004\u00088\u0010.\u001a\u0004\u00087\u0010!\u00a8\u0006<"
    }
    d2 = {
        "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;",
        "",
        "",
        "senderPeerId",
        "",
        "senderUid",
        "receiverPeerId",
        "receiverUid",
        "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;",
        "senderInfo",
        "<init>",
        "(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)V",
        "",
        "seen0",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u82cf\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u5170\u4e16;",
        "serializationConstructorMarker",
        "(IJLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u82cf\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u5170\u4e16;)V",
        "self",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "output",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u82cf\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "serialDesc",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "write$Self$QStory_app_publishRelease",
        "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u82cf\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;",
        "copy",
        "(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getSenderPeerId",
        "getSenderPeerId$annotations",
        "()V",
        "Ljava/lang/String;",
        "getSenderUid",
        "getSenderUid$annotations",
        "getReceiverPeerId",
        "getReceiverPeerId$annotations",
        "getReceiverUid",
        "getReceiverUid$annotations",
        "Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;",
        "getSenderInfo",
        "getSenderInfo$annotations",
        "Companion",
        "SenderInfo",
        "$serializer",
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$Companion;


# instance fields
.field private final receiverPeerId:J

.field private final receiverUid:Ljava/lang/String;

.field private final senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

.field private final senderPeerId:J

.field private final senderUid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$Companion;-><init>(Lkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->Companion:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 55
    const/16 v8, 0x1f

    const/4 v9, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;-><init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;L飘花落叶言世哲子苏楪兰/飘花落叶言子苏哲楪兰世;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p9, p1, 0x1

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    if-nez p9, :cond_0

    .line 9
    .line 10
    iput-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-wide p2, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 14
    .line 15
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    const-string p2, ""

    .line 20
    .line 21
    iput-object p2, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iput-object p4, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 25
    .line 26
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 27
    .line 28
    if-nez p2, :cond_2

    .line 29
    .line 30
    iput-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    iput-wide p5, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 34
    .line 35
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 36
    .line 37
    const/4 p3, 0x0

    .line 38
    if-nez p2, :cond_3

    .line 39
    .line 40
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    iput-object p7, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 44
    .line 45
    :goto_3
    and-int/lit8 p1, p1, 0x10

    .line 46
    .line 47
    if-nez p1, :cond_4

    .line 48
    .line 49
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_4
    iput-object p8, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)V
    .locals 1

    const/16 v0, 0x57b

    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-wide p1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 58
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 59
    iput-wide p4, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 60
    iput-object p6, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 61
    iput-object p7, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    const-wide/16 v0, 0x0

    if-eqz p9, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 62
    const-string p3, ""

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    move-object p7, v0

    .line 63
    :cond_4
    invoke-direct/range {p0 .. p7}, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;-><init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)V

    return-void
.end method

.method public static synthetic copy$default(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;ILjava/lang/Object;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide p1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 6
    .line 7
    :cond_0
    move-wide v1, p1

    .line 8
    and-int/lit8 p1, p8, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 13
    .line 14
    :cond_1
    move-object v3, p3

    .line 15
    and-int/lit8 p1, p8, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-wide p4, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 20
    .line 21
    :cond_2
    move-wide v4, p4

    .line 22
    and-int/lit8 p1, p8, 0x8

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    iget-object p6, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 27
    .line 28
    :cond_3
    move-object v6, p6

    .line 29
    and-int/lit8 p1, p8, 0x10

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    iget-object p7, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 34
    .line 35
    :cond_4
    move-object v0, p0

    .line 36
    move-object v7, p7

    .line 37
    invoke-virtual/range {v0 .. v7}, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->copy(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static synthetic getReceiverPeerId$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x5
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getReceiverUid$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x6
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSenderInfo$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x8
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSenderPeerId$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x1
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSenderUid$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x2
    .end annotation

    .line 1
    return-void
.end method

.method public static final synthetic write$Self$QStory_app_publishRelease(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V
    .locals 5

    .line 1
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-wide v3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 11
    .line 12
    cmp-long v0, v3, v1

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    iget-wide v3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-interface {p1, p2, v0, v3, v4}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IJ)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, ""

    .line 32
    .line 33
    invoke-static {v0, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    :goto_1
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    invoke-interface {p1, p2, v3, v0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏楪兰哲(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    iget-wide v3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 53
    .line 54
    cmp-long v0, v3, v1

    .line 55
    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    :goto_2
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-interface {p1, p2, v2, v0, v1}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IJ)V

    .line 62
    .line 63
    .line 64
    :cond_5
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_6

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_6
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    :goto_3
    sget-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子苏兰楪世哲;

    .line 76
    .line 77
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 78
    .line 79
    const/4 v2, 0x3

    .line 80
    invoke-interface {p1, p2, v2, v0, v1}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_7
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_8

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_8
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 91
    .line 92
    if-eqz v0, :cond_9

    .line 93
    .line 94
    :goto_4
    sget-object v0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer;->INSTANCE:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer;

    .line 95
    .line 96
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 97
    .line 98
    const/4 v1, 0x4

    .line 99
    invoke-interface {p1, p2, v1, v0, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;
    .locals 8

    .line 1
    const/16 p0, 0x57b

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;

    .line 10
    .line 11
    move-wide v1, p1

    .line 12
    move-object v3, p3

    .line 13
    move-wide v4, p4

    .line 14
    move-object v6, p6

    .line 15
    move-object v7, p7

    .line 16
    invoke-direct/range {v0 .. v7}, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;-><init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)V

    .line 17
    .line 18
    .line 19
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
    instance-of v1, p1, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;

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
    check-cast p1, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;

    .line 12
    .line 13
    iget-wide v3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 14
    .line 15
    iget-wide v5, p1, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-wide v3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 34
    .line 35
    iget-wide v5, p1, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 36
    .line 37
    cmp-long v1, v3, v5

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 54
    .line 55
    iget-object p1, p1, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 56
    .line 57
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    return v0
.end method

.method public final getReceiverPeerId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getReceiverUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSenderInfo()Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSenderPeerId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSenderUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    move v2, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :goto_0
    add-int/2addr v0, v2

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {p0}, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    :goto_1
    add-int/2addr v0, v3

    .line 45
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x59a

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 16
    .line 17
    const/16 v3, 0x57d

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/StringBuilder;JI)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v2, 0x59b

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    iget-wide v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 30
    .line 31
    const/16 v3, 0x574

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/StringBuilder;JI)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 37
    .line 38
    const/16 v2, 0x59c

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 p0, 0x29

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
