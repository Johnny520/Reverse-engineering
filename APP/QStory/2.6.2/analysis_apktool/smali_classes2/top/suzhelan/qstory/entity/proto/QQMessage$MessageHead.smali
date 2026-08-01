.class public final Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;",
        "serializationConstructorMarker",
        "(IJLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;)V",
        "self",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "output",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "serialDesc",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "write$Self$app_publishRelease",
        "(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;)V",
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
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation

.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
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

    .line 62
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

.method public synthetic constructor <init>(IJLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V
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
    const-wide p2, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iput-object p4, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 32
    .line 33
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    iput-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iput-wide p5, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 41
    .line 42
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 43
    .line 44
    const/4 p3, 0x0

    .line 45
    if-nez p2, :cond_3

    .line 46
    .line 47
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    iput-object p7, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 51
    .line 52
    :goto_3
    and-int/lit8 p1, p1, 0x10

    .line 53
    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    iput-object p8, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)V
    .locals 2

    const-wide v0, -0x36a58046051405a7L    # -2.363783684981106E45

    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-wide p1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 65
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 66
    iput-wide p4, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 67
    iput-object p6, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 68
    iput-object p7, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 4

    and-int/lit8 p9, p8, 0x1

    const-wide/16 v0, 0x0

    if-eqz p9, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    const-wide v2, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 69
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    move-result-object p3

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

    .line 70
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
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x5
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getReceiverUid$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x6
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSenderInfo$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x8
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSenderPeerId$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x1
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSenderUid$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x2
    .end annotation

    .line 1
    return-void
.end method

.method public static final synthetic write$Self$app_publishRelease(Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V
    .locals 5

    .line 1
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

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
    invoke-interface {p1, p2, v0, v3, v4}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰哲楪(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IJ)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

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
    const-wide v3, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v0, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    :goto_1
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-interface {p1, p2, v3, v0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世兰哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    iget-wide v3, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 60
    .line 61
    cmp-long v0, v3, v1

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    :goto_2
    iget-wide v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 66
    .line 67
    const/4 v2, 0x2

    .line 68
    invoke-interface {p1, p2, v2, v0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰哲楪(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IJ)V

    .line 69
    .line 70
    .line 71
    :cond_5
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_6
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    :goto_3
    sget-object v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

    .line 83
    .line 84
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 85
    .line 86
    const/4 v2, 0x3

    .line 87
    invoke-interface {p1, p2, v2, v0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_7
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_8

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_8
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 98
    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    :goto_4
    sget-object v0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer;->INSTANCE:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo$$serializer;

    .line 102
    .line 103
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 104
    .line 105
    const/4 v1, 0x4

    .line 106
    invoke-interface {p1, p2, v1, v0, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
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
    .locals 2

    .line 1
    const-wide v0, -0x36a58046051405a7L    # -2.363783684981106E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;

    .line 13
    .line 14
    invoke-direct/range {p0 .. p7}, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;-><init>(JLjava/lang/String;JLjava/lang/String;Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;)V

    .line 15
    .line 16
    .line 17
    return-object p0
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
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

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
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a58cc5051405a7L    # -2.3594294318139856E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderPeerId:J

    .line 19
    .line 20
    const-wide v3, -0x36a58038051405a7L    # -2.3638027407936535E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲兰苏(Ljava/lang/StringBuilder;JJ)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderUid:Ljava/lang/String;

    .line 29
    .line 30
    const-wide v2, -0x36a58cbf051405a7L    # -2.3594375985907917E45

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverPeerId:J

    .line 39
    .line 40
    const-wide v3, -0x36a5818c051405a7L    # -2.363339956774641E45

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, v2, v3, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲兰苏(Ljava/lang/StringBuilder;JJ)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->receiverUid:Ljava/lang/String;

    .line 49
    .line 50
    const-wide v2, -0x36a58ca9051405a7L    # -2.3594675434390808E45

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead;->senderInfo:Ltop/suzhelan/qstory/entity/proto/QQMessage$MessageHead$SenderInfo;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const/16 p0, 0x29

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
